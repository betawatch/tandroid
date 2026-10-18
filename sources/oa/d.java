package oa;

import a3.n0;
import ah.t;
import android.content.Context;
import android.text.style.CharacterStyle;
import android.util.Log;
import b2.a2;
import b2.w0;
import c3.c0;
import c3.j0;
import c3.q;
import c5.b0;
import g2.j;
import g2.u;
import g2.x;
import gb.n;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import l.w;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Wallet.z5;
import org.telegram.ui.xu0;
import z3.k;
import z3.m;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class d implements n0, androidx.car.app.messaging.model.b, q, cg.a, dg.a, ea.c, n, ri, w, r9.d, l1, n5.b, r4.d, k {
    public static d b;
    public static d c;
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i10) {
        this.a = i10;
    }

    public static String K3(cd.c cVar) {
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

    public static void N3(String str) {
        if (str == null || str.length() == 0) {
            throw new vc.c("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
        }
        if (str.startsWith("sk_")) {
            throw new vc.c("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
    }

    public static Calendar w3() {
        if (c == null) {
            c = new d(28);
        }
        c.getClass();
        return Calendar.getInstance();
    }

    public static k4.d x3(z5 z5Var, b0 b0Var) {
        IOException iOException = (IOException) b0Var.c;
        if (!(iOException instanceof x)) {
            return null;
        }
        int i10 = ((x) iOException).c;
        if (i10 != 403 && i10 != 404 && i10 != 410 && i10 != 416 && i10 != 500 && i10 != 503) {
            return null;
        }
        if (z5Var.c(1)) {
            return new k4.d(1, 300000L);
        }
        if (z5Var.c(2)) {
            return new k4.d(2, 60000L);
        }
        return null;
    }

    public static long z3(b0 b0Var) {
        for (Throwable th2 = (IOException) b0Var.c; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof u) || (th2 instanceof y2.k)) {
                return -9223372036854775807L;
            }
            if ((th2 instanceof j) && ((j) th2).a == 2008) {
                return -9223372036854775807L;
            }
        }
        return Math.min((b0Var.b - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean B1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // dg.a
    public void C(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(i2.d.j(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
        }
        int remaining = shortBuffer.remaining() / i12;
        int ceil = (int) Math.ceil((i11 / i10) * remaining);
        int i13 = remaining - ceil;
        float f7 = ceil;
        float f10 = f7 / f7;
        float f11 = i13;
        float f12 = f11 / f11;
        while (ceil > 0 && i13 > 0) {
            if (f10 >= f12) {
                shortBuffer2.put(shortBuffer.get());
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                ceil--;
                f10 = ceil / f7;
            } else {
                shortBuffer.position(shortBuffer.position() + i12);
                i13--;
                f12 = i13 / f11;
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public void C0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(u1 u1Var) {
        int i10 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.l1
    public void G1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        pf.d.r(u1Var.getContext(), str);
    }

    @Override // c3.q
    public void H() {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle H1(u1 u1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J0(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J1(u1 u1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K(int i10, u1 u1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(u1 u1Var, t tVar) {
        int i10 = this.a;
    }

    @Override // z3.k
    public int L(b2.w wVar) {
        return 1;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M0(int i10, u1 u1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean N(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P() {
        switch (this.a) {
        }
        return false;
    }

    @Override // cg.a
    public void P0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ xu0 P1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(u1 u1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q1(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S0(u1 u1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S1(u1 u1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int V() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ ih.a W() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W1(u1 u1Var, long j10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z(u1 u1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z0(int i10, u1 u1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // z3.k
    public boolean a0(b2.w wVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c0(u1 u1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c2(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d0(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d1(MessageObject messageObject) {
        int i10 = this.a;
        return c1.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f0(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f1() {
        int i10 = this.a;
    }

    @Override // gb.n
    public Object f2() {
        switch (this.a) {
            case 9:
                return new TreeSet();
            default:
                return new ConcurrentHashMap();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String g(u1 u1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // c3.q
    public void g0(c0 c0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g2() {
        int i10 = this.a;
    }

    @Override // hd.a
    public Object get() {
        rb.b bVar = new rb.b(24);
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(i5.d.a, new r5.b(30000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(i5.d.c, new r5.b(1000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(r5.c.b)));
        if (unmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(i5.d.b, new r5.b(86400000L, 86400000L, unmodifiableSet));
        if (hashMap.keySet().size() < i5.d.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new r5.a(bVar, hashMap);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int h0(u1 u1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j() {
        int i10 = this.a;
    }

    @Override // c3.q
    public j0 j0(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // r9.d
    public Object j2(com.google.android.gms.internal.cast.z5 z5Var) {
        switch (this.a) {
            case 15:
                return new sb.a(0);
            case 16:
                return new rb.b(0);
            default:
                return new rb.k((Context) z5Var.a(Context.class));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k1(u1 u1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean l0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean l2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(a6 a6Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o2(u1 u1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p1(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ o9 p2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q0(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.ri
    public void r(gh ghVar) {
        ghVar.run();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // ea.c
    public ea.a s0(t7.u uVar, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        com.google.android.gms.internal.cast.a aVar = jSONObject.has("session") ? new com.google.android.gms.internal.cast.a(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new com.google.android.gms.internal.cast.a(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new ea.a(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), aVar, new bc.d(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // l.w
    public boolean u(l.k kVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u0(u1 u1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v0(u1 u1Var, float f7, float f10, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean v1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String w(long j10) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w1(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // r4.d
    public void x() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x1(u1 u1Var, boolean z10) {
        int i10 = this.a;
    }

    @Override // z3.k
    public m y(b2.w wVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0() {
        int i10 = this.a;
    }

    public int y3(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    @Override // r4.d
    public void z(int i10, Object obj) {
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0(u1 u1Var, TLObject tLObject, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean z1(u1 u1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    private final /* synthetic */ void A3() {
    }

    private final /* synthetic */ void B3() {
    }

    private final /* synthetic */ void D0() {
    }

    private final /* synthetic */ void E3() {
    }

    private final /* synthetic */ void F0() {
    }

    private final /* synthetic */ void F3() {
    }

    private final /* synthetic */ void I3() {
    }

    private final /* synthetic */ void J3() {
    }

    private final /* synthetic */ void O2() {
    }

    private final /* synthetic */ void O3() {
    }

    private final /* synthetic */ void P2() {
    }

    private final /* synthetic */ void P3() {
    }

    private final /* synthetic */ void Y() {
    }

    private final /* synthetic */ void o() {
    }

    private final /* synthetic */ void q2() {
    }

    private final /* synthetic */ void r2() {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void E() {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void J() {
    }

    @Override // a3.n0
    public /* synthetic */ void U() {
    }

    @Override // a3.n0
    public /* synthetic */ void h() {
    }

    @Override // a3.n0
    public /* synthetic */ void onFirstFrameRendered() {
    }

    private final /* synthetic */ void A2(u1 u1Var) {
    }

    private final /* synthetic */ void B0(u1 u1Var) {
    }

    private final /* synthetic */ void B2(u1 u1Var) {
    }

    private final /* synthetic */ void E2(u1 u1Var) {
    }

    private final /* synthetic */ void F2(u1 u1Var) {
    }

    private final /* synthetic */ void G2(u1 u1Var) {
    }

    private final /* synthetic */ void G3(int i10) {
    }

    private final /* synthetic */ void H0(u1 u1Var) {
    }

    private final /* synthetic */ void H2(u1 u1Var) {
    }

    private final /* synthetic */ void H3(int i10) {
    }

    private final /* synthetic */ void I0(u1 u1Var) {
    }

    private final /* synthetic */ void I2(u1 u1Var) {
    }

    private final /* synthetic */ void J2(u1 u1Var) {
    }

    private final /* synthetic */ void L3(MessageObject messageObject) {
    }

    private final /* synthetic */ void M2(u1 u1Var) {
    }

    private final /* synthetic */ void M3(MessageObject messageObject) {
    }

    private final /* synthetic */ void N2(u1 u1Var) {
    }

    private final /* synthetic */ void Q0(u1 u1Var) {
    }

    private final /* synthetic */ void U0(u1 u1Var) {
    }

    private final /* synthetic */ void W2(String str) {
    }

    private final /* synthetic */ void X2(String str) {
    }

    private final /* synthetic */ void Y1(u1 u1Var) {
    }

    private final /* synthetic */ void Z1(u1 u1Var) {
    }

    private final /* synthetic */ void a2(u1 u1Var) {
    }

    private final /* synthetic */ void b1(u1 u1Var) {
    }

    private final /* synthetic */ void c1(u1 u1Var) {
    }

    private final /* synthetic */ void c3(u1 u1Var) {
    }

    private final /* synthetic */ void d2(u1 u1Var) {
    }

    private final /* synthetic */ void d3(u1 u1Var) {
    }

    private final /* synthetic */ void e1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void g1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void g3(u1 u1Var) {
    }

    private final /* synthetic */ void h3(u1 u1Var) {
    }

    private final /* synthetic */ void i1(u1 u1Var) {
    }

    private final /* synthetic */ void i3(MessageObject messageObject) {
    }

    private final /* synthetic */ void j1(u1 u1Var) {
    }

    private final /* synthetic */ void j3(MessageObject messageObject) {
    }

    private final /* synthetic */ void k0(u1 u1Var) {
    }

    private final /* synthetic */ void k3(u1 u1Var) {
    }

    private final /* synthetic */ void l3(u1 u1Var) {
    }

    private final /* synthetic */ void m0(u1 u1Var) {
    }

    private final /* synthetic */ void n1(u1 u1Var) {
    }

    private final /* synthetic */ void o1(u1 u1Var) {
    }

    private final /* synthetic */ void o3(u1 u1Var) {
    }

    private final /* synthetic */ void p3(u1 u1Var) {
    }

    private final void q3(u1 u1Var) {
    }

    private final /* synthetic */ void s1(u1 u1Var) {
    }

    private final void s3(u1 u1Var) {
    }

    private final /* synthetic */ void t0(u1 u1Var) {
    }

    private final /* synthetic */ void t1(u1 u1Var) {
    }

    private final /* synthetic */ void u3(u1 u1Var) {
    }

    private final /* synthetic */ void v3(u1 u1Var) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void O(Object obj) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void X(TLRPC.User user) {
    }

    @Override // a3.n0
    public /* synthetic */ void onVideoSizeChanged(a2 a2Var) {
    }

    private final /* synthetic */ void C1(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void C2(u1 u1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void D2(u1 u1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void L0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void N0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void T1(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void V1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void X1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void Y2(u1 u1Var, long j10) {
    }

    private final /* synthetic */ void Z2(u1 u1Var, long j10) {
    }

    private final /* synthetic */ void f(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void k(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void k2(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void l1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void m1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void m2(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void m3(u1 u1Var, t tVar) {
    }

    private final /* synthetic */ void n3(u1 u1Var, t tVar) {
    }

    private final /* synthetic */ void q1(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void r1(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void r3(u1 u1Var, boolean z10) {
    }

    private final /* synthetic */ void t3(u1 u1Var, boolean z10) {
    }

    @Override // l.w
    public void d(l.k kVar, boolean z10) {
    }

    private final /* synthetic */ void K2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void L2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void Q2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void R2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void Y0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void a(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void a1(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void b(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void e3(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void f3(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void s2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void t2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void u1(u1 u1Var, int i10, int i11) {
    }

    private final /* synthetic */ void y1(u1 u1Var, int i10, int i11) {
    }

    @Override // cg.a
    public int E1(int i10, int i11, int i12) {
        return i10;
    }

    private final /* synthetic */ void S2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void T2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void U2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void V2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void e2(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void h2(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void u2(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void v2(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void a3(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void b3(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void w2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void x2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void y2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void z2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void W0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void X0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void C3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void D3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override // org.telegram.ui.Components.ri
    public void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
