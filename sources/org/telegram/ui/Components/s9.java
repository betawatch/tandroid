package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s9 implements w9 {
    public final /* synthetic */ x9 a;
    public final /* synthetic */ w7.i0[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ a70[] d;

    public /* synthetic */ s9(x9 x9Var, w7.i0[] i0VarArr, Runnable[] runnableArr, a70[] a70VarArr) {
        this.a = x9Var;
        this.b = i0VarArr;
        this.c = runnableArr;
        this.d = a70VarArr;
    }

    @Override // org.telegram.ui.Components.w9
    public final void dispose() {
        x9 x9Var = this.a;
        w7.i0[] i0VarArr = this.b;
        Runnable[] runnableArr = this.c;
        a70[] a70VarArr = this.d;
        i0VarArr[0] = null;
        if (x9Var.e.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            x9Var.e.remove(runnableArr);
        }
        for (a70 a70Var : a70VarArr) {
            Bitmap bitmap = (Bitmap) x9Var.b.remove(a70Var);
            x9Var.c.remove(a70Var);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
