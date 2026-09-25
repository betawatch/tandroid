package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q9 implements u9 {
    public final /* synthetic */ v9 a;
    public final /* synthetic */ w7.j0[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ j60[] d;

    public /* synthetic */ q9(v9 v9Var, w7.j0[] j0VarArr, Runnable[] runnableArr, j60[] j60VarArr) {
        this.a = v9Var;
        this.b = j0VarArr;
        this.c = runnableArr;
        this.d = j60VarArr;
    }

    @Override // org.telegram.ui.Components.u9
    public final void dispose() {
        v9 v9Var = this.a;
        w7.j0[] j0VarArr = this.b;
        Runnable[] runnableArr = this.c;
        j60[] j60VarArr = this.d;
        j0VarArr[0] = null;
        if (v9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            v9Var.e.remove(runnableArr);
        }
        for (j60 j60Var : j60VarArr) {
            Bitmap bitmap = (Bitmap) v9Var.b.remove(j60Var);
            v9Var.c.remove(j60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
