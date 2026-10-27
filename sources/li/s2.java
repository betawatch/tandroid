package li;

import a8.ng;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.fj;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.xe;
import org.telegram.ui.Components.xv;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bd;
import org.telegram.ui.c31;
import org.telegram.ui.e7;
import org.telegram.ui.ed;
import org.telegram.ui.hn;
import org.telegram.ui.jj;
import org.telegram.ui.jk;
import org.telegram.ui.ke;
import org.telegram.ui.rc;
import org.telegram.ui.sc;
import org.telegram.ui.sm;
import org.telegram.ui.wn;
import org.telegram.ui.z7;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        wn wnVar;
        jk jkVar;
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
                v3 v3Var = (v3) this.b;
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) this.c;
                String str5 = (String) obj;
                v3Var.getClass();
                if (!TextUtils.equals(str5, pageblockmath.source)) {
                    f2 f2Var2 = v3Var.R3;
                    if (f2Var2 != null) {
                        f2Var2.d();
                    }
                    pageblockmath.source = str5;
                    v3Var.g3.O(false);
                    f2 f2Var3 = v3Var.R3;
                    if (f2Var3 != null) {
                        f2Var3.h();
                    }
                    v3Var.p3.onContentChanged();
                    break;
                }
                break;
            case 1:
                ((VoIPDebugToSend) this.b).lambda$done$0((TL_phone.saveCallDebug) this.c, (TLRPC.InputFile) obj);
                break;
            case 2:
                org.telegram.ui.ActionBar.s3 s3Var = (org.telegram.ui.ActionBar.s3) this.b;
                org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) this.c;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
                if (r2Var != null) {
                    if ((r2Var instanceof wn) && (jkVar = (wnVar = (wn) r2Var).Y) != null) {
                        jkVar.L();
                        wnVar.Y.j0(true, false, true);
                    }
                    if (r2Var.getContext() != null && r2Var.getParentActivity() != null) {
                        hi.m3 m3Var = new hi.m3(r2Var.getContext(), r2Var.getResourceProvider());
                        m3Var.l0 = r2Var.getParentActivity();
                        if (r3Var != null && r3Var.a != null) {
                            m3Var.F0 = true;
                            boolean z10 = r3Var.o;
                            m3Var.W = z10;
                            if (z10) {
                                m3Var.w(r3Var.r, false);
                            }
                            if (r3Var.n) {
                                i10 = r3Var.q;
                            } else {
                                int i12 = r3Var.p;
                                if (i12 < 0) {
                                    i12 = y6.d6;
                                }
                                i10 = y6.w0(i12, m3Var.F);
                            }
                            m3Var.u(i10, r3Var.n, false);
                            m3Var.z(r3Var.s, false);
                            m3Var.G0 = r3Var.j;
                            m3Var.H0 = r3Var.k;
                            boolean z11 = r3Var.u;
                            m3Var.x0 = z11;
                            hi.e3 e3Var = m3Var.y;
                            e3Var.setIsBackButtonVisible(z11);
                            m3Var.w.setAllowSwipes(r3Var.l);
                            AndroidUtilities.updateImageViewImageAnimated(m3Var.X.getBackButton(), m3Var.x0 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
                            BotFullscreenButtons botFullscreenButtons = m3Var.n0;
                            if (botFullscreenButtons != null) {
                                botFullscreenButtons.setBack(m3Var.x0, false);
                            }
                            m3Var.s0 = r3Var.y;
                            m3Var.A0 = Boolean.valueOf(r3Var.B);
                            m3Var.B0 = r3Var.C;
                            hi.f1 f1Var = r3Var.K;
                            m3Var.C0 = f1Var;
                            if (f1Var != null) {
                                hi.d1 d1Var = f1Var.r;
                                SensorManager sensorManager = f1Var.a;
                                if (f1Var.l) {
                                    f1Var.l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = f1Var.b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(f1Var.n, sensor, hi.f1.a(f1Var.c));
                                        }
                                        Sensor sensor2 = f1Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(f1Var.p, sensor2, hi.f1.a(f1Var.e));
                                        }
                                        Sensor sensor3 = f1Var.g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(d1Var, sensor3, hi.f1.a(f1Var.h));
                                        }
                                        Sensor sensor4 = f1Var.f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(d1Var, sensor4, hi.f1.a(f1Var.h));
                                        }
                                        Sensor sensor5 = f1Var.i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(f1Var.t, sensor5, hi.f1.a(f1Var.j));
                                        }
                                    }
                                }
                            }
                            ng ngVar = r3Var.w;
                            if (ngVar != null) {
                                hi.i3 i3Var = m3Var.m0;
                                int totalHeight = i3Var.getTotalHeight();
                                i3Var.e = ngVar;
                                hi.b0[] b0VarArr = i3Var.f;
                                hi.d0.b(b0VarArr[0].l, (hi.c0) ngVar.c, false);
                                hi.d0.b(b0VarArr[1].l, (hi.c0) ngVar.d, false);
                                i3Var.invalidate();
                                if (totalHeight != i3Var.getTotalHeight() && i3Var.r != null) {
                                    if (totalHeight < i3Var.getTotalHeight()) {
                                        AndroidUtilities.runOnUIThread(i3Var.r, 200L);
                                    } else {
                                        i3Var.r.run();
                                    }
                                }
                                int i13 = ngVar.b;
                                Paint paint = i3Var.a;
                                i3Var.e.b = i13;
                                paint.setColor(i13);
                                i3Var.d.a(i13, true);
                            }
                            m3Var.y(r3Var.z, false, r3Var.A);
                            hi.c5 c5Var = r3Var.a;
                            m3Var.H = c5Var != null ? c5Var.a : UserConfig.selectedAccount;
                            org.telegram.ui.web.x0 x0Var = r3Var.b;
                            if (x0Var != null) {
                                x0Var.onResume();
                                e3Var.N(m3Var.H, r3Var.b, r3Var.d, r3Var.f, r3Var.e);
                                boolean z12 = r3Var.t || r3Var.b.b;
                                String str6 = r3Var.x;
                                e3Var.g("setState(" + z12 + ", " + str6 + ")");
                                e3Var.N = z12;
                                e3Var.b = str6;
                                if (y6.I.q() != r3Var.D) {
                                    e3Var.z();
                                }
                            } else {
                                c5Var.q = null;
                                c5Var.r = 0L;
                            }
                            m3Var.t(r2Var, r3Var.a);
                            m3Var.c0 = r3Var.v;
                            if (r3Var.G) {
                                m3Var.W0 = true;
                                m3Var.i();
                                org.telegram.ui.c3 c3Var = m3Var.Y0;
                                String userName = m3Var.m() ? m3Var.w0.e : UserObject.getUserName(MessagesController.getInstance(m3Var.H).getUser(Long.valueOf(m3Var.I)));
                                String str7 = r3Var.H;
                                m3Var.X0 = str7;
                                c3Var.a(userName, str7);
                                org.telegram.ui.c3 c3Var2 = m3Var.Y0;
                                Paint paint2 = m3Var.Q;
                                c3Var2.b(AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f, false);
                                m3Var.Y0.setBackgroundColor(paint2.getColor());
                                m3Var.Y0.setVisibility(0);
                                m3Var.Y0.setAlpha(1.0f);
                            }
                            m3Var.p(r3Var.L);
                            s3Var.h(s3Var.w, r3Var, false);
                            m3Var.show();
                            break;
                        }
                    }
                }
                break;
            case 3:
                org.telegram.ui.ActionBar.r3 r3Var2 = (org.telegram.ui.ActionBar.r3) this.b;
                org.telegram.ui.ActionBar.y3 y3Var = (org.telegram.ui.ActionBar.y3) this.c;
                r3Var2.m = (Bitmap) obj;
                y3Var.getWindowView().setDrawingFromOverlay(false);
                y3Var.release();
                break;
            case 4:
                org.telegram.ui.ActionBar.x3 x3Var = (org.telegram.ui.ActionBar.x3) this.b;
                org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) this.c;
                org.telegram.ui.ActionBar.b4 b4Var = x3Var.p;
                if (((Boolean) obj).booleanValue()) {
                    a4Var.a(1.0f);
                    if (b4Var.a.getTabs().isEmpty()) {
                        b4Var.a(false);
                        break;
                    }
                } else {
                    a4Var.a(0.0f);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.b;
                Activity activity = (Activity) this.c;
                Integer num = (Integer) obj;
                org.telegram.ui.v3 v3Var2 = j4Var.K;
                org.telegram.ui.k0[] k0VarArr = j4Var.T0;
                if ((!j4Var.u0[0].c() || j4Var.u0[0].c.E != null) && j4Var.L != null) {
                    if (num.intValue() == 1) {
                        org.telegram.ui.l0 l0Var = j4Var.h0;
                        int dp = AndroidUtilities.dp(56.0f);
                        j4Var.J0 = dp;
                        l0Var.setHeight(dp);
                        j4Var.h0.h(true);
                        break;
                    } else {
                        if (num.intValue() == 2) {
                            if (!j4Var.u0[0].f()) {
                                TLRPC.WebPage webPage = j4Var.u0[0].c.E;
                                if (webPage != null) {
                                    str4 = webPage.url;
                                }
                            } else if (j4Var.u0[0].getWebView() != null) {
                                str4 = j4Var.u0[0].getWebView().getUrl();
                            }
                            String u10 = org.telegram.ui.web.a1.u(str4);
                            j4Var.a0(new nr0(j4Var.L, null, u10, false, u10, false, AndroidUtilities.computePerceivedBrightness(j4Var.h0.getBackgroundColor()) < 0.721f ? new di.b() : null));
                            break;
                        } else if (num.intValue() == 6) {
                            if (!j4Var.u0[0].f()) {
                                org.telegram.ui.m3 m3Var2 = j4Var.u0[0];
                                TLRPC.WebPage webPage2 = m3Var2.c.E;
                                if (webPage2 != null) {
                                    str3 = webPage2.url;
                                    frameLayout = m3Var2;
                                }
                            } else if (j4Var.u0[0].getWebView() != null) {
                                str3 = j4Var.u0[0].getWebView().getUrl();
                                frameLayout = j4Var.u0[0].f;
                            }
                            org.telegram.ui.j4.f(str3, j4Var.X, frameLayout, v3Var2, null);
                            break;
                        } else if (num.intValue() == 7) {
                            org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
                            p2Var.a = true;
                            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                            if (U != null) {
                                U.showAsSheet(new org.telegram.ui.web.p(v3Var2 != null ? new org.telegram.ui.a0(j4Var, 5) : null, new org.telegram.ui.q(j4Var, 2)), p2Var);
                                break;
                            }
                        } else if (num.intValue() == 8) {
                            org.telegram.ui.ActionBar.p2 p2Var2 = new org.telegram.ui.ActionBar.p2();
                            p2Var2.a = true;
                            org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                            if (U2 != null) {
                                U2.showAsSheet(new org.telegram.ui.web.f1(v3Var2 != null ? new org.telegram.ui.a0(j4Var, 6) : null, new org.telegram.ui.q(j4Var, 3)), p2Var2);
                                break;
                            }
                        } else if (num.intValue() == 9) {
                            if (j4Var.u0[0].getWebView() != null) {
                                j4Var.u0[0].getWebView().goForward();
                                break;
                            }
                        } else if (num.intValue() == 3) {
                            if (!j4Var.u0[0].f()) {
                                TLRPC.WebPage webPage3 = j4Var.u0[0].c.E;
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
                            } else if (j4Var.u0[0].getWebView() != null) {
                                str = j4Var.u0[0].getWebView().getUrl();
                                str2 = j4Var.u0[0].getWebView().getOpenURL();
                                file = null;
                            }
                            Activity activity2 = j4Var.L;
                            if (activity2 != null && !activity2.isFinishing()) {
                                if (file != null) {
                                    AndroidUtilities.openForView(file, null, "text/markdown", j4Var.L, null, true);
                                    break;
                                } else if (str != null) {
                                    String hostAuthority = AndroidUtilities.getHostAuthority(str2, true);
                                    String hostAuthority2 = AndroidUtilities.getHostAuthority(str, true);
                                    org.telegram.ui.x xVar = new org.telegram.ui.x(j4Var, str, 1);
                                    org.telegram.ui.y yVar = new org.telegram.ui.y(j4Var, hostAuthority2, hostAuthority, 1);
                                    if (!j4Var.u0[0].f() || !MessagesController.getInstance(j4Var.X).isWebBrowserOpenInApp(hostAuthority2) || MessagesController.getInstance(j4Var.X).isWebBrowserExceptionsLimitReached(true)) {
                                        xVar.run();
                                        break;
                                    } else {
                                        org.telegram.ui.Components.g5.n0(activity, null, str, true, new bi.m5(8, yVar, xVar));
                                        break;
                                    }
                                }
                            }
                        } else if (num.intValue() == 4) {
                            if (j4Var.u0[0].f()) {
                                org.telegram.ui.ActionBar.r2 U3 = LaunchActivity.U();
                                if (U3 != null) {
                                    org.telegram.ui.ActionBar.p2 p2Var3 = new org.telegram.ui.ActionBar.p2();
                                    p2Var3.a = true;
                                    U3.showAsSheet(new org.telegram.ui.web.y1(new org.telegram.ui.q(j4Var, 3)), p2Var3);
                                    break;
                                }
                            } else {
                                org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) j4Var.L, (u6) null, false);
                                k3Var.fixNavigationBar();
                                k3Var.applyTopPadding = false;
                                LinearLayout linearLayout = new LinearLayout(j4Var.L);
                                linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                                linearLayout.setOrientation(1);
                                org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(j4Var.L, (u6) null);
                                q4Var.setText(LocaleController.getString(R.string.FontSize));
                                linearLayout.addView(q4Var, kb1.x(-2, -2, 51, 3, 1, 3, 0));
                                linearLayout.addView(new org.telegram.ui.e4(j4Var, j4Var.L), kb1.x(-1, -2, 51, 3, 0, 3, 0));
                                org.telegram.ui.Cells.q4 q4Var2 = new org.telegram.ui.Cells.q4(j4Var.L, (u6) null);
                                q4Var2.setText(LocaleController.getString(R.string.FontType));
                                linearLayout.addView(q4Var2, kb1.x(-2, -2, 51, 3, 4, 3, 2));
                                int i14 = 0;
                                for (int i15 = 2; i14 < i15; i15 = 2) {
                                    Activity activity3 = j4Var.L;
                                    org.telegram.ui.k0 k0Var = new org.telegram.ui.k0(activity3);
                                    int i16 = y6.i6;
                                    org.telegram.ui.Cells.y g02 = y6.g0(y6.x0(null, i16, false), i15, -1);
                                    b7 N = f7.N(i16);
                                    k0Var.setBackground(g02);
                                    f7.k(k0Var, g02, null, N, null);
                                    RadioButton radioButton = new RadioButton(activity3);
                                    k0Var.b = radioButton;
                                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                                    f7.P(radioButton, y6.D5, y6.E5, null);
                                    boolean z13 = LocaleController.isRTL;
                                    k0Var.addView(radioButton, kb1.h(22, 22.0f, (z13 ? 5 : 3) | 48, z13 ? 0 : 22, 13.0f, z13 ? 22 : 0, 0.0f));
                                    TextView textView = new TextView(activity3);
                                    f7.V(textView, y6.G6, null);
                                    wh.r(textView, 1, 16.0f, 1, 1);
                                    textView.setSingleLine(true);
                                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                                    boolean z14 = LocaleController.isRTL;
                                    k0Var.addView(textView, kb1.h(-1, -1.0f, (z14 ? 5 : 3) | 48, z14 ? 17 : 62, 0.0f, z14 ? 62 : 17, 0.0f));
                                    k0VarArr[i14] = k0Var;
                                    if (i14 == 0) {
                                        String string = LocaleController.getString(R.string.Default);
                                        Typeface typeface = Typeface.DEFAULT;
                                        textView.setText(string);
                                        textView.setTypeface(typeface);
                                        k0Var.setContentDescription(string);
                                        k0Var.invalidate();
                                    } else if (i14 == 1) {
                                        Typeface typeface2 = Typeface.SERIF;
                                        textView.setText("Serif");
                                        textView.setTypeface(typeface2);
                                        k0Var.setContentDescription("Serif");
                                        k0Var.invalidate();
                                    }
                                    ((RadioButton) k0VarArr[i14].b).a(i14 == j4Var.a, false);
                                    k0VarArr[i14].setTag(Integer.valueOf(i14));
                                    k0VarArr[i14].setOnClickListener(new org.telegram.ui.r(j4Var, 4));
                                    linearLayout.addView(k0VarArr[i14], kb1.r(-1, 50));
                                    i14++;
                                }
                                k3Var.customView = linearLayout;
                                j4Var.I = k3Var;
                                j4Var.a0(k3Var);
                                break;
                            }
                        } else if (num.intValue() != 5) {
                            if (num.intValue() == 10 && (f2Var = j4Var.u0[0].E) != null && f2Var.b() != null) {
                                j4Var.h(f2Var.b(), null, 1);
                                break;
                            }
                        } else if (j4Var.u0[0].f() && j4Var.u0[0].getWebView() != null) {
                            j4Var.u0[0].getWebView().reload();
                            break;
                        }
                    }
                }
                break;
            case 6:
                org.telegram.ui.m3 m3Var3 = (org.telegram.ui.m3) this.b;
                Activity activity4 = (Activity) this.c;
                String str9 = (String) obj;
                if (!TextUtils.isEmpty(str9) && m3Var3.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str9.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i17 = 0;
                    for (int i18 = 0; i18 < uRLSpanArr.length; i18++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i18]), length);
                        i17 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i18]), i17);
                    }
                    Uri uriParseSafe = Utilities.uriParseSafe(str9);
                    if (uriParseSafe == null || !TextUtils.equals(uriParseSafe.getScheme(), "javascript")) {
                        String str10 = null;
                        if ((uRLSpanArr.length <= 0 || length != 0 || i17 <= 0) && (uriParseSafe == null || uriParseSafe.getScheme() == null)) {
                            org.telegram.ui.web.l.b(activity4, str9);
                            org.telegram.ui.web.x0 webView = m3Var3.getWebView();
                            String str11 = org.telegram.ui.web.n1.a().b;
                            if (str11 != null) {
                                StringBuilder u11 = a1.g.u(str11);
                                u11.append(URLEncoder.encode(str9));
                                str10 = u11.toString();
                            }
                            webView.loadUrl(str10);
                            break;
                        } else {
                            if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                                str9 = qf.d.u(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                            }
                            m3Var3.getWebView().loadUrl(str9);
                            break;
                        }
                    }
                }
                break;
            case 7:
                bd bdVar = (bd) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
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
                bdVar.a1(true);
                fi.d dVar = bdVar.P;
                if (dVar != null) {
                    dVar.setLoading(false);
                    break;
                }
                break;
            case 8:
                sc scVar = (sc) this.b;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.c;
                View view = (View) obj;
                if (view instanceof rc) {
                    rc rcVar = (rc) view;
                    rcVar.setBackgroundColor(y6.w0(y6.d6, scVar.a));
                    scVar.b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        rcVar.a(peerColors.colors.get(R));
                    }
                    view.invalidate();
                    break;
                }
                break;
            case 9:
                ke keVar = (ke) this.b;
                tg.j0 j0Var = (tg.j0) this.c;
                j0Var.K1((ChannelBoostsController.CanApplyBoost) obj);
                keVar.m0.showDialog(j0Var);
                break;
            case 10:
                wn wnVar2 = (wn) this.b;
                jg.b2 b2Var = (jg.b2) this.c;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = wnVar2.getMessagesController().getInputPeer(wnVar2.j6);
                tL_messages_sendQuickReplyMessages.shortcut_id = b2Var.a;
                wnVar2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                jk jkVar2 = wnVar2.Y;
                if (jkVar2 != null) {
                    jkVar2.setFieldText(null);
                    break;
                }
                break;
            case 11:
                wn wnVar3 = (wn) this.b;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) this.c, wnVar3.j6, wnVar3.D5, wnVar3.j4, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = wnVar3.O8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = wnVar3.a9();
                of2.suggestionParams = wnVar3.w5;
                wnVar3.getSendMessagesHelper().sendMessage(of2);
                wnVar3.Y.setFieldText("");
                wnVar3.r9(false);
                break;
            case 12:
                wn wnVar4 = (wn) this.b;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.c;
                Long l4 = (Long) obj;
                if (wnVar4.d4 == 1) {
                    org.telegram.ui.Components.g5.L(wnVar4.getParentActivity(), wnVar4.j6, new e7(wnVar4, botInlineResult, l4, 2), wnVar4.ua);
                    break;
                } else {
                    wnVar4.qb(botInlineResult, true, 0, l4.longValue());
                    break;
                }
            case 13:
                wn.v1((wn) this.b, (c31[]) this.c, (l80) obj);
                break;
            case 14:
                wn wnVar5 = (wn) this.b;
                ed edVar = (ed) this.c;
                wnVar5.Jb = true;
                edVar.run();
                break;
            case 15:
                wn wnVar6 = (wn) this.b;
                org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) this.c;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    e2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                e2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.t.q(R.string.PollStatsWillLater, wc.b0(wnVar6), R.raw.timer_toast, 24);
                        break;
                    } else {
                        new vh.g(wnVar6.getParentActivity(), wnVar6.ua, tL_statsPollStats).show();
                        break;
                    }
                }
                break;
            case 16:
                wn wnVar7 = (wn) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                wnVar7.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    wnVar7.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    break;
                }
                break;
            case 17:
                jj jjVar = (jj) this.b;
                jg.b2 b2Var2 = (jg.b2) this.c;
                String str12 = (String) obj;
                wn wnVar8 = jjVar.b;
                if (b2Var2 != null) {
                    i11 = ((org.telegram.ui.ActionBar.r2) wnVar8).currentAccount;
                    jg.c2.f(i11).k(b2Var2.a, str12);
                }
                wnVar8.c4 = str12;
                wnVar8.m1.setTitle(str12);
                break;
            case 18:
                hn hnVar = (hn) this.b;
                MessageObject messageObject2 = (MessageObject) this.c;
                Long l10 = (Long) obj;
                wn wnVar9 = hnVar.a;
                if (wnVar9.o7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), wnVar9.j6, wnVar9.D5, wnVar9.j4, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = wnVar9.O8();
                    of3.dice_stake = l10.longValue();
                    wnVar9.getSendMessagesHelper().sendMessage(of3);
                    break;
                }
                break;
            case 19:
                hn hnVar2 = (hn) this.b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.c;
                wn wnVar10 = hnVar2.a;
                if (((Boolean) obj).booleanValue()) {
                    for (int i20 = 0; i20 < wnVar10.x0.getChildCount(); i20++) {
                        View childAt = wnVar10.x0.getChildAt(i20);
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                            if (s1Var2.getMessageObject() != null && s1Var2.getMessageObject().isSensitive()) {
                                s1Var2.j4();
                            }
                        }
                    }
                    break;
                } else {
                    if (s1Var.getMessageObject() != null) {
                        s1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
                    }
                    s1Var.j4();
                    break;
                }
                break;
            case 20:
                hn hnVar3 = (hn) this.b;
                s2 s2Var = (s2) this.c;
                wn wnVar11 = hnVar3.a;
                if (((Boolean) obj).booleanValue()) {
                    wnVar11.getMessagesController().setContentSettings(true);
                    wc.b0(wnVar11).Q(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new sm(hnVar3, 8)), true)).k(true);
                    s2Var.run(Boolean.TRUE);
                    break;
                } else {
                    wc.b0(wnVar11).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
            case 21:
                hn hnVar4 = (hn) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                hnVar4.a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.id, (String) obj);
                break;
            case 22:
                zn znVar = (zn) this.b;
                znVar.f.s(((fg.a) obj).b, ((TLRPC.WallPaper) this.c).settings.intensity);
                View view2 = znVar.b;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 23:
                of ofVar = (of) this.b;
                String str13 = (String) this.c;
                Long l11 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ofVar.a;
                long j10 = chatActivityEnterView.Q2;
                MessageObject messageObject3 = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(str13, j10, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                wn wnVar12 = chatActivityEnterView.P2;
                of4.sendMessageChatArguments = wnVar12 != null ? wnVar12.O8() : null;
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
            case 24:
                ti tiVar = (ti) this.b;
                mi miVar = (mi) this.c;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i21 = tiVar.M1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i21).getInputUser(miVar.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i21).sendRequest(tL_messages_toggleBotInAttachMenu, new z7(14, tiVar, miVar), 66);
                break;
            case 25:
                ti tiVar2 = (ti) this.b;
                ((wn) this.c).w5 = (MessageSuggestionParams) obj;
                boolean N1 = tiVar2.N1(0, true, 0, tiVar2.x1(), tiVar2.Q0);
                mf mfVar = tiVar2.h0;
                if (mfVar != null) {
                    mfVar.g(!N1);
                    tiVar2.h0 = null;
                    break;
                }
                break;
            case 26:
                ((hi.o4) this.b).getWebViewContainer().F((String) this.c, (String) obj, false);
                break;
            case 27:
                fj fjVar = (fj) this.b;
                MessagesController messagesController = (MessagesController) this.c;
                Long l12 = (Long) obj;
                fjVar.i0 = false;
                TLRPC.User user = l12 == null ? null : messagesController.getUser(l12);
                fjVar.h0 = user;
                fjVar.j0 = user == null;
                if (user != null) {
                    fjVar.R();
                    break;
                }
                break;
            case 28:
                pl plVar = (pl) this.b;
                rl rlVar = (rl) this.c;
                sl slVar = plVar.b;
                slVar.u0.d(rlVar.c, slVar.v0, true, 0, ((Long) obj).longValue());
                slVar.b.dismiss(true);
                break;
            default:
                xv xvVar = (xv) this.b;
                boolean[] zArr = (boolean[]) this.c;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new wv(xvVar, 1));
                    break;
                }
                break;
        }
    }
}
