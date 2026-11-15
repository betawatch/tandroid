package li;

import a8.xa;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.e4;
import c8.ja;
import hi.e6;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kg.u1;
import kg.v1;
import ki.k4;
import ki.p2;
import ki.t2;
import ki.u0;
import ki.w0;
import ki.x2;
import oi.d2;
import oi.e1;
import oi.q3;
import oi.z1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cp;
import org.telegram.messenger.cz;
import org.telegram.messenger.dp;
import org.telegram.messenger.e3;
import org.telegram.messenger.ez;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.h2;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.k5;
import org.telegram.messenger.lj;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.messenger.w7;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b3;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.i3;
import org.telegram.ui.ActionBar.j3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.he;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.ue;
import org.telegram.ui.Components.we;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a7;
import org.telegram.ui.an;
import org.telegram.ui.c4;
import org.telegram.ui.dn;
import org.telegram.ui.g4;
import org.telegram.ui.gc;
import org.telegram.ui.hc;
import org.telegram.ui.k3;
import org.telegram.ui.lm;
import org.telegram.ui.qc;
import org.telegram.ui.qj;
import org.telegram.ui.qy0;
import org.telegram.ui.si;
import org.telegram.ui.t3;
import org.telegram.ui.tl;
import org.telegram.ui.u5;
import org.telegram.ui.v7;
import org.telegram.ui.web.d1;
import org.telegram.ui.web.n1;
import org.telegram.ui.web.s0;
import org.telegram.ui.web.t1;
import org.telegram.ui.web.v0;
import org.telegram.ui.web.x0;
import org.telegram.ui.xd;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        oi.q a10;
        int i7;
        float f10;
        an anVar;
        qj qjVar;
        t1 t1Var;
        String str;
        String str2;
        File file;
        String str3;
        FrameLayout frameLayout;
        String str4;
        Uri uri;
        int i10;
        gj threadMessage;
        int i11 = this.a;
        int i12 = 8;
        int i13 = 4;
        int i14 = 2;
        String str5 = null;
        int i15 = 0;
        boolean z10 = true;
        boolean z11 = true;
        boolean z12 = true;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                d0 d0Var = (d0) obj3;
                d0Var.K0((TLRPC.Chat) obj2, d0Var.p1, ((Boolean) obj).booleanValue());
                break;
            case 1:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str6 = (String) obj;
                q3 q3Var = ((oi.o) obj3).r;
                if (pageblockmath == null) {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str6;
                    q3Var.V1(pageblockmath2);
                    break;
                } else {
                    pageblockmath.source = str6;
                    q3Var.g3.O(false);
                    break;
                }
            case 2:
                e1 e1Var = (e1) obj3;
                oi.q qVar = (oi.q) obj2;
                String str7 = (String) obj;
                e1Var.getClass();
                if (!TextUtils.isEmpty(str7)) {
                    Editable text = e1Var.getText();
                    int spanStart = text.getSpanStart(qVar);
                    int spanEnd = text.getSpanEnd(qVar);
                    if (spanStart >= 0 && spanEnd >= 0 && (a10 = oi.q.a(str7, e1Var.getCurrentTextColor(), org.telegram.messenger.g0.L(gz.W0 + 4))) != null) {
                        boolean z13 = e1Var.m2;
                        if (z13) {
                            e1Var.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a10, 0, 1, 33);
                        int max = Math.max(0, Math.min(spanStart, e1Var.length()));
                        text.replace(max, Math.max(max, Math.min(spanEnd, e1Var.length())), spannableString);
                        e1Var.setSelection(Math.min(max + 1, e1Var.length()));
                        if (z13) {
                            e1Var.setLocked(true);
                            break;
                        }
                    }
                }
                break;
            case 3:
                z1 z1Var = (z1) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str8 = (String) obj;
                z1Var.getClass();
                if (pageblockmath3 == null) {
                    TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                    pageblockmath4.source = str8;
                    z1Var.Q.V1(pageblockmath4);
                    break;
                } else {
                    pageblockmath3.source = str8;
                    z1Var.Q.g3.O(false);
                    break;
                }
            case 4:
                q3 q3Var2 = (q3) obj3;
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                String str9 = (String) obj;
                q3Var2.getClass();
                if (!TextUtils.equals(str9, pageblockmath5.source)) {
                    d2 d2Var = q3Var2.R3;
                    if (d2Var != null) {
                        d2Var.d();
                    }
                    pageblockmath5.source = str9;
                    q3Var2.g3.O(false);
                    d2 d2Var2 = q3Var2.R3;
                    if (d2Var2 != null) {
                        d2Var2.h();
                    }
                    q3Var2.p3.onContentChanged();
                    break;
                }
                break;
            case 5:
                ((VoIPDebugToSend) obj3).lambda$done$0((TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                break;
            case 6:
                c3 c3Var = (c3) obj3;
                b3 b3Var = (b3) obj2;
                e2 e2Var = (e2) obj;
                if (e2Var != null) {
                    if ((e2Var instanceof an) && (qjVar = (anVar = (an) e2Var).a0) != null) {
                        qjVar.S();
                        anVar.a0.z0(true, false, true);
                    }
                    if (e2Var.getContext() != null && e2Var.getParentActivity() != null) {
                        x2 x2Var = new x2(e2Var.getContext(), e2Var.getResourceProvider());
                        x2Var.m0 = e2Var.getParentActivity();
                        if (b3Var != null && b3Var.a != null) {
                            x2Var.G0 = true;
                            boolean z14 = b3Var.o;
                            x2Var.X = z14;
                            if (z14) {
                                x2Var.A(b3Var.r, false);
                            }
                            if (b3Var.n) {
                                i7 = b3Var.q;
                            } else {
                                int i16 = b3Var.p;
                                if (i16 < 0) {
                                    i16 = j6.d6;
                                }
                                i7 = j6.w0(i16, x2Var.G);
                            }
                            x2Var.y(i7, b3Var.n, false);
                            x2Var.D(b3Var.s, false);
                            x2Var.H0 = b3Var.j;
                            x2Var.I0 = b3Var.k;
                            boolean z15 = b3Var.u;
                            x2Var.y0 = z15;
                            p2 p2Var = x2Var.E;
                            p2Var.setIsBackButtonVisible(z15);
                            x2Var.x.setAllowSwipes(b3Var.l);
                            org.telegram.messenger.g0.Q3(x2Var.Y.getBackButton(), x2Var.y0 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
                            h2 h2Var = x2Var.o0;
                            if (h2Var != null) {
                                boolean z16 = x2Var.y0;
                                h2Var.L = z16;
                                h2Var.M.d(z16);
                                h2Var.invalidate();
                            }
                            x2Var.t0 = b3Var.y;
                            x2Var.B0 = Boolean.valueOf(b3Var.B);
                            x2Var.C0 = b3Var.C;
                            w0 w0Var = b3Var.K;
                            x2Var.D0 = w0Var;
                            if (w0Var != null) {
                                u0 u0Var = w0Var.r;
                                SensorManager sensorManager = w0Var.a;
                                f10 = 0.721f;
                                if (w0Var.l) {
                                    w0Var.l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = w0Var.b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(w0Var.n, sensor, w0.a(w0Var.c));
                                        }
                                        Sensor sensor2 = w0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(w0Var.p, sensor2, w0.a(w0Var.e));
                                        }
                                        Sensor sensor3 = w0Var.g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(u0Var, sensor3, w0.a(w0Var.h));
                                        }
                                        Sensor sensor4 = w0Var.f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(u0Var, sensor4, w0.a(w0Var.h));
                                        }
                                        Sensor sensor5 = w0Var.i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(w0Var.t, sensor5, w0.a(w0Var.j));
                                        }
                                    }
                                }
                            } else {
                                f10 = 0.721f;
                            }
                            xa xaVar = b3Var.w;
                            if (xaVar != null) {
                                t2 t2Var = x2Var.n0;
                                int totalHeight = t2Var.getTotalHeight();
                                t2Var.e = xaVar;
                                ki.t[] tVarArr = t2Var.f;
                                ki.v.b(tVarArr[0].l, (ki.u) xaVar.c, false);
                                ki.v.b(tVarArr[1].l, (ki.u) xaVar.d, false);
                                t2Var.invalidate();
                                if (totalHeight != t2Var.getTotalHeight() && t2Var.r != null) {
                                    if (totalHeight < t2Var.getTotalHeight()) {
                                        org.telegram.messenger.g0.i3(t2Var.r, 200L);
                                    } else {
                                        t2Var.r.run();
                                    }
                                }
                                int i17 = xaVar.b;
                                Paint paint = t2Var.a;
                                t2Var.e.b = i17;
                                paint.setColor(i17);
                                t2Var.d.a(i17, true);
                            }
                            x2Var.C(b3Var.z, false, b3Var.A);
                            k4 k4Var = b3Var.a;
                            x2Var.I = k4Var != null ? k4Var.a : m10.t0;
                            s0 s0Var = b3Var.b;
                            if (s0Var != null) {
                                s0Var.onResume();
                                p2Var.O(x2Var.I, b3Var.b, b3Var.d, b3Var.f, b3Var.e);
                                boolean z17 = b3Var.t || b3Var.b.b;
                                String str10 = b3Var.x;
                                p2Var.g("setState(" + z17 + ", " + str10 + ")");
                                p2Var.O = z17;
                                p2Var.b = str10;
                                if (j6.I.q() != b3Var.D) {
                                    p2Var.z();
                                }
                            } else {
                                k4Var.q = null;
                                k4Var.r = 0L;
                            }
                            x2Var.x(e2Var, b3Var.a);
                            x2Var.d0 = b3Var.v;
                            if (b3Var.G) {
                                x2Var.X0 = true;
                                x2Var.m();
                                org.telegram.ui.b3 b3Var2 = x2Var.Z0;
                                String p10 = x2Var.q() ? x2Var.x0.e : q10.p(np.s1(x2Var.I).a2(Long.valueOf(x2Var.J)));
                                String str11 = b3Var.H;
                                x2Var.Y0 = str11;
                                b3Var2.a(p10, str11);
                                org.telegram.ui.b3 b3Var3 = x2Var.Z0;
                                Paint paint2 = x2Var.R;
                                b3Var3.b(org.telegram.messenger.g0.B(paint2.getColor()) <= f10, false);
                                x2Var.Z0.setBackgroundColor(paint2.getColor());
                                x2Var.Z0.setVisibility(0);
                                x2Var.Z0.setAlpha(1.0f);
                            }
                            x2Var.t(b3Var.L);
                            c3Var.h(c3Var.x, b3Var, false);
                            x2Var.show();
                            break;
                        }
                    }
                }
                break;
            case 7:
                g3 g3Var = (g3) obj2;
                ((b3) obj3).m = (Bitmap) obj;
                g3Var.d().setDrawingFromOverlay(false);
                g3Var.release();
                break;
            case 8:
                i3 i3Var = (i3) obj2;
                j3 j3Var = (j3) ((e6) obj3).q;
                if (!((Boolean) obj).booleanValue()) {
                    i3Var.a(0.0f);
                    break;
                } else {
                    i3Var.a(1.0f);
                    if (j3Var.a.getTabs().isEmpty()) {
                        j3Var.a(false);
                        break;
                    }
                }
                break;
            case 9:
                g4 g4Var = (g4) obj3;
                Activity activity = (Activity) obj2;
                Integer num = (Integer) obj;
                t3 t3Var = g4Var.L;
                org.telegram.ui.k0[] k0VarArr = g4Var.U0;
                if ((!g4Var.v0[0].c() || g4Var.v0[0].c.F != null) && g4Var.M != null) {
                    if (num.intValue() != 1) {
                        if (num.intValue() != 2) {
                            int i18 = 6;
                            if (num.intValue() != 6) {
                                int i19 = 7;
                                if (num.intValue() != 7) {
                                    int i20 = 3;
                                    if (num.intValue() != 8) {
                                        int i21 = 9;
                                        if (num.intValue() != 9) {
                                            if (num.intValue() != 3) {
                                                if (num.intValue() != 4) {
                                                    if (num.intValue() != 5) {
                                                        if (num.intValue() == 10 && (t1Var = g4Var.v0[0].F) != null && t1Var.b() != null) {
                                                            g4Var.f(t1Var.b(), null, 1);
                                                            break;
                                                        }
                                                    } else if (g4Var.v0[0].f() && g4Var.v0[0].getWebView() != null) {
                                                        g4Var.v0[0].getWebView().reload();
                                                        break;
                                                    }
                                                } else if (!g4Var.v0[0].f()) {
                                                    u2 i22 = i20.i(g4Var.M, false, 1, null);
                                                    i22.v0 = false;
                                                    LinearLayout linearLayout = new LinearLayout(g4Var.M);
                                                    linearLayout.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
                                                    linearLayout.setOrientation(1);
                                                    n4 n4Var = new n4(g4Var.M, (org.telegram.ui.ActionBar.e6) null);
                                                    n4Var.setText(hd.M0(2131750609, null));
                                                    linearLayout.addView(n4Var, ja.t(-2, -2, 51, 3, 1, 3, 0));
                                                    linearLayout.addView(new c4(g4Var, g4Var.M), ja.t(-1, -2, 51, 3, 0, 3, 0));
                                                    n4 n4Var2 = new n4(g4Var.M, (org.telegram.ui.ActionBar.e6) null);
                                                    n4Var2.setText(hd.M0(2131750604, null));
                                                    linearLayout.addView(n4Var2, ja.t(-2, -2, 51, 3, 4, 3, 2));
                                                    int i23 = 0;
                                                    while (i23 < i14) {
                                                        Activity activity2 = g4Var.M;
                                                        org.telegram.ui.k0 k0Var = new org.telegram.ui.k0((Context) activity2, (int) (z10 ? 1 : 0));
                                                        int i24 = j6.i6;
                                                        org.telegram.ui.Cells.y h02 = j6.h0(j6.x0(null, i24, false), i14, -1);
                                                        m6 M = q6.M(i24);
                                                        k0Var.setBackground(h02);
                                                        q6.j(k0Var, h02, null, M, null);
                                                        RadioButton radioButton = new RadioButton(activity2);
                                                        k0Var.b = radioButton;
                                                        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                                                        q6.O(radioButton, j6.D5, j6.E5, null);
                                                        boolean z18 = hd.a0;
                                                        k0Var.addView(radioButton, ja.d(22, 22.0f, (z18 ? 5 : 3) | 48, z18 ? 0 : 22, 13.0f, z18 ? 22 : 0, 0.0f));
                                                        TextView textView = new TextView(activity2);
                                                        q6.U(textView, j6.G6, null);
                                                        i20.p(textView, 1, 16.0f, 1, 1);
                                                        textView.setSingleLine(true);
                                                        textView.setGravity((hd.a0 ? 5 : 3) | 16);
                                                        boolean z19 = hd.a0;
                                                        k0Var.addView(textView, ja.d(-1, -1.0f, (z19 ? 5 : 3) | 48, z19 ? 17 : 62, 0.0f, z19 ? 62 : 17, 0.0f));
                                                        k0VarArr[i23] = k0Var;
                                                        if (i23 == 0) {
                                                            String M0 = hd.M0(2131751600, null);
                                                            Typeface typeface = Typeface.DEFAULT;
                                                            textView.setText(M0);
                                                            textView.setTypeface(typeface);
                                                            k0Var.setContentDescription(M0);
                                                            k0Var.invalidate();
                                                        } else if (i23 == 1) {
                                                            Typeface typeface2 = Typeface.SERIF;
                                                            textView.setText("Serif");
                                                            textView.setTypeface(typeface2);
                                                            k0Var.setContentDescription("Serif");
                                                            k0Var.invalidate();
                                                        }
                                                        ((RadioButton) k0VarArr[i23].b).a(i23 == g4Var.a, false);
                                                        k0VarArr[i23].setTag(Integer.valueOf(i23));
                                                        k0VarArr[i23].setOnClickListener(new org.telegram.ui.r(g4Var, i13));
                                                        linearLayout.addView(k0VarArr[i23], ja.o(-1, 50));
                                                        i23++;
                                                        i14 = 2;
                                                    }
                                                    i22.O = linearLayout;
                                                    g4Var.J = i22;
                                                    g4Var.Y(i22);
                                                    break;
                                                } else {
                                                    e2 T = LaunchActivity.T();
                                                    if (T != null) {
                                                        c2 c2Var = new c2();
                                                        c2Var.a = true;
                                                        T.showAsSheet(new n1(new org.telegram.ui.q(g4Var, i20)), c2Var);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                if (!g4Var.v0[0].f()) {
                                                    TLRPC.WebPage webPage = g4Var.v0[0].c.F;
                                                    if (webPage != null) {
                                                        String str12 = webPage.url;
                                                        TL_iv.Page page = webPage.cached_page;
                                                        if (page != null) {
                                                            file = page.local;
                                                            str = str12;
                                                            str2 = null;
                                                        } else {
                                                            str = str12;
                                                            str2 = null;
                                                            file = null;
                                                        }
                                                    }
                                                } else if (g4Var.v0[0].getWebView() != null) {
                                                    str = g4Var.v0[0].getWebView().getUrl();
                                                    str2 = g4Var.v0[0].getWebView().getOpenURL();
                                                    file = null;
                                                }
                                                Activity activity3 = g4Var.M;
                                                if (activity3 != null && !activity3.isFinishing()) {
                                                    if (file == null) {
                                                        if (str != null) {
                                                            String K0 = org.telegram.messenger.g0.K0(str2, true);
                                                            String K02 = org.telegram.messenger.g0.K0(str, true);
                                                            org.telegram.ui.w wVar = new org.telegram.ui.w(g4Var, str, z12 ? 1 : 0);
                                                            org.telegram.ui.x xVar = new org.telegram.ui.x(g4Var, K02, K0, z11 ? 1 : 0);
                                                            if (!g4Var.v0[0].f() || !np.s1(g4Var.Y).N2(K02) || np.s1(g4Var.Y).L2(true)) {
                                                                wVar.run();
                                                                break;
                                                            } else {
                                                                t4.l0(activity, null, str, true, new e4(i21, xVar, wVar));
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        String D = w7.D(file);
                                                        Pattern pattern = q80.a;
                                                        org.telegram.messenger.g0.t2(file, null, ("diff".equalsIgnoreCase(D) || "patch".equalsIgnoreCase(D)) ? "text/x-diff" : "text/markdown", g4Var.M, null, true);
                                                        break;
                                                    }
                                                }
                                            }
                                        } else if (g4Var.v0[0].getWebView() != null) {
                                            g4Var.v0[0].getWebView().goForward();
                                            break;
                                        }
                                    } else {
                                        c2 c2Var2 = new c2();
                                        c2Var2.a = true;
                                        e2 T2 = LaunchActivity.T();
                                        if (T2 != null) {
                                            T2.showAsSheet(new x0(t3Var != null ? new org.telegram.ui.z(g4Var, i19) : null, new org.telegram.ui.q(g4Var, i20)), c2Var2);
                                            break;
                                        }
                                    }
                                } else {
                                    c2 c2Var3 = new c2();
                                    c2Var3.a = true;
                                    e2 T3 = LaunchActivity.T();
                                    if (T3 != null) {
                                        T3.showAsSheet(new org.telegram.ui.web.m(t3Var != null ? new org.telegram.ui.z(g4Var, i18) : null, new org.telegram.ui.q(g4Var, i14)), c2Var3);
                                        break;
                                    }
                                }
                            } else {
                                if (!g4Var.v0[0].f()) {
                                    k3 k3Var = g4Var.v0[0];
                                    TLRPC.WebPage webPage2 = k3Var.c.F;
                                    if (webPage2 != null) {
                                        str3 = webPage2.url;
                                        frameLayout = k3Var;
                                    }
                                } else if (g4Var.v0[0].getWebView() != null) {
                                    str3 = g4Var.v0[0].getWebView().getUrl();
                                    frameLayout = g4Var.v0[0].f;
                                }
                                g4.d(str3, g4Var.Y, frameLayout, t3Var, null);
                                break;
                            }
                        } else {
                            if (!g4Var.v0[0].f()) {
                                TLRPC.WebPage webPage3 = g4Var.v0[0].c.F;
                                if (webPage3 != null) {
                                    str4 = webPage3.url;
                                }
                            } else if (g4Var.v0[0].getWebView() != null) {
                                str4 = g4Var.v0[0].getWebView().getUrl();
                            }
                            String u10 = v0.u(str4);
                            g4Var.Y(new po0(g4Var.M, null, u10, false, u10, false, org.telegram.messenger.g0.B(g4Var.i0.getBackgroundColor()) < 0.721f ? new fi.b() : null));
                            break;
                        }
                    } else {
                        org.telegram.ui.l0 l0Var = g4Var.i0;
                        int L = org.telegram.messenger.g0.L(56.0f);
                        g4Var.K0 = L;
                        l0Var.setHeight(L);
                        g4Var.i0.h(true);
                        break;
                    }
                }
                break;
            case 10:
                k3 k3Var2 = (k3) obj3;
                Activity activity4 = (Activity) obj2;
                String str13 = (String) obj;
                if (!TextUtils.isEmpty(str13) && k3Var2.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str13.trim());
                    org.telegram.messenger.g0.c(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i25 = 0;
                    while (i15 < uRLSpanArr.length) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i15]), length);
                        i25 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i15]), i25);
                        i15++;
                    }
                    Pattern pattern2 = Utilities.a;
                    try {
                        uri = Uri.parse(str13);
                    } catch (Exception unused) {
                        uri = null;
                    }
                    if (uri == null || !TextUtils.equals(uri.getScheme(), "javascript")) {
                        if ((uRLSpanArr.length > 0 && length == 0 && i25 > 0) || (uri != null && uri.getScheme() != null)) {
                            if (uri != null && uri.getScheme() == null && uri.getHost() == null && uri.getPath() != null) {
                                str13 = vf.c.w(uri, "https", null, uri.getEncodedPath(), "/");
                            }
                            k3Var2.getWebView().loadUrl(str13);
                            break;
                        } else {
                            org.telegram.ui.web.k.b(activity4, str13);
                            s0 webView = k3Var2.getWebView();
                            String str14 = d1.a().b;
                            if (str14 != null) {
                                StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str14);
                                m10.append(URLEncoder.encode(str13));
                                str5 = m10.toString();
                            }
                            webView.loadUrl(str5);
                            break;
                        }
                    }
                }
                break;
            case 11:
                qc qcVar = (qc) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                qcVar.c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i26 = tL_premium_boostsStatus.level;
                    qcVar.b = i26;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i26;
                    }
                }
                qcVar.e1(true);
                hi.d dVar = qcVar.Q;
                if (dVar != null) {
                    dVar.setLoading(false);
                    break;
                }
                break;
            case 12:
                hc hcVar = (hc) obj3;
                dp dpVar = (dp) obj2;
                View view = (View) obj;
                if (view instanceof gc) {
                    gc gcVar = (gc) view;
                    gcVar.setBackgroundColor(j6.w0(j6.d6, hcVar.a));
                    hcVar.b.getClass();
                    int R = RecyclerView.R(view);
                    if (dpVar != null) {
                        ArrayList arrayList = dpVar.c;
                        if (R >= 0 && R < arrayList.size()) {
                            gcVar.a((cp) arrayList.get(R));
                        }
                    }
                    view.invalidate();
                    break;
                }
                break;
            case 13:
                ug.j0 j0Var = (ug.j0) obj2;
                j0Var.A1((e3) obj);
                ((xd) obj3).n0.showDialog(j0Var);
                break;
            case 14:
                an anVar2 = (an) obj3;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = anVar2.getMessagesController().j1(anVar2.k6);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((u1) obj2).a;
                anVar2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                qj qjVar2 = anVar2.a0;
                if (qjVar2 != null) {
                    qjVar2.setFieldText(null);
                    break;
                }
                break;
            case 15:
                an anVar3 = (an) obj3;
                cz b10 = cz.b((String) obj2, anVar3.k6, anVar3.E5, anVar3.m4, null, false, null, null, null, true, 0, 0, null, false);
                b10.K = anVar3.Y8();
                b10.Q = ((Long) obj).longValue();
                b10.R = anVar3.j9();
                b10.T = anVar3.x5;
                anVar3.getSendMessagesHelper().r0(b10);
                anVar3.a0.setFieldText("");
                anVar3.D9(false);
                break;
            case 16:
                an anVar4 = (an) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l10 = (Long) obj;
                if (anVar4.g4 != 1) {
                    anVar4.Hb(botInlineResult, true, 0, l10.longValue());
                    break;
                } else {
                    t4.J(anVar4.getParentActivity(), anVar4.k6, new a7(anVar4, botInlineResult, l10, i14), anVar4.Aa);
                    break;
                }
            case 17:
                ((an) obj3).Ib = true;
                ((u5) obj2).run();
                break;
            case 18:
                an.h0((an) obj3, (qy0[]) obj2, (m60) obj);
                break;
            case 19:
                an anVar5 = (an) obj3;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    t1VarArr[0].dismiss();
                } catch (Throwable unused2) {
                }
                t1VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (!(tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError)) {
                        new vh.i(anVar5.getParentActivity(), anVar5.Aa, tL_statsPollStats).show();
                        break;
                    } else {
                        k5.n(null, 2131747157, cc.a0(anVar5), R.raw.timer_toast, 24);
                        break;
                    }
                }
                break;
            case 20:
                an anVar6 = (an) obj3;
                gj gjVar = (gj) obj2;
                anVar6.getClass();
                TLRPC.SuggestedPost c10 = ((lj) obj).c();
                if (gjVar != null && gjVar.k != null) {
                    anVar6.getMessagesController().h(gjVar, c10);
                    break;
                }
                break;
            case 21:
                u1 u1Var = (u1) obj2;
                String str15 = (String) obj;
                an anVar7 = ((si) obj3).b;
                if (u1Var != null) {
                    i10 = ((e2) anVar7).currentAccount;
                    v1.f(i10).k(u1Var.a, str15);
                }
                anVar7.f4 = str15;
                anVar7.p1.setTitle(str15);
                break;
            case 22:
                gj gjVar2 = (gj) obj2;
                Long l11 = (Long) obj;
                an anVar8 = ((lm) obj3).a;
                if (anVar8.u7()) {
                    cz b11 = cz.b(gjVar2.C0(), anVar8.k6, anVar8.E5, anVar8.m4, null, false, null, null, null, true, 0, 0, null, false);
                    b11.K = anVar8.Y8();
                    b11.W = l11.longValue();
                    anVar8.getSendMessagesHelper().r0(b11);
                    break;
                }
                break;
            case 23:
                q1 q1Var = (q1) obj2;
                an anVar9 = ((lm) obj3).a;
                if (!((Boolean) obj).booleanValue()) {
                    if (q1Var.getMessageObject() != null) {
                        q1Var.getMessageObject().t2 = Boolean.FALSE;
                    }
                    q1Var.I3();
                    break;
                } else {
                    while (i15 < anVar9.A0.getChildCount()) {
                        View childAt = anVar9.A0.getChildAt(i15);
                        if (childAt instanceof q1) {
                            q1 q1Var2 = (q1) childAt;
                            if (q1Var2.getMessageObject() != null && q1Var2.getMessageObject().p4()) {
                                q1Var2.I3();
                            }
                        }
                        i15++;
                    }
                    break;
                }
                break;
            case 24:
                lm lmVar = (lm) obj3;
                v vVar = (v) obj2;
                an anVar10 = lmVar.a;
                if (!((Boolean) obj).booleanValue()) {
                    cc.a0(anVar10).I(R.raw.error, hd.M0(2131754311, null), hd.M0(2131754312, null)).j();
                    break;
                } else {
                    anVar10.getMessagesController().G4(true);
                    cc.a0(anVar10).P(R.raw.chats_infotip, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(hd.M0(2131745574, null), new tl(lmVar, i12)), true)).k(true);
                    vVar.a(Boolean.TRUE);
                    break;
                }
            case 25:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((lm) obj3).a.getMessagesController().v(message.id, -1, m5.o(message.peer_id), (String) obj, true);
                break;
            case 26:
                dn dnVar = (dn) obj3;
                dnVar.f.s(((TLRPC.WallPaper) obj2).settings.intensity, ((gg.a) obj).a);
                View view2 = dnVar.b;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 27:
                Long l12 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((we) obj3).a;
                long j3 = chatActivityEnterView.y3;
                gj gjVar3 = chatActivityEnterView.B3;
                threadMessage = chatActivityEnterView.getThreadMessage();
                cz b12 = cz.b((String) obj2, j3, gjVar3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                an anVar11 = chatActivityEnterView.x3;
                b12.K = anVar11 != null ? anVar11.Y8() : null;
                b12.O = chatActivityEnterView.n6;
                b12.Q = l12.longValue();
                b12.R = chatActivityEnterView.getSendMonoForumPeerId();
                b12.T = chatActivityEnterView.getSendMessageSuggestionParams();
                ez.C(chatActivityEnterView.R).r0(b12);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.n0.c();
                he heVar = chatActivityEnterView.K0;
                chatActivityEnterView.n6 = 0L;
                heVar.setEffect(0L);
                break;
            case 28:
                ki kiVar = (ki) obj3;
                di diVar = (di) obj2;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i27 = kiVar.H3;
                tL_messages_toggleBotInAttachMenu.bot = np.s1(i27).o1(diVar.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i27).sendRequest(tL_messages_toggleBotInAttachMenu, new v7(14, kiVar, diVar), 66);
                break;
            default:
                ki kiVar2 = (ki) obj3;
                ((an) obj2).x5 = (lj) obj;
                boolean u12 = kiVar2.u1(true, 0, 0, kiVar2.L2, kiVar2.f1());
                ue ueVar = kiVar2.c2;
                if (ueVar != null) {
                    ueVar.h(!u12);
                    kiVar2.c2 = null;
                    break;
                }
                break;
        }
    }
}
