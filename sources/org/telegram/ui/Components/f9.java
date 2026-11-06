package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f9 implements j9 {
    public final /* synthetic */ k9 a;
    public final /* synthetic */ c8.ea[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ u40[] d;

    public /* synthetic */ f9(k9 k9Var, c8.ea[] eaVarArr, Runnable[] runnableArr, u40[] u40VarArr) {
        this.a = k9Var;
        this.b = eaVarArr;
        this.c = runnableArr;
        this.d = u40VarArr;
    }

    @Override // org.telegram.ui.Components.j9
    public final void dispose() {
        k9 k9Var = this.a;
        c8.ea[] eaVarArr = this.b;
        Runnable[] runnableArr = this.c;
        u40[] u40VarArr = this.d;
        eaVarArr[0] = null;
        if (k9Var.e.contains(runnableArr)) {
            org.telegram.messenger.p5 p5Var = Utilities.e;
            p5Var.getClass();
            for (Runnable runnable : runnableArr) {
                p5Var.a(runnable);
            }
            k9Var.e.remove(runnableArr);
        }
        for (u40 u40Var : u40VarArr) {
            Bitmap bitmap = (Bitmap) k9Var.b.remove(u40Var);
            k9Var.c.remove(u40Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
