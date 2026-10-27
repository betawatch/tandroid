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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ lr0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x023d, code lost:
    
        if (r4.startsWith("https://" + org.telegram.messenger.MessagesController.getInstance(r7.T).linkPrefix) == false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04a0  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        qu0 qu0Var;
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
                if (!photoViewer.e2 && !photoViewer.K1()) {
                    photoViewer.P2();
                    break;
                }
                break;
            case 1:
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer.K1() && (qu0Var = photoViewer.d) != null && qu0Var.c() != null && !photoViewer.d.c().isEmpty()) {
                    photoViewer.s3(!photoViewer.K, true);
                    break;
                }
                break;
            case 2:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.X1(true);
                photoViewer.C0(0, true);
                break;
            case 3:
                MessageObject messageObject = photoViewer.T4;
                if (messageObject == null || !messageObject.isSponsored()) {
                    if (photoViewer.F.u0.a()) {
                        photoViewer.o0.U(null, null);
                        break;
                    }
                } else {
                    MessageObject messageObject2 = photoViewer.T4;
                    if (messageObject2 != null && messageObject2.isSponsored() && photoViewer.o0.getAlpha() > 0.5f) {
                        final int i14 = photoViewer.T4.currentAccount;
                        final di.b bVar = new di.b();
                        org.telegram.ui.Components.l80 G = org.telegram.ui.Components.l80.G(photoViewer.e0, bVar, photoViewer.o0, true);
                        G.a0(0.0f, -AndroidUtilities.dp(46.0f));
                        G.V(5);
                        MessageObject messageObject3 = photoViewer.T4;
                        if (messageObject3.sponsoredInfo == null && messageObject3.sponsoredAdditionalInfo == null) {
                            String str = messageObject3.sponsoredUrl;
                            if (str != null) {
                                break;
                            }
                            if (!UserConfig.getInstance(i14).isPremium() && !MessagesController.getInstance(photoViewer.T).premiumFeaturesBlocked() && !photoViewer.T4.sponsoredCanReport) {
                                G.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable() { // from class: org.telegram.ui.dr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i15 = i12;
                                        di.b bVar2 = bVar;
                                        int i16 = i14;
                                        PhotoViewer photoViewer2 = photoViewer;
                                        switch (i15) {
                                            case 0:
                                                Drawable[] drawableArr3 = PhotoViewer.U8;
                                                if (!UserConfig.getInstance(i16).isPremium()) {
                                                    new tg.y0(photoViewer2.m4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.wc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                    MessagesController.getInstance(i16).disableAds(true);
                                                    org.telegram.ui.ActionBar.r2 r2Var = photoViewer2.m4;
                                                    if (r2Var instanceof wn) {
                                                        wn wnVar = (wn) r2Var;
                                                        wnVar.Ra(photoViewer2.T4);
                                                        wnVar.Ta(photoViewer2.T4);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                Drawable[] drawableArr4 = PhotoViewer.U8;
                                                if (!UserConfig.getInstance(i16).isPremium()) {
                                                    new tg.y0(photoViewer2.m4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.wc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                    MessagesController.getInstance(i16).disableAds(true);
                                                    org.telegram.ui.ActionBar.r2 r2Var2 = photoViewer2.m4;
                                                    if (r2Var2 instanceof wn) {
                                                        wn wnVar2 = (wn) r2Var2;
                                                        wnVar2.Ra(photoViewer2.T4);
                                                        wnVar2.Ta(photoViewer2.T4);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                }, false);
                            }
                            if (photoViewer.T4.sponsoredCanReport) {
                                G.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new am0(8, photoViewer, bVar), false);
                                if ((photoViewer.m4 instanceof wn) && !MessagesController.getInstance(i14).premiumFeaturesBlocked()) {
                                    G.k();
                                    final int i15 = 1;
                                    G.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new Runnable() { // from class: org.telegram.ui.dr0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i152 = i15;
                                            di.b bVar2 = bVar;
                                            int i16 = i14;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i152) {
                                                case 0:
                                                    Drawable[] drawableArr3 = PhotoViewer.U8;
                                                    if (!UserConfig.getInstance(i16).isPremium()) {
                                                        new tg.y0(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.wc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                        MessagesController.getInstance(i16).disableAds(true);
                                                        org.telegram.ui.ActionBar.r2 r2Var = photoViewer2.m4;
                                                        if (r2Var instanceof wn) {
                                                            wn wnVar = (wn) r2Var;
                                                            wnVar.Ra(photoViewer2.T4);
                                                            wnVar.Ta(photoViewer2.T4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr4 = PhotoViewer.U8;
                                                    if (!UserConfig.getInstance(i16).isPremium()) {
                                                        new tg.y0(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.wc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                        MessagesController.getInstance(i16).disableAds(true);
                                                        org.telegram.ui.ActionBar.r2 r2Var2 = photoViewer2.m4;
                                                        if (r2Var2 instanceof wn) {
                                                            wn wnVar2 = (wn) r2Var2;
                                                            wnVar2.Ra(photoViewer2.T4);
                                                            wnVar2.Ta(photoViewer2.T4);
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
                        org.telegram.ui.Components.l80 J = G.J();
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, photoViewer.E, bVar, true, false);
                        g1Var.setItemHeight(44);
                        g1Var.j(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                        g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                        g1Var.setOnClickListener(new dh(G, 1));
                        J.r(g1Var, org.telegram.ui.Components.kb1.r(-1, -2));
                        J.r(new org.telegram.ui.ActionBar.l1(photoViewer.E, bVar), org.telegram.ui.Components.kb1.r(-1, 8));
                        ArrayList arrayList = new ArrayList();
                        String str2 = photoViewer.T4.sponsoredUrl;
                        int i16 = 6;
                        if (str2 != null) {
                            f7 = 300.0f;
                            if (!TextUtils.equals(AndroidUtilities.getHostAuthority(str2), MessagesController.getInstance(photoViewer.T).linkPrefix)) {
                                TextView textView = new TextView(photoViewer.E);
                                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.gc, bVar);
                                textView.setTextSize(1, 14.0f);
                                textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                                textView.setMaxWidth(AndroidUtilities.dp(300.0f));
                                Uri parse = Uri.parse(photoViewer.T4.sponsoredUrl);
                                textView.setText(qf.d.u(parse, null, null, qf.d.a(parse.getHost()), null));
                                int i17 = org.telegram.ui.ActionBar.y6.I5;
                                org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(photoViewer.B1(i17), 0, photoViewer.T4.sponsoredAdditionalInfo == null ? 6 : 0);
                                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i17);
                                textView.setBackground(Z);
                                org.telegram.ui.ActionBar.f7.k(textView, Z, null, N, bVar);
                                textView.setOnClickListener(new zd0(i16, photoViewer, G));
                                textView.setOnLongClickListener(new di.l2(4, photoViewer, bVar));
                                arrayList.add(textView);
                            }
                        } else {
                            f7 = 300.0f;
                        }
                        if (photoViewer.T4.sponsoredInfo != null) {
                            TextView textView2 = new TextView(photoViewer.E);
                            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.E8, bVar);
                            textView2.setTextSize(1, 14.0f);
                            textView2.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                            textView2.setMaxWidth(AndroidUtilities.dp(f7));
                            textView2.setText(photoViewer.T4.sponsoredInfo);
                            int i18 = org.telegram.ui.ActionBar.y6.I5;
                            org.telegram.ui.Cells.y Z2 = org.telegram.ui.ActionBar.y6.Z(photoViewer.B1(i18), 0, photoViewer.T4.sponsoredAdditionalInfo == null ? 6 : 0);
                            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i18);
                            textView2.setBackground(Z2);
                            org.telegram.ui.ActionBar.f7.k(textView2, Z2, null, N2, bVar);
                            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.cr0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i12) {
                                        case 0:
                                            PhotoViewer photoViewer2 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer2.T4.sponsoredInfo)) {
                                                org.telegram.messenger.wh.m(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(photoViewer2.E), bVar));
                                                break;
                                            }
                                            break;
                                        default:
                                            PhotoViewer photoViewer3 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer3.T4.sponsoredAdditionalInfo)) {
                                                org.telegram.messenger.wh.m(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(photoViewer3.E), bVar));
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
                            org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.E8, bVar);
                            textView3.setTextSize(1, 14.0f);
                            textView3.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                            textView3.setMaxWidth(AndroidUtilities.dp(f7));
                            textView3.setText(photoViewer.T4.sponsoredAdditionalInfo);
                            int i19 = org.telegram.ui.ActionBar.y6.I5;
                            org.telegram.ui.Cells.y Z3 = org.telegram.ui.ActionBar.y6.Z(photoViewer.B1(i19), 0, 6);
                            org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i19);
                            textView3.setBackground(Z3);
                            org.telegram.ui.ActionBar.f7.k(textView3, Z3, null, N3, bVar);
                            final int i20 = 1;
                            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.cr0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i20) {
                                        case 0:
                                            PhotoViewer photoViewer2 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer2.T4.sponsoredInfo)) {
                                                org.telegram.messenger.wh.m(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(photoViewer2.E), bVar));
                                                break;
                                            }
                                            break;
                                        default:
                                            PhotoViewer photoViewer3 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer3.T4.sponsoredAdditionalInfo)) {
                                                org.telegram.messenger.wh.m(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(photoViewer3.E), bVar));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            arrayList.add(textView3);
                        }
                        for (int i21 = 0; i21 < arrayList.size(); i21++) {
                            View view2 = (View) arrayList.get(i21);
                            if (i21 > 0) {
                                FrameLayout frameLayout = new FrameLayout(photoViewer.E);
                                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d7, frameLayout, bVar);
                                i10 = -1;
                                LinearLayout.LayoutParams r6 = org.telegram.ui.Components.kb1.r(-1, 1);
                                r6.height = 1;
                                J.r(frameLayout, r6);
                            } else {
                                i10 = -1;
                            }
                            J.r(view2, org.telegram.ui.Components.kb1.r(i10, -2));
                        }
                        G.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new hi.o2(G, J, 10), false);
                        if (!UserConfig.getInstance(i14).isPremium()) {
                            G.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable() { // from class: org.telegram.ui.dr0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i152 = i12;
                                    di.b bVar2 = bVar;
                                    int i162 = i14;
                                    PhotoViewer photoViewer2 = photoViewer;
                                    switch (i152) {
                                        case 0:
                                            Drawable[] drawableArr3 = PhotoViewer.U8;
                                            if (!UserConfig.getInstance(i162).isPremium()) {
                                                new tg.y0(photoViewer2.m4, 3, true).show();
                                                break;
                                            } else {
                                                new org.telegram.ui.Components.wc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                MessagesController.getInstance(i162).disableAds(true);
                                                org.telegram.ui.ActionBar.r2 r2Var = photoViewer2.m4;
                                                if (r2Var instanceof wn) {
                                                    wn wnVar = (wn) r2Var;
                                                    wnVar.Ra(photoViewer2.T4);
                                                    wnVar.Ta(photoViewer2.T4);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            Drawable[] drawableArr4 = PhotoViewer.U8;
                                            if (!UserConfig.getInstance(i162).isPremium()) {
                                                new tg.y0(photoViewer2.m4, 3, true).show();
                                                break;
                                            } else {
                                                new org.telegram.ui.Components.wc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                MessagesController.getInstance(i162).disableAds(true);
                                                org.telegram.ui.ActionBar.r2 r2Var2 = photoViewer2.m4;
                                                if (r2Var2 instanceof wn) {
                                                    wn wnVar2 = (wn) r2Var2;
                                                    wnVar2.Ra(photoViewer2.T4);
                                                    wnVar2.Ta(photoViewer2.T4);
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
                    qr qrVar = photoViewer.J0;
                    MessageObject messageObject5 = photoViewer.T4;
                    LinearLayout linearLayout = qrVar.b;
                    if (messageObject5 != null && (message = messageObject5.messageOwner) != null && message.media != null && messageObject5.hasVideoQualities()) {
                        int i22 = messageObject5.currentAccount;
                        TLRPC.MessageMedia messageMedia = messageObject5.messageOwner.media;
                        ArrayList s10 = org.telegram.ui.Components.t81.s(i22, messageMedia.document, messageMedia.alt_documents, 0, true);
                        linearLayout.removeAllViews();
                        int i23 = 0;
                        while (i23 < s10.size()) {
                            org.telegram.ui.Components.p81 p81Var = (org.telegram.ui.Components.p81) s10.get(i23);
                            org.telegram.ui.Components.r81 a2 = p81Var.a();
                            StringBuilder sb2 = new StringBuilder();
                            int i24 = R.string.QualitySaveIn;
                            Object[] objArr = new Object[i13];
                            objArr[0] = Integer.valueOf(p81Var.b());
                            sb2.append(LocaleController.formatString(i24, objArr));
                            sb2.append(p81Var.a ? " (" + LocaleController.getString(R.string.QualitySource) + ")" : "");
                            String sb3 = sb2.toString();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (a2.b()) {
                                spannableStringBuilder.append(AndroidUtilities.formatFileSize(a2.g.size));
                                spannableStringBuilder.append(LocaleController.getString(R.string.QualityCached));
                            } else {
                                SpannableString spannableString = new SpannableString("s ");
                                org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(R.drawable.msg_mini_arrow_mediabold, 0);
                                zqVar.rotate(90.0f);
                                zqVar.translate(f10, AndroidUtilities.dp(1.0f));
                                zqVar.spaceScaleX = 0.85f;
                                spannableString.setSpan(zqVar, 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) spannableString);
                                spannableStringBuilder.append(AndroidUtilities.formatFileSize(a2.g.size));
                            }
                            org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, linearLayout, 0, sb3, false, null);
                            c10.setSubtext(spannableStringBuilder);
                            c10.d(-328966, -328966);
                            c10.b.setPadding(0, 0, 0, 0);
                            c10.setOnClickListener(new z(qrVar, messageObject5, p81Var, 9));
                            c10.setSelectorColor(268435455);
                            i23++;
                            f10 = 0.0f;
                            i13 = 1;
                        }
                        photoViewer.t0.b();
                        break;
                    }
                }
                org.telegram.ui.Components.b8 b8Var = photoViewer.F;
                if (b8Var != null && b8Var.getActionBarMenuOnItemClick() != null) {
                    photoViewer.F.getActionBarMenuOnItemClick().b(2);
                    photoViewer.o0.U(null, null);
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
                    photoViewer.m3(false, false);
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
                    org.telegram.ui.ActionBar.r2 r2Var = photoViewer.m4;
                    if (r2Var instanceof wn) {
                        ((wn) r2Var).W9(photoViewer.T4, false, true);
                    }
                    photoViewer.H0(true, false);
                    String str3 = photoViewer.T4.sponsoredUrl;
                    if (str3 != null) {
                        Context context = LaunchActivity.I1;
                        if (context == null) {
                            context = photoViewer.E;
                        }
                        qf.d.q(context, Uri.parse(str3), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                        break;
                    }
                }
                break;
        }
    }
}
