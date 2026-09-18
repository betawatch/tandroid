package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ v9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ h60 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ w7.j0[] f;

    public /* synthetic */ p9(v9 v9Var, h60 h60Var, Runnable[] runnableArr, int i10, w7.j0[] j0VarArr) {
        this.b = v9Var;
        this.d = h60Var;
        this.c = runnableArr;
        this.e = i10;
        this.f = j0VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v9 v9Var = this.b;
                h60 h60Var = this.d;
                Runnable[] runnableArr = this.c;
                int i10 = this.e;
                w7.j0[] j0VarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = v9Var.getOrientation();
                    int[] iArr = v9Var.a;
                    int i11 = h60Var.a;
                    int i12 = h60Var.b;
                    Rect e = v9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ai.cb(v9Var, runnableArr, createBitmap, h60Var, i10, j0VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new p9(v9Var, runnableArr, h60Var, i10, j0VarArr));
                    throw th2;
                }
            default:
                v9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ p9(v9 v9Var, Runnable[] runnableArr, h60 h60Var, int i10, w7.j0[] j0VarArr) {
        this.b = v9Var;
        this.c = runnableArr;
        this.d = h60Var;
        this.e = i10;
        this.f = j0VarArr;
    }
}
