package cb;

import android.content.Context;
import android.text.style.CharacterStyle;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import dg.u3;
import g5.a0;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import mg.w;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.wg;
import org.telegram.ui.p61;
import org.telegram.ui.vu0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class b implements c9.e, e2.d, g5.l, SuccessContinuation, j9.c, m6.d, p61, c9.f, of.a, jo0, k1, pf.a, r3.c, ra.m, ji {
    public static volatile b b;
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    public static void h(String str) {
        if (str == null || str.length() == 0) {
            throw new fc.c("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
        }
        if (str.startsWith("sk_")) {
            throw new fc.c("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ n9 C2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean D1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean I1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean K1() {
        return false;
    }

    @Override // of.a
    public int N1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
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
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("Output must be 2 or 1 channels");
        }
        int min = Math.min(shortBuffer.remaining() / i10, shortBuffer2.remaining() / i11);
        for (int i12 = 0; i12 < min; i12++) {
            short s6 = shortBuffer.get();
            short s9 = shortBuffer.get();
            shortBuffer.position(shortBuffer.position() + 4);
            if (i11 == 2) {
                shortBuffer2.put(s6);
                shortBuffer2.put(s9);
            } else if (i11 == 1) {
                shortBuffer2.put(z9.d.v3(s6, s9));
            }
        }
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ boolean V() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int W() {
        return 0;
    }

    @Override // org.telegram.ui.Components.jo0
    public void Y(float f10, boolean z4) {
        u3.b = f10 * 2.0f;
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a0(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ vu0 a2() {
        return null;
    }

    @Override // c9.f
    public List b(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (c9.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.a;
            if (str != null) {
                bVar = new c9.b(str, bVar.b, bVar.c, bVar.d, bVar.e, new w(5, str, bVar), bVar.g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override // j9.c
    public String c() {
        return null;
    }

    @Override // g5.l
    public g5.m createDataSource() {
        return new a0(false);
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
        return true;
    }

    @Override // c9.e
    public Object f0(c5.j jVar) {
        switch (this.a) {
            case 4:
                return new l((Context) jVar.a(Context.class));
            case 26:
                return new db.a(0);
            default:
                return new b(0);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f2(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Components.jo0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean h0() {
        return false;
    }

    @Override // org.telegram.ui.Components.jo0
    public /* synthetic */ int j0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean j1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int k0(t1 t1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean n0() {
        return false;
    }

    @Override // m6.d
    public e8.a p(Context context, String str, m6.c cVar) {
        e8.a aVar = new e8.a();
        aVar.a = cVar.C(context, str);
        int i10 = 1;
        int p10 = cVar.p(context, str, true);
        aVar.b = p10;
        int i11 = aVar.a;
        if (i11 == 0) {
            i11 = 0;
            if (p10 == 0) {
                i10 = 0;
                aVar.c = i10;
                return aVar;
            }
        }
        if (p10 < i11) {
            i10 = -1;
        }
        aVar.c = i10;
        return aVar;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean p2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean q0(u5 u5Var) {
        return false;
    }

    @Override // ra.m
    public Object s2() {
        switch (this.a) {
            case 22:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override // pf.a
    public void u0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            pf.a.u.u0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            pf.a.t.u0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else {
            if (i10 != i11) {
                throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
            }
            shortBuffer2.put(shortBuffer);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String w(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Components.ji
    public void x(wg wgVar) {
        wgVar.run();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean y2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A2() {
    }

    @Override // org.telegram.ui.Components.jo0
    public void B() {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void C() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void V1() {
    }

    @Override // j9.c
    public void a() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j() {
    }

    @Override // e2.d
    public void l() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void D(Object obj) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void G(TLRPC.User user) {
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void a1(t1 t1Var) {
    }

    @Override // r3.c
    public long f(long j10) {
        return j10;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g0(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(t1 t1Var) {
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G1(t1 t1Var, boolean z4) {
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void X1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2(t1 t1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r1(t1 t1Var, TLRPC.Document document) {
    }

    @Override // e2.d
    public void v(int i10, Object obj) {
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W0(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s0(t1 t1Var, float f10, float f11) {
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void X(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }

    @Override // org.telegram.ui.Components.ji
    public void H(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
    }
}
