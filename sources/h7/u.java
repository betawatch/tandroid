package h7;

import android.media.MediaDrmException;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.view.View;
import h5.d0;
import j$.util.Objects;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.x;
import o3.v;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.wg;
import org.telegram.ui.nn;
import org.telegram.ui.xu0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class u implements androidx.car.app.messaging.model.b, d4.j, h3.a, x, v, of.a, eg, k1, t0, pf.a, q9.a, r3.m, ra.m, ki, c9.e {
    public static u b;
    public static u c;
    public static u d;
    public final /* synthetic */ int a;

    public /* synthetic */ u(int i10) {
        this.a = i10;
    }

    public static Calendar K2() {
        if (d == null) {
            d = new u(9);
        }
        d.getClass();
        return Calendar.getInstance();
    }

    public static String L2(mc.c cVar) {
        String str = cVar.a;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) cVar.a().get("alt");
            return (str2 == null || str2.length() == 0) ? "￼" : str2;
        }
        if ("iframe".equals(str)) {
            return " ";
        }
        return null;
    }

    public static final CharSequence M2(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override // d4.j
    public d4.k A1(d4.i iVar) {
        int i10 = d0.a;
        if (i10 < 23 || i10 < 31) {
            return new ab.a(5).A1(iVar);
        }
        int g10 = h5.o.g(iVar.c.C);
        h5.a.v("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + d0.B(g10));
        return new bf.b(g10).A1(iVar);
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ boolean A2(v0 v0Var, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Components.ki
    public void B0(wg wgVar) {
        wgVar.run();
    }

    @Override // o3.v
    public boolean C2(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ boolean D1() {
        return false;
    }

    @Override // o3.v
    public n3.b E0(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean E2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers F() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ boolean H0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean H1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ n9 I2() {
        return null;
    }

    @Override // o3.v
    public o3.u J() {
        throw new IllegalStateException();
    }

    @Override // o3.v
    public byte[] K1(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean N1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O() {
        return false;
    }

    @Override // o3.v
    public byte[] O0() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R0(long j10) {
        return false;
    }

    @Override // of.a
    public int S1(int i10, int i11, int i12) {
        return (i11 == 6 ? of.a.p : i11 > i12 ? of.a.l : i11 < i12 ? of.a.m : of.a.o).S1(i10, i11, i12);
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ p2 T0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public void U1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        af.g.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // o3.v
    public void V1(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // h3.a
    public long W() {
        return SystemClock.elapsedRealtime();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle W1(t1 t1Var) {
        return null;
    }

    @Override // of.a
    public void X0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        (i10 == 6 ? of.a.p : i10 > i11 ? of.a.l : i10 < i11 ? of.a.m : of.a.o).X0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ vg.a Z() {
        return null;
    }

    @Override // o3.v
    public o3.t Z1(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a0(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ long b() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean b1(t1 t1Var, boolean z4) {
        return false;
    }

    @Override // org.telegram.ui.Components.ki
    public /* synthetic */ boolean b2() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean d() {
        return false;
    }

    @Override // l.x
    public boolean d0(l.l lVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // c9.e
    public Object e0(c5.j jVar) {
        switch (this.a) {
            case 26:
                return new bb.c(jVar.w(bb.b.class));
            default:
                return new bb.b(jVar.c(ab.a.class));
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e2(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ int f1() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean g1(int i10, t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ xu0 g2() {
        return null;
    }

    @Override // org.telegram.ui.Components.ki
    public /* synthetic */ boolean h0() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ TL_stories.StoryItem h1() {
        return null;
    }

    @Override // o3.v
    public int h2() {
        return 1;
    }

    @Override // r3.m
    public void i1() {
        throw new UnsupportedOperationException();
    }

    @Override // r3.m
    public r3.v i2(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ boolean j1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean j2(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int k0(t1 t1Var) {
        return 0;
    }

    @Override // o3.v
    public void k1(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ int l() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean l2(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean m1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override // r3.m
    public void m2(r3.s sVar) {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean n0() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public boolean n1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ TLRPC.Peer p() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean q0(u5 u5Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ nn r0() {
        return null;
    }

    @Override // pf.a
    public void u0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 != i11) {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ boolean u1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String v(long j10) {
        return null;
    }

    @Override // q9.a
    public StackTraceElement[] v0(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean v2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // o3.v
    public Map w(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // ra.m
    public Object y2() {
        switch (this.a) {
            case 22:
                return new ArrayList();
            default:
                return new ra.l(true);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public void B() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D0() {
    }

    @Override // org.telegram.ui.Components.eg
    public void F2() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void G1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G2() {
    }

    @Override // org.telegram.ui.Components.eg
    public void J2() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void L0() {
    }

    @Override // org.telegram.ui.Components.eg
    public void M1() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void P0() {
    }

    @Override // org.telegram.ui.Components.ki
    public /* synthetic */ void Q0() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void X() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void Y0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void a2() {
    }

    @Override // org.telegram.ui.Components.eg
    public void f() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void n2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void o0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r() {
    }

    @Override // o3.v
    public void release() {
    }

    @Override // org.telegram.ui.Components.eg
    public void s2() {
    }

    @Override // org.telegram.ui.Components.eg
    public void t1() {
    }

    @Override // org.telegram.ui.Components.eg
    public void u() {
    }

    @Override // org.telegram.ui.Components.eg
    public void w0() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void w1() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void x1() {
    }

    @Override // org.telegram.ui.Components.eg
    public void x2() {
    }

    @Override // org.telegram.ui.Components.ki
    public /* synthetic */ void y0() {
    }

    @Override // org.telegram.ui.Components.eg
    public void y1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z2() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void A(boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.eg
    public void C1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void E1(long j10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void F1(v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void I0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(MessageObject messageObject) {
    }

    @Override // o3.v
    public void M0(ja.c cVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void V0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.Components.eg
    public void Y(boolean z4) {
    }

    @Override // org.telegram.ui.Components.ki
    public /* synthetic */ void Z0(Object obj) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void b0(v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.eg
    public void e1(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void f0(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void m0(v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.ki
    public /* synthetic */ void o1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p0(String str) {
    }

    @Override // org.telegram.ui.Components.eg
    public void p2(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q(t1 t1Var) {
    }

    @Override // o3.v
    public void q1(byte[] bArr) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void t0(v0 v0Var) {
    }

    @Override // org.telegram.ui.Components.eg
    public void t2(boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void x(float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Components.eg
    public void G(float f10, int i10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void I(v0 v0Var, int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public void J0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L(int i10, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L1(t1 t1Var, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void O1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Q(t1 t1Var, kh.f fVar) {
    }

    @Override // o3.v
    public /* synthetic */ void U(byte[] bArr, k3.k kVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U0(int i10, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // l.x
    public void c(l.l lVar, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c2(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q2(t1 t1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void r2(v0 v0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v1(t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B1(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G0(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void H2(t1 t1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void Q1(v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void a1(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void j0(v0 v0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void l1(v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Components.eg
    public void r1(CharSequence charSequence, boolean z4, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s0(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.eg
    public void z1(View view, CharSequence charSequence, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x0(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z0(t1 t1Var, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.eg
    public void C(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void D2(v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public void u2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void X1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ki
    public /* synthetic */ void f2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }

    @Override // org.telegram.ui.Components.ki
    public void I1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
    }
}
