package bi;

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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class sc implements k8 {
    public final /* synthetic */ ce a;

    public sc(ce ceVar) {
        this.a = ceVar;
    }

    public final void a() {
        ce ceVar = this.a;
        ArrayList<r9> content = ceVar.A0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            ceVar.K1 = content.get(0);
        } else {
            ceVar.K1 = r9.a(ceVar.A0.getLayout(), ceVar.A0.getContent());
        }
        r9 r9Var = ceVar.K1;
        if (r9Var != null && r9Var.K) {
            i10 = 1;
        }
        ceVar.O1 = i10;
        pc pcVar = ceVar.Q0;
        if (pcVar != null) {
            pcVar.a(i10);
        }
        sb.a(ceVar.c, ceVar.K1);
        ceVar.K(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        ce ceVar = this.a;
        bd bdVar = ceVar.B0;
        if (bdVar == null || ceVar.S1 || ceVar.P1 || !bdVar.isInited()) {
            return;
        }
        ce ceVar2 = this.a;
        if (ceVar2.f0 != 0) {
            return;
        }
        x4 x4Var = ceVar2.m1;
        if (x4Var != null) {
            x4Var.e(true);
        }
        if (this.a.q0() && (arrayList = this.a.u2) != null && !arrayList.isEmpty()) {
            ce ceVar3 = this.a;
            ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) ceVar3.u2.get(ceVar3.t2)).commit();
        }
        this.a.B0.switchCamera();
        ce.a0(this.a.B0.isFrontface());
        if (this.a.q0()) {
            this.a.s.c(null);
        } else {
            this.a.s.d();
        }
    }

    public final void c() {
        bd bdVar;
        ce ceVar = this.a;
        if (ceVar.P1 || ceVar.S1 || ceVar.f0 != 0 || (bdVar = ceVar.B0) == null || !bdVar.isInited()) {
            return;
        }
        ceVar.W0.e(true);
        File file = ceVar.G1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            ceVar.G1 = null;
        }
        i8 i8Var = ceVar.C0;
        if (i8Var != null) {
            i8Var.c(true);
        }
        ceVar.G1 = r9.w(ceVar.c, "jpg");
        ceVar.P1 = true;
        ceVar.p();
        ceVar.c2 = false;
        if (ceVar.B0.isFrontface() && ceVar.t2 == 1) {
            ce.a(ceVar);
        }
        if (!ceVar.q0()) {
            g(null);
            return;
        }
        m3 m3Var = ceVar.s;
        ai.b bVar = new ai.b(this, 10);
        m3Var.h(m3Var.p);
        m3Var.e(1.0f, 320L, new h3(m3Var, bVar, 0));
    }

    public final void d(boolean z10) {
        ce ceVar = this.a;
        if (ceVar.R1 || !ceVar.Q1) {
            return;
        }
        ceVar.R1 = true;
        AndroidUtilities.runOnUIThread(new qc(this, 0), z10 ? 0L : 400L);
    }

    public final void e(Runnable runnable, boolean z10) {
        bd bdVar;
        ce ceVar = this.a;
        if (ceVar.Q1 || ceVar.R1 || ceVar.S1 || ceVar.f0 != 0 || (bdVar = ceVar.B0) == null || bdVar.getCameraSession() == null) {
            return;
        }
        x4 x4Var = ceVar.l1;
        if (x4Var != null) {
            x4Var.e(true);
        }
        x4 x4Var2 = ceVar.m1;
        if (x4Var2 != null) {
            x4Var2.e(true);
        }
        ceVar.W0.e(true);
        ceVar.Q1 = true;
        i8 i8Var = ceVar.C0;
        if (i8Var != null) {
            i8Var.c(true);
        }
        File file = ceVar.G1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            ceVar.G1 = null;
        }
        ceVar.G1 = r9.x(ceVar.c, true);
        ceVar.p();
        ceVar.c2 = false;
        if (ceVar.B0.isFrontface() && ceVar.t2 == 1) {
            ce.a(ceVar);
        }
        if (ceVar.q0()) {
            ceVar.s.c(new rc(this, z10, runnable));
        } else {
            f(runnable, z10);
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        ce ceVar = this.a;
        if (ceVar.B0 == null) {
            return;
        }
        CameraController.getInstance().recordVideo(ceVar.B0.getCameraSessionObject(), ceVar.G1, false, new a1.c(this, 10), new rc(this, runnable, z10), ceVar.B0, true);
        if (ceVar.O1 != 1) {
            ceVar.O1 = 1;
            ceVar.I0.a(false, true);
            ceVar.i0(ceVar.O1 == 1, true);
            ceVar.Q0.a(ceVar.O1);
            m8 m8Var = ceVar.O0;
            boolean z11 = ceVar.O1 == 1;
            m8Var.n0 = -1.0f;
            m8Var.o0 = z11;
            m8Var.invalidate();
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
        ce ceVar = this.a;
        int i10 = ceVar.c;
        if (!ceVar.q0()) {
            ceVar.B0.startTakePictureAnimation(true);
        }
        if ((ceVar.B0.isDual() && TextUtils.equals(ceVar.B0.getCameraSession().getCurrentFlashMode(), "off")) || ceVar.A0.j()) {
            if (!ceVar.A0.j()) {
                ceVar.B0.pauseAsTakingPicture();
            }
            Bitmap bitmap = ceVar.B0.getTextureView().getBitmap();
            try {
                fileOutputStream = new FileOutputStream(ceVar.G1.getAbsoluteFile());
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
            i8 i8Var = ceVar.C0;
            if (i8Var != null) {
                i8Var.c(true);
            }
            ceVar.P1 = CameraController.getInstance().takePicture(ceVar.G1, true, ceVar.B0.getCameraSessionObject(), new y2(6, this, callback));
            return;
        }
        ceVar.P1 = false;
        i8 i8Var2 = ceVar.C0;
        if (i8Var2 != null) {
            i8Var2.c(false);
        }
        r9 m10 = r9.m(0, ceVar.G1);
        m10.J0 = ceVar.v0;
        m10.K0 = ceVar.w0;
        if (!ceVar.A0.j()) {
            ceVar.K1 = m10;
            sb.a(i10, m10);
            ceVar.L1 = false;
            if (callback != null) {
                callback.run(new qc(this, 1));
                return;
            } else {
                ceVar.K(1, true);
                return;
            }
        }
        ceVar.G1 = null;
        if (ceVar.A0.l(m10)) {
            r9 a2 = r9.a(ceVar.A0.getLayout(), ceVar.A0.getContent());
            ceVar.K1 = a2;
            sb.a(i10, a2);
            ceVar.L1 = false;
            if (callback != null) {
                callback.run(null);
            }
        } else if (callback != null) {
            callback.run(null);
        }
        ceVar.m0(true);
    }
}
