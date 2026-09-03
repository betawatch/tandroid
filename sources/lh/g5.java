package lh;

import android.animation.ValueAnimator;
import android.content.Context;
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
import android.text.style.RelativeSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.oa1;
import org.telegram.ui.qy;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public class g5 extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int n1 = 0;
    public m7 A0;
    public MessageObject B0;
    public String C0;
    public TL_stars.TL_starGiftUnique D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public r4 J0;
    public boolean K0;
    public r3 L0;
    public final int[] M0;
    public eg.g N0;
    public int O0;
    public String P0;
    public kh.o5 Q0;
    public lq R0;
    public boolean S0;
    public j3 T0;
    public final long U;
    public Float U0;
    public final dg.s1 V;
    public c5.d V0;
    public final o3 W;
    public ValueAnimator W0;
    public final s00 X;
    public lq X0;
    public kh.l3 Y;
    public boolean Y0;
    public kh.l3 Z;
    public View Z0;
    public final q3 a0;
    public kh.z2 a1;
    public final c5 b0;
    public boolean b1;
    public final p3 c0;
    public Boolean c1;
    public final f90 d0;
    public boolean d1;
    public final sz0 e0;
    public ArrayList e1;
    public final f90 f0;
    public ArrayList f1;
    public final ph.d g0;
    public ArrayList g1;
    public final FrameLayout h0;
    public boolean h1;
    public final f90 i0;
    public TLRPC.PaymentForm i1;
    public final FrameLayout j0;
    public final lq[] j1;
    public final View k0;
    public final t1 k1;
    public final FrameLayout l0;
    public ph.f3 l1;
    public e5 m0;
    public View m1;
    public boolean n0;
    public final p3 o0;
    public final rh.i[] p0;
    public final View q0;
    public final LinearLayout r0;
    public final kp s0;
    public final TextView t0;
    public boolean u0;
    public final p3 v0;
    public final TextView w0;
    public final p3 x0;
    public boolean y0;
    public TL_stars.SavedStarGift z0;

    public g5(Context context, int i10, long j10, org.telegram.ui.ActionBar.f6 f6Var, View view) {
        super(context, null, false, false, false, 1, f6Var);
        this.n0 = false;
        this.M0 = new int[2];
        this.O0 = -1;
        this.P0 = "";
        this.V0 = new c5.d(0, 0);
        this.Y0 = true;
        this.j1 = new lq[1];
        this.k1 = new t1(this, 7);
        this.currentAccount = i10;
        this.U = j10;
        this.v = Math.max(0.05f, AndroidUtilities.dp(82.0f) / (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight));
        this.occupyNavigationBar = true;
        this.containerView = new dg.u2(this, context, 7);
        dg.s1 s1Var = new dg.s1(this, context);
        this.V = s1Var;
        o3 o3Var = new o3(this, context);
        this.W = o3Var;
        o3Var.setAdapter(new gg.u(this, context, 1));
        t2();
        View view2 = new View(context);
        int i11 = org.telegram.ui.ActionBar.j6.h5;
        view2.setBackgroundColor(getThemedColor(i11));
        this.containerView.addView(view2, k7.b6.e(-1, 50, 80));
        this.containerView.addView(o3Var, k7.b6.e(-1, -1, 119));
        fixNavigationBar(getThemedColor(i11));
        AndroidUtilities.removeFromParent(this.d);
        s1Var.addView(this.d, k7.b6.e(-1, -1, 119));
        p3 p3Var = new p3(this, context, 0);
        this.c0 = p3Var;
        p3Var.setOrientation(1);
        p3Var.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(68.0f));
        s1Var.addView(p3Var, k7.b6.e(-1, -1, 55));
        f90 f90Var = new f90(context, f6Var);
        this.d0 = f90Var;
        int i12 = org.telegram.ui.ActionBar.j6.q5;
        f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        f90Var.setTextSize(1, 12.0f);
        f90Var.setGravity(17);
        f90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        f90Var.setDisablePaddingsOffsetY(true);
        p3Var.addView(f90Var, k7.b6.t(-2, -2, 1, 4, -2, 4, 16));
        f90Var.setVisibility(8);
        sz0 sz0Var = new sz0(context, f6Var);
        this.e0 = sz0Var;
        p3Var.addView(sz0Var, k7.b6.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        f90 f90Var2 = new f90(context, f6Var);
        this.f0 = f90Var2;
        f90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        f90Var2.setTextSize(1, 12.0f);
        f90Var2.setGravity(17);
        f90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        int i13 = org.telegram.ui.ActionBar.j6.Oh;
        f90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        f90Var2.setDisablePaddingsOffsetY(true);
        f90Var2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        p3Var.addView(f90Var2, k7.b6.t(-2, -2, 1, 4, 2, 4, 8));
        f90Var2.setVisibility(8);
        p3 p3Var2 = new p3(this, context, 1);
        this.o0 = p3Var2;
        p3Var2.setOrientation(1);
        p3Var2.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        s1Var.addView(p3Var2, k7.b6.e(-1, -1, 55));
        rh.i[] iVarArr = {r9, r0, r0};
        this.p0 = iVarArr;
        rh.i iVar = new rh.i(context, f6Var, false);
        iVar.a(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
        p3Var2.addView(iVarArr[0], k7.b6.n(-1, -2));
        rh.i iVar2 = new rh.i(context, f6Var, false);
        iVar2.a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
        p3Var2.addView(iVarArr[1], k7.b6.n(-1, -2));
        rh.i iVar3 = new rh.i(context, f6Var, false);
        iVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
        p3Var2.addView(iVarArr[2], k7.b6.n(-1, -2));
        View view3 = new View(context);
        this.q0 = view3;
        int i14 = org.telegram.ui.ActionBar.j6.d7;
        view3.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        p3Var2.addView(view3, k7.b6.s(-2, 7, 17, -4, 17, 1.0f / AndroidUtilities.density, 6));
        LinearLayout linearLayout = new LinearLayout(context);
        this.r0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 6, 6));
        kp kpVar = new kp(context, 24, f6Var);
        this.s0 = kpVar;
        kpVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.j7, org.telegram.ui.ActionBar.j6.k7);
        kpVar.setDrawUnchecked(true);
        kpVar.a(false, false);
        kpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(kpVar, k7.b6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.t0 = textView;
        int i15 = org.telegram.ui.ActionBar.j6.j5;
        textView.setTextColor(getThemedColor(i15));
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
        linearLayout.addView(textView, k7.b6.t(-2, -2, 16, 9, 0, 0, 0));
        p3Var2.addView(linearLayout, k7.b6.t(-2, -2, 1, 0, 0, 0, 4));
        k7.d6.b(linearLayout, 0.025f, 1.5f);
        p3 p3Var3 = new p3(this, context, 2);
        this.v0 = p3Var3;
        p3Var3.setOrientation(1);
        p3Var3.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        s1Var.addView(p3Var3, k7.b6.e(-1, -1, 55));
        TextView textView2 = new TextView(context);
        this.w0 = textView2;
        org.telegram.ui.b.l(i15, f6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        p3Var3.addView(textView2, k7.b6.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView3 = new TextView(context);
        org.telegram.ui.b.l(i15, f6Var, textView3, 1, 14.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearSubtitle));
        p3Var3.addView(textView3, k7.b6.t(-1, -2, 7, 20, 6, 20, 24));
        rh.i iVar4 = new rh.i(context, f6Var, false);
        iVar4.a(LocaleController.getString(R.string.Gift2WearFeature1Title), LocaleController.getString(R.string.Gift2WearFeature1Text), R.drawable.menu_feature_unique);
        p3Var3.addView(r7[0], k7.b6.n(-1, -2));
        rh.i iVar5 = new rh.i(context, f6Var, false);
        iVar5.a(LocaleController.getString(R.string.Gift2WearFeature2Title), LocaleController.getString(R.string.Gift2WearFeature2Text), R.drawable.menu_feature_cover);
        p3Var3.addView(r7[1], k7.b6.n(-1, -2));
        rh.i iVar6 = new rh.i(context, f6Var, false);
        rh.i[] iVarArr2 = {iVar4, iVar5, iVar6};
        iVar6.a(LocaleController.getString(R.string.Gift2WearFeature3Title), LocaleController.getString(R.string.Gift2WearFeature3Text), R.drawable.menu_verification);
        p3Var3.addView(iVarArr2[2], k7.b6.n(-1, -2));
        p3 p3Var4 = new p3(this, context, 3);
        this.x0 = p3Var4;
        p3Var4.setOrientation(1);
        p3Var4.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(92.0f));
        s1Var.addView(p3Var4, k7.b6.e(-1, -1, 55));
        rh.i iVar7 = new rh.i(context, f6Var, false);
        iVar7.a(LocaleController.getString(R.string.GiftCraftInfoFeature1Title), LocaleController.getString(R.string.GiftCraftInfoFeature1Text), R.drawable.menu_feature_unique);
        p3Var4.addView(r9[0], k7.b6.n(-1, -2));
        rh.i iVar8 = new rh.i(context, f6Var, false);
        iVar8.a(LocaleController.getString(R.string.GiftCraftInfoFeature2Title), LocaleController.getString(R.string.GiftCraftInfoFeature2Text), R.drawable.menu_random);
        p3Var4.addView(r9[1], k7.b6.n(-1, -2));
        rh.i iVar9 = new rh.i(context, f6Var, false);
        rh.i[] iVarArr3 = {iVar7, iVar8, iVar9};
        iVar9.a(LocaleController.getString(R.string.GiftCraftInfoFeature3Title), LocaleController.getString(R.string.GiftCraftInfoFeature3Text), R.drawable.menu_feature_affect);
        p3Var4.addView(iVarArr3[2], k7.b6.n(-1, -2));
        p3Var.setAlpha(1.0f);
        p3Var2.setAlpha(0.0f);
        p3Var3.setAlpha(0.0f);
        p3Var4.setAlpha(0.0f);
        c5 c5Var = new c5(context, f6Var, new t1(this, 9), new l1(this, 13), new l1(this, 14), new l1(this, 15), new l1(this, 16), new l1(this, 17), new l1(this, 18), new l1(this, 19));
        this.b0 = c5Var;
        c5Var.I.c.setOnClickListener(new l1(this, 20));
        int i16 = this.backgroundPaddingLeft;
        c5Var.setPadding(i16, 0, i16, 0);
        s1Var.addView(c5Var, k7.b6.e(-1, -2, 55));
        org.telegram.ui.k kVar = this.c;
        this.N = true;
        kVar.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h0 = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i11));
        View view4 = new View(context);
        this.k0 = view4;
        view4.setBackgroundColor(getThemedColor(i14));
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, k7.b6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        ph.d p10 = org.telegram.messenger.y3.p(24, context, f6Var, true);
        this.g0 = p10;
        p10.g(LocaleController.getString(R.string.OK), false, true);
        p10.f(null, false);
        FrameLayout.LayoutParams d = k7.b6.d(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        d.rightMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        frameLayout.addView(p10, d);
        s1Var.addView(frameLayout, k7.b6.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.j0 = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i11));
        f90 f90Var3 = new f90(context, null);
        this.i0 = f90Var3;
        f90Var3.setTextSize(1, 12.0f);
        f90Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        f90Var3.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        f90Var3.setGravity(17);
        frameLayout2.addView(f90Var3, k7.b6.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        s1Var.addView(frameLayout2, k7.b6.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.d.setOnScrollListener(new eg.f2(this, 8));
        linearLayout.setOnClickListener(new l1(this, 12));
        s00 s00Var = new s00(context);
        this.X = s00Var;
        s1Var.addView(s00Var, k7.b6.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.l0 = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        s1Var.addView(frameLayout3, k7.b6.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        AndroidUtilities.removeFromParent(this.e);
        s1Var.addView(this.e, k7.b6.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        q3 q3Var = new q3(context);
        this.a0 = q3Var;
        s1Var.addView(q3Var, k7.b6.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        AndroidUtilities.makeGlobalBlurBitmap(new cg.h0(q3Var, 20), 12.0f, 12, null, arrayList);
    }

    public static void A0(g5 g5Var, long j10) {
        new kh.g2(g5Var.getContext(), g5Var.currentAccount, j10, null, new y2(g5Var, 2)).show();
    }

    public static void B0(g5 g5Var, ze.c cVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        cVar.c(false);
        d2Var.dismiss();
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                new z9(g5Var.getContext(), g5Var.resourcesProvider, j10, 16, null, new n2(6, g5Var, charSequence), 0L).show();
                return;
            } else {
                if (tL_error != null) {
                    g5Var.getBulletinFactory().d0(tL_error, false);
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
        TL_stars.SavedStarGift savedStarGift = g5Var.z0;
        g5Var.k2(tL_starGiftUnique, savedStarGift != null ? savedStarGift.refunded : false, null, null);
        AndroidUtilities.runOnUIThread(new n2(4, g5Var, tL_starGiftUnique));
    }

    public static void D0(g5 g5Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, MessagesController messagesController, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        g5Var.g0.setLoading(false);
        eg.y1 y1Var = new eg.y1(g5Var, 3);
        eg.v0 v0Var = new eg.v0(26, g5Var.currentAccount, g5Var.getContext(), y1Var, g5Var.resourcesProvider);
        v0Var.G1(canApplyBoost);
        v0Var.F1(tL_premium_boostsStatus, true);
        v0Var.H1(j10);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        if (chat != null) {
            v0Var.N0 = new gg.i(g5Var, chat);
        }
        v0Var.show();
    }

    public static String D1(TL_stars.StarGift starGift) {
        if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return (!(starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(starGift.title)) ? LocaleController.getString(R.string.Gift2Gift) : starGift.title;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((TL_stars.TL_starGiftUnique) starGift).title);
        sb.append(" #");
        return kf.k0.l(r3.num, ',', sb);
    }

    public static void E0(g5 g5Var, int i10, int i11, int i12, TL_stars.TL_starGiftUnique tL_starGiftUnique, gg.v2[] v2VarArr, Long l10) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (l10.longValue() == -99) {
            if (i10 < i11) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g5Var.getContext(), 0, g5Var.resourcesProvider);
                String string = LocaleController.getString(R.string.Gift2ExportTONUnlocksAlertTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string;
                d2Var.Q = LocaleController.formatPluralString("Gift2ExportTONUnlocksAlertText", Math.max(1, i12), new Object[0]);
                kf.k0.C(R.string.OK, alertDialog$Builder, null);
                return;
            }
            LinearLayout linearLayout = new LinearLayout(g5Var.getContext());
            linearLayout.setOrientation(1);
            linearLayout.addView(new h4(g5Var.getContext(), tL_starGiftUnique), k7.b6.t(-1, -2, 48, 0, -4, 0, 0));
            TextView textView = new TextView(g5Var.getContext());
            int i13 = org.telegram.ui.ActionBar.j6.j5;
            org.telegram.ui.b.w(i13, g5Var.resourcesProvider, textView, 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.Gift2ExportTONFragmentTitle));
            linearLayout.addView(textView, k7.b6.t(-1, -2, 48, 24, 4, 24, 14));
            TextView textView2 = new TextView(g5Var.getContext());
            org.telegram.ui.b.l(i13, g5Var.resourcesProvider, textView2, 1, 16.0f);
            org.telegram.ui.b.o(R.string.Gift2ExportTONFragmentText, new Object[]{g5Var.C1()}, textView2);
            linearLayout.addView(textView2, k7.b6.t(-1, -2, 48, 24, 0, 24, 4));
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(g5Var.getContext(), 0, g5Var.resourcesProvider);
            alertDialog$Builder2.n(linearLayout);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Gift2ExportTONFragmentOpen), new c1.b(28, g5Var, v2VarArr));
            kf.k0.u(R.string.Cancel, alertDialog$Builder2, null);
            return;
        }
        androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(g5Var, l10, v2VarArr, 21);
        if (l10.longValue() < 0) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(g5Var.currentAccount).getChatFull(-l10.longValue());
            if (chatFull == null) {
                TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                tL_channels_getFullChannel.channel = MessagesController.getInstance(g5Var.currentAccount).getInputChannel(-l10.longValue());
                ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(tL_channels_getFullChannel, new dg.d3(6, g5Var, bVar));
                return;
            } else if (!chatFull.stargifts_available) {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(g5Var.getContext(), 0, g5Var.resourcesProvider);
                String string2 = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder3.a;
                d2Var2.O = string2;
                d2Var2.Q = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                kf.k0.C(R.string.OK, alertDialog$Builder3, null);
                return;
            }
        } else if (l10.longValue() >= 0) {
            TLRPC.User user = MessagesController.getInstance(g5Var.currentAccount).getUser(l10);
            TLRPC.UserFull userFull = MessagesController.getInstance(g5Var.currentAccount).getUserFull(l10.longValue());
            if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                new qc(v2VarArr[0].container, g5Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l10.longValue())))).j();
                return;
            } else if (userFull == null && user != null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = MessagesController.getInstance(g5Var.currentAccount).getInputUser(user);
                ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(tL_users_getFullUser, new kh.b1(g5Var, v2VarArr, l10, bVar, 2));
                return;
            }
        }
        bVar.run();
    }

    public static void G0(g5 g5Var, TLObject tLObject, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            callback.run(tL_error);
            ic Y = g5Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
            return;
        }
        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
        int i10 = 0;
        MessagesController.getInstance(g5Var.currentAccount).putUsers(paymentForm.users, false);
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
        ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new y1(g5Var, j10, j11, callback, j12));
    }

    public static void H0(g5 g5Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        d2Var.c(400L);
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                g5Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
                return;
            } else {
                g5Var.getBulletinFactory().t(LocaleController.getString(R.string.UnknownError), null).k(false);
                return;
            }
        }
        g5Var.dismiss();
        t7.y(g5Var.currentAccount, false).Q(j10);
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            bundle.putBoolean("start_from_monetization", true);
            oa1 oa1Var = new oa1(bundle);
            b0.g(g5Var.currentAccount).h(j10, true);
            b0.g(g5Var.currentAccount).l(j10);
            oa1Var.whenFullyVisible(new gg.y1(oa1Var, j12, 3));
            U.presentFragment(oa1Var);
            return;
        }
        TLRPC.UserFull userFull = MessagesController.getInstance(g5Var.currentAccount).getUserFull(j11);
        if (userFull != null) {
            int max = Math.max(0, userFull.stargifts_count - 1);
            userFull.stargifts_count = max;
            if (max <= 0) {
                userFull.flags2 &= -257;
            }
        }
        t7.y(g5Var.currentAccount, false).P();
        t7.y(g5Var.currentAccount, false).T(true);
        if (U instanceof ja) {
            qc.a0(U).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j12), R.raw.stars_topup).k(true);
            return;
        }
        ja jaVar = new ja();
        jaVar.whenFullyVisible(new gg.y1(jaVar, j12, 2));
        U.presentFragment(jaVar);
    }

    public static void I0(g5 g5Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        g5Var.D0 = tL_starGiftUnique;
        g5Var.k2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static /* synthetic */ void J0(final long j10, final long j11, final g5 g5Var, final Utilities.Callback callback, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(g5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: lh.k2
            @Override // java.lang.Runnable
            public final void run() {
                g5.S(j10, j11, g5Var, callback, tLObject, tL_error);
            }
        });
    }

    public static String J1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
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
        return i10 <= 0 ? "<0.1%" : rh.j.G0(i10);
    }

    public static void L0(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence, org.telegram.ui.ActionBar.d2 d2Var) {
        ze.c g10 = d2Var.g(-1, true, true);
        g10.d();
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new x2(g5Var, g10, d2Var, tL_starGiftUnique, j10, charSequence));
    }

    public static /* synthetic */ void M0(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, lf.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(g5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new i2(g5Var, tL_starGiftUnique, aVar, runnable, 1));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new j2(g5Var, tL_error, runnable, 1));
        }
    }

    public static void N0(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, org.telegram.ui.ActionBar.d2 d2Var) {
        g5Var.getClass();
        ze.c g10 = d2Var.g(-1, true, true);
        g10.d();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = g5Var.E1();
        updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
        ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(updatestargiftprice, new gg.y(g5Var, g10, tL_starGiftUnique, 6));
    }

    public static boolean N1(int i10, long j10) {
        return j10 >= 0 ? UserConfig.getInstance(i10).getClientUserId() == j10 : ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), 5);
    }

    public static /* synthetic */ void O0(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, lf.a aVar, Runnable runnable) {
        TL_stars.StarsAmount o10 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = g5Var.E1();
        updatestargiftprice.resell_amount = o10;
        ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(updatestargiftprice, new r1(g5Var, tL_starGiftUnique, aVar, runnable, 0));
    }

    public static boolean O1(int i10, long j10) {
        if (j10 >= 0) {
            return UserConfig.getInstance(i10).getClientUserId() == j10;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        return chat != null && chat.creator;
    }

    public static void P(g5 g5Var, long j10) {
        new kh.g2(g5Var.getContext(), g5Var.currentAccount, j10, null, new y2(g5Var, 2)).show();
    }

    public static void P0(g5 g5Var, long j10) {
        new kh.g2(g5Var.getContext(), g5Var.currentAccount, j10, null, new y2(g5Var, 2)).show();
    }

    public static boolean P1(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
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

    public static /* synthetic */ void R(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z4, kh.u0 u0Var, i4 i4Var, ze.c cVar) {
        cVar.d();
        t7.x(g5Var.currentAccount, i4Var.a).h(i4Var.b, tL_starGiftUnique, j10, tL_textWithEntities, z4, new u2(g5Var, cVar, tL_starGiftUnique, j10, u0Var, 0));
    }

    public static void R0(g5 g5Var, TLObject tLObject, androidx.car.app.utils.b bVar, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.TL_messages_chatFull)) {
            ic Y = g5Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
            return;
        }
        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
        MessagesController.getInstance(g5Var.currentAccount).putUsers(tL_messages_chatFull.users, false);
        MessagesController.getInstance(g5Var.currentAccount).putChats(tL_messages_chatFull.chats, false);
        MessagesController.getInstance(g5Var.currentAccount).putChatFull(tL_messages_chatFull.full_chat);
        if (tL_messages_chatFull.full_chat.stargifts_available) {
            bVar.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g5Var.getContext(), 0, g5Var.resourcesProvider);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
        kf.k0.C(R.string.OK, alertDialog$Builder, null);
    }

    public static void S(long j10, long j11, g5 g5Var, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j12;
        g5 g5Var2;
        callback.run(tL_error);
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            j12 = j10;
            g5Var2 = g5Var;
        } else if (!(tLObject instanceof TLRPC.Updates)) {
            j12 = j10;
            g5Var2 = g5Var;
            qc.a0(U).d0(tL_error, false);
        } else if (j10 < 0 || j11 < 0) {
            j12 = j10;
            g5Var2 = g5Var;
            ic M = qc.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, g5Var2.C1(), DialogObject.getShortName(j12))), R.raw.forward);
            M.t = true;
            M.j();
        } else {
            zn R9 = zn.R9(j10);
            j12 = j10;
            g5Var2 = g5Var;
            R9.whenFullyVisible(new s2(g5Var2, R9, j12, 0));
            U.presentFragment(R9);
        }
        t7.y(g5Var2.currentAccount, false).Q(j12);
        t7.y(g5Var2.currentAccount, false).Q(j11);
    }

    public static void S0(g5 g5Var, MessageObject messageObject, ArrayList arrayList, TL_stars.StarGift starGift) {
        g5Var.b1 = true;
        g5Var.i2(messageObject, null);
        g5Var.q2(0, true, null);
        s00 s00Var = g5Var.X;
        if (s00Var != null) {
            s00Var.c(true);
        }
        t7.y(g5Var.currentAccount, false).P();
        l7 G = t7.y(g5Var.currentAccount, false).G(UserConfig.getInstance(g5Var.currentAccount).getClientUserId(), false);
        if (G != null) {
            G.j(arrayList, starGift);
        }
    }

    public static void T(g5 g5Var, org.telegram.ui.ActionBar.d2 d2Var, MessageObject messageObject) {
        d2Var.dismiss();
        g5Var.G0 = true;
        g5Var.i2(messageObject, null);
        super.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0174, code lost:
    
        if (r0 != null) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void T0(g5 g5Var, View view) {
        boolean z4;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        boolean O1;
        TLRPC.Message message;
        String F1 = g5Var.F1();
        TL_stars.TL_starGiftUnique K1 = g5Var.K1();
        p70 F = p70.F(g5Var.V, g5Var.resourcesProvider, view);
        boolean z10 = (g5Var.K1() == null || !O1(g5Var.currentAccount, DialogObject.getPeerDialogId(g5Var.K1().owner_id)) || !(g5Var.A0 instanceof l7) || g5Var.z0 == null || g5Var.E1() == null) ? false : true;
        TL_stars.SavedStarGift savedStarGift = g5Var.z0;
        F.l((savedStarGift == null || !savedStarGift.pinned_to_top) ? R.drawable.msg_pin : R.drawable.msg_unpin, LocaleController.getString((savedStarGift == null || !savedStarGift.pinned_to_top) ? R.string.Gift2Pin : R.string.Gift2Unpin), new t1(g5Var, 10), z10);
        F.l(R.drawable.outline_craft, LocaleController.getString(R.string.GiftCraft), new t1(g5Var, 11), g5Var.t1());
        F.l(R.drawable.menu_edit_price, LocaleController.getString(R.string.Gift2ChangePrice), new t1(g5Var, 12), (g5Var.K1() == null || !O1(g5Var.currentAccount, DialogObject.getPeerDialogId(g5Var.K1().owner_id)) || g5Var.K1().resell_amount == null) ? false : true);
        F.l(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new v2(g5Var, F1, 7), F1 != null);
        F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new t1(g5Var, 13), F1 != null);
        F.l(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.GiftOfferToBuyMenu), new t1(g5Var, 14), K1 != null && K1.offer_min_stars > 0);
        TL_stars.TL_starGiftUnique K12 = g5Var.K1();
        if (K12 != null && K12.theme_available) {
            long peerDialogId = DialogObject.getPeerDialogId(K12.owner_id);
            long peerDialogId2 = DialogObject.getPeerDialogId(K12.host_id);
            if ((peerDialogId > 0 && O1(g5Var.currentAccount, peerDialogId)) || (peerDialogId2 > 0 && O1(g5Var.currentAccount, peerDialogId2))) {
                z4 = true;
                F.l(R.drawable.msg_colors, LocaleController.getString(R.string.GiftThemesSetIn), new t1(g5Var, 15), z4);
                if (g5Var.E1() != null) {
                    MessageObject messageObject = g5Var.B0;
                    if (messageObject != null && (message = messageObject.messageOwner) != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                            if ((tL_messageActionStarGiftUnique.flags & 16) != 0) {
                                TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                    O1 = O1(g5Var.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id));
                                    F.l(R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2TransferOption), new t1(g5Var, 16), O1);
                                    F.l(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new t1(g5Var, 17), (g5Var.z0 == null || g5Var.A1() == 0) ? false : true);
                                    F.t = false;
                                    F.Y = true;
                                    F.s = 0;
                                    F.a0(0.0f, -AndroidUtilities.dp(2.0f));
                                    F.Z();
                                }
                            }
                        }
                    }
                    TL_stars.SavedStarGift savedStarGift2 = g5Var.z0;
                    if (savedStarGift2 != null) {
                        TL_stars.StarGift starGift2 = savedStarGift2.gift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                            O1 = O1(g5Var.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id));
                            F.l(R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2TransferOption), new t1(g5Var, 16), O1);
                            F.l(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new t1(g5Var, 17), (g5Var.z0 == null || g5Var.A1() == 0) ? false : true);
                            F.t = false;
                            F.Y = true;
                            F.s = 0;
                            F.a0(0.0f, -AndroidUtilities.dp(2.0f));
                            F.Z();
                        }
                    }
                    tL_starGiftUnique = g5Var.D0;
                }
                O1 = false;
                F.l(R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2TransferOption), new t1(g5Var, 16), O1);
                F.l(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new t1(g5Var, 17), (g5Var.z0 == null || g5Var.A1() == 0) ? false : true);
                F.t = false;
                F.Y = true;
                F.s = 0;
                F.a0(0.0f, -AndroidUtilities.dp(2.0f));
                F.Z();
            }
        }
        z4 = false;
        F.l(R.drawable.msg_colors, LocaleController.getString(R.string.GiftThemesSetIn), new t1(g5Var, 15), z4);
        if (g5Var.E1() != null) {
        }
        O1 = false;
        F.l(R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2TransferOption), new t1(g5Var, 16), O1);
        F.l(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new t1(g5Var, 17), (g5Var.z0 == null || g5Var.A1() == 0) ? false : true);
        F.t = false;
        F.Y = true;
        F.s = 0;
        F.a0(0.0f, -AndroidUtilities.dp(2.0f));
        F.Z();
    }

    public static /* synthetic */ void U(g5 g5Var, int i10, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i11 = 0; i11 < messages_messages.messages.size(); i11++) {
                TLRPC.Message message = messages_messages.messages.get(i11);
                if (message != null && message.id == i10) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                        messageObject = new MessageObject(g5Var.currentAccount, message, false, false);
                        messageObject.setType();
                        break;
                    }
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(g5Var, tLObject, messageObject, 22));
        }
    }

    public static void U0(g5 g5Var, Long l10) {
        TLRPC.Chat chat;
        String str = (l10.longValue() >= 0 || (chat = MessagesController.getInstance(g5Var.currentAccount).getChat(Long.valueOf(-l10.longValue()))) == null) ? "" : chat.title;
        ic Q = g5Var.getBulletinFactory().Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.GiftRepostedToProfile) : LocaleController.formatString(R.string.GiftRepostedToChannelProfile, str)));
        Q.t = true;
        Q.j();
    }

    public static void V(final g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, final String str) {
        final long j10 = tL_starGiftUnique.gift_id;
        final String str2 = tL_starGiftUnique.title;
        final String C1 = g5Var.C1();
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        String str3 = tL_starGiftUnique.slug;
        final org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(ApplicationLoader.applicationContext, 3, null);
        d2Var.q(500L);
        TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
        getuniquestargiftvalueinfo.slug = str3;
        ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(getuniquestargiftvalueinfo, new RequestDelegate() { // from class: lh.a2
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final g5 g5Var2 = g5.this;
                final org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                final TLRPC.Document document2 = document;
                final String str4 = str;
                final String str5 = str2;
                final String str6 = C1;
                final long j11 = j10;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: lh.f2
                    @Override // java.lang.Runnable
                    public final void run() {
                        g5.Z0(g5.this, d2Var2, tLObject, document2, str4, str5, str6, j11, tL_error);
                    }
                });
            }
        });
    }

    public static /* synthetic */ void V0(g5 g5Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
            TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
            MessagesController.getInstance(g5Var.currentAccount).putUsers(tL_payments_uniqueStarGift.users, false);
            MessagesController.getInstance(g5Var.currentAccount).putChats(tL_payments_uniqueStarGift.chats, false);
            if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                AndroidUtilities.runOnUIThread(new n2(7, g5Var, tL_payments_uniqueStarGift));
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new n2(8, d2Var, tL_error));
    }

    public static void W(g5 g5Var) {
        boolean z4;
        TLRPC.Document document;
        boolean z10;
        j7 F;
        TLRPC.Message message;
        ph.d dVar = g5Var.g0;
        if (dVar.K) {
            return;
        }
        TL_stars.InputSavedStarGift E1 = g5Var.E1();
        MessageObject messageObject = g5Var.B0;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            TL_stars.SavedStarGift savedStarGift = g5Var.z0;
            if (savedStarGift == null) {
                return;
            }
            z4 = !savedStarGift.unsaved;
            document = savedStarGift.gift.getDocument();
        } else {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                z4 = tL_messageActionStarGift.saved;
                document = tL_messageActionStarGift.gift.getDocument();
            } else {
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    return;
                }
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                z4 = tL_messageActionStarGiftUnique.saved;
                document = tL_messageActionStarGiftUnique.gift.getDocument();
            }
        }
        TLRPC.Document document2 = document;
        boolean z11 = z4;
        dVar.setLoading(true);
        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
        savestargift.unsave = z11;
        savestargift.stargift = E1;
        if (g5Var.z0 == null || (F = t7.y(g5Var.currentAccount, false).F(g5Var.U, false)) == null) {
            z10 = false;
        } else {
            F.m(g5Var.z0, savestargift.unsave);
            z10 = true;
        }
        ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(savestargift, new jh.j(g5Var, z10, document2, z11, savestargift));
    }

    public static void W0(g5 g5Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        int i10;
        if (g5Var.getContext() == null) {
            return;
        }
        if (tL_error == null) {
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
                ze.d.u(g5Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url);
                return;
            }
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(new TL_account.getPassword(), new t2(g5Var, twoStepVerificationActivity, 1), 8);
                return;
            }
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            qc.b0(tL_error);
            return;
        }
        twoStepVerificationActivity.o0();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g5Var.getContext());
        alertDialog$Builder.a.O = LocaleController.getString(R.string.Gift2TransferToTONAlertTitle);
        LinearLayout linearLayout = new LinearLayout(g5Var.getContext());
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(g5Var.getContext());
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText)));
        linearLayout.addView(textView, k7.b6.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(g5Var.getContext());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, k7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(g5Var.getContext());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        TextView textView2 = new TextView(g5Var.getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.y3.q(R.string.Gift2TransferToTONAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, k7.b6.n(-1, -2));
            linearLayout2.addView(imageView, k7.b6.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, k7.b6.n(-2, -2));
            linearLayout2.addView(textView2, k7.b6.n(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(g5Var.getContext());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, k7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(g5Var.getContext());
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), mode));
        TextView textView3 = new TextView(g5Var.getContext());
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.y3.q(R.string.Gift2TransferToTONAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, k7.b6.n(-1, -2));
            i10 = 5;
            linearLayout3.addView(imageView2, k7.b6.q(-2, -2, 5));
        } else {
            i10 = 5;
            linearLayout3.addView(imageView2, k7.b6.n(-2, -2));
            linearLayout3.addView(textView3, k7.b6.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.Gift2TransferToTONSetPassword), new k3.e(g5Var, 27));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            TextView textView4 = new TextView(g5Var.getContext());
            textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            textView4.setTextSize(1, 16.0f);
            if (!LocaleController.isRTL) {
                i10 = 3;
            }
            textView4.setGravity(i10 | 48);
            textView4.setText(LocaleController.getString(R.string.Gift2TransferToTONAlertText3));
            linearLayout.addView(textView4, k7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
        }
        twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
    }

    public static boolean X(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, qy qyVar, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        long giftThemeUser = ChatThemeController.getInstance(g5Var.currentAccount).getGiftThemeUser(tL_starGiftUnique.slug);
        if (giftThemeUser != 0 && giftThemeUser != j10) {
            org.telegram.ui.Components.z4.n0(g5Var.getContext(), g5Var.resourcesProvider, g5Var.currentAccount, tL_starGiftUnique, giftThemeUser, new c2(g5Var, j10, tL_starGiftUnique, qyVar, 1));
            return true;
        }
        ChatThemeController.getInstance(g5Var.currentAccount).setDialogTheme(j10, new sf.b(null, tL_starGiftUnique.slug));
        qyVar.presentFragment(zn.R9(j10), true);
        return true;
    }

    public static void Y(final g5 g5Var) {
        int i10;
        long peerDialogId;
        long j10;
        long j11;
        final long clientUserId = UserConfig.getInstance(g5Var.currentAccount).getClientUserId();
        final TL_stars.InputSavedStarGift E1 = g5Var.E1();
        if (E1 == null) {
            return;
        }
        MessageObject messageObject = g5Var.B0;
        if (messageObject != null) {
            i10 = messageObject.messageOwner.date;
            boolean isOutOwner = messageObject.isOutOwner();
            MessageObject messageObject2 = g5Var.B0;
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
            peerDialogId = peer2 != null ? DialogObject.getPeerDialogId(peer2) : isOutOwner ? clientUserId : g5Var.B0.getDialogId();
            j10 = tL_messageActionStarGift.convert_stars;
        } else {
            TL_stars.SavedStarGift savedStarGift = g5Var.z0;
            if (savedStarGift == null) {
                return;
            }
            i10 = savedStarGift.date;
            peerDialogId = ((savedStarGift.flags & 2) == 0 || savedStarGift.name_hidden) ? UserObject.ANONYMOUS : DialogObject.getPeerDialogId(savedStarGift.from_id);
            j10 = g5Var.z0.convert_stars;
            j11 = g5Var.U;
        }
        int max = Math.max(1, (MessagesController.getInstance(g5Var.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(g5Var.currentAccount).getCurrentTime() - i10)) / 86400);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g5Var.getContext(), 0, g5Var.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2ConvertTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2ConvertText2", max, (UserObject.isService(peerDialogId) || peerDialogId == UserObject.ANONYMOUS) ? LocaleController.getString(R.string.StarsTransactionHidden) : DialogObject.getShortName(peerDialogId), LocaleController.formatPluralStringComma("Gift2ConvertStars", (int) j10)));
        final long j12 = j10;
        final long j13 = j11;
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2ConvertButton), new org.telegram.ui.ActionBar.c2() { // from class: lh.e3
            @Override // org.telegram.ui.ActionBar.c2
            public final void l(org.telegram.ui.ActionBar.d2 d2Var2, int i11) {
                g5.k0(g5.this, E1, j13, clientUserId, j12);
            }
        });
        kf.k0.u(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void Y0(g5 g5Var, String str, long j10) {
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
        n2Var.a = true;
        kh.q5 q5Var = new kh.q5(g5Var.U, str, j10, g5Var.resourcesProvider);
        q5Var.e = new y2(g5Var, 0);
        R.showAsSheet(q5Var, n2Var);
    }

    public static /* synthetic */ void Z(g5 g5Var, boolean[] zArr, TL_stars.StarGiftAttribute starGiftAttribute, sc[] scVarArr) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        TL_stars.StarGift B1 = g5Var.B1();
        GiftAuctionController.getInstance(g5Var.currentAccount).requestAuctionUpgrades(B1.gift_id, new g2(g5Var, B1, starGiftAttribute, scVarArr, zArr, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public static void Z0(g5 g5Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.Document document, String str, String str2, String str3, long j10, TLRPC.TL_error tL_error) {
        sz0 sz0Var;
        sz0 sz0Var2;
        float f10;
        float f11;
        char c3;
        ?? r92;
        d2Var.dismiss();
        if (!(tLObject instanceof TL_stars.UniqueStarGiftValueInfo)) {
            if (tL_error != null) {
                g5Var.getBulletinFactory().d0(tL_error, false);
                return;
            }
            return;
        }
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject;
        org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(g5Var.getContext(), g5Var.resourcesProvider, false, false);
        LinearLayout linearLayout = new LinearLayout(g5Var.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(g5Var.getContext());
        ja.Z0(p9Var.getImageReceiver(), document, 160);
        linearLayout.addView(p9Var, k7.b6.t(160, 160, 1, 0, 0, 0, 0));
        TextView textView = new TextView(g5Var.getContext());
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, g5Var.resourcesProvider));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(21.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, g5Var.resourcesProvider)));
        textView.setGravity(17);
        linearLayout.addView(textView, k7.b6.t(-2, 42, 1, 0, 12, 0, 15));
        textView.setText(str);
        TextView textView2 = new TextView(g5Var.getContext());
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, g5Var.resourcesProvider));
        textView2.setGravity(17);
        linearLayout.addView(textView2, k7.b6.t(-2, -2, 1, 16, 0, 16, 19));
        if (uniqueStarGiftValueInfo.value_is_average) {
            org.telegram.ui.b.o(R.string.GiftValueAverage, new Object[]{str2}, textView2);
        } else if (uniqueStarGiftValueInfo.last_sale_on_fragment) {
            org.telegram.ui.b.o(R.string.GiftValueLastFragment, new Object[]{str3}, textView2);
        } else {
            org.telegram.ui.b.o(R.string.GiftValueLastTelegram, new Object[]{str3}, textView2);
        }
        FrameLayout frameLayout = new FrameLayout(g5Var.getContext());
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        kh.a0 a0Var = new kh.a0(g5Var, new ph.f3[1], frameLayout, 3);
        sz0 sz0Var3 = new sz0(g5Var.getContext(), g5Var.resourcesProvider);
        frameLayout.addView(sz0Var3, k7.b6.e(-1, -1, 119));
        sz0Var3.c(LocaleController.getString(R.string.GiftValueInitialSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.initial_sale_date, true), null, null);
        String string = LocaleController.getString(R.string.GiftValueInitialPrice);
        StringBuilder sb = new StringBuilder("⭐️");
        sb.append(uniqueStarGiftValueInfo.initial_sale_stars);
        sb.append(" (~");
        sz0Var3.c(string, ja.X0(false, android.support.v4.media.a.r(sb, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
            sz0Var3.c(LocaleController.getString(R.string.GiftValueLastSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.last_sale_date, true), null, null);
            int round = ((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100;
            if (round > 0) {
                sz0Var3.e(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + LocaleController.formatNumber(round, ' ') + "%", null, null);
                sz0Var = sz0Var3;
            } else {
                sz0Var = sz0Var3;
                sz0Var.c(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
            }
        } else {
            sz0Var = sz0Var3;
        }
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
            q2 q2Var = new q2(a0Var, new sc[]{(sc) ((pz0) r0.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str2, 0);
            sz0Var2 = sz0Var;
            TableRow e = sz0Var2.e(LocaleController.getString(R.string.GiftValueMinPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", q2Var, null);
            e.setOnClickListener(new androidx.mediarouter.app.c(q2Var, 18));
        } else {
            sz0Var2 = sz0Var;
        }
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
            q2 q2Var2 = new q2(a0Var, new sc[]{(sc) ((pz0) r0.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str2, 1);
            TableRow e6 = sz0Var2.e(LocaleController.getString(R.string.GiftValueAveragePrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", q2Var2, null);
            e6.setOnClickListener(new androidx.mediarouter.app.c(q2Var2, 19));
        }
        linearLayout.addView(frameLayout, k7.b6.t(-1, -2, 7, 0, 0, 0, 12));
        if (uniqueStarGiftValueInfo.listed_count > 0) {
            ph.d dVar = new ph.d(g5Var.getContext(), g5Var.resourcesProvider, false);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.listed_count, ' '));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) "e");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.u5(document, 1.5f, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleTelegram));
            dVar.g(AndroidUtilities.replaceArrows(spannableStringBuilder, false, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f)), false, true);
            f10 = 1.0f;
            f11 = 2.0f;
            c3 = ' ';
            r92 = 1;
            dVar.setOnClickListener(new r2(g5Var, str2, j10, 0));
            linearLayout.addView(dVar, k7.b6.t(-1, 42, 7, 0, 0, 0, 2));
        } else {
            f10 = 1.0f;
            f11 = 2.0f;
            c3 = ' ';
            r92 = 1;
        }
        if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
            ph.d dVar2 = new ph.d(g5Var.getContext(), g5Var.resourcesProvider, false);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.fragment_listed_count, c3));
            spannableStringBuilder2.append((CharSequence) "e");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.u5(document, 1.5f, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - r92, spannableStringBuilder2.length(), 33);
            spannableStringBuilder2.append((CharSequence) " ");
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleFragment));
            dVar2.g(AndroidUtilities.replaceArrows(spannableStringBuilder2, false, AndroidUtilities.dp(f11), AndroidUtilities.dp(f10)), false, r92);
            dVar2.setOnClickListener(new cg.n(21, g5Var, uniqueStarGiftValueInfo));
            linearLayout.addView(dVar2, k7.b6.t(-1, 42, 7, 0, 0, 0, 0));
        }
        o10.customView = linearLayout;
        o10.show();
    }

    public static void a0(g5 g5Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        g5Var.h1 = false;
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            ic Y = g5Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
        } else {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(g5Var.currentAccount).putUsers(paymentForm.users, false);
            g5Var.i1 = paymentForm;
            g5Var.b2();
        }
    }

    public static void a1(final g5 g5Var, final kh.u0 u0Var, lf.b bVar, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z4, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        g5Var.g0.setLoading(false);
        if (u0Var != null && u0Var.I) {
            u0Var.I = false;
            u0Var.E.h(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        new k4(g5Var.getContext(), g5Var.resourcesProvider, tL_starGiftUnique, new i4(bVar, tL_payments_paymentFormStarGift), g5Var.currentAccount, j10, g5Var.C1(), false, new Utilities.Callback2() { // from class: lh.m2
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                g5.R(g5.this, tL_starGiftUnique, j10, tL_textWithEntities, z4, u0Var, (i4) obj, (ze.c) obj2);
            }
        }).b();
    }

    public static void b0(g5 g5Var) {
        Bundle bundle = new Bundle();
        long j10 = g5Var.U;
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        if (j10 == UserConfig.getInstance(g5Var.currentAccount).getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        bundle.putBoolean("open_gifts", true);
        bundle.putBoolean("open_gifts_upgradable", true);
        d2(new ProfileActivity(bundle, null));
    }

    public static void b1(g5 g5Var) {
        ph.d dVar = g5Var.g0;
        if (UserConfig.getInstance(g5Var.currentAccount).isPremium() && (P1(g5Var.currentAccount, g5Var.K1()) || g5Var.S0)) {
            g5Var.r2(false);
            return;
        }
        TL_stars.TL_starGiftUnique K1 = g5Var.K1();
        if (K1 == null) {
            return;
        }
        TLRPC.Peer peer = K1.owner_id;
        if (peer == null) {
            peer = K1.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb = new StringBuilder();
        sb.append(K1.title);
        sb.append(" #");
        g5Var.w0.setText(LocaleController.formatString(R.string.Gift2WearTitle, kf.k0.l(K1.num, ',', sb)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (!UserConfig.getInstance(g5Var.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (g5Var.R0 == null) {
                g5Var.R0 = new lq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(g5Var.R0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new l1(g5Var, 26));
        g5Var.b0.setWearPreview(MessagesController.getInstance(g5Var.currentAccount).getUserOrChat(peerDialogId));
        g5Var.q2(2, true, null);
    }

    public static void c0(g5 g5Var, Utilities.Callback2 callback2, ArrayList arrayList, Runnable runnable, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
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
                    messageObject = new MessageObject(g5Var.currentAccount, message, false, false);
                    break;
                }
            }
            MessagesController.getInstance(g5Var.currentAccount).processUpdates(updates, false);
            if (messageObject != null) {
                TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageObject.messageOwner.action).gift;
                callback2.run(starGift, new androidx.car.app.utils.c(g5Var, messageObject, arrayList, starGift, 9));
                return;
            }
            callback2.run(null, null);
            t7.y(g5Var.currentAccount, false).P();
            l7 G = t7.y(g5Var.currentAccount, false).G(UserConfig.getInstance(g5Var.currentAccount).getClientUserId(), false);
            if (G != null) {
                G.j(arrayList, null);
                return;
            }
            return;
        }
        if (tL_error != null) {
            if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                alertDialog$Builder = new AlertDialog$Builder(g5Var.getContext(), 0, new nh.b());
                String string = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string;
                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftUnavailableText));
                i10 = R.string.OK;
            } else {
                String str = tL_error.text;
                if (str == null || !str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                    g5Var.getBulletinFactory().d0(tL_error, false);
                    runnable.run();
                }
                long parseLong = Long.parseLong(tL_error.text.substring(25)) + ConnectionsManager.getInstance(g5Var.currentAccount).getCurrentTime();
                alertDialog$Builder = new AlertDialog$Builder(g5Var.getContext(), 0, new nh.b());
                String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.a;
                d2Var2.O = string2;
                d2Var2.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(parseLong, true)));
                i10 = R.string.OK;
            }
            kf.k0.C(i10, alertDialog$Builder, null);
            runnable.run();
        }
    }

    public static void c1(g5 g5Var, TLObject tLObject, CharSequence charSequence, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            if (tL_error != null) {
                g5Var.getBulletinFactory().d0(tL_error, false);
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
        LinearLayout linearLayout = new LinearLayout(g5Var.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        TextView b10 = k7.f6.b(g5Var.getContext(), 16.0f, org.telegram.ui.ActionBar.j6.j5, false, null);
        b10.setText(LocaleController.getString(R.string.Gift2RemoveDescriptionText));
        linearLayout.addView(b10, k7.b6.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
        sz0 sz0Var = new sz0(g5Var.getContext(), g5Var.resourcesProvider);
        qz0 a2 = sz0Var.a(charSequence);
        a2.setFilled(true);
        ih.s sVar = (ih.s) a2.getChildAt(0);
        sVar.setTextSize(1, 12.0f);
        sVar.setGravity(17);
        linearLayout.addView(sz0Var, k7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g5Var.getContext(), 0, g5Var.resourcesProvider);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.Gift2RemoveDescriptionTitle);
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(ja.Q0(LocaleController.formatString(R.string.Gift2RemoveDescriptionButton, Integer.valueOf((int) j10))), new p2(g5Var, tL_starGiftUnique, paymentForm, tL_inputInvoiceStarGiftDropOriginalDetails, j10, charSequence));
        alertDialog$Builder.o();
    }

    public static void d0(g5 g5Var, long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, qy qyVar) {
        ChatThemeController.getInstance(g5Var.currentAccount).setDialogTheme(j10, new sf.b(null, tL_starGiftUnique.slug));
        qyVar.presentFragment(zn.R9(j10), true);
    }

    public static /* synthetic */ void d1(g5 g5Var, long j10) {
        z9 z9Var = new z9(g5Var.getContext(), g5Var.resourcesProvider, j10, 10, null, new n2(3, g5Var, new boolean[]{false}), 0L);
        z9Var.setOnDismissListener(new z2(g5Var, 0));
        z9Var.show();
    }

    public static void d2(org.telegram.ui.ActionBar.p2 p2Var) {
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
        n2Var.a = true;
        U.showAsSheet(p2Var, n2Var);
    }

    public static /* synthetic */ void e0(g5 g5Var, long j10, long j11, Utilities.Callback callback) {
        z9 z9Var = new z9(g5Var.getContext(), g5Var.resourcesProvider, j10, 11, null, new c2(g5Var, new boolean[]{false}, j11, callback, 2), 0L);
        z9Var.setOnDismissListener(new z2(g5Var, 1));
        z9Var.show();
    }

    public static /* synthetic */ void e1(g5 g5Var, TLRPC.TL_messageActionStarGift tL_messageActionStarGift, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(g5Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(g5Var.currentAccount).putChats(messages_messages.chats, false);
            for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                TLRPC.Message message = messages_messages.messages.get(i10);
                if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.id == tL_messageActionStarGift.upgrade_msg_id) {
                    messageObject = new MessageObject(g5Var.currentAccount, message, false, false);
                    messageObject.setType();
                    break;
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(g5Var, d2Var, messageObject, 26));
        } else {
            AndroidUtilities.runOnUIThread(new g3(d2Var, 0));
        }
    }

    public static void f0(g5 g5Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        int i10 = 1;
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tL_error == null || !"BALANCE_TOO_LOW".equals(tL_error.text)) {
                callback.run(tL_error);
                g5Var.getBulletinFactory().d0(tL_error, false);
                return;
            } else {
                if (!MessagesController.getInstance(g5Var.currentAccount).starsPurchaseAvailable()) {
                    g5Var.g0.setLoading(false);
                    t7.e0(g5Var.getContext(), g5Var.resourcesProvider);
                    return;
                }
                t7 y10 = t7.y(g5Var.currentAccount, false);
                i5.x xVar = new i5.x(g5Var, j12, j10, callback, 2);
                y10.e = false;
                y10.q(false, true, xVar);
                y10.e = true;
                return;
            }
        }
        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
        MessagesController.getInstance(g5Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
        MessagesController.getInstance(g5Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
        t7.y(g5Var.currentAccount, false).T(false);
        t7.y(g5Var.currentAccount, false).Q(j10);
        t7.y(g5Var.currentAccount, false).Q(j11);
        t7.y(g5Var.currentAccount, false).P();
        callback.run(null);
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            if (j10 < 0 || j11 < 0) {
                ic M = qc.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, g5Var.C1(), DialogObject.getShortName(j10))), R.raw.forward);
                M.t = true;
                M.j();
            } else {
                zn R9 = zn.R9(j10);
                R9.whenFullyVisible(new s2(g5Var, R9, j10, 1));
                U.presentFragment(R9);
            }
        }
        Utilities.stageQueue.postRunnable(new w2(g5Var, tL_payments_paymentResult, i10));
    }

    public static /* synthetic */ void f1(g5 g5Var, TL_stars.InputSavedStarGift inputSavedStarGift, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(g5Var.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(g5Var.currentAccount).putChats(updates.chats, false);
        }
        AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(g5Var, tL_error, tLObject, inputSavedStarGift, 10));
    }

    public static void g0(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback callback, Boolean bool) {
        if (g5Var.Q0 == null) {
            kh.o5 o5Var = new kh.o5(g5Var.currentAccount, tL_starGiftUnique.gift_id);
            g5Var.Q0 = o5Var;
            o5Var.a();
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            d4[] d4VarArr = g5Var.b0.I.n;
            if (i10 >= d4VarArr.length) {
                kh.p5 p5Var = new kh.p5(g5Var.getContext(), tL_starGiftUnique.title, g5Var.Q0);
                p5Var.d0.addAll(hashSet);
                p5Var.f0.N(true);
                p5Var.e0 = bool.booleanValue();
                p5Var.b0.set(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSelect", 4 - hashSet.size(), new Object[0])));
                p5Var.c0 = new n1(0, callback);
                p5Var.show();
                return;
            }
            TL_stars.StarGift starGift = d4VarArr[i10].h;
            if ((starGift != null ? starGift : null) != null) {
                if (starGift == null) {
                    starGift = null;
                }
                hashSet.add(Long.valueOf(starGift.id));
            }
            i10++;
        }
    }

    public static void g1(final g5 g5Var) {
        TL_stars.SavedStarGift savedStarGift = g5Var.z0;
        if (savedStarGift.unsaved) {
            savedStarGift.unsaved = false;
            j7 F = t7.y(g5Var.currentAccount, false).F(g5Var.U, false);
            if (F != null) {
                TL_stars.SavedStarGift savedStarGift2 = g5Var.z0;
                F.m(savedStarGift2, savedStarGift2.unsaved);
            }
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = g5Var.E1();
            savestargift.unsave = g5Var.z0.unsaved;
            ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(savestargift, null, 64);
        }
        TL_stars.SavedStarGift savedStarGift3 = g5Var.z0;
        boolean z4 = savedStarGift3.pinned_to_top;
        if (((l7) g5Var.A0).m(savedStarGift3, !z4, false)) {
            new kh.v3(g5Var.getContext(), g5Var.U, g5Var.z0, g5Var.resourcesProvider, new Utilities.Callback0Return() { // from class: lh.q1
                @Override // org.telegram.messenger.Utilities.Callback0Return
                public final Object run() {
                    return g5.this.getBulletinFactory();
                }
            }).show();
            return;
        }
        if (z4) {
            kf.k0.v(R.string.Gift2Unpinned, g5Var.getBulletinFactory(), R.raw.ic_unpin, 36);
        } else {
            g5Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
        }
    }

    public static SpannableStringBuilder g2(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new lq(R.drawable.filled_understood, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new lq(R.drawable.filled_reactions, 0), 0, spannableString2.length(), 33);
        AndroidUtilities.replaceMultipleCharSequence("👌", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("👍", spannableStringBuilder, spannableString2);
        return spannableStringBuilder;
    }

    public static void h0(g5 g5Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        TL_stars.SavedStarGift savedStarGift;
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(g5Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(g5Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            t7.y(g5Var.currentAccount, false).T(false);
            t7.y(g5Var.currentAccount, false).P();
            if (!TextUtils.isEmpty(str) && (savedStarGift = g5Var.z0) != null) {
                savedStarGift.flags &= -65537;
                savedStarGift.prepaid_upgrade_hash = null;
            }
            g5Var.n0 = true;
            g5Var.i1 = null;
            g5Var.r1(inputSavedStarGift, tL_payments_paymentResult.updates, new v2(g5Var, str, 0));
            Utilities.stageQueue.postRunnable(new w2(g5Var, tL_payments_paymentResult, 0));
            return;
        }
        if (tL_error == null || !"BALANCE_TOO_LOW".equals(tL_error.text)) {
            g5Var.getBulletinFactory().d0(tL_error, false);
            return;
        }
        if (!MessagesController.getInstance(g5Var.currentAccount).starsPurchaseAvailable()) {
            g5Var.g0.setLoading(false);
            t7.e0(g5Var.getContext(), g5Var.resourcesProvider);
            return;
        }
        t7 y10 = t7.y(g5Var.currentAccount, false);
        u1 u1Var = new u1(g5Var, j10, 3);
        y10.e = false;
        y10.q(false, true, u1Var);
        y10.e = true;
    }

    public static /* synthetic */ void i0(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, lf.a aVar, Runnable runnable) {
        g5Var.getClass();
        TL_stars.StarsAmount o10 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = g5Var.E1();
        updatestargiftprice.resell_amount = o10;
        ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(updatestargiftprice, new r1(g5Var, tL_starGiftUnique, aVar, runnable, 1));
    }

    public static void i1(g5 g5Var, String str) {
        long j10 = g5Var.U;
        g5Var.g0.setLoading(false);
        if (TextUtils.isEmpty(str)) {
            g5Var.q2(0, true, null);
            return;
        }
        g5Var.dismiss();
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (R instanceof zn) {
            zn znVar = (zn) R;
            if (znVar.a() == j10) {
                qc.a0(znVar).M(LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(j10))), R.raw.gift).k(true);
                return;
            }
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(g5Var.currentAccount);
        int i10 = NotificationCenter.closeProfileActivity;
        Long valueOf = Long.valueOf(j10);
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, valueOf, bool);
        NotificationCenter.getInstance(g5Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j10), bool);
        zn R9 = zn.R9(j10);
        R9.whenFullyVisible(new n2(5, g5Var, R9));
        R.presentFragment(R9);
    }

    public static void j0(g5 g5Var, TLObject tLObject, MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        MessagesController.getInstance(g5Var.currentAccount).putUsers(messages_messages.users, false);
        MessagesController.getInstance(g5Var.currentAccount).putChats(messages_messages.chats, false);
        g5Var.G0 = true;
        g5Var.F0 = false;
        Boolean bool = g5Var.c1;
        if (bool != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                ((TLRPC.TL_messageActionStarGift) messageAction).saved = true ^ bool.booleanValue();
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = true ^ bool.booleanValue();
            }
        }
        g5Var.i2(messageObject, null);
    }

    public static void j1(g5 g5Var, boolean z4) {
        int G1 = g5Var.G1();
        if (G1 < 0) {
            return;
        }
        int i10 = (z4 ? 1 : -1) + G1;
        int i11 = g5Var.O0;
        if (i11 >= 0 && (!z4 ? i11 < G1 : i11 > G1)) {
            i10 = i11;
        }
        m7 m7Var = g5Var.A0;
        Object obj = (m7Var == null || i10 < 0 || i10 >= m7Var.e()) ? null : g5Var.A0.get(i10);
        if (obj == null) {
            return;
        }
        if ((z4 ? g5Var.Z : g5Var.Y) != null) {
            if (obj instanceof TL_stars.SavedStarGift) {
                if (x1((z4 ? g5Var.Z : g5Var.Y).z0, (TL_stars.SavedStarGift) obj)) {
                    return;
                }
            }
            if (obj instanceof TL_stars.TL_starGiftUnique) {
                if (y1((z4 ? g5Var.Z : g5Var.Y).D0, (TL_stars.TL_starGiftUnique) obj)) {
                    return;
                }
            }
        }
        kh.l3 l3Var = new kh.l3(g5Var, g5Var.getContext(), g5Var.currentAccount, g5Var.U, g5Var.resourcesProvider, g5Var.V.getRootView());
        if (obj instanceof TL_stars.SavedStarGift) {
            l3Var.j2((TL_stars.SavedStarGift) obj, g5Var.A0);
        } else if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            l3Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, g5Var.A0);
        }
        AndroidUtilities.removeFromParent(l3Var.containerView);
        if (z4) {
            g5Var.Z = l3Var;
        } else {
            g5Var.Y = l3Var;
        }
    }

    public static void k0(g5 g5Var, TL_stars.InputSavedStarGift inputSavedStarGift, long j10, long j11, long j12) {
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(ApplicationLoader.applicationContext, 3, null);
        d2Var.q(500L);
        TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
        convertstargift.stargift = inputSavedStarGift;
        ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(convertstargift, new y1(g5Var, d2Var, j10, j11, j12));
    }

    public static void k1(final g5 g5Var, final View view) {
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity == null) {
            return;
        }
        ph.w9 b10 = view instanceof org.telegram.ui.Cells.d7 ? ph.y9.b((org.telegram.ui.Cells.d7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = g5Var.B0;
        if (messageObject != null) {
            arrayList.add(messageObject);
        } else {
            if (!(g5Var.B1() instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            long clientUserId = UserConfig.getInstance(g5Var.currentAccount).getClientUserId();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) g5Var.B1();
            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
            tL_messageService.peer_id = MessagesController.getInstance(g5Var.currentAccount).getPeer(clientUserId);
            tL_messageService.from_id = MessagesController.getInstance(g5Var.currentAccount).getPeer(clientUserId);
            tL_messageService.date = ConnectionsManager.getInstance(g5Var.currentAccount).getCurrentTime();
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
            tL_messageActionStarGiftUnique.gift = tL_starGiftUnique;
            tL_messageActionStarGiftUnique.upgrade = true;
            tL_messageService.action = tL_messageActionStarGiftUnique;
            MessageObject messageObject2 = new MessageObject(g5Var.currentAccount, tL_messageService, false, false);
            messageObject2.setType();
            arrayList.add(messageObject2);
        }
        final ph.da E = ph.da.E(launchActivity, g5Var.currentAccount);
        E.O = new Utilities.Callback4() { // from class: lh.m1
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                ph.da daVar = E;
                ph.w9 w9Var = null;
                if (booleanValue) {
                    g5 g5Var2 = g5.this;
                    AndroidUtilities.runOnUIThread(new ff.c(29, g5Var2, l10));
                    daVar.Y(null);
                    j3 j3Var = g5Var2.T0;
                    if (j3Var != null) {
                        j3Var.dismiss();
                        g5Var2.T0 = null;
                    }
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.d7) && view2.isAttachedToWindow()) {
                        w9Var = ph.y9.b((org.telegram.ui.Cells.d7) view2);
                    }
                    daVar.Y(w9Var);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(b10, ph.t6.y(arrayList));
    }

    public static void l0(g5 g5Var, long j10) {
        new kh.g2(g5Var.getContext(), g5Var.currentAccount, j10, null, new y2(g5Var, 2)).show();
    }

    public static void m0(g5 g5Var, org.telegram.ui.ActionBar.d2 d2Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            d2Var.dismiss();
            g5Var.I0 = true;
            g5Var.j2(savedStarGift, null);
            super.show();
            return;
        }
        d2Var.dismiss();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            ic Q = qc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
            Q.t = true;
            Q.j();
        }
    }

    public static void n0(g5 g5Var) {
        TL_stars.TL_starGiftUnique K1 = g5Var.K1();
        new n0(g5Var.getContext(), g5Var.currentAccount, DialogObject.getPeerDialogId(K1.owner_id), K1, g5Var.resourcesProvider, new t1(g5Var, 2)).show();
    }

    public static /* synthetic */ void o0(g5 g5Var, String str) {
        g5Var.dismiss();
        ze.d.s(g5Var.getContext(), "https://" + MessagesController.getInstance(g5Var.currentAccount).linkPrefix + "/" + str);
    }

    public static void p0(g5 g5Var) {
        if (g5Var.i1 == null) {
            return;
        }
        long j10 = 0;
        for (int i10 = 0; i10 < g5Var.i1.invoice.prices.size(); i10++) {
            j10 += g5Var.i1.invoice.prices.get(i10).amount;
        }
        e5 e5Var = new e5(g5Var.getContext(), j10, g5Var.f1, g5Var.resourcesProvider);
        g5Var.m0 = e5Var;
        e5Var.show();
    }

    public static /* synthetic */ void q0(g5 g5Var, ze.c cVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(g5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(g5Var, cVar, tL_starGiftUnique, 23));
            return;
        }
        g5Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new i5.v(g5Var, cVar, Long.parseLong(tL_error.text.substring(26)), 3));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(g5Var, cVar, tL_error, 24));
        }
    }

    public static void q1(sz0 sz0Var, TL_stars.StarGiftAttribute starGiftAttribute) {
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
        sz0Var.e(str, starGiftAttribute.name, J1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static /* synthetic */ void r0(g5 g5Var, TL_stars.StarGift starGift, TL_stars.StarGiftAttribute starGiftAttribute, sc[] scVarArr, boolean[] zArr, ArrayList arrayList) {
        if (arrayList != null) {
            new j1(g5Var.getContext(), g5Var.resourcesProvider, g5Var.currentAccount, starGift.title, arrayList, false).show();
        } else {
            g5Var.o2(scVarArr[0], LocaleController.formatString(R.string.Gift2RarityHint, rh.j.G0(starGiftAttribute.getRarityPermille())), false);
        }
        zArr[0] = false;
    }

    public static /* synthetic */ void s0(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, lf.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(g5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new i2(g5Var, tL_starGiftUnique, aVar, runnable, 0));
            return;
        }
        g5Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new i5.v(g5Var, Long.parseLong(tL_error.text.substring(26)), runnable, 2));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new j2(g5Var, tL_error, runnable, 0));
        }
    }

    public static /* synthetic */ void u0(g5 g5Var, ArrayList arrayList, Utilities.Callback2 callback2, Runnable runnable) {
        kh.o5 o5Var = g5Var.Q0;
        if (o5Var != null) {
            o5Var.b();
            g5Var.Q0 = null;
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
        ConnectionsManager.getInstance(g5Var.currentAccount).sendRequestTyped(craftstargift, new org.telegram.messenger.a(), new z1(g5Var, callback2, arrayList, runnable, 0));
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
    public static void v0(g5 g5Var) {
        String str;
        boolean z4;
        int i10;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        lq[] lqVarArr = g5Var.j1;
        ph.d dVar = g5Var.g0;
        int i11 = 1;
        if (g5Var.V0.b == 1 && !g5Var.isDismissed()) {
            TL_stars.InputSavedStarGift E1 = g5Var.E1();
            MessageObject messageObject = g5Var.B0;
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
                z4 = false;
            } else {
                TL_stars.SavedStarGift savedStarGift = g5Var.z0;
                if (savedStarGift == null) {
                    return;
                }
                long j12 = savedStarGift.upgrade_stars;
                str = savedStarGift.prepaid_upgrade_hash;
                if (j12 <= 0) {
                }
                z4 = false;
            }
            int currentTime = ConnectionsManager.getInstance(g5Var.currentAccount).getCurrentTime();
            if (g5Var.g1 != null) {
                i10 = 0;
                while (i10 < g5Var.g1.size()) {
                    starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) g5Var.g1.get(i10);
                    if (starGiftUpgradePrice.date >= currentTime) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            i10 = -1;
            starGiftUpgradePrice = null;
            if (g5Var.i1 != null) {
                int i12 = 0;
                while (i12 < g5Var.i1.invoice.prices.size()) {
                    j10 += g5Var.i1.invoice.prices.get(i12).amount;
                    i12++;
                    starGiftUpgradePrice = starGiftUpgradePrice;
                }
            }
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = starGiftUpgradePrice;
            if (i10 > 0 && !g5Var.h1) {
                g5Var.h1 = true;
                if (g5Var.g1 != null) {
                    for (int i13 = 0; i13 < i10; i13++) {
                        g5Var.g1.remove(0);
                    }
                }
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = g5Var.s0.a.q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = E1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(g5Var.currentAccount).getInputPeer(g5Var.U);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                }
                JSONObject p10 = rh.p2.p(g5Var.resourcesProvider, false);
                if (p10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = p10.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(tL_payments_getPaymentForm, new f3(g5Var, i11));
            }
            if (z4) {
                dVar.g(ja.R0(LocaleController.formatString(R.string.Gift2PrepayUpgradeButton, Long.valueOf(j10)), 1.13f, lqVarArr), true, true);
            } else {
                dVar.g(ja.R0(LocaleController.formatString(R.string.Gift2UpgradeButton, Long.valueOf(j10)), 1.13f, lqVarArr), true, true);
            }
            e5 e5Var = g5Var.m0;
            if (e5Var != null) {
                e5Var.P(j10);
            }
            if (starGiftUpgradePrice2 == null) {
                dVar.f(null, true);
                return;
            }
            int i14 = starGiftUpgradePrice2.date - currentTime;
            String formatDuration = i14 < 86400 ? AndroidUtilities.formatDuration(i14, false, true) : LocaleController.formatPluralString("Days", Math.round(i14 / 86400.0f), new Object[0]);
            dVar.e.o(false, true, false);
            dVar.f(LocaleController.formatString(R.string.Gift2UpgradeButtonDecreasesIn, formatDuration), true);
            AndroidUtilities.runOnUIThread(g5Var.k1, 1000L);
        }
    }

    public static void x0(g5 g5Var, TLObject tLObject, gg.v2[] v2VarArr, Long l10, androidx.car.app.utils.b bVar, TLRPC.TL_error tL_error) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (!(tLObject instanceof TLRPC.TL_users_userFull)) {
            ic Y = g5Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
            return;
        }
        TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
        MessagesController.getInstance(g5Var.currentAccount).putUsers(tL_users_userFull.users, false);
        MessagesController.getInstance(g5Var.currentAccount).putChats(tL_users_userFull.chats, false);
        TLRPC.UserFull userFull = tL_users_userFull.full_user;
        if (userFull == null || (disallowedGiftsSettings = userFull.disallowed_stargifts) == null || !disallowedGiftsSettings.disallow_unique_stargifts) {
            bVar.run();
        } else {
            new qc(v2VarArr[0].container, g5Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l10.longValue())))).j();
        }
    }

    public static boolean x1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
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

    public static void y0(g5 g5Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        t1 t1Var = g5Var.k1;
        g5Var.h1 = false;
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            ic Y = g5Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
        } else {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(g5Var.currentAccount).putUsers(paymentForm.users, false);
            g5Var.i1 = paymentForm;
            AndroidUtilities.cancelRunOnUIThread(t1Var);
            AndroidUtilities.runOnUIThread(t1Var);
        }
    }

    public static boolean y1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique == tL_starGiftUnique2) {
            return true;
        }
        if (tL_starGiftUnique != null) {
            return tL_starGiftUnique.id == tL_starGiftUnique2.id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug);
        }
        return false;
    }

    public static void z0(g5 g5Var, TLObject tLObject, boolean z4, TLRPC.Document document, boolean z10, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        j7 F;
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                if (z4 && g5Var.z0 != null && (F = t7.y(g5Var.currentAccount, false).F(g5Var.U, false)) != null) {
                    F.m(g5Var.z0, !savestargift.unsave);
                }
                g5Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
                return;
            }
            return;
        }
        g5Var.dismiss();
        long A1 = g5Var.A1();
        if (!z4) {
            t7.y(g5Var.currentAccount, false).Q(A1);
        }
        if (A1 >= 0) {
            qc.a0(U).s(document, LocaleController.getString(z10 ? R.string.Gift2MadePrivateTitle : R.string.Gift2MadePublicTitle), AndroidUtilities.replaceSingleTag(LocaleController.getString(z10 ? R.string.Gift2MadePrivate : R.string.Gift2MadePublic), U instanceof ProfileActivity ? null : new h2(A1, U))).k(true);
        } else {
            qc.a0(U).s(document, LocaleController.getString(z10 ? R.string.Gift2ChannelMadePrivateTitle : R.string.Gift2ChannelMadePublicTitle), LocaleController.getString(z10 ? R.string.Gift2ChannelMadePrivate : R.string.Gift2ChannelMadePublic)).j();
        }
    }

    public final long A1() {
        TLRPC.Peer peer;
        MessageObject messageObject = this.B0;
        if (messageObject == null) {
            TL_stars.SavedStarGift savedStarGift = this.z0;
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                return starGift instanceof TL_stars.TL_starGiftUnique ? DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift).owner_id) : this.U;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.D0;
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
            return peer2 != null ? DialogObject.getPeerDialogId(peer2) : messageObject.isOutOwner() ? this.B0.getDialogId() : UserConfig.getInstance(this.currentAccount).getClientUserId();
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

    public final TL_stars.StarGift B1() {
        MessageObject messageObject = this.B0;
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
            TL_stars.SavedStarGift savedStarGift = this.z0;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.D0;
            if (tL_starGiftUnique != null) {
                return tL_starGiftUnique;
            }
        }
        return null;
    }

    public final String C1() {
        TL_stars.StarGift B1 = B1();
        if (!(B1 instanceof TL_stars.TL_starGiftUnique)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((TL_stars.TL_starGiftUnique) B1).title);
        sb.append(" #");
        return kf.k0.l(r0.num, ',', sb);
    }

    public final TL_stars.InputSavedStarGift E1() {
        TLRPC.Message message;
        TLRPC.Message message2;
        TLRPC.Message message3;
        long j10 = this.U;
        if (j10 < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            MessageObject messageObject = this.B0;
            if (messageObject == null || (message3 = messageObject.messageOwner) == null) {
                TL_stars.SavedStarGift savedStarGift = this.z0;
                if (savedStarGift != null) {
                    if ((savedStarGift.flags & 2048) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                    return tL_inputSavedStarGiftChat;
                }
                if (this.D0 == null || TextUtils.isEmpty(this.C0)) {
                    return tL_inputSavedStarGiftChat;
                }
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.C0;
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
        MessageObject messageObject2 = this.B0;
        if (messageObject2 != null && messageObject2.getDialogId() < 0 && (message2 = this.B0.messageOwner) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.B0.getDialogId());
                tL_inputSavedStarGiftChat2.saved_id = ((TLRPC.TL_messageActionStarGift) messageAction2).saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        MessageObject messageObject3 = this.B0;
        if (messageObject3 != null && messageObject3.getDialogId() < 0 && (message = this.B0.messageOwner) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat3.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.B0.getDialogId());
                tL_inputSavedStarGiftChat3.saved_id = ((TLRPC.TL_messageActionStarGiftUnique) messageAction3).saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        MessageObject messageObject4 = this.B0;
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
        TL_stars.SavedStarGift savedStarGift2 = this.z0;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        if (this.D0 == null || TextUtils.isEmpty(this.C0)) {
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
        tL_inputSavedStarGiftSlug2.slug = this.C0;
        return tL_inputSavedStarGiftSlug2;
    }

    public final String F1() {
        TL_stars.StarGift B1 = B1();
        if (!(B1 instanceof TL_stars.TL_starGiftUnique) || B1.slug == null) {
            return null;
        }
        return MessagesController.getInstance(this.currentAccount).linkPrefix + "/nft/" + B1.slug;
    }

    public final int G1() {
        int indexOf;
        m7 m7Var = this.A0;
        if (m7Var == null) {
            return -1;
        }
        TL_stars.SavedStarGift savedStarGift = this.z0;
        if (savedStarGift != null) {
            indexOf = m7Var.indexOf(savedStarGift);
        } else {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.D0;
            if (tL_starGiftUnique == null) {
                return -1;
            }
            indexOf = m7Var.indexOf(tL_starGiftUnique);
        }
        if (indexOf >= 0) {
            return indexOf;
        }
        TL_stars.StarGift B1 = B1();
        for (int i10 = 0; i10 < this.A0.e(); i10++) {
            Object obj = this.A0.get(i10);
            if (obj instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift2 = this.z0;
                if (savedStarGift2 != null) {
                    if (x1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                        return i10;
                    }
                }
                if (B1 != null) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                    if (B1 != starGift) {
                        if ((B1 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && B1.id == starGift.id) {
                        }
                    }
                    return i10;
                }
                continue;
            } else {
                if ((obj instanceof TL_stars.TL_starGiftUnique) && y1(this.D0, (TL_stars.TL_starGiftUnique) obj)) {
                    return i10;
                }
            }
        }
        return -1;
    }

    public final TL_stars.SavedStarGift H1(boolean z4) {
        int G1 = G1();
        if (G1 < 0) {
            return null;
        }
        int i10 = (z4 ? 1 : -1) + G1;
        int i11 = this.O0;
        if (i11 >= 0 && (!z4 ? i11 < G1 : i11 > G1)) {
            i10 = i11;
        }
        m7 m7Var = this.A0;
        Object obj = (m7Var == null || i10 < 0 || i10 >= m7Var.e()) ? null : this.A0.get(i10);
        if (obj instanceof TL_stars.SavedStarGift) {
            return (TL_stars.SavedStarGift) obj;
        }
        return null;
    }

    public final TL_stars.TL_starGiftUnique I1(boolean z4) {
        int G1 = G1();
        if (G1 < 0) {
            return null;
        }
        int i10 = (z4 ? 1 : -1) + G1;
        int i11 = this.O0;
        if (i11 >= 0 && (!z4 ? i11 < G1 : i11 > G1)) {
            i10 = i11;
        }
        m7 m7Var = this.A0;
        Object obj = (m7Var == null || i10 < 0 || i10 >= m7Var.e()) ? null : this.A0.get(i10);
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) obj;
        }
        return null;
    }

    @Override // org.telegram.ui.Components.sa
    public final boolean K() {
        return false;
    }

    public final TL_stars.TL_starGiftUnique K1() {
        TL_stars.StarGift B1 = B1();
        if (B1 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) B1;
        }
        return null;
    }

    public final boolean L1(boolean z4) {
        return (H1(z4) == null && I1(z4) == null) ? false : true;
    }

    public final void M1(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl = new TL_stars.getStarGiftWithdrawalUrl();
        TL_stars.InputSavedStarGift E1 = E1();
        getstargiftwithdrawalurl.stargift = E1;
        if (E1 == null) {
            return;
        }
        getstargiftwithdrawalurl.password = inputCheckPasswordSRP;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getstargiftwithdrawalurl, new t2(this, twoStepVerificationActivity, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r4 != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q1() {
        long clientUserId;
        TL_stars.TL_starGiftUnique K1 = K1();
        if (this.g0.K || K1 == null) {
            return;
        }
        if (this.D0 != null && this.E0) {
            clientUserId = this.U;
        }
        clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        lf.b bVar = K1.resale_ton_only ? lf.b.b : lf.b.a;
        if (this.D0 == null || !this.E0) {
            c2(K1, clientUserId, bVar, null, true, null);
            return;
        }
        kh.u0 u0Var = new kh.u0(getContext(), this.resourcesProvider, K1, clientUserId);
        u0Var.H = new b3(this, u0Var, K1, clientUserId, bVar, 0);
        u0Var.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R1(View view) {
        int i10;
        TLRPC.Message message;
        TLRPC.Message message2;
        if (view.getAlpha() < 0.99f) {
            u1();
            return;
        }
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        int i11 = 0;
        if (K1.resell_amount != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String formatString = LocaleController.formatString(R.string.Gift2UnlistTitle, C1());
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.O = formatString;
            d2Var.Q = LocaleController.getString(R.string.Gift2UnlistText);
            alertDialog$Builder.k(LocaleController.getString(R.string.Gift2ActionUnlist), new c3(this, K1, i11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new k3.e(28));
            alertDialog$Builder.o();
            return;
        }
        MessageObject messageObject = this.B0;
        if (messageObject != null && (message2 = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message2.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_resell_at;
                if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                    ja.f1(getContext(), this.currentAccount, null, new d3(this, K1, i11), this.resourcesProvider);
                    return;
                }
                Context context = getContext();
                MessageObject messageObject2 = this.B0;
                if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
                    TLRPC.MessageAction messageAction2 = message.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        i11 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_resell_at;
                        p2(i11 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, true);
                        return;
                    }
                }
                TL_stars.SavedStarGift savedStarGift = this.z0;
                if (savedStarGift != null) {
                    i11 = savedStarGift.can_resell_at;
                }
                p2(i11 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, true);
                return;
            }
        }
        TL_stars.SavedStarGift savedStarGift2 = this.z0;
        i10 = savedStarGift2 != null ? savedStarGift2.can_resell_at : 0;
        if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
        }
    }

    public final void S1() {
        j3 j3Var = this.T0;
        if (j3Var != null && j3Var.isShown()) {
            this.T0.dismiss();
        }
        String F1 = F1();
        j3 j3Var2 = new j3(this, getContext(), F1, F1, this.resourcesProvider);
        this.T0 = j3Var2;
        j3Var2.p0 = new androidx.biometric.e0(this, 18);
        j3Var2.show();
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
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T1() {
        TL_stars.TL_starGiftUnique K1;
        this.c0.setAlpha(this.V0.a(0));
        this.o0.setAlpha(this.V0.a(1));
        this.v0.setAlpha(this.V0.a(2));
        this.x0.setAlpha(this.V0.a(3));
        float a2 = 1.0f - this.V0.a(4);
        FrameLayout frameLayout = this.h0;
        frameLayout.setAlpha(a2);
        c5.d dVar = this.V0;
        c5 c5Var = this.b0;
        c5Var.d(dVar);
        ImageView imageView = c5Var.M;
        if (this.V0.c(0) && (K1 = K1()) != null && !K1.crafted && O1(this.currentAccount, DialogObject.getPeerDialogId(K1.owner_id))) {
            MessageObject messageObject = this.B0;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    }
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.z0;
                if (savedStarGift != null) {
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                    }
                }
            }
            imageView.setVisibility(r4);
            dg.s1 s1Var = this.V;
            float d = s1Var.d();
            this.a0.setAlpha(this.V0.a(0) * Utilities.clamp01(AndroidUtilities.ilerp(d - r6.getHeight(), 0.0f, AndroidUtilities.dp(32.0f))));
            s1Var.e();
            s1Var.invalidate();
            frameLayout.setVisibility(this.V0.c(4) ? 8 : 0);
            s2();
        }
        int i10 = 8;
        imageView.setVisibility(i10);
        dg.s1 s1Var2 = this.V;
        float d10 = s1Var2.d();
        this.a0.setAlpha(this.V0.a(0) * Utilities.clamp01(AndroidUtilities.ilerp(d10 - r6.getHeight(), 0.0f, AndroidUtilities.dp(32.0f))));
        s1Var2.e();
        s1Var2.invalidate();
        frameLayout.setVisibility(this.V0.c(4) ? 8 : 0);
        s2();
    }

    public final void U1() {
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        ja.f1(getContext(), this.currentAccount, K1, new d3(this, K1, 2), this.resourcesProvider);
    }

    public final void V1(long j10, String str) {
        this.d1 = true;
        t7.y(this.currentAccount, false).K(j10, new kh.a1(4, this, str));
    }

    public final void W1(boolean z4) {
        int i10;
        MessageObject messageObject = this.B0;
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
            TL_stars.SavedStarGift savedStarGift = this.z0;
            if (savedStarGift != null) {
                i10 = savedStarGift.can_craft_at;
            }
            i10 = 0;
        }
        int i12 = 1;
        if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string = LocaleController.getString(R.string.GiftCraftLaterTitle);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.O = string;
            d2Var.Q = LocaleController.formatString(R.string.GiftCraftLaterText, LocaleController.formatDateTime(i10, true));
            kf.k0.C(R.string.OK, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(K1.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string2 = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
            d2Var2.O = string2;
            d2Var2.Q = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
            kf.k0.C(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        c5 c5Var = this.b0;
        if (z4) {
            c5Var.I.a(this.currentAccount, K1.gift_id, K1.getDocument(), K1.title);
            if (t1()) {
                f4 f4Var = c5Var.I;
                TL_stars.TL_starGiftUnique K12 = K1();
                if (K12 == null) {
                    f4Var.getClass();
                } else {
                    while (true) {
                        d4[] d4VarArr = f4Var.n;
                        if (i11 >= d4VarArr.length) {
                            break;
                        }
                        d4 d4Var = d4VarArr[i11];
                        TL_stars.StarGift starGift = d4Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            d4Var.a(K12, true);
                            break;
                        }
                        i11++;
                    }
                    f4Var.d(true);
                }
            }
        }
        f4 f4Var2 = c5Var.I;
        f4 f4Var3 = c5Var.I;
        f4Var2.setOnCraft(new o1(this, i12));
        if (this.Q0 == null) {
            kh.o5 o5Var = new kh.o5(this.currentAccount, K1.gift_id);
            this.Q0 = o5Var;
            o5Var.a();
        }
        f4Var3.setOnAddGift(new d3(this, K1, i12));
        f4Var3.setOnClose(new t1(this, 18));
        q2(4, true, null);
    }

    public final void X1(long j10) {
        ph.f3 f3Var = this.l1;
        if (f3Var != null) {
            f3Var.e(true);
            this.l1 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y1() {
        int i10;
        TLRPC.Message message;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i11;
        org.telegram.ui.Components.pa paVar;
        gg.p2 p2Var;
        int i12;
        TLRPC.Message message2;
        TLRPC.Message message3;
        ph.f3 f3Var = this.l1;
        if (f3Var != null) {
            f3Var.e(true);
            this.l1 = null;
        }
        MessageObject messageObject = this.B0;
        if (messageObject != null && (message3 = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_transfer_at;
                if (i10 <= ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                    Context context = getContext();
                    MessageObject messageObject2 = this.B0;
                    if (messageObject2 != null && (message2 = messageObject2.messageOwner) != null) {
                        TLRPC.MessageAction messageAction2 = message2.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            i12 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_transfer_at;
                            p2(i12 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, false);
                            return;
                        }
                    }
                    TL_stars.SavedStarGift savedStarGift = this.z0;
                    i12 = savedStarGift != null ? savedStarGift.can_transfer_at : 0;
                    p2(i12 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, false);
                    return;
                }
                TL_stars.SavedStarGift savedStarGift2 = this.z0;
                if (savedStarGift2 != null) {
                    TL_stars.StarGift starGift = savedStarGift2.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        i11 = savedStarGift2.can_export_at;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                        Context context2 = getContext();
                        int i13 = this.currentAccount;
                        gg.v2[] v2VarArr = {new gg.v2(context2, i13, BirthdayController.getInstance(i13).getState(), 3, this.resourcesProvider)};
                        gg.v2 v2Var = v2VarArr[0];
                        v2Var.w0 = LocaleController.getString(R.string.Gift2TransferShort);
                        paVar = v2Var.e;
                        if (paVar != null) {
                            paVar.setTitle(v2Var.y());
                        }
                        p2Var = v2Var.Y;
                        if (p2Var != null) {
                            p2Var.setText(v2Var.y());
                        }
                        int max = currentTime <= i11 ? 0 : Math.max(1, Math.round(Math.max(0, i11 - currentTime) / 86400.0f));
                        gg.v2 v2Var2 = v2VarArr[0];
                        v2Var2.B0 = true;
                        v2Var2.C0 = max;
                        v2Var2.h0(false, true);
                        gg.v2 v2Var3 = v2VarArr[0];
                        v2Var3.y0 = new h3(this, currentTime, i11, max, tL_starGiftUnique2, v2VarArr);
                        v2Var3.show();
                        return;
                    }
                }
                MessageObject messageObject3 = this.B0;
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
                        gg.v2[] v2VarArr2 = {new gg.v2(context22, i132, BirthdayController.getInstance(i132).getState(), 3, this.resourcesProvider)};
                        gg.v2 v2Var4 = v2VarArr2[0];
                        v2Var4.w0 = LocaleController.getString(R.string.Gift2TransferShort);
                        paVar = v2Var4.e;
                        if (paVar != null) {
                        }
                        p2Var = v2Var4.Y;
                        if (p2Var != null) {
                        }
                        if (currentTime2 <= i11) {
                        }
                        gg.v2 v2Var22 = v2VarArr2[0];
                        v2Var22.B0 = true;
                        v2Var22.C0 = max;
                        v2Var22.h0(false, true);
                        gg.v2 v2Var32 = v2VarArr2[0];
                        v2Var32.y0 = new h3(this, currentTime2, i11, max, tL_starGiftUnique22, v2VarArr2);
                        v2Var32.show();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        TL_stars.SavedStarGift savedStarGift3 = this.z0;
        i10 = savedStarGift3 != null ? savedStarGift3.can_transfer_at : 0;
        if (i10 <= ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z1(long j10, Utilities.Callback callback) {
        TLRPC.Message message;
        long j11;
        String str;
        TLRPC.Chat chat;
        TL_stars.SavedStarGift savedStarGift = this.z0;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            MessageObject messageObject = this.B0;
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
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
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
        linearLayout.addView(new h4(getContext(), K1, chat), k7.b6.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.j5, this.resourcesProvider, textView, 1, 16.0f);
        textView.setText(AndroidUtilities.replaceTags(j11 > 0 ? LocaleController.formatPluralStringComma("Gift2TransferPriceText", (int) j11, C1(), DialogObject.getShortName(j10)) : LocaleController.formatString(R.string.Gift2TransferText, C1(), str)));
        linearLayout.addView(textView, k7.b6.t(-1, -2, 48, 24, 4, 24, 4));
        sz0 sz0Var = new sz0(getContext(), this.resourcesProvider);
        q1(sz0Var, t7.l(K1.attributes, TL_stars.starGiftAttributeModel.class));
        q1(sz0Var, t7.l(K1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        q1(sz0Var, t7.l(K1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(K1.slug) && (K1.flags & 256) != 0) {
            sz0Var.c(LocaleController.getString(R.string.GiftValue2), vh.w2.e("~", BillingController.getInstance().formatCurrency(K1.value_amount, K1.value_currency, BillingController.getInstance().getCurrencyExp(K1.value_currency), true)), null, null);
        }
        linearLayout.addView(sz0Var, k7.b6.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(j11 > 0 ? ja.Q0(LocaleController.formatString(R.string.Gift2TransferDoPrice, Integer.valueOf((int) j11))) : LocaleController.getString(R.string.Gift2TransferDo), new gg.f(callback, 27));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.U0 = true;
        d2Var.show();
    }

    public final void a2() {
        TL_stars.InputSavedStarGift E1;
        long j10;
        long j11;
        long j12;
        boolean z4;
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        ph.f3 f3Var = this.l1;
        if (f3Var != null) {
            f3Var.e(true);
            this.l1 = null;
        }
        if (this.W0 == null && (E1 = E1()) != null) {
            MessageObject messageObject = this.B0;
            long j13 = this.U;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                    return;
                }
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                j11 = tL_messageActionStarGift.gift.id;
                j12 = tL_messageActionStarGift.upgrade_stars;
                z4 = tL_messageActionStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                z10 = (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? false : true;
                z11 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
                j10 = 0;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                z12 = tL_messageActionStarGift.prepaid_upgrade ? DialogObject.getPeerDialogId(tL_messageActionStarGift.from_id) != this.B0.getFromChatId() : tL_messageActionStarGift.upgrade_separate;
            } else {
                j10 = 0;
                TL_stars.SavedStarGift savedStarGift = this.z0;
                if (savedStarGift == null) {
                    return;
                }
                TL_stars.StarGift starGift = savedStarGift.gift;
                j11 = starGift.id;
                j12 = savedStarGift.upgrade_stars;
                z4 = (starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
                z10 = (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? false : true;
                z11 = j13 < 0;
                TL_stars.SavedStarGift savedStarGift2 = this.z0;
                str = savedStarGift2.prepaid_upgrade_hash;
                z12 = savedStarGift2.upgrade_separate;
            }
            TextView textView = this.t0;
            if (z4) {
                textView.setText(LocaleController.getString(z11 ? R.string.Gift2AddMyNameNameChannel : R.string.Gift2AddMyNameName));
            } else if (z10) {
                textView.setText(LocaleController.getString(R.string.Gift2AddSenderNameComment));
            } else {
                textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
            }
            boolean z13 = (z4 || j12 <= j10 || z12) ? false : true;
            kp kpVar = this.s0;
            kpVar.a(z13, false);
            ArrayList arrayList = this.e1;
            if (arrayList != null && (j12 > j10 || this.i1 != null)) {
                b2();
                return;
            }
            if (arrayList == null) {
                t7.y(this.currentAccount, false).K(j11, new y2(this, 1));
            }
            if (j12 > j10 || this.i1 != null) {
                return;
            }
            this.h1 = true;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = kpVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = E1;
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j13);
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            JSONObject p10 = rh.p2.p(this.resourcesProvider, false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new f3(this, 0));
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
    public final void b2() {
        long j10;
        boolean z4;
        boolean z10;
        int i10;
        char c3;
        int i11;
        String string;
        String string2;
        MessageObject messageObject = this.B0;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j10 = tL_messageActionStarGift.upgrade_stars;
            if (j10 <= 0) {
            }
            z4 = false;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.z0;
            if (savedStarGift == null) {
                return;
            }
            j10 = savedStarGift.upgrade_stars;
            if (j10 <= 0) {
            }
            z4 = false;
        }
        if (this.e1 != null) {
            if (j10 > 0 || this.i1 != null) {
                long j11 = 0;
                if (this.i1 != null) {
                    for (int i12 = 0; i12 < this.i1.invoice.prices.size(); i12++) {
                        j11 += this.i1.invoice.prices.get(i12).amount;
                    }
                }
                r4 r4Var = this.J0;
                c5 c5Var = this.b0;
                if (r4Var == null) {
                    this.J0 = new r4(c5Var);
                }
                r4 r4Var2 = this.J0;
                ArrayList arrayList = this.e1;
                c5 c5Var2 = r4Var2.a;
                ArrayList arrayList2 = r4Var2.g;
                ArrayList arrayList3 = r4Var2.f;
                ArrayList arrayList4 = r4Var2.e;
                int size = arrayList4.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList4.get(i13);
                    i13++;
                    ((p4) obj).a();
                }
                arrayList4.clear();
                arrayList3.clear();
                arrayList2.clear();
                ArrayList m9 = t7.m(arrayList, TL_stars.starGiftAttributeModel.class);
                int size2 = m9.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj2 = m9.get(i14);
                    i14++;
                    p4 p4Var = new p4(c5Var2.c, (TL_stars.starGiftAttributeModel) obj2);
                    if (c5Var2.isAttachedToWindow() && p4Var.c) {
                        p4Var.d.onAttachedToWindow();
                    }
                    arrayList4.add(p4Var);
                }
                ArrayList m10 = t7.m(arrayList, TL_stars.starGiftAttributeBackdrop.class);
                int size3 = m10.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj3 = m10.get(i15);
                    i15++;
                    arrayList3.add(new o4((TL_stars.starGiftAttributeBackdrop) obj3));
                }
                ArrayList m11 = t7.m(arrayList, TL_stars.starGiftAttributePattern.class);
                int size4 = m11.size();
                int i16 = 0;
                while (i16 < size4) {
                    Object obj4 = m11.get(i16);
                    i16++;
                    arrayList2.add(new q4((TL_stars.starGiftAttributePattern) obj4));
                }
                c5Var.setPreviewingAttributes(this.e1);
                TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = null;
                long j12 = this.U;
                if (z4) {
                    z10 = true;
                    c5Var.i(1, LocaleController.getString(R.string.Gift2PrepayUpgradeTitle), LocaleController.formatString(R.string.Gift2PrepayUpgradeText, DialogObject.getShortName(this.currentAccount, j12)), null);
                } else {
                    z10 = true;
                    c5Var.i(1, LocaleController.getString(R.string.Gift2UpgradeTitle), LocaleController.getString(R.string.Gift2UpgradeText), null);
                }
                ph.d dVar = this.g0;
                dVar.setFilled(z10);
                dVar.f(null, z10);
                if (j11 > 0) {
                    int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                    if (this.g1 != null) {
                        int i17 = 0;
                        while (true) {
                            if (i17 >= this.g1.size()) {
                                break;
                            }
                            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) this.g1.get(i17);
                            if (starGiftUpgradePrice2.date >= currentTime) {
                                starGiftUpgradePrice = starGiftUpgradePrice2;
                                break;
                            }
                            i17++;
                        }
                    }
                    ArrayList arrayList5 = this.f1;
                    FrameLayout frameLayout = this.j0;
                    if (arrayList5 == null || starGiftUpgradePrice == null || arrayList5.isEmpty()) {
                        frameLayout.setVisibility(8);
                    } else {
                        frameLayout.setVisibility(0);
                        this.i0.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("**" + LocaleController.getString(R.string.Gift2UpgradeCostsInfo) + "**", new t1(this, 0)), false, AndroidUtilities.dp(0.6666667f), AndroidUtilities.dp(0.66f)));
                    }
                    s2();
                    lq[] lqVarArr = this.j1;
                    if (z4) {
                        i10 = 1;
                        dVar.g(ja.R0(LocaleController.formatString(R.string.Gift2PrepayUpgradeButton, Long.valueOf(j11)), 1.13f, lqVarArr), true, true);
                    } else {
                        i10 = 1;
                        dVar.g(ja.R0(LocaleController.formatString(R.string.Gift2UpgradeButton, Long.valueOf(j11)), 1.13f, lqVarArr), true, true);
                    }
                } else {
                    i10 = 1;
                    dVar.g(LocaleController.getString(R.string.Confirm), true, true);
                }
                dVar.setOnClickListener(new l1(this, i10));
                View view = this.q0;
                LinearLayout linearLayout = this.r0;
                if (z4) {
                    linearLayout.setVisibility(8);
                    view.setVisibility(8);
                    c3 = 0;
                } else {
                    c3 = 0;
                    linearLayout.setVisibility(0);
                    view.setVisibility(0);
                }
                rh.i[] iVarArr = this.p0;
                if (z4) {
                    rh.i iVar = iVarArr[c3];
                    int i18 = R.drawable.menu_feature_unique;
                    String string3 = LocaleController.getString(R.string.Gift2UpgradeFeature1Title);
                    if (z4) {
                        int i19 = R.string.Gift2PrepayUpgradeFeature1Text;
                        i11 = 1;
                        Object[] objArr = new Object[1];
                        objArr[c3] = DialogObject.getShortName(this.currentAccount, j12);
                        string = LocaleController.formatString(i19, objArr);
                    } else {
                        i11 = 1;
                        string = LocaleController.getString(R.string.Gift2UpgradeFeature1Text);
                    }
                    iVar.a(string3, string, i18);
                    rh.i iVar2 = iVarArr[i11];
                    int i20 = R.drawable.menu_feature_transfer;
                    String string4 = LocaleController.getString(R.string.Gift2UpgradeFeature2Title);
                    if (z4) {
                        int i21 = R.string.Gift2PrepayUpgradeFeature2Text;
                        Object[] objArr2 = new Object[i11];
                        objArr2[0] = DialogObject.getShortName(this.currentAccount, j12);
                        string2 = LocaleController.formatString(i21, objArr2);
                    } else {
                        string2 = LocaleController.getString(R.string.Gift2UpgradeFeature2Text);
                    }
                    iVar2.a(string4, string2, i20);
                    iVarArr[2].a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), z4 ? LocaleController.formatString(R.string.Gift2PrepayUpgradeFeature3Text, DialogObject.getShortName(this.currentAccount, j12)) : LocaleController.getString(R.string.Gift2UpgradeFeature3Text), R.drawable.menu_feature_tradable);
                } else {
                    iVarArr[0].a(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
                    iVarArr[1].a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
                    iVarArr[2].a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
                }
                AndroidUtilities.runOnUIThread(new u1(this, j11, 0));
            }
        }
    }

    public final void c2(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final lf.b bVar, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z4, final kh.u0 u0Var) {
        this.g0.setLoading(true);
        if (u0Var != null && !u0Var.I) {
            u0Var.I = true;
            u0Var.E.h(true);
        }
        t7.x(this.currentAccount, bVar).H(tL_starGiftUnique, j10, tL_textWithEntities, z4, new Utilities.Callback() { // from class: lh.p1
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                g5.a1(g5.this, u0Var, bVar, tL_starGiftUnique, j10, tL_textWithEntities, z4, (TLRPC.TL_payments_paymentFormStarGift) obj);
            }
        });
    }

    @Override // org.telegram.ui.Components.sa, org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        if (this.V0.c(4)) {
            boolean z4 = this.b0.I.e0;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithTouchOutside() {
        if (this.V0.c(4) && this.b0.I.e0) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        if (this.V0.c(4) && this.b0.I.e0) {
            return false;
        }
        return super.canSwipeToBack(motionEvent);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (this.A0 == ((l7) objArr[1])) {
                f4 f4Var = this.b0.I;
                if (f4Var == null || !f4Var.e0) {
                    t2();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        if (this.V0.c(4) && this.b0.I.e0) {
            return;
        }
        kh.o5 o5Var = this.Q0;
        if (o5Var != null) {
            o5Var.b();
            this.Q0 = null;
        }
        r4 r4Var = this.J0;
        if (r4Var != null) {
            r4Var.a();
        }
        super.dismiss();
    }

    public final SpannableStringBuilder e2(TLRPC.Peer peer) {
        if (peer == null) {
            return null;
        }
        String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(peer)));
        if (TextUtils.isEmpty(publicUsername)) {
            return null;
        }
        return AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.Gift2ReleasedBy2, vh.w2.e("@", publicUsername)), new v2(this, publicUsername, 8));
    }

    public final SpannableStringBuilder f2(TL_stars.StarGift starGift) {
        if (starGift == null || (starGift instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return e2(starGift.released_by);
    }

    @Override // org.telegram.ui.ActionBar.g3, org.telegram.ui.ActionBar.l2
    public qc getBulletinFactory() {
        return new qc(this.l0, this.resourcesProvider);
    }

    public final void h2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, m7 m7Var) {
        r4 r4Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.C0 = str;
        this.D0 = tL_starGiftUnique;
        this.A0 = m7Var;
        this.E0 = (tL_starGiftUnique.resell_amount == null || N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) ? false : true;
        if (!this.K0 && (r4Var = this.J0) != null && r4Var.o && (tL_starGiftUnique2 = r4Var.l) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            r4Var.a();
            this.J0 = null;
            c5 c5Var = this.b0;
            c5Var.b.setAlpha(1.0f);
            c5Var.c.setAlpha(0.0f);
        }
        this.a0.b(this.currentAccount, this.z0);
        k2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        boolean z4 = tL_starGiftUnique.host_id != null;
        f90 f90Var = this.d0;
        if (!z4 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            f90Var.setVisibility(8);
        } else {
            f90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new v2(this, str3, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            f90Var.setVisibility(0);
            f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q5, this.resourcesProvider));
        }
        f90 f90Var2 = this.f0;
        if (z4 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            f90Var2.setVisibility(8);
        } else {
            f90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new v2(this, str3, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            f90Var2.setVisibility(0);
        }
        if (this.E0) {
            l2(tL_starGiftUnique);
            this.g0.setOnClickListener(new l1(this, 7));
        }
        if (this.Y0) {
            q2(0, false, null);
            this.c.n0(1);
            this.Y0 = false;
        }
        t2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:320:0x0345, code lost:
    
        if (O1(r55.currentAccount, org.telegram.messenger.DialogObject.getPeerDialogId(r1)) != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0356, code lost:
    
        if (r12 > 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0399, code lost:
    
        if (r36 == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x039b, code lost:
    
        if (r29 == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x039f, code lost:
    
        if (r26 <= 0) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x03a1, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.Gift2Info2OutUpgrade, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x03b3, code lost:
    
        if (r23 == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x03b5, code lost:
    
        if (r25 != false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x03b7, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.Gift2InfoOutPinned, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x03c3, code lost:
    
        if (r25 == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x03c5, code lost:
    
        r1 = "Gift2InfoOutConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x03ca, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatPluralStringComma(r1, (int) r2, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x03c8, code lost:
    
        r1 = "Gift2InfoOut";
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x03d7, code lost:
    
        if (r25 == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x03d9, code lost:
    
        if (r38 == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x03db, code lost:
    
        r1 = "Gift2InfoChannelConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x03e8, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatPluralStringComma(r1, (int) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x03de, code lost:
    
        r1 = "Gift2InfoConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x03e1, code lost:
    
        if (r38 == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x03e3, code lost:
    
        r1 = "Gift2Info3Channel";
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x03e6, code lost:
    
        r1 = "Gift2Info3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0397, code lost:
    
        if (r7 > 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
    
        if (r5.id != r10.id) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x040c  */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59, types: [org.telegram.ui.Components.lq[], org.telegram.ui.Components.rz0[], org.telegram.ui.Components.sc[]] */
    /* JADX WARN: Type inference failed for: r7v60 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i2(MessageObject messageObject, m7 m7Var) {
        boolean z4;
        boolean z10;
        TL_stars.StarGift starGift;
        TLRPC.Peer peer;
        TLRPC.Peer peer2;
        long j10;
        long j11;
        int i10;
        TLRPC.Peer peer3;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        String str;
        boolean z15;
        TLRPC.Peer peer4;
        TLRPC.Peer peer5;
        boolean z16;
        int i11;
        String formatString;
        String string;
        TLRPC.Peer peer6;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        String str2;
        char c3;
        CharSequence charSequence;
        int i12;
        CharSequence concat;
        sz0 sz0Var;
        TL_stars.StarGift starGift2;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        boolean z17;
        int i13;
        boolean z18;
        TL_stars.StarGift starGift3;
        TLRPC.Document document;
        TLRPC.TL_textWithEntities tL_textWithEntities4;
        TL_stars.StarGift starGift4;
        boolean z19;
        boolean z20;
        boolean z21;
        int i14;
        ?? r72;
        CharSequence charSequence2;
        String string2;
        SpannableStringBuilder replaceTags;
        r4 r4Var;
        String string3;
        boolean z22;
        TLObject userOrChat;
        r4 r4Var2;
        TL_stars.InputSavedStarGift E1;
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        boolean z23 = false;
        this.y0 = false;
        this.z0 = null;
        this.B0 = messageObject;
        this.A0 = m7Var;
        this.a0.set(messageObject);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        boolean z24 = messageObject.getDialogId() == clientUserId;
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        boolean z25 = messageAction instanceof TLRPC.TL_messageActionStarGift;
        int i15 = 3;
        c5 c5Var = this.b0;
        ph.d dVar = this.g0;
        if (z25 || (((z22 = messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) && (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift instanceof TL_stars.TL_starGift))) {
            if (!this.K0 && (r4Var = this.J0) != null && r4Var.o && r4Var.l != null) {
                r4Var.a();
                this.J0 = null;
                c5Var.b.setVisibility(0);
                c5Var.c.setVisibility(4);
            }
            boolean isOutOwner = messageObject.isOutOwner();
            if (z24) {
                isOutOwner = false;
            }
            TLRPC.Message message = messageObject.messageOwner;
            int i16 = message.date;
            TLRPC.MessageAction messageAction2 = message.action;
            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                boolean z26 = tL_messageActionStarGift.converted;
                boolean z27 = tL_messageActionStarGift.saved;
                boolean z28 = tL_messageActionStarGift.refunded;
                boolean z29 = tL_messageActionStarGift.name_hidden;
                TL_stars.StarGift starGift5 = tL_messageActionStarGift.gift;
                boolean z30 = tL_messageActionStarGift.can_upgrade;
                long j12 = tL_messageActionStarGift.convert_stars;
                j11 = tL_messageActionStarGift.upgrade_stars;
                TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_messageActionStarGift.message;
                TLRPC.Peer peer7 = tL_messageActionStarGift.from_id;
                TLRPC.Peer peer8 = tL_messageActionStarGift.peer;
                z14 = tL_messageActionStarGift.prepaid_upgrade;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                peer3 = tL_messageActionStarGift.auction_acquired ? tL_messageActionStarGift.to_id : null;
                i10 = tL_messageActionStarGift.gift_num;
                tL_textWithEntities = tL_textWithEntities5;
                peer2 = peer8;
                z13 = z30;
                z4 = z27;
                z11 = z29;
                peer = peer7;
                starGift = starGift5;
                j10 = j12;
                z12 = z26;
                z10 = z28;
            } else {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                z4 = tL_messageActionStarGiftUnique.saved;
                z10 = tL_messageActionStarGiftUnique.refunded;
                starGift = tL_messageActionStarGiftUnique.gift;
                peer = tL_messageActionStarGiftUnique.from_id;
                peer2 = tL_messageActionStarGiftUnique.peer;
                j10 = 0;
                j11 = 0;
                i10 = 0;
                peer3 = null;
                tL_textWithEntities = null;
                z11 = false;
                z12 = false;
                z13 = false;
                z14 = false;
                str = null;
            }
            long j13 = this.U;
            String shortName = DialogObject.getShortName(j13);
            z15 = z24;
            boolean z31 = isOutOwner;
            boolean isBot = UserObject.isBot(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j13)));
            boolean z32 = peer2 != null && DialogObject.getPeerDialogId(peer2) < 0;
            boolean P1 = P1(this.currentAccount, K1());
            F1();
            c5Var.f(starGift, false, false, P1);
            if (z15) {
                if (i10 == 0 || starGift.title == null) {
                    peer4 = peer3;
                    peer5 = peer;
                    z16 = z11;
                    string2 = LocaleController.getString(R.string.Gift2TitleSaved);
                } else {
                    StringBuilder sb = new StringBuilder();
                    peer4 = peer3;
                    sb.append(starGift.title);
                    sb.append(" #");
                    peer5 = peer;
                    z16 = z11;
                    string2 = kf.k0.l(i10, ',', sb);
                }
                this.P0 = string2;
                if (z10) {
                    replaceTags = null;
                } else if (z13) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfoUpgrade));
                } else if (j10 > 0) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z12 ? "Gift2SelfInfoConverted" : "Gift2SelfInfoConvert", (int) j10));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfo));
                }
                c5Var.i(0, string2, replaceTags, f2(starGift));
            } else {
                peer4 = peer3;
                peer5 = peer;
                z16 = z11;
                if (z32 && !this.y0) {
                    c5Var.i(0, LocaleController.getString(R.string.Gift2TitleProfile), null, f2(starGift));
                } else if ((z31 || z13) && j11 > 0) {
                    String string4 = LocaleController.getString(z31 ? R.string.Gift2TitleSent : R.string.Gift2TitleReceived);
                    this.P0 = string4;
                    if (z10) {
                        formatString = null;
                    } else if (z31) {
                        i11 = 0;
                        formatString = LocaleController.formatString(R.string.Gift2InfoFreeUpgrade, shortName);
                        c5Var.i(i11, string4, formatString, f2(starGift));
                    } else {
                        formatString = LocaleController.getString(R.string.Gift2InfoInFreeUpgrade);
                    }
                    i11 = 0;
                    c5Var.i(i11, string4, formatString, f2(starGift));
                } else {
                    if (i10 == 0 || starGift.title == null) {
                        string = LocaleController.getString(z31 ? R.string.Gift2TitleSent : R.string.Gift2TitleReceived);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(starGift.title);
                        sb2.append(" #");
                        string = kf.k0.l(i10, ',', sb2);
                    }
                    this.P0 = string;
                    if (z10) {
                        peer6 = peer5;
                        tL_textWithEntities2 = tL_textWithEntities;
                        concat = null;
                        i12 = 0;
                    } else {
                        if (!isBot && E1() != null) {
                            MessageObject messageObject2 = this.B0;
                            if (messageObject2 != null) {
                                TLRPC.MessageAction messageAction3 = messageObject2.messageOwner.action;
                                if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction3;
                                    boolean z33 = tL_messageActionStarGift2.peer != null;
                                    messageObject2.isOutOwner();
                                    this.B0.getDialogId();
                                    UserConfig.getInstance(this.currentAccount).getClientUserId();
                                    int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.B0.messageOwner.date);
                                    if (z33) {
                                        TLRPC.Peer peer9 = tL_messageActionStarGift2.peer;
                                        if (peer9 != null) {
                                            peer6 = peer5;
                                            tL_textWithEntities2 = tL_textWithEntities;
                                        }
                                    } else {
                                        peer6 = peer5;
                                        tL_textWithEntities2 = tL_textWithEntities;
                                    }
                                    if (!tL_messageActionStarGift2.converted) {
                                        if (tL_messageActionStarGift2.convert_stars > 0) {
                                        }
                                    }
                                    if (z31) {
                                        str2 = LocaleController.formatString((!z13 || j11 <= 0) ? R.string.Gift2Info2OutExpired : R.string.Gift2Info2OutUpgrade, shortName);
                                    } else {
                                        str2 = LocaleController.getString(!z4 ? z32 ? R.string.Gift2Info2ChannelKeep : R.string.Gift2Info2BotKeep : z32 ? R.string.Gift2Info2ChannelRemove : R.string.Gift2Info2BotRemove);
                                    }
                                }
                            } else {
                                peer6 = peer5;
                                tL_textWithEntities2 = tL_textWithEntities;
                                TL_stars.SavedStarGift savedStarGift = this.z0;
                                if (savedStarGift != null) {
                                    int currentTime2 = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
                                    if (O1(this.currentAccount, j13)) {
                                        int i17 = this.z0.flags;
                                        if (((j13 < 0 ? 2048 : 8) & i17) != 0) {
                                            if ((i17 & 16) != 0) {
                                                if ((i17 & 2) != 0) {
                                                }
                                            }
                                        }
                                    }
                                }
                                if (z31) {
                                }
                            }
                            SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(str2);
                            if (isBot && s1()) {
                                c3 = 1;
                                charSequence = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new t1(this, 6)), true);
                            } else {
                                c3 = 1;
                                charSequence = "";
                            }
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            i12 = 0;
                            charSequenceArr[0] = replaceTags2;
                            charSequenceArr[c3] = " ";
                            charSequenceArr[2] = charSequence;
                            concat = TextUtils.concat(charSequenceArr);
                        }
                        peer6 = peer5;
                        tL_textWithEntities2 = tL_textWithEntities;
                        if (z31) {
                        }
                        SpannableStringBuilder replaceTags22 = AndroidUtilities.replaceTags(str2);
                        if (isBot) {
                        }
                        c3 = 1;
                        charSequence = "";
                        CharSequence[] charSequenceArr2 = new CharSequence[3];
                        i12 = 0;
                        charSequenceArr2[0] = replaceTags22;
                        charSequenceArr2[c3] = " ";
                        charSequenceArr2[2] = charSequence;
                        concat = TextUtils.concat(charSequenceArr2);
                    }
                    c5Var.i(i12, string, concat, f2(starGift));
                    sz0Var = this.e0;
                    sz0Var.removeAllViews();
                    long peerDialogId = peer6 == null ? DialogObject.getPeerDialogId(peer6) : z31 ? clientUserId : j13;
                    if (peer2 == null) {
                        j13 = DialogObject.getPeerDialogId(peer2);
                    } else if (!z31) {
                        j13 = clientUserId;
                    }
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                    if (peer4 == null) {
                        long peerDialogId2 = DialogObject.getPeerDialogId(peer4);
                        starGift2 = starGift;
                        this.e0.j(LocaleController.getString(R.string.Gift2To), this.currentAccount, peerDialogId2, new u1(this, peerDialogId2, 4), null, z32 ? null : new u1(this, peerDialogId2, 5));
                    } else {
                        starGift2 = starGift;
                        if (peerDialogId != clientUserId || z14 || z32) {
                            this.e0.j(LocaleController.getString(R.string.Gift2From), this.currentAccount, peerDialogId, new u1(this, peerDialogId, 6), (peerDialogId == clientUserId || peerDialogId == UserObject.ANONYMOUS || UserObject.isDeleted(user) || isBot || z32) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), z32 ? null : new u1(this, peerDialogId, 7));
                        }
                        if (j13 != clientUserId || z32) {
                            this.e0.j(LocaleController.getString(R.string.Gift2To), this.currentAccount, j13, new u1(this, j13, 8), null, z32 ? null : new u1(this, j13, 9));
                        }
                    }
                    sz0Var.f(i16, LocaleController.getString(R.string.StarsTransactionDate));
                    if (starGift2.stars > 0) {
                        String string5 = LocaleController.getString(R.string.Gift2Value);
                        String l10 = kf.k0.l(starGift2.stars + j11, ',', new StringBuilder("⭐️ "));
                        if (!s1() || z10) {
                            r72 = 0;
                            charSequence2 = "";
                        } else {
                            r72 = 0;
                            charSequence2 = tc.b(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) j10), new t1(this, 4), this.resourcesProvider, null);
                        }
                        sz0Var.c(string5, ja.X0(false, TextUtils.concat(l10, " ", charSequence2), 0.8f, r72), r72, r72);
                    }
                    if (starGift2.limited && !z10) {
                        ja.F0(sz0Var, this.currentAccount, starGift2, this.resourcesProvider);
                    }
                    tL_textWithEntities3 = tL_textWithEntities2;
                    if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities3.text) && !z10) {
                        sz0Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
                    }
                    if (z31 && z13 && !z10) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                        if (this.X0 == null) {
                            i14 = 0;
                            this.X0 = new lq(0, new d5(dVar, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourcesProvider)));
                        } else {
                            i14 = 0;
                        }
                        spannableStringBuilder.setSpan(this.X0, i14, 1, 33);
                        spannableStringBuilder.append((CharSequence) (j11 > 0 ? LocaleController.getString(R.string.Gift2UpgradeButtonFree) : LocaleController.getString(R.string.Gift2UpgradeButtonGift)));
                        dVar.setFilled(true);
                        dVar.g(spannableStringBuilder, !this.Y0, true);
                        dVar.f(null, !this.Y0);
                        dVar.setOnClickListener(new l1(this, 11));
                    } else if (this.n0 || this.W == null || this.A0 == null || G1() < 0 || this.A0.b(G1()) < 0) {
                        if ((starGift2 instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(str)) {
                            z17 = true;
                            dVar.setFilled(true);
                            dVar.g(LocaleController.getString(R.string.OK), !this.Y0, true);
                            dVar.f(null, !this.Y0);
                            dVar.setOnClickListener(new l1(this, 9));
                        } else {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("^  ");
                            if (this.X0 == null) {
                                i13 = 0;
                                this.X0 = new lq(0, new d5(dVar, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourcesProvider)));
                            } else {
                                i13 = 0;
                            }
                            z17 = true;
                            spannableStringBuilder2.setSpan(this.X0, i13, 1, 33);
                            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                            dVar.setFilled(true);
                            dVar.g(spannableStringBuilder2, !this.Y0, true);
                            dVar.f(null, !this.Y0);
                            dVar.setOnClickListener(new l1(this, 8));
                        }
                        tL_textWithEntities4 = tL_textWithEntities3;
                        starGift4 = starGift2;
                        z19 = z4;
                        z20 = z10;
                        z23 = z12;
                        z21 = z31;
                    } else {
                        dVar.setFilled(false);
                        int b10 = this.A0.b(G1());
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                        Object obj = this.A0.get(b10);
                        if (!(obj instanceof TL_stars.SavedStarGift) || (starGift3 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift3.getDocument()) == null) {
                            z18 = true;
                        } else {
                            spannableStringBuilder3.append((CharSequence) " e");
                            z18 = true;
                            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.u5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                        }
                        dVar.g(spannableStringBuilder3, this.Y0 ^ z18, z18);
                        dVar.f(null, this.Y0 ^ z18);
                        dVar.setOnClickListener(new x1(this, b10, 2));
                    }
                    z17 = true;
                    tL_textWithEntities4 = tL_textWithEntities3;
                    starGift4 = starGift2;
                    z19 = z4;
                    z20 = z10;
                    z23 = z12;
                    z21 = z31;
                }
            }
            peer6 = peer5;
            tL_textWithEntities2 = tL_textWithEntities;
            sz0Var = this.e0;
            sz0Var.removeAllViews();
            if (peer6 == null) {
            }
            if (peer2 == null) {
            }
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
            if (peer4 == null) {
            }
            sz0Var.f(i16, LocaleController.getString(R.string.StarsTransactionDate));
            if (starGift2.stars > 0) {
            }
            if (starGift2.limited) {
                ja.F0(sz0Var, this.currentAccount, starGift2, this.resourcesProvider);
            }
            tL_textWithEntities3 = tL_textWithEntities2;
            if (tL_textWithEntities2 != null) {
                sz0Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
            }
            if (z31) {
            }
            if (this.n0) {
            }
            if (starGift2 instanceof TL_stars.TL_starGift) {
            }
            z17 = true;
            dVar.setFilled(true);
            dVar.g(LocaleController.getString(R.string.OK), !this.Y0, true);
            dVar.f(null, !this.Y0);
            dVar.setOnClickListener(new l1(this, 9));
            tL_textWithEntities4 = tL_textWithEntities3;
            starGift4 = starGift2;
            z19 = z4;
            z20 = z10;
            z23 = z12;
            z21 = z31;
        } else {
            if (!z22) {
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
                TLRPC.Peer peer10 = tL_messageActionStarGiftUnique2.from_id;
                userOrChat = messagesController.getUserOrChat(peer10 != null ? DialogObject.getPeerDialogId(peer10) : messageObject.getFromChatId());
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique2.gift;
            z20 = tL_messageActionStarGiftUnique2.refunded;
            k2(tL_starGiftUnique, z20, userOrChat, tL_messageActionStarGiftUnique2.message);
            boolean z34 = tL_messageActionStarGiftUnique2.saved;
            starGift4 = tL_messageActionStarGiftUnique2.gift;
            z21 = (tL_messageActionStarGiftUnique2.upgrade ^ true) == messageObject.isOutOwner();
            if (messageObject.getDialogId() == clientUserId) {
                z21 = false;
            }
            if (!this.H0 && !this.I0 && this.B0 != null && (E1 = E1()) != null) {
                this.H0 = true;
                t7.y(this.currentAccount, false).M(E1, new y2(this, i15));
            }
            if (this.K0 || (r4Var2 = this.J0) == null || !r4Var2.o || (r5 = r4Var2.l) == null) {
                z19 = z34;
            } else {
                if (starGift4 != null) {
                    z19 = z34;
                } else {
                    z19 = z34;
                }
                r4Var2.a();
                this.J0 = null;
                c5Var.b.setAlpha(1.0f);
                c5Var.c.setAlpha(0.0f);
            }
            tL_textWithEntities4 = null;
            peer4 = null;
            z15 = z24;
            z17 = true;
            z16 = false;
        }
        if (this.b1) {
            dVar.setFilled(z17);
            dVar.g(LocaleController.getString(R.string.GiftCraftButtonNext), false, z17);
            dVar.setOnClickListener(new l1(this, 10));
        }
        String str3 = starGift4 == null ? null : starGift4.owner_address;
        String str4 = starGift4 == null ? null : starGift4.gift_address;
        boolean z35 = (starGift4 == null || starGift4.host_id == null) ? false : true;
        f90 f90Var = this.d0;
        if (z20) {
            f90Var.setVisibility(0);
            f90Var.setText(LocaleController.getString(R.string.Gift2Refunded));
            f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, this.resourcesProvider));
        } else if (z35 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            f90Var.setVisibility(0);
            f90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new v2(this, str4, 5)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q5, this.resourcesProvider));
        } else if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && z16 && !z15) {
            f90Var.setVisibility(0);
            if (z21) {
                string3 = LocaleController.formatString((tL_textWithEntities4 == null || TextUtils.isEmpty(tL_textWithEntities4.text)) ? R.string.Gift2OutSenderHidden2 : R.string.Gift2OutSenderMessageHidden2, DialogObject.getShortName(messageObject.getDialogId()));
            } else {
                string3 = LocaleController.getString((tL_textWithEntities4 == null || TextUtils.isEmpty(tL_textWithEntities4.text)) ? R.string.Gift2InSenderHidden2 : R.string.Gift2InSenderMessageHidden2);
            }
            f90Var.setText(string3);
            f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q5, this.resourcesProvider));
        } else {
            f90Var.setVisibility(8);
        }
        f90 f90Var2 = this.f0;
        if (!z35 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            f90Var2.setVisibility(0);
            f90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new v2(this, str4, 6)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
        } else if (z23 || z20 || starGift4 == null || !N1(this.currentAccount, A1()) || peer4 != null) {
            f90Var2.setVisibility(8);
        } else {
            f90Var2.setVisibility(0);
            if (A1() >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (!z19) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new lq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(z19 ? R.string.Gift2ProfileVisible4 : R.string.Gift2ProfileInvisible4), new t1(this, 3)));
                f90Var2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder4, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                f90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(z19 ? R.string.Gift2ChannelProfileVisible3 : R.string.Gift2ChannelProfileInvisible3), new t1(this, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
        }
        if (this.Y0) {
            q2(0, false, null);
            this.c.n0(1);
            this.Y0 = false;
        }
        this.e.setTitle(this.P0);
        t2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32, types: [org.telegram.ui.Components.lq[], org.telegram.ui.Components.rz0[], org.telegram.ui.Components.sc[]] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v48, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v49 */
    public final void j2(TL_stars.SavedStarGift savedStarGift, m7 m7Var) {
        long j10;
        String string;
        int i10;
        CharSequence charSequence;
        String formatString;
        TL_stars.StarGift starGift;
        ?? r12;
        int i11;
        ?? r122;
        TL_stars.StarGift starGift2;
        TLRPC.Document document;
        String str;
        String str2;
        boolean z4;
        int i12;
        String string2;
        CharSequence replaceTags;
        TL_stars.StarGift starGift3;
        ?? r13;
        r4 r4Var;
        if (savedStarGift == null) {
            return;
        }
        int i13 = this.currentAccount;
        long j11 = this.U;
        this.y0 = N1(i13, j11);
        this.z0 = savedStarGift;
        this.A0 = m7Var;
        this.B0 = null;
        boolean z10 = this.K0;
        c5 c5Var = this.b0;
        if (!z10 && (r4Var = this.J0) != null && r4Var.o && r4Var.l != null) {
            r4Var.a();
            this.J0 = null;
            c5Var.b.setVisibility(0);
            c5Var.c.setVisibility(4);
        }
        this.a0.b(this.currentAccount, savedStarGift);
        String shortName = DialogObject.getShortName(j11);
        long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
        boolean isBot = UserObject.isBot(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)));
        int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        if ((savedStarGift.flags & 2) == 0) {
            peerDialogId = 2666000;
        }
        boolean z11 = j11 < 0;
        TLRPC.TL_textWithEntities tL_textWithEntities = savedStarGift.message;
        boolean z12 = savedStarGift.refunded;
        TL_stars.StarGift starGift4 = savedStarGift.gift;
        if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
            str = starGift4.owner_address;
            str2 = starGift4.gift_address;
            z4 = starGift4.host_id != null;
            k2((TL_stars.TL_starGiftUnique) starGift4, z12, !savedStarGift.name_hidden ? MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(savedStarGift.from_id)) : null, savedStarGift.message);
        } else {
            boolean z13 = this.y0 && clientUserId == peerDialogId && j11 >= 0;
            boolean P1 = P1(this.currentAccount, K1());
            F1();
            c5Var.f(starGift4, false, false, P1);
            sz0 sz0Var = this.e0;
            sz0Var.removeAllViews();
            CharSequence charSequence2 = "";
            if (z13) {
                if (savedStarGift.gift_num == 0 || (starGift3 = savedStarGift.gift) == null || starGift3.title == null) {
                    j10 = clientUserId;
                    string2 = LocaleController.getString(R.string.Gift2TitleSaved);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(savedStarGift.gift.title);
                    sb.append(" #");
                    j10 = clientUserId;
                    string2 = kf.k0.l(savedStarGift.gift_num, ',', sb);
                }
                this.P0 = string2;
                if (z12) {
                    replaceTags = null;
                } else if (savedStarGift.can_upgrade) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfoUpgrade));
                } else {
                    long j12 = savedStarGift.convert_stars;
                    replaceTags = j12 > 0 ? AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SelfInfoConvert", (int) j12)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfo));
                }
                c5Var.i(0, string2, replaceTags, f2(savedStarGift.gift));
            } else {
                j10 = clientUserId;
                if (!z11 || this.y0) {
                    boolean z14 = this.y0;
                    if ((!z14 || savedStarGift.can_upgrade) && savedStarGift.upgrade_stars > 0) {
                        String string3 = LocaleController.getString(z14 ? R.string.Gift2TitleReceived : R.string.Gift2TitleProfile);
                        this.P0 = string3;
                        c5Var.i(0, string3, (!z12 && this.y0) ? LocaleController.getString(R.string.Gift2InfoInFreeUpgrade) : null, f2(savedStarGift.gift));
                    } else {
                        if (savedStarGift.gift_num == 0 || (starGift = savedStarGift.gift) == null || starGift.title == null) {
                            string = LocaleController.getString(z14 ? R.string.Gift2TitleReceived : R.string.Gift2TitleProfile);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(savedStarGift.gift.title);
                            sb2.append(" #");
                            string = kf.k0.l(savedStarGift.gift_num, ',', sb2);
                        }
                        this.P0 = string;
                        if (z12 || !this.y0) {
                            i10 = 0;
                            charSequence = null;
                        } else {
                            if (isBot || !s1()) {
                                if (this.y0) {
                                    formatString = LocaleController.getString(savedStarGift.unsaved ? z11 ? R.string.Gift2Info2ChannelKeep : R.string.Gift2Info2BotKeep : z11 ? R.string.Gift2Info2ChannelRemove : R.string.Gift2Info2BotRemove);
                                } else {
                                    formatString = LocaleController.formatString((!savedStarGift.can_upgrade || savedStarGift.upgrade_stars <= 0) ? R.string.Gift2Info2OutExpired : R.string.Gift2Info2OutUpgrade, shortName);
                                }
                            } else if (this.y0) {
                                formatString = LocaleController.formatPluralStringComma(currentTime <= 0 ? z11 ? "Gift2Info2ChannelExpired" : "Gift2Info2Expired" : z11 ? "Gift2Info3Channel" : "Gift2Info3", (int) savedStarGift.convert_stars);
                            } else {
                                formatString = LocaleController.formatPluralStringComma("Gift2Info2Out", (int) savedStarGift.convert_stars, shortName);
                            }
                            i10 = 0;
                            charSequence = TextUtils.concat(AndroidUtilities.replaceTags(formatString), " ", (isBot || !s1()) ? charSequence2 : AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new t1(this, 1)), true));
                        }
                        c5Var.i(i10, string, charSequence, f2(savedStarGift.gift));
                    }
                } else {
                    String string4 = LocaleController.getString(R.string.Gift2TitleProfile);
                    this.P0 = string4;
                    c5Var.i(0, string4, null, e2(savedStarGift.gift.released_by));
                }
            }
            if (j10 != peerDialogId || z11) {
                this.e0.j(LocaleController.getString(R.string.Gift2From), this.currentAccount, peerDialogId, new u1(this, peerDialogId, 1), (peerDialogId == j10 || peerDialogId == UserObject.ANONYMOUS || isBot || UserObject.isDeleted(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId))) || z11) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), new u1(this, peerDialogId, 2));
            }
            sz0Var.c(LocaleController.getString(R.string.StarsTransactionDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(savedStarGift.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(savedStarGift.date * 1000))), null, null);
            String string5 = LocaleController.getString(R.string.Gift2Value);
            String l10 = kf.k0.l(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
            if (!s1() || z12) {
                r12 = 0;
            } else {
                r12 = 0;
                charSequence2 = tc.b(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) savedStarGift.convert_stars), new t1(this, 4), this.resourcesProvider, null);
            }
            sz0Var.c(string5, ja.X0(false, TextUtils.concat(l10, " ", charSequence2), 0.8f, r12), r12, r12);
            TL_stars.StarGift starGift5 = savedStarGift.gift;
            if (starGift5.limited && !z12) {
                ja.F0(sz0Var, this.currentAccount, starGift5, this.resourcesProvider);
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
            if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text) && !z12) {
                TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
                sz0Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
            }
            boolean z15 = this.y0;
            ph.d dVar = this.g0;
            if (z15 && savedStarGift.can_upgrade) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                if (this.X0 == null) {
                    i12 = 0;
                    this.X0 = new lq(0, new d5(dVar, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourcesProvider)));
                } else {
                    i12 = 0;
                }
                spannableStringBuilder.setSpan(this.X0, i12, 1, 33);
                spannableStringBuilder.append((CharSequence) (savedStarGift.upgrade_stars > 0 ? LocaleController.getString(R.string.Gift2UpgradeButtonFree) : LocaleController.getString(R.string.Gift2UpgradeButtonGift)));
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder, !this.Y0, true);
                dVar.f(null, !this.Y0);
                dVar.setOnClickListener(new l1(this, 3));
            } else if (this.n0 && z15 && this.W != null && this.A0 != null && G1() >= 0 && this.A0.b(G1()) >= 0) {
                dVar.setFilled(false);
                int b10 = this.A0.b(G1());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                Object obj = this.A0.get(b10);
                if (!(obj instanceof TL_stars.SavedStarGift) || (starGift2 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift2.getDocument()) == null) {
                    r122 = 1;
                } else {
                    spannableStringBuilder2.append((CharSequence) " e");
                    r122 = 1;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.u5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                }
                dVar.g(spannableStringBuilder2, (this.Y0 ? 1 : 0) ^ r122, r122);
                dVar.f(null, (this.Y0 ? 1 : 0) ^ r122);
                dVar.setOnClickListener(new x1(this, b10, r122));
            } else if (!(savedStarGift.gift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), !this.Y0, true);
                dVar.f(null, !this.Y0);
                dVar.setOnClickListener(new l1(this, 6));
            } else {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                if (this.X0 == null) {
                    i11 = 0;
                    this.X0 = new lq(0, new d5(dVar, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourcesProvider)));
                } else {
                    i11 = 0;
                }
                spannableStringBuilder3.setSpan(this.X0, i11, 1, 33);
                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder3, !this.Y0, true);
                dVar.f(null, !this.Y0);
                dVar.setOnClickListener(new l1(this, 5));
            }
            str = null;
            str2 = null;
            z4 = false;
        }
        boolean z16 = savedStarGift.refunded;
        f90 f90Var = this.d0;
        if (z16) {
            f90Var.setVisibility(0);
            f90Var.setText(LocaleController.getString(R.string.Gift2Refunded));
            f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, this.resourcesProvider));
        } else if (z4 && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            f90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new v2(this, str2, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            f90Var.setVisibility(0);
            f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q5, this.resourcesProvider));
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && this.y0 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
            f90Var.setVisibility(0);
            f90Var.setText(LocaleController.getString((tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? R.string.Gift2InSenderHidden2 : R.string.Gift2InSenderMessageHidden2));
            f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q5, this.resourcesProvider));
        } else {
            f90Var.setVisibility(8);
        }
        f90 f90Var2 = this.f0;
        if (!z4 && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            f90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new v2(this, str2, 2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            r13 = 0;
            f90Var2.setVisibility(0);
        } else if (this.y0 && N1(this.currentAccount, j11)) {
            if (j11 >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new lq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(!savedStarGift.unsaved ? R.string.Gift2ProfileVisible4 : R.string.Gift2ProfileInvisible4), new t1(this, 3)));
                f90Var2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder4, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                f90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(!savedStarGift.unsaved ? R.string.Gift2ChannelProfileVisible3 : R.string.Gift2ChannelProfileInvisible3), new t1(this, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
            r13 = 0;
            f90Var2.setVisibility(0);
        } else {
            r13 = 0;
            f90Var2.setVisibility(8);
        }
        if (this.Y0) {
            q2(r13, r13, null);
            this.c.n0(1);
            this.Y0 = r13;
        }
        this.e.setTitle(this.P0);
        t2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x04d4, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique) r4).drop_original_details_stars >= 0) goto L122;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x06ad  */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r3v14, types: [org.telegram.ui.Components.rz0[], org.telegram.ui.Components.sc[]] */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v76 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z4, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        c5 c5Var;
        long j10;
        CharSequence charSequence;
        CharSequence charSequence2;
        Spannable spannable;
        sz0 sz0Var;
        Class cls;
        ?? r13;
        sz0 sz0Var2;
        int i10;
        int i11;
        TL_stars.starGiftAttributeOriginalDetails stargiftattributeoriginaldetails;
        r4 r4Var;
        ph.d dVar;
        boolean z10;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        r4 r4Var2;
        t1 t1Var;
        t1 t1Var2;
        boolean z11;
        Object obj;
        Object obj2;
        Spannable spannable2;
        CharSequence formatSpannable;
        CharSequence formatSpannable2;
        TLRPC.Message message;
        MessageObject messageObject;
        sz0 sz0Var3;
        boolean z12;
        r4 r4Var3;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        long peerDialogId = DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
        long peerDialogId2 = DialogObject.getPeerDialogId(tL_starGiftUnique.host_id);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        this.P0 = kf.k0.l(tL_starGiftUnique.num, ',', sb);
        boolean z13 = this.K0;
        c5 c5Var2 = this.b0;
        if (z13 || (r4Var3 = this.J0) == null || !r4Var3.o || (tL_starGiftUnique2 = r4Var3.l) == null) {
            c5Var = c5Var2;
            j10 = peerDialogId;
        } else {
            j10 = peerDialogId;
            if (tL_starGiftUnique2.id != tL_starGiftUnique.id) {
                r4Var3.a();
                this.J0 = null;
                c5Var = c5Var2;
                c5Var.b.setAlpha(1.0f);
                c5Var.c.setAlpha(0.0f);
                long j11 = j10;
                boolean O1 = O1(this.currentAccount, j11);
                boolean O12 = O1(this.currentAccount, peerDialogId2);
                boolean P1 = P1(this.currentAccount, K1());
                F1();
                c5Var.f(tL_starGiftUnique, O1, O12, P1);
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) tL_starGiftUnique.title);
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) ("#" + LocaleController.formatNumber(tL_starGiftUnique.num, ',')));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                spannableStringBuilder.setSpan(new eu(190, 0), length, spannableStringBuilder.length(), 33);
                if (tLObject == null) {
                    charSequence2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UniqueGiftFrom, DialogObject.getShortName(tLObject)));
                } else if (tL_starGiftUnique.released_by != null || stargiftattributemodel == null) {
                    charSequence = null;
                    if (tL_textWithEntities != null) {
                        TextPaint textPaint = c5Var.D;
                        TextPaint textPaint2 = c5Var.D;
                        if (textPaint != null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                            MessageObject.addEntitiesToText(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false);
                            spannable = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder2, textPaint2.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint2.getFontMetricsInt());
                            c5 c5Var3 = c5Var;
                            c5Var3.h(0, spannableStringBuilder, charSequence, e2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                            boolean z14 = false;
                            boolean z15 = false;
                            boolean z16 = false;
                            ?? r32 = 0;
                            this.Z0 = null;
                            sz0 sz0Var4 = this.e0;
                            sz0Var4.removeAllViews();
                            int i12 = 22;
                            int i13 = 19;
                            if (!z4) {
                                sz0Var = sz0Var4;
                                cls = TL_stars.starGiftAttributeModel.class;
                            } else if (tL_starGiftUnique.host_id != null) {
                                if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                                    sz0Var4.m(LocaleController.getString(R.string.Gift2HostAddress), tL_starGiftUnique.owner_address, new t1(this, i13));
                                }
                                if (peerDialogId2 != 0) {
                                    cls = TL_stars.starGiftAttributeModel.class;
                                    z15 = false;
                                    this.Z0 = ((pz0) this.e0.l(LocaleController.getString(R.string.Gift2Host), this.currentAccount, peerDialogId2, new u1(this, peerDialogId2, 10)).getChildAt(1)).getChildAt(0);
                                } else {
                                    cls = TL_stars.starGiftAttributeModel.class;
                                }
                                sz0Var = sz0Var4;
                                z14 = z15;
                            } else {
                                cls = TL_stars.starGiftAttributeModel.class;
                                ?? r11 = 0;
                                z12 = false;
                                if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                                    sz0Var4.m(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_address, new t1(this, i12));
                                } else if (j11 == 0 && tL_starGiftUnique.owner_name != null) {
                                    sz0Var4.c(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_name, null, null);
                                } else if (j11 != 0) {
                                    r13 = 1;
                                    sz0Var2 = sz0Var4;
                                    this.Z0 = ((pz0) this.e0.l(LocaleController.getString(R.string.Gift2Owner), this.currentAccount, j11, new u1(this, j11, 11)).getChildAt(1)).getChildAt(0);
                                    p1(t7.l(tL_starGiftUnique.attributes, cls));
                                    p1(t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                                    p1(t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                    if (z4) {
                                        if (this.B0 == null) {
                                            i11 = 33;
                                            sz0Var2.c(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), r32, r32);
                                        } else if (this.G0) {
                                            i11 = 33;
                                            sz0Var2.c(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), r32, r32);
                                        } else {
                                            TextView textView = (TextView) ((pz0) sz0Var2.c(LocaleController.getString(R.string.Gift2Quantity), "", r32, r32).getChildAt(r13)).getChildAt(r11);
                                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x ");
                                            k90 k90Var = new k90(textView, AndroidUtilities.dp(90.0f), r11, this.resourcesProvider);
                                            int i14 = org.telegram.ui.ActionBar.j6.G6;
                                            k90Var.a(org.telegram.ui.ActionBar.j6.l1(0.21f, org.telegram.ui.ActionBar.j6.v0(i14, this.resourcesProvider)), org.telegram.ui.ActionBar.j6.l1(0.08f, org.telegram.ui.ActionBar.j6.v0(i14, this.resourcesProvider)));
                                            i11 = 33;
                                            spannableStringBuilder3.setSpan(k90Var, r11, r13, 33);
                                            textView.setText(spannableStringBuilder3, TextView.BufferType.SPANNABLE);
                                            if (!this.F0 && !this.G0 && (messageObject = this.B0) != null) {
                                                this.F0 = r13;
                                                int id2 = messageObject.getId();
                                                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                                tL_messages_getMessages.id.add(Integer.valueOf(id2));
                                                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new s1(this, id2, r11));
                                            }
                                        }
                                        if (TextUtils.isEmpty(tL_starGiftUnique.slug) || (tL_starGiftUnique.flags & 256) == 0) {
                                            i10 = 1;
                                        } else {
                                            i10 = 1;
                                            this.e0.e(LocaleController.getString(R.string.GiftValue2), vh.w2.e("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), LocaleController.getString(R.string.GiftValue2LearnMore), new androidx.car.app.utils.b(this, tL_starGiftUnique, BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency), 27), null);
                                        }
                                    } else {
                                        i10 = 1;
                                        i11 = 33;
                                    }
                                    stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                                    if (stargiftattributeoriginaldetails != null) {
                                        if ((stargiftattributeoriginaldetails.flags & i10) != 0) {
                                            long peerDialogId3 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.sender_id);
                                            SpannableString spannableString = new SpannableString(DialogObject.getName(peerDialogId3));
                                            spannableString.setSpan(new m3(this, peerDialogId3), r11, spannableString.length(), i11);
                                            obj = spannableString;
                                        } else {
                                            obj = null;
                                        }
                                        long peerDialogId4 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.recipient_id);
                                        SpannableString spannableString2 = new SpannableString(DialogObject.getName(peerDialogId4));
                                        spannableString2.setSpan(new n3(this, peerDialogId4), r11, spannableString2.length(), i11);
                                        if (stargiftattributeoriginaldetails.message != null) {
                                            TextPaint textPaint3 = new TextPaint(1);
                                            obj2 = spannableString2;
                                            textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
                                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                                            MessageObject.addEntitiesToText(spannableStringBuilder4, stargiftattributeoriginaldetails.message.entities, false, false, false, false);
                                            spannable2 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder4, textPaint3.getFontMetricsInt(), r11), stargiftattributeoriginaldetails.message.entities, textPaint3.getFontMetricsInt());
                                        } else {
                                            obj2 = spannableString2;
                                            spannable2 = null;
                                        }
                                        Spannable spannable3 = spannable2;
                                        String replaceAll = LocaleController.getInstance().getFormatterYear().format(stargiftattributeoriginaldetails.date * 1000).replaceAll("\\.", "/");
                                        if (stargiftattributeoriginaldetails.sender_id == stargiftattributeoriginaldetails.recipient_id) {
                                            if (spannable3 == null) {
                                                int i15 = R.string.Gift2AttributeOriginalDetailsSelf;
                                                Object[] objArr = new Object[2];
                                                objArr[r11] = obj;
                                                objArr[1] = replaceAll;
                                                formatSpannable = LocaleController.formatSpannable(i15, objArr);
                                            } else {
                                                int i16 = R.string.Gift2AttributeOriginalDetailsSelfComment;
                                                Object[] objArr2 = new Object[3];
                                                objArr2[r11] = obj;
                                                objArr2[1] = replaceAll;
                                                objArr2[2] = spannable3;
                                                formatSpannable = LocaleController.formatSpannable(i16, objArr2);
                                            }
                                        } else if (obj != null) {
                                            if (spannable3 == null) {
                                                int i17 = R.string.Gift2AttributeOriginalDetails;
                                                Object[] objArr3 = new Object[3];
                                                objArr3[r11] = obj;
                                                objArr3[1] = obj2;
                                                objArr3[2] = replaceAll;
                                                formatSpannable = LocaleController.formatSpannable(i17, objArr3);
                                            } else {
                                                int i18 = R.string.Gift2AttributeOriginalDetailsComment;
                                                Object[] objArr4 = new Object[4];
                                                objArr4[r11] = obj;
                                                objArr4[1] = obj2;
                                                objArr4[2] = replaceAll;
                                                objArr4[3] = spannable3;
                                                formatSpannable2 = LocaleController.formatSpannable(i18, objArr4);
                                                formatSpannable = formatSpannable2;
                                            }
                                        } else if (spannable3 == null) {
                                            int i19 = R.string.Gift2AttributeOriginalDetailsNoSender;
                                            Object[] objArr5 = new Object[2];
                                            objArr5[r11] = obj2;
                                            objArr5[1] = replaceAll;
                                            formatSpannable2 = LocaleController.formatSpannable(i19, objArr5);
                                            formatSpannable = formatSpannable2;
                                        } else {
                                            int i20 = R.string.Gift2AttributeOriginalDetailsNoSenderComment;
                                            Object[] objArr6 = new Object[3];
                                            objArr6[r11] = obj2;
                                            objArr6[1] = replaceAll;
                                            objArr6[2] = spannable3;
                                            formatSpannable = LocaleController.formatSpannable(i20, objArr6);
                                        }
                                        if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                                            TL_stars.SavedStarGift savedStarGift = this.z0;
                                            if (savedStarGift == null || savedStarGift.drop_original_details_stars < 0) {
                                                MessageObject messageObject2 = this.B0;
                                                if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
                                                    TLRPC.MessageAction messageAction = message.action;
                                                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                    }
                                                }
                                            }
                                            LinearLayout linearLayout = new LinearLayout(getContext());
                                            linearLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                                            linearLayout.setOrientation(r11);
                                            ih.s sVar = new ih.s(getContext());
                                            sVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.resourcesProvider));
                                            sVar.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, this.resourcesProvider));
                                            sVar.setTextSize(1, 12.0f);
                                            sVar.setGravity(3);
                                            sVar.setText(formatSpannable);
                                            linearLayout.addView(sVar, k7.b6.o(-1, -2, 1.0f, 19));
                                            ImageView imageView = new ImageView(getContext());
                                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                                            int i21 = org.telegram.ui.ActionBar.j6.Oh;
                                            imageView.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i21, this.resourcesProvider)), 6, 6));
                                            imageView.setImageResource(R.drawable.menu_delete_old);
                                            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i21, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
                                            k7.d6.a(imageView);
                                            imageView.setOnClickListener(new cg.n(22, this, formatSpannable));
                                            linearLayout.addView(imageView, k7.b6.p(32, 32, 0.0f, 21, 8, 0, 0, 0));
                                            TableRow tableRow = new TableRow(getContext());
                                            TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
                                            layoutParams.span = 2;
                                            tableRow.addView(new qz0(sz0Var2, linearLayout, true), layoutParams);
                                            sz0Var2.addView(tableRow);
                                        }
                                        qz0 a2 = sz0Var2.a(formatSpannable);
                                        a2.setFilled(true);
                                        ih.s sVar2 = (ih.s) a2.getChildAt(0);
                                        sVar2.setTextSize(1, 12.0f);
                                        sVar2.setGravity(17);
                                    }
                                    r4Var = this.J0;
                                    dVar = this.g0;
                                    if (r4Var != null || !r4Var.o) {
                                        if (!N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id)) || tL_starGiftUnique.resell_amount == null) {
                                            if (this.n0 || this.W == null || this.A0 == null || G1() < 0 || this.A0.b(G1()) < 0) {
                                                dVar.setFilled(true);
                                                dVar.g(LocaleController.getString(R.string.OK), !this.Y0, true);
                                                dVar.f(null, !this.Y0);
                                                dVar.setOnClickListener(new l1(this, 25));
                                            } else {
                                                dVar.setFilled(false);
                                                int b10 = this.A0.b(G1());
                                                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                                spannableStringBuilder5.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                                                Object obj3 = this.A0.get(b10);
                                                if (!(obj3 instanceof TL_stars.SavedStarGift) || (starGift = ((TL_stars.SavedStarGift) obj3).gift) == null || (document = starGift.getDocument()) == null) {
                                                    z10 = true;
                                                } else {
                                                    spannableStringBuilder5.append((CharSequence) " e");
                                                    z10 = true;
                                                    spannableStringBuilder5.setSpan(new org.telegram.ui.Components.u5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder5.length() - 1, spannableStringBuilder5.length(), 33);
                                                }
                                                dVar.g(spannableStringBuilder5, this.Y0 ^ z10, z10);
                                                dVar.f(null, this.Y0 ^ z10);
                                                dVar.setOnClickListener(new x1(this, b10, 3));
                                            }
                                            this.e.setTitle(this.P0);
                                            r4Var2 = this.J0;
                                            if (r4Var2 == null) {
                                                return;
                                            }
                                            boolean z17 = this.K0;
                                            t1 t1Var3 = new t1(this, 23);
                                            t1 t1Var4 = new t1(this, 20);
                                            ArrayList arrayList = r4Var2.f;
                                            c5 c5Var4 = r4Var2.a;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique3 = r4Var2.l;
                                            if (tL_starGiftUnique3 != null) {
                                                t1Var2 = t1Var4;
                                                t1Var = t1Var3;
                                                if (tL_starGiftUnique3.id == tL_starGiftUnique.id) {
                                                    z11 = r4Var2.o;
                                                    if (z11) {
                                                        return;
                                                    }
                                                    c5Var3.b.setAlpha(0.0f);
                                                    c5Var3.c.setAlpha(1.0f);
                                                    dVar.g(LocaleController.getString(R.string.GiftSkipAnimation), true, true);
                                                    dVar.setFilled(true);
                                                    dVar.setOnClickListener(new l1(this, 23));
                                                    int length2 = ((g5) this.N0.d).M0.length - 1;
                                                    rl0 rl0Var = this.d;
                                                    rl0Var.u0(length2);
                                                    rl0Var.post(new t1(this, 21));
                                                    return;
                                                }
                                            } else {
                                                t1Var = t1Var3;
                                                t1Var2 = t1Var4;
                                            }
                                            if (z17) {
                                                org.telegram.ui.Components.p9 upgradeImageView = c5Var4.getUpgradeImageView();
                                                u4 u4Var = c5Var4.c;
                                                TL_stars.starGiftAttributeModel upgradeImageViewAttribute = c5Var4.getUpgradeImageViewAttribute();
                                                TL_stars.starGiftAttributePattern upgradePatternAttribute = c5Var4.getUpgradePatternAttribute();
                                                TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute = c5Var4.getUpgradeBackdropAttribute();
                                                TL_stars.starGiftAttributeModel stargiftattributemodel2 = (TL_stars.starGiftAttributeModel) t7.l(tL_starGiftUnique.attributes, cls);
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                                                r4Var2.o = true;
                                                r4Var2.l = tL_starGiftUnique;
                                                r4Var2.r = t1Var;
                                                r4Var2.s = t1Var2;
                                                r4Var2.t = (float) Math.random();
                                                r4Var2.m = System.currentTimeMillis();
                                                r4Var2.n = 0.0f;
                                                r4Var2.p = false;
                                                r4Var2.q = false;
                                                r4Var2.o = true;
                                                n4 n4Var = r4Var2.h;
                                                if (n4Var != null) {
                                                    n4Var.a();
                                                }
                                                p4 p4Var = new p4(u4Var, stargiftattributemodel2);
                                                if (u4Var.isAttachedToWindow() && p4Var.c) {
                                                    p4Var.d.onAttachedToWindow();
                                                }
                                                r4Var2.h = new n4(new l4(r4Var2, 0), r4Var2.e, new p4(upgradeImageView, upgradeImageViewAttribute), p4Var, 0.9f, r4Var2.t > 0.5f ? 3 : 2);
                                                n4 n4Var2 = r4Var2.i;
                                                if (n4Var2 != null) {
                                                    n4Var2.a();
                                                }
                                                r4Var2.i = new n4(new l4(r4Var2, 0), r4Var2.g, new q4(upgradePatternAttribute), new q4(stargiftattributepattern), 1.0f, r4Var2.t > 0.5f ? 2 : 1);
                                                n4 n4Var3 = r4Var2.j;
                                                if (n4Var3 != null) {
                                                    n4Var3.a();
                                                }
                                                r4Var2.j = new n4(new l4(r4Var2, 0), arrayList, new o4(upgradeBackdropAttribute), new o4(stargiftattributebackdrop), 0.5f, r4Var2.t > 0.5f ? 2 : 1);
                                                n4 n4Var4 = r4Var2.k;
                                                if (n4Var4 != null) {
                                                    n4Var4.a();
                                                }
                                                r4Var2.k = new n4(new l4(r4Var2, 0), arrayList, new o4(upgradeBackdropAttribute), new o4(stargiftattributebackdrop), 1.25f, r4Var2.t > 0.5f ? 2 : 1);
                                                r4Var2.b();
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            if (z11) {
                                            }
                                        } else {
                                            dVar.setFilled(true);
                                            l2(tL_starGiftUnique);
                                            dVar.setOnClickListener(new l1(this, 24));
                                        }
                                    }
                                    this.e.setTitle(this.P0);
                                    r4Var2 = this.J0;
                                    if (r4Var2 == null) {
                                    }
                                }
                                sz0Var3 = sz0Var4;
                                r13 = 1;
                                r32 = z16;
                                r11 = z12;
                                sz0Var2 = sz0Var3;
                                p1(t7.l(tL_starGiftUnique.attributes, cls));
                                p1(t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                                p1(t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                if (z4) {
                                }
                                stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                                if (stargiftattributeoriginaldetails != null) {
                                }
                                r4Var = this.J0;
                                dVar = this.g0;
                                if (r4Var != null) {
                                }
                                if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                                }
                                if (this.n0) {
                                }
                                dVar.setFilled(true);
                                dVar.g(LocaleController.getString(R.string.OK), !this.Y0, true);
                                dVar.f(null, !this.Y0);
                                dVar.setOnClickListener(new l1(this, 25));
                                this.e.setTitle(this.P0);
                                r4Var2 = this.J0;
                                if (r4Var2 == null) {
                                }
                            }
                            z12 = false;
                            z16 = z14;
                            sz0Var3 = sz0Var;
                            r13 = 1;
                            r32 = z16;
                            r11 = z12;
                            sz0Var2 = sz0Var3;
                            p1(t7.l(tL_starGiftUnique.attributes, cls));
                            p1(t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                            p1(t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                            if (z4) {
                            }
                            stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                            if (stargiftattributeoriginaldetails != null) {
                            }
                            r4Var = this.J0;
                            dVar = this.g0;
                            if (r4Var != null) {
                            }
                            if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                            }
                            if (this.n0) {
                            }
                            dVar.setFilled(true);
                            dVar.g(LocaleController.getString(R.string.OK), !this.Y0, true);
                            dVar.f(null, !this.Y0);
                            dVar.setOnClickListener(new l1(this, 25));
                            this.e.setTitle(this.P0);
                            r4Var2 = this.J0;
                            if (r4Var2 == null) {
                            }
                        }
                    }
                    spannable = null;
                    c5 c5Var32 = c5Var;
                    c5Var32.h(0, spannableStringBuilder, charSequence, e2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                    boolean z142 = false;
                    boolean z152 = false;
                    boolean z162 = false;
                    ?? r322 = 0;
                    this.Z0 = null;
                    sz0 sz0Var42 = this.e0;
                    sz0Var42.removeAllViews();
                    int i122 = 22;
                    int i132 = 19;
                    if (!z4) {
                    }
                    z12 = false;
                    z162 = z142;
                    sz0Var3 = sz0Var;
                    r13 = 1;
                    r322 = z162;
                    r11 = z12;
                    sz0Var2 = sz0Var3;
                    p1(t7.l(tL_starGiftUnique.attributes, cls));
                    p1(t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                    p1(t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    if (z4) {
                    }
                    stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                    if (stargiftattributeoriginaldetails != null) {
                    }
                    r4Var = this.J0;
                    dVar = this.g0;
                    if (r4Var != null) {
                    }
                    if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                    }
                    if (this.n0) {
                    }
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), !this.Y0, true);
                    dVar.f(null, !this.Y0);
                    dVar.setOnClickListener(new l1(this, 25));
                    this.e.setTitle(this.P0);
                    r4Var2 = this.J0;
                    if (r4Var2 == null) {
                    }
                } else {
                    charSequence2 = stargiftattributemodel.name;
                }
                charSequence = charSequence2;
                if (tL_textWithEntities != null) {
                }
                spannable = null;
                c5 c5Var322 = c5Var;
                c5Var322.h(0, spannableStringBuilder, charSequence, e2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                boolean z1422 = false;
                boolean z1522 = false;
                boolean z1622 = false;
                ?? r3222 = 0;
                this.Z0 = null;
                sz0 sz0Var422 = this.e0;
                sz0Var422.removeAllViews();
                int i1222 = 22;
                int i1322 = 19;
                if (!z4) {
                }
                z12 = false;
                z1622 = z1422;
                sz0Var3 = sz0Var;
                r13 = 1;
                r3222 = z1622;
                r11 = z12;
                sz0Var2 = sz0Var3;
                p1(t7.l(tL_starGiftUnique.attributes, cls));
                p1(t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                p1(t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                if (z4) {
                }
                stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                if (stargiftattributeoriginaldetails != null) {
                }
                r4Var = this.J0;
                dVar = this.g0;
                if (r4Var != null) {
                }
                if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                }
                if (this.n0) {
                }
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), !this.Y0, true);
                dVar.f(null, !this.Y0);
                dVar.setOnClickListener(new l1(this, 25));
                this.e.setTitle(this.P0);
                r4Var2 = this.J0;
                if (r4Var2 == null) {
                }
            } else {
                c5Var = c5Var2;
            }
        }
        if (z13 && this.J0 == null) {
            this.J0 = new r4(c5Var);
        }
        long j112 = j10;
        boolean O13 = O1(this.currentAccount, j112);
        boolean O122 = O1(this.currentAccount, peerDialogId2);
        boolean P12 = P1(this.currentAccount, K1());
        F1();
        c5Var.f(tL_starGiftUnique, O13, O122, P12);
        TL_stars.starGiftAttributeModel stargiftattributemodel3 = (TL_stars.starGiftAttributeModel) t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
        spannableStringBuilder6.append((CharSequence) tL_starGiftUnique.title);
        spannableStringBuilder6.append((CharSequence) " ");
        int length3 = spannableStringBuilder6.length();
        spannableStringBuilder6.append((CharSequence) ("#" + LocaleController.formatNumber(tL_starGiftUnique.num, ',')));
        spannableStringBuilder6.setSpan(new RelativeSizeSpan(0.85f), length3, spannableStringBuilder6.length(), 33);
        spannableStringBuilder6.setSpan(new eu(190, 0), length3, spannableStringBuilder6.length(), 33);
        if (tLObject == null) {
        }
        charSequence = charSequence2;
        if (tL_textWithEntities != null) {
        }
        spannable = null;
        c5 c5Var3222 = c5Var;
        c5Var3222.h(0, spannableStringBuilder6, charSequence, e2(tL_starGiftUnique.released_by), null, tLObject, spannable);
        boolean z14222 = false;
        boolean z15222 = false;
        boolean z16222 = false;
        ?? r32222 = 0;
        this.Z0 = null;
        sz0 sz0Var4222 = this.e0;
        sz0Var4222.removeAllViews();
        int i12222 = 22;
        int i13222 = 19;
        if (!z4) {
        }
        z12 = false;
        z16222 = z14222;
        sz0Var3 = sz0Var;
        r13 = 1;
        r32222 = z16222;
        r11 = z12;
        sz0Var2 = sz0Var3;
        p1(t7.l(tL_starGiftUnique.attributes, cls));
        p1(t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
        p1(t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
        if (z4) {
        }
        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
        if (stargiftattributeoriginaldetails != null) {
        }
        r4Var = this.J0;
        dVar = this.g0;
        if (r4Var != null) {
        }
        if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
        }
        if (this.n0) {
        }
        dVar.setFilled(true);
        dVar.g(LocaleController.getString(R.string.OK), !this.Y0, true);
        dVar.f(null, !this.Y0);
        dVar.setOnClickListener(new l1(this, 25));
        this.e.setTitle(this.P0);
        r4Var2 = this.J0;
        if (r4Var2 == null) {
        }
    }

    public final void l2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        lf.a resellAmount = tL_starGiftUnique.getResellAmount(lf.b.a);
        boolean z4 = tL_starGiftUnique.resale_ton_only;
        ph.d dVar = this.g0;
        if (!z4) {
            dVar.g(ja.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a())), !this.Y0, true);
            dVar.f(null, !this.Y0);
        } else {
            dVar.g(ja.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(lf.b.b).d()), true), !this.Y0, true);
            dVar.f(ja.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a())), !this.Y0);
        }
    }

    public final void m2() {
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        TLRPC.Peer peer = K1.owner_id;
        if (peer == null) {
            peer = K1.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb = new StringBuilder();
        sb.append(K1.title);
        sb.append(" #");
        this.w0.setText(LocaleController.formatString(R.string.Gift2WearTitle, kf.k0.l(K1.num, ',', sb)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.R0 == null) {
                this.R0 = new lq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.R0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        ph.d dVar = this.g0;
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new l1(this, 21));
        this.b0.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        q2(2, false, null);
        this.u0 = true;
    }

    public final void n2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique K1 = K1();
        TL_stars.InputSavedStarGift E1 = E1();
        if (E1 == null || K1 == null) {
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
        tL_inputInvoiceStarGiftDropOriginalDetails.stargift = E1;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        JSONObject p10 = rh.p2.p(this.resourcesProvider, false);
        if (p10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = p10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new kh.b1(this, charSequence, K1, tL_inputInvoiceStarGiftDropOriginalDetails, 1));
    }

    public final void o2(View view, CharSequence charSequence, boolean z4) {
        Layout layout;
        float primaryHorizontal;
        ph.f3 f3Var = this.l1;
        if ((f3Var != null && f3Var.S && this.m1 == view) || view == null) {
            return;
        }
        if (!z4) {
            if (view instanceof TextView) {
                layout = ((TextView) view).getLayout();
            } else if (!(view instanceof org.telegram.ui.ActionBar.k5)) {
                return;
            } else {
                layout = ((org.telegram.ui.ActionBar.k5) view).getLayout();
            }
            if (layout == null) {
                return;
            }
            CharSequence text = layout.getText();
            if (!(text instanceof Spanned)) {
                return;
            }
            Spanned spanned = (Spanned) text;
            tc[] tcVarArr = (tc[]) spanned.getSpans(0, spanned.length(), tc.class);
            if (tcVarArr == null || tcVarArr.length <= 0) {
                return;
            }
            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(tcVarArr[tcVarArr.length - 1])) + view.getPaddingLeft() + (r5.a() / 2.0f);
        } else {
            if (!(view instanceof org.telegram.ui.ActionBar.k5)) {
                return;
            }
            org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) view;
            primaryHorizontal = (k5Var.getRightDrawableWidth() / 2.0f) + k5Var.getRightDrawableX();
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        dg.s1 s1Var = this.V;
        s1Var.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        ph.f3 f3Var2 = this.l1;
        if (f3Var2 != null) {
            f3Var2.e(true);
            this.l1 = null;
        }
        ph.f3 f3Var3 = new ph.f3(getContext(), 3);
        f3Var3.p(!z4);
        f3Var3.s(charSequence);
        f3Var3.m(0.0f, (iArr[0] + primaryHorizontal) - (AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft));
        f3Var3.setTranslationY(((iArr[1] - AndroidUtilities.dp(100.0f)) - (view.getHeight() / 2.0f)) + AndroidUtilities.dp((z4 ? 18 : 0) + 4.33f));
        f3Var3.d = 3000L;
        f3Var3.setPadding(AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0);
        f3Var3.i0 = new kh.w(f3Var3, 1);
        f3Var3.u();
        s1Var.addView(f3Var3, k7.b6.c(100.0f, -1));
        this.l1 = f3Var3;
        this.m1 = view;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void onBackPressed() {
        c5 c5Var;
        f4 f4Var;
        if (this.V0.c(4) && (c5Var = this.b0) != null && (f4Var = c5Var.I) != null) {
            if (f4Var.e0) {
                return;
            }
            if (f4Var.f0) {
                super.onBackPressed();
                return;
            }
        }
        if (this.u0 || this.V0.b <= 0 || this.g0.K || this.d1) {
            super.onBackPressed();
            return;
        }
        MessageObject messageObject = this.B0;
        if (messageObject != null) {
            i2(messageObject, null);
        } else {
            TL_stars.SavedStarGift savedStarGift = this.z0;
            if (savedStarGift != null) {
                j2(savedStarGift, this.A0);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.D0;
                if (tL_starGiftUnique != null) {
                    h2(this.C0, tL_starGiftUnique, this.A0);
                }
            }
        }
        q2(0, true, null);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onSwipeStarts() {
        ph.f3 f3Var = this.l1;
        if (f3Var != null) {
            f3Var.e(true);
            this.l1 = null;
        }
    }

    public final void p1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        char c3;
        r4 r4Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        g5 g5Var;
        androidx.car.app.utils.c cVar;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            string = LocaleController.getString(R.string.Gift2AttributeModel);
            c3 = 2;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            string = LocaleController.getString(R.string.Gift2AttributeSymbol);
            c3 = 1;
        } else {
            if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
                return;
            }
            string = LocaleController.getString(R.string.Gift2AttributeBackdrop);
            c3 = 0;
        }
        if (!this.K0 && ((r4Var = this.J0) == null || !r4Var.o)) {
            boolean[] zArr = new boolean[1];
            sc[] scVarArr = new sc[1];
            Integer[] numArr = new Integer[1];
            String J1 = J1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                cVar = new androidx.car.app.utils.c(this, zArr, starGiftAttribute2, scVarArr, 7);
                g5Var = this;
            } else {
                starGiftAttribute2 = starGiftAttribute;
                g5Var = this;
                cVar = null;
            }
            scVarArr[0] = (sc) ((pz0) g5Var.e0.e(string, starGiftAttribute2.name, J1, cVar, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        w4 w4Var = new w4(getContext(), this.resourcesProvider, new o1(this, 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        sz0 sz0Var = this.e0;
        tableRow.addView(new rz0(sz0Var, string), layoutParams);
        tableRow.addView(new pz0(sz0Var, w4Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        sz0Var.addView(tableRow);
        r4 r4Var2 = this.J0;
        if (r4Var2 != null) {
            if (c3 == 0) {
                r4Var2.d = w4Var;
            }
            if (c3 == 1) {
                r4Var2.c = w4Var;
            }
            if (c3 == 2) {
                r4Var2.b = w4Var;
            }
        }
    }

    public final void p2(int i10, Context context, boolean z4) {
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(64.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourcesProvider)));
        f10.addView(frameLayout, k7.b6.t(64, 64, 49, 0, 6, 0, 0));
        jj0 jj0Var = new jj0(context);
        jj0Var.setScaleType(ImageView.ScaleType.CENTER);
        jj0Var.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView(jj0Var, k7.b6.q(64, 64, 17));
        jj0Var.d();
        TextView b10 = k7.f6.b(context, 20.0f, org.telegram.ui.ActionBar.j6.G6, true, null);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(z4 ? R.string.Gift2ResellTimeoutTitle : R.string.Gift2TransferTimeoutTitle));
        f10.addView(b10, k7.b6.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = k7.f6.b(context, 14.0f, org.telegram.ui.ActionBar.j6.F6, false, null);
        b11.setGravity(17);
        b11.setText(LocaleController.formatString(z4 ? R.string.Gift2ResellTimeout : R.string.Gift2TransferTimeout, LocaleController.formatTTLString(Math.max(10, i10))));
        f10.addView(b11, k7.b6.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, this.resourcesProvider);
        alertDialog$Builder.n(f10);
        kf.k0.C(R.string.OK, alertDialog$Builder, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q2(int i10, boolean z4, jh.f fVar) {
        int i11;
        ph.f3 f3Var;
        r4 r4Var;
        ValueAnimator valueAnimator = this.W0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.W0 = null;
        }
        c5 c5Var = this.b0;
        if (i10 != 1) {
            AndroidUtilities.cancelRunOnUIThread(c5Var.f0);
        }
        if (!this.Y0) {
            this.U0 = Float.valueOf(this.V.d());
        }
        c5.d dVar = this.V0;
        this.V0 = new c5.d(dVar == null ? 0 : dVar.b, i10);
        eg.g gVar = this.N0;
        int finalHeight = c5Var.getFinalHeight();
        int z12 = z1();
        if (this.V0.d(1)) {
            FrameLayout frameLayout = this.j0;
            if (frameLayout.getVisibility() == 0) {
                i11 = frameLayout.getMeasuredHeight();
                gVar.F(finalHeight, z12 + i11);
                if (this.V0.b == 0 && (r4Var = this.J0) != null) {
                    r4Var.c();
                }
                p3 p3Var = this.x0;
                p3 p3Var2 = this.v0;
                p3 p3Var3 = this.o0;
                p3 p3Var4 = this.c0;
                if (z4) {
                    this.V0.c = 1.0f;
                    T1();
                    p3Var4.setVisibility(i10 == 0 ? 0 : 8);
                    p3Var3.setVisibility(i10 == 1 ? 0 : 8);
                    p3Var2.setVisibility(i10 == 2 ? 0 : 8);
                    p3Var.setVisibility(i10 != 3 ? 8 : 0);
                    s2();
                    if (fVar != null) {
                        fVar.run();
                    }
                } else {
                    p3Var4.setVisibility(this.V0.b(0) ? 0 : 8);
                    p3Var3.setVisibility(this.V0.b(1) ? 0 : 8);
                    p3Var2.setVisibility(this.V0.b(2) ? 0 : 8);
                    p3Var.setVisibility(this.V0.b(3) ? 0 : 8);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.W0 = ofFloat;
                    ofFloat.addUpdateListener(new dg.o1(this, 11));
                    this.W0.addListener(new k3(this, i10, fVar, r5));
                    this.W0.setInterpolator(mr.h);
                    this.W0.setDuration(320L);
                    this.W0.start();
                    c5.d dVar2 = this.V0;
                    org.telegram.ui.Components.p9[] p9VarArr = c5Var.d;
                    int i12 = dVar2.a;
                    int i13 = dVar2.b;
                    if (i12 != i13) {
                        gj0 lottieAnimation = p9VarArr[i12].getImageReceiver().getLottieAnimation();
                        gj0 lottieAnimation2 = p9VarArr[i13].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.Q(lottieAnimation.r(), false);
                        }
                    }
                }
                f3Var = this.l1;
                if (f3Var == null) {
                    f3Var.e(true);
                    this.l1 = null;
                    return;
                }
                return;
            }
        }
        i11 = 0;
        gVar.F(finalHeight, z12 + i11);
        if (this.V0.b == 0) {
            r4Var.c();
        }
        p3 p3Var5 = this.x0;
        p3 p3Var22 = this.v0;
        p3 p3Var32 = this.o0;
        p3 p3Var42 = this.c0;
        if (z4) {
        }
        f3Var = this.l1;
        if (f3Var == null) {
        }
    }

    public final void r1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            t7.y(this.currentAccount, false).Q(A1());
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
            t7.y(this.currentAccount, false).Q(A1());
            dismiss();
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.z0;
        if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                this.K0 = true;
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                TL_stars.SavedStarGift savedStarGift2 = this.z0;
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
                j2(savedStarGift2, this.A0);
                this.e1 = null;
                this.K0 = false;
                m7 m7Var = this.A0;
                if (m7Var != null) {
                    m7Var.d();
                } else {
                    t7.y(this.currentAccount, false).Q(this.U);
                }
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
        }
        if (this.A0 == null) {
            t7.y(this.currentAccount, false).Q(A1());
        }
        this.K0 = true;
        this.z0 = null;
        this.y0 = false;
        MessageObject messageObject = new MessageObject(this.currentAccount, message, false, false);
        messageObject.setType();
        i2(messageObject, this.A0);
        this.e1 = null;
        this.K0 = false;
        AndroidUtilities.runOnUIThread(runnable);
    }

    public final void r2(boolean z4) {
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", 3).apply();
        boolean P1 = P1(this.currentAccount, K1());
        boolean z10 = !P1;
        boolean P12 = P1(this.currentAccount, K1());
        ph.d dVar = this.g0;
        if (P12) {
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(A1(), new TLRPC.TL_emojiStatusEmpty(), null);
        } else {
            final long A1 = A1();
            if (A1 >= 0) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                    ic P = getBulletinFactory().P(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.Gift2ActionWearNeededPremium), new t1(this, 24)));
                    P.t = true;
                    P.j();
                    return;
                }
            } else if (!z4) {
                final MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                dVar.setLoading(true);
                MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(A1, new h5.d() { // from class: lh.i3
                    @Override // h5.d
                    public final void accept(Object obj) {
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                        g5 g5Var = g5.this;
                        if (tL_premium_boostsStatus != null) {
                            int i10 = tL_premium_boostsStatus.level;
                            MessagesController messagesController2 = messagesController;
                            if (i10 < messagesController2.channelEmojiStatusLevelMin) {
                                ChannelBoostsController boostsController = messagesController2.getBoostsController();
                                long j10 = A1;
                                boostsController.userCanBoostChannel(j10, tL_premium_boostsStatus, new w1(g5Var, tL_premium_boostsStatus, j10, messagesController2, 0));
                                return;
                            }
                        }
                        g5Var.g0.setLoading(false);
                        g5Var.r2(true);
                    }
                });
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = K1.id;
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(A1(), tL_inputEmojiStatusCollectible, K1);
        }
        this.b0.F[1].b(!P1 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, LocaleController.getString(!P1 ? R.string.Gift2ActionWearOff : R.string.Gift2ActionWear), true);
        if (this.u0) {
            dismiss();
            return;
        }
        jh.f fVar = new jh.f(3, this, z10);
        if (this.V0.c(0)) {
            fVar.run();
        } else {
            q2(0, true, fVar);
        }
        dVar.g(LocaleController.getString(R.string.OK), !this.Y0, true);
        dVar.f(null, !this.Y0);
        dVar.setOnClickListener(new l1(this, 0));
    }

    public final boolean s1() {
        TLRPC.Peer peer;
        if (E1() == null) {
            return false;
        }
        MessageObject messageObject = this.B0;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                return ((!(tL_messageActionStarGift.peer != null) && (!messageObject.isOutOwner() || ((this.B0.getDialogId() > UserConfig.getInstance(this.currentAccount).getClientUserId() ? 1 : (this.B0.getDialogId() == UserConfig.getInstance(this.currentAccount).getClientUserId() ? 0 : -1)) == 0))) || ((peer = tL_messageActionStarGift.peer) != null && O1(this.currentAccount, DialogObject.getPeerDialogId(peer)))) && !tL_messageActionStarGift.converted && tL_messageActionStarGift.convert_stars > 0 && MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.B0.messageOwner.date) > 0;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.z0;
            if (savedStarGift != null) {
                int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
                int i10 = this.currentAccount;
                long j10 = this.U;
                if (O1(i10, j10)) {
                    int i11 = this.z0.flags;
                    if (((j10 < 0 ? 2048 : 8) & i11) != 0 && (i11 & 16) != 0 && (i11 & 2) != 0 && currentTime > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void s2() {
        FrameLayout frameLayout = this.j0;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.l0;
        FrameLayout frameLayout3 = this.h0;
        if (visibility != 0) {
            frameLayout3.setTranslationY(0.0f);
            frameLayout.setTranslationY(0.0f);
            frameLayout2.setTranslationY(0.0f);
        } else {
            frameLayout3.setTranslationY(this.V0.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.V0.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.V0.a(1) * (-frameLayout.getMeasuredHeight()));
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        MessageObject messageObject;
        TLRPC.Message message;
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            org.telegram.ui.c.b(this.currentAccount);
            return;
        }
        if (this.C0 != null && this.D0 == null) {
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getContext(), 3, null);
            d2Var.q(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.C0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getuniquestargift, new dg.d3(8, this, d2Var));
        } else if (this.z0 == null && (messageObject = this.B0) != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(getContext(), 3, null);
                        d2Var2.q(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new gg.y(this, tL_messageActionStarGift, d2Var2, 7));
                        return;
                    }
                    if (E1() != null) {
                        org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(getContext(), 3, null);
                        d2Var3.q(500L);
                        t7.y(this.currentAccount, false).M(E1(), new kh.a1(5, this, d2Var3));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final boolean t1() {
        int i10;
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null || K1.crafted || !O1(this.currentAccount, DialogObject.getPeerDialogId(K1.owner_id))) {
            return false;
        }
        MessageObject messageObject = this.B0;
        if (messageObject == null) {
            TL_stars.SavedStarGift savedStarGift = this.z0;
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

    public final void t2() {
        boolean L1 = L1(false);
        o3 o3Var = this.W;
        o3Var.setPosition(L1 ? 1 : 0);
        o3Var.C(false);
        if (this.A0 == null || L1(true) || this.A0.e() >= this.A0.c()) {
            return;
        }
        this.A0.a();
    }

    public final void u1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.Gift2CantDoTitle);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.Gift2CantDoText);
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 != null && !TextUtils.isEmpty(K1.slug)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OpenFragment), new c3(this, K1, 1));
        }
        kf.k0.u(R.string.Cancel, alertDialog$Builder, null);
    }

    @Override // org.telegram.ui.Components.sa
    public final ql0 v(rl0 rl0Var) {
        eg.g gVar = new eg.g(this, 1);
        this.N0 = gVar;
        return gVar;
    }

    public final void v1(final long j10, final Utilities.Callback callback) {
        TLRPC.Message message;
        long peerDialogId;
        long j11;
        TL_stars.InputSavedStarGift E1 = E1();
        if (E1 == null) {
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.z0;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            MessageObject messageObject = this.B0;
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
            peerDialogId = this.U;
        }
        if (j11 <= 0) {
            TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
            transferstargift.stargift = E1;
            transferstargift.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(transferstargift, new b2(this, callback, j10, peerDialogId, 0));
            return;
        }
        final long j12 = peerDialogId;
        t7 y10 = t7.y(this.currentAccount, false);
        if (!y10.e) {
            y10.r(new c2(this, y10, j10, callback, 0));
            return;
        }
        final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
        tL_inputInvoiceStarGiftTransfer.stargift = E1;
        tL_inputInvoiceStarGiftTransfer.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
        JSONObject p10 = rh.p2.p(this.resourcesProvider, false);
        if (p10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = p10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: lh.d2
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final g5 g5Var = g5.this;
                final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer2 = tL_inputInvoiceStarGiftTransfer;
                final long j13 = j10;
                final long j14 = j12;
                final Utilities.Callback callback2 = callback;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: lh.e2
                    @Override // java.lang.Runnable
                    public final void run() {
                        g5.G0(g5.this, tLObject, tL_inputInvoiceStarGiftTransfer2, j13, j14, callback2, tL_error);
                    }
                });
            }
        });
    }

    public final void w1() {
        TL_stars.InputSavedStarGift E1;
        long j10;
        ph.d dVar = this.g0;
        if (dVar.K || (E1 = E1()) == null) {
            return;
        }
        MessageObject messageObject = this.B0;
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
            TL_stars.SavedStarGift savedStarGift = this.z0;
            if (savedStarGift == null) {
                return;
            }
            j10 = savedStarGift.upgrade_stars;
            if (j10 <= 0) {
                str = savedStarGift.prepaid_upgrade_hash;
            }
        }
        if (j10 > 0 || this.i1 != null) {
            dVar.setLoading(true);
            kp kpVar = this.s0;
            if (j10 > 0) {
                TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                upgradestargift.keep_original_details = kpVar.a.q;
                upgradestargift.stargift = E1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(upgradestargift, new dg.d3(7, this, E1));
                return;
            }
            int i10 = 0;
            t7 y10 = t7.y(this.currentAccount, false);
            if (!y10.e) {
                y10.r(new n2(0, this, y10));
                return;
            }
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = this.i1.form_id;
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = kpVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = E1;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.U);
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = this.i1.invoice.prices;
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j11 += tL_labeledPrice.amount;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new v(this, str, E1, j11, 1));
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final int x() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return this.P0;
    }

    public final int z1() {
        if (this.V0.d(1)) {
            return this.o0.getMeasuredHeight();
        }
        if (this.V0.d(2)) {
            return this.v0.getMeasuredHeight();
        }
        if (this.V0.d(3)) {
            return this.x0.getMeasuredHeight();
        }
        if (this.V0.d(4)) {
            return 0;
        }
        return this.c0.getMeasuredHeight();
    }
}
