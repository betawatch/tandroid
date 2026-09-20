package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class o9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ u9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ g60 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ w7.j0[] f;

    public /* synthetic */ o9(u9 u9Var, g60 g60Var, Runnable[] runnableArr, int i10, w7.j0[] j0VarArr) {
        this.b = u9Var;
        this.d = g60Var;
        this.c = runnableArr;
        this.e = i10;
        this.f = j0VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u9 u9Var = this.b;
                g60 g60Var = this.d;
                Runnable[] runnableArr = this.c;
                int i10 = this.e;
                w7.j0[] j0VarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = u9Var.getOrientation();
                    int[] iArr = u9Var.a;
                    int i11 = g60Var.a;
                    int i12 = g60Var.b;
                    Rect e = u9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ai.cb(u9Var, runnableArr, createBitmap, g60Var, i10, j0VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new o9(u9Var, runnableArr, g60Var, i10, j0VarArr));
                    throw th2;
                }
            default:
                u9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ o9(u9 u9Var, Runnable[] runnableArr, g60 g60Var, int i10, w7.j0[] j0VarArr) {
        this.b = u9Var;
        this.c = runnableArr;
        this.d = g60Var;
        this.e = i10;
        this.f = j0VarArr;
    }
}
