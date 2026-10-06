package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class p9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ v9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ m60 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ w7.w5[] f;

    public /* synthetic */ p9(v9 v9Var, m60 m60Var, Runnable[] runnableArr, int i10, w7.w5[] w5VarArr) {
        this.b = v9Var;
        this.d = m60Var;
        this.c = runnableArr;
        this.e = i10;
        this.f = w5VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v9 v9Var = this.b;
                m60 m60Var = this.d;
                Runnable[] runnableArr = this.c;
                int i10 = this.e;
                w7.w5[] w5VarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = v9Var.getOrientation();
                    int[] iArr = v9Var.a;
                    int i11 = m60Var.a;
                    int i12 = m60Var.b;
                    Rect e7 = v9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e7.left, e7.top, e7.right, e7.bottom);
                    AndroidUtilities.runOnUIThread(new ai.cb(v9Var, runnableArr, createBitmap, m60Var, i10, w5VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new p9(v9Var, runnableArr, m60Var, i10, w5VarArr));
                    throw th2;
                }
            default:
                v9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ p9(v9 v9Var, Runnable[] runnableArr, m60 m60Var, int i10, w7.w5[] w5VarArr) {
        this.b = v9Var;
        this.c = runnableArr;
        this.d = m60Var;
        this.e = i10;
        this.f = w5VarArr;
    }
}
