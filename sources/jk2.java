// default package

import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import java.io.Serializable;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.xml.sax.Attributes;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jk2 implements by2, qwc, lr2, u1e, z0c, d40, uz1, i40, lv8, mc2, rp5, ft8, am0, iaa, w23 {
    public final /* synthetic */ byte a;
    public static final /* synthetic */ jk2 b = new jk2(1);
    public static final String[] c = new String[0];
    public static final jk2 d = new jk2(3);
    public static final /* synthetic */ jk2 e = new jk2(4);
    public static final /* synthetic */ jk2 f = new jk2(5);
    public static final jk2 h = new jk2(6);
    public static final jk2 n = new jk2(7);
    public static final jk2 r = new jk2(8);
    public static final jk2 s = new jk2(9);
    public static final jk2 w = new jk2(10);
    public static final jk2 x = new jk2(11);
    public static final jk2 y = new jk2(12);
    public static final /* synthetic */ jk2 E = new jk2(13);

    public jk2() {
        this.a = (byte) 18;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public static wx2 S1(Editable editable, int i) {
        wx2[] wx2VarArr = (wx2[]) editable.getSpans(0, editable.length(), wx2.class);
        if (wx2VarArr.length == 0) {
            return null;
        }
        for (int length = wx2VarArr.length; length > 0; length--) {
            int i2 = length - 1;
            if (editable.getSpanFlags(wx2VarArr[i2]) == 17) {
                wx2 wx2Var = wx2VarArr[i2];
                if (wx2Var.a == i) {
                    return wx2Var;
                }
            }
        }
        return null;
    }

    public static boolean T1(boolean z, String str, Editable editable, Attributes attributes) {
        byte b2;
        Object obj = null;
        boolean z2 = false;
        if (str.startsWith("animated-emoji")) {
            if (z) {
                String a = vx2.a("data-document-id", attributes);
                if (a != null) {
                    editable.setSpan(new gn(Long.parseLong(a), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), gn.class);
                if (spans.length != 0) {
                    int length = spans.length;
                    while (true) {
                        if (length <= 0) {
                            break;
                        }
                        int i = length - 1;
                        if (editable.getSpanFlags(spans[i]) == 17) {
                            obj = spans[i];
                            break;
                        }
                        length--;
                    }
                }
                Object obj2 = (gn) obj;
                if (obj2 != null) {
                    int spanStart = editable.getSpanStart(obj2);
                    editable.removeSpan(obj2);
                    if (spanStart != editable.length()) {
                        editable.setSpan(obj2, spanStart, editable.length(), 33);
                        return true;
                    }
                    return true;
                }
            }
            return false;
        }
        if (str.equals("spoiler")) {
            if (z) {
                editable.setSpan(new wx2(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object S1 = S1(editable, 0);
            if (S1 != null) {
                int spanStart2 = editable.getSpanStart(S1);
                editable.removeSpan(S1);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(S1, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (str.equals("pre")) {
            if (z) {
                String a2 = vx2.a("language", attributes);
                if (a2 == null) {
                    a2 = vx2.a("lang", attributes);
                }
                if (a2 == null) {
                    a2 = vx2.a("lng", attributes);
                }
                editable.setSpan(new wx2(a2), editable.length(), editable.length(), 17);
                return true;
            }
            Object S12 = S1(editable, 1);
            if (S12 != null) {
                int spanStart3 = editable.getSpanStart(S12);
                editable.removeSpan(S12);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(S12, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (!str.equals("blockquote")) {
            if (str.equals("details")) {
                if (z) {
                    editable.setSpan(new wx2(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object S13 = S1(editable, 3);
                if (S13 != null) {
                    int spanStart4 = editable.getSpanStart(S13);
                    editable.removeSpan(S13);
                    if (spanStart4 != editable.length()) {
                        editable.setSpan(S13, spanStart4, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
        if (z) {
            String a3 = vx2.a("class", attributes);
            if (vx2.a("data-collapsed", attributes) != null || (a3 != null && a3.contains("telegram-collapsed-quote"))) {
                z2 = true;
            }
            editable.setSpan(new wx2(z2 ? 3 : 2), editable.length(), editable.length(), 17);
            return true;
        }
        wx2[] wx2VarArr = (wx2[]) editable.getSpans(0, editable.length(), wx2.class);
        for (int length2 = wx2VarArr.length - 1; length2 >= 0; length2--) {
            wx2 wx2Var = wx2VarArr[length2];
            if (editable.getSpanFlags(wx2Var) == 17 && ((b2 = wx2Var.a) == 2 || b2 == 3)) {
                obj = wx2Var;
                break;
            }
        }
        if (obj != null) {
            int spanStart5 = editable.getSpanStart(obj);
            editable.removeSpan(obj);
            if (spanStart5 != editable.length()) {
                editable.setSpan(obj, spanStart5, editable.length(), 33);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // mc2
    public final boolean A0(long j) {
        return false;
    }

    @Override // uz1
    public final int B0() {
        return 0;
    }

    @Override // uz1
    public final TL_stories.StoryItem C0() {
        return null;
    }

    @Override // ft8
    public final void D() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // mc2
    public final boolean D1(gn gnVar) {
        return false;
    }

    @Override // mc2
    public final boolean E(rc2 rc2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // uz1
    public final boolean E0(long j) {
        return false;
    }

    @Override // uz1
    public final boolean G0() {
        return false;
    }

    @Override // uz1
    public final nv1 J() {
        return null;
    }

    @Override // mc2
    public final boolean J0(rc2 rc2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override // mc2
    public final boolean K() {
        return false;
    }

    @Override // uz1
    public final boolean K0() {
        return false;
    }

    @Override // am0
    public final int K1() {
        return 1711276032;
    }

    @Override // mc2
    public final pc8 M1() {
        return null;
    }

    @Override // mc2
    public final boolean N() {
        return false;
    }

    @Override // mc2
    public final int O() {
        return 0;
    }

    @Override // mc2
    public final boolean O1(long j) {
        return false;
    }

    @Override // mc2
    public final String P0(rc2 rc2Var) {
        return null;
    }

    @Override // mc2
    public final int Q(rc2 rc2Var) {
        return 0;
    }

    @Override // qwc
    public final String[] R0() {
        return c;
    }

    @Override // mc2
    public final hw1 S() {
        return null;
    }

    @Override // mc2
    public final boolean S0(rc2 rc2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // mc2
    public final boolean U1(k47 k47Var) {
        return true;
    }

    @Override // am0
    public final int V() {
        return 872415231;
    }

    @Override // lr2
    public final Object X(sm2 sm2Var) {
        return new hjd((ovd) sm2Var.a(ovd.class), (f64) sm2Var.a(f64.class));
    }

    @Override // mc2
    public final boolean Y1(rc2 rc2Var, TLRPC.User user) {
        return false;
    }

    @Override // mc2
    public final boolean Z() {
        return false;
    }

    @Override // mc2
    public final boolean Z1(rc2 rc2Var) {
        return false;
    }

    @Override // mc2
    public final CharacterStyle a0(rc2 rc2Var) {
        return null;
    }

    @Override // z0c
    public final Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // mc2
    public final boolean b() {
        return false;
    }

    @Override // uz1
    public final boolean b0() {
        return true;
    }

    @Override // qwc
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // mc2
    public final boolean d0() {
        return false;
    }

    @Override // uz1
    public final boolean d1() {
        return false;
    }

    @Override // mc2
    public final boolean f() {
        return true;
    }

    @Override // rp5
    public final qp5 f1(wm4 wm4Var) {
        return new sp5(wm4Var);
    }

    @Override // ft8
    public final void g(int i, Serializable serializable) {
        String str;
        switch (i) {
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
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // am0
    public final int g0() {
        return 0;
    }

    @Override // am0
    public final float g1() {
        return 0.0f;
    }

    @Override // mv8
    public final Object get() {
        return wac.a;
    }

    @Override // qwc
    public final StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // uz1
    public final boolean h() {
        return false;
    }

    @Override // am0
    public final int h1() {
        return 0;
    }

    @Override // uz1
    public final int j() {
        return 0;
    }

    @Override // i40
    public final void j0(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
        switch (this.a) {
            case 17:
                (i == 6 ? i40.l : i > i2 ? i40.i : i < i2 ? i40.j : i40.k).j0(shortBuffer, i, shortBuffer2, i2);
                break;
            default:
                if (i2 != 1 && i2 != 2) {
                    u36.j("Output must be 2 or 1 channels");
                    break;
                } else {
                    int min = Math.min(shortBuffer.remaining() / i, shortBuffer2.remaining() / i2);
                    for (int i3 = 0; i3 < min; i3++) {
                        short s2 = shortBuffer.get();
                        short s3 = shortBuffer.get();
                        shortBuffer.position(shortBuffer.position() + 4);
                        if (i2 == 2) {
                            shortBuffer2.put(s2);
                            shortBuffer2.put(s3);
                        } else if (i2 == 1) {
                            shortBuffer2.put(k4f.z3(s2, s3));
                        }
                    }
                    break;
                }
        }
    }

    @Override // uz1
    public final TLRPC.Peer l() {
        return null;
    }

    @Override // mc2
    public final boolean l0(rc2 rc2Var, boolean z) {
        return false;
    }

    @Override // mc2
    public final boolean l1() {
        return false;
    }

    @Override // mc2
    public final /* synthetic */ boolean m1(k47 k47Var) {
        return aq1.a(k47Var);
    }

    @Override // mc2
    public final boolean m2(int i) {
        return false;
    }

    @Override // mc2
    public final boolean n1(rc2 rc2Var, int i) {
        return false;
    }

    @Override // mc2
    public final boolean n2(rc2 rc2Var, k47 k47Var) {
        return false;
    }

    @Override // mc2
    public final boolean p0(rc2 rc2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // i40
    public final int p1(int i, int i2, int i3) {
        switch (this.a) {
            case 17:
                return (i2 == 6 ? i40.l : i2 > i3 ? i40.i : i2 < i3 ? i40.j : i40.k).p1(i, i2, i3);
            default:
                return (i / i2) * i3;
        }
    }

    @Override // mc2
    public final hkb p2() {
        return null;
    }

    @Override // iaa
    public final r9a q0(k1f k1fVar, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        g40 g40Var = jSONObject.has("session") ? new g40(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new g40(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new r9a(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), g40Var, new j10(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }

    @Override // am0
    public final int r1() {
        return 0;
    }

    @Override // mc2
    public final String t(long j) {
        return null;
    }

    @Override // mc2
    public final boolean t0(rc2 rc2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // am0
    public final int u0() {
        return 352321535;
    }

    @Override // am0
    public final float w0() {
        return -1.0f;
    }

    @Override // uz1
    public final TLRPC.TL_channels_sendAsPeers x() {
        return null;
    }

    @Override // mc2
    public final boolean x0(rc2 rc2Var) {
        return false;
    }

    @Override // mc2
    public final void x1(rc2 rc2Var, TLRPC.WebPage webPage, String str, boolean z) {
        l11.u(rc2Var.getContext(), str);
    }

    @Override // am0
    public final float y0() {
        return -1.0f;
    }

    @Override // mc2
    public final boolean z1() {
        return false;
    }

    @Override // u1e
    public final Object zza() {
        throw new IllegalStateException();
    }

    public /* synthetic */ jk2(byte b2) {
        this.a = b2;
    }

    @Override // uz1
    public final void A1() {
    }

    @Override // uz1
    public final void B() {
    }

    @Override // mc2
    public final void C1() {
    }

    @Override // uz1
    public final void G1() {
    }

    @Override // uz1
    public final void H1() {
    }

    @Override // uz1
    public final void I() {
    }

    @Override // uz1
    public final void I0() {
    }

    @Override // uz1
    public final void L() {
    }

    @Override // uz1
    public final void O0() {
    }

    @Override // uz1
    public final void R1() {
    }

    @Override // mc2
    public final void T0() {
    }

    @Override // uz1
    public final void W0() {
    }

    @Override // uz1
    public final void Y0() {
    }

    @Override // uz1
    public final void a() {
    }

    @Override // mc2
    public final void c() {
    }

    @Override // uz1
    public final void c0() {
    }

    @Override // uz1
    public final void e() {
    }

    @Override // uz1
    public final void e1() {
    }

    @Override // uz1
    public final void f0() {
    }

    @Override // mc2
    public final void g2() {
    }

    @Override // mc2
    public final void i() {
    }

    @Override // uz1
    public final void j1() {
    }

    @Override // uz1
    public final void n() {
    }

    @Override // uz1
    public final void n0() {
    }

    @Override // mc2
    public final void o2() {
    }

    @Override // mc2
    public final void q() {
    }

    @Override // uz1
    public final void r() {
    }

    @Override // mc2
    public final void s0() {
    }

    @Override // uz1
    public final void s1() {
    }

    @Override // uz1
    public final void v() {
    }

    @Override // mc2
    public final void A(rc2 rc2Var) {
    }

    @Override // uz1
    public final void C(boolean z) {
    }

    @Override // uz1
    public final void E1(boolean z) {
    }

    @Override // mc2
    public final void F0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void G(rc2 rc2Var) {
    }

    @Override // mc2
    public final void J1(rc2 rc2Var) {
    }

    @Override // mc2
    public final void L1(rc2 rc2Var) {
    }

    @Override // mc2
    public final void M0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void P(rc2 rc2Var) {
    }

    @Override // mc2
    public final void Q0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void Q1(rc2 rc2Var) {
    }

    @Override // mc2
    public final void R(rc2 rc2Var) {
    }

    @Override // mc2
    public final void T(k47 k47Var) {
    }

    @Override // mc2
    public final void U0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void X0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void Y(int i) {
    }

    @Override // mc2
    public final void Z0(rc2 rc2Var) {
    }

    @Override // uz1
    public final void c1(CharSequence charSequence) {
    }

    @Override // d40
    public final void d(String str) {
    }

    @Override // mc2
    public final void e0(k47 k47Var) {
    }

    @Override // mc2
    public final void h0(String str) {
    }

    @Override // mc2
    public final void i2(rc2 rc2Var) {
    }

    @Override // mc2
    public final void k(rc2 rc2Var) {
    }

    @Override // mc2
    public final void k0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void k1(rc2 rc2Var) {
    }

    @Override // uz1
    public final void o(float f2) {
    }

    @Override // uz1
    public final void p(boolean z) {
    }

    @Override // mc2
    public final void q1(h47 h47Var) {
    }

    @Override // mc2
    public final void q2(rc2 rc2Var) {
    }

    @Override // uz1
    public final void v1(int i) {
    }

    @Override // mc2
    public final void y1(rc2 rc2Var) {
    }

    @Override // uz1
    public final void z0(int i) {
    }

    @Override // mc2
    public final void B1(rc2 rc2Var, ir0 ir0Var) {
    }

    @Override // mc2
    public final void D0(rc2 rc2Var, boolean z) {
    }

    @Override // mc2
    public final void L0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // mc2
    public final void N1(String str, String str2) {
    }

    @Override // mc2
    public final void P1(rc2 rc2Var, n28 n28Var) {
    }

    @Override // mc2
    public final void U(rc2 rc2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // mc2
    public final void X1(rc2 rc2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // mc2
    public final void i0(rc2 rc2Var, int i) {
    }

    @Override // mc2
    public final void m0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // mc2
    public final void o1(rc2 rc2Var, boolean z) {
    }

    @Override // d40
    public final void s(String str, Throwable th) {
    }

    @Override // mc2
    public final void t1(rc2 rc2Var, int i) {
    }

    @Override // mc2
    public final void v0(rc2 rc2Var, long j) {
    }

    @Override // uz1
    public final void y(float f2, int i) {
    }

    @Override // mc2
    public final void F(rc2 rc2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // uz1
    public final void H0(CharSequence charSequence, boolean z, boolean z2) {
    }

    @Override // mc2
    public final void I1(rc2 rc2Var, TLObject tLObject, boolean z) {
    }

    @Override // mc2
    public final void M(rc2 rc2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override // mc2
    public final void N0(rc2 rc2Var, float f2, float f3) {
    }

    @Override // uz1
    public final void a1(View view, CharSequence charSequence, boolean z) {
    }

    @Override // mc2
    public final void d2(rc2 rc2Var, float f2, float f3) {
    }

    @Override // mc2
    public final void i1(rc2 rc2Var, float f2, float f3) {
    }

    @Override // mc2
    public final void l2(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override // mc2
    public final void o0(rc2 rc2Var, int i, int i2) {
    }

    @Override // mc2
    public final void u(rc2 rc2Var, float f2, float f3) {
    }

    @Override // mc2
    public final void u1(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override // mc2
    public final void W(rc2 rc2Var, TLRPC.User user, float f2, float f3) {
    }

    @Override // mc2
    public final void m(rc2 rc2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override // mc2
    public final void r0(rc2 rc2Var, float f2, float f3, boolean z) {
    }

    @Override // mc2
    public final void z(rc2 rc2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // mc2
    public final void H(rc2 rc2Var, int i, float f2, float f3, boolean z) {
    }

    @Override // mc2
    public final void V0(rc2 rc2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    @Override // mc2
    public final void b1(rc2 rc2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override // uz1
    public final void w(CharSequence charSequence, boolean z, int i, int i2, long j) {
    }

    @Override // uz1
    public final void F1(int i, int i2, int i3, long j, long j2, boolean z) {
    }

    @Override // mc2
    public final void W1(rc2 rc2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    @Override // mc2
    public final void w1(k47 k47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
