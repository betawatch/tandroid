// default package

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.Window;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nl9 implements gk, r27, pw0, cx9, cja, ue7, b27, kt9, iu1, i68, kj1, x69, wp2, a33, t43, u40, au9, vc8 {
    public static nl9 c;
    public static final ol9 d = new ol9(0, 0, 0, false, false);
    public static final Object e = new Object();
    public static volatile nl9 f;
    public final /* synthetic */ byte a;
    public Object b;

    public nl9(byte b) {
        this.a = b;
        switch (b) {
            case 10:
                this.b = new LongSparseArray();
                break;
            case 27:
                this.b = new ConcurrentHashMap(16);
                break;
            default:
                this.b = new lx6[ok.values().length];
                break;
        }
    }

    public static synchronized nl9 C0() {
        nl9 nl9Var;
        synchronized (nl9.class) {
            nl9Var = c;
            if (nl9Var == null) {
                nl9Var = new nl9((byte) 0, false);
                c = nl9Var;
            }
        }
        return nl9Var;
    }

    public static nl9 D0(Context context) {
        nl9 nl9Var;
        synchronized (e) {
            if (f == null) {
                Context applicationContext = context.getApplicationContext();
                boolean z = false;
                nl9 nl9Var2 = new nl9((byte) 1, z);
                mj4 mj4Var = new mj4((byte) 10, z);
                mj4Var.b = applicationContext;
                mj4Var.c = applicationContext.getContentResolver();
                nl9Var2.b = mj4Var;
                f = nl9Var2;
            }
            nl9Var = f;
        }
        return nl9Var;
    }

    @Override // a33
    public final void A(Object obj) {
        o13 o13Var = (o13) obj;
        o13Var.getClass();
        vb1 vb1Var = (vb1) this.b;
        if (vb1Var.r() instanceof wl7) {
            vb1Var.resumeWith(new sc9(o13Var));
        }
    }

    @Override // vc8
    public final boolean A0() {
        return false;
    }

    @Override // b27
    public final void B(y17 y17Var, c27 c27Var) {
        ((fe1) this.b).f.removeCallbacksAndMessages(y17Var);
    }

    @Override // vc8
    public final boolean D() {
        zv3 zv3Var = (zv3) this.b;
        return (zv3Var.N1 == zv3Var.l1 && zv3Var.x1 && "inapp".equals(oc7.r1(zv3Var.a).l4.I0.f)) ? false : true;
    }

    public final boolean E0(my6 my6Var) {
        mj4 mj4Var = (mj4) this.b;
        py6 py6Var = my6Var.a;
        mj4Var.getClass();
        int i = py6Var.c;
        String str = py6Var.a;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 == 23 && str.equals("android.media.session.MediaController")) {
                return true;
            }
            ApplicationInfo applicationInfo = ((Context) mj4Var.b).getPackageManager().getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                if (i2 < 28) {
                    i = applicationInfo.uid;
                }
                if (i == 1000 || i == Process.myUid() || mj4Var.r(py6Var, "android.permission.STATUS_BAR_SERVICE") || mj4Var.r(py6Var, "android.permission.MEDIA_CONTENT_CONTROL")) {
                    return true;
                }
                String string = Settings.Secure.getString((ContentResolver) mj4Var.c, "enabled_notification_listeners");
                if (string != null) {
                    for (String str2 : string.split(":")) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str2);
                        if (unflattenFromString != null && unflattenFromString.getPackageName().equals(str)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            ncd.b("MediaSessionManager", "Package " + str + " doesn't exist");
            return false;
        }
    }

    @Override // vc8
    public final boolean F(boolean z, float f2, lx9 lx9Var) {
        return false;
    }

    public final void F0(ex8 ex8Var, Thread thread, Throwable th) {
        nz2 nz2Var = (nz2) this.b;
        synchronized (nz2Var) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            obe.a();
            try {
                try {
                    vac.a(((a13) nz2Var.e.b).b(new lz2(nz2Var, System.currentTimeMillis(), th, thread, ex8Var)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e2) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e2);
            }
        }
    }

    @Override // au9
    public final boolean F1(int i) {
        return i == ((ov9) this.b).e0;
    }

    @Override // vc8
    public final boolean G() {
        return false;
    }

    @Override // au9
    public final vh6 G0() {
        return null;
    }

    @Override // wp2
    public final void H(long j) {
        ((ap2) this.b).presentFragment(yv1.ga(j));
    }

    @Override // vc8
    public final void I(Rect rect) {
        rect.setEmpty();
    }

    public final void I0(long j, long j2, long j3, Object obj) {
        LongSparseArray longSparseArray = (LongSparseArray) this.b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j);
        if (longSparseArray2 == null) {
            longSparseArray2 = new LongSparseArray();
            longSparseArray.put(j, longSparseArray2);
        }
        LongSparseArray longSparseArray3 = (LongSparseArray) longSparseArray2.get(j2);
        if (longSparseArray3 == null) {
            longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j2, longSparseArray3);
        }
        longSparseArray3.get(j3);
        longSparseArray3.put(j3, obj);
    }

    @Override // vc8
    public final View J(LaunchActivity launchActivity) {
        return null;
    }

    public final Object J0(long j, long j2, long j3) {
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2 = (LongSparseArray) ((LongSparseArray) this.b).get(j);
        if (longSparseArray2 == null || (longSparseArray = (LongSparseArray) longSparseArray2.get(j2)) == null) {
            return null;
        }
        Object obj = longSparseArray.get(j3);
        longSparseArray.remove(j3);
        return obj;
    }

    @Override // u40
    public final void L(nf5 nf5Var) {
        lx6 lx6Var = ((FfmpegAudioRenderer) this.b).K;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new m40(lx6Var, nf5Var, (byte) 1));
        }
    }

    @Override // iu1
    public final void N(String str) {
        ((yv1) ((bo0) this.b).c).sa(str, false);
    }

    @Override // vc8
    public final View O() {
        return ((zv3) this.b).N1;
    }

    @Override // vc8
    public final boolean P() {
        return false;
    }

    @Override // vc8
    public final int S() {
        return ((zv3) this.b).O1;
    }

    @Override // wp2
    public final void U() {
        ap2 ap2Var = (ap2) this.b;
        fn0 fn0Var = ap2Var.a;
        xp2 xp2Var = ap2Var.w;
        fn0Var.a(xp2Var.n && xp2Var.l == 0, true);
        ap2Var.d.g3.O(true);
    }

    @Override // vc8
    public final boolean V() {
        return false;
    }

    @Override // vc8
    public final boolean W() {
        return false;
    }

    @Override // u40
    public final void X() {
        ((FfmpegAudioRenderer) this.b).u();
    }

    @Override // vc8
    public final re8 Y() {
        return null;
    }

    @Override // kt9
    public final void a(int i, boolean z) {
        sh1 sh1Var = ((qh1) this.b).f;
        sh1Var.E = i;
        sh1Var.d(true);
    }

    @Override // vc8
    public final boolean a0() {
        return false;
    }

    @Override // au9
    public final void a2(ArrayList arrayList) {
        ov9 ov9Var = (ov9) this.b;
        for (int i = 0; i < arrayList.size(); i++) {
            ov9Var.K.add(((zt9) arrayList.get(i)).a);
        }
        uj3 uj3Var = ov9Var.V;
        if (uj3Var != null) {
            uj3Var.d(ov9Var.E0 > 0, false);
        }
        ov9Var.f();
    }

    @Override // u40
    public final void b(int i) {
        lx6 lx6Var = ((FfmpegAudioRenderer) this.b).K;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new eh((Object) lx6Var, i, (byte) 4));
        }
    }

    @Override // cja
    public final float b0() {
        return b10.c(9.66f, eh0.d(((y71) this.b).Q), 0);
    }

    @Override // vc8
    public final void c() {
        tvc tvcVar = ((zv3) this.b).m1;
        if (tvcVar == null || !tvcVar.x) {
            return;
        }
        tvcVar.a.f0();
        tvcVar.n();
        tvcVar.g0.d(true, true);
    }

    @Override // t43
    public final void c0() {
        ((j43) this.b).e.invalidate();
    }

    @Override // wp2
    public final void close() {
        ((ap2) this.b).finishFragment();
    }

    @Override // r27
    public final void d(y17 y17Var, boolean z) {
        switch (this.a) {
            case 3:
                if (y17Var instanceof dcb) {
                    ((dcb) y17Var).z.k().c(false);
                }
                r27 r27Var = ((b9) this.b).e;
                if (r27Var != null) {
                    r27Var.d(y17Var, z);
                    break;
                }
                break;
            default:
                ((bq) this.b).g(y17Var);
                break;
        }
    }

    @Override // kj1
    public final void d0(boolean z) {
        ((jlc) this.b).setEditPillHidden(z);
    }

    @Override // vc8
    public final void e0() {
        zv3 zv3Var = (zv3) this.b;
        zv3Var.M1 = null;
        zv3Var.E0();
    }

    @Override // au9
    public final vh6 e1() {
        return null;
    }

    @Override // u40
    public final void f(boolean z) {
        lx6 lx6Var = ((FfmpegAudioRenderer) this.b).K;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new y8c((byte) 3, lx6Var, z));
        }
    }

    @Override // u40
    public final void f0(Exception exc) {
        ncd.d("DecoderAudioRenderer", "Audio sink error", exc);
        lx6 lx6Var = ((FfmpegAudioRenderer) this.b).K;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new j40(lx6Var, exc, (byte) 1));
        }
    }

    @Override // b27
    public final void g0(y17 y17Var, c27 c27Var) {
        fe1 fe1Var = (fe1) this.b;
        Handler handler = fe1Var.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fe1Var.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (y17Var == ((ee1) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new de1(this, i2 < arrayList.size() ? (ee1) arrayList.get(i2) : null, c27Var, y17Var), y17Var, SystemClock.uptimeMillis() + 200);
    }

    @Override // cx9
    public final CharSequence getContentDescription() {
        i30 i30Var = (i30) this.b;
        return jb6.a0("AccDescrPlayerDuration", null, 2131754805, jb6.G(i30Var.w2 / 60, "Minutes", new Object[0]) + ' ' + jb6.G(i30Var.w2 % 60, "Seconds", new Object[0]), jb6.G(i30Var.x2 / 60, "Minutes", new Object[0]) + ' ' + jb6.G(i30Var.x2 % 60, "Seconds", new Object[0]));
    }

    @Override // vc8
    public final long getDuration() {
        return 0L;
    }

    @Override // u40
    public final void h(long j) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        ffmpegAudioRenderer.i0 = true;
        lx6 lx6Var = ffmpegAudioRenderer.K;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new fu((Object) lx6Var, j, (byte) 2));
        }
    }

    @Override // cja
    public final int h0() {
        return ((y71) this.b).R;
    }

    @Override // vc8
    public final boolean i() {
        return false;
    }

    @Override // u40
    public final void i0() {
        ((FfmpegAudioRenderer) this.b).b0 = true;
    }

    @Override // cx9
    public final int j0() {
        return 0;
    }

    @Override // vc8
    public final long k() {
        return 0L;
    }

    @Override // x69
    public final void k0(View view, boolean z) {
        if (z == ((ChatAttachAlertPhotoLayout) this.b).L && (view instanceof q68)) {
            q68 q68Var = (q68) view;
            q68Var.y.c(q68Var);
        }
    }

    @Override // kj1
    public final void l0(RectF rectF) {
        ((jlc) this.b).l(rectF);
    }

    @Override // cx9
    public final void n(boolean z, float f2) {
        if (z) {
            MediaController.w().h0(MediaController.w().v0, f2);
        }
        k47 k47Var = MediaController.w().v0;
        if (k47Var == null || !k47Var.I3()) {
            return;
        }
        ((i30) this.b).W0(k47Var, false);
    }

    @Override // vc8
    public final void n0() {
        ((zv3) this.b).F0();
    }

    @Override // au9
    public final void o(int i) {
        ov9 ov9Var = (ov9) this.b;
        ov9Var.E0--;
        ov9Var.f0 = i;
        if (ov9Var.g0 != i) {
            ov9Var.s.clear();
        }
        if (ov9Var.h0 != i) {
            ov9Var.J.clear();
        }
        ov9Var.O = true;
        uj3 uj3Var = ov9Var.V;
        if (uj3Var != null) {
            uj3Var.d(ov9Var.E0 > 0, true);
        }
        ov9Var.f();
        uj3 uj3Var2 = ov9Var.V;
        if (uj3Var2 != null) {
            uj3Var2.c();
        }
    }

    @Override // vc8
    public final int o0() {
        return ((zv3) this.b).P1;
    }

    @Override // a33
    public final void onResult(Object obj) {
        w13 w13Var = (w13) obj;
        w13Var.getClass();
        vb1 vb1Var = (vb1) this.b;
        if (vb1Var.r() instanceof wl7) {
            vb1Var.resumeWith(w13Var);
        }
    }

    @Override // vc8
    public final int p() {
        return 0;
    }

    @Override // vc8
    public final float p0() {
        return 0.0f;
    }

    @Override // x69
    public final void q(boolean z) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
        chatAttachAlertPhotoLayout.M = z ? (byte) 1 : (byte) 0;
        chatAttachAlertPhotoLayout.F.e1(true);
    }

    @Override // x69
    public final boolean r0(int i) {
        jo6 M = ((ChatAttachAlertPhotoLayout) this.b).H.M(i);
        return M != null && ChatAttachAlertPhotoLayout.t1.containsKey(Integer.valueOf(M.C));
    }

    @Override // cja
    public final void t(boolean z) {
        fn0 fn0Var = ((y71) this.b).U;
        if (fn0Var == null || fn0Var.f == z) {
            return;
        }
        fn0Var.a(z, true);
    }

    @Override // i68
    public final void t0() {
        try {
            Intent intent = new Intent();
            intent.setType("video/*");
            intent.setAction("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.sizeLimit", 2097152000L);
            Intent intent2 = new Intent("android.intent.action.PICK");
            intent2.setType("image/*");
            Intent createChooser = Intent.createChooser(intent2, null);
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
            ((yv1) this.b).startActivityForResult(createChooser, 1);
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override // u40
    public final void u(nf5 nf5Var) {
        lx6 lx6Var = ((FfmpegAudioRenderer) this.b).K;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new m40(lx6Var, nf5Var, (byte) 0));
        }
    }

    @Override // u40
    public final void v() {
        ((FfmpegAudioRenderer) this.b).h0 = true;
    }

    @Override // kj1
    public final View v0() {
        return (jlc) this.b;
    }

    @Override // x69
    public final boolean w(int i) {
        return ((ChatAttachAlertPhotoLayout) this.b).H.d(i) == 0;
    }

    @Override // r27
    public final boolean w0(y17 y17Var) {
        switch (this.a) {
            case 3:
                b9 b9Var = (b9) this.b;
                if (y17Var != b9Var.c) {
                    c27 c27Var = ((dcb) y17Var).A;
                    r27 r27Var = b9Var.e;
                    if (r27Var != null) {
                        return r27Var.w0(y17Var);
                    }
                }
                return false;
            default:
                Window.Callback callback = ((bq) this.b).f.getCallback();
                if (callback == null) {
                    return true;
                }
                callback.onMenuOpened(nm7.s1, y17Var);
                return true;
        }
    }

    @Override // u40
    public final void x0(long j, int i, long j2) {
        lx6 lx6Var = ((FfmpegAudioRenderer) this.b).K;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new l40((Object) lx6Var, i, j, j2, (byte) 0));
        }
    }

    @Override // gk
    public final void y(int i, int i2, boolean z) {
        switch (this.a) {
            case 2:
                a1 a1Var = (a1) this.b;
                a1Var.l1(i, i2, z);
                a1Var.dismiss();
                break;
            default:
                gm.d3(new eh((Object) this, i, (byte) 6), 50L);
                break;
        }
    }

    @Override // kt9
    public final boolean y0(int i, View view) {
        return false;
    }

    @Override // ue7
    public final void z(boolean z) {
        tk5 tk5Var;
        tk5 tk5Var2;
        tk5 tk5Var3;
        tk5 tk5Var4;
        k91 k91Var = (k91) this.b;
        k91Var.finishFragment();
        tk5Var = ((d) k91Var).parentLayout;
        if (tk5Var != null) {
            tk5Var2 = ((d) k91Var).parentLayout;
            if (tk5Var2.getFragmentStack().size() >= 2) {
                tk5Var3 = ((d) k91Var).parentLayout;
                List fragmentStack = tk5Var3.getFragmentStack();
                tk5Var4 = ((d) k91Var).parentLayout;
                d dVar = (d) fragmentStack.get(tk5Var4.getFragmentStack().size() - 2);
                if (dVar instanceof yv1) {
                    ((yv1) dVar).k6(k91Var.Q, k91Var.R + 86400, z);
                    return;
                }
                return;
            }
        }
        yv1 yv1Var = k91Var.O;
        if (yv1Var != null) {
            yv1Var.k6(k91Var.Q, k91Var.R + 86400, z);
        }
    }

    public final LongSparseArray z0(long j, long j2) {
        LongSparseArray longSparseArray = (LongSparseArray) ((LongSparseArray) this.b).get(j);
        if (longSparseArray == null) {
            return null;
        }
        return (LongSparseArray) longSparseArray.get(j2);
    }

    @Override // u40
    public final void C() {
    }

    @Override // vc8
    public final void R() {
    }

    @Override // t43
    public final void W0() {
    }

    @Override // vc8
    public final void j() {
    }

    @Override // kt9
    public final void s() {
    }

    @Override // u40
    public final void s0() {
    }

    @Override // cx9
    public final void x() {
    }

    @Override // vc8
    public final void B0(int i) {
    }

    @Override // t43
    public final void H0(boolean z) {
    }

    @Override // vc8
    public final void K(View view) {
    }

    @Override // vc8
    public final void M(View view) {
    }

    @Override // vc8
    public final void Q(bd8 bd8Var) {
    }

    @Override // t43
    public final void R0(boolean z) {
    }

    @Override // vc8
    public final void T(float f2) {
    }

    @Override // iu1
    public final void Z(int i) {
    }

    @Override // vc8
    public final void e(long j) {
    }

    @Override // kt9
    public final void g(float f2) {
    }

    @Override // vc8
    public final void l(View view) {
    }

    @Override // i68
    public final void m(ArrayList arrayList) {
    }

    @Override // vc8
    public final void m0(View view) {
    }

    @Override // iu1
    public final void E(boolean z, boolean z2) {
    }

    @Override // vc8
    public final void q0(int i, ArrayList arrayList) {
    }

    @Override // vc8
    public final void r(SurfaceTexture surfaceTexture, Bitmap bitmap) {
    }

    public /* synthetic */ nl9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public nl9(xk5 xk5Var) {
        this.a = (byte) 9;
        ite.h(xk5Var);
        this.b = xk5Var;
    }

    public /* synthetic */ nl9(byte b, boolean z) {
        this.a = b;
    }

    @Override // vc8
    public final void u0(Canvas canvas, int i, int i2) {
    }
}
