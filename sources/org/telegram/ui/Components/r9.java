package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ x9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ w60 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ kb1[] f;

    public /* synthetic */ r9(x9 x9Var, w60 w60Var, Runnable[] runnableArr, int i10, kb1[] kb1VarArr) {
        this.b = x9Var;
        this.d = w60Var;
        this.c = runnableArr;
        this.e = i10;
        this.f = kb1VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x9 x9Var = this.b;
                w60 w60Var = this.d;
                Runnable[] runnableArr = this.c;
                int i10 = this.e;
                kb1[] kb1VarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = x9Var.getOrientation();
                    int[] iArr = x9Var.a;
                    int i11 = w60Var.a;
                    int i12 = w60Var.b;
                    Rect e = x9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ag.q0(x9Var, runnableArr, createBitmap, w60Var, i10, kb1VarArr, 10));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new r9(x9Var, runnableArr, w60Var, i10, kb1VarArr));
                    throw th2;
                }
            default:
                x9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ r9(x9 x9Var, Runnable[] runnableArr, w60 w60Var, int i10, kb1[] kb1VarArr) {
        this.b = x9Var;
        this.c = runnableArr;
        this.d = w60Var;
        this.e = i10;
        this.f = kb1VarArr;
    }
}
