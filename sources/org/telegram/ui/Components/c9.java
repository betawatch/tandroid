package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ j9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ q40 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ b8.jf[] f;

    public /* synthetic */ c9(j9 j9Var, q40 q40Var, Runnable[] runnableArr, int i3, b8.jf[] jfVarArr) {
        this.b = j9Var;
        this.d = q40Var;
        this.c = runnableArr;
        this.e = i3;
        this.f = jfVarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j9 j9Var = this.b;
                q40 q40Var = this.d;
                Runnable[] runnableArr = this.c;
                int i3 = this.e;
                b8.jf[] jfVarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = j9Var.getOrientation();
                    int[] iArr = j9Var.a;
                    int i10 = q40Var.a;
                    int i11 = q40Var.b;
                    Rect e10 = j9.e(orientation, i10, i11);
                    Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e10.left, e10.top, e10.right, e10.bottom);
                    org.telegram.messenger.g0.h3(new cg.k0(j9Var, runnableArr, createBitmap, q40Var, i3, jfVarArr, 9));
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.h3(new c9(j9Var, runnableArr, q40Var, i3, jfVarArr));
                    throw th2;
                }
            default:
                j9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ c9(j9 j9Var, Runnable[] runnableArr, q40 q40Var, int i3, b8.jf[] jfVarArr) {
        this.b = j9Var;
        this.c = runnableArr;
        this.d = q40Var;
        this.e = i3;
        this.f = jfVarArr;
    }
}
