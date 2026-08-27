package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h9 implements l9 {
    public final /* synthetic */ m9 a;
    public final /* synthetic */ h7.w5[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ m50[] d;

    public /* synthetic */ h9(m9 m9Var, h7.w5[] w5VarArr, Runnable[] runnableArr, m50[] m50VarArr) {
        this.a = m9Var;
        this.b = w5VarArr;
        this.c = runnableArr;
        this.d = m50VarArr;
    }

    @Override // org.telegram.ui.Components.l9
    public final void dispose() {
        m9 m9Var = this.a;
        h7.w5[] w5VarArr = this.b;
        Runnable[] runnableArr = this.c;
        m50[] m50VarArr = this.d;
        w5VarArr[0] = null;
        if (m9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            m9Var.e.remove(runnableArr);
        }
        for (m50 m50Var : m50VarArr) {
            Bitmap bitmap = (Bitmap) m9Var.b.remove(m50Var);
            m9Var.c.remove(m50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
