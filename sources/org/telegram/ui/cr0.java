package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ cr0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x023d, code lost:
    
        if (r4.startsWith("https://" + org.telegram.messenger.MessagesController.getInstance(r7.Q).linkPrefix) == false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x049d  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        ju0 ju0Var;
        float f10;
        int i10;
        TLRPC.Message message;
        int i11 = this.a;
        float f11 = 0.0f;
        final PhotoViewer photoViewer = this.b;
        final int i12 = 0;
        int i13 = 1;
        switch (i11) {
            case 0:
                if (!photoViewer.b2 && !photoViewer.H1()) {
                    photoViewer.M2();
                    break;
                }
                break;
            case 1:
                Drawable[] drawableArr = PhotoViewer.Q8;
                if (!photoViewer.H1() && (ju0Var = photoViewer.d) != null && ju0Var.c() != null && !photoViewer.d.c().isEmpty()) {
                    photoViewer.p3(!photoViewer.H, true);
                    break;
                }
                break;
            case 2:
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                photoViewer.T1(true);
                photoViewer.B0(0, true);
                break;
            case 3:
                MessageObject messageObject = photoViewer.Q4;
                if (messageObject == null || !messageObject.isSponsored()) {
                    if (photoViewer.C.r0.a()) {
                        photoViewer.l0.M(null, null);
                        break;
                    }
                } else {
                    MessageObject messageObject2 = photoViewer.Q4;
                    if (messageObject2 != null && messageObject2.isSponsored() && photoViewer.l0.getAlpha() > 0.5f) {
                        final int i14 = photoViewer.Q4.currentAccount;
                        final oh.b bVar = new oh.b();
                        org.telegram.ui.Components.q70 G = org.telegram.ui.Components.q70.G(photoViewer.b0, bVar, photoViewer.l0, true);
                        G.a0(0.0f, -AndroidUtilities.dp(46.0f));
                        G.V(5);
                        MessageObject messageObject3 = photoViewer.Q4;
                        if (messageObject3.sponsoredInfo == null && messageObject3.sponsoredAdditionalInfo == null) {
                            String str = messageObject3.sponsoredUrl;
                            if (str != null) {
                                break;
                            }
                            if (!UserConfig.getInstance(i14).isPremium() && !MessagesController.getInstance(photoViewer.Q).premiumFeaturesBlocked() && !photoViewer.Q4.sponsoredCanReport) {
                                G.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable() { // from class: org.telegram.ui.sq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i15 = i12;
                                        oh.b bVar2 = bVar;
                                        int i16 = i14;
                                        PhotoViewer photoViewer2 = photoViewer;
                                        switch (i15) {
                                            case 0:
                                                Drawable[] drawableArr3 = PhotoViewer.Q8;
                                                if (!UserConfig.getInstance(i16).isPremium()) {
                                                    new fg.n1(photoViewer2.j4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.qc(photoViewer2.b0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                    MessagesController.getInstance(i16).disableAds(true);
                                                    org.telegram.ui.ActionBar.p2 p2Var = photoViewer2.j4;
                                                    if (p2Var instanceof xn) {
                                                        xn xnVar = (xn) p2Var;
                                                        xnVar.Fa(photoViewer2.Q4);
                                                        xnVar.Ha(photoViewer2.Q4);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                Drawable[] drawableArr4 = PhotoViewer.Q8;
                                                if (!UserConfig.getInstance(i16).isPremium()) {
                                                    new fg.n1(photoViewer2.j4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.qc(photoViewer2.b0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                    MessagesController.getInstance(i16).disableAds(true);
                                                    org.telegram.ui.ActionBar.p2 p2Var2 = photoViewer2.j4;
                                                    if (p2Var2 instanceof xn) {
                                                        xn xnVar2 = (xn) p2Var2;
                                                        xnVar2.Fa(photoViewer2.Q4);
                                                        xnVar2.Ha(photoViewer2.Q4);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                }, false);
                            }
                            if (photoViewer.Q4.sponsoredCanReport) {
                                G.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new he0(27, photoViewer, bVar), false);
                                if ((photoViewer.j4 instanceof xn) && !MessagesController.getInstance(i14).premiumFeaturesBlocked()) {
                                    G.k();
                                    final int i15 = 1;
                                    G.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new Runnable() { // from class: org.telegram.ui.sq0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i152 = i15;
                                            oh.b bVar2 = bVar;
                                            int i16 = i14;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i152) {
                                                case 0:
                                                    Drawable[] drawableArr3 = PhotoViewer.Q8;
                                                    if (!UserConfig.getInstance(i16).isPremium()) {
                                                        new fg.n1(photoViewer2.j4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.qc(photoViewer2.b0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                        MessagesController.getInstance(i16).disableAds(true);
                                                        org.telegram.ui.ActionBar.p2 p2Var = photoViewer2.j4;
                                                        if (p2Var instanceof xn) {
                                                            xn xnVar = (xn) p2Var;
                                                            xnVar.Fa(photoViewer2.Q4);
                                                            xnVar.Ha(photoViewer2.Q4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr4 = PhotoViewer.Q8;
                                                    if (!UserConfig.getInstance(i16).isPremium()) {
                                                        new fg.n1(photoViewer2.j4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.qc(photoViewer2.b0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                        MessagesController.getInstance(i16).disableAds(true);
                                                        org.telegram.ui.ActionBar.p2 p2Var2 = photoViewer2.j4;
                                                        if (p2Var2 instanceof xn) {
                                                            xn xnVar2 = (xn) p2Var2;
                                                            xnVar2.Fa(photoViewer2.Q4);
                                                            xnVar2.Ha(photoViewer2.Q4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    }, false);
                                }
                            }
                            if (G.x() <= 0) {
                                G.Z();
                                break;
                            }
                        }
                        org.telegram.ui.Components.q70 J = G.J();
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, photoViewer.B, bVar, true, false);
                        g1Var.setItemHeight(44);
                        g1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                        g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                        g1Var.setOnClickListener(new eh(G, 1));
                        J.r(g1Var, k7.c6.n(-1, -2));
                        J.r(new org.telegram.ui.ActionBar.m1(photoViewer.B, bVar), k7.c6.n(-1, 8));
                        ArrayList arrayList = new ArrayList();
                        String str2 = photoViewer.Q4.sponsoredUrl;
                        if (str2 != null) {
                            f10 = 300.0f;
                            if (!TextUtils.equals(AndroidUtilities.getHostAuthority(str2), MessagesController.getInstance(photoViewer.Q).linkPrefix)) {
                                TextView textView = new TextView(photoViewer.B);
                                textView.setTextColor(bVar.B0(org.telegram.ui.ActionBar.k6.gc));
                                textView.setTextSize(1, 14.0f);
                                textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                                textView.setMaxWidth(AndroidUtilities.dp(300.0f));
                                Uri parse = Uri.parse(photoViewer.Q4.sponsoredUrl);
                                textView.setText(af.g.v(parse, null, null, af.g.a(parse.getHost()), null));
                                textView.setBackground(org.telegram.ui.ActionBar.k6.Y(photoViewer.z1(org.telegram.ui.ActionBar.k6.I5), 0, photoViewer.Q4.sponsoredAdditionalInfo == null ? 6 : 0));
                                textView.setOnClickListener(new hb0(10, photoViewer, G));
                                textView.setOnLongClickListener(new oh.g2(4, photoViewer, bVar));
                                arrayList.add(textView);
                            }
                        } else {
                            f10 = 300.0f;
                        }
                        if (photoViewer.Q4.sponsoredInfo != null) {
                            TextView textView2 = new TextView(photoViewer.B);
                            textView2.setTextColor(bVar.B0(org.telegram.ui.ActionBar.k6.E8));
                            textView2.setTextSize(1, 14.0f);
                            textView2.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                            textView2.setMaxWidth(AndroidUtilities.dp(f10));
                            textView2.setText(photoViewer.Q4.sponsoredInfo);
                            textView2.setBackground(org.telegram.ui.ActionBar.k6.Y(photoViewer.z1(org.telegram.ui.ActionBar.k6.I5), 0, photoViewer.Q4.sponsoredAdditionalInfo == null ? 6 : 0));
                            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.rq0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i12) {
                                        case 0:
                                            PhotoViewer photoViewer2 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer2.Q4.sponsoredInfo)) {
                                                b.m(R.string.TextCopied, new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(photoViewer2.B), bVar));
                                                break;
                                            }
                                            break;
                                        default:
                                            PhotoViewer photoViewer3 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer3.Q4.sponsoredAdditionalInfo)) {
                                                b.m(R.string.TextCopied, new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(photoViewer3.B), bVar));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            arrayList.add(textView2);
                        }
                        if (photoViewer.Q4.sponsoredAdditionalInfo != null) {
                            TextView textView3 = new TextView(photoViewer.B);
                            textView3.setTextColor(bVar.B0(org.telegram.ui.ActionBar.k6.E8));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                            textView3.setMaxWidth(AndroidUtilities.dp(f10));
                            textView3.setText(photoViewer.Q4.sponsoredAdditionalInfo);
                            textView3.setBackground(org.telegram.ui.ActionBar.k6.Y(photoViewer.z1(org.telegram.ui.ActionBar.k6.I5), 0, 6));
                            final int i16 = 1;
                            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.rq0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i16) {
                                        case 0:
                                            PhotoViewer photoViewer2 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer2.Q4.sponsoredInfo)) {
                                                b.m(R.string.TextCopied, new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(photoViewer2.B), bVar));
                                                break;
                                            }
                                            break;
                                        default:
                                            PhotoViewer photoViewer3 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer3.Q4.sponsoredAdditionalInfo)) {
                                                b.m(R.string.TextCopied, new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(photoViewer3.B), bVar));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            arrayList.add(textView3);
                        }
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            View view2 = (View) arrayList.get(i17);
                            if (i17 > 0) {
                                FrameLayout frameLayout = new FrameLayout(photoViewer.B);
                                frameLayout.setBackgroundColor(bVar.B0(org.telegram.ui.ActionBar.k6.d7));
                                i10 = -1;
                                LinearLayout.LayoutParams n10 = k7.c6.n(-1, 1);
                                n10.height = 1;
                                J.r(frameLayout, n10);
                            } else {
                                i10 = -1;
                            }
                            J.r(view2, k7.c6.n(i10, -2));
                        }
                        G.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new lh.y2(G, J, 8), false);
                        if (!UserConfig.getInstance(i14).isPremium()) {
                            G.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable() { // from class: org.telegram.ui.sq0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i152 = i12;
                                    oh.b bVar2 = bVar;
                                    int i162 = i14;
                                    PhotoViewer photoViewer2 = photoViewer;
                                    switch (i152) {
                                        case 0:
                                            Drawable[] drawableArr3 = PhotoViewer.Q8;
                                            if (!UserConfig.getInstance(i162).isPremium()) {
                                                new fg.n1(photoViewer2.j4, 3, true).show();
                                                break;
                                            } else {
                                                new org.telegram.ui.Components.qc(photoViewer2.b0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                MessagesController.getInstance(i162).disableAds(true);
                                                org.telegram.ui.ActionBar.p2 p2Var = photoViewer2.j4;
                                                if (p2Var instanceof xn) {
                                                    xn xnVar = (xn) p2Var;
                                                    xnVar.Fa(photoViewer2.Q4);
                                                    xnVar.Ha(photoViewer2.Q4);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            Drawable[] drawableArr4 = PhotoViewer.Q8;
                                            if (!UserConfig.getInstance(i162).isPremium()) {
                                                new fg.n1(photoViewer2.j4, 3, true).show();
                                                break;
                                            } else {
                                                new org.telegram.ui.Components.qc(photoViewer2.b0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                MessagesController.getInstance(i162).disableAds(true);
                                                org.telegram.ui.ActionBar.p2 p2Var2 = photoViewer2.j4;
                                                if (p2Var2 instanceof xn) {
                                                    xn xnVar2 = (xn) p2Var2;
                                                    xnVar2.Fa(photoViewer2.Q4);
                                                    xnVar2.Ha(photoViewer2.Q4);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, false);
                        }
                        if (photoViewer.Q4.sponsoredCanReport) {
                        }
                        if (G.x() <= 0) {
                        }
                    }
                }
                break;
            case 4:
                MessageObject messageObject4 = photoViewer.Q4;
                if (messageObject4 != null && messageObject4.hasVideoQualities()) {
                    sr srVar = photoViewer.G0;
                    MessageObject messageObject5 = photoViewer.Q4;
                    LinearLayout linearLayout = srVar.b;
                    if (messageObject5 != null && (message = messageObject5.messageOwner) != null && message.media != null && messageObject5.hasVideoQualities()) {
                        int i18 = messageObject5.currentAccount;
                        TLRPC.MessageMedia messageMedia = messageObject5.messageOwner.media;
                        ArrayList s6 = org.telegram.ui.Components.k71.s(i18, messageMedia.document, messageMedia.alt_documents, 0, true);
                        linearLayout.removeAllViews();
                        int i19 = 0;
                        while (i19 < s6.size()) {
                            org.telegram.ui.Components.g71 g71Var = (org.telegram.ui.Components.g71) s6.get(i19);
                            org.telegram.ui.Components.i71 a2 = g71Var.a();
                            StringBuilder sb = new StringBuilder();
                            int i20 = R.string.QualitySaveIn;
                            Object[] objArr = new Object[i13];
                            objArr[0] = Integer.valueOf(g71Var.b());
                            sb.append(LocaleController.formatString(i20, objArr));
                            sb.append(g71Var.a ? " (" + LocaleController.getString(R.string.QualitySource) + ")" : "");
                            String sb2 = sb.toString();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (a2.b()) {
                                spannableStringBuilder.append(AndroidUtilities.formatFileSize(a2.g.size));
                                spannableStringBuilder.append(LocaleController.getString(R.string.QualityCached));
                            } else {
                                SpannableString spannableString = new SpannableString("s ");
                                org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.msg_mini_arrow_mediabold, 0);
                                oqVar.rotate(90.0f);
                                oqVar.translate(f11, AndroidUtilities.dp(1.0f));
                                oqVar.spaceScaleX = 0.85f;
                                spannableString.setSpan(oqVar, 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) spannableString);
                                spannableStringBuilder.append(AndroidUtilities.formatFileSize(a2.g.size));
                            }
                            org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, linearLayout, 0, sb2, false, null);
                            c3.setSubtext(spannableStringBuilder);
                            c3.c(-328966, -328966);
                            c3.b.setPadding(0, 0, 0, 0);
                            c3.setOnClickListener(new b0(srVar, messageObject5, g71Var, 9));
                            c3.setSelectorColor(268435455);
                            i19++;
                            f11 = 0.0f;
                            i13 = 1;
                        }
                        photoViewer.q0.b();
                        break;
                    }
                }
                fg.k1 k1Var = photoViewer.C;
                if (k1Var != null && k1Var.getActionBarMenuOnItemClick() != null) {
                    photoViewer.C.getActionBarMenuOnItemClick().b(2);
                    photoViewer.l0.M(null, null);
                    break;
                }
                break;
            case 5:
                Activity activity = photoViewer.y;
                if (activity != null) {
                    photoViewer.W3 = false;
                    photoViewer.V3 = 1;
                    if (photoViewer.U3 == -10) {
                        photoViewer.U3 = activity.getRequestedOrientation();
                    }
                    if (((WindowManager) photoViewer.y.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                        photoViewer.y.setRequestedOrientation(8);
                    } else {
                        photoViewer.y.setRequestedOrientation(0);
                    }
                    photoViewer.j3(false, false);
                    break;
                }
                break;
            case 6:
                Activity activity2 = photoViewer.y;
                if (activity2 != null) {
                    photoViewer.W3 = false;
                    photoViewer.V3 = 2;
                    if (photoViewer.U3 == -10) {
                        photoViewer.U3 = activity2.getRequestedOrientation();
                    }
                    photoViewer.y.setRequestedOrientation(1);
                    break;
                }
                break;
            default:
                MessageObject messageObject6 = photoViewer.Q4;
                if (messageObject6 != null && messageObject6.isSponsored()) {
                    org.telegram.ui.ActionBar.p2 p2Var = photoViewer.j4;
                    if (p2Var instanceof xn) {
                        ((xn) p2Var).J9(photoViewer.Q4, false, true);
                    }
                    photoViewer.G0(true, false);
                    String str3 = photoViewer.Q4.sponsoredUrl;
                    if (str3 != null) {
                        Context context = LaunchActivity.D1;
                        if (context == null) {
                            context = photoViewer.B;
                        }
                        af.g.r(context, Uri.parse(str3), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.Q).sponsoredLinksInappAllow, false);
                        break;
                    }
                }
                break;
        }
    }
}
