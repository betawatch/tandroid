package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class oz0 extends TextureView {
    public static Boolean f;
    public mz0 a;
    public final iz0 b;
    public final ArrayList c;
    public Runnable d;
    public boolean e;

    public oz0(Context context, Runnable runnable) {
        super(context);
        this.b = new iz0(this, 0);
        this.c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new k40(this, 1));
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
            f = Boolean.valueOf(org.telegram.messenger.np.g1().getBoolean("nothanos", false));
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
            nz0 nz0Var = (nz0) arrayList.get(i10);
            if (nz0Var.a == view) {
                Runnable runnable = nz0Var.d;
                if (runnable != null) {
                    b(runnable);
                    nz0Var.d = null;
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
        mz0 mz0Var = this.a;
        ArrayList arrayList2 = mz0Var.X;
        if (mz0Var.b.get()) {
            Handler handler = mz0Var.getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(5, view));
                return;
            }
            while (i7 < arrayList2.size()) {
                lz0 lz0Var = (lz0) arrayList2.get(i7);
                if (lz0Var.a.contains(view)) {
                    Runnable runnable2 = lz0Var.f;
                    if (runnable2 != null) {
                        b(runnable2);
                        lz0Var.f = null;
                    }
                    arrayList2.remove(i7);
                    i7--;
                }
                i7++;
            }
        }
    }
}
