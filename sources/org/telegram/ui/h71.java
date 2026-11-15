package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class h71 extends mq0 {
    public final /* synthetic */ org.telegram.messenger.ff a;
    public final /* synthetic */ i71 b;

    public h71(i71 i71Var, org.telegram.messenger.ff ffVar) {
        this.b = i71Var;
        this.a = ffVar;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        t71 t71Var = this.b.a;
        org.telegram.messenger.ff ffVar = this.a;
        if (ffVar.h != null) {
            File file = new File(org.telegram.messenger.w7.z(4), Utilities.b.nextInt() + ".jpg");
            Point c12 = org.telegram.messenger.g0.c1();
            Bitmap K = org.telegram.messenger.fc.K(ffVar.h, null, (float) c12.x, (float) c12.y, true);
            try {
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
            }
            File file2 = new File(ffVar.h);
            t71Var.D1 = new pc1(file2, file2, "");
            t71Var.E1 = K;
            t71Var.d2 = 0;
            t71Var.z0.requestLayout();
            t71Var.g1(false);
            t71Var.y1 = null;
            t71Var.n1();
        }
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean z() {
        return false;
    }
}
