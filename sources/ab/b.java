package ab;

import ag.j2;
import android.content.Context;
import android.os.Looper;
import android.text.style.CharacterStyle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import f5.d0;
import j$.util.concurrent.ConcurrentHashMap;
import j3.t0;
import j7.l1;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TreeSet;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.hl;
import org.telegram.ui.Components.ig;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.pb;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.rb;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.za;
import org.telegram.ui.Components.zg;
import org.telegram.ui.lu0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b implements a4.m, a9.e, Continuation, hf.a, mf.a, n3.i, nf.a, o3.m, qb, j1, pa.m, li, x3.g, z5.k {
    public static b b;
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    public static Calendar A3() {
        if (b == null) {
            b = new b(8);
        }
        b.getClass();
        return Calendar.getInstance();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A0(s1 s1Var, TLObject tLObject, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean A1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B0(s1 s1Var, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public void D0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // o3.m
    public void D1(o3.t tVar) {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F1(s1 s1Var, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // hf.a
    public boolean H0(Context context) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean H1(s1 s1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // a9.e
    public Object I0(a5.j jVar) {
        switch (this.a) {
            case 2:
                return new l((Context) jVar.a(Context.class));
            case 25:
                return new i();
            default:
                synchronized (f7.t.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 != 3) {
                        StringBuilder sb2 = new StringBuilder();
                        if ((b10 & 1) == 0) {
                            sb2.append(" enableFirelog");
                        }
                        if ((b10 & 2) == 0) {
                            sb2.append(" firelogEventType");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                    }
                    f7.t.a(new f7.o());
                }
                return new ya.a(0);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void J0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean J1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(int i10, s1 s1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M0(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // mf.a
    public int M1(int i10, int i11, int i12) {
        return (i11 == 6 ? mf.a.m : i11 > i12 ? mf.a.j : i11 < i12 ? mf.a.k : mf.a.l).M1(i10, i11, i12);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean O(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.j1
    public void O1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        ye.d.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean P() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void P0(int i10, s1 s1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle P1(s1 s1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q(s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R1(s1 s1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // mf.a
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        (i10 == 6 ? mf.a.m : i10 > i11 ? mf.a.j : i10 < i11 ? mf.a.k : mf.a.l).S0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.li
    public /* synthetic */ boolean T1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int V() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W0(s1 s1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ sg.a X() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void X0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Y(s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Y0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ lu0 Y1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Z(s1 s1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // o3.m
    public o3.w Z1(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Components.li
    public /* synthetic */ boolean a0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a2(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // n3.i
    public int b(t0 t0Var) {
        return t0Var.E != null ? 1 : 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean c() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void c0(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c1(int i10, s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c2(s1 s1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // hf.a
    public boolean d(Context context) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean d0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.qb
    public void e(rb rbVar, bb bbVar, za zaVar, cb cbVar) {
        o1.k kVar = new o1.k(rbVar, rb.IN_OUT_OFFSET_Y, rbVar.getHeight());
        kVar.u.a(0.8f);
        kVar.u.b(400.0f);
        kVar.a(new db(zaVar, 1));
        kVar.b(new ob(cbVar, rbVar, 0));
        kVar.f();
        bbVar.run();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e0(s1 s1Var, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // o3.m
    public void e1() {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e2(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int f0(s1 s1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String g(s1 s1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void g0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void g2(s1 s1Var, long j10) {
        int i10 = this.a;
    }

    @Override // n3.i
    public n3.e h(j2 j2Var, t0 t0Var) {
        if (t0Var.E == null) {
            return null;
        }
        return new m5.i(new n3.d(new n3.k(), 6001), 25);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean h1(MessageObject messageObject) {
        int i10 = this.a;
        return org.telegram.ui.b.a(messageObject);
    }

    @Override // x3.g
    public long i(o3.l lVar) {
        return -1L;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean j0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j2(s1 s1Var, hh.f fVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k1() {
        int i10 = this.a;
    }

    @Override // z5.k
    public /* bridge */ /* synthetic */ Object l(com.google.android.gms.common.api.q qVar) {
        return null;
    }

    @Override // n3.i
    public /* synthetic */ n3.h m(j2 j2Var, t0 t0Var) {
        return n3.h.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m0(String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean m2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean n0(y5 y5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n2(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p0(s1 s1Var, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p1(s1 s1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // pa.m
    public Object p2() {
        switch (this.a) {
            case 20:
                return new TreeSet();
            default:
                return new ConcurrentHashMap();
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.qb
    public void r(rb rbVar, bb bbVar, ig igVar, hl hlVar) {
        rbVar.setInOutOffset(rbVar.getMeasuredHeight());
        hlVar.accept(Float.valueOf(rbVar.getTranslationY()));
        o1.k kVar = new o1.k(rbVar, rb.IN_OUT_OFFSET_Y, 0.0f);
        kVar.u.a(0.8f);
        kVar.u.b(400.0f);
        kVar.a(new pb(0, rbVar, igVar));
        kVar.b(new ob(hlVar, rbVar, 1));
        kVar.f();
        bbVar.run();
    }

    @Override // nf.a
    public void r0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(l1.k(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
        }
        int remaining = shortBuffer.remaining() / i12;
        int ceil = (int) Math.ceil((i11 / i10) * remaining);
        int i13 = remaining - ceil;
        float f9 = ceil;
        float f10 = f9 / f9;
        float f11 = i13;
        float f12 = f11 / f11;
        while (ceil > 0 && i13 > 0) {
            if (f10 >= f12) {
                shortBuffer2.put(shortBuffer.get());
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                ceil--;
                f10 = ceil / f9;
            } else {
                shortBuffer.position(shortBuffer.position() + i12);
                i13--;
                f12 = i13 / f11;
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t0(s1 s1Var, TLRPC.User user, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (task.isSuccessful()) {
            return null;
        }
        Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(s1 s1Var, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean u2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // x3.g
    public o3.t v() {
        return new o3.o(-9223372036854775807L);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v0(s1 s1Var, float f9, float f10, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void w(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void w2() {
        int i10 = this.a;
    }

    @Override // a4.m
    public a4.n x(a4.l lVar) {
        int i10 = d0.a;
        if (i10 < 23 || i10 < 31) {
            return new f7.v(1).x(lVar);
        }
        int g10 = f5.o.g(lVar.c.B);
        f5.a.v("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + d0.B(g10));
        a4.b bVar = new a4.b(g10, 0);
        a4.b bVar2 = new a4.b(g10, 1);
        ze.b bVar3 = new ze.b();
        bVar3.a = bVar;
        bVar3.b = bVar2;
        return bVar3.x(lVar);
    }

    @Override // org.telegram.ui.Components.li
    public void x0(zg zgVar) {
        zgVar.run();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x2(s1 s1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String y(long j10) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ l9 y2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void z0() {
        int i10 = this.a;
    }

    private final /* synthetic */ void B3() {
    }

    private final /* synthetic */ void C3() {
    }

    private final /* synthetic */ void F3() {
    }

    private final /* synthetic */ void G3() {
    }

    private final /* synthetic */ void J() {
    }

    private final /* synthetic */ void J3() {
    }

    private final /* synthetic */ void K3() {
    }

    private final /* synthetic */ void M() {
    }

    private final /* synthetic */ void N3() {
    }

    private final /* synthetic */ void O3() {
    }

    private final /* synthetic */ void S2() {
    }

    private final /* synthetic */ void T2() {
    }

    private final /* synthetic */ void i0() {
    }

    private final /* synthetic */ void k0() {
    }

    private final /* synthetic */ void l2() {
    }

    private final /* synthetic */ void o2() {
    }

    @Override // org.telegram.ui.Components.li
    public /* synthetic */ void L0() {
    }

    @Override // n3.i
    public /* synthetic */ void a() {
    }

    @Override // n3.i
    public /* synthetic */ void release() {
    }

    @Override // org.telegram.ui.Components.li
    public /* synthetic */ void u0() {
    }

    private final /* synthetic */ void C0(s1 s1Var) {
    }

    private final /* synthetic */ void E0(s1 s1Var) {
    }

    private final /* synthetic */ void E1(s1 s1Var) {
    }

    private final /* synthetic */ void E2(s1 s1Var) {
    }

    private final /* synthetic */ void F2(s1 s1Var) {
    }

    private final /* synthetic */ void G1(s1 s1Var) {
    }

    private final /* synthetic */ void H3(int i10) {
    }

    private final /* synthetic */ void I2(s1 s1Var) {
    }

    private final /* synthetic */ void I3(int i10) {
    }

    private final /* synthetic */ void J2(s1 s1Var) {
    }

    private final /* synthetic */ void K1(s1 s1Var) {
    }

    private final /* synthetic */ void K2(s1 s1Var) {
    }

    private final /* synthetic */ void L2(s1 s1Var) {
    }

    private final /* synthetic */ void L3(MessageObject messageObject) {
    }

    private final /* synthetic */ void M2(s1 s1Var) {
    }

    private final /* synthetic */ void M3(MessageObject messageObject) {
    }

    private final /* synthetic */ void N2(s1 s1Var) {
    }

    private final /* synthetic */ void Q2(s1 s1Var) {
    }

    private final /* synthetic */ void R2(s1 s1Var) {
    }

    private final /* synthetic */ void T0(s1 s1Var) {
    }

    private final /* synthetic */ void U(s1 s1Var) {
    }

    private final /* synthetic */ void W(s1 s1Var) {
    }

    private final /* synthetic */ void Z0(s1 s1Var) {
    }

    private final /* synthetic */ void a1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void a3(String str) {
    }

    private final /* synthetic */ void b0(s1 s1Var) {
    }

    private final /* synthetic */ void b1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void b3(String str) {
    }

    private final /* synthetic */ void d1(s1 s1Var) {
    }

    private final /* synthetic */ void d2(s1 s1Var) {
    }

    private final /* synthetic */ void f1(s1 s1Var) {
    }

    private final /* synthetic */ void g3(s1 s1Var) {
    }

    private final /* synthetic */ void h0(s1 s1Var) {
    }

    private final /* synthetic */ void h3(s1 s1Var) {
    }

    private final /* synthetic */ void k3(s1 s1Var) {
    }

    private final /* synthetic */ void l0(s1 s1Var) {
    }

    private final /* synthetic */ void l1(s1 s1Var) {
    }

    private final /* synthetic */ void l3(s1 s1Var) {
    }

    private final /* synthetic */ void m3(MessageObject messageObject) {
    }

    private final /* synthetic */ void n1(s1 s1Var) {
    }

    private final /* synthetic */ void n3(MessageObject messageObject) {
    }

    private final /* synthetic */ void o0(s1 s1Var) {
    }

    private final /* synthetic */ void o3(s1 s1Var) {
    }

    private final /* synthetic */ void p3(s1 s1Var) {
    }

    private final /* synthetic */ void r1(s1 s1Var) {
    }

    private final /* synthetic */ void s1(s1 s1Var) {
    }

    private final /* synthetic */ void s3(s1 s1Var) {
    }

    private final /* synthetic */ void t3(s1 s1Var) {
    }

    private final void u3(s1 s1Var) {
    }

    private final void w3(s1 s1Var) {
    }

    private final /* synthetic */ void y3(s1 s1Var) {
    }

    private final /* synthetic */ void z3(s1 s1Var) {
    }

    @Override // org.telegram.ui.Components.li
    public /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.li
    public /* synthetic */ void j1(TLRPC.User user) {
    }

    @Override // x3.g
    public void z(long j10) {
    }

    private final /* synthetic */ void G(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void G2(s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void H2(s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void I(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void c3(s1 s1Var, long j10) {
    }

    private final /* synthetic */ void d3(s1 s1Var, long j10) {
    }

    private final /* synthetic */ void g1(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void i1(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void i2(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void k2(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void o1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void q0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void q1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void q3(s1 s1Var, hh.f fVar) {
    }

    private final /* synthetic */ void r3(s1 s1Var, hh.f fVar) {
    }

    private final /* synthetic */ void s0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void v3(s1 s1Var, boolean z10) {
    }

    private final /* synthetic */ void w1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void x1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void x3(s1 s1Var, boolean z10) {
    }

    private final /* synthetic */ void y1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void z1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // n3.i
    public void q(Looper looper, k3.k kVar) {
    }

    private final /* synthetic */ void B(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void D(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void O0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void O2(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void P2(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void Q0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void U2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void V2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void i3(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void j3(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void r2(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void t1(s1 s1Var, int i10, int i11) {
    }

    private final /* synthetic */ void t2(s1 s1Var, float f9, float f10) {
    }

    private final /* synthetic */ void v1(s1 s1Var, int i10, int i11) {
    }

    private final /* synthetic */ void W2(s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    private final /* synthetic */ void X2(s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    private final /* synthetic */ void Y2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void Z2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void f2(s1 s1Var, float f9, float f10, boolean z10) {
    }

    private final /* synthetic */ void h2(s1 s1Var, float f9, float f10, boolean z10) {
    }

    private final /* synthetic */ void v2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void z2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void A2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    private final /* synthetic */ void B2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    private final /* synthetic */ void C2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
    }

    private final /* synthetic */ void D2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
    }

    private final /* synthetic */ void e3(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void f3(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void G0(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    private final /* synthetic */ void K0(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    private final /* synthetic */ void D3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void E3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.li
    public /* synthetic */ void X1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override // org.telegram.ui.Components.li
    public void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
