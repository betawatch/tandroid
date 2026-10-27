package fi;

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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class ma implements u6 {
    public final /* synthetic */ sb a;

    public ma(sb sbVar) {
        this.a = sbVar;
    }

    public final void a() {
        sb sbVar = this.a;
        ArrayList<w7> content = sbVar.A0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            sbVar.K1 = content.get(0);
        } else {
            sbVar.K1 = w7.a(sbVar.A0.getLayout(), sbVar.A0.getContent());
        }
        w7 w7Var = sbVar.K1;
        if (w7Var != null && w7Var.K) {
            i10 = 1;
        }
        sbVar.O1 = i10;
        ja jaVar = sbVar.Q0;
        if (jaVar != null) {
            jaVar.a(i10);
        }
        o9.a(sbVar.c, sbVar.K1);
        sbVar.J(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        sb sbVar = this.a;
        va vaVar = sbVar.B0;
        if (vaVar == null || sbVar.S1 || sbVar.P1 || !vaVar.isInited()) {
            return;
        }
        sb sbVar2 = this.a;
        if (sbVar2.f0 != 0) {
            return;
        }
        v3 v3Var = sbVar2.m1;
        if (v3Var != null) {
            v3Var.e(true);
        }
        if (this.a.p0() && (arrayList = this.a.u2) != null && !arrayList.isEmpty()) {
            sb sbVar3 = this.a;
            ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) sbVar3.u2.get(sbVar3.t2)).commit();
        }
        this.a.B0.switchCamera();
        sb.Z(this.a.B0.isFrontface());
        if (this.a.p0()) {
            this.a.s.c(null);
        } else {
            this.a.s.d();
        }
    }

    public final void c() {
        boolean z10;
        boolean z11;
        sb sbVar = this.a;
        if (sbVar.f0 != 0 || sbVar.P1 || sbVar.Q1) {
            return;
        }
        Activity activity = sbVar.b;
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
            sbVar.e(true);
        }
    }

    public final void d() {
        va vaVar;
        sb sbVar = this.a;
        if (sbVar.P1 || sbVar.S1 || sbVar.f0 != 0 || (vaVar = sbVar.B0) == null || !vaVar.isInited()) {
            return;
        }
        sbVar.W0.e(true);
        File file = sbVar.G1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            sbVar.G1 = null;
        }
        s6 s6Var = sbVar.C0;
        if (s6Var != null) {
            s6Var.c(true);
        }
        sbVar.G1 = w7.w(sbVar.c, "jpg");
        sbVar.P1 = true;
        sbVar.o();
        sbVar.c2 = false;
        if (sbVar.B0.isFrontface() && sbVar.t2 == 1) {
            sb.a(sbVar);
        }
        if (!sbVar.p0()) {
            h(null);
            return;
        }
        q2 q2Var = sbVar.s;
        ai.i iVar = new ai.i(this, 27);
        q2Var.h(q2Var.p);
        q2Var.e(1.0f, 320L, new m2(q2Var, iVar, 0));
    }

    public final void e(boolean z10) {
        sb sbVar = this.a;
        if (sbVar.R1 || !sbVar.Q1) {
            return;
        }
        sbVar.R1 = true;
        AndroidUtilities.runOnUIThread(new ka(this, 0), z10 ? 0L : 400L);
    }

    public final void f(Runnable runnable, boolean z10) {
        va vaVar;
        sb sbVar = this.a;
        if (sbVar.Q1 || sbVar.R1 || sbVar.S1 || sbVar.f0 != 0 || (vaVar = sbVar.B0) == null || vaVar.getCameraSession() == null) {
            return;
        }
        v3 v3Var = sbVar.l1;
        if (v3Var != null) {
            v3Var.e(true);
        }
        v3 v3Var2 = sbVar.m1;
        if (v3Var2 != null) {
            v3Var2.e(true);
        }
        sbVar.W0.e(true);
        sbVar.Q1 = true;
        s6 s6Var = sbVar.C0;
        if (s6Var != null) {
            s6Var.c(true);
        }
        File file = sbVar.G1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            sbVar.G1 = null;
        }
        sbVar.G1 = w7.x(sbVar.c, true);
        sbVar.o();
        sbVar.c2 = false;
        if (sbVar.B0.isFrontface() && sbVar.t2 == 1) {
            sb.a(sbVar);
        }
        if (sbVar.p0()) {
            sbVar.s.c(new la(this, z10, runnable));
        } else {
            g(runnable, z10);
        }
    }

    public final void g(Runnable runnable, boolean z10) {
        sb sbVar = this.a;
        if (sbVar.B0 == null) {
            return;
        }
        CameraController.getInstance().recordVideo(sbVar.B0.getCameraSessionObject(), sbVar.G1, false, new e1.c(this, 11), new la(this, runnable, z10), sbVar.B0, true);
        if (sbVar.O1 != 1) {
            sbVar.O1 = 1;
            sbVar.I0.a(false, true);
            sbVar.h0(sbVar.O1 == 1, true);
            sbVar.Q0.a(sbVar.O1);
            w6 w6Var = sbVar.O0;
            boolean z11 = sbVar.O1 == 1;
            w6Var.n0 = -1.0f;
            w6Var.o0 = z11;
            w6Var.invalidate();
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
        sb sbVar = this.a;
        int i10 = sbVar.c;
        if (!sbVar.p0()) {
            sbVar.B0.startTakePictureAnimation(true);
        }
        if ((sbVar.B0.isDual() && TextUtils.equals(sbVar.B0.getCameraSession().getCurrentFlashMode(), "off")) || sbVar.A0.j()) {
            if (!sbVar.A0.j()) {
                sbVar.B0.pauseAsTakingPicture();
            }
            Bitmap bitmap = sbVar.B0.getTextureView().getBitmap();
            try {
                fileOutputStream = new FileOutputStream(sbVar.G1.getAbsoluteFile());
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
            } catch (Exception e10) {
                e = e10;
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
            s6 s6Var = sbVar.C0;
            if (s6Var != null) {
                s6Var.c(true);
            }
            sbVar.P1 = CameraController.getInstance().takePicture(sbVar.G1, true, sbVar.B0.getCameraSessionObject(), new ai.n1(14, this, callback));
            return;
        }
        sbVar.P1 = false;
        s6 s6Var2 = sbVar.C0;
        if (s6Var2 != null) {
            s6Var2.c(false);
        }
        w7 m10 = w7.m(0, sbVar.G1);
        m10.J0 = sbVar.v0;
        m10.K0 = sbVar.w0;
        if (!sbVar.A0.j()) {
            sbVar.K1 = m10;
            o9.a(i10, m10);
            sbVar.L1 = false;
            if (callback != null) {
                callback.run(new ka(this, 1));
                return;
            } else {
                sbVar.J(1, true);
                return;
            }
        }
        sbVar.G1 = null;
        if (sbVar.A0.l(m10)) {
            w7 a2 = w7.a(sbVar.A0.getLayout(), sbVar.A0.getContent());
            sbVar.K1 = a2;
            o9.a(i10, a2);
            sbVar.L1 = false;
            if (callback != null) {
                callback.run(null);
            }
        } else if (callback != null) {
            callback.run(null);
        }
        sbVar.l0(true);
    }
}
