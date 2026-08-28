package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i9 implements m9 {
    public final /* synthetic */ n9 a;
    public final /* synthetic */ g7.b6[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ h50[] d;

    public /* synthetic */ i9(n9 n9Var, g7.b6[] b6VarArr, Runnable[] runnableArr, h50[] h50VarArr) {
        this.a = n9Var;
        this.b = b6VarArr;
        this.c = runnableArr;
        this.d = h50VarArr;
    }

    @Override // org.telegram.ui.Components.m9
    public final void dispose() {
        n9 n9Var = this.a;
        g7.b6[] b6VarArr = this.b;
        Runnable[] runnableArr = this.c;
        h50[] h50VarArr = this.d;
        b6VarArr[0] = null;
        if (n9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            n9Var.e.remove(runnableArr);
        }
        for (h50 h50Var : h50VarArr) {
            Bitmap bitmap = (Bitmap) n9Var.b.remove(h50Var);
            n9Var.c.remove(h50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
