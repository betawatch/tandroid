package hi;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.ks;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class q9 implements c6 {
    public final /* synthetic */ ta a;

    public q9(ta taVar) {
        this.a = taVar;
    }

    public final void a() {
        ta taVar = this.a;
        ArrayList<d7> content = taVar.B0.getContent();
        int i7 = 0;
        if (content.size() == 1) {
            taVar.L1 = content.get(0);
        } else {
            taVar.L1 = d7.a(taVar.B0.getLayout(), taVar.B0.getContent());
        }
        d7 d7Var = taVar.L1;
        if (d7Var != null && d7Var.K) {
            i7 = 1;
        }
        taVar.P1 = i7;
        n9 n9Var = taVar.R0;
        if (n9Var != null) {
            n9Var.a(i7);
        }
        r8.a(taVar.c, taVar.L1);
        taVar.J(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        ta taVar = this.a;
        w9 w9Var = taVar.C0;
        if (w9Var == null || taVar.T1 || taVar.Q1 || !w9Var.isInited()) {
            return;
        }
        ta taVar2 = this.a;
        if (taVar2.g0 != 0) {
            return;
        }
        m3 m3Var = taVar2.n1;
        if (m3Var != null) {
            m3Var.f(true);
        }
        if (this.a.p0() && (arrayList = this.a.v2) != null && !arrayList.isEmpty()) {
            ta taVar3 = this.a;
            org.telegram.messenger.t0.b.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) taVar3.v2.get(taVar3.u2)).commit();
        }
        this.a.C0.switchCamera();
        ta.Z(this.a.C0.isFrontface());
        if (this.a.p0()) {
            this.a.s.c(null);
        } else {
            this.a.s.d();
        }
    }

    public final void c() {
        boolean z10;
        boolean z11;
        ta taVar = this.a;
        if (taVar.g0 != 0 || taVar.Q1 || taVar.R1) {
            return;
        }
        Activity activity = taVar.b;
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                z11 = (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) ? false : true;
                if (z11) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, ks.z1);
                }
            } else {
                z11 = activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
                if (z11) {
                    activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, ks.z1);
                }
            }
            z10 = !z11;
        } else {
            z10 = true;
        }
        if (z10) {
            taVar.e(true);
        }
    }

    public final void d() {
        w9 w9Var;
        ta taVar = this.a;
        if (taVar.Q1 || taVar.T1 || taVar.g0 != 0 || (w9Var = taVar.C0) == null || !w9Var.isInited()) {
            return;
        }
        taVar.X0.f(true);
        File file = taVar.H1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            taVar.H1 = null;
        }
        a6 a6Var = taVar.D0;
        if (a6Var != null) {
            a6Var.c(true);
        }
        taVar.H1 = d7.w(taVar.c, "jpg");
        taVar.Q1 = true;
        taVar.o();
        taVar.d2 = false;
        if (taVar.C0.isFrontface() && taVar.u2 == 1) {
            ta.a(taVar);
        }
        if (!taVar.p0()) {
            h(null);
            return;
        }
        o2 o2Var = taVar.s;
        t6 t6Var = new t6(this, 3);
        o2Var.h(o2Var.p);
        o2Var.e(1.0f, 320L, new k2(o2Var, t6Var, 0));
    }

    public final void e(boolean z10) {
        ta taVar = this.a;
        if (taVar.S1 || !taVar.R1) {
            return;
        }
        taVar.S1 = true;
        org.telegram.messenger.g0.h3(new o9(this, 0), z10 ? 0L : 400L);
    }

    public final void f(Runnable runnable, boolean z10) {
        w9 w9Var;
        ta taVar = this.a;
        if (taVar.R1 || taVar.S1 || taVar.T1 || taVar.g0 != 0 || (w9Var = taVar.C0) == null || w9Var.getCameraSession() == null) {
            return;
        }
        m3 m3Var = taVar.m1;
        if (m3Var != null) {
            m3Var.f(true);
        }
        m3 m3Var2 = taVar.n1;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
        taVar.X0.f(true);
        taVar.R1 = true;
        a6 a6Var = taVar.D0;
        if (a6Var != null) {
            a6Var.c(true);
        }
        File file = taVar.H1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            taVar.H1 = null;
        }
        taVar.H1 = d7.x(taVar.c, true);
        taVar.o();
        taVar.d2 = false;
        if (taVar.C0.isFrontface() && taVar.u2 == 1) {
            ta.a(taVar);
        }
        if (taVar.p0()) {
            taVar.s.c(new p9(this, z10, runnable));
        } else {
            g(runnable, z10);
        }
    }

    public final void g(Runnable runnable, boolean z10) {
        ta taVar = this.a;
        if (taVar.C0 == null) {
            return;
        }
        CameraController.getInstance().recordVideo(taVar.C0.getCameraSessionObject(), taVar.H1, false, new di.c7(this, 22), new p9(this, runnable, z10), taVar.C0, true);
        if (taVar.P1 != 1) {
            taVar.P1 = 1;
            taVar.J0.a(false, true);
            taVar.h0(taVar.P1 == 1, true);
            taVar.R0.a(taVar.P1);
            e6 e6Var = taVar.P0;
            boolean z11 = taVar.P1 == 1;
            e6Var.o0 = -1.0f;
            e6Var.p0 = z11;
            e6Var.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(x10 x10Var) {
        boolean z10;
        FileOutputStream fileOutputStream;
        ta taVar = this.a;
        int i7 = taVar.c;
        if (!taVar.p0()) {
            taVar.C0.startTakePictureAnimation(true);
        }
        if ((taVar.C0.isDual() && TextUtils.equals(taVar.C0.getCameraSession().getCurrentFlashMode(), "off")) || taVar.B0.j()) {
            if (!taVar.B0.j()) {
                taVar.C0.pauseAsTakingPicture();
            }
            Bitmap bitmap = taVar.C0.getTextureView().getBitmap();
            try {
                fileOutputStream = new FileOutputStream(taVar.H1.getAbsoluteFile());
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
            a6 a6Var = taVar.D0;
            if (a6Var != null) {
                a6Var.c(true);
            }
            taVar.Q1 = CameraController.getInstance().takePicture(taVar.H1, true, taVar.C0.getCameraSessionObject(), new ai.v1(21, this, x10Var));
            return;
        }
        taVar.Q1 = false;
        a6 a6Var2 = taVar.D0;
        if (a6Var2 != null) {
            a6Var2.c(false);
        }
        d7 m10 = d7.m(taVar.H1, 0);
        m10.J0 = taVar.w0;
        m10.K0 = taVar.x0;
        if (!taVar.B0.j()) {
            taVar.L1 = m10;
            r8.a(i7, m10);
            taVar.M1 = false;
            if (x10Var != null) {
                x10Var.a(new o9(this, 1));
                return;
            } else {
                taVar.J(1, true);
                return;
            }
        }
        taVar.H1 = null;
        if (taVar.B0.l(m10)) {
            d7 a10 = d7.a(taVar.B0.getLayout(), taVar.B0.getContent());
            taVar.L1 = a10;
            r8.a(i7, a10);
            taVar.M1 = false;
            if (x10Var != null) {
                x10Var.a(null);
            }
        } else if (x10Var != null) {
            x10Var.a(null);
        }
        taVar.l0(true);
    }
}
