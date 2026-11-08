package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class j71 extends nq0 {
    public final /* synthetic */ org.telegram.messenger.gf a;
    public final /* synthetic */ k71 b;

    public j71(k71 k71Var, org.telegram.messenger.gf gfVar) {
        this.b = k71Var;
        this.a = gfVar;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        v71 v71Var = this.b.a;
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
            v71Var.C1 = new qc1(file2, file2, "");
            v71Var.D1 = K;
            v71Var.c2 = 0;
            v71Var.y0.requestLayout();
            v71Var.g1(false);
            v71Var.x1 = null;
            v71Var.n1();
        }
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean z() {
        return false;
    }
}
