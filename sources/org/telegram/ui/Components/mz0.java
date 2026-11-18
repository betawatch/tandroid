package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class mz0 extends TextureView {
    public static Boolean f;
    public kz0 a;
    public final gz0 b;
    public final ArrayList c;
    public Runnable d;
    public boolean e;

    public mz0(Context context, Runnable runnable) {
        super(context);
        this.b = new gz0(this, 0);
        this.c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new h40(this, 1));
    }

    public static void b(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            org.telegram.messenger.g0.g3(runnable);
        } else {
            runnable.run();
        }
    }

    public static boolean c() {
        if (f == null) {
            f = Boolean.valueOf(org.telegram.messenger.mp.g1().getBoolean("nothanos", false));
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
            lz0 lz0Var = (lz0) arrayList.get(i10);
            if (lz0Var.a == view) {
                Runnable runnable = lz0Var.d;
                if (runnable != null) {
                    b(runnable);
                    lz0Var.d = null;
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
        kz0 kz0Var = this.a;
        ArrayList arrayList2 = kz0Var.X;
        if (kz0Var.b.get()) {
            Handler handler = kz0Var.getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(5, view));
                return;
            }
            while (i7 < arrayList2.size()) {
                jz0 jz0Var = (jz0) arrayList2.get(i7);
                if (jz0Var.a.contains(view)) {
                    Runnable runnable2 = jz0Var.f;
                    if (runnable2 != null) {
                        b(runnable2);
                        jz0Var.f = null;
                    }
                    arrayList2.remove(i7);
                    i7--;
                }
                i7++;
            }
        }
    }
}
