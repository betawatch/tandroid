package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t9 implements x9 {
    public final /* synthetic */ y9 a;
    public final /* synthetic */ w7.w5[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ w60[] d;

    public /* synthetic */ t9(y9 y9Var, w7.w5[] w5VarArr, Runnable[] runnableArr, w60[] w60VarArr) {
        this.a = y9Var;
        this.b = w5VarArr;
        this.c = runnableArr;
        this.d = w60VarArr;
    }

    @Override // org.telegram.ui.Components.x9
    public final void dispose() {
        y9 y9Var = this.a;
        w7.w5[] w5VarArr = this.b;
        Runnable[] runnableArr = this.c;
        w60[] w60VarArr = this.d;
        w5VarArr[0] = null;
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
