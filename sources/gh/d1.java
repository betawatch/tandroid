package gh;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import hh.k7;
import hh.m7;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import lh.cc;
import lh.k9;
import lh.ma;
import lh.oa;
import lh.pc;
import lh.q9;
import lh.qc;
import lh.r9;
import lh.rb;
import lh.sb;
import lh.t9;
import lh.u6;
import lh.va;
import lh.wb;
import lh.xb;
import lh.z7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ck;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(Object obj) {
        org.telegram.ui.web.c2 c2Var;
        String str;
        String str2;
        File file;
        String str3;
        FrameLayout frameLayout;
        String str4;
        org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) this.b;
        Activity activity = (Activity) this.c;
        Integer num = (Integer) obj;
        org.telegram.ui.z3 z3Var = m4Var.G;
        org.telegram.ui.n0[] n0VarArr = m4Var.O0;
        if ((m4Var.q0[0].c() && m4Var.q0[0].c.A == null) || m4Var.H == null) {
            return;
        }
        if (num.intValue() == 1) {
            org.telegram.ui.o0 o0Var = m4Var.d0;
            int dp = AndroidUtilities.dp(56.0f);
            m4Var.E0 = dp;
            o0Var.setHeight(dp);
            m4Var.d0.h(true);
            return;
        }
        if (num.intValue() == 2) {
            if (!m4Var.q0[0].f()) {
                TLRPC.WebPage webPage = m4Var.q0[0].c.A;
                if (webPage == null) {
                    return;
                } else {
                    str4 = webPage.url;
                }
            } else if (m4Var.q0[0].getWebView() == null) {
                return;
            } else {
                str4 = m4Var.q0[0].getWebView().getUrl();
            }
            String s10 = org.telegram.ui.web.z0.s(str4);
            m4Var.a0(new sp0(m4Var.H, null, s10, false, s10, false, AndroidUtilities.computePerceivedBrightness(m4Var.d0.getBackgroundColor()) < 0.721f ? new jh.b() : null));
            return;
        }
        if (num.intValue() == 6) {
            if (!m4Var.q0[0].f()) {
                org.telegram.ui.q3 q3Var = m4Var.q0[0];
                TLRPC.WebPage webPage2 = q3Var.c.A;
                if (webPage2 == null) {
                    return;
                }
                str3 = webPage2.url;
                frameLayout = q3Var;
            } else {
                if (m4Var.q0[0].getWebView() == null) {
                    return;
                }
                str3 = m4Var.q0[0].getWebView().getUrl();
                frameLayout = m4Var.q0[0].f;
            }
            org.telegram.ui.m4.f(str3, m4Var.T, frameLayout, z3Var, null);
            return;
        }
        if (num.intValue() == 7) {
            org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
            l2Var.a = true;
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                U.showAsSheet(new org.telegram.ui.web.p(z3Var != null ? new org.telegram.ui.d0(m4Var, 5) : null, new org.telegram.ui.s(m4Var, 2)), l2Var);
                return;
            }
            return;
        }
        if (num.intValue() == 8) {
            org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
            l2Var2.a = true;
            org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
            if (U2 != null) {
                U2.showAsSheet(new org.telegram.ui.web.d1(z3Var != null ? new org.telegram.ui.d0(m4Var, 6) : null, new org.telegram.ui.s(m4Var, 3)), l2Var2);
                return;
            }
            return;
        }
        if (num.intValue() == 9) {
            if (m4Var.q0[0].getWebView() != null) {
                m4Var.q0[0].getWebView().goForward();
                return;
            }
            return;
        }
        if (num.intValue() == 3) {
            if (!m4Var.q0[0].f()) {
                TLRPC.WebPage webPage3 = m4Var.q0[0].c.A;
                if (webPage3 == null) {
                    return;
                }
                String str5 = webPage3.url;
                TL_iv.Page page = webPage3.cached_page;
                if (page != null) {
                    file = page.local;
                    str = str5;
                    str2 = null;
                } else {
                    str = str5;
                    str2 = null;
                    file = null;
                }
            } else {
                if (m4Var.q0[0].getWebView() == null) {
                    return;
                }
                str = m4Var.q0[0].getWebView().getUrl();
                str2 = m4Var.q0[0].getWebView().getOpenURL();
                file = null;
            }
            Activity activity2 = m4Var.H;
            if (activity2 == null || activity2.isFinishing()) {
                return;
            }
            if (file != null) {
                AndroidUtilities.openForView(file, null, "text/markdown", m4Var.H, null, true);
                return;
            }
            if (str == null) {
                return;
            }
            String hostAuthority = AndroidUtilities.getHostAuthority(str2, true);
            String hostAuthority2 = AndroidUtilities.getHostAuthority(str, true);
            org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(m4Var, str, 1);
            org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(m4Var, hostAuthority2, hostAuthority, 1);
            if (m4Var.q0[0].f() && MessagesController.getInstance(m4Var.T).isWebBrowserOpenInApp(hostAuthority2) && !MessagesController.getInstance(m4Var.T).isWebBrowserExceptionsLimitReached(true)) {
                org.telegram.ui.Components.y4.o0(activity, null, str, true, new cg.u0(10, b0Var, a0Var));
                return;
            } else {
                a0Var.run();
                return;
            }
        }
        if (num.intValue() != 4) {
            if (num.intValue() == 5) {
                if (!m4Var.q0[0].f() || m4Var.q0[0].getWebView() == null) {
                    return;
                }
                m4Var.q0[0].getWebView().reload();
                return;
            }
            if (num.intValue() != 10 || (c2Var = m4Var.q0[0].y) == null || c2Var.b() == null) {
                return;
            }
            m4Var.h(c2Var.b(), null, 1);
            return;
        }
        if (m4Var.q0[0].f()) {
            org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
            if (U3 != null) {
                org.telegram.ui.ActionBar.l2 l2Var3 = new org.telegram.ui.ActionBar.l2();
                l2Var3.a = true;
                U3.showAsSheet(new org.telegram.ui.web.v1(new org.telegram.ui.s(m4Var, 3)), l2Var3);
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(m4Var.H, null, false, false);
        e3Var.fixNavigationBar();
        e3Var.applyTopPadding = false;
        LinearLayout linearLayout = new LinearLayout(m4Var.H);
        linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        linearLayout.setOrientation(1);
        org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(m4Var.H, (org.telegram.ui.ActionBar.c6) null);
        j4Var.setText(LocaleController.getString(R.string.FontSize));
        linearLayout.addView(j4Var, h7.z5.t(-2, -2, 51, 3, 1, 3, 0));
        linearLayout.addView(new org.telegram.ui.i4(m4Var, m4Var.H), h7.z5.t(-1, -2, 51, 3, 0, 3, 0));
        org.telegram.ui.Cells.j4 j4Var2 = new org.telegram.ui.Cells.j4(m4Var.H, (org.telegram.ui.ActionBar.c6) null);
        j4Var2.setText(LocaleController.getString(R.string.FontType));
        linearLayout.addView(j4Var2, h7.z5.t(-2, -2, 51, 3, 4, 3, 2));
        int i10 = 0;
        for (int i11 = 2; i10 < i11; i11 = 2) {
            Activity activity3 = m4Var.H;
            org.telegram.ui.n0 n0Var = new org.telegram.ui.n0(activity3);
            n0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false), i11, -1));
            RadioButton radioButton = new RadioButton(activity3);
            n0Var.b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E5, false));
            boolean z10 = LocaleController.isRTL;
            n0Var.addView(radioButton, h7.z5.d(22, 22.0f, (z10 ? 5 : 3) | 48, z10 ? 0 : 22, 13.0f, z10 ? 22 : 0, 0.0f));
            TextView textView = new TextView(activity3);
            rl.p(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z11 = LocaleController.isRTL;
            n0Var.addView(textView, h7.z5.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 17 : 62, 0.0f, z11 ? 62 : 17, 0.0f));
            n0VarArr[i10] = n0Var;
            if (i10 == 0) {
                String string = LocaleController.getString(R.string.Default);
                Typeface typeface = Typeface.DEFAULT;
                textView.setText(string);
                textView.setTypeface(typeface);
                n0Var.setContentDescription(string);
                n0Var.invalidate();
            } else if (i10 == 1) {
                Typeface typeface2 = Typeface.SERIF;
                textView.setText("Serif");
                textView.setTypeface(typeface2);
                n0Var.setContentDescription("Serif");
                n0Var.invalidate();
            }
            ((RadioButton) n0VarArr[i10].b).a(i10 == m4Var.a, false);
            n0VarArr[i10].setTag(Integer.valueOf(i10));
            n0VarArr[i10].setOnClickListener(new org.telegram.ui.t(m4Var, 4));
            linearLayout.addView(n0VarArr[i10], h7.z5.n(-1, 50));
            i10++;
        }
        e3Var.customView = linearLayout;
        m4Var.E = e3Var;
        m4Var.a0(e3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x05e5  */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        boolean z10;
        AnimatorSet animatorSet;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        BitmapFactory.Options options;
        int i13;
        rn rnVar;
        ck ckVar;
        int i14 = this.a;
        int i15 = 2;
        String str = null;
        int i16 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i14) {
            case 0:
                k2 k2Var = (k2) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                Boolean bool = (Boolean) obj;
                k2Var.getClass();
                if (callback != null) {
                    callback.run(bool);
                }
                if (bool.booleanValue()) {
                    k2Var.skipDismissAnimation();
                }
                k2Var.dismiss();
                break;
            case 1:
                k1 k1Var = (k1) obj2;
                if (((Object[]) obj)[1] == ((m7) obj3)) {
                    k1Var.run();
                    break;
                }
                break;
            case 2:
                wq0 wq0Var = (wq0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str2 = (String) obj;
                k7 k7Var = wq0Var.e;
                int i17 = tL_starGiftCollection.collection_id;
                k7Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i18 = k7Var.a;
                updatestargiftcollection.peer = MessagesController.getInstance(i18).getInputPeer(k7Var.b);
                updatestargiftcollection.collection_id = i17;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str2;
                ConnectionsManager.getInstance(i18).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str2;
                wq0Var.f(true);
                break;
            case 3:
                m6 m6Var = (m6) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                long j10 = m6Var.V;
                Runnable runnable = m6Var.c0;
                if (runnable != null) {
                    runnable.run();
                }
                m6Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new d6(i16, user), 250L);
                MessagesController.getInstance(m6Var.U).getMainSettings().edit().putBoolean("show_gift_for_" + j10, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                break;
            case 4:
                hh.i5 i5Var = (hh.i5) obj3;
                String str3 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                hh.e5 e5Var = i5Var.a0;
                nh.j[] jVarArr = i5Var.o0;
                lh.d dVar = i5Var.f0;
                if (stargiftupgradepreview != null) {
                    e5Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    i5Var.q2(1, false, null);
                    e5Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str3), null);
                    jVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    jVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    jVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    i5Var.q0.setVisibility(8);
                    i5Var.p0.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), false, true);
                    dVar.f(null, false);
                    dVar.setOnClickListener(new hh.n1(i5Var, 4));
                    i5Var.show();
                    break;
                }
                break;
            case 5:
                hh.i5.m0((hh.i5) obj3, (org.telegram.ui.ActionBar.b2) obj2, (TL_stars.SavedStarGift) obj);
                break;
            case 6:
                hh.g4 g4Var = (hh.g4) obj3;
                g4Var.getClass();
                ((hh.e4) obj2).a((TL_stars.StarGift) obj, true);
                g4Var.d(true);
                break;
            case 7:
                hh.m4 m4Var = (hh.m4) obj3;
                hf.b bVar = (hf.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                we.d dVar2 = m4Var.n;
                if (dVar2 != null && bVar == m4Var.q) {
                    dVar2.c(false);
                }
                m4Var.p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    m4Var.o.put(bVar, new hh.k4(bVar, tL_payments_paymentFormStarGift));
                    m4Var.a(true);
                    break;
                }
                break;
            case 8:
                ((Utilities.Callback2) obj3).run((hf.a) obj, new f2.r((hh.x0[]) obj2, 29));
                break;
            case 9:
                lh.j2 j2Var = (lh.j2) obj3;
                pc pcVar = (pc) obj;
                j2Var.getClass();
                lh.g2 g2Var = ((lh.g2[]) obj2)[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(pcVar == null ? "🌤" : pcVar.c);
                sb2.append(" ");
                sb2.append(pcVar == null ? qc.b() ? "24°C" : "72°F" : pcVar.a());
                CharSequence replaceEmoji = Emoji.replaceEmoji(sb2.toString(), j2Var.b.getFontMetricsInt(), false);
                lh.j2 j2Var2 = g2Var.o;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(replaceEmoji, j2Var2.b, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), j2Var2.b, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                g2Var.k = staticLayout;
                g2Var.l = staticLayout.getLineCount() > 0 ? g2Var.k.getLineWidth(0) : 0.0f;
                g2Var.m = g2Var.k.getLineCount() > 0 ? g2Var.k.getLineLeft(0) : 0.0f;
                g2Var.b = AndroidUtilities.dpf2(17.6f) + g2Var.l;
                g2Var.c = AndroidUtilities.dpf2(36.0f);
                j2Var.invalidate();
                j2Var.requestLayout();
                break;
            case 10:
                va vaVar = (va) obj3;
                rb rbVar = (rb) obj2;
                int max = Math.max(0, Math.max(((Integer) obj).intValue() - rbVar.getBottomPadding2(), vaVar.p2 - rbVar.getPaddingUnderContainer()));
                vaVar.S();
                if (max > 0) {
                    zf.j jVar = vaVar.F0;
                    if ((jVar instanceof zf.v2) && ((zf.v2) jVar).getEditText().isFocused()) {
                        z10 = true;
                        animatorSet = vaVar.J1;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        vaVar.J1 = new AnimatorSet();
                        arrayList = new ArrayList();
                        zf.w1 w1Var = vaVar.Z0;
                        Property property = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(w1Var, (Property<zf.w1, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(vaVar.P0, (Property<lh.b6, Float>) property, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                        lh.m5 m5Var = vaVar.S0;
                        Property property2 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(m5Var, (Property<lh.m5, Float>) property2, !z10 ? 0.0f : 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(vaVar.x0, (Property<zf.j1, Float>) property2, (z10 || vaVar.x1) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(vaVar.w0, (Property<zf.f1, Float>) property2, (z10 || vaVar.x1) ? 1.0f : 0.0f));
                        vaVar.T0();
                        vaVar.J1.playTogether(arrayList);
                        if (z10) {
                            vaVar.J1.setDuration(350L);
                            vaVar.J1.setInterpolator(er.h);
                        } else {
                            vaVar.J1.setDuration(250L);
                            vaVar.J1.setInterpolator(org.telegram.ui.ActionBar.p1.w);
                        }
                        vaVar.J1.start();
                        for (i10 = 0; i10 < arrayList.size(); i10++) {
                            ((Animator) arrayList.get(i10)).setDuration(z10 ? 350L : 250L);
                            ((Animator) arrayList.get(i10)).setInterpolator(z10 ? er.h : org.telegram.ui.ActionBar.p1.w);
                            ((Animator) arrayList.get(i10)).start();
                        }
                        if (!z10) {
                            vaVar.P0(false);
                        }
                        if (vaVar.d2 != z10) {
                            vaVar.g0();
                        }
                        vaVar.d2 = z10;
                        break;
                    }
                }
                z10 = false;
                animatorSet = vaVar.J1;
                if (animatorSet != null) {
                }
                vaVar.J1 = new AnimatorSet();
                arrayList = new ArrayList();
                zf.w1 w1Var2 = vaVar.Z0;
                Property property3 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(w1Var2, (Property<zf.w1, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(vaVar.P0, (Property<lh.b6, Float>) property3, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                lh.m5 m5Var2 = vaVar.S0;
                Property property22 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(m5Var2, (Property<lh.m5, Float>) property22, !z10 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(vaVar.x0, (Property<zf.j1, Float>) property22, (z10 || vaVar.x1) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(vaVar.w0, (Property<zf.f1, Float>) property22, (z10 || vaVar.x1) ? 1.0f : 0.0f));
                vaVar.T0();
                vaVar.J1.playTogether(arrayList);
                if (z10) {
                }
                vaVar.J1.start();
                while (i10 < arrayList.size()) {
                }
                if (!z10) {
                }
                if (vaVar.d2 != z10) {
                }
                vaVar.d2 = z10;
                break;
            case 11:
                lh.f6 f6Var = (lh.f6) obj3;
                lh.o5 o5Var = (lh.o5) obj2;
                pc pcVar2 = (pc) obj;
                if (pcVar2 != null) {
                    o5Var.dismiss();
                    f6Var.z0(false);
                    f6Var.d0(f6Var.p0(pcVar2));
                    break;
                }
                break;
            case 12:
                lh.f6 f6Var2 = (lh.f6) obj3;
                zf.p0 p0Var = (zf.p0) obj2;
                zf.m0 m0Var = (zf.m0) obj;
                if (p0Var != null) {
                    int i19 = f6Var2.B1;
                    p0Var.q0 = m0Var;
                    p0Var.m0.b(i19, m0Var, false);
                    p0Var.m();
                    f6Var2.d0(p0Var);
                    break;
                } else {
                    f6Var2.d0(f6Var2.i0(m0Var));
                    break;
                }
            case 13:
                k9 k9Var = (k9) obj3;
                ((b70) obj2).u();
                k9Var.g(true);
                q9 q9Var = k9Var.S;
                t9 t9Var = q9Var.T;
                if (t9Var != null) {
                    t9Var.run(new HashSet(q9Var.v));
                    break;
                }
                break;
            case 14:
                k9 k9Var2 = (k9) obj3;
                k9Var2.S.C = true;
                ((ar[]) obj2)[0].dismiss();
                k9Var2.g(true);
                break;
            case 15:
                oa oaVar = (oa) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj2;
                Integer num = (Integer) obj;
                sb sbVar = oaVar.a;
                boolean q02 = sbVar.q0();
                int i20 = sbVar.c;
                if (q02) {
                    try {
                        sbVar.n.performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                }
                sbVar.L1 = false;
                u6 u6Var = sbVar.y0;
                if (u6Var != null) {
                    u6Var.c(false);
                }
                if (sbVar.C1 != null) {
                    try {
                        options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(sbVar.C1.getAbsolutePath(), options);
                        i11 = options.outWidth;
                    } catch (Exception unused2) {
                        i11 = -1;
                    }
                    try {
                        i12 = options.outHeight;
                    } catch (Exception unused3) {
                        i12 = -1;
                        if (num.intValue() != -1) {
                        }
                        if (num.intValue() != -1) {
                        }
                        z7 m10 = z7.m(r12, sbVar.C1);
                        m10.J0 = sbVar.r0;
                        m10.K0 = sbVar.s0;
                        if (sbVar.w0.j()) {
                        }
                    }
                    int i21 = num.intValue() != -1 ? 0 : 90;
                    if (num.intValue() != -1) {
                        if (i11 > i12) {
                            i21 = 270;
                        }
                    } else if (i12 > i11 && i21 != 0) {
                        i21 = 0;
                    }
                    z7 m102 = z7.m(i21, sbVar.C1);
                    m102.J0 = sbVar.r0;
                    m102.K0 = sbVar.s0;
                    if (sbVar.w0.j()) {
                        sbVar.G1 = m102;
                        r9.a(i20, m102);
                        sbVar.H1 = false;
                        if (callback2 != null) {
                            callback2.run(new ma(oaVar, i15));
                            break;
                        } else {
                            sbVar.K(1, true);
                            break;
                        }
                    } else {
                        sbVar.C1 = null;
                        if (sbVar.w0.l(m102)) {
                            z7 a2 = z7.a(sbVar.w0.getLayout(), sbVar.w0.getContent());
                            sbVar.G1 = a2;
                            r9.a(i20, a2);
                            sbVar.H1 = false;
                            if (callback2 != null) {
                                callback2.run(null);
                            }
                        } else if (callback2 != null) {
                            callback2.run(null);
                        }
                        sbVar.m0(true);
                        break;
                    }
                }
                break;
            case 16:
                xb xbVar = (xb) obj2;
                Float f10 = (Float) obj;
                xbVar.i = f10.floatValue();
                wb wbVar = ((cc) obj3).a;
                if (wbVar != null) {
                    wbVar.P0(f10.floatValue(), xbVar.a);
                    break;
                }
                break;
            case 17:
                nh.t0 t0Var = (nh.t0) obj3;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) obj2;
                int[] iArr = (int[]) obj;
                t0Var.getClass();
                boolean z11 = false;
                while (i16 < iArr.length) {
                    if (iArr[i16] == 0) {
                        z11 = true;
                    }
                    i16++;
                }
                t0Var.d = true;
                t0Var.e = true;
                t0Var.l();
                Iterator it = t0Var.f.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                sVar.run(Boolean.TRUE, Boolean.valueOf(z11));
                break;
            case 18:
                nh.t0 t0Var2 = (nh.t0) obj3;
                Runnable runnable2 = (Runnable) obj2;
                int[] iArr2 = (int[]) obj;
                t0Var2.getClass();
                boolean z12 = false;
                while (i16 < iArr2.length) {
                    if (iArr2[i16] == 0) {
                        z12 = true;
                    }
                    i16++;
                }
                t0Var2.d = z12;
                t0Var2.e = z12;
                t0Var2.l();
                Iterator it2 = t0Var2.f.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
            case 19:
                ((File[]) obj3)[0] = (File) obj;
                ((nh.c1) obj2).run();
                break;
            case 20:
                ((nh.w2) obj3).d.x.C((String) obj2, (String) obj, false);
                break;
            case 21:
                oh.f fVar = (oh.f) obj3;
                fVar.getClass();
                fVar.W(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                break;
            case 22:
                oh.f fVar2 = (oh.f) obj3;
                fVar2.getClass();
                fVar2.V((String) obj2, ((Boolean) obj).booleanValue());
                break;
            case 23:
                oh.j0 j0Var = (oh.j0) obj3;
                j0Var.V((TLRPC.Chat) obj2, j0Var.e, ((Boolean) obj).booleanValue());
                break;
            case 24:
                ((VoIPDebugToSend) obj3).lambda$done$0((TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                break;
            case 25:
                org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) obj3;
                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (n2Var != null) {
                    if ((n2Var instanceof rn) && (ckVar = (rnVar = (rn) n2Var).U) != null) {
                        ckVar.P();
                        rnVar.U.n0(true, false, true);
                    }
                    if (n2Var.getContext() != null && n2Var.getParentActivity() != null) {
                        nh.b3 b3Var = new nh.b3(n2Var.getContext(), n2Var.getResourceProvider());
                        b3Var.g0 = n2Var.getParentActivity();
                        if (l3Var != null && l3Var.a != null) {
                            b3Var.A0 = true;
                            boolean z13 = l3Var.m;
                            b3Var.R = z13;
                            if (z13) {
                                b3Var.v(l3Var.p, false);
                            }
                            if (l3Var.l) {
                                i13 = l3Var.o;
                            } else {
                                int i22 = l3Var.n;
                                if (i22 < 0) {
                                    i22 = org.telegram.ui.ActionBar.g6.d6;
                                }
                                i13 = org.telegram.ui.ActionBar.g6.v0(i22, b3Var.A);
                            }
                            b3Var.t(i13, l3Var.l, false);
                            b3Var.y(l3Var.q, false);
                            b3Var.B0 = l3Var.h;
                            b3Var.C0 = l3Var.i;
                            boolean z14 = l3Var.s;
                            b3Var.s0 = z14;
                            nh.t2 t2Var = b3Var.x;
                            t2Var.setIsBackButtonVisible(z14);
                            b3Var.v.setAllowSwipes(l3Var.j);
                            AndroidUtilities.updateImageViewImageAnimated(b3Var.S.getBackButton(), b3Var.s0 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
                            BotFullscreenButtons botFullscreenButtons = b3Var.i0;
                            if (botFullscreenButtons != null) {
                                botFullscreenButtons.setBack(b3Var.s0, false);
                            }
                            b3Var.n0 = l3Var.w;
                            b3Var.v0 = Boolean.valueOf(l3Var.z);
                            b3Var.w0 = l3Var.A;
                            nh.x0 x0Var = l3Var.I;
                            b3Var.x0 = x0Var;
                            if (x0Var != null) {
                                nh.v0 v0Var = x0Var.r;
                                SensorManager sensorManager = x0Var.a;
                                if (x0Var.l) {
                                    x0Var.l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = x0Var.b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(x0Var.n, sensor, nh.x0.a(x0Var.c));
                                        }
                                        Sensor sensor2 = x0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(x0Var.p, sensor2, nh.x0.a(x0Var.e));
                                        }
                                        Sensor sensor3 = x0Var.g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(v0Var, sensor3, nh.x0.a(x0Var.h));
                                        }
                                        Sensor sensor4 = x0Var.f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(v0Var, sensor4, nh.x0.a(x0Var.h));
                                        }
                                        Sensor sensor5 = x0Var.i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(x0Var.t, sensor5, nh.x0.a(x0Var.j));
                                        }
                                    }
                                }
                            }
                            b6.a aVar = l3Var.u;
                            if (aVar != null) {
                                nh.x2 x2Var = b3Var.h0;
                                int totalHeight = x2Var.getTotalHeight();
                                x2Var.e = aVar;
                                nh.t[] tVarArr = x2Var.f;
                                nh.v.b(tVarArr[0].l, (nh.u) aVar.b, false);
                                nh.v.b(tVarArr[1].l, (nh.u) aVar.d, false);
                                x2Var.invalidate();
                                if (totalHeight != x2Var.getTotalHeight() && x2Var.r != null) {
                                    if (totalHeight < x2Var.getTotalHeight()) {
                                        AndroidUtilities.runOnUIThread(x2Var.r, 200L);
                                    } else {
                                        x2Var.r.run();
                                    }
                                }
                                int i23 = aVar.c;
                                Paint paint = x2Var.a;
                                x2Var.e.c = i23;
                                paint.setColor(i23);
                                x2Var.d.a(i23, true);
                            }
                            b3Var.x(l3Var.x, false, l3Var.y);
                            nh.q4 q4Var = l3Var.a;
                            b3Var.C = q4Var != null ? q4Var.a : UserConfig.selectedAccount;
                            org.telegram.ui.web.w0 w0Var = l3Var.b;
                            if (w0Var != null) {
                                w0Var.onResume();
                                int i24 = b3Var.C;
                                org.telegram.ui.web.w0 w0Var2 = l3Var.b;
                                Object obj4 = l3Var.d;
                                t2Var.I = i24;
                                t2Var.Q(w0Var2, obj4);
                                if (t2Var.k0) {
                                    t2Var.v("visibility_changed", org.telegram.ui.web.z0.x(Boolean.TRUE, "is_visible"));
                                }
                                boolean z15 = l3Var.r || l3Var.b.b;
                                String str4 = l3Var.v;
                                t2Var.g("setState(" + z15 + ", " + str4 + ")");
                                t2Var.J = z15;
                                t2Var.b = str4;
                                if (org.telegram.ui.ActionBar.g6.I.q() != l3Var.B) {
                                    t2Var.w();
                                }
                            } else {
                                q4Var.q = null;
                                q4Var.r = 0L;
                            }
                            b3Var.s(n2Var, l3Var.a);
                            b3Var.X = l3Var.t;
                            if (l3Var.E) {
                                b3Var.O0 = true;
                                b3Var.i();
                                org.telegram.ui.h3 h3Var = b3Var.Q0;
                                String userName = UserObject.getUserName(MessagesController.getInstance(b3Var.C).getUser(Long.valueOf(b3Var.D)));
                                String str5 = l3Var.F;
                                b3Var.P0 = str5;
                                h3Var.a(userName, str5);
                                org.telegram.ui.h3 h3Var2 = b3Var.Q0;
                                Paint paint2 = b3Var.L;
                                h3Var2.b(AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f, false);
                                b3Var.Q0.setBackgroundColor(paint2.getColor());
                                b3Var.Q0.setVisibility(0);
                                b3Var.Q0.setAlpha(1.0f);
                            }
                            b3Var.o(l3Var.J);
                            m3Var.h(m3Var.w, l3Var, false);
                            b3Var.show();
                            break;
                        }
                    }
                }
                break;
            case 26:
                org.telegram.ui.ActionBar.s3 s3Var = (org.telegram.ui.ActionBar.s3) obj2;
                ((org.telegram.ui.ActionBar.l3) obj3).k = (Bitmap) obj;
                s3Var.getWindowView().setDrawingFromOverlay(false);
                s3Var.release();
                break;
            case 27:
                org.telegram.ui.ActionBar.u3 u3Var = (org.telegram.ui.ActionBar.u3) obj2;
                org.telegram.ui.ActionBar.v3 v3Var = ((org.telegram.ui.ActionBar.r3) obj3).p;
                if (((Boolean) obj).booleanValue()) {
                    u3Var.a(1.0f);
                    if (v3Var.a.getTabs().isEmpty()) {
                        v3Var.a(false);
                        break;
                    }
                } else {
                    u3Var.a(0.0f);
                    break;
                }
                break;
            case 28:
                a(obj);
                break;
            default:
                org.telegram.ui.q3 q3Var = (org.telegram.ui.q3) obj3;
                Activity activity = (Activity) obj2;
                String str6 = (String) obj;
                if (!TextUtils.isEmpty(str6) && q3Var.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str6.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i25 = 0;
                    while (i16 < uRLSpanArr.length) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i16]), length);
                        i25 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i16]), i25);
                        i16++;
                    }
                    Uri uriParseSafe = Utilities.uriParseSafe(str6);
                    if (uriParseSafe == null || !TextUtils.equals(uriParseSafe.getScheme(), "javascript")) {
                        if ((uRLSpanArr.length <= 0 || length != 0 || i25 <= 0) && (uriParseSafe == null || uriParseSafe.getScheme() == null)) {
                            org.telegram.ui.web.l.b(activity, str6);
                            org.telegram.ui.web.w0 webView = q3Var.getWebView();
                            String str7 = org.telegram.ui.web.k1.a().b;
                            if (str7 != null) {
                                StringBuilder o10 = com.google.android.recaptcha.internal.a.o(str7);
                                o10.append(URLEncoder.encode(str6));
                                str = o10.toString();
                            }
                            webView.loadUrl(str);
                            break;
                        } else {
                            if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                                str6 = we.e.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                            }
                            q3Var.getWebView().loadUrl(str6);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
