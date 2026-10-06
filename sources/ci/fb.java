package ci;

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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class fb implements h7 {
    public final /* synthetic */ kc a;

    public fb(kc kcVar) {
        this.a = kcVar;
    }

    public final void a() {
        kc kcVar = this.a;
        ArrayList<k8> content = kcVar.A0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            kcVar.K1 = content.get(0);
        } else {
            kcVar.K1 = k8.a(kcVar.A0.getLayout(), kcVar.A0.getContent());
        }
        k8 k8Var = kcVar.K1;
        if (k8Var != null && k8Var.K) {
            i10 = 1;
        }
        kcVar.O1 = i10;
        cb cbVar = kcVar.Q0;
        if (cbVar != null) {
            cbVar.a(i10);
        }
        fa.a(kcVar.c, kcVar.K1);
        kcVar.K(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        kc kcVar = this.a;
        nb nbVar = kcVar.B0;
        if (nbVar == null || kcVar.S1 || kcVar.P1 || !nbVar.isInited()) {
            return;
        }
        kc kcVar2 = this.a;
        if (kcVar2.f0 != 0) {
            return;
        }
        e4 e4Var = kcVar2.m1;
        if (e4Var != null) {
            e4Var.e(true);
        }
        if (this.a.q0() && (arrayList = this.a.u2) != null && !arrayList.isEmpty()) {
            kc kcVar3 = this.a;
            ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) kcVar3.u2.get(kcVar3.t2)).commit();
        }
        this.a.B0.switchCamera();
        kc.a0(this.a.B0.isFrontface());
        if (this.a.q0()) {
            this.a.s.c(null);
        } else {
            this.a.s.d();
        }
    }

    public final void c() {
        nb nbVar;
        kc kcVar = this.a;
        if (kcVar.P1 || kcVar.S1 || kcVar.f0 != 0 || (nbVar = kcVar.B0) == null || !nbVar.isInited()) {
            return;
        }
        kcVar.W0.e(true);
        File file = kcVar.G1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            kcVar.G1 = null;
        }
        f7 f7Var = kcVar.C0;
        if (f7Var != null) {
            f7Var.c(true);
        }
        kcVar.G1 = k8.w(kcVar.c, "jpg");
        kcVar.P1 = true;
        kcVar.p();
        kcVar.c2 = false;
        if (kcVar.B0.isFrontface() && kcVar.t2 == 1) {
            kc.a(kcVar);
        }
        if (!kcVar.q0()) {
            g(null);
            return;
        }
        x2 x2Var = kcVar.s;
        ai.y1 y1Var = new ai.y1(this, 17);
        x2Var.h(x2Var.p);
        x2Var.e(1.0f, 320L, new t2(x2Var, y1Var, 0));
    }

    public final void d(boolean z10) {
        kc kcVar = this.a;
        if (kcVar.R1 || !kcVar.Q1) {
            return;
        }
        kcVar.R1 = true;
        AndroidUtilities.runOnUIThread(new db(this, 0), z10 ? 0L : 400L);
    }

    public final void e(Runnable runnable, boolean z10) {
        nb nbVar;
        kc kcVar = this.a;
        if (kcVar.Q1 || kcVar.R1 || kcVar.S1 || kcVar.f0 != 0 || (nbVar = kcVar.B0) == null || nbVar.getCameraSession() == null) {
            return;
        }
        e4 e4Var = kcVar.l1;
        if (e4Var != null) {
            e4Var.e(true);
        }
        e4 e4Var2 = kcVar.m1;
        if (e4Var2 != null) {
            e4Var2.e(true);
        }
        kcVar.W0.e(true);
        kcVar.Q1 = true;
        f7 f7Var = kcVar.C0;
        if (f7Var != null) {
            f7Var.c(true);
        }
        File file = kcVar.G1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            kcVar.G1 = null;
        }
        kcVar.G1 = k8.x(kcVar.c, true);
        kcVar.p();
        kcVar.c2 = false;
        if (kcVar.B0.isFrontface() && kcVar.t2 == 1) {
            kc.a(kcVar);
        }
        if (kcVar.q0()) {
            kcVar.s.c(new eb(this, z10, runnable));
        } else {
            f(runnable, z10);
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        kc kcVar = this.a;
        if (kcVar.B0 == null) {
            return;
        }
        CameraController.getInstance().recordVideo(kcVar.B0.getCameraSessionObject(), kcVar.G1, false, new a1.c(this, 20), new eb(this, runnable, z10), kcVar.B0, true);
        if (kcVar.O1 != 1) {
            kcVar.O1 = 1;
            kcVar.I0.a(false, true);
            kcVar.i0(kcVar.O1 == 1, true);
            kcVar.Q0.a(kcVar.O1);
            j7 j7Var = kcVar.O0;
            boolean z11 = kcVar.O1 == 1;
            j7Var.n0 = -1.0f;
            j7Var.o0 = z11;
            j7Var.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Utilities.Callback callback) {
        boolean z10;
        FileOutputStream fileOutputStream;
        kc kcVar = this.a;
        int i10 = kcVar.c;
        if (!kcVar.q0()) {
            kcVar.B0.startTakePictureAnimation(true);
        }
        if ((kcVar.B0.isDual() && TextUtils.equals(kcVar.B0.getCameraSession().getCurrentFlashMode(), "off")) || kcVar.A0.j()) {
            if (!kcVar.A0.j()) {
                kcVar.B0.pauseAsTakingPicture();
            }
            Bitmap bitmap = kcVar.B0.getTextureView().getBitmap();
            try {
                fileOutputStream = new FileOutputStream(kcVar.G1.getAbsoluteFile());
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                } finally {
                }
            } catch (Exception e7) {
                e = e7;
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
            f7 f7Var = kcVar.C0;
            if (f7Var != null) {
                f7Var.c(true);
            }
            kcVar.P1 = CameraController.getInstance().takePicture(kcVar.G1, true, kcVar.B0.getCameraSessionObject(), new ai.g3(7, this, callback));
            return;
        }
        kcVar.P1 = false;
        f7 f7Var2 = kcVar.C0;
        if (f7Var2 != null) {
            f7Var2.c(false);
        }
        k8 m10 = k8.m(0, kcVar.G1);
        m10.J0 = kcVar.v0;
        m10.K0 = kcVar.w0;
        if (!kcVar.A0.j()) {
            kcVar.K1 = m10;
            fa.a(i10, m10);
            kcVar.L1 = false;
            if (callback != null) {
                callback.run(new db(this, 1));
                return;
            } else {
                kcVar.K(1, true);
                return;
            }
        }
        kcVar.G1 = null;
        if (kcVar.A0.l(m10)) {
            k8 a2 = k8.a(kcVar.A0.getLayout(), kcVar.A0.getContent());
            kcVar.K1 = a2;
            fa.a(i10, a2);
            kcVar.L1 = false;
            if (callback != null) {
                callback.run(null);
            }
        } else if (callback != null) {
            callback.run(null);
        }
        kcVar.m0(true);
    }
}
