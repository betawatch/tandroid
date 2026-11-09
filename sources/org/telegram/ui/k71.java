package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class k71 extends pq0 {
    public final /* synthetic */ org.telegram.messenger.gf a;
    public final /* synthetic */ l71 b;

    public k71(l71 l71Var, org.telegram.messenger.gf gfVar) {
        this.b = l71Var;
        this.a = gfVar;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        w71 w71Var = this.b.a;
        org.telegram.messenger.gf gfVar = this.a;
        if (gfVar.h != null) {
            File file = new File(org.telegram.messenger.w7.z(4), Utilities.b.nextInt() + ".jpg");
            Point c12 = org.telegram.messenger.g0.c1();
            Bitmap K = org.telegram.messenger.gc.K(gfVar.h, null, (float) c12.x, (float) c12.y, true);
            try {
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
            }
            File file2 = new File(gfVar.h);
            w71Var.C1 = new tc1(file2, file2, "");
            w71Var.D1 = K;
            w71Var.c2 = 0;
            w71Var.y0.requestLayout();
            w71Var.g1(false);
            w71Var.x1 = null;
            w71Var.n1();
        }
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final boolean z() {
        return false;
    }
}
