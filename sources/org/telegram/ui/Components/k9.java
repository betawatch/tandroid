package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k9 implements o9 {
    public final /* synthetic */ p9 a;
    public final /* synthetic */ c8.ia[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ i50[] d;

    public /* synthetic */ k9(p9 p9Var, c8.ia[] iaVarArr, Runnable[] runnableArr, i50[] i50VarArr) {
        this.a = p9Var;
        this.b = iaVarArr;
        this.c = runnableArr;
        this.d = i50VarArr;
    }

    @Override // org.telegram.ui.Components.o9
    public final void dispose() {
        p9 p9Var = this.a;
        c8.ia[] iaVarArr = this.b;
        Runnable[] runnableArr = this.c;
        i50[] i50VarArr = this.d;
        iaVarArr[0] = null;
        if (p9Var.e.contains(runnableArr)) {
            org.telegram.messenger.q5 q5Var = Utilities.e;
            q5Var.getClass();
            for (Runnable runnable : runnableArr) {
                q5Var.a(runnable);
            }
            p9Var.e.remove(runnableArr);
        }
        for (i50 i50Var : i50VarArr) {
            Bitmap bitmap = (Bitmap) p9Var.b.remove(i50Var);
            p9Var.c.remove(i50Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
