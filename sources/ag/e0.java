package ag;

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
import bi.d4;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.kp;
import org.telegram.messenger.lp;
import org.telegram.messenger.m5;
import org.telegram.messenger.o5;
import org.telegram.messenger.oj;
import org.telegram.messenger.oz;
import org.telegram.messenger.q20;
import org.telegram.messenger.qz;
import org.telegram.messenger.tz;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p3;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.q3;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.be;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.op0;
import org.telegram.ui.Components.re;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fn;
import org.telegram.ui.g01;
import org.telegram.ui.h4;
import org.telegram.ui.le;
import org.telegram.ui.mk;
import org.telegram.ui.nj;
import org.telegram.ui.pc;
import org.telegram.ui.pm;
import org.telegram.ui.qc;
import org.telegram.ui.u3;
import org.telegram.ui.un;
import org.telegram.ui.xn;
import org.telegram.ui.zc;
import w7.b6;
import xh.s3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        bi.v a2;
        int i10;
        float f7;
        un unVar;
        mk mkVar;
        org.telegram.ui.web.w1 w1Var;
        String str;
        String str2;
        File file;
        String str3;
        FrameLayout frameLayout;
        String str4;
        Uri uri;
        int i11;
        jj threadMessage;
        int i12 = this.a;
        int i13 = 8;
        int i14 = 4;
        int i15 = 2;
        String str5 = null;
        boolean z10 = true;
        boolean z11 = true;
        boolean z12 = true;
        int i16 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i12) {
            case 0:
                View view = (View) obj3;
                f0 f0Var = (f0) obj2;
                Runnable runnable = (Runnable) obj;
                if (view != null) {
                    view.requestFocus();
                }
                org.telegram.messenger.i0.v1(f0Var);
                org.telegram.messenger.i0.h3(runnable, 80L);
                break;
            case 1:
                h3 h3Var = (h3) obj2;
                i3 f10 = i3.f(d20.s0);
                bi biVar = ((h1) obj3).b;
                long a12 = biVar.a1();
                int i17 = f10.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = vp.r1(i17).i1(a12);
                tL_messages_sendQuickReplyMessages.shortcut_id = h3Var.a;
                hs a02 = hs.a0(i17);
                a02.a.c(new q0(f10, a02, h3Var, tL_messages_sendQuickReplyMessages, 1));
                biVar.dismiss();
                break;
            case 2:
                h2.a0((h2) obj2, (View) obj3, (String) obj);
                break;
            case 3:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str6 = (String) obj;
                d4 d4Var = ((bi.t) obj3).r;
                if (pageblockmath == null) {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str6;
                    d4Var.U1(pageblockmath2);
                    break;
                } else {
                    pageblockmath.source = str6;
                    d4Var.f3.O(false);
                    break;
                }
            case 4:
                bi.n1 n1Var = (bi.n1) obj3;
                bi.v vVar = (bi.v) obj2;
                String str7 = (String) obj;
                n1Var.getClass();
                if (!TextUtils.isEmpty(str7)) {
                    Editable text = n1Var.getText();
                    int spanStart = text.getSpanStart(vVar);
                    int spanEnd = text.getSpanEnd(vVar);
                    if (spanStart >= 0 && spanEnd >= 0 && (a2 = bi.v.a(str7, n1Var.getCurrentTextColor(), org.telegram.messenger.i0.L(tz.W0 + 4))) != null) {
                        boolean z13 = n1Var.g2;
                        if (z13) {
                            n1Var.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        int max = Math.max(0, Math.min(spanStart, n1Var.length()));
                        text.replace(max, Math.max(max, Math.min(spanEnd, n1Var.length())), spannableString);
                        n1Var.setSelection(Math.min(max + 1, n1Var.length()));
                        if (z13) {
                            n1Var.setLocked(true);
                            break;
                        }
                    }
                }
                break;
            case 5:
                bi.k2 k2Var = (bi.k2) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str8 = (String) obj;
                k2Var.getClass();
                if (pageblockmath3 == null) {
                    TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                    pageblockmath4.source = str8;
                    k2Var.P.U1(pageblockmath4);
                    break;
                } else {
                    pageblockmath3.source = str8;
                    k2Var.P.f3.O(false);
                    break;
                }
            case 6:
                d4 d4Var2 = (d4) obj3;
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                String str9 = (String) obj;
                d4Var2.getClass();
                if (!TextUtils.equals(str9, pageblockmath5.source)) {
                    bi.o2 o2Var = d4Var2.Q3;
                    if (o2Var != null) {
                        o2Var.d();
                    }
                    pageblockmath5.source = str9;
                    d4Var2.f3.O(false);
                    bi.o2 o2Var2 = d4Var2.Q3;
                    if (o2Var2 != null) {
                        o2Var2.h();
                    }
                    d4Var2.o3.onContentChanged();
                    break;
                }
                break;
            case 7:
                ((VoIPDebugToSend) obj3).lambda$done$0((TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                break;
            case 8:
                org.telegram.ui.ActionBar.i3 i3Var = (org.telegram.ui.ActionBar.i3) obj3;
                org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) obj2;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj;
                if (k2Var2 != null) {
                    if ((k2Var2 instanceof un) && (mkVar = (unVar = (un) k2Var2).Z) != null) {
                        mkVar.L();
                        unVar.Z.j0(true, false, true);
                    }
                    if (k2Var2.getContext() != null && k2Var2.getParentActivity() != null) {
                        xh.m2 m2Var = new xh.m2(k2Var2.getContext(), k2Var2.getResourceProvider());
                        m2Var.l0 = k2Var2.getParentActivity();
                        if (h3Var2 != null && h3Var2.a != null) {
                            m2Var.F0 = true;
                            boolean z14 = h3Var2.o;
                            m2Var.W = z14;
                            if (z14) {
                                m2Var.A(h3Var2.r, false);
                            }
                            if (h3Var2.n) {
                                i10 = h3Var2.q;
                            } else {
                                int i18 = h3Var2.p;
                                if (i18 < 0) {
                                    i18 = t6.d6;
                                }
                                i10 = t6.w0(i18, m2Var.F);
                            }
                            m2Var.y(i10, h3Var2.n, false);
                            m2Var.D(h3Var2.s, false);
                            m2Var.G0 = h3Var2.j;
                            m2Var.H0 = h3Var2.k;
                            boolean z15 = h3Var2.u;
                            m2Var.x0 = z15;
                            xh.e2 e2Var = m2Var.D;
                            e2Var.setIsBackButtonVisible(z15);
                            m2Var.x.setAllowSwipes(h3Var2.l);
                            org.telegram.messenger.i0.Q3(m2Var.X.getBackButton(), m2Var.x0 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
                            org.telegram.messenger.l2 l2Var = m2Var.n0;
                            if (l2Var != null) {
                                boolean z16 = m2Var.x0;
                                l2Var.K = z16;
                                l2Var.L.d(z16);
                                l2Var.invalidate();
                            }
                            m2Var.s0 = h3Var2.y;
                            m2Var.A0 = Boolean.valueOf(h3Var2.B);
                            m2Var.B0 = h3Var2.C;
                            xh.s0 s0Var = h3Var2.K;
                            m2Var.C0 = s0Var;
                            if (s0Var != null) {
                                xh.q0 q0Var = s0Var.r;
                                SensorManager sensorManager = s0Var.a;
                                f7 = 0.721f;
                                if (s0Var.l) {
                                    s0Var.l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = s0Var.b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(s0Var.n, sensor, xh.s0.a(s0Var.c));
                                        }
                                        Sensor sensor2 = s0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(s0Var.p, sensor2, xh.s0.a(s0Var.e));
                                        }
                                        Sensor sensor3 = s0Var.g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(q0Var, sensor3, xh.s0.a(s0Var.h));
                                        }
                                        Sensor sensor4 = s0Var.f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(q0Var, sensor4, xh.s0.a(s0Var.h));
                                        }
                                        Sensor sensor5 = s0Var.i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(s0Var.t, sensor5, xh.s0.a(s0Var.j));
                                        }
                                    }
                                }
                            } else {
                                f7 = 0.721f;
                            }
                            a5.a aVar = h3Var2.w;
                            if (aVar != null) {
                                xh.i2 i2Var = m2Var.m0;
                                int totalHeight = i2Var.getTotalHeight();
                                i2Var.e = aVar;
                                xh.p[] pVarArr = i2Var.f;
                                xh.r.b(pVarArr[0].l, (xh.q) aVar.c, false);
                                xh.r.b(pVarArr[1].l, (xh.q) aVar.d, false);
                                i2Var.invalidate();
                                if (totalHeight != i2Var.getTotalHeight() && i2Var.r != null) {
                                    if (totalHeight < i2Var.getTotalHeight()) {
                                        org.telegram.messenger.i0.h3(i2Var.r, 200L);
                                    } else {
                                        i2Var.r.run();
                                    }
                                }
                                int i19 = aVar.b;
                                Paint paint = i2Var.a;
                                i2Var.e.b = i19;
                                paint.setColor(i19);
                                i2Var.d.a(i19, true);
                            }
                            m2Var.C(h3Var2.z, false, h3Var2.A);
                            s3 s3Var = h3Var2.a;
                            m2Var.H = s3Var != null ? s3Var.a : d20.s0;
                            org.telegram.ui.web.v0 v0Var = h3Var2.b;
                            if (v0Var != null) {
                                v0Var.onResume();
                                e2Var.N(m2Var.H, h3Var2.b, h3Var2.d, h3Var2.f, h3Var2.e);
                                boolean z17 = h3Var2.t || h3Var2.b.b;
                                String str10 = h3Var2.x;
                                e2Var.g("setState(" + z17 + ", " + str10 + ")");
                                e2Var.N = z17;
                                e2Var.b = str10;
                                if (t6.I.q() != h3Var2.D) {
                                    e2Var.z();
                                }
                            } else {
                                s3Var.q = null;
                                s3Var.r = 0L;
                            }
                            m2Var.x(k2Var2, h3Var2.a);
                            m2Var.c0 = h3Var2.v;
                            if (h3Var2.G) {
                                m2Var.W0 = true;
                                m2Var.m();
                                org.telegram.ui.b3 b3Var = m2Var.Y0;
                                String p5 = m2Var.q() ? m2Var.w0.e : h20.p(vp.r1(m2Var.H).Z1(Long.valueOf(m2Var.I)));
                                String str11 = h3Var2.H;
                                m2Var.X0 = str11;
                                b3Var.a(p5, str11);
                                org.telegram.ui.b3 b3Var2 = m2Var.Y0;
                                Paint paint2 = m2Var.Q;
                                b3Var2.b(org.telegram.messenger.i0.B(paint2.getColor()) <= f7, false);
                                m2Var.Y0.setBackgroundColor(paint2.getColor());
                                m2Var.Y0.setVisibility(0);
                                m2Var.Y0.setAlpha(1.0f);
                            }
                            m2Var.t(h3Var2.L);
                            i3Var.h(i3Var.x, h3Var2, false);
                            m2Var.show();
                            break;
                        }
                    }
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) obj2;
                ((org.telegram.ui.ActionBar.h3) obj3).m = (Bitmap) obj;
                n3Var.d().setDrawingFromOverlay(false);
                n3Var.release();
                break;
            case 10:
                p3 p3Var = (p3) obj2;
                q3 q3Var = (q3) ((org.telegram.ui.ActionBar.m3) obj3).q;
                if (!((Boolean) obj).booleanValue()) {
                    p3Var.a(0.0f);
                    break;
                } else {
                    p3Var.a(1.0f);
                    if (q3Var.a.getTabs().isEmpty()) {
                        q3Var.a(false);
                        break;
                    }
                }
                break;
            case 11:
                h4 h4Var = (h4) obj3;
                Activity activity = (Activity) obj2;
                Integer num = (Integer) obj;
                u3 u3Var = h4Var.K;
                org.telegram.ui.l0[] l0VarArr = h4Var.T0;
                if ((!h4Var.u0[0].c() || h4Var.u0[0].c.E != null) && h4Var.L != null) {
                    if (num.intValue() != 1) {
                        if (num.intValue() != 2) {
                            int i20 = 6;
                            if (num.intValue() != 6) {
                                int i21 = 7;
                                if (num.intValue() != 7) {
                                    int i22 = 3;
                                    if (num.intValue() != 8) {
                                        if (num.intValue() != 9) {
                                            if (num.intValue() != 3) {
                                                if (num.intValue() != 4) {
                                                    if (num.intValue() != 5) {
                                                        if (num.intValue() == 10 && (w1Var = h4Var.u0[0].E) != null && w1Var.b() != null) {
                                                            h4Var.f(w1Var.b(), null, 1);
                                                            break;
                                                        }
                                                    } else if (h4Var.u0[0].f() && h4Var.u0[0].getWebView() != null) {
                                                        h4Var.u0[0].getWebView().reload();
                                                        break;
                                                    }
                                                } else if (!h4Var.u0[0].f()) {
                                                    org.telegram.ui.ActionBar.z2 h = z20.h(h4Var.L, false, 1, null);
                                                    h.u0 = false;
                                                    LinearLayout linearLayout = new LinearLayout(h4Var.L);
                                                    linearLayout.setPadding(0, 0, 0, org.telegram.messenger.i0.L(4.0f));
                                                    linearLayout.setOrientation(1);
                                                    p4 p4Var = new p4(h4Var.L, (p6) null);
                                                    p4Var.setText(cd.L0(2131750610, null));
                                                    linearLayout.addView(p4Var, b6.t(-2, -2, 51, 3, 1, 3, 0));
                                                    linearLayout.addView(new org.telegram.ui.d4(h4Var, h4Var.L), b6.t(-1, -2, 51, 3, 0, 3, 0));
                                                    p4 p4Var2 = new p4(h4Var.L, (p6) null);
                                                    p4Var2.setText(cd.L0(2131750605, null));
                                                    linearLayout.addView(p4Var2, b6.t(-2, -2, 51, 3, 4, 3, 2));
                                                    int i23 = 0;
                                                    while (i23 < i15) {
                                                        Activity activity2 = h4Var.L;
                                                        org.telegram.ui.l0 l0Var = new org.telegram.ui.l0((Context) activity2, (int) (z10 ? 1 : 0));
                                                        int i24 = t6.i6;
                                                        org.telegram.ui.Cells.y h02 = t6.h0(t6.x0(null, i24, false), i15, -1);
                                                        w6 N = a7.N(i24);
                                                        l0Var.setBackground(h02);
                                                        a7.k(l0Var, h02, null, N, null);
                                                        RadioButton radioButton = new RadioButton(activity2);
                                                        l0Var.b = radioButton;
                                                        radioButton.setSize(org.telegram.messenger.i0.L(20.0f));
                                                        a7.P(radioButton, t6.D5, t6.E5, null);
                                                        boolean z18 = cd.X;
                                                        l0Var.addView(radioButton, b6.d(22, 22.0f, (z18 ? 5 : 3) | 48, z18 ? 0 : 22, 13.0f, z18 ? 22 : 0, 0.0f));
                                                        TextView textView = new TextView(activity2);
                                                        a7.V(textView, t6.G6, null);
                                                        z20.o(textView, 1, 16.0f, 1, 1);
                                                        textView.setSingleLine(true);
                                                        textView.setGravity((cd.X ? 5 : 3) | 16);
                                                        boolean z19 = cd.X;
                                                        l0Var.addView(textView, b6.d(-1, -1.0f, (z19 ? 5 : 3) | 48, z19 ? 17 : 62, 0.0f, z19 ? 62 : 17, 0.0f));
                                                        l0VarArr[i23] = l0Var;
                                                        if (i23 == 0) {
                                                            String L0 = cd.L0(2131751601, null);
                                                            Typeface typeface = Typeface.DEFAULT;
                                                            textView.setText(L0);
                                                            textView.setTypeface(typeface);
                                                            l0Var.setContentDescription(L0);
                                                            l0Var.invalidate();
                                                        } else if (i23 == 1) {
                                                            Typeface typeface2 = Typeface.SERIF;
                                                            textView.setText("Serif");
                                                            textView.setTypeface(typeface2);
                                                            l0Var.setContentDescription("Serif");
                                                            l0Var.invalidate();
                                                        }
                                                        ((RadioButton) l0VarArr[i23].b).a(i23 == h4Var.a, false);
                                                        l0VarArr[i23].setTag(Integer.valueOf(i23));
                                                        l0VarArr[i23].setOnClickListener(new org.telegram.ui.q(h4Var, i14));
                                                        linearLayout.addView(l0VarArr[i23], b6.o(-1, 50));
                                                        i23++;
                                                        i15 = 2;
                                                    }
                                                    h.N = linearLayout;
                                                    h4Var.I = h;
                                                    h4Var.Y(h);
                                                    break;
                                                } else {
                                                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                                    if (T != null) {
                                                        org.telegram.ui.ActionBar.i2 i2Var2 = new org.telegram.ui.ActionBar.i2();
                                                        i2Var2.a = true;
                                                        T.showAsSheet(new org.telegram.ui.web.p1(new org.telegram.ui.p(h4Var, i22)), i2Var2);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                if (!h4Var.u0[0].f()) {
                                                    TLRPC.WebPage webPage = h4Var.u0[0].c.E;
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
                                                } else if (h4Var.u0[0].getWebView() != null) {
                                                    str = h4Var.u0[0].getWebView().getUrl();
                                                    str2 = h4Var.u0[0].getWebView().getOpenURL();
                                                    file = null;
                                                }
                                                Activity activity3 = h4Var.L;
                                                if (activity3 != null && !activity3.isFinishing()) {
                                                    if (file == null) {
                                                        if (str != null) {
                                                            String K0 = org.telegram.messenger.i0.K0(str2, true);
                                                            String K02 = org.telegram.messenger.i0.K0(str, true);
                                                            org.telegram.ui.v vVar2 = new org.telegram.ui.v(h4Var, str, z12 ? 1 : 0);
                                                            org.telegram.ui.w wVar = new org.telegram.ui.w(h4Var, K02, K0, z11 ? 1 : 0);
                                                            if (!h4Var.u0[0].f() || !vp.r1(h4Var.X).L2(K02) || vp.r1(h4Var.X).J2(true)) {
                                                                vVar2.run();
                                                                break;
                                                            } else {
                                                                s4.n0(activity, null, str, true, new ih.s(i15, wVar, vVar2));
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        String D = b8.D(file);
                                                        Pattern pattern = g90.a;
                                                        org.telegram.messenger.i0.t2(file, null, ("diff".equalsIgnoreCase(D) || "patch".equalsIgnoreCase(D)) ? "text/x-diff" : "text/markdown", h4Var.L, null, true);
                                                        break;
                                                    }
                                                }
                                            }
                                        } else if (h4Var.u0[0].getWebView() != null) {
                                            h4Var.u0[0].getWebView().goForward();
                                            break;
                                        }
                                    } else {
                                        org.telegram.ui.ActionBar.i2 i2Var3 = new org.telegram.ui.ActionBar.i2();
                                        i2Var3.a = true;
                                        org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                        if (T2 != null) {
                                            T2.showAsSheet(new org.telegram.ui.web.b1(u3Var != null ? new org.telegram.ui.y(h4Var, i21) : null, new org.telegram.ui.p(h4Var, i22)), i2Var3);
                                            break;
                                        }
                                    }
                                } else {
                                    org.telegram.ui.ActionBar.i2 i2Var4 = new org.telegram.ui.ActionBar.i2();
                                    i2Var4.a = true;
                                    org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                                    if (T3 != null) {
                                        T3.showAsSheet(new org.telegram.ui.web.m(u3Var != null ? new org.telegram.ui.y(h4Var, i20) : null, new org.telegram.ui.p(h4Var, i15)), i2Var4);
                                        break;
                                    }
                                }
                            } else {
                                if (!h4Var.u0[0].f()) {
                                    org.telegram.ui.l3 l3Var = h4Var.u0[0];
                                    TLRPC.WebPage webPage2 = l3Var.c.E;
                                    if (webPage2 != null) {
                                        str3 = webPage2.url;
                                        frameLayout = l3Var;
                                    }
                                } else if (h4Var.u0[0].getWebView() != null) {
                                    str3 = h4Var.u0[0].getWebView().getUrl();
                                    frameLayout = h4Var.u0[0].f;
                                }
                                h4.d(str3, h4Var.X, frameLayout, u3Var, null);
                                break;
                            }
                        } else {
                            if (!h4Var.u0[0].f()) {
                                TLRPC.WebPage webPage3 = h4Var.u0[0].c.E;
                                if (webPage3 != null) {
                                    str4 = webPage3.url;
                                }
                            } else if (h4Var.u0[0].getWebView() != null) {
                                str4 = h4Var.u0[0].getWebView().getUrl();
                            }
                            String u10 = org.telegram.ui.web.z0.u(str4);
                            h4Var.Y(new op0(h4Var.L, null, u10, false, u10, false, org.telegram.messenger.i0.B(h4Var.h0.getBackgroundColor()) < 0.721f ? new th.b() : null));
                            break;
                        }
                    } else {
                        org.telegram.ui.m0 m0Var = h4Var.h0;
                        int L = org.telegram.messenger.i0.L(56.0f);
                        h4Var.J0 = L;
                        m0Var.setHeight(L);
                        h4Var.h0.h(true);
                        break;
                    }
                }
                break;
            case 12:
                org.telegram.ui.l3 l3Var2 = (org.telegram.ui.l3) obj3;
                Activity activity4 = (Activity) obj2;
                String str13 = (String) obj;
                if (!TextUtils.isEmpty(str13) && l3Var2.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str13.trim());
                    org.telegram.messenger.i0.c(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i25 = 0;
                    while (i16 < uRLSpanArr.length) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i16]), length);
                        i25 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i16]), i25);
                        i16++;
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
                                str13 = gf.f.u(uri, "https", null, uri.getPath(), "/");
                            }
                            l3Var2.getWebView().loadUrl(str13);
                            break;
                        } else {
                            org.telegram.ui.web.j.b(activity4, str13);
                            org.telegram.ui.web.v0 webView = l3Var2.getWebView();
                            String str14 = org.telegram.ui.web.g1.a().b;
                            if (str14 != null) {
                                StringBuilder t10 = a1.g.t(str14);
                                t10.append(URLEncoder.encode(str13));
                                str5 = t10.toString();
                            }
                            webView.loadUrl(str5);
                            break;
                        }
                    }
                }
                break;
            case 13:
                zc zcVar = (zc) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                zcVar.c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i26 = tL_premium_boostsStatus.level;
                    zcVar.b = i26;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i26;
                    }
                }
                zcVar.d1(true);
                vh.d dVar = zcVar.P;
                if (dVar != null) {
                    dVar.setLoading(false);
                    break;
                }
                break;
            case 14:
                qc qcVar = (qc) obj3;
                lp lpVar = (lp) obj2;
                View view2 = (View) obj;
                if (view2 instanceof pc) {
                    pc pcVar = (pc) view2;
                    pcVar.setBackgroundColor(t6.w0(t6.d6, qcVar.a));
                    qcVar.b.getClass();
                    int R = RecyclerView.R(view2);
                    if (lpVar != null) {
                        ArrayList arrayList = lpVar.c;
                        if (R >= 0 && R < arrayList.size()) {
                            pcVar.a((kp) arrayList.get(R));
                        }
                    }
                    view2.invalidate();
                    break;
                }
                break;
            case 15:
                kg.q0 q0Var2 = (kg.q0) obj2;
                q0Var2.A1((org.telegram.messenger.h3) obj);
                ((le) obj3).m0.showDialog(q0Var2);
                break;
            case 16:
                un unVar2 = (un) obj3;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages2.peer = unVar2.getMessagesController().i1(unVar2.j6);
                tL_messages_sendQuickReplyMessages2.shortcut_id = ((h3) obj2).a;
                unVar2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages2, null);
                mk mkVar2 = unVar2.Z;
                if (mkVar2 != null) {
                    mkVar2.setFieldText(null);
                    break;
                }
                break;
            case 17:
                un unVar3 = (un) obj3;
                oz b10 = oz.b((String) obj2, unVar3.j6, unVar3.D5, unVar3.l4, null, false, null, null, null, true, 0, 0, null, false);
                b10.K = unVar3.P8();
                b10.Q = ((Long) obj).longValue();
                b10.R = unVar3.a9();
                b10.T = unVar3.w5;
                unVar3.getSendMessagesHelper().r0(b10);
                unVar3.Z.setFieldText("");
                unVar3.r9(false);
                break;
            case 18:
                un unVar4 = (un) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l4 = (Long) obj;
                if (unVar4.f4 != 1) {
                    unVar4.tb(botInlineResult, true, 0, l4.longValue());
                    break;
                } else {
                    s4.L(unVar4.getParentActivity(), unVar4.j6, new org.telegram.ui.a7(unVar4, botInlineResult, l4, i15), unVar4.xa);
                    break;
                }
            case 19:
                ((un) obj3).Eb = true;
                ((org.telegram.ui.h0) obj2).run();
                break;
            case 20:
                un.L0((un) obj3, (g01[]) obj2, (z60) obj);
                break;
            case 21:
                un unVar5 = (un) obj3;
                org.telegram.ui.ActionBar.x1[] x1VarArr = (org.telegram.ui.ActionBar.x1[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    x1VarArr[0].dismiss();
                } catch (Throwable unused2) {
                }
                x1VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (!(tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError)) {
                        new lh.h(unVar5.getParentActivity(), unVar5.xa, tL_statsPollStats).show();
                        break;
                    } else {
                        m5.n(null, 2131747172, cc.a0(unVar5), R.raw.timer_toast, 24);
                        break;
                    }
                }
                break;
            case 22:
                un unVar6 = (un) obj3;
                jj jjVar = (jj) obj2;
                unVar6.getClass();
                TLRPC.SuggestedPost c10 = ((oj) obj).c();
                if (jjVar != null && jjVar.k != null) {
                    unVar6.getMessagesController().h(jjVar, c10);
                    break;
                }
                break;
            case 23:
                h3 h3Var3 = (h3) obj2;
                String str15 = (String) obj;
                un unVar7 = ((nj) obj3).b;
                if (h3Var3 != null) {
                    i11 = ((org.telegram.ui.ActionBar.k2) unVar7).currentAccount;
                    i3.f(i11).k(h3Var3.a, str15);
                }
                unVar7.e4 = str15;
                unVar7.o1.setTitle(str15);
                break;
            case 24:
                jj jjVar2 = (jj) obj2;
                Long l10 = (Long) obj;
                un unVar8 = ((fn) obj3).a;
                if (unVar8.n7()) {
                    oz b11 = oz.b(jjVar2.C0(), unVar8.j6, unVar8.D5, unVar8.l4, null, false, null, null, null, true, 0, 0, null, false);
                    b11.K = unVar8.P8();
                    b11.W = l10.longValue();
                    unVar8.getSendMessagesHelper().r0(b11);
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj2;
                un unVar9 = ((fn) obj3).a;
                if (!((Boolean) obj).booleanValue()) {
                    if (q1Var.getMessageObject() != null) {
                        q1Var.getMessageObject().r2 = Boolean.FALSE;
                    }
                    q1Var.D3();
                    break;
                } else {
                    while (i16 < unVar9.z0.getChildCount()) {
                        View childAt = unVar9.z0.getChildAt(i16);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                            if (q1Var2.getMessageObject() != null && q1Var2.getMessageObject().p4()) {
                                q1Var2.D3();
                            }
                        }
                        i16++;
                    }
                    break;
                }
                break;
            case 26:
                fn fnVar = (fn) obj3;
                e0 e0Var = (e0) obj2;
                un unVar10 = fnVar.a;
                if (!((Boolean) obj).booleanValue()) {
                    cc.a0(unVar10).I(R.raw.error, cd.L0(2131754311, null), cd.L0(2131754312, null)).j();
                    break;
                } else {
                    unVar10.getMessagesController().C4(true);
                    cc.a0(unVar10).P(R.raw.chats_infotip, org.telegram.messenger.i0.G2(org.telegram.messenger.i0.x2(cd.L0(2131745591, null), new pm(fnVar, i13)), true)).k(true);
                    e0Var.a(Boolean.TRUE);
                    break;
                }
            case 27:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((fn) obj3).a.getMessagesController().v(message.id, -1, o5.o(message.peer_id), (String) obj, true);
                break;
            case 28:
                xn xnVar = (xn) obj3;
                xnVar.f.s(((wf.a) obj).a, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view3 = xnVar.b;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
            default:
                Long l11 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((re) obj3).a;
                long j10 = chatActivityEnterView.Q2;
                jj jjVar3 = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                oz b12 = oz.b((String) obj2, j10, jjVar3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                un unVar11 = chatActivityEnterView.P2;
                b12.K = unVar11 != null ? unVar11.P8() : null;
                b12.O = chatActivityEnterView.S4;
                b12.Q = l11.longValue();
                b12.R = chatActivityEnterView.getSendMonoForumPeerId();
                b12.T = chatActivityEnterView.getSendMessageSuggestionParams();
                qz.C(chatActivityEnterView.Q).r0(b12);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                be beVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                beVar.setEffect(0L);
                break;
        }
    }

    public /* synthetic */ e0(h2 h2Var, View view) {
        this.a = 2;
        this.c = h2Var;
        this.b = view;
    }
}
