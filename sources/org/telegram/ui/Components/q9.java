package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q9 implements u9 {
    public final /* synthetic */ v9 a;
    public final /* synthetic */ w7.j0[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ h60[] d;

    public /* synthetic */ q9(v9 v9Var, w7.j0[] j0VarArr, Runnable[] runnableArr, h60[] h60VarArr) {
        this.a = v9Var;
        this.b = j0VarArr;
        this.c = runnableArr;
        this.d = h60VarArr;
    }

    @Override // org.telegram.ui.Components.u9
    public final void dispose() {
        v9 v9Var = this.a;
        w7.j0[] j0VarArr = this.b;
        Runnable[] runnableArr = this.c;
        h60[] h60VarArr = this.d;
        j0VarArr[0] = null;
        if (v9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            v9Var.e.remove(runnableArr);
        }
        for (h60 h60Var : h60VarArr) {
            Bitmap bitmap = (Bitmap) v9Var.b.remove(h60Var);
            v9Var.c.remove(h60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
