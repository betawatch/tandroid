package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.lk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ey;
import org.telegram.ui.m71;
import org.telegram.ui.r91;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public class k7 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int A1 = 0;
    public boolean A0;
    public final j5 B0;
    public final TextView C0;
    public final j5 D0;
    public boolean E0;
    public TL_stars.SavedStarGift F0;
    public z9 G0;
    public MessageObject H0;
    public String I0;
    public TL_stars.TL_starGiftUnique J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public s6 P0;
    public boolean Q0;
    public m5 R0;
    public final int[] S0;
    public l5 T0;
    public int U0;
    public String V0;
    public yh.e4 W0;
    public final long X;
    public yq X0;
    public final n5 Y;
    public boolean Y0;
    public final h5 Z;
    public a5 Z0;
    public final z00 a0;
    public Float a1;
    public final View b0;
    public g6 b1;
    public yh.k2 c0;
    public ValueAnimator c1;
    public yh.k2 d0;
    public yq d1;
    public final k5 e0;
    public boolean e1;
    public final e7 f0;
    public TL_wallet.nftItem f1;
    public final j5 g0;
    public org.telegram.ui.Wallet.u4 g1;
    public final x90 h0;
    public org.telegram.ui.Wallet.v4 h1;
    public final j01 i0;
    public TL_wallet.walletTransaction i1;
    public final x90 j0;
    public View j1;
    public final ei.d k0;
    public yh.a2 k1;
    public final FrameLayout l0;
    public boolean l1;
    public final x90 m0;
    public Boolean m1;
    public final FrameLayout n0;
    public boolean n1;
    public final View o0;
    public ArrayList o1;
    public final FrameLayout p0;
    public ArrayList p1;
    public g7 q0;
    public ArrayList q1;
    public boolean r0;
    public boolean r1;
    public final j5 s0;
    public TLRPC.PaymentForm s1;
    public final gi.k[] t0;
    public final yq[] t1;
    public final View u0;
    public final b2 u1;
    public final LinearLayout v0;
    public int v1;
    public final xp w0;
    public Boolean w1;
    public final TextView x0;
    public boolean x1;
    public final LinearLayout y0;
    public ei.x3 y1;
    public final xp z0;
    public View z1;

    public k7(Context context, int i10, long j10, org.telegram.ui.ActionBar.d6 d6Var, View view) {
        super(context, null, false, false, d6Var);
        this.r0 = false;
        this.S0 = new int[2];
        this.U0 = -1;
        this.V0 = "";
        this.b1 = new g6(0, 0);
        this.e1 = true;
        this.t1 = new yq[1];
        this.u1 = new b2(this, 11);
        this.x1 = true;
        this.currentAccount = i10;
        this.X = j10;
        this.v = Math.max(0.05f, AndroidUtilities.dp(82.0f) / (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight));
        this.occupyNavigationBar = true;
        this.containerView = new ah.x(this, context, 1);
        n5 n5Var = new n5(this, context);
        this.Y = n5Var;
        h5 h5Var = new h5(this, context);
        this.Z = h5Var;
        h5Var.setAdapter(new i5(this, context, 0));
        R2();
        View view2 = new View(context);
        this.b0 = view2;
        int i11 = org.telegram.ui.ActionBar.h6.h5;
        view2.setBackgroundColor(getThemedColor(i11));
        this.containerView.addView(view2, w7.z5.e(-1, 50, 80));
        this.containerView.addView(h5Var, w7.z5.e(-1, -1, 119));
        fixNavigationBar(getThemedColor(i11));
        AndroidUtilities.removeFromParent(this.d);
        n5Var.addView(this.d, w7.z5.e(-1, -1, 119));
        j5 j5Var = new j5(this, context, 0);
        this.g0 = j5Var;
        j5Var.setOrientation(1);
        j5Var.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(68.0f));
        n5Var.addView(j5Var, w7.z5.e(-1, -1, 55));
        x90 x90Var = new x90(context, d6Var);
        this.h0 = x90Var;
        int i12 = org.telegram.ui.ActionBar.h6.q5;
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        x90Var.setTextSize(1, 12.0f);
        x90Var.setGravity(17);
        x90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        x90Var.setDisablePaddingsOffsetY(true);
        j5Var.addView(x90Var, w7.z5.t(-2, -2, 1, 4, -2, 4, 16));
        x90Var.setVisibility(8);
        j01 j01Var = new j01(context, d6Var);
        this.i0 = j01Var;
        j5Var.addView(j01Var, w7.z5.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        x90 x90Var2 = new x90(context, d6Var);
        this.j0 = x90Var2;
        x90Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        x90Var2.setTextSize(1, 12.0f);
        x90Var2.setGravity(17);
        x90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        int i13 = org.telegram.ui.ActionBar.h6.Oh;
        x90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
        x90Var2.setDisablePaddingsOffsetY(true);
        x90Var2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        j5Var.addView(x90Var2, w7.z5.t(-2, -2, 1, 4, 2, 4, 8));
        x90Var2.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.y0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setOrientation(0);
        int i14 = org.telegram.ui.ActionBar.h6.i6;
        linearLayout.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(i14, d6Var), 21, 21));
        xp xpVar = new xp(context, 24, d6Var);
        this.z0 = xpVar;
        int i15 = org.telegram.ui.ActionBar.h6.h7;
        int i16 = org.telegram.ui.ActionBar.h6.j7;
        int i17 = org.telegram.ui.ActionBar.h6.k7;
        xpVar.b(i15, i16, i17);
        xpVar.setDrawUnchecked(true);
        xpVar.a(false, false);
        xpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(xpVar, w7.z5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i18 = org.telegram.ui.ActionBar.h6.j5;
        textView.setTextColor(getThemedColor(i18));
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2AlsoShowInMyGifts));
        linearLayout.addView(textView, w7.z5.t(-2, -2, 16, 9, 0, 0, 0));
        j5Var.addView(linearLayout, w7.z5.t(-2, -2, 1, 0, -4, 0, 4));
        w7.b6.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new c2(this, 18));
        linearLayout.setVisibility(8);
        j5 j5Var2 = new j5(this, context, 1);
        this.s0 = j5Var2;
        j5Var2.setOrientation(1);
        j5Var2.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        n5Var.addView(j5Var2, w7.z5.e(-1, -1, 55));
        gi.k[] kVarArr = {r9, r6, r6};
        this.t0 = kVarArr;
        gi.k kVar = new gi.k(context, d6Var, false);
        kVar.a(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
        j5Var2.addView(kVarArr[0], w7.z5.n(-1, -2));
        gi.k kVar2 = new gi.k(context, d6Var, false);
        kVar2.a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
        j5Var2.addView(kVarArr[1], w7.z5.n(-1, -2));
        gi.k kVar3 = new gi.k(context, d6Var, false);
        kVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
        j5Var2.addView(kVarArr[2], w7.z5.n(-1, -2));
        View view3 = new View(context);
        this.u0 = view3;
        int i19 = org.telegram.ui.ActionBar.h6.d7;
        view3.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i19, d6Var));
        j5Var2.addView(view3, w7.z5.s(-2, 7, 17, -4, 17, 1.0f / AndroidUtilities.density, 6));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.v0 = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout2.setOrientation(0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(i14, d6Var), 6, 6));
        xp xpVar2 = new xp(context, 24, d6Var);
        this.w0 = xpVar2;
        xpVar2.b(i15, i16, i17);
        xpVar2.setDrawUnchecked(true);
        xpVar2.a(false, false);
        xpVar2.setDrawBackgroundAsArc(10);
        linearLayout2.addView(xpVar2, w7.z5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        this.x0 = textView2;
        textView2.setTextColor(getThemedColor(i18));
        textView2.setTextSize(1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.Gift2AddSenderName));
        linearLayout2.addView(textView2, w7.z5.t(-2, -2, 16, 9, 0, 0, 0));
        j5Var2.addView(linearLayout2, w7.z5.t(-2, -2, 1, 0, 0, 0, 4));
        w7.b6.b(linearLayout2, 0.025f, 1.5f);
        j5 j5Var3 = new j5(this, context, 2);
        this.B0 = j5Var3;
        j5Var3.setOrientation(1);
        j5Var3.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        n5Var.addView(j5Var3, w7.z5.e(-1, -1, 55));
        TextView textView3 = new TextView(context);
        this.C0 = textView3;
        lk.o(i18, d6Var, textView3, 1, 20.0f);
        textView3.setGravity(17);
        textView3.setTypeface(AndroidUtilities.bold());
        j5Var3.addView(textView3, w7.z5.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView4 = new TextView(context);
        lk.o(i18, d6Var, textView4, 1, 14.0f);
        textView4.setGravity(17);
        textView4.setText(LocaleController.getString(R.string.Gift2WearSubtitle));
        j5Var3.addView(textView4, w7.z5.t(-1, -2, 7, 20, 6, 20, 24));
        gi.k kVar4 = new gi.k(context, d6Var, false);
        kVar4.a(LocaleController.getString(R.string.Gift2WearFeature1Title), LocaleController.getString(R.string.Gift2WearFeature1Text), R.drawable.menu_feature_unique);
        j5Var3.addView(r10[0], w7.z5.n(-1, -2));
        gi.k kVar5 = new gi.k(context, d6Var, false);
        kVar5.a(LocaleController.getString(R.string.Gift2WearFeature2Title), LocaleController.getString(R.string.Gift2WearFeature2Text), R.drawable.menu_feature_cover);
        j5Var3.addView(r10[1], w7.z5.n(-1, -2));
        gi.k kVar6 = new gi.k(context, d6Var, false);
        gi.k[] kVarArr2 = {kVar4, kVar5, kVar6};
        kVar6.a(LocaleController.getString(R.string.Gift2WearFeature3Title), LocaleController.getString(R.string.Gift2WearFeature3Text), R.drawable.menu_verification);
        j5Var3.addView(kVarArr2[2], w7.z5.n(-1, -2));
        j5 j5Var4 = new j5(this, context, 3);
        this.D0 = j5Var4;
        j5Var4.setOrientation(1);
        j5Var4.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(92.0f));
        n5Var.addView(j5Var4, w7.z5.e(-1, -1, 55));
        gi.k kVar7 = new gi.k(context, d6Var, false);
        kVar7.a(LocaleController.getString(R.string.GiftCraftInfoFeature1Title), LocaleController.getString(R.string.GiftCraftInfoFeature1Text), R.drawable.menu_feature_unique);
        j5Var4.addView(r11[0], w7.z5.n(-1, -2));
        gi.k kVar8 = new gi.k(context, d6Var, false);
        kVar8.a(LocaleController.getString(R.string.GiftCraftInfoFeature2Title), LocaleController.getString(R.string.GiftCraftInfoFeature2Text), R.drawable.menu_random);
        j5Var4.addView(r11[1], w7.z5.n(-1, -2));
        gi.k kVar9 = new gi.k(context, d6Var, false);
        gi.k[] kVarArr3 = {kVar7, kVar8, kVar9};
        kVar9.a(LocaleController.getString(R.string.GiftCraftInfoFeature3Title), LocaleController.getString(R.string.GiftCraftInfoFeature3Text), R.drawable.menu_feature_affect);
        j5Var4.addView(kVarArr3[2], w7.z5.n(-1, -2));
        j5Var.setAlpha(1.0f);
        j5Var2.setAlpha(0.0f);
        j5Var3.setAlpha(0.0f);
        j5Var4.setAlpha(0.0f);
        e7 e7Var = new e7(context, d6Var, new b2(this, 12), new c2(this, 19), new c2(this, 20), new c2(this, 21), new c2(this, 22), new c2(this, 23), new c2(this, 24), new c2(this, 25));
        this.f0 = e7Var;
        e7Var.M.c.setOnClickListener(new c2(this, 16));
        int i20 = this.backgroundPaddingLeft;
        e7Var.setPadding(i20, 0, i20, 0);
        n5Var.addView(e7Var, w7.z5.e(-1, -2, 55));
        hg.a0 a0Var = this.c;
        this.P = true;
        a0Var.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.l0 = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i11));
        View view4 = new View(context);
        this.o0 = view4;
        view4.setBackgroundColor(getThemedColor(i19));
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, w7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        ei.d f7 = lk.f(24, context, d6Var, true);
        this.k0 = f7;
        f7.g(LocaleController.getString(R.string.OK), false, true);
        f7.f(null, false);
        FrameLayout.LayoutParams d = w7.z5.d(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        d.rightMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        frameLayout.addView(f7, d);
        n5Var.addView(frameLayout, w7.z5.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n0 = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i11));
        x90 x90Var3 = new x90(context, null);
        this.m0 = x90Var3;
        x90Var3.setTextSize(1, 12.0f);
        x90Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
        x90Var3.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
        x90Var3.setGravity(17);
        frameLayout2.addView(x90Var3, w7.z5.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        n5Var.addView(frameLayout2, w7.z5.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.d.setOnScrollListener(new ah.d0(this, 3));
        linearLayout2.setOnClickListener(new c2(this, 17));
        z00 z00Var = new z00(context);
        this.a0 = z00Var;
        n5Var.addView(z00Var, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.p0 = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        n5Var.addView(frameLayout3, w7.z5.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        AndroidUtilities.removeFromParent(this.e);
        n5Var.addView(this.e, w7.z5.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        k5 k5Var = new k5(context);
        this.e0 = k5Var;
        n5Var.addView(k5Var, w7.z5.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        AndroidUtilities.makeGlobalBlurBitmap(new r0(k5Var, 2), 12.0f, 12, null, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (android.text.TextUtils.isEmpty(r5) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x004e, code lost:
    
        if (android.text.TextUtils.isEmpty(r5) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A0(k7 k7Var) {
        String str;
        boolean z10;
        int i10;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        yq[] yqVarArr = k7Var.t1;
        ei.d dVar = k7Var.k0;
        int i11 = 1;
        if (k7Var.b1.c == 1 && !k7Var.isDismissed()) {
            TL_stars.InputSavedStarGift S1 = k7Var.S1();
            MessageObject messageObject = k7Var.H0;
            long j10 = 0;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                    return;
                }
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                long j11 = tL_messageActionStarGift.upgrade_stars;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                if (j11 <= 0) {
                }
                z10 = false;
            } else {
                TL_stars.SavedStarGift savedStarGift = k7Var.F0;
                if (savedStarGift == null) {
                    return;
                }
                long j12 = savedStarGift.upgrade_stars;
                str = savedStarGift.prepaid_upgrade_hash;
                if (j12 <= 0) {
                }
                z10 = false;
            }
            int currentTime = ConnectionsManager.getInstance(k7Var.currentAccount).getCurrentTime();
            if (k7Var.q1 != null) {
                i10 = 0;
                while (i10 < k7Var.q1.size()) {
                    starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) k7Var.q1.get(i10);
                    if (starGiftUpgradePrice.date >= currentTime) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            i10 = -1;
            starGiftUpgradePrice = null;
            if (k7Var.s1 != null) {
                int i12 = 0;
                while (i12 < k7Var.s1.invoice.prices.size()) {
                    j10 += k7Var.s1.invoice.prices.get(i12).amount;
                    i12++;
                    starGiftUpgradePrice = starGiftUpgradePrice;
                }
            }
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = starGiftUpgradePrice;
            if (i10 > 0 && !k7Var.r1) {
                k7Var.r1 = true;
                if (k7Var.q1 != null) {
                    for (int i13 = 0; i13 < i10; i13++) {
                        k7Var.q1.remove(0);
                    }
                }
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = k7Var.w0.a.q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = S1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(k7Var.currentAccount).getInputPeer(k7Var.X);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                }
                JSONObject q6 = gi.d3.q(k7Var.resourcesProvider, false);
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = q6.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(tL_payments_getPaymentForm, new v4(k7Var, i11));
            }
            if (z10) {
                dVar.g(md.S0(LocaleController.formatString(R.string.Gift2PrepayUpgradeButton, Long.valueOf(j10)), 1.13f, yqVarArr), true, true);
            } else {
                dVar.g(md.S0(LocaleController.formatString(R.string.Gift2UpgradeButton, Long.valueOf(j10)), 1.13f, yqVarArr), true, true);
            }
            g7 g7Var = k7Var.q0;
            if (g7Var != null) {
                g7Var.Q(j10);
            }
            if (starGiftUpgradePrice2 == null) {
                dVar.f(null, true);
                return;
            }
            int i14 = starGiftUpgradePrice2.date - currentTime;
            String formatDuration = i14 < 86400 ? AndroidUtilities.formatDuration(i14, false, true) : LocaleController.formatPluralString("Days", Math.round(i14 / 86400.0f), new Object[0]);
            org.telegram.ui.Components.p6 p6Var = dVar.e;
            p6Var.D = false;
            p6Var.E = true;
            p6Var.F = true;
            p6Var.G = false;
            p6Var.H = false;
            dVar.f(LocaleController.formatString(R.string.Gift2UpgradeButtonDecreasesIn, formatDuration), true);
            AndroidUtilities.runOnUIThread(k7Var.u1, 1000L);
        }
    }

    public static SpannableStringBuilder A2(String str) {
        int i10;
        int i11;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i11 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i10 = 0;
        } else {
            i10 = i11 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new e5(0), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void B0(final k7 k7Var, final yh.i0 i0Var, ag.c cVar, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        k7Var.k0.setLoading(false);
        if (i0Var != null && i0Var.L) {
            i0Var.L = false;
            i0Var.H.h(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        new k6(k7Var.getContext(), k7Var.resourcesProvider, tL_starGiftUnique, new h6(cVar, tL_payments_paymentFormStarGift), k7Var.currentAccount, j10, k7Var.Q1(), false, new Utilities.Callback2() { // from class: ai.i3
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                k7.D0(k7.this, tL_starGiftUnique, j10, tL_textWithEntities, z10, i0Var, (h6) obj, (pf.c) obj2);
            }
        }).b();
    }

    public static SpannableStringBuilder B2(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new yq(R.drawable.filled_understood, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new yq(R.drawable.filled_reactions, 0), 0, spannableString2.length(), 33);
        AndroidUtilities.replaceMultipleCharSequence("👌", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("👍", spannableStringBuilder, spannableString2);
        return spannableStringBuilder;
    }

    public static /* synthetic */ void C0(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(k7Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new f3(k7Var, tL_starGiftUnique, aVar, runnable, 1));
            return;
        }
        k7Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new a3.i0(k7Var, Long.parseLong(tL_error.text.substring(26)), runnable, 2));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new g3(k7Var, tL_error, runnable, 1));
        }
    }

    public static void C1(j01 j01Var, TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            string = LocaleController.getString(R.string.Gift2AttributeModel);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            string = LocaleController.getString(R.string.Gift2AttributeSymbol);
        } else if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
            return;
        } else {
            string = LocaleController.getString(R.string.Gift2AttributeBackdrop);
        }
        String str = string;
        Integer[] numArr = new Integer[1];
        j01Var.e(str, starGiftAttribute.name, X1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static /* synthetic */ void D0(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, yh.i0 i0Var, h6 h6Var, pf.c cVar) {
        cVar.d();
        ga.x(k7Var.currentAccount, h6Var.a).h(h6Var.b, tL_starGiftUnique, j10, tL_textWithEntities, z10, new u3(k7Var, cVar, tL_starGiftUnique, j10, i0Var, 0));
    }

    public static /* synthetic */ void E0(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable) {
        k7Var.getClass();
        TL_stars.StarsAmount o10 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = k7Var.S1();
        updatestargiftprice.resell_amount = o10;
        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(updatestargiftprice, new q2(k7Var, tL_starGiftUnique, aVar, runnable, 0));
    }

    public static void F0(k7 k7Var, long j10) {
        new yh.o1(k7Var.getContext(), k7Var.currentAccount, j10, null, new g4(k7Var, 1)).show();
    }

    public static void G0(k7 k7Var) {
        Bundle bundle = new Bundle();
        long j10 = k7Var.X;
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        if (j10 == UserConfig.getInstance(k7Var.currentAccount).getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        bundle.putBoolean("open_gifts", true);
        bundle.putBoolean("open_gifts_upgradable", true);
        x2(new ProfileActivity(bundle, null));
    }

    public static void H0(k7 k7Var, TLObject tLObject, MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        MessagesController.getInstance(k7Var.currentAccount).putUsers(messages_messages.users, false);
        MessagesController.getInstance(k7Var.currentAccount).putChats(messages_messages.chats, false);
        k7Var.M0 = true;
        k7Var.L0 = false;
        Boolean bool = k7Var.m1;
        if (bool != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                ((TLRPC.TL_messageActionStarGift) messageAction).saved = true ^ bool.booleanValue();
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = true ^ bool.booleanValue();
            }
        }
        k7Var.E2(messageObject, null);
    }

    public static /* synthetic */ void I0(k7 k7Var, pf.c cVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(k7Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new a3.l0(k7Var, cVar, tL_starGiftUnique, 4));
            return;
        }
        k7Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new a3.i0(k7Var, cVar, Long.parseLong(tL_error.text.substring(26)), 1));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new a3.l0(k7Var, cVar, tL_error, 5));
        }
    }

    public static void L0(k7 k7Var, Long l4) {
        TLRPC.Chat chat;
        String str = (l4.longValue() >= 0 || (chat = MessagesController.getInstance(k7Var.currentAccount).getChat(Long.valueOf(-l4.longValue()))) == null) ? "" : chat.title;
        org.telegram.ui.Components.qc Q = k7Var.getBulletinFactory().Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.GiftRepostedToProfile) : LocaleController.formatString(R.string.GiftRepostedToChannelProfile, str)));
        Q.t = true;
        Q.j();
    }

    public static boolean L1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift == savedStarGift2) {
            return true;
        }
        if (savedStarGift == null) {
            return false;
        }
        TL_stars.StarGift starGift = savedStarGift.gift;
        TL_stars.StarGift starGift2 = savedStarGift2.gift;
        if (starGift == starGift2) {
            return true;
        }
        return ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) ? starGift.id == starGift2.id : (starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.id == starGift2.id && savedStarGift.date == savedStarGift2.date;
    }

    public static void M0(k7 k7Var, String str, long j10) {
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
        l2Var.a = true;
        yh.g4 g4Var = new yh.g4(k7Var.X, str, j10, k7Var.resourcesProvider);
        g4Var.e = new g4(k7Var, 0);
        R.showAsSheet(g4Var, l2Var);
    }

    public static boolean M1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique == tL_starGiftUnique2) {
            return true;
        }
        if (tL_starGiftUnique != null) {
            return tL_starGiftUnique.id == tL_starGiftUnique2.id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug);
        }
        return false;
    }

    public static boolean N0(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ey eyVar, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        long giftThemeUser = ChatThemeController.getInstance(k7Var.currentAccount).getGiftThemeUser(tL_starGiftUnique.slug);
        if (giftThemeUser != 0 && giftThemeUser != j10) {
            org.telegram.ui.Components.f5.m0(k7Var.getContext(), k7Var.resourcesProvider, k7Var.currentAccount, tL_starGiftUnique, giftThemeUser, new b3(k7Var, j10, tL_starGiftUnique, eyVar, 1));
            return true;
        }
        ChatThemeController.getInstance(k7Var.currentAccount).setDialogTheme(j10, new gg.b(null, tL_starGiftUnique.slug));
        eyVar.presentFragment(sn.W9(j10), true);
        return true;
    }

    public static /* synthetic */ void O0(k7 k7Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
            TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
            MessagesController.getInstance(k7Var.currentAccount).putUsers(tL_payments_uniqueStarGift.users, false);
            MessagesController.getInstance(k7Var.currentAccount).putChats(tL_payments_uniqueStarGift.chats, false);
            if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                AndroidUtilities.runOnUIThread(new a1.f(15, k7Var, tL_payments_uniqueStarGift));
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new a1.f(16, b2Var, tL_error));
    }

    public static void P0(k7 k7Var, MessageObject messageObject, ArrayList arrayList, TL_stars.StarGift starGift) {
        k7Var.l1 = true;
        k7Var.E2(messageObject, null);
        k7Var.O2(0, true, null);
        z00 z00Var = k7Var.a0;
        if (z00Var != null) {
            z00Var.c(true);
        }
        ga.y(k7Var.currentAccount, false).P();
        y9 G = ga.y(k7Var.currentAccount, false).G(UserConfig.getInstance(k7Var.currentAccount).getClientUserId(), false);
        if (G != null) {
            G.k(arrayList, starGift);
        }
    }

    public static void Q0(k7 k7Var, pf.c cVar, ug.m1 m1Var, long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_wallet.nftItem nftitem, TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        int i10 = 0;
        if (org.telegram.ui.Wallet.m0.w(k7Var.currentAccount).u() < stargiftdepositpayload.amount) {
            cVar.b();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k7Var.getContext(), 0, k7Var.resourcesProvider);
            String string = LocaleController.getString(R.string.WalletNotEnoughGram);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.R = string;
            b2Var.T = LocaleController.formatSpannable(R.string.WalletNotEnoughGramToTransferGift, org.telegram.ui.Wallet.m0.m(stargiftdepositpayload.amount, false));
            alertDialog$Builder.h(LocaleController.getString(R.string.WalletNotNow), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.WalletTopUp), new ah.h0(2, k7Var, m1Var));
            alertDialog$Builder.o();
            return;
        }
        TLRPC.User user = j10 > 0 ? MessagesController.getInstance(k7Var.currentAccount).getUser(Long.valueOf(j10)) : null;
        long clientUserId = UserConfig.getInstance(k7Var.currentAccount).getClientUserId();
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        int i11 = k7Var.currentAccount;
        org.telegram.ui.Wallet.m0 w9 = org.telegram.ui.Wallet.m0.w(i11);
        b4 b4Var = new b4(k7Var, cVar, m1Var, i10);
        c4 c4Var = j10 != clientUserId ? null : new c4(i11, clientUserId, document);
        try {
            w9.b0(user, stargiftdepositpayload.nft_address.indexOf(58) >= 0 ? org.telegram.ui.Wallet.m0.T(stargiftdepositpayload.nft_address, true) : stargiftdepositpayload.nft_address, 0L, null, null, nftitem, null, b4Var, c4Var != null ? new qy(29, w9, c4Var) : null, org.telegram.ui.Wallet.m0.g(stargiftdepositpayload));
        } catch (Exception e) {
            org.telegram.ui.Wallet.m0.j("depositNFT: invalid payload", e);
            b4Var.run(e.getMessage() == null ? "NULL_ERROR" : e.getMessage());
        }
    }

    public static void R(k7 k7Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        TL_stars.SavedStarGift savedStarGift;
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(k7Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(k7Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            ga.y(k7Var.currentAccount, false).T(false);
            ga.y(k7Var.currentAccount, false).P();
            if (!TextUtils.isEmpty(str) && (savedStarGift = k7Var.F0) != null) {
                savedStarGift.flags &= -65537;
                savedStarGift.prepaid_upgrade_hash = null;
            }
            k7Var.r0 = true;
            k7Var.s1 = null;
            k7Var.E1(inputSavedStarGift, tL_payments_paymentResult.updates, new h4(k7Var, str, 0));
            Utilities.stageQueue.postRunnable(new i4(k7Var, tL_payments_paymentResult, 0));
            return;
        }
        if (tL_error == null || !"BALANCE_TOO_LOW".equals(tL_error.text)) {
            k7Var.getBulletinFactory().f0(tL_error, false);
            return;
        }
        if (!MessagesController.getInstance(k7Var.currentAccount).starsPurchaseAvailable()) {
            k7Var.k0.setLoading(false);
            ga.e0(k7Var.getContext(), k7Var.resourcesProvider);
            return;
        }
        ga y3 = ga.y(k7Var.currentAccount, false);
        d2 d2Var = new d2(k7Var, j10, 6);
        y3.e = false;
        y3.q(false, true, d2Var);
        y3.e = true;
    }

    public static void R0(long j10, long j11, k7 k7Var, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j12;
        k7 k7Var2;
        callback.run(tL_error);
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            j12 = j10;
            k7Var2 = k7Var;
        } else if (!(tLObject instanceof TLRPC.Updates)) {
            j12 = j10;
            k7Var2 = k7Var;
            org.telegram.ui.Components.xc.a0(U).f0(tL_error, false);
        } else if (j10 < 0 || j11 < 0) {
            j12 = j10;
            k7Var2 = k7Var;
            org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, k7Var2.Q1(), DialogObject.getShortName(j12))), R.raw.forward);
            M.t = true;
            M.j();
        } else {
            sn W9 = sn.W9(j10);
            j12 = j10;
            k7Var2 = k7Var;
            W9.whenFullyVisible(new r3(k7Var2, W9, j12, 0));
            U.presentFragment(W9);
        }
        ga.y(k7Var2.currentAccount, false).Q(j12);
        ga.y(k7Var2.currentAccount, false).Q(j11);
    }

    public static String R1(TL_stars.StarGift starGift) {
        if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return (!(starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(starGift.title)) ? LocaleController.getString(R.string.Gift2Gift) : starGift.title;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((TL_stars.TL_starGiftUnique) starGift).title);
        sb2.append(" #");
        return org.telegram.messenger.g0.h(r3.num, ',', sb2);
    }

    public static void S(final k7 k7Var, int i10, int i11, int i12, ug.m1[] m1VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, Long l4) {
        final ug.m1[] m1VarArr2;
        int i13;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        int i14 = 2;
        int i15 = 3;
        if (l4.longValue() == -99) {
            m1VarArr2 = m1VarArr;
            i13 = i10;
        } else {
            if (l4.longValue() != -98) {
                a3.l0 l0Var = new a3.l0(k7Var, l4, m1VarArr, i15);
                if (l4.longValue() < 0) {
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(k7Var.currentAccount).getChatFull(-l4.longValue());
                    if (chatFull == null) {
                        TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                        tL_channels_getFullChannel.channel = MessagesController.getInstance(k7Var.currentAccount).getInputChannel(-l4.longValue());
                        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(tL_channels_getFullChannel, new g(i14, k7Var, l0Var));
                        return;
                    } else if (!chatFull.stargifts_available) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k7Var.getContext(), 0, k7Var.resourcesProvider);
                        String string = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                        org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                        return;
                    }
                } else if (l4.longValue() >= 0) {
                    TLRPC.User user = MessagesController.getInstance(k7Var.currentAccount).getUser(l4);
                    TLRPC.UserFull userFull = MessagesController.getInstance(k7Var.currentAccount).getUserFull(l4.longValue());
                    if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                        new org.telegram.ui.Components.xc(m1VarArr[0].container, k7Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l4.longValue())))).j();
                        return;
                    } else if (userFull == null && user != null) {
                        TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                        tL_users_getFullUser.id = MessagesController.getInstance(k7Var.currentAccount).getInputUser(user);
                        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(tL_users_getFullUser, new w2(k7Var, m1VarArr, l4, l0Var, 1));
                        return;
                    }
                }
                l0Var.run();
                return;
            }
            i13 = i10;
            m1VarArr2 = m1VarArr;
        }
        if (i13 < i11) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(k7Var.getContext(), 0, k7Var.resourcesProvider);
            String string2 = LocaleController.getString(R.string.Gift2ExportTONUnlocksAlertTitle);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
            b2Var2.R = string2;
            b2Var2.T = LocaleController.formatPluralString("Gift2ExportTONUnlocksAlertText", Math.max(1, i12), new Object[0]);
            org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        if (l4.longValue() != -98) {
            LinearLayout linearLayout = new LinearLayout(k7Var.getContext());
            linearLayout.setOrientation(1);
            linearLayout.addView(new f6(k7Var.getContext(), tL_starGiftUnique), w7.z5.t(-1, -2, 48, 0, -4, 0, 0));
            TextView textView = new TextView(k7Var.getContext());
            int i16 = org.telegram.ui.ActionBar.h6.j5;
            org.telegram.ui.Cells.c1.r(i16, k7Var.resourcesProvider, textView, 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.Gift2ExportTONFragmentTitle));
            linearLayout.addView(textView, w7.z5.t(-1, -2, 48, 24, 4, 24, 14));
            TextView textView2 = new TextView(k7Var.getContext());
            lk.o(i16, k7Var.resourcesProvider, textView2, 1, 16.0f);
            lk.r(R.string.Gift2ExportTONFragmentText, new Object[]{k7Var.Q1()}, textView2);
            linearLayout.addView(textView2, w7.z5.t(-1, -2, 48, 24, 0, 24, 4));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(k7Var.getContext(), 0, k7Var.resourcesProvider);
            alertDialog$Builder3.n(linearLayout);
            final int i17 = 1;
            alertDialog$Builder3.k(LocaleController.getString(R.string.Gift2ExportTONFragmentOpen), new org.telegram.ui.ActionBar.a2(k7Var) { // from class: ai.y2
                public final /* synthetic */ k7 b;

                {
                    this.b = k7Var;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void g(org.telegram.ui.ActionBar.b2 b2Var3, int i18) {
                    switch (i17) {
                        case 0:
                            pf.c g10 = b2Var3.g(i18, true, true);
                            ug.m1 m1Var = m1VarArr2[0];
                            Objects.requireNonNull(m1Var);
                            this.b.N2(true, b2Var3, g10, new ug.z0(m1Var, 11));
                            break;
                        default:
                            pf.c g11 = b2Var3.g(i18, true, true);
                            ug.m1 m1Var2 = m1VarArr2[0];
                            Objects.requireNonNull(m1Var2);
                            this.b.N2(false, b2Var3, g11, new ug.z0(m1Var2, 11));
                            break;
                    }
                }
            });
            i2.d.r(R.string.Cancel, alertDialog$Builder3, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(k7Var.getContext(), 0, k7Var.resourcesProvider);
        String string3 = LocaleController.getString(R.string.Gift2MoveToMyWallet);
        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder4.a;
        b2Var3.R = string3;
        b2Var3.T = LocaleController.getString(R.string.Gift2MoveToMyWalletText);
        String s10 = org.telegram.ui.Wallet.m0.w(k7Var.currentAccount).s();
        LinearLayout linearLayout2 = new LinearLayout(k7Var.getContext());
        linearLayout2.setOrientation(1);
        if (!TextUtils.isEmpty(s10)) {
            TextView textView3 = new TextView(k7Var.getContext());
            textView3.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
            textView3.setTextSize(1, 16.5f);
            textView3.setLetterSpacing(0.01818182f);
            textView3.setLineSpacing(AndroidUtilities.dp(23.0f) - textView3.getPaint().getFontMetricsInt(null), 1.0f);
            textView3.setIncludeFontPadding(false);
            textView3.setGravity(17);
            textView3.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.j5, k7Var.resourcesProvider);
            textView3.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.h6.m1(0.045f, w02)));
            int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.r5, k7Var.resourcesProvider);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int length = (s10.length() + 3) / 4;
            for (int i18 = 0; i18 < length; i18++) {
                if (i18 > 0) {
                    spannableStringBuilder.append((CharSequence) (i18 % 4 == 0 ? "\n" : " "));
                }
                int length2 = spannableStringBuilder.length();
                int i19 = i18 * 4;
                spannableStringBuilder.append((CharSequence) s10, i19, Math.min(s10.length(), i19 + 4));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((i18 / 4) + (i18 % 4)) % 2 == 0 ? w02 : w03), length2, spannableStringBuilder.length(), 33);
            }
            textView3.setText(spannableStringBuilder);
            linearLayout2.addView(textView3, w7.z5.k(20.0f, 0.0f, 20.0f, 14.0f, -1, -2));
        }
        TextView textView4 = new TextView(k7Var.getContext());
        textView4.setTextSize(1, 15.0f);
        org.telegram.ui.Cells.c1.q(org.telegram.ui.ActionBar.h6.j5, k7Var.resourcesProvider, textView4, 17);
        textView4.setText(LocaleController.getString(R.string.Gift2MoveAppearIn));
        linearLayout2.addView(textView4, w7.z5.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(k7Var.getContext());
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        int w04 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.r5, k7Var.resourcesProvider);
        k7Var.D1(linearLayout3, R.drawable.msg_settings, 14, w04, LocaleController.getString(R.string.Settings), true);
        k7Var.D1(linearLayout3, R.drawable.mini_gram_14, 15, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, k7Var.resourcesProvider), LocaleController.getString(R.string.WalletAttachMoney), true);
        k7Var.D1(linearLayout3, R.drawable.menu_gift, 14, w04, LocaleController.getString(R.string.WalletCollectibles), false);
        linearLayout2.addView(linearLayout3, w7.z5.t(-2, -2, 1, 0, 7, 0, 3));
        k7Var.x1 = true;
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(k7Var.getContext(), 1, k7Var.resourcesProvider);
        a2Var.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, k7Var.resourcesProvider), 7, AndroidUtilities.dp(12.0f)));
        a2Var.setMultiline(true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a2Var.getCheckBoxView().getLayoutParams();
        layoutParams.topMargin = 0;
        int i20 = 5;
        layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
        a2Var.getCheckBoxView().setLayoutParams(layoutParams);
        a2Var.e(LocaleController.getString(R.string.Gift2KeepOnProfile), "", true, false, false);
        a2Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        a2Var.setOnClickListener(new p(i20, k7Var, a2Var));
        linearLayout2.addView(a2Var, w7.z5.k(8.0f, 4.0f, 8.0f, 0.0f, -1, -2));
        alertDialog$Builder4.n(linearLayout2);
        b2Var3.G = 20;
        final int i21 = 0;
        alertDialog$Builder4.k(LocaleController.getString(R.string.Gift2Move), new org.telegram.ui.ActionBar.a2(k7Var) { // from class: ai.y2
            public final /* synthetic */ k7 b;

            {
                this.b = k7Var;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void g(org.telegram.ui.ActionBar.b2 b2Var32, int i182) {
                switch (i21) {
                    case 0:
                        pf.c g10 = b2Var32.g(i182, true, true);
                        ug.m1 m1Var = m1VarArr2[0];
                        Objects.requireNonNull(m1Var);
                        this.b.N2(true, b2Var32, g10, new ug.z0(m1Var, 11));
                        break;
                    default:
                        pf.c g11 = b2Var32.g(i182, true, true);
                        ug.m1 m1Var2 = m1VarArr2[0];
                        Objects.requireNonNull(m1Var2);
                        this.b.N2(false, b2Var32, g11, new ug.z0(m1Var2, 11));
                        break;
                }
            }
        });
        i2.d.r(R.string.Cancel, alertDialog$Builder4, null);
    }

    public static void S0(k7 k7Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.Document document, String str, String str2, String str3, long j10, TLRPC.TL_error tL_error) {
        j01 j01Var;
        LinearLayout linearLayout;
        CharSequence charSequence;
        float f7;
        float f10;
        b2Var.dismiss();
        if (!(tLObject instanceof TL_stars.UniqueStarGiftValueInfo)) {
            if (tL_error != null) {
                k7Var.getBulletinFactory().f0(tL_error, false);
                return;
            }
            return;
        }
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject;
        int i10 = 1;
        org.telegram.ui.ActionBar.f3 i11 = lk.i(1, k7Var.getContext(), k7Var.resourcesProvider, false);
        LinearLayout linearLayout2 = new LinearLayout(k7Var.getContext());
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(k7Var.getContext());
        md.a1(w9Var.getImageReceiver(), document, 160);
        linearLayout2.addView(w9Var, w7.z5.t(160, 160, 1, 0, 0, 0, 0));
        TextView textView = new TextView(k7Var.getContext());
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sh, k7Var.resourcesProvider));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        textView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(21.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, k7Var.resourcesProvider)));
        textView.setGravity(17);
        linearLayout2.addView(textView, w7.z5.t(-2, 42, 1, 0, 12, 0, 15));
        textView.setText(str);
        TextView textView2 = new TextView(k7Var.getContext());
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.Cells.c1.q(org.telegram.ui.ActionBar.h6.j5, k7Var.resourcesProvider, textView2, 17);
        linearLayout2.addView(textView2, w7.z5.t(-2, -2, 1, 16, 0, 16, 19));
        if (uniqueStarGiftValueInfo.value_is_average) {
            lk.r(R.string.GiftValueAverage, new Object[]{str2}, textView2);
        } else if (uniqueStarGiftValueInfo.last_sale_on_fragment) {
            lk.r(R.string.GiftValueLastFragment, new Object[]{str3}, textView2);
        } else {
            lk.r(R.string.GiftValueLastTelegram, new Object[]{str3}, textView2);
        }
        FrameLayout frameLayout = new FrameLayout(k7Var.getContext());
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        s0 s0Var = new s0(k7Var, new ei.x3[1], frameLayout, i10);
        j01 j01Var2 = new j01(k7Var.getContext(), k7Var.resourcesProvider);
        frameLayout.addView(j01Var2, w7.z5.e(-1, -1, 119));
        j01Var2.c(LocaleController.getString(R.string.GiftValueInitialSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.initial_sale_date, true), null, null);
        String string = LocaleController.getString(R.string.GiftValueInitialPrice);
        StringBuilder sb2 = new StringBuilder("⭐️");
        sb2.append(uniqueStarGiftValueInfo.initial_sale_stars);
        sb2.append(" (~");
        j01Var2.c(string, md.Y0(false, a1.g.s(sb2, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
            j01Var2.c(LocaleController.getString(R.string.GiftValueLastSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.last_sale_date, true), null, null);
            int round = ((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100;
            if (round > 0) {
                j01Var2.e(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + LocaleController.formatNumber(round, ' ') + "%", null, null);
            } else {
                j01Var2.c(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
            }
        }
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
            p3 p3Var = new p3(s0Var, new org.telegram.ui.Components.zc[]{(org.telegram.ui.Components.zc) ((g01) r3.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str2, 0);
            j01Var = j01Var2;
            TableRow e = j01Var.e(LocaleController.getString(R.string.GiftValueMinPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", p3Var, null);
            e.setOnClickListener(new ah.g0(p3Var, 5));
        } else {
            j01Var = j01Var2;
        }
        int i12 = 6;
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
            p3 p3Var2 = new p3(s0Var, new org.telegram.ui.Components.zc[]{(org.telegram.ui.Components.zc) ((g01) r3.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str2, 1);
            TableRow e7 = j01Var.e(LocaleController.getString(R.string.GiftValueAveragePrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", p3Var2, null);
            e7.setOnClickListener(new ah.g0(p3Var2, i12));
        }
        linearLayout2.addView(frameLayout, w7.z5.t(-1, -2, 7, 0, 0, 0, 12));
        if (uniqueStarGiftValueInfo.listed_count > 0) {
            ei.d dVar = new ei.d(k7Var.getContext(), k7Var.resourcesProvider, false);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            f7 = 1.0f;
            f10 = 2.0f;
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.listed_count, ' '));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) "e");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.a6(document, 1.5f, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleTelegram));
            dVar.g(AndroidUtilities.replaceArrows(spannableStringBuilder, false, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f)), false, true);
            charSequence = " ";
            linearLayout = linearLayout2;
            dVar.setOnClickListener(new q3(k7Var, str2, j10, 0));
            linearLayout.addView(dVar, w7.z5.t(-1, 42, 7, 0, 0, 0, 2));
        } else {
            linearLayout = linearLayout2;
            charSequence = " ";
            f7 = 1.0f;
            f10 = 2.0f;
        }
        if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
            ei.d dVar2 = new ei.d(k7Var.getContext(), k7Var.resourcesProvider, false);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.fragment_listed_count, ' '));
            spannableStringBuilder2.append((CharSequence) "e");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.a6(document, 1.5f, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
            spannableStringBuilder2.append(charSequence);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleFragment));
            dVar2.g(AndroidUtilities.replaceArrows(spannableStringBuilder2, false, AndroidUtilities.dp(f10), AndroidUtilities.dp(f7)), false, true);
            dVar2.setOnClickListener(new p(6, k7Var, uniqueStarGiftValueInfo));
            linearLayout.addView(dVar2, w7.z5.t(-1, 42, 7, 0, 0, 0, 0));
        }
        i11.customView = linearLayout;
        i11.show();
    }

    public static void T(k7 k7Var, org.telegram.ui.ActionBar.b2 b2Var, MessageObject messageObject) {
        b2Var.dismiss();
        k7Var.M0 = true;
        k7Var.E2(messageObject, null);
        super.show();
    }

    public static void T0(k7 k7Var, boolean[] zArr, TextView textView, TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr, Runnable[] runnableArr, TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        Runnable jVar;
        if (zArr[0]) {
            return;
        }
        if (stargiftdepositpayload == null) {
            textView.setVisibility(8);
            return;
        }
        stargiftdepositpayloadArr[0] = stargiftdepositpayload;
        if (org.telegram.ui.Wallet.m0.w(k7Var.currentAccount).u() < stargiftdepositpayload.amount) {
            textView.setVisibility(8);
            return;
        }
        org.telegram.ui.Wallet.m0 w9 = org.telegram.ui.Wallet.m0.w(k7Var.currentAccount);
        q qVar = new q(textView, 4);
        try {
            boolean[] zArr2 = new boolean[1];
            w9.j0(new org.telegram.ui.Wallet.w6(w9, zArr2, qVar, org.telegram.ui.Wallet.m0.g(stargiftdepositpayload), 4));
            jVar = new org.telegram.ui.Wallet.n(zArr2, 3);
        } catch (Exception e) {
            org.telegram.ui.Wallet.m0.j("emulateDepositNFT: invalid payload", e);
            AndroidUtilities.runOnUIThread(new m71(27, qVar, e));
            jVar = new ah.j(22);
        }
        runnableArr[0] = jVar;
    }

    public static void U(k7 k7Var, long j10) {
        new yh.o1(k7Var.getContext(), k7Var.currentAccount, j10, null, new g4(k7Var, 1)).show();
    }

    public static /* synthetic */ void U0(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable) {
        TL_stars.StarsAmount o10 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = k7Var.S1();
        updatestargiftprice.resell_amount = o10;
        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(updatestargiftprice, new q2(k7Var, tL_starGiftUnique, aVar, runnable, 1));
    }

    public static void V(final k7 k7Var) {
        TL_stars.SavedStarGift savedStarGift = k7Var.F0;
        if (savedStarGift.unsaved) {
            savedStarGift.unsaved = false;
            v9 F = ga.y(k7Var.currentAccount, false).F(k7Var.X, false);
            if (F != null) {
                TL_stars.SavedStarGift savedStarGift2 = k7Var.F0;
                F.m(savedStarGift2, savedStarGift2.unsaved);
            }
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = k7Var.S1();
            savestargift.unsave = k7Var.F0.unsaved;
            ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(savestargift, null, 64);
        }
        TL_stars.SavedStarGift savedStarGift3 = k7Var.F0;
        boolean z10 = savedStarGift3.pinned_to_top;
        if (((y9) k7Var.G0).n(savedStarGift3, !z10, false)) {
            new yh.o2(k7Var.getContext(), k7Var.X, k7Var.F0, k7Var.resourcesProvider, new Utilities.Callback0Return() { // from class: ai.o2
                @Override // org.telegram.messenger.Utilities.Callback0Return
                public final Object run() {
                    return k7.this.getBulletinFactory();
                }
            }).show();
            return;
        }
        if (z10) {
            org.telegram.messenger.g0.q(R.string.Gift2Unpinned, k7Var.getBulletinFactory(), R.raw.ic_unpin, 36);
        } else {
            k7Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
        }
    }

    public static void V0(k7 k7Var, TLObject tLObject, ug.m1[] m1VarArr, Long l4, a3.l0 l0Var, TLRPC.TL_error tL_error) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (!(tLObject instanceof TLRPC.TL_users_userFull)) {
            org.telegram.ui.Components.qc Y = k7Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
            return;
        }
        TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
        MessagesController.getInstance(k7Var.currentAccount).putUsers(tL_users_userFull.users, false);
        MessagesController.getInstance(k7Var.currentAccount).putChats(tL_users_userFull.chats, false);
        TLRPC.UserFull userFull = tL_users_userFull.full_user;
        if (userFull == null || (disallowedGiftsSettings = userFull.disallowed_stargifts) == null || !disallowedGiftsSettings.disallow_unique_stargifts) {
            l0Var.run();
        } else {
            new org.telegram.ui.Components.xc(m1VarArr[0].container, k7Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l4.longValue())))).j();
        }
    }

    public static void W(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, org.telegram.ui.ActionBar.b2 b2Var) {
        k7Var.getClass();
        pf.c g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = k7Var.S1();
        updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(updatestargiftprice, new k2(k7Var, g10, tL_starGiftUnique, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01b6, code lost:
    
        if (r0 != null) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void W0(k7 k7Var, View view) {
        boolean z10;
        boolean z11;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        boolean c22;
        TLRPC.Message message;
        String T1 = k7Var.T1();
        TL_stars.TL_starGiftUnique Y1 = k7Var.Y1();
        i80 F = i80.F(k7Var.Y, k7Var.resourcesProvider, view);
        boolean z12 = (k7Var.Y1() == null || !c2(k7Var.currentAccount, DialogObject.getPeerDialogId(k7Var.Y1().owner_id)) || !(k7Var.G0 instanceof y9) || k7Var.F0 == null || k7Var.S1() == null) ? false : true;
        TL_stars.SavedStarGift savedStarGift = k7Var.F0;
        F.l((savedStarGift == null || !savedStarGift.pinned_to_top) ? R.drawable.msg_pin : R.drawable.msg_unpin, LocaleController.getString((savedStarGift == null || !savedStarGift.pinned_to_top) ? R.string.Gift2Pin : R.string.Gift2Unpin), new b2(k7Var, 13), z12);
        F.l(R.drawable.outline_craft, LocaleController.getString(R.string.GiftCraft), new b2(k7Var, 15), k7Var.G1());
        F.l(R.drawable.menu_edit_price, LocaleController.getString(R.string.Gift2ChangePrice), new b2(k7Var, 16), (k7Var.Y1() == null || !c2(k7Var.currentAccount, DialogObject.getPeerDialogId(k7Var.Y1().owner_id)) || k7Var.Y1().resell_amount == null) ? false : true);
        F.l(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new h4(k7Var, T1, 7), T1 != null);
        F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new b2(k7Var, 17), T1 != null);
        F.l(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.GiftOfferToBuyMenu), new b2(k7Var, 18), Y1 != null && Y1.offer_min_stars > 0);
        TL_stars.TL_starGiftUnique Y12 = k7Var.Y1();
        if (Y12 != null && Y12.theme_available) {
            long peerDialogId = DialogObject.getPeerDialogId(Y12.owner_id);
            long peerDialogId2 = DialogObject.getPeerDialogId(Y12.host_id);
            if ((peerDialogId > 0 && c2(k7Var.currentAccount, peerDialogId)) || (peerDialogId2 > 0 && c2(k7Var.currentAccount, peerDialogId2))) {
                z10 = true;
                F.l(R.drawable.msg_colors, LocaleController.getString(R.string.GiftThemesSetIn), new b2(k7Var, 19), z10);
                boolean z13 = k7Var.f1 != null && k7Var.E0 && k7Var.F0 != null && b2(k7Var.currentAccount, k7Var.X);
                TL_stars.SavedStarGift savedStarGift2 = k7Var.F0;
                F.l((savedStarGift2 != null || savedStarGift2.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, LocaleController.getString((savedStarGift2 != null || savedStarGift2.unsaved) ? R.string.Gift2ShowOnProfile : R.string.Gift2HideFromProfile), new b2(k7Var, 7), z13);
                if (k7Var.f1 == null) {
                    if (k7Var.S1() != null) {
                        MessageObject messageObject = k7Var.H0;
                        if (messageObject != null && (message = messageObject.messageOwner) != null) {
                            TLRPC.MessageAction messageAction = message.action;
                            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                                if ((tL_messageActionStarGiftUnique.flags & 16) != 0) {
                                    TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                        c22 = c2(k7Var.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id));
                                        if (c22) {
                                            z11 = true;
                                            F.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new b2(k7Var, 20), z11);
                                            F.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new b2(k7Var, 21), k7Var.f1 != null);
                                            F.l(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new b2(k7Var, 14), (k7Var.F0 == null || k7Var.O1() == 0) ? false : true);
                                            F.t = false;
                                            F.Y = true;
                                            F.s = 0;
                                            F.a0(0.0f, -AndroidUtilities.dp(2.0f));
                                            F.Z();
                                        }
                                    }
                                }
                            }
                        }
                        TL_stars.SavedStarGift savedStarGift3 = k7Var.F0;
                        if (savedStarGift3 != null) {
                            TL_stars.StarGift starGift2 = savedStarGift3.gift;
                            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                                c22 = c2(k7Var.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id));
                                if (c22) {
                                }
                            }
                        }
                        tL_starGiftUnique = k7Var.J0;
                    }
                    c22 = false;
                    if (c22) {
                    }
                }
                z11 = false;
                F.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new b2(k7Var, 20), z11);
                F.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new b2(k7Var, 21), k7Var.f1 != null);
                F.l(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new b2(k7Var, 14), (k7Var.F0 == null || k7Var.O1() == 0) ? false : true);
                F.t = false;
                F.Y = true;
                F.s = 0;
                F.a0(0.0f, -AndroidUtilities.dp(2.0f));
                F.Z();
            }
        }
        z10 = false;
        F.l(R.drawable.msg_colors, LocaleController.getString(R.string.GiftThemesSetIn), new b2(k7Var, 19), z10);
        if (k7Var.f1 != null) {
        }
        TL_stars.SavedStarGift savedStarGift22 = k7Var.F0;
        F.l((savedStarGift22 != null || savedStarGift22.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, LocaleController.getString((savedStarGift22 != null || savedStarGift22.unsaved) ? R.string.Gift2ShowOnProfile : R.string.Gift2HideFromProfile), new b2(k7Var, 7), z13);
        if (k7Var.f1 == null) {
        }
        z11 = false;
        F.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new b2(k7Var, 20), z11);
        F.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new b2(k7Var, 21), k7Var.f1 != null);
        F.l(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new b2(k7Var, 14), (k7Var.F0 == null || k7Var.O1() == 0) ? false : true);
        F.t = false;
        F.Y = true;
        F.s = 0;
        F.a0(0.0f, -AndroidUtilities.dp(2.0f));
        F.Z();
    }

    public static void X(k7 k7Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        int i10 = 1;
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tL_error == null || !"BALANCE_TOO_LOW".equals(tL_error.text)) {
                callback.run(tL_error);
                k7Var.getBulletinFactory().f0(tL_error, false);
                return;
            } else {
                if (!MessagesController.getInstance(k7Var.currentAccount).starsPurchaseAvailable()) {
                    k7Var.k0.setLoading(false);
                    ga.e0(k7Var.getContext(), k7Var.resourcesProvider);
                    return;
                }
                ga y3 = ga.y(k7Var.currentAccount, false);
                a3.h0 h0Var = new a3.h0(k7Var, j12, j10, callback, 1);
                y3.e = false;
                y3.q(false, true, h0Var);
                y3.e = true;
                return;
            }
        }
        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
        MessagesController.getInstance(k7Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
        MessagesController.getInstance(k7Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
        ga.y(k7Var.currentAccount, false).T(false);
        ga.y(k7Var.currentAccount, false).Q(j10);
        ga.y(k7Var.currentAccount, false).Q(j11);
        ga.y(k7Var.currentAccount, false).P();
        callback.run(null);
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            if (j10 < 0 || j11 < 0) {
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, k7Var.Q1(), DialogObject.getShortName(j10))), R.raw.forward);
                M.t = true;
                M.j();
            } else {
                sn W9 = sn.W9(j10);
                W9.whenFullyVisible(new r3(k7Var, W9, j10, 1));
                U.presentFragment(W9);
            }
        }
        Utilities.stageQueue.postRunnable(new i4(k7Var, tL_payments_paymentResult, i10));
    }

    public static /* synthetic */ void X0(k7 k7Var, TL_stars.StarGift starGift, TL_stars.StarGiftAttribute starGiftAttribute, org.telegram.ui.Components.zc[] zcVarArr, boolean[] zArr, ArrayList arrayList) {
        if (arrayList != null) {
            new a2(k7Var.getContext(), k7Var.resourcesProvider, k7Var.currentAccount, starGift.title, arrayList, false).show();
        } else {
            k7Var.L2(zcVarArr[0], LocaleController.formatString(R.string.Gift2RarityHint, gi.l.H0(starGiftAttribute.getRarityPermille())), false);
        }
        zArr[0] = false;
    }

    public static String X1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return LocaleController.getString(R.string.GiftRarityUncommon);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return LocaleController.getString(R.string.GiftRarityRare);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return LocaleController.getString(R.string.GiftRarityEpic);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return LocaleController.getString(R.string.GiftRarityLegendary);
        }
        if (!(starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
            return "";
        }
        int i10 = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
        return i10 <= 0 ? "<0.1%" : gi.l.H0(i10);
    }

    public static void Y0(k7 k7Var, boolean z10, pf.c cVar, Runnable runnable, DialogInterface dialogInterface, Boolean bool) {
        if (!bool.booleanValue()) {
            cVar.c(false);
            dialogInterface.dismiss();
            runnable.run();
        } else {
            UserConfig userConfig = UserConfig.getInstance(k7Var.currentAccount);
            userConfig.tmpPassword = null;
            userConfig.saveConfig(false);
            k7Var.p2(z10, cVar, runnable);
        }
    }

    public static void Z(k7 k7Var, long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, ey eyVar) {
        ChatThemeController.getInstance(k7Var.currentAccount).setDialogTheme(j10, new gg.b(null, tL_starGiftUnique.slug));
        eyVar.presentFragment(sn.W9(j10), true);
    }

    public static /* synthetic */ void Z0(k7 k7Var, TLRPC.TL_messageActionStarGift tL_messageActionStarGift, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(k7Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(k7Var.currentAccount).putChats(messages_messages.chats, false);
            for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                TLRPC.Message message = messages_messages.messages.get(i10);
                if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.id == tL_messageActionStarGift.upgrade_msg_id) {
                    messageObject = new MessageObject(k7Var.currentAccount, message, false, false);
                    messageObject.setType();
                    break;
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new a3.l0(k7Var, b2Var, messageObject, 9));
        } else {
            AndroidUtilities.runOnUIThread(new u4(b2Var, 0));
        }
    }

    public static void a0(k7 k7Var, pf.c cVar, ug.m1 m1Var, String str) {
        cVar.c(false);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        (m1Var != null ? new org.telegram.ui.Components.xc(m1Var.container, k7Var.resourcesProvider) : k7Var.getBulletinFactory()).e0(str, false);
    }

    public static void a1(k7 k7Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        v9 F;
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                if (z10 && k7Var.F0 != null && (F = ga.y(k7Var.currentAccount, false).F(k7Var.X, false)) != null) {
                    F.m(k7Var.F0, !savestargift.unsave);
                }
                k7Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
                return;
            }
            return;
        }
        k7Var.dismiss();
        long O1 = k7Var.O1();
        if (!z10) {
            ga.y(k7Var.currentAccount, false).Q(O1);
        }
        if (O1 >= 0) {
            org.telegram.ui.Components.xc.a0(U).s(document, LocaleController.getString(z11 ? R.string.Gift2MadePrivateTitle : R.string.Gift2MadePublicTitle), AndroidUtilities.replaceSingleTag(LocaleController.getString(z11 ? R.string.Gift2MadePrivate : R.string.Gift2MadePublic), U instanceof ProfileActivity ? null : new ah.k1(O1, U))).k(true);
        } else {
            org.telegram.ui.Components.xc.a0(U).s(document, LocaleController.getString(z11 ? R.string.Gift2ChannelMadePrivateTitle : R.string.Gift2ChannelMadePublicTitle), LocaleController.getString(z11 ? R.string.Gift2ChannelMadePrivate : R.string.Gift2ChannelMadePublic)).j();
        }
    }

    public static void b0(k7 k7Var) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        v9 F;
        TLRPC.Message message;
        ei.d dVar = k7Var.k0;
        if (dVar.N) {
            return;
        }
        TL_stars.InputSavedStarGift S1 = k7Var.S1();
        MessageObject messageObject = k7Var.H0;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            TL_stars.SavedStarGift savedStarGift = k7Var.F0;
            if (savedStarGift == null) {
                return;
            }
            z10 = !savedStarGift.unsaved;
            document = savedStarGift.gift.getDocument();
        } else {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                z10 = tL_messageActionStarGift.saved;
                document = tL_messageActionStarGift.gift.getDocument();
            } else {
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    return;
                }
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                z10 = tL_messageActionStarGiftUnique.saved;
                document = tL_messageActionStarGiftUnique.gift.getDocument();
            }
        }
        TLRPC.Document document2 = document;
        boolean z12 = z10;
        dVar.setLoading(true);
        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
        savestargift.unsave = z12;
        savestargift.stargift = S1;
        if (k7Var.F0 == null || (F = ga.y(k7Var.currentAccount, false).F(k7Var.X, false)) == null) {
            z11 = false;
        } else {
            F.m(k7Var.F0, savestargift.unsave);
            z11 = true;
        }
        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(savestargift, new w4(k7Var, z11, document2, z12, savestargift));
    }

    public static /* synthetic */ void b1(k7 k7Var, TL_stars.InputSavedStarGift inputSavedStarGift, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(k7Var.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(k7Var.currentAccount).putChats(updates.chats, false);
        }
        AndroidUtilities.runOnUIThread(new y0(k7Var, tL_error, tLObject, inputSavedStarGift, 4));
    }

    public static boolean b2(int i10, long j10) {
        return j10 >= 0 ? UserConfig.getInstance(i10).getClientUserId() == j10 : ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), 5);
    }

    public static void c0(final k7 k7Var) {
        int i10;
        long peerDialogId;
        long j10;
        long j11;
        final long clientUserId = UserConfig.getInstance(k7Var.currentAccount).getClientUserId();
        final TL_stars.InputSavedStarGift S1 = k7Var.S1();
        if (S1 == null) {
            return;
        }
        MessageObject messageObject = k7Var.H0;
        if (messageObject != null) {
            i10 = messageObject.messageOwner.date;
            boolean isOutOwner = messageObject.isOutOwner();
            MessageObject messageObject2 = k7Var.H0;
            TLRPC.Message message = messageObject2.messageOwner;
            if (message == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            TLRPC.Peer peer = tL_messageActionStarGift.peer;
            j11 = peer != null ? DialogObject.getPeerDialogId(peer) : isOutOwner ? messageObject2.getDialogId() : clientUserId;
            TLRPC.Peer peer2 = tL_messageActionStarGift.from_id;
            peerDialogId = peer2 != null ? DialogObject.getPeerDialogId(peer2) : isOutOwner ? clientUserId : k7Var.H0.getDialogId();
            j10 = tL_messageActionStarGift.convert_stars;
        } else {
            TL_stars.SavedStarGift savedStarGift = k7Var.F0;
            if (savedStarGift == null) {
                return;
            }
            i10 = savedStarGift.date;
            peerDialogId = ((savedStarGift.flags & 2) == 0 || savedStarGift.name_hidden) ? UserObject.ANONYMOUS : DialogObject.getPeerDialogId(savedStarGift.from_id);
            j10 = k7Var.F0.convert_stars;
            j11 = k7Var.X;
        }
        int max = Math.max(1, (MessagesController.getInstance(k7Var.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(k7Var.currentAccount).getCurrentTime() - i10)) / 86400);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k7Var.getContext(), 0, k7Var.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2ConvertTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2ConvertText2", max, (UserObject.isService(peerDialogId) || peerDialogId == UserObject.ANONYMOUS) ? LocaleController.getString(R.string.StarsTransactionHidden) : DialogObject.getShortName(peerDialogId), LocaleController.formatPluralStringComma("Gift2ConvertStars", (int) j10)));
        final long j12 = j10;
        final long j13 = j11;
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2ConvertButton), new org.telegram.ui.ActionBar.a2() { // from class: ai.t4
            @Override // org.telegram.ui.ActionBar.a2
            public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i11) {
                k7.t0(k7.this, S1, j13, clientUserId, j12);
            }
        });
        i2.d.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void c1(k7 k7Var, pf.c cVar, ug.m1 m1Var, s3 s3Var, TL_stars.starGiftDepositPayload stargiftdepositpayload, TLRPC.TL_error tL_error) {
        if (stargiftdepositpayload != null) {
            s3Var.run(stargiftdepositpayload);
        } else {
            cVar.b();
            (m1Var != null ? new org.telegram.ui.Components.xc(m1Var.container, k7Var.resourcesProvider) : k7Var.getBulletinFactory()).f0(tL_error, false);
        }
    }

    public static boolean c2(int i10, long j10) {
        if (j10 >= 0) {
            return UserConfig.getInstance(i10).getClientUserId() == j10;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        return chat != null && chat.creator;
    }

    public static void d0(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence, org.telegram.ui.ActionBar.b2 b2Var) {
        pf.c g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new j4(k7Var, g10, b2Var, tL_starGiftUnique, j10, charSequence));
    }

    public static void d1(k7 k7Var, ug.m1 m1Var, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        pf.c g10 = b2Var.g(i10, true, true);
        g10.d();
        int i11 = k7Var.currentAccount;
        b4 b4Var = new b4(k7Var, g10, m1Var, 1);
        org.telegram.ui.Wallet.m0 w9 = org.telegram.ui.Wallet.m0.w(i11);
        w9.j0(new w31(i11, b4Var, w9));
    }

    public static boolean d2(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null) {
            return false;
        }
        TLRPC.Peer peer = tL_starGiftUnique.owner_id;
        if (peer == null) {
            peer = tL_starGiftUnique.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        if (peerDialogId == 0) {
            return false;
        }
        if (peerDialogId > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            if (user != null) {
                TLRPC.EmojiStatus emojiStatus = user.emoji_status;
                return (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_starGiftUnique.id;
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void e0(k7 k7Var, ug.m1[] m1VarArr, Long l4) {
        if (l4.longValue() != -97) {
            if (l4.longValue() == -99 || l4.longValue() == -98) {
                return;
            }
            k7Var.r2(l4.longValue(), 0L, false, new l3(k7Var, l4, m1VarArr, 1));
            return;
        }
        ug.m1 m1Var = m1VarArr[0];
        TL_stars.TL_starGiftUnique Y1 = k7Var.Y1();
        if (k7Var.f1 == null || Y1 == null || TextUtils.isEmpty(Y1.slug)) {
            return;
        }
        long clientUserId = UserConfig.getInstance(k7Var.currentAccount).getClientUserId();
        TextView textView = new TextView(k7Var.getContext());
        textView.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.h6.r5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, k7Var.resourcesProvider));
        textView.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        spannableStringBuilder.setSpan(new ca0(AndroidUtilities.dp(160.0f), textView), 0, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = new TL_stars.starGiftDepositPayload[1];
        Runnable[] runnableArr = new Runnable[1];
        boolean[] zArr = new boolean[1];
        TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
        depositstargift.peer = MessagesController.getInstance(k7Var.currentAccount).getInputPeer(clientUserId);
        depositstargift.slug = Y1.slug;
        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequestTyped(depositstargift, new org.telegram.messenger.a(), new v3(k7Var, zArr, textView, stargiftdepositpayloadArr, runnableArr, 0));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k7Var.getContext(), 0, k7Var.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2MoveToMyGifts);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.Gift2MoveToMyGiftsText);
        TLRPC.User currentUser = UserConfig.getInstance(k7Var.currentAccount).getCurrentUser();
        LinearLayout linearLayout = new LinearLayout(k7Var.getContext());
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(k7Var.getContext());
        int dp = AndroidUtilities.dp(20.0f);
        int i11 = org.telegram.ui.ActionBar.h6.j5;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(dp, org.telegram.ui.ActionBar.h6.m1(0.045f, org.telegram.ui.ActionBar.h6.w0(i11, k7Var.resourcesProvider))));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(k7Var.getContext());
        w9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.r(currentUser);
        w9Var.e(currentUser, h9Var);
        frameLayout.addView(w9Var, w7.z5.d(42, 42.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(k7Var.getContext());
        com.google.android.gms.internal.play_billing.k3.m(16.0f, 1, textView2);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, k7Var.resourcesProvider));
        textView2.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setText(Emoji.replaceEmoji(UserObject.getUserName(currentUser), textView2.getPaint().getFontMetricsInt(), false));
        frameLayout.addView(textView2, w7.z5.d(-1, -2.0f, 51, 66.0f, 11.0f, 12.0f, 0.0f));
        TextView textView3 = new TextView(k7Var.getContext());
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, k7Var.resourcesProvider));
        textView3.setSingleLine();
        textView3.setEllipsize(truncateAt);
        if (currentUser != null && !TextUtils.isEmpty(currentUser.phone)) {
            textView3.setText(jf.b.c().b("+" + currentUser.phone));
        } else if (currentUser != null && UserObject.getPublicUsername(currentUser) != null) {
            textView3.setText("@" + UserObject.getPublicUsername(currentUser));
        }
        frameLayout.addView(textView3, w7.z5.d(-1, -2.0f, 51, 66.0f, 33.0f, 12.0f, 0.0f));
        linearLayout.addView(frameLayout, w7.z5.k(20.0f, 0.0f, 20.0f, 16.0f, -1, 62));
        TextView textView4 = new TextView(k7Var.getContext());
        textView4.setTextSize(1, 15.0f);
        org.telegram.ui.Cells.c1.q(i11, k7Var.resourcesProvider, textView4, 17);
        textView4.setText(LocaleController.getString(R.string.Gift2MoveAppearIn));
        linearLayout.addView(textView4, w7.z5.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(k7Var.getContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, k7Var.resourcesProvider);
        k7Var.D1(linearLayout2, R.drawable.msg_openprofile, 14, w02, LocaleController.getString(R.string.MyProfile), true);
        k7Var.D1(linearLayout2, R.drawable.menu_gift, 14, w02, LocaleController.getString(R.string.ProfileGifts), false);
        linearLayout.addView(linearLayout2, w7.z5.t(-2, -2, 1, 0, 7, 0, 3));
        linearLayout.addView(textView, w7.z5.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.a.G = 20;
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2Move), new w3(k7Var, clientUserId, stargiftdepositpayloadArr, m1Var, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        x3 x3Var = new x3(0, zArr, runnableArr);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.setOnDismissListener(x3Var);
        b2Var.show();
    }

    public static void e1(k7 k7Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        b2 b2Var = k7Var.u1;
        k7Var.r1 = false;
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            org.telegram.ui.Components.qc Y = k7Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
        } else {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(k7Var.currentAccount).putUsers(paymentForm.users, false);
            k7Var.s1 = paymentForm;
            AndroidUtilities.cancelRunOnUIThread(b2Var);
            AndroidUtilities.runOnUIThread(b2Var);
        }
    }

    public static /* synthetic */ void f0(k7 k7Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TL_account.tmpPassword)) {
            k7Var.i2(tL_error, twoStepVerificationActivity, z10);
            return;
        }
        TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
        UserConfig.getInstance(k7Var.currentAccount).tmpPassword = tmppassword;
        UserConfig.getInstance(k7Var.currentAccount).saveConfig(false);
        k7Var.a2(tmppassword.tmp_password, twoStepVerificationActivity, z10, null);
    }

    public static /* synthetic */ void f1(long j10, long j11, k7 k7Var, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(k7Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new h3(j10, j11, k7Var, callback, tLObject, tL_error));
    }

    public static /* synthetic */ void g0(k7 k7Var, int i10, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i11 = 0; i11 < messages_messages.messages.size(); i11++) {
                TLRPC.Message message = messages_messages.messages.get(i11);
                if (message != null && message.id == i10) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                        messageObject = new MessageObject(k7Var.currentAccount, message, false, false);
                        messageObject.setType();
                        break;
                    }
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new a3.l0(k7Var, tLObject, messageObject, 6));
        }
    }

    public static void h0(k7 k7Var, Utilities.Callback2 callback2, ArrayList arrayList, Runnable runnable, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        MessageObject messageObject;
        if (updates != null) {
            ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateNewMessage.class);
            int size = findUpdates.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    messageObject = null;
                    break;
                }
                Object obj = findUpdates.get(i11);
                i11++;
                TLRPC.Message message = ((TL_update.TL_updateNewMessage) obj).message;
                if (message != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    messageObject = new MessageObject(k7Var.currentAccount, message, false, false);
                    break;
                }
            }
            MessagesController.getInstance(k7Var.currentAccount).lambda$processUpdates$377(updates, false);
            if (messageObject != null) {
                TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageObject.messageOwner.action).gift;
                callback2.run(starGift, new y0(k7Var, messageObject, arrayList, starGift, 3));
                return;
            }
            callback2.run(null, null);
            ga.y(k7Var.currentAccount, false).P();
            y9 G = ga.y(k7Var.currentAccount, false).G(UserConfig.getInstance(k7Var.currentAccount).getClientUserId(), false);
            if (G != null) {
                G.k(arrayList, null);
                return;
            }
            return;
        }
        if (tL_error != null) {
            if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                alertDialog$Builder = new AlertDialog$Builder(k7Var.getContext(), 0, new ci.b());
                String string = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftUnavailableText));
                i10 = R.string.OK;
            } else {
                String str = tL_error.text;
                if (str == null || !str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                    k7Var.getBulletinFactory().f0(tL_error, false);
                    runnable.run();
                }
                long parseLong = Long.parseLong(tL_error.text.substring(25)) + ConnectionsManager.getInstance(k7Var.currentAccount).getCurrentTime();
                alertDialog$Builder = new AlertDialog$Builder(k7Var.getContext(), 0, new ci.b());
                String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
                b2Var2.R = string2;
                b2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(parseLong, true)));
                i10 = R.string.OK;
            }
            org.telegram.messenger.g0.p(i10, alertDialog$Builder, null);
            runnable.run();
        }
    }

    public static /* synthetic */ void h1(k7 k7Var, boolean[] zArr, TL_stars.StarGiftAttribute starGiftAttribute, org.telegram.ui.Components.zc[] zcVarArr) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        TL_stars.StarGift P1 = k7Var.P1();
        GiftAuctionController.getInstance(k7Var.currentAccount).requestAuctionUpgrades(P1.gift_id, new d3(k7Var, P1, starGiftAttribute, zcVarArr, zArr, 0));
    }

    public static /* synthetic */ void i0(k7 k7Var, ArrayList arrayList, Utilities.Callback2 callback2, Runnable runnable) {
        yh.e4 e4Var = k7Var.W0;
        if (e4Var != null) {
            e4Var.b();
            k7Var.W0 = null;
        }
        TL_stars.craftStarGift craftstargift = new TL_stars.craftStarGift();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = ((TL_stars.StarGift) obj).slug;
            craftstargift.stargift.add(tL_inputSavedStarGiftSlug);
        }
        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequestTyped(craftstargift, new org.telegram.messenger.a(), new t2(k7Var, callback2, arrayList, runnable, 0));
    }

    public static void i1(final k7 k7Var) {
        final TL_stars.TL_starGiftUnique Y1 = k7Var.Y1();
        if (Y1 == null || TextUtils.isEmpty(Y1.slug)) {
            return;
        }
        final boolean z10 = Y1.host_id == null;
        if (k7Var.w1 == null) {
            k7Var.w1 = Boolean.valueOf(!z10);
        }
        k7Var.I2(Y1, z10);
        final int i10 = k7Var.v1 + 1;
        k7Var.v1 = i10;
        TL_stars.displayStarGift displaystargift = new TL_stars.displayStarGift();
        displaystargift.peer = z10 ? MessagesController.getInstance(k7Var.currentAccount).getInputPeer(UserConfig.getInstance(k7Var.currentAccount).getClientUserId()) : null;
        displaystargift.slug = Y1.slug;
        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequestTyped(displaystargift, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: ai.f2
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                boolean z11 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue;
                k7 k7Var2 = k7.this;
                if (z11) {
                    k7Var2.w1 = Boolean.valueOf(z10);
                    return;
                }
                if (i10 != k7Var2.v1) {
                    return;
                }
                k7Var2.I2(Y1, k7Var2.w1.booleanValue());
                k7Var2.getBulletinFactory().e0(tL_error != null ? tL_error.text : "NULL_ERROR", false);
            }
        });
    }

    public static void j1(k7 k7Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        b2Var.c(400L);
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        int i10 = 1;
        int i11 = 0;
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                k7Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
                return;
            } else {
                k7Var.getBulletinFactory().t(LocaleController.getString(R.string.UnknownError), null).k(false);
                return;
            }
        }
        k7Var.dismiss();
        ga.y(k7Var.currentAccount, false).Q(j10);
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            bundle.putBoolean("start_from_monetization", true);
            r91 r91Var = new r91(bundle);
            k0.g(k7Var.currentAccount).h(j10, true);
            k0.g(k7Var.currentAccount).l(j10);
            r91Var.whenFullyVisible(new t3(r91Var, j12, i10));
            U.presentFragment(r91Var);
            return;
        }
        TLRPC.UserFull userFull = MessagesController.getInstance(k7Var.currentAccount).getUserFull(j11);
        if (userFull != null) {
            int max = Math.max(0, userFull.stargifts_count - 1);
            userFull.stargifts_count = max;
            if (max <= 0) {
                userFull.flags2 &= -257;
            }
        }
        ga.y(k7Var.currentAccount, false).P();
        ga.y(k7Var.currentAccount, false).T(true);
        if (U instanceof md) {
            org.telegram.ui.Components.xc.a0(U).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j12), R.raw.stars_topup).k(true);
            return;
        }
        md mdVar = new md();
        mdVar.whenFullyVisible(new t3(mdVar, j12, i11));
        U.presentFragment(mdVar);
    }

    public static /* synthetic */ void k0(k7 k7Var, String str) {
        k7Var.dismiss();
        pf.d.r(k7Var.getContext(), "https://" + MessagesController.getInstance(k7Var.currentAccount).linkPrefix + "/" + str);
    }

    public static void k1(k7 k7Var, TLRPC.TL_error tL_error, Utilities.Callback callback, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLObject tLObject) {
        if (k7Var.getContext() == null) {
            return;
        }
        if (tL_error != null && callback != null && tL_error.text.startsWith("TMP_PASSWORD")) {
            callback.run(Boolean.TRUE);
            return;
        }
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        if (tL_error != null) {
            k7Var.i2(tL_error, twoStepVerificationActivity, z10);
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
        }
        if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
            pf.d.t(k7Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url);
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tLObject instanceof TLRPC.TL_boolFalse) {
                org.telegram.ui.Components.xc.b0("NULL_ERROR");
                return;
            }
            return;
        }
        TL_stars.TL_starGiftUnique Y1 = k7Var.Y1();
        org.telegram.ui.Wallet.m0 w9 = org.telegram.ui.Wallet.m0.w(k7Var.currentAccount);
        org.telegram.ui.Wallet.g gVar = w9.z;
        Object obj = null;
        String str = Y1 != null ? Y1.gift_address : null;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        w9.x = str;
        w9.y = 0;
        if (w9.o == null) {
            w9.o = new org.telegram.ui.Wallet.e0(w9);
        }
        org.telegram.ui.Wallet.e0 e0Var = w9.o;
        if (!e0Var.j) {
            e0Var.b();
            e0Var.f(true);
        }
        w9.A().f();
        w9.C();
        int i10 = w9.y;
        if (i10 < 7) {
            w9.y = i10 + 1;
            AndroidUtilities.runOnUIThread(gVar, org.telegram.ui.Wallet.m0.P[i10]);
        }
        if (Y1 != null && !TextUtils.isEmpty(Y1.slug)) {
            AndroidUtilities.runOnUIThread(new a3.l0(obj, Y1.getDocument(), LocaleController.getString(R.string.Gift2MovedToWallet), 8));
        }
        k7Var.dismiss();
    }

    public static void l0(k7 k7Var, String str) {
        long j10 = k7Var.X;
        k7Var.k0.setLoading(false);
        if (TextUtils.isEmpty(str)) {
            k7Var.O2(0, true, null);
            return;
        }
        k7Var.dismiss();
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (R instanceof sn) {
            sn snVar = (sn) R;
            if (snVar.a() == j10) {
                org.telegram.ui.Components.xc.a0(snVar).M(LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(j10))), R.raw.gift).k(true);
                return;
            }
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(k7Var.currentAccount);
        int i10 = NotificationCenter.closeProfileActivity;
        Long valueOf = Long.valueOf(j10);
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, valueOf, bool);
        NotificationCenter.getInstance(k7Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j10), bool);
        sn W9 = sn.W9(j10);
        W9.whenFullyVisible(new a1.f(21, k7Var, W9));
        R.presentFragment(W9);
    }

    public static void l1(final k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, final String str) {
        final long j10 = tL_starGiftUnique.gift_id;
        final String str2 = tL_starGiftUnique.title;
        final String Q1 = k7Var.Q1();
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        String str3 = tL_starGiftUnique.slug;
        final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ApplicationLoader.applicationContext, 3, null);
        b2Var.q(500L);
        TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
        getuniquestargiftvalueinfo.slug = str3;
        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(getuniquestargiftvalueinfo, new RequestDelegate() { // from class: ai.s2
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final k7 k7Var2 = k7.this;
                final org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                final TLRPC.Document document2 = document;
                final String str4 = str;
                final String str5 = str2;
                final String str6 = Q1;
                final long j11 = j10;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ai.n3
                    @Override // java.lang.Runnable
                    public final void run() {
                        k7.S0(k7.this, b2Var2, tLObject, document2, str4, str5, str6, j11, tL_error);
                    }
                });
            }
        });
    }

    public static void m1(k7 k7Var, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            b2Var.dismiss();
            k7Var.O0 = true;
            k7Var.F2(savedStarGift, null);
            super.show();
            return;
        }
        b2Var.dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            org.telegram.ui.Components.qc Q = org.telegram.ui.Components.xc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
            Q.t = true;
            Q.j();
        }
    }

    public static /* synthetic */ void n0(k7 k7Var, long j10, long j11, Utilities.Callback callback) {
        cd cdVar = new cd(k7Var.getContext(), k7Var.resourcesProvider, j10, 11, null, new b3(k7Var, new boolean[]{false}, j11, callback, 2), 0L);
        cdVar.setOnDismissListener(new n4(k7Var, 1));
        cdVar.show();
    }

    public static void n1(k7 k7Var, TLObject tLObject, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            callback.run(tL_error);
            org.telegram.ui.Components.qc Y = k7Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
            return;
        }
        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
        int i10 = 0;
        MessagesController.getInstance(k7Var.currentAccount).putUsers(paymentForm.users, false);
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftTransfer;
        ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
        int size = arrayList.size();
        long j12 = 0;
        while (i10 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
            i10++;
            j12 += tL_labeledPrice.amount;
        }
        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new x2(k7Var, j10, j11, callback, j12));
    }

    public static void o0(k7 k7Var, pf.c cVar, ug.m1 m1Var, String str) {
        cVar.b();
        if (str != null) {
            (m1Var != null ? new org.telegram.ui.Components.xc(m1Var.container, k7Var.resourcesProvider) : k7Var.getBulletinFactory()).e0(str, false);
            return;
        }
        if (m1Var != null) {
            m1Var.dismiss();
        }
        k7Var.dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U instanceof org.telegram.ui.Wallet.n5) {
            ((org.telegram.ui.Wallet.n5) U).I0();
        }
    }

    public static /* synthetic */ void p0(k7 k7Var, long j10) {
        cd cdVar = new cd(k7Var.getContext(), k7Var.resourcesProvider, j10, 10, null, new a1.f(22, k7Var, new boolean[]{false}), 0L);
        cdVar.setOnDismissListener(new n4(k7Var, 0));
        cdVar.show();
    }

    public static void p1(k7 k7Var, long j10) {
        new yh.o1(k7Var.getContext(), k7Var.currentAccount, j10, null, new g4(k7Var, 1)).show();
    }

    public static void q0(k7 k7Var, TLObject tLObject, a3.l0 l0Var, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.TL_messages_chatFull)) {
            org.telegram.ui.Components.qc Y = k7Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
            return;
        }
        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
        MessagesController.getInstance(k7Var.currentAccount).putUsers(tL_messages_chatFull.users, false);
        MessagesController.getInstance(k7Var.currentAccount).putChats(tL_messages_chatFull.chats, false);
        MessagesController.getInstance(k7Var.currentAccount).putChatFull(tL_messages_chatFull.full_chat);
        if (tL_messages_chatFull.full_chat.stargifts_available) {
            l0Var.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k7Var.getContext(), 0, k7Var.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
        org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
    }

    public static void q1(k7 k7Var, TLObject tLObject, CharSequence charSequence, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            if (tL_error != null) {
                k7Var.getBulletinFactory().f0(tL_error, false);
                return;
            }
            return;
        }
        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
        ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
        int size = arrayList.size();
        long j10 = 0;
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
            i10++;
            j10 += tL_labeledPrice.amount;
        }
        LinearLayout linearLayout = new LinearLayout(k7Var.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        TextView b10 = w7.d6.b(k7Var.getContext(), 16.0f, org.telegram.ui.ActionBar.h6.j5, false, null);
        b10.setText(LocaleController.getString(R.string.Gift2RemoveDescriptionText));
        linearLayout.addView(b10, w7.z5.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
        j01 j01Var = new j01(k7Var.getContext(), k7Var.resourcesProvider);
        h01 a2 = j01Var.a(charSequence);
        a2.setFilled(true);
        wh.n nVar = (wh.n) a2.getChildAt(0);
        nVar.setTextSize(1, 12.0f);
        nVar.setGravity(17);
        linearLayout.addView(j01Var, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k7Var.getContext(), 0, k7Var.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2RemoveDescriptionTitle);
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(md.R0(LocaleController.formatString(R.string.Gift2RemoveDescriptionButton, Integer.valueOf((int) j10))), new z3(k7Var, tL_starGiftUnique, paymentForm, tL_inputInvoiceStarGiftDropOriginalDetails, j10, charSequence));
        alertDialog$Builder.o();
    }

    public static void r0(k7 k7Var, long j10) {
        new yh.o1(k7Var.getContext(), k7Var.currentAccount, j10, null, new g4(k7Var, 1)).show();
    }

    public static void r1(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback callback, Boolean bool) {
        if (k7Var.W0 == null) {
            yh.e4 e4Var = new yh.e4(k7Var.currentAccount, tL_starGiftUnique.gift_id);
            k7Var.W0 = e4Var;
            e4Var.a();
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            b6[] b6VarArr = k7Var.f0.M.n;
            if (i10 >= b6VarArr.length) {
                yh.f4 f4Var = new yh.f4(k7Var.getContext(), tL_starGiftUnique.title, k7Var.W0);
                f4Var.g0.addAll(hashSet);
                f4Var.i0.N(true);
                f4Var.h0 = bool.booleanValue();
                f4Var.e0.set(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSelect", 4 - hashSet.size(), new Object[0])));
                f4Var.f0 = new p2(0, callback);
                f4Var.show();
                return;
            }
            TL_stars.StarGift starGift = b6VarArr[i10].h;
            if ((starGift != null ? starGift : null) != null) {
                if (starGift == null) {
                    starGift = null;
                }
                hashSet.add(Long.valueOf(starGift.id));
            }
            i10++;
        }
    }

    public static void s0(k7 k7Var) {
        TL_stars.TL_starGiftUnique Y1 = k7Var.Y1();
        new b1(k7Var.getContext(), k7Var.currentAccount, DialogObject.getPeerDialogId(Y1.owner_id), Y1, k7Var.resourcesProvider, new b2(k7Var, 5)).show();
    }

    public static void s1(k7 k7Var, pf.c cVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        cVar.c(false);
        b2Var.dismiss();
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                new cd(k7Var.getContext(), k7Var.resourcesProvider, j10, 16, null, new a1.f(24, k7Var, charSequence), 0L).show();
                return;
            } else {
                if (tL_error != null) {
                    k7Var.getBulletinFactory().f0(tL_error, false);
                    return;
                }
                return;
            }
        }
        int i10 = 0;
        while (i10 < tL_starGiftUnique.attributes.size()) {
            if (tL_starGiftUnique.attributes.get(i10) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                tL_starGiftUnique.attributes.remove(i10);
                i10--;
            }
            i10++;
        }
        TL_stars.SavedStarGift savedStarGift = k7Var.F0;
        k7Var.G2(tL_starGiftUnique, savedStarGift != null ? savedStarGift.refunded : false, null, null);
        AndroidUtilities.runOnUIThread(new a1.f(23, k7Var, tL_starGiftUnique));
    }

    public static void t0(k7 k7Var, TL_stars.InputSavedStarGift inputSavedStarGift, long j10, long j11, long j12) {
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ApplicationLoader.applicationContext, 3, null);
        b2Var.q(500L);
        TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
        convertstargift.stargift = inputSavedStarGift;
        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(convertstargift, new x2(k7Var, b2Var, j10, j11, j12));
    }

    public static void t1(k7 k7Var, boolean z10) {
        int U1 = k7Var.U1();
        if (U1 < 0) {
            return;
        }
        int i10 = (z10 ? 1 : -1) + U1;
        int i11 = k7Var.U0;
        if (i11 >= 0 && (!z10 ? i11 < U1 : i11 > U1)) {
            i10 = i11;
        }
        z9 z9Var = k7Var.G0;
        Object obj = (z9Var == null || i10 < 0 || i10 >= z9Var.e()) ? null : k7Var.G0.get(i10);
        if (obj == null) {
            return;
        }
        if ((z10 ? k7Var.d0 : k7Var.c0) != null) {
            if (obj instanceof TL_stars.SavedStarGift) {
                if (L1((z10 ? k7Var.d0 : k7Var.c0).F0, (TL_stars.SavedStarGift) obj)) {
                    return;
                }
            }
            if (obj instanceof TL_stars.TL_starGiftUnique) {
                if (M1((z10 ? k7Var.d0 : k7Var.c0).J0, (TL_stars.TL_starGiftUnique) obj)) {
                    return;
                }
            }
        }
        yh.k2 k2Var = new yh.k2(k7Var, k7Var.getContext(), k7Var.currentAccount, k7Var.X, k7Var.resourcesProvider, k7Var.Y.getRootView());
        if (obj instanceof TL_stars.SavedStarGift) {
            k2Var.F2((TL_stars.SavedStarGift) obj, k7Var.G0);
        } else if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            k2Var.D2(tL_starGiftUnique.slug, tL_starGiftUnique, k7Var.G0);
        }
        AndroidUtilities.removeFromParent(k2Var.containerView);
        if (z10) {
            k7Var.d0 = k2Var;
        } else {
            k7Var.c0 = k2Var;
        }
    }

    public static /* synthetic */ void u0(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(k7Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new f3(k7Var, tL_starGiftUnique, aVar, runnable, 0));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new g3(k7Var, tL_error, runnable, 0));
        }
    }

    public static void u1(final k7 k7Var, final View view) {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        ei.ob b10 = view instanceof org.telegram.ui.Cells.e7 ? ei.qb.b((org.telegram.ui.Cells.e7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = k7Var.H0;
        if (messageObject != null) {
            arrayList.add(messageObject);
        } else {
            if (!(k7Var.P1() instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            long clientUserId = UserConfig.getInstance(k7Var.currentAccount).getClientUserId();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) k7Var.P1();
            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
            tL_messageService.peer_id = MessagesController.getInstance(k7Var.currentAccount).getPeer(clientUserId);
            tL_messageService.from_id = MessagesController.getInstance(k7Var.currentAccount).getPeer(clientUserId);
            tL_messageService.date = ConnectionsManager.getInstance(k7Var.currentAccount).getCurrentTime();
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
            tL_messageActionStarGiftUnique.gift = tL_starGiftUnique;
            tL_messageActionStarGiftUnique.upgrade = true;
            tL_messageService.action = tL_messageActionStarGiftUnique;
            MessageObject messageObject2 = new MessageObject(k7Var.currentAccount, tL_messageService, false, false);
            messageObject2.setType();
            arrayList.add(messageObject2);
        }
        final ei.vb D = ei.vb.D(launchActivity, k7Var.currentAccount);
        D.R = new Utilities.Callback4() { // from class: ai.g2
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l4 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                ei.vb vbVar = D;
                ei.ob obVar = null;
                if (booleanValue) {
                    k7 k7Var2 = k7.this;
                    AndroidUtilities.runOnUIThread(new a1.f(17, k7Var2, l4));
                    vbVar.X(null);
                    a5 a5Var = k7Var2.Z0;
                    if (a5Var != null) {
                        a5Var.dismiss();
                        k7Var2.Z0 = null;
                    }
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.e7) && view2.isAttachedToWindow()) {
                        obVar = ei.qb.b((org.telegram.ui.Cells.e7) view2);
                    }
                    vbVar.X(obVar);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        D.T(b10, ei.a8.y(arrayList));
    }

    public static void v0(k7 k7Var) {
        if (k7Var.s1 == null) {
            return;
        }
        long j10 = 0;
        for (int i10 = 0; i10 < k7Var.s1.invoice.prices.size(); i10++) {
            j10 += k7Var.s1.invoice.prices.get(i10).amount;
        }
        g7 g7Var = new g7(k7Var.getContext(), j10, k7Var.p1, k7Var.resourcesProvider);
        k7Var.q0 = g7Var;
        g7Var.show();
    }

    public static void w0(k7 k7Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, MessagesController messagesController, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        k7Var.k0.setLoading(false);
        z4 z4Var = new z4(k7Var, 0);
        sg.k0 k0Var = new sg.k0(26, k7Var.currentAccount, k7Var.getContext(), z4Var, k7Var.resourcesProvider);
        k0Var.H1(canApplyBoost);
        k0Var.G1(tL_premium_boostsStatus, true);
        k0Var.I1(j10);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        if (chat != null) {
            k0Var.Q0 = new m3(k7Var, chat);
        }
        k0Var.show();
    }

    public static void x0(k7 k7Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        k7Var.r1 = false;
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            org.telegram.ui.Components.qc Y = k7Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
        } else {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(k7Var.currentAccount).putUsers(paymentForm.users, false);
            k7Var.s1 = paymentForm;
            k7Var.u2();
        }
    }

    public static void x2(org.telegram.ui.ActionBar.n2 n2Var) {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
        l2Var.a = true;
        U.showAsSheet(n2Var, l2Var);
    }

    public static void z0(k7 k7Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        k7Var.J0 = tL_starGiftUnique;
        k7Var.G2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence A() {
        return this.V0;
    }

    public final void B1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        char c10;
        s6 s6Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        k7 k7Var;
        y0 y0Var;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            string = LocaleController.getString(R.string.Gift2AttributeModel);
            c10 = 2;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            string = LocaleController.getString(R.string.Gift2AttributeSymbol);
            c10 = 1;
        } else {
            if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
                return;
            }
            string = LocaleController.getString(R.string.Gift2AttributeBackdrop);
            c10 = 0;
        }
        if (!this.Q0 && ((s6Var = this.P0) == null || !s6Var.o)) {
            boolean[] zArr = new boolean[1];
            org.telegram.ui.Components.zc[] zcVarArr = new org.telegram.ui.Components.zc[1];
            Integer[] numArr = new Integer[1];
            String X1 = X1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                y0Var = new y0(this, zArr, starGiftAttribute2, zcVarArr, 1);
                k7Var = this;
            } else {
                starGiftAttribute2 = starGiftAttribute;
                k7Var = this;
                y0Var = null;
            }
            zcVarArr[0] = (org.telegram.ui.Components.zc) ((g01) k7Var.i0.e(string, starGiftAttribute2.name, X1, y0Var, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        x6 x6Var = new x6(getContext(), this.resourcesProvider, new h2(this, 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        j01 j01Var = this.i0;
        tableRow.addView(new i01(j01Var, string), layoutParams);
        tableRow.addView(new g01(j01Var, x6Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        j01Var.addView(tableRow);
        s6 s6Var2 = this.P0;
        if (s6Var2 != null) {
            if (c10 == 0) {
                s6Var2.d = x6Var;
            }
            if (c10 == 1) {
                s6Var2.c = x6Var;
            }
            if (c10 == 2) {
                s6Var2.b = x6Var;
            }
        }
    }

    public final void C2(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.password = inputCheckPasswordSRP;
        gettmppassword.period = 600;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(gettmppassword, new k4(this, twoStepVerificationActivity, z10, 0));
    }

    public final void D1(LinearLayout linearLayout, int i10, int i11, int i12, String str, boolean z10) {
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.r5, this.resourcesProvider);
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(i10);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(i12, mode));
        linearLayout.addView(imageView, w7.z5.t(i11, i11, 16, i11 < 15 ? 1 : 0, 0, i11 < 15 ? 1 : 0, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(w02);
        textView.setText(str);
        linearLayout.addView(textView, w7.z5.t(-2, -2, 16, 4, 0, 0, 0));
        if (z10) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.msg_mini_topicarrow);
            imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
            linearLayout.addView(imageView2, w7.z5.t(11, 11, 16, 5, 0, 2, 0));
        }
    }

    public final void D2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, z9 z9Var) {
        s6 s6Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.I0 = str;
        this.J0 = tL_starGiftUnique;
        this.G0 = z9Var;
        this.K0 = (tL_starGiftUnique.resell_amount == null || b2(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) ? false : true;
        if (!this.Q0 && (s6Var = this.P0) != null && s6Var.o && (tL_starGiftUnique2 = s6Var.l) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            s6Var.a();
            this.P0 = null;
            e7 e7Var = this.f0;
            e7Var.b.setAlpha(1.0f);
            e7Var.c.setAlpha(0.0f);
        }
        this.e0.b(this.currentAccount, this.F0);
        G2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        boolean z10 = tL_starGiftUnique.host_id != null;
        TL_wallet.walletTransaction wallettransaction = this.i1;
        x90 x90Var = this.h0;
        if (wallettransaction != null || !z10 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            x90Var.setVisibility(8);
        } else {
            x90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new h4(this, str3, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            x90Var.setVisibility(0);
            x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q5, this.resourcesProvider));
        }
        TL_wallet.walletTransaction wallettransaction2 = this.i1;
        x90 x90Var2 = this.j0;
        if (wallettransaction2 != null || z10 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            x90Var2.setVisibility(8);
        } else {
            x90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new h4(this, str3, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            x90Var2.setVisibility(0);
        }
        S2();
        if (this.K0) {
            H2(tL_starGiftUnique);
            this.k0.setOnClickListener(new c2(this, 11));
        }
        if (this.e1) {
            O2(0, false, null);
            this.c.n0(1);
            this.e1 = false;
        }
        R2();
    }

    public final void E1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            ga.y(this.currentAccount, false).Q(O1());
            dismiss();
            return;
        }
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            message = ((TL_update.TL_updateNewMessage) update).message;
        } else {
            if (updates.updates != null) {
                for (int i10 = 0; i10 < updates.updates.size(); i10++) {
                    TLRPC.Update update2 = updates.updates.get(i10);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        message = ((TL_update.TL_updateNewMessage) update2).message;
                        break;
                    }
                }
            }
            message = null;
        }
        if (message == null) {
            ga.y(this.currentAccount, false).Q(O1());
            dismiss();
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.F0;
        if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                this.Q0 = true;
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                TL_stars.SavedStarGift savedStarGift2 = this.F0;
                savedStarGift2.gift = tL_messageActionStarGiftUnique.gift;
                int i11 = savedStarGift2.flags | 8;
                savedStarGift2.msg_id = message.id;
                savedStarGift2.flags = i11 & (-2049);
                savedStarGift2.saved_id = 0L;
                savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                savedStarGift2.can_upgrade = false;
                savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                F2(savedStarGift2, this.G0);
                this.o1 = null;
                this.Q0 = false;
                z9 z9Var = this.G0;
                if (z9Var != null) {
                    z9Var.d();
                } else {
                    ga.y(this.currentAccount, false).Q(this.X);
                }
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
        }
        if (this.G0 == null) {
            ga.y(this.currentAccount, false).Q(O1());
        }
        this.Q0 = true;
        this.F0 = null;
        this.E0 = false;
        MessageObject messageObject = new MessageObject(this.currentAccount, message, false, false);
        messageObject.setType();
        E2(messageObject, this.G0);
        this.o1 = null;
        this.Q0 = false;
        AndroidUtilities.runOnUIThread(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:318:0x033f, code lost:
    
        if (c2(r55.currentAccount, org.telegram.messenger.DialogObject.getPeerDialogId(r8)) != false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0352, code lost:
    
        if (r42 > 0) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0395, code lost:
    
        if (r41 == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0397, code lost:
    
        if (r28 == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x039b, code lost:
    
        if (r25 <= 0) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x039d, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.Gift2Info2OutUpgrade, r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x03af, code lost:
    
        if (r44 == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x03b1, code lost:
    
        if (r22 != false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x03b3, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.Gift2InfoOutPinned, r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x03bf, code lost:
    
        if (r22 == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x03c1, code lost:
    
        r1 = "Gift2InfoOutConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x03c6, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatPluralStringComma(r1, (int) r2, r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x03c4, code lost:
    
        r1 = "Gift2InfoOut";
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x03d3, code lost:
    
        if (r22 == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x03d5, code lost:
    
        if (r37 == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x03d7, code lost:
    
        r1 = "Gift2InfoChannelConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x03e4, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatPluralStringComma(r1, (int) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x03da, code lost:
    
        r1 = "Gift2InfoConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x03dd, code lost:
    
        if (r37 == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x03df, code lost:
    
        r1 = "Gift2Info3Channel";
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x03e2, code lost:
    
        r1 = "Gift2Info3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0393, code lost:
    
        if (r7 > 0) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
    
        if (r11 != r10.id) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0408  */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v60, types: [org.telegram.ui.Components.i01[], org.telegram.ui.Components.yq[], org.telegram.ui.Components.zc[]] */
    /* JADX WARN: Type inference failed for: r7v61 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E2(MessageObject messageObject, z9 z9Var) {
        boolean z10;
        boolean z11;
        TL_stars.StarGift starGift;
        TLRPC.Peer peer;
        TLRPC.Peer peer2;
        long j10;
        long j11;
        int i10;
        TLRPC.Peer peer3;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        String str;
        boolean z16;
        boolean z17;
        int i11;
        String formatString;
        String string;
        TLRPC.Peer peer4;
        boolean z18;
        String str2;
        char c10;
        CharSequence charSequence;
        int i12;
        CharSequence concat;
        int i13;
        j01 j01Var;
        boolean z19;
        int i14;
        boolean z20;
        TL_stars.StarGift starGift2;
        TLRPC.Document document;
        TL_stars.StarGift starGift3;
        boolean z21;
        TLRPC.Peer peer5;
        boolean z22;
        int i15;
        ?? r72;
        String string2;
        SpannableStringBuilder replaceTags;
        s6 s6Var;
        String string3;
        boolean z23;
        TLObject userOrChat;
        boolean z24;
        s6 s6Var2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        TL_stars.InputSavedStarGift S1;
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        boolean z25 = false;
        this.E0 = false;
        TLRPC.TL_textWithEntities tL_textWithEntities2 = null;
        this.F0 = null;
        this.H0 = messageObject;
        this.G0 = z9Var;
        this.e0.set(messageObject);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        boolean z26 = messageObject.getDialogId() == clientUserId;
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        boolean z27 = messageAction instanceof TLRPC.TL_messageActionStarGift;
        int i16 = 3;
        e7 e7Var = this.f0;
        ei.d dVar = this.k0;
        if (z27 || (((z23 = messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) && (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift instanceof TL_stars.TL_starGift))) {
            if (!this.Q0 && (s6Var = this.P0) != null && s6Var.o && s6Var.l != null) {
                s6Var.a();
                this.P0 = null;
                e7Var.b.setVisibility(0);
                e7Var.c.setVisibility(4);
            }
            boolean isOutOwner = z26 ? false : messageObject.isOutOwner();
            TLRPC.Message message = messageObject.messageOwner;
            int i17 = message.date;
            TLRPC.MessageAction messageAction2 = message.action;
            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                boolean z28 = tL_messageActionStarGift.converted;
                z10 = tL_messageActionStarGift.saved;
                boolean z29 = tL_messageActionStarGift.refunded;
                boolean z30 = tL_messageActionStarGift.name_hidden;
                TL_stars.StarGift starGift4 = tL_messageActionStarGift.gift;
                boolean z31 = tL_messageActionStarGift.can_upgrade;
                long j12 = tL_messageActionStarGift.convert_stars;
                j11 = tL_messageActionStarGift.upgrade_stars;
                TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageActionStarGift.message;
                TLRPC.Peer peer6 = tL_messageActionStarGift.from_id;
                TLRPC.Peer peer7 = tL_messageActionStarGift.peer;
                z15 = tL_messageActionStarGift.prepaid_upgrade;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                TLRPC.Peer peer8 = tL_messageActionStarGift.auction_acquired ? tL_messageActionStarGift.to_id : null;
                int i18 = tL_messageActionStarGift.gift_num;
                peer3 = peer8;
                i10 = i18;
                z12 = z28;
                tL_textWithEntities = tL_textWithEntities3;
                peer = peer7;
                z14 = z31;
                peer2 = peer6;
                starGift = starGift4;
                j10 = j12;
                z13 = z30;
                z11 = z29;
            } else {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                boolean z32 = tL_messageActionStarGiftUnique.saved;
                boolean z33 = tL_messageActionStarGiftUnique.refunded;
                TL_stars.StarGift starGift5 = tL_messageActionStarGiftUnique.gift;
                TLRPC.Peer peer9 = tL_messageActionStarGiftUnique.from_id;
                z10 = z32;
                z11 = z33;
                starGift = starGift5;
                peer = tL_messageActionStarGiftUnique.peer;
                peer2 = peer9;
                j10 = 0;
                j11 = 0;
                i10 = 0;
                peer3 = null;
                tL_textWithEntities = null;
                z12 = false;
                z13 = false;
                z14 = false;
                z15 = false;
                str = null;
            }
            long j13 = this.X;
            String shortName = DialogObject.getShortName(j13);
            z16 = z26;
            TLRPC.Peer peer10 = peer3;
            boolean isBot = UserObject.isBot(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j13)));
            boolean z34 = peer != null && DialogObject.getPeerDialogId(peer) < 0;
            boolean d22 = d2(this.currentAccount, Y1());
            T1();
            e7Var.f(starGift, false, false, d22);
            CharSequence charSequence2 = "";
            int i19 = 2;
            if (z16) {
                if (i10 == 0 || starGift.title == null) {
                    z17 = isOutOwner;
                    string2 = LocaleController.getString(R.string.Gift2TitleSaved);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    z17 = isOutOwner;
                    sb2.append(starGift.title);
                    sb2.append(" #");
                    string2 = org.telegram.messenger.g0.h(i10, ',', sb2);
                }
                this.V0 = string2;
                if (z11) {
                    replaceTags = null;
                } else if (z14) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfoUpgrade));
                } else if (j10 > 0) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z12 ? "Gift2SelfInfoConverted" : "Gift2SelfInfoConvert", (int) j10));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfo));
                }
                e7Var.i(0, string2, replaceTags, z2(starGift));
            } else {
                z17 = isOutOwner;
                if (z34 && !this.E0) {
                    e7Var.i(0, LocaleController.getString(R.string.Gift2TitleProfile), null, z2(starGift));
                } else if ((z17 || z14) && j11 > 0) {
                    String string4 = LocaleController.getString(z17 ? R.string.Gift2TitleSent : R.string.Gift2TitleReceived);
                    this.V0 = string4;
                    if (z11) {
                        formatString = null;
                    } else if (z17) {
                        i11 = 0;
                        formatString = LocaleController.formatString(R.string.Gift2InfoFreeUpgrade, shortName);
                        e7Var.i(i11, string4, formatString, z2(starGift));
                    } else {
                        formatString = LocaleController.getString(R.string.Gift2InfoInFreeUpgrade);
                    }
                    i11 = 0;
                    e7Var.i(i11, string4, formatString, z2(starGift));
                } else {
                    if (i10 == 0 || starGift.title == null) {
                        string = LocaleController.getString(z17 ? R.string.Gift2TitleSent : R.string.Gift2TitleReceived);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(starGift.title);
                        sb3.append(" #");
                        string = org.telegram.messenger.g0.h(i10, ',', sb3);
                    }
                    this.V0 = string;
                    if (z11) {
                        peer4 = peer2;
                        z18 = z10;
                        concat = null;
                        i12 = 0;
                    } else {
                        if (!isBot && S1() != null) {
                            MessageObject messageObject2 = this.H0;
                            if (messageObject2 != null) {
                                TLRPC.MessageAction messageAction3 = messageObject2.messageOwner.action;
                                if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction3;
                                    boolean z35 = tL_messageActionStarGift2.peer != null;
                                    messageObject2.isOutOwner();
                                    this.H0.getDialogId();
                                    UserConfig.getInstance(this.currentAccount).getClientUserId();
                                    int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.H0.messageOwner.date);
                                    if (z35) {
                                        TLRPC.Peer peer11 = tL_messageActionStarGift2.peer;
                                        if (peer11 != null) {
                                            i13 = currentTime;
                                            peer4 = peer2;
                                            z18 = z10;
                                        }
                                    } else {
                                        i13 = currentTime;
                                        peer4 = peer2;
                                        z18 = z10;
                                    }
                                    if (!tL_messageActionStarGift2.converted) {
                                        if (tL_messageActionStarGift2.convert_stars > 0) {
                                        }
                                    }
                                    if (z17) {
                                        str2 = LocaleController.formatString((!z14 || j11 <= 0) ? R.string.Gift2Info2OutExpired : R.string.Gift2Info2OutUpgrade, shortName);
                                    } else {
                                        str2 = LocaleController.getString(!z18 ? z34 ? R.string.Gift2Info2ChannelKeep : R.string.Gift2Info2BotKeep : z34 ? R.string.Gift2Info2ChannelRemove : R.string.Gift2Info2BotRemove);
                                    }
                                }
                            } else {
                                peer4 = peer2;
                                z18 = z10;
                                TL_stars.SavedStarGift savedStarGift = this.F0;
                                if (savedStarGift != null) {
                                    int currentTime2 = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
                                    if (c2(this.currentAccount, j13)) {
                                        int i20 = this.F0.flags;
                                        if (((j13 < 0 ? 2048 : 8) & i20) != 0) {
                                            if ((i20 & 16) != 0) {
                                                if ((i20 & 2) != 0) {
                                                }
                                            }
                                        }
                                    }
                                }
                                if (z17) {
                                }
                            }
                            SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(str2);
                            if (isBot && F1()) {
                                c10 = 1;
                                charSequence = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new b2(this, 10)), true);
                            } else {
                                c10 = 1;
                                charSequence = "";
                            }
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            i12 = 0;
                            charSequenceArr[0] = replaceTags2;
                            charSequenceArr[c10] = " ";
                            charSequenceArr[2] = charSequence;
                            concat = TextUtils.concat(charSequenceArr);
                        }
                        peer4 = peer2;
                        z18 = z10;
                        if (z17) {
                        }
                        SpannableStringBuilder replaceTags22 = AndroidUtilities.replaceTags(str2);
                        if (isBot) {
                        }
                        c10 = 1;
                        charSequence = "";
                        CharSequence[] charSequenceArr2 = new CharSequence[3];
                        i12 = 0;
                        charSequenceArr2[0] = replaceTags22;
                        charSequenceArr2[c10] = " ";
                        charSequenceArr2[2] = charSequence;
                        concat = TextUtils.concat(charSequenceArr2);
                    }
                    e7Var.i(i12, string, concat, z2(starGift));
                    j01Var = this.i0;
                    j01Var.removeAllViews();
                    long peerDialogId = peer4 == null ? DialogObject.getPeerDialogId(peer4) : z17 ? clientUserId : j13;
                    if (peer == null) {
                        j13 = DialogObject.getPeerDialogId(peer);
                    } else if (!z17) {
                        j13 = clientUserId;
                    }
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                    if (peer10 == null) {
                        long peerDialogId2 = DialogObject.getPeerDialogId(peer10);
                        this.i0.m(LocaleController.getString(R.string.Gift2To), this.currentAccount, peerDialogId2, new d2(this, peerDialogId2, 7), null, z34 ? null : new d2(this, peerDialogId2, 8));
                    } else {
                        if (peerDialogId != clientUserId || z15 || z34) {
                            this.i0.m(LocaleController.getString(R.string.Gift2From), this.currentAccount, peerDialogId, new d2(this, peerDialogId, 9), (peerDialogId == clientUserId || peerDialogId == UserObject.ANONYMOUS || UserObject.isDeleted(user) || isBot || z34) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), z34 ? null : new d2(this, peerDialogId, 10));
                        }
                        if (j13 != clientUserId || z34) {
                            this.i0.m(LocaleController.getString(R.string.Gift2To), this.currentAccount, j13, new d2(this, j13, 11), null, z34 ? null : new d2(this, j13, 12));
                        }
                    }
                    j01Var.g(i17, LocaleController.getString(R.string.StarsTransactionDate));
                    if (starGift.stars > 0) {
                        String string5 = LocaleController.getString(R.string.Gift2Value);
                        String h = org.telegram.messenger.g0.h(starGift.stars + j11, ',', new StringBuilder("⭐️ "));
                        if (!F1() || z11) {
                            r72 = 0;
                        } else {
                            r72 = 0;
                            charSequence2 = org.telegram.ui.Components.ad.b(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) j10), new b2(this, 8), this.resourcesProvider, null);
                        }
                        j01Var.c(string5, md.Y0(false, TextUtils.concat(h, " ", charSequence2), 0.8f, r72), r72, r72);
                    }
                    if (starGift.limited && !z11) {
                        md.G0(j01Var, this.currentAccount, starGift, this.resourcesProvider);
                    }
                    if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text) && !z11) {
                        j01Var.b(tL_textWithEntities.text, tL_textWithEntities.entities);
                    }
                    if (z17 && z14 && !z11) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                        if (this.d1 == null) {
                            i15 = 0;
                            this.d1 = new yq(0, new f7(dVar, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.resourcesProvider)));
                        } else {
                            i15 = 0;
                        }
                        spannableStringBuilder.setSpan(this.d1, i15, 1, 33);
                        spannableStringBuilder.append((CharSequence) (j11 > 0 ? LocaleController.getString(R.string.Gift2UpgradeButtonFree) : LocaleController.getString(R.string.Gift2UpgradeButtonGift)));
                        dVar.setFilled(true);
                        dVar.g(spannableStringBuilder, !this.e1, true);
                        dVar.f(null, !this.e1);
                        dVar.setOnClickListener(new c2(this, 15));
                    } else if (this.r0 || this.Z == null || this.G0 == null || U1() < 0 || this.G0.b(U1()) < 0) {
                        if ((starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(str)) {
                            z19 = true;
                            dVar.setFilled(true);
                            dVar.g(LocaleController.getString(R.string.OK), !this.e1, true);
                            dVar.f(null, !this.e1);
                            dVar.setOnClickListener(new c2(this, 13));
                        } else {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("^  ");
                            if (this.d1 == null) {
                                i14 = 0;
                                this.d1 = new yq(0, new f7(dVar, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.resourcesProvider)));
                            } else {
                                i14 = 0;
                            }
                            z19 = true;
                            spannableStringBuilder2.setSpan(this.d1, i14, 1, 33);
                            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                            dVar.setFilled(true);
                            dVar.g(spannableStringBuilder2, !this.e1, true);
                            dVar.f(null, !this.e1);
                            dVar.setOnClickListener(new c2(this, 12));
                        }
                        tL_textWithEntities2 = tL_textWithEntities;
                        starGift3 = starGift;
                        z25 = z13;
                        z21 = z11;
                        peer5 = peer10;
                        z22 = z18;
                    } else {
                        dVar.setFilled(false);
                        int b10 = this.G0.b(U1());
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                        Object obj = this.G0.get(b10);
                        if (!(obj instanceof TL_stars.SavedStarGift) || (starGift2 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift2.getDocument()) == null) {
                            z20 = true;
                        } else {
                            spannableStringBuilder3.append((CharSequence) " e");
                            z20 = true;
                            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.a6(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                        }
                        dVar.g(spannableStringBuilder3, this.e1 ^ z20, z20);
                        dVar.f(null, this.e1 ^ z20);
                        dVar.setOnClickListener(new z2(this, b10, i19));
                    }
                    z19 = true;
                    tL_textWithEntities2 = tL_textWithEntities;
                    starGift3 = starGift;
                    z25 = z13;
                    z21 = z11;
                    peer5 = peer10;
                    z22 = z18;
                }
            }
            peer4 = peer2;
            z18 = z10;
            j01Var = this.i0;
            j01Var.removeAllViews();
            if (peer4 == null) {
            }
            if (peer == null) {
            }
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
            if (peer10 == null) {
            }
            j01Var.g(i17, LocaleController.getString(R.string.StarsTransactionDate));
            if (starGift.stars > 0) {
            }
            if (starGift.limited) {
                md.G0(j01Var, this.currentAccount, starGift, this.resourcesProvider);
            }
            if (tL_textWithEntities != null) {
                j01Var.b(tL_textWithEntities.text, tL_textWithEntities.entities);
            }
            if (z17) {
            }
            if (this.r0) {
            }
            if (starGift instanceof TL_stars.TL_starGift) {
            }
            z19 = true;
            dVar.setFilled(true);
            dVar.g(LocaleController.getString(R.string.OK), !this.e1, true);
            dVar.f(null, !this.e1);
            dVar.setOnClickListener(new c2(this, 13));
            tL_textWithEntities2 = tL_textWithEntities;
            starGift3 = starGift;
            z25 = z13;
            z21 = z11;
            peer5 = peer10;
            z22 = z18;
        } else {
            if (!z23) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if (!(tL_messageActionStarGiftUnique2.gift instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            if (tL_messageActionStarGiftUnique2.name_hidden) {
                userOrChat = null;
            } else {
                MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                TLRPC.Peer peer12 = tL_messageActionStarGiftUnique2.from_id;
                userOrChat = messagesController.getUserOrChat(peer12 != null ? DialogObject.getPeerDialogId(peer12) : messageObject.getFromChatId());
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique2.gift;
            z21 = tL_messageActionStarGiftUnique2.refunded;
            G2(tL_starGiftUnique2, z21, userOrChat, tL_messageActionStarGiftUnique2.message);
            z22 = tL_messageActionStarGiftUnique2.saved;
            starGift3 = tL_messageActionStarGiftUnique2.gift;
            boolean z36 = (tL_messageActionStarGiftUnique2.upgrade ^ true) == messageObject.isOutOwner();
            if (messageObject.getDialogId() == clientUserId) {
                z36 = false;
            }
            if (!this.N0 && !this.O0 && this.H0 != null && (S1 = S1()) != null) {
                this.N0 = true;
                ga.y(this.currentAccount, false).M(S1, new g4(this, i16));
            }
            if (this.Q0 || (s6Var2 = this.P0) == null || !s6Var2.o || (tL_starGiftUnique = s6Var2.l) == null) {
                z24 = z36;
            } else {
                if (starGift3 != null) {
                    long j14 = tL_starGiftUnique.id;
                    z24 = z36;
                } else {
                    z24 = z36;
                }
                s6Var2.a();
                this.P0 = null;
                e7Var.b.setAlpha(1.0f);
                e7Var.c.setAlpha(0.0f);
            }
            z12 = false;
            peer5 = null;
            z17 = z24;
            z16 = z26;
            z19 = true;
        }
        if (this.l1) {
            dVar.setFilled(z19);
            dVar.g(LocaleController.getString(R.string.GiftCraftButtonNext), false, z19);
            dVar.setOnClickListener(new c2(this, 14));
        }
        String str3 = starGift3 == null ? null : starGift3.owner_address;
        String str4 = starGift3 == null ? null : starGift3.gift_address;
        boolean z37 = (starGift3 == null || starGift3.host_id == null) ? false : true;
        x90 x90Var = this.h0;
        if (z21) {
            x90Var.setVisibility(0);
            x90Var.setText(LocaleController.getString(R.string.Gift2Refunded));
            x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q7, this.resourcesProvider));
        } else if (z37 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            x90Var.setVisibility(0);
            x90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new h4(this, str4, 5)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q5, this.resourcesProvider));
        } else if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && z25 && !z16) {
            x90Var.setVisibility(0);
            if (z17) {
                string3 = LocaleController.formatString((tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? R.string.Gift2OutSenderHidden2 : R.string.Gift2OutSenderMessageHidden2, DialogObject.getShortName(messageObject.getDialogId()));
            } else {
                string3 = LocaleController.getString((tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? R.string.Gift2InSenderHidden2 : R.string.Gift2InSenderMessageHidden2);
            }
            x90Var.setText(string3);
            x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q5, this.resourcesProvider));
        } else {
            x90Var.setVisibility(8);
        }
        x90 x90Var2 = this.j0;
        if (!z37 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            x90Var2.setVisibility(0);
            x90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new h4(this, str4, 6)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
        } else if (z12 || z21 || starGift3 == null || !b2(this.currentAccount, O1()) || peer5 != null) {
            x90Var2.setVisibility(8);
        } else {
            x90Var2.setVisibility(0);
            if (O1() >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (!z22) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new yq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(z22 ? R.string.Gift2ProfileVisible4 : R.string.Gift2ProfileInvisible4), new b2(this, 7)));
                x90Var2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder4, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                x90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(z22 ? R.string.Gift2ChannelProfileVisible3 : R.string.Gift2ChannelProfileInvisible3), new b2(this, 7)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
        }
        if (this.e1) {
            O2(0, false, null);
            this.c.n0(1);
            this.e1 = false;
        }
        this.e.setTitle(this.V0);
        R2();
    }

    public final boolean F1() {
        TLRPC.Peer peer;
        if (S1() == null) {
            return false;
        }
        MessageObject messageObject = this.H0;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                return ((!(tL_messageActionStarGift.peer != null) && (!messageObject.isOutOwner() || ((this.H0.getDialogId() > UserConfig.getInstance(this.currentAccount).getClientUserId() ? 1 : (this.H0.getDialogId() == UserConfig.getInstance(this.currentAccount).getClientUserId() ? 0 : -1)) == 0))) || ((peer = tL_messageActionStarGift.peer) != null && c2(this.currentAccount, DialogObject.getPeerDialogId(peer)))) && !tL_messageActionStarGift.converted && tL_messageActionStarGift.convert_stars > 0 && MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.H0.messageOwner.date) > 0;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift != null) {
                int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
                int i10 = this.currentAccount;
                long j10 = this.X;
                if (c2(i10, j10)) {
                    int i11 = this.F0.flags;
                    if (((j10 < 0 ? 2048 : 8) & i11) != 0 && (i11 & 16) != 0 && (i11 & 2) != 0 && currentTime > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33, types: [org.telegram.ui.Components.i01[], org.telegram.ui.Components.yq[], org.telegram.ui.Components.zc[]] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v43, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v44 */
    public final void F2(TL_stars.SavedStarGift savedStarGift, z9 z9Var) {
        long j10;
        String string;
        int i10;
        CharSequence charSequence;
        String formatString;
        boolean z10;
        CharSequence charSequence2;
        TL_stars.StarGift starGift;
        ?? r12;
        CharSequence charSequence3;
        int i11;
        ?? r122;
        TL_stars.StarGift starGift2;
        TLRPC.Document document;
        String str;
        String str2;
        boolean z11;
        int i12;
        String string2;
        CharSequence replaceTags;
        TL_stars.StarGift starGift3;
        ?? r13;
        s6 s6Var;
        if (savedStarGift == null) {
            return;
        }
        int i13 = this.currentAccount;
        long j11 = this.X;
        this.E0 = b2(i13, j11);
        this.F0 = savedStarGift;
        this.G0 = z9Var;
        this.H0 = null;
        boolean z12 = this.Q0;
        e7 e7Var = this.f0;
        if (!z12 && (s6Var = this.P0) != null && s6Var.o && s6Var.l != null) {
            s6Var.a();
            this.P0 = null;
            e7Var.b.setVisibility(0);
            e7Var.c.setVisibility(4);
        }
        this.e0.b(this.currentAccount, savedStarGift);
        String shortName = DialogObject.getShortName(j11);
        long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
        boolean isBot = UserObject.isBot(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)));
        int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        if ((savedStarGift.flags & 2) == 0) {
            peerDialogId = 2666000;
        }
        boolean z13 = j11 < 0;
        TLRPC.TL_textWithEntities tL_textWithEntities = savedStarGift.message;
        boolean z14 = savedStarGift.refunded;
        TL_stars.StarGift starGift4 = savedStarGift.gift;
        if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
            str = starGift4.owner_address;
            str2 = starGift4.gift_address;
            z11 = starGift4.host_id != null;
            G2((TL_stars.TL_starGiftUnique) starGift4, z14, !savedStarGift.name_hidden ? MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(savedStarGift.from_id)) : null, savedStarGift.message);
        } else {
            boolean z15 = this.E0 && clientUserId == peerDialogId && j11 >= 0;
            boolean d22 = d2(this.currentAccount, Y1());
            T1();
            e7Var.f(starGift4, false, false, d22);
            j01 j01Var = this.i0;
            j01Var.removeAllViews();
            if (z15) {
                if (savedStarGift.gift_num == 0 || (starGift3 = savedStarGift.gift) == null || starGift3.title == null) {
                    j10 = clientUserId;
                    string2 = LocaleController.getString(R.string.Gift2TitleSaved);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(savedStarGift.gift.title);
                    sb2.append(" #");
                    j10 = clientUserId;
                    string2 = org.telegram.messenger.g0.h(savedStarGift.gift_num, ',', sb2);
                }
                this.V0 = string2;
                if (z14) {
                    replaceTags = null;
                } else if (savedStarGift.can_upgrade) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfoUpgrade));
                } else {
                    long j12 = savedStarGift.convert_stars;
                    replaceTags = j12 > 0 ? AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SelfInfoConvert", (int) j12)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfo));
                }
                e7Var.i(0, string2, replaceTags, z2(savedStarGift.gift));
            } else {
                j10 = clientUserId;
                if (!z13 || this.E0) {
                    boolean z16 = this.E0;
                    if ((!z16 || savedStarGift.can_upgrade) && savedStarGift.upgrade_stars > 0) {
                        String string3 = LocaleController.getString(z16 ? R.string.Gift2TitleReceived : R.string.Gift2TitleProfile);
                        this.V0 = string3;
                        e7Var.i(0, string3, (!z14 && this.E0) ? LocaleController.getString(R.string.Gift2InfoInFreeUpgrade) : null, z2(savedStarGift.gift));
                    } else {
                        if (savedStarGift.gift_num == 0 || (starGift = savedStarGift.gift) == null || starGift.title == null) {
                            string = LocaleController.getString(z16 ? R.string.Gift2TitleReceived : R.string.Gift2TitleProfile);
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(savedStarGift.gift.title);
                            sb3.append(" #");
                            string = org.telegram.messenger.g0.h(savedStarGift.gift_num, ',', sb3);
                        }
                        this.V0 = string;
                        if (z14 || !this.E0) {
                            i10 = 0;
                            charSequence = null;
                        } else {
                            if (isBot || !F1()) {
                                if (this.E0) {
                                    formatString = LocaleController.getString(savedStarGift.unsaved ? z13 ? R.string.Gift2Info2ChannelKeep : R.string.Gift2Info2BotKeep : z13 ? R.string.Gift2Info2ChannelRemove : R.string.Gift2Info2BotRemove);
                                } else {
                                    formatString = LocaleController.formatString((!savedStarGift.can_upgrade || savedStarGift.upgrade_stars <= 0) ? R.string.Gift2Info2OutExpired : R.string.Gift2Info2OutUpgrade, shortName);
                                }
                            } else if (this.E0) {
                                formatString = LocaleController.formatPluralStringComma(currentTime <= 0 ? z13 ? "Gift2Info2ChannelExpired" : "Gift2Info2Expired" : z13 ? "Gift2Info3Channel" : "Gift2Info3", (int) savedStarGift.convert_stars);
                            } else {
                                formatString = LocaleController.formatPluralStringComma("Gift2Info2Out", (int) savedStarGift.convert_stars, shortName);
                            }
                            SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(formatString);
                            if (isBot || !F1()) {
                                z10 = true;
                                charSequence2 = "";
                            } else {
                                z10 = true;
                                charSequence2 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new b2(this, 6)), true);
                            }
                            boolean z17 = z10;
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            i10 = 0;
                            charSequenceArr[0] = replaceTags2;
                            charSequenceArr[z17 ? 1 : 0] = " ";
                            charSequenceArr[2] = charSequence2;
                            charSequence = TextUtils.concat(charSequenceArr);
                        }
                        e7Var.i(i10, string, charSequence, z2(savedStarGift.gift));
                    }
                } else {
                    String string4 = LocaleController.getString(R.string.Gift2TitleProfile);
                    this.V0 = string4;
                    e7Var.i(0, string4, null, y2(savedStarGift.gift.released_by));
                }
            }
            if (j10 != peerDialogId || z13) {
                this.i0.m(LocaleController.getString(R.string.Gift2From), this.currentAccount, peerDialogId, new d2(this, peerDialogId, 4), (peerDialogId == j10 || peerDialogId == UserObject.ANONYMOUS || isBot || UserObject.isDeleted(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId))) || z13) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), new d2(this, peerDialogId, 5));
            }
            j01Var.c(LocaleController.getString(R.string.StarsTransactionDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(savedStarGift.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(savedStarGift.date * 1000))), null, null);
            String string5 = LocaleController.getString(R.string.Gift2Value);
            String h = org.telegram.messenger.g0.h(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
            if (!F1() || z14) {
                r12 = 0;
                charSequence3 = "";
            } else {
                r12 = 0;
                charSequence3 = org.telegram.ui.Components.ad.b(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) savedStarGift.convert_stars), new b2(this, 8), this.resourcesProvider, null);
            }
            j01Var.c(string5, md.Y0(false, TextUtils.concat(h, " ", charSequence3), 0.8f, r12), r12, r12);
            TL_stars.StarGift starGift5 = savedStarGift.gift;
            if (starGift5.limited && !z14) {
                md.G0(j01Var, this.currentAccount, starGift5, this.resourcesProvider);
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
            if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text) && !z14) {
                TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
                j01Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
            }
            boolean z18 = this.E0;
            ei.d dVar = this.k0;
            if (z18 && savedStarGift.can_upgrade) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                if (this.d1 == null) {
                    i12 = 0;
                    this.d1 = new yq(0, new f7(dVar, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.resourcesProvider)));
                } else {
                    i12 = 0;
                }
                spannableStringBuilder.setSpan(this.d1, i12, 1, 33);
                spannableStringBuilder.append((CharSequence) (savedStarGift.upgrade_stars > 0 ? LocaleController.getString(R.string.Gift2UpgradeButtonFree) : LocaleController.getString(R.string.Gift2UpgradeButtonGift)));
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder, !this.e1, true);
                dVar.f(null, !this.e1);
                dVar.setOnClickListener(new c2(this, 7));
            } else if (this.r0 && z18 && this.Z != null && this.G0 != null && U1() >= 0 && this.G0.b(U1()) >= 0) {
                dVar.setFilled(false);
                int b10 = this.G0.b(U1());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                Object obj = this.G0.get(b10);
                if (!(obj instanceof TL_stars.SavedStarGift) || (starGift2 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift2.getDocument()) == null) {
                    r122 = 1;
                } else {
                    spannableStringBuilder2.append((CharSequence) " e");
                    r122 = 1;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.a6(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                }
                dVar.g(spannableStringBuilder2, (this.e1 ? 1 : 0) ^ r122, r122);
                dVar.f(null, (this.e1 ? 1 : 0) ^ r122);
                dVar.setOnClickListener(new z2(this, b10, r122));
            } else if (!(savedStarGift.gift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), !this.e1, true);
                dVar.f(null, !this.e1);
                dVar.setOnClickListener(new c2(this, 10));
            } else {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                if (this.d1 == null) {
                    i11 = 0;
                    this.d1 = new yq(0, new f7(dVar, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.resourcesProvider)));
                } else {
                    i11 = 0;
                }
                spannableStringBuilder3.setSpan(this.d1, i11, 1, 33);
                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder3, !this.e1, true);
                dVar.f(null, !this.e1);
                dVar.setOnClickListener(new c2(this, 9));
            }
            str = null;
            str2 = null;
            z11 = false;
        }
        boolean z19 = savedStarGift.refunded;
        x90 x90Var = this.h0;
        if (z19) {
            x90Var.setVisibility(0);
            x90Var.setText(LocaleController.getString(R.string.Gift2Refunded));
            x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q7, this.resourcesProvider));
        } else if (z11 && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            x90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new h4(this, str2, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            x90Var.setVisibility(0);
            x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q5, this.resourcesProvider));
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && this.E0 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
            x90Var.setVisibility(0);
            x90Var.setText(LocaleController.getString((tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? R.string.Gift2InSenderHidden2 : R.string.Gift2InSenderMessageHidden2));
            x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q5, this.resourcesProvider));
        } else {
            x90Var.setVisibility(8);
        }
        x90 x90Var2 = this.j0;
        if (!z11 && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            x90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new h4(this, str2, 2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            r13 = 0;
            x90Var2.setVisibility(0);
        } else if (this.E0 && b2(this.currentAccount, j11)) {
            if (j11 >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new yq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(!savedStarGift.unsaved ? R.string.Gift2ProfileVisible4 : R.string.Gift2ProfileInvisible4), new b2(this, 7)));
                x90Var2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder4, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                x90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(!savedStarGift.unsaved ? R.string.Gift2ChannelProfileVisible3 : R.string.Gift2ChannelProfileInvisible3), new b2(this, 7)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
            r13 = 0;
            x90Var2.setVisibility(0);
        } else {
            r13 = 0;
            x90Var2.setVisibility(8);
        }
        if (this.e1) {
            O2(r13, r13, null);
            this.c.n0(1);
            this.e1 = r13;
        }
        this.e.setTitle(this.V0);
        R2();
    }

    public final boolean G1() {
        int i10;
        TL_stars.TL_starGiftUnique Y1 = Y1();
        if (Y1 == null || Y1.crafted || !c2(this.currentAccount, DialogObject.getPeerDialogId(Y1.owner_id))) {
            return false;
        }
        MessageObject messageObject = this.H0;
        if (messageObject == null) {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                i10 = savedStarGift.can_craft_at;
            }
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            return false;
        }
        i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
        return i10 > 0 && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() >= i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x059f, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique) r7).drop_original_details_stars >= 0) goto L190;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0326  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [org.telegram.ui.Components.i01[], org.telegram.ui.Components.zc[]] */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        e7 e7Var;
        long j10;
        Object[] objArr;
        long j11;
        boolean z11;
        TL_wallet.walletTransaction wallettransaction;
        CharSequence charSequence;
        CharSequence charSequence2;
        Spannable spannable;
        final ?? r10;
        ?? r14;
        ?? r13;
        Class cls;
        TL_stars.starGiftAttributeOriginalDetails stargiftattributeoriginaldetails;
        float f7;
        s6 s6Var;
        boolean z12;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        s6 s6Var2;
        Class cls2;
        boolean z13;
        Object obj;
        Object obj2;
        CharSequence formatSpannable;
        TLRPC.Message message;
        MessageObject messageObject;
        Object[] objArr2;
        int i10;
        int i11;
        TL_wallet.nftItem nftitem;
        String str;
        TL_wallet.nftItem nftitem2;
        String str2;
        org.telegram.ui.Wallet.s7 s7Var;
        s6 s6Var3;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        long peerDialogId = DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
        long peerDialogId2 = DialogObject.getPeerDialogId(tL_starGiftUnique.host_id);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.V0 = org.telegram.messenger.g0.h(tL_starGiftUnique.num, ',', sb2);
        boolean z14 = this.Q0;
        e7 e7Var2 = this.f0;
        if (z14 || (s6Var3 = this.P0) == null || !s6Var3.o || (tL_starGiftUnique2 = s6Var3.l) == null) {
            e7Var = e7Var2;
            j10 = peerDialogId;
        } else {
            j10 = peerDialogId;
            if (tL_starGiftUnique2.id != tL_starGiftUnique.id) {
                s6Var3.a();
                this.P0 = null;
                e7Var = e7Var2;
                e7Var.b.setAlpha(1.0f);
                e7Var.c.setAlpha(0.0f);
                int i12 = 0;
                int i13 = 1;
                objArr = this.i1 != null;
                if (objArr == true) {
                    j11 = j10;
                } else {
                    j11 = j10;
                    if (c2(this.currentAccount, j11)) {
                        z11 = true;
                        boolean z15 = !objArr == true && c2(this.currentAccount, peerDialogId2);
                        boolean d22 = d2(this.currentAccount, Y1());
                        T1();
                        e7Var.f(tL_starGiftUnique, z11, z15, d22);
                        final int i14 = 4;
                        int i15 = 2;
                        final int i16 = 3;
                        if (this.f1 != null) {
                            if (this.h1 != null) {
                                e7Var.j(new c2(this, 28), this.g1 == null ? null : new View.OnClickListener(this) { // from class: ai.y4
                                    public final /* synthetic */ k7 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i16) {
                                            case 0:
                                                this.b.e2();
                                                break;
                                            case 1:
                                                this.b.onBackPressed();
                                                break;
                                            case 2:
                                                s6 s6Var4 = this.b.P0;
                                                s6Var4.h.e();
                                                s6Var4.i.e();
                                                s6Var4.j.e();
                                                s6Var4.k.e();
                                                break;
                                            case 3:
                                                this.b.k2();
                                                break;
                                            default:
                                                k7 k7Var = this.b;
                                                org.telegram.ui.Wallet.v4 v4Var = k7Var.h1;
                                                if (v4Var != null) {
                                                    k7Var.dismiss();
                                                    AndroidUtilities.runOnUIThread(new a3.d(v4Var, 13), 250L);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                }, new View.OnClickListener(this) { // from class: ai.y4
                                    public final /* synthetic */ k7 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i14) {
                                            case 0:
                                                this.b.e2();
                                                break;
                                            case 1:
                                                this.b.onBackPressed();
                                                break;
                                            case 2:
                                                s6 s6Var4 = this.b.P0;
                                                s6Var4.h.e();
                                                s6Var4.i.e();
                                                s6Var4.j.e();
                                                s6Var4.k.e();
                                                break;
                                            case 3:
                                                this.b.k2();
                                                break;
                                            default:
                                                k7 k7Var = this.b;
                                                org.telegram.ui.Wallet.v4 v4Var = k7Var.h1;
                                                if (v4Var != null) {
                                                    k7Var.dismiss();
                                                    AndroidUtilities.runOnUIThread(new a3.d(v4Var, 13), 250L);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                }, true);
                                org.telegram.ui.Wallet.v4 v4Var = this.h1;
                                org.telegram.ui.Wallet.t7 t7Var = v4Var.b.i0;
                                e7Var.setWalletCard((t7Var == null || (nftitem2 = v4Var.a) == null || (str2 = nftitem2.address) == null || (s7Var = (org.telegram.ui.Wallet.s7) t7Var.f.get(str2)) == null || !s7Var.b()) ? false : true);
                            } else {
                                e7Var.j(new c2(this, i12), this.g1 == null ? null : new c2(this, i13), new c2(this, i15), tL_starGiftUnique.host_id != null);
                            }
                            org.telegram.ui.Wallet.u4 u4Var = this.g1;
                            if (u4Var != null) {
                                i11 = ((org.telegram.ui.ActionBar.n2) u4Var.c).currentAccount;
                                boolean F = org.telegram.ui.Wallet.t7.F(i11, u4Var.a.slug);
                                org.telegram.ui.Wallet.u4 u4Var2 = this.g1;
                                org.telegram.ui.Wallet.t7 t7Var2 = u4Var2.c.i0;
                                Object[] objArr3 = (t7Var2 == null || (nftitem = u4Var2.b) == null || (str = nftitem.address) == null || !str.equals(t7Var2.P0)) ? false : true;
                                ah.v vVar = e7Var.J;
                                vVar.c(R.drawable.filled_card_color, LocaleController.getString(objArr3 != false ? R.string.WalletGiftRemoveColor : R.string.WalletGiftApplyColor), false);
                                vVar.setAlpha((F || objArr3 == true) ? 1.0f : 0.5f);
                            }
                        }
                        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) tL_starGiftUnique.title);
                        spannableStringBuilder.append((CharSequence) " ");
                        int length = spannableStringBuilder.length();
                        StringBuilder sb3 = new StringBuilder("#");
                        long j12 = j11;
                        sb3.append(LocaleController.formatNumber(tL_starGiftUnique.num, ','));
                        spannableStringBuilder.append((CharSequence) sb3.toString());
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.setSpan(new su(190, i12), length, spannableStringBuilder.length(), 33);
                        wallettransaction = this.i1;
                        if (wallettransaction != null) {
                            charSequence2 = LocaleController.getString(wallettransaction.incoming ? R.string.WalletMovedFromProfile : R.string.WalletMovedToProfile);
                        } else if (tLObject != null) {
                            charSequence2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UniqueGiftFrom, DialogObject.getShortName(tLObject)));
                        } else if (tL_starGiftUnique.released_by != null || stargiftattributemodel == null) {
                            charSequence = null;
                            if (tL_textWithEntities != null) {
                                TextPaint textPaint = e7Var.G;
                                TextPaint textPaint2 = e7Var.G;
                                if (textPaint != null) {
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                                    MessageObject.addEntitiesToText(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false);
                                    spannable = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder2, textPaint2.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint2.getFontMetricsInt());
                                    e7 e7Var3 = e7Var;
                                    e7Var3.h(0, spannableStringBuilder, charSequence, y2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                                    this.j1 = null;
                                    j01 j01Var = this.i0;
                                    j01Var.removeAllViews();
                                    if (!z10) {
                                        if (tL_starGiftUnique.host_id != null) {
                                            if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                                                j01Var.p(LocaleController.getString(R.string.Gift2HostAddress), tL_starGiftUnique.owner_address, new b2(this, 1));
                                            }
                                            if (peerDialogId2 != 0) {
                                                objArr2 = null;
                                                i10 = 2;
                                                this.j1 = ((g01) this.i0.o(LocaleController.getString(R.string.Gift2Host), this.currentAccount, peerDialogId2, new d2(this, peerDialogId2, i12)).getChildAt(1)).getChildAt(0);
                                            }
                                        } else {
                                            objArr2 = null;
                                            i10 = 2;
                                            if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                                                j01Var.p(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_address, new b2(this, i10));
                                            } else if (j12 == 0 && tL_starGiftUnique.owner_name != null) {
                                                j01Var.c(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_name, null, null);
                                            } else if (j12 != 0) {
                                                r10 = 0;
                                                r13 = 1;
                                                r14 = 0;
                                                cls = TL_stars.starGiftAttributeModel.class;
                                                this.j1 = ((g01) this.i0.o(LocaleController.getString(R.string.Gift2Owner), this.currentAccount, j12, new d2(this, j12, 1 == true ? 1 : 0)).getChildAt(1)).getChildAt(0);
                                                B1(ga.l(tL_starGiftUnique.attributes, cls));
                                                B1(ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                                                B1(ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                                if (!z10) {
                                                    if (this.H0 == null) {
                                                        j01Var.c(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), null, null);
                                                    } else if (this.M0) {
                                                        j01Var.c(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), null, null);
                                                    } else {
                                                        TextView textView = (TextView) ((g01) j01Var.c(LocaleController.getString(R.string.Gift2Quantity), "", r14, r14).getChildAt(r13)).getChildAt(r10);
                                                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x ");
                                                        ca0 ca0Var = new ca0(textView, AndroidUtilities.dp(90.0f), r10, this.resourcesProvider);
                                                        int i17 = org.telegram.ui.ActionBar.h6.G6;
                                                        ca0Var.a(org.telegram.ui.ActionBar.h6.m1(0.21f, org.telegram.ui.ActionBar.h6.w0(i17, this.resourcesProvider)), org.telegram.ui.ActionBar.h6.m1(0.08f, org.telegram.ui.ActionBar.h6.w0(i17, this.resourcesProvider)));
                                                        spannableStringBuilder3.setSpan(ca0Var, r10, r13, 33);
                                                        textView.setText(spannableStringBuilder3, TextView.BufferType.SPANNABLE);
                                                        if (!this.L0 && !this.M0 && (messageObject = this.H0) != null) {
                                                            this.L0 = r13;
                                                            int id2 = messageObject.getId();
                                                            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                                            tL_messages_getMessages.id.add(Integer.valueOf(id2));
                                                            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new m2(this, id2, r10));
                                                        }
                                                    }
                                                    if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                                                        this.i0.e(LocaleController.getString(R.string.GiftValue2), r4.c.h("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), LocaleController.getString(R.string.GiftValue2LearnMore), new a3.l0(this, tL_starGiftUnique, BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency), 10), null);
                                                    }
                                                }
                                                stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                                                if (stargiftattributeoriginaldetails != null) {
                                                    if ((stargiftattributeoriginaldetails.flags & r13) != 0) {
                                                        long peerDialogId3 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.sender_id);
                                                        SpannableString spannableString = new SpannableString(DialogObject.getName(peerDialogId3));
                                                        spannableString.setSpan(new f5(this, peerDialogId3), r10, spannableString.length(), 33);
                                                        obj = spannableString;
                                                    } else {
                                                        obj = null;
                                                    }
                                                    f7 = 14.0f;
                                                    long peerDialogId4 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.recipient_id);
                                                    SpannableString spannableString2 = new SpannableString(DialogObject.getName(peerDialogId4));
                                                    spannableString2.setSpan(new g5(this, peerDialogId4), r10, spannableString2.length(), 33);
                                                    if (stargiftattributeoriginaldetails.message != null) {
                                                        TextPaint textPaint3 = new TextPaint((int) r13);
                                                        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
                                                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                                                        MessageObject.addEntitiesToText(spannableStringBuilder4, stargiftattributeoriginaldetails.message.entities, false, false, false, false);
                                                        obj2 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder4, textPaint3.getFontMetricsInt(), r10), stargiftattributeoriginaldetails.message.entities, textPaint3.getFontMetricsInt());
                                                    } else {
                                                        obj2 = null;
                                                    }
                                                    boolean z16 = r13;
                                                    Object replaceAll = LocaleController.getInstance().getFormatterYear().format(stargiftattributeoriginaldetails.date * 1000).replaceAll("\\.", "/");
                                                    if (stargiftattributeoriginaldetails.sender_id == stargiftattributeoriginaldetails.recipient_id) {
                                                        if (obj2 == null) {
                                                            int i18 = R.string.Gift2AttributeOriginalDetailsSelf;
                                                            Object[] objArr4 = new Object[2];
                                                            objArr4[r10] = obj;
                                                            objArr4[z16 ? 1 : 0] = replaceAll;
                                                            formatSpannable = LocaleController.formatSpannable(i18, objArr4);
                                                        } else {
                                                            int i19 = R.string.Gift2AttributeOriginalDetailsSelfComment;
                                                            Object[] objArr5 = new Object[3];
                                                            objArr5[r10] = obj;
                                                            objArr5[z16 ? 1 : 0] = replaceAll;
                                                            objArr5[2] = obj2;
                                                            formatSpannable = LocaleController.formatSpannable(i19, objArr5);
                                                        }
                                                    } else if (obj != null) {
                                                        if (obj2 == null) {
                                                            int i20 = R.string.Gift2AttributeOriginalDetails;
                                                            Object[] objArr6 = new Object[3];
                                                            objArr6[r10] = obj;
                                                            objArr6[z16 ? 1 : 0] = spannableString2;
                                                            objArr6[2] = replaceAll;
                                                            formatSpannable = LocaleController.formatSpannable(i20, objArr6);
                                                        } else {
                                                            int i21 = R.string.Gift2AttributeOriginalDetailsComment;
                                                            Object[] objArr7 = new Object[4];
                                                            objArr7[r10] = obj;
                                                            objArr7[z16 ? 1 : 0] = spannableString2;
                                                            objArr7[2] = replaceAll;
                                                            objArr7[3] = obj2;
                                                            formatSpannable = LocaleController.formatSpannable(i21, objArr7);
                                                        }
                                                    } else if (obj2 == null) {
                                                        int i22 = R.string.Gift2AttributeOriginalDetailsNoSender;
                                                        Object[] objArr8 = new Object[2];
                                                        objArr8[r10] = spannableString2;
                                                        objArr8[z16 ? 1 : 0] = replaceAll;
                                                        formatSpannable = LocaleController.formatSpannable(i22, objArr8);
                                                    } else {
                                                        int i23 = R.string.Gift2AttributeOriginalDetailsNoSenderComment;
                                                        Object[] objArr9 = new Object[3];
                                                        objArr9[r10] = spannableString2;
                                                        objArr9[z16 ? 1 : 0] = replaceAll;
                                                        objArr9[2] = obj2;
                                                        formatSpannable = LocaleController.formatSpannable(i23, objArr9);
                                                    }
                                                    if (b2(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                                                        TL_stars.SavedStarGift savedStarGift = this.F0;
                                                        if (savedStarGift == null || savedStarGift.drop_original_details_stars < 0) {
                                                            MessageObject messageObject2 = this.H0;
                                                            if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
                                                                TLRPC.MessageAction messageAction = message.action;
                                                                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                                }
                                                            }
                                                        }
                                                        LinearLayout linearLayout = new LinearLayout(getContext());
                                                        linearLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                                                        linearLayout.setOrientation(r10);
                                                        wh.n nVar = new wh.n(getContext());
                                                        nVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, this.resourcesProvider));
                                                        nVar.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, this.resourcesProvider));
                                                        nVar.setTextSize(z16 ? 1 : 0, 12.0f);
                                                        nVar.setGravity(3);
                                                        nVar.setText(formatSpannable);
                                                        linearLayout.addView(nVar, w7.z5.o(-1, -2, 1.0f, 19));
                                                        ImageView imageView = new ImageView(getContext());
                                                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                                                        int i24 = org.telegram.ui.ActionBar.h6.Oh;
                                                        imageView.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(i24, this.resourcesProvider)), 6, 6));
                                                        imageView.setImageResource(R.drawable.menu_delete_old);
                                                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i24, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
                                                        w7.b6.a(imageView);
                                                        imageView.setOnClickListener(new p(7, this, formatSpannable));
                                                        linearLayout.addView(imageView, w7.z5.p(32, 32, 0.0f, 21, 8, 0, 0, 0));
                                                        TableRow tableRow = new TableRow(getContext());
                                                        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
                                                        layoutParams.span = 2;
                                                        tableRow.addView(new h01(j01Var, linearLayout, true), layoutParams);
                                                        j01Var.addView(tableRow);
                                                    }
                                                    h01 a2 = j01Var.a(formatSpannable);
                                                    a2.setFilled(z16);
                                                    wh.n nVar2 = (wh.n) a2.getChildAt(r10);
                                                    nVar2.setTextSize(z16 ? 1 : 0, 12.0f);
                                                    nVar2.setGravity(17);
                                                } else {
                                                    f7 = 14.0f;
                                                }
                                                if (this.i1 != null) {
                                                    this.j1 = null;
                                                    j01Var.removeAllViews();
                                                    long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                                                    this.i0.n(LocaleController.getString(this.i1.incoming ? R.string.WalletSender : R.string.WalletRecipient), this.currentAccount, clientUserId, new d2(this, clientUserId, 3));
                                                    long abs = Math.abs(this.i1.fee);
                                                    if (abs > 0) {
                                                        TextView textView2 = new TextView(getContext());
                                                        textView2.setGravity(16);
                                                        textView2.setIncludeFontPadding(r10);
                                                        textView2.setTextSize(1, f7);
                                                        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, this.resourcesProvider));
                                                        textView2.setText(org.telegram.ui.Wallet.n5.s0(this.currentAccount, abs, this.resourcesProvider));
                                                        j01Var.f(textView2, LocaleController.getString(R.string.WalletFee));
                                                    }
                                                    if (this.i1.date != 0) {
                                                        j01Var.c(LocaleController.getString(R.string.WalletDate), LocaleController.formatShortDateTime(this.i1.date), null, null);
                                                    }
                                                }
                                                s6Var = this.P0;
                                                ei.d dVar = this.k0;
                                                if (s6Var != null || !s6Var.o) {
                                                    if (this.i1 != null) {
                                                        dVar.setFilled(true);
                                                        dVar.g(LocaleController.getString(R.string.OK), !this.e1, true);
                                                        dVar.f(null, !this.e1);
                                                        dVar.setOnClickListener(new c2(this, 29));
                                                    } else if (b2(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id)) || tL_starGiftUnique.resell_amount == null) {
                                                        if (!this.r0 || this.Z == null || this.G0 == null || U1() < 0 || this.G0.b(U1()) < 0) {
                                                            final int i25 = 1;
                                                            dVar.setFilled(true);
                                                            dVar.g(LocaleController.getString(R.string.OK), !this.e1, true);
                                                            dVar.f(null, !this.e1);
                                                            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: ai.y4
                                                                public final /* synthetic */ k7 b;

                                                                {
                                                                    this.b = this;
                                                                }

                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    switch (i25) {
                                                                        case 0:
                                                                            this.b.e2();
                                                                            break;
                                                                        case 1:
                                                                            this.b.onBackPressed();
                                                                            break;
                                                                        case 2:
                                                                            s6 s6Var4 = this.b.P0;
                                                                            s6Var4.h.e();
                                                                            s6Var4.i.e();
                                                                            s6Var4.j.e();
                                                                            s6Var4.k.e();
                                                                            break;
                                                                        case 3:
                                                                            this.b.k2();
                                                                            break;
                                                                        default:
                                                                            k7 k7Var = this.b;
                                                                            org.telegram.ui.Wallet.v4 v4Var2 = k7Var.h1;
                                                                            if (v4Var2 != null) {
                                                                                k7Var.dismiss();
                                                                                AndroidUtilities.runOnUIThread(new a3.d(v4Var2, 13), 250L);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                        } else {
                                                            dVar.setFilled(r10);
                                                            int b10 = this.G0.b(U1());
                                                            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                                            spannableStringBuilder5.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                                                            Object obj3 = this.G0.get(b10);
                                                            if (!(obj3 instanceof TL_stars.SavedStarGift) || (starGift = ((TL_stars.SavedStarGift) obj3).gift) == null || (document = starGift.getDocument()) == null) {
                                                                z12 = true;
                                                            } else {
                                                                spannableStringBuilder5.append((CharSequence) " e");
                                                                z12 = true;
                                                                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.a6(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder5.length() - 1, spannableStringBuilder5.length(), 33);
                                                            }
                                                            dVar.g(spannableStringBuilder5, this.e1 ^ z12, z12);
                                                            dVar.f(null, this.e1 ^ z12);
                                                            dVar.setOnClickListener(new z2(this, b10, 3));
                                                        }
                                                        this.e.setTitle(this.V0);
                                                        s6Var2 = this.P0;
                                                        if (s6Var2 != null) {
                                                            return;
                                                        }
                                                        boolean z17 = this.Q0;
                                                        b2 b2Var = new b2(this, 23);
                                                        b2 b2Var2 = new b2(this, 24);
                                                        ArrayList arrayList = s6Var2.f;
                                                        e7 e7Var4 = s6Var2.a;
                                                        TL_stars.TL_starGiftUnique tL_starGiftUnique3 = s6Var2.l;
                                                        if (tL_starGiftUnique3 != null) {
                                                            cls2 = cls;
                                                            if (tL_starGiftUnique3.id == tL_starGiftUnique.id) {
                                                                z13 = s6Var2.o;
                                                                if (z13) {
                                                                    return;
                                                                }
                                                                e7Var3.b.setAlpha(0.0f);
                                                                e7Var3.c.setAlpha(1.0f);
                                                                dVar.g(LocaleController.getString(R.string.GiftSkipAnimation), true, true);
                                                                dVar.setFilled(true);
                                                                final int i26 = 2;
                                                                dVar.setOnClickListener(new View.OnClickListener(this) { // from class: ai.y4
                                                                    public final /* synthetic */ k7 b;

                                                                    {
                                                                        this.b = this;
                                                                    }

                                                                    @Override // android.view.View.OnClickListener
                                                                    public final void onClick(View view) {
                                                                        switch (i26) {
                                                                            case 0:
                                                                                this.b.e2();
                                                                                break;
                                                                            case 1:
                                                                                this.b.onBackPressed();
                                                                                break;
                                                                            case 2:
                                                                                s6 s6Var4 = this.b.P0;
                                                                                s6Var4.h.e();
                                                                                s6Var4.i.e();
                                                                                s6Var4.j.e();
                                                                                s6Var4.k.e();
                                                                                break;
                                                                            case 3:
                                                                                this.b.k2();
                                                                                break;
                                                                            default:
                                                                                k7 k7Var = this.b;
                                                                                org.telegram.ui.Wallet.v4 v4Var2 = k7Var.h1;
                                                                                if (v4Var2 != null) {
                                                                                    k7Var.dismiss();
                                                                                    AndroidUtilities.runOnUIThread(new a3.d(v4Var2, 13), 250L);
                                                                                    break;
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                });
                                                                int length2 = ((k7) this.T0.d).S0.length - 1;
                                                                im0 im0Var = this.d;
                                                                im0Var.u0(length2);
                                                                im0Var.post(new b2(this, 25));
                                                                return;
                                                            }
                                                        } else {
                                                            cls2 = cls;
                                                        }
                                                        if (z17) {
                                                            org.telegram.ui.Components.w9 upgradeImageView = e7Var4.getUpgradeImageView();
                                                            v6 v6Var = e7Var4.c;
                                                            TL_stars.starGiftAttributeModel upgradeImageViewAttribute = e7Var4.getUpgradeImageViewAttribute();
                                                            TL_stars.starGiftAttributePattern upgradePatternAttribute = e7Var4.getUpgradePatternAttribute();
                                                            TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute = e7Var4.getUpgradeBackdropAttribute();
                                                            TL_stars.starGiftAttributeModel stargiftattributemodel2 = (TL_stars.starGiftAttributeModel) ga.l(tL_starGiftUnique.attributes, cls2);
                                                            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                                                            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                                                            s6Var2.o = true;
                                                            s6Var2.l = tL_starGiftUnique;
                                                            s6Var2.r = b2Var;
                                                            s6Var2.s = b2Var2;
                                                            s6Var2.t = (float) Math.random();
                                                            s6Var2.m = System.currentTimeMillis();
                                                            s6Var2.n = 0.0f;
                                                            s6Var2.p = false;
                                                            s6Var2.q = false;
                                                            s6Var2.o = true;
                                                            o6 o6Var = s6Var2.h;
                                                            if (o6Var != null) {
                                                                o6Var.a();
                                                            }
                                                            q6 q6Var = new q6(v6Var, stargiftattributemodel2);
                                                            if (v6Var.isAttachedToWindow() && q6Var.c) {
                                                                q6Var.d.onAttachedToWindow();
                                                            }
                                                            s6Var2.h = new o6(new l6(s6Var2, 0), s6Var2.e, new q6(upgradeImageView, upgradeImageViewAttribute), q6Var, 0.9f, s6Var2.t > 0.5f ? 3 : 2);
                                                            o6 o6Var2 = s6Var2.i;
                                                            if (o6Var2 != null) {
                                                                o6Var2.a();
                                                            }
                                                            s6Var2.i = new o6(new l6(s6Var2, 0), s6Var2.g, new r6(upgradePatternAttribute), new r6(stargiftattributepattern), 1.0f, s6Var2.t > 0.5f ? 2 : 1);
                                                            o6 o6Var3 = s6Var2.j;
                                                            if (o6Var3 != null) {
                                                                o6Var3.a();
                                                            }
                                                            s6Var2.j = new o6(new l6(s6Var2, 0), arrayList, new p6(upgradeBackdropAttribute), new p6(stargiftattributebackdrop), 0.5f, s6Var2.t > 0.5f ? 2 : 1);
                                                            o6 o6Var4 = s6Var2.k;
                                                            if (o6Var4 != null) {
                                                                o6Var4.a();
                                                            }
                                                            s6Var2.k = new o6(new l6(s6Var2, 0), arrayList, new p6(upgradeBackdropAttribute), new p6(stargiftattributebackdrop), 1.25f, s6Var2.t > 0.5f ? 2 : 1);
                                                            s6Var2.b();
                                                            z13 = true;
                                                        } else {
                                                            z13 = false;
                                                        }
                                                        if (z13) {
                                                        }
                                                    } else {
                                                        dVar.setFilled(true);
                                                        H2(tL_starGiftUnique);
                                                        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: ai.y4
                                                            public final /* synthetic */ k7 b;

                                                            {
                                                                this.b = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                switch (r10) {
                                                                    case 0:
                                                                        this.b.e2();
                                                                        break;
                                                                    case 1:
                                                                        this.b.onBackPressed();
                                                                        break;
                                                                    case 2:
                                                                        s6 s6Var4 = this.b.P0;
                                                                        s6Var4.h.e();
                                                                        s6Var4.i.e();
                                                                        s6Var4.j.e();
                                                                        s6Var4.k.e();
                                                                        break;
                                                                    case 3:
                                                                        this.b.k2();
                                                                        break;
                                                                    default:
                                                                        k7 k7Var = this.b;
                                                                        org.telegram.ui.Wallet.v4 v4Var2 = k7Var.h1;
                                                                        if (v4Var2 != null) {
                                                                            k7Var.dismiss();
                                                                            AndroidUtilities.runOnUIThread(new a3.d(v4Var2, 13), 250L);
                                                                            break;
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                    }
                                                }
                                                this.e.setTitle(this.V0);
                                                s6Var2 = this.P0;
                                                if (s6Var2 != null) {
                                                }
                                            }
                                        }
                                        r14 = objArr2;
                                        cls = TL_stars.starGiftAttributeModel.class;
                                        r10 = 0;
                                        r13 = 1;
                                        B1(ga.l(tL_starGiftUnique.attributes, cls));
                                        B1(ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                                        B1(ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                        if (!z10) {
                                        }
                                        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                                        if (stargiftattributeoriginaldetails != null) {
                                        }
                                        if (this.i1 != null) {
                                        }
                                        s6Var = this.P0;
                                        ei.d dVar2 = this.k0;
                                        if (s6Var != null) {
                                        }
                                        if (this.i1 != null) {
                                        }
                                        this.e.setTitle(this.V0);
                                        s6Var2 = this.P0;
                                        if (s6Var2 != null) {
                                        }
                                    }
                                    r10 = 0;
                                    r14 = 0;
                                    r13 = 1;
                                    cls = TL_stars.starGiftAttributeModel.class;
                                    B1(ga.l(tL_starGiftUnique.attributes, cls));
                                    B1(ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                                    B1(ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                    if (!z10) {
                                    }
                                    stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                                    if (stargiftattributeoriginaldetails != null) {
                                    }
                                    if (this.i1 != null) {
                                    }
                                    s6Var = this.P0;
                                    ei.d dVar22 = this.k0;
                                    if (s6Var != null) {
                                    }
                                    if (this.i1 != null) {
                                    }
                                    this.e.setTitle(this.V0);
                                    s6Var2 = this.P0;
                                    if (s6Var2 != null) {
                                    }
                                }
                            }
                            spannable = null;
                            e7 e7Var32 = e7Var;
                            e7Var32.h(0, spannableStringBuilder, charSequence, y2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                            this.j1 = null;
                            j01 j01Var2 = this.i0;
                            j01Var2.removeAllViews();
                            if (!z10) {
                            }
                            r10 = 0;
                            r14 = 0;
                            r13 = 1;
                            cls = TL_stars.starGiftAttributeModel.class;
                            B1(ga.l(tL_starGiftUnique.attributes, cls));
                            B1(ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                            B1(ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                            if (!z10) {
                            }
                            stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                            if (stargiftattributeoriginaldetails != null) {
                            }
                            if (this.i1 != null) {
                            }
                            s6Var = this.P0;
                            ei.d dVar222 = this.k0;
                            if (s6Var != null) {
                            }
                            if (this.i1 != null) {
                            }
                            this.e.setTitle(this.V0);
                            s6Var2 = this.P0;
                            if (s6Var2 != null) {
                            }
                        } else {
                            charSequence2 = stargiftattributemodel.name;
                        }
                        charSequence = charSequence2;
                        if (tL_textWithEntities != null) {
                        }
                        spannable = null;
                        e7 e7Var322 = e7Var;
                        e7Var322.h(0, spannableStringBuilder, charSequence, y2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                        this.j1 = null;
                        j01 j01Var22 = this.i0;
                        j01Var22.removeAllViews();
                        if (!z10) {
                        }
                        r10 = 0;
                        r14 = 0;
                        r13 = 1;
                        cls = TL_stars.starGiftAttributeModel.class;
                        B1(ga.l(tL_starGiftUnique.attributes, cls));
                        B1(ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                        B1(ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        if (!z10) {
                        }
                        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                        if (stargiftattributeoriginaldetails != null) {
                        }
                        if (this.i1 != null) {
                        }
                        s6Var = this.P0;
                        ei.d dVar2222 = this.k0;
                        if (s6Var != null) {
                        }
                        if (this.i1 != null) {
                        }
                        this.e.setTitle(this.V0);
                        s6Var2 = this.P0;
                        if (s6Var2 != null) {
                        }
                    }
                }
                z11 = false;
                if (objArr == true) {
                }
                boolean d222 = d2(this.currentAccount, Y1());
                T1();
                e7Var.f(tL_starGiftUnique, z11, z15, d222);
                final int i142 = 4;
                int i152 = 2;
                final int i162 = 3;
                if (this.f1 != null) {
                }
                TL_stars.starGiftAttributeModel stargiftattributemodel3 = (TL_stars.starGiftAttributeModel) ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                spannableStringBuilder6.append((CharSequence) tL_starGiftUnique.title);
                spannableStringBuilder6.append((CharSequence) " ");
                int length3 = spannableStringBuilder6.length();
                StringBuilder sb32 = new StringBuilder("#");
                long j122 = j11;
                sb32.append(LocaleController.formatNumber(tL_starGiftUnique.num, ','));
                spannableStringBuilder6.append((CharSequence) sb32.toString());
                spannableStringBuilder6.setSpan(new RelativeSizeSpan(0.85f), length3, spannableStringBuilder6.length(), 33);
                spannableStringBuilder6.setSpan(new su(190, i12), length3, spannableStringBuilder6.length(), 33);
                wallettransaction = this.i1;
                if (wallettransaction != null) {
                }
                charSequence = charSequence2;
                if (tL_textWithEntities != null) {
                }
                spannable = null;
                e7 e7Var3222 = e7Var;
                e7Var3222.h(0, spannableStringBuilder6, charSequence, y2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                this.j1 = null;
                j01 j01Var222 = this.i0;
                j01Var222.removeAllViews();
                if (!z10) {
                }
                r10 = 0;
                r14 = 0;
                r13 = 1;
                cls = TL_stars.starGiftAttributeModel.class;
                B1(ga.l(tL_starGiftUnique.attributes, cls));
                B1(ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                B1(ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                if (!z10) {
                }
                stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                if (stargiftattributeoriginaldetails != null) {
                }
                if (this.i1 != null) {
                }
                s6Var = this.P0;
                ei.d dVar22222 = this.k0;
                if (s6Var != null) {
                }
                if (this.i1 != null) {
                }
                this.e.setTitle(this.V0);
                s6Var2 = this.P0;
                if (s6Var2 != null) {
                }
            } else {
                e7Var = e7Var2;
            }
        }
        if (z14 && this.P0 == null) {
            this.P0 = new s6(e7Var);
        }
        int i122 = 0;
        int i132 = 1;
        if (this.i1 != null) {
        }
        if (objArr == true) {
        }
        z11 = false;
        if (objArr == true) {
        }
        boolean d2222 = d2(this.currentAccount, Y1());
        T1();
        e7Var.f(tL_starGiftUnique, z11, z15, d2222);
        final int i1422 = 4;
        int i1522 = 2;
        final int i1622 = 3;
        if (this.f1 != null) {
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel32 = (TL_stars.starGiftAttributeModel) ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        SpannableStringBuilder spannableStringBuilder62 = new SpannableStringBuilder();
        spannableStringBuilder62.append((CharSequence) tL_starGiftUnique.title);
        spannableStringBuilder62.append((CharSequence) " ");
        int length32 = spannableStringBuilder62.length();
        StringBuilder sb322 = new StringBuilder("#");
        long j1222 = j11;
        sb322.append(LocaleController.formatNumber(tL_starGiftUnique.num, ','));
        spannableStringBuilder62.append((CharSequence) sb322.toString());
        spannableStringBuilder62.setSpan(new RelativeSizeSpan(0.85f), length32, spannableStringBuilder62.length(), 33);
        spannableStringBuilder62.setSpan(new su(190, i122), length32, spannableStringBuilder62.length(), 33);
        wallettransaction = this.i1;
        if (wallettransaction != null) {
        }
        charSequence = charSequence2;
        if (tL_textWithEntities != null) {
        }
        spannable = null;
        e7 e7Var32222 = e7Var;
        e7Var32222.h(0, spannableStringBuilder62, charSequence, y2(tL_starGiftUnique.released_by), null, tLObject, spannable);
        this.j1 = null;
        j01 j01Var2222 = this.i0;
        j01Var2222.removeAllViews();
        if (!z10) {
        }
        r10 = 0;
        r14 = 0;
        r13 = 1;
        cls = TL_stars.starGiftAttributeModel.class;
        B1(ga.l(tL_starGiftUnique.attributes, cls));
        B1(ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
        B1(ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
        if (!z10) {
        }
        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
        if (stargiftattributeoriginaldetails != null) {
        }
        if (this.i1 != null) {
        }
        s6Var = this.P0;
        ei.d dVar222222 = this.k0;
        if (s6Var != null) {
        }
        if (this.i1 != null) {
        }
        this.e.setTitle(this.V0);
        s6Var2 = this.P0;
        if (s6Var2 != null) {
        }
    }

    public final void H1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2CantDoTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.Gift2CantDoText);
        TL_stars.TL_starGiftUnique Y1 = Y1();
        if (Y1 != null && !TextUtils.isEmpty(Y1.slug)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OpenFragment), new r4(this, Y1, 1));
        }
        i2.d.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public final void H2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        ag.a resellAmount = tL_starGiftUnique.getResellAmount(ag.c.a);
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        ei.d dVar = this.k0;
        if (!z10) {
            dVar.g(md.R0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a())), !this.e1, true);
            dVar.f(null, !this.e1);
        } else {
            dVar.g(md.n1(md.T0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(ag.c.b).d()), true), true), !this.e1, true);
            dVar.f(md.R0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a())), !this.e1);
        }
    }

    public final void I1(long j10, TL_stars.starGiftDepositPayload stargiftdepositpayload, pf.c cVar, ug.m1 m1Var) {
        TL_wallet.nftItem nftitem = this.f1;
        TL_stars.TL_starGiftUnique Y1 = Y1();
        if (nftitem == null || Y1 == null || TextUtils.isEmpty(Y1.slug)) {
            return;
        }
        cVar.d();
        s3 s3Var = new s3(this, cVar, m1Var, j10, Y1, nftitem, 0);
        if (stargiftdepositpayload != null) {
            s3Var.run(stargiftdepositpayload);
            return;
        }
        TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
        depositstargift.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
        depositstargift.slug = Y1.slug;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(depositstargift, new org.telegram.messenger.a(), new t2(this, cVar, m1Var, s3Var, 1));
    }

    public final void I2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z10) {
        if (z10) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = UserConfig.getInstance(this.currentAccount).getClientUserId();
            tL_starGiftUnique.host_id = tL_peerUser;
            tL_starGiftUnique.flags |= 4096;
        } else {
            tL_starGiftUnique.host_id = null;
            tL_starGiftUnique.flags &= -4097;
        }
        this.f0.setWalletDisplayed(z10);
        S2();
    }

    public final void J1(final long j10, final Utilities.Callback callback) {
        TLRPC.Message message;
        long peerDialogId;
        long j11;
        TL_stars.InputSavedStarGift S1 = S1();
        if (S1 == null) {
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.F0;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            MessageObject messageObject = this.H0;
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            peerDialogId = DialogObject.getPeerDialogId(tL_messageActionStarGiftUnique.gift.owner_id);
            j11 = tL_messageActionStarGiftUnique.transfer_stars;
        } else {
            j11 = savedStarGift.transfer_stars;
            peerDialogId = this.X;
        }
        if (j11 <= 0) {
            TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
            transferstargift.stargift = S1;
            transferstargift.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(transferstargift, new a3(this, callback, j10, peerDialogId, 0));
            return;
        }
        final long j12 = peerDialogId;
        ga y3 = ga.y(this.currentAccount, false);
        if (!y3.e) {
            y3.r(new b3(this, y3, j10, callback, 0));
            return;
        }
        final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
        tL_inputInvoiceStarGiftTransfer.stargift = S1;
        tL_inputInvoiceStarGiftTransfer.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
        JSONObject q6 = gi.d3.q(this.resourcesProvider, false);
        if (q6 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = q6.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: ai.c3
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final k7 k7Var = k7.this;
                final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer2 = tL_inputInvoiceStarGiftTransfer;
                final long j13 = j10;
                final long j14 = j12;
                final Utilities.Callback callback2 = callback;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ai.k3
                    @Override // java.lang.Runnable
                    public final void run() {
                        k7.n1(k7.this, tLObject, tL_inputInvoiceStarGiftTransfer2, j13, j14, callback2, tL_error);
                    }
                });
            }
        });
    }

    public final void J2() {
        TL_stars.TL_starGiftUnique Y1 = Y1();
        if (Y1 == null) {
            return;
        }
        TLRPC.Peer peer = Y1.owner_id;
        if (peer == null) {
            peer = Y1.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Y1.title);
        sb2.append(" #");
        this.C0.setText(LocaleController.formatString(R.string.Gift2WearTitle, org.telegram.messenger.g0.h(Y1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.X0 == null) {
                this.X0 = new yq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.X0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        ei.d dVar = this.k0;
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new c2(this, 26));
        this.f0.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        O2(2, false, null);
        this.A0 = true;
    }

    public final void K1() {
        TL_stars.InputSavedStarGift S1;
        long j10;
        ei.d dVar = this.k0;
        if (dVar.N || (S1 = S1()) == null) {
            return;
        }
        MessageObject messageObject = this.H0;
        String str = null;
        long j11 = 0;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j10 = tL_messageActionStarGift.upgrade_stars;
            if (j10 <= 0) {
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift == null) {
                return;
            }
            j10 = savedStarGift.upgrade_stars;
            if (j10 <= 0) {
                str = savedStarGift.prepaid_upgrade_hash;
            }
        }
        if (j10 > 0 || this.s1 != null) {
            dVar.setLoading(true);
            xp xpVar = this.w0;
            if (j10 > 0) {
                TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                upgradestargift.keep_original_details = xpVar.a.q;
                upgradestargift.stargift = S1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(upgradestargift, new g(3, this, S1));
                return;
            }
            int i10 = 0;
            ga y3 = ga.y(this.currentAccount, false);
            if (!y3.e) {
                y3.r(new a1.f(18, this, y3));
                return;
            }
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = this.s1.form_id;
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = xpVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = S1;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.X);
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = this.s1.invoice.prices;
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j11 += tL_labeledPrice.amount;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new d0(this, str, S1, j11, 1));
        }
    }

    public final void K2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique Y1 = Y1();
        TL_stars.InputSavedStarGift S1 = S1();
        if (S1 == null || Y1 == null) {
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
        tL_inputInvoiceStarGiftDropOriginalDetails.stargift = S1;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        JSONObject q6 = gi.d3.q(this.resourcesProvider, false);
        if (q6 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = q6.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new w2(this, charSequence, Y1, tL_inputInvoiceStarGiftDropOriginalDetails, 0));
    }

    public final void L2(View view, CharSequence charSequence, boolean z10) {
        Layout layout;
        float primaryHorizontal;
        ei.x3 x3Var = this.y1;
        if ((x3Var != null && x3Var.V && this.z1 == view) || view == null) {
            return;
        }
        if (!z10) {
            if (view instanceof TextView) {
                layout = ((TextView) view).getLayout();
            } else if (!(view instanceof org.telegram.ui.ActionBar.j5)) {
                return;
            } else {
                layout = ((org.telegram.ui.ActionBar.j5) view).getLayout();
            }
            if (layout == null) {
                return;
            }
            CharSequence text = layout.getText();
            if (!(text instanceof Spanned)) {
                return;
            }
            Spanned spanned = (Spanned) text;
            org.telegram.ui.Components.ad[] adVarArr = (org.telegram.ui.Components.ad[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.ad.class);
            if (adVarArr == null || adVarArr.length <= 0) {
                return;
            }
            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(adVarArr[adVarArr.length - 1])) + view.getPaddingLeft() + (r5.a() / 2.0f);
        } else {
            if (!(view instanceof org.telegram.ui.ActionBar.j5)) {
                return;
            }
            org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) view;
            primaryHorizontal = (j5Var.getRightDrawableWidth() / 2.0f) + j5Var.getRightDrawableX();
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        n5 n5Var = this.Y;
        n5Var.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        ei.x3 x3Var2 = this.y1;
        if (x3Var2 != null) {
            x3Var2.e(true);
            this.y1 = null;
        }
        ei.x3 x3Var3 = new ei.x3(getContext(), 3);
        x3Var3.p(!z10);
        x3Var3.s(charSequence);
        x3Var3.m(0.0f, (iArr[0] + primaryHorizontal) - (AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft));
        x3Var3.setTranslationY(((iArr[1] - AndroidUtilities.dp(100.0f)) - (view.getHeight() / 2.0f)) + AndroidUtilities.dp((z10 ? 18 : 0) + 4.33f));
        x3Var3.d = 3000L;
        x3Var3.setPadding(AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0);
        x3Var3.l0 = new v2(x3Var3, 0);
        x3Var3.u();
        n5Var.addView(x3Var3, w7.z5.c(100.0f, -1));
        this.y1 = x3Var3;
        this.z1 = view;
    }

    @Override // org.telegram.ui.Components.bb
    public final boolean M() {
        return false;
    }

    public final void M2(int i10, Context context, boolean z10) {
        LinearLayout e = lk.e(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(64.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.resourcesProvider)));
        e.addView(frameLayout, w7.z5.t(64, 64, 49, 0, 6, 0, 0));
        xj0 xj0Var = new xj0(context);
        xj0Var.setScaleType(ImageView.ScaleType.CENTER);
        xj0Var.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView(xj0Var, w7.z5.q(64, 64, 17));
        xj0Var.d();
        TextView b10 = w7.d6.b(context, 20.0f, org.telegram.ui.ActionBar.h6.G6, true, null);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(z10 ? R.string.Gift2ResellTimeoutTitle : R.string.Gift2TransferTimeoutTitle));
        e.addView(b10, w7.z5.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = w7.d6.b(context, 14.0f, org.telegram.ui.ActionBar.h6.F6, false, null);
        b11.setGravity(17);
        b11.setText(LocaleController.formatString(z10 ? R.string.Gift2ResellTimeout : R.string.Gift2TransferTimeout, LocaleController.formatTTLString(Math.max(10, i10))));
        e.addView(b11, w7.z5.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, this.resourcesProvider);
        alertDialog$Builder.n(e);
        org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
    }

    public final int N1() {
        if (this.b1.d(1)) {
            return this.s0.getMeasuredHeight();
        }
        if (this.b1.d(2)) {
            return this.B0.getMeasuredHeight();
        }
        if (this.b1.d(3)) {
            return this.D0.getMeasuredHeight();
        }
        if (this.b1.d(4)) {
            return 0;
        }
        return this.g0.getMeasuredHeight();
    }

    public final void N2(boolean z10, org.telegram.ui.ActionBar.b2 b2Var, pf.c cVar, Runnable runnable) {
        cVar.d();
        UserConfig userConfig = UserConfig.getInstance(this.currentAccount);
        TL_account.tmpPassword tmppassword = userConfig.tmpPassword;
        if (tmppassword != null && tmppassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
            userConfig.tmpPassword = null;
            userConfig.saveConfig(false);
        }
        TL_account.tmpPassword tmppassword2 = userConfig.tmpPassword;
        if (tmppassword2 == null) {
            p2(z10, cVar, runnable);
        } else {
            a2(tmppassword2.tmp_password, null, z10, new o3(this, z10, cVar, runnable, b2Var));
        }
    }

    public final long O1() {
        TLRPC.Peer peer;
        MessageObject messageObject = this.H0;
        if (messageObject == null) {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                return starGift instanceof TL_stars.TL_starGiftUnique ? DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift).owner_id) : this.X;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.J0;
            if (tL_starGiftUnique != null) {
                return DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
            }
            return 0L;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            return 0L;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
            return peer2 != null ? DialogObject.getPeerDialogId(peer2) : messageObject.isOutOwner() ? this.H0.getDialogId() : UserConfig.getInstance(this.currentAccount).getClientUserId();
        }
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            return 0L;
        }
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
        TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
        if ((starGift2 instanceof TL_stars.TL_starGiftUnique) && (peer = starGift2.owner_id) != null) {
            return DialogObject.getPeerDialogId(peer);
        }
        TLRPC.Peer peer3 = tL_messageActionStarGiftUnique.peer;
        if (peer3 != null) {
            return DialogObject.getPeerDialogId(peer3);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O2(int i10, boolean z10, ah.t tVar) {
        int i11;
        ei.x3 x3Var;
        s6 s6Var;
        ValueAnimator valueAnimator = this.c1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c1 = null;
        }
        e7 e7Var = this.f0;
        int i12 = 1;
        if (i10 != 1) {
            AndroidUtilities.cancelRunOnUIThread(e7Var.j0);
        }
        if (!this.e1) {
            this.a1 = Float.valueOf(this.Y.d());
        }
        g6 g6Var = this.b1;
        this.b1 = new g6(g6Var == null ? 0 : g6Var.c, i10);
        l5 l5Var = this.T0;
        int finalHeight = e7Var.getFinalHeight();
        int N1 = N1();
        if (this.b1.d(1)) {
            FrameLayout frameLayout = this.n0;
            if (frameLayout.getVisibility() == 0) {
                i11 = frameLayout.getMeasuredHeight();
                l5Var.F(finalHeight, N1 + i11);
                if (this.b1.c == 0 && (s6Var = this.P0) != null) {
                    s6Var.c();
                }
                j5 j5Var = this.D0;
                j5 j5Var2 = this.B0;
                j5 j5Var3 = this.s0;
                j5 j5Var4 = this.g0;
                if (z10) {
                    this.b1.a = 1.0f;
                    h2();
                    j5Var4.setVisibility(i10 == 0 ? 0 : 8);
                    j5Var3.setVisibility(i10 == 1 ? 0 : 8);
                    j5Var2.setVisibility(i10 == 2 ? 0 : 8);
                    j5Var.setVisibility(i10 != 3 ? 8 : 0);
                    Q2();
                    if (tVar != null) {
                        tVar.run();
                    }
                } else {
                    j5Var4.setVisibility(this.b1.b(0) ? 0 : 8);
                    j5Var3.setVisibility(this.b1.b(1) ? 0 : 8);
                    j5Var2.setVisibility(this.b1.b(2) ? 0 : 8);
                    j5Var.setVisibility(this.b1.b(3) ? 0 : 8);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.c1 = ofFloat;
                    ofFloat.addUpdateListener(new ah.c0(this, i12));
                    this.c1.addListener(new b5(this, i10, tVar, r5));
                    this.c1.setInterpolator(bs.h);
                    this.c1.setDuration(320L);
                    this.c1.start();
                    g6 g6Var2 = this.b1;
                    org.telegram.ui.Components.w9[] w9VarArr = e7Var.d;
                    int i13 = g6Var2.b;
                    int i14 = g6Var2.c;
                    if (i13 != i14) {
                        uj0 lottieAnimation = w9VarArr[i13].getImageReceiver().getLottieAnimation();
                        uj0 lottieAnimation2 = w9VarArr[i14].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.T(lottieAnimation.t(), false);
                        }
                    }
                }
                x3Var = this.y1;
                if (x3Var == null) {
                    x3Var.e(true);
                    this.y1 = null;
                    return;
                }
                return;
            }
        }
        i11 = 0;
        l5Var.F(finalHeight, N1 + i11);
        if (this.b1.c == 0) {
            s6Var.c();
        }
        j5 j5Var5 = this.D0;
        j5 j5Var22 = this.B0;
        j5 j5Var32 = this.s0;
        j5 j5Var42 = this.g0;
        if (z10) {
        }
        x3Var = this.y1;
        if (x3Var == null) {
        }
    }

    public final TL_stars.StarGift P1() {
        MessageObject messageObject = this.H0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null) {
                return null;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                return ((TLRPC.TL_messageActionStarGift) messageAction).gift;
            }
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                return ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.J0;
            if (tL_starGiftUnique != null) {
                return tL_starGiftUnique;
            }
        }
        return null;
    }

    public final void P2(boolean z10) {
        boolean z11;
        TL_stars.TL_starGiftUnique Y1 = Y1();
        if (Y1 == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", 3).apply();
        boolean d22 = d2(this.currentAccount, Y1());
        boolean z12 = !d22;
        boolean d23 = d2(this.currentAccount, Y1());
        ei.d dVar = this.k0;
        if (d23) {
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(O1(), new TLRPC.TL_emojiStatusEmpty(), null);
            z11 = z12;
        } else {
            z11 = z12;
            long O1 = O1();
            if (O1 >= 0) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                    org.telegram.ui.Components.qc P = getBulletinFactory().P(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.Gift2ActionWearNeededPremium), new b2(this, 3)));
                    P.t = true;
                    P.j();
                    return;
                }
            } else if (!z10) {
                MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                dVar.setLoading(true);
                MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(O1, new e2(this, messagesController, O1, 0));
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = Y1.id;
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(O1(), tL_inputEmojiStatusCollectible, Y1);
        }
        this.f0.I[1].c(!d22 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, LocaleController.getString(!d22 ? R.string.Gift2ActionWearOff : R.string.Gift2ActionWear), true);
        if (this.A0) {
            dismiss();
            return;
        }
        ah.t tVar = new ah.t(2, this, z11);
        if (this.b1.c(0)) {
            tVar.run();
        } else {
            O2(0, true, tVar);
        }
        dVar.g(LocaleController.getString(R.string.OK), !this.e1, true);
        dVar.f(null, !this.e1);
        dVar.setOnClickListener(new c2(this, 4));
    }

    public final String Q1() {
        TL_stars.StarGift P1 = P1();
        if (!(P1 instanceof TL_stars.TL_starGiftUnique)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((TL_stars.TL_starGiftUnique) P1).title);
        sb2.append(" #");
        return org.telegram.messenger.g0.h(r0.num, ',', sb2);
    }

    public final void Q2() {
        FrameLayout frameLayout = this.n0;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.p0;
        FrameLayout frameLayout3 = this.l0;
        if (visibility != 0) {
            frameLayout3.setTranslationY(0.0f);
            frameLayout.setTranslationY(0.0f);
            frameLayout2.setTranslationY(0.0f);
        } else {
            frameLayout3.setTranslationY(this.b1.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.b1.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.b1.a(1) * (-frameLayout.getMeasuredHeight()));
        }
    }

    public final void R2() {
        boolean Z1 = Z1(false);
        h5 h5Var = this.Z;
        h5Var.setPosition(Z1 ? 1 : 0);
        h5Var.C(false);
        if (this.G0 == null || Z1(true) || this.G0.e() >= this.G0.c()) {
            return;
        }
        this.G0.a();
    }

    public final TL_stars.InputSavedStarGift S1() {
        TLRPC.Message message;
        TLRPC.Message message2;
        TLRPC.Message message3;
        long j10 = this.X;
        if (j10 < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            MessageObject messageObject = this.H0;
            if (messageObject == null || (message3 = messageObject.messageOwner) == null) {
                TL_stars.SavedStarGift savedStarGift = this.F0;
                if (savedStarGift != null) {
                    if ((savedStarGift.flags & 2048) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                    return tL_inputSavedStarGiftChat;
                }
                if (this.J0 == null || TextUtils.isEmpty(this.I0)) {
                    return tL_inputSavedStarGiftChat;
                }
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.I0;
                return tL_inputSavedStarGiftSlug;
            }
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if ((tL_messageActionStarGift.flags & 4096) == 0) {
                    return null;
                }
                tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGift.saved_id;
                return tL_inputSavedStarGiftChat;
            }
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return null;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if ((tL_messageActionStarGiftUnique.flags & 128) == 0) {
                return null;
            }
            tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGiftUnique.saved_id;
            return tL_inputSavedStarGiftChat;
        }
        MessageObject messageObject2 = this.H0;
        if (messageObject2 != null && messageObject2.getDialogId() < 0 && (message2 = this.H0.messageOwner) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.H0.getDialogId());
                tL_inputSavedStarGiftChat2.saved_id = ((TLRPC.TL_messageActionStarGift) messageAction2).saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        MessageObject messageObject3 = this.H0;
        if (messageObject3 != null && messageObject3.getDialogId() < 0 && (message = this.H0.messageOwner) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat3.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.H0.getDialogId());
                tL_inputSavedStarGiftChat3.saved_id = ((TLRPC.TL_messageActionStarGiftUnique) messageAction3).saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        MessageObject messageObject4 = this.H0;
        if (messageObject4 != null) {
            TLRPC.Message message4 = messageObject4.messageOwner;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = messageObject4.getId();
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.SavedStarGift savedStarGift2 = this.F0;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        if (this.J0 == null || TextUtils.isEmpty(this.I0)) {
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
        tL_inputSavedStarGiftSlug2.slug = this.I0;
        return tL_inputSavedStarGiftSlug2;
    }

    public final void S2() {
        TL_stars.TL_starGiftUnique Y1 = Y1();
        TL_wallet.nftItem nftitem = this.f1;
        LinearLayout linearLayout = this.y0;
        if (nftitem == null || Y1 == null) {
            linearLayout.setVisibility(8);
            return;
        }
        this.h0.setVisibility(8);
        this.j0.setVisibility(8);
        linearLayout.setVisibility(0);
        this.z0.a(Y1.host_id != null, linearLayout.isAttachedToWindow());
    }

    public final String T1() {
        TL_stars.StarGift P1 = P1();
        if (!(P1 instanceof TL_stars.TL_starGiftUnique) || P1.slug == null) {
            return null;
        }
        return MessagesController.getInstance(this.currentAccount).linkPrefix + "/nft/" + P1.slug;
    }

    public final int U1() {
        int indexOf;
        z9 z9Var = this.G0;
        if (z9Var == null) {
            return -1;
        }
        TL_stars.SavedStarGift savedStarGift = this.F0;
        if (savedStarGift != null) {
            indexOf = z9Var.indexOf(savedStarGift);
        } else {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.J0;
            if (tL_starGiftUnique == null) {
                return -1;
            }
            indexOf = z9Var.indexOf(tL_starGiftUnique);
        }
        if (indexOf >= 0) {
            return indexOf;
        }
        TL_stars.StarGift P1 = P1();
        for (int i10 = 0; i10 < this.G0.e(); i10++) {
            Object obj = this.G0.get(i10);
            if (obj instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift2 = this.F0;
                if (savedStarGift2 != null) {
                    if (L1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                        return i10;
                    }
                }
                if (P1 != null) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                    if (P1 != starGift) {
                        if ((P1 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && P1.id == starGift.id) {
                        }
                    }
                    return i10;
                }
                continue;
            } else {
                if ((obj instanceof TL_stars.TL_starGiftUnique) && M1(this.J0, (TL_stars.TL_starGiftUnique) obj)) {
                    return i10;
                }
            }
        }
        return -1;
    }

    public final TL_stars.SavedStarGift V1(boolean z10) {
        int U1 = U1();
        if (U1 < 0) {
            return null;
        }
        int i10 = (z10 ? 1 : -1) + U1;
        int i11 = this.U0;
        if (i11 >= 0 && (!z10 ? i11 < U1 : i11 > U1)) {
            i10 = i11;
        }
        z9 z9Var = this.G0;
        Object obj = (z9Var == null || i10 < 0 || i10 >= z9Var.e()) ? null : this.G0.get(i10);
        if (obj instanceof TL_stars.SavedStarGift) {
            return (TL_stars.SavedStarGift) obj;
        }
        return null;
    }

    public final TL_stars.TL_starGiftUnique W1(boolean z10) {
        int U1 = U1();
        if (U1 < 0) {
            return null;
        }
        int i10 = (z10 ? 1 : -1) + U1;
        int i11 = this.U0;
        if (i11 >= 0 && (!z10 ? i11 < U1 : i11 > U1)) {
            i10 = i11;
        }
        z9 z9Var = this.G0;
        Object obj = (z9Var == null || i10 < 0 || i10 >= z9Var.e()) ? null : this.G0.get(i10);
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) obj;
        }
        return null;
    }

    public final TL_stars.TL_starGiftUnique Y1() {
        TL_stars.StarGift P1 = P1();
        if (P1 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) P1;
        }
        return null;
    }

    public final boolean Z1(boolean z10) {
        return (V1(z10) == null && W1(z10) == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a2(byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, o3 o3Var) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl;
        TL_stars.InputSavedStarGift S1 = S1();
        if (S1 == null) {
            if (o3Var != null) {
                o3Var.run(Boolean.FALSE);
                return;
            }
            return;
        }
        if (z10) {
            TL_stars.withdrawStarGift withdrawstargift = new TL_stars.withdrawStarGift();
            withdrawstargift.keep_on_profile = this.x1;
            withdrawstargift.stargift = S1;
            withdrawstargift.tmp_password = bArr;
            getstargiftwithdrawalurl = withdrawstargift;
        } else {
            TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl2 = new TL_stars.getStarGiftWithdrawalUrl();
            getstargiftwithdrawalurl2.stargift = S1;
            getstargiftwithdrawalurl2.tmp_password = bArr;
            getstargiftwithdrawalurl = getstargiftwithdrawalurl2;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getstargiftwithdrawalurl, new f4(this, o3Var, twoStepVerificationActivity, z10, 0));
    }

    @Override // org.telegram.ui.Components.bb, org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        if (this.b1.c(4)) {
            boolean z10 = this.f0.M.h0;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithTouchOutside() {
        if (this.b1.c(4) && this.f0.M.h0) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        if (this.b1.c(4) && this.f0.M.h0) {
            return false;
        }
        return super.canSwipeToBack(motionEvent);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (this.G0 == ((y9) objArr[1])) {
                d6 d6Var = this.f0.M;
                if (d6Var == null || !d6Var.h0) {
                    R2();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        if (this.b1.c(4) && this.f0.M.h0) {
            return;
        }
        yh.e4 e4Var = this.W0;
        if (e4Var != null) {
            e4Var.b();
            this.W0 = null;
        }
        s6 s6Var = this.P0;
        if (s6Var != null) {
            s6Var.a();
        }
        super.dismiss();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r4 != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e2() {
        long clientUserId;
        TL_stars.TL_starGiftUnique Y1 = Y1();
        if (this.k0.N || Y1 == null) {
            return;
        }
        if (this.J0 != null && this.K0) {
            clientUserId = this.X;
        }
        clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        ag.c cVar = Y1.resale_ton_only ? ag.c.b : ag.c.a;
        if (this.J0 == null || !this.K0) {
            w2(Y1, clientUserId, cVar, null, true, null);
            return;
        }
        yh.i0 i0Var = new yh.i0(getContext(), this.resourcesProvider, Y1, clientUserId);
        i0Var.K = new q4(this, i0Var, Y1, clientUserId, cVar, 0);
        i0Var.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f2(View view) {
        int i10;
        TLRPC.Message message;
        TLRPC.Message message2;
        if (view.getAlpha() < 0.99f) {
            H1();
            return;
        }
        TL_stars.TL_starGiftUnique Y1 = Y1();
        if (Y1 == null) {
            return;
        }
        int i11 = 0;
        if (Y1.resell_amount != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String formatString = LocaleController.formatString(R.string.Gift2UnlistTitle, Q1());
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.R = formatString;
            b2Var.T = LocaleController.getString(R.string.Gift2UnlistText);
            alertDialog$Builder.k(LocaleController.getString(R.string.Gift2ActionUnlist), new r4(this, Y1, i11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new aa.a(13));
            alertDialog$Builder.o();
            return;
        }
        MessageObject messageObject = this.H0;
        if (messageObject != null && (message2 = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message2.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_resell_at;
                if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                    md.g1(getContext(), this.currentAccount, null, new s4(this, Y1, i11), this.resourcesProvider);
                    return;
                }
                Context context = getContext();
                MessageObject messageObject2 = this.H0;
                if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
                    TLRPC.MessageAction messageAction2 = message.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        i11 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_resell_at;
                        M2(i11 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, true);
                        return;
                    }
                }
                TL_stars.SavedStarGift savedStarGift = this.F0;
                if (savedStarGift != null) {
                    i11 = savedStarGift.can_resell_at;
                }
                M2(i11 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, true);
                return;
            }
        }
        TL_stars.SavedStarGift savedStarGift2 = this.F0;
        i10 = savedStarGift2 != null ? savedStarGift2.can_resell_at : 0;
        if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
        }
    }

    public final void g2() {
        a5 a5Var = this.Z0;
        if (a5Var != null && a5Var.isShown()) {
            this.Z0.dismiss();
        }
        String T1 = T1();
        a5 a5Var2 = new a5(this, getContext(), T1, T1, this.resourcesProvider);
        this.Z0 = a5Var2;
        a5Var2.s0 = new a6.i(this, 4);
        a5Var2.show();
    }

    @Override // org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.j2
    public org.telegram.ui.Components.xc getBulletinFactory() {
        return new org.telegram.ui.Components.xc(this.p0, this.resourcesProvider);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique) r4).can_craft_at > 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0090, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r4.can_craft_at > 0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h2() {
        TL_stars.TL_starGiftUnique Y1;
        this.g0.setAlpha(this.b1.a(0));
        this.s0.setAlpha(this.b1.a(1));
        this.B0.setAlpha(this.b1.a(2));
        this.D0.setAlpha(this.b1.a(3));
        float a2 = 1.0f - this.b1.a(4);
        FrameLayout frameLayout = this.l0;
        frameLayout.setAlpha(a2);
        g6 g6Var = this.b1;
        e7 e7Var = this.f0;
        e7Var.d(g6Var);
        ImageView imageView = e7Var.Q;
        if (this.b1.c(0) && (Y1 = Y1()) != null && !Y1.crafted && c2(this.currentAccount, DialogObject.getPeerDialogId(Y1.owner_id))) {
            MessageObject messageObject = this.H0;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    }
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.F0;
                if (savedStarGift != null) {
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                    }
                }
            }
            imageView.setVisibility(r4);
            n5 n5Var = this.Y;
            float d = n5Var.d();
            this.e0.setAlpha(this.b1.a(0) * Utilities.clamp01(AndroidUtilities.ilerp(d - r6.getHeight(), 0.0f, AndroidUtilities.dp(32.0f))));
            n5Var.e();
            n5Var.invalidate();
            frameLayout.setVisibility(this.b1.c(4) ? 8 : 0);
            Q2();
        }
        int i10 = 8;
        imageView.setVisibility(i10);
        n5 n5Var2 = this.Y;
        float d10 = n5Var2.d();
        this.e0.setAlpha(this.b1.a(0) * Utilities.clamp01(AndroidUtilities.ilerp(d10 - r6.getHeight(), 0.0f, AndroidUtilities.dp(32.0f))));
        n5Var2.e();
        n5Var2.invalidate();
        frameLayout.setVisibility(this.b1.c(4) ? 8 : 0);
        Q2();
    }

    public final void i2(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        int i10;
        if (getContext() == null) {
            return;
        }
        if (tL_error == null) {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.o0();
            }
            org.telegram.ui.Components.xc.b0("NULL_ERROR");
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new k4(this, twoStepVerificationActivity, z10, 1), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
            }
            org.telegram.ui.Components.xc.d0(tL_error);
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.o0();
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2TransferToTONAlertTitle);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(getContext());
        int i11 = org.telegram.ui.ActionBar.h6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText)));
        linearLayout.addView(textView, w7.z5.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.g0.n(R.string.Gift2TransferToTONAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, w7.z5.n(-1, -2));
            linearLayout2.addView(imageView, w7.z5.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, w7.z5.n(-2, -2));
            linearLayout2.addView(textView2, w7.z5.n(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i11, false), mode));
        TextView textView3 = new TextView(getContext());
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.g0.n(R.string.Gift2TransferToTONAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, w7.z5.n(-1, -2));
            i10 = 5;
            linearLayout3.addView(imageView2, w7.z5.q(-2, -2, 5));
        } else {
            i10 = 5;
            linearLayout3.addView(imageView2, w7.z5.n(-2, -2));
            linearLayout3.addView(textView3, w7.z5.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.Gift2TransferToTONSetPassword), new aa.a(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            TextView textView4 = new TextView(getContext());
            textView4.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            textView4.setTextSize(1, 16.0f);
            if (!LocaleController.isRTL) {
                i10 = 3;
            }
            textView4.setGravity(i10 | 48);
            textView4.setText(LocaleController.getString(R.string.Gift2TransferToTONAlertText3));
            linearLayout.addView(textView4, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
        } else {
            alertDialog$Builder.o();
        }
    }

    public final void j2() {
        TL_stars.TL_starGiftUnique Y1 = Y1();
        if (Y1 == null) {
            return;
        }
        md.g1(getContext(), this.currentAccount, Y1, new s4(this, Y1, 2), this.resourcesProvider);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k2() {
        int i10;
        CharSequence formatSpannable;
        int i11;
        long j10;
        String str;
        String str2;
        String str3;
        long j11;
        String str4;
        TL_wallet.nftItem nftitem;
        String str5;
        org.telegram.ui.Wallet.u4 u4Var = this.g1;
        if (u4Var == null) {
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) u4Var.c).currentAccount;
        if (!org.telegram.ui.Wallet.t7.F(i10, u4Var.a.slug)) {
            org.telegram.ui.Wallet.u4 u4Var2 = this.g1;
            org.telegram.ui.Wallet.t7 t7Var = u4Var2.c.i0;
            if (t7Var == null || (nftitem = u4Var2.b) == null || (str5 = nftitem.address) == null || !str5.equals(t7Var.P0)) {
                Context context = getContext();
                int i12 = this.currentAccount;
                org.telegram.ui.Components.xc bulletinFactory = getBulletinFactory();
                org.telegram.ui.ActionBar.d6 d6Var = this.resourcesProvider;
                TL_stars.TL_starGiftUnique Y1 = Y1();
                ArrayList arrayList = new ArrayList(AppGlobalConfig.getInstance(i12).walletCardBgGifts.get());
                if (arrayList.isEmpty()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                boolean z10 = 0;
                int i13 = 0;
                while (i13 < size) {
                    int i14 = i13 + 1;
                    String str6 = (String) arrayList.get(i13);
                    String str7 = "[^\\p{L}\\p{N}]";
                    String replaceAll = str6.replaceAll("[^\\p{L}\\p{N}]", "");
                    Locale locale = Locale.ROOT;
                    String lowerCase = replaceAll.toLowerCase(locale);
                    if (Y1 == null || (str4 = Y1.title) == null || !lowerCase.equals(str4.replaceAll("[^\\p{L}\\p{N}]", "").toLowerCase(locale))) {
                        ga y3 = ga.y(i12, z10);
                        y3.V();
                        ArrayList arrayList3 = y3.H;
                        int size2 = arrayList3.size();
                        ArrayList arrayList4 = arrayList3;
                        int i15 = z10;
                        while (i15 < size2) {
                            Object obj = arrayList4.get(i15);
                            int i16 = i15 + 1;
                            ArrayList arrayList5 = arrayList4;
                            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                            if (starGift != null) {
                                i11 = i12;
                                String str8 = starGift.title;
                                if (str8 != null) {
                                    str2 = str7;
                                    if (lowerCase.equals(str8.replaceAll(str7, "").toLowerCase(Locale.ROOT))) {
                                        str3 = starGift.title;
                                        j11 = starGift.id;
                                    }
                                } else {
                                    str2 = str7;
                                }
                            } else {
                                str2 = str7;
                                i11 = i12;
                            }
                            i12 = i11;
                            arrayList4 = arrayList5;
                            str7 = str2;
                            i15 = i16;
                        }
                        i11 = i12;
                        j10 = 0;
                        str = null;
                        if (str != null) {
                            str = str6.replaceAll("(?<=[a-z0-9])(?=[A-Z])", " ");
                        }
                        String str9 = str;
                        SpannableString spannableString = new SpannableString(str9);
                        i12 = i11;
                        spannableString.setSpan(new d5(new boolean[1], i12, context, d6Var, j10, str9, str6), 0, spannableString.length(), 33);
                        arrayList2.add(spannableString);
                        z10 = 0;
                        i13 = i14;
                    } else {
                        str3 = Y1.title;
                        j11 = Y1.gift_id;
                        i11 = i12;
                    }
                    str = str3;
                    j10 = j11;
                    if (str != null) {
                    }
                    String str92 = str;
                    SpannableString spannableString2 = new SpannableString(str92);
                    i12 = i11;
                    spannableString2.setSpan(new d5(new boolean[1], i12, context, d6Var, j10, str92, str6), 0, spannableString2.length(), 33);
                    arrayList2.add(spannableString2);
                    z10 = 0;
                    i13 = i14;
                }
                int i17 = z10;
                if (arrayList2.size() == 1) {
                    int i18 = R.string.WalletGiftColorOnlyOne;
                    Object[] objArr = new Object[1];
                    objArr[i17] = arrayList2.get(i17);
                    formatSpannable = LocaleController.formatSpannable(i18, objArr);
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    int i19 = 0;
                    for (int i20 = 1; i19 < arrayList2.size() - i20; i20 = 1) {
                        if (i19 > 0) {
                            spannableStringBuilder.append((CharSequence) ", ");
                        }
                        spannableStringBuilder.append((CharSequence) arrayList2.get(i19));
                        i19++;
                    }
                    formatSpannable = LocaleController.formatSpannable(R.string.WalletGiftColorOnly, spannableStringBuilder, i2.d.h(1, arrayList2));
                }
                org.telegram.ui.Components.qc L = bulletinFactory.L(context.getResources().getDrawable(R.drawable.filled_card_color_28).mutate(), formatSpannable);
                org.telegram.ui.Components.ub ubVar = L.e;
                if (ubVar instanceof org.telegram.ui.Components.yb) {
                    TextView textView = ((org.telegram.ui.Components.yb) ubVar).b;
                    textView.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                    textView.setEllipsize(null);
                }
                L.j();
                return;
            }
        }
        org.telegram.ui.Wallet.u4 u4Var3 = this.g1;
        dismiss();
        Objects.requireNonNull(u4Var3);
        AndroidUtilities.runOnUIThread(new a3.d(u4Var3, 12), 250L);
    }

    public final void l2() {
        if (UserConfig.getInstance(this.currentAccount).isPremium() && (d2(this.currentAccount, Y1()) || this.Y0)) {
            P2(false);
            return;
        }
        TL_stars.TL_starGiftUnique Y1 = Y1();
        if (Y1 == null) {
            return;
        }
        TLRPC.Peer peer = Y1.owner_id;
        if (peer == null) {
            peer = Y1.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Y1.title);
        sb2.append(" #");
        this.C0.setText(LocaleController.formatString(R.string.Gift2WearTitle, org.telegram.messenger.g0.h(Y1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.X0 == null) {
                this.X0 = new yq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.X0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        ei.d dVar = this.k0;
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new c2(this, 3));
        this.f0.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        O2(2, true, null);
    }

    public final void m2(long j10, String str) {
        this.n1 = true;
        ga.y(this.currentAccount, false).K(j10, new n2(2, this, str));
    }

    public final void n2(boolean z10) {
        int i10;
        MessageObject messageObject = this.H0;
        int i11 = 0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
                }
            }
            i10 = 0;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift != null) {
                i10 = savedStarGift.can_craft_at;
            }
            i10 = 0;
        }
        int i12 = 1;
        if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string = LocaleController.getString(R.string.GiftCraftLaterTitle);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.R = string;
            b2Var.T = LocaleController.formatString(R.string.GiftCraftLaterText, LocaleController.formatDateTime(i10, true));
            org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique Y1 = Y1();
        if (Y1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(Y1.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string2 = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
            b2Var2.R = string2;
            b2Var2.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
            org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        e7 e7Var = this.f0;
        if (z10) {
            e7Var.M.a(this.currentAccount, Y1.gift_id, Y1.getDocument(), Y1.title);
            if (G1()) {
                d6 d6Var = e7Var.M;
                TL_stars.TL_starGiftUnique Y12 = Y1();
                if (Y12 == null) {
                    d6Var.getClass();
                } else {
                    while (true) {
                        b6[] b6VarArr = d6Var.n;
                        if (i11 >= b6VarArr.length) {
                            break;
                        }
                        b6 b6Var = b6VarArr[i11];
                        TL_stars.StarGift starGift = b6Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            b6Var.a(Y12, true);
                            break;
                        }
                        i11++;
                    }
                    d6Var.d(true);
                }
            }
        }
        d6 d6Var2 = e7Var.M;
        d6 d6Var3 = e7Var.M;
        d6Var2.setOnCraft(new h2(this, i12));
        if (this.W0 == null) {
            yh.e4 e4Var = new yh.e4(this.currentAccount, Y1.gift_id);
            this.W0 = e4Var;
            e4Var.a();
        }
        d6Var3.setOnAddGift(new s4(this, Y1, i12));
        d6Var3.setOnClose(new b2(this, 22));
        O2(4, true, null);
    }

    public final void o2(long j10) {
        ei.x3 x3Var = this.y1;
        if (x3Var != null) {
            x3Var.e(true);
            this.y1 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null || UserObject.isService(j10)) {
            return;
        }
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
            if (j10 == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                bundle.putBoolean("my_profile", true);
            }
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putBoolean("open_gifts", true);
        U.presentFragment(new ProfileActivity(bundle, null));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        e7 e7Var;
        d6 d6Var;
        if (this.b1.c(4) && (e7Var = this.f0) != null && (d6Var = e7Var.M) != null) {
            if (d6Var.h0) {
                return;
            }
            if (d6Var.i0) {
                super.onBackPressed();
                return;
            }
        }
        if (this.A0 || this.b1.c <= 0 || this.k0.N || this.n1) {
            super.onBackPressed();
            return;
        }
        MessageObject messageObject = this.H0;
        if (messageObject != null) {
            E2(messageObject, null);
        } else {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift != null) {
                F2(savedStarGift, this.G0);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.J0;
                if (tL_starGiftUnique != null) {
                    D2(this.I0, tL_starGiftUnique, this.G0);
                }
            }
        }
        O2(0, true, null);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onSwipeStarts() {
        ei.x3 x3Var = this.y1;
        if (x3Var != null) {
            x3Var.e(true);
            this.y1 = null;
        }
    }

    public final void p2(boolean z10, pf.c cVar, Runnable runnable) {
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        int i10 = z10 ? 3 : 2;
        d4 d4Var = new d4(this, twoStepVerificationActivity, z10, 0);
        twoStepVerificationActivity.Z = i10;
        twoStepVerificationActivity.b0 = d4Var;
        twoStepVerificationActivity.a0 = Q1();
        twoStepVerificationActivity.s0(new a3.l0(this, runnable, cVar, twoStepVerificationActivity, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q2() {
        int i10;
        TLRPC.Message message;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i11;
        org.telegram.ui.Components.xa xaVar;
        ug.f1 f1Var;
        int i12;
        TLRPC.Message message2;
        TLRPC.Message message3;
        ei.x3 x3Var = this.y1;
        if (x3Var != null) {
            x3Var.e(true);
            this.y1 = null;
        }
        MessageObject messageObject = this.H0;
        if (messageObject != null && (message3 = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_transfer_at;
                if (i10 <= ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                    Context context = getContext();
                    MessageObject messageObject2 = this.H0;
                    if (messageObject2 != null && (message2 = messageObject2.messageOwner) != null) {
                        TLRPC.MessageAction messageAction2 = message2.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            i12 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_transfer_at;
                            M2(i12 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, false);
                            return;
                        }
                    }
                    TL_stars.SavedStarGift savedStarGift = this.F0;
                    i12 = savedStarGift != null ? savedStarGift.can_transfer_at : 0;
                    M2(i12 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, false);
                    return;
                }
                TL_stars.SavedStarGift savedStarGift2 = this.F0;
                if (savedStarGift2 != null) {
                    TL_stars.StarGift starGift = savedStarGift2.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        i11 = savedStarGift2.can_export_at;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                        Context context2 = getContext();
                        int i13 = this.currentAccount;
                        ug.m1[] m1VarArr = {new ug.m1(context2, i13, BirthdayController.getInstance(i13).getState(), 3, this.resourcesProvider)};
                        ug.m1 m1Var = m1VarArr[0];
                        m1Var.z0 = LocaleController.getString(R.string.Gift2TransferShort);
                        xaVar = m1Var.e;
                        if (xaVar != null) {
                            xaVar.setTitle(m1Var.A());
                        }
                        f1Var = m1Var.b0;
                        if (f1Var != null) {
                            f1Var.setText(m1Var.A());
                        }
                        int max = currentTime <= i11 ? 0 : Math.max(1, Math.round(Math.max(0, i11 - currentTime) / 86400.0f));
                        ug.m1 m1Var2 = m1VarArr[0];
                        m1Var2.H0 = true;
                        m1Var2.I0 = max;
                        m1Var2.i0(false, true);
                        ug.m1 m1Var3 = m1VarArr[0];
                        m1Var3.B0 = new x4(this, currentTime, i11, max, m1VarArr, tL_starGiftUnique2);
                        m1Var3.show();
                        return;
                    }
                }
                MessageObject messageObject3 = this.H0;
                if (messageObject3 == null || (message = messageObject3.messageOwner) == null) {
                    return;
                }
                TLRPC.MessageAction messageAction3 = message.action;
                if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                    TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                        i11 = tL_messageActionStarGiftUnique.can_export_at;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique22 = tL_starGiftUnique;
                        int currentTime2 = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                        Context context22 = getContext();
                        int i132 = this.currentAccount;
                        ug.m1[] m1VarArr2 = {new ug.m1(context22, i132, BirthdayController.getInstance(i132).getState(), 3, this.resourcesProvider)};
                        ug.m1 m1Var4 = m1VarArr2[0];
                        m1Var4.z0 = LocaleController.getString(R.string.Gift2TransferShort);
                        xaVar = m1Var4.e;
                        if (xaVar != null) {
                        }
                        f1Var = m1Var4.b0;
                        if (f1Var != null) {
                        }
                        if (currentTime2 <= i11) {
                        }
                        ug.m1 m1Var22 = m1VarArr2[0];
                        m1Var22.H0 = true;
                        m1Var22.I0 = max;
                        m1Var22.i0(false, true);
                        ug.m1 m1Var32 = m1VarArr2[0];
                        m1Var32.B0 = new x4(this, currentTime2, i11, max, m1VarArr2, tL_starGiftUnique22);
                        m1Var32.show();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        TL_stars.SavedStarGift savedStarGift3 = this.F0;
        i10 = savedStarGift3 != null ? savedStarGift3.can_transfer_at : 0;
        if (i10 <= ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r2(long j10, long j11, boolean z10, Utilities.Callback callback) {
        String str;
        TLRPC.Chat chat;
        TL_stars.TL_starGiftUnique Y1 = Y1();
        if (Y1 == null) {
            return;
        }
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user);
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            if (chat2 == null) {
                str = "";
                chat = chat2;
            } else {
                str = chat2.title;
                chat = chat2;
            }
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(new f6(getContext(), Y1, chat), w7.z5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        lk.o(org.telegram.ui.ActionBar.h6.j5, this.resourcesProvider, textView, 1, 16.0f);
        textView.setText(AndroidUtilities.replaceTags(j11 > 0 ? LocaleController.formatPluralStringComma("Gift2TransferPriceText", (int) j11, Q1(), DialogObject.getShortName(j10)) : LocaleController.formatString(R.string.Gift2TransferText, Q1(), str)));
        linearLayout.addView(textView, w7.z5.t(-1, -2, 48, 24, 4, 24, 4));
        j01 j01Var = new j01(getContext(), this.resourcesProvider);
        C1(j01Var, ga.l(Y1.attributes, TL_stars.starGiftAttributeModel.class));
        C1(j01Var, ga.l(Y1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        C1(j01Var, ga.l(Y1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(Y1.slug) && (Y1.flags & 256) != 0) {
            j01Var.c(LocaleController.getString(R.string.GiftValue2), r4.c.h("~", BillingController.getInstance().formatCurrency(Y1.value_amount, Y1.value_currency, BillingController.getInstance().getCurrencyExp(Y1.value_currency), true)), null, null);
        }
        linearLayout.addView(j01Var, w7.z5.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(j11 > 0 ? md.R0(LocaleController.formatString(R.string.Gift2TransferDoPrice, Integer.valueOf((int) j11))) : LocaleController.getString(R.string.Gift2TransferDo), new a1.c(callback, 4));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.X0 = z10;
        b2Var.show();
    }

    public final void s2(long j10, Utilities.Callback callback) {
        TLRPC.Message message;
        long j11;
        TL_stars.SavedStarGift savedStarGift = this.F0;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            MessageObject messageObject = this.H0;
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if (!(tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique)) {
                return;
            } else {
                j11 = tL_messageActionStarGiftUnique.transfer_stars;
            }
        } else {
            j11 = savedStarGift.transfer_stars;
        }
        r2(j10, j11, true, callback);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        MessageObject messageObject;
        TLRPC.Message message;
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(this.currentAccount);
            return;
        }
        if (this.I0 != null && this.J0 == null) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getContext(), 3, null);
            b2Var.q(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.I0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getuniquestargift, new g(1, this, b2Var));
        } else if (this.F0 == null && (messageObject = this.H0) != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(getContext(), 3, null);
                        b2Var2.q(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new k2(this, tL_messageActionStarGift, b2Var2, 0));
                        return;
                    }
                    if (S1() != null) {
                        org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(getContext(), 3, null);
                        b2Var3.q(500L);
                        ga.y(this.currentAccount, false).M(S1(), new n2(1, this, b2Var3));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final void t2() {
        TL_stars.InputSavedStarGift S1;
        long j10;
        long j11;
        long j12;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        ei.x3 x3Var = this.y1;
        if (x3Var != null) {
            x3Var.e(true);
            this.y1 = null;
        }
        if (this.c1 == null && (S1 = S1()) != null) {
            MessageObject messageObject = this.H0;
            long j13 = this.X;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                    return;
                }
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                j11 = tL_messageActionStarGift.gift.id;
                j12 = tL_messageActionStarGift.upgrade_stars;
                z10 = tL_messageActionStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                z11 = (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? false : true;
                z12 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
                j10 = 0;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                z13 = tL_messageActionStarGift.prepaid_upgrade ? DialogObject.getPeerDialogId(tL_messageActionStarGift.from_id) != this.H0.getFromChatId() : tL_messageActionStarGift.upgrade_separate;
            } else {
                j10 = 0;
                TL_stars.SavedStarGift savedStarGift = this.F0;
                if (savedStarGift == null) {
                    return;
                }
                TL_stars.StarGift starGift = savedStarGift.gift;
                j11 = starGift.id;
                j12 = savedStarGift.upgrade_stars;
                z10 = (starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
                z11 = (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? false : true;
                z12 = j13 < 0;
                TL_stars.SavedStarGift savedStarGift2 = this.F0;
                str = savedStarGift2.prepaid_upgrade_hash;
                z13 = savedStarGift2.upgrade_separate;
            }
            TextView textView = this.x0;
            if (z10) {
                textView.setText(LocaleController.getString(z12 ? R.string.Gift2AddMyNameNameChannel : R.string.Gift2AddMyNameName));
            } else if (z11) {
                textView.setText(LocaleController.getString(R.string.Gift2AddSenderNameComment));
            } else {
                textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
            }
            boolean z14 = (z10 || j12 <= j10 || z13) ? false : true;
            xp xpVar = this.w0;
            xpVar.a(z14, false);
            ArrayList arrayList = this.o1;
            if (arrayList != null && (j12 > j10 || this.s1 != null)) {
                u2();
                return;
            }
            if (arrayList == null) {
                ga.y(this.currentAccount, false).K(j11, new g4(this, 2));
            }
            if (j12 > j10 || this.s1 != null) {
                return;
            }
            this.r1 = true;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = xpVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = S1;
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j13);
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            JSONObject q6 = gi.d3.q(this.resourcesProvider, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new v4(this, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0034, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.prepaid_upgrade_hash) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.prepaid_upgrade_hash) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u2() {
        long j10;
        boolean z10;
        boolean z11;
        char c10;
        int i10;
        String string;
        String string2;
        MessageObject messageObject = this.H0;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j10 = tL_messageActionStarGift.upgrade_stars;
            if (j10 <= 0) {
            }
            z10 = false;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift == null) {
                return;
            }
            j10 = savedStarGift.upgrade_stars;
            if (j10 <= 0) {
            }
            z10 = false;
        }
        if (this.o1 != null) {
            if (j10 > 0 || this.s1 != null) {
                long j11 = 0;
                if (this.s1 != null) {
                    for (int i11 = 0; i11 < this.s1.invoice.prices.size(); i11++) {
                        j11 += this.s1.invoice.prices.get(i11).amount;
                    }
                }
                s6 s6Var = this.P0;
                e7 e7Var = this.f0;
                if (s6Var == null) {
                    this.P0 = new s6(e7Var);
                }
                s6 s6Var2 = this.P0;
                ArrayList arrayList = this.o1;
                e7 e7Var2 = s6Var2.a;
                ArrayList arrayList2 = s6Var2.g;
                ArrayList arrayList3 = s6Var2.f;
                ArrayList arrayList4 = s6Var2.e;
                int size = arrayList4.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList4.get(i12);
                    i12++;
                    ((q6) obj).a();
                }
                arrayList4.clear();
                arrayList3.clear();
                arrayList2.clear();
                ArrayList m10 = ga.m(arrayList, TL_stars.starGiftAttributeModel.class);
                int size2 = m10.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = m10.get(i13);
                    i13++;
                    q6 q6Var = new q6(e7Var2.c, (TL_stars.starGiftAttributeModel) obj2);
                    if (e7Var2.isAttachedToWindow() && q6Var.c) {
                        q6Var.d.onAttachedToWindow();
                    }
                    arrayList4.add(q6Var);
                }
                ArrayList m11 = ga.m(arrayList, TL_stars.starGiftAttributeBackdrop.class);
                int size3 = m11.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj3 = m11.get(i14);
                    i14++;
                    arrayList3.add(new p6((TL_stars.starGiftAttributeBackdrop) obj3));
                }
                ArrayList m12 = ga.m(arrayList, TL_stars.starGiftAttributePattern.class);
                int size4 = m12.size();
                int i15 = 0;
                while (i15 < size4) {
                    Object obj4 = m12.get(i15);
                    i15++;
                    arrayList2.add(new r6((TL_stars.starGiftAttributePattern) obj4));
                }
                e7Var.setPreviewingAttributes(this.o1);
                TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = null;
                long j12 = this.X;
                if (z10) {
                    z11 = true;
                    e7Var.i(1, LocaleController.getString(R.string.Gift2PrepayUpgradeTitle), LocaleController.formatString(R.string.Gift2PrepayUpgradeText, DialogObject.getShortName(this.currentAccount, j12)), null);
                } else {
                    z11 = true;
                    e7Var.i(1, LocaleController.getString(R.string.Gift2UpgradeTitle), LocaleController.getString(R.string.Gift2UpgradeText), null);
                }
                ei.d dVar = this.k0;
                dVar.setFilled(z11);
                dVar.f(null, z11);
                if (j11 > 0) {
                    int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                    if (this.q1 != null) {
                        int i16 = 0;
                        while (true) {
                            if (i16 >= this.q1.size()) {
                                break;
                            }
                            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) this.q1.get(i16);
                            if (starGiftUpgradePrice2.date >= currentTime) {
                                starGiftUpgradePrice = starGiftUpgradePrice2;
                                break;
                            }
                            i16++;
                        }
                    }
                    ArrayList arrayList5 = this.p1;
                    FrameLayout frameLayout = this.n0;
                    if (arrayList5 == null || starGiftUpgradePrice == null || arrayList5.isEmpty()) {
                        frameLayout.setVisibility(8);
                    } else {
                        frameLayout.setVisibility(0);
                        this.m0.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("**" + LocaleController.getString(R.string.Gift2UpgradeCostsInfo) + "**", new b2(this, 4)), false, AndroidUtilities.dp(0.6666667f), AndroidUtilities.dp(0.66f)));
                    }
                    Q2();
                    yq[] yqVarArr = this.t1;
                    if (z10) {
                        dVar.g(md.S0(LocaleController.formatString(R.string.Gift2PrepayUpgradeButton, Long.valueOf(j11)), 1.13f, yqVarArr), true, true);
                    } else {
                        dVar.g(md.S0(LocaleController.formatString(R.string.Gift2UpgradeButton, Long.valueOf(j11)), 1.13f, yqVarArr), true, true);
                    }
                } else {
                    dVar.g(LocaleController.getString(R.string.Confirm), true, true);
                }
                dVar.setOnClickListener(new c2(this, 5));
                View view = this.u0;
                LinearLayout linearLayout = this.v0;
                if (z10) {
                    linearLayout.setVisibility(8);
                    view.setVisibility(8);
                    c10 = 0;
                } else {
                    c10 = 0;
                    linearLayout.setVisibility(0);
                    view.setVisibility(0);
                }
                int i17 = 2;
                gi.k[] kVarArr = this.t0;
                if (z10) {
                    gi.k kVar = kVarArr[c10];
                    int i18 = R.drawable.menu_feature_unique;
                    String string3 = LocaleController.getString(R.string.Gift2UpgradeFeature1Title);
                    if (z10) {
                        int i19 = R.string.Gift2PrepayUpgradeFeature1Text;
                        i10 = 1;
                        Object[] objArr = new Object[1];
                        objArr[c10] = DialogObject.getShortName(this.currentAccount, j12);
                        string = LocaleController.formatString(i19, objArr);
                    } else {
                        i10 = 1;
                        string = LocaleController.getString(R.string.Gift2UpgradeFeature1Text);
                    }
                    kVar.a(string3, string, i18);
                    gi.k kVar2 = kVarArr[i10];
                    int i20 = R.drawable.menu_feature_transfer;
                    String string4 = LocaleController.getString(R.string.Gift2UpgradeFeature2Title);
                    if (z10) {
                        int i21 = R.string.Gift2PrepayUpgradeFeature2Text;
                        Object[] objArr2 = new Object[i10];
                        objArr2[0] = DialogObject.getShortName(this.currentAccount, j12);
                        string2 = LocaleController.formatString(i21, objArr2);
                    } else {
                        string2 = LocaleController.getString(R.string.Gift2UpgradeFeature2Text);
                    }
                    kVar2.a(string4, string2, i20);
                    kVarArr[2].a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), z10 ? LocaleController.formatString(R.string.Gift2PrepayUpgradeFeature3Text, DialogObject.getShortName(this.currentAccount, j12)) : LocaleController.getString(R.string.Gift2UpgradeFeature3Text), R.drawable.menu_feature_tradable);
                } else {
                    kVarArr[c10].a(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
                    kVarArr[1].a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
                    kVarArr[2].a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
                }
                AndroidUtilities.runOnUIThread(new d2(this, j11, i17));
            }
        }
    }

    public final void v2() {
        TL_stars.TL_starGiftUnique Y1 = Y1();
        if (this.f1 == null || Y1 == null || TextUtils.isEmpty(Y1.slug)) {
            return;
        }
        Context context = getContext();
        int i10 = this.currentAccount;
        ug.m1 m1Var = new ug.m1(context, i10, BirthdayController.getInstance(i10).getState(), 3, this.resourcesProvider);
        int i11 = 0;
        ug.m1[] m1VarArr = {m1Var};
        ug.m1 m1Var2 = m1VarArr[0];
        m1Var2.z0 = LocaleController.getString(R.string.Gift2TransferShort);
        org.telegram.ui.Components.xa xaVar = m1Var2.e;
        if (xaVar != null) {
            xaVar.setTitle(m1Var2.A());
        }
        ug.f1 f1Var = m1Var2.b0;
        if (f1Var != null) {
            f1Var.setText(m1Var2.A());
        }
        ug.m1 m1Var3 = m1VarArr[0];
        m1Var3.G0 = true;
        m1Var3.i0(false, true);
        ug.m1 m1Var4 = m1VarArr[0];
        m1Var4.B0 = new n2(i11, this, m1VarArr);
        m1Var4.show();
    }

    public final void w2(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final ag.c cVar, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, final yh.i0 i0Var) {
        this.k0.setLoading(true);
        if (i0Var != null && !i0Var.L) {
            i0Var.L = true;
            i0Var.H.h(true);
        }
        ga.x(this.currentAccount, cVar).H(tL_starGiftUnique, j10, tL_textWithEntities, z10, new Utilities.Callback() { // from class: ai.j2
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                k7.B0(k7.this, i0Var, cVar, tL_starGiftUnique, j10, tL_textWithEntities, z10, (TLRPC.TL_payments_paymentFormStarGift) obj);
            }
        });
    }

    @Override // org.telegram.ui.Components.bb
    public final hm0 x(im0 im0Var) {
        l5 l5Var = new l5(this, 0);
        this.T0 = l5Var;
        return l5Var;
    }

    public final SpannableStringBuilder y2(TLRPC.Peer peer) {
        if (peer == null) {
            return null;
        }
        String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(peer)));
        if (TextUtils.isEmpty(publicUsername)) {
            return null;
        }
        return AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.Gift2ReleasedBy2, r4.c.h("@", publicUsername)), new h4(this, publicUsername, 8));
    }

    @Override // org.telegram.ui.Components.bb
    public final int z() {
        return AndroidUtilities.dp(12.0f);
    }

    public final SpannableStringBuilder z2(TL_stars.StarGift starGift) {
        if (starGift == null || (starGift instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return y2(starGift.released_by);
    }
}
