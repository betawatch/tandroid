// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class k6d implements kb1, r76, kw2, nc8, fq7, kt9, g22, kab, jd1, mc2, gk, r17, g94, au9, t43, ma6, rv9 {
    public static k6d c;
    public static final du4 d;
    public static final ugf e;
    public final /* synthetic */ byte a;
    public final Object b;

    static {
        byte b = 1;
        d = new du4(b);
        e = new ugf(b);
    }

    public k6d(byte b) {
        eif eifVar;
        w37 w37Var;
        this.a = b;
        switch (b) {
            case 2:
                try {
                    eifVar = (eif) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    eifVar = e;
                }
                bif bifVar = new bif(ugf.b, eifVar);
                Charset charset = fhf.a;
                this.b = bifVar;
                break;
            case 7:
                this.b = new AtomicInteger(0);
                break;
            case 9:
                this.b = new CopyOnWriteArrayList();
                break;
            case 25:
                this.b = new oo8(iu4.l, (byte) 5);
                break;
            default:
                gv8 gv8Var = gv8.c;
                try {
                    w37Var = (w37) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused2) {
                    w37Var = d;
                }
                w37[] w37VarArr = {du4.b, w37Var};
                bk6 bk6Var = new bk6();
                bk6Var.a = w37VarArr;
                Charset charset2 = mr5.a;
                this.b = bk6Var;
                break;
        }
    }

    public static synchronized k6d r1(Context context) {
        k6d v1;
        synchronized (k6d.class) {
            v1 = v1(context.getApplicationContext());
        }
        return v1;
    }

    public static synchronized k6d v1(Context context) {
        k6d k6dVar;
        synchronized (k6d.class) {
            k6dVar = c;
            if (k6dVar == null) {
                k6dVar = new k6d(context);
                c = k6dVar;
            }
        }
        return k6dVar;
    }

    @Override // mc2
    public final boolean A0(long j) {
        return false;
    }

    @Override // g22
    public final boolean B() {
        return false;
    }

    @Override // kb1
    public final String B0() {
        return null;
    }

    @Override // r76
    public final void C(int i, int i2) {
        ((y59) this.b).p(i, i2);
    }

    @Override // r76
    public final void C0(int i, int i2) {
        ((y59) this.b).q(i, i2);
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        ((n92) this.b).j0(f);
    }

    @Override // mc2
    public final boolean D1(gn gnVar) {
        return false;
    }

    @Override // mc2
    public final boolean E(rc2 rc2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // au9
    public final boolean F1(int i) {
        return true;
    }

    @Override // au9
    public final vh6 G0() {
        return null;
    }

    @Override // nc8
    public final TextureView J() {
        return null;
    }

    @Override // mc2
    public final boolean J0(rc2 rc2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override // mc2
    public final boolean K() {
        return false;
    }

    @Override // g22
    public final boolean K0() {
        return false;
    }

    @Override // mc2
    public final pc8 M1() {
        return null;
    }

    @Override // mc2
    public final boolean N() {
        return false;
    }

    @Override // mc2
    public final int O() {
        return 0;
    }

    @Override // r76
    public final void O0(int i, int i2) {
        ((y59) this.b).n(i, i2, null);
    }

    @Override // mc2
    public final boolean O1(long j) {
        return false;
    }

    @Override // mc2
    public final String P0(rc2 rc2Var) {
        return null;
    }

    @Override // mc2
    public final int Q(rc2 rc2Var) {
        return 0;
    }

    @Override // mc2
    public final hw1 S() {
        return null;
    }

    @Override // mc2
    public final boolean S0(rc2 rc2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // mc2
    public final boolean U1(k47 k47Var) {
        return true;
    }

    @Override // g94
    public final void V(float f, int i) {
        n92 n92Var = (n92) this.b;
        n92Var.c.setLayerType(0, null);
        if (f == 0.0f && !n92Var.P) {
            n92Var.c.setVisibility(4);
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                n92Var.F.setFocusableInTouchMode(false);
            }
        }
        nm7.e().k(nm7.k1, 512);
    }

    @Override // kb1
    public final boolean X(String str, db1 db1Var) {
        return false;
    }

    @Override // r17
    public final void Y0(int i, int i2, CharSequence charSequence, boolean z) {
        i22 i22Var = (i22) this.b;
        if (i22Var.U0() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i22Var.U0().getText());
            spannableStringBuilder.replace(i, i2 + i, charSequence);
            if (z) {
                gw3.l(spannableStringBuilder, i22Var.U0().getEditText().getPaint().getFontMetricsInt(), false);
            }
            i22Var.U0().setText(spannableStringBuilder);
            i22Var.U0().setSelection(i + charSequence.length());
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override // mc2
    public final boolean Y1(rc2 rc2Var, TLRPC.User user) {
        return false;
    }

    @Override // mc2
    public final boolean Z() {
        return false;
    }

    @Override // mc2
    public final boolean Z1(rc2 rc2Var) {
        return false;
    }

    @Override // kt9
    public final void a(int i, boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 12:
                lp0 lp0Var = ((ep0) obj).d;
                lp0Var.e0 = i;
                lp0Var.J0(true);
                break;
            default:
                ug3 ug3Var = (ug3) obj;
                tg3[] tg3VarArr = ug3Var.f;
                if (tg3VarArr[0].f != i) {
                    ug3Var.x = i == ug3Var.e.getFirstTabId();
                    tg3 tg3Var = tg3VarArr[1];
                    tg3Var.f = i;
                    tg3Var.setVisibility(0);
                    ug3Var.r0(true);
                    ug3Var.r = z;
                    break;
                }
                break;
        }
    }

    @Override // mc2
    public final CharacterStyle a0(rc2 rc2Var) {
        return null;
    }

    @Override // g22
    public final void a1(vr0 vr0Var) {
        int i;
        i = ((d) ((f51) this.b)).currentAccount;
        nm7.f(i).d(vr0Var);
    }

    @Override // mc2
    public final boolean b() {
        return false;
    }

    @Override // t43
    public final void c0() {
        ((e43) this.b).d.invalidate();
    }

    @Override // ma6
    public final void d() {
        c73 c73Var = (c73) this.b;
        c73Var.F.d();
        IOException iOException = c73Var.H;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // mc2
    public final boolean d0() {
        return false;
    }

    @Override // au9
    public final vh6 e1() {
        return null;
    }

    @Override // mc2
    public final boolean f() {
        return true;
    }

    public final void f1() {
        ((my0) this.b).p0 = false;
    }

    @Override // rv9
    public final void finish() {
        Point point = gm.q;
        if (point.x > point.y) {
            ((nk3) this.b).finishPreviewFragment();
        }
    }

    @Override // kt9
    public final void g(float f) {
        switch (this.a) {
            case 12:
                break;
            default:
                ug3 ug3Var = (ug3) this.b;
                tg3[] tg3VarArr = ug3Var.f;
                if (f != 1.0f || tg3VarArr[1].getVisibility() == 0) {
                    if (ug3Var.r) {
                        tg3VarArr[0].setTranslationX((-f) * r6.getMeasuredWidth());
                        tg3VarArr[1].setTranslationX(tg3VarArr[0].getMeasuredWidth() - (f * tg3VarArr[0].getMeasuredWidth()));
                    } else {
                        tg3VarArr[0].setTranslationX(r6.getMeasuredWidth() * f);
                        tg3VarArr[1].setTranslationX((f * tg3VarArr[0].getMeasuredWidth()) - tg3VarArr[0].getMeasuredWidth());
                    }
                    if (f == 1.0f) {
                        tg3 tg3Var = tg3VarArr[0];
                        tg3VarArr[0] = tg3VarArr[1];
                        tg3VarArr[1] = tg3Var;
                        tg3Var.setVisibility(8);
                        break;
                    }
                }
                break;
        }
    }

    public final void g1(km1 km1Var) {
        ((my0) this.b).I0 = km1Var;
    }

    @Override // kab
    public final boolean h(long j, int i, int i2, int i3, lab labVar) {
        k91 k91Var = (k91) this.b;
        if (k91Var.b != null) {
            int i4 = 0;
            while (true) {
                if (i4 >= k91Var.b.getChildCount()) {
                    break;
                }
                View childAt = k91Var.b.getChildAt(i4);
                if (childAt instanceof h91) {
                    h91 h91Var = (h91) childAt;
                    if (h91Var.n != null) {
                        for (int i5 = 0; i5 < h91Var.n.size(); i5++) {
                            ArrayList arrayList = ((i91) h91Var.n.valueAt(i5)).b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i2))) {
                                int keyAt = h91Var.n.keyAt(i5);
                                k91Var.i0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) h91Var.r.get(keyAt);
                                if (imageReceiver != null) {
                                    labVar.c = imageReceiver;
                                    xg0 xg0Var = k91Var.j0;
                                    if (xg0Var == null) {
                                        xg0Var = new xg0(this, (byte) 26);
                                        k91Var.j0 = xg0Var;
                                    }
                                    labVar.e = xg0Var;
                                    labVar.a = h91Var;
                                    labVar.g = k91Var.fragmentView;
                                    labVar.h = gm.L(36.0f);
                                    labVar.i = k91Var.fragmentView.getBottom();
                                    labVar.b = null;
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

    public final void h1() {
        ((my0) this.b).show();
    }

    @Override // mc2
    public final void i() {
        a.t();
        boolean z = e21.a;
        a.q();
        l11.u(((sg1) this.b).n.getParentActivity(), e21.g);
    }

    @Override // rv9
    public final void j(float f) {
        Point point = gm.q;
        if (point.x > point.y) {
            ((nk3) this.b).movePreviewFragment(f);
        }
    }

    @Override // fq7
    public final void j1(Object obj) {
        ak0 ak0Var = (ak0) this.b;
        if (((Boolean) obj).booleanValue()) {
            if (ak0Var.S()) {
                ak0Var.X(ak0Var.q(R.string.fingerprint_not_recognized));
            }
            lk0 lk0Var = ak0Var.m0;
            if (lk0Var.l) {
                Executor executor = lk0Var.b;
                if (executor == null) {
                    executor = new yj0((byte) 1);
                }
                executor.execute(new rj0(ak0Var, (byte) 0));
            } else {
                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
            }
            lk0 lk0Var2 = ak0Var.m0;
            kj7 kj7Var = lk0Var2.s;
            if (kj7Var == null) {
                kj7Var = new kj7();
                lk0Var2.s = kj7Var;
            }
            lk0.f(kj7Var, Boolean.FALSE);
        }
    }

    @Override // r76
    public final void l(int i, int i2) {
        ((y59) this.b).j(i, i2);
    }

    @Override // mc2
    public final boolean l0(rc2 rc2Var, boolean z) {
        return false;
    }

    @Override // mc2
    public final boolean l1() {
        return false;
    }

    @Override // mc2
    public final /* synthetic */ boolean m1(k47 k47Var) {
        return aq1.a(k47Var);
    }

    @Override // mc2
    public final boolean m2(int i) {
        return false;
    }

    public final void n(hk0 hk0Var, gk0 gk0Var) {
        Object obj = this.b;
        iq4 iq4Var = (iq4) obj;
        if (iq4Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (iq4Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        iq4 iq4Var2 = (iq4) obj;
        ak0 ak0Var = (ak0) iq4Var2.D("androidx.biometric.BiometricFragment");
        if (ak0Var == null) {
            ak0Var = new ak0();
            ie0 ie0Var = new ie0(iq4Var2);
            ie0Var.f(0, ak0Var, "androidx.biometric.BiometricFragment");
            ie0Var.e(true, true);
            iq4Var2.A(true);
            iq4Var2.E();
        }
        gp4 k = ak0Var.k();
        if (k == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        ak0Var.m0.d = hk0Var;
        int a = zod.a(hk0Var, gk0Var);
        if (Build.VERSION.SDK_INT < 30 && a == 15 && gk0Var == null) {
            ak0Var.m0.e = sce.a();
        } else {
            ak0Var.m0.e = gk0Var;
        }
        boolean R = ak0Var.R();
        lk0 lk0Var = ak0Var.m0;
        if (R) {
            lk0Var.i = ak0Var.q(R.string.confirm_device_credential_password);
        } else {
            lk0Var.i = null;
        }
        if (ak0Var.R() && new ek0(new dk0(k, (byte) 0)).a(nm7.d4) != 0) {
            ak0Var.m0.l = true;
            ak0Var.T();
        } else if (ak0Var.m0.n) {
            ak0Var.l0.postDelayed(new zj0(ak0Var), 600L);
        } else {
            ak0Var.Y();
        }
    }

    @Override // mc2
    public final boolean n1(rc2 rc2Var, int i) {
        return false;
    }

    @Override // mc2
    public final boolean n2(rc2 rc2Var, k47 k47Var) {
        return false;
    }

    @Override // au9
    public final void o(int i) {
        gm.c3(new xf2(this, (byte) 2));
    }

    @Override // nc8
    public final void p(k47 k47Var) {
        m mVar = ((o) this.b).v0[0];
        if (mVar != null) {
            mVar.b.J0(true);
        }
    }

    @Override // mc2
    public final boolean p0(rc2 rc2Var, TLRPC.Chat chat) {
        return false;
    }

    public final void p1(int i, Object obj, os9 os9Var) {
        pl2 pl2Var = (pl2) this.b;
        pl2Var.A(i, 3);
        os9Var.g((o3) obj, pl2Var.a);
        pl2Var.A(i, 4);
    }

    @Override // mc2
    public final hkb p2() {
        return null;
    }

    @Override // kab
    public final void q0(long j, int i, j48 j48Var) {
        k91 k91Var = (k91) this.b;
        if (k91Var.b == null) {
            j48Var.run();
        }
        k91Var.b.post(j48Var);
    }

    @Override // kt9
    public final void s() {
        byte b = this.a;
    }

    public final synchronized void s1() {
        f3b f3bVar = (f3b) this.b;
        ReentrantLock reentrantLock = f3bVar.a;
        reentrantLock.lock();
        try {
            f3bVar.b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // mc2
    public final String t(long j) {
        return null;
    }

    @Override // mc2
    public final boolean t0(rc2 rc2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // r17
    public final Paint.FontMetricsInt u0() {
        return ((i22) this.b).B2.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // kb1
    public final void v(String str) {
        u8 u8Var = (u8) this.b;
        u8Var.finishFragment(false);
        nv4 nv4Var = u8Var.y;
        LaunchActivity launchActivity = (LaunchActivity) nv4Var.b;
        u8 u8Var2 = (u8) nv4Var.c;
        String str2 = LaunchActivity.C1;
        he heVar = new he(3, null, launchActivity);
        heVar.j0 = false;
        heVar.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.P).sendRequest(tL_auth_acceptLoginToken, new cx3(heVar, u8Var2, (byte) 14));
    }

    @Override // rv9
    public final void w(hg3 hg3Var) {
        ((nk3) this.b).c5(hg3Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x033b, code lost:
    
        throw ho4.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0397 A[LOOP:21: B:146:0x022e->B:193:0x0397, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0362 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final oa3 x(yh4 yh4Var) {
        ig7 ig7Var;
        g54 g54Var;
        int i;
        int f;
        int f2;
        ybc D = yh4Var.D();
        g54 g54Var2 = yh4Var.C().a;
        io4 C = yh4Var.C();
        ybc D2 = yh4Var.D();
        int i2 = wi8.G(8)[C.b];
        qk0 qk0Var = (qk0) yh4Var.b;
        int i3 = qk0Var.b;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            for (int i6 = 0; i6 < i3; i6++) {
                if (ts2.a(i2, i5, i6)) {
                    qk0Var.a(i6, i5);
                }
            }
        }
        int i7 = 2;
        int i8 = D2.a << 2;
        int i9 = i8 + 17;
        int i10 = D2.d;
        qk0 qk0Var2 = new qk0(i9, i9);
        qk0Var2.d(0, 0, 9, 9);
        int i11 = i8 + 9;
        qk0Var2.d(i11, 0, 8, 9);
        qk0Var2.d(0, i11, 9, 8);
        int[] iArr = D2.b;
        int length = iArr.length;
        int i12 = 0;
        while (i12 < length) {
            int i13 = iArr[i12] - 2;
            int i14 = i7;
            for (int i15 = i4; i15 < length; i15++) {
                if ((i12 != 0 || (i15 != 0 && i15 != length - 1)) && (i12 != length - 1 || i15 != 0)) {
                    qk0Var2.d(iArr[i15] - 2, i13, 5, 5);
                }
            }
            i12++;
            i7 = i14;
            i4 = 0;
        }
        int i16 = i7;
        int i17 = 6;
        int i18 = 1;
        qk0Var2.d(6, 9, 1, i8);
        qk0Var2.d(9, 6, i8, 1);
        if (D2.a > 6) {
            int i19 = i8 + 6;
            qk0Var2.d(i19, 0, 3, 6);
            qk0Var2.d(0, i19, 6, 3);
        }
        byte[] bArr = new byte[i10];
        int i20 = i3 - 1;
        int i21 = i20;
        boolean z = true;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        while (i21 > 0) {
            if (i21 == i17) {
                i21--;
            }
            int i25 = 0;
            while (i25 < i3) {
                int i26 = z ? i20 - i25 : i25;
                int i27 = i18;
                int i28 = 0;
                for (int i29 = i16; i28 < i29; i29 = 2) {
                    int i30 = i21 - i28;
                    if (!qk0Var2.b(i30, i26)) {
                        i23++;
                        i24 <<= 1;
                        if (qk0Var.b(i30, i26)) {
                            i24 |= 1;
                        }
                        if (i23 == 8) {
                            bArr[i22] = (byte) i24;
                            i22++;
                            i23 = 0;
                            i24 = 0;
                        }
                    }
                    i28++;
                }
                i25++;
                i18 = i27;
                i16 = 2;
            }
            z = !z;
            i21 -= 2;
            i16 = 2;
            i17 = 6;
        }
        int i31 = i18;
        if (i22 != i10) {
            throw ho4.a();
        }
        if (i10 != D.d) {
            i98.g();
            return null;
        }
        ohd ohdVar = D.c[g54Var2.ordinal()];
        xbc[] xbcVarArr = (xbc[]) ohdVar.b;
        byte b = ohdVar.a;
        int i32 = 0;
        for (xbc xbcVar : xbcVarArr) {
            i32 += xbcVar.a;
        }
        ohd[] ohdVarArr = new ohd[i32];
        int i33 = 0;
        for (xbc xbcVar2 : xbcVarArr) {
            int i34 = 0;
            while (i34 < xbcVar2.a) {
                byte b2 = xbcVar2.b;
                ohdVarArr[i33] = new ohd(b2, new byte[b + b2]);
                i34++;
                i33++;
            }
        }
        int length2 = ((byte[]) ohdVarArr[0].b).length;
        int i35 = i32 - 1;
        while (i35 >= 0 && ((byte[]) ohdVarArr[i35].b).length != length2) {
            i35--;
        }
        int i36 = i35 + 1;
        int i37 = length2 - b;
        int i38 = 0;
        int i39 = 0;
        while (i38 < i37) {
            int i40 = i39;
            int i41 = 0;
            while (i41 < i33) {
                ((byte[]) ohdVarArr[i41].b)[i38] = bArr[i40];
                i41++;
                i40++;
            }
            i38++;
            i39 = i40;
        }
        int i42 = i36;
        while (i42 < i33) {
            ((byte[]) ohdVarArr[i42].b)[i37] = bArr[i39];
            i42++;
            i39++;
        }
        boolean z2 = false;
        int length3 = ((byte[]) ohdVarArr[0].b).length;
        while (i37 < length3) {
            int i43 = i39;
            int i44 = 0;
            while (i44 < i33) {
                ((byte[]) ohdVarArr[i44].b)[i44 < i36 ? i37 : i37 + 1] = bArr[i43];
                i44++;
                i43++;
            }
            i37++;
            i39 = i43;
        }
        int i45 = 0;
        for (int i46 = 0; i46 < i32; i46++) {
            i45 += ohdVarArr[i46].a;
        }
        byte[] bArr2 = new byte[i45];
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        while (i48 < i32) {
            ohd ohdVar2 = ohdVarArr[i48];
            byte[] bArr3 = (byte[]) ohdVar2.b;
            byte b3 = ohdVar2.a;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i50 = 0; i50 < length4; i50++) {
                iArr2[i50] = bArr3[i50] & 255;
            }
            try {
                int r2 = ((oo8) this.b).r2(iArr2, bArr3.length - b3);
                for (int i51 = 0; i51 < b3; i51++) {
                    bArr3[i51] = (byte) iArr2[i51];
                }
                i47 += r2;
                int i52 = i49;
                int i53 = 0;
                while (i53 < b3) {
                    bArr2[i52] = bArr3[i53];
                    i53++;
                    i52++;
                }
                i48++;
                i49 = i52;
            } catch (a79 unused) {
                rh2 rh2Var = rh2.c;
                if (p39.a) {
                    throw new rh2();
                }
                throw rh2.c;
            }
        }
        rk0 rk0Var = new rk0(bArr2);
        StringBuilder sb = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(i31);
        int i54 = -1;
        int i55 = -1;
        boolean z3 = false;
        boolean z4 = false;
        il1 il1Var = null;
        while (true) {
            try {
                int d2 = rk0Var.d();
                ig7 ig7Var2 = ig7.c;
                if (d2 < 4 || (f2 = rk0Var.f(4)) == 0) {
                    ig7Var = ig7Var2;
                } else if (f2 == 1) {
                    ig7Var = ig7.d;
                } else if (f2 == 2) {
                    ig7Var = ig7.e;
                } else if (f2 == 3) {
                    ig7Var = ig7.f;
                } else if (f2 == 4) {
                    ig7Var = ig7.h;
                } else if (f2 == 5) {
                    ig7Var = ig7.s;
                } else if (f2 == 7) {
                    ig7Var = ig7.n;
                } else if (f2 == 8) {
                    ig7Var = ig7.r;
                } else if (f2 == 9) {
                    ig7Var = ig7.w;
                } else {
                    if (f2 != 13) {
                        throw new IllegalArgumentException();
                    }
                    ig7Var = ig7.x;
                }
                int ordinal = ig7Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 3) {
                        g54Var = g54Var2;
                        i = 1;
                        if (rk0Var.d() < 16) {
                            throw ho4.a();
                        }
                        i54 = rk0Var.f(8);
                        i55 = rk0Var.f(8);
                    } else if (ordinal == 5) {
                        g54Var = g54Var2;
                        i = 1;
                        int f3 = rk0Var.f(8);
                        if ((f3 & 128) == 0) {
                            f = f3 & nm7.K1;
                        } else if ((f3 & nm7.V2) == 128) {
                            f = ((f3 & 63) << 8) | rk0Var.f(8);
                        } else {
                            if ((f3 & nm7.A3) != 192) {
                                throw ho4.a();
                            }
                            f = ((f3 & 31) << 16) | rk0Var.f(16);
                        }
                        HashMap hashMap = il1.c;
                        if (f < 0 || f >= 900) {
                            break;
                        }
                        il1Var = (il1) il1.c.get(Integer.valueOf(f));
                        if (il1Var == null) {
                            throw ho4.a();
                        }
                    } else if (ordinal == 7) {
                        g54Var = g54Var2;
                        i = 1;
                        z3 = true;
                        z2 = true;
                    } else if (ordinal == 8) {
                        g54Var = g54Var2;
                        i = 1;
                        z3 = true;
                        z4 = true;
                    } else if (ordinal != 9) {
                        int f4 = rk0Var.f(ig7Var.a(D));
                        int ordinal2 = ig7Var.ordinal();
                        g54Var = g54Var2;
                        if (ordinal2 == 1) {
                            am7.e(rk0Var, sb, f4);
                        } else if (ordinal2 == 2) {
                            am7.a(rk0Var, sb, f4, z3);
                        } else if (ordinal2 == 4) {
                            am7.b(rk0Var, sb, f4, il1Var, arrayList);
                        } else {
                            if (ordinal2 != 6) {
                                throw ho4.a();
                            }
                            am7.d(rk0Var, sb, f4);
                        }
                    } else {
                        g54Var = g54Var2;
                        int f5 = rk0Var.f(4);
                        int f6 = rk0Var.f(ig7Var.a(D));
                        i = 1;
                        if (f5 == 1) {
                            am7.c(rk0Var, sb, f6);
                        }
                    }
                    if (ig7Var != ig7Var2) {
                        oa3 oa3Var = new oa3(bArr2, sb.toString(), arrayList.isEmpty() ? null : arrayList, g54Var.toString(), i54, i55, il1Var != null ? z2 ? 4 : z4 ? 6 : 2 : z2 ? 3 : z4 ? 5 : i);
                        oa3Var.d = Integer.valueOf(i47);
                        return oa3Var;
                    }
                    g54Var2 = g54Var;
                } else {
                    g54Var = g54Var2;
                }
                i = 1;
                if (ig7Var != ig7Var2) {
                }
            } catch (IllegalArgumentException unused2) {
                throw ho4.a();
            }
        }
    }

    @Override // mc2
    public final boolean x0(rc2 rc2Var) {
        return false;
    }

    @Override // mc2
    public final void x1(rc2 rc2Var, TLRPC.WebPage webPage, String str, boolean z) {
        l11.u(rc2Var.getContext(), str);
    }

    @Override // gk
    public final void y(int i, int i2, boolean z) {
        ((qw1) this.b).a(Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // kt9
    public final boolean y0(int i, View view) {
        byte b = this.a;
        return false;
    }

    @Override // mc2
    public final boolean z1() {
        return false;
    }

    private final void d1() {
    }

    private final void j0() {
    }

    @Override // mc2
    public final void C1() {
    }

    @Override // g22
    public final void I() {
    }

    @Override // mc2
    public final void T0() {
    }

    @Override // t43
    public final void W0() {
    }

    @Override // g22
    public final void b0() {
    }

    @Override // mc2
    public final void c() {
    }

    @Override // mc2
    public final void g2() {
    }

    @Override // mc2
    public final void o2() {
    }

    @Override // kb1
    public final void onDismiss() {
    }

    @Override // mc2
    public final void q() {
    }

    @Override // mc2
    public final void s0() {
    }

    private final void g0(float f) {
    }

    @Override // mc2
    public final void A(rc2 rc2Var) {
    }

    @Override // mc2
    public final void F0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void G(rc2 rc2Var) {
    }

    @Override // t43
    public final void H0(boolean z) {
    }

    @Override // kb1
    public final void I0(yh7 yh7Var) {
    }

    @Override // mc2
    public final void J1(rc2 rc2Var) {
    }

    @Override // nc8
    public final void L(k47 k47Var) {
    }

    @Override // mc2
    public final void L1(rc2 rc2Var) {
    }

    @Override // mc2
    public final void M0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void P(rc2 rc2Var) {
    }

    @Override // mc2
    public final void Q0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void Q1(rc2 rc2Var) {
    }

    @Override // mc2
    public final void R(rc2 rc2Var) {
    }

    @Override // t43
    public final void R0(boolean z) {
    }

    @Override // mc2
    public final void T(k47 k47Var) {
    }

    @Override // mc2
    public final void U0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void X0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void Y(int i) {
    }

    @Override // mc2
    public final void Z0(rc2 rc2Var) {
    }

    @Override // au9
    public final void a2(ArrayList arrayList) {
    }

    @Override // r17
    public final void c1(String str) {
    }

    @Override // kab
    public final void e(boolean z) {
    }

    @Override // mc2
    public final void e0(k47 k47Var) {
    }

    @Override // g22
    public final void f0(Object obj) {
    }

    @Override // mc2
    public final void h0(String str) {
    }

    @Override // mc2
    public final void i2(rc2 rc2Var) {
    }

    @Override // mc2
    public final void k(rc2 rc2Var) {
    }

    @Override // mc2
    public final void k0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void k1(rc2 rc2Var) {
    }

    @Override // mc2
    public final void q1(h47 h47Var) {
    }

    @Override // mc2
    public final void q2(rc2 rc2Var) {
    }

    @Override // mc2
    public final void y1(rc2 rc2Var) {
    }

    @Override // g22
    public final void z0(TLRPC.User user) {
    }

    @Override // mc2
    public final void B1(rc2 rc2Var, ir0 ir0Var) {
    }

    @Override // mc2
    public final void D0(rc2 rc2Var, boolean z) {
    }

    @Override // mc2
    public final void L0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // mc2
    public final void N1(String str, String str2) {
    }

    @Override // mc2
    public final void P1(rc2 rc2Var, n28 n28Var) {
    }

    @Override // mc2
    public final void U(rc2 rc2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // mc2
    public final void X1(rc2 rc2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // mc2
    public final void i0(rc2 rc2Var, int i) {
    }

    @Override // mc2
    public final void m0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // mc2
    public final void o1(rc2 rc2Var, boolean z) {
    }

    @Override // mc2
    public final void t1(rc2 rc2Var, int i) {
    }

    @Override // mc2
    public final void v0(rc2 rc2Var, long j) {
    }

    @Override // mc2
    public final void F(rc2 rc2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // mc2
    public final void I1(rc2 rc2Var, TLObject tLObject, boolean z) {
    }

    @Override // mc2
    public final void M(rc2 rc2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override // mc2
    public final void N0(rc2 rc2Var, float f, float f2) {
    }

    @Override // mc2
    public final void d2(rc2 rc2Var, float f, float f2) {
    }

    @Override // mc2
    public final void i1(rc2 rc2Var, float f, float f2) {
    }

    @Override // mc2
    public final void l2(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override // mc2
    public final void o0(rc2 rc2Var, int i, int i2) {
    }

    @Override // r17
    public final void r(TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
    }

    @Override // mc2
    public final void u(rc2 rc2Var, float f, float f2) {
    }

    @Override // mc2
    public final void u1(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override // r17
    public final void w0(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    public k6d(Context context) {
        String e2;
        this.a = (byte) 0;
        f3b a = f3b.a(context);
        this.b = a;
        a.b();
        String e3 = a.e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e3) || (e2 = a.e(f3b.f("googleSignInOptions", e3))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(e2);
        } catch (JSONException unused) {
        }
    }

    public k6d(pl2 pl2Var) {
        this.a = (byte) 22;
        Charset charset = mr5.a;
        this.b = pl2Var;
        pl2Var.a = this;
    }

    public /* synthetic */ k6d(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public k6d(LaunchActivity launchActivity, Executor executor, dqd dqdVar) {
        this.a = (byte) 11;
        if (launchActivity == null) {
            u36.j("FragmentActivity must not be null.");
            throw null;
        }
        if (executor != null) {
            iq4 u = launchActivity.u();
            lk0 lk0Var = (lk0) new et8(launchActivity).l(lk0.class);
            this.b = u;
            lk0Var.b = executor;
            lk0Var.c = dqdVar;
            return;
        }
        u36.j("Executor must not be null.");
        throw null;
    }

    public k6d(Context context, ylb ylbVar) {
        this.a = (byte) 13;
        my0 my0Var = new my0(1, ylbVar, context, false);
        this.b = my0Var;
        my0Var.J();
    }

    @Override // mc2
    public final void W(rc2 rc2Var, TLRPC.User user, float f, float f2) {
    }

    @Override // mc2
    public final void m(rc2 rc2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override // mc2
    public final void r0(rc2 rc2Var, float f, float f2, boolean z) {
    }

    @Override // mc2
    public final void z(rc2 rc2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // mc2
    public final void H(rc2 rc2Var, int i, float f, float f2, boolean z) {
    }

    @Override // mc2
    public final void V0(rc2 rc2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override // mc2
    public final void b1(rc2 rc2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override // mc2
    public final void W1(rc2 rc2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
    }

    @Override // g22
    public final void n0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    @Override // mc2
    public final void w1(k47 k47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }

    @Override // g22
    public final void E0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
    }
}
