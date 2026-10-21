package org.telegram.ui.ActionBar;

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
import java.io.File;
import java.net.URLEncoder;
import java.util.LinkedHashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.mk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.ol;
import org.telegram.ui.Components.ql;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xe;
import org.telegram.ui.Components.xv;
import org.telegram.ui.Components.yt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bd;
import org.telegram.ui.cn;
import org.telegram.ui.e7;
import org.telegram.ui.fj;
import org.telegram.ui.fk;
import org.telegram.ui.ie;
import org.telegram.ui.nm;
import org.telegram.ui.qc;
import org.telegram.ui.qn;
import org.telegram.ui.rc;
import org.telegram.ui.t21;
import org.telegram.ui.tn;
import org.telegram.ui.vc;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        qn qnVar;
        fk fkVar;
        org.telegram.ui.web.f2 f2Var;
        String str;
        String str2;
        File file;
        String str3;
        FrameLayout frameLayout;
        String str4;
        int i11;
        MessageObject threadMessage;
        switch (this.a) {
            case 0:
                n3 n3Var = (n3) this.c;
                m3 m3Var = (m3) this.b;
                n2 n2Var = (n2) obj;
                if (n2Var != null) {
                    if ((n2Var instanceof qn) && (fkVar = (qnVar = (qn) n2Var).Y) != null) {
                        fkVar.N();
                        qnVar.Y.l0(true, false, true);
                    }
                    if (n2Var.getContext() != null && n2Var.getParentActivity() != null) {
                        gi.d3 d3Var = new gi.d3(n2Var.getContext(), n2Var.getResourceProvider());
                        d3Var.k0 = n2Var.getParentActivity();
                        if (m3Var != null && m3Var.a != null) {
                            d3Var.E0 = true;
                            boolean z10 = m3Var.o;
                            d3Var.V = z10;
                            if (z10) {
                                d3Var.w(m3Var.r, false);
                            }
                            if (m3Var.n) {
                                i10 = m3Var.q;
                            } else {
                                int i12 = m3Var.p;
                                if (i12 < 0) {
                                    i12 = h6.d6;
                                }
                                i10 = h6.w0(i12, d3Var.E);
                            }
                            d3Var.u(i10, m3Var.n, false);
                            d3Var.z(m3Var.s, false);
                            d3Var.F0 = m3Var.j;
                            d3Var.G0 = m3Var.k;
                            boolean z11 = m3Var.u;
                            d3Var.w0 = z11;
                            gi.v2 v2Var = d3Var.x;
                            v2Var.setIsBackButtonVisible(z11);
                            d3Var.v.setAllowSwipes(m3Var.l);
                            AndroidUtilities.updateImageViewImageAnimated(d3Var.W.getBackButton(), d3Var.w0 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
                            BotFullscreenButtons botFullscreenButtons = d3Var.m0;
                            if (botFullscreenButtons != null) {
                                botFullscreenButtons.setBack(d3Var.w0, false);
                            }
                            d3Var.r0 = m3Var.y;
                            d3Var.z0 = Boolean.valueOf(m3Var.B);
                            d3Var.A0 = m3Var.C;
                            gi.y0 y0Var = m3Var.K;
                            d3Var.B0 = y0Var;
                            if (y0Var != null) {
                                gi.w0 w0Var = y0Var.r;
                                SensorManager sensorManager = y0Var.a;
                                if (y0Var.l) {
                                    y0Var.l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = y0Var.b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(y0Var.n, sensor, gi.y0.a(y0Var.c));
                                        }
                                        Sensor sensor2 = y0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(y0Var.p, sensor2, gi.y0.a(y0Var.e));
                                        }
                                        Sensor sensor3 = y0Var.g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(w0Var, sensor3, gi.y0.a(y0Var.h));
                                        }
                                        Sensor sensor4 = y0Var.f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(w0Var, sensor4, gi.y0.a(y0Var.h));
                                        }
                                        Sensor sensor5 = y0Var.i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(y0Var.t, sensor5, gi.y0.a(y0Var.j));
                                        }
                                    }
                                }
                            }
                            a5.a aVar = m3Var.w;
                            if (aVar != null) {
                                gi.z2 z2Var = d3Var.l0;
                                int totalHeight = z2Var.getTotalHeight();
                                z2Var.e = aVar;
                                gi.u[] uVarArr = z2Var.f;
                                gi.w.b(uVarArr[0].l, (gi.v) aVar.c, false);
                                gi.w.b(uVarArr[1].l, (gi.v) aVar.d, false);
                                z2Var.invalidate();
                                if (totalHeight != z2Var.getTotalHeight() && z2Var.r != null) {
                                    if (totalHeight < z2Var.getTotalHeight()) {
                                        AndroidUtilities.runOnUIThread(z2Var.r, 200L);
                                    } else {
                                        z2Var.r.run();
                                    }
                                }
                                int i13 = aVar.b;
                                Paint paint = z2Var.a;
                                z2Var.e.b = i13;
                                paint.setColor(i13);
                                z2Var.d.a(i13, true);
                            }
                            d3Var.y(m3Var.z, false, m3Var.A);
                            gi.t4 t4Var = m3Var.a;
                            d3Var.G = t4Var != null ? t4Var.a : UserConfig.selectedAccount;
                            org.telegram.ui.web.x0 x0Var = m3Var.b;
                            if (x0Var != null) {
                                x0Var.onResume();
                                v2Var.N(d3Var.G, m3Var.b, m3Var.d, m3Var.f, m3Var.e);
                                boolean z12 = m3Var.t || m3Var.b.b;
                                String str5 = m3Var.x;
                                v2Var.g("setState(" + z12 + ", " + str5 + ")");
                                v2Var.N = z12;
                                v2Var.b = str5;
                                if (h6.I.q() != m3Var.D) {
                                    v2Var.z();
                                }
                            } else {
                                t4Var.q = null;
                                t4Var.r = 0L;
                            }
                            d3Var.t(n2Var, m3Var.a);
                            d3Var.b0 = m3Var.v;
                            if (m3Var.G) {
                                d3Var.S0 = true;
                                d3Var.i();
                                org.telegram.ui.f3 f3Var = d3Var.U0;
                                String userName = d3Var.m() ? d3Var.v0.e : UserObject.getUserName(MessagesController.getInstance(d3Var.G).getUser(Long.valueOf(d3Var.H)));
                                String str6 = m3Var.H;
                                d3Var.T0 = str6;
                                f3Var.a(userName, str6);
                                org.telegram.ui.f3 f3Var2 = d3Var.U0;
                                Paint paint2 = d3Var.P;
                                f3Var2.b(AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f, false);
                                d3Var.U0.setBackgroundColor(paint2.getColor());
                                d3Var.U0.setVisibility(0);
                                d3Var.U0.setAlpha(1.0f);
                            }
                            d3Var.p(m3Var.L);
                            n3Var.h(n3Var.w, m3Var, false);
                            d3Var.show();
                            break;
                        }
                    }
                }
                break;
            case 1:
                m3 m3Var2 = (m3) this.b;
                t3 t3Var = (t3) this.c;
                m3Var2.m = (Bitmap) obj;
                t3Var.getWindowView().setDrawingFromOverlay(false);
                t3Var.release();
                break;
            case 2:
                s3 s3Var = (s3) this.c;
                v3 v3Var = (v3) this.b;
                w3 w3Var = s3Var.p;
                if (((Boolean) obj).booleanValue()) {
                    v3Var.a(1.0f);
                    if (w3Var.a.getTabs().isEmpty()) {
                        w3Var.a(false);
                        break;
                    }
                } else {
                    v3Var.a(0.0f);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.c;
                Activity activity = (Activity) this.b;
                Integer num = (Integer) obj;
                org.telegram.ui.x3 x3Var = l4Var.K;
                org.telegram.ui.m0[] m0VarArr = l4Var.S0;
                if ((!l4Var.u0[0].c() || l4Var.u0[0].c.E != null) && l4Var.L != null) {
                    if (num.intValue() == 1) {
                        org.telegram.ui.n0 n0Var = l4Var.h0;
                        int dp = AndroidUtilities.dp(56.0f);
                        l4Var.I0 = dp;
                        n0Var.setHeight(dp);
                        l4Var.h0.h(true);
                        break;
                    } else {
                        if (num.intValue() == 2) {
                            if (!l4Var.u0[0].f()) {
                                TLRPC.WebPage webPage = l4Var.u0[0].c.E;
                                if (webPage != null) {
                                    str4 = webPage.url;
                                }
                            } else if (l4Var.u0[0].getWebView() != null) {
                                str4 = l4Var.u0[0].getWebView().getUrl();
                            }
                            String u10 = org.telegram.ui.web.a1.u(str4);
                            l4Var.a0(new fr0(l4Var.L, null, u10, false, u10, false, AndroidUtilities.computePerceivedBrightness(l4Var.h0.getBackgroundColor()) < 0.721f ? new ci.b() : null));
                            break;
                        } else if (num.intValue() == 6) {
                            if (!l4Var.u0[0].f()) {
                                org.telegram.ui.o3 o3Var = l4Var.u0[0];
                                TLRPC.WebPage webPage2 = o3Var.c.E;
                                if (webPage2 != null) {
                                    str3 = webPage2.url;
                                    frameLayout = o3Var;
                                }
                            } else if (l4Var.u0[0].getWebView() != null) {
                                str3 = l4Var.u0[0].getWebView().getUrl();
                                frameLayout = l4Var.u0[0].f;
                            }
                            org.telegram.ui.l4.f(str3, l4Var.X, frameLayout, x3Var, null);
                            break;
                        } else if (num.intValue() == 7) {
                            l2 l2Var = new l2();
                            l2Var.a = true;
                            n2 U = LaunchActivity.U();
                            if (U != null) {
                                U.showAsSheet(new org.telegram.ui.web.p(x3Var != null ? new org.telegram.ui.b0(l4Var, 5) : null, new org.telegram.ui.r(l4Var, 2)), l2Var);
                                break;
                            }
                        } else if (num.intValue() == 8) {
                            l2 l2Var2 = new l2();
                            l2Var2.a = true;
                            n2 U2 = LaunchActivity.U();
                            if (U2 != null) {
                                U2.showAsSheet(new org.telegram.ui.web.f1(x3Var != null ? new org.telegram.ui.b0(l4Var, 6) : null, new org.telegram.ui.r(l4Var, 3)), l2Var2);
                                break;
                            }
                        } else if (num.intValue() == 9) {
                            if (l4Var.u0[0].getWebView() != null) {
                                l4Var.u0[0].getWebView().goForward();
                                break;
                            }
                        } else if (num.intValue() == 3) {
                            if (!l4Var.u0[0].f()) {
                                TLRPC.WebPage webPage3 = l4Var.u0[0].c.E;
                                if (webPage3 != null) {
                                    String str7 = webPage3.url;
                                    TL_iv.Page page = webPage3.cached_page;
                                    if (page != null) {
                                        file = page.local;
                                        str = str7;
                                        str2 = null;
                                    } else {
                                        str = str7;
                                        str2 = null;
                                        file = null;
                                    }
                                }
                            } else if (l4Var.u0[0].getWebView() != null) {
                                str = l4Var.u0[0].getWebView().getUrl();
                                str2 = l4Var.u0[0].getWebView().getOpenURL();
                                file = null;
                            }
                            Activity activity2 = l4Var.L;
                            if (activity2 != null && !activity2.isFinishing()) {
                                if (file != null) {
                                    AndroidUtilities.openForView(file, null, "text/markdown", l4Var.L, null, true);
                                    break;
                                } else if (str != null) {
                                    String hostAuthority = AndroidUtilities.getHostAuthority(str2, true);
                                    String hostAuthority2 = AndroidUtilities.getHostAuthority(str, true);
                                    org.telegram.ui.y yVar = new org.telegram.ui.y(l4Var, str, 1);
                                    org.telegram.ui.z zVar = new org.telegram.ui.z(l4Var, hostAuthority2, hostAuthority, 1);
                                    if (!l4Var.u0[0].f() || !MessagesController.getInstance(l4Var.X).isWebBrowserOpenInApp(hostAuthority2) || MessagesController.getInstance(l4Var.X).isWebBrowserExceptionsLimitReached(true)) {
                                        yVar.run();
                                        break;
                                    } else {
                                        org.telegram.ui.Components.f5.n0(activity, null, str, true, new ai.r5(8, zVar, yVar));
                                        break;
                                    }
                                }
                            }
                        } else if (num.intValue() == 4) {
                            if (l4Var.u0[0].f()) {
                                n2 U3 = LaunchActivity.U();
                                if (U3 != null) {
                                    l2 l2Var3 = new l2();
                                    l2Var3.a = true;
                                    U3.showAsSheet(new org.telegram.ui.web.x1(new org.telegram.ui.r(l4Var, 3)), l2Var3);
                                    break;
                                }
                            } else {
                                f3 f3Var3 = new f3(1, (Context) l4Var.L, (d6) null, false);
                                f3Var3.fixNavigationBar();
                                f3Var3.applyTopPadding = false;
                                LinearLayout linearLayout = new LinearLayout(l4Var.L);
                                linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                                linearLayout.setOrientation(1);
                                org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(l4Var.L, (d6) null);
                                l4Var2.setText(LocaleController.getString(R.string.FontSize));
                                linearLayout.addView(l4Var2, w7.z5.t(-2, -2, 51, 3, 1, 3, 0));
                                linearLayout.addView(new org.telegram.ui.g4(l4Var, l4Var.L), w7.z5.t(-1, -2, 51, 3, 0, 3, 0));
                                org.telegram.ui.Cells.l4 l4Var3 = new org.telegram.ui.Cells.l4(l4Var.L, (d6) null);
                                l4Var3.setText(LocaleController.getString(R.string.FontType));
                                linearLayout.addView(l4Var3, w7.z5.t(-2, -2, 51, 3, 4, 3, 2));
                                int i14 = 0;
                                for (int i15 = 2; i14 < i15; i15 = 2) {
                                    Activity activity3 = l4Var.L;
                                    org.telegram.ui.m0 m0Var = new org.telegram.ui.m0(activity3);
                                    m0Var.setBackgroundDrawable(h6.g0(h6.x0(null, h6.i6, false), i15, -1));
                                    RadioButton radioButton = new RadioButton(activity3);
                                    m0Var.b = radioButton;
                                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                                    radioButton.b(h6.x0(null, h6.D5, false), h6.x0(null, h6.E5, false));
                                    boolean z13 = LocaleController.isRTL;
                                    m0Var.addView(radioButton, w7.z5.d(22, 22.0f, (z13 ? 5 : 3) | 48, z13 ? 0 : 22, 13.0f, z13 ? 22 : 0, 0.0f));
                                    TextView textView = new TextView(activity3);
                                    mk.u(textView, h6.x0(null, h6.G6, false), 1, 16.0f, 1);
                                    textView.setMaxLines(1);
                                    textView.setSingleLine(true);
                                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                                    boolean z14 = LocaleController.isRTL;
                                    m0Var.addView(textView, w7.z5.d(-1, -1.0f, (z14 ? 5 : 3) | 48, z14 ? 17 : 62, 0.0f, z14 ? 62 : 17, 0.0f));
                                    m0VarArr[i14] = m0Var;
                                    if (i14 == 0) {
                                        String string = LocaleController.getString(R.string.Default);
                                        Typeface typeface = Typeface.DEFAULT;
                                        textView.setText(string);
                                        textView.setTypeface(typeface);
                                        m0Var.setContentDescription(string);
                                        m0Var.invalidate();
                                    } else if (i14 == 1) {
                                        Typeface typeface2 = Typeface.SERIF;
                                        textView.setText("Serif");
                                        textView.setTypeface(typeface2);
                                        m0Var.setContentDescription("Serif");
                                        m0Var.invalidate();
                                    }
                                    ((RadioButton) m0VarArr[i14].b).a(i14 == l4Var.a, false);
                                    m0VarArr[i14].setTag(Integer.valueOf(i14));
                                    m0VarArr[i14].setOnClickListener(new org.telegram.ui.s(l4Var, 4));
                                    linearLayout.addView(m0VarArr[i14], w7.z5.n(-1, 50));
                                    i14++;
                                }
                                f3Var3.customView = linearLayout;
                                l4Var.I = f3Var3;
                                l4Var.a0(f3Var3);
                                break;
                            }
                        } else if (num.intValue() != 5) {
                            if (num.intValue() == 10 && (f2Var = l4Var.u0[0].y) != null && f2Var.b() != null) {
                                l4Var.h(f2Var.b(), null, 1);
                                break;
                            }
                        } else if (l4Var.u0[0].f() && l4Var.u0[0].getWebView() != null) {
                            l4Var.u0[0].getWebView().reload();
                            break;
                        }
                    }
                }
                break;
            case 4:
                org.telegram.ui.o3 o3Var2 = (org.telegram.ui.o3) this.c;
                Activity activity4 = (Activity) this.b;
                String str8 = (String) obj;
                if (!TextUtils.isEmpty(str8) && o3Var2.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str8.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i16 = 0;
                    for (int i17 = 0; i17 < uRLSpanArr.length; i17++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i17]), length);
                        i16 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i17]), i16);
                    }
                    Uri uriParseSafe = Utilities.uriParseSafe(str8);
                    if (uriParseSafe == null || !TextUtils.equals(uriParseSafe.getScheme(), "javascript")) {
                        String str9 = null;
                        if ((uRLSpanArr.length <= 0 || length != 0 || i16 <= 0) && (uriParseSafe == null || uriParseSafe.getScheme() == null)) {
                            org.telegram.ui.web.k.b(activity4, str8);
                            org.telegram.ui.web.x0 webView = o3Var2.getWebView();
                            String str10 = org.telegram.ui.web.m1.a().b;
                            if (str10 != null) {
                                StringBuilder u11 = a1.g.u(str10);
                                u11.append(URLEncoder.encode(str8));
                                str9 = u11.toString();
                            }
                            webView.loadUrl(str9);
                            break;
                        } else {
                            if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                                str8 = pf.d.u(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                            }
                            o3Var2.getWebView().loadUrl(str8);
                            break;
                        }
                    }
                }
                break;
            case 5:
                bd bdVar = (bd) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                bdVar.c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i18 = tL_premium_boostsStatus.level;
                    bdVar.b = i18;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i18;
                    }
                }
                bdVar.X0(true);
                ei.d dVar = bdVar.P;
                if (dVar != null) {
                    dVar.setLoading(false);
                    break;
                }
                break;
            case 6:
                rc rcVar = (rc) this.c;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.b;
                View view = (View) obj;
                rcVar.getClass();
                if (view instanceof qc) {
                    qc qcVar = (qc) view;
                    qcVar.setBackgroundColor(h6.w0(h6.d6, rcVar.a));
                    rcVar.b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        qcVar.a(peerColors.colors.get(R));
                        break;
                    }
                }
                break;
            case 7:
                ie ieVar = (ie) this.c;
                sg.k0 k0Var = (sg.k0) this.b;
                k0Var.H1((ChannelBoostsController.CanApplyBoost) obj);
                ieVar.w0.showDialog(k0Var);
                break;
            case 8:
                qn qnVar2 = (qn) this.c;
                ig.z1 z1Var = (ig.z1) this.b;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = qnVar2.getMessagesController().getInputPeer(qnVar2.T5);
                tL_messages_sendQuickReplyMessages.shortcut_id = z1Var.a;
                qnVar2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                fk fkVar2 = qnVar2.Y;
                if (fkVar2 != null) {
                    fkVar2.setFieldText(null);
                    break;
                }
                break;
            case 9:
                qn qnVar3 = (qn) this.c;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) this.b, qnVar3.T5, qnVar3.n5, qnVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = qnVar3.H8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = qnVar3.S8();
                of2.suggestionParams = qnVar3.g5;
                qnVar3.getSendMessagesHelper().sendMessage(of2);
                qnVar3.Y.setFieldText("");
                qnVar3.j9(false);
                break;
            case 10:
                qn qnVar4 = (qn) this.c;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.b;
                Long l4 = (Long) obj;
                if (qnVar4.R3 == 1) {
                    org.telegram.ui.Components.f5.L(qnVar4.getParentActivity(), qnVar4.T5, new e7(qnVar4, botInlineResult, l4, 2), qnVar4.ea);
                    break;
                } else {
                    qnVar4.gb(botInlineResult, true, 0, l4.longValue());
                    break;
                }
            case 11:
                qn.k1((qn) this.c, (t21[]) this.b, (i80) obj);
                break;
            case 12:
                qn qnVar5 = (qn) this.c;
                org.telegram.ui.i0 i0Var = (org.telegram.ui.i0) this.b;
                qnVar5.jb = true;
                i0Var.run();
                break;
            case 13:
                qn qnVar6 = (qn) this.c;
                b2[] b2VarArr = (b2[]) this.b;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.g0.q(R.string.PollStatsWillLater, xc.a0(qnVar6), R.raw.timer_toast, 24);
                        break;
                    } else {
                        new uh.g(qnVar6.getParentActivity(), qnVar6.ea, tL_statsPollStats).show();
                        break;
                    }
                }
                break;
            case 14:
                qn qnVar7 = (qn) this.c;
                MessageObject messageObject = (MessageObject) this.b;
                qnVar7.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    qnVar7.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    break;
                }
                break;
            case 15:
                fj fjVar = (fj) this.c;
                ig.z1 z1Var2 = (ig.z1) this.b;
                String str11 = (String) obj;
                qn qnVar8 = fjVar.b;
                if (z1Var2 != null) {
                    i11 = qnVar8.currentAccount;
                    ig.a2.f(i11).k(z1Var2.a, str11);
                }
                qnVar8.Q3 = str11;
                qnVar8.a1.setTitle(str11);
                break;
            case 16:
                cn cnVar = (cn) this.c;
                MessageObject messageObject2 = (MessageObject) this.b;
                Long l10 = (Long) obj;
                qn qnVar9 = cnVar.a;
                if (qnVar9.i7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), qnVar9.T5, qnVar9.n5, qnVar9.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = qnVar9.H8();
                    of3.dice_stake = l10.longValue();
                    qnVar9.getSendMessagesHelper().sendMessage(of3);
                    break;
                }
                break;
            case 17:
                cn cnVar2 = (cn) this.c;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.b;
                qn qnVar10 = cnVar2.a;
                if (((Boolean) obj).booleanValue()) {
                    for (int i19 = 0; i19 < qnVar10.x0.getChildCount(); i19++) {
                        View childAt = qnVar10.x0.getChildAt(i19);
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                            if (u1Var2.getMessageObject() != null && u1Var2.getMessageObject().isSensitive()) {
                                u1Var2.h4();
                            }
                        }
                    }
                    break;
                } else {
                    if (u1Var.getMessageObject() != null) {
                        u1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
                    }
                    u1Var.h4();
                    break;
                }
                break;
            case 18:
                cn cnVar3 = (cn) this.c;
                j3 j3Var = (j3) this.b;
                qn qnVar11 = cnVar3.a;
                if (((Boolean) obj).booleanValue()) {
                    qnVar11.getMessagesController().setContentSettings(true);
                    xc.a0(qnVar11).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new nm(cnVar3, 8)), true)).k(true);
                    j3Var.run(Boolean.TRUE);
                    break;
                } else {
                    xc.a0(qnVar11).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
            case 19:
                cn cnVar4 = (cn) this.c;
                TLRPC.Message message = (TLRPC.Message) this.b;
                cnVar4.a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.id, (String) obj);
                break;
            case 20:
                tn tnVar = (tn) this.c;
                tnVar.f.s(((eg.a) obj).b, ((TLRPC.WallPaper) this.b).settings.intensity);
                View view2 = tnVar.b;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 21:
                of ofVar = (of) this.c;
                String str12 = (String) this.b;
                Long l11 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ofVar.a;
                long j10 = chatActivityEnterView.Q2;
                MessageObject messageObject3 = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(str12, j10, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                qn qnVar12 = chatActivityEnterView.P2;
                of4.sendMessageChatArguments = qnVar12 != null ? qnVar12.H8() : null;
                of4.effect_id = chatActivityEnterView.S4;
                of4.payStars = l11.longValue();
                of4.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of4.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of4);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                xe xeVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                xeVar.setEffect(0L);
                break;
            case 22:
                ti tiVar = (ti) this.c;
                mi miVar = (mi) this.b;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i20 = tiVar.M1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i20).getInputUser(miVar.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i20).sendRequest(tL_messages_toggleBotInAttachMenu, new vc(12, tiVar, miVar), 66);
                break;
            case 23:
                ti tiVar2 = (ti) this.c;
                ((qn) this.b).g5 = (MessageSuggestionParams) obj;
                boolean J1 = tiVar2.J1(0, true, 0, tiVar2.u1(), tiVar2.Q0);
                mf mfVar = tiVar2.h0;
                if (mfVar != null) {
                    mfVar.g(!J1);
                    tiVar2.h0 = null;
                    break;
                }
                break;
            case 24:
                ((gi.f4) this.c).getWebViewContainer().F((String) this.b, (String) obj, false);
                break;
            case 25:
                org.telegram.ui.Components.fj fjVar2 = (org.telegram.ui.Components.fj) this.c;
                MessagesController messagesController = (MessagesController) this.b;
                Long l12 = (Long) obj;
                fjVar2.i0 = false;
                TLRPC.User user = l12 == null ? null : messagesController.getUser(l12);
                fjVar2.h0 = user;
                fjVar2.j0 = user == null;
                if (user != null) {
                    fjVar2.R();
                    break;
                }
                break;
            case 26:
                ol olVar = (ol) this.c;
                ql qlVar = (ql) this.b;
                rl rlVar = olVar.b;
                rlVar.x0.b(qlVar.c, rlVar.y0, true, 0, ((Long) obj).longValue());
                rlVar.b.dismiss(true);
                break;
            case 27:
                xv xvVar = (xv) this.c;
                boolean[] zArr = (boolean[]) this.b;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new wv(xvVar, 1));
                    break;
                }
                break;
            case 28:
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
                yt ytVar = (yt) this.b;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                ytVar.run();
                break;
            default:
                sy syVar = (sy) this.c;
                ty tyVar = syVar.a;
                tz tzVar = tyVar.F;
                MediaDataController.getInstance(tzVar.c1).getEmojiSuggestions(tzVar.W0, tyVar.v, false, new ry(syVar, (String) this.b, (Runnable) obj, 0), null, SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(tzVar.c1).isPremium(), false, true, 25);
                break;
        }
    }

    public /* synthetic */ j3(m3 m3Var, t3 t3Var) {
        this.a = 1;
        this.b = m3Var;
        this.c = t3Var;
    }
}
