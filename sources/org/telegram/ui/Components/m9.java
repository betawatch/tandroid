package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ s9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ u50 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ i7.c6[] f;

    public /* synthetic */ m9(s9 s9Var, u50 u50Var, Runnable[] runnableArr, int i10, i7.c6[] c6VarArr) {
        this.b = s9Var;
        this.d = u50Var;
        this.c = runnableArr;
        this.e = i10;
        this.f = c6VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s9 s9Var = this.b;
                u50 u50Var = this.d;
                Runnable[] runnableArr = this.c;
                int i10 = this.e;
                i7.c6[] c6VarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = s9Var.getOrientation();
                    int[] iArr = s9Var.a;
                    int i11 = u50Var.a;
                    int i12 = u50Var.b;
                    Rect e10 = s9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e10.left, e10.top, e10.right, e10.bottom);
                    AndroidUtilities.runOnUIThread(new jf.j0(s9Var, runnableArr, createBitmap, u50Var, i10, c6VarArr));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new m9(s9Var, runnableArr, u50Var, i10, c6VarArr));
                    throw th2;
                }
            default:
                s9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ m9(s9 s9Var, Runnable[] runnableArr, u50 u50Var, int i10, i7.c6[] c6VarArr) {
        this.b = s9Var;
        this.c = runnableArr;
        this.d = u50Var;
        this.e = i10;
        this.f = c6VarArr;
    }
}
