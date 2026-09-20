package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class p9 implements t9 {
    public final /* synthetic */ u9 a;
    public final /* synthetic */ w7.j0[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ g60[] d;

    public /* synthetic */ p9(u9 u9Var, w7.j0[] j0VarArr, Runnable[] runnableArr, g60[] g60VarArr) {
        this.a = u9Var;
        this.b = j0VarArr;
        this.c = runnableArr;
        this.d = g60VarArr;
    }

    @Override // org.telegram.ui.Components.t9
    public final void dispose() {
        u9 u9Var = this.a;
        w7.j0[] j0VarArr = this.b;
        Runnable[] runnableArr = this.c;
        g60[] g60VarArr = this.d;
        j0VarArr[0] = null;
        if (u9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            u9Var.e.remove(runnableArr);
        }
        for (g60 g60Var : g60VarArr) {
            Bitmap bitmap = (Bitmap) u9Var.b.remove(g60Var);
            u9Var.c.remove(g60Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
