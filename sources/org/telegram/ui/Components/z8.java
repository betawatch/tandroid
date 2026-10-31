package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ f9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ k50 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ w7.y5[] f;

    public /* synthetic */ z8(f9 f9Var, k50 k50Var, Runnable[] runnableArr, int i10, w7.y5[] y5VarArr) {
        this.b = f9Var;
        this.d = k50Var;
        this.c = runnableArr;
        this.e = i10;
        this.f = y5VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f9 f9Var = this.b;
                k50 k50Var = this.d;
                Runnable[] runnableArr = this.c;
                int i10 = this.e;
                w7.y5[] y5VarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = f9Var.getOrientation();
                    int[] iArr = f9Var.a;
                    int i11 = k50Var.a;
                    int i12 = k50Var.b;
                    Rect e = f9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    org.telegram.messenger.i0.g3(new m4.a1(f9Var, runnableArr, createBitmap, k50Var, i10, y5VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.i0.g3(new z8(f9Var, runnableArr, k50Var, i10, y5VarArr));
                    throw th2;
                }
            default:
                f9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ z8(f9 f9Var, Runnable[] runnableArr, k50 k50Var, int i10, w7.y5[] y5VarArr) {
        this.b = f9Var;
        this.c = runnableArr;
        this.d = k50Var;
        this.e = i10;
        this.f = y5VarArr;
    }
}
