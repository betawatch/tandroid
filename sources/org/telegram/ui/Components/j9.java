package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j9 implements n9 {
    public final /* synthetic */ o9 a;
    public final /* synthetic */ k7.y5[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ a60[] d;

    public /* synthetic */ j9(o9 o9Var, k7.y5[] y5VarArr, Runnable[] runnableArr, a60[] a60VarArr) {
        this.a = o9Var;
        this.b = y5VarArr;
        this.c = runnableArr;
        this.d = a60VarArr;
    }

    @Override // org.telegram.ui.Components.n9
    public final void dispose() {
        o9 o9Var = this.a;
        k7.y5[] y5VarArr = this.b;
        Runnable[] runnableArr = this.c;
        a60[] a60VarArr = this.d;
        y5VarArr[0] = null;
        if (o9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            o9Var.e.remove(runnableArr);
        }
        for (a60 a60Var : a60VarArr) {
            Bitmap bitmap = (Bitmap) o9Var.b.remove(a60Var);
            o9Var.c.remove(a60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
