package org.telegram.messenger.pip.utils;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.ApplicationLoader;

/* loaded from: classes3.dex */
public class Trigger implements Runnable {
    private final Callback action;
    private final Handler handler;
    private final Runnable timeoutRunnable;
    private final AtomicBoolean triggered = new AtomicBoolean(false);

    public interface Callback {
        void run(boolean z);
    }

    private Trigger(Handler handler, final Callback callback, long j) {
        this.handler = handler;
        this.action = callback;
        Runnable runnable = new Runnable() { // from class: org.telegram.messenger.pip.utils.Trigger$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Trigger.$r8$lambda$wb6urHkQ6RJrakQiFLm9bhLhPPg(Trigger.this, callback);
            }
        };
        this.timeoutRunnable = runnable;
        if (j > 0) {
            handler.postDelayed(runnable, j);
        }
    }

    public static /* synthetic */ void $r8$lambda$wb6urHkQ6RJrakQiFLm9bhLhPPg(Trigger trigger, Callback callback) {
        if (trigger.triggered.compareAndSet(false, true)) {
            callback.run(true);
        }
    }

    public static Trigger run(Callback callback, long j) {
        return new Trigger(ApplicationLoader.applicationHandler, callback, j);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.triggered.compareAndSet(false, true)) {
            this.handler.removeCallbacks(this.timeoutRunnable);
            if (Looper.myLooper() == this.handler.getLooper()) {
                this.action.run(false);
            } else {
                this.handler.post(new Runnable() { // from class: org.telegram.messenger.pip.utils.Trigger$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Trigger.this.action.run(false);
                    }
                });
            }
        }
    }
}
