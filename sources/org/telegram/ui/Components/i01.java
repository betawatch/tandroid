package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class i01 extends TextureView {
    public static Boolean f;
    public g01 a;
    public final o1.a b;
    public final ArrayList c;
    public Runnable d;
    public boolean e;

    public i01(Context context, Runnable runnable) {
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
            f = Boolean.valueOf(org.telegram.messenger.wp.d1().getBoolean("nothanos", false));
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
            h01 h01Var = (h01) arrayList.get(i11);
            if (h01Var.a == view) {
                Runnable runnable = h01Var.d;
                if (runnable != null) {
                    b(runnable);
                    h01Var.d = null;
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
        g01 g01Var = this.a;
        ArrayList arrayList2 = g01Var.W;
        if (g01Var.b.get()) {
            Handler handler = g01Var.getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(5, view));
                return;
            }
            while (i10 < arrayList2.size()) {
                f01 f01Var = (f01) arrayList2.get(i10);
                if (f01Var.a.contains(view)) {
                    Runnable runnable2 = f01Var.f;
                    if (runnable2 != null) {
                        b(runnable2);
                        f01Var.f = null;
                    }
                    arrayList2.remove(i10);
                    i10--;
                }
                i10++;
            }
        }
    }
}
