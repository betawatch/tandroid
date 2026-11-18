package li;

import android.app.Activity;
import android.graphics.Typeface;
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
import bi.m6;
import c8.ma;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kg.v1;
import kg.w1;
import oi.e1;
import oi.e2;
import oi.s3;
import oi.z1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bp;
import org.telegram.messenger.bz;
import org.telegram.messenger.cp;
import org.telegram.messenger.f3;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.g3;
import org.telegram.messenger.gd;
import org.telegram.messenger.j6;
import org.telegram.messenger.kj;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.n5;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.messenger.w7;
import org.telegram.messenger.x10;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.x2;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.re;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.c4;
import org.telegram.ui.en;
import org.telegram.ui.g4;
import org.telegram.ui.gc;
import org.telegram.ui.hc;
import org.telegram.ui.k3;
import org.telegram.ui.k9;
import org.telegram.ui.mm;
import org.telegram.ui.qc;
import org.telegram.ui.rj;
import org.telegram.ui.t3;
import org.telegram.ui.ti;
import org.telegram.ui.u7;
import org.telegram.ui.ul;
import org.telegram.ui.uy0;
import org.telegram.ui.web.n1;
import org.telegram.ui.web.s0;
import org.telegram.ui.web.t1;
import org.telegram.ui.web.v0;
import org.telegram.ui.web.x0;
import org.telegram.ui.xd;
import org.telegram.ui.z6;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        oi.q a10;
        t1 t1Var;
        String str;
        String str2;
        File file;
        String str3;
        FrameLayout frameLayout;
        String str4;
        Uri uri;
        int i7;
        TLRPC.Document document;
        fj threadMessage;
        int i10 = this.a;
        int i11 = 8;
        int i12 = 4;
        int i13 = 2;
        String str5 = null;
        int i14 = 0;
        int i15 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                g gVar = (g) obj3;
                gVar.getClass();
                gVar.b0(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                break;
            case 1:
                g gVar2 = (g) obj3;
                gVar2.getClass();
                gVar2.a0((String) obj2, ((Boolean) obj).booleanValue());
                break;
            case 2:
                d0 d0Var = (d0) obj3;
                d0Var.L0((TLRPC.Chat) obj2, d0Var.p1, ((Boolean) obj).booleanValue());
                break;
            case 3:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str6 = (String) obj;
                s3 s3Var = ((oi.o) obj3).r;
                if (pageblockmath != null) {
                    pageblockmath.source = str6;
                    s3Var.g3.O(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str6;
                    s3Var.V1(pageblockmath2);
                    break;
                }
            case 4:
                e1 e1Var = (e1) obj3;
                oi.q qVar = (oi.q) obj2;
                String str7 = (String) obj;
                e1Var.getClass();
                if (!TextUtils.isEmpty(str7)) {
                    Editable text = e1Var.getText();
                    int spanStart = text.getSpanStart(qVar);
                    int spanEnd = text.getSpanEnd(qVar);
                    if (spanStart >= 0 && spanEnd >= 0 && (a10 = oi.q.a(str7, e1Var.getCurrentTextColor(), org.telegram.messenger.g0.L(bz.W0 + 4))) != null) {
                        boolean z10 = e1Var.m2;
                        if (z10) {
                            e1Var.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a10, 0, 1, 33);
                        int max = Math.max(0, Math.min(spanStart, e1Var.length()));
                        text.replace(max, Math.max(max, Math.min(spanEnd, e1Var.length())), spannableString);
                        e1Var.setSelection(Math.min(max + 1, e1Var.length()));
                        if (z10) {
                            e1Var.setLocked(true);
                            break;
                        }
                    }
                }
                break;
            case 5:
                z1 z1Var = (z1) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str8 = (String) obj;
                z1Var.getClass();
                if (pageblockmath3 != null) {
                    pageblockmath3.source = str8;
                    z1Var.Q.g3.O(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                    pageblockmath4.source = str8;
                    z1Var.Q.V1(pageblockmath4);
                    break;
                }
            case 6:
                s3 s3Var2 = (s3) obj3;
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                String str9 = (String) obj;
                s3Var2.getClass();
                if (!TextUtils.equals(str9, pageblockmath5.source)) {
                    e2 e2Var = s3Var2.R3;
                    if (e2Var != null) {
                        e2Var.d();
                    }
                    pageblockmath5.source = str9;
                    s3Var2.g3.O(false);
                    e2 e2Var2 = s3Var2.R3;
                    if (e2Var2 != null) {
                        e2Var2.h();
                    }
                    s3Var2.p3.onContentChanged();
                    break;
                }
                break;
            case 7:
                ((VoIPDebugToSend) obj3).lambda$done$0((TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                break;
            case 8:
                g4 g4Var = (g4) obj3;
                Activity activity = (Activity) obj2;
                Integer num = (Integer) obj;
                t3 t3Var = g4Var.L;
                org.telegram.ui.k0[] k0VarArr = g4Var.U0;
                if ((!g4Var.v0[0].c() || g4Var.v0[0].c.F != null) && g4Var.M != null) {
                    if (num.intValue() == 1) {
                        org.telegram.ui.l0 l0Var = g4Var.i0;
                        int L = org.telegram.messenger.g0.L(56.0f);
                        g4Var.K0 = L;
                        l0Var.setHeight(L);
                        g4Var.i0.h(true);
                        break;
                    } else if (num.intValue() == 2) {
                        if (!g4Var.v0[0].f()) {
                            TLRPC.WebPage webPage = g4Var.v0[0].c.F;
                            if (webPage != null) {
                                str4 = webPage.url;
                            }
                        } else if (g4Var.v0[0].getWebView() != null) {
                            str4 = g4Var.v0[0].getWebView().getUrl();
                        }
                        String u10 = v0.u(str4);
                        g4Var.Y(new yo0(g4Var.M, null, u10, false, u10, false, org.telegram.messenger.g0.B(g4Var.i0.getBackgroundColor()) < 0.721f ? new fi.b() : null));
                        break;
                    } else {
                        int i16 = 6;
                        if (num.intValue() == 6) {
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
                        } else {
                            int i17 = 7;
                            if (num.intValue() == 7) {
                                f2 f2Var = new f2();
                                f2Var.a = true;
                                h2 T = LaunchActivity.T();
                                if (T != null) {
                                    T.showAsSheet(new org.telegram.ui.web.m(t3Var != null ? new org.telegram.ui.z(g4Var, i16) : null, new org.telegram.ui.q(g4Var, i13)), f2Var);
                                    break;
                                }
                            } else {
                                int i18 = 3;
                                if (num.intValue() == 8) {
                                    f2 f2Var2 = new f2();
                                    f2Var2.a = true;
                                    h2 T2 = LaunchActivity.T();
                                    if (T2 != null) {
                                        T2.showAsSheet(new x0(t3Var != null ? new org.telegram.ui.z(g4Var, i17) : null, new org.telegram.ui.q(g4Var, i18)), f2Var2);
                                        break;
                                    }
                                } else if (num.intValue() == 9) {
                                    if (g4Var.v0[0].getWebView() != null) {
                                        g4Var.v0[0].getWebView().goForward();
                                        break;
                                    }
                                } else if (num.intValue() == 3) {
                                    if (!g4Var.v0[0].f()) {
                                        TLRPC.WebPage webPage3 = g4Var.v0[0].c.F;
                                        if (webPage3 != null) {
                                            String str10 = webPage3.url;
                                            TL_iv.Page page = webPage3.cached_page;
                                            if (page != null) {
                                                file = page.local;
                                                str = str10;
                                                str2 = null;
                                            } else {
                                                str = str10;
                                                str2 = null;
                                                file = null;
                                            }
                                        }
                                    } else if (g4Var.v0[0].getWebView() != null) {
                                        str = g4Var.v0[0].getWebView().getUrl();
                                        str2 = g4Var.v0[0].getWebView().getOpenURL();
                                        file = null;
                                    }
                                    Activity activity2 = g4Var.M;
                                    if (activity2 != null && !activity2.isFinishing()) {
                                        if (file != null) {
                                            String D = w7.D(file);
                                            Pattern pattern = b90.a;
                                            org.telegram.messenger.g0.t2(file, null, ("diff".equalsIgnoreCase(D) || "patch".equalsIgnoreCase(D)) ? "text/x-diff" : "text/markdown", g4Var.M, null, true);
                                            break;
                                        } else if (str != null) {
                                            String K0 = org.telegram.messenger.g0.K0(str2, true);
                                            String K02 = org.telegram.messenger.g0.K0(str, true);
                                            org.telegram.ui.w wVar = new org.telegram.ui.w(g4Var, str, i15);
                                            org.telegram.ui.x xVar = new org.telegram.ui.x(g4Var, K02, K0, i15);
                                            if (!g4Var.v0[0].f() || !mp.u1(g4Var.Y).T2(K02) || mp.u1(g4Var.Y).R2(true)) {
                                                wVar.run();
                                                break;
                                            } else {
                                                b5.l0(activity, null, str, true, new m6(12, xVar, wVar));
                                                break;
                                            }
                                        }
                                    }
                                } else if (num.intValue() == 4) {
                                    if (g4Var.v0[0].f()) {
                                        h2 T3 = LaunchActivity.T();
                                        if (T3 != null) {
                                            f2 f2Var3 = new f2();
                                            f2Var3.a = true;
                                            T3.showAsSheet(new n1(new org.telegram.ui.q(g4Var, i18)), f2Var3);
                                            break;
                                        }
                                    } else {
                                        x2 j3 = n10.j(g4Var.M, false, 1, null);
                                        j3.v0 = false;
                                        LinearLayout linearLayout = new LinearLayout(g4Var.M);
                                        linearLayout.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
                                        linearLayout.setOrientation(1);
                                        n4 n4Var = new n4(g4Var.M, (i6) null);
                                        n4Var.setText(gd.M0(2131750593, null));
                                        linearLayout.addView(n4Var, ma.t(-2, -2, 51, 3, 1, 3, 0));
                                        linearLayout.addView(new c4(g4Var, g4Var.M), ma.t(-1, -2, 51, 3, 0, 3, 0));
                                        n4 n4Var2 = new n4(g4Var.M, (i6) null);
                                        n4Var2.setText(gd.M0(2131750588, null));
                                        linearLayout.addView(n4Var2, ma.t(-2, -2, 51, 3, 4, 3, 2));
                                        int i19 = 0;
                                        while (i19 < i13) {
                                            Activity activity3 = g4Var.M;
                                            org.telegram.ui.k0 k0Var = new org.telegram.ui.k0(activity3, i15);
                                            int i20 = n6.i6;
                                            org.telegram.ui.Cells.y h02 = n6.h0(n6.x0(null, i20, false), i13, -1);
                                            q6 M = u6.M(i20);
                                            k0Var.setBackground(h02);
                                            u6.j(k0Var, h02, null, M, null);
                                            RadioButton radioButton = new RadioButton(activity3);
                                            k0Var.b = radioButton;
                                            radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                                            u6.O(radioButton, n6.D5, n6.E5, null);
                                            boolean z11 = gd.a0;
                                            k0Var.addView(radioButton, ma.d(22, 22.0f, (z11 ? 5 : 3) | 48, z11 ? 0 : 22, 13.0f, z11 ? 22 : 0, 0.0f));
                                            TextView textView = new TextView(activity3);
                                            u6.U(textView, n6.G6, null);
                                            n10.q(textView, 1, 16.0f, 1, 1);
                                            textView.setSingleLine(true);
                                            textView.setGravity((gd.a0 ? 5 : 3) | 16);
                                            boolean z12 = gd.a0;
                                            k0Var.addView(textView, ma.d(-1, -1.0f, (z12 ? 5 : 3) | 48, z12 ? 17 : 62, 0.0f, z12 ? 62 : 17, 0.0f));
                                            k0VarArr[i19] = k0Var;
                                            if (i19 == 0) {
                                                String M0 = gd.M0(2131751589, null);
                                                Typeface typeface = Typeface.DEFAULT;
                                                textView.setText(M0);
                                                textView.setTypeface(typeface);
                                                k0Var.setContentDescription(M0);
                                                k0Var.invalidate();
                                            } else if (i19 == 1) {
                                                Typeface typeface2 = Typeface.SERIF;
                                                textView.setText("Serif");
                                                textView.setTypeface(typeface2);
                                                k0Var.setContentDescription("Serif");
                                                k0Var.invalidate();
                                            }
                                            ((RadioButton) k0VarArr[i19].b).a(i19 == g4Var.a, false);
                                            k0VarArr[i19].setTag(Integer.valueOf(i19));
                                            k0VarArr[i19].setOnClickListener(new org.telegram.ui.r(g4Var, i12));
                                            linearLayout.addView(k0VarArr[i19], ma.o(-1, 50));
                                            i19++;
                                            i13 = 2;
                                        }
                                        j3.O = linearLayout;
                                        g4Var.J = j3;
                                        g4Var.Y(j3);
                                        break;
                                    }
                                } else if (num.intValue() != 5) {
                                    if (num.intValue() == 10 && (t1Var = g4Var.v0[0].F) != null && t1Var.b() != null) {
                                        g4Var.f(t1Var.b(), null, 1);
                                        break;
                                    }
                                } else if (g4Var.v0[0].f() && g4Var.v0[0].getWebView() != null) {
                                    g4Var.v0[0].getWebView().reload();
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 9:
                k3 k3Var2 = (k3) obj3;
                Activity activity4 = (Activity) obj2;
                String str11 = (String) obj;
                if (!TextUtils.isEmpty(str11) && k3Var2.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str11.trim());
                    org.telegram.messenger.g0.c(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i21 = 0;
                    while (i14 < uRLSpanArr.length) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i14]), length);
                        i21 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i14]), i21);
                        i14++;
                    }
                    Pattern pattern2 = Utilities.a;
                    try {
                        uri = Uri.parse(str11);
                    } catch (Exception unused) {
                        uri = null;
                    }
                    if (uri == null || !TextUtils.equals(uri.getScheme(), "javascript")) {
                        if ((uRLSpanArr.length <= 0 || length != 0 || i21 <= 0) && (uri == null || uri.getScheme() == null)) {
                            org.telegram.ui.web.k.b(activity4, str11);
                            s0 webView = k3Var2.getWebView();
                            String str12 = org.telegram.ui.web.e1.a().b;
                            if (str12 != null) {
                                StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str12);
                                m10.append(URLEncoder.encode(str11));
                                str5 = m10.toString();
                            }
                            webView.loadUrl(str5);
                            break;
                        } else {
                            if (uri != null && uri.getScheme() == null && uri.getHost() == null && uri.getPath() != null) {
                                str11 = vf.c.w(uri, "https", null, uri.getEncodedPath(), "/");
                            }
                            k3Var2.getWebView().loadUrl(str11);
                            break;
                        }
                    }
                }
                break;
            case 10:
                qc qcVar = (qc) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                qcVar.c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i22 = tL_premium_boostsStatus.level;
                    qcVar.b = i22;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i22;
                    }
                }
                qcVar.e1(true);
                hi.d dVar = qcVar.Q;
                if (dVar != null) {
                    dVar.setLoading(false);
                    break;
                }
                break;
            case 11:
                hc hcVar = (hc) obj3;
                cp cpVar = (cp) obj2;
                View view = (View) obj;
                if (view instanceof gc) {
                    gc gcVar = (gc) view;
                    gcVar.setBackgroundColor(n6.w0(n6.d6, hcVar.a));
                    hcVar.b.getClass();
                    int R = RecyclerView.R(view);
                    if (cpVar != null) {
                        ArrayList arrayList = cpVar.c;
                        if (R >= 0 && R < arrayList.size()) {
                            gcVar.a((bp) arrayList.get(R));
                        }
                    }
                    view.invalidate();
                    break;
                }
                break;
            case 12:
                ug.l0 l0Var2 = (ug.l0) obj2;
                l0Var2.B1((g3) obj);
                ((xd) obj3).n0.showDialog(l0Var2);
                break;
            case 13:
                bn bnVar = (bn) obj3;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = bnVar.getMessagesController().l1(bnVar.l6);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((v1) obj2).a;
                bnVar.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                rj rjVar = bnVar.a0;
                if (rjVar != null) {
                    rjVar.setFieldText(null);
                    break;
                }
                break;
            case 14:
                bn bnVar2 = (bn) obj3;
                xy b10 = xy.b((String) obj2, bnVar2.l6, bnVar2.F5, bnVar2.m4, null, false, null, null, null, true, 0, 0, null, false);
                b10.K = bnVar2.Y8();
                b10.Q = ((Long) obj).longValue();
                b10.R = bnVar2.j9();
                b10.T = bnVar2.y5;
                bnVar2.getSendMessagesHelper().r0(b10);
                bnVar2.a0.setFieldText("");
                bnVar2.D9(false);
                break;
            case 15:
                bn bnVar3 = (bn) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l10 = (Long) obj;
                if (bnVar3.g4 == 1) {
                    b5.J(bnVar3.getParentActivity(), bnVar3.l6, new z6(bnVar3, botInlineResult, l10, i13), bnVar3.Ba);
                    break;
                } else {
                    bnVar3.Hb(botInlineResult, true, 0, l10.longValue());
                    break;
                }
            case 16:
                ((bn) obj3).Jb = true;
                ((k9) obj2).run();
                break;
            case 17:
                bn.h0((bn) obj3, (uy0[]) obj2, (y60) obj);
                break;
            case 18:
                bn bnVar4 = (bn) obj3;
                u1[] u1VarArr = (u1[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    u1VarArr[0].dismiss();
                } catch (Throwable unused2) {
                }
                u1VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        f3.n(null, 2131746964, lc.b0(bnVar4), R.raw.timer_toast, 24);
                        break;
                    } else {
                        new vh.h(bnVar4.getParentActivity(), bnVar4.Ba, tL_statsPollStats).show();
                        break;
                    }
                }
                break;
            case 19:
                bn bnVar5 = (bn) obj3;
                fj fjVar = (fj) obj2;
                bnVar5.getClass();
                TLRPC.SuggestedPost c10 = ((kj) obj).c();
                if (fjVar != null && fjVar.k != null) {
                    bnVar5.getMessagesController().h(fjVar, c10);
                    break;
                }
                break;
            case 20:
                v1 v1Var = (v1) obj2;
                String str13 = (String) obj;
                bn bnVar6 = ((ti) obj3).b;
                if (v1Var != null) {
                    i7 = ((h2) bnVar6).currentAccount;
                    w1.f(i7).k(v1Var.a, str13);
                }
                bnVar6.f4 = str13;
                bnVar6.p1.setTitle(str13);
                break;
            case 21:
                fj fjVar2 = (fj) obj2;
                Long l11 = (Long) obj;
                bn bnVar7 = ((mm) obj3).a;
                if (bnVar7.u7()) {
                    xy b11 = xy.b(fjVar2.C0(), bnVar7.l6, bnVar7.F5, bnVar7.m4, null, false, null, null, null, true, 0, 0, null, false);
                    b11.K = bnVar7.Y8();
                    b11.W = l11.longValue();
                    bnVar7.getSendMessagesHelper().r0(b11);
                    break;
                }
                break;
            case 22:
                q1 q1Var = (q1) obj2;
                bn bnVar8 = ((mm) obj3).a;
                if (((Boolean) obj).booleanValue()) {
                    while (i14 < bnVar8.A0.getChildCount()) {
                        View childAt = bnVar8.A0.getChildAt(i14);
                        if (childAt instanceof q1) {
                            q1 q1Var2 = (q1) childAt;
                            if (q1Var2.getMessageObject() != null && q1Var2.getMessageObject().p4()) {
                                q1Var2.J3();
                            }
                        }
                        i14++;
                    }
                    break;
                } else {
                    if (q1Var.getMessageObject() != null) {
                        q1Var.getMessageObject().t2 = Boolean.FALSE;
                    }
                    q1Var.J3();
                    break;
                }
                break;
            case 23:
                mm mmVar = (mm) obj3;
                d dVar2 = (d) obj2;
                bn bnVar9 = mmVar.a;
                if (((Boolean) obj).booleanValue()) {
                    bnVar9.getMessagesController().Q4(true);
                    lc.b0(bnVar9).P(R.raw.chats_infotip, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(gd.M0(2131745379, null), new ul(mmVar, i11)), true)).k(true);
                    dVar2.a(Boolean.TRUE);
                    break;
                } else {
                    lc.b0(bnVar9).I(R.raw.error, gd.M0(2131754309, null), gd.M0(2131754310, null)).j();
                    break;
                }
            case 24:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((mm) obj3).a.getMessagesController().v(message.id, -1, n5.o(message.peer_id), (String) obj, true);
                break;
            case 25:
                en enVar = (en) obj3;
                enVar.f.s(((TLRPC.WallPaper) obj2).settings.intensity, ((gg.a) obj).a);
                View view2 = enVar.b;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.k0 k0Var2 = (org.telegram.ui.Components.k0) obj3;
                String str14 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                k0Var2.getClass();
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    String replace = str14.replace("️", "");
                    int i23 = 0;
                    while (true) {
                        if (i23 < tL_messages_stickerSet.packs.size()) {
                            if (tL_messages_stickerSet.packs.get(i23).documents.isEmpty() || !TextUtils.equals(tL_messages_stickerSet.packs.get(i23).emoticon.replace("️", ""), replace)) {
                                i23++;
                            } else {
                                long longValue = tL_messages_stickerSet.packs.get(i23).documents.get(0).longValue();
                                for (int i24 = 0; i24 < tL_messages_stickerSet.documents.size(); i24++) {
                                    if (tL_messages_stickerSet.documents.get(i24).id == longValue) {
                                        document = tL_messages_stickerSet.documents.get(i24);
                                    }
                                }
                            }
                        }
                    }
                    document = null;
                    if (document != null) {
                        k0Var2.h.m(fc.b(document), "24_24", fc.c(w7.w(document.thumbs, 24, false, null, false), document), "24_24", j6.g(str14), null);
                        break;
                    }
                }
                break;
            case 27:
                Long l12 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((ff) obj3).a;
                long j10 = chatActivityEnterView.E3;
                fj fjVar3 = chatActivityEnterView.H3;
                threadMessage = chatActivityEnterView.getThreadMessage();
                xy b12 = xy.b((String) obj2, j10, fjVar3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                bn bnVar10 = chatActivityEnterView.D3;
                b12.K = bnVar10 != null ? bnVar10.Y8() : null;
                b12.O = chatActivityEnterView.N6;
                b12.Q = l12.longValue();
                b12.R = chatActivityEnterView.getSendMonoForumPeerId();
                b12.T = chatActivityEnterView.getSendMessageSuggestionParams();
                zy.C(chatActivityEnterView.R).r0(b12);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.n0.c();
                re reVar = chatActivityEnterView.K0;
                chatActivityEnterView.N6 = 0L;
                reVar.setEffect(0L);
                break;
            case 28:
                si siVar = (si) obj3;
                li liVar = (li) obj2;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i25 = siVar.H3;
                tL_messages_toggleBotInAttachMenu.bot = mp.u1(i25).q1(liVar.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i25).sendRequest(tL_messages_toggleBotInAttachMenu, new u7(14, siVar, liVar), 66);
                break;
            default:
                si siVar2 = (si) obj3;
                ((bn) obj2).y5 = (kj) obj;
                boolean v12 = siVar2.v1(true, 0, 0, siVar2.L2, siVar2.g1());
                df dfVar = siVar2.c2;
                if (dfVar != null) {
                    dfVar.h(!v12);
                    siVar2.c2 = null;
                    break;
                }
                break;
        }
    }
}
