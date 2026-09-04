package di;

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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class jb implements j7 {
    public final /* synthetic */ pc a;

    public jb(pc pcVar) {
        this.a = pcVar;
    }

    public final void a() {
        pc pcVar = this.a;
        ArrayList<o8> content = pcVar.A0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            pcVar.K1 = content.get(0);
        } else {
            pcVar.K1 = o8.a(pcVar.A0.getLayout(), pcVar.A0.getContent());
        }
        o8 o8Var = pcVar.K1;
        if (o8Var != null && o8Var.K) {
            i10 = 1;
        }
        pcVar.O1 = i10;
        gb gbVar = pcVar.Q0;
        if (gbVar != null) {
            gbVar.a(i10);
        }
        ja.a(pcVar.c, pcVar.K1);
        pcVar.K(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        pc pcVar = this.a;
        sb sbVar = pcVar.B0;
        if (sbVar == null || pcVar.S1 || pcVar.P1 || !sbVar.isInited()) {
            return;
        }
        pc pcVar2 = this.a;
        if (pcVar2.f0 != 0) {
            return;
        }
        f4 f4Var = pcVar2.m1;
        if (f4Var != null) {
            f4Var.e(true);
        }
        if (this.a.q0() && (arrayList = this.a.u2) != null && !arrayList.isEmpty()) {
            pc pcVar3 = this.a;
            ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) pcVar3.u2.get(pcVar3.t2)).commit();
        }
        this.a.B0.switchCamera();
        pc.a0(this.a.B0.isFrontface());
        if (this.a.q0()) {
            this.a.s.c(null);
        } else {
            this.a.s.d();
        }
    }

    public final void c() {
        sb sbVar;
        pc pcVar = this.a;
        if (pcVar.P1 || pcVar.S1 || pcVar.f0 != 0 || (sbVar = pcVar.B0) == null || !sbVar.isInited()) {
            return;
        }
        pcVar.W0.e(true);
        File file = pcVar.G1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            pcVar.G1 = null;
        }
        h7 h7Var = pcVar.C0;
        if (h7Var != null) {
            h7Var.c(true);
        }
        pcVar.G1 = o8.w(pcVar.c, "jpg");
        pcVar.P1 = true;
        pcVar.p();
        pcVar.c2 = false;
        if (pcVar.B0.isFrontface() && pcVar.t2 == 1) {
            pc.a(pcVar);
        }
        if (!pcVar.q0()) {
            g(null);
            return;
        }
        y2 y2Var = pcVar.s;
        bi.o1 o1Var = new bi.o1(this, 14);
        y2Var.h(y2Var.p);
        y2Var.e(1.0f, 320L, new u2(y2Var, o1Var, 0));
    }

    public final void d(boolean z10) {
        pc pcVar = this.a;
        if (pcVar.R1 || !pcVar.Q1) {
            return;
        }
        pcVar.R1 = true;
        AndroidUtilities.runOnUIThread(new hb(this, 0), z10 ? 0L : 400L);
    }

    public final void e(Runnable runnable, boolean z10) {
        sb sbVar;
        pc pcVar = this.a;
        if (pcVar.Q1 || pcVar.R1 || pcVar.S1 || pcVar.f0 != 0 || (sbVar = pcVar.B0) == null || sbVar.getCameraSession() == null) {
            return;
        }
        f4 f4Var = pcVar.l1;
        if (f4Var != null) {
            f4Var.e(true);
        }
        f4 f4Var2 = pcVar.m1;
        if (f4Var2 != null) {
            f4Var2.e(true);
        }
        pcVar.W0.e(true);
        pcVar.Q1 = true;
        h7 h7Var = pcVar.C0;
        if (h7Var != null) {
            h7Var.c(true);
        }
        File file = pcVar.G1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            pcVar.G1 = null;
        }
        pcVar.G1 = o8.x(pcVar.c, true);
        pcVar.p();
        pcVar.c2 = false;
        if (pcVar.B0.isFrontface() && pcVar.t2 == 1) {
            pc.a(pcVar);
        }
        if (pcVar.q0()) {
            pcVar.s.c(new ib(this, z10, runnable));
        } else {
            f(runnable, z10);
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        pc pcVar = this.a;
        if (pcVar.B0 == null) {
            return;
        }
        CameraController.getInstance().recordVideo(pcVar.B0.getCameraSessionObject(), pcVar.G1, false, new a1.c(this, 26), new ib(this, runnable, z10), pcVar.B0, true);
        if (pcVar.O1 != 1) {
            pcVar.O1 = 1;
            pcVar.I0.a(false, true);
            pcVar.i0(pcVar.O1 == 1, true);
            pcVar.Q0.a(pcVar.O1);
            l7 l7Var = pcVar.O0;
            boolean z11 = pcVar.O1 == 1;
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
        pc pcVar = this.a;
        int i10 = pcVar.c;
        if (!pcVar.q0()) {
            pcVar.B0.startTakePictureAnimation(true);
        }
        if ((pcVar.B0.isDual() && TextUtils.equals(pcVar.B0.getCameraSession().getCurrentFlashMode(), "off")) || pcVar.A0.j()) {
            if (!pcVar.A0.j()) {
                pcVar.B0.pauseAsTakingPicture();
            }
            Bitmap bitmap = pcVar.B0.getTextureView().getBitmap();
            try {
                fileOutputStream = new FileOutputStream(pcVar.G1.getAbsoluteFile());
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
            h7 h7Var = pcVar.C0;
            if (h7Var != null) {
                h7Var.c(true);
            }
            pcVar.P1 = CameraController.getInstance().takePicture(pcVar.G1, true, pcVar.B0.getCameraSessionObject(), new m2(6, this, callback));
            return;
        }
        pcVar.P1 = false;
        h7 h7Var2 = pcVar.C0;
        if (h7Var2 != null) {
            h7Var2.c(false);
        }
        o8 m10 = o8.m(0, pcVar.G1);
        m10.J0 = pcVar.v0;
        m10.K0 = pcVar.w0;
        if (!pcVar.A0.j()) {
            pcVar.K1 = m10;
            ja.a(i10, m10);
            pcVar.L1 = false;
            if (callback != null) {
                callback.run(new hb(this, 1));
                return;
            } else {
                pcVar.K(1, true);
                return;
            }
        }
        pcVar.G1 = null;
        if (pcVar.A0.l(m10)) {
            o8 a2 = o8.a(pcVar.A0.getLayout(), pcVar.A0.getContent());
            pcVar.K1 = a2;
            ja.a(i10, a2);
            pcVar.L1 = false;
            if (callback != null) {
                callback.run(null);
            }
        } else if (callback != null) {
            callback.run(null);
        }
        pcVar.m0(true);
    }
}
