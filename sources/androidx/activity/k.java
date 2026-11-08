package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class k implements Executor, ViewTreeObserver.OnDrawListener, Runnable {
    public Runnable b;
    public final /* synthetic */ l d;
    public final long a = SystemClock.uptimeMillis() + 10000;
    public boolean c = false;

    public k(l lVar) {
        this.d = lVar;
    }

    public final void a(View view) {
        if (this.c) {
            return;
        }
        this.c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        if (!this.c) {
            decorView.postOnAnimation(new a3.f(this, 6));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z9;
        Runnable runnable = this.b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.a) {
                this.c = false;
                this.d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.b = null;
        n nVar = this.d.s;
        synchronized (nVar.c) {
            z9 = nVar.b;
        }
        if (z9) {
            this.c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
