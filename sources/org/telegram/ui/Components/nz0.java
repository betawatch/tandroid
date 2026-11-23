package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class nz0 extends TextureView {
    public static Boolean f;
    public lz0 a;
    public final hz0 b;
    public final ArrayList c;
    public Runnable d;
    public boolean e;

    public nz0(Context context, Runnable runnable) {
        super(context);
        this.b = new hz0(this, 0);
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
            mz0 mz0Var = (mz0) arrayList.get(i10);
            if (mz0Var.a == view) {
                Runnable runnable = mz0Var.d;
                if (runnable != null) {
                    b(runnable);
                    mz0Var.d = null;
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
        lz0 lz0Var = this.a;
        ArrayList arrayList2 = lz0Var.X;
        if (lz0Var.b.get()) {
            Handler handler = lz0Var.getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(5, view));
                return;
            }
            while (i7 < arrayList2.size()) {
                kz0 kz0Var = (kz0) arrayList2.get(i7);
                if (kz0Var.a.contains(view)) {
                    Runnable runnable2 = kz0Var.f;
                    if (runnable2 != null) {
                        b(runnable2);
                        kz0Var.f = null;
                    }
                    arrayList2.remove(i7);
                    i7--;
                }
                i7++;
            }
        }
    }
}
