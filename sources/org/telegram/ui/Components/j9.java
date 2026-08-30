package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j9 implements n9 {
    public final /* synthetic */ o9 a;
    public final /* synthetic */ k7.y5[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ z50[] d;

    public /* synthetic */ j9(o9 o9Var, k7.y5[] y5VarArr, Runnable[] runnableArr, z50[] z50VarArr) {
        this.a = o9Var;
        this.b = y5VarArr;
        this.c = runnableArr;
        this.d = z50VarArr;
    }

    @Override // org.telegram.ui.Components.n9
    public final void dispose() {
        o9 o9Var = this.a;
        k7.y5[] y5VarArr = this.b;
        Runnable[] runnableArr = this.c;
        z50[] z50VarArr = this.d;
        y5VarArr[0] = null;
        if (o9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            o9Var.e.remove(runnableArr);
        }
        for (z50 z50Var : z50VarArr) {
            Bitmap bitmap = (Bitmap) o9Var.b.remove(z50Var);
            o9Var.c.remove(z50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
