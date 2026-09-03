package cb;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import j$.util.DesugarCollections;
import j3.n0;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Executors;
import o3.d0;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.wg;
import org.telegram.ui.cv0;
import org.telegram.ui.pn;
import r3.v;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class b implements b6.l, a3.b, e2.d, g9.a, jf.a, nf.a, o3.p, oe.b, eg, j1, t0, q4.l, r3.m, ra.m, ji, c9.f {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean B0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ boolean B1() {
        return false;
    }

    @Override // o3.p
    public /* synthetic */ o3.o C(o3.m mVar, n0 n0Var) {
        return o3.o.o;
    }

    @Override // org.telegram.ui.Components.ji
    public void C0(wg wgVar) {
        wgVar.run();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ m9 D2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean F1() {
        return false;
    }

    public boolean F2(CharSequence charSequence) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers H() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ boolean H0() {
        return true;
    }

    @Override // b6.l
    public /* bridge */ /* synthetic */ Object J(com.google.android.gms.common.api.q qVar) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean K1(s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // jf.a
    public boolean M0(Context context) {
        return e0.b.m(context);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean P(s1 s1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override // oe.b
    public oe.a P0(f7.b bVar) {
        return new ke.j(bVar);
    }

    @Override // nf.a
    public int P1(int i10, int i11, int i12) {
        return (i11 == 6 ? nf.a.m : i11 > i12 ? nf.a.j : i11 < i12 ? nf.a.k : nf.a.l).P1(i10, i11, i12);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R(s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public void R1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        ze.d.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle S1(s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ p2 T0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean U1(s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int W() {
        return 0;
    }

    @Override // o3.p
    public o3.j W1(o3.m mVar, n0 n0Var) {
        if (n0Var.F == null) {
            return null;
        }
        return new o3.t(new o3.i(new d0(), 6001));
    }

    @Override // nf.a
    public void X0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        (i10 == 6 ? nf.a.m : i10 > i11 ? nf.a.j : i10 < i11 ? nf.a.k : nf.a.l).X0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ boolean X1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ ug.a Z() {
        return null;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a0(s1 s1Var) {
        return false;
    }

    @Override // q4.l
    public long a1() {
        throw new NoSuchElementException();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a2(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c0(s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c1(s1 s1Var, boolean z4) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ cv0 c2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ long d() {
        return 0L;
    }

    @Override // c9.f
    public Object d0(c5.j jVar) {
        switch (this.a) {
            case 26:
                return new i();
            default:
                synchronized (h7.s.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 != 3) {
                        StringBuilder sb = new StringBuilder();
                        if ((b10 & 1) == 0) {
                            sb.append(" enableFirelog");
                        }
                        if ((b10 & 2) == 0) {
                            sb.append(" firelogEventType");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                    h7.s.b(new h7.o());
                }
                return new ab.a(0);
        }
    }

    @Override // r3.m
    public v d2(int i10, int i11) {
        return new r3.j();
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean e() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean e2(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String g(s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ int g1() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean g2(s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // rc.a
    public Object get() {
        switch (this.a) {
            case 4:
                h7.u uVar = new h7.u(7);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(v2.d.a, new e3.b(30000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(v2.d.c, new e3.b(1000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(e3.c.b)));
                if (unmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(v2.d.b, new e3.b(86400000L, 86400000L, unmodifiableSet));
                if (hashMap.keySet().size() < v2.d.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new e3.a(uVar, hashMap);
            default:
                return new j6.a(Executors.newSingleThreadExecutor());
        }
    }

    @Override // jf.a
    public boolean h(Context context) {
        return e0.b.j(context);
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ boolean h0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean h1(int i10, s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ TL_stories.StoryItem i1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int k0(s1 s1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ boolean k1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ boolean l() {
        return false;
    }

    @Override // e2.d
    public void m0() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean m1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override // q4.l
    public long n0() {
        throw new NoSuchElementException();
    }

    @Override // org.telegram.ui.Components.eg
    public boolean n1() {
        return false;
    }

    @Override // q4.l
    public boolean next() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ int p() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean p0() {
        return false;
    }

    @Override // g9.a
    public void q2(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ TLRPC.Peer r() {
        return null;
    }

    @Override // e2.d
    public void r0(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean r2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean t0(u5 u5Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ boolean t1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ pn u0() {
        return null;
    }

    @Override // ra.m
    public Object u2() {
        switch (this.a) {
            case 22:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String w(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ boolean w2(v0 v0Var, float f10, float f11) {
        return false;
    }

    @Override // o3.p
    public int z(n0 n0Var) {
        return n0Var.F != null ? 1 : 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean z2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public void A2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B2() {
    }

    @Override // org.telegram.ui.Components.eg
    public void D() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E0() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void E1() {
    }

    @Override // org.telegram.ui.Components.eg
    public void E2() {
    }

    @Override // org.telegram.ui.Components.eg
    public void J1() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void L0() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void O0() {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void Q0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V1() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void X() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void Y0() {
    }

    @Override // o3.p
    public /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.eg
    public void c() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void i2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j() {
    }

    @Override // r3.m
    public void j1() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.eg
    public void n2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p1() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void q0() {
    }

    @Override // o3.p
    public /* synthetic */ void release() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.eg
    public void s1() {
    }

    @Override // org.telegram.ui.Components.eg
    public void t2() {
    }

    @Override // org.telegram.ui.Components.eg
    public void v() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void v1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v2() {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void w1() {
    }

    @Override // org.telegram.ui.Components.eg
    public void x0() {
    }

    @Override // org.telegram.ui.Components.eg
    public void x1() {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A(s1 s1Var) {
    }

    @Override // org.telegram.ui.Components.eg
    public void A1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void B(boolean z4) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void C1(long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void D1(v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.j1
    public void I0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void V0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.Components.eg
    public void Y(boolean z4) {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void Z0(Object obj) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void b0(v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void f0(int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public void f1(int i10) {
    }

    @Override // r3.m
    public void h2(r3.s sVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j2(s1 s1Var) {
    }

    @Override // org.telegram.ui.Components.eg
    public void k2(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void l0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void o0(v0 v0Var) {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void o1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.eg
    public void o2(boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s2(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void w0(v0 v0Var) {
    }

    @Override // org.telegram.ui.Components.eg
    public /* synthetic */ void x(float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1(s1 s1Var, boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public void J0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.eg
    public void K(float f10, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M(s1 s1Var, jh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N(int i10, s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U0(int i10, s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void V(v0 v0Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Y1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // o3.p
    public void e0(Looper looper, k3.k kVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void l2(s1 s1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void m2(v0 v0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(s1 s1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C2(s1 s1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(s1 s1Var, TLObject tLObject, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void G0(s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void N1(v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b1(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i0(s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void j0(v0 v0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void l1(v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Components.eg
    public void q1(CharSequence charSequence, boolean z4, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v0(s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.eg
    public void y1(View view, CharSequence charSequence, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void z1(s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A0(s1 s1Var, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y0(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.eg
    public void G(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void f2(s1 s1Var, int i10, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void y2(v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public void p2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ji
    public /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }

    @Override // org.telegram.ui.Components.ji
    public void G1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
    }
}
