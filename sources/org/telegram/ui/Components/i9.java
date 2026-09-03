package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ o9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ a60 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ k7.y5[] f;

    public /* synthetic */ i9(o9 o9Var, a60 a60Var, Runnable[] runnableArr, int i10, k7.y5[] y5VarArr) {
        this.b = o9Var;
        this.d = a60Var;
        this.c = runnableArr;
        this.e = i10;
        this.f = y5VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o9 o9Var = this.b;
                a60 a60Var = this.d;
                Runnable[] runnableArr = this.c;
                int i10 = this.e;
                k7.y5[] y5VarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = o9Var.getOrientation();
                    int[] iArr = o9Var.a;
                    int i11 = a60Var.a;
                    int i12 = a60Var.b;
                    Rect e = o9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new kf.j0(o9Var, runnableArr, createBitmap, a60Var, i10, y5VarArr));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new i9(o9Var, runnableArr, a60Var, i10, y5VarArr));
                    throw th2;
                }
            default:
                o9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ i9(o9 o9Var, Runnable[] runnableArr, a60 a60Var, int i10, k7.y5[] y5VarArr) {
        this.b = o9Var;
        this.c = runnableArr;
        this.d = a60Var;
        this.e = i10;
        this.f = y5VarArr;
    }
}
