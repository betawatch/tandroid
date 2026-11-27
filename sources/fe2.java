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
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class fe2 implements l12 {
    public final /* synthetic */ n12 a;
    public final /* synthetic */ TL_stories.TL_premium_boostsStatus b;
    public final /* synthetic */ vnb c;
    public final /* synthetic */ wz4 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ ah1 f;
    public final /* synthetic */ wh1 h;

    public fe2(n12 n12Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, vnb vnbVar, wz4 wz4Var, long j, ah1 ah1Var, wh1 wh1Var) {
        this.a = n12Var;
        this.b = tL_premium_boostsStatus;
        this.c = vnbVar;
        this.d = wz4Var;
        this.e = j;
        this.f = ah1Var;
        this.h = wh1Var;
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
        ee2 ee2Var = new ee2(obj, null, true, (byte) 1);
        ee2Var.X1 = this.b;
        ee2Var.a.a = this.c;
        ee2Var.r1 = this.d;
        ee2Var.h1(this.e);
        ee2Var.K1 = new de2(this.a, this.f, (byte) 1);
        bg0 bg0Var = new bg0();
        bg0Var.a = true;
        bg0Var.e = true;
        this.h.showAsSheet(ee2Var, bg0Var);
    }

    @Override // l12
    public final boolean o() {
        return false;
    }

    @Override // l12
    public final void z0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        n12 n12Var = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = n12Var.d2.getSelectedPhotos();
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
                ee2 ee2Var = new ee2(new zvc(file, file, ""), G, false, (byte) 0);
                ee2Var.X1 = this.b;
                ee2Var.a.a = this.c;
                ee2Var.r1 = this.d;
                ee2Var.H1 = false;
                ee2Var.G1 = false;
                ee2Var.p1 = 0.2f;
                ee2Var.h1(this.e);
                ee2Var.K1 = new de2(n12Var, this.f, (byte) 0);
                bg0 bg0Var = new bg0();
                bg0Var.a = true;
                bg0Var.e = true;
                this.h.showAsSheet(ee2Var, bg0Var);
                n12Var.dismiss();
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
