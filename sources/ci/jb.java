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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class jb implements j7 {
    public final /* synthetic */ oc a;

    public jb(oc ocVar) {
        this.a = ocVar;
    }

    public final void a() {
        oc ocVar = this.a;
        ArrayList<o8> content = ocVar.A0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            ocVar.K1 = content.get(0);
        } else {
            ocVar.K1 = o8.a(ocVar.A0.getLayout(), ocVar.A0.getContent());
        }
        o8 o8Var = ocVar.K1;
        if (o8Var != null && o8Var.K) {
            i10 = 1;
        }
        ocVar.O1 = i10;
        gb gbVar = ocVar.Q0;
        if (gbVar != null) {
            gbVar.a(i10);
        }
        ja.a(ocVar.c, ocVar.K1);
        ocVar.K(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        oc ocVar = this.a;
        rb rbVar = ocVar.B0;
        if (rbVar == null || ocVar.S1 || ocVar.P1 || !rbVar.isInited()) {
            return;
        }
        oc ocVar2 = this.a;
        if (ocVar2.f0 != 0) {
            return;
        }
        f4 f4Var = ocVar2.m1;
        if (f4Var != null) {
            f4Var.e(true);
        }
        if (this.a.q0() && (arrayList = this.a.u2) != null && !arrayList.isEmpty()) {
            oc ocVar3 = this.a;
            ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) ocVar3.u2.get(ocVar3.t2)).commit();
        }
        this.a.B0.switchCamera();
        oc.a0(this.a.B0.isFrontface());
        if (this.a.q0()) {
            this.a.s.c(null);
        } else {
            this.a.s.d();
        }
    }

    public final void c() {
        rb rbVar;
        oc ocVar = this.a;
        if (ocVar.P1 || ocVar.S1 || ocVar.f0 != 0 || (rbVar = ocVar.B0) == null || !rbVar.isInited()) {
            return;
        }
        ocVar.W0.e(true);
        File file = ocVar.G1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            ocVar.G1 = null;
        }
        h7 h7Var = ocVar.C0;
        if (h7Var != null) {
            h7Var.c(true);
        }
        ocVar.G1 = o8.w(ocVar.c, "jpg");
        ocVar.P1 = true;
        ocVar.p();
        ocVar.c2 = false;
        if (ocVar.B0.isFrontface() && ocVar.t2 == 1) {
            oc.a(ocVar);
        }
        if (!ocVar.q0()) {
            g(null);
            return;
        }
        y2 y2Var = ocVar.s;
        ai.y1 y1Var = new ai.y1(this, 14);
        y2Var.h(y2Var.p);
        y2Var.e(1.0f, 320L, new u2(y2Var, y1Var, 0));
    }

    public final void d(boolean z10) {
        oc ocVar = this.a;
        if (ocVar.R1 || !ocVar.Q1) {
            return;
        }
        ocVar.R1 = true;
        AndroidUtilities.runOnUIThread(new hb(this, 0), z10 ? 0L : 400L);
    }

    public final void e(Runnable runnable, boolean z10) {
        rb rbVar;
        oc ocVar = this.a;
        if (ocVar.Q1 || ocVar.R1 || ocVar.S1 || ocVar.f0 != 0 || (rbVar = ocVar.B0) == null || rbVar.getCameraSession() == null) {
            return;
        }
        f4 f4Var = ocVar.l1;
        if (f4Var != null) {
            f4Var.e(true);
        }
        f4 f4Var2 = ocVar.m1;
        if (f4Var2 != null) {
            f4Var2.e(true);
        }
        ocVar.W0.e(true);
        ocVar.Q1 = true;
        h7 h7Var = ocVar.C0;
        if (h7Var != null) {
            h7Var.c(true);
        }
        File file = ocVar.G1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            ocVar.G1 = null;
        }
        ocVar.G1 = o8.x(ocVar.c, true);
        ocVar.p();
        ocVar.c2 = false;
        if (ocVar.B0.isFrontface() && ocVar.t2 == 1) {
            oc.a(ocVar);
        }
        if (ocVar.q0()) {
            ocVar.s.c(new ib(this, z10, runnable));
        } else {
            f(runnable, z10);
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        oc ocVar = this.a;
        if (ocVar.B0 == null) {
            return;
        }
        CameraController.getInstance().recordVideo(ocVar.B0.getCameraSessionObject(), ocVar.G1, false, new a1.c(this, 20), new ib(this, runnable, z10), ocVar.B0, true);
        if (ocVar.O1 != 1) {
            ocVar.O1 = 1;
            ocVar.I0.a(false, true);
            ocVar.i0(ocVar.O1 == 1, true);
            ocVar.Q0.a(ocVar.O1);
            l7 l7Var = ocVar.O0;
            boolean z11 = ocVar.O1 == 1;
            l7Var.n0 = -1.0f;
            l7Var.o0 = z11;
            l7Var.invalidate();
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
        oc ocVar = this.a;
        int i10 = ocVar.c;
        if (!ocVar.q0()) {
            ocVar.B0.startTakePictureAnimation(true);
        }
        if ((ocVar.B0.isDual() && TextUtils.equals(ocVar.B0.getCameraSession().getCurrentFlashMode(), "off")) || ocVar.A0.j()) {
            if (!ocVar.A0.j()) {
                ocVar.B0.pauseAsTakingPicture();
            }
            Bitmap bitmap = ocVar.B0.getTextureView().getBitmap();
            try {
                fileOutputStream = new FileOutputStream(ocVar.G1.getAbsoluteFile());
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
            h7 h7Var = ocVar.C0;
            if (h7Var != null) {
                h7Var.c(true);
            }
            ocVar.P1 = CameraController.getInstance().takePicture(ocVar.G1, true, ocVar.B0.getCameraSessionObject(), new m2(6, this, callback));
            return;
        }
        ocVar.P1 = false;
        h7 h7Var2 = ocVar.C0;
        if (h7Var2 != null) {
            h7Var2.c(false);
        }
        o8 m10 = o8.m(0, ocVar.G1);
        m10.J0 = ocVar.v0;
        m10.K0 = ocVar.w0;
        if (!ocVar.A0.j()) {
            ocVar.K1 = m10;
            ja.a(i10, m10);
            ocVar.L1 = false;
            if (callback != null) {
                callback.run(new hb(this, 1));
                return;
            } else {
                ocVar.K(1, true);
                return;
            }
        }
        ocVar.G1 = null;
        if (ocVar.A0.l(m10)) {
            o8 a2 = o8.a(ocVar.A0.getLayout(), ocVar.A0.getContent());
            ocVar.K1 = a2;
            ja.a(i10, a2);
            ocVar.L1 = false;
            if (callback != null) {
                callback.run(null);
            }
        } else if (callback != null) {
            callback.run(null);
        }
        ocVar.m0(true);
    }
}
