// default package

import android.graphics.Bitmap;
import android.graphics.Point;
import android.text.Editable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class he2 implements l12 {
    public final /* synthetic */ oe2 a;

    public he2(oe2 oe2Var) {
        this.a = oe2Var;
    }

    @Override // l12
    public final boolean E0() {
        System.currentTimeMillis();
        return true;
    }

    @Override // l12
    public final void O0(vq0 vq0Var) {
        vq0Var.run();
    }

    @Override // l12
    public final void e0(Object obj) {
        ee2 ee2Var = new ee2(obj, null, true, (byte) 3);
        oe2 oe2Var = this.a;
        ee2Var.X1 = oe2Var.Y1;
        ee2Var.h1(oe2Var.u1.a());
        ee2Var.K1 = new ge2(this, 1 == true ? 1 : 0);
        oe2Var.R0(ee2Var);
    }

    @Override // l12
    public final boolean o() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l12
    public final void z0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        oe2 oe2Var = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = oe2Var.R1.d2.getSelectedPhotos();
            if (selectedPhotos.isEmpty()) {
                return;
            }
            no6 no6Var = (no6) selectedPhotos.values().iterator().next();
            String str = no6Var.h;
            if (str == null) {
                str = no6Var.I;
            }
            if (str != null) {
                File file = new File(xb4.z(4), Utilities.b.nextInt() + ".jpg");
                Point b1 = hl.b1();
                Bitmap G = in5.G(str, null, (float) b1.x, (float) b1.y, true);
                G.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                ee2 ee2Var = new ee2(new zvc(file, file, ""), G, false, (byte) 2);
                ee2Var.X1 = oe2Var.Y1;
                ee2Var.H1 = false;
                ee2Var.G1 = false;
                ee2Var.p1 = 0.2f;
                ee2Var.h1(oe2Var.u1.a());
                ee2Var.K1 = new ge2(this, 0 == true ? 1 : 0);
                oe2Var.R0(ee2Var);
            }
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    @Override // l12
    public final void R() {
    }

    @Override // l12
    public final void V() {
    }

    @Override // l12
    public final void i0(TLRPC.User user) {
    }

    @Override // l12
    public final void f0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
