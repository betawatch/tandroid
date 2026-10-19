package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class p9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ v9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ t60 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ w7.w5[] f;

    public /* synthetic */ p9(v9 v9Var, t60 t60Var, Runnable[] runnableArr, int i10, w7.w5[] w5VarArr) {
        this.b = v9Var;
        this.d = t60Var;
        this.c = runnableArr;
        this.e = i10;
        this.f = w5VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v9 v9Var = this.b;
                t60 t60Var = this.d;
                Runnable[] runnableArr = this.c;
                int i10 = this.e;
                w7.w5[] w5VarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = v9Var.getOrientation();
                    int[] iArr = v9Var.a;
                    int i11 = t60Var.a;
                    int i12 = t60Var.b;
                    Rect e = v9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ai.vb(v9Var, runnableArr, createBitmap, t60Var, i10, w5VarArr, 9));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new p9(v9Var, runnableArr, t60Var, i10, w5VarArr));
                    throw th2;
                }
            default:
                v9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ p9(v9 v9Var, Runnable[] runnableArr, t60 t60Var, int i10, w7.w5[] w5VarArr) {
        this.b = v9Var;
        this.c = runnableArr;
        this.d = t60Var;
        this.e = i10;
        this.f = w5VarArr;
    }
}
