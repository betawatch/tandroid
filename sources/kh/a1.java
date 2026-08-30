package kh;

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
import lh.j7;
import lh.l7;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.oe;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ao;
import org.telegram.ui.d7;
import org.telegram.ui.jj;
import org.telegram.ui.jk;
import org.telegram.ui.jn;
import org.telegram.ui.p31;
import org.telegram.ui.um;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        org.telegram.ui.web.e2 e2Var;
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
                h2 h2Var = (h2) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                Boolean bool = (Boolean) obj;
                h2Var.getClass();
                if (callback != null) {
                    callback.run(bool);
                }
                if (bool.booleanValue()) {
                    h2Var.skipDismissAnimation();
                }
                h2Var.dismiss();
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
                lh.g5 g5Var = (lh.g5) obj3;
                String str7 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                lh.c5 c5Var = g5Var.b0;
                rh.j[] jVarArr = g5Var.p0;
                ph.d dVar = g5Var.g0;
                if (stargiftupgradepreview != null) {
                    c5Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    g5Var.q2(1, false, null);
                    c5Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str7), null);
                    jVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    jVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    jVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    g5Var.r0.setVisibility(8);
                    g5Var.q0.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), false, true);
                    dVar.f(null, false);
                    dVar.setOnClickListener(new lh.l1(g5Var, i13));
                    g5Var.show();
                    break;
                }
                break;
            case 5:
                lh.g5.m0((lh.g5) obj3, (org.telegram.ui.ActionBar.d2) obj2, (TL_stars.SavedStarGift) obj);
                break;
            case 6:
                lh.f4 f4Var = (lh.f4) obj3;
                f4Var.getClass();
                ((lh.d4) obj2).a((TL_stars.StarGift) obj, true);
                f4Var.d(true);
                break;
            case 7:
                lh.k4 k4Var = (lh.k4) obj3;
                mf.b bVar = (mf.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                af.f fVar = k4Var.n;
                if (fVar != null && bVar == k4Var.q) {
                    fVar.c(false);
                }
                k4Var.p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    k4Var.o.put(bVar, new lh.i4(bVar, tL_payments_paymentFormStarGift));
                    k4Var.a(true);
                    break;
                }
                break;
            case 8:
                ((Utilities.Callback2) obj3).run((mf.a) obj, new lh.b((lh.w0[]) obj2, 14));
                break;
            case 9:
                ((VoIPDebugToSend) obj3).lambda$done$0((TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                break;
            case 10:
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) obj3;
                org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                if (p2Var != null) {
                    if ((p2Var instanceof xn) && (jkVar = (xnVar = (xn) p2Var).V) != null) {
                        jkVar.P();
                        xnVar.V.n0(true, false, true);
                    }
                    if (p2Var.getContext() != null && p2Var.getParentActivity() != null) {
                        rh.q2 q2Var = new rh.q2(p2Var.getContext(), p2Var.getResourceProvider());
                        q2Var.h0 = p2Var.getParentActivity();
                        if (m3Var != null && m3Var.a != null) {
                            q2Var.B0 = true;
                            boolean z12 = m3Var.m;
                            q2Var.S = z12;
                            if (z12) {
                                q2Var.v(m3Var.p, false);
                            }
                            if (m3Var.l) {
                                i10 = m3Var.o;
                            } else {
                                int i19 = m3Var.n;
                                if (i19 < 0) {
                                    i19 = j6.d6;
                                }
                                i10 = j6.v0(i19, q2Var.B);
                            }
                            q2Var.t(i10, m3Var.l, false);
                            q2Var.y(m3Var.q, false);
                            q2Var.C0 = m3Var.h;
                            q2Var.D0 = m3Var.i;
                            boolean z13 = m3Var.s;
                            q2Var.t0 = z13;
                            rh.i2 i2Var = q2Var.x;
                            i2Var.setIsBackButtonVisible(z13);
                            q2Var.v.setAllowSwipes(m3Var.j);
                            AndroidUtilities.updateImageViewImageAnimated(q2Var.T.getBackButton(), q2Var.t0 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
                            BotFullscreenButtons botFullscreenButtons = q2Var.j0;
                            if (botFullscreenButtons != null) {
                                botFullscreenButtons.setBack(q2Var.t0, false);
                            }
                            q2Var.o0 = m3Var.w;
                            q2Var.w0 = Boolean.valueOf(m3Var.z);
                            q2Var.x0 = m3Var.A;
                            rh.v0 v0Var = m3Var.I;
                            q2Var.y0 = v0Var;
                            if (v0Var != null) {
                                rh.t0 t0Var = v0Var.r;
                                SensorManager sensorManager = v0Var.a;
                                f10 = 0.721f;
                                if (v0Var.l) {
                                    v0Var.l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = v0Var.b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(v0Var.n, sensor, rh.v0.a(v0Var.c));
                                        }
                                        Sensor sensor2 = v0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(v0Var.p, sensor2, rh.v0.a(v0Var.e));
                                        }
                                        Sensor sensor3 = v0Var.g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(t0Var, sensor3, rh.v0.a(v0Var.h));
                                        }
                                        Sensor sensor4 = v0Var.f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(t0Var, sensor4, rh.v0.a(v0Var.h));
                                        }
                                        Sensor sensor5 = v0Var.i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(v0Var.t, sensor5, rh.v0.a(v0Var.j));
                                        }
                                    }
                                }
                            } else {
                                f10 = 0.721f;
                            }
                            b4.e0 e0Var = m3Var.u;
                            if (e0Var != null) {
                                rh.m2 m2Var = q2Var.i0;
                                int totalHeight = m2Var.getTotalHeight();
                                m2Var.e = e0Var;
                                rh.t[] tVarArr = m2Var.f;
                                rh.v.b(tVarArr[0].l, (rh.u) e0Var.c, false);
                                rh.v.b(tVarArr[1].l, (rh.u) e0Var.d, false);
                                m2Var.invalidate();
                                if (totalHeight != m2Var.getTotalHeight() && m2Var.r != null) {
                                    if (totalHeight < m2Var.getTotalHeight()) {
                                        AndroidUtilities.runOnUIThread(m2Var.r, 200L);
                                    } else {
                                        m2Var.r.run();
                                    }
                                }
                                int i20 = e0Var.b;
                                Paint paint = m2Var.a;
                                m2Var.e.b = i20;
                                paint.setColor(i20);
                                m2Var.d.a(i20, true);
                            }
                            q2Var.x(m3Var.x, false, m3Var.y);
                            rh.z3 z3Var = m3Var.a;
                            q2Var.D = z3Var != null ? z3Var.a : UserConfig.selectedAccount;
                            org.telegram.ui.web.w0 w0Var = m3Var.b;
                            if (w0Var != null) {
                                w0Var.onResume();
                                int i21 = q2Var.D;
                                org.telegram.ui.web.w0 w0Var2 = m3Var.b;
                                Object obj4 = m3Var.d;
                                i2Var.J = i21;
                                i2Var.Q(w0Var2, obj4);
                                if (i2Var.l0) {
                                    i2Var.v("visibility_changed", org.telegram.ui.web.a1.x(Boolean.TRUE, "is_visible"));
                                }
                                boolean z14 = m3Var.r || m3Var.b.b;
                                String str8 = m3Var.v;
                                i2Var.g("setState(" + z14 + ", " + str8 + ")");
                                i2Var.K = z14;
                                i2Var.b = str8;
                                if (j6.I.q() != m3Var.B) {
                                    i2Var.w();
                                }
                            } else {
                                z3Var.q = null;
                                z3Var.r = 0L;
                            }
                            q2Var.s(p2Var, m3Var.a);
                            q2Var.Y = m3Var.t;
                            if (m3Var.E) {
                                q2Var.P0 = true;
                                q2Var.i();
                                org.telegram.ui.f3 f3Var = q2Var.R0;
                                String userName = UserObject.getUserName(MessagesController.getInstance(q2Var.D).getUser(Long.valueOf(q2Var.E)));
                                String str9 = m3Var.F;
                                q2Var.Q0 = str9;
                                f3Var.a(userName, str9);
                                org.telegram.ui.f3 f3Var2 = q2Var.R0;
                                Paint paint2 = q2Var.M;
                                z4 = false;
                                f3Var2.b(AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= f10, false);
                                q2Var.R0.setBackgroundColor(paint2.getColor());
                                q2Var.R0.setVisibility(0);
                                q2Var.R0.setAlpha(1.0f);
                            } else {
                                z4 = false;
                            }
                            q2Var.o(m3Var.J);
                            n3Var.h(n3Var.w, m3Var, z4);
                            q2Var.show();
                            break;
                        }
                    }
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.t3 t3Var = (org.telegram.ui.ActionBar.t3) obj2;
                ((org.telegram.ui.ActionBar.m3) obj3).k = (Bitmap) obj;
                t3Var.getWindowView().setDrawingFromOverlay(false);
                t3Var.release();
                break;
            case 12:
                org.telegram.ui.ActionBar.v3 v3Var = (org.telegram.ui.ActionBar.v3) obj2;
                org.telegram.ui.ActionBar.w3 w3Var = ((org.telegram.ui.ActionBar.s3) obj3).p;
                if (!((Boolean) obj).booleanValue()) {
                    v3Var.a(0.0f);
                    break;
                } else {
                    v3Var.a(1.0f);
                    if (w3Var.a.getTabs().isEmpty()) {
                        w3Var.a(false);
                        break;
                    }
                }
                break;
            case 13:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) obj3;
                Activity activity = (Activity) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.y3 y3Var = l4Var.H;
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
                                                        if (num.intValue() == 10 && (e2Var = l4Var.r0[0].y) != null && e2Var.b() != null) {
                                                            l4Var.h(e2Var.b(), null, 1);
                                                            break;
                                                        }
                                                    } else if (l4Var.r0[0].f() && l4Var.r0[0].getWebView() != null) {
                                                        l4Var.r0[0].getWebView().reload();
                                                        break;
                                                    }
                                                } else if (!l4Var.r0[0].f()) {
                                                    org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(l4Var.I, null, false, false);
                                                    g3Var.fixNavigationBar();
                                                    g3Var.applyTopPadding = false;
                                                    LinearLayout linearLayout = new LinearLayout(l4Var.I);
                                                    linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                                                    linearLayout.setOrientation(1);
                                                    org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(l4Var.I, (org.telegram.ui.ActionBar.f6) null);
                                                    m4Var.setText(LocaleController.getString(R.string.FontSize));
                                                    linearLayout.addView(m4Var, k7.b6.t(-2, -2, 51, 3, 1, 3, 0));
                                                    linearLayout.addView(new org.telegram.ui.h4(l4Var, l4Var.I), k7.b6.t(-1, -2, 51, 3, 0, 3, 0));
                                                    org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(l4Var.I, (org.telegram.ui.ActionBar.f6) null);
                                                    m4Var2.setText(LocaleController.getString(R.string.FontType));
                                                    linearLayout.addView(m4Var2, k7.b6.t(-2, -2, 51, 3, 4, 3, 2));
                                                    int i26 = 0;
                                                    while (i26 < i15) {
                                                        Activity activity2 = l4Var.I;
                                                        org.telegram.ui.l0 l0Var = new org.telegram.ui.l0(activity2);
                                                        l0Var.setBackgroundDrawable(j6.f0(j6.w0(null, j6.i6, false), i15, -1));
                                                        RadioButton radioButton = new RadioButton(activity2);
                                                        l0Var.b = radioButton;
                                                        radioButton.setSize(AndroidUtilities.dp(20.0f));
                                                        radioButton.b(j6.w0(null, j6.D5, false), j6.w0(null, j6.E5, false));
                                                        boolean z15 = LocaleController.isRTL;
                                                        l0Var.addView(radioButton, k7.b6.d(22, 22.0f, (z15 ? 5 : 3) | 48, z15 ? 0 : 22, 13.0f, z15 ? 22 : 0, 0.0f));
                                                        TextView textView = new TextView(activity2);
                                                        org.telegram.ui.b.q(textView, j6.w0(null, j6.G6, false), 1, 16.0f, 1);
                                                        textView.setMaxLines(1);
                                                        textView.setSingleLine(true);
                                                        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                                                        boolean z16 = LocaleController.isRTL;
                                                        l0Var.addView(textView, k7.b6.d(-1, -1.0f, (z16 ? 5 : 3) | 48, z16 ? 17 : 62, 0.0f, z16 ? 62 : 17, 0.0f));
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
                                                        linearLayout.addView(l0VarArr[i26], k7.b6.n(-1, 50));
                                                        i26++;
                                                        i15 = 2;
                                                    }
                                                    g3Var.customView = linearLayout;
                                                    l4Var.F = g3Var;
                                                    l4Var.a0(g3Var);
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
                                                                org.telegram.ui.Components.z4.o0(activity, null, str, true, new dh.v(i25, a0Var, zVar));
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
                                            U2.showAsSheet(new org.telegram.ui.web.e1(y3Var != null ? new org.telegram.ui.c0(l4Var, i22) : null, new org.telegram.ui.t(l4Var, i24)), n2Var2);
                                            break;
                                        }
                                    }
                                } else {
                                    org.telegram.ui.ActionBar.n2 n2Var3 = new org.telegram.ui.ActionBar.n2();
                                    n2Var3.a = true;
                                    org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                                    if (U3 != null) {
                                        U3.showAsSheet(new org.telegram.ui.web.p(y3Var != null ? new org.telegram.ui.c0(l4Var, i23) : null, new org.telegram.ui.t(l4Var, i15)), n2Var3);
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
                                org.telegram.ui.l4.f(str3, l4Var.U, frameLayout, y3Var, null);
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
                            l4Var.a0(new lq0(l4Var.I, null, s6, false, s6, false, AndroidUtilities.computePerceivedBrightness(l4Var.e0.getBackgroundColor()) < 0.721f ? new nh.b() : null));
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
                            org.telegram.ui.web.w0 webView = p3Var2.getWebView();
                            String str12 = org.telegram.ui.web.l1.a().b;
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
                tL_messages_sendQuickReplyMessages.shortcut_id = ((uf.o1) obj2).a;
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
                xn.q1((xn) obj3, (p31[]) obj2, (o70) obj);
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
                        new gh.g(xnVar5.getParentActivity(), xnVar5.ba, tL_statsPollStats).show();
                        break;
                    } else {
                        a2.v(R.string.PollStatsWillLater, qc.a0(xnVar5), R.raw.timer_toast, 24);
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
                uf.o1 o1Var = (uf.o1) obj2;
                String str13 = (String) obj;
                xn xnVar7 = ((jj) obj3).b;
                if (o1Var != null) {
                    i11 = ((org.telegram.ui.ActionBar.p2) xnVar7).currentAccount;
                    uf.p1.f(i11).k(o1Var.a, str13);
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
                li liVar = (li) obj3;
                ((xn) obj2).d5 = (MessageSuggestionParams) obj;
                boolean G1 = liVar.G1(0, true, 0, liVar.s1(), liVar.K0);
                cf cfVar = liVar.e0;
                if (cfVar != null) {
                    cfVar.h(!G1);
                    liVar.e0 = null;
                    break;
                }
                break;
            default:
                ((rh.o3) obj3).getWebViewContainer().C((String) obj2, (String) obj, false);
                break;
        }
    }
}
