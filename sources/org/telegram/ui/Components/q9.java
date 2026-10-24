package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class q9 implements u9 {
    public final /* synthetic */ v9 a;
    public final /* synthetic */ w7.w5[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ u60[] d;

    public /* synthetic */ q9(v9 v9Var, w7.w5[] w5VarArr, Runnable[] runnableArr, u60[] u60VarArr) {
        this.a = v9Var;
        this.b = w5VarArr;
        this.c = runnableArr;
        this.d = u60VarArr;
    }

    @Override // org.telegram.ui.Components.u9
    public final void dispose() {
        v9 v9Var = this.a;
        w7.w5[] w5VarArr = this.b;
        Runnable[] runnableArr = this.c;
        u60[] u60VarArr = this.d;
        w5VarArr[0] = null;
        if (v9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            v9Var.e.remove(runnableArr);
        }
        for (u60 u60Var : u60VarArr) {
            Bitmap bitmap = (Bitmap) v9Var.b.remove(u60Var);
            v9Var.c.remove(u60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
