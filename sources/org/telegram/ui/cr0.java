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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ cr0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x023d, code lost:
    
        if (r6.startsWith("https://" + org.telegram.messenger.MessagesController.getInstance(r7.T).linkPrefix) == false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x049b  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        hu0 hu0Var;
        float f7;
        int i10;
        TLRPC.Message message;
        int i11 = this.a;
        float f10 = 0.0f;
        final PhotoViewer photoViewer = this.b;
        final int i12 = 0;
        int i13 = 1;
        switch (i11) {
            case 0:
                if (!photoViewer.e2 && !photoViewer.J1()) {
                    photoViewer.O2();
                    break;
                }
                break;
            case 1:
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer.J1() && (hu0Var = photoViewer.d) != null && hu0Var.c() != null && !photoViewer.d.c().isEmpty()) {
                    photoViewer.r3(!photoViewer.K, true);
                    break;
                }
                break;
            case 2:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.W1(true);
                photoViewer.C0(0, true);
                break;
            case 3:
                MessageObject messageObject = photoViewer.T4;
                if (messageObject == null || !messageObject.isSponsored()) {
                    if (photoViewer.F.u0.a()) {
                        photoViewer.o0.M(null, null);
                        break;
                    }
                } else {
                    MessageObject messageObject2 = photoViewer.T4;
                    if (messageObject2 != null && messageObject2.isSponsored() && photoViewer.o0.getAlpha() > 0.5f) {
                        final int i14 = photoViewer.T4.currentAccount;
                        final ci.b bVar = new ci.b();
                        org.telegram.ui.Components.i80 G = org.telegram.ui.Components.i80.G(photoViewer.e0, bVar, photoViewer.o0, true);
                        G.a0(0.0f, -AndroidUtilities.dp(46.0f));
                        int i15 = 5;
                        G.V(5);
                        MessageObject messageObject3 = photoViewer.T4;
                        if (messageObject3.sponsoredInfo == null && messageObject3.sponsoredAdditionalInfo == null) {
                            String str = messageObject3.sponsoredUrl;
                            if (str != null) {
                                break;
                            }
                            if (!UserConfig.getInstance(i14).isPremium() && !MessagesController.getInstance(photoViewer.T).premiumFeaturesBlocked() && !photoViewer.T4.sponsoredCanReport) {
                                G.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable() { // from class: org.telegram.ui.uq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i16 = i12;
                                        ci.b bVar2 = bVar;
                                        int i17 = i14;
                                        PhotoViewer photoViewer2 = photoViewer;
                                        switch (i16) {
                                            case 0:
                                                Drawable[] drawableArr3 = PhotoViewer.U8;
                                                if (!UserConfig.getInstance(i17).isPremium()) {
                                                    new sg.y0(photoViewer2.m4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.xc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                    MessagesController.getInstance(i17).disableAds(true);
                                                    org.telegram.ui.ActionBar.n2 n2Var = photoViewer2.m4;
                                                    if (n2Var instanceof qn) {
                                                        qn qnVar = (qn) n2Var;
                                                        qnVar.Ja(photoViewer2.T4);
                                                        qnVar.La(photoViewer2.T4);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                Drawable[] drawableArr4 = PhotoViewer.U8;
                                                if (!UserConfig.getInstance(i17).isPremium()) {
                                                    new sg.y0(photoViewer2.m4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.xc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                    MessagesController.getInstance(i17).disableAds(true);
                                                    org.telegram.ui.ActionBar.n2 n2Var2 = photoViewer2.m4;
                                                    if (n2Var2 instanceof qn) {
                                                        qn qnVar2 = (qn) n2Var2;
                                                        qnVar2.Ja(photoViewer2.T4);
                                                        qnVar2.La(photoViewer2.T4);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                }, false);
                            }
                            if (photoViewer.T4.sponsoredCanReport) {
                                G.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new xg0(18, photoViewer, bVar), false);
                                if ((photoViewer.m4 instanceof qn) && !MessagesController.getInstance(i14).premiumFeaturesBlocked()) {
                                    G.k();
                                    final int i16 = 1;
                                    G.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new Runnable() { // from class: org.telegram.ui.uq0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i162 = i16;
                                            ci.b bVar2 = bVar;
                                            int i17 = i14;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i162) {
                                                case 0:
                                                    Drawable[] drawableArr3 = PhotoViewer.U8;
                                                    if (!UserConfig.getInstance(i17).isPremium()) {
                                                        new sg.y0(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.xc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                        MessagesController.getInstance(i17).disableAds(true);
                                                        org.telegram.ui.ActionBar.n2 n2Var = photoViewer2.m4;
                                                        if (n2Var instanceof qn) {
                                                            qn qnVar = (qn) n2Var;
                                                            qnVar.Ja(photoViewer2.T4);
                                                            qnVar.La(photoViewer2.T4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr4 = PhotoViewer.U8;
                                                    if (!UserConfig.getInstance(i17).isPremium()) {
                                                        new sg.y0(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.xc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                        MessagesController.getInstance(i17).disableAds(true);
                                                        org.telegram.ui.ActionBar.n2 n2Var2 = photoViewer2.m4;
                                                        if (n2Var2 instanceof qn) {
                                                            qn qnVar2 = (qn) n2Var2;
                                                            qnVar2.Ja(photoViewer2.T4);
                                                            qnVar2.La(photoViewer2.T4);
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
                        org.telegram.ui.Components.i80 J = G.J();
                        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, photoViewer.E, bVar, true, false);
                        e1Var.setItemHeight(44);
                        e1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                        e1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                        e1Var.setOnClickListener(new xg(G, 1));
                        J.r(e1Var, w7.z5.n(-1, -2));
                        J.r(new org.telegram.ui.ActionBar.j1(photoViewer.E, bVar), w7.z5.n(-1, 8));
                        ArrayList arrayList = new ArrayList();
                        String str2 = photoViewer.T4.sponsoredUrl;
                        if (str2 != null) {
                            f7 = 300.0f;
                            if (!TextUtils.equals(AndroidUtilities.getHostAuthority(str2), MessagesController.getInstance(photoViewer.T).linkPrefix)) {
                                TextView textView = new TextView(photoViewer.E);
                                textView.setTextColor(bVar.w(org.telegram.ui.ActionBar.h6.gc));
                                textView.setTextSize(1, 14.0f);
                                textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                                textView.setMaxWidth(AndroidUtilities.dp(300.0f));
                                Uri parse = Uri.parse(photoViewer.T4.sponsoredUrl);
                                textView.setText(pf.d.u(parse, null, null, pf.d.a(parse.getHost()), null));
                                textView.setBackground(org.telegram.ui.ActionBar.h6.Z(photoViewer.A1(org.telegram.ui.ActionBar.h6.I5), 0, photoViewer.T4.sponsoredAdditionalInfo == null ? 6 : 0));
                                textView.setOnClickListener(new cf0(i15, photoViewer, G));
                                textView.setOnLongClickListener(new ci.m2(4, photoViewer, bVar));
                                arrayList.add(textView);
                            }
                        } else {
                            f7 = 300.0f;
                        }
                        if (photoViewer.T4.sponsoredInfo != null) {
                            TextView textView2 = new TextView(photoViewer.E);
                            textView2.setTextColor(bVar.w(org.telegram.ui.ActionBar.h6.E8));
                            textView2.setTextSize(1, 14.0f);
                            textView2.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                            textView2.setMaxWidth(AndroidUtilities.dp(f7));
                            textView2.setText(photoViewer.T4.sponsoredInfo);
                            textView2.setBackground(org.telegram.ui.ActionBar.h6.Z(photoViewer.A1(org.telegram.ui.ActionBar.h6.I5), 0, photoViewer.T4.sponsoredAdditionalInfo == null ? 6 : 0));
                            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.tq0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i12) {
                                        case 0:
                                            PhotoViewer photoViewer2 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer2.T4.sponsoredInfo)) {
                                                org.telegram.messenger.mk.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(photoViewer2.E), bVar));
                                                break;
                                            }
                                            break;
                                        default:
                                            PhotoViewer photoViewer3 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer3.T4.sponsoredAdditionalInfo)) {
                                                org.telegram.messenger.mk.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(photoViewer3.E), bVar));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            arrayList.add(textView2);
                        }
                        if (photoViewer.T4.sponsoredAdditionalInfo != null) {
                            TextView textView3 = new TextView(photoViewer.E);
                            textView3.setTextColor(bVar.w(org.telegram.ui.ActionBar.h6.E8));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                            textView3.setMaxWidth(AndroidUtilities.dp(f7));
                            textView3.setText(photoViewer.T4.sponsoredAdditionalInfo);
                            textView3.setBackground(org.telegram.ui.ActionBar.h6.Z(photoViewer.A1(org.telegram.ui.ActionBar.h6.I5), 0, 6));
                            final int i17 = 1;
                            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.tq0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i17) {
                                        case 0:
                                            PhotoViewer photoViewer2 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer2.T4.sponsoredInfo)) {
                                                org.telegram.messenger.mk.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(photoViewer2.E), bVar));
                                                break;
                                            }
                                            break;
                                        default:
                                            PhotoViewer photoViewer3 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer3.T4.sponsoredAdditionalInfo)) {
                                                org.telegram.messenger.mk.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(photoViewer3.E), bVar));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            arrayList.add(textView3);
                        }
                        for (int i18 = 0; i18 < arrayList.size(); i18++) {
                            View view2 = (View) arrayList.get(i18);
                            if (i18 > 0) {
                                FrameLayout frameLayout = new FrameLayout(photoViewer.E);
                                frameLayout.setBackgroundColor(bVar.w(org.telegram.ui.ActionBar.h6.d7));
                                i10 = -1;
                                LinearLayout.LayoutParams n10 = w7.z5.n(-1, 1);
                                n10.height = 1;
                                J.r(frameLayout, n10);
                            } else {
                                i10 = -1;
                            }
                            J.r(view2, w7.z5.n(i10, -2));
                        }
                        G.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new gi.g2(G, J, 10), false);
                        if (!UserConfig.getInstance(i14).isPremium()) {
                            G.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable() { // from class: org.telegram.ui.uq0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i162 = i12;
                                    ci.b bVar2 = bVar;
                                    int i172 = i14;
                                    PhotoViewer photoViewer2 = photoViewer;
                                    switch (i162) {
                                        case 0:
                                            Drawable[] drawableArr3 = PhotoViewer.U8;
                                            if (!UserConfig.getInstance(i172).isPremium()) {
                                                new sg.y0(photoViewer2.m4, 3, true).show();
                                                break;
                                            } else {
                                                new org.telegram.ui.Components.xc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                MessagesController.getInstance(i172).disableAds(true);
                                                org.telegram.ui.ActionBar.n2 n2Var = photoViewer2.m4;
                                                if (n2Var instanceof qn) {
                                                    qn qnVar = (qn) n2Var;
                                                    qnVar.Ja(photoViewer2.T4);
                                                    qnVar.La(photoViewer2.T4);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            Drawable[] drawableArr4 = PhotoViewer.U8;
                                            if (!UserConfig.getInstance(i172).isPremium()) {
                                                new sg.y0(photoViewer2.m4, 3, true).show();
                                                break;
                                            } else {
                                                new org.telegram.ui.Components.xc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                MessagesController.getInstance(i172).disableAds(true);
                                                org.telegram.ui.ActionBar.n2 n2Var2 = photoViewer2.m4;
                                                if (n2Var2 instanceof qn) {
                                                    qn qnVar2 = (qn) n2Var2;
                                                    qnVar2.Ja(photoViewer2.T4);
                                                    qnVar2.La(photoViewer2.T4);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, false);
                        }
                        if (photoViewer.T4.sponsoredCanReport) {
                        }
                        if (G.x() <= 0) {
                        }
                    }
                }
                break;
            case 4:
                MessageObject messageObject4 = photoViewer.T4;
                if (messageObject4 != null && messageObject4.hasVideoQualities()) {
                    jr jrVar = photoViewer.J0;
                    MessageObject messageObject5 = photoViewer.T4;
                    LinearLayout linearLayout = jrVar.b;
                    if (messageObject5 != null && (message = messageObject5.messageOwner) != null && message.media != null && messageObject5.hasVideoQualities()) {
                        int i19 = messageObject5.currentAccount;
                        TLRPC.MessageMedia messageMedia = messageObject5.messageOwner.media;
                        ArrayList s10 = org.telegram.ui.Components.c81.s(i19, messageMedia.document, messageMedia.alt_documents, 0, true);
                        linearLayout.removeAllViews();
                        int i20 = 0;
                        while (i20 < s10.size()) {
                            org.telegram.ui.Components.y71 y71Var = (org.telegram.ui.Components.y71) s10.get(i20);
                            org.telegram.ui.Components.a81 a2 = y71Var.a();
                            StringBuilder sb2 = new StringBuilder();
                            int i21 = R.string.QualitySaveIn;
                            Object[] objArr = new Object[i13];
                            objArr[0] = Integer.valueOf(y71Var.b());
                            sb2.append(LocaleController.formatString(i21, objArr));
                            sb2.append(y71Var.a ? " (" + LocaleController.getString(R.string.QualitySource) + ")" : "");
                            String sb3 = sb2.toString();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (a2.b()) {
                                spannableStringBuilder.append(AndroidUtilities.formatFileSize(a2.g.size));
                                spannableStringBuilder.append(LocaleController.getString(R.string.QualityCached));
                            } else {
                                SpannableString spannableString = new SpannableString("s ");
                                org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(R.drawable.msg_mini_arrow_mediabold, 0);
                                yqVar.rotate(90.0f);
                                yqVar.translate(f10, AndroidUtilities.dp(1.0f));
                                yqVar.spaceScaleX = 0.85f;
                                spannableString.setSpan(yqVar, 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) spannableString);
                                spannableStringBuilder.append(AndroidUtilities.formatFileSize(a2.g.size));
                            }
                            org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, linearLayout, 0, sb3, false, null);
                            c10.setSubtext(spannableStringBuilder);
                            c10.c(-328966, -328966);
                            c10.b.setPadding(0, 0, 0, 0);
                            c10.setOnClickListener(new a0(jrVar, messageObject5, y71Var, 9));
                            c10.setSelectorColor(268435455);
                            i20++;
                            f10 = 0.0f;
                            i13 = 1;
                        }
                        photoViewer.t0.b();
                        break;
                    }
                }
                org.telegram.ui.Components.z7 z7Var = photoViewer.F;
                if (z7Var != null && z7Var.getActionBarMenuOnItemClick() != null) {
                    photoViewer.F.getActionBarMenuOnItemClick().b(2);
                    photoViewer.o0.M(null, null);
                    break;
                }
                break;
            case 5:
                Activity activity = photoViewer.y;
                if (activity != null) {
                    photoViewer.Z3 = false;
                    photoViewer.Y3 = 1;
                    if (photoViewer.X3 == -10) {
                        photoViewer.X3 = activity.getRequestedOrientation();
                    }
                    if (((WindowManager) photoViewer.y.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                        photoViewer.y.setRequestedOrientation(8);
                    } else {
                        photoViewer.y.setRequestedOrientation(0);
                    }
                    photoViewer.l3(false, false);
                    break;
                }
                break;
            case 6:
                Activity activity2 = photoViewer.y;
                if (activity2 != null) {
                    photoViewer.Z3 = false;
                    photoViewer.Y3 = 2;
                    if (photoViewer.X3 == -10) {
                        photoViewer.X3 = activity2.getRequestedOrientation();
                    }
                    photoViewer.y.setRequestedOrientation(1);
                    break;
                }
                break;
            default:
                MessageObject messageObject6 = photoViewer.T4;
                if (messageObject6 != null && messageObject6.isSponsored()) {
                    org.telegram.ui.ActionBar.n2 n2Var = photoViewer.m4;
                    if (n2Var instanceof qn) {
                        ((qn) n2Var).O9(photoViewer.T4, false, true);
                    }
                    photoViewer.H0(true, false);
                    String str3 = photoViewer.T4.sponsoredUrl;
                    if (str3 != null) {
                        Context context = LaunchActivity.H1;
                        if (context == null) {
                            context = photoViewer.E;
                        }
                        pf.d.q(context, Uri.parse(str3), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                        break;
                    }
                }
                break;
        }
    }
}
