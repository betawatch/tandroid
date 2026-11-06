package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class i71 extends nq0 {
    public final /* synthetic */ org.telegram.messenger.gf a;
    public final /* synthetic */ j71 b;

    public i71(j71 j71Var, org.telegram.messenger.gf gfVar) {
        this.b = j71Var;
        this.a = gfVar;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        u71 u71Var = this.b.a;
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
            u71Var.C1 = new pc1(file2, file2, "");
            u71Var.D1 = K;
            u71Var.c2 = 0;
            u71Var.y0.requestLayout();
            u71Var.g1(false);
            u71Var.x1 = null;
            u71Var.n1();
        }
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean z() {
        return false;
    }
}
