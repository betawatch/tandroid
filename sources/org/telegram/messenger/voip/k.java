package org.telegram.messenger.voip;

import a8.wa;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.p5;
import c8.ha;
import fi.f6;
import hi.a3;
import hi.q4;
import hi.s2;
import hi.v0;
import hi.w2;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.regex.Pattern;
import kg.s1;
import kg.t1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.e3;
import org.telegram.messenger.ez;
import org.telegram.messenger.fp;
import org.telegram.messenger.gp;
import org.telegram.messenger.gz;
import org.telegram.messenger.h2;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.k5;
import org.telegram.messenger.m5;
import org.telegram.messenger.nj;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.d3;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j3;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.ge;
import org.telegram.ui.Components.gx;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.hx;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.ue;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.we;
import org.telegram.ui.Components.wh;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a7;
import org.telegram.ui.an;
import org.telegram.ui.b3;
import org.telegram.ui.c4;
import org.telegram.ui.dn;
import org.telegram.ui.g4;
import org.telegram.ui.hc;
import org.telegram.ui.ic;
import org.telegram.ui.ld;
import org.telegram.ui.lm;
import org.telegram.ui.qf;
import org.telegram.ui.qj;
import org.telegram.ui.rc;
import org.telegram.ui.si;
import org.telegram.ui.sy0;
import org.telegram.ui.t3;
import org.telegram.ui.tl;
import org.telegram.ui.web.f1;
import org.telegram.ui.web.o1;
import org.telegram.ui.web.u0;
import org.telegram.ui.web.u1;
import org.telegram.ui.web.x0;
import org.telegram.ui.web.z0;
import org.telegram.ui.zd;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7;
        float f10;
        an anVar;
        qj qjVar;
        u1 u1Var;
        String str;
        String str2;
        File file;
        String str3;
        FrameLayout frameLayout;
        String str4;
        Uri uri;
        int i10;
        ij threadMessage;
        int i11 = this.a;
        int i12 = 2;
        int i13 = 8;
        String str5 = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                ((VoIPDebugToSend) obj3).lambda$done$0((TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                break;
            case 1:
                d3 d3Var = (d3) obj3;
                c3 c3Var = (c3) obj2;
                f2 f2Var = (f2) obj;
                if (f2Var != null) {
                    if ((f2Var instanceof an) && (qjVar = (anVar = (an) f2Var).Z) != null) {
                        qjVar.L();
                        anVar.Z.l0(true, false, true);
                    }
                    if (f2Var.getContext() != null && f2Var.getParentActivity() != null) {
                        a3 a3Var = new a3(f2Var.getContext(), f2Var.getResourceProvider());
                        a3Var.l0 = f2Var.getParentActivity();
                        if (c3Var != null && c3Var.a != null) {
                            a3Var.F0 = true;
                            boolean z9 = c3Var.o;
                            a3Var.W = z9;
                            if (z9) {
                                a3Var.A(c3Var.r, false);
                            }
                            if (c3Var.n) {
                                i7 = c3Var.q;
                            } else {
                                int i14 = c3Var.p;
                                if (i14 < 0) {
                                    i14 = k6.d6;
                                }
                                i7 = k6.w0(i14, a3Var.F);
                            }
                            a3Var.y(i7, c3Var.n, false);
                            a3Var.D(c3Var.s, false);
                            a3Var.G0 = c3Var.j;
                            a3Var.H0 = c3Var.k;
                            boolean z10 = c3Var.u;
                            a3Var.x0 = z10;
                            s2 s2Var = a3Var.D;
                            s2Var.setIsBackButtonVisible(z10);
                            a3Var.x.setAllowSwipes(c3Var.l);
                            org.telegram.messenger.g0.R3(a3Var.X.getBackButton(), a3Var.x0 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
                            h2 h2Var = a3Var.n0;
                            if (h2Var != null) {
                                boolean z11 = a3Var.x0;
                                h2Var.K = z11;
                                h2Var.L.d(z11);
                                h2Var.invalidate();
                            }
                            a3Var.s0 = c3Var.y;
                            a3Var.A0 = Boolean.valueOf(c3Var.B);
                            a3Var.B0 = c3Var.C;
                            v0 v0Var = c3Var.K;
                            a3Var.C0 = v0Var;
                            if (v0Var != null) {
                                hi.t0 t0Var = v0Var.r;
                                SensorManager sensorManager = v0Var.a;
                                f10 = 0.721f;
                                if (v0Var.l) {
                                    v0Var.l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = v0Var.b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(v0Var.n, sensor, v0.a(v0Var.c));
                                        }
                                        Sensor sensor2 = v0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(v0Var.p, sensor2, v0.a(v0Var.e));
                                        }
                                        Sensor sensor3 = v0Var.g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(t0Var, sensor3, v0.a(v0Var.h));
                                        }
                                        Sensor sensor4 = v0Var.f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(t0Var, sensor4, v0.a(v0Var.h));
                                        }
                                        Sensor sensor5 = v0Var.i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(v0Var.t, sensor5, v0.a(v0Var.j));
                                        }
                                    }
                                }
                            } else {
                                f10 = 0.721f;
                            }
                            wa waVar = c3Var.w;
                            if (waVar != null) {
                                w2 w2Var = a3Var.m0;
                                int totalHeight = w2Var.getTotalHeight();
                                w2Var.e = waVar;
                                hi.r[] rVarArr = w2Var.f;
                                hi.t.b(rVarArr[0].l, (hi.s) waVar.c, false);
                                hi.t.b(rVarArr[1].l, (hi.s) waVar.d, false);
                                w2Var.invalidate();
                                if (totalHeight != w2Var.getTotalHeight() && w2Var.r != null) {
                                    if (totalHeight < w2Var.getTotalHeight()) {
                                        org.telegram.messenger.g0.i3(w2Var.r, 200L);
                                    } else {
                                        w2Var.r.run();
                                    }
                                }
                                int i15 = waVar.b;
                                Paint paint = w2Var.a;
                                w2Var.e.b = i15;
                                paint.setColor(i15);
                                w2Var.d.a(i15, true);
                            }
                            a3Var.C(c3Var.z, false, c3Var.A);
                            q4 q4Var = c3Var.a;
                            a3Var.H = q4Var != null ? q4Var.a : p10.s0;
                            u0 u0Var = c3Var.b;
                            if (u0Var != null) {
                                u0Var.onResume();
                                s2Var.O(a3Var.H, c3Var.b, c3Var.d, c3Var.f, c3Var.e);
                                boolean z12 = c3Var.t || c3Var.b.b;
                                String str6 = c3Var.x;
                                s2Var.g("setState(" + z12 + ", " + str6 + ")");
                                s2Var.N = z12;
                                s2Var.b = str6;
                                if (k6.I.q() != c3Var.D) {
                                    s2Var.z();
                                }
                            } else {
                                q4Var.q = null;
                                q4Var.r = 0L;
                            }
                            a3Var.x(f2Var, c3Var.a);
                            a3Var.c0 = c3Var.v;
                            if (c3Var.G) {
                                a3Var.W0 = true;
                                a3Var.m();
                                b3 b3Var = a3Var.Y0;
                                String p10 = a3Var.q() ? a3Var.w0.e : t10.p(qp.s1(a3Var.H).a2(Long.valueOf(a3Var.I)));
                                String str7 = c3Var.H;
                                a3Var.X0 = str7;
                                b3Var.a(p10, str7);
                                b3 b3Var2 = a3Var.Y0;
                                Paint paint2 = a3Var.Q;
                                b3Var2.b(org.telegram.messenger.g0.B(paint2.getColor()) <= f10, false);
                                a3Var.Y0.setBackgroundColor(paint2.getColor());
                                a3Var.Y0.setVisibility(0);
                                a3Var.Y0.setAlpha(1.0f);
                            }
                            a3Var.t(c3Var.L);
                            d3Var.h(d3Var.x, c3Var, false);
                            a3Var.show();
                            break;
                        }
                    }
                }
                break;
            case 2:
                h3 h3Var = (h3) obj2;
                ((c3) obj3).m = (Bitmap) obj;
                h3Var.d().setDrawingFromOverlay(false);
                h3Var.release();
                break;
            case 3:
                j3 j3Var = (j3) obj2;
                k3 k3Var = (k3) ((f6) obj3).q;
                if (((Boolean) obj).booleanValue()) {
                    j3Var.a(1.0f);
                    if (k3Var.a.getTabs().isEmpty()) {
                        k3Var.a(false);
                        break;
                    }
                } else {
                    j3Var.a(0.0f);
                    break;
                }
                break;
            case 4:
                g4 g4Var = (g4) obj3;
                Activity activity = (Activity) obj2;
                Integer num = (Integer) obj;
                t3 t3Var = g4Var.K;
                org.telegram.ui.k0[] k0VarArr = g4Var.T0;
                if ((!g4Var.u0[0].c() || g4Var.u0[0].c.E != null) && g4Var.L != null) {
                    if (num.intValue() == 1) {
                        org.telegram.ui.l0 l0Var = g4Var.h0;
                        int L = org.telegram.messenger.g0.L(56.0f);
                        g4Var.J0 = L;
                        l0Var.setHeight(L);
                        g4Var.h0.h(true);
                        break;
                    } else if (num.intValue() == 2) {
                        if (!g4Var.u0[0].f()) {
                            TLRPC.WebPage webPage = g4Var.u0[0].c.E;
                            if (webPage != null) {
                                str4 = webPage.url;
                            }
                        } else if (g4Var.u0[0].getWebView() != null) {
                            str4 = g4Var.u0[0].getWebView().getUrl();
                        }
                        String u10 = x0.u(str4);
                        g4Var.Y(new mo0(g4Var.L, null, u10, false, u10, false, org.telegram.messenger.g0.B(g4Var.h0.getBackgroundColor()) < 0.721f ? new di.b() : null));
                        break;
                    } else {
                        int i16 = 6;
                        if (num.intValue() == 6) {
                            if (!g4Var.u0[0].f()) {
                                org.telegram.ui.k3 k3Var2 = g4Var.u0[0];
                                TLRPC.WebPage webPage2 = k3Var2.c.E;
                                if (webPage2 != null) {
                                    str3 = webPage2.url;
                                    frameLayout = k3Var2;
                                }
                            } else if (g4Var.u0[0].getWebView() != null) {
                                str3 = g4Var.u0[0].getWebView().getUrl();
                                frameLayout = g4Var.u0[0].f;
                            }
                            g4.d(str3, g4Var.X, frameLayout, t3Var, null);
                            break;
                        } else {
                            int i17 = 7;
                            if (num.intValue() == 7) {
                                d2 d2Var = new d2();
                                d2Var.a = true;
                                f2 T = LaunchActivity.T();
                                if (T != null) {
                                    T.showAsSheet(new org.telegram.ui.web.l(t3Var != null ? new org.telegram.ui.a0(g4Var, i16) : null, new org.telegram.ui.q(g4Var, i12)), d2Var);
                                    break;
                                }
                            } else {
                                int i18 = 3;
                                if (num.intValue() == 8) {
                                    d2 d2Var2 = new d2();
                                    d2Var2.a = true;
                                    f2 T2 = LaunchActivity.T();
                                    if (T2 != null) {
                                        T2.showAsSheet(new z0(t3Var != null ? new org.telegram.ui.a0(g4Var, i17) : null, new org.telegram.ui.q(g4Var, i18)), d2Var2);
                                        break;
                                    }
                                } else if (num.intValue() == 9) {
                                    if (g4Var.u0[0].getWebView() != null) {
                                        g4Var.u0[0].getWebView().goForward();
                                        break;
                                    }
                                } else if (num.intValue() != 3) {
                                    int i19 = 4;
                                    if (num.intValue() == 4) {
                                        if (g4Var.u0[0].f()) {
                                            f2 T3 = LaunchActivity.T();
                                            if (T3 != null) {
                                                d2 d2Var3 = new d2();
                                                d2Var3.a = true;
                                                T3.showAsSheet(new o1(new org.telegram.ui.q(g4Var, i18)), d2Var3);
                                                break;
                                            }
                                        } else {
                                            v2 h = org.telegram.messenger.camera.q.h(g4Var.L, false, 1, null);
                                            h.u0 = false;
                                            LinearLayout linearLayout = new LinearLayout(g4Var.L);
                                            linearLayout.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
                                            linearLayout.setOrientation(1);
                                            n4 n4Var = new n4(g4Var.L, (org.telegram.ui.ActionBar.f6) null);
                                            n4Var.setText(id.M0(2131750610, null));
                                            linearLayout.addView(n4Var, ha.t(-2, -2, 51, 3, 1, 3, 0));
                                            linearLayout.addView(new c4(g4Var, g4Var.L), ha.t(-1, -2, 51, 3, 0, 3, 0));
                                            n4 n4Var2 = new n4(g4Var.L, (org.telegram.ui.ActionBar.f6) null);
                                            n4Var2.setText(id.M0(2131750605, null));
                                            linearLayout.addView(n4Var2, ha.t(-2, -2, 51, 3, 4, 3, 2));
                                            int i20 = 0;
                                            while (i20 < i12) {
                                                Activity activity2 = g4Var.L;
                                                org.telegram.ui.k0 k0Var = new org.telegram.ui.k0((Context) activity2, (int) (true ? 1 : 0));
                                                int i21 = k6.i6;
                                                org.telegram.ui.Cells.y h02 = k6.h0(k6.x0(null, i21, false), i12, -1);
                                                n6 N = r6.N(i21);
                                                k0Var.setBackground(h02);
                                                r6.k(k0Var, h02, null, N, null);
                                                RadioButton radioButton = new RadioButton(activity2);
                                                k0Var.b = radioButton;
                                                radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                                                r6.P(radioButton, k6.D5, k6.E5, null);
                                                boolean z13 = id.a0;
                                                k0Var.addView(radioButton, ha.d(22, 22.0f, (z13 ? 5 : 3) | 48, z13 ? 0 : 22, 13.0f, z13 ? 22 : 0, 0.0f));
                                                TextView textView = new TextView(activity2);
                                                r6.V(textView, k6.G6, null);
                                                org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                                                textView.setSingleLine(true);
                                                textView.setGravity((id.a0 ? 5 : 3) | 16);
                                                boolean z14 = id.a0;
                                                k0Var.addView(textView, ha.d(-1, -1.0f, (z14 ? 5 : 3) | 48, z14 ? 17 : 62, 0.0f, z14 ? 62 : 17, 0.0f));
                                                k0VarArr[i20] = k0Var;
                                                if (i20 == 0) {
                                                    String M0 = id.M0(2131751601, null);
                                                    Typeface typeface = Typeface.DEFAULT;
                                                    textView.setText(M0);
                                                    textView.setTypeface(typeface);
                                                    k0Var.setContentDescription(M0);
                                                    k0Var.invalidate();
                                                } else if (i20 == 1) {
                                                    Typeface typeface2 = Typeface.SERIF;
                                                    textView.setText("Serif");
                                                    textView.setTypeface(typeface2);
                                                    k0Var.setContentDescription("Serif");
                                                    k0Var.invalidate();
                                                }
                                                ((RadioButton) k0VarArr[i20].b).a(i20 == g4Var.a, false);
                                                k0VarArr[i20].setTag(Integer.valueOf(i20));
                                                k0VarArr[i20].setOnClickListener(new org.telegram.ui.r(g4Var, i19));
                                                linearLayout.addView(k0VarArr[i20], ha.o(-1, 50));
                                                i20++;
                                                i12 = 2;
                                            }
                                            h.N = linearLayout;
                                            g4Var.I = h;
                                            g4Var.Y(h);
                                            break;
                                        }
                                    } else if (num.intValue() != 5) {
                                        if (num.intValue() == 10 && (u1Var = g4Var.u0[0].E) != null && u1Var.b() != null) {
                                            g4Var.f(u1Var.b(), null, 1);
                                            break;
                                        }
                                    } else if (g4Var.u0[0].f() && g4Var.u0[0].getWebView() != null) {
                                        g4Var.u0[0].getWebView().reload();
                                        break;
                                    }
                                } else {
                                    if (!g4Var.u0[0].f()) {
                                        TLRPC.WebPage webPage3 = g4Var.u0[0].c.E;
                                        if (webPage3 != null) {
                                            String str8 = webPage3.url;
                                            TL_iv.Page page = webPage3.cached_page;
                                            if (page != null) {
                                                file = page.local;
                                                str = str8;
                                                str2 = null;
                                            } else {
                                                str = str8;
                                                str2 = null;
                                                file = null;
                                            }
                                        }
                                    } else if (g4Var.u0[0].getWebView() != null) {
                                        str = g4Var.u0[0].getWebView().getUrl();
                                        str2 = g4Var.u0[0].getWebView().getOpenURL();
                                        file = null;
                                    }
                                    Activity activity3 = g4Var.L;
                                    if (activity3 != null && !activity3.isFinishing()) {
                                        if (file != null) {
                                            String D = w7.D(file);
                                            Pattern pattern = n80.a;
                                            org.telegram.messenger.g0.t2(file, null, ("diff".equalsIgnoreCase(D) || "patch".equalsIgnoreCase(D)) ? "text/x-diff" : "text/markdown", g4Var.L, null, true);
                                            break;
                                        } else if (str != null) {
                                            String K0 = org.telegram.messenger.g0.K0(str2, true);
                                            String K02 = org.telegram.messenger.g0.K0(str, true);
                                            org.telegram.ui.x xVar = new org.telegram.ui.x(g4Var, str, true ? 1 : 0);
                                            org.telegram.ui.y yVar = new org.telegram.ui.y(g4Var, K02, K0, true ? 1 : 0);
                                            if (!g4Var.u0[0].f() || !qp.s1(g4Var.X).N2(K02) || qp.s1(g4Var.X).L2(true)) {
                                                xVar.run();
                                                break;
                                            } else {
                                                v4.l0(activity, null, str, true, new p5(i13, yVar, xVar));
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 5:
                org.telegram.ui.k3 k3Var3 = (org.telegram.ui.k3) obj3;
                Activity activity4 = (Activity) obj2;
                String str9 = (String) obj;
                if (!TextUtils.isEmpty(str9) && k3Var3.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str9.trim());
                    org.telegram.messenger.g0.c(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i22 = 0;
                    for (int i23 = 0; i23 < uRLSpanArr.length; i23++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i23]), length);
                        i22 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i23]), i22);
                    }
                    Pattern pattern2 = Utilities.a;
                    try {
                        uri = Uri.parse(str9);
                    } catch (Exception unused) {
                        uri = null;
                    }
                    if (uri == null || !TextUtils.equals(uri.getScheme(), "javascript")) {
                        if ((uRLSpanArr.length <= 0 || length != 0 || i22 <= 0) && (uri == null || uri.getScheme() == null)) {
                            org.telegram.ui.web.j.b(activity4, str9);
                            u0 webView = k3Var3.getWebView();
                            String str10 = f1.a().b;
                            if (str10 != null) {
                                StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str10);
                                m10.append(URLEncoder.encode(str9));
                                str5 = m10.toString();
                            }
                            webView.loadUrl(str5);
                            break;
                        } else {
                            if (uri != null && uri.getScheme() == null && uri.getHost() == null && uri.getPath() != null) {
                                str9 = vf.c.w(uri, "https", null, uri.getEncodedPath(), "/");
                            }
                            k3Var3.getWebView().loadUrl(str9);
                            break;
                        }
                    }
                }
                break;
            case 6:
                rc rcVar = (rc) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                rcVar.c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i24 = tL_premium_boostsStatus.level;
                    rcVar.b = i24;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i24;
                    }
                }
                rcVar.e1(true);
                fi.d dVar = rcVar.P;
                if (dVar != null) {
                    dVar.setLoading(false);
                    break;
                }
                break;
            case 7:
                ic icVar = (ic) obj3;
                gp gpVar = (gp) obj2;
                View view = (View) obj;
                if (view instanceof hc) {
                    hc hcVar = (hc) view;
                    hcVar.setBackgroundColor(k6.w0(k6.d6, icVar.a));
                    icVar.b.getClass();
                    int R = RecyclerView.R(view);
                    if (gpVar != null) {
                        ArrayList arrayList = gpVar.c;
                        if (R >= 0 && R < arrayList.size()) {
                            hcVar.a((fp) arrayList.get(R));
                        }
                    }
                    view.invalidate();
                    break;
                }
                break;
            case 8:
                ug.i0 i0Var = (ug.i0) obj2;
                i0Var.A1((e3) obj);
                ((zd) obj3).m0.showDialog(i0Var);
                break;
            case 9:
                an anVar2 = (an) obj3;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = anVar2.getMessagesController().j1(anVar2.j6);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((s1) obj2).a;
                anVar2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                qj qjVar2 = anVar2.Z;
                if (qjVar2 != null) {
                    qjVar2.setFieldText(null);
                    break;
                }
                break;
            case 10:
                an anVar3 = (an) obj3;
                ez b10 = ez.b((String) obj2, anVar3.j6, anVar3.D5, anVar3.l4, null, false, null, null, null, true, 0, 0, null, false);
                b10.K = anVar3.W8();
                b10.Q = ((Long) obj).longValue();
                b10.R = anVar3.h9();
                b10.T = anVar3.w5;
                anVar3.getSendMessagesHelper().r0(b10);
                anVar3.Z.setFieldText("");
                anVar3.B9(false);
                break;
            case 11:
                an anVar4 = (an) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l10 = (Long) obj;
                if (anVar4.f4 == 1) {
                    v4.J(anVar4.getParentActivity(), anVar4.j6, new a7(anVar4, botInlineResult, l10, i12), anVar4.xa);
                    break;
                } else {
                    anVar4.Db(botInlineResult, true, 0, l10.longValue());
                    break;
                }
            case 12:
                ((an) obj3).Fb = true;
                ((qf) obj2).run();
                break;
            case 13:
                an.g0((an) obj3, (sy0[]) obj2, (k60) obj);
                break;
            case 14:
                an anVar5 = (an) obj3;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    u1VarArr[0].dismiss();
                } catch (Throwable unused2) {
                }
                u1VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        k5.o(null, 2131747158, org.telegram.ui.Components.hc.a0(anVar5), R.raw.timer_toast, 24);
                        break;
                    } else {
                        new vh.h(anVar5.getParentActivity(), anVar5.xa, tL_statsPollStats).show();
                        break;
                    }
                }
                break;
            case 15:
                an anVar6 = (an) obj3;
                ij ijVar = (ij) obj2;
                anVar6.getClass();
                TLRPC.SuggestedPost c10 = ((nj) obj).c();
                if (ijVar != null && ijVar.k != null) {
                    anVar6.getMessagesController().h(ijVar, c10);
                    break;
                }
                break;
            case 16:
                s1 s1Var = (s1) obj2;
                String str11 = (String) obj;
                an anVar7 = ((si) obj3).b;
                if (s1Var != null) {
                    i10 = ((f2) anVar7).currentAccount;
                    t1.f(i10).k(s1Var.a, str11);
                }
                anVar7.e4 = str11;
                anVar7.o1.setTitle(str11);
                break;
            case 17:
                ij ijVar2 = (ij) obj2;
                Long l11 = (Long) obj;
                an anVar8 = ((lm) obj3).a;
                if (anVar8.t7()) {
                    ez b11 = ez.b(ijVar2.C0(), anVar8.j6, anVar8.D5, anVar8.l4, null, false, null, null, null, true, 0, 0, null, false);
                    b11.K = anVar8.W8();
                    b11.W = l11.longValue();
                    anVar8.getSendMessagesHelper().r0(b11);
                    break;
                }
                break;
            case 18:
                q1 q1Var = (q1) obj2;
                an anVar9 = ((lm) obj3).a;
                if (((Boolean) obj).booleanValue()) {
                    for (int i25 = 0; i25 < anVar9.z0.getChildCount(); i25++) {
                        View childAt = anVar9.z0.getChildAt(i25);
                        if (childAt instanceof q1) {
                            q1 q1Var2 = (q1) childAt;
                            if (q1Var2.getMessageObject() != null && q1Var2.getMessageObject().q4()) {
                                q1Var2.H3();
                            }
                        }
                    }
                    break;
                } else {
                    if (q1Var.getMessageObject() != null) {
                        q1Var.getMessageObject().r2 = Boolean.FALSE;
                    }
                    q1Var.H3();
                    break;
                }
                break;
            case 19:
                lm lmVar = (lm) obj3;
                k kVar = (k) obj2;
                an anVar10 = lmVar.a;
                if (((Boolean) obj).booleanValue()) {
                    anVar10.getMessagesController().F4(true);
                    org.telegram.ui.Components.hc.a0(anVar10).P(R.raw.chats_infotip, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(id.M0(2131745577, null), new tl(lmVar, i13)), true)).k(true);
                    kVar.a(Boolean.TRUE);
                    break;
                } else {
                    org.telegram.ui.Components.hc.a0(anVar10).I(R.raw.error, id.M0(2131754311, null), id.M0(2131754312, null)).j();
                    break;
                }
            case 20:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((lm) obj3).a.getMessagesController().v(message.id, -1, m5.o(message.peer_id), (String) obj, true);
                break;
            case 21:
                dn dnVar = (dn) obj3;
                dnVar.f.s(((TLRPC.WallPaper) obj2).settings.intensity, ((gg.a) obj).a);
                View view2 = dnVar.b;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 22:
                Long l12 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((we) obj3).a;
                long j3 = chatActivityEnterView.Q2;
                ij ijVar3 = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                ez b12 = ez.b((String) obj2, j3, ijVar3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                an anVar11 = chatActivityEnterView.P2;
                b12.K = anVar11 != null ? anVar11.W8() : null;
                b12.O = chatActivityEnterView.S4;
                b12.Q = l12.longValue();
                b12.R = chatActivityEnterView.getSendMonoForumPeerId();
                b12.T = chatActivityEnterView.getSendMessageSuggestionParams();
                gz.C(chatActivityEnterView.Q).r0(b12);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                ge geVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                geVar.setEffect(0L);
                break;
            case 23:
                di diVar = (di) obj3;
                wh whVar = (wh) obj2;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i26 = diVar.D3;
                tL_messages_toggleBotInAttachMenu.bot = qp.s1(i26).o1(whVar.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i26).sendRequest(tL_messages_toggleBotInAttachMenu, new ld(12, diVar, whVar), 66);
                break;
            case 24:
                di diVar2 = (di) obj3;
                ((an) obj2).w5 = (nj) obj;
                boolean u12 = diVar2.u1(true, 0, 0, diVar2.H2, diVar2.f1());
                ue ueVar = diVar2.Y1;
                if (ueVar != null) {
                    ueVar.g(!u12);
                    diVar2.Y1 = null;
                    break;
                }
                break;
            case 25:
                ((hi.c4) obj3).getWebViewContainer().G((String) obj2, (String) obj, false);
                break;
            case 26:
                ni niVar = (ni) obj3;
                qp qpVar = (qp) obj2;
                Long l13 = (Long) obj;
                niVar.i0 = false;
                TLRPC.User a22 = l13 != null ? qpVar.a2(l13) : null;
                niVar.h0 = a22;
                niVar.j0 = a22 == null;
                if (a22 != null) {
                    niVar.S();
                    break;
                }
                break;
            case 27:
                pu puVar = (pu) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    org.telegram.messenger.g0.h3(new ou(puVar, true ? 1 : 0));
                    break;
                }
                break;
            case 28:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                fq fqVar = (fq) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                fqVar.run();
                break;
            default:
                gx gxVar = (gx) obj3;
                hx hxVar = gxVar.a;
                hy hyVar = hxVar.F;
                ui.b0(hyVar.c1).V(hyVar.W0, hxVar.w, false, new hr((Object) gxVar, obj2, obj, (int) (true ? 1 : 0)), iz.F || p10.i(hyVar.c1).q(), false, true, false, 25);
                break;
        }
    }
}
