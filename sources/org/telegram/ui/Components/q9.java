package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class q9 implements u9 {
    public final /* synthetic */ v9 a;
    public final /* synthetic */ w7.w5[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ m60[] d;

    public /* synthetic */ q9(v9 v9Var, w7.w5[] w5VarArr, Runnable[] runnableArr, m60[] m60VarArr) {
        this.a = v9Var;
        this.b = w5VarArr;
        this.c = runnableArr;
        this.d = m60VarArr;
    }

    @Override // org.telegram.ui.Components.u9
    public final void dispose() {
        v9 v9Var = this.a;
        w7.w5[] w5VarArr = this.b;
        Runnable[] runnableArr = this.c;
        m60[] m60VarArr = this.d;
        w5VarArr[0] = null;
        if (v9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            v9Var.e.remove(runnableArr);
        }
        for (m60 m60Var : m60VarArr) {
            Bitmap bitmap = (Bitmap) v9Var.b.remove(m60Var);
            v9Var.c.remove(m60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
