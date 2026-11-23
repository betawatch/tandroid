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
import org.telegram.messenger.w10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class ka implements l6 {
    public final /* synthetic */ nb a;

    public ka(nb nbVar) {
        this.a = nbVar;
    }

    public final void a() {
        nb nbVar = this.a;
        ArrayList<x7> content = nbVar.B0.getContent();
        int i7 = 0;
        if (content.size() == 1) {
            nbVar.L1 = content.get(0);
        } else {
            nbVar.L1 = x7.a(nbVar.B0.getLayout(), nbVar.B0.getContent());
        }
        x7 x7Var = nbVar.L1;
        if (x7Var != null && x7Var.K) {
            i7 = 1;
        }
        nbVar.P1 = i7;
        ha haVar = nbVar.R0;
        if (haVar != null) {
            haVar.a(i7);
        }
        l9.a(nbVar.c, nbVar.L1);
        nbVar.J(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        nb nbVar = this.a;
        qa qaVar = nbVar.C0;
        if (qaVar == null || nbVar.T1 || nbVar.Q1 || !qaVar.isInited()) {
            return;
        }
        nb nbVar2 = this.a;
        if (nbVar2.g0 != 0) {
            return;
        }
        u3 u3Var = nbVar2.n1;
        if (u3Var != null) {
            u3Var.f(true);
        }
        if (this.a.p0() && (arrayList = this.a.v2) != null && !arrayList.isEmpty()) {
            nb nbVar3 = this.a;
            org.telegram.messenger.t0.b.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) nbVar3.v2.get(nbVar3.u2)).commit();
        }
        this.a.C0.switchCamera();
        nb.Z(this.a.C0.isFrontface());
        if (this.a.p0()) {
            this.a.s.c(null);
        } else {
            this.a.s.d();
        }
    }

    public final void c() {
        boolean z10;
        boolean z11;
        nb nbVar = this.a;
        if (nbVar.g0 != 0 || nbVar.Q1 || nbVar.R1) {
            return;
        }
        Activity activity = nbVar.b;
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
            nbVar.e(true);
        }
    }

    public final void d() {
        qa qaVar;
        nb nbVar = this.a;
        if (nbVar.Q1 || nbVar.T1 || nbVar.g0 != 0 || (qaVar = nbVar.C0) == null || !qaVar.isInited()) {
            return;
        }
        nbVar.X0.f(true);
        File file = nbVar.H1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            nbVar.H1 = null;
        }
        j6 j6Var = nbVar.D0;
        if (j6Var != null) {
            j6Var.c(true);
        }
        nbVar.H1 = x7.w(nbVar.c, "jpg");
        nbVar.Q1 = true;
        nbVar.o();
        nbVar.d2 = false;
        if (nbVar.C0.isFrontface() && nbVar.u2 == 1) {
            nb.a(nbVar);
        }
        if (!nbVar.p0()) {
            h(null);
            return;
        }
        w2 w2Var = nbVar.s;
        c7 c7Var = new c7(this, 3);
        w2Var.h(w2Var.p);
        w2Var.e(1.0f, 320L, new s2(w2Var, c7Var, 0));
    }

    public final void e(boolean z10) {
        nb nbVar = this.a;
        if (nbVar.S1 || !nbVar.R1) {
            return;
        }
        nbVar.S1 = true;
        org.telegram.messenger.g0.h3(new ia(this, 0), z10 ? 0L : 400L);
    }

    public final void f(Runnable runnable, boolean z10) {
        qa qaVar;
        nb nbVar = this.a;
        if (nbVar.R1 || nbVar.S1 || nbVar.T1 || nbVar.g0 != 0 || (qaVar = nbVar.C0) == null || qaVar.getCameraSession() == null) {
            return;
        }
        u3 u3Var = nbVar.m1;
        if (u3Var != null) {
            u3Var.f(true);
        }
        u3 u3Var2 = nbVar.n1;
        if (u3Var2 != null) {
            u3Var2.f(true);
        }
        nbVar.X0.f(true);
        nbVar.R1 = true;
        j6 j6Var = nbVar.D0;
        if (j6Var != null) {
            j6Var.c(true);
        }
        File file = nbVar.H1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            nbVar.H1 = null;
        }
        nbVar.H1 = x7.x(nbVar.c, true);
        nbVar.o();
        nbVar.d2 = false;
        if (nbVar.C0.isFrontface() && nbVar.u2 == 1) {
            nb.a(nbVar);
        }
        if (nbVar.p0()) {
            nbVar.s.c(new ja(this, z10, runnable));
        } else {
            g(runnable, z10);
        }
    }

    public final void g(Runnable runnable, boolean z10) {
        nb nbVar = this.a;
        if (nbVar.C0 == null) {
            return;
        }
        CameraController.getInstance().recordVideo(nbVar.C0.getCameraSessionObject(), nbVar.H1, false, new di.v6(this, 25), new ja(this, runnable, z10), nbVar.C0, true);
        if (nbVar.P1 != 1) {
            nbVar.P1 = 1;
            nbVar.J0.a(false, true);
            nbVar.h0(nbVar.P1 == 1, true);
            nbVar.R0.a(nbVar.P1);
            n6 n6Var = nbVar.P0;
            boolean z11 = nbVar.P1 == 1;
            n6Var.o0 = -1.0f;
            n6Var.p0 = z11;
            n6Var.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(w10 w10Var) {
        boolean z10;
        FileOutputStream fileOutputStream;
        nb nbVar = this.a;
        int i7 = nbVar.c;
        if (!nbVar.p0()) {
            nbVar.C0.startTakePictureAnimation(true);
        }
        if ((nbVar.C0.isDual() && TextUtils.equals(nbVar.C0.getCameraSession().getCurrentFlashMode(), "off")) || nbVar.B0.j()) {
            if (!nbVar.B0.j()) {
                nbVar.C0.pauseAsTakingPicture();
            }
            Bitmap bitmap = nbVar.C0.getTextureView().getBitmap();
            try {
                fileOutputStream = new FileOutputStream(nbVar.H1.getAbsoluteFile());
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
            j6 j6Var = nbVar.D0;
            if (j6Var != null) {
                j6Var.c(true);
            }
            nbVar.Q1 = CameraController.getInstance().takePicture(nbVar.H1, true, nbVar.C0.getCameraSessionObject(), new ai.s1(22, this, w10Var));
            return;
        }
        nbVar.Q1 = false;
        j6 j6Var2 = nbVar.D0;
        if (j6Var2 != null) {
            j6Var2.c(false);
        }
        x7 m10 = x7.m(nbVar.H1, 0);
        m10.J0 = nbVar.w0;
        m10.K0 = nbVar.x0;
        if (!nbVar.B0.j()) {
            nbVar.L1 = m10;
            l9.a(i7, m10);
            nbVar.M1 = false;
            if (w10Var != null) {
                w10Var.a(new ia(this, 1));
                return;
            } else {
                nbVar.J(1, true);
                return;
            }
        }
        nbVar.H1 = null;
        if (nbVar.B0.l(m10)) {
            x7 a10 = x7.a(nbVar.B0.getLayout(), nbVar.B0.getContent());
            nbVar.L1 = a10;
            l9.a(i7, a10);
            nbVar.M1 = false;
            if (w10Var != null) {
                w10Var.a(null);
            }
        } else if (w10Var != null) {
            w10Var.a(null);
        }
        nbVar.l0(true);
    }
}
