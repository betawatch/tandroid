package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class s9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ y9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ w60 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ w7.x5[] f;

    public /* synthetic */ s9(y9 y9Var, w60 w60Var, Runnable[] runnableArr, int i10, w7.x5[] x5VarArr) {
        this.b = y9Var;
        this.d = w60Var;
        this.c = runnableArr;
        this.e = i10;
        this.f = x5VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y9 y9Var = this.b;
                w60 w60Var = this.d;
                Runnable[] runnableArr = this.c;
                int i10 = this.e;
                w7.x5[] x5VarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = y9Var.getOrientation();
                    int[] iArr = y9Var.a;
                    int i11 = w60Var.a;
                    int i12 = w60Var.b;
                    Rect e = y9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new bi.ma(y9Var, runnableArr, createBitmap, w60Var, i10, x5VarArr, 8));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new s9(y9Var, runnableArr, w60Var, i10, x5VarArr));
                    throw th2;
                }
            default:
                y9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ s9(y9 y9Var, Runnable[] runnableArr, w60 w60Var, int i10, w7.x5[] x5VarArr) {
        this.b = y9Var;
        this.c = runnableArr;
        this.d = w60Var;
        this.e = i10;
        this.f = x5VarArr;
    }
}
