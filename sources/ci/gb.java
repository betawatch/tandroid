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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class gb implements h7 {
    public final /* synthetic */ lc a;

    public gb(lc lcVar) {
        this.a = lcVar;
    }

    public final void a() {
        lc lcVar = this.a;
        ArrayList<l8> content = lcVar.A0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            lcVar.K1 = content.get(0);
        } else {
            lcVar.K1 = l8.a(lcVar.A0.getLayout(), lcVar.A0.getContent());
        }
        l8 l8Var = lcVar.K1;
        if (l8Var != null && l8Var.K) {
            i10 = 1;
        }
        lcVar.O1 = i10;
        db dbVar = lcVar.Q0;
        if (dbVar != null) {
            dbVar.a(i10);
        }
        ga.a(lcVar.c, lcVar.K1);
        lcVar.K(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        lc lcVar = this.a;
        ob obVar = lcVar.B0;
        if (obVar == null || lcVar.S1 || lcVar.P1 || !obVar.isInited()) {
            return;
        }
        lc lcVar2 = this.a;
        if (lcVar2.f0 != 0) {
            return;
        }
        e4 e4Var = lcVar2.m1;
        if (e4Var != null) {
            e4Var.e(true);
        }
        if (this.a.q0() && (arrayList = this.a.u2) != null && !arrayList.isEmpty()) {
            lc lcVar3 = this.a;
            ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) lcVar3.u2.get(lcVar3.t2)).commit();
        }
        this.a.B0.switchCamera();
        lc.a0(this.a.B0.isFrontface());
        if (this.a.q0()) {
            this.a.s.c(null);
        } else {
            this.a.s.d();
        }
    }

    public final void c() {
        ob obVar;
        lc lcVar = this.a;
        if (lcVar.P1 || lcVar.S1 || lcVar.f0 != 0 || (obVar = lcVar.B0) == null || !obVar.isInited()) {
            return;
        }
        lcVar.W0.e(true);
        File file = lcVar.G1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            lcVar.G1 = null;
        }
        f7 f7Var = lcVar.C0;
        if (f7Var != null) {
            f7Var.c(true);
        }
        lcVar.G1 = l8.w(lcVar.c, "jpg");
        lcVar.P1 = true;
        lcVar.p();
        lcVar.c2 = false;
        if (lcVar.B0.isFrontface() && lcVar.t2 == 1) {
            lc.a(lcVar);
        }
        if (!lcVar.q0()) {
            g(null);
            return;
        }
        x2 x2Var = lcVar.s;
        ai.y1 y1Var = new ai.y1(this, 17);
        x2Var.h(x2Var.p);
        x2Var.e(1.0f, 320L, new t2(x2Var, y1Var, 0));
    }

    public final void d(boolean z10) {
        lc lcVar = this.a;
        if (lcVar.R1 || !lcVar.Q1) {
            return;
        }
        lcVar.R1 = true;
        AndroidUtilities.runOnUIThread(new eb(this, 0), z10 ? 0L : 400L);
    }

    public final void e(Runnable runnable, boolean z10) {
        ob obVar;
        lc lcVar = this.a;
        if (lcVar.Q1 || lcVar.R1 || lcVar.S1 || lcVar.f0 != 0 || (obVar = lcVar.B0) == null || obVar.getCameraSession() == null) {
            return;
        }
        e4 e4Var = lcVar.l1;
        if (e4Var != null) {
            e4Var.e(true);
        }
        e4 e4Var2 = lcVar.m1;
        if (e4Var2 != null) {
            e4Var2.e(true);
        }
        lcVar.W0.e(true);
        lcVar.Q1 = true;
        f7 f7Var = lcVar.C0;
        if (f7Var != null) {
            f7Var.c(true);
        }
        File file = lcVar.G1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            lcVar.G1 = null;
        }
        lcVar.G1 = l8.x(lcVar.c, true);
        lcVar.p();
        lcVar.c2 = false;
        if (lcVar.B0.isFrontface() && lcVar.t2 == 1) {
            lc.a(lcVar);
        }
        if (lcVar.q0()) {
            lcVar.s.c(new fb(this, z10, runnable));
        } else {
            f(runnable, z10);
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        lc lcVar = this.a;
        if (lcVar.B0 == null) {
            return;
        }
        CameraController.getInstance().recordVideo(lcVar.B0.getCameraSessionObject(), lcVar.G1, false, new a1.c(this, 20), new fb(this, runnable, z10), lcVar.B0, true);
        if (lcVar.O1 != 1) {
            lcVar.O1 = 1;
            lcVar.I0.a(false, true);
            lcVar.i0(lcVar.O1 == 1, true);
            lcVar.Q0.a(lcVar.O1);
            j7 j7Var = lcVar.O0;
            boolean z11 = lcVar.O1 == 1;
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
        lc lcVar = this.a;
        int i10 = lcVar.c;
        if (!lcVar.q0()) {
            lcVar.B0.startTakePictureAnimation(true);
        }
        if ((lcVar.B0.isDual() && TextUtils.equals(lcVar.B0.getCameraSession().getCurrentFlashMode(), "off")) || lcVar.A0.j()) {
            if (!lcVar.A0.j()) {
                lcVar.B0.pauseAsTakingPicture();
            }
            Bitmap bitmap = lcVar.B0.getTextureView().getBitmap();
            try {
                fileOutputStream = new FileOutputStream(lcVar.G1.getAbsoluteFile());
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
            f7 f7Var = lcVar.C0;
            if (f7Var != null) {
                f7Var.c(true);
            }
            lcVar.P1 = CameraController.getInstance().takePicture(lcVar.G1, true, lcVar.B0.getCameraSessionObject(), new ai.g3(7, this, callback));
            return;
        }
        lcVar.P1 = false;
        f7 f7Var2 = lcVar.C0;
        if (f7Var2 != null) {
            f7Var2.c(false);
        }
        l8 m10 = l8.m(0, lcVar.G1);
        m10.J0 = lcVar.v0;
        m10.K0 = lcVar.w0;
        if (!lcVar.A0.j()) {
            lcVar.K1 = m10;
            ga.a(i10, m10);
            lcVar.L1 = false;
            if (callback != null) {
                callback.run(new eb(this, 1));
                return;
            } else {
                lcVar.K(1, true);
                return;
            }
        }
        lcVar.G1 = null;
        if (lcVar.A0.l(m10)) {
            l8 a2 = l8.a(lcVar.A0.getLayout(), lcVar.A0.getContent());
            lcVar.K1 = a2;
            ga.a(i10, a2);
            lcVar.L1 = false;
            if (callback != null) {
                callback.run(null);
            }
        } else if (callback != null) {
            callback.run(null);
        }
        lcVar.m0(true);
    }
}
