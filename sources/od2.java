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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class od2 implements v02 {
    public final /* synthetic */ x02 a;
    public final /* synthetic */ TL_stories.TL_premium_boostsStatus b;
    public final /* synthetic */ wjb c;
    public final /* synthetic */ qx4 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ rg1 f;
    public final /* synthetic */ nh1 h;

    public od2(x02 x02Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, wjb wjbVar, qx4 qx4Var, long j, rg1 rg1Var, nh1 nh1Var) {
        this.a = x02Var;
        this.b = tL_premium_boostsStatus;
        this.c = wjbVar;
        this.d = qx4Var;
        this.e = j;
        this.f = rg1Var;
        this.h = nh1Var;
    }

    @Override // v02
    public final void B1(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        x02 x02Var = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = x02Var.d2.getSelectedPhotos();
            if (selectedPhotos.isEmpty()) {
                return;
            }
            jm6 jm6Var = (jm6) selectedPhotos.values().iterator().next();
            String str = jm6Var.h;
            if (str == null) {
                str = jm6Var.I;
            }
            if (str != null) {
                File file = new File(ba4.z(4), Utilities.b.nextInt() + ".jpg");
                Point b1 = gl.b1();
                Bitmap G = fl5.G(str, null, (float) b1.x, (float) b1.y, true);
                G.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                nd2 nd2Var = new nd2(new lrc(file, file, ""), G, false, (byte) 0);
                nd2Var.X1 = this.b;
                nd2Var.a.a = this.c;
                nd2Var.r1 = this.d;
                nd2Var.H1 = false;
                nd2Var.G1 = false;
                nd2Var.p1 = 0.2f;
                nd2Var.g1(this.e);
                nd2Var.K1 = new md2(x02Var, this.f, (byte) 0);
                ag0 ag0Var = new ag0();
                ag0Var.a = true;
                ag0Var.e = true;
                this.h.showAsSheet(nd2Var, ag0Var);
                x02Var.dismiss();
            }
        } catch (Throwable th) {
            fa4.g(th, true);
        }
    }

    @Override // v02
    public final void P0(Object obj) {
        nd2 nd2Var = new nd2(obj, null, true, (byte) 1);
        nd2Var.X1 = this.b;
        nd2Var.a.a = this.c;
        nd2Var.r1 = this.d;
        nd2Var.g1(this.e);
        nd2Var.K1 = new md2(this.a, this.f, (byte) 1);
        ag0 ag0Var = new ag0();
        ag0Var.a = true;
        ag0Var.e = true;
        this.h.showAsSheet(nd2Var, ag0Var);
    }

    @Override // v02
    public final boolean V1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // v02
    public final boolean g0() {
        return false;
    }

    @Override // v02
    public final void z2(vq0 vq0Var) {
        vq0Var.run();
    }

    @Override // v02
    public final void I0() {
    }

    @Override // v02
    public final void z0() {
    }

    @Override // v02
    public final void g1(TLRPC.User user) {
    }

    @Override // v02
    public final void R0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
