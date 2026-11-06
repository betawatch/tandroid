package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class cz0 extends TextureView {
    public static Boolean f;
    public az0 a;
    public final wy0 b;
    public final ArrayList c;
    public Runnable d;
    public boolean e;

    public cz0(Context context, Runnable runnable) {
        super(context);
        this.b = new wy0(this, 0);
        this.c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new w30(this, 1));
    }

    public static void b(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            org.telegram.messenger.g0.h3(runnable);
        } else {
            runnable.run();
        }
    }

    public static boolean c() {
        if (f == null) {
            f = Boolean.valueOf(org.telegram.messenger.qp.e1().getBoolean("nothanos", false));
        }
        Boolean bool = f;
        return bool == null || !bool.booleanValue();
    }

    public final void a(View view) {
        int i7 = 0;
        int i10 = 0;
        boolean z9 = false;
        while (true) {
            ArrayList arrayList = this.c;
            if (i10 >= arrayList.size()) {
                break;
            }
            bz0 bz0Var = (bz0) arrayList.get(i10);
            if (bz0Var.a == view) {
                Runnable runnable = bz0Var.d;
                if (runnable != null) {
                    b(runnable);
                    bz0Var.d = null;
                }
                arrayList.remove(i10);
                i10--;
                z9 = true;
            }
            i10++;
        }
        if (z9) {
            return;
        }
        az0 az0Var = this.a;
        ArrayList arrayList2 = az0Var.W;
        if (az0Var.b.get()) {
            Handler handler = az0Var.getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(5, view));
                return;
            }
            while (i7 < arrayList2.size()) {
                zy0 zy0Var = (zy0) arrayList2.get(i7);
                if (zy0Var.a.contains(view)) {
                    Runnable runnable2 = zy0Var.f;
                    if (runnable2 != null) {
                        b(runnable2);
                        zy0Var.f = null;
                    }
                    arrayList2.remove(i7);
                    i7--;
                }
                i7++;
            }
        }
    }
}
