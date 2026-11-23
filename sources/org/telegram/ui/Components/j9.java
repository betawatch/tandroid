package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j9 implements n9 {
    public final /* synthetic */ o9 a;
    public final /* synthetic */ c8.ja[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ f50[] d;

    public /* synthetic */ j9(o9 o9Var, c8.ja[] jaVarArr, Runnable[] runnableArr, f50[] f50VarArr) {
        this.a = o9Var;
        this.b = jaVarArr;
        this.c = runnableArr;
        this.d = f50VarArr;
    }

    @Override // org.telegram.ui.Components.n9
    public final void dispose() {
        o9 o9Var = this.a;
        c8.ja[] jaVarArr = this.b;
        Runnable[] runnableArr = this.c;
        f50[] f50VarArr = this.d;
        jaVarArr[0] = null;
        if (o9Var.e.contains(runnableArr)) {
            org.telegram.messenger.q5 q5Var = Utilities.e;
            q5Var.getClass();
            for (Runnable runnable : runnableArr) {
                q5Var.a(runnable);
            }
            o9Var.e.remove(runnableArr);
        }
        for (f50 f50Var : f50VarArr) {
            Bitmap bitmap = (Bitmap) o9Var.b.remove(f50Var);
            o9Var.c.remove(f50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
