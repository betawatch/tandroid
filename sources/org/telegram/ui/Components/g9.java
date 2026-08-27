package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ m9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ m50 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ h7.w5[] f;

    public /* synthetic */ g9(m9 m9Var, m50 m50Var, Runnable[] runnableArr, int i10, h7.w5[] w5VarArr) {
        this.b = m9Var;
        this.d = m50Var;
        this.c = runnableArr;
        this.e = i10;
        this.f = w5VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m9 m9Var = this.b;
                m50 m50Var = this.d;
                Runnable[] runnableArr = this.c;
                int i10 = this.e;
                h7.w5[] w5VarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = m9Var.getOrientation();
                    int[] iArr = m9Var.a;
                    int i11 = m50Var.a;
                    int i12 = m50Var.b;
                    Rect e9 = m9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e9.left, e9.top, e9.right, e9.bottom);
                    AndroidUtilities.runOnUIThread(new gf.k0(m9Var, runnableArr, createBitmap, m50Var, i10, w5VarArr));
                    return;
                } catch (Throwable th) {
                    AndroidUtilities.runOnUIThread(new g9(m9Var, runnableArr, m50Var, i10, w5VarArr));
                    throw th;
                }
            default:
                m9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ g9(m9 m9Var, Runnable[] runnableArr, m50 m50Var, int i10, h7.w5[] w5VarArr) {
        this.b = m9Var;
        this.c = runnableArr;
        this.d = m50Var;
        this.e = i10;
        this.f = w5VarArr;
    }
}
