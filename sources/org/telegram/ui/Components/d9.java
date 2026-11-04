package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d9 implements h9 {
    public final /* synthetic */ j9 a;
    public final /* synthetic */ b8.jf[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ q40[] d;

    public /* synthetic */ d9(j9 j9Var, b8.jf[] jfVarArr, Runnable[] runnableArr, q40[] q40VarArr) {
        this.a = j9Var;
        this.b = jfVarArr;
        this.c = runnableArr;
        this.d = q40VarArr;
    }

    @Override // org.telegram.ui.Components.h9
    public final void dispose() {
        j9 j9Var = this.a;
        b8.jf[] jfVarArr = this.b;
        Runnable[] runnableArr = this.c;
        q40[] q40VarArr = this.d;
        jfVarArr[0] = null;
        if (j9Var.e.contains(runnableArr)) {
            org.telegram.messenger.p5 p5Var = Utilities.e;
            p5Var.getClass();
            for (Runnable runnable : runnableArr) {
                p5Var.a(runnable);
            }
            j9Var.e.remove(runnableArr);
        }
        for (q40 q40Var : q40VarArr) {
            Bitmap bitmap = (Bitmap) j9Var.b.remove(q40Var);
            j9Var.c.remove(q40Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
