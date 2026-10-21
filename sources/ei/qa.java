package ei;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class qa implements x6 {
    public final /* synthetic */ vb a;

    public qa(vb vbVar) {
        this.a = vbVar;
    }

    public final void a() {
        vb vbVar = this.a;
        ArrayList<a8> content = vbVar.A0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            vbVar.K1 = content.get(0);
        } else {
            vbVar.K1 = a8.a(vbVar.A0.getLayout(), vbVar.A0.getContent());
        }
        a8 a8Var = vbVar.K1;
        if (a8Var != null && a8Var.K) {
            i10 = 1;
        }
        vbVar.O1 = i10;
        na naVar = vbVar.Q0;
        if (naVar != null) {
            naVar.a(i10);
        }
        s9.a(vbVar.c, vbVar.K1);
        vbVar.J(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        vb vbVar = this.a;
        ya yaVar = vbVar.B0;
        if (yaVar == null || vbVar.S1 || vbVar.P1 || !yaVar.isInited()) {
            return;
        }
        vb vbVar2 = this.a;
        if (vbVar2.f0 != 0) {
            return;
        }
        x3 x3Var = vbVar2.m1;
        if (x3Var != null) {
            x3Var.e(true);
        }
        if (this.a.p0() && (arrayList = this.a.u2) != null && !arrayList.isEmpty()) {
            vb vbVar3 = this.a;
            ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) vbVar3.u2.get(vbVar3.t2)).commit();
        }
        this.a.B0.switchCamera();
        vb.Z(this.a.B0.isFrontface());
        if (this.a.p0()) {
            this.a.s.c(null);
        } else {
            this.a.s.d();
        }
    }

    public final void c() {
        boolean z10;
        boolean z11;
        vb vbVar = this.a;
        if (vbVar.f0 != 0 || vbVar.P1 || vbVar.Q1) {
            return;
        }
        Activity activity = vbVar.b;
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                z11 = (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) ? false : true;
                if (z11) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 114);
                }
            } else {
                z11 = activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
                if (z11) {
                    activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 114);
                }
            }
            z10 = !z11;
        } else {
            z10 = true;
        }
        if (z10) {
            vbVar.e(true);
        }
    }

    public final void d() {
        ya yaVar;
        vb vbVar = this.a;
        if (vbVar.P1 || vbVar.S1 || vbVar.f0 != 0 || (yaVar = vbVar.B0) == null || !yaVar.isInited()) {
            return;
        }
        vbVar.W0.e(true);
        File file = vbVar.G1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            vbVar.G1 = null;
        }
        v6 v6Var = vbVar.C0;
        if (v6Var != null) {
            v6Var.c(true);
        }
        vbVar.G1 = a8.w(vbVar.c, "jpg");
        vbVar.P1 = true;
        vbVar.o();
        vbVar.c2 = false;
        if (vbVar.B0.isFrontface() && vbVar.t2 == 1) {
            vb.a(vbVar);
        }
        if (!vbVar.p0()) {
            h(null);
            return;
        }
        s2 s2Var = vbVar.s;
        ai.r0 r0Var = new ai.r0(this, 23);
        s2Var.h(s2Var.p);
        s2Var.e(1.0f, 320L, new o2(s2Var, r0Var, 0));
    }

    public final void e(boolean z10) {
        vb vbVar = this.a;
        if (vbVar.R1 || !vbVar.Q1) {
            return;
        }
        vbVar.R1 = true;
        AndroidUtilities.runOnUIThread(new oa(this, 0), z10 ? 0L : 400L);
    }

    public final void f(Runnable runnable, boolean z10) {
        ya yaVar;
        vb vbVar = this.a;
        if (vbVar.Q1 || vbVar.R1 || vbVar.S1 || vbVar.f0 != 0 || (yaVar = vbVar.B0) == null || yaVar.getCameraSession() == null) {
            return;
        }
        x3 x3Var = vbVar.l1;
        if (x3Var != null) {
            x3Var.e(true);
        }
        x3 x3Var2 = vbVar.m1;
        if (x3Var2 != null) {
            x3Var2.e(true);
        }
        vbVar.W0.e(true);
        vbVar.Q1 = true;
        v6 v6Var = vbVar.C0;
        if (v6Var != null) {
            v6Var.c(true);
        }
        File file = vbVar.G1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            vbVar.G1 = null;
        }
        vbVar.G1 = a8.x(vbVar.c, true);
        vbVar.o();
        vbVar.c2 = false;
        if (vbVar.B0.isFrontface() && vbVar.t2 == 1) {
            vb.a(vbVar);
        }
        if (vbVar.p0()) {
            vbVar.s.c(new pa(this, z10, runnable));
        } else {
            g(runnable, z10);
        }
    }

    public final void g(Runnable runnable, boolean z10) {
        vb vbVar = this.a;
        if (vbVar.B0 == null) {
            return;
        }
        CameraController.getInstance().recordVideo(vbVar.B0.getCameraSessionObject(), vbVar.G1, false, new e1.c(this, 8), new pa(this, runnable, z10), vbVar.B0, true);
        if (vbVar.O1 != 1) {
            vbVar.O1 = 1;
            vbVar.I0.a(false, true);
            vbVar.h0(vbVar.O1 == 1, true);
            vbVar.Q0.a(vbVar.O1);
            z6 z6Var = vbVar.O0;
            boolean z11 = vbVar.O1 == 1;
            z6Var.n0 = -1.0f;
            z6Var.o0 = z11;
            z6Var.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Utilities.Callback callback) {
        boolean z10;
        FileOutputStream fileOutputStream;
        vb vbVar = this.a;
        int i10 = vbVar.c;
        if (!vbVar.p0()) {
            vbVar.B0.startTakePictureAnimation(true);
        }
        if ((vbVar.B0.isDual() && TextUtils.equals(vbVar.B0.getCameraSession().getCurrentFlashMode(), "off")) || vbVar.A0.j()) {
            if (!vbVar.A0.j()) {
                vbVar.B0.pauseAsTakingPicture();
            }
            Bitmap bitmap = vbVar.B0.getTextureView().getBitmap();
            try {
                fileOutputStream = new FileOutputStream(vbVar.G1.getAbsoluteFile());
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                } finally {
                }
            } catch (Exception e) {
                e = e;
                z10 = false;
            }
            try {
                fileOutputStream.close();
                z10 = true;
            } catch (Exception e7) {
                e = e7;
                z10 = true;
                FileLog.e(e);
                bitmap.recycle();
                if (z10) {
                }
            }
            bitmap.recycle();
        } else {
            z10 = false;
        }
        if (z10) {
            v6 v6Var = vbVar.C0;
            if (v6Var != null) {
                v6Var.c(true);
            }
            vbVar.P1 = CameraController.getInstance().takePicture(vbVar.G1, true, vbVar.B0.getCameraSessionObject(), new ai.o2(13, this, callback));
            return;
        }
        vbVar.P1 = false;
        v6 v6Var2 = vbVar.C0;
        if (v6Var2 != null) {
            v6Var2.c(false);
        }
        a8 m10 = a8.m(0, vbVar.G1);
        m10.J0 = vbVar.v0;
        m10.K0 = vbVar.w0;
        if (!vbVar.A0.j()) {
            vbVar.K1 = m10;
            s9.a(i10, m10);
            vbVar.L1 = false;
            if (callback != null) {
                callback.run(new oa(this, 1));
                return;
            } else {
                vbVar.J(1, true);
                return;
            }
        }
        vbVar.G1 = null;
        if (vbVar.A0.l(m10)) {
            a8 a2 = a8.a(vbVar.A0.getLayout(), vbVar.A0.getContent());
            vbVar.K1 = a2;
            s9.a(i10, a2);
            vbVar.L1 = false;
            if (callback != null) {
                callback.run(null);
            }
        } else if (callback != null) {
            callback.run(null);
        }
        vbVar.l0(true);
    }
}
