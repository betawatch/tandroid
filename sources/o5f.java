// default package

import android.graphics.RectF;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.style.CharacterStyle;
import android.util.Base64;
import com.google.firebase.components.ComponentRegistrar;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class o5f implements aq2, aka, yyb, e51, bq2, sx9, i8a, p30, m63, ok6, l74, bb2, wq9, lo7, rk1, c38 {
    public static o5f F;
    public static o5f b;
    public final /* synthetic */ byte a;
    public static final o5f c = new o5f(1);
    public static final o5f d = new o5f(2);
    public static final /* synthetic */ o5f e = new o5f(3);
    public static final /* synthetic */ o5f f = new o5f(4);
    public static final o5f h = new o5f(5);
    public static final o5f n = new o5f(6);
    public static final o5f r = new o5f(7);
    public static final /* synthetic */ o5f s = new o5f(8);
    public static final o5f w = new o5f(9);
    public static final o5f x = new o5f(10);
    public static final o5f y = new o5f(11);
    public static final o5f E = new o5f(12);

    public /* synthetic */ o5f(byte b2) {
        this.a = b2;
    }

    public static String o0() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        byte b2 = array[0];
        array[16] = b2;
        array[0] = (byte) ((15 & b2) | kk7.w1);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }

    public static q7a p0(ize izeVar) {
        boolean z = false;
        return new q7a(System.currentTimeMillis() + 3600000, new g30(8), new j00(true, z, z), 10.0d, 1.2d, 60);
    }

    public static String s0(hg5 hg5Var) {
        String str = hg5Var.a;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) hg5Var.a().get("alt");
            return (str2 == null || str2.length() == 0) ? "￼" : str2;
        }
        if ("iframe".equals(str)) {
            return " ";
        }
        return null;
    }

    public static synchronized void t0() {
        synchronized (o5f.class) {
            if (b == null) {
                b = new o5f((byte) 0);
            }
        }
    }

    @Override // bb2
    public final boolean A1(gb2 gb2Var, int i) {
        return false;
    }

    @Override // bb2
    public final boolean B2(gb2 gb2Var, k27 k27Var) {
        return false;
    }

    @Override // bb2
    public final boolean D0(gb2 gb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
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

    @Override // ok6
    public final boolean J(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // bb2
    public final boolean J0(long j) {
        return false;
    }

    @Override // aq2
    public final Object K(gl2 gl2Var) {
        switch (this.a) {
            case 1:
                Object i = gl2Var.i(new xw8(nk0.class, Executor.class));
                i.getClass();
                return new t44((Executor) i);
            case 2:
            default:
                return new jnd((ktd) gl2Var.a(ktd.class), (u44) gl2Var.a(u44.class));
            case 3:
                return new ltd((ae7) gl2Var.a(ae7.class));
        }
    }

    @Override // bb2
    public final void K1(gb2 gb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        d01.t(gb2Var.getContext(), str);
    }

    @Override // ok6
    public final int L() {
        return MediaCodecList.getCodecCount();
    }

    @Override // bb2
    public final boolean N() {
        return false;
    }

    @Override // bb2
    public final boolean N1() {
        return false;
    }

    @Override // bb2
    public final boolean P() {
        return false;
    }

    @Override // bb2
    public final int Q() {
        return 0;
    }

    @Override // l74
    public final wxb T(int i, int i2) {
        return new yn3();
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

    @Override // bb2
    public final vu1 W() {
        return null;
    }

    @Override // bb2
    public final ma8 Z1() {
        return null;
    }

    @Override // rk1
    public final long a() {
        return 0L;
    }

    @Override // rk1
    public final boolean a0(uk1 uk1Var, float f2, float f3) {
        return false;
    }

    @Override // yyb
    public final Object apply(Object obj) {
        y3f y3fVar = (y3f) obj;
        try {
            int i = y3fVar.i();
            byte[] bArr = new byte[i];
            hef hefVar = new hef(i, bArr);
            tgf a = qgf.c.a(y3f.class);
            xdd xddVar = hefVar.a;
            if (xddVar == null) {
                xddVar = new xdd();
                Charset charset = eff.a;
                xddVar.a = hefVar;
                hefVar.a = xddVar;
            }
            a.c(y3fVar, xddVar);
            if (i - hefVar.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            fyb.j(tb4.y("Serializing ", y3fVar.getClass().getName(), " to a byte array threw an IOException (should never happen)."), e2);
            return null;
        }
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

    @Override // m63
    public final o63 createDataSource() {
        return new a94(false);
    }

    @Override // rk1
    public final long d() {
        return 0L;
    }

    @Override // bb2
    public final boolean d0() {
        return false;
    }

    @Override // ok6
    public final MediaCodecInfo e(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // bb2
    public final CharacterStyle e0(gb2 gb2Var) {
        return null;
    }

    @Override // bq2
    public final List f(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (mp2 mp2Var : componentRegistrar.getComponents()) {
            String str = mp2Var.a;
            if (str != null) {
                v82 v82Var = new v82((Object) str, (Object) mp2Var, (byte) 7);
                Set set = mp2Var.b;
                Set set2 = mp2Var.c;
                byte b2 = mp2Var.d;
                boolean z = mp2Var.e;
                mp2Var = new mp2(str, set, set2, b2, z ? 1 : 0, v82Var, mp2Var.g);
            }
            arrayList.add(mp2Var);
        }
        return arrayList;
    }

    @Override // e51
    public final byte[] g(int i, int i2, byte[] bArr) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // i8a
    public final q7a g0(ize izeVar, JSONObject jSONObject) {
        return p0(izeVar);
    }

    @Override // bb2
    public final boolean g2(k27 k27Var) {
        return true;
    }

    @Override // lo7
    public final long h(ja3 ja3Var) {
        return -1L;
    }

    @Override // bb2
    public final boolean h0() {
        return false;
    }

    @Override // bb2
    public final boolean h1(gb2 gb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // p30
    public final void i(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3) {
        if (i < i2) {
            w26.j("Illegal use of DownsampleAudioResampler");
            return;
        }
        if (i3 != 1 && i3 != 2) {
            w26.j(de9.k(i3, "Illegal use of DownsampleAudioResampler. Channels:"));
            return;
        }
        int remaining = shortBuffer.remaining() / i3;
        int ceil = (int) Math.ceil((i2 / i) * remaining);
        int i4 = remaining - ceil;
        float f2 = ceil;
        float f3 = f2 / f2;
        float f4 = i4;
        float f5 = f4 / f4;
        while (ceil > 0 && i4 > 0) {
            if (f3 >= f5) {
                shortBuffer2.put(shortBuffer.get());
                if (i3 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                ceil--;
                f3 = ceil / f2;
            } else {
                shortBuffer.position(shortBuffer.position() + i3);
                i4--;
                f5 = i4 / f4;
            }
        }
    }

    @Override // ok6
    public final boolean j(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // lo7
    public final fv9 k() {
        return new oc0(-9223372036854775807L);
    }

    @Override // bb2
    public final boolean k2(gb2 gb2Var, TLRPC.User user) {
        return false;
    }

    @Override // bb2
    public final boolean l() {
        byte b2 = this.a;
        return true;
    }

    @Override // bb2
    public final boolean l2(gb2 gb2Var) {
        return false;
    }

    @Override // ok6
    public final boolean m0() {
        return false;
    }

    @Override // c38
    public final /* bridge */ /* synthetic */ Object n0(ua9 ua9Var) {
        return null;
    }

    @Override // bb2
    public final boolean r0(gb2 gb2Var, boolean z) {
        return false;
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                return "NoDeclaredBrand";
            default:
                return super.toString();
        }
    }

    @Override // rk1
    public final d v() {
        return null;
    }

    @Override // bb2
    public final boolean w0(gb2 gb2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // bb2
    public final String x(long j) {
        return null;
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

    @Override // l74
    public final void B() {
    }

    @Override // bb2
    public final void B0() {
    }

    @Override // bb2
    public final void C2() {
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

    @Override // bb2
    public final void p() {
    }

    @Override // bb2
    public final void t() {
    }

    @Override // bb2
    public final void u2() {
    }

    @Override // rk1
    public final void C(long j) {
    }

    @Override // bb2
    public final void D1(h27 h27Var) {
    }

    @Override // bb2
    public final void E(gb2 gb2Var) {
    }

    @Override // rk1
    public final void G(uk1 uk1Var) {
    }

    @Override // bb2
    public final void H2(gb2 gb2Var) {
    }

    @Override // bb2
    public final void I(gb2 gb2Var) {
    }

    @Override // bb2
    public final void M1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void N0(gb2 gb2Var) {
    }

    @Override // rk1
    public final void R(uk1 uk1Var) {
    }

    @Override // bb2
    public final void S(gb2 gb2Var) {
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

    @Override // l74
    public final void f0(fv9 fv9Var) {
    }

    @Override // bb2
    public final void i0(k27 k27Var) {
    }

    @Override // lo7
    public final void j0(long j) {
    }

    @Override // bb2
    public final void k0(String str) {
    }

    @Override // bb2
    public final void l1(gb2 gb2Var) {
    }

    @Override // rk1
    public final void m(uk1 uk1Var) {
    }

    @Override // bb2
    public final void n1(gb2 gb2Var) {
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

    @Override // rk1
    public final void r(uk1 uk1Var) {
    }

    @Override // bb2
    public final void v2(gb2 gb2Var) {
    }

    @Override // rk1
    public final void w(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // bb2
    public final void x1(gb2 gb2Var) {
    }

    @Override // rk1
    public final void A(uk1 uk1Var, int i) {
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

    @Override // rk1
    public final void n(uk1 uk1Var, String str) {
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
    public final void Y0(gb2 gb2Var, float f2, float f3) {
    }

    @Override // rk1
    public final void Z(uk1 uk1Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // rk1
    public final void o(uk1 uk1Var, int i, int i2) {
    }

    @Override // bb2
    public final void s2(gb2 gb2Var, float f2, float f3) {
    }

    @Override // rk1
    public final void u(uk1 uk1Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // bb2
    public final void v0(gb2 gb2Var, int i, int i2) {
    }

    @Override // bb2
    public final void v1(gb2 gb2Var, float f2, float f3) {
    }

    @Override // bb2
    public final void x2(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override // bb2
    public final void z(gb2 gb2Var, float f2, float f3) {
    }

    @Override // bb2
    public final void D(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // bb2
    public final void b0(gb2 gb2Var, TLRPC.User user, float f2, float f3) {
    }

    @Override // wq9
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // wq9
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
    }

    @Override // bb2
    public final void s(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override // bb2
    public final void z0(gb2 gb2Var, float f2, float f3, boolean z) {
    }

    @Override // bb2
    public final void M(gb2 gb2Var, int i, float f2, float f3, boolean z) {
    }

    @Override // bb2
    public final void m1(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    @Override // bb2
    public final void r1(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override // rk1
    public final void y(uk1 uk1Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    @Override // bb2
    public final void i2(gb2 gb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    @Override // bb2
    public final void I1(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
