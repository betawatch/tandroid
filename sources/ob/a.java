package ob;

import a3.l;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.style.CharacterStyle;
import android.view.View;
import androidx.car.app.messaging.model.b;
import b2.s;
import bi.u6;
import da.c;
import e2.d0;
import fb.n;
import g2.k;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import n2.g;
import n2.j;
import n2.m;
import n2.o;
import n2.x;
import nf.f;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.y5;
import org.telegram.ui.rv0;
import org.telegram.ui.tn;
import q9.d;
import r0.r;
import y2.p;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a implements ag.a, b, bg.a, c, n, wi, p, n2.n, d, qg, k1, t0, r, x9.c, y6.d {
    public static a b;
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static Calendar A2() {
        if (b == null) {
            b = new a(25);
        }
        b.getClass();
        return Calendar.getInstance();
    }

    public static short B2(short s10, short s11) {
        int i10 = s10 + 32768;
        int i11 = s11 + 32768;
        int i12 = (i10 < 32768 || i11 < 32768) ? (i10 * i11) / 32768 : (((i10 + i11) * 2) - ((i10 * i11) / 32768)) - 65535;
        return (short) ((i12 != 65536 ? i12 : 65535) - 32768);
    }

    public static void C2(String str) {
        if (str == null || str.length() == 0) {
            throw new tc.c("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
        }
        if (str.startsWith("sk_")) {
            throw new tc.c("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
    }

    public static da.a z2(na.d dVar) {
        return new da.a(System.currentTimeMillis() + 3600000, new com.google.android.gms.internal.cast.a(8), new ac.d(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ boolean D0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean E1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // x9.c
    public String F() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean G1() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    @Override // ag.a
    public int J1(int i10, int i11, int i12) {
        return i10 / 2;
    }

    @Override // n2.n
    public int L0(s sVar) {
        return sVar.v != null ? 1 : 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public void L1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        f.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean M0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle M1(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ p2 O0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P(t1 t1Var) {
        return false;
    }

    @Override // q9.d
    public Object P1(u6 u6Var) {
        switch (this.a) {
            case 14:
                return new rb.a(0);
            default:
                return new qb.b(0);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ boolean R1() {
        return false;
    }

    @Override // ag.a
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < min; i12++) {
            shortBuffer2.put(B2(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int U() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean V1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ gh.a X() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ rv0 X1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y(t1 t1Var) {
        return false;
    }

    @Override // n2.n
    public g Y0(j jVar, s sVar) {
        if (sVar.v == null) {
            return null;
        }
        return new o(new n2.f(6001, new x()));
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a2(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean b0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ int b1() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c1(int i10, t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ long d() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d0() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ TL_stories.StoryItem d1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean e() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ boolean e1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean g1(MessageObject messageObject) {
        return em.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int h0(t1 t1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Components.qg
    public boolean h1() {
        return false;
    }

    @Override // n2.n
    public /* synthetic */ m j0(j jVar, s sVar) {
        return m.u;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean j2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean l0() {
        return false;
    }

    @Override // y2.p
    public Object l2(Uri uri, k kVar) {
        return Long.valueOf(d0.T(new BufferedReader(new InputStreamReader(kVar)).readLine()));
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ boolean n1() {
        return false;
    }

    @Override // fb.n
    public Object n2() {
        switch (this.a) {
            case 8:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean o0(y5 y5Var) {
        return false;
    }

    @Override // y6.d
    public l p(Context context, String str, y6.c cVar) {
        l lVar = new l();
        lVar.a = cVar.F(context, str);
        int i10 = 1;
        int h = cVar.h(context, str, true);
        lVar.b = h;
        int i11 = lVar.a;
        if (i11 == 0) {
            i11 = 0;
            if (h == 0) {
                i10 = 0;
                lVar.c = i10;
                return lVar;
            }
        }
        if (h < i11) {
            i10 = -1;
        }
        lVar.c = i10;
        return lVar;
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ tn p0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ boolean p2(w0 w0Var, float f7, float f10) {
        return false;
    }

    @Override // da.c
    public da.a q2(na.d dVar, JSONObject jSONObject) {
        return z2(dVar);
    }

    @Override // bg.a
    public void s0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 != i11) {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean t2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ int u() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String v(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ boolean v1() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ TLRPC.Peer w() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ t9 x2() {
        return null;
    }

    @Override // org.telegram.ui.Components.wi
    public void y0(jh jhVar) {
        jhVar.run();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z1() {
        return false;
    }

    public a() {
        this.a = 11;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A0() {
    }

    @Override // org.telegram.ui.Components.qg
    public void D1() {
    }

    @Override // org.telegram.ui.Components.qg
    public void G() {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void H0() {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void J0() {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Q1() {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void T0() {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void W() {
    }

    @Override // n2.n
    public /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void b2() {
    }

    @Override // x9.c
    public void c() {
    }

    @Override // org.telegram.ui.Components.qg
    public void g2() {
    }

    @Override // org.telegram.ui.Components.qg
    public void h() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j1() {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void m0() {
    }

    @Override // org.telegram.ui.Components.qg
    public void m1() {
    }

    @Override // org.telegram.ui.Components.qg
    public void m2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2() {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void p1() {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void q1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.Components.qg
    public void r1() {
    }

    @Override // n2.n
    public /* synthetic */ void release() {
    }

    @Override // org.telegram.ui.Components.qg
    public void t0() {
    }

    @Override // org.telegram.ui.Components.qg
    public void u2() {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v2() {
    }

    @Override // org.telegram.ui.Components.qg
    public void x() {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void y1() {
    }

    @Override // org.telegram.ui.Components.qg
    public void y2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void B(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void E0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void X0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.qg
    public void Z(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void a0(w0 w0Var) {
    }

    @Override // org.telegram.ui.Components.qg
    public void a1(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c0(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.qg
    public void d2(int i10) {
    }

    @Override // org.telegram.ui.Components.qg
    public void h2(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void i1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void k0(w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void r0(w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.qg
    public void u1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void w1(long j3) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void x1(w0 w0Var) {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void y(float f7) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z0(t1 t1Var) {
    }

    @Override // n2.n
    public void C(Looper looper, j2.k kVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C1(t1 t1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Components.qg
    public void F0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L(int i10, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void P0(int i10, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S1(t1 t1Var, ai.j jVar) {
    }

    @Override // org.telegram.ui.Components.qg
    public void T(float f7, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void V(w0 w0Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(t1 t1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void f2(w0 w0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o1(t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void H1(w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void V0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void f0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void f1(w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void g0(w0 w0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.qg
    public void k1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Components.qg
    public void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t1(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w2(t1 t1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // r0.r
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override // r0.r
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u0(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w0(t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public void I(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void s2(w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public void i2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override // org.telegram.ui.Components.wi
    public void A1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
