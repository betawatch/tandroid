package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s9 implements w9 {
    public final /* synthetic */ x9 a;
    public final /* synthetic */ kb1[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ w60[] d;

    public /* synthetic */ s9(x9 x9Var, kb1[] kb1VarArr, Runnable[] runnableArr, w60[] w60VarArr) {
        this.a = x9Var;
        this.b = kb1VarArr;
        this.c = runnableArr;
        this.d = w60VarArr;
    }

    @Override // org.telegram.ui.Components.w9
    public final void dispose() {
        x9 x9Var = this.a;
        kb1[] kb1VarArr = this.b;
        Runnable[] runnableArr = this.c;
        w60[] w60VarArr = this.d;
        kb1VarArr[0] = null;
        if (x9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            x9Var.e.remove(runnableArr);
        }
        for (w60 w60Var : w60VarArr) {
            Bitmap bitmap = (Bitmap) x9Var.b.remove(w60Var);
            x9Var.c.remove(w60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
