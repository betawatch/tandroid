package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ x9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ a70 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ w7.i0[] f;

    public /* synthetic */ r9(x9 x9Var, a70 a70Var, Runnable[] runnableArr, int i10, w7.i0[] i0VarArr) {
        this.b = x9Var;
        this.d = a70Var;
        this.c = runnableArr;
        this.e = i10;
        this.f = i0VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x9 x9Var = this.b;
                a70 a70Var = this.d;
                Runnable[] runnableArr = this.c;
                int i10 = this.e;
                w7.i0[] i0VarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = x9Var.getOrientation();
                    int[] iArr = x9Var.a;
                    int i11 = a70Var.a;
                    int i12 = a70Var.b;
                    Rect e7 = x9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e7.left, e7.top, e7.right, e7.bottom);
                    AndroidUtilities.runOnUIThread(new ai.db(x9Var, runnableArr, createBitmap, a70Var, i10, i0VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new r9(x9Var, runnableArr, a70Var, i10, i0VarArr));
                    throw th2;
                }
            default:
                x9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ r9(x9 x9Var, Runnable[] runnableArr, a70 a70Var, int i10, w7.i0[] i0VarArr) {
        this.b = x9Var;
        this.c = runnableArr;
        this.d = a70Var;
        this.e = i10;
        this.f = i0VarArr;
    }
}
