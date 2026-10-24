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
import org.telegram.messenger.sl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.j80;
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
import org.telegram.ui.dn;
import org.telegram.ui.e7;
import org.telegram.ui.fj;
import org.telegram.ui.gk;
import org.telegram.ui.ie;
import org.telegram.ui.om;
import org.telegram.ui.qc;
import org.telegram.ui.rc;
import org.telegram.ui.sn;
import org.telegram.ui.vc;
import org.telegram.ui.vn;
import org.telegram.ui.x21;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        sn snVar;
        gk gkVar;
        org.telegram.ui.web.g2 g2Var;
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
                q3 q3Var = (q3) this.c;
                p3 p3Var = (p3) this.b;
                o2 o2Var = (o2) obj;
                if (o2Var != null) {
                    if ((o2Var instanceof sn) && (gkVar = (snVar = (sn) o2Var).Y) != null) {
                        gkVar.M();
                        snVar.Y.k0(true, false, true);
                    }
                    if (o2Var.getContext() != null && o2Var.getParentActivity() != null) {
                        gi.d3 d3Var = new gi.d3(o2Var.getContext(), o2Var.getResourceProvider());
                        d3Var.l0 = o2Var.getParentActivity();
                        if (p3Var != null && p3Var.a != null) {
                            d3Var.F0 = true;
                            boolean z10 = p3Var.o;
                            d3Var.W = z10;
                            if (z10) {
                                d3Var.w(p3Var.r, false);
                            }
                            if (p3Var.n) {
                                i10 = p3Var.q;
                            } else {
                                int i12 = p3Var.p;
                                if (i12 < 0) {
                                    i12 = k6.d6;
                                }
                                i10 = k6.w0(i12, d3Var.F);
                            }
                            d3Var.u(i10, p3Var.n, false);
                            d3Var.z(p3Var.s, false);
                            d3Var.G0 = p3Var.j;
                            d3Var.H0 = p3Var.k;
                            boolean z11 = p3Var.u;
                            d3Var.x0 = z11;
                            gi.v2 v2Var = d3Var.y;
                            v2Var.setIsBackButtonVisible(z11);
                            d3Var.w.setAllowSwipes(p3Var.l);
                            AndroidUtilities.updateImageViewImageAnimated(d3Var.X.getBackButton(), d3Var.x0 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
                            BotFullscreenButtons botFullscreenButtons = d3Var.n0;
                            if (botFullscreenButtons != null) {
                                botFullscreenButtons.setBack(d3Var.x0, false);
                            }
                            d3Var.s0 = p3Var.y;
                            d3Var.A0 = Boolean.valueOf(p3Var.B);
                            d3Var.B0 = p3Var.C;
                            gi.y0 y0Var = p3Var.K;
                            d3Var.C0 = y0Var;
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
                            a5.a aVar = p3Var.w;
                            if (aVar != null) {
                                gi.z2 z2Var = d3Var.m0;
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
                            d3Var.y(p3Var.z, false, p3Var.A);
                            gi.t4 t4Var = p3Var.a;
                            d3Var.H = t4Var != null ? t4Var.a : UserConfig.selectedAccount;
                            org.telegram.ui.web.y0 y0Var2 = p3Var.b;
                            if (y0Var2 != null) {
                                y0Var2.onResume();
                                v2Var.N(d3Var.H, p3Var.b, p3Var.d, p3Var.f, p3Var.e);
                                boolean z12 = p3Var.t || p3Var.b.b;
                                String str5 = p3Var.x;
                                v2Var.g("setState(" + z12 + ", " + str5 + ")");
                                v2Var.N = z12;
                                v2Var.b = str5;
                                if (k6.I.q() != p3Var.D) {
                                    v2Var.z();
                                }
                            } else {
                                t4Var.q = null;
                                t4Var.r = 0L;
                            }
                            d3Var.t(o2Var, p3Var.a);
                            d3Var.c0 = p3Var.v;
                            if (p3Var.G) {
                                d3Var.W0 = true;
                                d3Var.i();
                                org.telegram.ui.e3 e3Var = d3Var.Y0;
                                String userName = d3Var.m() ? d3Var.w0.e : UserObject.getUserName(MessagesController.getInstance(d3Var.H).getUser(Long.valueOf(d3Var.I)));
                                String str6 = p3Var.H;
                                d3Var.X0 = str6;
                                e3Var.a(userName, str6);
                                org.telegram.ui.e3 e3Var2 = d3Var.Y0;
                                Paint paint2 = d3Var.Q;
                                e3Var2.b(AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f, false);
                                d3Var.Y0.setBackgroundColor(paint2.getColor());
                                d3Var.Y0.setVisibility(0);
                                d3Var.Y0.setAlpha(1.0f);
                            }
                            d3Var.p(p3Var.L);
                            q3Var.h(q3Var.w, p3Var, false);
                            d3Var.show();
                            break;
                        }
                    }
                }
                break;
            case 1:
                p3 p3Var2 = (p3) this.b;
                w3 w3Var = (w3) this.c;
                p3Var2.m = (Bitmap) obj;
                w3Var.getWindowView().setDrawingFromOverlay(false);
                w3Var.release();
                break;
            case 2:
                v3 v3Var = (v3) this.c;
                y3 y3Var = (y3) this.b;
                z3 z3Var = v3Var.p;
                if (((Boolean) obj).booleanValue()) {
                    y3Var.a(1.0f);
                    if (z3Var.a.getTabs().isEmpty()) {
                        z3Var.a(false);
                        break;
                    }
                } else {
                    y3Var.a(0.0f);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) this.c;
                Activity activity = (Activity) this.b;
                Integer num = (Integer) obj;
                org.telegram.ui.w3 w3Var2 = k4Var.K;
                org.telegram.ui.l0[] l0VarArr = k4Var.T0;
                if ((!k4Var.u0[0].c() || k4Var.u0[0].c.E != null) && k4Var.L != null) {
                    if (num.intValue() == 1) {
                        org.telegram.ui.m0 m0Var = k4Var.h0;
                        int dp = AndroidUtilities.dp(56.0f);
                        k4Var.J0 = dp;
                        m0Var.setHeight(dp);
                        k4Var.h0.h(true);
                        break;
                    } else {
                        if (num.intValue() == 2) {
                            if (!k4Var.u0[0].f()) {
                                TLRPC.WebPage webPage = k4Var.u0[0].c.E;
                                if (webPage != null) {
                                    str4 = webPage.url;
                                }
                            } else if (k4Var.u0[0].getWebView() != null) {
                                str4 = k4Var.u0[0].getWebView().getUrl();
                            }
                            String u10 = org.telegram.ui.web.b1.u(str4);
                            k4Var.a0(new ir0(k4Var.L, null, u10, false, u10, false, AndroidUtilities.computePerceivedBrightness(k4Var.h0.getBackgroundColor()) < 0.721f ? new ci.b() : null));
                            break;
                        } else if (num.intValue() == 6) {
                            if (!k4Var.u0[0].f()) {
                                org.telegram.ui.n3 n3Var = k4Var.u0[0];
                                TLRPC.WebPage webPage2 = n3Var.c.E;
                                if (webPage2 != null) {
                                    str3 = webPage2.url;
                                    frameLayout = n3Var;
                                }
                            } else if (k4Var.u0[0].getWebView() != null) {
                                str3 = k4Var.u0[0].getWebView().getUrl();
                                frameLayout = k4Var.u0[0].f;
                            }
                            org.telegram.ui.k4.f(str3, k4Var.X, frameLayout, w3Var2, null);
                            break;
                        } else if (num.intValue() == 7) {
                            m2 m2Var = new m2();
                            m2Var.a = true;
                            o2 U = LaunchActivity.U();
                            if (U != null) {
                                U.showAsSheet(new org.telegram.ui.web.p(w3Var2 != null ? new org.telegram.ui.a0(k4Var, 5) : null, new org.telegram.ui.q(k4Var, 2)), m2Var);
                                break;
                            }
                        } else if (num.intValue() == 8) {
                            m2 m2Var2 = new m2();
                            m2Var2.a = true;
                            o2 U2 = LaunchActivity.U();
                            if (U2 != null) {
                                U2.showAsSheet(new org.telegram.ui.web.g1(w3Var2 != null ? new org.telegram.ui.a0(k4Var, 6) : null, new org.telegram.ui.q(k4Var, 3)), m2Var2);
                                break;
                            }
                        } else if (num.intValue() == 9) {
                            if (k4Var.u0[0].getWebView() != null) {
                                k4Var.u0[0].getWebView().goForward();
                                break;
                            }
                        } else if (num.intValue() == 3) {
                            if (!k4Var.u0[0].f()) {
                                TLRPC.WebPage webPage3 = k4Var.u0[0].c.E;
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
                            } else if (k4Var.u0[0].getWebView() != null) {
                                str = k4Var.u0[0].getWebView().getUrl();
                                str2 = k4Var.u0[0].getWebView().getOpenURL();
                                file = null;
                            }
                            Activity activity2 = k4Var.L;
                            if (activity2 != null && !activity2.isFinishing()) {
                                if (file != null) {
                                    AndroidUtilities.openForView(file, null, "text/markdown", k4Var.L, null, true);
                                    break;
                                } else if (str != null) {
                                    String hostAuthority = AndroidUtilities.getHostAuthority(str2, true);
                                    String hostAuthority2 = AndroidUtilities.getHostAuthority(str, true);
                                    org.telegram.ui.x xVar = new org.telegram.ui.x(k4Var, str, 1);
                                    org.telegram.ui.y yVar = new org.telegram.ui.y(k4Var, hostAuthority2, hostAuthority, 1);
                                    if (!k4Var.u0[0].f() || !MessagesController.getInstance(k4Var.X).isWebBrowserOpenInApp(hostAuthority2) || MessagesController.getInstance(k4Var.X).isWebBrowserExceptionsLimitReached(true)) {
                                        xVar.run();
                                        break;
                                    } else {
                                        org.telegram.ui.Components.f5.o0(activity, null, str, true, new ai.r5(8, yVar, xVar));
                                        break;
                                    }
                                }
                            }
                        } else if (num.intValue() == 4) {
                            if (k4Var.u0[0].f()) {
                                o2 U3 = LaunchActivity.U();
                                if (U3 != null) {
                                    m2 m2Var3 = new m2();
                                    m2Var3.a = true;
                                    U3.showAsSheet(new org.telegram.ui.web.y1(new org.telegram.ui.q(k4Var, 3)), m2Var3);
                                    break;
                                }
                            } else {
                                h3 h3Var = new h3(1, (Context) k4Var.L, (g6) null, false);
                                h3Var.fixNavigationBar();
                                h3Var.applyTopPadding = false;
                                LinearLayout linearLayout = new LinearLayout(k4Var.L);
                                linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                                linearLayout.setOrientation(1);
                                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(k4Var.L, (g6) null);
                                l4Var.setText(LocaleController.getString(R.string.FontSize));
                                linearLayout.addView(l4Var, w7.z5.t(-2, -2, 51, 3, 1, 3, 0));
                                linearLayout.addView(new org.telegram.ui.f4(k4Var, k4Var.L), w7.z5.t(-1, -2, 51, 3, 0, 3, 0));
                                org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(k4Var.L, (g6) null);
                                l4Var2.setText(LocaleController.getString(R.string.FontType));
                                linearLayout.addView(l4Var2, w7.z5.t(-2, -2, 51, 3, 4, 3, 2));
                                int i14 = 0;
                                for (int i15 = 2; i14 < i15; i15 = 2) {
                                    Activity activity3 = k4Var.L;
                                    org.telegram.ui.l0 l0Var = new org.telegram.ui.l0(activity3);
                                    int i16 = k6.i6;
                                    org.telegram.ui.Cells.y g02 = k6.g0(k6.x0(null, i16, false), i15, -1);
                                    n6 O = r6.O(i16);
                                    l0Var.setBackground(g02);
                                    r6.k(l0Var, g02, null, O, null);
                                    RadioButton radioButton = new RadioButton(activity3);
                                    l0Var.b = radioButton;
                                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                                    r6.Q(radioButton, k6.D5, k6.E5, null);
                                    boolean z13 = LocaleController.isRTL;
                                    l0Var.addView(radioButton, w7.z5.d(22, 22.0f, (z13 ? 5 : 3) | 48, z13 ? 0 : 22, 13.0f, z13 ? 22 : 0, 0.0f));
                                    TextView textView = new TextView(activity3);
                                    r6.W(textView, k6.G6, null);
                                    sl.u(textView, 1, 16.0f, 1, 1);
                                    textView.setSingleLine(true);
                                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                                    boolean z14 = LocaleController.isRTL;
                                    l0Var.addView(textView, w7.z5.d(-1, -1.0f, (z14 ? 5 : 3) | 48, z14 ? 17 : 62, 0.0f, z14 ? 62 : 17, 0.0f));
                                    l0VarArr[i14] = l0Var;
                                    if (i14 == 0) {
                                        String string = LocaleController.getString(R.string.Default);
                                        Typeface typeface = Typeface.DEFAULT;
                                        textView.setText(string);
                                        textView.setTypeface(typeface);
                                        l0Var.setContentDescription(string);
                                        l0Var.invalidate();
                                    } else if (i14 == 1) {
                                        Typeface typeface2 = Typeface.SERIF;
                                        textView.setText("Serif");
                                        textView.setTypeface(typeface2);
                                        l0Var.setContentDescription("Serif");
                                        l0Var.invalidate();
                                    }
                                    ((RadioButton) l0VarArr[i14].b).a(i14 == k4Var.a, false);
                                    l0VarArr[i14].setTag(Integer.valueOf(i14));
                                    l0VarArr[i14].setOnClickListener(new org.telegram.ui.r(k4Var, 4));
                                    linearLayout.addView(l0VarArr[i14], w7.z5.n(-1, 50));
                                    i14++;
                                }
                                h3Var.customView = linearLayout;
                                k4Var.I = h3Var;
                                k4Var.a0(h3Var);
                                break;
                            }
                        } else if (num.intValue() != 5) {
                            if (num.intValue() == 10 && (g2Var = k4Var.u0[0].E) != null && g2Var.b() != null) {
                                k4Var.h(g2Var.b(), null, 1);
                                break;
                            }
                        } else if (k4Var.u0[0].f() && k4Var.u0[0].getWebView() != null) {
                            k4Var.u0[0].getWebView().reload();
                            break;
                        }
                    }
                }
                break;
            case 4:
                org.telegram.ui.n3 n3Var2 = (org.telegram.ui.n3) this.c;
                Activity activity4 = (Activity) this.b;
                String str8 = (String) obj;
                if (!TextUtils.isEmpty(str8) && n3Var2.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str8.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i17 = 0;
                    for (int i18 = 0; i18 < uRLSpanArr.length; i18++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i18]), length);
                        i17 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i18]), i17);
                    }
                    Uri uriParseSafe = Utilities.uriParseSafe(str8);
                    if (uriParseSafe == null || !TextUtils.equals(uriParseSafe.getScheme(), "javascript")) {
                        String str9 = null;
                        if ((uRLSpanArr.length <= 0 || length != 0 || i17 <= 0) && (uriParseSafe == null || uriParseSafe.getScheme() == null)) {
                            org.telegram.ui.web.l.b(activity4, str8);
                            org.telegram.ui.web.y0 webView = n3Var2.getWebView();
                            String str10 = org.telegram.ui.web.n1.a().b;
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
                            n3Var2.getWebView().loadUrl(str8);
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
                    int i19 = tL_premium_boostsStatus.level;
                    bdVar.b = i19;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i19;
                    }
                }
                bdVar.Z0(true);
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
                if (view instanceof qc) {
                    qc qcVar = (qc) view;
                    qcVar.setBackgroundColor(k6.w0(k6.d6, rcVar.a));
                    rcVar.b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        qcVar.a(peerColors.colors.get(R));
                    }
                    view.invalidate();
                    break;
                }
                break;
            case 7:
                ie ieVar = (ie) this.c;
                sg.j0 j0Var = (sg.j0) this.b;
                j0Var.K1((ChannelBoostsController.CanApplyBoost) obj);
                ieVar.w0.showDialog(j0Var);
                break;
            case 8:
                sn snVar2 = (sn) this.c;
                ig.y1 y1Var = (ig.y1) this.b;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = snVar2.getMessagesController().getInputPeer(snVar2.f6);
                tL_messages_sendQuickReplyMessages.shortcut_id = y1Var.a;
                snVar2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                gk gkVar2 = snVar2.Y;
                if (gkVar2 != null) {
                    gkVar2.setFieldText(null);
                    break;
                }
                break;
            case 9:
                sn snVar3 = (sn) this.c;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) this.b, snVar3.f6, snVar3.z5, snVar3.j4, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = snVar3.H8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = snVar3.S8();
                of2.suggestionParams = snVar3.s5;
                snVar3.getSendMessagesHelper().sendMessage(of2);
                snVar3.Y.setFieldText("");
                snVar3.j9(false);
                break;
            case 10:
                sn snVar4 = (sn) this.c;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.b;
                Long l4 = (Long) obj;
                if (snVar4.d4 == 1) {
                    org.telegram.ui.Components.f5.M(snVar4.getParentActivity(), snVar4.f6, new e7(snVar4, botInlineResult, l4, 2), snVar4.qa);
                    break;
                } else {
                    snVar4.hb(botInlineResult, true, 0, l4.longValue());
                    break;
                }
            case 11:
                sn.n1((sn) this.c, (x21[]) this.b, (j80) obj);
                break;
            case 12:
                sn snVar5 = (sn) this.c;
                org.telegram.ui.h0 h0Var = (org.telegram.ui.h0) this.b;
                snVar5.wb = true;
                h0Var.run();
                break;
            case 13:
                sn snVar6 = (sn) this.c;
                c2[] c2VarArr = (c2[]) this.b;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.v0.p(R.string.PollStatsWillLater, xc.a0(snVar6), R.raw.timer_toast, 24);
                        break;
                    } else {
                        new uh.g(snVar6.getParentActivity(), snVar6.qa, tL_statsPollStats).show();
                        break;
                    }
                }
                break;
            case 14:
                sn snVar7 = (sn) this.c;
                MessageObject messageObject = (MessageObject) this.b;
                snVar7.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    snVar7.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    break;
                }
                break;
            case 15:
                fj fjVar = (fj) this.c;
                ig.y1 y1Var2 = (ig.y1) this.b;
                String str11 = (String) obj;
                sn snVar8 = fjVar.b;
                if (y1Var2 != null) {
                    i11 = snVar8.currentAccount;
                    ig.z1.f(i11).k(y1Var2.a, str11);
                }
                snVar8.c4 = str11;
                snVar8.m1.setTitle(str11);
                break;
            case 16:
                dn dnVar = (dn) this.c;
                MessageObject messageObject2 = (MessageObject) this.b;
                Long l10 = (Long) obj;
                sn snVar9 = dnVar.a;
                if (snVar9.i7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), snVar9.f6, snVar9.z5, snVar9.j4, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = snVar9.H8();
                    of3.dice_stake = l10.longValue();
                    snVar9.getSendMessagesHelper().sendMessage(of3);
                    break;
                }
                break;
            case 17:
                dn dnVar2 = (dn) this.c;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.b;
                sn snVar10 = dnVar2.a;
                if (((Boolean) obj).booleanValue()) {
                    for (int i20 = 0; i20 < snVar10.x0.getChildCount(); i20++) {
                        View childAt = snVar10.x0.getChildAt(i20);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                            if (t1Var2.getMessageObject() != null && t1Var2.getMessageObject().isSensitive()) {
                                t1Var2.g4();
                            }
                        }
                    }
                    break;
                } else {
                    if (t1Var.getMessageObject() != null) {
                        t1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
                    }
                    t1Var.g4();
                    break;
                }
                break;
            case 18:
                dn dnVar3 = (dn) this.c;
                m3 m3Var = (m3) this.b;
                sn snVar11 = dnVar3.a;
                if (((Boolean) obj).booleanValue()) {
                    snVar11.getMessagesController().setContentSettings(true);
                    xc.a0(snVar11).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new om(dnVar3, 8)), true)).k(true);
                    m3Var.run(Boolean.TRUE);
                    break;
                } else {
                    xc.a0(snVar11).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
            case 19:
                dn dnVar4 = (dn) this.c;
                TLRPC.Message message = (TLRPC.Message) this.b;
                dnVar4.a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.id, (String) obj);
                break;
            case 20:
                vn vnVar = (vn) this.c;
                vnVar.f.s(((eg.a) obj).b, ((TLRPC.WallPaper) this.b).settings.intensity);
                View view2 = vnVar.b;
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
                sn snVar12 = chatActivityEnterView.P2;
                of4.sendMessageChatArguments = snVar12 != null ? snVar12.H8() : null;
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
                int i21 = tiVar.M1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i21).getInputUser(miVar.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i21).sendRequest(tL_messages_toggleBotInAttachMenu, new vc(12, tiVar, miVar), 66);
                break;
            case 23:
                ti tiVar2 = (ti) this.c;
                ((sn) this.b).s5 = (MessageSuggestionParams) obj;
                boolean N1 = tiVar2.N1(0, true, 0, tiVar2.x1(), tiVar2.Q0);
                mf mfVar = tiVar2.h0;
                if (mfVar != null) {
                    mfVar.g(!N1);
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
                rlVar.v0.b(qlVar.c, rlVar.w0, true, 0, ((Long) obj).longValue());
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

    public /* synthetic */ m3(p3 p3Var, w3 w3Var) {
        this.a = 1;
        this.b = p3Var;
        this.c = w3Var;
    }
}
