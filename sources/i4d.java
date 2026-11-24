// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class i4d implements ca1, r56, av2, ka8, co7, ir9, v02, i8b, bc1, bb2, ia8, v49, lo2, o13, i33, u30, yr9, sa8 {
    public static i4d b;
    public static final cs4 c;
    public static final tef d;
    public final Object a;

    static {
        byte b2 = 1;
        c = new cs4(b2);
        d = new tef(b2);
    }

    public i4d(byte b2) {
        dgf dgfVar;
        w17 w17Var;
        switch (b2) {
            case 2:
                try {
                    dgfVar = (dgf) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    dgfVar = d;
                }
                agf agfVar = new agf(tef.b, dgfVar);
                Charset charset = eff.a;
                this.a = agfVar;
                break;
            case 7:
                this.a = new AtomicInteger(0);
                break;
            case 9:
                this.a = new CopyOnWriteArrayList();
                break;
            case 27:
                this.a = new ConcurrentHashMap(16);
                break;
            default:
                ft8 ft8Var = ft8.c;
                try {
                    w17Var = (w17) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused2) {
                    w17Var = c;
                }
                w17[] w17VarArr = {cs4.b, w17Var};
                zh6 zh6Var = new zh6();
                zh6Var.a = w17VarArr;
                Charset charset2 = mp5.a;
                this.a = zh6Var;
                break;
        }
    }

    public static synchronized i4d N2(Context context) {
        i4d P2;
        synchronized (i4d.class) {
            P2 = P2(context.getApplicationContext());
        }
        return P2;
    }

    public static synchronized i4d P2(Context context) {
        i4d i4dVar;
        synchronized (i4d.class) {
            i4dVar = b;
            if (i4dVar == null) {
                i4dVar = new i4d(context);
                b = i4dVar;
            }
        }
        return i4dVar;
    }

    @Override // u30
    public final void A(pd5 pd5Var) {
        tg2 tg2Var = ((FfmpegAudioRenderer) this.a).K;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new m30(tg2Var, pd5Var, (byte) 0));
        }
    }

    @Override // bb2
    public final boolean A1(gb2 gb2Var, int i) {
        return false;
    }

    @Override // u30
    public final void A2(long j, int i, long j2) {
        tg2 tg2Var = ((FfmpegAudioRenderer) this.a).K;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new l30((Object) tg2Var, i, j, j2, (byte) 0));
        }
    }

    @Override // bb2
    public final boolean B2(gb2 gb2Var, k27 k27Var) {
        return false;
    }

    @Override // r56
    public final void C(int i, int i2) {
        ((w39) this.a).j(i, i2);
    }

    @Override // sa8
    public final View C0() {
        return ((ou3) this.a).N1;
    }

    @Override // bb2
    public final boolean D0(gb2 gb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // co7
    public final void D2(Object obj) {
        aj0 aj0Var = (aj0) this.a;
        if (((Boolean) obj).booleanValue()) {
            if (aj0Var.S()) {
                aj0Var.X(aj0Var.q(R.string.fingerprint_not_recognized));
            }
            lj0 lj0Var = aj0Var.m0;
            if (lj0Var.l) {
                Executor executor = lj0Var.b;
                if (executor == null) {
                    executor = new yi0((byte) 1);
                }
                executor.execute(new ri0(aj0Var, (byte) 0));
            } else {
                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
            }
            lj0 lj0Var2 = aj0Var.m0;
            hh7 hh7Var = lj0Var2.s;
            if (hh7Var == null) {
                hh7Var = new hh7();
                lj0Var2.s = hh7Var;
            }
            lj0.f(hh7Var, Boolean.FALSE);
        }
    }

    @Override // u30
    public final void E1() {
        ((FfmpegAudioRenderer) this.a).b0 = true;
    }

    @Override // bb2
    public final gib E2() {
        return null;
    }

    @Override // bb2
    public final boolean F(gb2 gb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // bb2
    public final boolean F0(gb2 gb2Var) {
        return false;
    }

    @Override // sa8
    public final boolean F2() {
        return false;
    }

    @Override // ca1
    public final void G(String str) {
        u8 u8Var = (u8) this.a;
        u8Var.finishFragment(false);
        h45 h45Var = u8Var.y;
        LaunchActivity launchActivity = (LaunchActivity) h45Var.b;
        u8 u8Var2 = (u8) h45Var.c;
        String str2 = LaunchActivity.C1;
        hd hdVar = new hd(3, null, launchActivity);
        hdVar.j0 = false;
        hdVar.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.P).sendRequest(tL_auth_acceptLoginToken, new rv3(hdVar, u8Var2, (byte) 14));
    }

    @Override // sa8
    public final boolean G0() {
        return false;
    }

    @Override // v49
    public final void H1(View view, boolean z) {
        if (z == ((ChatAttachAlertPhotoLayout) this.a).L && (view instanceof o48)) {
            o48 o48Var = (o48) view;
            o48Var.y.c(o48Var);
        }
    }

    public final void I2(hj0 hj0Var, gj0 gj0Var) {
        Object obj = this.a;
        ho4 ho4Var = (ho4) obj;
        if (ho4Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (ho4Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        ho4 ho4Var2 = (ho4) obj;
        aj0 aj0Var = (aj0) ho4Var2.D("androidx.biometric.BiometricFragment");
        if (aj0Var == null) {
            aj0Var = new aj0();
            id0 id0Var = new id0(ho4Var2);
            id0Var.f(0, aj0Var, "androidx.biometric.BiometricFragment");
            id0Var.e(true, true);
            ho4Var2.A(true);
            ho4Var2.E();
        }
        en4 k = aj0Var.k();
        if (k == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        aj0Var.m0.d = hj0Var;
        int a = wmd.a(hj0Var, gj0Var);
        if (Build.VERSION.SDK_INT < 30 && a == 15 && gj0Var == null) {
            aj0Var.m0.e = rae.a();
        } else {
            aj0Var.m0.e = gj0Var;
        }
        boolean R = aj0Var.R();
        lj0 lj0Var = aj0Var.m0;
        if (R) {
            lj0Var.i = aj0Var.q(R.string.confirm_device_credential_password);
        } else {
            lj0Var.i = null;
        }
        if (aj0Var.R() && new ej0(new dj0(k)).a(kk7.d4) != 0) {
            aj0Var.m0.l = true;
            aj0Var.T();
        } else if (aj0Var.m0.n) {
            aj0Var.l0.postDelayed(new zi0(aj0Var), 600L);
        } else {
            aj0Var.Y();
        }
    }

    @Override // v49
    public final boolean J(int i) {
        return ((ChatAttachAlertPhotoLayout) this.a).H.d(i) == 0;
    }

    @Override // bb2
    public final boolean J0(long j) {
        return false;
    }

    @Override // ia8
    public final void J1(RectF rectF) {
        ((jjc) this.a).l(rectF);
    }

    public final void J2(dv8 dv8Var, Thread thread, Throwable th) {
        dy2 dy2Var = (dy2) this.a;
        synchronized (dy2Var) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            n9e.a();
            try {
                try {
                    u8c.a(((pz2) dy2Var.e.b).b(new by2(dy2Var, System.currentTimeMillis(), th, thread, dv8Var)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    @Override // u30
    public final void K() {
        ((FfmpegAudioRenderer) this.a).h0 = true;
    }

    @Override // i33
    public final void K0() {
        ((y23) this.a).e.invalidate();
    }

    @Override // bb2
    public final void K1(gb2 gb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        d01.t(gb2Var.getContext(), str);
    }

    public final void K2() {
        ((fx0) this.a).p0 = false;
    }

    @Override // o13
    public final void L(Object obj) {
        d03 d03Var = (d03) obj;
        d03Var.getClass();
        na1 na1Var = (na1) this.a;
        if (na1Var.r() instanceof tj7) {
            na1Var.resumeWith(new sa9(d03Var));
        }
    }

    public final void L2(cl1 cl1Var) {
        ((fx0) this.a).I0 = cl1Var;
    }

    public final void M2() {
        ((fx0) this.a).show();
    }

    @Override // bb2
    public final boolean N() {
        return false;
    }

    @Override // bb2
    public final boolean N1() {
        return false;
    }

    @Override // yr9
    public final vf6 O0() {
        return null;
    }

    public final synchronized void O2() {
        d1b d1bVar = (d1b) this.a;
        ReentrantLock reentrantLock = d1bVar.a;
        reentrantLock.lock();
        try {
            d1bVar.b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bb2
    public final boolean P() {
        return false;
    }

    @Override // sa8
    public final void P1() {
        ((ou3) this.a).F0();
    }

    @Override // bb2
    public final int Q() {
        return 0;
    }

    @Override // sa8
    public final int Q0() {
        return ((ou3) this.a).O1;
    }

    @Override // sa8
    public final int S1() {
        return ((ou3) this.a).P1;
    }

    @Override // sa8
    public final boolean T() {
        ou3 ou3Var = (ou3) this.a;
        return (ou3Var.N1 == ou3Var.l1 && ou3Var.x1 && "inapp".equals(na7.q1(ou3Var.a).k4.I0.f)) ? false : true;
    }

    @Override // bb2
    public final boolean T0(gb2 gb2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override // bb2
    public final boolean T1(gm gmVar) {
        return false;
    }

    @Override // bb2
    public final int U(gb2 gb2Var) {
        return 0;
    }

    @Override // lo2
    public final void U0() {
        pn2 pn2Var = (pn2) this.a;
        fm0 fm0Var = pn2Var.a;
        mo2 mo2Var = pn2Var.w;
        fm0Var.a(mo2Var.n && mo2Var.l == 0, true);
        pn2Var.d.g3.O(true);
    }

    @Override // yr9
    public final boolean U1(int i) {
        return i == ((mt9) this.a).e0;
    }

    @Override // v02
    public final boolean V1() {
        return false;
    }

    @Override // bb2
    public final vu1 W() {
        return null;
    }

    @Override // ca1
    public final boolean W0(String str, u91 u91Var) {
        return false;
    }

    @Override // sa8
    public final boolean Z(boolean z, float f, iv9 iv9Var) {
        return false;
    }

    @Override // ca1
    public final String Z0() {
        return null;
    }

    @Override // bb2
    public final ma8 Z1() {
        return null;
    }

    @Override // ir9
    public final void a(int i, boolean z) {
        lo0 lo0Var = ((eo0) this.a).d;
        lo0Var.e0 = i;
        lo0Var.I0(true);
    }

    @Override // sa8
    public final boolean a0() {
        return false;
    }

    @Override // sa8
    public final boolean a1() {
        return false;
    }

    @Override // sa8
    public final float a2() {
        return 0.0f;
    }

    @Override // bb2
    public final boolean b() {
        return false;
    }

    @Override // bb2
    public final String b1(gb2 gb2Var) {
        return null;
    }

    @Override // bb2
    public final boolean c2(long j) {
        return false;
    }

    @Override // lo2
    public final void close() {
        ((pn2) this.a).finishFragment();
    }

    @Override // u30
    public final void d(int i) {
        tg2 tg2Var = ((FfmpegAudioRenderer) this.a).K;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new eg((Object) tg2Var, i, (byte) 4));
        }
    }

    @Override // bb2
    public final boolean d0() {
        return false;
    }

    @Override // sa8
    public final boolean d1() {
        return false;
    }

    @Override // sa8
    public final void e() {
        stc stcVar = ((ou3) this.a).m1;
        if (stcVar == null || !stcVar.x) {
            return;
        }
        stcVar.a.f0();
        stcVar.n();
        stcVar.g0.d(true, true);
    }

    @Override // bb2
    public final CharacterStyle e0(gb2 gb2Var) {
        return null;
    }

    @Override // i8b
    public final void e1(long j, int i, g28 g28Var) {
        b81 b81Var = (b81) this.a;
        if (b81Var.b == null) {
            g28Var.run();
        }
        b81Var.b.post(g28Var);
    }

    @Override // v02
    public final boolean f0() {
        return false;
    }

    @Override // u30
    public final void f1() {
        ((FfmpegAudioRenderer) this.a).u();
    }

    @Override // r56
    public final void f2(int i, int i2) {
        ((w39) this.a).n(i, i2, null);
    }

    @Override // lo2
    public final void g0(long j) {
        ((pn2) this.a).presentFragment(mu1.U9(j));
    }

    @Override // bb2
    public final boolean g2(k27 k27Var) {
        return true;
    }

    @Override // sa8
    public final long getDuration() {
        return 0L;
    }

    @Override // u30
    public final void h(boolean z) {
        tg2 tg2Var = ((FfmpegAudioRenderer) this.a).K;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new x6c((byte) 3, tg2Var, z));
        }
    }

    @Override // bb2
    public final boolean h0() {
        return false;
    }

    @Override // bb2
    public final boolean h1(gb2 gb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // sa8
    public final boolean j() {
        return false;
    }

    @Override // ka8
    public final TextureView j0() {
        return null;
    }

    @Override // r56
    public final void j1(int i, int i2) {
        ((w39) this.a).q(i, i2);
    }

    @Override // sa8
    public final oc8 k1() {
        return null;
    }

    @Override // bb2
    public final boolean k2(gb2 gb2Var, TLRPC.User user) {
        return false;
    }

    @Override // bb2
    public final boolean l() {
        return true;
    }

    @Override // bb2
    public final boolean l2(gb2 gb2Var) {
        return false;
    }

    @Override // sa8
    public final long m() {
        return 0L;
    }

    @Override // sa8
    public final void m0(Rect rect) {
        rect.setEmpty();
    }

    @Override // yr9
    public final void m2(ArrayList arrayList) {
        mt9 mt9Var = (mt9) this.a;
        for (int i = 0; i < arrayList.size(); i++) {
            mt9Var.K.add(((xr9) arrayList.get(i)).a);
        }
        ji3 ji3Var = mt9Var.V;
        if (ji3Var != null) {
            ji3Var.d(mt9Var.E0 > 0, false);
        }
        mt9Var.f();
    }

    @Override // r56
    public final void n0(int i, int i2) {
        ((w39) this.a).p(i, i2);
    }

    @Override // v49
    public final boolean n2(int i) {
        jm6 M = ((ChatAttachAlertPhotoLayout) this.a).H.M(i);
        return M != null && ChatAttachAlertPhotoLayout.t1.containsKey(Integer.valueOf(M.C));
    }

    @Override // u30
    public final void o(long j) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.a;
        ffmpegAudioRenderer.i0 = true;
        tg2 tg2Var = ffmpegAudioRenderer.K;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new et((Object) tg2Var, j, (byte) 2));
        }
    }

    @Override // sa8
    public final View o0(LaunchActivity launchActivity) {
        return null;
    }

    @Override // o13
    public final void onResult(Object obj) {
        k03 k03Var = (k03) obj;
        k03Var.getClass();
        na1 na1Var = (na1) this.a;
        if (na1Var.r() instanceof tj7) {
            na1Var.resumeWith(k03Var);
        }
    }

    @Override // bb2
    public final void p() {
        a.t();
        boolean z = w01.a;
        a.q();
        d01.t(((kf1) this.a).n.getParentActivity(), w01.g);
    }

    @Override // sa8
    public final boolean p1() {
        return false;
    }

    @Override // ir9
    public final boolean q2(int i, View view) {
        return false;
    }

    @Override // yr9
    public final void r(int i) {
        mt9 mt9Var = (mt9) this.a;
        mt9Var.E0--;
        mt9Var.f0 = i;
        if (mt9Var.g0 != i) {
            mt9Var.s.clear();
        }
        if (mt9Var.h0 != i) {
            mt9Var.J.clear();
        }
        mt9Var.O = true;
        ji3 ji3Var = mt9Var.V;
        if (ji3Var != null) {
            ji3Var.d(mt9Var.E0 > 0, true);
        }
        mt9Var.f();
        ji3 ji3Var2 = mt9Var.V;
        if (ji3Var2 != null) {
            ji3Var2.c();
        }
    }

    @Override // bb2
    public final boolean r0(gb2 gb2Var, boolean z) {
        return false;
    }

    @Override // u30
    public final void s0(pd5 pd5Var) {
        tg2 tg2Var = ((FfmpegAudioRenderer) this.a).K;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new m30(tg2Var, pd5Var, (byte) 1));
        }
    }

    @Override // ia8
    public final void s1(boolean z) {
        ((jjc) this.a).setEditPillHidden(z);
    }

    @Override // yr9
    public final vf6 t1() {
        return null;
    }

    @Override // sa8
    public final int u() {
        return 0;
    }

    @Override // sa8
    public final void u1() {
        ou3 ou3Var = (ou3) this.a;
        ou3Var.M1 = null;
        ou3Var.E0();
    }

    @Override // v49
    public final void v(boolean z) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.a;
        chatAttachAlertPhotoLayout.M = z ? (byte) 1 : (byte) 0;
        chatAttachAlertPhotoLayout.F.e1(true);
    }

    @Override // i8b
    public final boolean w(long j, int i, int i2, int i3, j8b j8bVar) {
        b81 b81Var = (b81) this.a;
        if (b81Var.b != null) {
            int i4 = 0;
            while (true) {
                if (i4 >= b81Var.b.getChildCount()) {
                    break;
                }
                View childAt = b81Var.b.getChildAt(i4);
                if (childAt instanceof y71) {
                    y71 y71Var = (y71) childAt;
                    if (y71Var.n != null) {
                        for (int i5 = 0; i5 < y71Var.n.size(); i5++) {
                            ArrayList arrayList = ((z71) y71Var.n.valueAt(i5)).b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i2))) {
                                int keyAt = y71Var.n.keyAt(i5);
                                b81Var.i0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) y71Var.r.get(keyAt);
                                if (imageReceiver != null) {
                                    j8bVar.c = imageReceiver;
                                    sg0 sg0Var = b81Var.j0;
                                    if (sg0Var == null) {
                                        sg0Var = new sg0(this, (byte) 23);
                                        b81Var.j0 = sg0Var;
                                    }
                                    j8bVar.e = sg0Var;
                                    j8bVar.a = y71Var;
                                    j8bVar.g = b81Var.fragmentView;
                                    j8bVar.h = gl.L(36.0f);
                                    j8bVar.i = b81Var.fragmentView.getBottom();
                                    j8bVar.b = null;
                                    return true;
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                }
                i4++;
            }
        }
        return false;
    }

    @Override // bb2
    public final boolean w0(gb2 gb2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // u30
    public final void w1(Exception exc) {
        lad.d("DecoderAudioRenderer", "Audio sink error", exc);
        tg2 tg2Var = ((FfmpegAudioRenderer) this.a).K;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new j30(tg2Var, exc, (byte) 1));
        }
    }

    @Override // ia8
    public final jjc w2() {
        return (jjc) this.a;
    }

    @Override // bb2
    public final String x(long j) {
        return null;
    }

    @Override // ka8
    public final void y(k27 k27Var) {
        m mVar = ((o) this.a).v0[0];
        if (mVar != null) {
            mVar.b.J0(true);
        }
    }

    @Override // bb2
    public final boolean y1() {
        return false;
    }

    @Override // bb2
    public final boolean y2(int i) {
        return false;
    }

    @Override // bb2
    public final /* synthetic */ boolean z1(k27 k27Var) {
        return oo1.a(k27Var);
    }

    @Override // v02
    public final void z2(vq0 vq0Var) {
        int i;
        i = ((d) ((y31) this.a)).currentAccount;
        kk7.f(i).d(vq0Var);
    }

    @Override // ir9
    public final void B() {
    }

    @Override // bb2
    public final void B0() {
    }

    @Override // bb2
    public final void C2() {
    }

    @Override // v02
    public final void I0() {
    }

    @Override // sa8
    public final void L0() {
    }

    @Override // u30
    public final void R() {
    }

    @Override // bb2
    public final void R1() {
    }

    @Override // bb2
    public final void c() {
    }

    @Override // bb2
    public final void i1() {
    }

    @Override // sa8
    public final void k() {
    }

    @Override // ca1
    public final void onDismiss() {
    }

    @Override // u30
    public final void p2() {
    }

    @Override // bb2
    public final void t() {
    }

    @Override // i33
    public final void t2() {
    }

    @Override // bb2
    public final void u2() {
    }

    @Override // v02
    public final void y0() {
    }

    @Override // sa8
    public final void A0(SurfaceTexture surfaceTexture) {
    }

    @Override // bb2
    public final void D1(h27 h27Var) {
    }

    @Override // bb2
    public final void E(gb2 gb2Var) {
    }

    @Override // sa8
    public final void G2(int i) {
    }

    @Override // sa8
    public final void H0(ya8 ya8Var) {
    }

    @Override // bb2
    public final void H2(gb2 gb2Var) {
    }

    @Override // bb2
    public final void I(gb2 gb2Var) {
    }

    @Override // sa8
    public final void L1(View view) {
    }

    @Override // bb2
    public final void M1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void N0(gb2 gb2Var) {
    }

    @Override // v02
    public final void P0(Object obj) {
    }

    @Override // ca1
    public final void Q1(vf7 vf7Var) {
    }

    @Override // bb2
    public final void S(gb2 gb2Var) {
    }

    @Override // sa8
    public final void S0(float f) {
    }

    @Override // bb2
    public final void V(gb2 gb2Var) {
    }

    @Override // bb2
    public final void X(k27 k27Var) {
    }

    @Override // bb2
    public final void X0(gb2 gb2Var) {
    }

    @Override // bb2
    public final void X1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void Y1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void c0(int i) {
    }

    @Override // bb2
    public final void c1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void e2(gb2 gb2Var) {
    }

    @Override // sa8
    public final void f(long j) {
    }

    @Override // ir9
    public final void g(float f) {
    }

    @Override // v02
    public final void g1(TLRPC.User user) {
    }

    @Override // i33
    public final void h2(boolean z) {
    }

    @Override // i8b
    public final void i(boolean z) {
    }

    @Override // bb2
    public final void i0(k27 k27Var) {
    }

    @Override // bb2
    public final void k0(String str) {
    }

    @Override // bb2
    public final void l1(gb2 gb2Var) {
    }

    @Override // sa8
    public final void n(View view) {
    }

    @Override // bb2
    public final void n1(gb2 gb2Var) {
    }

    @Override // i33
    public final void o1(boolean z) {
    }

    @Override // sa8
    public final void p0(View view) {
    }

    @Override // bb2
    public final void q(gb2 gb2Var) {
    }

    @Override // bb2
    public final void q0(gb2 gb2Var) {
    }

    @Override // bb2
    public final void q1(gb2 gb2Var) {
    }

    @Override // ka8
    public final void t0(k27 k27Var) {
    }

    @Override // bb2
    public final void v2(gb2 gb2Var) {
    }

    @Override // sa8
    public final void x0(View view) {
    }

    @Override // bb2
    public final void x1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void C1(gb2 gb2Var, boolean z) {
    }

    @Override // bb2
    public final void E0(gb2 gb2Var, long j) {
    }

    @Override // bb2
    public final void F1(gb2 gb2Var, int i) {
    }

    @Override // bb2
    public final void M0(gb2 gb2Var, boolean z) {
    }

    @Override // bb2
    public final void O1(gb2 gb2Var, iq0 iq0Var) {
    }

    @Override // bb2
    public final void V0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // bb2
    public final void Y(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // bb2
    public final void b2(String str, String str2) {
    }

    @Override // bb2
    public final void d2(gb2 gb2Var, k08 k08Var) {
    }

    @Override // bb2
    public final void j2(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // bb2
    public final void l0(gb2 gb2Var, int i) {
    }

    @Override // sa8
    public final void o2(int i, ArrayList arrayList) {
    }

    @Override // bb2
    public final void u0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // bb2
    public final void G1(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override // bb2
    public final void H(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // bb2
    public final void O(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override // bb2
    public final void W1(gb2 gb2Var, TLObject tLObject, boolean z) {
    }

    @Override // bb2
    public final void Y0(gb2 gb2Var, float f, float f2) {
    }

    @Override // sa8
    public final void r2(Canvas canvas, int i, int i2) {
    }

    @Override // bb2
    public final void s2(gb2 gb2Var, float f, float f2) {
    }

    @Override // bb2
    public final void v0(gb2 gb2Var, int i, int i2) {
    }

    @Override // bb2
    public final void v1(gb2 gb2Var, float f, float f2) {
    }

    @Override // bb2
    public final void x2(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override // bb2
    public final void z(gb2 gb2Var, float f, float f2) {
    }

    public i4d(Context context) {
        String e;
        d1b a = d1b.a(context);
        this.a = a;
        a.b();
        String e2 = a.e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e2) || (e = a.e(d1b.f("googleSignInOptions", e2))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(e);
        } catch (JSONException unused) {
        }
    }

    public /* synthetic */ i4d(Object obj) {
        this.a = obj;
    }

    public i4d(LaunchActivity launchActivity, Executor executor, aod aodVar) {
        if (launchActivity == null) {
            w26.j("FragmentActivity must not be null.");
            throw null;
        }
        if (executor != null) {
            ho4 u = launchActivity.u();
            lj0 lj0Var = (lj0) new g29(launchActivity).k(lj0.class);
            this.a = u;
            lj0Var.b = executor;
            lj0Var.c = aodVar;
            return;
        }
        w26.j("Executor must not be null.");
        throw null;
    }

    public i4d(Context context, wjb wjbVar) {
        fx0 fx0Var = new fx0(1, wjbVar, context, false);
        this.a = fx0Var;
        fx0Var.K();
    }

    @Override // bb2
    public final void D(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // bb2
    public final void b0(gb2 gb2Var, TLRPC.User user, float f, float f2) {
    }

    @Override // bb2
    public final void s(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override // bb2
    public final void z0(gb2 gb2Var, float f, float f2, boolean z) {
    }

    @Override // bb2
    public final void M(gb2 gb2Var, int i, float f, float f2, boolean z) {
    }

    @Override // bb2
    public final void m1(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override // bb2
    public final void r1(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override // bb2
    public final void i2(gb2 gb2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
    }

    @Override // v02
    public final void R0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    @Override // bb2
    public final void I1(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
    }

    @Override // v02
    public final void B1(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
    }
}
