package db;

import android.content.Context;
import android.media.MediaDrmException;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import androidx.car.app.messaging.model.b;
import c9.f;
import d4.i;
import d4.j;
import d4.k;
import h5.d0;
import h5.o;
import j$.util.Objects;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.w;
import mb.d;
import o3.u;
import o3.v;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.ya;
import org.telegram.ui.cv0;
import p9.c;
import r3.m;
import r3.s;
import ra.l;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a implements b, j, h3.a, jf.a, w, nf.a, o3.w, of.a, mb, j1, c, q9.a, m, ra.m, qg.a, f {
    public static a b;
    public static a c;
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static Calendar F3() {
        if (c == null) {
            c = new a(9);
        }
        c.getClass();
        return Calendar.getInstance();
    }

    public static short I3(short s6, short s9) {
        int i10 = s6 + 32768;
        int i11 = s9 + 32768;
        int i12 = (i10 < 32768 || i11 < 32768) ? (i10 * i11) / 32768 : (((i10 + i11) * 2) - ((i10 * i11) / 32768)) - 65535;
        return (short) ((i12 != 65536 ? i12 : 65535) - 32768);
    }

    public static String R3(mc.c cVar) {
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

    public static final CharSequence W3(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static p9.b n0(cb.b bVar) {
        return new p9.b(System.currentTimeMillis() + 3600000, new c5.c(8), new d(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A0(s1 s1Var, float f10, float f11, boolean z4) {
        int i10 = this.a;
    }

    @Override // o3.w
    public byte[] B() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean B0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C2(s1 s1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // qg.a
    public int D() {
        return 352321535;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ m9 D2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E0() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(s1 s1Var, TLObject tLObject, boolean z4) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean F1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // o3.w
    public void G(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void G0(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public void I0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1(s1 s1Var, boolean z4) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.mb
    public void J(nb nbVar, wa waVar, fg fgVar, gl glVar) {
        nbVar.setInOutOffset(nbVar.getMeasuredHeight());
        glVar.accept(Float.valueOf(nbVar.getTranslationY()));
        o1.j jVar = new o1.j(nbVar, nb.IN_OUT_OFFSET_Y, 0.0f);
        jVar.u.a(0.8f);
        jVar.u.b(400.0f);
        jVar.a(new lb(0, nbVar, fgVar));
        jVar.b(new kb(glVar, nbVar, 1));
        jVar.f();
        waVar.run();
    }

    @Override // p9.c
    public p9.b K(cb.b bVar, JSONObject jSONObject) {
        return n0(bVar);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean K1(s1 s1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M(s1 s1Var, jh.f fVar) {
        int i10 = this.a;
    }

    @Override // jf.a
    public boolean M0(Context context) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N(int i10, s1 s1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean P(s1 s1Var, TLRPC.TodoItem todoItem, boolean z4) {
        switch (this.a) {
        }
        return false;
    }

    @Override // nf.a
    public int P1(int i10, int i11, int i12) {
        return i10 / 2;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R(s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R0(long j10) {
        switch (this.a) {
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.j1
    public void R1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        switch (this.a) {
        }
        ze.d.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean S() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle S1(s1 s1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U0(int i10, s1 s1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean U1(s1 s1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // d4.j
    public k V(i iVar) {
        int i10 = d0.a;
        if (i10 < 23 || i10 < 31) {
            return new z9.d(4).V(iVar);
        }
        int g10 = o.g(iVar.c.C);
        h5.a.v("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + d0.B(g10));
        return new af.c(g10).V(iVar);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int W() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // o3.w
    public byte[] X(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // nf.a
    public void X0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < min; i12++) {
            shortBuffer2.put(I3(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override // o3.w
    public void Y(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Y1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ ug.a Z() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // o3.w
    public Map a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a0(s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a2(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.mb
    public void b(nb nbVar, wa waVar, ua uaVar, xa xaVar) {
        o1.j jVar = new o1.j(nbVar, nb.IN_OUT_OFFSET_Y, nbVar.getHeight());
        jVar.u.a(0.8f);
        jVar.u.b(400.0f);
        jVar.a(new ya(uaVar, 1));
        jVar.b(new kb(xaVar, nbVar, 0));
        jVar.f();
        waVar.run();
    }

    @Override // o3.w
    public u b0(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b1(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c0(s1 s1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c1(s1 s1Var, boolean z4) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ cv0 c2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // o3.w
    public v d() {
        throw new IllegalStateException();
    }

    @Override // c9.f
    public Object d0(c5.j jVar) {
        switch (this.a) {
            case 26:
                return new bb.b(jVar.x(bb.a.class));
            default:
                return new bb.a(jVar.c(ab.a.class));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // r3.m
    public r3.v d2(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean e() {
        switch (this.a) {
        }
        return false;
    }

    @Override // qg.a
    public int e0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean e2(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void f0(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void f2(s1 s1Var, int i10, float f10, float f11, boolean z4) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String g(s1 s1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean g0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean g2(s1 s1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // jf.a
    public boolean h(Context context) {
        return false;
    }

    @Override // o3.w
    public int h0() {
        return 1;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean h1(int i10, s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // r3.m
    public void h2(s sVar) {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i0(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j() {
        int i10 = this.a;
    }

    @Override // o3.w
    public boolean j0(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // r3.m
    public void j1() {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j2(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int k0(s1 s1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // h3.a
    public long l() {
        return SystemClock.elapsedRealtime();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void l0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void l2(s1 s1Var, long j10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // qg.a
    public int m0() {
        return 1711276032;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean m1(MessageObject messageObject) {
        int i10 = this.a;
        return org.telegram.ui.b.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o() {
        int i10 = this.a;
    }

    @Override // l.w
    public boolean p(l.k kVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean p0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // of.a
    public void r(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            of.a.t.r(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            of.a.q.r(shortBuffer, i10, shortBuffer2, i11, i12);
        } else {
            if (i10 != i11) {
                throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
            }
            shortBuffer2.put(shortBuffer);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean r2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s0(String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s2(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean t0(u5 u5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(s1 s1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // ra.m
    public Object u2() {
        switch (this.a) {
            case 22:
                return new ArrayList();
            default:
                return new l(true);
        }
    }

    @Override // q9.a
    public StackTraceElement[] v(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v0(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String w(long j10) {
        switch (this.a) {
        }
        return null;
    }

    @Override // qg.a
    public int x() {
        return 872415231;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y0(s1 s1Var, TLRPC.User user, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // o3.w
    public n3.b z(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void z1(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean z2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    private final /* synthetic */ void G3() {
    }

    private final /* synthetic */ void H3() {
    }

    private final /* synthetic */ void L0() {
    }

    private final /* synthetic */ void L3() {
    }

    private final /* synthetic */ void M3() {
    }

    private final /* synthetic */ void O0() {
    }

    private final /* synthetic */ void P3() {
    }

    private final /* synthetic */ void Q3() {
    }

    private final /* synthetic */ void U3() {
    }

    private final /* synthetic */ void V3() {
    }

    private final /* synthetic */ void X2() {
    }

    private final /* synthetic */ void Y2() {
    }

    private final /* synthetic */ void q2() {
    }

    private final /* synthetic */ void t2() {
    }

    private final /* synthetic */ void w0() {
    }

    private final /* synthetic */ void x0() {
    }

    @Override // o3.w
    public void release() {
    }

    private final /* synthetic */ void B1(s1 s1Var) {
    }

    private final void B3(s1 s1Var) {
    }

    private final /* synthetic */ void C0(s1 s1Var) {
    }

    private final /* synthetic */ void C1(s1 s1Var) {
    }

    private final /* synthetic */ void D3(s1 s1Var) {
    }

    private final /* synthetic */ void E3(s1 s1Var) {
    }

    private final /* synthetic */ void H0(s1 s1Var) {
    }

    private final /* synthetic */ void J0(s1 s1Var) {
    }

    private final /* synthetic */ void J2(s1 s1Var) {
    }

    private final /* synthetic */ void K2(s1 s1Var) {
    }

    private final /* synthetic */ void N2(s1 s1Var) {
    }

    private final /* synthetic */ void N3(int i10) {
    }

    private final /* synthetic */ void O2(s1 s1Var) {
    }

    private final /* synthetic */ void O3(int i10) {
    }

    private final /* synthetic */ void P0(s1 s1Var) {
    }

    private final /* synthetic */ void P2(s1 s1Var) {
    }

    private final /* synthetic */ void Q0(s1 s1Var) {
    }

    private final /* synthetic */ void Q2(s1 s1Var) {
    }

    private final /* synthetic */ void R2(s1 s1Var) {
    }

    private final /* synthetic */ void S2(s1 s1Var) {
    }

    private final /* synthetic */ void S3(MessageObject messageObject) {
    }

    private final /* synthetic */ void T3(MessageObject messageObject) {
    }

    private final /* synthetic */ void V2(s1 s1Var) {
    }

    private final /* synthetic */ void W2(s1 s1Var) {
    }

    private final /* synthetic */ void X1(s1 s1Var) {
    }

    private final /* synthetic */ void Y0(s1 s1Var) {
    }

    private final /* synthetic */ void Z0(s1 s1Var) {
    }

    private final /* synthetic */ void b2(s1 s1Var) {
    }

    private final /* synthetic */ void f3(String str) {
    }

    private final /* synthetic */ void g3(String str) {
    }

    private final /* synthetic */ void i2(s1 s1Var) {
    }

    private final /* synthetic */ void k1(s1 s1Var) {
    }

    private final /* synthetic */ void k2(s1 s1Var) {
    }

    private final /* synthetic */ void l1(s1 s1Var) {
    }

    private final /* synthetic */ void l3(s1 s1Var) {
    }

    private final /* synthetic */ void m3(s1 s1Var) {
    }

    private final /* synthetic */ void n1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void o1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void p3(s1 s1Var) {
    }

    private final /* synthetic */ void q1(s1 s1Var) {
    }

    private final /* synthetic */ void q3(s1 s1Var) {
    }

    private final /* synthetic */ void r3(MessageObject messageObject) {
    }

    private final /* synthetic */ void s1(s1 s1Var) {
    }

    private final /* synthetic */ void s3(MessageObject messageObject) {
    }

    private final /* synthetic */ void t3(s1 s1Var) {
    }

    private final /* synthetic */ void u3(s1 s1Var) {
    }

    private final /* synthetic */ void w1(s1 s1Var) {
    }

    private final /* synthetic */ void x1(s1 s1Var) {
    }

    private final /* synthetic */ void x3(s1 s1Var) {
    }

    private final /* synthetic */ void y3(s1 s1Var) {
    }

    private final /* synthetic */ void z0(s1 s1Var) {
    }

    private final void z3(s1 s1Var) {
    }

    @Override // o3.w
    public void C(o3.c cVar) {
    }

    @Override // o3.w
    public void H(byte[] bArr) {
    }

    private final /* synthetic */ void A1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void A3(s1 s1Var, boolean z4) {
    }

    private final /* synthetic */ void C3(s1 s1Var, boolean z4) {
    }

    private final /* synthetic */ void G1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void J1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void L2(s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void M2(s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void N1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void T0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void V0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void W1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void h3(s1 s1Var, long j10) {
    }

    private final /* synthetic */ void i3(s1 s1Var, long j10) {
    }

    private final /* synthetic */ void o2(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void p2(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void r0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void t1(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void u0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void v1(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void v3(s1 s1Var, jh.f fVar) {
    }

    private final /* synthetic */ void w3(s1 s1Var, jh.f fVar) {
    }

    private final /* synthetic */ void y1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // l.w
    public void c(l.k kVar, boolean z4) {
    }

    @Override // o3.w
    public /* synthetic */ void k(byte[] bArr, k3.k kVar) {
    }

    private final /* synthetic */ void D1(s1 s1Var, int i10, int i11) {
    }

    private final /* synthetic */ void E1(s1 s1Var, int i10, int i11) {
    }

    private final /* synthetic */ void T2(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void U2(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void Z2(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final /* synthetic */ void a3(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final /* synthetic */ void g1(s1 s1Var, TLObject tLObject, boolean z4) {
    }

    private final /* synthetic */ void i1(s1 s1Var, TLObject tLObject, boolean z4) {
    }

    private final /* synthetic */ void n3(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void o0(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void o3(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void q0(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void w2(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void y2(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void A2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void E2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void b3(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void c3(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void d3(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void e3(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void m2(s1 s1Var, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void n2(s1 s1Var, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void F2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final /* synthetic */ void G2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final /* synthetic */ void H2(s1 s1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void I2(s1 s1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void j3(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void k3(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void a1(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void f1(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void J3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void K3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
