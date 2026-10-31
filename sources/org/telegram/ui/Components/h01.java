package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h01 extends TextureView {
    public static Boolean f;
    public f01 a;
    public final o1.a b;
    public final ArrayList c;
    public Runnable d;
    public boolean e;

    public h01(Context context, Runnable runnable) {
        super(context);
        this.b = new o1.a(this, 1);
        this.c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new li.e(this, 4));
    }

    public static void b(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            org.telegram.messenger.i0.g3(runnable);
        } else {
            runnable.run();
        }
    }

    public static boolean c() {
        if (f == null) {
            f = Boolean.valueOf(org.telegram.messenger.vp.d1().getBoolean("nothanos", false));
        }
        Boolean bool = f;
        return bool == null || !bool.booleanValue();
    }

    public final void a(View view) {
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.c;
            if (i11 >= arrayList.size()) {
                break;
            }
            g01 g01Var = (g01) arrayList.get(i11);
            if (g01Var.a == view) {
                Runnable runnable = g01Var.d;
                if (runnable != null) {
                    b(runnable);
                    g01Var.d = null;
                }
                arrayList.remove(i11);
                i11--;
                z10 = true;
            }
            i11++;
        }
        if (z10) {
            return;
        }
        f01 f01Var = this.a;
        ArrayList arrayList2 = f01Var.W;
        if (f01Var.b.get()) {
            Handler handler = f01Var.getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(5, view));
                return;
            }
            while (i10 < arrayList2.size()) {
                e01 e01Var = (e01) arrayList2.get(i10);
                if (e01Var.a.contains(view)) {
                    Runnable runnable2 = e01Var.f;
                    if (runnable2 != null) {
                        b(runnable2);
                        e01Var.f = null;
                    }
                    arrayList2.remove(i10);
                    i10--;
                }
                i10++;
            }
        }
    }
}
