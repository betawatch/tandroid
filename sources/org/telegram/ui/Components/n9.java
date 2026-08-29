package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n9 implements r9 {
    public final /* synthetic */ s9 a;
    public final /* synthetic */ i7.c6[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ u50[] d;

    public /* synthetic */ n9(s9 s9Var, i7.c6[] c6VarArr, Runnable[] runnableArr, u50[] u50VarArr) {
        this.a = s9Var;
        this.b = c6VarArr;
        this.c = runnableArr;
        this.d = u50VarArr;
    }

    @Override // org.telegram.ui.Components.r9
    public final void dispose() {
        s9 s9Var = this.a;
        i7.c6[] c6VarArr = this.b;
        Runnable[] runnableArr = this.c;
        u50[] u50VarArr = this.d;
        c6VarArr[0] = null;
        if (s9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            s9Var.e.remove(runnableArr);
        }
        for (u50 u50Var : u50VarArr) {
            Bitmap bitmap = (Bitmap) s9Var.b.remove(u50Var);
            s9Var.c.remove(u50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
