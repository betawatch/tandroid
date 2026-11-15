package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class cf implements r4, xj0, yy, org.telegram.ui.mm0, org.telegram.messenger.kc, jg.y1, xr0, u61, org.telegram.ui.s9, te.b, tg.c, tg.l1, com.google.android.gms.common.api.internal.q, v4.j1, l51 {
    public final Object a;

    public /* synthetic */ cf(Object obj) {
        this.a = obj;
    }

    @Override // org.telegram.messenger.kc
    public void A(ImageReceiver imageReceiver) {
        rf0 rf0Var = ((uf0) this.a).h.H0;
        if (rf0Var != null) {
            rf0Var.d();
        }
    }

    @Override // v4.j1
    public int B() {
        return ((v4.o0) this.a).G();
    }

    @Override // te.b
    public void E(float f10, int i7) {
        ((te.h) this.a).f(f10);
    }

    @Override // te.b
    public void G(int i7, float f10, float f11, te.c cVar) {
        ((te.h) this.a).f(f10);
    }

    @Override // org.telegram.ui.Components.xr0
    public void H() {
        ((m60) this.a).k();
    }

    @Override // org.telegram.ui.Components.xr0
    public org.telegram.ui.ActionBar.z0 J(String str) {
        org.telegram.ui.ActionBar.z0 h = ((m60) this.a).h();
        h.setText(str);
        return h;
    }

    @Override // org.telegram.ui.s9
    public String J0() {
        return ((org.telegram.ui.web.v0) this.a).j0;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h K() {
        return null;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        ((yc) this.a).a(Boolean.valueOf(z10), Integer.valueOf(i7), Integer.valueOf(i10));
    }

    @Override // org.telegram.ui.s9
    public void M(String str) {
        org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.a;
        try {
            v0Var.Q = System.currentTimeMillis();
            v0Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // v4.j1
    public int S() {
        v4.o0 o0Var = (v4.o0) this.a;
        return o0Var.n - o0Var.C();
    }

    @Override // jg.y1
    public /* synthetic */ a0.h U() {
        return null;
    }

    @Override // org.telegram.ui.Components.xj0
    public void a(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.a;
        chatAttachAlertPhotoLayout.M = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.F.d1(true);
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        j8.c cVar = (j8.c) this.a;
        u7.y yVar = (u7.y) ((u7.l) obj).n();
        u7.f fVar = new u7.f(1, (TaskCompletionSource) obj2);
        Parcel p12 = yVar.p1();
        int i7 = u7.d.a;
        p12.writeInt(1);
        cVar.writeToParcel(p12, 0);
        u7.d.c(p12, fVar);
        p12.writeString(null);
        yVar.t1(p12, 63);
    }

    @Override // org.telegram.ui.Components.xj0
    public boolean b(int i7) {
        return ((ChatAttachAlertPhotoLayout) this.a).H.d(i7) == 0;
    }

    @Override // org.telegram.ui.Components.yy
    public ByteBuffer c() {
        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) this.a;
        gfVar.p.q();
        return (ByteBuffer) gfVar.p.f;
    }

    @Override // org.telegram.ui.Components.xj0
    public void d(View view, boolean z10) {
        if (z10 == ((ChatAttachAlertPhotoLayout) this.a).L && (view instanceof org.telegram.ui.Cells.q5)) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.y.d(q5Var);
        }
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ boolean d1(String str, org.telegram.ui.j9 j9Var) {
        return false;
    }

    @Override // v4.j1
    public int e(View view) {
        return v4.o0.z(view) - ((ViewGroup.MarginLayoutParams) ((v4.p0) view.getLayoutParams())).topMargin;
    }

    @Override // jg.y1
    public boolean e0(int i7) {
        return i7 == ((mo0) this.a).r;
    }

    @Override // org.telegram.ui.mm0
    public void f(ArrayList arrayList) {
        m30.a((m30) this.a, false, arrayList);
    }

    @Override // org.telegram.ui.Components.xj0
    public boolean g(int i7) {
        org.telegram.messenger.ff M = ((ChatAttachAlertPhotoLayout) this.a).H.M(i7);
        return M != null && ChatAttachAlertPhotoLayout.t1.containsKey(Integer.valueOf(M.C));
    }

    @Override // v4.j1
    public View g0(int i7) {
        return ((v4.o0) this.a).q(i7);
    }

    @Override // tg.l1
    public float get() {
        return ((tg.f2) this.a).G;
    }

    @Override // org.telegram.ui.Components.yy
    public float getBlurAngle() {
        return ((org.telegram.messenger.gf) this.a).t;
    }

    @Override // org.telegram.ui.Components.yy
    public float getBlurExcludeBlurSize() {
        return ((org.telegram.messenger.gf) this.a).s;
    }

    @Override // org.telegram.ui.Components.yy
    public PointF getBlurExcludePoint() {
        return ((org.telegram.messenger.gf) this.a).r;
    }

    @Override // org.telegram.ui.Components.yy
    public float getBlurExcludeSize() {
        return ((org.telegram.messenger.gf) this.a).q;
    }

    @Override // org.telegram.ui.Components.yy
    public int getBlurType() {
        return ((org.telegram.messenger.gf) this.a).n;
    }

    @Override // org.telegram.ui.Components.yy
    public float getContrastValue() {
        return com.google.android.gms.internal.vision.e2.c(((org.telegram.messenger.gf) this.a).d, 100.0f, 0.3f, 1.0f);
    }

    @Override // org.telegram.ui.Components.yy
    public float getEnhanceValue() {
        return ((org.telegram.messenger.gf) this.a).a / 100.0f;
    }

    @Override // org.telegram.ui.Components.yy
    public float getExposureValue() {
        return ((org.telegram.messenger.gf) this.a).c / 100.0f;
    }

    @Override // org.telegram.ui.Components.yy
    public float getFadeValue() {
        return ((org.telegram.messenger.gf) this.a).g / 100.0f;
    }

    @Override // org.telegram.ui.Components.yy
    public float getGrainValue() {
        return (((org.telegram.messenger.gf) this.a).m / 100.0f) * 0.04f;
    }

    @Override // org.telegram.ui.Components.yy
    public float getHighlightsValue() {
        return com.google.android.gms.internal.vision.e2.y(((org.telegram.messenger.gf) this.a).j, 0.75f, 100.0f, 100.0f);
    }

    @Override // org.telegram.ui.Components.yy
    public float getSaturationValue() {
        float f10 = ((org.telegram.messenger.gf) this.a).f / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    @Override // org.telegram.ui.Components.yy
    public float getShadowsValue() {
        return com.google.android.gms.internal.vision.e2.y(((org.telegram.messenger.gf) this.a).k, 0.55f, 100.0f, 100.0f);
    }

    @Override // org.telegram.ui.Components.yy
    public float getSharpenValue() {
        return com.google.android.gms.internal.vision.e2.c(((org.telegram.messenger.gf) this.a).o, 100.0f, 0.6f, 0.11f);
    }

    @Override // org.telegram.ui.Components.yy
    public float getSoftenSkinValue() {
        return ((org.telegram.messenger.gf) this.a).b / 100.0f;
    }

    @Override // org.telegram.ui.Components.yy
    public int getTintHighlightsColor() {
        return ((org.telegram.messenger.gf) this.a).i;
    }

    @Override // org.telegram.ui.Components.yy
    public float getTintHighlightsIntensityValue() {
        return ((org.telegram.messenger.gf) this.a).i == 0 ? 0.0f : 0.5f;
    }

    @Override // org.telegram.ui.Components.yy
    public int getTintShadowsColor() {
        return ((org.telegram.messenger.gf) this.a).h;
    }

    @Override // org.telegram.ui.Components.yy
    public float getTintShadowsIntensityValue() {
        return ((org.telegram.messenger.gf) this.a).h == 0 ? 0.0f : 0.5f;
    }

    @Override // org.telegram.ui.Components.yy
    public float getVignetteValue() {
        return ((org.telegram.messenger.gf) this.a).l / 100.0f;
    }

    @Override // org.telegram.ui.Components.yy
    public float getWarmthValue() {
        return ((org.telegram.messenger.gf) this.a).e / 100.0f;
    }

    @Override // org.telegram.ui.Components.yy
    public boolean h() {
        return false;
    }

    @Override // jg.y1
    public void i(int i7) {
        mo0 mo0Var = (mo0) this.a;
        po0 po0Var = mo0Var.L;
        mo0Var.s = i7;
        if (mo0Var.w != i7) {
            mo0Var.d.clear();
        }
        int i10 = mo0Var.K;
        if (mo0Var.b() != 0 || mo0Var.e.e() || mo0Var.J) {
            po0Var.t2.b(i10);
        } else {
            po0Var.M1.e(false, true);
        }
        mo0Var.f();
        int i11 = po0.U2;
        po0Var.K0(true);
    }

    @Override // v4.j1
    public int i0(View view) {
        return v4.o0.v(view) + ((ViewGroup.MarginLayoutParams) ((v4.p0) view.getLayoutParams())).bottomMargin;
    }

    @Override // org.telegram.ui.Components.l51
    public void invalidate() {
        ((wi.h) this.a).m.invalidate();
    }

    @Override // tg.c
    public void j() {
        ((org.telegram.ui.tp0) this.a).r0(null, true);
    }

    @Override // org.telegram.ui.Components.yy
    public boolean k() {
        return !((org.telegram.messenger.gf) this.a).p.F();
    }

    public boolean l(int i7) {
        n61 n61Var = ((w61) this.a).M;
        if (n61Var == null) {
            return false;
        }
        return n61Var.c(i7);
    }

    public s0.c m(int i7) {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0360, code lost:
    
        if (r10.equals("HOME") == false) goto L152;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ViewGroup n(Context context, int i7) {
        boolean z10;
        String str;
        zc0 zc0Var;
        org.telegram.messenger.f0 f0Var;
        int i10;
        String M0;
        String str2;
        bd0 bd0Var = (bd0) this.a;
        ArrayList arrayList = bd0Var.G1;
        ArrayList arrayList2 = bd0Var.H1;
        boolean z11 = i7 != 0;
        if (z11) {
            zc0 zc0Var2 = new zc0(context);
            TextView textView = new TextView(context);
            zc0Var2.a = textView;
            int i11 = org.telegram.ui.ActionBar.j6.G6;
            int i12 = bd0.J1;
            org.telegram.ui.ActionBar.e6 e6Var = bd0Var.J0;
            boolean z12 = bd0Var.E1;
            org.telegram.ui.ActionBar.q6.U(textView, i11, e6Var);
            textView.setTextSize(1, 16.0f);
            textView.setSingleLine(false);
            textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            boolean z13 = org.telegram.messenger.hd.a0;
            zc0Var2.addView(textView, c8.ja.d(-1, -1.0f, (z13 ? 5 : 3) | 48, z13 ? z12 ? 17 : 64 : 72.0f, 10.0f, z13 ? 72.0f : z12 ? 17 : 64, 0.0f));
            TextView textView2 = new TextView(context);
            zc0Var2.b = textView2;
            org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.z6, bd0Var.J0);
            org.telegram.messenger.i20.p(textView2, 1, 13.0f, 1, 1);
            textView2.setSingleLine(true);
            textView2.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
            boolean z14 = org.telegram.messenger.hd.a0;
            zc0Var2.addView(textView2, c8.ja.d(-2, -2.0f, z14 ? 5 : 3, z14 ? z12 ? 17 : 64 : 72.0f, 35.0f, z14 ? 72.0f : z12 ? 17 : 64, 0.0f));
            ImageView imageView = new ImageView(context);
            zc0Var2.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.m6, bd0Var.J0, PorterDuff.Mode.MULTIPLY);
            boolean z15 = org.telegram.messenger.hd.a0;
            zc0Var2.addView(imageView, c8.ja.d(-2, -2.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 20.0f, 20.0f, z15 ? 20.0f : 0.0f, 0.0f));
            zc0Var = zc0Var2;
            if (!z12) {
                Switch r92 = new Switch(context, null);
                zc0Var2.d = r92;
                int i13 = org.telegram.ui.ActionBar.j6.M6;
                int i14 = org.telegram.ui.ActionBar.j6.N6;
                int i15 = org.telegram.ui.ActionBar.j6.d6;
                r92.d(i13, i14, i15, i15);
                zc0Var2.addView(r92, c8.ja.d(37, 40.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                zc0Var = zc0Var2;
            }
        } else {
            ?? ad0Var = new ad0(context);
            ad0Var.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = bd0Var.I1;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((org.telegram.messenger.f0) arrayList2.get(0)).c(true);
                z10 = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus == null || userStatus.expires == 0) {
                    z10 = true;
                    str = null;
                } else {
                    str = org.telegram.messenger.hd.d0(bd0Var.a, tL_userContact_old2, null, null);
                    z10 = true;
                }
            }
            t8 t8Var = new t8((org.telegram.ui.ActionBar.e6) null);
            t8Var.u(org.telegram.messenger.g0.L(30.0f));
            t8Var.r(tL_userContact_old2);
            i9 i9Var = new i9(context);
            i9Var.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
            i9Var.f(tL_userContact_old2, t8Var);
            ad0Var.addView(i9Var, c8.ja.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(context);
            org.telegram.messenger.i20.o(textView3, 1, 17.0f);
            org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.j5, bd0Var.J0);
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(org.telegram.messenger.g5.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            ad0Var.addView(textView3, c8.ja.t(-2, -2, 49, 10, 10, 10, str != null ? 0 : 27));
            zc0Var = ad0Var;
            if (str != null) {
                TextView g10 = org.telegram.messenger.k5.g(context, 1, 14.0f);
                org.telegram.ui.ActionBar.q6.U(g10, org.telegram.ui.ActionBar.j6.r5, bd0Var.J0);
                g10.setSingleLine(true);
                g10.setEllipsize(truncateAt);
                g10.setText(str);
                ad0Var.addView(g10, c8.ja.t(-2, -2, 49, 10, 3, 10, z10 ? 27 : 11));
                zc0Var = ad0Var;
            }
        }
        if (z11) {
            zc0 zc0Var3 = zc0Var;
            int i16 = bd0Var.A1;
            char c10 = 2;
            if (i7 < i16 || i7 >= bd0Var.B1) {
                f0Var = (org.telegram.messenger.f0) arrayList.get(i7 - bd0Var.C1);
                int i17 = f0Var.c;
                if (i17 == 1) {
                    i10 = R.drawable.msg_mention;
                } else if (i17 == 2) {
                    i10 = R.drawable.msg_location;
                } else if (i17 == 3) {
                    i10 = R.drawable.msg_link;
                } else {
                    if (i17 != 4) {
                        if (i17 == 5) {
                            i10 = R.drawable.msg_calendar2;
                        } else if (i17 == 6) {
                            i10 = "ORG".equalsIgnoreCase(f0Var.a(true)) ? R.drawable.msg_work : R.drawable.msg_jobtitle;
                        }
                    }
                    i10 = R.drawable.msg_info;
                }
            } else {
                f0Var = (org.telegram.messenger.f0) arrayList2.get(i7 - i16);
                i10 = R.drawable.msg_calls;
            }
            boolean z16 = i7 != bd0Var.z1 - 1;
            ImageView imageView2 = zc0Var3.c;
            zc0Var3.a.setText(f0Var.c(true));
            TextView textView4 = zc0Var3.b;
            int i18 = f0Var.c;
            if (i18 == 4) {
                str2 = org.telegram.messenger.hd.M0(2131751787, null);
            } else if (i18 == 3) {
                str2 = org.telegram.messenger.hd.M0(2131751781, null);
            } else if (i18 == 5) {
                str2 = org.telegram.messenger.hd.M0(2131751803, null);
            } else if (i18 == 6) {
                str2 = "ORG".equalsIgnoreCase(f0Var.a(true)) ? org.telegram.messenger.hd.M0(2131751792, null) : org.telegram.messenger.hd.M0(2131751791, null);
            } else {
                int indexOf = f0Var.b.indexOf(58);
                if (indexOf < 0) {
                    str2 = "";
                } else {
                    String substring = f0Var.b.substring(0, indexOf);
                    if (f0Var.c != 20) {
                        String[] split = substring.split(";");
                        for (int i19 = 0; i19 < split.length; i19++) {
                            if (split[i19].indexOf(61) < 0) {
                                substring = split[i19];
                            }
                        }
                        String substring2 = substring.startsWith("X-") ? substring.substring(2) : substring;
                        substring2.getClass();
                        switch (substring2.hashCode()) {
                            case -2015525726:
                                if (substring2.equals("MOBILE")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2064738:
                                if (substring2.equals("CELL")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2223327:
                                break;
                            case 2464291:
                                if (substring2.equals("PREF")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2670353:
                                if (substring2.equals("WORK")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 75532016:
                                if (substring2.equals("OTHER")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                            case 1:
                                M0 = org.telegram.messenger.hd.M0(2131747291, null);
                                break;
                            case 2:
                                M0 = org.telegram.messenger.hd.M0(2131747293, null);
                                break;
                            case 3:
                                M0 = org.telegram.messenger.hd.M0(2131747292, null);
                                break;
                            case 4:
                                M0 = org.telegram.messenger.hd.M0(2131747281, null);
                                break;
                            case 5:
                                M0 = org.telegram.messenger.hd.M0(2131747282, null);
                                break;
                            default:
                                M0 = substring2;
                                break;
                        }
                    } else {
                        M0 = substring.substring(2).split(";")[0];
                    }
                    str2 = M0.substring(0, 1).toUpperCase() + M0.substring(1).toLowerCase();
                }
            }
            textView4.setText(str2);
            Switch r82 = zc0Var3.d;
            if (r82 != null) {
                r82.c(f0Var.d, false);
            }
            imageView2.setImageResource(i10);
            zc0Var3.e = z16;
            zc0Var3.setWillNotDraw(!z16);
        }
        return zc0Var;
    }

    @Override // org.telegram.ui.Components.xr0
    public org.telegram.ui.ActionBar.z0 n0(int i7, Runnable runnable, String str, boolean z10, boolean z11) {
        m60 m60Var = (m60) this.a;
        int x10 = m60Var.x();
        m60Var.c(i7, str, new di.m6(runnable, z11, m60Var, 25), z10);
        View w10 = m60Var.w(x10);
        if (w10 instanceof org.telegram.ui.ActionBar.z0) {
            return (org.telegram.ui.ActionBar.z0) w10;
        }
        return null;
    }

    public String o(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            pa.d dVar = (pa.d) this.a;
            pa.e eVar = new pa.e(stringWriter, dVar.a, dVar.b, dVar.c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // org.telegram.ui.s9
    public void onDismiss() {
        org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.a;
        v0Var.y("scan_qr_popup_closed", null);
        v0Var.i0 = false;
    }

    public s0.c p(int i7) {
        return null;
    }

    public void q(float f10) {
        w61 w61Var = (w61) this.a;
        View[] viewArr = w61Var.e;
        if (f10 == 1.0f) {
            if (viewArr[1] != null) {
                w61Var.E();
                w61Var.h.put(w61Var.f[1], viewArr[1]);
                w61Var.removeView(viewArr[1]);
                w61Var.D(viewArr[0], 0.0f);
                viewArr[1] = null;
            }
            w61Var.x(w61Var.b);
            return;
        }
        View view = viewArr[1];
        if (view == null) {
            return;
        }
        if (w61Var.E) {
            w61Var.D(view, (1.0f - f10) * viewArr[0].getMeasuredWidth());
            w61Var.D(viewArr[0], (-r1.getMeasuredWidth()) * f10);
        } else {
            w61Var.D(view, (1.0f - f10) * (-viewArr[0].getMeasuredWidth()));
            w61Var.D(viewArr[0], r1.getMeasuredWidth() * f10);
        }
        w61Var.u(false);
    }

    public boolean r(int i7, int i10, Bundle bundle) {
        return false;
    }

    @Override // tg.l1
    public void r0(float f10) {
        ((tg.f2) this.a).setOutlineWidth(f10);
    }

    @Override // org.telegram.ui.mm0
    public void s0() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            ((m30) this.a).a.startActivityForResult(intent, 14);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // tg.c
    public tg.j z() {
        return ((org.telegram.ui.tp0) this.a).C0;
    }

    public cf(int i7) {
        switch (i7) {
            case 14:
                this.a = new SparseArray();
                break;
            case 15:
                if (Build.VERSION.SDK_INT < 26) {
                    this.a = new df0(this);
                    break;
                } else {
                    this.a = new s0.d(this);
                    break;
                }
            default:
                this.a = new ConcurrentHashMap(16);
                break;
        }
    }

    public cf(EditText editText) {
        this.a = new ji.j(editText);
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void S0(org.telegram.messenger.wr wrVar) {
    }

    @Override // jg.y1
    public /* synthetic */ void l0(ArrayList arrayList) {
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void O(int i7, Drawable drawable) {
    }

    @Override // org.telegram.messenger.kc
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
