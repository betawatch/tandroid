package ki;

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
import bi.r6;
import c8.na;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bp;
import org.telegram.messenger.bz;
import org.telegram.messenger.cp;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j6;
import org.telegram.messenger.kj;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.messenger.w10;
import org.telegram.messenger.w7;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a7;
import org.telegram.ui.bn;
import org.telegram.ui.en;
import org.telegram.ui.g4;
import org.telegram.ui.gc;
import org.telegram.ui.hc;
import org.telegram.ui.mm;
import org.telegram.ui.qc;
import org.telegram.ui.rj;
import org.telegram.ui.ti;
import org.telegram.ui.ty0;
import org.telegram.ui.u5;
import org.telegram.ui.ul;
import org.telegram.ui.v7;
import org.telegram.ui.xd;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class n2 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n2(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        oi.r a10;
        org.telegram.ui.web.u1 u1Var;
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
                ((o2) obj3).d.E.G((String) obj2, (String) obj, false);
                break;
            case 1:
                li.f fVar = (li.f) obj3;
                fVar.getClass();
                fVar.b0(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                break;
            case 2:
                li.f fVar2 = (li.f) obj3;
                fVar2.getClass();
                fVar2.a0((String) obj2, ((Boolean) obj).booleanValue());
                break;
            case 3:
                li.c0 c0Var = (li.c0) obj3;
                c0Var.L0((TLRPC.Chat) obj2, c0Var.p1, ((Boolean) obj).booleanValue());
                break;
            case 4:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str6 = (String) obj;
                oi.t3 t3Var = ((oi.p) obj3).r;
                if (pageblockmath != null) {
                    pageblockmath.source = str6;
                    t3Var.g3.O(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str6;
                    t3Var.V1(pageblockmath2);
                    break;
                }
            case 5:
                oi.f1 f1Var = (oi.f1) obj3;
                oi.r rVar = (oi.r) obj2;
                String str7 = (String) obj;
                f1Var.getClass();
                if (!TextUtils.isEmpty(str7)) {
                    Editable text = f1Var.getText();
                    int spanStart = text.getSpanStart(rVar);
                    int spanEnd = text.getSpanEnd(rVar);
                    if (spanStart >= 0 && spanEnd >= 0 && (a10 = oi.r.a(str7, f1Var.getCurrentTextColor(), org.telegram.messenger.g0.L(bz.W0 + 4))) != null) {
                        boolean z10 = f1Var.m2;
                        if (z10) {
                            f1Var.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a10, 0, 1, 33);
                        int max = Math.max(0, Math.min(spanStart, f1Var.length()));
                        text.replace(max, Math.max(max, Math.min(spanEnd, f1Var.length())), spannableString);
                        f1Var.setSelection(Math.min(max + 1, f1Var.length()));
                        if (z10) {
                            f1Var.setLocked(true);
                            break;
                        }
                    }
                }
                break;
            case 6:
                oi.b2 b2Var = (oi.b2) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str8 = (String) obj;
                b2Var.getClass();
                if (pageblockmath3 != null) {
                    pageblockmath3.source = str8;
                    b2Var.Q.g3.O(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                    pageblockmath4.source = str8;
                    b2Var.Q.V1(pageblockmath4);
                    break;
                }
            case 7:
                oi.t3 t3Var2 = (oi.t3) obj3;
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                String str9 = (String) obj;
                t3Var2.getClass();
                if (!TextUtils.equals(str9, pageblockmath5.source)) {
                    oi.g2 g2Var = t3Var2.R3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    pageblockmath5.source = str9;
                    t3Var2.g3.O(false);
                    oi.g2 g2Var2 = t3Var2.R3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                    t3Var2.p3.onContentChanged();
                    break;
                }
                break;
            case 8:
                ((VoIPDebugToSend) obj3).lambda$done$0((TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                break;
            case 9:
                g4 g4Var = (g4) obj3;
                Activity activity = (Activity) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.t3 t3Var3 = g4Var.L;
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
                        String u10 = org.telegram.ui.web.v0.u(str4);
                        g4Var.Y(new zo0(g4Var.M, null, u10, false, u10, false, org.telegram.messenger.g0.B(g4Var.i0.getBackgroundColor()) < 0.721f ? new fi.b() : null));
                        break;
                    } else {
                        int i16 = 6;
                        if (num.intValue() == 6) {
                            if (!g4Var.v0[0].f()) {
                                org.telegram.ui.k3 k3Var = g4Var.v0[0];
                                TLRPC.WebPage webPage2 = k3Var.c.F;
                                if (webPage2 != null) {
                                    str3 = webPage2.url;
                                    frameLayout = k3Var;
                                }
                            } else if (g4Var.v0[0].getWebView() != null) {
                                str3 = g4Var.v0[0].getWebView().getUrl();
                                frameLayout = g4Var.v0[0].f;
                            }
                            g4.d(str3, g4Var.Y, frameLayout, t3Var3, null);
                            break;
                        } else {
                            int i17 = 7;
                            if (num.intValue() == 7) {
                                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                                e2Var.a = true;
                                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                if (T != null) {
                                    T.showAsSheet(new org.telegram.ui.web.m(t3Var3 != null ? new org.telegram.ui.z(g4Var, i16) : null, new org.telegram.ui.q(g4Var, i13)), e2Var);
                                    break;
                                }
                            } else {
                                int i18 = 3;
                                if (num.intValue() == 8) {
                                    org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2();
                                    e2Var2.a = true;
                                    org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                                    if (T2 != null) {
                                        T2.showAsSheet(new org.telegram.ui.web.x0(t3Var3 != null ? new org.telegram.ui.z(g4Var, i17) : null, new org.telegram.ui.q(g4Var, i18)), e2Var2);
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
                                            Pattern pattern = a90.a;
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
                                                b5.l0(activity, null, str, true, new r6(12, xVar, wVar));
                                                break;
                                            }
                                        }
                                    }
                                } else if (num.intValue() == 4) {
                                    if (g4Var.v0[0].f()) {
                                        org.telegram.ui.ActionBar.g2 T3 = LaunchActivity.T();
                                        if (T3 != null) {
                                            org.telegram.ui.ActionBar.e2 e2Var3 = new org.telegram.ui.ActionBar.e2();
                                            e2Var3.a = true;
                                            T3.showAsSheet(new org.telegram.ui.web.n1(new org.telegram.ui.q(g4Var, i18)), e2Var3);
                                            break;
                                        }
                                    } else {
                                        org.telegram.ui.ActionBar.w2 j3 = m10.j(g4Var.M, false, 1, null);
                                        j3.v0 = false;
                                        LinearLayout linearLayout = new LinearLayout(g4Var.M);
                                        linearLayout.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
                                        linearLayout.setOrientation(1);
                                        o4 o4Var = new o4(g4Var.M, (i6) null);
                                        o4Var.setText(gd.N0(2131750592, null));
                                        linearLayout.addView(o4Var, na.t(-2, -2, 51, 3, 1, 3, 0));
                                        linearLayout.addView(new org.telegram.ui.c4(g4Var, g4Var.M), na.t(-1, -2, 51, 3, 0, 3, 0));
                                        o4 o4Var2 = new o4(g4Var.M, (i6) null);
                                        o4Var2.setText(gd.N0(2131750587, null));
                                        linearLayout.addView(o4Var2, na.t(-2, -2, 51, 3, 4, 3, 2));
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
                                            k0Var.addView(radioButton, na.d(22, 22.0f, (z11 ? 5 : 3) | 48, z11 ? 0 : 22, 13.0f, z11 ? 22 : 0, 0.0f));
                                            TextView textView = new TextView(activity3);
                                            u6.U(textView, n6.G6, null);
                                            m10.q(textView, 1, 16.0f, 1, 1);
                                            textView.setSingleLine(true);
                                            textView.setGravity((gd.a0 ? 5 : 3) | 16);
                                            boolean z12 = gd.a0;
                                            k0Var.addView(textView, na.d(-1, -1.0f, (z12 ? 5 : 3) | 48, z12 ? 17 : 62, 0.0f, z12 ? 62 : 17, 0.0f));
                                            k0VarArr[i19] = k0Var;
                                            if (i19 == 0) {
                                                String N0 = gd.N0(2131751588, null);
                                                Typeface typeface = Typeface.DEFAULT;
                                                textView.setText(N0);
                                                textView.setTypeface(typeface);
                                                k0Var.setContentDescription(N0);
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
                                            linearLayout.addView(k0VarArr[i19], na.o(-1, 50));
                                            i19++;
                                            i13 = 2;
                                        }
                                        j3.O = linearLayout;
                                        g4Var.J = j3;
                                        g4Var.Y(j3);
                                        break;
                                    }
                                } else if (num.intValue() != 5) {
                                    if (num.intValue() == 10 && (u1Var = g4Var.v0[0].F) != null && u1Var.b() != null) {
                                        g4Var.f(u1Var.b(), null, 1);
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
            case 10:
                org.telegram.ui.k3 k3Var2 = (org.telegram.ui.k3) obj3;
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
                            org.telegram.ui.web.s0 webView = k3Var2.getWebView();
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
            case 11:
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
                hi.e eVar = qcVar.Q;
                if (eVar != null) {
                    eVar.setLoading(false);
                    break;
                }
                break;
            case 12:
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
            case 13:
                ug.k0 k0Var2 = (ug.k0) obj2;
                k0Var2.B1((org.telegram.messenger.g3) obj);
                ((xd) obj3).n0.showDialog(k0Var2);
                break;
            case 14:
                bn bnVar = (bn) obj3;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = bnVar.getMessagesController().l1(bnVar.l6);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((kg.v1) obj2).a;
                bnVar.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                rj rjVar = bnVar.a0;
                if (rjVar != null) {
                    rjVar.setFieldText(null);
                    break;
                }
                break;
            case 15:
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
            case 16:
                bn bnVar3 = (bn) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l10 = (Long) obj;
                if (bnVar3.g4 == 1) {
                    b5.J(bnVar3.getParentActivity(), bnVar3.l6, new a7(bnVar3, botInlineResult, l10, i13), bnVar3.Ba);
                    break;
                } else {
                    bnVar3.Hb(botInlineResult, true, 0, l10.longValue());
                    break;
                }
            case 17:
                ((bn) obj3).Jb = true;
                ((u5) obj2).run();
                break;
            case 18:
                bn.h0((bn) obj3, (ty0[]) obj2, (x60) obj);
                break;
            case 19:
                bn bnVar4 = (bn) obj3;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    t1VarArr[0].dismiss();
                } catch (Throwable unused2) {
                }
                t1VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.f3.n(null, 2131746963, kc.b0(bnVar4), R.raw.timer_toast, 24);
                        break;
                    } else {
                        new vh.h(bnVar4.getParentActivity(), bnVar4.Ba, tL_statsPollStats).show();
                        break;
                    }
                }
                break;
            case 20:
                bn bnVar5 = (bn) obj3;
                fj fjVar = (fj) obj2;
                bnVar5.getClass();
                TLRPC.SuggestedPost c10 = ((kj) obj).c();
                if (fjVar != null && fjVar.k != null) {
                    bnVar5.getMessagesController().h(fjVar, c10);
                    break;
                }
                break;
            case 21:
                kg.v1 v1Var = (kg.v1) obj2;
                String str13 = (String) obj;
                bn bnVar6 = ((ti) obj3).b;
                if (v1Var != null) {
                    i7 = ((org.telegram.ui.ActionBar.g2) bnVar6).currentAccount;
                    kg.w1.f(i7).k(v1Var.a, str13);
                }
                bnVar6.f4 = str13;
                bnVar6.p1.setTitle(str13);
                break;
            case 22:
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
            case 23:
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) obj2;
                bn bnVar8 = ((mm) obj3).a;
                if (((Boolean) obj).booleanValue()) {
                    while (i14 < bnVar8.A0.getChildCount()) {
                        View childAt = bnVar8.A0.getChildAt(i14);
                        if (childAt instanceof org.telegram.ui.Cells.r1) {
                            org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) childAt;
                            if (r1Var2.getMessageObject() != null && r1Var2.getMessageObject().p4()) {
                                r1Var2.J3();
                            }
                        }
                        i14++;
                    }
                    break;
                } else {
                    if (r1Var.getMessageObject() != null) {
                        r1Var.getMessageObject().t2 = Boolean.FALSE;
                    }
                    r1Var.J3();
                    break;
                }
                break;
            case 24:
                mm mmVar = (mm) obj3;
                n2 n2Var = (n2) obj2;
                bn bnVar9 = mmVar.a;
                if (((Boolean) obj).booleanValue()) {
                    bnVar9.getMessagesController().Q4(true);
                    kc.b0(bnVar9).P(R.raw.chats_infotip, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(gd.N0(2131745378, null), new ul(mmVar, i11)), true)).k(true);
                    n2Var.a(Boolean.TRUE);
                    break;
                } else {
                    kc.b0(bnVar9).I(R.raw.error, gd.N0(2131754308, null), gd.N0(2131754309, null)).j();
                    break;
                }
            case 25:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((mm) obj3).a.getMessagesController().v(message.id, -1, n5.o(message.peer_id), (String) obj, true);
                break;
            case 26:
                en enVar = (en) obj3;
                enVar.f.s(((TLRPC.WallPaper) obj2).settings.intensity, ((gg.a) obj).a);
                View view2 = enVar.b;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.k0 k0Var3 = (org.telegram.ui.Components.k0) obj3;
                String str14 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                k0Var3.getClass();
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
                        k0Var3.h.m(fc.b(document), "24_24", fc.c(w7.w(document.thumbs, 24, false, null, false), document), "24_24", j6.g(str14), null);
                        break;
                    }
                }
                break;
            case 28:
                Long l12 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((gf) obj3).a;
                long j10 = chatActivityEnterView.G3;
                fj fjVar3 = chatActivityEnterView.J3;
                threadMessage = chatActivityEnterView.getThreadMessage();
                xy b12 = xy.b((String) obj2, j10, fjVar3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                bn bnVar10 = chatActivityEnterView.F3;
                b12.K = bnVar10 != null ? bnVar10.Y8() : null;
                b12.O = chatActivityEnterView.P6;
                b12.Q = l12.longValue();
                b12.R = chatActivityEnterView.getSendMonoForumPeerId();
                b12.T = chatActivityEnterView.getSendMessageSuggestionParams();
                zy.C(chatActivityEnterView.R).r0(b12);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.n0.c();
                se seVar = chatActivityEnterView.K0;
                chatActivityEnterView.P6 = 0L;
                seVar.setEffect(0L);
                break;
            default:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) obj3;
                mi miVar = (mi) obj2;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i25 = tiVar.H3;
                tL_messages_toggleBotInAttachMenu.bot = mp.u1(i25).q1(miVar.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i25).sendRequest(tL_messages_toggleBotInAttachMenu, new v7(14, tiVar, miVar), 66);
                break;
        }
    }
}
