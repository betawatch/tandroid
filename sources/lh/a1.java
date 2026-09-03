package lh;

import android.app.Activity;
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
import java.io.File;
import java.net.URLEncoder;
import java.util.Calendar;
import mh.j7;
import mh.l7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.oe;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ao;
import org.telegram.ui.d7;
import org.telegram.ui.jj;
import org.telegram.ui.jk;
import org.telegram.ui.jn;
import org.telegram.ui.um;
import org.telegram.ui.w31;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class a1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        float f10;
        boolean z4;
        xn xnVar;
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
        int i12 = this.a;
        int i13 = 4;
        int i14 = 8;
        int i15 = 2;
        String str5 = null;
        int i16 = 0;
        boolean z10 = true;
        boolean z11 = true;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i12) {
            case 0:
                g2 g2Var = (g2) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                Boolean bool = (Boolean) obj;
                g2Var.getClass();
                if (callback != null) {
                    callback.run(bool);
                }
                if (bool.booleanValue()) {
                    g2Var.skipDismissAnimation();
                }
                g2Var.dismiss();
                break;
            case 1:
                g1 g1Var = (g1) obj2;
                if (((Object[]) obj)[1] == ((l7) obj3)) {
                    g1Var.run();
                    break;
                }
                break;
            case 2:
                or0 or0Var = (or0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str6 = (String) obj;
                j7 j7Var = or0Var.e;
                int i17 = tL_starGiftCollection.collection_id;
                j7Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i18 = j7Var.a;
                updatestargiftcollection.peer = MessagesController.getInstance(i18).getInputPeer(j7Var.b);
                updatestargiftcollection.collection_id = i17;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str6;
                ConnectionsManager.getInstance(i18).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str6;
                or0Var.f(true);
                break;
            case 3:
                e6 e6Var = (e6) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                long j10 = e6Var.W;
                Runnable runnable = e6Var.d0;
                if (runnable != null) {
                    runnable.run();
                }
                e6Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new v5(0, user), 250L);
                MessagesController.getInstance(e6Var.V).getMainSettings().edit().putBoolean("show_gift_for_" + j10, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                break;
            case 4:
                mh.g5 g5Var = (mh.g5) obj3;
                String str7 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                mh.c5 c5Var = g5Var.b0;
                sh.i[] iVarArr = g5Var.p0;
                qh.d dVar = g5Var.g0;
                if (stargiftupgradepreview != null) {
                    c5Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    g5Var.q2(1, false, null);
                    c5Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str7), null);
                    iVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    iVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    iVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    g5Var.r0.setVisibility(8);
                    g5Var.q0.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), false, true);
                    dVar.f(null, false);
                    dVar.setOnClickListener(new mh.k1(g5Var, i13));
                    g5Var.show();
                    break;
                }
                break;
            case 5:
                mh.g5.m0((mh.g5) obj3, (org.telegram.ui.ActionBar.d2) obj2, (TL_stars.SavedStarGift) obj);
                break;
            case 6:
                mh.f4 f4Var = (mh.f4) obj3;
                f4Var.getClass();
                ((mh.d4) obj2).a((TL_stars.StarGift) obj, true);
                f4Var.d(true);
                break;
            case 7:
                mh.k4 k4Var = (mh.k4) obj3;
                mf.b bVar = (mf.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                af.f fVar = k4Var.n;
                if (fVar != null && bVar == k4Var.q) {
                    fVar.c(false);
                }
                k4Var.p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    k4Var.o.put(bVar, new mh.i4(bVar, tL_payments_paymentFormStarGift));
                    k4Var.a(true);
                    break;
                }
                break;
            case 8:
                ((Utilities.Callback2) obj3).run((mf.a) obj, new c3((mh.v0[]) obj2, 15));
                break;
            case 9:
                ((VoIPDebugToSend) obj3).lambda$done$0((TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                break;
            case 10:
                org.telegram.ui.ActionBar.o3 o3Var = (org.telegram.ui.ActionBar.o3) obj3;
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                if (p2Var != null) {
                    if ((p2Var instanceof xn) && (jkVar = (xnVar = (xn) p2Var).V) != null) {
                        jkVar.P();
                        xnVar.V.n0(true, false, true);
                    }
                    if (p2Var.getContext() != null && p2Var.getParentActivity() != null) {
                        sh.p2 p2Var2 = new sh.p2(p2Var.getContext(), p2Var.getResourceProvider());
                        p2Var2.h0 = p2Var.getParentActivity();
                        if (n3Var != null && n3Var.a != null) {
                            p2Var2.B0 = true;
                            boolean z12 = n3Var.m;
                            p2Var2.S = z12;
                            if (z12) {
                                p2Var2.v(n3Var.p, false);
                            }
                            if (n3Var.l) {
                                i10 = n3Var.o;
                            } else {
                                int i19 = n3Var.n;
                                if (i19 < 0) {
                                    i19 = k6.d6;
                                }
                                i10 = k6.v0(i19, p2Var2.B);
                            }
                            p2Var2.t(i10, n3Var.l, false);
                            p2Var2.y(n3Var.q, false);
                            p2Var2.C0 = n3Var.h;
                            p2Var2.D0 = n3Var.i;
                            boolean z13 = n3Var.s;
                            p2Var2.t0 = z13;
                            sh.h2 h2Var = p2Var2.x;
                            h2Var.setIsBackButtonVisible(z13);
                            p2Var2.v.setAllowSwipes(n3Var.j);
                            AndroidUtilities.updateImageViewImageAnimated(p2Var2.T.getBackButton(), p2Var2.t0 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
                            BotFullscreenButtons botFullscreenButtons = p2Var2.j0;
                            if (botFullscreenButtons != null) {
                                botFullscreenButtons.setBack(p2Var2.t0, false);
                            }
                            p2Var2.o0 = n3Var.w;
                            p2Var2.w0 = Boolean.valueOf(n3Var.z);
                            p2Var2.x0 = n3Var.A;
                            sh.u0 u0Var = n3Var.I;
                            p2Var2.y0 = u0Var;
                            if (u0Var != null) {
                                sh.s0 s0Var = u0Var.r;
                                SensorManager sensorManager = u0Var.a;
                                f10 = 0.721f;
                                if (u0Var.l) {
                                    u0Var.l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = u0Var.b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(u0Var.n, sensor, sh.u0.a(u0Var.c));
                                        }
                                        Sensor sensor2 = u0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(u0Var.p, sensor2, sh.u0.a(u0Var.e));
                                        }
                                        Sensor sensor3 = u0Var.g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(s0Var, sensor3, sh.u0.a(u0Var.h));
                                        }
                                        Sensor sensor4 = u0Var.f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(s0Var, sensor4, sh.u0.a(u0Var.h));
                                        }
                                        Sensor sensor5 = u0Var.i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(u0Var.t, sensor5, sh.u0.a(u0Var.j));
                                        }
                                    }
                                }
                            } else {
                                f10 = 0.721f;
                            }
                            b4.e0 e0Var = n3Var.u;
                            if (e0Var != null) {
                                sh.l2 l2Var = p2Var2.i0;
                                int totalHeight = l2Var.getTotalHeight();
                                l2Var.e = e0Var;
                                sh.s[] sVarArr = l2Var.f;
                                sh.u.b(sVarArr[0].l, (sh.t) e0Var.c, false);
                                sh.u.b(sVarArr[1].l, (sh.t) e0Var.d, false);
                                l2Var.invalidate();
                                if (totalHeight != l2Var.getTotalHeight() && l2Var.r != null) {
                                    if (totalHeight < l2Var.getTotalHeight()) {
                                        AndroidUtilities.runOnUIThread(l2Var.r, 200L);
                                    } else {
                                        l2Var.r.run();
                                    }
                                }
                                int i20 = e0Var.b;
                                Paint paint = l2Var.a;
                                l2Var.e.b = i20;
                                paint.setColor(i20);
                                l2Var.d.a(i20, true);
                            }
                            p2Var2.x(n3Var.x, false, n3Var.y);
                            sh.y3 y3Var = n3Var.a;
                            p2Var2.D = y3Var != null ? y3Var.a : UserConfig.selectedAccount;
                            org.telegram.ui.web.x0 x0Var = n3Var.b;
                            if (x0Var != null) {
                                x0Var.onResume();
                                int i21 = p2Var2.D;
                                org.telegram.ui.web.x0 x0Var2 = n3Var.b;
                                Object obj4 = n3Var.d;
                                h2Var.J = i21;
                                h2Var.Q(x0Var2, obj4);
                                if (h2Var.l0) {
                                    h2Var.v("visibility_changed", org.telegram.ui.web.a1.x(Boolean.TRUE, "is_visible"));
                                }
                                boolean z14 = n3Var.r || n3Var.b.b;
                                String str8 = n3Var.v;
                                h2Var.g("setState(" + z14 + ", " + str8 + ")");
                                h2Var.K = z14;
                                h2Var.b = str8;
                                if (k6.I.q() != n3Var.B) {
                                    h2Var.w();
                                }
                            } else {
                                y3Var.q = null;
                                y3Var.r = 0L;
                            }
                            p2Var2.s(p2Var, n3Var.a);
                            p2Var2.Y = n3Var.t;
                            if (n3Var.E) {
                                p2Var2.P0 = true;
                                p2Var2.i();
                                org.telegram.ui.f3 f3Var = p2Var2.R0;
                                String userName = UserObject.getUserName(MessagesController.getInstance(p2Var2.D).getUser(Long.valueOf(p2Var2.E)));
                                String str9 = n3Var.F;
                                p2Var2.Q0 = str9;
                                f3Var.a(userName, str9);
                                org.telegram.ui.f3 f3Var2 = p2Var2.R0;
                                Paint paint2 = p2Var2.M;
                                z4 = false;
                                f3Var2.b(AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= f10, false);
                                p2Var2.R0.setBackgroundColor(paint2.getColor());
                                p2Var2.R0.setVisibility(0);
                                p2Var2.R0.setAlpha(1.0f);
                            } else {
                                z4 = false;
                            }
                            p2Var2.o(n3Var.J);
                            o3Var.h(o3Var.w, n3Var, z4);
                            p2Var2.show();
                            break;
                        }
                    }
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.u3 u3Var = (org.telegram.ui.ActionBar.u3) obj2;
                ((org.telegram.ui.ActionBar.n3) obj3).k = (Bitmap) obj;
                u3Var.getWindowView().setDrawingFromOverlay(false);
                u3Var.release();
                break;
            case 12:
                org.telegram.ui.ActionBar.w3 w3Var = (org.telegram.ui.ActionBar.w3) obj2;
                org.telegram.ui.ActionBar.x3 x3Var = ((org.telegram.ui.ActionBar.t3) obj3).p;
                if (!((Boolean) obj).booleanValue()) {
                    w3Var.a(0.0f);
                    break;
                } else {
                    w3Var.a(1.0f);
                    if (x3Var.a.getTabs().isEmpty()) {
                        x3Var.a(false);
                        break;
                    }
                }
                break;
            case 13:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) obj3;
                Activity activity = (Activity) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.y3 y3Var2 = l4Var.H;
                org.telegram.ui.l0[] l0VarArr = l4Var.P0;
                if ((!l4Var.r0[0].c() || l4Var.r0[0].c.B != null) && l4Var.I != null) {
                    if (num.intValue() != 1) {
                        if (num.intValue() != 2) {
                            int i22 = 6;
                            if (num.intValue() != 6) {
                                int i23 = 5;
                                if (num.intValue() != 7) {
                                    int i24 = 3;
                                    if (num.intValue() != 8) {
                                        int i25 = 9;
                                        if (num.intValue() != 9) {
                                            if (num.intValue() != 3) {
                                                if (num.intValue() != 4) {
                                                    if (num.intValue() != 5) {
                                                        if (num.intValue() == 10 && (f2Var = l4Var.r0[0].y) != null && f2Var.b() != null) {
                                                            l4Var.h(f2Var.b(), null, 1);
                                                            break;
                                                        }
                                                    } else if (l4Var.r0[0].f() && l4Var.r0[0].getWebView() != null) {
                                                        l4Var.r0[0].getWebView().reload();
                                                        break;
                                                    }
                                                } else if (!l4Var.r0[0].f()) {
                                                    org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(l4Var.I, null, false, false);
                                                    h3Var.fixNavigationBar();
                                                    h3Var.applyTopPadding = false;
                                                    LinearLayout linearLayout = new LinearLayout(l4Var.I);
                                                    linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                                                    linearLayout.setOrientation(1);
                                                    org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(l4Var.I, (g6) null);
                                                    m4Var.setText(LocaleController.getString(R.string.FontSize));
                                                    linearLayout.addView(m4Var, k7.c6.t(-2, -2, 51, 3, 1, 3, 0));
                                                    linearLayout.addView(new org.telegram.ui.h4(l4Var, l4Var.I), k7.c6.t(-1, -2, 51, 3, 0, 3, 0));
                                                    org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(l4Var.I, (g6) null);
                                                    m4Var2.setText(LocaleController.getString(R.string.FontType));
                                                    linearLayout.addView(m4Var2, k7.c6.t(-2, -2, 51, 3, 4, 3, 2));
                                                    int i26 = 0;
                                                    while (i26 < i15) {
                                                        Activity activity2 = l4Var.I;
                                                        org.telegram.ui.l0 l0Var = new org.telegram.ui.l0(activity2);
                                                        l0Var.setBackgroundDrawable(k6.f0(k6.w0(null, k6.i6, false), i15, -1));
                                                        RadioButton radioButton = new RadioButton(activity2);
                                                        l0Var.b = radioButton;
                                                        radioButton.setSize(AndroidUtilities.dp(20.0f));
                                                        radioButton.b(k6.w0(null, k6.D5, false), k6.w0(null, k6.E5, false));
                                                        boolean z15 = LocaleController.isRTL;
                                                        l0Var.addView(radioButton, k7.c6.d(22, 22.0f, (z15 ? 5 : 3) | 48, z15 ? 0 : 22, 13.0f, z15 ? 22 : 0, 0.0f));
                                                        TextView textView = new TextView(activity2);
                                                        org.telegram.ui.b.q(textView, k6.w0(null, k6.G6, false), 1, 16.0f, 1);
                                                        textView.setMaxLines(1);
                                                        textView.setSingleLine(true);
                                                        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                                                        boolean z16 = LocaleController.isRTL;
                                                        l0Var.addView(textView, k7.c6.d(-1, -1.0f, (z16 ? 5 : 3) | 48, z16 ? 17 : 62, 0.0f, z16 ? 62 : 17, 0.0f));
                                                        l0VarArr[i26] = l0Var;
                                                        if (i26 == 0) {
                                                            String string = LocaleController.getString(R.string.Default);
                                                            Typeface typeface = Typeface.DEFAULT;
                                                            textView.setText(string);
                                                            textView.setTypeface(typeface);
                                                            l0Var.setContentDescription(string);
                                                            l0Var.invalidate();
                                                        } else if (i26 == 1) {
                                                            Typeface typeface2 = Typeface.SERIF;
                                                            textView.setText("Serif");
                                                            textView.setTypeface(typeface2);
                                                            l0Var.setContentDescription("Serif");
                                                            l0Var.invalidate();
                                                        }
                                                        ((RadioButton) l0VarArr[i26].b).a(i26 == l4Var.a, false);
                                                        l0VarArr[i26].setTag(Integer.valueOf(i26));
                                                        l0VarArr[i26].setOnClickListener(new org.telegram.ui.u(l4Var, i13));
                                                        linearLayout.addView(l0VarArr[i26], k7.c6.n(-1, 50));
                                                        i26++;
                                                        i15 = 2;
                                                    }
                                                    h3Var.customView = linearLayout;
                                                    l4Var.F = h3Var;
                                                    l4Var.a0(h3Var);
                                                    break;
                                                } else {
                                                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                                    if (U != null) {
                                                        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                                                        n2Var.a = true;
                                                        U.showAsSheet(new org.telegram.ui.web.x1(new org.telegram.ui.t(l4Var, i24)), n2Var);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                if (!l4Var.r0[0].f()) {
                                                    TLRPC.WebPage webPage = l4Var.r0[0].c.B;
                                                    if (webPage != null) {
                                                        String str10 = webPage.url;
                                                        TL_iv.Page page = webPage.cached_page;
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
                                                } else if (l4Var.r0[0].getWebView() != null) {
                                                    str = l4Var.r0[0].getWebView().getUrl();
                                                    str2 = l4Var.r0[0].getWebView().getOpenURL();
                                                    file = null;
                                                }
                                                Activity activity3 = l4Var.I;
                                                if (activity3 != null && !activity3.isFinishing()) {
                                                    if (file == null) {
                                                        if (str != null) {
                                                            String hostAuthority = AndroidUtilities.getHostAuthority(str2, true);
                                                            String hostAuthority2 = AndroidUtilities.getHostAuthority(str, true);
                                                            org.telegram.ui.z zVar = new org.telegram.ui.z(l4Var, str, z11 ? 1 : 0);
                                                            org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(l4Var, hostAuthority2, hostAuthority, z10 ? 1 : 0);
                                                            if (!l4Var.r0[0].f() || !MessagesController.getInstance(l4Var.U).isWebBrowserOpenInApp(hostAuthority2) || MessagesController.getInstance(l4Var.U).isWebBrowserExceptionsLimitReached(true)) {
                                                                zVar.run();
                                                                break;
                                                            } else {
                                                                org.telegram.ui.Components.z4.o0(activity, null, str, true, new eh.w(i25, a0Var, zVar));
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        AndroidUtilities.openForView(file, null, "text/markdown", l4Var.I, null, true);
                                                        break;
                                                    }
                                                }
                                            }
                                        } else if (l4Var.r0[0].getWebView() != null) {
                                            l4Var.r0[0].getWebView().goForward();
                                            break;
                                        }
                                    } else {
                                        org.telegram.ui.ActionBar.n2 n2Var2 = new org.telegram.ui.ActionBar.n2();
                                        n2Var2.a = true;
                                        org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                        if (U2 != null) {
                                            U2.showAsSheet(new org.telegram.ui.web.f1(y3Var2 != null ? new org.telegram.ui.c0(l4Var, i22) : null, new org.telegram.ui.t(l4Var, i24)), n2Var2);
                                            break;
                                        }
                                    }
                                } else {
                                    org.telegram.ui.ActionBar.n2 n2Var3 = new org.telegram.ui.ActionBar.n2();
                                    n2Var3.a = true;
                                    org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                                    if (U3 != null) {
                                        U3.showAsSheet(new org.telegram.ui.web.p(y3Var2 != null ? new org.telegram.ui.c0(l4Var, i23) : null, new org.telegram.ui.t(l4Var, i15)), n2Var3);
                                        break;
                                    }
                                }
                            } else {
                                if (!l4Var.r0[0].f()) {
                                    org.telegram.ui.p3 p3Var = l4Var.r0[0];
                                    TLRPC.WebPage webPage2 = p3Var.c.B;
                                    if (webPage2 != null) {
                                        str3 = webPage2.url;
                                        frameLayout = p3Var;
                                    }
                                } else if (l4Var.r0[0].getWebView() != null) {
                                    str3 = l4Var.r0[0].getWebView().getUrl();
                                    frameLayout = l4Var.r0[0].f;
                                }
                                org.telegram.ui.l4.f(str3, l4Var.U, frameLayout, y3Var2, null);
                                break;
                            }
                        } else {
                            if (!l4Var.r0[0].f()) {
                                TLRPC.WebPage webPage3 = l4Var.r0[0].c.B;
                                if (webPage3 != null) {
                                    str4 = webPage3.url;
                                }
                            } else if (l4Var.r0[0].getWebView() != null) {
                                str4 = l4Var.r0[0].getWebView().getUrl();
                            }
                            String s6 = org.telegram.ui.web.a1.s(str4);
                            l4Var.a0(new lq0(l4Var.I, null, s6, false, s6, false, AndroidUtilities.computePerceivedBrightness(l4Var.e0.getBackgroundColor()) < 0.721f ? new oh.b() : null));
                            break;
                        }
                    } else {
                        org.telegram.ui.m0 m0Var = l4Var.e0;
                        int dp = AndroidUtilities.dp(56.0f);
                        l4Var.F0 = dp;
                        m0Var.setHeight(dp);
                        l4Var.e0.h(true);
                        break;
                    }
                }
                break;
            case 14:
                org.telegram.ui.p3 p3Var2 = (org.telegram.ui.p3) obj3;
                Activity activity4 = (Activity) obj2;
                String str11 = (String) obj;
                if (!TextUtils.isEmpty(str11) && p3Var2.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str11.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i27 = 0;
                    while (i16 < uRLSpanArr.length) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i16]), length);
                        i27 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i16]), i27);
                        i16++;
                    }
                    Uri uriParseSafe = Utilities.uriParseSafe(str11);
                    if (uriParseSafe == null || !TextUtils.equals(uriParseSafe.getScheme(), "javascript")) {
                        if ((uRLSpanArr.length > 0 && length == 0 && i27 > 0) || (uriParseSafe != null && uriParseSafe.getScheme() != null)) {
                            if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                                str11 = af.g.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                            }
                            p3Var2.getWebView().loadUrl(str11);
                            break;
                        } else {
                            org.telegram.ui.web.k.b(activity4, str11);
                            org.telegram.ui.web.x0 webView = p3Var2.getWebView();
                            String str12 = org.telegram.ui.web.m1.a().b;
                            if (str12 != null) {
                                StringBuilder l10 = e2.c.l(str12);
                                l10.append(URLEncoder.encode(str11));
                                str5 = l10.toString();
                            }
                            webView.loadUrl(str5);
                            break;
                        }
                    }
                }
                break;
            case 15:
                xn xnVar2 = (xn) obj3;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = xnVar2.getMessagesController().getInputPeer(xnVar2.Q5);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((vf.o1) obj2).a;
                xnVar2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                jk jkVar2 = xnVar2.V;
                if (jkVar2 != null) {
                    jkVar2.setFieldText(null);
                    break;
                }
                break;
            case 16:
                xn xnVar3 = (xn) obj3;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) obj2, xnVar3.Q5, xnVar3.k5, xnVar3.U3, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = xnVar3.C8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = xnVar3.N8();
                of2.suggestionParams = xnVar3.d5;
                xnVar3.getSendMessagesHelper().sendMessage(of2);
                xnVar3.V.setFieldText("");
                xnVar3.e9(false);
                break;
            case 17:
                xn xnVar4 = (xn) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l11 = (Long) obj;
                if (xnVar4.O3 != 1) {
                    xnVar4.cb(botInlineResult, true, 0, l11.longValue());
                    break;
                } else {
                    org.telegram.ui.Components.z4.M(xnVar4.getParentActivity(), xnVar4.Q5, new d7(xnVar4, botInlineResult, l11, i15), xnVar4.ba);
                    break;
                }
            case 18:
                xn.q1((xn) obj3, (w31[]) obj2, (q70) obj);
                break;
            case 19:
                xn xnVar5 = (xn) obj3;
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    d2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (!(tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError)) {
                        new hh.g(xnVar5.getParentActivity(), xnVar5.ba, tL_statsPollStats).show();
                        break;
                    } else {
                        l.d.v(R.string.PollStatsWillLater, qc.a0(xnVar5), R.raw.timer_toast, 24);
                        break;
                    }
                }
                break;
            case 20:
                xn xnVar6 = (xn) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                xnVar6.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    xnVar6.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    break;
                }
                break;
            case 21:
                vf.o1 o1Var = (vf.o1) obj2;
                String str13 = (String) obj;
                xn xnVar7 = ((jj) obj3).b;
                if (o1Var != null) {
                    i11 = ((org.telegram.ui.ActionBar.p2) xnVar7).currentAccount;
                    vf.p1.f(i11).k(o1Var.a, str13);
                }
                xnVar7.N3 = str13;
                xnVar7.X0.setTitle(str13);
                break;
            case 22:
                MessageObject messageObject2 = (MessageObject) obj2;
                Long l12 = (Long) obj;
                xn xnVar8 = ((jn) obj3).a;
                if (xnVar8.f7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), xnVar8.Q5, xnVar8.k5, xnVar8.U3, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = xnVar8.C8();
                    of3.dice_stake = l12.longValue();
                    xnVar8.getSendMessagesHelper().sendMessage(of3);
                    break;
                }
                break;
            case 23:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj2;
                xn xnVar9 = ((jn) obj3).a;
                if (!((Boolean) obj).booleanValue()) {
                    if (t1Var.getMessageObject() != null) {
                        t1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
                    }
                    t1Var.h4();
                    break;
                } else {
                    while (i16 < xnVar9.u0.getChildCount()) {
                        View childAt = xnVar9.u0.getChildAt(i16);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                            if (t1Var2.getMessageObject() != null && t1Var2.getMessageObject().isSensitive()) {
                                t1Var2.h4();
                            }
                        }
                        i16++;
                    }
                    break;
                }
                break;
            case 24:
                jn jnVar = (jn) obj3;
                a1 a1Var = (a1) obj2;
                xn xnVar10 = jnVar.a;
                if (!((Boolean) obj).booleanValue()) {
                    qc.a0(xnVar10).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                } else {
                    xnVar10.getMessagesController().setContentSettings(true);
                    qc.a0(xnVar10).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new um(jnVar, i14)), true)).k(true);
                    a1Var.run(Boolean.TRUE);
                    break;
                }
            case 25:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((jn) obj3).a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.id, (String) obj);
                break;
            case 26:
                ao aoVar = (ao) obj3;
                aoVar.f.t(((qf.a) obj).b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view = aoVar.b;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 27:
                Long l13 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((ef) obj3).a;
                long j11 = chatActivityEnterView.M2;
                MessageObject messageObject3 = chatActivityEnterView.P2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of((String) obj2, j11, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                xn xnVar11 = chatActivityEnterView.L2;
                of4.sendMessageChatArguments = xnVar11 != null ? xnVar11.C8() : null;
                of4.effect_id = chatActivityEnterView.O4;
                of4.payStars = l13.longValue();
                of4.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of4.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.N).sendMessage(of4);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.j0.c();
                oe oeVar = chatActivityEnterView.G0;
                chatActivityEnterView.O4 = 0L;
                oeVar.setEffect(0L);
                break;
            case 28:
                mi miVar = (mi) obj3;
                ((xn) obj2).d5 = (MessageSuggestionParams) obj;
                boolean G1 = miVar.G1(0, true, 0, miVar.s1(), miVar.K0);
                cf cfVar = miVar.e0;
                if (cfVar != null) {
                    cfVar.h(!G1);
                    miVar.e0 = null;
                    break;
                }
                break;
            default:
                ((sh.n3) obj3).getWebViewContainer().C((String) obj2, (String) obj, false);
                break;
        }
    }
}
