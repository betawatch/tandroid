package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a91 extends yr0 {
    public final /* synthetic */ org.telegram.messenger.ef a;
    public final /* synthetic */ b91 b;

    public a91(b91 b91Var, org.telegram.messenger.ef efVar) {
        this.b = b91Var;
        this.a = efVar;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        m91 m91Var = this.b.a;
        org.telegram.messenger.ef efVar = this.a;
        if (efVar.h != null) {
            File file = new File(org.telegram.messenger.b8.z(4), Utilities.b.nextInt() + ".jpg");
            Point c12 = org.telegram.messenger.i0.c1();
            Bitmap K = org.telegram.messenger.hc.K(efVar.h, null, (float) c12.x, (float) c12.y, true);
            try {
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            File file2 = new File(efVar.h);
            m91Var.C1 = new ne1(file2, file2, "");
            m91Var.D1 = K;
            m91Var.c2 = 0;
            m91Var.y0.requestLayout();
            m91Var.f1(false);
            m91Var.x1 = null;
            m91Var.m1();
        }
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean z() {
        return false;
    }
}
