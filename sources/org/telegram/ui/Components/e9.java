package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e9 implements i9 {
    public final /* synthetic */ j9 a;
    public final /* synthetic */ c8.ea[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ u40[] d;

    public /* synthetic */ e9(j9 j9Var, c8.ea[] eaVarArr, Runnable[] runnableArr, u40[] u40VarArr) {
        this.a = j9Var;
        this.b = eaVarArr;
        this.c = runnableArr;
        this.d = u40VarArr;
    }

    @Override // org.telegram.ui.Components.i9
    public final void dispose() {
        j9 j9Var = this.a;
        c8.ea[] eaVarArr = this.b;
        Runnable[] runnableArr = this.c;
        u40[] u40VarArr = this.d;
        eaVarArr[0] = null;
        if (j9Var.e.contains(runnableArr)) {
            org.telegram.messenger.p5 p5Var = Utilities.e;
            p5Var.getClass();
            for (Runnable runnable : runnableArr) {
                p5Var.a(runnable);
            }
            j9Var.e.remove(runnableArr);
        }
        for (u40 u40Var : u40VarArr) {
            Bitmap bitmap = (Bitmap) j9Var.b.remove(u40Var);
            j9Var.c.remove(u40Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
