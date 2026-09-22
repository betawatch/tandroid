package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class p9 implements t9 {
    public final /* synthetic */ u9 a;
    public final /* synthetic */ w7.j0[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ j60[] d;

    public /* synthetic */ p9(u9 u9Var, w7.j0[] j0VarArr, Runnable[] runnableArr, j60[] j60VarArr) {
        this.a = u9Var;
        this.b = j0VarArr;
        this.c = runnableArr;
        this.d = j60VarArr;
    }

    @Override // org.telegram.ui.Components.t9
    public final void dispose() {
        u9 u9Var = this.a;
        w7.j0[] j0VarArr = this.b;
        Runnable[] runnableArr = this.c;
        j60[] j60VarArr = this.d;
        j0VarArr[0] = null;
        if (u9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            u9Var.e.remove(runnableArr);
        }
        for (j60 j60Var : j60VarArr) {
            Bitmap bitmap = (Bitmap) u9Var.b.remove(j60Var);
            u9Var.c.remove(j60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
