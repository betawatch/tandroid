package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a9 implements e9 {
    public final /* synthetic */ f9 a;
    public final /* synthetic */ w7.y5[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ k50[] d;

    public /* synthetic */ a9(f9 f9Var, w7.y5[] y5VarArr, Runnable[] runnableArr, k50[] k50VarArr) {
        this.a = f9Var;
        this.b = y5VarArr;
        this.c = runnableArr;
        this.d = k50VarArr;
    }

    @Override // org.telegram.ui.Components.e9
    public final void dispose() {
        f9 f9Var = this.a;
        w7.y5[] y5VarArr = this.b;
        Runnable[] runnableArr = this.c;
        k50[] k50VarArr = this.d;
        y5VarArr[0] = null;
        if (f9Var.e.contains(runnableArr)) {
            org.telegram.messenger.r5 r5Var = Utilities.e;
            r5Var.getClass();
            for (Runnable runnable : runnableArr) {
                r5Var.a(runnable);
            }
            f9Var.e.remove(runnableArr);
        }
        for (k50 k50Var : k50VarArr) {
            Bitmap bitmap = (Bitmap) f9Var.b.remove(k50Var);
            f9Var.c.remove(k50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
