package nh;

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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class ca implements l6 {
    public final /* synthetic */ gb a;

    public ca(gb gbVar) {
        this.a = gbVar;
    }

    public final void a() {
        gb gbVar = this.a;
        ArrayList<o7> content = gbVar.w0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            gbVar.G1 = content.get(0);
        } else {
            gbVar.G1 = o7.a(gbVar.w0.getLayout(), gbVar.w0.getContent());
        }
        o7 o7Var = gbVar.G1;
        if (o7Var != null && o7Var.K) {
            i10 = 1;
        }
        gbVar.K1 = i10;
        z9 z9Var = gbVar.M0;
        if (z9Var != null) {
            z9Var.a(i10);
        }
        f9.a(gbVar.c, gbVar.G1);
        gbVar.K(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        gb gbVar = this.a;
        ka kaVar = gbVar.x0;
        if (kaVar == null || gbVar.O1 || gbVar.L1 || !kaVar.isInited()) {
            return;
        }
        gb gbVar2 = this.a;
        if (gbVar2.b0 != 0) {
            return;
        }
        t3 t3Var = gbVar2.i1;
        if (t3Var != null) {
            t3Var.e(true);
        }
        if (this.a.q0() && (arrayList = this.a.q2) != null && !arrayList.isEmpty()) {
            gb gbVar3 = this.a;
            ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) gbVar3.q2.get(gbVar3.p2)).commit();
        }
        this.a.x0.switchCamera();
        gb.a0(this.a.x0.isFrontface());
        if (this.a.q0()) {
            this.a.s.c(null);
        } else {
            this.a.s.d();
        }
    }

    public final void c() {
        ka kaVar;
        gb gbVar = this.a;
        if (gbVar.L1 || gbVar.O1 || gbVar.b0 != 0 || (kaVar = gbVar.x0) == null || !kaVar.isInited()) {
            return;
        }
        gbVar.S0.e(true);
        File file = gbVar.C1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            gbVar.C1 = null;
        }
        j6 j6Var = gbVar.y0;
        if (j6Var != null) {
            j6Var.c(true);
        }
        gbVar.C1 = o7.w(gbVar.c, "jpg");
        gbVar.L1 = true;
        gbVar.p();
        gbVar.Y1 = false;
        if (gbVar.x0.isFrontface() && gbVar.p2 == 1) {
            gb.a(gbVar);
        }
        if (!gbVar.q0()) {
            g(null);
            return;
        }
        p2 p2Var = gbVar.s;
        b0 b0Var = new b0(this, 8);
        p2Var.h(p2Var.p);
        p2Var.e(1.0f, 320L, new l2(p2Var, b0Var, 0));
    }

    public final void d(boolean z10) {
        gb gbVar = this.a;
        if (gbVar.N1 || !gbVar.M1) {
            return;
        }
        gbVar.N1 = true;
        AndroidUtilities.runOnUIThread(new aa(this, 0), z10 ? 0L : 400L);
    }

    public final void e(Runnable runnable, boolean z10) {
        ka kaVar;
        gb gbVar = this.a;
        if (gbVar.M1 || gbVar.N1 || gbVar.O1 || gbVar.b0 != 0 || (kaVar = gbVar.x0) == null || kaVar.getCameraSession() == null) {
            return;
        }
        t3 t3Var = gbVar.h1;
        if (t3Var != null) {
            t3Var.e(true);
        }
        t3 t3Var2 = gbVar.i1;
        if (t3Var2 != null) {
            t3Var2.e(true);
        }
        gbVar.S0.e(true);
        gbVar.M1 = true;
        j6 j6Var = gbVar.y0;
        if (j6Var != null) {
            j6Var.c(true);
        }
        File file = gbVar.C1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            gbVar.C1 = null;
        }
        gbVar.C1 = o7.x(gbVar.c, true);
        gbVar.p();
        gbVar.Y1 = false;
        if (gbVar.x0.isFrontface() && gbVar.p2 == 1) {
            gb.a(gbVar);
        }
        if (gbVar.q0()) {
            gbVar.s.c(new ba(this, z10, runnable));
        } else {
            f(runnable, z10);
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        gb gbVar = this.a;
        if (gbVar.x0 == null) {
            return;
        }
        CameraController.getInstance().recordVideo(gbVar.x0.getCameraSessionObject(), gbVar.C1, false, new l4.s0(this, 18), new ba(this, runnable, z10), gbVar.x0, true);
        if (gbVar.K1 != 1) {
            gbVar.K1 = 1;
            gbVar.E0.a(false, true);
            gbVar.i0(gbVar.K1 == 1, true);
            gbVar.M0.a(gbVar.K1);
            o6 o6Var = gbVar.K0;
            boolean z11 = gbVar.K1 == 1;
            o6Var.j0 = -1.0f;
            o6Var.k0 = z11;
            o6Var.invalidate();
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
        gb gbVar = this.a;
        int i10 = gbVar.c;
        if (!gbVar.q0()) {
            gbVar.x0.startTakePictureAnimation(true);
        }
        if ((gbVar.x0.isDual() && TextUtils.equals(gbVar.x0.getCameraSession().getCurrentFlashMode(), "off")) || gbVar.w0.j()) {
            if (!gbVar.w0.j()) {
                gbVar.x0.pauseAsTakingPicture();
            }
            Bitmap bitmap = gbVar.x0.getTextureView().getBitmap();
            try {
                fileOutputStream = new FileOutputStream(gbVar.C1.getAbsoluteFile());
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
            j6 j6Var = gbVar.y0;
            if (j6Var != null) {
                j6Var.c(true);
            }
            gbVar.L1 = CameraController.getInstance().takePicture(gbVar.C1, true, gbVar.x0.getCameraSessionObject(), new ih.b1(15, this, callback));
            return;
        }
        gbVar.L1 = false;
        j6 j6Var2 = gbVar.y0;
        if (j6Var2 != null) {
            j6Var2.c(false);
        }
        o7 m10 = o7.m(0, gbVar.C1);
        m10.J0 = gbVar.r0;
        m10.K0 = gbVar.s0;
        if (!gbVar.w0.j()) {
            gbVar.G1 = m10;
            f9.a(i10, m10);
            gbVar.H1 = false;
            if (callback != null) {
                callback.run(new aa(this, 1));
                return;
            } else {
                gbVar.K(1, true);
                return;
            }
        }
        gbVar.C1 = null;
        if (gbVar.w0.l(m10)) {
            o7 a2 = o7.a(gbVar.w0.getLayout(), gbVar.w0.getContent());
            gbVar.G1 = a2;
            f9.a(i10, a2);
            gbVar.H1 = false;
            if (callback != null) {
                callback.run(null);
            }
        } else if (callback != null) {
            callback.run(null);
        }
        gbVar.m0(true);
    }
}
