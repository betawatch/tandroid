package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class q9 implements u9 {
    public final /* synthetic */ v9 a;
    public final /* synthetic */ w7.x5[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ h60[] d;

    public /* synthetic */ q9(v9 v9Var, w7.x5[] x5VarArr, Runnable[] runnableArr, h60[] h60VarArr) {
        this.a = v9Var;
        this.b = x5VarArr;
        this.c = runnableArr;
        this.d = h60VarArr;
    }

    @Override // org.telegram.ui.Components.u9
    public final void dispose() {
        v9 v9Var = this.a;
        w7.x5[] x5VarArr = this.b;
        Runnable[] runnableArr = this.c;
        h60[] h60VarArr = this.d;
        x5VarArr[0] = null;
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
