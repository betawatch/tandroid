package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ t9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ y50 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ w7.i0[] f;

    public /* synthetic */ n9(t9 t9Var, y50 y50Var, Runnable[] runnableArr, int i10, w7.i0[] i0VarArr) {
        this.b = t9Var;
        this.d = y50Var;
        this.c = runnableArr;
        this.e = i10;
        this.f = i0VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t9 t9Var = this.b;
                y50 y50Var = this.d;
                Runnable[] runnableArr = this.c;
                int i10 = this.e;
                w7.i0[] i0VarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = t9Var.getOrientation();
                    int[] iArr = t9Var.a;
                    int i11 = y50Var.a;
                    int i12 = y50Var.b;
                    Rect e = t9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ai.cb(t9Var, runnableArr, createBitmap, y50Var, i10, i0VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new n9(t9Var, runnableArr, y50Var, i10, i0VarArr));
                    throw th2;
                }
            default:
                t9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ n9(t9 t9Var, Runnable[] runnableArr, y50 y50Var, int i10, w7.i0[] i0VarArr) {
        this.b = t9Var;
        this.c = runnableArr;
        this.d = y50Var;
        this.e = i10;
        this.f = i0VarArr;
    }
}
