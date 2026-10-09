package ob;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.text.style.CharacterStyle;
import android.view.View;
import b2.s;
import b4.i;
import c3.b0;
import c3.h0;
import c3.q;
import ci.u5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import da.b;
import da.d;
import e2.d0;
import f4.e;
import fb.n;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import n2.g;
import n2.j;
import n2.l;
import n2.m;
import n2.w;
import of.f;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.wi;
import org.telegram.ui.pn;
import org.telegram.ui.qv0;
import r0.r;
import sc.v;
import x9.c;
import z3.k;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class a implements bg.a, q, cg.a, d, n, wi, y2.n, m, q9.d, qg, l1, t0, r, u5.a, Continuation, c, y6.d, k {
    public static a b;
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static String G2(bd.c cVar) {
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ boolean C1() {
        return false;
    }

    @Override // da.d
    public b D(rb.a aVar, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        com.google.android.gms.internal.cast.a aVar2 = jSONObject.has("session") ? new com.google.android.gms.internal.cast.a(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new com.google.android.gms.internal.cast.a(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new b(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), aVar2, new ac.d(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean D0(MessageObject messageObject) {
        return true;
    }

    @Override // z3.k
    public boolean D1(s sVar) {
        String str = sVar.r;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ p9 E2() {
        return null;
    }

    @Override // x9.c
    public String H() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean H1() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ boolean I0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean M1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O1() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers P() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q() {
        return false;
    }

    @Override // n2.m
    public int Q0(s sVar) {
        return sVar.v != null ? 1 : 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R(u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ n2 T0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public void T1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        f.s(u1Var.getContext(), str);
    }

    @Override // z3.k
    public int U0(s sVar) {
        String str = sVar.r;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(v.i("Unsupported MIME type: ", str));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle U1(u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int W() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ hh.a Y() {
        return null;
    }

    @Override // bg.a
    public void Y0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ boolean Y1() {
        return false;
    }

    @Override // u5.a
    public long Z() {
        return System.currentTimeMillis();
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b2(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c1(u1 u1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ long d() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean e() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override // n2.m
    public g e1(j jVar, s sVar) {
        if (sVar.v == null) {
            return null;
        }
        return new n2.n(new n2.f(6001, new w()));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ qv0 e2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.wi
    public void f0(jh jhVar) {
        jhVar.run();
    }

    @Override // c3.q
    public h0 f2(int i10, int i11) {
        return new c3.n();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String g(u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g2(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean h0() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ int h1() {
        return 0;
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ boolean i0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean i1(int i10, u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean i2(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ TL_stories.StoryItem j1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int l0(u1 u1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ boolean l1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ boolean m() {
        return false;
    }

    @Override // n2.m
    public /* synthetic */ l n0(j jVar, s sVar) {
        return l.u;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n1(MessageObject messageObject) {
        return c1.a(messageObject);
    }

    @Override // org.telegram.ui.Components.qg
    public boolean o1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean p0() {
        return false;
    }

    @Override // y6.d
    public a3.l q(Context context, String str, y6.c cVar) {
        a3.l lVar = new a3.l();
        lVar.a = cVar.q(context, str);
        int i10 = 1;
        int m10 = cVar.m(context, str, true);
        lVar.b = m10;
        int i11 = lVar.a;
        if (i11 == 0) {
            i11 = 0;
            if (m10 == 0) {
                i10 = 0;
                lVar.c = i10;
                return lVar;
            }
        }
        if (m10 < i11) {
            i10 = -1;
        }
        lVar.c = i10;
        return lVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean r2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // z3.k
    public z3.m s0(s sVar) {
        String str = sVar.r;
        List list = sVar.u;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new i(list);
                case "application/pgs":
                    return new com.google.firebase.messaging.s(2);
                case "application/x-mp4-vtt":
                    return new a4.l();
                case "text/vtt":
                    return new pf.b(19);
                case "application/x-quicktime-tx3g":
                    return new g4.a(list);
                case "text/x-ssa":
                    return new d4.a(list);
                case "application/vobsub":
                    return new com.google.firebase.messaging.s(list);
                case "application/x-subrip":
                    return new e4.a();
                case "application/ttml+xml":
                    return new e();
            }
        }
        throw new IllegalArgumentException(v.i("Unsupported MIME type: ", str));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean t0(b6 b6Var) {
        return false;
    }

    @Override // y2.n
    public Object t2(Uri uri, g2.k kVar) {
        return Long.valueOf(d0.S(new BufferedReader(new InputStreamReader(kVar)).readLine()));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* bridge */ /* synthetic */ Object then(Task task) {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ pn u0() {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ boolean u1() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ int v() {
        return 0;
    }

    @Override // fb.n
    public Object v2() {
        switch (this.a) {
            case 8:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String w(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ TLRPC.Peer x() {
        return null;
    }

    @Override // cg.a
    public void x0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            cg.a.q.x0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            cg.a.p.x0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else {
            if (i10 != i11) {
                throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
            }
            shortBuffer2.put(shortBuffer);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ boolean x2(w0 w0Var, float f7, float f10) {
        return false;
    }

    @Override // q9.d
    public Object y0(u5 u5Var) {
        switch (this.a) {
            case 14:
                return new rb.a(0);
            default:
                return new qb.b(0);
        }
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void B0() {
    }

    @Override // org.telegram.ui.Components.qg
    public void B2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0() {
    }

    @Override // org.telegram.ui.Components.qg
    public void F2() {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void G1() {
    }

    @Override // org.telegram.ui.Components.qg
    public void J() {
    }

    @Override // org.telegram.ui.Components.qg
    public void L1() {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void M0() {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void O0() {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void P0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X1() {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void Z0() {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void a0() {
    }

    @Override // n2.m
    public /* synthetic */ void b() {
    }

    @Override // x9.c
    public void c() {
    }

    @Override // org.telegram.ui.Components.qg
    public void h() {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void j2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k() {
    }

    @Override // c3.q
    public void k1() {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void l() {
    }

    @Override // org.telegram.ui.Components.qg
    public void o2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void q0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q1() {
    }

    @Override // n2.m
    public /* synthetic */ void release() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.qg
    public void t1() {
    }

    @Override // org.telegram.ui.Components.qg
    public void u2() {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void w1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w2() {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void x1() {
    }

    @Override // org.telegram.ui.Components.qg
    public void y() {
    }

    @Override // org.telegram.ui.Components.qg
    public void y1() {
    }

    @Override // org.telegram.ui.Components.qg
    public void z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(u1 u1Var) {
    }

    @Override // org.telegram.ui.Components.qg
    public void B1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void C(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void E1(long j3) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void F1(w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void J0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J1(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q1(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void W0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void a1(Object obj) {
    }

    @Override // org.telegram.ui.Components.qg
    public void c0(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void d0(w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d1(u1 u1Var) {
    }

    @Override // c3.q
    public void d2(b0 b0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f1(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(int i10) {
    }

    @Override // org.telegram.ui.Components.qg
    public void g1(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k2(u1 u1Var) {
    }

    @Override // org.telegram.ui.Components.qg
    public void l2(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void o0(w0 w0Var) {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void p1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.qg
    public void p2(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s2(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void w0(w0 w0Var) {
    }

    @Override // org.telegram.ui.Components.qg
    public /* synthetic */ void z(float f7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // n2.m
    public void F(Looper looper, j2.k kVar) {
    }

    @Override // org.telegram.ui.Components.qg
    public void K0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(u1 u1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(int i10, u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Components.qg
    public void V(float f7, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V0(int i10, u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void X(w0 w0Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(u1 u1Var, bi.f fVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m2(u1 u1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void n2(w0 w0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v1(u1 u1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D2(u1 u1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void P1(w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // bg.a
    public int R1(int i10, int i11, int i12) {
        return i10;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b1(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void k0(w0 w0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void m1(w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Components.qg
    public void r1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Components.qg
    public void z1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void a2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // r0.r
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override // r0.r
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    @Override // org.telegram.ui.Components.qg
    public void K(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void z2(w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public void q2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void c2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override // org.telegram.ui.Components.wi
    public void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
