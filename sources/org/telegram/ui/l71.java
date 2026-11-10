package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l71 extends qq0 {
    public final /* synthetic */ org.telegram.messenger.gf a;
    public final /* synthetic */ m71 b;

    public l71(m71 m71Var, org.telegram.messenger.gf gfVar) {
        this.b = m71Var;
        this.a = gfVar;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        x71 x71Var = this.b.a;
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
            x71Var.C1 = new uc1(file2, file2, "");
            x71Var.D1 = K;
            x71Var.c2 = 0;
            x71Var.y0.requestLayout();
            x71Var.g1(false);
            x71Var.x1 = null;
            x71Var.n1();
        }
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean z() {
        return false;
    }
}
