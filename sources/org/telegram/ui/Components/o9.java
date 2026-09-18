package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o9 implements s9 {
    public final /* synthetic */ t9 a;
    public final /* synthetic */ w7.i0[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ y50[] d;

    public /* synthetic */ o9(t9 t9Var, w7.i0[] i0VarArr, Runnable[] runnableArr, y50[] y50VarArr) {
        this.a = t9Var;
        this.b = i0VarArr;
        this.c = runnableArr;
        this.d = y50VarArr;
    }

    @Override // org.telegram.ui.Components.s9
    public final void dispose() {
        t9 t9Var = this.a;
        w7.i0[] i0VarArr = this.b;
        Runnable[] runnableArr = this.c;
        y50[] y50VarArr = this.d;
        i0VarArr[0] = null;
        if (t9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            t9Var.e.remove(runnableArr);
        }
        for (y50 y50Var : y50VarArr) {
            Bitmap bitmap = (Bitmap) t9Var.b.remove(y50Var);
            t9Var.c.remove(y50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
