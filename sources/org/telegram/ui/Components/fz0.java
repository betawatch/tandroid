package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class fz0 extends TextureView {
    public static Boolean f;
    public dz0 a;
    public final zy0 b;
    public final ArrayList c;
    public Runnable d;
    public boolean e;

    public fz0(Context context, Runnable runnable) {
        super(context);
        this.b = new zy0(this, 0);
        this.c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new z30(this, 1));
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
            f = Boolean.valueOf(org.telegram.messenger.np.e1().getBoolean("nothanos", false));
        }
        Boolean bool = f;
        return bool == null || !bool.booleanValue();
    }

    public final void a(View view) {
        int i7 = 0;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.c;
            if (i10 >= arrayList.size()) {
                break;
            }
            ez0 ez0Var = (ez0) arrayList.get(i10);
            if (ez0Var.a == view) {
                Runnable runnable = ez0Var.d;
                if (runnable != null) {
                    b(runnable);
                    ez0Var.d = null;
                }
                arrayList.remove(i10);
                i10--;
                z10 = true;
            }
            i10++;
        }
        if (z10) {
            return;
        }
        dz0 dz0Var = this.a;
        ArrayList arrayList2 = dz0Var.X;
        if (dz0Var.b.get()) {
            Handler handler = dz0Var.getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(5, view));
                return;
            }
            while (i7 < arrayList2.size()) {
                cz0 cz0Var = (cz0) arrayList2.get(i7);
                if (cz0Var.a.contains(view)) {
                    Runnable runnable2 = cz0Var.f;
                    if (runnable2 != null) {
                        b(runnable2);
                        cz0Var.f = null;
                    }
                    arrayList2.remove(i7);
                    i7--;
                }
                i7++;
            }
        }
    }
}
