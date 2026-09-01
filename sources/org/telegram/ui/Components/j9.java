package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j9 implements n9 {
    public final /* synthetic */ o9 a;
    public final /* synthetic */ k7.z5[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ b60[] d;

    public /* synthetic */ j9(o9 o9Var, k7.z5[] z5VarArr, Runnable[] runnableArr, b60[] b60VarArr) {
        this.a = o9Var;
        this.b = z5VarArr;
        this.c = runnableArr;
        this.d = b60VarArr;
    }

    @Override // org.telegram.ui.Components.n9
    public final void dispose() {
        o9 o9Var = this.a;
        k7.z5[] z5VarArr = this.b;
        Runnable[] runnableArr = this.c;
        b60[] b60VarArr = this.d;
        z5VarArr[0] = null;
        if (o9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            o9Var.e.remove(runnableArr);
        }
        for (b60 b60Var : b60VarArr) {
            Bitmap bitmap = (Bitmap) o9Var.b.remove(b60Var);
            o9Var.c.remove(b60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
