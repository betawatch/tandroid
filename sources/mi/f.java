package mi;

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
import b8.kg;
import b8.mf;
import gi.g6;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ej;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.u10;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.messenger.w7;
import org.telegram.messenger.wo;
import org.telegram.messenger.wy;
import org.telegram.messenger.xo;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ee;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.ue;
import org.telegram.ui.Components.uh;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b7;
import org.telegram.ui.fc;
import org.telegram.ui.gc;
import org.telegram.ui.hm;
import org.telegram.ui.iy0;
import org.telegram.ui.mj;
import org.telegram.ui.oi;
import org.telegram.ui.pc;
import org.telegram.ui.pl;
import org.telegram.ui.sc;
import org.telegram.ui.wm;
import org.telegram.ui.xd;
import org.telegram.ui.zm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        r a10;
        int i3;
        float f10;
        wm wmVar;
        mj mjVar;
        org.telegram.ui.web.s1 s1Var;
        String str;
        String str2;
        File file;
        String str3;
        FrameLayout frameLayout;
        String str4;
        Uri uri;
        int i10;
        zi threadMessage;
        int i11 = this.a;
        int i12 = 8;
        int i13 = 4;
        int i14 = 2;
        String str5 = null;
        boolean z10 = true;
        boolean z11 = true;
        boolean z12 = true;
        int i15 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str6 = (String) obj;
                t3 t3Var = ((p) obj3).r;
                if (pageblockmath == null) {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str6;
                    t3Var.V1(pageblockmath2);
                    break;
                } else {
                    pageblockmath.source = str6;
                    t3Var.g3.O(false);
                    break;
                }
            case 1:
                h1 h1Var = (h1) obj3;
                r rVar = (r) obj2;
                String str7 = (String) obj;
                h1Var.getClass();
                if (!TextUtils.isEmpty(str7)) {
                    Editable text = h1Var.getText();
                    int spanStart = text.getSpanStart(rVar);
                    int spanEnd = text.getSpanEnd(rVar);
                    if (spanStart >= 0 && spanEnd >= 0 && (a10 = r.a(str7, h1Var.getCurrentTextColor(), org.telegram.messenger.g0.L(az.W0 + 4))) != null) {
                        boolean z13 = h1Var.h2;
                        if (z13) {
                            h1Var.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a10, 0, 1, 33);
                        int max = Math.max(0, Math.min(spanStart, h1Var.length()));
                        text.replace(max, Math.max(max, Math.min(spanEnd, h1Var.length())), spannableString);
                        h1Var.setSelection(Math.min(max + 1, h1Var.length()));
                        if (z13) {
                            h1Var.setLocked(true);
                            break;
                        }
                    }
                }
                break;
            case 2:
                c2 c2Var = (c2) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str8 = (String) obj;
                c2Var.getClass();
                if (pageblockmath3 == null) {
                    TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                    pageblockmath4.source = str8;
                    c2Var.Q.V1(pageblockmath4);
                    break;
                } else {
                    pageblockmath3.source = str8;
                    c2Var.Q.g3.O(false);
                    break;
                }
            case 3:
                t3 t3Var2 = (t3) obj3;
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                String str9 = (String) obj;
                t3Var2.getClass();
                if (!TextUtils.equals(str9, pageblockmath5.source)) {
                    g2 g2Var = t3Var2.R3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    pageblockmath5.source = str9;
                    t3Var2.g3.O(false);
                    g2 g2Var2 = t3Var2.R3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                    t3Var2.p3.onContentChanged();
                    break;
                }
                break;
            case 4:
                ((VoIPDebugToSend) obj3).lambda$done$0((TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                break;
            case 5:
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) obj3;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                if (d2Var != null) {
                    if ((d2Var instanceof wm) && (mjVar = (wmVar = (wm) d2Var).a0) != null) {
                        mjVar.L();
                        wmVar.a0.k0(true, false, true);
                    }
                    if (d2Var.getContext() != null && d2Var.getParentActivity() != null) {
                        ii.a3 a3Var2 = new ii.a3(d2Var.getContext(), d2Var.getResourceProvider());
                        a3Var2.m0 = d2Var.getParentActivity();
                        if (a3Var != null && a3Var.a != null) {
                            a3Var2.G0 = true;
                            boolean z14 = a3Var.o;
                            a3Var2.X = z14;
                            if (z14) {
                                a3Var2.A(a3Var.r, false);
                            }
                            if (a3Var.n) {
                                i3 = a3Var.q;
                            } else {
                                int i16 = a3Var.p;
                                if (i16 < 0) {
                                    i16 = k6.d6;
                                }
                                i3 = k6.w0(i16, a3Var2.G);
                            }
                            a3Var2.y(i3, a3Var.n, false);
                            a3Var2.D(a3Var.s, false);
                            a3Var2.H0 = a3Var.j;
                            a3Var2.I0 = a3Var.k;
                            boolean z15 = a3Var.u;
                            a3Var2.y0 = z15;
                            ii.s2 s2Var = a3Var2.E;
                            s2Var.setIsBackButtonVisible(z15);
                            a3Var2.x.setAllowSwipes(a3Var.l);
                            org.telegram.messenger.g0.R3(a3Var2.Y.getBackButton(), a3Var2.y0 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
                            org.telegram.messenger.h2 h2Var = a3Var2.o0;
                            if (h2Var != null) {
                                boolean z16 = a3Var2.y0;
                                h2Var.L = z16;
                                h2Var.M.d(z16);
                                h2Var.invalidate();
                            }
                            a3Var2.t0 = a3Var.y;
                            a3Var2.B0 = Boolean.valueOf(a3Var.B);
                            a3Var2.C0 = a3Var.C;
                            ii.w0 w0Var = a3Var.K;
                            a3Var2.D0 = w0Var;
                            if (w0Var != null) {
                                ii.u0 u0Var = w0Var.r;
                                SensorManager sensorManager = w0Var.a;
                                f10 = 0.721f;
                                if (w0Var.l) {
                                    w0Var.l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = w0Var.b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(w0Var.n, sensor, ii.w0.a(w0Var.c));
                                        }
                                        Sensor sensor2 = w0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(w0Var.p, sensor2, ii.w0.a(w0Var.e));
                                        }
                                        Sensor sensor3 = w0Var.g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(u0Var, sensor3, ii.w0.a(w0Var.h));
                                        }
                                        Sensor sensor4 = w0Var.f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(u0Var, sensor4, ii.w0.a(w0Var.h));
                                        }
                                        Sensor sensor5 = w0Var.i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(w0Var.t, sensor5, ii.w0.a(w0Var.j));
                                        }
                                    }
                                }
                            } else {
                                f10 = 0.721f;
                            }
                            kg kgVar = a3Var.w;
                            if (kgVar != null) {
                                ii.w2 w2Var = a3Var2.n0;
                                int totalHeight = w2Var.getTotalHeight();
                                w2Var.e = kgVar;
                                ii.t[] tVarArr = w2Var.f;
                                ii.v.b(tVarArr[0].l, (ii.u) kgVar.c, false);
                                ii.v.b(tVarArr[1].l, (ii.u) kgVar.d, false);
                                w2Var.invalidate();
                                if (totalHeight != w2Var.getTotalHeight() && w2Var.r != null) {
                                    if (totalHeight < w2Var.getTotalHeight()) {
                                        org.telegram.messenger.g0.i3(w2Var.r, 200L);
                                    } else {
                                        w2Var.r.run();
                                    }
                                }
                                int i17 = kgVar.b;
                                Paint paint = w2Var.a;
                                w2Var.e.b = i17;
                                paint.setColor(i17);
                                w2Var.d.a(i17, true);
                            }
                            a3Var2.C(a3Var.z, false, a3Var.A);
                            ii.q4 q4Var = a3Var.a;
                            a3Var2.I = q4Var != null ? q4Var.a : h10.t0;
                            org.telegram.ui.web.t0 t0Var = a3Var.b;
                            if (t0Var != null) {
                                t0Var.onResume();
                                s2Var.N(a3Var2.I, a3Var.b, a3Var.d, a3Var.f, a3Var.e);
                                boolean z17 = a3Var.t || a3Var.b.b;
                                String str10 = a3Var.x;
                                s2Var.g("setState(" + z17 + ", " + str10 + ")");
                                s2Var.O = z17;
                                s2Var.b = str10;
                                if (k6.I.q() != a3Var.D) {
                                    s2Var.z();
                                }
                            } else {
                                q4Var.q = null;
                                q4Var.r = 0L;
                            }
                            a3Var2.x(d2Var, a3Var.a);
                            a3Var2.d0 = a3Var.v;
                            if (a3Var.G) {
                                a3Var2.X0 = true;
                                a3Var2.m();
                                org.telegram.ui.c3 c3Var = a3Var2.Z0;
                                String p10 = a3Var2.q() ? a3Var2.x0.e : l10.p(hp.s1(a3Var2.I).a2(Long.valueOf(a3Var2.J)));
                                String str11 = a3Var.H;
                                a3Var2.Y0 = str11;
                                c3Var.a(p10, str11);
                                org.telegram.ui.c3 c3Var2 = a3Var2.Z0;
                                Paint paint2 = a3Var2.R;
                                c3Var2.b(org.telegram.messenger.g0.B(paint2.getColor()) <= f10, false);
                                a3Var2.Z0.setBackgroundColor(paint2.getColor());
                                a3Var2.Z0.setVisibility(0);
                                a3Var2.Z0.setAlpha(1.0f);
                            }
                            a3Var2.t(a3Var.L);
                            b3Var.h(b3Var.x, a3Var, false);
                            a3Var2.show();
                            break;
                        }
                    }
                }
                break;
            case 6:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) obj2;
                ((org.telegram.ui.ActionBar.a3) obj3).m = (Bitmap) obj;
                g3Var.d().setDrawingFromOverlay(false);
                g3Var.release();
                break;
            case 7:
                org.telegram.ui.ActionBar.i3 i3Var = (org.telegram.ui.ActionBar.i3) obj2;
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) ((g6) obj3).q;
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
            case 8:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) obj3;
                Activity activity = (Activity) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.u3 u3Var = i4Var.L;
                org.telegram.ui.l0[] l0VarArr = i4Var.U0;
                if ((!i4Var.v0[0].c() || i4Var.v0[0].c.F != null) && i4Var.M != null) {
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
                                                        if (num.intValue() == 10 && (s1Var = i4Var.v0[0].F) != null && s1Var.b() != null) {
                                                            i4Var.f(s1Var.b(), null, 1);
                                                            break;
                                                        }
                                                    } else if (i4Var.v0[0].f() && i4Var.v0[0].getWebView() != null) {
                                                        i4Var.v0[0].getWebView().reload();
                                                        break;
                                                    }
                                                } else if (!i4Var.v0[0].f()) {
                                                    org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(i4Var.M, false, 1, null);
                                                    h.v0 = false;
                                                    LinearLayout linearLayout = new LinearLayout(i4Var.M);
                                                    linearLayout.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
                                                    linearLayout.setOrientation(1);
                                                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(i4Var.M, (org.telegram.ui.ActionBar.e6) null);
                                                    n4Var.setText(bd.M0(2131750610, null));
                                                    linearLayout.addView(n4Var, mf.t(-2, -2, 51, 3, 1, 3, 0));
                                                    linearLayout.addView(new org.telegram.ui.d4(i4Var, i4Var.M), mf.t(-1, -2, 51, 3, 0, 3, 0));
                                                    org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(i4Var.M, (org.telegram.ui.ActionBar.e6) null);
                                                    n4Var2.setText(bd.M0(2131750605, null));
                                                    linearLayout.addView(n4Var2, mf.t(-2, -2, 51, 3, 4, 3, 2));
                                                    int i22 = 0;
                                                    while (i22 < i14) {
                                                        Activity activity2 = i4Var.M;
                                                        org.telegram.ui.l0 l0Var = new org.telegram.ui.l0((Context) activity2, (int) (z10 ? 1 : 0));
                                                        int i23 = k6.i6;
                                                        org.telegram.ui.Cells.y h02 = k6.h0(k6.x0(null, i23, false), i14, -1);
                                                        n6 N = r6.N(i23);
                                                        l0Var.setBackground(h02);
                                                        r6.k(l0Var, h02, null, N, null);
                                                        RadioButton radioButton = new RadioButton(activity2);
                                                        l0Var.b = radioButton;
                                                        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                                                        r6.P(radioButton, k6.D5, k6.E5, null);
                                                        boolean z18 = bd.a0;
                                                        l0Var.addView(radioButton, mf.d(22, 22.0f, (z18 ? 5 : 3) | 48, z18 ? 0 : 22, 13.0f, z18 ? 22 : 0, 0.0f));
                                                        TextView textView = new TextView(activity2);
                                                        r6.V(textView, k6.G6, null);
                                                        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                                                        textView.setSingleLine(true);
                                                        textView.setGravity((bd.a0 ? 5 : 3) | 16);
                                                        boolean z19 = bd.a0;
                                                        l0Var.addView(textView, mf.d(-1, -1.0f, (z19 ? 5 : 3) | 48, z19 ? 17 : 62, 0.0f, z19 ? 62 : 17, 0.0f));
                                                        l0VarArr[i22] = l0Var;
                                                        if (i22 == 0) {
                                                            String M0 = bd.M0(2131751601, null);
                                                            Typeface typeface = Typeface.DEFAULT;
                                                            textView.setText(M0);
                                                            textView.setTypeface(typeface);
                                                            l0Var.setContentDescription(M0);
                                                            l0Var.invalidate();
                                                        } else if (i22 == 1) {
                                                            Typeface typeface2 = Typeface.SERIF;
                                                            textView.setText("Serif");
                                                            textView.setTypeface(typeface2);
                                                            l0Var.setContentDescription("Serif");
                                                            l0Var.invalidate();
                                                        }
                                                        ((RadioButton) l0VarArr[i22].b).a(i22 == i4Var.a, false);
                                                        l0VarArr[i22].setTag(Integer.valueOf(i22));
                                                        l0VarArr[i22].setOnClickListener(new org.telegram.ui.r(i4Var, i13));
                                                        linearLayout.addView(l0VarArr[i22], mf.o(-1, 50));
                                                        i22++;
                                                        i14 = 2;
                                                    }
                                                    h.O = linearLayout;
                                                    i4Var.J = h;
                                                    i4Var.Y(h);
                                                    break;
                                                } else {
                                                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                                    if (T != null) {
                                                        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
                                                        b2Var.a = true;
                                                        T.showAsSheet(new org.telegram.ui.web.m1(new org.telegram.ui.q(i4Var, i20)), b2Var);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                if (!i4Var.v0[0].f()) {
                                                    TLRPC.WebPage webPage = i4Var.v0[0].c.F;
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
                                                } else if (i4Var.v0[0].getWebView() != null) {
                                                    str = i4Var.v0[0].getWebView().getUrl();
                                                    str2 = i4Var.v0[0].getWebView().getOpenURL();
                                                    file = null;
                                                }
                                                Activity activity3 = i4Var.M;
                                                if (activity3 != null && !activity3.isFinishing()) {
                                                    if (file == null) {
                                                        if (str != null) {
                                                            String K0 = org.telegram.messenger.g0.K0(str2, true);
                                                            String K02 = org.telegram.messenger.g0.K0(str, true);
                                                            org.telegram.ui.y yVar = new org.telegram.ui.y(i4Var, str, z12 ? 1 : 0);
                                                            org.telegram.ui.z zVar = new org.telegram.ui.z(i4Var, K02, K0, z11 ? 1 : 0);
                                                            if (!i4Var.v0[0].f() || !hp.s1(i4Var.Y).N2(K02) || hp.s1(i4Var.Y).L2(true)) {
                                                                yVar.run();
                                                                break;
                                                            } else {
                                                                org.telegram.ui.Components.t4.n0(activity, null, str, true, new ai.q4(i21, zVar, yVar));
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        String D = w7.D(file);
                                                        Pattern pattern = k80.a;
                                                        org.telegram.messenger.g0.t2(file, null, ("diff".equalsIgnoreCase(D) || "patch".equalsIgnoreCase(D)) ? "text/x-diff" : "text/markdown", i4Var.M, null, true);
                                                        break;
                                                    }
                                                }
                                            }
                                        } else if (i4Var.v0[0].getWebView() != null) {
                                            i4Var.v0[0].getWebView().goForward();
                                            break;
                                        }
                                    } else {
                                        org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2();
                                        b2Var2.a = true;
                                        org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                                        if (T2 != null) {
                                            T2.showAsSheet(new org.telegram.ui.web.y0(u3Var != null ? new org.telegram.ui.b0(i4Var, i19) : null, new org.telegram.ui.q(i4Var, i20)), b2Var2);
                                            break;
                                        }
                                    }
                                } else {
                                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2();
                                    b2Var3.a = true;
                                    org.telegram.ui.ActionBar.d2 T3 = LaunchActivity.T();
                                    if (T3 != null) {
                                        T3.showAsSheet(new org.telegram.ui.web.n(u3Var != null ? new org.telegram.ui.b0(i4Var, i18) : null, new org.telegram.ui.q(i4Var, i14)), b2Var3);
                                        break;
                                    }
                                }
                            } else {
                                if (!i4Var.v0[0].f()) {
                                    org.telegram.ui.l3 l3Var = i4Var.v0[0];
                                    TLRPC.WebPage webPage2 = l3Var.c.F;
                                    if (webPage2 != null) {
                                        str3 = webPage2.url;
                                        frameLayout = l3Var;
                                    }
                                } else if (i4Var.v0[0].getWebView() != null) {
                                    str3 = i4Var.v0[0].getWebView().getUrl();
                                    frameLayout = i4Var.v0[0].f;
                                }
                                org.telegram.ui.i4.d(str3, i4Var.Y, frameLayout, u3Var, null);
                                break;
                            }
                        } else {
                            if (!i4Var.v0[0].f()) {
                                TLRPC.WebPage webPage3 = i4Var.v0[0].c.F;
                                if (webPage3 != null) {
                                    str4 = webPage3.url;
                                }
                            } else if (i4Var.v0[0].getWebView() != null) {
                                str4 = i4Var.v0[0].getWebView().getUrl();
                            }
                            String u10 = org.telegram.ui.web.w0.u(str4);
                            i4Var.Y(new oo0(i4Var.M, null, u10, false, u10, false, org.telegram.messenger.g0.B(i4Var.i0.getBackgroundColor()) < 0.721f ? new ei.b() : null));
                            break;
                        }
                    } else {
                        org.telegram.ui.m0 m0Var = i4Var.i0;
                        int L = org.telegram.messenger.g0.L(56.0f);
                        i4Var.K0 = L;
                        m0Var.setHeight(L);
                        i4Var.i0.h(true);
                        break;
                    }
                }
                break;
            case 9:
                org.telegram.ui.l3 l3Var2 = (org.telegram.ui.l3) obj3;
                Activity activity4 = (Activity) obj2;
                String str13 = (String) obj;
                if (!TextUtils.isEmpty(str13) && l3Var2.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str13.trim());
                    org.telegram.messenger.g0.c(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i24 = 0;
                    while (i15 < uRLSpanArr.length) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i15]), length);
                        i24 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i15]), i24);
                        i15++;
                    }
                    Pattern pattern2 = Utilities.a;
                    try {
                        uri = Uri.parse(str13);
                    } catch (Exception unused) {
                        uri = null;
                    }
                    if (uri == null || !TextUtils.equals(uri.getScheme(), "javascript")) {
                        if ((uRLSpanArr.length > 0 && length == 0 && i24 > 0) || (uri != null && uri.getScheme() != null)) {
                            if (uri != null && uri.getScheme() == null && uri.getHost() == null && uri.getPath() != null) {
                                str13 = sf.c.w(uri, "https", null, uri.getEncodedPath(), "/");
                            }
                            l3Var2.getWebView().loadUrl(str13);
                            break;
                        } else {
                            org.telegram.ui.web.l.b(activity4, str13);
                            org.telegram.ui.web.t0 webView = l3Var2.getWebView();
                            String str14 = org.telegram.ui.web.d1.a().b;
                            if (str14 != null) {
                                StringBuilder l10 = com.google.android.recaptcha.internal.a.l(str14);
                                l10.append(URLEncoder.encode(str13));
                                str5 = l10.toString();
                            }
                            webView.loadUrl(str5);
                            break;
                        }
                    }
                }
                break;
            case 10:
                pc pcVar = (pc) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                pcVar.c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i25 = tL_premium_boostsStatus.level;
                    pcVar.b = i25;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i25;
                    }
                }
                pcVar.e1(true);
                gi.d dVar = pcVar.Q;
                if (dVar != null) {
                    dVar.setLoading(false);
                    break;
                }
                break;
            case 11:
                gc gcVar = (gc) obj3;
                xo xoVar = (xo) obj2;
                View view = (View) obj;
                if (view instanceof fc) {
                    fc fcVar = (fc) view;
                    fcVar.setBackgroundColor(k6.w0(k6.d6, gcVar.a));
                    gcVar.b.getClass();
                    int R = RecyclerView.R(view);
                    if (xoVar != null) {
                        ArrayList arrayList = xoVar.c;
                        if (R >= 0 && R < arrayList.size()) {
                            fcVar.a((wo) arrayList.get(R));
                        }
                    }
                    view.invalidate();
                    break;
                }
                break;
            case 12:
                vg.i0 i0Var = (vg.i0) obj2;
                i0Var.A1((org.telegram.messenger.e3) obj);
                ((xd) obj3).n0.showDialog(i0Var);
                break;
            case 13:
                wm wmVar2 = (wm) obj3;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = wmVar2.getMessagesController().j1(wmVar2.k6);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((lg.t1) obj2).a;
                wmVar2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                mj mjVar2 = wmVar2.a0;
                if (mjVar2 != null) {
                    mjVar2.setFieldText(null);
                    break;
                }
                break;
            case 14:
                wm wmVar3 = (wm) obj3;
                wy b10 = wy.b((String) obj2, wmVar3.k6, wmVar3.E5, wmVar3.m4, null, false, null, null, null, true, 0, 0, null, false);
                b10.K = wmVar3.W8();
                b10.Q = ((Long) obj).longValue();
                b10.R = wmVar3.h9();
                b10.T = wmVar3.x5;
                wmVar3.getSendMessagesHelper().r0(b10);
                wmVar3.a0.setFieldText("");
                wmVar3.B9(false);
                break;
            case 15:
                wm wmVar4 = (wm) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l11 = (Long) obj;
                if (wmVar4.g4 != 1) {
                    wmVar4.Db(botInlineResult, true, 0, l11.longValue());
                    break;
                } else {
                    org.telegram.ui.Components.t4.L(wmVar4.getParentActivity(), wmVar4.k6, new b7(wmVar4, botInlineResult, l11, i14), wmVar4.ya);
                    break;
                }
            case 16:
                ((wm) obj3).Gb = true;
                ((sc) obj2).run();
                break;
            case 17:
                wm.g0((wm) obj3, (iy0[]) obj2, (f60) obj);
                break;
            case 18:
                wm wmVar5 = (wm) obj3;
                org.telegram.ui.ActionBar.s1[] s1VarArr = (org.telegram.ui.ActionBar.s1[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    s1VarArr[0].dismiss();
                } catch (Throwable unused2) {
                }
                s1VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (!(tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError)) {
                        new wh.i(wmVar5.getParentActivity(), wmVar5.ya, tL_statsPollStats).show();
                        break;
                    } else {
                        org.telegram.messenger.k5.o(null, 2131747165, org.telegram.ui.Components.fc.a0(wmVar5), R.raw.timer_toast, 24);
                        break;
                    }
                }
                break;
            case 19:
                wm wmVar6 = (wm) obj3;
                zi ziVar = (zi) obj2;
                wmVar6.getClass();
                TLRPC.SuggestedPost c2 = ((ej) obj).c();
                if (ziVar != null && ziVar.k != null) {
                    wmVar6.getMessagesController().h(ziVar, c2);
                    break;
                }
                break;
            case 20:
                lg.t1 t1Var = (lg.t1) obj2;
                String str15 = (String) obj;
                wm wmVar7 = ((oi) obj3).b;
                if (t1Var != null) {
                    i10 = ((org.telegram.ui.ActionBar.d2) wmVar7).currentAccount;
                    lg.u1.f(i10).k(t1Var.a, str15);
                }
                wmVar7.f4 = str15;
                wmVar7.p1.setTitle(str15);
                break;
            case 21:
                zi ziVar2 = (zi) obj2;
                Long l12 = (Long) obj;
                wm wmVar8 = ((hm) obj3).a;
                if (wmVar8.t7()) {
                    wy b11 = wy.b(ziVar2.C0(), wmVar8.k6, wmVar8.E5, wmVar8.m4, null, false, null, null, null, true, 0, 0, null, false);
                    b11.K = wmVar8.W8();
                    b11.W = l12.longValue();
                    wmVar8.getSendMessagesHelper().r0(b11);
                    break;
                }
                break;
            case 22:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj2;
                wm wmVar9 = ((hm) obj3).a;
                if (!((Boolean) obj).booleanValue()) {
                    if (q1Var.getMessageObject() != null) {
                        q1Var.getMessageObject().r2 = Boolean.FALSE;
                    }
                    q1Var.F3();
                    break;
                } else {
                    while (i15 < wmVar9.A0.getChildCount()) {
                        View childAt = wmVar9.A0.getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                            if (q1Var2.getMessageObject() != null && q1Var2.getMessageObject().q4()) {
                                q1Var2.F3();
                            }
                        }
                        i15++;
                    }
                    break;
                }
                break;
            case 23:
                hm hmVar = (hm) obj3;
                f fVar = (f) obj2;
                wm wmVar10 = hmVar.a;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.ui.Components.fc.a0(wmVar10).I(R.raw.error, bd.M0(2131754311, null), bd.M0(2131754312, null)).j();
                    break;
                } else {
                    wmVar10.getMessagesController().F4(true);
                    org.telegram.ui.Components.fc.a0(wmVar10).P(R.raw.chats_infotip, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(bd.M0(2131745584, null), new pl(hmVar, i12)), true)).k(true);
                    fVar.a(Boolean.TRUE);
                    break;
                }
            case 24:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((hm) obj3).a.getMessagesController().v(message.id, -1, org.telegram.messenger.m5.o(message.peer_id), (String) obj, true);
                break;
            case 25:
                zm zmVar = (zm) obj3;
                zmVar.f.s(((hg.a) obj).a, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view2 = zmVar.b;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 26:
                Long l13 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((ue) obj3).a;
                long j10 = chatActivityEnterView.R2;
                zi ziVar3 = chatActivityEnterView.U2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                wy b12 = wy.b((String) obj2, j10, ziVar3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                wm wmVar11 = chatActivityEnterView.Q2;
                b12.K = wmVar11 != null ? wmVar11.W8() : null;
                b12.O = chatActivityEnterView.T4;
                b12.Q = l13.longValue();
                b12.R = chatActivityEnterView.getSendMonoForumPeerId();
                b12.T = chatActivityEnterView.getSendMessageSuggestionParams();
                yy.C(chatActivityEnterView.R).r0(b12);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.n0.c();
                ee eeVar = chatActivityEnterView.K0;
                chatActivityEnterView.T4 = 0L;
                eeVar.setEffect(0L);
                break;
            case 27:
                bi biVar = (bi) obj3;
                uh uhVar = (uh) obj2;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i26 = biVar.E3;
                tL_messages_toggleBotInAttachMenu.bot = hp.s1(i26).o1(uhVar.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i26).sendRequest(tL_messages_toggleBotInAttachMenu, new h6(15, biVar, uhVar), 66);
                break;
            case 28:
                bi biVar2 = (bi) obj3;
                ((wm) obj2).x5 = (ej) obj;
                boolean u12 = biVar2.u1(true, 0, 0, biVar2.I2, biVar2.f1());
                se seVar = biVar2.Z1;
                if (seVar != null) {
                    seVar.g(!u12);
                    biVar2.Z1 = null;
                    break;
                }
                break;
            default:
                ((ii.d4) obj3).getWebViewContainer().F((String) obj2, (String) obj, false);
                break;
        }
    }
}
