package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ o9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ z50 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ k7.y5[] f;

    public /* synthetic */ i9(o9 o9Var, z50 z50Var, Runnable[] runnableArr, int i10, k7.y5[] y5VarArr) {
        this.b = o9Var;
        this.d = z50Var;
        this.c = runnableArr;
        this.e = i10;
        this.f = y5VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o9 o9Var = this.b;
                z50 z50Var = this.d;
                Runnable[] runnableArr = this.c;
                int i10 = this.e;
                k7.y5[] y5VarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = o9Var.getOrientation();
                    int[] iArr = o9Var.a;
                    int i11 = z50Var.a;
                    int i12 = z50Var.b;
                    Rect e = o9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new lf.j0(o9Var, runnableArr, createBitmap, z50Var, i10, y5VarArr));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new i9(o9Var, runnableArr, z50Var, i10, y5VarArr));
                    throw th2;
                }
            default:
                o9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ i9(o9 o9Var, Runnable[] runnableArr, z50 z50Var, int i10, k7.y5[] y5VarArr) {
        this.b = o9Var;
        this.c = runnableArr;
        this.d = z50Var;
        this.e = i10;
        this.f = y5VarArr;
    }
}
