package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ o9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ b60 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ k7.z5[] f;

    public /* synthetic */ i9(o9 o9Var, b60 b60Var, Runnable[] runnableArr, int i10, k7.z5[] z5VarArr) {
        this.b = o9Var;
        this.d = b60Var;
        this.c = runnableArr;
        this.e = i10;
        this.f = z5VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o9 o9Var = this.b;
                b60 b60Var = this.d;
                Runnable[] runnableArr = this.c;
                int i10 = this.e;
                k7.z5[] z5VarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = o9Var.getOrientation();
                    int[] iArr = o9Var.a;
                    int i11 = b60Var.a;
                    int i12 = b60Var.b;
                    Rect e6 = o9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e6.left, e6.top, e6.right, e6.bottom);
                    AndroidUtilities.runOnUIThread(new lf.j0(o9Var, runnableArr, createBitmap, b60Var, i10, z5VarArr));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new i9(o9Var, runnableArr, b60Var, i10, z5VarArr));
                    throw th2;
                }
            default:
                o9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ i9(o9 o9Var, Runnable[] runnableArr, b60 b60Var, int i10, k7.z5[] z5VarArr) {
        this.b = o9Var;
        this.c = runnableArr;
        this.d = b60Var;
        this.e = i10;
        this.f = z5VarArr;
    }
}
