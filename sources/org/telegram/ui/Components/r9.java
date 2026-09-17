package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r9 implements v9 {
    public final /* synthetic */ w9 a;
    public final /* synthetic */ w7.i0[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ y50[] d;

    public /* synthetic */ r9(w9 w9Var, w7.i0[] i0VarArr, Runnable[] runnableArr, y50[] y50VarArr) {
        this.a = w9Var;
        this.b = i0VarArr;
        this.c = runnableArr;
        this.d = y50VarArr;
    }

    @Override // org.telegram.ui.Components.v9
    public final void dispose() {
        w9 w9Var = this.a;
        w7.i0[] i0VarArr = this.b;
        Runnable[] runnableArr = this.c;
        y50[] y50VarArr = this.d;
        i0VarArr[0] = null;
        if (w9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            w9Var.e.remove(runnableArr);
        }
        for (y50 y50Var : y50VarArr) {
            Bitmap bitmap = (Bitmap) w9Var.b.remove(y50Var);
            w9Var.c.remove(y50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
