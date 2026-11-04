package gi;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s9 implements e6 {
    public final /* synthetic */ va a;

    public s9(va vaVar) {
        this.a = vaVar;
    }

    public final void a() {
        va vaVar = this.a;
        ArrayList<f7> content = vaVar.B0.getContent();
        int i3 = 0;
        if (content.size() == 1) {
            vaVar.L1 = content.get(0);
        } else {
            vaVar.L1 = f7.a(vaVar.B0.getLayout(), vaVar.B0.getContent());
        }
        f7 f7Var = vaVar.L1;
        if (f7Var != null && f7Var.K) {
            i3 = 1;
        }
        vaVar.P1 = i3;
        p9 p9Var = vaVar.R0;
        if (p9Var != null) {
            p9Var.a(i3);
        }
        u8.a(vaVar.c, vaVar.L1);
        vaVar.J(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        va vaVar = this.a;
        y9 y9Var = vaVar.C0;
        if (y9Var == null || vaVar.T1 || vaVar.Q1 || !y9Var.isInited()) {
            return;
        }
        va vaVar2 = this.a;
        if (vaVar2.g0 != 0) {
            return;
        }
        l3 l3Var = vaVar2.n1;
        if (l3Var != null) {
            l3Var.f(true);
        }
        if (this.a.p0() && (arrayList = this.a.v2) != null && !arrayList.isEmpty()) {
            va vaVar3 = this.a;
            org.telegram.messenger.t0.b.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) vaVar3.v2.get(vaVar3.u2)).commit();
        }
        this.a.C0.switchCamera();
        va.Z(this.a.C0.isFrontface());
        if (this.a.p0()) {
            this.a.s.c(null);
        } else {
            this.a.s.d();
        }
    }

    public final void c() {
        boolean z10;
        boolean z11;
        va vaVar = this.a;
        if (vaVar.g0 != 0 || vaVar.Q1 || vaVar.R1) {
            return;
        }
        Activity activity = vaVar.b;
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                z11 = (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) ? false : true;
                if (z11) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, hs.z1);
                }
            } else {
                z11 = activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
                if (z11) {
                    activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, hs.z1);
                }
            }
            z10 = !z11;
        } else {
            z10 = true;
        }
        if (z10) {
            vaVar.e(true);
        }
    }

    public final void d() {
        y9 y9Var;
        va vaVar = this.a;
        if (vaVar.Q1 || vaVar.T1 || vaVar.g0 != 0 || (y9Var = vaVar.C0) == null || !y9Var.isInited()) {
            return;
        }
        vaVar.X0.f(true);
        File file = vaVar.H1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            vaVar.H1 = null;
        }
        c6 c6Var = vaVar.D0;
        if (c6Var != null) {
            c6Var.c(true);
        }
        vaVar.H1 = f7.w(vaVar.c, "jpg");
        vaVar.Q1 = true;
        vaVar.o();
        vaVar.d2 = false;
        if (vaVar.C0.isFrontface() && vaVar.u2 == 1) {
            va.a(vaVar);
        }
        if (!vaVar.p0()) {
            h(null);
            return;
        }
        n2 n2Var = vaVar.s;
        j8 j8Var = new j8(this, 1);
        n2Var.h(n2Var.p);
        n2Var.e(1.0f, 320L, new j2(n2Var, j8Var, 0));
    }

    public final void e(boolean z10) {
        va vaVar = this.a;
        if (vaVar.S1 || !vaVar.R1) {
            return;
        }
        vaVar.S1 = true;
        org.telegram.messenger.g0.i3(new q9(this, 0), z10 ? 0L : 400L);
    }

    public final void f(Runnable runnable, boolean z10) {
        y9 y9Var;
        va vaVar = this.a;
        if (vaVar.R1 || vaVar.S1 || vaVar.T1 || vaVar.g0 != 0 || (y9Var = vaVar.C0) == null || y9Var.getCameraSession() == null) {
            return;
        }
        l3 l3Var = vaVar.m1;
        if (l3Var != null) {
            l3Var.f(true);
        }
        l3 l3Var2 = vaVar.n1;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
        vaVar.X0.f(true);
        vaVar.R1 = true;
        c6 c6Var = vaVar.D0;
        if (c6Var != null) {
            c6Var.c(true);
        }
        File file = vaVar.H1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            vaVar.H1 = null;
        }
        vaVar.H1 = f7.x(vaVar.c, true);
        vaVar.o();
        vaVar.d2 = false;
        if (vaVar.C0.isFrontface() && vaVar.u2 == 1) {
            va.a(vaVar);
        }
        if (vaVar.p0()) {
            vaVar.s.c(new r9(this, z10, runnable));
        } else {
            g(runnable, z10);
        }
    }

    public final void g(Runnable runnable, boolean z10) {
        va vaVar = this.a;
        if (vaVar.C0 == null) {
            return;
        }
        CameraController.getInstance().recordVideo(vaVar.C0.getCameraSessionObject(), vaVar.H1, false, new ei.y8(this, 11), new r9(this, runnable, z10), vaVar.C0, true);
        if (vaVar.P1 != 1) {
            vaVar.P1 = 1;
            vaVar.J0.a(false, true);
            vaVar.h0(vaVar.P1 == 1, true);
            vaVar.R0.a(vaVar.P1);
            h6 h6Var = vaVar.P0;
            boolean z11 = vaVar.P1 == 1;
            h6Var.o0 = -1.0f;
            h6Var.p0 = z11;
            h6Var.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(u10 u10Var) {
        boolean z10;
        FileOutputStream fileOutputStream;
        va vaVar = this.a;
        int i3 = vaVar.c;
        if (!vaVar.p0()) {
            vaVar.C0.startTakePictureAnimation(true);
        }
        if ((vaVar.C0.isDual() && TextUtils.equals(vaVar.C0.getCameraSession().getCurrentFlashMode(), "off")) || vaVar.B0.j()) {
            if (!vaVar.B0.j()) {
                vaVar.C0.pauseAsTakingPicture();
            }
            Bitmap bitmap = vaVar.C0.getTextureView().getBitmap();
            try {
                fileOutputStream = new FileOutputStream(vaVar.H1.getAbsoluteFile());
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                } finally {
                }
            } catch (Exception e10) {
                e = e10;
                z10 = false;
            }
            try {
                fileOutputStream.close();
                z10 = true;
            } catch (Exception e11) {
                e = e11;
                z10 = true;
                org.telegram.messenger.a8.g(e, true);
                bitmap.recycle();
                if (z10) {
                }
            }
            bitmap.recycle();
        } else {
            z10 = false;
        }
        if (z10) {
            c6 c6Var = vaVar.D0;
            if (c6Var != null) {
                c6Var.c(true);
            }
            vaVar.Q1 = CameraController.getInstance().takePicture(vaVar.H1, true, vaVar.C0.getCameraSessionObject(), new ai.o1(18, this, u10Var));
            return;
        }
        vaVar.Q1 = false;
        c6 c6Var2 = vaVar.D0;
        if (c6Var2 != null) {
            c6Var2.c(false);
        }
        f7 m10 = f7.m(vaVar.H1, 0);
        m10.J0 = vaVar.w0;
        m10.K0 = vaVar.x0;
        if (!vaVar.B0.j()) {
            vaVar.L1 = m10;
            u8.a(i3, m10);
            vaVar.M1 = false;
            if (u10Var != null) {
                u10Var.a(new q9(this, 1));
                return;
            } else {
                vaVar.J(1, true);
                return;
            }
        }
        vaVar.H1 = null;
        if (vaVar.B0.l(m10)) {
            f7 a10 = f7.a(vaVar.B0.getLayout(), vaVar.B0.getContent());
            vaVar.L1 = a10;
            u8.a(i3, a10);
            vaVar.M1 = false;
            if (u10Var != null) {
                u10Var.a(null);
            }
        } else if (u10Var != null) {
            u10Var.a(null);
        }
        vaVar.l0(true);
    }
}
