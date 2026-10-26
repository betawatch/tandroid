package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s9 implements w9 {
    public final /* synthetic */ x9 a;
    public final /* synthetic */ gb1[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ v60[] d;

    public /* synthetic */ s9(x9 x9Var, gb1[] gb1VarArr, Runnable[] runnableArr, v60[] v60VarArr) {
        this.a = x9Var;
        this.b = gb1VarArr;
        this.c = runnableArr;
        this.d = v60VarArr;
    }

    @Override // org.telegram.ui.Components.w9
    public final void dispose() {
        x9 x9Var = this.a;
        gb1[] gb1VarArr = this.b;
        Runnable[] runnableArr = this.c;
        v60[] v60VarArr = this.d;
        gb1VarArr[0] = null;
        if (x9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            x9Var.e.remove(runnableArr);
        }
        for (v60 v60Var : v60VarArr) {
            Bitmap bitmap = (Bitmap) x9Var.b.remove(v60Var);
            x9Var.c.remove(v60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
