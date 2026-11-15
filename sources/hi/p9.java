package hi;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.ns;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class p9 implements d6 {
    public final /* synthetic */ sa a;

    public p9(sa saVar) {
        this.a = saVar;
    }

    public final void a() {
        sa saVar = this.a;
        ArrayList<d7> content = saVar.B0.getContent();
        int i7 = 0;
        if (content.size() == 1) {
            saVar.L1 = content.get(0);
        } else {
            saVar.L1 = d7.a(saVar.B0.getLayout(), saVar.B0.getContent());
        }
        d7 d7Var = saVar.L1;
        if (d7Var != null && d7Var.K) {
            i7 = 1;
        }
        saVar.P1 = i7;
        m9 m9Var = saVar.R0;
        if (m9Var != null) {
            m9Var.a(i7);
        }
        r8.a(saVar.c, saVar.L1);
        saVar.J(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        sa saVar = this.a;
        v9 v9Var = saVar.C0;
        if (v9Var == null || saVar.T1 || saVar.Q1 || !v9Var.isInited()) {
            return;
        }
        sa saVar2 = this.a;
        if (saVar2.g0 != 0) {
            return;
        }
        l3 l3Var = saVar2.n1;
        if (l3Var != null) {
            l3Var.f(true);
        }
        if (this.a.p0() && (arrayList = this.a.v2) != null && !arrayList.isEmpty()) {
            sa saVar3 = this.a;
            org.telegram.messenger.t0.b.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) saVar3.v2.get(saVar3.u2)).commit();
        }
        this.a.C0.switchCamera();
        sa.Z(this.a.C0.isFrontface());
        if (this.a.p0()) {
            this.a.s.c(null);
        } else {
            this.a.s.d();
        }
    }

    public final void c() {
        boolean z10;
        boolean z11;
        sa saVar = this.a;
        if (saVar.g0 != 0 || saVar.Q1 || saVar.R1) {
            return;
        }
        Activity activity = saVar.b;
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                z11 = (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) ? false : true;
                if (z11) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, ns.z1);
                }
            } else {
                z11 = activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
                if (z11) {
                    activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, ns.z1);
                }
            }
            z10 = !z11;
        } else {
            z10 = true;
        }
        if (z10) {
            saVar.e(true);
        }
    }

    public final void d() {
        v9 v9Var;
        sa saVar = this.a;
        if (saVar.Q1 || saVar.T1 || saVar.g0 != 0 || (v9Var = saVar.C0) == null || !v9Var.isInited()) {
            return;
        }
        saVar.X0.f(true);
        File file = saVar.H1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            saVar.H1 = null;
        }
        b6 b6Var = saVar.D0;
        if (b6Var != null) {
            b6Var.c(true);
        }
        saVar.H1 = d7.w(saVar.c, "jpg");
        saVar.Q1 = true;
        saVar.o();
        saVar.d2 = false;
        if (saVar.C0.isFrontface() && saVar.u2 == 1) {
            sa.a(saVar);
        }
        if (!saVar.p0()) {
            h(null);
            return;
        }
        n2 n2Var = saVar.s;
        g7 g7Var = new g7(this, 2);
        n2Var.h(n2Var.p);
        n2Var.e(1.0f, 320L, new j2(n2Var, g7Var, 0));
    }

    public final void e(boolean z10) {
        sa saVar = this.a;
        if (saVar.S1 || !saVar.R1) {
            return;
        }
        saVar.S1 = true;
        org.telegram.messenger.g0.i3(new n9(this, 0), z10 ? 0L : 400L);
    }

    public final void f(Runnable runnable, boolean z10) {
        v9 v9Var;
        sa saVar = this.a;
        if (saVar.R1 || saVar.S1 || saVar.T1 || saVar.g0 != 0 || (v9Var = saVar.C0) == null || v9Var.getCameraSession() == null) {
            return;
        }
        l3 l3Var = saVar.m1;
        if (l3Var != null) {
            l3Var.f(true);
        }
        l3 l3Var2 = saVar.n1;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
        saVar.X0.f(true);
        saVar.R1 = true;
        b6 b6Var = saVar.D0;
        if (b6Var != null) {
            b6Var.c(true);
        }
        File file = saVar.H1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            saVar.H1 = null;
        }
        saVar.H1 = d7.x(saVar.c, true);
        saVar.o();
        saVar.d2 = false;
        if (saVar.C0.isFrontface() && saVar.u2 == 1) {
            sa.a(saVar);
        }
        if (saVar.p0()) {
            saVar.s.c(new o9(this, z10, runnable));
        } else {
            g(runnable, z10);
        }
    }

    public final void g(Runnable runnable, boolean z10) {
        sa saVar = this.a;
        if (saVar.C0 == null) {
            return;
        }
        CameraController.getInstance().recordVideo(saVar.C0.getCameraSessionObject(), saVar.H1, false, new di.z6(this, 22), new o9(this, runnable, z10), saVar.C0, true);
        if (saVar.P1 != 1) {
            saVar.P1 = 1;
            saVar.J0.a(false, true);
            saVar.h0(saVar.P1 == 1, true);
            saVar.R0.a(saVar.P1);
            f6 f6Var = saVar.P0;
            boolean z11 = saVar.P1 == 1;
            f6Var.o0 = -1.0f;
            f6Var.p0 = z11;
            f6Var.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(z10 z10Var) {
        boolean z10;
        FileOutputStream fileOutputStream;
        sa saVar = this.a;
        int i7 = saVar.c;
        if (!saVar.p0()) {
            saVar.C0.startTakePictureAnimation(true);
        }
        if ((saVar.C0.isDual() && TextUtils.equals(saVar.C0.getCameraSession().getCurrentFlashMode(), "off")) || saVar.B0.j()) {
            if (!saVar.B0.j()) {
                saVar.C0.pauseAsTakingPicture();
            }
            Bitmap bitmap = saVar.C0.getTextureView().getBitmap();
            try {
                fileOutputStream = new FileOutputStream(saVar.H1.getAbsoluteFile());
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
            b6 b6Var = saVar.D0;
            if (b6Var != null) {
                b6Var.c(true);
            }
            saVar.Q1 = CameraController.getInstance().takePicture(saVar.H1, true, saVar.C0.getCameraSessionObject(), new ai.v1(19, this, z10Var));
            return;
        }
        saVar.Q1 = false;
        b6 b6Var2 = saVar.D0;
        if (b6Var2 != null) {
            b6Var2.c(false);
        }
        d7 m10 = d7.m(saVar.H1, 0);
        m10.J0 = saVar.w0;
        m10.K0 = saVar.x0;
        if (!saVar.B0.j()) {
            saVar.L1 = m10;
            r8.a(i7, m10);
            saVar.M1 = false;
            if (z10Var != null) {
                z10Var.a(new n9(this, 1));
                return;
            } else {
                saVar.J(1, true);
                return;
            }
        }
        saVar.H1 = null;
        if (saVar.B0.l(m10)) {
            d7 a10 = d7.a(saVar.B0.getLayout(), saVar.B0.getContent());
            saVar.L1 = a10;
            r8.a(i7, a10);
            saVar.M1 = false;
            if (z10Var != null) {
                z10Var.a(null);
            }
        } else if (z10Var != null) {
            z10Var.a(null);
        }
        saVar.l0(true);
    }
}
