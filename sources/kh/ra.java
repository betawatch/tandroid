package kh;

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class ra implements x6 {
    public final /* synthetic */ wb a;

    public ra(wb wbVar) {
        this.a = wbVar;
    }

    public final void a() {
        wb wbVar = this.a;
        ArrayList<a8> content = wbVar.w0.getContent();
        int i9 = 0;
        if (content.size() == 1) {
            wbVar.G1 = content.get(0);
        } else {
            wbVar.G1 = a8.a(wbVar.w0.getLayout(), wbVar.w0.getContent());
        }
        a8 a8Var = wbVar.G1;
        if (a8Var != null && a8Var.K) {
            i9 = 1;
        }
        wbVar.K1 = i9;
        oa oaVar = wbVar.M0;
        if (oaVar != null) {
            oaVar.a(i9);
        }
        u9.a(wbVar.c, wbVar.G1);
        wbVar.K(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        wb wbVar = this.a;
        za zaVar = wbVar.x0;
        if (zaVar == null || wbVar.O1 || wbVar.L1 || !zaVar.isInited()) {
            return;
        }
        wb wbVar2 = this.a;
        if (wbVar2.b0 != 0) {
            return;
        }
        x3 x3Var = wbVar2.i1;
        if (x3Var != null) {
            x3Var.e(true);
        }
        if (this.a.q0() && (arrayList = this.a.q2) != null && !arrayList.isEmpty()) {
            wb wbVar3 = this.a;
            ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) wbVar3.q2.get(wbVar3.p2)).commit();
        }
        this.a.x0.switchCamera();
        wb.a0(this.a.x0.isFrontface());
        if (this.a.q0()) {
            this.a.s.c(null);
        } else {
            this.a.s.d();
        }
    }

    public final void c() {
        za zaVar;
        wb wbVar = this.a;
        if (wbVar.L1 || wbVar.O1 || wbVar.b0 != 0 || (zaVar = wbVar.x0) == null || !zaVar.isInited()) {
            return;
        }
        wbVar.S0.e(true);
        File file = wbVar.C1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            wbVar.C1 = null;
        }
        v6 v6Var = wbVar.y0;
        if (v6Var != null) {
            v6Var.c(true);
        }
        wbVar.C1 = a8.w(wbVar.c, "jpg");
        wbVar.L1 = true;
        wbVar.p();
        wbVar.Y1 = false;
        if (wbVar.x0.isFrontface() && wbVar.p2 == 1) {
            wb.a(wbVar);
        }
        if (!wbVar.q0()) {
            g(null);
            return;
        }
        s2 s2Var = wbVar.s;
        i9 i9Var = new i9(this, 1);
        s2Var.h(s2Var.p);
        s2Var.e(1.0f, 320L, new o2(s2Var, i9Var, 0));
    }

    public final void d(boolean z10) {
        wb wbVar = this.a;
        if (wbVar.N1 || !wbVar.M1) {
            return;
        }
        wbVar.N1 = true;
        AndroidUtilities.runOnUIThread(new pa(this, 0), z10 ? 0L : 400L);
    }

    public final void e(Runnable runnable, boolean z10) {
        za zaVar;
        wb wbVar = this.a;
        if (wbVar.M1 || wbVar.N1 || wbVar.O1 || wbVar.b0 != 0 || (zaVar = wbVar.x0) == null || zaVar.getCameraSession() == null) {
            return;
        }
        x3 x3Var = wbVar.h1;
        if (x3Var != null) {
            x3Var.e(true);
        }
        x3 x3Var2 = wbVar.i1;
        if (x3Var2 != null) {
            x3Var2.e(true);
        }
        wbVar.S0.e(true);
        wbVar.M1 = true;
        v6 v6Var = wbVar.y0;
        if (v6Var != null) {
            v6Var.c(true);
        }
        File file = wbVar.C1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            wbVar.C1 = null;
        }
        wbVar.C1 = a8.x(wbVar.c, true);
        wbVar.p();
        wbVar.Y1 = false;
        if (wbVar.x0.isFrontface() && wbVar.p2 == 1) {
            wb.a(wbVar);
        }
        if (wbVar.q0()) {
            wbVar.s.c(new qa(this, z10, runnable));
        } else {
            f(runnable, z10);
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        wb wbVar = this.a;
        if (wbVar.x0 == null) {
            return;
        }
        CameraController.getInstance().recordVideo(wbVar.x0.getCameraSessionObject(), wbVar.C1, false, new p(this, 6), new qa(this, runnable, z10), wbVar.x0, true);
        if (wbVar.K1 != 1) {
            wbVar.K1 = 1;
            wbVar.E0.a(false, true);
            wbVar.i0(wbVar.K1 == 1, true);
            wbVar.M0.a(wbVar.K1);
            z6 z6Var = wbVar.K0;
            boolean z11 = wbVar.K1 == 1;
            z6Var.j0 = -1.0f;
            z6Var.k0 = z11;
            z6Var.invalidate();
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
        wb wbVar = this.a;
        int i9 = wbVar.c;
        if (!wbVar.q0()) {
            wbVar.x0.startTakePictureAnimation(true);
        }
        if ((wbVar.x0.isDual() && TextUtils.equals(wbVar.x0.getCameraSession().getCurrentFlashMode(), "off")) || wbVar.w0.j()) {
            if (!wbVar.w0.j()) {
                wbVar.x0.pauseAsTakingPicture();
            }
            Bitmap bitmap = wbVar.x0.getTextureView().getBitmap();
            try {
                fileOutputStream = new FileOutputStream(wbVar.C1.getAbsoluteFile());
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
            v6 v6Var = wbVar.y0;
            if (v6Var != null) {
                v6Var.c(true);
            }
            wbVar.L1 = CameraController.getInstance().takePicture(wbVar.C1, true, wbVar.x0.getCameraSessionObject(), new fh.f1(15, this, callback));
            return;
        }
        wbVar.L1 = false;
        v6 v6Var2 = wbVar.y0;
        if (v6Var2 != null) {
            v6Var2.c(false);
        }
        a8 m10 = a8.m(0, wbVar.C1);
        m10.J0 = wbVar.r0;
        m10.K0 = wbVar.s0;
        if (!wbVar.w0.j()) {
            wbVar.G1 = m10;
            u9.a(i9, m10);
            wbVar.H1 = false;
            if (callback != null) {
                callback.run(new pa(this, 1));
                return;
            } else {
                wbVar.K(1, true);
                return;
            }
        }
        wbVar.C1 = null;
        if (wbVar.w0.l(m10)) {
            a8 a2 = a8.a(wbVar.w0.getLayout(), wbVar.w0.getContent());
            wbVar.G1 = a2;
            u9.a(i9, a2);
            wbVar.H1 = false;
            if (callback != null) {
                callback.run(null);
            }
        } else if (callback != null) {
            callback.run(null);
        }
        wbVar.m0(true);
    }
}
