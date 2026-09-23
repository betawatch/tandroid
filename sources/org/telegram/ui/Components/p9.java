package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class p9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ v9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ z50 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ w7.i0[] f;

    public /* synthetic */ p9(v9 v9Var, z50 z50Var, Runnable[] runnableArr, int i10, w7.i0[] i0VarArr) {
        this.b = v9Var;
        this.d = z50Var;
        this.c = runnableArr;
        this.e = i10;
        this.f = i0VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v9 v9Var = this.b;
                z50 z50Var = this.d;
                Runnable[] runnableArr = this.c;
                int i10 = this.e;
                w7.i0[] i0VarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = v9Var.getOrientation();
                    int[] iArr = v9Var.a;
                    int i11 = z50Var.a;
                    int i12 = z50Var.b;
                    Rect e = v9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ai.cb(v9Var, runnableArr, createBitmap, z50Var, i10, i0VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new p9(v9Var, runnableArr, z50Var, i10, i0VarArr));
                    throw th2;
                }
            default:
                v9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ p9(v9 v9Var, Runnable[] runnableArr, z50 z50Var, int i10, w7.i0[] i0VarArr) {
        this.b = v9Var;
        this.c = runnableArr;
        this.d = z50Var;
        this.e = i10;
        this.f = i0VarArr;
    }
}
