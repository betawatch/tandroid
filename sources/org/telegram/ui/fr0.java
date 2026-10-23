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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ fr0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x023d, code lost:
    
        if (r5.startsWith("https://" + org.telegram.messenger.MessagesController.getInstance(r7.T).linkPrefix) == false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x043f  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        ku0 ku0Var;
        float f7;
        float f10;
        int i10;
        int i11;
        TLRPC.Message message;
        int i12 = this.a;
        float f11 = 0.0f;
        final PhotoViewer photoViewer = this.b;
        final int i13 = 0;
        int i14 = 1;
        switch (i12) {
            case 0:
                if (!photoViewer.e2 && !photoViewer.J1()) {
                    photoViewer.O2();
                    break;
                }
                break;
            case 1:
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer.J1() && (ku0Var = photoViewer.d) != null && ku0Var.c() != null && !photoViewer.d.c().isEmpty()) {
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
                        final int i15 = photoViewer.T4.currentAccount;
                        final ci.b bVar = new ci.b();
                        org.telegram.ui.Components.j80 G = org.telegram.ui.Components.j80.G(photoViewer.e0, bVar, photoViewer.o0, true);
                        G.a0(0.0f, -AndroidUtilities.dp(46.0f));
                        G.V(5);
                        MessageObject messageObject3 = photoViewer.T4;
                        if (messageObject3.sponsoredInfo == null && messageObject3.sponsoredAdditionalInfo == null) {
                            String str = messageObject3.sponsoredUrl;
                            if (str != null) {
                                break;
                            }
                            if (!UserConfig.getInstance(i15).isPremium() && !MessagesController.getInstance(photoViewer.T).premiumFeaturesBlocked() && !photoViewer.T4.sponsoredCanReport) {
                                G.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable() { // from class: org.telegram.ui.xq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i16 = i13;
                                        ci.b bVar2 = bVar;
                                        int i17 = i15;
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
                                                    org.telegram.ui.ActionBar.o2 o2Var = photoViewer2.m4;
                                                    if (o2Var instanceof sn) {
                                                        sn snVar = (sn) o2Var;
                                                        snVar.Ja(photoViewer2.T4);
                                                        snVar.La(photoViewer2.T4);
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
                                                    org.telegram.ui.ActionBar.o2 o2Var2 = photoViewer2.m4;
                                                    if (o2Var2 instanceof sn) {
                                                        sn snVar2 = (sn) o2Var2;
                                                        snVar2.Ja(photoViewer2.T4);
                                                        snVar2.La(photoViewer2.T4);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                }, false);
                            }
                            if (photoViewer.T4.sponsoredCanReport) {
                                G.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new bh0(18, photoViewer, bVar), false);
                                if ((photoViewer.m4 instanceof sn) && !MessagesController.getInstance(i15).premiumFeaturesBlocked()) {
                                    G.k();
                                    final int i16 = 1;
                                    G.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new Runnable() { // from class: org.telegram.ui.xq0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i162 = i16;
                                            ci.b bVar2 = bVar;
                                            int i17 = i15;
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
                                                        org.telegram.ui.ActionBar.o2 o2Var = photoViewer2.m4;
                                                        if (o2Var instanceof sn) {
                                                            sn snVar = (sn) o2Var;
                                                            snVar.Ja(photoViewer2.T4);
                                                            snVar.La(photoViewer2.T4);
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
                                                        org.telegram.ui.ActionBar.o2 o2Var2 = photoViewer2.m4;
                                                        if (o2Var2 instanceof sn) {
                                                            sn snVar2 = (sn) o2Var2;
                                                            snVar2.Ja(photoViewer2.T4);
                                                            snVar2.La(photoViewer2.T4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    }, false);
                                }
                            }
                            if (G.x() > 0) {
                                G.Z();
                                break;
                            }
                        }
                        org.telegram.ui.Components.j80 J = G.J();
                        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, photoViewer.E, bVar, true, false);
                        e1Var.setItemHeight(44);
                        e1Var.j(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                        e1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                        e1Var.setOnClickListener(new yg(G, 1));
                        J.r(e1Var, w7.z5.n(-1, -2));
                        J.r(new org.telegram.ui.ActionBar.j1(photoViewer.E, bVar), w7.z5.n(-1, 8));
                        ArrayList arrayList = new ArrayList();
                        String str2 = photoViewer.T4.sponsoredUrl;
                        int i17 = 6;
                        if (str2 != null) {
                            f7 = 300.0f;
                            if (!TextUtils.equals(AndroidUtilities.getHostAuthority(str2), MessagesController.getInstance(photoViewer.T).linkPrefix)) {
                                TextView textView = new TextView(photoViewer.E);
                                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.gc, bVar);
                                textView.setTextSize(1, 14.0f);
                                f10 = 10.0f;
                                textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                                textView.setMaxWidth(AndroidUtilities.dp(300.0f));
                                Uri parse = Uri.parse(photoViewer.T4.sponsoredUrl);
                                textView.setText(pf.d.u(parse, null, null, pf.d.a(parse.getHost()), null));
                                int i18 = org.telegram.ui.ActionBar.k6.I5;
                                org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.k6.Z(photoViewer.A1(i18), 0, photoViewer.T4.sponsoredAdditionalInfo == null ? 6 : 0);
                                org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i18);
                                textView.setBackground(Z);
                                org.telegram.ui.ActionBar.r6.k(textView, Z, null, O, bVar);
                                textView.setOnClickListener(new ae0(i17, photoViewer, G));
                                textView.setOnLongClickListener(new ci.l2(4, photoViewer, bVar));
                                arrayList.add(textView);
                                if (photoViewer.T4.sponsoredInfo != null) {
                                    TextView textView2 = new TextView(photoViewer.E);
                                    org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.E8, bVar);
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f10));
                                    textView2.setMaxWidth(AndroidUtilities.dp(f7));
                                    textView2.setText(photoViewer.T4.sponsoredInfo);
                                    int i19 = org.telegram.ui.ActionBar.k6.I5;
                                    org.telegram.ui.Cells.y Z2 = org.telegram.ui.ActionBar.k6.Z(photoViewer.A1(i19), 0, photoViewer.T4.sponsoredAdditionalInfo == null ? 6 : 0);
                                    org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i19);
                                    textView2.setBackground(Z2);
                                    org.telegram.ui.ActionBar.r6.k(textView2, Z2, null, O2, bVar);
                                    textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.wq0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            switch (i13) {
                                                case 0:
                                                    PhotoViewer photoViewer2 = photoViewer;
                                                    if (AndroidUtilities.addToClipboard(photoViewer2.T4.sponsoredInfo)) {
                                                        org.telegram.messenger.sl.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(photoViewer2.E), bVar));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    PhotoViewer photoViewer3 = photoViewer;
                                                    if (AndroidUtilities.addToClipboard(photoViewer3.T4.sponsoredAdditionalInfo)) {
                                                        org.telegram.messenger.sl.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(photoViewer3.E), bVar));
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
                                    org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.E8, bVar);
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f10));
                                    textView3.setMaxWidth(AndroidUtilities.dp(f7));
                                    textView3.setText(photoViewer.T4.sponsoredAdditionalInfo);
                                    int i20 = org.telegram.ui.ActionBar.k6.I5;
                                    org.telegram.ui.Cells.y Z3 = org.telegram.ui.ActionBar.k6.Z(photoViewer.A1(i20), 0, 6);
                                    org.telegram.ui.ActionBar.n6 O3 = org.telegram.ui.ActionBar.r6.O(i20);
                                    textView3.setBackground(Z3);
                                    org.telegram.ui.ActionBar.r6.k(textView3, Z3, null, O3, bVar);
                                    final int i21 = 1;
                                    textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.wq0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            switch (i21) {
                                                case 0:
                                                    PhotoViewer photoViewer2 = photoViewer;
                                                    if (AndroidUtilities.addToClipboard(photoViewer2.T4.sponsoredInfo)) {
                                                        org.telegram.messenger.sl.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(photoViewer2.E), bVar));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    PhotoViewer photoViewer3 = photoViewer;
                                                    if (AndroidUtilities.addToClipboard(photoViewer3.T4.sponsoredAdditionalInfo)) {
                                                        org.telegram.messenger.sl.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(photoViewer3.E), bVar));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    arrayList.add(textView3);
                                }
                                for (i10 = 0; i10 < arrayList.size(); i10++) {
                                    View view2 = (View) arrayList.get(i10);
                                    if (i10 > 0) {
                                        FrameLayout frameLayout = new FrameLayout(photoViewer.E);
                                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, frameLayout, bVar);
                                        i11 = -1;
                                        LinearLayout.LayoutParams n10 = w7.z5.n(-1, 1);
                                        n10.height = 1;
                                        J.r(frameLayout, n10);
                                    } else {
                                        i11 = -1;
                                    }
                                    J.r(view2, w7.z5.n(i11, -2));
                                }
                                G.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new gi.g2(G, J, 10), false);
                                if (!UserConfig.getInstance(i15).isPremium()) {
                                    G.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable() { // from class: org.telegram.ui.xq0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i162 = i13;
                                            ci.b bVar2 = bVar;
                                            int i172 = i15;
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
                                                        org.telegram.ui.ActionBar.o2 o2Var = photoViewer2.m4;
                                                        if (o2Var instanceof sn) {
                                                            sn snVar = (sn) o2Var;
                                                            snVar.Ja(photoViewer2.T4);
                                                            snVar.La(photoViewer2.T4);
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
                                                        org.telegram.ui.ActionBar.o2 o2Var2 = photoViewer2.m4;
                                                        if (o2Var2 instanceof sn) {
                                                            sn snVar2 = (sn) o2Var2;
                                                            snVar2.Ja(photoViewer2.T4);
                                                            snVar2.La(photoViewer2.T4);
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
                                if (G.x() > 0) {
                                }
                            }
                        } else {
                            f7 = 300.0f;
                        }
                        f10 = 10.0f;
                        if (photoViewer.T4.sponsoredInfo != null) {
                        }
                        if (photoViewer.T4.sponsoredAdditionalInfo != null) {
                        }
                        while (i10 < arrayList.size()) {
                        }
                        G.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new gi.g2(G, J, 10), false);
                        if (!UserConfig.getInstance(i15).isPremium()) {
                        }
                        if (photoViewer.T4.sponsoredCanReport) {
                        }
                        if (G.x() > 0) {
                        }
                    }
                }
                break;
            case 4:
                MessageObject messageObject4 = photoViewer.T4;
                if (messageObject4 != null && messageObject4.hasVideoQualities()) {
                    lr lrVar = photoViewer.J0;
                    MessageObject messageObject5 = photoViewer.T4;
                    LinearLayout linearLayout = lrVar.b;
                    if (messageObject5 != null && (message = messageObject5.messageOwner) != null && message.media != null && messageObject5.hasVideoQualities()) {
                        int i22 = messageObject5.currentAccount;
                        TLRPC.MessageMedia messageMedia = messageObject5.messageOwner.media;
                        ArrayList s10 = org.telegram.ui.Components.j81.s(i22, messageMedia.document, messageMedia.alt_documents, 0, true);
                        linearLayout.removeAllViews();
                        int i23 = 0;
                        while (i23 < s10.size()) {
                            org.telegram.ui.Components.f81 f81Var = (org.telegram.ui.Components.f81) s10.get(i23);
                            org.telegram.ui.Components.h81 a2 = f81Var.a();
                            StringBuilder sb2 = new StringBuilder();
                            int i24 = R.string.QualitySaveIn;
                            Object[] objArr = new Object[i14];
                            objArr[0] = Integer.valueOf(f81Var.b());
                            sb2.append(LocaleController.formatString(i24, objArr));
                            sb2.append(f81Var.a ? " (" + LocaleController.getString(R.string.QualitySource) + ")" : "");
                            String sb3 = sb2.toString();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (a2.b()) {
                                spannableStringBuilder.append(AndroidUtilities.formatFileSize(a2.g.size));
                                spannableStringBuilder.append(LocaleController.getString(R.string.QualityCached));
                            } else {
                                SpannableString spannableString = new SpannableString("s ");
                                org.telegram.ui.Components.xq xqVar = new org.telegram.ui.Components.xq(R.drawable.msg_mini_arrow_mediabold, 0);
                                xqVar.rotate(90.0f);
                                xqVar.translate(f11, AndroidUtilities.dp(1.0f));
                                xqVar.spaceScaleX = 0.85f;
                                spannableString.setSpan(xqVar, 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) spannableString);
                                spannableStringBuilder.append(AndroidUtilities.formatFileSize(a2.g.size));
                            }
                            org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, linearLayout, 0, sb3, false, null);
                            c10.setSubtext(spannableStringBuilder);
                            c10.d(-328966, -328966);
                            c10.b.setPadding(0, 0, 0, 0);
                            c10.setOnClickListener(new z(lrVar, messageObject5, f81Var, 9));
                            c10.setSelectorColor(268435455);
                            i23++;
                            f11 = 0.0f;
                            i14 = 1;
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
                    org.telegram.ui.ActionBar.o2 o2Var = photoViewer.m4;
                    if (o2Var instanceof sn) {
                        ((sn) o2Var).O9(photoViewer.T4, false, true);
                    }
                    photoViewer.H0(true, false);
                    String str3 = photoViewer.T4.sponsoredUrl;
                    if (str3 != null) {
                        Context context = LaunchActivity.J1;
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
