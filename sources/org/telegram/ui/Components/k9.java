package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k9 implements o9 {
    public final /* synthetic */ p9 a;
    public final /* synthetic */ c8.ia[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ f50[] d;

    public /* synthetic */ k9(p9 p9Var, c8.ia[] iaVarArr, Runnable[] runnableArr, f50[] f50VarArr) {
        this.a = p9Var;
        this.b = iaVarArr;
        this.c = runnableArr;
        this.d = f50VarArr;
    }

    @Override // org.telegram.ui.Components.o9
    public final void dispose() {
        p9 p9Var = this.a;
        c8.ia[] iaVarArr = this.b;
        Runnable[] runnableArr = this.c;
        f50[] f50VarArr = this.d;
        iaVarArr[0] = null;
        if (p9Var.e.contains(runnableArr)) {
            org.telegram.messenger.q5 q5Var = Utilities.e;
            q5Var.getClass();
            for (Runnable runnable : runnableArr) {
                q5Var.a(runnable);
            }
            p9Var.e.remove(runnableArr);
        }
        for (f50 f50Var : f50VarArr) {
            Bitmap bitmap = (Bitmap) p9Var.b.remove(f50Var);
            p9Var.c.remove(f50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
