package fh;

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
import gh.l7;
import gh.n7;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import kh.a8;
import kh.ac;
import kh.bc;
import kh.gc;
import kh.n9;
import kh.pa;
import kh.ra;
import kh.t9;
import kh.tc;
import kh.u9;
import kh.uc;
import kh.vb;
import kh.w9;
import kh.wb;
import kh.ya;
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
import org.telegram.messenger.ll;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ak;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f1(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(Object obj) {
        org.telegram.ui.web.b2 b2Var;
        String str;
        String str2;
        File file;
        String str3;
        FrameLayout frameLayout;
        String str4;
        org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.b;
        Activity activity = (Activity) this.c;
        Integer num = (Integer) obj;
        org.telegram.ui.y3 y3Var = l4Var.G;
        org.telegram.ui.m0[] m0VarArr = l4Var.O0;
        if ((l4Var.q0[0].c() && l4Var.q0[0].c.A == null) || l4Var.H == null) {
            return;
        }
        if (num.intValue() == 1) {
            org.telegram.ui.n0 n0Var = l4Var.d0;
            int dp = AndroidUtilities.dp(56.0f);
            l4Var.E0 = dp;
            n0Var.setHeight(dp);
            l4Var.d0.h(true);
            return;
        }
        if (num.intValue() == 2) {
            if (!l4Var.q0[0].f()) {
                TLRPC.WebPage webPage = l4Var.q0[0].c.A;
                if (webPage == null) {
                    return;
                } else {
                    str4 = webPage.url;
                }
            } else if (l4Var.q0[0].getWebView() == null) {
                return;
            } else {
                str4 = l4Var.q0[0].getWebView().getUrl();
            }
            String s10 = org.telegram.ui.web.y0.s(str4);
            l4Var.a0(new rp0(l4Var.H, null, s10, false, s10, false, AndroidUtilities.computePerceivedBrightness(l4Var.d0.getBackgroundColor()) < 0.721f ? new ih.b() : null));
            return;
        }
        if (num.intValue() == 6) {
            if (!l4Var.q0[0].f()) {
                org.telegram.ui.p3 p3Var = l4Var.q0[0];
                TLRPC.WebPage webPage2 = p3Var.c.A;
                if (webPage2 == null) {
                    return;
                }
                str3 = webPage2.url;
                frameLayout = p3Var;
            } else {
                if (l4Var.q0[0].getWebView() == null) {
                    return;
                }
                str3 = l4Var.q0[0].getWebView().getUrl();
                frameLayout = l4Var.q0[0].f;
            }
            org.telegram.ui.l4.f(str3, l4Var.T, frameLayout, y3Var, null);
            return;
        }
        if (num.intValue() == 7) {
            org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
            m2Var.a = true;
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                U.showAsSheet(new org.telegram.ui.web.o(y3Var != null ? new org.telegram.ui.c0(l4Var, 5) : null, new org.telegram.ui.r(l4Var, 2)), m2Var);
                return;
            }
            return;
        }
        if (num.intValue() == 8) {
            org.telegram.ui.ActionBar.m2 m2Var2 = new org.telegram.ui.ActionBar.m2();
            m2Var2.a = true;
            org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
            if (U2 != null) {
                U2.showAsSheet(new org.telegram.ui.web.c1(y3Var != null ? new org.telegram.ui.c0(l4Var, 6) : null, new org.telegram.ui.r(l4Var, 3)), m2Var2);
                return;
            }
            return;
        }
        if (num.intValue() == 9) {
            if (l4Var.q0[0].getWebView() != null) {
                l4Var.q0[0].getWebView().goForward();
                return;
            }
            return;
        }
        if (num.intValue() == 3) {
            if (!l4Var.q0[0].f()) {
                TLRPC.WebPage webPage3 = l4Var.q0[0].c.A;
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
                if (l4Var.q0[0].getWebView() == null) {
                    return;
                }
                str = l4Var.q0[0].getWebView().getUrl();
                str2 = l4Var.q0[0].getWebView().getOpenURL();
                file = null;
            }
            Activity activity2 = l4Var.H;
            if (activity2 == null || activity2.isFinishing()) {
                return;
            }
            if (file != null) {
                AndroidUtilities.openForView(file, null, "text/markdown", l4Var.H, null, true);
                return;
            }
            if (str == null) {
                return;
            }
            String hostAuthority = AndroidUtilities.getHostAuthority(str2, true);
            String hostAuthority2 = AndroidUtilities.getHostAuthority(str, true);
            org.telegram.ui.z zVar = new org.telegram.ui.z(l4Var, str, 1);
            org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(l4Var, hostAuthority2, hostAuthority, 1);
            if (l4Var.q0[0].f() && MessagesController.getInstance(l4Var.T).isWebBrowserOpenInApp(hostAuthority2) && !MessagesController.getInstance(l4Var.T).isWebBrowserExceptionsLimitReached(true)) {
                org.telegram.ui.Components.y4.o0(activity, null, str, true, new bg.y0(10, a0Var, zVar));
                return;
            } else {
                zVar.run();
                return;
            }
        }
        if (num.intValue() != 4) {
            if (num.intValue() == 5) {
                if (!l4Var.q0[0].f() || l4Var.q0[0].getWebView() == null) {
                    return;
                }
                l4Var.q0[0].getWebView().reload();
                return;
            }
            if (num.intValue() != 10 || (b2Var = l4Var.q0[0].y) == null || b2Var.b() == null) {
                return;
            }
            l4Var.h(b2Var.b(), null, 1);
            return;
        }
        if (l4Var.q0[0].f()) {
            org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
            if (U3 != null) {
                org.telegram.ui.ActionBar.m2 m2Var3 = new org.telegram.ui.ActionBar.m2();
                m2Var3.a = true;
                U3.showAsSheet(new org.telegram.ui.web.u1(new org.telegram.ui.r(l4Var, 3)), m2Var3);
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(l4Var.H, null, false, false);
        f3Var.fixNavigationBar();
        f3Var.applyTopPadding = false;
        LinearLayout linearLayout = new LinearLayout(l4Var.H);
        linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        linearLayout.setOrientation(1);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(l4Var.H, (org.telegram.ui.ActionBar.b6) null);
        m4Var.setText(LocaleController.getString(R.string.FontSize));
        linearLayout.addView(m4Var, g7.e6.t(-2, -2, 51, 3, 1, 3, 0));
        linearLayout.addView(new org.telegram.ui.h4(l4Var, l4Var.H), g7.e6.t(-1, -2, 51, 3, 0, 3, 0));
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(l4Var.H, (org.telegram.ui.ActionBar.b6) null);
        m4Var2.setText(LocaleController.getString(R.string.FontType));
        linearLayout.addView(m4Var2, g7.e6.t(-2, -2, 51, 3, 4, 3, 2));
        int i9 = 0;
        for (int i10 = 2; i9 < i10; i10 = 2) {
            Activity activity3 = l4Var.H;
            org.telegram.ui.m0 m0Var = new org.telegram.ui.m0(activity3);
            m0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), i10, -1));
            RadioButton radioButton = new RadioButton(activity3);
            m0Var.b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.D5, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E5, false));
            boolean z10 = LocaleController.isRTL;
            m0Var.addView(radioButton, g7.e6.d(22, 22.0f, (z10 ? 5 : 3) | 48, z10 ? 0 : 22, 13.0f, z10 ? 22 : 0, 0.0f));
            TextView textView = new TextView(activity3);
            ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z11 = LocaleController.isRTL;
            m0Var.addView(textView, g7.e6.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 17 : 62, 0.0f, z11 ? 62 : 17, 0.0f));
            m0VarArr[i9] = m0Var;
            if (i9 == 0) {
                String string = LocaleController.getString(R.string.Default);
                Typeface typeface = Typeface.DEFAULT;
                textView.setText(string);
                textView.setTypeface(typeface);
                m0Var.setContentDescription(string);
                m0Var.invalidate();
            } else if (i9 == 1) {
                Typeface typeface2 = Typeface.SERIF;
                textView.setText("Serif");
                textView.setTypeface(typeface2);
                m0Var.setContentDescription("Serif");
                m0Var.invalidate();
            }
            ((RadioButton) m0VarArr[i9].b).a(i9 == l4Var.a, false);
            m0VarArr[i9].setTag(Integer.valueOf(i9));
            m0VarArr[i9].setOnClickListener(new org.telegram.ui.s(l4Var, 4));
            linearLayout.addView(m0VarArr[i9], g7.e6.n(-1, 50));
            i9++;
        }
        f3Var.customView = linearLayout;
        l4Var.E = f3Var;
        l4Var.a0(f3Var);
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
        int i9;
        int i10;
        int i11;
        BitmapFactory.Options options;
        int i12;
        qn qnVar;
        ak akVar;
        int i13 = this.a;
        int i14 = 2;
        String str = null;
        int i15 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i13) {
            case 0:
                p2 p2Var = (p2) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                Boolean bool = (Boolean) obj;
                p2Var.getClass();
                if (callback != null) {
                    callback.run(bool);
                }
                if (bool.booleanValue()) {
                    p2Var.skipDismissAnimation();
                }
                p2Var.dismiss();
                break;
            case 1:
                m1 m1Var = (m1) obj2;
                if (((Object[]) obj)[1] == ((n7) obj3)) {
                    m1Var.run();
                    break;
                }
                break;
            case 2:
                vq0 vq0Var = (vq0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str2 = (String) obj;
                l7 l7Var = vq0Var.e;
                int i16 = tL_starGiftCollection.collection_id;
                l7Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i17 = l7Var.a;
                updatestargiftcollection.peer = MessagesController.getInstance(i17).getInputPeer(l7Var.b);
                updatestargiftcollection.collection_id = i16;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str2;
                ConnectionsManager.getInstance(i17).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str2;
                vq0Var.f(true);
                break;
            case 3:
                u6 u6Var = (u6) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                long j10 = u6Var.V;
                Runnable runnable = u6Var.c0;
                if (runnable != null) {
                    runnable.run();
                }
                u6Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new l6(i15, user), 250L);
                MessagesController.getInstance(u6Var.U).getMainSettings().edit().putBoolean("show_gift_for_" + j10, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                break;
            case 4:
                gh.k5 k5Var = (gh.k5) obj3;
                String str3 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                gh.g5 g5Var = k5Var.a0;
                mh.k[] kVarArr = k5Var.o0;
                kh.d dVar = k5Var.f0;
                if (stargiftupgradepreview != null) {
                    g5Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    k5Var.q2(1, false, null);
                    g5Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str3), null);
                    kVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    kVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    kVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    k5Var.q0.setVisibility(8);
                    k5Var.p0.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), false, true);
                    dVar.f(null, false);
                    dVar.setOnClickListener(new gh.n1(k5Var, 4));
                    k5Var.show();
                    break;
                }
                break;
            case 5:
                gh.k5.l0((gh.k5) obj3, (org.telegram.ui.ActionBar.c2) obj2, (TL_stars.SavedStarGift) obj);
                break;
            case 6:
                gh.i4 i4Var = (gh.i4) obj3;
                i4Var.getClass();
                ((gh.g4) obj2).a((TL_stars.StarGift) obj, true);
                i4Var.d(true);
                break;
            case 7:
                gh.o4 o4Var = (gh.o4) obj3;
                gf.b bVar = (gf.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                ve.d dVar2 = o4Var.n;
                if (dVar2 != null && bVar == o4Var.q) {
                    dVar2.c(false);
                }
                o4Var.p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    o4Var.o.put(bVar, new gh.m4(bVar, tL_payments_paymentFormStarGift));
                    o4Var.a(true);
                    break;
                }
                break;
            case 8:
                ((Utilities.Callback2) obj3).run((gf.a) obj, new o1((gh.x0[]) obj2, 18));
                break;
            case 9:
                kh.l2 l2Var = (kh.l2) obj3;
                tc tcVar = (tc) obj;
                l2Var.getClass();
                kh.i2 i2Var = ((kh.i2[]) obj2)[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tcVar == null ? "🌤" : tcVar.c);
                sb2.append(" ");
                sb2.append(tcVar == null ? uc.b() ? "24°C" : "72°F" : tcVar.a());
                CharSequence replaceEmoji = Emoji.replaceEmoji(sb2.toString(), l2Var.b.getFontMetricsInt(), false);
                kh.l2 l2Var2 = i2Var.o;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(replaceEmoji, l2Var2.b, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), l2Var2.b, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                i2Var.k = staticLayout;
                i2Var.l = staticLayout.getLineCount() > 0 ? i2Var.k.getLineWidth(0) : 0.0f;
                i2Var.m = i2Var.k.getLineCount() > 0 ? i2Var.k.getLineLeft(0) : 0.0f;
                i2Var.b = AndroidUtilities.dpf2(17.6f) + i2Var.l;
                i2Var.c = AndroidUtilities.dpf2(36.0f);
                l2Var.invalidate();
                l2Var.requestLayout();
                break;
            case 10:
                ya yaVar = (ya) obj3;
                vb vbVar = (vb) obj2;
                int max = Math.max(0, Math.max(((Integer) obj).intValue() - vbVar.getBottomPadding2(), yaVar.p2 - vbVar.getPaddingUnderContainer()));
                yaVar.S();
                if (max > 0) {
                    yf.j jVar = yaVar.F0;
                    if ((jVar instanceof yf.v2) && ((yf.v2) jVar).getEditText().isFocused()) {
                        z10 = true;
                        animatorSet = yaVar.J1;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        yaVar.J1 = new AnimatorSet();
                        arrayList = new ArrayList();
                        yf.w1 w1Var = yaVar.Z0;
                        Property property = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(w1Var, (Property<yf.w1, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(yaVar.P0, (Property<kh.c6, Float>) property, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                        kh.n5 n5Var = yaVar.S0;
                        Property property2 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(n5Var, (Property<kh.n5, Float>) property2, !z10 ? 0.0f : 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(yaVar.x0, (Property<yf.j1, Float>) property2, (z10 || yaVar.x1) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(yaVar.w0, (Property<yf.f1, Float>) property2, (z10 || yaVar.x1) ? 1.0f : 0.0f));
                        yaVar.T0();
                        yaVar.J1.playTogether(arrayList);
                        if (z10) {
                            yaVar.J1.setDuration(350L);
                            yaVar.J1.setInterpolator(gr.h);
                        } else {
                            yaVar.J1.setDuration(250L);
                            yaVar.J1.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                        }
                        yaVar.J1.start();
                        for (i9 = 0; i9 < arrayList.size(); i9++) {
                            ((Animator) arrayList.get(i9)).setDuration(z10 ? 350L : 250L);
                            ((Animator) arrayList.get(i9)).setInterpolator(z10 ? gr.h : org.telegram.ui.ActionBar.q1.w);
                            ((Animator) arrayList.get(i9)).start();
                        }
                        if (!z10) {
                            yaVar.P0(false);
                        }
                        if (yaVar.d2 != z10) {
                            yaVar.g0();
                        }
                        yaVar.d2 = z10;
                        break;
                    }
                }
                z10 = false;
                animatorSet = yaVar.J1;
                if (animatorSet != null) {
                }
                yaVar.J1 = new AnimatorSet();
                arrayList = new ArrayList();
                yf.w1 w1Var2 = yaVar.Z0;
                Property property3 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(w1Var2, (Property<yf.w1, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(yaVar.P0, (Property<kh.c6, Float>) property3, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                kh.n5 n5Var2 = yaVar.S0;
                Property property22 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(n5Var2, (Property<kh.n5, Float>) property22, !z10 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(yaVar.x0, (Property<yf.j1, Float>) property22, (z10 || yaVar.x1) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(yaVar.w0, (Property<yf.f1, Float>) property22, (z10 || yaVar.x1) ? 1.0f : 0.0f));
                yaVar.T0();
                yaVar.J1.playTogether(arrayList);
                if (z10) {
                }
                yaVar.J1.start();
                while (i9 < arrayList.size()) {
                }
                if (!z10) {
                }
                if (yaVar.d2 != z10) {
                }
                yaVar.d2 = z10;
                break;
            case 11:
                kh.g6 g6Var = (kh.g6) obj3;
                kh.p5 p5Var = (kh.p5) obj2;
                tc tcVar2 = (tc) obj;
                if (tcVar2 != null) {
                    p5Var.dismiss();
                    g6Var.z0(false);
                    g6Var.d0(g6Var.p0(tcVar2));
                    break;
                }
                break;
            case 12:
                kh.g6 g6Var2 = (kh.g6) obj3;
                yf.p0 p0Var = (yf.p0) obj2;
                yf.m0 m0Var = (yf.m0) obj;
                if (p0Var != null) {
                    int i18 = g6Var2.B1;
                    p0Var.q0 = m0Var;
                    p0Var.m0.b(i18, m0Var, false);
                    p0Var.m();
                    g6Var2.d0(p0Var);
                    break;
                } else {
                    g6Var2.d0(g6Var2.i0(m0Var));
                    break;
                }
            case 13:
                n9 n9Var = (n9) obj3;
                ((x60) obj2).u();
                n9Var.g(true);
                t9 t9Var = n9Var.S;
                w9 w9Var = t9Var.T;
                if (w9Var != null) {
                    w9Var.run(new HashSet(t9Var.v));
                    break;
                }
                break;
            case 14:
                n9 n9Var2 = (n9) obj3;
                n9Var2.S.C = true;
                ((cr[]) obj2)[0].dismiss();
                n9Var2.g(true);
                break;
            case 15:
                ra raVar = (ra) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj2;
                Integer num = (Integer) obj;
                wb wbVar = raVar.a;
                boolean q02 = wbVar.q0();
                int i19 = wbVar.c;
                if (q02) {
                    try {
                        wbVar.n.performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                }
                wbVar.L1 = false;
                kh.v6 v6Var = wbVar.y0;
                if (v6Var != null) {
                    v6Var.c(false);
                }
                if (wbVar.C1 != null) {
                    try {
                        options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(wbVar.C1.getAbsolutePath(), options);
                        i10 = options.outWidth;
                    } catch (Exception unused2) {
                        i10 = -1;
                    }
                    try {
                        i11 = options.outHeight;
                    } catch (Exception unused3) {
                        i11 = -1;
                        if (num.intValue() != -1) {
                        }
                        if (num.intValue() != -1) {
                        }
                        a8 m10 = a8.m(r12, wbVar.C1);
                        m10.J0 = wbVar.r0;
                        m10.K0 = wbVar.s0;
                        if (wbVar.w0.j()) {
                        }
                    }
                    int i20 = num.intValue() != -1 ? 0 : 90;
                    if (num.intValue() != -1) {
                        if (i10 > i11) {
                            i20 = 270;
                        }
                    } else if (i11 > i10 && i20 != 0) {
                        i20 = 0;
                    }
                    a8 m102 = a8.m(i20, wbVar.C1);
                    m102.J0 = wbVar.r0;
                    m102.K0 = wbVar.s0;
                    if (wbVar.w0.j()) {
                        wbVar.G1 = m102;
                        u9.a(i19, m102);
                        wbVar.H1 = false;
                        if (callback2 != null) {
                            callback2.run(new pa(raVar, i14));
                            break;
                        } else {
                            wbVar.K(1, true);
                            break;
                        }
                    } else {
                        wbVar.C1 = null;
                        if (wbVar.w0.l(m102)) {
                            a8 a2 = a8.a(wbVar.w0.getLayout(), wbVar.w0.getContent());
                            wbVar.G1 = a2;
                            u9.a(i19, a2);
                            wbVar.H1 = false;
                            if (callback2 != null) {
                                callback2.run(null);
                            }
                        } else if (callback2 != null) {
                            callback2.run(null);
                        }
                        wbVar.m0(true);
                        break;
                    }
                }
                break;
            case 16:
                bc bcVar = (bc) obj2;
                Float f10 = (Float) obj;
                bcVar.i = f10.floatValue();
                ac acVar = ((gc) obj3).a;
                if (acVar != null) {
                    acVar.P0(f10.floatValue(), bcVar.a);
                    break;
                }
                break;
            case 17:
                mh.u0 u0Var = (mh.u0) obj3;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) obj2;
                int[] iArr = (int[]) obj;
                u0Var.getClass();
                boolean z11 = false;
                while (i15 < iArr.length) {
                    if (iArr[i15] == 0) {
                        z11 = true;
                    }
                    i15++;
                }
                u0Var.d = true;
                u0Var.e = true;
                u0Var.l();
                Iterator it = u0Var.f.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                rVar.run(Boolean.TRUE, Boolean.valueOf(z11));
                break;
            case 18:
                mh.u0 u0Var2 = (mh.u0) obj3;
                Runnable runnable2 = (Runnable) obj2;
                int[] iArr2 = (int[]) obj;
                u0Var2.getClass();
                boolean z12 = false;
                while (i15 < iArr2.length) {
                    if (iArr2[i15] == 0) {
                        z12 = true;
                    }
                    i15++;
                }
                u0Var2.d = z12;
                u0Var2.e = z12;
                u0Var2.l();
                Iterator it2 = u0Var2.f.iterator();
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
                ((mh.d1) obj2).run();
                break;
            case 20:
                ((mh.x2) obj3).d.x.C((String) obj2, (String) obj, false);
                break;
            case 21:
                nh.f fVar = (nh.f) obj3;
                fVar.getClass();
                fVar.V(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                break;
            case 22:
                nh.f fVar2 = (nh.f) obj3;
                fVar2.getClass();
                fVar2.U((String) obj2, ((Boolean) obj).booleanValue());
                break;
            case 23:
                nh.j0 j0Var = (nh.j0) obj3;
                j0Var.U((TLRPC.Chat) obj2, j0Var.e, ((Boolean) obj).booleanValue());
                break;
            case 24:
                ((VoIPDebugToSend) obj3).lambda$done$0((TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                break;
            case 25:
                org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) obj3;
                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                if (o2Var != null) {
                    if ((o2Var instanceof qn) && (akVar = (qnVar = (qn) o2Var).U) != null) {
                        akVar.O();
                        qnVar.U.m0(true, false, true);
                    }
                    if (o2Var.getContext() != null && o2Var.getParentActivity() != null) {
                        mh.c3 c3Var = new mh.c3(o2Var.getContext(), o2Var.getResourceProvider());
                        c3Var.g0 = o2Var.getParentActivity();
                        if (l3Var != null && l3Var.a != null) {
                            c3Var.A0 = true;
                            boolean z13 = l3Var.m;
                            c3Var.R = z13;
                            if (z13) {
                                c3Var.v(l3Var.p, false);
                            }
                            if (l3Var.l) {
                                i12 = l3Var.o;
                            } else {
                                int i21 = l3Var.n;
                                if (i21 < 0) {
                                    i21 = org.telegram.ui.ActionBar.f6.d6;
                                }
                                i12 = org.telegram.ui.ActionBar.f6.v0(i21, c3Var.A);
                            }
                            c3Var.t(i12, l3Var.l, false);
                            c3Var.y(l3Var.q, false);
                            c3Var.B0 = l3Var.h;
                            c3Var.C0 = l3Var.i;
                            boolean z14 = l3Var.s;
                            c3Var.s0 = z14;
                            mh.u2 u2Var = c3Var.x;
                            u2Var.setIsBackButtonVisible(z14);
                            c3Var.v.setAllowSwipes(l3Var.j);
                            AndroidUtilities.updateImageViewImageAnimated(c3Var.S.getBackButton(), c3Var.s0 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
                            BotFullscreenButtons botFullscreenButtons = c3Var.i0;
                            if (botFullscreenButtons != null) {
                                botFullscreenButtons.setBack(c3Var.s0, false);
                            }
                            c3Var.n0 = l3Var.w;
                            c3Var.v0 = Boolean.valueOf(l3Var.z);
                            c3Var.w0 = l3Var.A;
                            mh.y0 y0Var = l3Var.I;
                            c3Var.x0 = y0Var;
                            if (y0Var != null) {
                                mh.w0 w0Var = y0Var.r;
                                SensorManager sensorManager = y0Var.a;
                                if (y0Var.l) {
                                    y0Var.l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = y0Var.b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(y0Var.n, sensor, mh.y0.a(y0Var.c));
                                        }
                                        Sensor sensor2 = y0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(y0Var.p, sensor2, mh.y0.a(y0Var.e));
                                        }
                                        Sensor sensor3 = y0Var.g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(w0Var, sensor3, mh.y0.a(y0Var.h));
                                        }
                                        Sensor sensor4 = y0Var.f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(w0Var, sensor4, mh.y0.a(y0Var.h));
                                        }
                                        Sensor sensor5 = y0Var.i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(y0Var.t, sensor5, mh.y0.a(y0Var.j));
                                        }
                                    }
                                }
                            }
                            a6.a aVar = l3Var.u;
                            if (aVar != null) {
                                mh.y2 y2Var = c3Var.h0;
                                int totalHeight = y2Var.getTotalHeight();
                                y2Var.e = aVar;
                                mh.u[] uVarArr = y2Var.f;
                                mh.w.b(uVarArr[0].l, (mh.v) aVar.b, false);
                                mh.w.b(uVarArr[1].l, (mh.v) aVar.d, false);
                                y2Var.invalidate();
                                if (totalHeight != y2Var.getTotalHeight() && y2Var.r != null) {
                                    if (totalHeight < y2Var.getTotalHeight()) {
                                        AndroidUtilities.runOnUIThread(y2Var.r, 200L);
                                    } else {
                                        y2Var.r.run();
                                    }
                                }
                                int i22 = aVar.c;
                                Paint paint = y2Var.a;
                                y2Var.e.c = i22;
                                paint.setColor(i22);
                                y2Var.d.a(i22, true);
                            }
                            c3Var.x(l3Var.x, false, l3Var.y);
                            mh.s4 s4Var = l3Var.a;
                            c3Var.C = s4Var != null ? s4Var.a : UserConfig.selectedAccount;
                            org.telegram.ui.web.v0 v0Var = l3Var.b;
                            if (v0Var != null) {
                                v0Var.onResume();
                                int i23 = c3Var.C;
                                org.telegram.ui.web.v0 v0Var2 = l3Var.b;
                                Object obj4 = l3Var.d;
                                u2Var.I = i23;
                                u2Var.Q(v0Var2, obj4);
                                if (u2Var.k0) {
                                    u2Var.v("visibility_changed", org.telegram.ui.web.y0.x(Boolean.TRUE, "is_visible"));
                                }
                                boolean z15 = l3Var.r || l3Var.b.b;
                                String str4 = l3Var.v;
                                u2Var.g("setState(" + z15 + ", " + str4 + ")");
                                u2Var.J = z15;
                                u2Var.b = str4;
                                if (org.telegram.ui.ActionBar.f6.I.q() != l3Var.B) {
                                    u2Var.w();
                                }
                            } else {
                                s4Var.q = null;
                                s4Var.r = 0L;
                            }
                            c3Var.s(o2Var, l3Var.a);
                            c3Var.X = l3Var.t;
                            if (l3Var.E) {
                                c3Var.O0 = true;
                                c3Var.i();
                                org.telegram.ui.g3 g3Var = c3Var.Q0;
                                String userName = UserObject.getUserName(MessagesController.getInstance(c3Var.C).getUser(Long.valueOf(c3Var.D)));
                                String str5 = l3Var.F;
                                c3Var.P0 = str5;
                                g3Var.a(userName, str5);
                                org.telegram.ui.g3 g3Var2 = c3Var.Q0;
                                Paint paint2 = c3Var.L;
                                g3Var2.b(AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f, false);
                                c3Var.Q0.setBackgroundColor(paint2.getColor());
                                c3Var.Q0.setVisibility(0);
                                c3Var.Q0.setAlpha(1.0f);
                            }
                            c3Var.o(l3Var.J);
                            m3Var.h(m3Var.w, l3Var, false);
                            c3Var.show();
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
                org.telegram.ui.p3 p3Var = (org.telegram.ui.p3) obj3;
                Activity activity = (Activity) obj2;
                String str6 = (String) obj;
                if (!TextUtils.isEmpty(str6) && p3Var.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str6.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i24 = 0;
                    while (i15 < uRLSpanArr.length) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i15]), length);
                        i24 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i15]), i24);
                        i15++;
                    }
                    Uri uriParseSafe = Utilities.uriParseSafe(str6);
                    if (uriParseSafe == null || !TextUtils.equals(uriParseSafe.getScheme(), "javascript")) {
                        if ((uRLSpanArr.length <= 0 || length != 0 || i24 <= 0) && (uriParseSafe == null || uriParseSafe.getScheme() == null)) {
                            org.telegram.ui.web.k.b(activity, str6);
                            org.telegram.ui.web.v0 webView = p3Var.getWebView();
                            String str7 = org.telegram.ui.web.j1.a().b;
                            if (str7 != null) {
                                StringBuilder n10 = e2.c.n(str7);
                                n10.append(URLEncoder.encode(str6));
                                str = n10.toString();
                            }
                            webView.loadUrl(str);
                            break;
                        } else {
                            if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                                str6 = ve.e.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                            }
                            p3Var.getWebView().loadUrl(str6);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
