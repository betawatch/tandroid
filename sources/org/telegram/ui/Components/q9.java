package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class q9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ w9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ y50 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ w7.i0[] f;

    public /* synthetic */ q9(w9 w9Var, y50 y50Var, Runnable[] runnableArr, int i10, w7.i0[] i0VarArr) {
        this.b = w9Var;
        this.d = y50Var;
        this.c = runnableArr;
        this.e = i10;
        this.f = i0VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w9 w9Var = this.b;
                y50 y50Var = this.d;
                Runnable[] runnableArr = this.c;
                int i10 = this.e;
                w7.i0[] i0VarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = w9Var.getOrientation();
                    int[] iArr = w9Var.a;
                    int i11 = y50Var.a;
                    int i12 = y50Var.b;
                    Rect e7 = w9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e7.left, e7.top, e7.right, e7.bottom);
                    AndroidUtilities.runOnUIThread(new bi.ia(w9Var, runnableArr, createBitmap, y50Var, i10, i0VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new q9(w9Var, runnableArr, y50Var, i10, i0VarArr));
                    throw th2;
                }
            default:
                w9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ q9(w9 w9Var, Runnable[] runnableArr, y50 y50Var, int i10, w7.i0[] i0VarArr) {
        this.b = w9Var;
        this.c = runnableArr;
        this.d = y50Var;
        this.e = i10;
        this.f = i0VarArr;
    }
}
