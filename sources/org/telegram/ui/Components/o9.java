package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class o9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ u9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ j60 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ w7.j0[] f;

    public /* synthetic */ o9(u9 u9Var, j60 j60Var, Runnable[] runnableArr, int i10, w7.j0[] j0VarArr) {
        this.b = u9Var;
        this.d = j60Var;
        this.c = runnableArr;
        this.e = i10;
        this.f = j0VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u9 u9Var = this.b;
                j60 j60Var = this.d;
                Runnable[] runnableArr = this.c;
                int i10 = this.e;
                w7.j0[] j0VarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = u9Var.getOrientation();
                    int[] iArr = u9Var.a;
                    int i11 = j60Var.a;
                    int i12 = j60Var.b;
                    Rect e = u9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ai.cb(u9Var, runnableArr, createBitmap, j60Var, i10, j0VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new o9(u9Var, runnableArr, j60Var, i10, j0VarArr));
                    throw th2;
                }
            default:
                u9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ o9(u9 u9Var, Runnable[] runnableArr, j60 j60Var, int i10, w7.j0[] j0VarArr) {
        this.b = u9Var;
        this.c = runnableArr;
        this.d = j60Var;
        this.e = i10;
        this.f = j0VarArr;
    }
}
