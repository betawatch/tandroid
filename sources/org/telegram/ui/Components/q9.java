package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class q9 implements u9 {
    public final /* synthetic */ v9 a;
    public final /* synthetic */ w7.w5[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ t60[] d;

    public /* synthetic */ q9(v9 v9Var, w7.w5[] w5VarArr, Runnable[] runnableArr, t60[] t60VarArr) {
        this.a = v9Var;
        this.b = w5VarArr;
        this.c = runnableArr;
        this.d = t60VarArr;
    }

    @Override // org.telegram.ui.Components.u9
    public final void dispose() {
        v9 v9Var = this.a;
        w7.w5[] w5VarArr = this.b;
        Runnable[] runnableArr = this.c;
        t60[] t60VarArr = this.d;
        w5VarArr[0] = null;
        if (v9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            v9Var.e.remove(runnableArr);
        }
        for (t60 t60Var : t60VarArr) {
            Bitmap bitmap = (Bitmap) v9Var.b.remove(t60Var);
            v9Var.c.remove(t60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
