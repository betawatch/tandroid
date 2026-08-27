package lh;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class oa implements w6 {
    public final /* synthetic */ sb a;

    public oa(sb sbVar) {
        this.a = sbVar;
    }

    public final void a() {
        sb sbVar = this.a;
        ArrayList<z7> content = sbVar.w0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            sbVar.G1 = content.get(0);
        } else {
            sbVar.G1 = z7.a(sbVar.w0.getLayout(), sbVar.w0.getContent());
        }
        z7 z7Var = sbVar.G1;
        if (z7Var != null && z7Var.K) {
            i10 = 1;
        }
        sbVar.K1 = i10;
        la laVar = sbVar.M0;
        if (laVar != null) {
            laVar.a(i10);
        }
        r9.a(sbVar.c, sbVar.G1);
        sbVar.K(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        sb sbVar = this.a;
        wa waVar = sbVar.x0;
        if (waVar == null || sbVar.O1 || sbVar.L1 || !waVar.isInited()) {
            return;
        }
        sb sbVar2 = this.a;
        if (sbVar2.b0 != 0) {
            return;
        }
        w3 w3Var = sbVar2.i1;
        if (w3Var != null) {
            w3Var.e(true);
        }
        if (this.a.q0() && (arrayList = this.a.q2) != null && !arrayList.isEmpty()) {
            sb sbVar3 = this.a;
            ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) sbVar3.q2.get(sbVar3.p2)).commit();
        }
        this.a.x0.switchCamera();
        sb.a0(this.a.x0.isFrontface());
        if (this.a.q0()) {
            this.a.s.c(null);
        } else {
            this.a.s.d();
        }
    }

    public final void c() {
        wa waVar;
        sb sbVar = this.a;
        if (sbVar.L1 || sbVar.O1 || sbVar.b0 != 0 || (waVar = sbVar.x0) == null || !waVar.isInited()) {
            return;
        }
        sbVar.S0.e(true);
        File file = sbVar.C1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            sbVar.C1 = null;
        }
        u6 u6Var = sbVar.y0;
        if (u6Var != null) {
            u6Var.c(true);
        }
        sbVar.C1 = z7.w(sbVar.c, "jpg");
        sbVar.L1 = true;
        sbVar.p();
        sbVar.Y1 = false;
        if (sbVar.x0.isFrontface() && sbVar.p2 == 1) {
            sb.a(sbVar);
        }
        if (!sbVar.q0()) {
            g(null);
            return;
        }
        r2 r2Var = sbVar.s;
        n6 n6Var = new n6(this, 3);
        r2Var.h(r2Var.p);
        r2Var.e(1.0f, 320L, new n2(r2Var, n6Var, 0));
    }

    public final void d(boolean z10) {
        sb sbVar = this.a;
        if (sbVar.N1 || !sbVar.M1) {
            return;
        }
        sbVar.N1 = true;
        AndroidUtilities.runOnUIThread(new ma(this, 0), z10 ? 0L : 400L);
    }

    public final void e(Runnable runnable, boolean z10) {
        wa waVar;
        sb sbVar = this.a;
        if (sbVar.M1 || sbVar.N1 || sbVar.O1 || sbVar.b0 != 0 || (waVar = sbVar.x0) == null || waVar.getCameraSession() == null) {
            return;
        }
        w3 w3Var = sbVar.h1;
        if (w3Var != null) {
            w3Var.e(true);
        }
        w3 w3Var2 = sbVar.i1;
        if (w3Var2 != null) {
            w3Var2.e(true);
        }
        sbVar.S0.e(true);
        sbVar.M1 = true;
        u6 u6Var = sbVar.y0;
        if (u6Var != null) {
            u6Var.c(true);
        }
        File file = sbVar.C1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            sbVar.C1 = null;
        }
        sbVar.C1 = z7.x(sbVar.c, true);
        sbVar.p();
        sbVar.Y1 = false;
        if (sbVar.x0.isFrontface() && sbVar.p2 == 1) {
            sb.a(sbVar);
        }
        if (sbVar.q0()) {
            sbVar.s.c(new na(this, z10, runnable));
        } else {
            f(runnable, z10);
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        sb sbVar = this.a;
        if (sbVar.x0 == null) {
            return;
        }
        CameraController.getInstance().recordVideo(sbVar.x0.getCameraSessionObject(), sbVar.C1, false, new p(this, 6), new na(this, runnable, z10), sbVar.x0, true);
        if (sbVar.K1 != 1) {
            sbVar.K1 = 1;
            sbVar.E0.a(false, true);
            sbVar.i0(sbVar.K1 == 1, true);
            sbVar.M0.a(sbVar.K1);
            y6 y6Var = sbVar.K0;
            boolean z11 = sbVar.K1 == 1;
            y6Var.j0 = -1.0f;
            y6Var.k0 = z11;
            y6Var.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Utilities.Callback callback) {
        boolean z10;
        FileOutputStream fileOutputStream;
        sb sbVar = this.a;
        int i10 = sbVar.c;
        if (!sbVar.q0()) {
            sbVar.x0.startTakePictureAnimation(true);
        }
        if ((sbVar.x0.isDual() && TextUtils.equals(sbVar.x0.getCameraSession().getCurrentFlashMode(), "off")) || sbVar.w0.j()) {
            if (!sbVar.w0.j()) {
                sbVar.x0.pauseAsTakingPicture();
            }
            Bitmap bitmap = sbVar.x0.getTextureView().getBitmap();
            try {
                fileOutputStream = new FileOutputStream(sbVar.C1.getAbsoluteFile());
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                } finally {
                }
            } catch (Exception e9) {
                e = e9;
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
            u6 u6Var = sbVar.y0;
            if (u6Var != null) {
                u6Var.c(true);
            }
            sbVar.L1 = CameraController.getInstance().takePicture(sbVar.C1, true, sbVar.x0.getCameraSessionObject(), new gh.d1(15, this, callback));
            return;
        }
        sbVar.L1 = false;
        u6 u6Var2 = sbVar.y0;
        if (u6Var2 != null) {
            u6Var2.c(false);
        }
        z7 m10 = z7.m(0, sbVar.C1);
        m10.J0 = sbVar.r0;
        m10.K0 = sbVar.s0;
        if (!sbVar.w0.j()) {
            sbVar.G1 = m10;
            r9.a(i10, m10);
            sbVar.H1 = false;
            if (callback != null) {
                callback.run(new ma(this, 1));
                return;
            } else {
                sbVar.K(1, true);
                return;
            }
        }
        sbVar.C1 = null;
        if (sbVar.w0.l(m10)) {
            z7 a2 = z7.a(sbVar.w0.getLayout(), sbVar.w0.getContent());
            sbVar.G1 = a2;
            r9.a(i10, a2);
            sbVar.H1 = false;
            if (callback != null) {
                callback.run(null);
            }
        } else if (callback != null) {
            callback.run(null);
        }
        sbVar.m0(true);
    }
}
