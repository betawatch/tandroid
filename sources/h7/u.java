package h7;

import android.media.MediaDrmException;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.view.View;
import androidx.biometric.f0;
import h5.d0;
import j$.util.Objects;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.w;
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
import org.telegram.ui.Components.u5;
import org.telegram.ui.nn;
import org.telegram.ui.vu0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class u implements androidx.car.app.messaging.model.b, d4.j, h3.a, w, v, of.a, eg, k1, t0, pf.a, q9.a, r3.m, ra.m, qg.a, c9.e {
    public static u b;
    public static u c;
    public static u d;
    public final /* synthetic */ int a;

    public /* synthetic */ u(int i10) {
        this.a = i10;
    }

    public static Calendar F2() {
        if (d == null) {
            d = new u(9);
        }
        d.getClass();
        return Calendar.getInstance();
    }

    public static String G2(mc.c cVar) {
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

    public static final CharSequence H2(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ n9 C2() {
        return null;
    }

    @Override // o3.v
    public n3.b D0(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean D1() {
        return false;
    }

    @Override // qg.a
    public int D2() {
        return 1711276032;
    }

    @Override // o3.v
    public byte[] F1(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers G() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ boolean G0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean I1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // o3.v
    public o3.u K() {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean K1() {
        return false;
    }

    @Override // o3.v
    public byte[] M0() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // of.a
    public int N1(int i10, int i11, int i12) {
        return (i11 == 6 ? of.a.p : i11 > i12 ? of.a.l : i11 < i12 ? of.a.m : of.a.o).N1(i10, i11, i12);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P(t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public void P1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        af.g.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ p2 Q0() {
        return null;
    }

    @Override // o3.v
    public void Q1(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle R1(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean T1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // of.a
    public void U0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        (i10 == 6 ? of.a.p : i10 > i11 ? of.a.l : i10 < i11 ? of.a.m : of.a.o).U0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override // o3.v
    public o3.t U1(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int W() {
        return 0;
    }

    @Override // qg.a
    public int W1() {
        return 0;
    }

    @Override // h3.a
    public long X() {
        return SystemClock.elapsedRealtime();
    }

    @Override // qg.a
    public int X0() {
        return 352321535;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y0(t1 t1Var, boolean z4) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ ug.a Z() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a0(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ vu0 a2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ long b() {
        return 0L;
    }

    @Override // o3.v
    public int b2() {
        return 1;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ int c1() {
        return 0;
    }

    @Override // r3.m
    public r3.v c2(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d1(int i10, t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d2(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // l.w
    public boolean e0(l.k kVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ TL_stories.StoryItem e1() {
        return null;
    }

    @Override // c9.e
    public Object f0(c5.j jVar) {
        switch (this.a) {
            case 26:
                return new bb.b(jVar.x(bb.a.class));
            default:
                return new bb.a(jVar.d(ab.a.class));
        }
    }

    @Override // r3.m
    public void f1() {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f2(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ boolean g1(long j10) {
        return false;
    }

    @Override // r3.m
    public void g2(r3.s sVar) {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean h0() {
        return false;
    }

    @Override // o3.v
    public void h1(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean j1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int k0(t1 t1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Components.eg
    public boolean k1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ int l() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean n0() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ TLRPC.Peer p() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean p2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean q0(u5 u5Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ boolean q1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ nn r0() {
        return null;
    }

    @Override // ra.m
    public Object s2() {
        switch (this.a) {
            case 22:
                return new ArrayList();
            default:
                return new ra.l(true);
        }
    }

    @Override // pf.a
    public void u0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 != i11) {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ boolean u2(v0 v0Var, float f10, float f11) {
        return false;
    }

    @Override // o3.v
    public Map v(byte[] bArr) {
        throw new IllegalStateException();
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
    public /* synthetic */ String w(long j10) {
        return null;
    }

    @Override // d4.j
    public d4.k w1(d4.i iVar) {
        int i10 = d0.a;
        if (i10 < 23 || i10 < 31) {
            return new ab.a(5).w1(iVar);
        }
        int g10 = h5.o.g(iVar.c.C);
        h5.a.v("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + d0.B(g10));
        return new bf.b(g10).w1(iVar);
    }

    @Override // o3.v
    public boolean w2(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // qg.a
    public int x0() {
        return 872415231;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean y2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ boolean z1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A2() {
    }

    @Override // org.telegram.ui.Components.eg
    public void C() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C0() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void C1() {
    }

    @Override // org.telegram.ui.Components.eg
    public void E2() {
    }

    @Override // org.telegram.ui.Components.eg
    public void H1() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void N0() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void V0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void V1() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void Y() {
    }

    @Override // org.telegram.ui.Components.eg
    public void f() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void h2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l1() {
    }

    @Override // org.telegram.ui.Components.eg
    public void m2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void o0() {
    }

    @Override // org.telegram.ui.Components.eg
    public void p1() {
    }

    @Override // org.telegram.ui.Components.eg
    public void r() {
    }

    @Override // org.telegram.ui.Components.eg
    public void r2() {
    }

    @Override // o3.v
    public void release() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void s1() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void t1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t2() {
    }

    @Override // org.telegram.ui.Components.eg
    public void u1() {
    }

    @Override // org.telegram.ui.Components.eg
    public void w0() {
    }

    @Override // org.telegram.ui.Components.eg
    public void z2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void A1(long j10) {
    }

    @Override // o3.v
    public void B(f0 f0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void B1(v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void H0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void O(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void O1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void P0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void S0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void a1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.eg
    public void b0(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public void b1(int i10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void c0(v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g0(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.eg
    public void j2(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void m0(v0 v0Var) {
    }

    @Override // o3.v
    public void m1(byte[] bArr) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.eg
    public void n2(boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void t0(v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void x(float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.eg
    public void y1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void z(boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G1(t1 t1Var, boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public void H(float f10, int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public void I0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void J(v0 v0Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(t1 t1Var, jh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N(int i10, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(int i10, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // o3.v
    public /* synthetic */ void V(byte[] bArr, k3.k kVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void X1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // l.w
    public void c(l.k kVar, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2(t1 t1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void l2(v0 v0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r1(t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B2(t1 t1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F0(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void L1(v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W0(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void i1(v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void j0(v0 v0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.eg
    public void n1(CharSequence charSequence, boolean z4, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s0(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.eg
    public void v1(View view, CharSequence charSequence, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x1(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Y1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y0(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z0(t1 t1Var, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public void D(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void x2(v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public void o2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
