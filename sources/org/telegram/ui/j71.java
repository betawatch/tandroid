package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class j71 extends oq0 {
    public final /* synthetic */ org.telegram.messenger.ef a;
    public final /* synthetic */ k71 b;

    public j71(k71 k71Var, org.telegram.messenger.ef efVar) {
        this.b = k71Var;
        this.a = efVar;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.d20 d20Var, boolean z10, int i10, int i11, boolean z11) {
        v71 v71Var = this.b.a;
        org.telegram.messenger.ef efVar = this.a;
        if (efVar.h != null) {
            File file = new File(org.telegram.messenger.w7.z(4), Utilities.b.nextInt() + ".jpg");
            Point c12 = org.telegram.messenger.g0.c1();
            Bitmap K = org.telegram.messenger.ec.K(efVar.h, null, (float) c12.x, (float) c12.y, true);
            try {
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
            }
            File file2 = new File(efVar.h);
            v71Var.D1 = new qc1(file2, file2, "");
            v71Var.E1 = K;
            v71Var.d2 = 0;
            v71Var.z0.requestLayout();
            v71Var.g1(false);
            v71Var.y1 = null;
            v71Var.n1();
        }
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean z() {
        return false;
    }
}
