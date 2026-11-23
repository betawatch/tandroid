package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.profileinstaller.ProfileInstallReceiver;
import c8.na;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ef;
import org.telegram.messenger.ff;
import org.telegram.messenger.gd;
import org.telegram.messenger.jc;
import org.telegram.messenger.m10;
import org.telegram.messenger.ur;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.id0;
import org.telegram.ui.Components.jd0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.u30;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.k9;
import org.telegram.ui.nm0;
import org.telegram.ui.s9;
import org.telegram.ui.up0;
import org.telegram.ui.vp0;
import org.telegram.ui.ys;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class i5 implements gh.a, zm0, org.telegram.ui.Components.z4, ne0, hk0, dz, nm0, jc, jg.y1, hs0, i71, s9, q5.b, te.b, tg.q1, sg.s0, u4.c, com.google.android.gms.common.api.internal.n {
    public final Object a;

    public /* synthetic */ i5(Object obj) {
        this.a = obj;
    }

    public static i5 M(float f10, int i7) {
        Point point = org.telegram.messenger.g0.q;
        int i10 = (int) (point.x * f10);
        int i11 = (int) (point.y * f10);
        if (i10 == i11) {
            return new i5(i10, i11, new int[0]);
        }
        if (i7 == 3) {
            return new i5(i10, i11, i11, i10);
        }
        return (i7 == 1) == (i10 < i11) ? new i5(i10, i11, new int[0]) : new i5(i11, i10, new int[0]);
    }

    public gh.a A() {
        t4 t4Var = ((k5) this.a).d;
        if (t4Var != null) {
            return t4Var.getMenuGlassColorProvider();
        }
        return null;
    }

    @Override // gh.a
    public float A1() {
        gh.a A = A();
        gh.a B = B();
        float A1 = A != null ? A.A1() : 0.0f;
        return B != null ? org.telegram.messenger.g0.T1(B.A1(), A1, ((k5) this.a).a) : A1;
    }

    public gh.a B() {
        t4 t4Var;
        k5 k5Var = (k5) this.a;
        if (k5Var.a >= 1.0f || (t4Var = k5Var.d) == null) {
            return null;
        }
        return t4Var.getButtonsGlassColorProvider();
    }

    public s0.c C(int i7) {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0364, code lost:
    
        if (r10.equals("HOME") == false) goto L152;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ViewGroup D(Context context, int i7) {
        boolean z10;
        String str;
        id0 id0Var;
        org.telegram.messenger.f0 f0Var;
        int i10;
        String N0;
        String str2;
        kd0 kd0Var = (kd0) this.a;
        ArrayList arrayList = kd0Var.G1;
        ArrayList arrayList2 = kd0Var.H1;
        boolean z11 = i7 != 0;
        if (z11) {
            id0 id0Var2 = new id0(context);
            TextView textView = new TextView(context);
            id0Var2.a = textView;
            int i11 = n6.G6;
            int i12 = kd0.J1;
            i6 i6Var = kd0Var.J0;
            boolean z12 = kd0Var.E1;
            u6.U(textView, i11, i6Var);
            textView.setTextSize(1, 16.0f);
            textView.setSingleLine(false);
            textView.setGravity((gd.a0 ? 5 : 3) | 48);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            boolean z13 = gd.a0;
            id0Var2.addView(textView, na.d(-1, -1.0f, (z13 ? 5 : 3) | 48, z13 ? z12 ? 17 : 64 : 72.0f, 10.0f, z13 ? 72.0f : z12 ? 17 : 64, 0.0f));
            TextView textView2 = new TextView(context);
            id0Var2.b = textView2;
            u6.U(textView2, n6.z6, kd0Var.J0);
            m10.q(textView2, 1, 13.0f, 1, 1);
            textView2.setSingleLine(true);
            textView2.setGravity(gd.a0 ? 5 : 3);
            boolean z14 = gd.a0;
            id0Var2.addView(textView2, na.d(-2, -2.0f, z14 ? 5 : 3, z14 ? z12 ? 17 : 64 : 72.0f, 35.0f, z14 ? 72.0f : z12 ? 17 : 64, 0.0f));
            ImageView imageView = new ImageView(context);
            id0Var2.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            u6.s(imageView, n6.m6, kd0Var.J0, PorterDuff.Mode.MULTIPLY);
            boolean z15 = gd.a0;
            id0Var2.addView(imageView, na.d(-2, -2.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 20.0f, 20.0f, z15 ? 20.0f : 0.0f, 0.0f));
            id0Var = id0Var2;
            if (!z12) {
                Switch r92 = new Switch(context, null);
                id0Var2.d = r92;
                int i13 = n6.M6;
                int i14 = n6.N6;
                int i15 = n6.d6;
                r92.d(i13, i14, i15, i15);
                id0Var2.addView(r92, na.d(37, 40.0f, (gd.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                id0Var = id0Var2;
            }
        } else {
            ?? jd0Var = new jd0(context);
            jd0Var.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = kd0Var.I1;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((org.telegram.messenger.f0) arrayList2.get(0)).c(true);
                z10 = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus == null || userStatus.expires == 0) {
                    z10 = true;
                    str = null;
                } else {
                    str = gd.d0(kd0Var.a, tL_userContact_old2, null, null);
                    z10 = true;
                }
            }
            a9 a9Var = new a9((i6) null);
            a9Var.u(org.telegram.messenger.g0.L(30.0f));
            a9Var.r(tL_userContact_old2);
            p9 p9Var = new p9(context);
            p9Var.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
            p9Var.f(tL_userContact_old2, a9Var);
            jd0Var.addView(p9Var, na.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(context);
            m10.p(textView3, 1, 17.0f);
            u6.U(textView3, n6.j5, kd0Var.J0);
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(org.telegram.messenger.i5.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            jd0Var.addView(textView3, na.t(-2, -2, 49, 10, 10, 10, str != null ? 0 : 27));
            id0Var = jd0Var;
            if (str != null) {
                TextView textView4 = new TextView(context);
                textView4.setTextSize(1, 14.0f);
                u6.U(textView4, n6.r5, kd0Var.J0);
                textView4.setSingleLine(true);
                textView4.setEllipsize(truncateAt);
                textView4.setText(str);
                jd0Var.addView(textView4, na.t(-2, -2, 49, 10, 3, 10, z10 ? 27 : 11));
                id0Var = jd0Var;
            }
        }
        if (z11) {
            id0 id0Var3 = id0Var;
            int i16 = kd0Var.A1;
            char c10 = 2;
            if (i7 < i16 || i7 >= kd0Var.B1) {
                f0Var = (org.telegram.messenger.f0) arrayList.get(i7 - kd0Var.C1);
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
            boolean z16 = i7 != kd0Var.z1 - 1;
            ImageView imageView2 = id0Var3.c;
            id0Var3.a.setText(f0Var.c(true));
            TextView textView5 = id0Var3.b;
            int i18 = f0Var.c;
            if (i18 == 4) {
                str2 = gd.N0(2131751775, null);
            } else if (i18 == 3) {
                str2 = gd.N0(2131751769, null);
            } else if (i18 == 5) {
                str2 = gd.N0(2131751791, null);
            } else if (i18 == 6) {
                str2 = "ORG".equalsIgnoreCase(f0Var.a(true)) ? gd.N0(2131751780, null) : gd.N0(2131751779, null);
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
                                N0 = gd.N0(2131747097, null);
                                break;
                            case 2:
                                N0 = gd.N0(2131747099, null);
                                break;
                            case 3:
                                N0 = gd.N0(2131747098, null);
                                break;
                            case 4:
                                N0 = gd.N0(2131747087, null);
                                break;
                            case 5:
                                N0 = gd.N0(2131747088, null);
                                break;
                            default:
                                N0 = substring2;
                                break;
                        }
                    } else {
                        N0 = substring.substring(2).split(";")[0];
                    }
                    str2 = N0.substring(0, 1).toUpperCase() + N0.substring(1).toLowerCase();
                }
            }
            textView5.setText(str2);
            Switch r82 = id0Var3.d;
            if (r82 != null) {
                r82.c(f0Var.d, false);
            }
            imageView2.setImageResource(i10);
            id0Var3.e = z16;
            id0Var3.setWillNotDraw(!z16);
        }
        return id0Var;
    }

    @Override // gh.a
    public int D0() {
        gh.a A = A();
        gh.a B = B();
        int D0 = A != null ? A.D0() : 0;
        if (B != null) {
            return i0.a.f(((k5) this.a).a, B.D0(), D0);
        }
        return D0;
    }

    @Override // gh.a
    public int D1() {
        gh.a A = A();
        gh.a B = B();
        int D1 = A != null ? A.D1() : 0;
        if (B != null) {
            return i0.a.f(((k5) this.a).a, B.D1(), D1);
        }
        return D1;
    }

    @Override // u4.c
    public void E(int i7, Object obj) {
        String str;
        switch (i7) {
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
        if (i7 == 6 || i7 == 7 || i7 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.a).setResultCode(i7);
    }

    @Override // org.telegram.ui.Components.ne0
    public void E1(RectF rectF) {
        rectF.set(((ji.q) this.a).R);
    }

    public String F(Object obj) {
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

    @Override // te.b
    public void G(float f10, int i7) {
        ((te.h) this.a).f(f10);
    }

    @Override // org.telegram.ui.s9
    public void H(String str) {
        org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.a;
        try {
            v0Var.Q = System.currentTimeMillis();
            v0Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.z4
    public void I(int i7, int i10, boolean z10) {
        org.telegram.ui.Components.m0 m0Var = (org.telegram.ui.Components.m0) this.a;
        m0Var.u1(i7, i10, z10);
        m0Var.dismiss();
    }

    @Override // te.b
    public void K(int i7, float f10, float f11, te.c cVar) {
        ((te.h) this.a).f(f10);
    }

    public s0.c L(int i7) {
        return null;
    }

    public boolean N(int i7, int i10, Bundle bundle) {
        return false;
    }

    @Override // gh.a
    public int Q0() {
        k5 k5Var = (k5) this.a;
        gh.a A = A();
        int Q0 = (A == null || !k5Var.d.e()) ? 0 : A.Q0();
        gh.a B = B();
        if (B != null) {
            return i0.a.f(k5Var.a, B.Q0(), Q0);
        }
        return Q0;
    }

    @Override // gh.a
    public float T0() {
        k5 k5Var = (k5) this.a;
        gh.a A = A();
        gh.a B = B();
        float T0 = A != null ? A.T0() : -1.0f;
        float T02 = B != null ? B.T0() : T0;
        return (T02 < 0.0f || T0 < 0.0f) ? k5Var.a < 0.5f ? T02 : T0 : org.telegram.messenger.g0.T1(T02, T0, k5Var.a);
    }

    @Override // org.telegram.ui.Components.hs0
    public void U0() {
        ((x60) this.a).k();
    }

    @Override // gh.a
    public float V0() {
        k5 k5Var = (k5) this.a;
        gh.a A = A();
        gh.a B = B();
        float V0 = A != null ? A.V0() : -1.0f;
        float V02 = B != null ? B.V0() : V0;
        return (V02 < 0.0f || V0 < 0.0f) ? k5Var.a < 0.5f ? V02 : V0 : org.telegram.messenger.g0.T1(V02, V0, k5Var.a);
    }

    @Override // jg.y1
    public boolean W1(int i7) {
        return i7 == ((wo0) this.a).r;
    }

    @Override // org.telegram.ui.Components.hs0
    public y0 X0(String str) {
        y0 h = ((x60) this.a).h();
        h.setText(str);
        return h;
    }

    @Override // gh.a
    public int X1() {
        gh.a A = A();
        gh.a B = B();
        int X1 = A != null ? A.X1() : 0;
        if (B != null) {
            return i0.a.f(((k5) this.a).a, B.X1(), X1);
        }
        return X1;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h Y0() {
        return null;
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ boolean Z0(String str, k9 k9Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.i71
    public void a(int i7, boolean z10) {
        k71 k71Var = (k71) this.a;
        k71Var.E = z10;
        k71Var.d = i7;
        k71Var.I(1);
        k71Var.w(i7, z10);
        View[] viewArr = k71Var.e;
        View view = viewArr[0];
        int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
        View view2 = viewArr[1];
        if (view2 != null) {
            if (z10) {
                k71Var.D(view2, measuredWidth);
            } else {
                k71Var.D(view2, -measuredWidth);
            }
        }
    }

    @Override // org.telegram.ui.Components.zm0
    public /* synthetic */ int a0() {
        return 0;
    }

    @Override // org.telegram.ui.nm0
    public void b(ArrayList arrayList) {
        u30.a((u30) this.a, false, arrayList);
    }

    @Override // org.telegram.ui.Components.i71
    public void c(float f10) {
        k71 k71Var = (k71) this.a;
        View[] viewArr = k71Var.e;
        if (f10 == 1.0f) {
            if (viewArr[1] != null) {
                k71Var.E();
                k71Var.h.put(k71Var.f[1], viewArr[1]);
                k71Var.removeView(viewArr[1]);
                k71Var.D(viewArr[0], 0.0f);
                viewArr[1] = null;
            }
            k71Var.x(k71Var.b);
            return;
        }
        View view = viewArr[1];
        if (view == null) {
            return;
        }
        if (k71Var.E) {
            k71Var.D(view, (1.0f - f10) * viewArr[0].getMeasuredWidth());
            k71Var.D(viewArr[0], (-r1.getMeasuredWidth()) * f10);
        } else {
            k71Var.D(view, (1.0f - f10) * (-viewArr[0].getMeasuredWidth()));
            k71Var.D(viewArr[0], r1.getMeasuredWidth() * f10);
        }
        k71Var.u(false);
    }

    @Override // org.telegram.ui.Components.i71
    public boolean d() {
        k71 k71Var = (k71) this.a;
        return (k71Var.y || k71Var.I) ? false : true;
    }

    @Override // org.telegram.ui.Components.i71
    public void e() {
        ((k71) this.a).p();
    }

    @Override // org.telegram.ui.Components.hk0
    public void f(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.a;
        chatAttachAlertPhotoLayout.M = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.F.d1(true);
    }

    @Override // org.telegram.ui.Components.hk0
    public boolean g(int i7) {
        return ((ChatAttachAlertPhotoLayout) this.a).H.d(i7) == 0;
    }

    @Override // com.google.android.gms.common.api.internal.n
    public void g0(Object obj) {
        com.google.android.gms.common.api.internal.m mVar;
        androidx.activity.n nVar = ((u7.i) this.a).b;
        synchronized (nVar) {
            nVar.b = false;
            mVar = ((com.google.android.gms.common.api.internal.o) nVar.c).b;
        }
        if (mVar != null) {
            ((u7.c) nVar.d).c(mVar, 2441);
        }
    }

    @Override // fd.a
    public Object get() {
        return this.a;
    }

    @Override // org.telegram.ui.Components.dz
    public float getBlurAngle() {
        return ((ff) this.a).t;
    }

    @Override // org.telegram.ui.Components.dz
    public float getBlurExcludeBlurSize() {
        return ((ff) this.a).s;
    }

    @Override // org.telegram.ui.Components.dz
    public PointF getBlurExcludePoint() {
        return ((ff) this.a).r;
    }

    @Override // org.telegram.ui.Components.dz
    public float getBlurExcludeSize() {
        return ((ff) this.a).q;
    }

    @Override // org.telegram.ui.Components.dz
    public int getBlurType() {
        return ((ff) this.a).n;
    }

    @Override // org.telegram.ui.Components.zm0
    public CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        ys ysVar = (ys) this.a;
        sb2.append((Object) ysVar.a.getText());
        sb2.append(" ");
        sb2.append((Object) ysVar.b.getText());
        return sb2.toString();
    }

    @Override // org.telegram.ui.Components.dz
    public float getContrastValue() {
        return com.google.android.gms.internal.vision.e2.c(((ff) this.a).d, 100.0f, 0.3f, 1.0f);
    }

    @Override // org.telegram.ui.Components.dz
    public float getEnhanceValue() {
        return ((ff) this.a).a / 100.0f;
    }

    @Override // org.telegram.ui.Components.dz
    public float getExposureValue() {
        return ((ff) this.a).c / 100.0f;
    }

    @Override // org.telegram.ui.Components.dz
    public float getFadeValue() {
        return ((ff) this.a).g / 100.0f;
    }

    @Override // org.telegram.ui.Components.dz
    public float getGrainValue() {
        return (((ff) this.a).m / 100.0f) * 0.04f;
    }

    @Override // org.telegram.ui.Components.dz
    public float getHighlightsValue() {
        return com.google.android.gms.internal.vision.e2.y(((ff) this.a).j, 0.75f, 100.0f, 100.0f);
    }

    @Override // org.telegram.ui.Components.dz
    public float getSaturationValue() {
        float f10 = ((ff) this.a).f / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    @Override // org.telegram.ui.Components.dz
    public float getShadowsValue() {
        return com.google.android.gms.internal.vision.e2.y(((ff) this.a).k, 0.55f, 100.0f, 100.0f);
    }

    @Override // org.telegram.ui.Components.dz
    public float getSharpenValue() {
        return com.google.android.gms.internal.vision.e2.c(((ff) this.a).o, 100.0f, 0.6f, 0.11f);
    }

    @Override // org.telegram.ui.Components.dz
    public float getSoftenSkinValue() {
        return ((ff) this.a).b / 100.0f;
    }

    @Override // org.telegram.ui.Components.dz
    public int getTintHighlightsColor() {
        return ((ff) this.a).i;
    }

    @Override // org.telegram.ui.Components.dz
    public float getTintHighlightsIntensityValue() {
        return ((ff) this.a).i == 0 ? 0.0f : 0.5f;
    }

    @Override // org.telegram.ui.Components.dz
    public int getTintShadowsColor() {
        return ((ff) this.a).h;
    }

    @Override // org.telegram.ui.Components.dz
    public float getTintShadowsIntensityValue() {
        return ((ff) this.a).h == 0 ? 0.0f : 0.5f;
    }

    @Override // org.telegram.ui.Components.dz
    public float getVignetteValue() {
        return ((ff) this.a).l / 100.0f;
    }

    @Override // org.telegram.ui.Components.dz
    public float getWarmthValue() {
        return ((ff) this.a).e / 100.0f;
    }

    @Override // sg.s0
    public void h() {
        tg.t0 t0Var = (tg.t0) this.a;
        t0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new hi.s3(t0Var, 26)).setInterpolator(kr.h);
    }

    @Override // tg.q1
    public void h2(float f10) {
        vp0 vp0Var = (vp0) this.a;
        sg.j0.e(vp0Var.z1).k(String.valueOf(sg.h.a.indexOf(vp0Var.G0.getCurrentBrush())), f10);
        sg.g1 g1Var = vp0Var.u1;
        g1Var.c = f10;
        vp0Var.v0(g1Var, null);
    }

    @Override // org.telegram.ui.Components.i71
    public boolean i(int i7) {
        c71 c71Var = ((k71) this.a).M;
        if (c71Var == null) {
            return false;
        }
        return c71Var.c(i7);
    }

    @Override // gh.a
    public int i0() {
        k5 k5Var = (k5) this.a;
        gh.a A = A();
        int i02 = (A == null || !k5Var.d.e()) ? 0 : A.i0();
        gh.a B = B();
        if (B != null) {
            return i0.a.f(k5Var.a, B.i0(), i02);
        }
        return i02;
    }

    @Override // org.telegram.ui.Components.zm0
    public void j(boolean z10, float f10) {
        float c10;
        int i7;
        ys ysVar = (ys) this.a;
        if (f10 <= 0.25f) {
            c10 = com.google.android.gms.internal.vision.e2.c(f10, 0.25f, 536576.0f, 512000);
        } else {
            float f11 = f10 - 0.25f;
            if (f11 < 0.25f) {
                c10 = com.google.android.gms.internal.vision.e2.c(f11, 0.25f, 9437184.0f, TLObject.FLAG_20);
            } else {
                float f12 = f11 - 0.25f;
                c10 = f12 <= 0.25f ? com.google.android.gms.internal.vision.e2.c(f12, 0.25f, 9.437184E7f, 10485760) : com.google.android.gms.internal.vision.e2.c(f12 - 0.25f, 0.25f, 2097152000 - 104857600, 104857600);
            }
        }
        int i10 = (int) c10;
        long j3 = i10;
        ysVar.b.setText(gd.a0("AutodownloadSizeLimitUpTo", null, 2131753769, org.telegram.messenger.g0.i0(j3, false, false)));
        ysVar.d = j3;
        r8[] r8VarArr = ysVar.h;
        AnimatorSet[] animatorSetArr = ysVar.n;
        int i11 = ysVar.e;
        i7 = ysVar.r.videosRow;
        if (i11 == i7) {
            ysVar.f.setText(gd.a0("AutoDownloadPreloadVideoInfo", null, 2131753807, org.telegram.messenger.g0.i0(j3, false, false)));
            boolean z11 = i10 > 2097152;
            if (z11 != r8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                r8VarArr[0].e(arrayList, z11);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new x9(ysVar, 23));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override // org.telegram.ui.Components.dz
    public ByteBuffer k() {
        ff ffVar = (ff) this.a;
        ffVar.p.q();
        return (ByteBuffer) ffVar.p.f;
    }

    @Override // sg.s0
    public void k0() {
        tg.t0 t0Var = (tg.t0) this.a;
        t0Var.b.a.v();
        t0Var.x.setViewHidden(false);
        PhotoViewer photoViewer = ((up0) t0Var).L;
        Drawable[] drawableArr = PhotoViewer.f9;
        photoViewer.W2(true, true);
    }

    @Override // org.telegram.ui.Components.i71
    public void m(ArrayList arrayList) {
        c71 c71Var = ((k71) this.a).M;
        if (c71Var == null) {
            return;
        }
        c71Var.a(arrayList);
    }

    @Override // org.telegram.ui.Components.hk0
    public void n(View view, boolean z10) {
        if (z10 == ((ChatAttachAlertPhotoLayout) this.a).L && (view instanceof org.telegram.ui.Cells.r5)) {
            org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
            r5Var.y.d(r5Var);
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public boolean o(int i7) {
        ef M = ((ChatAttachAlertPhotoLayout) this.a).H.M(i7);
        return M != null && ChatAttachAlertPhotoLayout.t1.containsKey(Integer.valueOf(M.C));
    }

    @Override // org.telegram.ui.Components.hs0
    public y0 o2(int i7, Runnable runnable, String str, boolean z10, boolean z11) {
        x60 x60Var = (x60) this.a;
        int y10 = x60Var.y();
        x60Var.c(i7, str, new di.p6(runnable, z11, x60Var, 25), z10);
        View x10 = x60Var.x(y10);
        if (x10 instanceof y0) {
            return (y0) x10;
        }
        return null;
    }

    @Override // org.telegram.ui.s9
    public void onDismiss() {
        org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.a;
        v0Var.y("scan_qr_popup_closed", null);
        v0Var.i0 = false;
    }

    @Override // org.telegram.messenger.jc
    public void r(ImageReceiver imageReceiver) {
        cg0 cg0Var = ((fg0) this.a).h.H0;
        if (cg0Var != null) {
            cg0Var.d();
        }
    }

    @Override // sg.s0
    public boolean s() {
        return true;
    }

    @Override // org.telegram.ui.Components.ne0
    public void s1(boolean z10) {
        ((ji.q) this.a).setLanguagePillHidden(z10);
    }

    @Override // org.telegram.ui.nm0
    public void t() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            ((u30) this.a).a.startActivityForResult(intent, 14);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // u4.c
    public void u() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // jg.y1
    public /* synthetic */ a0.h u1() {
        return null;
    }

    @Override // jg.y1
    public void v(int i7) {
        wo0 wo0Var = (wo0) this.a;
        zo0 zo0Var = wo0Var.L;
        wo0Var.s = i7;
        if (wo0Var.w != i7) {
            wo0Var.d.clear();
        }
        int i10 = wo0Var.K;
        if (wo0Var.b() != 0 || wo0Var.e.e() || wo0Var.J) {
            zo0Var.t2.b(i10);
        } else {
            zo0Var.M1.e(false, true);
        }
        wo0Var.f();
        int i11 = zo0.U2;
        zo0Var.L0(true);
    }

    @Override // org.telegram.ui.Components.ne0
    public ji.q v2() {
        return (ji.q) this.a;
    }

    @Override // org.telegram.ui.s9
    public String w0() {
        return ((org.telegram.ui.web.v0) this.a).j0;
    }

    @Override // org.telegram.ui.Components.dz
    public boolean x() {
        return false;
    }

    @Override // sg.s0
    public void x0() {
        ((tg.t0) this.a).x.setViewHidden(true);
    }

    @Override // gh.a
    public int x2() {
        t4 t4Var;
        k5 k5Var = (k5) this.a;
        gh.a A = A();
        int x22 = A != null ? A.x2() : 0;
        return (k5Var.a >= 1.0f || (t4Var = k5Var.d) == null) ? x22 : i0.a.f(k5Var.a, t4Var.getButtonsGlassBackgroundColor(), x22);
    }

    @Override // org.telegram.ui.Components.dz
    public boolean z() {
        return !((ff) this.a).p.F();
    }

    public i5(int i7) {
        switch (i7) {
            case 19:
                this.a = new SparseArray();
                break;
            case 20:
                if (Build.VERSION.SDK_INT < 26) {
                    this.a = new of0(this);
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

    @Override // tg.q1
    public float get() {
        vp0 vp0Var = (vp0) this.a;
        int i7 = vp0Var.z1;
        sg.h currentBrush = vp0Var.G0.getCurrentBrush();
        return currentBrush == null ? sg.j0.e(i7).i : sg.j0.e(i7).f(String.valueOf(sg.h.a.indexOf(currentBrush)), currentBrush.d());
    }

    public i5(int i7, int i10, int... iArr) {
        f50[] f50VarArr = new f50[(iArr.length / 2) + 1];
        this.a = f50VarArr;
        f50 f50Var = new f50(i7, i10);
        int i11 = 0;
        f50VarArr[0] = f50Var;
        while (i11 < iArr.length / 2) {
            int i12 = i11 + 1;
            int i13 = i11 * 2;
            ((f50[]) this.a)[i12] = new f50(iArr[i13], iArr[i13 + 1]);
            i11 = i12;
        }
    }

    public i5(EditText editText) {
        this.a = new t1.a(editText);
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void E0(ur urVar) {
    }

    @Override // jg.y1
    public /* synthetic */ void m2(ArrayList arrayList) {
    }

    @Override // sg.s0
    public /* synthetic */ void l() {
    }

    @Override // org.telegram.ui.Components.i71
    public void p() {
    }

    @Override // sg.s0
    public void q() {
    }

    @Override // org.telegram.ui.Components.zm0
    public void w() {
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void J(int i7, Drawable drawable) {
    }

    @Override // org.telegram.messenger.jc
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
