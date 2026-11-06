package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class dz0 extends TextureView {
    public static Boolean f;
    public bz0 a;
    public final xy0 b;
    public final ArrayList c;
    public Runnable d;
    public boolean e;

    public dz0(Context context, Runnable runnable) {
        super(context);
        this.b = new xy0(this, 0);
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
            cz0 cz0Var = (cz0) arrayList.get(i10);
            if (cz0Var.a == view) {
                Runnable runnable = cz0Var.d;
                if (runnable != null) {
                    b(runnable);
                    cz0Var.d = null;
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
        bz0 bz0Var = this.a;
        ArrayList arrayList2 = bz0Var.W;
        if (bz0Var.b.get()) {
            Handler handler = bz0Var.getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(5, view));
                return;
            }
            while (i7 < arrayList2.size()) {
                az0 az0Var = (az0) arrayList2.get(i7);
                if (az0Var.a.contains(view)) {
                    Runnable runnable2 = az0Var.f;
                    if (runnable2 != null) {
                        b(runnable2);
                        az0Var.f = null;
                    }
                    arrayList2.remove(i7);
                    i7--;
                }
                i7++;
            }
        }
    }
}
