package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class t9 implements x9 {
    public final /* synthetic */ y9 a;
    public final /* synthetic */ w7.x5[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ w60[] d;

    public /* synthetic */ t9(y9 y9Var, w7.x5[] x5VarArr, Runnable[] runnableArr, w60[] w60VarArr) {
        this.a = y9Var;
        this.b = x5VarArr;
        this.c = runnableArr;
        this.d = w60VarArr;
    }

    @Override // org.telegram.ui.Components.x9
    public final void dispose() {
        y9 y9Var = this.a;
        w7.x5[] x5VarArr = this.b;
        Runnable[] runnableArr = this.c;
        w60[] w60VarArr = this.d;
        x5VarArr[0] = null;
        if (y9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            y9Var.e.remove(runnableArr);
        }
        for (w60 w60Var : w60VarArr) {
            Bitmap bitmap = (Bitmap) y9Var.b.remove(w60Var);
            y9Var.c.remove(w60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
