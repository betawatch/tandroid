package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ez0 extends TextureView {
    public static Boolean f;
    public cz0 a;
    public final yy0 b;
    public final ArrayList c;
    public Runnable d;
    public boolean e;

    public ez0(Context context, Runnable runnable) {
        super(context);
        this.b = new yy0(this, 0);
        this.c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new x30(this, 1));
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
            dz0 dz0Var = (dz0) arrayList.get(i10);
            if (dz0Var.a == view) {
                Runnable runnable = dz0Var.d;
                if (runnable != null) {
                    b(runnable);
                    dz0Var.d = null;
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
        cz0 cz0Var = this.a;
        ArrayList arrayList2 = cz0Var.W;
        if (cz0Var.b.get()) {
            Handler handler = cz0Var.getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(5, view));
                return;
            }
            while (i7 < arrayList2.size()) {
                bz0 bz0Var = (bz0) arrayList2.get(i7);
                if (bz0Var.a.contains(view)) {
                    Runnable runnable2 = bz0Var.f;
                    if (runnable2 != null) {
                        b(runnable2);
                        bz0Var.f = null;
                    }
                    arrayList2.remove(i7);
                    i7--;
                }
                i7++;
            }
        }
    }
}
