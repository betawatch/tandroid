package fi;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class s9 implements e6 {
    public final /* synthetic */ va a;

    public s9(va vaVar) {
        this.a = vaVar;
    }

    public final void a() {
        va vaVar = this.a;
        ArrayList<e7> content = vaVar.A0.getContent();
        int i7 = 0;
        if (content.size() == 1) {
            vaVar.K1 = content.get(0);
        } else {
            vaVar.K1 = e7.a(vaVar.A0.getLayout(), vaVar.A0.getContent());
        }
        e7 e7Var = vaVar.K1;
        if (e7Var != null && e7Var.K) {
            i7 = 1;
        }
        vaVar.O1 = i7;
        p9 p9Var = vaVar.Q0;
        if (p9Var != null) {
            p9Var.a(i7);
        }
        t8.a(vaVar.c, vaVar.K1);
        vaVar.J(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        va vaVar = this.a;
        y9 y9Var = vaVar.B0;
        if (y9Var == null || vaVar.S1 || vaVar.P1 || !y9Var.isInited()) {
            return;
        }
        va vaVar2 = this.a;
        if (vaVar2.f0 != 0) {
            return;
        }
        m3 m3Var = vaVar2.m1;
        if (m3Var != null) {
            m3Var.f(true);
        }
        if (this.a.p0() && (arrayList = this.a.u2) != null && !arrayList.isEmpty()) {
            va vaVar3 = this.a;
            org.telegram.messenger.t0.b.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) vaVar3.u2.get(vaVar3.t2)).commit();
        }
        this.a.B0.switchCamera();
        va.Z(this.a.B0.isFrontface());
        if (this.a.p0()) {
            this.a.s.c(null);
        } else {
            this.a.s.d();
        }
    }

    public final void c() {
        boolean z9;
        boolean z10;
        va vaVar = this.a;
        if (vaVar.f0 != 0 || vaVar.P1 || vaVar.Q1) {
            return;
        }
        Activity activity = vaVar.b;
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                z10 = (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) ? false : true;
                if (z10) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, qs.z1);
                }
            } else {
                z10 = activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
                if (z10) {
                    activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, qs.z1);
                }
            }
            z9 = !z10;
        } else {
            z9 = true;
        }
        if (z9) {
            vaVar.e(true);
        }
    }

    public final void d() {
        y9 y9Var;
        va vaVar = this.a;
        if (vaVar.P1 || vaVar.S1 || vaVar.f0 != 0 || (y9Var = vaVar.B0) == null || !y9Var.isInited()) {
            return;
        }
        vaVar.W0.f(true);
        File file = vaVar.G1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            vaVar.G1 = null;
        }
        c6 c6Var = vaVar.C0;
        if (c6Var != null) {
            c6Var.c(true);
        }
        vaVar.G1 = e7.w(vaVar.c, "jpg");
        vaVar.P1 = true;
        vaVar.o();
        vaVar.c2 = false;
        if (vaVar.B0.isFrontface() && vaVar.t2 == 1) {
            va.a(vaVar);
        }
        if (!vaVar.p0()) {
            h(null);
            return;
        }
        p2 p2Var = vaVar.s;
        ai.i iVar = new ai.i(this, 28);
        p2Var.h(p2Var.p);
        p2Var.e(1.0f, 320L, new l2(p2Var, iVar, 0));
    }

    public final void e(boolean z9) {
        va vaVar = this.a;
        if (vaVar.R1 || !vaVar.Q1) {
            return;
        }
        vaVar.R1 = true;
        org.telegram.messenger.g0.i3(new q9(this, 0), z9 ? 0L : 400L);
    }

    public final void f(Runnable runnable, boolean z9) {
        y9 y9Var;
        va vaVar = this.a;
        if (vaVar.Q1 || vaVar.R1 || vaVar.S1 || vaVar.f0 != 0 || (y9Var = vaVar.B0) == null || y9Var.getCameraSession() == null) {
            return;
        }
        m3 m3Var = vaVar.l1;
        if (m3Var != null) {
            m3Var.f(true);
        }
        m3 m3Var2 = vaVar.m1;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
        vaVar.W0.f(true);
        vaVar.Q1 = true;
        c6 c6Var = vaVar.C0;
        if (c6Var != null) {
            c6Var.c(true);
        }
        File file = vaVar.G1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            vaVar.G1 = null;
        }
        vaVar.G1 = e7.x(vaVar.c, true);
        vaVar.o();
        vaVar.c2 = false;
        if (vaVar.B0.isFrontface() && vaVar.t2 == 1) {
            va.a(vaVar);
        }
        if (vaVar.p0()) {
            vaVar.s.c(new r9(this, z9, runnable));
        } else {
            g(runnable, z9);
        }
    }

    public final void g(Runnable runnable, boolean z9) {
        va vaVar = this.a;
        if (vaVar.B0 == null) {
            return;
        }
        CameraController.getInstance().recordVideo(vaVar.B0.getCameraSessionObject(), vaVar.G1, false, new di.q4(this, 15), new r9(this, runnable, z9), vaVar.B0, true);
        if (vaVar.O1 != 1) {
            vaVar.O1 = 1;
            vaVar.I0.a(false, true);
            vaVar.h0(vaVar.O1 == 1, true);
            vaVar.Q0.a(vaVar.O1);
            g6 g6Var = vaVar.O0;
            boolean z10 = vaVar.O1 == 1;
            g6Var.n0 = -1.0f;
            g6Var.o0 = z10;
            g6Var.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(c20 c20Var) {
        boolean z9;
        FileOutputStream fileOutputStream;
        va vaVar = this.a;
        int i7 = vaVar.c;
        if (!vaVar.p0()) {
            vaVar.B0.startTakePictureAnimation(true);
        }
        if ((vaVar.B0.isDual() && TextUtils.equals(vaVar.B0.getCameraSession().getCurrentFlashMode(), "off")) || vaVar.A0.j()) {
            if (!vaVar.A0.j()) {
                vaVar.B0.pauseAsTakingPicture();
            }
            Bitmap bitmap = vaVar.B0.getTextureView().getBitmap();
            try {
                fileOutputStream = new FileOutputStream(vaVar.G1.getAbsoluteFile());
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                } finally {
                }
            } catch (Exception e10) {
                e = e10;
                z9 = false;
            }
            try {
                fileOutputStream.close();
                z9 = true;
            } catch (Exception e11) {
                e = e11;
                z9 = true;
                org.telegram.messenger.a8.g(e, true);
                bitmap.recycle();
                if (z9) {
                }
            }
            bitmap.recycle();
        } else {
            z9 = false;
        }
        if (z9) {
            c6 c6Var = vaVar.C0;
            if (c6Var != null) {
                c6Var.c(true);
            }
            vaVar.P1 = CameraController.getInstance().takePicture(vaVar.G1, true, vaVar.B0.getCameraSessionObject(), new ai.f1(14, this, c20Var));
            return;
        }
        vaVar.P1 = false;
        c6 c6Var2 = vaVar.C0;
        if (c6Var2 != null) {
            c6Var2.c(false);
        }
        e7 m10 = e7.m(vaVar.G1, 0);
        m10.J0 = vaVar.v0;
        m10.K0 = vaVar.w0;
        if (!vaVar.A0.j()) {
            vaVar.K1 = m10;
            t8.a(i7, m10);
            vaVar.L1 = false;
            if (c20Var != null) {
                c20Var.a(new q9(this, 1));
                return;
            } else {
                vaVar.J(1, true);
                return;
            }
        }
        vaVar.G1 = null;
        if (vaVar.A0.l(m10)) {
            e7 a10 = e7.a(vaVar.A0.getLayout(), vaVar.A0.getContent());
            vaVar.K1 = a10;
            t8.a(i7, a10);
            vaVar.L1 = false;
            if (c20Var != null) {
                c20Var.a(null);
            }
        } else if (c20Var != null) {
            c20Var.a(null);
        }
        vaVar.l0(true);
    }
}
