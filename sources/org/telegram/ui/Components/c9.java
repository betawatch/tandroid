package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c9 implements g9 {
    public final /* synthetic */ h9 a;
    public final /* synthetic */ c8.ga[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ x40[] d;

    public /* synthetic */ c9(h9 h9Var, c8.ga[] gaVarArr, Runnable[] runnableArr, x40[] x40VarArr) {
        this.a = h9Var;
        this.b = gaVarArr;
        this.c = runnableArr;
        this.d = x40VarArr;
    }

    @Override // org.telegram.ui.Components.g9
    public final void dispose() {
        h9 h9Var = this.a;
        c8.ga[] gaVarArr = this.b;
        Runnable[] runnableArr = this.c;
        x40[] x40VarArr = this.d;
        gaVarArr[0] = null;
        if (h9Var.e.contains(runnableArr)) {
            org.telegram.messenger.p5 p5Var = Utilities.e;
            p5Var.getClass();
            for (Runnable runnable : runnableArr) {
                p5Var.a(runnable);
            }
            h9Var.e.remove(runnableArr);
        }
        for (x40 x40Var : x40VarArr) {
            Bitmap bitmap = (Bitmap) h9Var.b.remove(x40Var);
            h9Var.c.remove(x40Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
