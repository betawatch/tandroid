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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class as0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ as0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x023d, code lost:
    
        if (r6.startsWith("https://" + org.telegram.messenger.MessagesController.getInstance(r7.T).linkPrefix) == false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x049c  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        iv0 iv0Var;
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
                if (!photoViewer.e2 && !photoViewer.I1()) {
                    photoViewer.M2();
                    break;
                }
                break;
            case 1:
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer.I1() && (iv0Var = photoViewer.d) != null && iv0Var.c() != null && !photoViewer.d.c().isEmpty()) {
                    photoViewer.p3(!photoViewer.K, true);
                    break;
                }
                break;
            case 2:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.U1(true);
                photoViewer.B0(0, true);
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
                        final bi.b bVar = new bi.b();
                        org.telegram.ui.Components.m80 G = org.telegram.ui.Components.m80.G(photoViewer.e0, bVar, photoViewer.o0, true);
                        G.a0(0.0f, -AndroidUtilities.dp(46.0f));
                        G.V(5);
                        MessageObject messageObject3 = photoViewer.T4;
                        if (messageObject3.sponsoredInfo == null && messageObject3.sponsoredAdditionalInfo == null) {
                            String str = messageObject3.sponsoredUrl;
                            if (str != null) {
                                break;
                            }
                            if (!UserConfig.getInstance(i14).isPremium() && !MessagesController.getInstance(photoViewer.T).premiumFeaturesBlocked() && !photoViewer.T4.sponsoredCanReport) {
                                G.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable() { // from class: org.telegram.ui.sr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i15 = i12;
                                        bi.b bVar2 = bVar;
                                        int i16 = i14;
                                        PhotoViewer photoViewer2 = photoViewer;
                                        switch (i15) {
                                            case 0:
                                                Drawable[] drawableArr3 = PhotoViewer.U8;
                                                if (!UserConfig.getInstance(i16).isPremium()) {
                                                    new sg.y0(photoViewer2.m4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.zc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                    MessagesController.getInstance(i16).disableAds(true);
                                                    org.telegram.ui.ActionBar.m2 m2Var = photoViewer2.m4;
                                                    if (m2Var instanceof fo) {
                                                        fo foVar = (fo) m2Var;
                                                        foVar.Ja(photoViewer2.T4);
                                                        foVar.La(photoViewer2.T4);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                Drawable[] drawableArr4 = PhotoViewer.U8;
                                                if (!UserConfig.getInstance(i16).isPremium()) {
                                                    new sg.y0(photoViewer2.m4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.zc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                    MessagesController.getInstance(i16).disableAds(true);
                                                    org.telegram.ui.ActionBar.m2 m2Var2 = photoViewer2.m4;
                                                    if (m2Var2 instanceof fo) {
                                                        fo foVar2 = (fo) m2Var2;
                                                        foVar2.Ja(photoViewer2.T4);
                                                        foVar2.La(photoViewer2.T4);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                }, false);
                            }
                            if (photoViewer.T4.sponsoredCanReport) {
                                G.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new on0(5, photoViewer, bVar), false);
                                if ((photoViewer.m4 instanceof fo) && !MessagesController.getInstance(i14).premiumFeaturesBlocked()) {
                                    G.k();
                                    final int i15 = 1;
                                    G.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new Runnable() { // from class: org.telegram.ui.sr0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i152 = i15;
                                            bi.b bVar2 = bVar;
                                            int i16 = i14;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i152) {
                                                case 0:
                                                    Drawable[] drawableArr3 = PhotoViewer.U8;
                                                    if (!UserConfig.getInstance(i16).isPremium()) {
                                                        new sg.y0(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.zc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                        MessagesController.getInstance(i16).disableAds(true);
                                                        org.telegram.ui.ActionBar.m2 m2Var = photoViewer2.m4;
                                                        if (m2Var instanceof fo) {
                                                            fo foVar = (fo) m2Var;
                                                            foVar.Ja(photoViewer2.T4);
                                                            foVar.La(photoViewer2.T4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr4 = PhotoViewer.U8;
                                                    if (!UserConfig.getInstance(i16).isPremium()) {
                                                        new sg.y0(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.zc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                        MessagesController.getInstance(i16).disableAds(true);
                                                        org.telegram.ui.ActionBar.m2 m2Var2 = photoViewer2.m4;
                                                        if (m2Var2 instanceof fo) {
                                                            fo foVar2 = (fo) m2Var2;
                                                            foVar2.Ja(photoViewer2.T4);
                                                            foVar2.La(photoViewer2.T4);
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
                        org.telegram.ui.Components.m80 J = G.J();
                        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, photoViewer.E, bVar, true, false);
                        e1Var.setItemHeight(44);
                        e1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                        e1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                        e1Var.setOnClickListener(new lh(G, 1));
                        J.r(e1Var, w7.a6.n(-1, -2));
                        J.r(new org.telegram.ui.ActionBar.j1(photoViewer.E, bVar), w7.a6.n(-1, 8));
                        ArrayList arrayList = new ArrayList();
                        String str2 = photoViewer.T4.sponsoredUrl;
                        if (str2 != null) {
                            f7 = 300.0f;
                            if (!TextUtils.equals(AndroidUtilities.getHostAuthority(str2), MessagesController.getInstance(photoViewer.T).linkPrefix)) {
                                TextView textView = new TextView(photoViewer.E);
                                textView.setTextColor(bVar.F0(org.telegram.ui.ActionBar.g6.gc));
                                textView.setTextSize(1, 14.0f);
                                textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                                textView.setMaxWidth(AndroidUtilities.dp(300.0f));
                                Uri parse = Uri.parse(photoViewer.T4.sponsoredUrl);
                                textView.setText(pf.d.v(parse, null, null, pf.d.a(parse.getHost()), null));
                                textView.setBackground(org.telegram.ui.ActionBar.g6.Z(photoViewer.z1(org.telegram.ui.ActionBar.g6.I5), 0, photoViewer.T4.sponsoredAdditionalInfo == null ? 6 : 0));
                                textView.setOnClickListener(new xv(25, photoViewer, G));
                                textView.setOnLongClickListener(new bi.g3(4, photoViewer, bVar));
                                arrayList.add(textView);
                            }
                        } else {
                            f7 = 300.0f;
                        }
                        if (photoViewer.T4.sponsoredInfo != null) {
                            TextView textView2 = new TextView(photoViewer.E);
                            textView2.setTextColor(bVar.F0(org.telegram.ui.ActionBar.g6.E8));
                            textView2.setTextSize(1, 14.0f);
                            textView2.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                            textView2.setMaxWidth(AndroidUtilities.dp(f7));
                            textView2.setText(photoViewer.T4.sponsoredInfo);
                            textView2.setBackground(org.telegram.ui.ActionBar.g6.Z(photoViewer.z1(org.telegram.ui.ActionBar.g6.I5), 0, photoViewer.T4.sponsoredAdditionalInfo == null ? 6 : 0));
                            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.rr0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i12) {
                                        case 0:
                                            PhotoViewer photoViewer2 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer2.T4.sponsoredInfo)) {
                                                org.telegram.messenger.yh.o(R.string.TextCopied, new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(photoViewer2.E), bVar));
                                                break;
                                            }
                                            break;
                                        default:
                                            PhotoViewer photoViewer3 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer3.T4.sponsoredAdditionalInfo)) {
                                                org.telegram.messenger.yh.o(R.string.TextCopied, new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(photoViewer3.E), bVar));
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
                            textView3.setTextColor(bVar.F0(org.telegram.ui.ActionBar.g6.E8));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                            textView3.setMaxWidth(AndroidUtilities.dp(f7));
                            textView3.setText(photoViewer.T4.sponsoredAdditionalInfo);
                            textView3.setBackground(org.telegram.ui.ActionBar.g6.Z(photoViewer.z1(org.telegram.ui.ActionBar.g6.I5), 0, 6));
                            final int i16 = 1;
                            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.rr0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i16) {
                                        case 0:
                                            PhotoViewer photoViewer2 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer2.T4.sponsoredInfo)) {
                                                org.telegram.messenger.yh.o(R.string.TextCopied, new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(photoViewer2.E), bVar));
                                                break;
                                            }
                                            break;
                                        default:
                                            PhotoViewer photoViewer3 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer3.T4.sponsoredAdditionalInfo)) {
                                                org.telegram.messenger.yh.o(R.string.TextCopied, new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(photoViewer3.E), bVar));
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
                                FrameLayout frameLayout = new FrameLayout(photoViewer.E);
                                frameLayout.setBackgroundColor(bVar.F0(org.telegram.ui.ActionBar.g6.d7));
                                i10 = -1;
                                LinearLayout.LayoutParams n10 = w7.a6.n(-1, 1);
                                n10.height = 1;
                                J.r(frameLayout, n10);
                            } else {
                                i10 = -1;
                            }
                            J.r(view2, w7.a6.n(i10, -2));
                        }
                        G.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new fi.m2(G, J, 10), false);
                        if (!UserConfig.getInstance(i14).isPremium()) {
                            G.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable() { // from class: org.telegram.ui.sr0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i152 = i12;
                                    bi.b bVar2 = bVar;
                                    int i162 = i14;
                                    PhotoViewer photoViewer2 = photoViewer;
                                    switch (i152) {
                                        case 0:
                                            Drawable[] drawableArr3 = PhotoViewer.U8;
                                            if (!UserConfig.getInstance(i162).isPremium()) {
                                                new sg.y0(photoViewer2.m4, 3, true).show();
                                                break;
                                            } else {
                                                new org.telegram.ui.Components.zc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                MessagesController.getInstance(i162).disableAds(true);
                                                org.telegram.ui.ActionBar.m2 m2Var = photoViewer2.m4;
                                                if (m2Var instanceof fo) {
                                                    fo foVar = (fo) m2Var;
                                                    foVar.Ja(photoViewer2.T4);
                                                    foVar.La(photoViewer2.T4);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            Drawable[] drawableArr4 = PhotoViewer.U8;
                                            if (!UserConfig.getInstance(i162).isPremium()) {
                                                new sg.y0(photoViewer2.m4, 3, true).show();
                                                break;
                                            } else {
                                                new org.telegram.ui.Components.zc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                MessagesController.getInstance(i162).disableAds(true);
                                                org.telegram.ui.ActionBar.m2 m2Var2 = photoViewer2.m4;
                                                if (m2Var2 instanceof fo) {
                                                    fo foVar2 = (fo) m2Var2;
                                                    foVar2.Ja(photoViewer2.T4);
                                                    foVar2.La(photoViewer2.T4);
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
                    as asVar = photoViewer.J0;
                    MessageObject messageObject5 = photoViewer.T4;
                    LinearLayout linearLayout = asVar.b;
                    if (messageObject5 != null && (message = messageObject5.messageOwner) != null && message.media != null && messageObject5.hasVideoQualities()) {
                        int i18 = messageObject5.currentAccount;
                        TLRPC.MessageMedia messageMedia = messageObject5.messageOwner.media;
                        ArrayList s10 = org.telegram.ui.Components.h81.s(i18, messageMedia.document, messageMedia.alt_documents, 0, true);
                        linearLayout.removeAllViews();
                        int i19 = 0;
                        while (i19 < s10.size()) {
                            org.telegram.ui.Components.d81 d81Var = (org.telegram.ui.Components.d81) s10.get(i19);
                            org.telegram.ui.Components.f81 a2 = d81Var.a();
                            StringBuilder sb2 = new StringBuilder();
                            int i20 = R.string.QualitySaveIn;
                            Object[] objArr = new Object[i13];
                            objArr[0] = Integer.valueOf(d81Var.b());
                            sb2.append(LocaleController.formatString(i20, objArr));
                            sb2.append(d81Var.a ? " (" + LocaleController.getString(R.string.QualitySource) + ")" : "");
                            String sb3 = sb2.toString();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (a2.b()) {
                                spannableStringBuilder.append(AndroidUtilities.formatFileSize(a2.g.size));
                                spannableStringBuilder.append(LocaleController.getString(R.string.QualityCached));
                            } else {
                                SpannableString spannableString = new SpannableString("s ");
                                org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(R.drawable.msg_mini_arrow_mediabold, 0);
                                brVar.rotate(90.0f);
                                brVar.translate(f10, AndroidUtilities.dp(1.0f));
                                brVar.spaceScaleX = 0.85f;
                                spannableString.setSpan(brVar, 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) spannableString);
                                spannableStringBuilder.append(AndroidUtilities.formatFileSize(a2.g.size));
                            }
                            org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, linearLayout, 0, sb3, false, null);
                            c10.setSubtext(spannableStringBuilder);
                            c10.c(-328966, -328966);
                            c10.b.setPadding(0, 0, 0, 0);
                            c10.setOnClickListener(new a0(asVar, messageObject5, d81Var, 9));
                            c10.setSelectorColor(268435455);
                            i19++;
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
                    photoViewer.j3(false, false);
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
                    org.telegram.ui.ActionBar.m2 m2Var = photoViewer.m4;
                    if (m2Var instanceof fo) {
                        ((fo) m2Var).O9(photoViewer.T4, false, true);
                    }
                    photoViewer.G0(true, false);
                    String str3 = photoViewer.T4.sponsoredUrl;
                    if (str3 != null) {
                        Context context = LaunchActivity.G1;
                        if (context == null) {
                            context = photoViewer.E;
                        }
                        pf.d.r(context, Uri.parse(str3), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                        break;
                    }
                }
                break;
        }
    }
}
