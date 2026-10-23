package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ v9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ u60 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ w7.w5[] f;

    public /* synthetic */ p9(v9 v9Var, u60 u60Var, Runnable[] runnableArr, int i10, w7.w5[] w5VarArr) {
        this.b = v9Var;
        this.d = u60Var;
        this.c = runnableArr;
        this.e = i10;
        this.f = w5VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v9 v9Var = this.b;
                u60 u60Var = this.d;
                Runnable[] runnableArr = this.c;
                int i10 = this.e;
                w7.w5[] w5VarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = v9Var.getOrientation();
                    int[] iArr = v9Var.a;
                    int i11 = u60Var.a;
                    int i12 = u60Var.b;
                    Rect e = v9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ai.wb(v9Var, runnableArr, createBitmap, u60Var, i10, w5VarArr, 9));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new p9(v9Var, runnableArr, u60Var, i10, w5VarArr));
                    throw th2;
                }
            default:
                v9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ p9(v9 v9Var, Runnable[] runnableArr, u60 u60Var, int i10, w7.w5[] w5VarArr) {
        this.b = v9Var;
        this.c = runnableArr;
        this.d = u60Var;
        this.e = i10;
        this.f = w5VarArr;
    }
}
