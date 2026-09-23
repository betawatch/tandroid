package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class q9 implements u9 {
    public final /* synthetic */ v9 a;
    public final /* synthetic */ w7.i0[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ z50[] d;

    public /* synthetic */ q9(v9 v9Var, w7.i0[] i0VarArr, Runnable[] runnableArr, z50[] z50VarArr) {
        this.a = v9Var;
        this.b = i0VarArr;
        this.c = runnableArr;
        this.d = z50VarArr;
    }

    @Override // org.telegram.ui.Components.u9
    public final void dispose() {
        v9 v9Var = this.a;
        w7.i0[] i0VarArr = this.b;
        Runnable[] runnableArr = this.c;
        z50[] z50VarArr = this.d;
        i0VarArr[0] = null;
        if (v9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            v9Var.e.remove(runnableArr);
        }
        for (z50 z50Var : z50VarArr) {
            Bitmap bitmap = (Bitmap) v9Var.b.remove(z50Var);
            v9Var.c.remove(z50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
