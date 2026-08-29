package ih;

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
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import jh.i7;
import jh.k7;
import nh.aa;
import nh.ca;
import nh.dc;
import nh.e9;
import nh.ec;
import nh.f9;
import nh.fb;
import nh.gb;
import nh.h9;
import nh.j6;
import nh.ja;
import nh.kb;
import nh.lb;
import nh.o7;
import nh.qb;
import nh.y8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.Emoji;
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
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.d31;
import org.telegram.ui.dk;
import org.telegram.ui.ej;
import org.telegram.ui.tn;
import org.telegram.ui.z6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(Object obj) {
        org.telegram.ui.q3 q3Var = (org.telegram.ui.q3) this.b;
        Activity activity = (Activity) this.c;
        String str = (String) obj;
        if (TextUtils.isEmpty(str) || q3Var.getWebView() == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.trim());
        AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        int length = spannableStringBuilder.length();
        int i10 = 0;
        for (int i11 = 0; i11 < uRLSpanArr.length; i11++) {
            length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i11]), length);
            i10 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i11]), i10);
        }
        Uri uriParseSafe = Utilities.uriParseSafe(str);
        if (uriParseSafe == null || !TextUtils.equals(uriParseSafe.getScheme(), "javascript")) {
            String str2 = null;
            if ((uRLSpanArr.length > 0 && length == 0 && i10 > 0) || (uriParseSafe != null && uriParseSafe.getScheme() != null)) {
                if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                    str = ye.d.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                }
                q3Var.getWebView().loadUrl(str);
                return;
            }
            org.telegram.ui.web.l.b(activity, str);
            org.telegram.ui.web.w0 webView = q3Var.getWebView();
            String str3 = org.telegram.ui.web.k1.a().b;
            if (str3 != null) {
                StringBuilder n10 = com.google.android.recaptcha.internal.a.n(str3);
                n10.append(URLEncoder.encode(str));
                str2 = n10.toString();
            }
            webView.loadUrl(str2);
        }
    }

    private final void b(Object obj) {
        tn tnVar = (tn) this.b;
        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.c;
        Long l10 = (Long) obj;
        if (tnVar.N3 == 1) {
            org.telegram.ui.Components.c5.M(tnVar.getParentActivity(), tnVar.P5, new z6(tnVar, botInlineResult, l10, 2), tnVar.aa);
        } else {
            tnVar.cb(botInlineResult, true, 0, l10.longValue());
        }
    }

    private final void c(Object obj) {
        tn tnVar = (tn) this.b;
        org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.c;
        TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
        try {
            c2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        c2VarArr[0] = null;
        if (tL_statsPollStats != null) {
            if (!(tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError)) {
                new eh.g(tnVar.getParentActivity(), tnVar.aa, tL_statsPollStats).show();
                return;
            }
            j7.l1.v(R.string.PollStatsWillLater, tc.a0(tnVar), R.raw.timer_toast, 24);
        }
    }

    private final void d(Object obj) {
        tn tnVar = (tn) this.b;
        MessageObject messageObject = (MessageObject) this.c;
        tnVar.getClass();
        TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
        if (messageObject == null || messageObject.messageOwner == null || tl == null) {
            return;
        }
        tnVar.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0947  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x096c  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x09df  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0a04  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0a30  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0a38  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x095a  */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        int i10;
        float f9;
        boolean z10;
        AnimatorSet animatorSet;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        int i14;
        BitmapFactory.Options options;
        int i15;
        ?? r14;
        ag.j2 j2Var;
        org.telegram.ui.web.w0 w0Var;
        boolean z11;
        boolean z12;
        tn tnVar;
        dk dkVar;
        org.telegram.ui.web.d2 d2Var;
        String str;
        String str2;
        File file;
        String str3;
        FrameLayout frameLayout;
        String str4;
        int i16;
        int i17 = this.a;
        int i18 = 4;
        int i19 = 2;
        int i20 = 3;
        int i21 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i17) {
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
                h1 h1Var = (h1) obj2;
                if (((Object[]) obj)[1] == ((k7) obj3)) {
                    h1Var.run();
                    break;
                }
                break;
            case 2:
                gr0 gr0Var = (gr0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str5 = (String) obj;
                i7 i7Var = gr0Var.e;
                int i22 = tL_starGiftCollection.collection_id;
                i7Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i23 = i7Var.a;
                updatestargiftcollection.peer = MessagesController.getInstance(i23).getInputPeer(i7Var.b);
                updatestargiftcollection.collection_id = i22;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str5;
                ConnectionsManager.getInstance(i23).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str5;
                gr0Var.f(true);
                break;
            case 3:
                e6 e6Var = (e6) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                long j10 = e6Var.V;
                Runnable runnable = e6Var.c0;
                if (runnable != null) {
                    runnable.run();
                }
                e6Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new v5(0, user), 250L);
                MessagesController.getInstance(e6Var.U).getMainSettings().edit().putBoolean("show_gift_for_" + j10, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                break;
            case 4:
                jh.h5 h5Var = (jh.h5) obj3;
                String str6 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                jh.d5 d5Var = h5Var.a0;
                ph.i[] iVarArr = h5Var.o0;
                nh.d dVar = h5Var.f0;
                if (stargiftupgradepreview != null) {
                    d5Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    h5Var.q2(1, false, null);
                    d5Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str6), null);
                    iVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    iVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    iVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    h5Var.q0.setVisibility(8);
                    h5Var.p0.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), false, true);
                    dVar.f(null, false);
                    dVar.setOnClickListener(new jh.l1(h5Var, i18));
                    h5Var.show();
                    break;
                }
                break;
            case 5:
                jh.h5.m0((jh.h5) obj3, (org.telegram.ui.ActionBar.c2) obj2, (TL_stars.SavedStarGift) obj);
                break;
            case 6:
                jh.g4 g4Var = (jh.g4) obj3;
                g4Var.getClass();
                ((jh.e4) obj2).a((TL_stars.StarGift) obj, true);
                g4Var.d(true);
                break;
            case 7:
                jh.l4 l4Var = (jh.l4) obj3;
                kf.b bVar = (kf.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                ye.c cVar = l4Var.n;
                if (cVar != null && bVar == l4Var.q) {
                    cVar.c(false);
                }
                l4Var.p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    l4Var.o.put(bVar, new jh.j4(bVar, tL_payments_paymentFormStarGift));
                    l4Var.a(true);
                    break;
                }
                break;
            case 8:
                ((Utilities.Callback2) obj3).run((kf.a) obj, new jh.o((jh.w0[]) obj2, 13));
                break;
            case 9:
                nh.i2 i2Var = (nh.i2) obj3;
                dc dcVar = (dc) obj;
                i2Var.getClass();
                nh.f2 f2Var = ((nh.f2[]) obj2)[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dcVar == null ? "🌤" : dcVar.c);
                sb2.append(" ");
                sb2.append(dcVar == null ? ec.b() ? "24°C" : "72°F" : dcVar.a());
                CharSequence replaceEmoji = Emoji.replaceEmoji(sb2.toString(), i2Var.b.getFontMetricsInt(), false);
                nh.i2 i2Var2 = f2Var.o;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(replaceEmoji, i2Var2.b, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), i2Var2.b, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                f2Var.k = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    i10 = 0;
                    f9 = f2Var.k.getLineWidth(0);
                } else {
                    i10 = 0;
                    f9 = 0.0f;
                }
                f2Var.l = f9;
                f2Var.m = f2Var.k.getLineCount() > 0 ? f2Var.k.getLineLeft(i10) : 0.0f;
                f2Var.b = AndroidUtilities.dpf2(17.6f) + f2Var.l;
                f2Var.c = AndroidUtilities.dpf2(36.0f);
                i2Var.invalidate();
                i2Var.requestLayout();
                break;
            case 10:
                ja jaVar = (ja) obj3;
                fb fbVar = (fb) obj2;
                int max = Math.max(0, Math.max(((Integer) obj).intValue() - fbVar.getBottomPadding2(), jaVar.p2 - fbVar.getPaddingUnderContainer()));
                jaVar.S();
                if (max > 0) {
                    bg.k kVar = jaVar.F0;
                    if ((kVar instanceof bg.f4) && ((bg.f4) kVar).getEditText().isFocused()) {
                        z10 = true;
                        animatorSet = jaVar.J1;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        jaVar.J1 = new AnimatorSet();
                        arrayList = new ArrayList();
                        bg.w2 w2Var = jaVar.Z0;
                        Property property = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(w2Var, (Property<bg.w2, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(jaVar.P0, (Property<nh.p5, Float>) property, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                        bg.l0 l0Var = jaVar.S0;
                        Property property2 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<bg.l0, Float>) property2, !z10 ? 0.0f : 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(jaVar.x0, (Property<bg.i2, Float>) property2, (z10 || jaVar.x1) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(jaVar.w0, (Property<bg.e2, Float>) property2, (z10 || jaVar.x1) ? 1.0f : 0.0f));
                        jaVar.T0();
                        jaVar.J1.playTogether(arrayList);
                        if (z10) {
                            jaVar.J1.setDuration(350L);
                            jaVar.J1.setInterpolator(jr.h);
                        } else {
                            jaVar.J1.setDuration(250L);
                            jaVar.J1.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                        }
                        jaVar.J1.start();
                        for (i11 = 0; i11 < arrayList.size(); i11++) {
                            ((Animator) arrayList.get(i11)).setDuration(z10 ? 350L : 250L);
                            ((Animator) arrayList.get(i11)).setInterpolator(z10 ? jr.h : org.telegram.ui.ActionBar.q1.w);
                            ((Animator) arrayList.get(i11)).start();
                        }
                        if (!z10) {
                            jaVar.P0(false);
                        }
                        if (jaVar.d2 != z10) {
                            jaVar.g0();
                        }
                        jaVar.d2 = z10;
                        break;
                    }
                }
                z10 = false;
                animatorSet = jaVar.J1;
                if (animatorSet != null) {
                }
                jaVar.J1 = new AnimatorSet();
                arrayList = new ArrayList();
                bg.w2 w2Var2 = jaVar.Z0;
                Property property3 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(w2Var2, (Property<bg.w2, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(jaVar.P0, (Property<nh.p5, Float>) property3, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                bg.l0 l0Var2 = jaVar.S0;
                Property property22 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<bg.l0, Float>) property22, !z10 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(jaVar.x0, (Property<bg.i2, Float>) property22, (z10 || jaVar.x1) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(jaVar.w0, (Property<bg.e2, Float>) property22, (z10 || jaVar.x1) ? 1.0f : 0.0f));
                jaVar.T0();
                jaVar.J1.playTogether(arrayList);
                if (z10) {
                }
                jaVar.J1.start();
                while (i11 < arrayList.size()) {
                }
                if (!z10) {
                }
                if (jaVar.d2 != z10) {
                }
                jaVar.d2 = z10;
                break;
            case 11:
                nh.t5 t5Var = (nh.t5) obj3;
                nh.c5 c5Var = (nh.c5) obj2;
                dc dcVar2 = (dc) obj;
                if (dcVar2 != null) {
                    c5Var.dismiss();
                    t5Var.z0(false);
                    t5Var.d0(t5Var.p0(dcVar2));
                    break;
                }
                break;
            case 12:
                nh.t5 t5Var2 = (nh.t5) obj3;
                bg.k1 k1Var = (bg.k1) obj2;
                bg.h1 h1Var2 = (bg.h1) obj;
                if (k1Var != null) {
                    int i24 = t5Var2.B1;
                    k1Var.q0 = h1Var2;
                    k1Var.m0.b(i24, h1Var2, false);
                    k1Var.m();
                    t5Var2.d0(k1Var);
                    break;
                } else {
                    t5Var2.d0(t5Var2.i0(h1Var2));
                    break;
                }
            case 13:
                y8 y8Var = (y8) obj3;
                ((j70) obj2).u();
                y8Var.g(true);
                e9 e9Var = y8Var.S;
                h9 h9Var = e9Var.T;
                if (h9Var != null) {
                    h9Var.run(new HashSet(e9Var.v));
                    break;
                }
                break;
            case 14:
                y8 y8Var2 = (y8) obj3;
                y8Var2.S.C = true;
                ((fr[]) obj2)[0].dismiss();
                y8Var2.g(true);
                break;
            case 15:
                ca caVar = (ca) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj2;
                Integer num = (Integer) obj;
                gb gbVar = caVar.a;
                boolean q02 = gbVar.q0();
                int i25 = gbVar.c;
                if (q02) {
                    try {
                        gbVar.n.performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                }
                gbVar.L1 = false;
                j6 j6Var = gbVar.y0;
                if (j6Var != null) {
                    j6Var.c(false);
                }
                if (gbVar.C1 != null) {
                    try {
                        options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(gbVar.C1.getAbsolutePath(), options);
                        i12 = options.outWidth;
                    } catch (Exception unused2) {
                        i12 = -1;
                    }
                    try {
                        i13 = options.outHeight;
                    } catch (Exception unused3) {
                        i13 = -1;
                        if (num.intValue() != -1) {
                        }
                        if (num.intValue() != -1) {
                        }
                        o7 m10 = o7.m(i14, gbVar.C1);
                        m10.J0 = gbVar.r0;
                        m10.K0 = gbVar.s0;
                        if (gbVar.w0.j()) {
                        }
                    }
                    int i26 = num.intValue() != -1 ? 0 : 90;
                    if (num.intValue() != -1) {
                        if (i12 > i13) {
                            i14 = 270;
                        }
                        i14 = i26;
                    } else {
                        if (i13 > i12 && i26 != 0) {
                            i14 = 0;
                        }
                        i14 = i26;
                    }
                    o7 m102 = o7.m(i14, gbVar.C1);
                    m102.J0 = gbVar.r0;
                    m102.K0 = gbVar.s0;
                    if (gbVar.w0.j()) {
                        gbVar.G1 = m102;
                        f9.a(i25, m102);
                        gbVar.H1 = false;
                        if (callback2 != null) {
                            callback2.run(new aa(caVar, 2));
                            break;
                        } else {
                            gbVar.K(1, true);
                            break;
                        }
                    } else {
                        gbVar.C1 = null;
                        if (gbVar.w0.l(m102)) {
                            o7 a2 = o7.a(gbVar.w0.getLayout(), gbVar.w0.getContent());
                            gbVar.G1 = a2;
                            f9.a(i25, a2);
                            gbVar.H1 = false;
                            if (callback2 != null) {
                                callback2.run(null);
                            }
                        } else if (callback2 != null) {
                            callback2.run(null);
                        }
                        gbVar.m0(true);
                        break;
                    }
                }
                break;
            case 16:
                lb lbVar = (lb) obj2;
                Float f10 = (Float) obj;
                lbVar.i = f10.floatValue();
                kb kbVar = ((qb) obj3).a;
                if (kbVar != null) {
                    kbVar.x0(f10.floatValue(), lbVar.a);
                    break;
                }
                break;
            case 17:
                ((VoIPDebugToSend) obj3).lambda$done$0((TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                break;
            case 18:
                org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) obj3;
                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                if (o2Var != null) {
                    if ((o2Var instanceof tn) && (dkVar = (tnVar = (tn) o2Var).U) != null) {
                        dkVar.P();
                        tnVar.U.n0(true, false, true);
                    }
                    if (o2Var.getContext() != null && o2Var.getParentActivity() != null) {
                        ph.p2 p2Var = new ph.p2(o2Var.getContext(), o2Var.getResourceProvider());
                        p2Var.g0 = o2Var.getParentActivity();
                        if (l3Var != null && l3Var.a != null) {
                            p2Var.A0 = true;
                            boolean z13 = l3Var.m;
                            p2Var.R = z13;
                            if (z13) {
                                p2Var.v(l3Var.p, false);
                            }
                            if (l3Var.l) {
                                i15 = l3Var.o;
                            } else {
                                int i27 = l3Var.n;
                                if (i27 < 0) {
                                    i27 = g6.d6;
                                }
                                i15 = g6.v0(i27, p2Var.A);
                            }
                            p2Var.t(i15, l3Var.l, false);
                            p2Var.y(l3Var.q, false);
                            p2Var.B0 = l3Var.h;
                            p2Var.C0 = l3Var.i;
                            boolean z14 = l3Var.s;
                            p2Var.s0 = z14;
                            ph.h2 h2Var2 = p2Var.x;
                            h2Var2.setIsBackButtonVisible(z14);
                            p2Var.v.setAllowSwipes(l3Var.j);
                            AndroidUtilities.updateImageViewImageAnimated(p2Var.S.getBackButton(), p2Var.s0 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
                            BotFullscreenButtons botFullscreenButtons = p2Var.i0;
                            if (botFullscreenButtons != null) {
                                botFullscreenButtons.setBack(p2Var.s0, false);
                            }
                            p2Var.n0 = l3Var.w;
                            p2Var.v0 = Boolean.valueOf(l3Var.z);
                            p2Var.w0 = l3Var.A;
                            ph.u0 u0Var = l3Var.I;
                            p2Var.x0 = u0Var;
                            if (u0Var != null) {
                                ph.s0 s0Var = u0Var.r;
                                SensorManager sensorManager = u0Var.a;
                                if (u0Var.l) {
                                    u0Var.l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = u0Var.b;
                                        if (sensor != null) {
                                            z12 = true;
                                            sensorManager.registerListener(u0Var.n, sensor, ph.u0.a(u0Var.c));
                                        } else {
                                            z12 = true;
                                        }
                                        Sensor sensor2 = u0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(u0Var.p, sensor2, ph.u0.a(u0Var.e));
                                        }
                                        Sensor sensor3 = u0Var.g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(s0Var, sensor3, ph.u0.a(u0Var.h));
                                        }
                                        Sensor sensor4 = u0Var.f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(s0Var, sensor4, ph.u0.a(u0Var.h));
                                        }
                                        Sensor sensor5 = u0Var.i;
                                        r14 = z12;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(u0Var.t, sensor5, ph.u0.a(u0Var.j));
                                            r14 = z12;
                                        }
                                        j2Var = l3Var.u;
                                        if (j2Var != null) {
                                            ph.l2 l2Var = p2Var.h0;
                                            int totalHeight = l2Var.getTotalHeight();
                                            l2Var.e = j2Var;
                                            ph.s[] sVarArr = l2Var.f;
                                            ph.u.b(sVarArr[0].l, (ph.t) j2Var.c, false);
                                            ph.u.b(sVarArr[r14].l, (ph.t) j2Var.d, false);
                                            l2Var.invalidate();
                                            if (totalHeight != l2Var.getTotalHeight() && l2Var.r != null) {
                                                if (totalHeight < l2Var.getTotalHeight()) {
                                                    AndroidUtilities.runOnUIThread(l2Var.r, 200L);
                                                } else {
                                                    l2Var.r.run();
                                                }
                                            }
                                            int i28 = j2Var.b;
                                            Paint paint = l2Var.a;
                                            l2Var.e.b = i28;
                                            paint.setColor(i28);
                                            l2Var.d.a(i28, r14);
                                        }
                                        p2Var.x(l3Var.x, false, l3Var.y);
                                        ph.y3 y3Var = l3Var.a;
                                        p2Var.C = y3Var == null ? y3Var.a : UserConfig.selectedAccount;
                                        w0Var = l3Var.b;
                                        if (w0Var == null) {
                                            w0Var.onResume();
                                            int i29 = p2Var.C;
                                            org.telegram.ui.web.w0 w0Var2 = l3Var.b;
                                            Object obj4 = l3Var.d;
                                            h2Var2.I = i29;
                                            h2Var2.Q(w0Var2, obj4);
                                            if (h2Var2.k0) {
                                                h2Var2.v("visibility_changed", org.telegram.ui.web.z0.x(Boolean.TRUE, "is_visible"));
                                            }
                                            boolean z15 = l3Var.r || l3Var.b.b;
                                            String str7 = l3Var.v;
                                            h2Var2.g("setState(" + z15 + ", " + str7 + ")");
                                            h2Var2.J = z15;
                                            h2Var2.b = str7;
                                            if (g6.I.q() != l3Var.B) {
                                                h2Var2.w();
                                            }
                                        } else {
                                            y3Var.q = null;
                                            y3Var.r = 0L;
                                        }
                                        p2Var.s(o2Var, l3Var.a);
                                        p2Var.X = l3Var.t;
                                        if (l3Var.E) {
                                            z11 = false;
                                        } else {
                                            p2Var.O0 = true;
                                            p2Var.i();
                                            org.telegram.ui.h3 h3Var = p2Var.Q0;
                                            String userName = UserObject.getUserName(MessagesController.getInstance(p2Var.C).getUser(Long.valueOf(p2Var.D)));
                                            String str8 = l3Var.F;
                                            p2Var.P0 = str8;
                                            h3Var.a(userName, str8);
                                            org.telegram.ui.h3 h3Var2 = p2Var.Q0;
                                            Paint paint2 = p2Var.L;
                                            z11 = false;
                                            h3Var2.b(AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f, false);
                                            p2Var.Q0.setBackgroundColor(paint2.getColor());
                                            p2Var.Q0.setVisibility(0);
                                            p2Var.Q0.setAlpha(1.0f);
                                        }
                                        p2Var.o(l3Var.J);
                                        m3Var.h(m3Var.w, l3Var, z11);
                                        p2Var.show();
                                        break;
                                    }
                                }
                            }
                            r14 = 1;
                            j2Var = l3Var.u;
                            if (j2Var != null) {
                            }
                            p2Var.x(l3Var.x, false, l3Var.y);
                            ph.y3 y3Var2 = l3Var.a;
                            p2Var.C = y3Var2 == null ? y3Var2.a : UserConfig.selectedAccount;
                            w0Var = l3Var.b;
                            if (w0Var == null) {
                            }
                            p2Var.s(o2Var, l3Var.a);
                            p2Var.X = l3Var.t;
                            if (l3Var.E) {
                            }
                            p2Var.o(l3Var.J);
                            m3Var.h(m3Var.w, l3Var, z11);
                            p2Var.show();
                        }
                    }
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.s3 s3Var = (org.telegram.ui.ActionBar.s3) obj2;
                ((org.telegram.ui.ActionBar.l3) obj3).k = (Bitmap) obj;
                s3Var.getWindowView().setDrawingFromOverlay(false);
                s3Var.release();
                break;
            case 20:
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
            case 21:
                org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) obj3;
                Activity activity = (Activity) obj2;
                Integer num2 = (Integer) obj;
                org.telegram.ui.z3 z3Var = m4Var.G;
                org.telegram.ui.n0[] n0VarArr = m4Var.O0;
                if ((!m4Var.q0[0].c() || m4Var.q0[0].c.A != null) && m4Var.H != null) {
                    if (num2.intValue() == 1) {
                        org.telegram.ui.o0 o0Var = m4Var.d0;
                        int dp = AndroidUtilities.dp(56.0f);
                        m4Var.E0 = dp;
                        o0Var.setHeight(dp);
                        m4Var.d0.h(true);
                        break;
                    } else if (num2.intValue() == 2) {
                        if (!m4Var.q0[0].f()) {
                            TLRPC.WebPage webPage = m4Var.q0[0].c.A;
                            if (webPage != null) {
                                str4 = webPage.url;
                            }
                        } else if (m4Var.q0[0].getWebView() != null) {
                            str4 = m4Var.q0[0].getWebView().getUrl();
                        }
                        String s10 = org.telegram.ui.web.z0.s(str4);
                        m4Var.a0(new dq0(m4Var.H, null, s10, false, s10, false, AndroidUtilities.computePerceivedBrightness(m4Var.d0.getBackgroundColor()) < 0.721f ? new lh.b() : null));
                        break;
                    } else {
                        int i30 = 6;
                        if (num2.intValue() == 6) {
                            if (!m4Var.q0[0].f()) {
                                org.telegram.ui.q3 q3Var = m4Var.q0[0];
                                TLRPC.WebPage webPage2 = q3Var.c.A;
                                if (webPage2 != null) {
                                    str3 = webPage2.url;
                                    frameLayout = q3Var;
                                }
                            } else if (m4Var.q0[0].getWebView() != null) {
                                str3 = m4Var.q0[0].getWebView().getUrl();
                                frameLayout = m4Var.q0[0].f;
                            }
                            org.telegram.ui.m4.f(str3, m4Var.T, frameLayout, z3Var, null);
                            break;
                        } else {
                            int i31 = 5;
                            if (num2.intValue() == 7) {
                                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                                m2Var.a = true;
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null) {
                                    U.showAsSheet(new org.telegram.ui.web.p(z3Var != null ? new org.telegram.ui.d0(m4Var, i31) : null, new org.telegram.ui.t(m4Var, i19)), m2Var);
                                    break;
                                }
                            } else if (num2.intValue() == 8) {
                                org.telegram.ui.ActionBar.m2 m2Var2 = new org.telegram.ui.ActionBar.m2();
                                m2Var2.a = true;
                                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    U2.showAsSheet(new org.telegram.ui.web.d1(z3Var != null ? new org.telegram.ui.d0(m4Var, i30) : null, new org.telegram.ui.t(m4Var, i20)), m2Var2);
                                    break;
                                }
                            } else if (num2.intValue() == 9) {
                                if (m4Var.q0[0].getWebView() != null) {
                                    m4Var.q0[0].getWebView().goForward();
                                    break;
                                }
                            } else {
                                int i32 = 10;
                                if (num2.intValue() == 3) {
                                    if (!m4Var.q0[0].f()) {
                                        TLRPC.WebPage webPage3 = m4Var.q0[0].c.A;
                                        if (webPage3 != null) {
                                            String str9 = webPage3.url;
                                            TL_iv.Page page = webPage3.cached_page;
                                            if (page != null) {
                                                file = page.local;
                                                str = str9;
                                                str2 = null;
                                            } else {
                                                str = str9;
                                                str2 = null;
                                                file = null;
                                            }
                                        }
                                    } else if (m4Var.q0[0].getWebView() != null) {
                                        str = m4Var.q0[0].getWebView().getUrl();
                                        str2 = m4Var.q0[0].getWebView().getOpenURL();
                                        file = null;
                                    }
                                    Activity activity2 = m4Var.H;
                                    if (activity2 != null && !activity2.isFinishing()) {
                                        if (file != null) {
                                            AndroidUtilities.openForView(file, null, "text/markdown", m4Var.H, null, true);
                                            break;
                                        } else if (str != null) {
                                            String hostAuthority = AndroidUtilities.getHostAuthority(str2, true);
                                            String hostAuthority2 = AndroidUtilities.getHostAuthority(str, true);
                                            org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(m4Var, str, i21);
                                            org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(m4Var, hostAuthority2, hostAuthority, i21);
                                            if (!m4Var.q0[0].f() || !MessagesController.getInstance(m4Var.T).isWebBrowserOpenInApp(hostAuthority2) || MessagesController.getInstance(m4Var.T).isWebBrowserExceptionsLimitReached(true)) {
                                                a0Var.run();
                                                break;
                                            } else {
                                                org.telegram.ui.Components.c5.o0(activity, null, str, true, new bh.v(i32, b0Var, a0Var));
                                                break;
                                            }
                                        }
                                    }
                                } else if (num2.intValue() == 4) {
                                    if (m4Var.q0[0].f()) {
                                        org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                                        if (U3 != null) {
                                            org.telegram.ui.ActionBar.m2 m2Var3 = new org.telegram.ui.ActionBar.m2();
                                            m2Var3.a = true;
                                            U3.showAsSheet(new org.telegram.ui.web.w1(new org.telegram.ui.t(m4Var, i20)), m2Var3);
                                            break;
                                        }
                                    } else {
                                        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(m4Var.H, null, false, false);
                                        f3Var.fixNavigationBar();
                                        f3Var.applyTopPadding = false;
                                        LinearLayout linearLayout = new LinearLayout(m4Var.H);
                                        linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                                        linearLayout.setOrientation(1);
                                        org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(m4Var.H, (org.telegram.ui.ActionBar.c6) null);
                                        k4Var.setText(LocaleController.getString(R.string.FontSize));
                                        linearLayout.addView(k4Var, i7.f6.t(-2, -2, 51, 3, 1, 3, 0));
                                        linearLayout.addView(new org.telegram.ui.i4(m4Var, m4Var.H), i7.f6.t(-1, -2, 51, 3, 0, 3, 0));
                                        org.telegram.ui.Cells.k4 k4Var2 = new org.telegram.ui.Cells.k4(m4Var.H, (org.telegram.ui.ActionBar.c6) null);
                                        k4Var2.setText(LocaleController.getString(R.string.FontType));
                                        linearLayout.addView(k4Var2, i7.f6.t(-2, -2, 51, 3, 4, 3, 2));
                                        int i33 = 0;
                                        while (i33 < i19) {
                                            Activity activity3 = m4Var.H;
                                            org.telegram.ui.n0 n0Var = new org.telegram.ui.n0(activity3);
                                            n0Var.setBackgroundDrawable(g6.f0(g6.w0(null, g6.i6, false), i19, -1));
                                            RadioButton radioButton = new RadioButton(activity3);
                                            n0Var.b = radioButton;
                                            radioButton.setSize(AndroidUtilities.dp(20.0f));
                                            radioButton.b(g6.w0(null, g6.D5, false), g6.w0(null, g6.E5, false));
                                            boolean z16 = LocaleController.isRTL;
                                            n0Var.addView(radioButton, i7.f6.d(22, 22.0f, (z16 ? 5 : 3) | 48, z16 ? 0 : 22, 13.0f, z16 ? 22 : 0, 0.0f));
                                            TextView textView = new TextView(activity3);
                                            org.telegram.ui.b.r(textView, g6.w0(null, g6.G6, false), 1, 16.0f, 1);
                                            textView.setMaxLines(1);
                                            textView.setSingleLine(true);
                                            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                                            boolean z17 = LocaleController.isRTL;
                                            n0Var.addView(textView, i7.f6.d(-1, -1.0f, (z17 ? 5 : 3) | 48, z17 ? 17 : 62, 0.0f, z17 ? 62 : 17, 0.0f));
                                            n0VarArr[i33] = n0Var;
                                            if (i33 == 0) {
                                                String string = LocaleController.getString(R.string.Default);
                                                Typeface typeface = Typeface.DEFAULT;
                                                textView.setText(string);
                                                textView.setTypeface(typeface);
                                                n0Var.setContentDescription(string);
                                                n0Var.invalidate();
                                            } else if (i33 == 1) {
                                                Typeface typeface2 = Typeface.SERIF;
                                                textView.setText("Serif");
                                                textView.setTypeface(typeface2);
                                                n0Var.setContentDescription("Serif");
                                                n0Var.invalidate();
                                            }
                                            ((RadioButton) n0VarArr[i33].b).a(i33 == m4Var.a, false);
                                            n0VarArr[i33].setTag(Integer.valueOf(i33));
                                            n0VarArr[i33].setOnClickListener(new org.telegram.ui.u(m4Var, i18));
                                            linearLayout.addView(n0VarArr[i33], i7.f6.n(-1, 50));
                                            i33++;
                                            i19 = 2;
                                        }
                                        f3Var.customView = linearLayout;
                                        m4Var.E = f3Var;
                                        m4Var.a0(f3Var);
                                        break;
                                    }
                                } else if (num2.intValue() != 5) {
                                    if (num2.intValue() == 10 && (d2Var = m4Var.q0[0].y) != null && d2Var.b() != null) {
                                        m4Var.h(d2Var.b(), null, 1);
                                        break;
                                    }
                                } else if (m4Var.q0[0].f() && m4Var.q0[0].getWebView() != null) {
                                    m4Var.q0[0].getWebView().reload();
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 22:
                a(obj);
                break;
            case 23:
                tn tnVar2 = (tn) obj3;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = tnVar2.getMessagesController().getInputPeer(tnVar2.P5);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((sf.r1) obj2).a;
                tnVar2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                dk dkVar2 = tnVar2.U;
                if (dkVar2 != null) {
                    dkVar2.setFieldText(null);
                    break;
                }
                break;
            case 24:
                tn tnVar3 = (tn) obj3;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) obj2, tnVar3.P5, tnVar3.j5, tnVar3.T3, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = tnVar3.C8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = tnVar3.N8();
                of2.suggestionParams = tnVar3.c5;
                tnVar3.getSendMessagesHelper().sendMessage(of2);
                tnVar3.U.setFieldText("");
                tnVar3.e9(false);
                break;
            case 25:
                b(obj);
                break;
            case 26:
                tn.q1((tn) obj3, (d31[]) obj2, (j70) obj);
                break;
            case 27:
                c(obj);
                break;
            case 28:
                d(obj);
                break;
            default:
                sf.r1 r1Var = (sf.r1) obj2;
                String str10 = (String) obj;
                tn tnVar4 = ((ej) obj3).b;
                if (r1Var != null) {
                    i16 = ((org.telegram.ui.ActionBar.o2) tnVar4).currentAccount;
                    sf.s1.f(i16).k(r1Var.a, str10);
                }
                tnVar4.M3 = str10;
                tnVar4.W0.setTitle(str10);
                break;
        }
    }
}
