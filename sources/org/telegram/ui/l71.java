package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class l71 extends oq0 {
    public final /* synthetic */ org.telegram.messenger.ef a;
    public final /* synthetic */ m71 b;

    public l71(m71 m71Var, org.telegram.messenger.ef efVar) {
        this.b = m71Var;
        this.a = efVar;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        x71 x71Var = this.b.a;
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
            x71Var.D1 = new sc1(file2, file2, "");
            x71Var.E1 = K;
            x71Var.d2 = 0;
            x71Var.z0.requestLayout();
            x71Var.g1(false);
            x71Var.y1 = null;
            x71Var.n1();
        }
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean z() {
        return false;
    }
}
