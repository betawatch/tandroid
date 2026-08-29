package jh;

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
import nh.gb;
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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fy;
import org.telegram.ui.t91;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public class h5 extends org.telegram.ui.Components.xa implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int m1 = 0;
    public MessageObject A0;
    public String B0;
    public TL_stars.TL_starGiftUnique C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public s4 I0;
    public boolean J0;
    public s3 K0;
    public final int[] L0;
    public cg.g M0;
    public int N0;
    public String O0;
    public ih.p5 P0;
    public iq Q0;
    public boolean R0;
    public k3 S0;
    public final long T;
    public Float T0;
    public final bg.u1 U;
    public a5.d U0;
    public final p3 V;
    public ValueAnimator V0;
    public final n00 W;
    public iq W0;
    public ih.m3 X;
    public boolean X0;
    public ih.m3 Y;
    public View Y0;
    public final r3 Z;
    public ih.a3 Z0;
    public final d5 a0;
    public boolean a1;
    public final q3 b0;
    public Boolean b1;
    public final y80 c0;
    public boolean c1;
    public final hz0 d0;
    public ArrayList d1;
    public final y80 e0;
    public ArrayList e1;
    public final nh.d f0;
    public ArrayList f1;
    public final FrameLayout g0;
    public boolean g1;
    public final y80 h0;
    public TLRPC.PaymentForm h1;
    public final FrameLayout i0;
    public final iq[] i1;
    public final View j0;
    public final t1 j1;
    public final FrameLayout k0;
    public nh.t3 k1;
    public f5 l0;
    public View l1;
    public boolean m0;
    public final q3 n0;
    public final ph.i[] o0;
    public final View p0;
    public final LinearLayout q0;
    public final hp r0;
    public final TextView s0;
    public boolean t0;
    public final q3 u0;
    public final TextView v0;
    public final q3 w0;
    public boolean x0;
    public TL_stars.SavedStarGift y0;
    public l7 z0;

    public h5(Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, View view) {
        super(context, null, false, false, false, 1, c6Var);
        this.m0 = false;
        this.L0 = new int[2];
        this.N0 = -1;
        this.O0 = "";
        this.U0 = new a5.d(0, 0);
        this.X0 = true;
        this.i1 = new iq[1];
        this.j1 = new t1(this, 7);
        this.currentAccount = i10;
        this.T = j10;
        this.v = Math.max(0.05f, AndroidUtilities.dp(82.0f) / (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight));
        this.occupyNavigationBar = true;
        this.containerView = new bg.x2(this, context, 7);
        bg.u1 u1Var = new bg.u1(this, context);
        this.U = u1Var;
        p3 p3Var = new p3(this, context);
        this.V = p3Var;
        p3Var.setAdapter(new eg.v(this, context, 1));
        t2();
        View view2 = new View(context);
        int i11 = org.telegram.ui.ActionBar.g6.h5;
        view2.setBackgroundColor(getThemedColor(i11));
        this.containerView.addView(view2, i7.f6.e(-1, 50, 80));
        this.containerView.addView(p3Var, i7.f6.e(-1, -1, 119));
        fixNavigationBar(getThemedColor(i11));
        AndroidUtilities.removeFromParent(this.d);
        u1Var.addView(this.d, i7.f6.e(-1, -1, 119));
        q3 q3Var = new q3(this, context, 0);
        this.b0 = q3Var;
        q3Var.setOrientation(1);
        q3Var.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(68.0f));
        u1Var.addView(q3Var, i7.f6.e(-1, -1, 55));
        y80 y80Var = new y80(context, c6Var);
        this.c0 = y80Var;
        int i12 = org.telegram.ui.ActionBar.g6.q5;
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        y80Var.setTextSize(1, 12.0f);
        y80Var.setGravity(17);
        y80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        y80Var.setDisablePaddingsOffsetY(true);
        q3Var.addView(y80Var, i7.f6.t(-2, -2, 1, 4, -2, 4, 16));
        y80Var.setVisibility(8);
        hz0 hz0Var = new hz0(context, c6Var);
        this.d0 = hz0Var;
        q3Var.addView(hz0Var, i7.f6.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        y80 y80Var2 = new y80(context, c6Var);
        this.e0 = y80Var2;
        y80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        y80Var2.setTextSize(1, 12.0f);
        y80Var2.setGravity(17);
        y80Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        int i13 = org.telegram.ui.ActionBar.g6.Oh;
        y80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        y80Var2.setDisablePaddingsOffsetY(true);
        y80Var2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        q3Var.addView(y80Var2, i7.f6.t(-2, -2, 1, 4, 2, 4, 8));
        y80Var2.setVisibility(8);
        q3 q3Var2 = new q3(this, context, 1);
        this.n0 = q3Var2;
        q3Var2.setOrientation(1);
        q3Var2.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        u1Var.addView(q3Var2, i7.f6.e(-1, -1, 55));
        ph.i[] iVarArr = {r9, r0, r0};
        this.o0 = iVarArr;
        ph.i iVar = new ph.i(context, c6Var, false);
        iVar.a(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
        q3Var2.addView(iVarArr[0], i7.f6.n(-1, -2));
        ph.i iVar2 = new ph.i(context, c6Var, false);
        iVar2.a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
        q3Var2.addView(iVarArr[1], i7.f6.n(-1, -2));
        ph.i iVar3 = new ph.i(context, c6Var, false);
        iVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
        q3Var2.addView(iVarArr[2], i7.f6.n(-1, -2));
        View view3 = new View(context);
        this.p0 = view3;
        int i14 = org.telegram.ui.ActionBar.g6.d7;
        view3.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
        q3Var2.addView(view3, i7.f6.s(-2, 7, 17, -4, 17, 1.0f / AndroidUtilities.density, 6));
        LinearLayout linearLayout = new LinearLayout(context);
        this.q0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 6, 6));
        hp hpVar = new hp(context, 24, c6Var);
        this.r0 = hpVar;
        hpVar.b(org.telegram.ui.ActionBar.g6.h7, org.telegram.ui.ActionBar.g6.j7, org.telegram.ui.ActionBar.g6.k7);
        hpVar.setDrawUnchecked(true);
        hpVar.a(false, false);
        hpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(hpVar, i7.f6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.s0 = textView;
        int i15 = org.telegram.ui.ActionBar.g6.j5;
        textView.setTextColor(getThemedColor(i15));
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
        linearLayout.addView(textView, i7.f6.t(-2, -2, 16, 9, 0, 0, 0));
        q3Var2.addView(linearLayout, i7.f6.t(-2, -2, 1, 0, 0, 0, 4));
        i7.h6.b(linearLayout, 0.025f, 1.5f);
        q3 q3Var3 = new q3(this, context, 2);
        this.u0 = q3Var3;
        q3Var3.setOrientation(1);
        q3Var3.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        u1Var.addView(q3Var3, i7.f6.e(-1, -1, 55));
        TextView textView2 = new TextView(context);
        this.v0 = textView2;
        org.telegram.ui.b.m(i15, c6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        q3Var3.addView(textView2, i7.f6.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView3 = new TextView(context);
        org.telegram.ui.b.m(i15, c6Var, textView3, 1, 14.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearSubtitle));
        q3Var3.addView(textView3, i7.f6.t(-1, -2, 7, 20, 6, 20, 24));
        ph.i iVar4 = new ph.i(context, c6Var, false);
        iVar4.a(LocaleController.getString(R.string.Gift2WearFeature1Title), LocaleController.getString(R.string.Gift2WearFeature1Text), R.drawable.menu_feature_unique);
        q3Var3.addView(r7[0], i7.f6.n(-1, -2));
        ph.i iVar5 = new ph.i(context, c6Var, false);
        iVar5.a(LocaleController.getString(R.string.Gift2WearFeature2Title), LocaleController.getString(R.string.Gift2WearFeature2Text), R.drawable.menu_feature_cover);
        q3Var3.addView(r7[1], i7.f6.n(-1, -2));
        ph.i iVar6 = new ph.i(context, c6Var, false);
        ph.i[] iVarArr2 = {iVar4, iVar5, iVar6};
        iVar6.a(LocaleController.getString(R.string.Gift2WearFeature3Title), LocaleController.getString(R.string.Gift2WearFeature3Text), R.drawable.menu_verification);
        q3Var3.addView(iVarArr2[2], i7.f6.n(-1, -2));
        q3 q3Var4 = new q3(this, context, 3);
        this.w0 = q3Var4;
        q3Var4.setOrientation(1);
        q3Var4.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(92.0f));
        u1Var.addView(q3Var4, i7.f6.e(-1, -1, 55));
        ph.i iVar7 = new ph.i(context, c6Var, false);
        iVar7.a(LocaleController.getString(R.string.GiftCraftInfoFeature1Title), LocaleController.getString(R.string.GiftCraftInfoFeature1Text), R.drawable.menu_feature_unique);
        q3Var4.addView(r9[0], i7.f6.n(-1, -2));
        ph.i iVar8 = new ph.i(context, c6Var, false);
        iVar8.a(LocaleController.getString(R.string.GiftCraftInfoFeature2Title), LocaleController.getString(R.string.GiftCraftInfoFeature2Text), R.drawable.menu_random);
        q3Var4.addView(r9[1], i7.f6.n(-1, -2));
        ph.i iVar9 = new ph.i(context, c6Var, false);
        ph.i[] iVarArr3 = {iVar7, iVar8, iVar9};
        iVar9.a(LocaleController.getString(R.string.GiftCraftInfoFeature3Title), LocaleController.getString(R.string.GiftCraftInfoFeature3Text), R.drawable.menu_feature_affect);
        q3Var4.addView(iVarArr3[2], i7.f6.n(-1, -2));
        q3Var.setAlpha(1.0f);
        q3Var2.setAlpha(0.0f);
        q3Var3.setAlpha(0.0f);
        q3Var4.setAlpha(0.0f);
        d5 d5Var = new d5(context, c6Var, new t1(this, 9), new l1(this, 13), new l1(this, 14), new l1(this, 15), new l1(this, 16), new l1(this, 17), new l1(this, 18), new l1(this, 19));
        this.a0 = d5Var;
        d5Var.H.c.setOnClickListener(new l1(this, 20));
        int i16 = this.backgroundPaddingLeft;
        d5Var.setPadding(i16, 0, i16, 0);
        u1Var.addView(d5Var, i7.f6.e(-1, -2, 55));
        org.telegram.ui.k kVar = this.c;
        this.M = true;
        kVar.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.g0 = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i11));
        View view4 = new View(context);
        this.j0 = view4;
        view4.setBackgroundColor(getThemedColor(i14));
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, i7.f6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
        this.f0 = o10;
        o10.g(LocaleController.getString(R.string.OK), false, true);
        o10.f(null, false);
        FrameLayout.LayoutParams d = i7.f6.d(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        d.rightMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        frameLayout.addView(o10, d);
        u1Var.addView(frameLayout, i7.f6.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.i0 = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i11));
        y80 y80Var3 = new y80(context, null);
        this.h0 = y80Var3;
        y80Var3.setTextSize(1, 12.0f);
        y80Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        y80Var3.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        y80Var3.setGravity(17);
        frameLayout2.addView(y80Var3, i7.f6.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        u1Var.addView(frameLayout2, i7.f6.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.d.setOnScrollListener(new cg.g2(this, 8));
        linearLayout.setOnClickListener(new l1(this, 12));
        n00 n00Var = new n00(context);
        this.W = n00Var;
        u1Var.addView(n00Var, i7.f6.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.k0 = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        u1Var.addView(frameLayout3, i7.f6.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        AndroidUtilities.removeFromParent(this.e);
        u1Var.addView(this.e, i7.f6.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        r3 r3Var = new r3(context);
        this.Z = r3Var;
        u1Var.addView(r3Var, i7.f6.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        AndroidUtilities.makeGlobalBlurBitmap(new ag.i0(r3Var, 20), 12.0f, 12, null, arrayList);
    }

    public static void A0(h5 h5Var, long j10) {
        new ih.h2(h5Var.getContext(), h5Var.currentAccount, j10, null, new y2(h5Var, 2)).show();
    }

    public static void B0(h5 h5Var, ye.c cVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        cVar.c(false);
        c2Var.dismiss();
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                new y9(h5Var.getContext(), h5Var.resourcesProvider, j10, 16, null, new w2(4, h5Var, charSequence), 0L).show();
                return;
            } else {
                if (tL_error != null) {
                    h5Var.getBulletinFactory().d0(tL_error, false);
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
        TL_stars.SavedStarGift savedStarGift = h5Var.y0;
        h5Var.k2(tL_starGiftUnique, savedStarGift != null ? savedStarGift.refunded : false, null, null);
        AndroidUtilities.runOnUIThread(new w2(2, h5Var, tL_starGiftUnique));
    }

    public static void D0(h5 h5Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, MessagesController messagesController, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        h5Var.f0.setLoading(false);
        cg.z1 z1Var = new cg.z1(h5Var, 3);
        cg.v0 v0Var = new cg.v0(26, h5Var.currentAccount, h5Var.getContext(), z1Var, h5Var.resourcesProvider);
        v0Var.G1(canApplyBoost);
        v0Var.F1(tL_premium_boostsStatus, true);
        v0Var.H1(j10);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        if (chat != null) {
            v0Var.M0 = new eg.i(h5Var, chat);
        }
        v0Var.show();
    }

    public static String D1(TL_stars.StarGift starGift) {
        if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return (!(starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(starGift.title)) ? LocaleController.getString(R.string.Gift2Gift) : starGift.title;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((TL_stars.TL_starGiftUnique) starGift).title);
        sb2.append(" #");
        return j7.l1.m(r3.num, ',', sb2);
    }

    public static void E0(h5 h5Var, int i10, int i11, int i12, TL_stars.TL_starGiftUnique tL_starGiftUnique, eg.w2[] w2VarArr, Long l10) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (l10.longValue() == -99) {
            if (i10 < i11) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h5Var.getContext(), 0, h5Var.resourcesProvider);
                String string = LocaleController.getString(R.string.Gift2ExportTONUnlocksAlertTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.N = string;
                c2Var.P = LocaleController.formatPluralString("Gift2ExportTONUnlocksAlertText", Math.max(1, i12), new Object[0]);
                j7.l1.C(R.string.OK, alertDialog$Builder, null);
                return;
            }
            LinearLayout linearLayout = new LinearLayout(h5Var.getContext());
            linearLayout.setOrientation(1);
            linearLayout.addView(new i4(h5Var.getContext(), tL_starGiftUnique), i7.f6.t(-1, -2, 48, 0, -4, 0, 0));
            TextView textView = new TextView(h5Var.getContext());
            int i13 = org.telegram.ui.ActionBar.g6.j5;
            org.telegram.ui.b.w(i13, h5Var.resourcesProvider, textView, 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.Gift2ExportTONFragmentTitle));
            linearLayout.addView(textView, i7.f6.t(-1, -2, 48, 24, 4, 24, 14));
            TextView textView2 = new TextView(h5Var.getContext());
            org.telegram.ui.b.m(i13, h5Var.resourcesProvider, textView2, 1, 16.0f);
            org.telegram.ui.b.p(R.string.Gift2ExportTONFragmentText, new Object[]{h5Var.C1()}, textView2);
            linearLayout.addView(textView2, i7.f6.t(-1, -2, 48, 24, 0, 24, 4));
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(h5Var.getContext(), 0, h5Var.resourcesProvider);
            alertDialog$Builder2.n(linearLayout);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Gift2ExportTONFragmentOpen), new a9.s(25, h5Var, w2VarArr));
            j7.l1.u(R.string.Cancel, alertDialog$Builder2, null);
            return;
        }
        androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(h5Var, l10, w2VarArr, 19);
        if (l10.longValue() < 0) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(h5Var.currentAccount).getChatFull(-l10.longValue());
            if (chatFull == null) {
                TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                tL_channels_getFullChannel.channel = MessagesController.getInstance(h5Var.currentAccount).getInputChannel(-l10.longValue());
                ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(tL_channels_getFullChannel, new bg.h3(6, h5Var, bVar));
                return;
            } else if (!chatFull.stargifts_available) {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(h5Var.getContext(), 0, h5Var.resourcesProvider);
                String string2 = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder3.a;
                c2Var2.N = string2;
                c2Var2.P = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                j7.l1.C(R.string.OK, alertDialog$Builder3, null);
                return;
            }
        } else if (l10.longValue() >= 0) {
            TLRPC.User user = MessagesController.getInstance(h5Var.currentAccount).getUser(l10);
            TLRPC.UserFull userFull = MessagesController.getInstance(h5Var.currentAccount).getUserFull(l10.longValue());
            if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                new tc(w2VarArr[0].container, h5Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l10.longValue())))).j();
                return;
            } else if (userFull == null && user != null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = MessagesController.getInstance(h5Var.currentAccount).getInputUser(user);
                ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(tL_users_getFullUser, new ih.c1(h5Var, w2VarArr, l10, bVar, 2));
                return;
            }
        }
        bVar.run();
    }

    public static void G0(h5 h5Var, TLObject tLObject, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            callback.run(tL_error);
            mc Y = h5Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
            return;
        }
        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
        int i10 = 0;
        MessagesController.getInstance(h5Var.currentAccount).putUsers(paymentForm.users, false);
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
        ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new y1(h5Var, j10, j11, callback, j12));
    }

    public static void H0(h5 h5Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        c2Var.c(400L);
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        int i10 = 1;
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                h5Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
                return;
            } else {
                h5Var.getBulletinFactory().t(LocaleController.getString(R.string.UnknownError), null).k(false);
                return;
            }
        }
        h5Var.dismiss();
        s7.y(h5Var.currentAccount, false).Q(j10);
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            bundle.putBoolean("start_from_monetization", true);
            t91 t91Var = new t91(bundle);
            b0.g(h5Var.currentAccount).h(j10, true);
            b0.g(h5Var.currentAccount).l(j10);
            t91Var.whenFullyVisible(new eg.z1(t91Var, j12, 2));
            U.presentFragment(t91Var);
            return;
        }
        TLRPC.UserFull userFull = MessagesController.getInstance(h5Var.currentAccount).getUserFull(j11);
        if (userFull != null) {
            int max = Math.max(0, userFull.stargifts_count - 1);
            userFull.stargifts_count = max;
            if (max <= 0) {
                userFull.flags2 &= -257;
            }
        }
        s7.y(h5Var.currentAccount, false).P();
        s7.y(h5Var.currentAccount, false).T(true);
        if (U instanceof ia) {
            tc.a0(U).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j12), R.raw.stars_topup).k(true);
            return;
        }
        ia iaVar = new ia();
        iaVar.whenFullyVisible(new eg.z1(iaVar, j12, i10));
        U.presentFragment(iaVar);
    }

    public static void I0(h5 h5Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        h5Var.C0 = tL_starGiftUnique;
        h5Var.k2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static /* synthetic */ void J0(final long j10, final long j11, final h5 h5Var, final Utilities.Callback callback, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(h5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: jh.k2
            @Override // java.lang.Runnable
            public final void run() {
                h5.S(j10, j11, h5Var, callback, tLObject, tL_error);
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
        return i10 <= 0 ? "<0.1%" : ph.j.G0(i10);
    }

    public static void L0(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence, org.telegram.ui.ActionBar.c2 c2Var) {
        ye.c g10 = c2Var.g(-1, true, true);
        g10.d();
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new x2(h5Var, g10, c2Var, tL_starGiftUnique, j10, charSequence));
    }

    public static /* synthetic */ void M0(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, kf.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(h5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new i2(h5Var, tL_starGiftUnique, aVar, runnable, 1));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new j2(h5Var, tL_error, runnable, 1));
        }
    }

    public static void N0(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, org.telegram.ui.ActionBar.c2 c2Var) {
        h5Var.getClass();
        ye.c g10 = c2Var.g(-1, true, true);
        g10.d();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = h5Var.E1();
        updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
        ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(updatestargiftprice, new eg.z(h5Var, g10, tL_starGiftUnique, 6));
    }

    public static boolean N1(int i10, long j10) {
        return j10 >= 0 ? UserConfig.getInstance(i10).getClientUserId() == j10 : ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), 5);
    }

    public static /* synthetic */ void O0(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, kf.a aVar, Runnable runnable) {
        TL_stars.StarsAmount o10 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = h5Var.E1();
        updatestargiftprice.resell_amount = o10;
        ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(updatestargiftprice, new r1(h5Var, tL_starGiftUnique, aVar, runnable, 0));
    }

    public static boolean O1(int i10, long j10) {
        if (j10 >= 0) {
            return UserConfig.getInstance(i10).getClientUserId() == j10;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        return chat != null && chat.creator;
    }

    public static void P(h5 h5Var, long j10) {
        new ih.h2(h5Var.getContext(), h5Var.currentAccount, j10, null, new y2(h5Var, 2)).show();
    }

    public static void P0(h5 h5Var, long j10) {
        new ih.h2(h5Var.getContext(), h5Var.currentAccount, j10, null, new y2(h5Var, 2)).show();
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

    public static /* synthetic */ void R(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, ih.v0 v0Var, j4 j4Var, ye.c cVar) {
        cVar.d();
        s7.x(h5Var.currentAccount, j4Var.a).h(j4Var.b, tL_starGiftUnique, j10, tL_textWithEntities, z10, new t2(h5Var, cVar, tL_starGiftUnique, j10, v0Var, 0));
    }

    public static void R0(h5 h5Var, TLObject tLObject, androidx.car.app.utils.b bVar, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.TL_messages_chatFull)) {
            mc Y = h5Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
            return;
        }
        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
        MessagesController.getInstance(h5Var.currentAccount).putUsers(tL_messages_chatFull.users, false);
        MessagesController.getInstance(h5Var.currentAccount).putChats(tL_messages_chatFull.chats, false);
        MessagesController.getInstance(h5Var.currentAccount).putChatFull(tL_messages_chatFull.full_chat);
        if (tL_messages_chatFull.full_chat.stargifts_available) {
            bVar.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h5Var.getContext(), 0, h5Var.resourcesProvider);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
        j7.l1.C(R.string.OK, alertDialog$Builder, null);
    }

    public static void S(long j10, long j11, h5 h5Var, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j12;
        h5 h5Var2;
        callback.run(tL_error);
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            j12 = j10;
            h5Var2 = h5Var;
        } else if (!(tLObject instanceof TLRPC.Updates)) {
            j12 = j10;
            h5Var2 = h5Var;
            tc.a0(U).d0(tL_error, false);
        } else if (j10 < 0 || j11 < 0) {
            j12 = j10;
            h5Var2 = h5Var;
            mc M = tc.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, h5Var2.C1(), DialogObject.getShortName(j12))), R.raw.forward);
            M.t = true;
            M.j();
        } else {
            tn R9 = tn.R9(j10);
            j12 = j10;
            h5Var2 = h5Var;
            R9.whenFullyVisible(new r2(h5Var2, R9, j12, 0));
            U.presentFragment(R9);
        }
        s7.y(h5Var2.currentAccount, false).Q(j12);
        s7.y(h5Var2.currentAccount, false).Q(j11);
    }

    public static void S0(h5 h5Var, MessageObject messageObject, ArrayList arrayList, TL_stars.StarGift starGift) {
        h5Var.a1 = true;
        h5Var.i2(messageObject, null);
        h5Var.q2(0, true, null);
        n00 n00Var = h5Var.W;
        if (n00Var != null) {
            n00Var.c(true);
        }
        s7.y(h5Var.currentAccount, false).P();
        k7 G = s7.y(h5Var.currentAccount, false).G(UserConfig.getInstance(h5Var.currentAccount).getClientUserId(), false);
        if (G != null) {
            G.j(arrayList, starGift);
        }
    }

    public static void T(h5 h5Var, org.telegram.ui.ActionBar.c2 c2Var, MessageObject messageObject) {
        c2Var.dismiss();
        h5Var.F0 = true;
        h5Var.i2(messageObject, null);
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
    public static void T0(h5 h5Var, View view) {
        boolean z10;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        boolean O1;
        TLRPC.Message message;
        String F1 = h5Var.F1();
        TL_stars.TL_starGiftUnique K1 = h5Var.K1();
        j70 F = j70.F(h5Var.U, h5Var.resourcesProvider, view);
        boolean z11 = (h5Var.K1() == null || !O1(h5Var.currentAccount, DialogObject.getPeerDialogId(h5Var.K1().owner_id)) || !(h5Var.z0 instanceof k7) || h5Var.y0 == null || h5Var.E1() == null) ? false : true;
        TL_stars.SavedStarGift savedStarGift = h5Var.y0;
        F.l((savedStarGift == null || !savedStarGift.pinned_to_top) ? R.drawable.msg_pin : R.drawable.msg_unpin, LocaleController.getString((savedStarGift == null || !savedStarGift.pinned_to_top) ? R.string.Gift2Pin : R.string.Gift2Unpin), new t1(h5Var, 10), z11);
        F.l(R.drawable.outline_craft, LocaleController.getString(R.string.GiftCraft), new t1(h5Var, 11), h5Var.t1());
        F.l(R.drawable.menu_edit_price, LocaleController.getString(R.string.Gift2ChangePrice), new t1(h5Var, 12), (h5Var.K1() == null || !O1(h5Var.currentAccount, DialogObject.getPeerDialogId(h5Var.K1().owner_id)) || h5Var.K1().resell_amount == null) ? false : true);
        F.l(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new u2(h5Var, F1, 7), F1 != null);
        F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new t1(h5Var, 13), F1 != null);
        F.l(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.GiftOfferToBuyMenu), new t1(h5Var, 14), K1 != null && K1.offer_min_stars > 0);
        TL_stars.TL_starGiftUnique K12 = h5Var.K1();
        if (K12 != null && K12.theme_available) {
            long peerDialogId = DialogObject.getPeerDialogId(K12.owner_id);
            long peerDialogId2 = DialogObject.getPeerDialogId(K12.host_id);
            if ((peerDialogId > 0 && O1(h5Var.currentAccount, peerDialogId)) || (peerDialogId2 > 0 && O1(h5Var.currentAccount, peerDialogId2))) {
                z10 = true;
                F.l(R.drawable.msg_colors, LocaleController.getString(R.string.GiftThemesSetIn), new t1(h5Var, 15), z10);
                if (h5Var.E1() != null) {
                    MessageObject messageObject = h5Var.A0;
                    if (messageObject != null && (message = messageObject.messageOwner) != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                            if ((tL_messageActionStarGiftUnique.flags & 16) != 0) {
                                TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                    O1 = O1(h5Var.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id));
                                    F.l(R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2TransferOption), new t1(h5Var, 16), O1);
                                    F.l(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new t1(h5Var, 17), (h5Var.y0 == null || h5Var.A1() == 0) ? false : true);
                                    F.t = false;
                                    F.Y = true;
                                    F.s = 0;
                                    F.a0(0.0f, -AndroidUtilities.dp(2.0f));
                                    F.Z();
                                }
                            }
                        }
                    }
                    TL_stars.SavedStarGift savedStarGift2 = h5Var.y0;
                    if (savedStarGift2 != null) {
                        TL_stars.StarGift starGift2 = savedStarGift2.gift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                            O1 = O1(h5Var.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id));
                            F.l(R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2TransferOption), new t1(h5Var, 16), O1);
                            F.l(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new t1(h5Var, 17), (h5Var.y0 == null || h5Var.A1() == 0) ? false : true);
                            F.t = false;
                            F.Y = true;
                            F.s = 0;
                            F.a0(0.0f, -AndroidUtilities.dp(2.0f));
                            F.Z();
                        }
                    }
                    tL_starGiftUnique = h5Var.C0;
                }
                O1 = false;
                F.l(R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2TransferOption), new t1(h5Var, 16), O1);
                F.l(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new t1(h5Var, 17), (h5Var.y0 == null || h5Var.A1() == 0) ? false : true);
                F.t = false;
                F.Y = true;
                F.s = 0;
                F.a0(0.0f, -AndroidUtilities.dp(2.0f));
                F.Z();
            }
        }
        z10 = false;
        F.l(R.drawable.msg_colors, LocaleController.getString(R.string.GiftThemesSetIn), new t1(h5Var, 15), z10);
        if (h5Var.E1() != null) {
        }
        O1 = false;
        F.l(R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2TransferOption), new t1(h5Var, 16), O1);
        F.l(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new t1(h5Var, 17), (h5Var.y0 == null || h5Var.A1() == 0) ? false : true);
        F.t = false;
        F.Y = true;
        F.s = 0;
        F.a0(0.0f, -AndroidUtilities.dp(2.0f));
        F.Z();
    }

    public static /* synthetic */ void U(h5 h5Var, int i10, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i11 = 0; i11 < messages_messages.messages.size(); i11++) {
                TLRPC.Message message = messages_messages.messages.get(i11);
                if (message != null && message.id == i10) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                        messageObject = new MessageObject(h5Var.currentAccount, message, false, false);
                        messageObject.setType();
                        break;
                    }
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(h5Var, tLObject, messageObject, 20));
        }
    }

    public static void U0(h5 h5Var, Long l10) {
        TLRPC.Chat chat;
        String str = (l10.longValue() >= 0 || (chat = MessagesController.getInstance(h5Var.currentAccount).getChat(Long.valueOf(-l10.longValue()))) == null) ? "" : chat.title;
        mc Q = h5Var.getBulletinFactory().Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.GiftRepostedToProfile) : LocaleController.formatString(R.string.GiftRepostedToChannelProfile, str)));
        Q.t = true;
        Q.j();
    }

    public static void V(final h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, final String str) {
        final long j10 = tL_starGiftUnique.gift_id;
        final String str2 = tL_starGiftUnique.title;
        final String C1 = h5Var.C1();
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        String str3 = tL_starGiftUnique.slug;
        final org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(ApplicationLoader.applicationContext, 3, null);
        c2Var.q(500L);
        TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
        getuniquestargiftvalueinfo.slug = str3;
        ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(getuniquestargiftvalueinfo, new RequestDelegate() { // from class: jh.a2
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final h5 h5Var2 = h5.this;
                final org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                final TLRPC.Document document2 = document;
                final String str4 = str;
                final String str5 = str2;
                final String str6 = C1;
                final long j11 = j10;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: jh.f2
                    @Override // java.lang.Runnable
                    public final void run() {
                        h5.Z0(h5.this, c2Var2, tLObject, document2, str4, str5, str6, j11, tL_error);
                    }
                });
            }
        });
    }

    public static /* synthetic */ void V0(h5 h5Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
            TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
            MessagesController.getInstance(h5Var.currentAccount).putUsers(tL_payments_uniqueStarGift.users, false);
            MessagesController.getInstance(h5Var.currentAccount).putChats(tL_payments_uniqueStarGift.chats, false);
            if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                AndroidUtilities.runOnUIThread(new w2(5, h5Var, tL_payments_uniqueStarGift));
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new w2(6, c2Var, tL_error));
    }

    public static void W(h5 h5Var) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        i7 F;
        TLRPC.Message message;
        nh.d dVar = h5Var.f0;
        if (dVar.J) {
            return;
        }
        TL_stars.InputSavedStarGift E1 = h5Var.E1();
        MessageObject messageObject = h5Var.A0;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            TL_stars.SavedStarGift savedStarGift = h5Var.y0;
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
        savestargift.stargift = E1;
        if (h5Var.y0 == null || (F = s7.y(h5Var.currentAccount, false).F(h5Var.T, false)) == null) {
            z11 = false;
        } else {
            F.m(h5Var.y0, savestargift.unsave);
            z11 = true;
        }
        ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(savestargift, new hh.j(h5Var, z11, document2, z12, savestargift));
    }

    public static void W0(h5 h5Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        int i10;
        if (h5Var.getContext() == null) {
            return;
        }
        if (tL_error == null) {
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
                ye.d.u(h5Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url);
                return;
            }
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(new TL_account.getPassword(), new s2(h5Var, twoStepVerificationActivity, 1), 8);
                return;
            }
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            tc.b0(tL_error);
            return;
        }
        twoStepVerificationActivity.o0();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h5Var.getContext());
        alertDialog$Builder.a.N = LocaleController.getString(R.string.Gift2TransferToTONAlertTitle);
        LinearLayout linearLayout = new LinearLayout(h5Var.getContext());
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(h5Var.getContext());
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText)));
        linearLayout.addView(textView, i7.f6.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(h5Var.getContext());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, i7.f6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(h5Var.getContext());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        TextView textView2 = new TextView(h5Var.getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.x3.r(R.string.Gift2TransferToTONAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, i7.f6.n(-1, -2));
            linearLayout2.addView(imageView, i7.f6.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, i7.f6.n(-2, -2));
            linearLayout2.addView(textView2, i7.f6.n(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(h5Var.getContext());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, i7.f6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(h5Var.getContext());
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), mode));
        TextView textView3 = new TextView(h5Var.getContext());
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.x3.r(R.string.Gift2TransferToTONAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, i7.f6.n(-1, -2));
            i10 = 5;
            linearLayout3.addView(imageView2, i7.f6.q(-2, -2, 5));
        } else {
            i10 = 5;
            linearLayout3.addView(imageView2, i7.f6.n(-2, -2));
            linearLayout3.addView(textView3, i7.f6.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.Gift2TransferToTONSetPassword), new j3.d0(h5Var));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            TextView textView4 = new TextView(h5Var.getContext());
            textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            textView4.setTextSize(1, 16.0f);
            if (!LocaleController.isRTL) {
                i10 = 3;
            }
            textView4.setGravity(i10 | 48);
            textView4.setText(LocaleController.getString(R.string.Gift2TransferToTONAlertText3));
            linearLayout.addView(textView4, i7.f6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
        }
        twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
    }

    public static boolean X(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, fy fyVar, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        long giftThemeUser = ChatThemeController.getInstance(h5Var.currentAccount).getGiftThemeUser(tL_starGiftUnique.slug);
        if (giftThemeUser != 0 && giftThemeUser != j10) {
            org.telegram.ui.Components.c5.n0(h5Var.getContext(), h5Var.resourcesProvider, h5Var.currentAccount, tL_starGiftUnique, giftThemeUser, new c2(h5Var, j10, tL_starGiftUnique, fyVar, 1));
            return true;
        }
        ChatThemeController.getInstance(h5Var.currentAccount).setDialogTheme(j10, new qf.b(null, tL_starGiftUnique.slug));
        fyVar.presentFragment(tn.R9(j10), true);
        return true;
    }

    public static void Y(final h5 h5Var) {
        int i10;
        long peerDialogId;
        long j10;
        long j11;
        final long clientUserId = UserConfig.getInstance(h5Var.currentAccount).getClientUserId();
        final TL_stars.InputSavedStarGift E1 = h5Var.E1();
        if (E1 == null) {
            return;
        }
        MessageObject messageObject = h5Var.A0;
        if (messageObject != null) {
            i10 = messageObject.messageOwner.date;
            boolean isOutOwner = messageObject.isOutOwner();
            MessageObject messageObject2 = h5Var.A0;
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
            peerDialogId = peer2 != null ? DialogObject.getPeerDialogId(peer2) : isOutOwner ? clientUserId : h5Var.A0.getDialogId();
            j10 = tL_messageActionStarGift.convert_stars;
        } else {
            TL_stars.SavedStarGift savedStarGift = h5Var.y0;
            if (savedStarGift == null) {
                return;
            }
            i10 = savedStarGift.date;
            peerDialogId = ((savedStarGift.flags & 2) == 0 || savedStarGift.name_hidden) ? UserObject.ANONYMOUS : DialogObject.getPeerDialogId(savedStarGift.from_id);
            j10 = h5Var.y0.convert_stars;
            j11 = h5Var.T;
        }
        int max = Math.max(1, (MessagesController.getInstance(h5Var.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(h5Var.currentAccount).getCurrentTime() - i10)) / 86400);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h5Var.getContext(), 0, h5Var.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2ConvertTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2ConvertText2", max, (UserObject.isService(peerDialogId) || peerDialogId == UserObject.ANONYMOUS) ? LocaleController.getString(R.string.StarsTransactionHidden) : DialogObject.getShortName(peerDialogId), LocaleController.formatPluralStringComma("Gift2ConvertStars", (int) j10)));
        final long j12 = j10;
        final long j13 = j11;
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2ConvertButton), new org.telegram.ui.ActionBar.b2() { // from class: jh.f3
            @Override // org.telegram.ui.ActionBar.b2
            public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i11) {
                h5.k0(h5.this, E1, j13, clientUserId, j12);
            }
        });
        j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void Y0(h5 h5Var, String str, long j10) {
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
        m2Var.a = true;
        ih.r5 r5Var = new ih.r5(h5Var.T, str, j10, h5Var.resourcesProvider);
        r5Var.e = new y2(h5Var, 0);
        R.showAsSheet(r5Var, m2Var);
    }

    public static /* synthetic */ void Z(h5 h5Var, boolean[] zArr, TL_stars.StarGiftAttribute starGiftAttribute, vc[] vcVarArr) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        TL_stars.StarGift B1 = h5Var.B1();
        GiftAuctionController.getInstance(h5Var.currentAccount).requestAuctionUpgrades(B1.gift_id, new g2(h5Var, B1, starGiftAttribute, vcVarArr, zArr, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public static void Z0(h5 h5Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.Document document, String str, String str2, String str3, long j10, TLRPC.TL_error tL_error) {
        hz0 hz0Var;
        hz0 hz0Var2;
        float f9;
        float f10;
        char c3;
        ?? r9;
        c2Var.dismiss();
        if (!(tLObject instanceof TL_stars.UniqueStarGiftValueInfo)) {
            if (tL_error != null) {
                h5Var.getBulletinFactory().d0(tL_error, false);
                return;
            }
            return;
        }
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject;
        org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(h5Var.getContext(), h5Var.resourcesProvider, false, false);
        LinearLayout linearLayout = new LinearLayout(h5Var.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(h5Var.getContext());
        ia.Z0(t9Var.getImageReceiver(), document, 160);
        linearLayout.addView(t9Var, i7.f6.t(160, 160, 1, 0, 0, 0, 0));
        TextView textView = new TextView(h5Var.getContext());
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, h5Var.resourcesProvider));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(21.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, h5Var.resourcesProvider)));
        textView.setGravity(17);
        linearLayout.addView(textView, i7.f6.t(-2, 42, 1, 0, 12, 0, 15));
        textView.setText(str);
        TextView textView2 = new TextView(h5Var.getContext());
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, h5Var.resourcesProvider));
        textView2.setGravity(17);
        linearLayout.addView(textView2, i7.f6.t(-2, -2, 1, 16, 0, 16, 19));
        if (uniqueStarGiftValueInfo.value_is_average) {
            org.telegram.ui.b.p(R.string.GiftValueAverage, new Object[]{str2}, textView2);
        } else if (uniqueStarGiftValueInfo.last_sale_on_fragment) {
            org.telegram.ui.b.p(R.string.GiftValueLastFragment, new Object[]{str3}, textView2);
        } else {
            org.telegram.ui.b.p(R.string.GiftValueLastTelegram, new Object[]{str3}, textView2);
        }
        FrameLayout frameLayout = new FrameLayout(h5Var.getContext());
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        ih.b0 b0Var = new ih.b0(h5Var, new nh.t3[1], frameLayout, 3);
        hz0 hz0Var3 = new hz0(h5Var.getContext(), h5Var.resourcesProvider);
        frameLayout.addView(hz0Var3, i7.f6.e(-1, -1, 119));
        hz0Var3.c(LocaleController.getString(R.string.GiftValueInitialSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.initial_sale_date, true), null, null);
        String string = LocaleController.getString(R.string.GiftValueInitialPrice);
        StringBuilder sb2 = new StringBuilder("⭐️");
        sb2.append(uniqueStarGiftValueInfo.initial_sale_stars);
        sb2.append(" (~");
        hz0Var3.c(string, ia.X0(false, a4.w.q(sb2, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
            hz0Var3.c(LocaleController.getString(R.string.GiftValueLastSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.last_sale_date, true), null, null);
            int round = ((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100;
            if (round > 0) {
                hz0Var3.e(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + LocaleController.formatNumber(round, ' ') + "%", null, null);
                hz0Var = hz0Var3;
            } else {
                hz0Var = hz0Var3;
                hz0Var.c(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
            }
        } else {
            hz0Var = hz0Var3;
        }
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
            p2 p2Var = new p2(b0Var, new vc[]{(vc) ((ez0) r0.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str2, 0);
            hz0Var2 = hz0Var;
            TableRow e10 = hz0Var2.e(LocaleController.getString(R.string.GiftValueMinPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", p2Var, null);
            e10.setOnClickListener(new ag.o(p2Var, 18));
        } else {
            hz0Var2 = hz0Var;
        }
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
            p2 p2Var2 = new p2(b0Var, new vc[]{(vc) ((ez0) r0.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str2, 1);
            TableRow e11 = hz0Var2.e(LocaleController.getString(R.string.GiftValueAveragePrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", p2Var2, null);
            e11.setOnClickListener(new ag.o(p2Var2, 19));
        }
        linearLayout.addView(frameLayout, i7.f6.t(-1, -2, 7, 0, 0, 0, 12));
        if (uniqueStarGiftValueInfo.listed_count > 0) {
            nh.d dVar = new nh.d(h5Var.getContext(), h5Var.resourcesProvider, false);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.listed_count, ' '));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) "e");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(document, 1.5f, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleTelegram));
            dVar.g(AndroidUtilities.replaceArrows(spannableStringBuilder, false, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f)), false, true);
            f9 = 1.0f;
            f10 = 2.0f;
            c3 = ' ';
            r9 = 1;
            dVar.setOnClickListener(new q2(h5Var, str2, j10, 0));
            linearLayout.addView(dVar, i7.f6.t(-1, 42, 7, 0, 0, 0, 2));
        } else {
            f9 = 1.0f;
            f10 = 2.0f;
            c3 = ' ';
            r9 = 1;
        }
        if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
            nh.d dVar2 = new nh.d(h5Var.getContext(), h5Var.resourcesProvider, false);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.fragment_listed_count, c3));
            spannableStringBuilder2.append((CharSequence) "e");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.y5(document, 1.5f, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - r9, spannableStringBuilder2.length(), 33);
            spannableStringBuilder2.append((CharSequence) " ");
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleFragment));
            dVar2.g(AndroidUtilities.replaceArrows(spannableStringBuilder2, false, AndroidUtilities.dp(f10), AndroidUtilities.dp(f9)), false, r9);
            dVar2.setOnClickListener(new ag.n(21, h5Var, uniqueStarGiftValueInfo));
            linearLayout.addView(dVar2, i7.f6.t(-1, 42, 7, 0, 0, 0, 0));
        }
        q6.customView = linearLayout;
        q6.show();
    }

    public static void a0(h5 h5Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        h5Var.g1 = false;
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            mc Y = h5Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
        } else {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(h5Var.currentAccount).putUsers(paymentForm.users, false);
            h5Var.h1 = paymentForm;
            h5Var.b2();
        }
    }

    public static void a1(final h5 h5Var, final ih.v0 v0Var, kf.b bVar, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        h5Var.f0.setLoading(false);
        if (v0Var != null && v0Var.H) {
            v0Var.H = false;
            v0Var.D.h(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        new l4(h5Var.getContext(), h5Var.resourcesProvider, tL_starGiftUnique, new j4(bVar, tL_payments_paymentFormStarGift), h5Var.currentAccount, j10, h5Var.C1(), false, new Utilities.Callback2() { // from class: jh.m2
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                h5.R(h5.this, tL_starGiftUnique, j10, tL_textWithEntities, z10, v0Var, (j4) obj, (ye.c) obj2);
            }
        }).b();
    }

    public static void b0(h5 h5Var) {
        Bundle bundle = new Bundle();
        long j10 = h5Var.T;
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        if (j10 == UserConfig.getInstance(h5Var.currentAccount).getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        bundle.putBoolean("open_gifts", true);
        bundle.putBoolean("open_gifts_upgradable", true);
        d2(new ProfileActivity(bundle, null));
    }

    public static void b1(h5 h5Var) {
        nh.d dVar = h5Var.f0;
        if (UserConfig.getInstance(h5Var.currentAccount).isPremium() && (P1(h5Var.currentAccount, h5Var.K1()) || h5Var.R0)) {
            h5Var.r2(false);
            return;
        }
        TL_stars.TL_starGiftUnique K1 = h5Var.K1();
        if (K1 == null) {
            return;
        }
        TLRPC.Peer peer = K1.owner_id;
        if (peer == null) {
            peer = K1.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(K1.title);
        sb2.append(" #");
        h5Var.v0.setText(LocaleController.formatString(R.string.Gift2WearTitle, j7.l1.m(K1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (!UserConfig.getInstance(h5Var.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (h5Var.Q0 == null) {
                h5Var.Q0 = new iq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(h5Var.Q0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new l1(h5Var, 26));
        h5Var.a0.setWearPreview(MessagesController.getInstance(h5Var.currentAccount).getUserOrChat(peerDialogId));
        h5Var.q2(2, true, null);
    }

    public static void c0(h5 h5Var, Utilities.Callback2 callback2, ArrayList arrayList, Runnable runnable, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
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
                    messageObject = new MessageObject(h5Var.currentAccount, message, false, false);
                    break;
                }
            }
            MessagesController.getInstance(h5Var.currentAccount).processUpdates(updates, false);
            if (messageObject != null) {
                TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageObject.messageOwner.action).gift;
                callback2.run(starGift, new androidx.car.app.utils.c(h5Var, messageObject, arrayList, starGift, 9));
                return;
            }
            callback2.run(null, null);
            s7.y(h5Var.currentAccount, false).P();
            k7 G = s7.y(h5Var.currentAccount, false).G(UserConfig.getInstance(h5Var.currentAccount).getClientUserId(), false);
            if (G != null) {
                G.j(arrayList, null);
                return;
            }
            return;
        }
        if (tL_error != null) {
            if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                alertDialog$Builder = new AlertDialog$Builder(h5Var.getContext(), 0, new lh.b());
                String string = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.N = string;
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftUnavailableText));
                i10 = R.string.OK;
            } else {
                String str = tL_error.text;
                if (str == null || !str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                    h5Var.getBulletinFactory().d0(tL_error, false);
                    runnable.run();
                }
                long parseLong = Long.parseLong(tL_error.text.substring(25)) + ConnectionsManager.getInstance(h5Var.currentAccount).getCurrentTime();
                alertDialog$Builder = new AlertDialog$Builder(h5Var.getContext(), 0, new lh.b());
                String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.a;
                c2Var2.N = string2;
                c2Var2.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(parseLong, true)));
                i10 = R.string.OK;
            }
            j7.l1.C(i10, alertDialog$Builder, null);
            runnable.run();
        }
    }

    public static void c1(h5 h5Var, TLObject tLObject, CharSequence charSequence, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            if (tL_error != null) {
                h5Var.getBulletinFactory().d0(tL_error, false);
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
        LinearLayout linearLayout = new LinearLayout(h5Var.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        TextView b10 = i7.j6.b(h5Var.getContext(), 16.0f, org.telegram.ui.ActionBar.g6.j5, false, null);
        b10.setText(LocaleController.getString(R.string.Gift2RemoveDescriptionText));
        linearLayout.addView(b10, i7.f6.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
        hz0 hz0Var = new hz0(h5Var.getContext(), h5Var.resourcesProvider);
        fz0 a2 = hz0Var.a(charSequence);
        a2.setFilled(true);
        gh.s sVar = (gh.s) a2.getChildAt(0);
        sVar.setTextSize(1, 12.0f);
        sVar.setGravity(17);
        linearLayout.addView(hz0Var, i7.f6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h5Var.getContext(), 0, h5Var.resourcesProvider);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.Gift2RemoveDescriptionTitle);
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(ia.Q0(LocaleController.formatString(R.string.Gift2RemoveDescriptionButton, Integer.valueOf((int) j10))), new o2(h5Var, tL_starGiftUnique, paymentForm, tL_inputInvoiceStarGiftDropOriginalDetails, j10, charSequence));
        alertDialog$Builder.o();
    }

    public static void d0(h5 h5Var, long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, fy fyVar) {
        ChatThemeController.getInstance(h5Var.currentAccount).setDialogTheme(j10, new qf.b(null, tL_starGiftUnique.slug));
        fyVar.presentFragment(tn.R9(j10), true);
    }

    public static /* synthetic */ void d1(h5 h5Var, long j10) {
        y9 y9Var = new y9(h5Var.getContext(), h5Var.resourcesProvider, j10, 10, null, new w2(1, h5Var, new boolean[]{false}), 0L);
        y9Var.setOnDismissListener(new z2(h5Var, 0));
        y9Var.show();
    }

    public static void d2(org.telegram.ui.ActionBar.o2 o2Var) {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
        m2Var.a = true;
        U.showAsSheet(o2Var, m2Var);
    }

    public static /* synthetic */ void e0(h5 h5Var, long j10, long j11, Utilities.Callback callback) {
        y9 y9Var = new y9(h5Var.getContext(), h5Var.resourcesProvider, j10, 11, null, new c2(h5Var, new boolean[]{false}, j11, callback, 2), 0L);
        y9Var.setOnDismissListener(new z2(h5Var, 1));
        y9Var.show();
    }

    public static /* synthetic */ void e1(h5 h5Var, TLRPC.TL_messageActionStarGift tL_messageActionStarGift, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(h5Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(h5Var.currentAccount).putChats(messages_messages.chats, false);
            for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                TLRPC.Message message = messages_messages.messages.get(i10);
                if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.id == tL_messageActionStarGift.upgrade_msg_id) {
                    messageObject = new MessageObject(h5Var.currentAccount, message, false, false);
                    messageObject.setType();
                    break;
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(h5Var, c2Var, messageObject, 24));
        } else {
            AndroidUtilities.runOnUIThread(new h3(c2Var, 0));
        }
    }

    public static void f0(h5 h5Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        int i10 = 1;
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tL_error == null || !"BALANCE_TOO_LOW".equals(tL_error.text)) {
                callback.run(tL_error);
                h5Var.getBulletinFactory().d0(tL_error, false);
                return;
            } else {
                if (!MessagesController.getInstance(h5Var.currentAccount).starsPurchaseAvailable()) {
                    h5Var.f0.setLoading(false);
                    s7.e0(h5Var.getContext(), h5Var.resourcesProvider);
                    return;
                }
                s7 y8 = s7.y(h5Var.currentAccount, false);
                g5.x xVar = new g5.x(h5Var, j12, j10, callback, 1);
                y8.e = false;
                y8.q(false, true, xVar);
                y8.e = true;
                return;
            }
        }
        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
        MessagesController.getInstance(h5Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
        MessagesController.getInstance(h5Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
        s7.y(h5Var.currentAccount, false).T(false);
        s7.y(h5Var.currentAccount, false).Q(j10);
        s7.y(h5Var.currentAccount, false).Q(j11);
        s7.y(h5Var.currentAccount, false).P();
        callback.run(null);
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            if (j10 < 0 || j11 < 0) {
                mc M = tc.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, h5Var.C1(), DialogObject.getShortName(j10))), R.raw.forward);
                M.t = true;
                M.j();
            } else {
                tn R9 = tn.R9(j10);
                R9.whenFullyVisible(new r2(h5Var, R9, j10, 1));
                U.presentFragment(R9);
            }
        }
        Utilities.stageQueue.postRunnable(new v2(h5Var, tL_payments_paymentResult, i10));
    }

    public static /* synthetic */ void f1(h5 h5Var, TL_stars.InputSavedStarGift inputSavedStarGift, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(h5Var.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(h5Var.currentAccount).putChats(updates.chats, false);
        }
        AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(h5Var, tL_error, tLObject, inputSavedStarGift, 10));
    }

    public static void g0(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback callback, Boolean bool) {
        if (h5Var.P0 == null) {
            ih.p5 p5Var = new ih.p5(h5Var.currentAccount, tL_starGiftUnique.gift_id);
            h5Var.P0 = p5Var;
            p5Var.a();
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            e4[] e4VarArr = h5Var.a0.H.n;
            if (i10 >= e4VarArr.length) {
                ih.q5 q5Var = new ih.q5(h5Var.getContext(), tL_starGiftUnique.title, h5Var.P0);
                q5Var.c0.addAll(hashSet);
                q5Var.e0.N(true);
                q5Var.d0 = bool.booleanValue();
                q5Var.a0.set(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSelect", 4 - hashSet.size(), new Object[0])));
                q5Var.b0 = new n1(0, callback);
                q5Var.show();
                return;
            }
            TL_stars.StarGift starGift = e4VarArr[i10].h;
            if ((starGift != null ? starGift : null) != null) {
                if (starGift == null) {
                    starGift = null;
                }
                hashSet.add(Long.valueOf(starGift.id));
            }
            i10++;
        }
    }

    public static void g1(final h5 h5Var) {
        TL_stars.SavedStarGift savedStarGift = h5Var.y0;
        if (savedStarGift.unsaved) {
            savedStarGift.unsaved = false;
            i7 F = s7.y(h5Var.currentAccount, false).F(h5Var.T, false);
            if (F != null) {
                TL_stars.SavedStarGift savedStarGift2 = h5Var.y0;
                F.m(savedStarGift2, savedStarGift2.unsaved);
            }
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = h5Var.E1();
            savestargift.unsave = h5Var.y0.unsaved;
            ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(savestargift, null, 64);
        }
        TL_stars.SavedStarGift savedStarGift3 = h5Var.y0;
        boolean z10 = savedStarGift3.pinned_to_top;
        if (((k7) h5Var.z0).m(savedStarGift3, !z10, false)) {
            new ih.w3(h5Var.getContext(), h5Var.T, h5Var.y0, h5Var.resourcesProvider, new Utilities.Callback0Return() { // from class: jh.q1
                @Override // org.telegram.messenger.Utilities.Callback0Return
                public final Object run() {
                    return h5.this.getBulletinFactory();
                }
            }).show();
            return;
        }
        if (z10) {
            j7.l1.v(R.string.Gift2Unpinned, h5Var.getBulletinFactory(), R.raw.ic_unpin, 36);
        } else {
            h5Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
        }
    }

    public static SpannableStringBuilder g2(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new iq(R.drawable.filled_understood, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new iq(R.drawable.filled_reactions, 0), 0, spannableString2.length(), 33);
        AndroidUtilities.replaceMultipleCharSequence("👌", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("👍", spannableStringBuilder, spannableString2);
        return spannableStringBuilder;
    }

    public static void h0(h5 h5Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        TL_stars.SavedStarGift savedStarGift;
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(h5Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(h5Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            s7.y(h5Var.currentAccount, false).T(false);
            s7.y(h5Var.currentAccount, false).P();
            if (!TextUtils.isEmpty(str) && (savedStarGift = h5Var.y0) != null) {
                savedStarGift.flags &= -65537;
                savedStarGift.prepaid_upgrade_hash = null;
            }
            h5Var.m0 = true;
            h5Var.h1 = null;
            h5Var.r1(inputSavedStarGift, tL_payments_paymentResult.updates, new u2(h5Var, str, 0));
            Utilities.stageQueue.postRunnable(new v2(h5Var, tL_payments_paymentResult, 0));
            return;
        }
        if (tL_error == null || !"BALANCE_TOO_LOW".equals(tL_error.text)) {
            h5Var.getBulletinFactory().d0(tL_error, false);
            return;
        }
        if (!MessagesController.getInstance(h5Var.currentAccount).starsPurchaseAvailable()) {
            h5Var.f0.setLoading(false);
            s7.e0(h5Var.getContext(), h5Var.resourcesProvider);
            return;
        }
        s7 y8 = s7.y(h5Var.currentAccount, false);
        u1 u1Var = new u1(h5Var, j10, 3);
        y8.e = false;
        y8.q(false, true, u1Var);
        y8.e = true;
    }

    public static /* synthetic */ void i0(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, kf.a aVar, Runnable runnable) {
        h5Var.getClass();
        TL_stars.StarsAmount o10 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = h5Var.E1();
        updatestargiftprice.resell_amount = o10;
        ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(updatestargiftprice, new r1(h5Var, tL_starGiftUnique, aVar, runnable, 1));
    }

    public static void i1(h5 h5Var, String str) {
        long j10 = h5Var.T;
        h5Var.f0.setLoading(false);
        if (TextUtils.isEmpty(str)) {
            h5Var.q2(0, true, null);
            return;
        }
        h5Var.dismiss();
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (R instanceof tn) {
            tn tnVar = (tn) R;
            if (tnVar.a() == j10) {
                tc.a0(tnVar).M(LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(j10))), R.raw.gift).k(true);
                return;
            }
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(h5Var.currentAccount);
        int i10 = NotificationCenter.closeProfileActivity;
        Long valueOf = Long.valueOf(j10);
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, valueOf, bool);
        NotificationCenter.getInstance(h5Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j10), bool);
        tn R9 = tn.R9(j10);
        R9.whenFullyVisible(new w2(3, h5Var, R9));
        R.presentFragment(R9);
    }

    public static void j0(h5 h5Var, TLObject tLObject, MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        MessagesController.getInstance(h5Var.currentAccount).putUsers(messages_messages.users, false);
        MessagesController.getInstance(h5Var.currentAccount).putChats(messages_messages.chats, false);
        h5Var.F0 = true;
        h5Var.E0 = false;
        Boolean bool = h5Var.b1;
        if (bool != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                ((TLRPC.TL_messageActionStarGift) messageAction).saved = true ^ bool.booleanValue();
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = true ^ bool.booleanValue();
            }
        }
        h5Var.i2(messageObject, null);
    }

    public static void j1(h5 h5Var, boolean z10) {
        int G1 = h5Var.G1();
        if (G1 < 0) {
            return;
        }
        int i10 = (z10 ? 1 : -1) + G1;
        int i11 = h5Var.N0;
        if (i11 >= 0 && (!z10 ? i11 < G1 : i11 > G1)) {
            i10 = i11;
        }
        l7 l7Var = h5Var.z0;
        Object obj = (l7Var == null || i10 < 0 || i10 >= l7Var.e()) ? null : h5Var.z0.get(i10);
        if (obj == null) {
            return;
        }
        if ((z10 ? h5Var.Y : h5Var.X) != null) {
            if (obj instanceof TL_stars.SavedStarGift) {
                if (x1((z10 ? h5Var.Y : h5Var.X).y0, (TL_stars.SavedStarGift) obj)) {
                    return;
                }
            }
            if (obj instanceof TL_stars.TL_starGiftUnique) {
                if (y1((z10 ? h5Var.Y : h5Var.X).C0, (TL_stars.TL_starGiftUnique) obj)) {
                    return;
                }
            }
        }
        ih.m3 m3Var = new ih.m3(h5Var, h5Var.getContext(), h5Var.currentAccount, h5Var.T, h5Var.resourcesProvider, h5Var.U.getRootView());
        if (obj instanceof TL_stars.SavedStarGift) {
            m3Var.j2((TL_stars.SavedStarGift) obj, h5Var.z0);
        } else if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            m3Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, h5Var.z0);
        }
        AndroidUtilities.removeFromParent(m3Var.containerView);
        if (z10) {
            h5Var.Y = m3Var;
        } else {
            h5Var.X = m3Var;
        }
    }

    public static void k0(h5 h5Var, TL_stars.InputSavedStarGift inputSavedStarGift, long j10, long j11, long j12) {
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(ApplicationLoader.applicationContext, 3, null);
        c2Var.q(500L);
        TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
        convertstargift.stargift = inputSavedStarGift;
        ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(convertstargift, new y1(h5Var, c2Var, j10, j11, j12));
    }

    public static void k1(final h5 h5Var, final View view) {
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity == null) {
            return;
        }
        nh.za b10 = view instanceof org.telegram.ui.Cells.c7 ? nh.bb.b((org.telegram.ui.Cells.c7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = h5Var.A0;
        if (messageObject != null) {
            arrayList.add(messageObject);
        } else {
            if (!(h5Var.B1() instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            long clientUserId = UserConfig.getInstance(h5Var.currentAccount).getClientUserId();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) h5Var.B1();
            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
            tL_messageService.peer_id = MessagesController.getInstance(h5Var.currentAccount).getPeer(clientUserId);
            tL_messageService.from_id = MessagesController.getInstance(h5Var.currentAccount).getPeer(clientUserId);
            tL_messageService.date = ConnectionsManager.getInstance(h5Var.currentAccount).getCurrentTime();
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
            tL_messageActionStarGiftUnique.gift = tL_starGiftUnique;
            tL_messageActionStarGiftUnique.upgrade = true;
            tL_messageService.action = tL_messageActionStarGiftUnique;
            MessageObject messageObject2 = new MessageObject(h5Var.currentAccount, tL_messageService, false, false);
            messageObject2.setType();
            arrayList.add(messageObject2);
        }
        final gb E = gb.E(launchActivity, h5Var.currentAccount);
        E.N = new Utilities.Callback4() { // from class: jh.m1
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                gb gbVar = E;
                nh.za zaVar = null;
                if (booleanValue) {
                    h5 h5Var2 = h5.this;
                    AndroidUtilities.runOnUIThread(new ef.c(27, h5Var2, l10));
                    gbVar.Y(null);
                    k3 k3Var = h5Var2.S0;
                    if (k3Var != null) {
                        k3Var.dismiss();
                        h5Var2.S0 = null;
                    }
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.c7) && view2.isAttachedToWindow()) {
                        zaVar = nh.bb.b((org.telegram.ui.Cells.c7) view2);
                    }
                    gbVar.Y(zaVar);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(b10, nh.o7.y(arrayList));
    }

    public static void l0(h5 h5Var, long j10) {
        new ih.h2(h5Var.getContext(), h5Var.currentAccount, j10, null, new y2(h5Var, 2)).show();
    }

    public static void m0(h5 h5Var, org.telegram.ui.ActionBar.c2 c2Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            c2Var.dismiss();
            h5Var.H0 = true;
            h5Var.j2(savedStarGift, null);
            super.show();
            return;
        }
        c2Var.dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            mc Q = tc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
            Q.t = true;
            Q.j();
        }
    }

    public static void n0(h5 h5Var) {
        TL_stars.TL_starGiftUnique K1 = h5Var.K1();
        new n0(h5Var.getContext(), h5Var.currentAccount, DialogObject.getPeerDialogId(K1.owner_id), K1, h5Var.resourcesProvider, new t1(h5Var, 2)).show();
    }

    public static /* synthetic */ void o0(h5 h5Var, String str) {
        h5Var.dismiss();
        ye.d.s(h5Var.getContext(), "https://" + MessagesController.getInstance(h5Var.currentAccount).linkPrefix + "/" + str);
    }

    public static void p0(h5 h5Var) {
        if (h5Var.h1 == null) {
            return;
        }
        long j10 = 0;
        for (int i10 = 0; i10 < h5Var.h1.invoice.prices.size(); i10++) {
            j10 += h5Var.h1.invoice.prices.get(i10).amount;
        }
        f5 f5Var = new f5(h5Var.getContext(), j10, h5Var.e1, h5Var.resourcesProvider);
        h5Var.l0 = f5Var;
        f5Var.show();
    }

    public static /* synthetic */ void q0(h5 h5Var, ye.c cVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(h5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(h5Var, cVar, tL_starGiftUnique, 21));
            return;
        }
        h5Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new g5.v(h5Var, cVar, Long.parseLong(tL_error.text.substring(26)), 3));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(h5Var, cVar, tL_error, 22));
        }
    }

    public static void q1(hz0 hz0Var, TL_stars.StarGiftAttribute starGiftAttribute) {
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
        hz0Var.e(str, starGiftAttribute.name, J1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static /* synthetic */ void r0(h5 h5Var, TL_stars.StarGift starGift, TL_stars.StarGiftAttribute starGiftAttribute, vc[] vcVarArr, boolean[] zArr, ArrayList arrayList) {
        if (arrayList != null) {
            new j1(h5Var.getContext(), h5Var.resourcesProvider, h5Var.currentAccount, starGift.title, arrayList, false).show();
        } else {
            h5Var.o2(vcVarArr[0], LocaleController.formatString(R.string.Gift2RarityHint, ph.j.G0(starGiftAttribute.getRarityPermille())), false);
        }
        zArr[0] = false;
    }

    public static /* synthetic */ void s0(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, kf.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(h5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new i2(h5Var, tL_starGiftUnique, aVar, runnable, 0));
            return;
        }
        h5Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new g5.v(h5Var, Long.parseLong(tL_error.text.substring(26)), runnable, 2));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new j2(h5Var, tL_error, runnable, 0));
        }
    }

    public static /* synthetic */ void u0(h5 h5Var, ArrayList arrayList, Utilities.Callback2 callback2, Runnable runnable) {
        ih.p5 p5Var = h5Var.P0;
        if (p5Var != null) {
            p5Var.b();
            h5Var.P0 = null;
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
        ConnectionsManager.getInstance(h5Var.currentAccount).sendRequestTyped(craftstargift, new org.telegram.messenger.a(), new z1(h5Var, callback2, arrayList, runnable, 0));
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
    public static void v0(h5 h5Var) {
        String str;
        boolean z10;
        int i10;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        iq[] iqVarArr = h5Var.i1;
        nh.d dVar = h5Var.f0;
        int i11 = 1;
        if (h5Var.U0.b == 1 && !h5Var.isDismissed()) {
            TL_stars.InputSavedStarGift E1 = h5Var.E1();
            MessageObject messageObject = h5Var.A0;
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
                TL_stars.SavedStarGift savedStarGift = h5Var.y0;
                if (savedStarGift == null) {
                    return;
                }
                long j12 = savedStarGift.upgrade_stars;
                str = savedStarGift.prepaid_upgrade_hash;
                if (j12 <= 0) {
                }
                z10 = false;
            }
            int currentTime = ConnectionsManager.getInstance(h5Var.currentAccount).getCurrentTime();
            if (h5Var.f1 != null) {
                i10 = 0;
                while (i10 < h5Var.f1.size()) {
                    starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) h5Var.f1.get(i10);
                    if (starGiftUpgradePrice.date >= currentTime) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            i10 = -1;
            starGiftUpgradePrice = null;
            if (h5Var.h1 != null) {
                int i12 = 0;
                while (i12 < h5Var.h1.invoice.prices.size()) {
                    j10 += h5Var.h1.invoice.prices.get(i12).amount;
                    i12++;
                    starGiftUpgradePrice = starGiftUpgradePrice;
                }
            }
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = starGiftUpgradePrice;
            if (i10 > 0 && !h5Var.g1) {
                h5Var.g1 = true;
                if (h5Var.f1 != null) {
                    for (int i13 = 0; i13 < i10; i13++) {
                        h5Var.f1.remove(0);
                    }
                }
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = h5Var.r0.a.q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = E1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(h5Var.currentAccount).getInputPeer(h5Var.T);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                }
                JSONObject p10 = ph.p2.p(h5Var.resourcesProvider, false);
                if (p10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = p10.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(tL_payments_getPaymentForm, new g3(h5Var, i11));
            }
            if (z10) {
                dVar.g(ia.R0(LocaleController.formatString(R.string.Gift2PrepayUpgradeButton, Long.valueOf(j10)), 1.13f, iqVarArr), true, true);
            } else {
                dVar.g(ia.R0(LocaleController.formatString(R.string.Gift2UpgradeButton, Long.valueOf(j10)), 1.13f, iqVarArr), true, true);
            }
            f5 f5Var = h5Var.l0;
            if (f5Var != null) {
                f5Var.P(j10);
            }
            if (starGiftUpgradePrice2 == null) {
                dVar.f(null, true);
                return;
            }
            int i14 = starGiftUpgradePrice2.date - currentTime;
            String formatDuration = i14 < 86400 ? AndroidUtilities.formatDuration(i14, false, true) : LocaleController.formatPluralString("Days", Math.round(i14 / 86400.0f), new Object[0]);
            dVar.e.o(false, true, false);
            dVar.f(LocaleController.formatString(R.string.Gift2UpgradeButtonDecreasesIn, formatDuration), true);
            AndroidUtilities.runOnUIThread(h5Var.j1, 1000L);
        }
    }

    public static void x0(h5 h5Var, TLObject tLObject, eg.w2[] w2VarArr, Long l10, androidx.car.app.utils.b bVar, TLRPC.TL_error tL_error) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (!(tLObject instanceof TLRPC.TL_users_userFull)) {
            mc Y = h5Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
            return;
        }
        TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
        MessagesController.getInstance(h5Var.currentAccount).putUsers(tL_users_userFull.users, false);
        MessagesController.getInstance(h5Var.currentAccount).putChats(tL_users_userFull.chats, false);
        TLRPC.UserFull userFull = tL_users_userFull.full_user;
        if (userFull == null || (disallowedGiftsSettings = userFull.disallowed_stargifts) == null || !disallowedGiftsSettings.disallow_unique_stargifts) {
            bVar.run();
        } else {
            new tc(w2VarArr[0].container, h5Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l10.longValue())))).j();
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

    public static void y0(h5 h5Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        t1 t1Var = h5Var.j1;
        h5Var.g1 = false;
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            mc Y = h5Var.getBulletinFactory().Y(tL_error);
            Y.t = true;
            Y.j();
        } else {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(h5Var.currentAccount).putUsers(paymentForm.users, false);
            h5Var.h1 = paymentForm;
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

    public static void z0(h5 h5Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        i7 F;
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                if (z10 && h5Var.y0 != null && (F = s7.y(h5Var.currentAccount, false).F(h5Var.T, false)) != null) {
                    F.m(h5Var.y0, !savestargift.unsave);
                }
                h5Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
                return;
            }
            return;
        }
        h5Var.dismiss();
        long A1 = h5Var.A1();
        if (!z10) {
            s7.y(h5Var.currentAccount, false).Q(A1);
        }
        if (A1 >= 0) {
            tc.a0(U).s(document, LocaleController.getString(z11 ? R.string.Gift2MadePrivateTitle : R.string.Gift2MadePublicTitle), AndroidUtilities.replaceSingleTag(LocaleController.getString(z11 ? R.string.Gift2MadePrivate : R.string.Gift2MadePublic), U instanceof ProfileActivity ? null : new h2(A1, U))).k(true);
        } else {
            tc.a0(U).s(document, LocaleController.getString(z11 ? R.string.Gift2ChannelMadePrivateTitle : R.string.Gift2ChannelMadePublicTitle), LocaleController.getString(z11 ? R.string.Gift2ChannelMadePrivate : R.string.Gift2ChannelMadePublic)).j();
        }
    }

    public final long A1() {
        TLRPC.Peer peer;
        MessageObject messageObject = this.A0;
        if (messageObject == null) {
            TL_stars.SavedStarGift savedStarGift = this.y0;
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                return starGift instanceof TL_stars.TL_starGiftUnique ? DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift).owner_id) : this.T;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.C0;
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
            return peer2 != null ? DialogObject.getPeerDialogId(peer2) : messageObject.isOutOwner() ? this.A0.getDialogId() : UserConfig.getInstance(this.currentAccount).getClientUserId();
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
        MessageObject messageObject = this.A0;
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
            TL_stars.SavedStarGift savedStarGift = this.y0;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.C0;
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
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((TL_stars.TL_starGiftUnique) B1).title);
        sb2.append(" #");
        return j7.l1.m(r0.num, ',', sb2);
    }

    public final TL_stars.InputSavedStarGift E1() {
        TLRPC.Message message;
        TLRPC.Message message2;
        TLRPC.Message message3;
        long j10 = this.T;
        if (j10 < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            MessageObject messageObject = this.A0;
            if (messageObject == null || (message3 = messageObject.messageOwner) == null) {
                TL_stars.SavedStarGift savedStarGift = this.y0;
                if (savedStarGift != null) {
                    if ((savedStarGift.flags & 2048) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                    return tL_inputSavedStarGiftChat;
                }
                if (this.C0 == null || TextUtils.isEmpty(this.B0)) {
                    return tL_inputSavedStarGiftChat;
                }
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.B0;
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
        MessageObject messageObject2 = this.A0;
        if (messageObject2 != null && messageObject2.getDialogId() < 0 && (message2 = this.A0.messageOwner) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.A0.getDialogId());
                tL_inputSavedStarGiftChat2.saved_id = ((TLRPC.TL_messageActionStarGift) messageAction2).saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        MessageObject messageObject3 = this.A0;
        if (messageObject3 != null && messageObject3.getDialogId() < 0 && (message = this.A0.messageOwner) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat3.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.A0.getDialogId());
                tL_inputSavedStarGiftChat3.saved_id = ((TLRPC.TL_messageActionStarGiftUnique) messageAction3).saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        MessageObject messageObject4 = this.A0;
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
        TL_stars.SavedStarGift savedStarGift2 = this.y0;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        if (this.C0 == null || TextUtils.isEmpty(this.B0)) {
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
        tL_inputSavedStarGiftSlug2.slug = this.B0;
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
        l7 l7Var = this.z0;
        if (l7Var == null) {
            return -1;
        }
        TL_stars.SavedStarGift savedStarGift = this.y0;
        if (savedStarGift != null) {
            indexOf = l7Var.indexOf(savedStarGift);
        } else {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.C0;
            if (tL_starGiftUnique == null) {
                return -1;
            }
            indexOf = l7Var.indexOf(tL_starGiftUnique);
        }
        if (indexOf >= 0) {
            return indexOf;
        }
        TL_stars.StarGift B1 = B1();
        for (int i10 = 0; i10 < this.z0.e(); i10++) {
            Object obj = this.z0.get(i10);
            if (obj instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift2 = this.y0;
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
                if ((obj instanceof TL_stars.TL_starGiftUnique) && y1(this.C0, (TL_stars.TL_starGiftUnique) obj)) {
                    return i10;
                }
            }
        }
        return -1;
    }

    public final TL_stars.SavedStarGift H1(boolean z10) {
        int G1 = G1();
        if (G1 < 0) {
            return null;
        }
        int i10 = (z10 ? 1 : -1) + G1;
        int i11 = this.N0;
        if (i11 >= 0 && (!z10 ? i11 < G1 : i11 > G1)) {
            i10 = i11;
        }
        l7 l7Var = this.z0;
        Object obj = (l7Var == null || i10 < 0 || i10 >= l7Var.e()) ? null : this.z0.get(i10);
        if (obj instanceof TL_stars.SavedStarGift) {
            return (TL_stars.SavedStarGift) obj;
        }
        return null;
    }

    public final TL_stars.TL_starGiftUnique I1(boolean z10) {
        int G1 = G1();
        if (G1 < 0) {
            return null;
        }
        int i10 = (z10 ? 1 : -1) + G1;
        int i11 = this.N0;
        if (i11 >= 0 && (!z10 ? i11 < G1 : i11 > G1)) {
            i10 = i11;
        }
        l7 l7Var = this.z0;
        Object obj = (l7Var == null || i10 < 0 || i10 >= l7Var.e()) ? null : this.z0.get(i10);
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) obj;
        }
        return null;
    }

    @Override // org.telegram.ui.Components.xa
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

    public final boolean L1(boolean z10) {
        return (H1(z10) == null && I1(z10) == null) ? false : true;
    }

    public final void M1(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl = new TL_stars.getStarGiftWithdrawalUrl();
        TL_stars.InputSavedStarGift E1 = E1();
        getstargiftwithdrawalurl.stargift = E1;
        if (E1 == null) {
            return;
        }
        getstargiftwithdrawalurl.password = inputCheckPasswordSRP;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getstargiftwithdrawalurl, new s2(this, twoStepVerificationActivity, 0));
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
        if (this.f0.J || K1 == null) {
            return;
        }
        if (this.C0 != null && this.D0) {
            clientUserId = this.T;
        }
        clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        kf.b bVar = K1.resale_ton_only ? kf.b.b : kf.b.a;
        if (this.C0 == null || !this.D0) {
            c2(K1, clientUserId, bVar, null, true, null);
            return;
        }
        ih.v0 v0Var = new ih.v0(getContext(), this.resourcesProvider, K1, clientUserId);
        v0Var.G = new b3(this, v0Var, K1, clientUserId, bVar, 0);
        v0Var.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
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
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = formatString;
            c2Var.P = LocaleController.getString(R.string.Gift2UnlistText);
            alertDialog$Builder.k(LocaleController.getString(R.string.Gift2ActionUnlist), new c3(this, K1, i11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new d3(i11));
            alertDialog$Builder.o();
            return;
        }
        MessageObject messageObject = this.A0;
        if (messageObject != null && (message2 = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message2.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_resell_at;
                if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                    ia.f1(getContext(), this.currentAccount, null, new e3(this, K1, i11), this.resourcesProvider);
                    return;
                }
                Context context = getContext();
                MessageObject messageObject2 = this.A0;
                if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
                    TLRPC.MessageAction messageAction2 = message.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        i11 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_resell_at;
                        p2(i11 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, true);
                        return;
                    }
                }
                TL_stars.SavedStarGift savedStarGift = this.y0;
                if (savedStarGift != null) {
                    i11 = savedStarGift.can_resell_at;
                }
                p2(i11 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, true);
                return;
            }
        }
        TL_stars.SavedStarGift savedStarGift2 = this.y0;
        i10 = savedStarGift2 != null ? savedStarGift2.can_resell_at : 0;
        if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
        }
    }

    public final void S1() {
        k3 k3Var = this.S0;
        if (k3Var != null && k3Var.isShown()) {
            this.S0.dismiss();
        }
        String F1 = F1();
        k3 k3Var2 = new k3(this, getContext(), F1, F1, this.resourcesProvider);
        this.S0 = k3Var2;
        k3Var2.o0 = new ha.c(this, 21);
        k3Var2.show();
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
        this.b0.setAlpha(this.U0.a(0));
        this.n0.setAlpha(this.U0.a(1));
        this.u0.setAlpha(this.U0.a(2));
        this.w0.setAlpha(this.U0.a(3));
        float a2 = 1.0f - this.U0.a(4);
        FrameLayout frameLayout = this.g0;
        frameLayout.setAlpha(a2);
        a5.d dVar = this.U0;
        d5 d5Var = this.a0;
        d5Var.d(dVar);
        ImageView imageView = d5Var.L;
        if (this.U0.c(0) && (K1 = K1()) != null && !K1.crafted && O1(this.currentAccount, DialogObject.getPeerDialogId(K1.owner_id))) {
            MessageObject messageObject = this.A0;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    }
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.y0;
                if (savedStarGift != null) {
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                    }
                }
            }
            imageView.setVisibility(r4);
            bg.u1 u1Var = this.U;
            float d = u1Var.d();
            this.Z.setAlpha(this.U0.a(0) * Utilities.clamp01(AndroidUtilities.ilerp(d - r6.getHeight(), 0.0f, AndroidUtilities.dp(32.0f))));
            u1Var.e();
            u1Var.invalidate();
            frameLayout.setVisibility(this.U0.c(4) ? 8 : 0);
            s2();
        }
        int i10 = 8;
        imageView.setVisibility(i10);
        bg.u1 u1Var2 = this.U;
        float d10 = u1Var2.d();
        this.Z.setAlpha(this.U0.a(0) * Utilities.clamp01(AndroidUtilities.ilerp(d10 - r6.getHeight(), 0.0f, AndroidUtilities.dp(32.0f))));
        u1Var2.e();
        u1Var2.invalidate();
        frameLayout.setVisibility(this.U0.c(4) ? 8 : 0);
        s2();
    }

    public final void U1() {
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        ia.f1(getContext(), this.currentAccount, K1, new e3(this, K1, 2), this.resourcesProvider);
    }

    public final void V1(long j10, String str) {
        this.c1 = true;
        s7.y(this.currentAccount, false).K(j10, new ih.b1(4, this, str));
    }

    public final void W1(boolean z10) {
        int i10;
        MessageObject messageObject = this.A0;
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
            TL_stars.SavedStarGift savedStarGift = this.y0;
            if (savedStarGift != null) {
                i10 = savedStarGift.can_craft_at;
            }
            i10 = 0;
        }
        int i12 = 1;
        if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string = LocaleController.getString(R.string.GiftCraftLaterTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string;
            c2Var.P = LocaleController.formatString(R.string.GiftCraftLaterText, LocaleController.formatDateTime(i10, true));
            j7.l1.C(R.string.OK, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(K1.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string2 = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
            c2Var2.N = string2;
            c2Var2.P = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
            j7.l1.C(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        d5 d5Var = this.a0;
        if (z10) {
            d5Var.H.a(this.currentAccount, K1.gift_id, K1.getDocument(), K1.title);
            if (t1()) {
                g4 g4Var = d5Var.H;
                TL_stars.TL_starGiftUnique K12 = K1();
                if (K12 == null) {
                    g4Var.getClass();
                } else {
                    while (true) {
                        e4[] e4VarArr = g4Var.n;
                        if (i11 >= e4VarArr.length) {
                            break;
                        }
                        e4 e4Var = e4VarArr[i11];
                        TL_stars.StarGift starGift = e4Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            e4Var.a(K12, true);
                            break;
                        }
                        i11++;
                    }
                    g4Var.d(true);
                }
            }
        }
        g4 g4Var2 = d5Var.H;
        g4 g4Var3 = d5Var.H;
        g4Var2.setOnCraft(new o1(this, i12));
        if (this.P0 == null) {
            ih.p5 p5Var = new ih.p5(this.currentAccount, K1.gift_id);
            this.P0 = p5Var;
            p5Var.a();
        }
        g4Var3.setOnAddGift(new e3(this, K1, i12));
        g4Var3.setOnClose(new t1(this, 18));
        q2(4, true, null);
    }

    public final void X1(long j10) {
        nh.t3 t3Var = this.k1;
        if (t3Var != null) {
            t3Var.e(true);
            this.k1 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
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
        org.telegram.ui.Components.ua uaVar;
        eg.q2 q2Var;
        int i12;
        TLRPC.Message message2;
        TLRPC.Message message3;
        nh.t3 t3Var = this.k1;
        if (t3Var != null) {
            t3Var.e(true);
            this.k1 = null;
        }
        MessageObject messageObject = this.A0;
        if (messageObject != null && (message3 = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_transfer_at;
                if (i10 <= ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                    Context context = getContext();
                    MessageObject messageObject2 = this.A0;
                    if (messageObject2 != null && (message2 = messageObject2.messageOwner) != null) {
                        TLRPC.MessageAction messageAction2 = message2.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            i12 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_transfer_at;
                            p2(i12 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, false);
                            return;
                        }
                    }
                    TL_stars.SavedStarGift savedStarGift = this.y0;
                    i12 = savedStarGift != null ? savedStarGift.can_transfer_at : 0;
                    p2(i12 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, false);
                    return;
                }
                TL_stars.SavedStarGift savedStarGift2 = this.y0;
                if (savedStarGift2 != null) {
                    TL_stars.StarGift starGift = savedStarGift2.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        i11 = savedStarGift2.can_export_at;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                        Context context2 = getContext();
                        int i13 = this.currentAccount;
                        eg.w2[] w2VarArr = {new eg.w2(context2, i13, BirthdayController.getInstance(i13).getState(), 3, this.resourcesProvider)};
                        eg.w2 w2Var = w2VarArr[0];
                        w2Var.v0 = LocaleController.getString(R.string.Gift2TransferShort);
                        uaVar = w2Var.e;
                        if (uaVar != null) {
                            uaVar.setTitle(w2Var.y());
                        }
                        q2Var = w2Var.X;
                        if (q2Var != null) {
                            q2Var.setText(w2Var.y());
                        }
                        int max = currentTime <= i11 ? 0 : Math.max(1, Math.round(Math.max(0, i11 - currentTime) / 86400.0f));
                        eg.w2 w2Var2 = w2VarArr[0];
                        w2Var2.A0 = true;
                        w2Var2.B0 = max;
                        w2Var2.h0(false, true);
                        eg.w2 w2Var3 = w2VarArr[0];
                        w2Var3.x0 = new i3(this, currentTime, i11, max, tL_starGiftUnique2, w2VarArr);
                        w2Var3.show();
                        return;
                    }
                }
                MessageObject messageObject3 = this.A0;
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
                        eg.w2[] w2VarArr2 = {new eg.w2(context22, i132, BirthdayController.getInstance(i132).getState(), 3, this.resourcesProvider)};
                        eg.w2 w2Var4 = w2VarArr2[0];
                        w2Var4.v0 = LocaleController.getString(R.string.Gift2TransferShort);
                        uaVar = w2Var4.e;
                        if (uaVar != null) {
                        }
                        q2Var = w2Var4.X;
                        if (q2Var != null) {
                        }
                        if (currentTime2 <= i11) {
                        }
                        eg.w2 w2Var22 = w2VarArr2[0];
                        w2Var22.A0 = true;
                        w2Var22.B0 = max;
                        w2Var22.h0(false, true);
                        eg.w2 w2Var32 = w2VarArr2[0];
                        w2Var32.x0 = new i3(this, currentTime2, i11, max, tL_starGiftUnique22, w2VarArr2);
                        w2Var32.show();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        TL_stars.SavedStarGift savedStarGift3 = this.y0;
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
        TL_stars.SavedStarGift savedStarGift = this.y0;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            MessageObject messageObject = this.A0;
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
        linearLayout.addView(new i4(getContext(), K1, chat), i7.f6.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.j5, this.resourcesProvider, textView, 1, 16.0f);
        textView.setText(AndroidUtilities.replaceTags(j11 > 0 ? LocaleController.formatPluralStringComma("Gift2TransferPriceText", (int) j11, C1(), DialogObject.getShortName(j10)) : LocaleController.formatString(R.string.Gift2TransferText, C1(), str)));
        linearLayout.addView(textView, i7.f6.t(-1, -2, 48, 24, 4, 24, 4));
        hz0 hz0Var = new hz0(getContext(), this.resourcesProvider);
        q1(hz0Var, s7.l(K1.attributes, TL_stars.starGiftAttributeModel.class));
        q1(hz0Var, s7.l(K1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        q1(hz0Var, s7.l(K1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(K1.slug) && (K1.flags & 256) != 0) {
            hz0Var.c(LocaleController.getString(R.string.GiftValue2), u3.c.e("~", BillingController.getInstance().formatCurrency(K1.value_amount, K1.value_currency, BillingController.getInstance().getCurrencyExp(K1.value_currency), true)), null, null);
        }
        linearLayout.addView(hz0Var, i7.f6.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(j11 > 0 ? ia.Q0(LocaleController.formatString(R.string.Gift2TransferDoPrice, Integer.valueOf((int) j11))) : LocaleController.getString(R.string.Gift2TransferDo), new eg.n(callback, 19));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.T0 = true;
        c2Var.show();
    }

    public final void a2() {
        TL_stars.InputSavedStarGift E1;
        long j10;
        long j11;
        long j12;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        nh.t3 t3Var = this.k1;
        if (t3Var != null) {
            t3Var.e(true);
            this.k1 = null;
        }
        if (this.V0 == null && (E1 = E1()) != null) {
            MessageObject messageObject = this.A0;
            long j13 = this.T;
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
                z13 = tL_messageActionStarGift.prepaid_upgrade ? DialogObject.getPeerDialogId(tL_messageActionStarGift.from_id) != this.A0.getFromChatId() : tL_messageActionStarGift.upgrade_separate;
            } else {
                j10 = 0;
                TL_stars.SavedStarGift savedStarGift = this.y0;
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
                TL_stars.SavedStarGift savedStarGift2 = this.y0;
                str = savedStarGift2.prepaid_upgrade_hash;
                z13 = savedStarGift2.upgrade_separate;
            }
            TextView textView = this.s0;
            if (z10) {
                textView.setText(LocaleController.getString(z12 ? R.string.Gift2AddMyNameNameChannel : R.string.Gift2AddMyNameName));
            } else if (z11) {
                textView.setText(LocaleController.getString(R.string.Gift2AddSenderNameComment));
            } else {
                textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
            }
            boolean z14 = (z10 || j12 <= j10 || z13) ? false : true;
            hp hpVar = this.r0;
            hpVar.a(z14, false);
            ArrayList arrayList = this.d1;
            if (arrayList != null && (j12 > j10 || this.h1 != null)) {
                b2();
                return;
            }
            if (arrayList == null) {
                s7.y(this.currentAccount, false).K(j11, new y2(this, 1));
            }
            if (j12 > j10 || this.h1 != null) {
                return;
            }
            this.g1 = true;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = hpVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = E1;
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j13);
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            JSONObject p10 = ph.p2.p(this.resourcesProvider, false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new g3(this, 0));
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
        boolean z10;
        boolean z11;
        int i10;
        char c3;
        int i11;
        String string;
        String string2;
        MessageObject messageObject = this.A0;
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
            TL_stars.SavedStarGift savedStarGift = this.y0;
            if (savedStarGift == null) {
                return;
            }
            j10 = savedStarGift.upgrade_stars;
            if (j10 <= 0) {
            }
            z10 = false;
        }
        if (this.d1 != null) {
            if (j10 > 0 || this.h1 != null) {
                long j11 = 0;
                if (this.h1 != null) {
                    for (int i12 = 0; i12 < this.h1.invoice.prices.size(); i12++) {
                        j11 += this.h1.invoice.prices.get(i12).amount;
                    }
                }
                s4 s4Var = this.I0;
                d5 d5Var = this.a0;
                if (s4Var == null) {
                    this.I0 = new s4(d5Var);
                }
                s4 s4Var2 = this.I0;
                ArrayList arrayList = this.d1;
                d5 d5Var2 = s4Var2.a;
                ArrayList arrayList2 = s4Var2.g;
                ArrayList arrayList3 = s4Var2.f;
                ArrayList arrayList4 = s4Var2.e;
                int size = arrayList4.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList4.get(i13);
                    i13++;
                    ((q4) obj).a();
                }
                arrayList4.clear();
                arrayList3.clear();
                arrayList2.clear();
                ArrayList m10 = s7.m(arrayList, TL_stars.starGiftAttributeModel.class);
                int size2 = m10.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj2 = m10.get(i14);
                    i14++;
                    q4 q4Var = new q4(d5Var2.c, (TL_stars.starGiftAttributeModel) obj2);
                    if (d5Var2.isAttachedToWindow() && q4Var.c) {
                        q4Var.d.onAttachedToWindow();
                    }
                    arrayList4.add(q4Var);
                }
                ArrayList m11 = s7.m(arrayList, TL_stars.starGiftAttributeBackdrop.class);
                int size3 = m11.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj3 = m11.get(i15);
                    i15++;
                    arrayList3.add(new p4((TL_stars.starGiftAttributeBackdrop) obj3));
                }
                ArrayList m12 = s7.m(arrayList, TL_stars.starGiftAttributePattern.class);
                int size4 = m12.size();
                int i16 = 0;
                while (i16 < size4) {
                    Object obj4 = m12.get(i16);
                    i16++;
                    arrayList2.add(new r4((TL_stars.starGiftAttributePattern) obj4));
                }
                d5Var.setPreviewingAttributes(this.d1);
                TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = null;
                long j12 = this.T;
                if (z10) {
                    z11 = true;
                    d5Var.i(1, LocaleController.getString(R.string.Gift2PrepayUpgradeTitle), LocaleController.formatString(R.string.Gift2PrepayUpgradeText, DialogObject.getShortName(this.currentAccount, j12)), null);
                } else {
                    z11 = true;
                    d5Var.i(1, LocaleController.getString(R.string.Gift2UpgradeTitle), LocaleController.getString(R.string.Gift2UpgradeText), null);
                }
                nh.d dVar = this.f0;
                dVar.setFilled(z11);
                dVar.f(null, z11);
                if (j11 > 0) {
                    int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                    if (this.f1 != null) {
                        int i17 = 0;
                        while (true) {
                            if (i17 >= this.f1.size()) {
                                break;
                            }
                            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) this.f1.get(i17);
                            if (starGiftUpgradePrice2.date >= currentTime) {
                                starGiftUpgradePrice = starGiftUpgradePrice2;
                                break;
                            }
                            i17++;
                        }
                    }
                    ArrayList arrayList5 = this.e1;
                    FrameLayout frameLayout = this.i0;
                    if (arrayList5 == null || starGiftUpgradePrice == null || arrayList5.isEmpty()) {
                        frameLayout.setVisibility(8);
                    } else {
                        frameLayout.setVisibility(0);
                        this.h0.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("**" + LocaleController.getString(R.string.Gift2UpgradeCostsInfo) + "**", new t1(this, 0)), false, AndroidUtilities.dp(0.6666667f), AndroidUtilities.dp(0.66f)));
                    }
                    s2();
                    iq[] iqVarArr = this.i1;
                    if (z10) {
                        i10 = 1;
                        dVar.g(ia.R0(LocaleController.formatString(R.string.Gift2PrepayUpgradeButton, Long.valueOf(j11)), 1.13f, iqVarArr), true, true);
                    } else {
                        i10 = 1;
                        dVar.g(ia.R0(LocaleController.formatString(R.string.Gift2UpgradeButton, Long.valueOf(j11)), 1.13f, iqVarArr), true, true);
                    }
                } else {
                    i10 = 1;
                    dVar.g(LocaleController.getString(R.string.Confirm), true, true);
                }
                dVar.setOnClickListener(new l1(this, i10));
                View view = this.p0;
                LinearLayout linearLayout = this.q0;
                if (z10) {
                    linearLayout.setVisibility(8);
                    view.setVisibility(8);
                    c3 = 0;
                } else {
                    c3 = 0;
                    linearLayout.setVisibility(0);
                    view.setVisibility(0);
                }
                ph.i[] iVarArr = this.o0;
                if (z10) {
                    ph.i iVar = iVarArr[c3];
                    int i18 = R.drawable.menu_feature_unique;
                    String string3 = LocaleController.getString(R.string.Gift2UpgradeFeature1Title);
                    if (z10) {
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
                    ph.i iVar2 = iVarArr[i11];
                    int i20 = R.drawable.menu_feature_transfer;
                    String string4 = LocaleController.getString(R.string.Gift2UpgradeFeature2Title);
                    if (z10) {
                        int i21 = R.string.Gift2PrepayUpgradeFeature2Text;
                        Object[] objArr2 = new Object[i11];
                        objArr2[0] = DialogObject.getShortName(this.currentAccount, j12);
                        string2 = LocaleController.formatString(i21, objArr2);
                    } else {
                        string2 = LocaleController.getString(R.string.Gift2UpgradeFeature2Text);
                    }
                    iVar2.a(string4, string2, i20);
                    iVarArr[2].a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), z10 ? LocaleController.formatString(R.string.Gift2PrepayUpgradeFeature3Text, DialogObject.getShortName(this.currentAccount, j12)) : LocaleController.getString(R.string.Gift2UpgradeFeature3Text), R.drawable.menu_feature_tradable);
                } else {
                    iVarArr[0].a(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
                    iVarArr[1].a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
                    iVarArr[2].a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
                }
                AndroidUtilities.runOnUIThread(new u1(this, j11, 0));
            }
        }
    }

    public final void c2(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final kf.b bVar, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, final ih.v0 v0Var) {
        this.f0.setLoading(true);
        if (v0Var != null && !v0Var.H) {
            v0Var.H = true;
            v0Var.D.h(true);
        }
        s7.x(this.currentAccount, bVar).H(tL_starGiftUnique, j10, tL_textWithEntities, z10, new Utilities.Callback() { // from class: jh.p1
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                h5.a1(h5.this, v0Var, bVar, tL_starGiftUnique, j10, tL_textWithEntities, z10, (TLRPC.TL_payments_paymentFormStarGift) obj);
            }
        });
    }

    @Override // org.telegram.ui.Components.xa, org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        if (this.U0.c(4)) {
            boolean z10 = this.a0.H.d0;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithTouchOutside() {
        if (this.U0.c(4) && this.a0.H.d0) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        if (this.U0.c(4) && this.a0.H.d0) {
            return false;
        }
        return super.canSwipeToBack(motionEvent);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (this.z0 == ((k7) objArr[1])) {
                g4 g4Var = this.a0.H;
                if (g4Var == null || !g4Var.d0) {
                    t2();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        if (this.U0.c(4) && this.a0.H.d0) {
            return;
        }
        ih.p5 p5Var = this.P0;
        if (p5Var != null) {
            p5Var.b();
            this.P0 = null;
        }
        s4 s4Var = this.I0;
        if (s4Var != null) {
            s4Var.a();
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
        return AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.Gift2ReleasedBy2, u3.c.e("@", publicUsername)), new u2(this, publicUsername, 8));
    }

    public final SpannableStringBuilder f2(TL_stars.StarGift starGift) {
        if (starGift == null || (starGift instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return e2(starGift.released_by);
    }

    @Override // org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.k2
    public tc getBulletinFactory() {
        return new tc(this.k0, this.resourcesProvider);
    }

    public final void h2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, l7 l7Var) {
        s4 s4Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.B0 = str;
        this.C0 = tL_starGiftUnique;
        this.z0 = l7Var;
        this.D0 = (tL_starGiftUnique.resell_amount == null || N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) ? false : true;
        if (!this.J0 && (s4Var = this.I0) != null && s4Var.o && (tL_starGiftUnique2 = s4Var.l) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            s4Var.a();
            this.I0 = null;
            d5 d5Var = this.a0;
            d5Var.b.setAlpha(1.0f);
            d5Var.c.setAlpha(0.0f);
        }
        this.Z.b(this.currentAccount, this.y0);
        k2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        boolean z10 = tL_starGiftUnique.host_id != null;
        y80 y80Var = this.c0;
        if (!z10 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            y80Var.setVisibility(8);
        } else {
            y80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new u2(this, str3, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            y80Var.setVisibility(0);
            y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q5, this.resourcesProvider));
        }
        y80 y80Var2 = this.e0;
        if (z10 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            y80Var2.setVisibility(8);
        } else {
            y80Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new u2(this, str3, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            y80Var2.setVisibility(0);
        }
        if (this.D0) {
            l2(tL_starGiftUnique);
            this.f0.setOnClickListener(new l1(this, 7));
        }
        if (this.X0) {
            q2(0, false, null);
            this.c.n0(1);
            this.X0 = false;
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
    /* JADX WARN: Type inference failed for: r7v59, types: [org.telegram.ui.Components.gz0[], org.telegram.ui.Components.iq[], org.telegram.ui.Components.vc[]] */
    /* JADX WARN: Type inference failed for: r7v60 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i2(MessageObject messageObject, l7 l7Var) {
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
        TLRPC.Peer peer4;
        TLRPC.Peer peer5;
        boolean z17;
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
        hz0 hz0Var;
        TL_stars.StarGift starGift2;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        boolean z18;
        int i13;
        boolean z19;
        TL_stars.StarGift starGift3;
        TLRPC.Document document;
        TLRPC.TL_textWithEntities tL_textWithEntities4;
        TL_stars.StarGift starGift4;
        boolean z20;
        boolean z21;
        boolean z22;
        int i14;
        ?? r72;
        CharSequence charSequence2;
        String string2;
        SpannableStringBuilder replaceTags;
        s4 s4Var;
        String string3;
        boolean z23;
        TLObject userOrChat;
        s4 s4Var2;
        TL_stars.InputSavedStarGift E1;
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        boolean z24 = false;
        this.x0 = false;
        this.y0 = null;
        this.A0 = messageObject;
        this.z0 = l7Var;
        this.Z.set(messageObject);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        boolean z25 = messageObject.getDialogId() == clientUserId;
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        boolean z26 = messageAction instanceof TLRPC.TL_messageActionStarGift;
        int i15 = 3;
        d5 d5Var = this.a0;
        nh.d dVar = this.f0;
        if (z26 || (((z23 = messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) && (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift instanceof TL_stars.TL_starGift))) {
            if (!this.J0 && (s4Var = this.I0) != null && s4Var.o && s4Var.l != null) {
                s4Var.a();
                this.I0 = null;
                d5Var.b.setVisibility(0);
                d5Var.c.setVisibility(4);
            }
            boolean isOutOwner = messageObject.isOutOwner();
            if (z25) {
                isOutOwner = false;
            }
            TLRPC.Message message = messageObject.messageOwner;
            int i16 = message.date;
            TLRPC.MessageAction messageAction2 = message.action;
            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                boolean z27 = tL_messageActionStarGift.converted;
                boolean z28 = tL_messageActionStarGift.saved;
                boolean z29 = tL_messageActionStarGift.refunded;
                boolean z30 = tL_messageActionStarGift.name_hidden;
                TL_stars.StarGift starGift5 = tL_messageActionStarGift.gift;
                boolean z31 = tL_messageActionStarGift.can_upgrade;
                long j12 = tL_messageActionStarGift.convert_stars;
                j11 = tL_messageActionStarGift.upgrade_stars;
                TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_messageActionStarGift.message;
                TLRPC.Peer peer7 = tL_messageActionStarGift.from_id;
                TLRPC.Peer peer8 = tL_messageActionStarGift.peer;
                z15 = tL_messageActionStarGift.prepaid_upgrade;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                peer3 = tL_messageActionStarGift.auction_acquired ? tL_messageActionStarGift.to_id : null;
                i10 = tL_messageActionStarGift.gift_num;
                tL_textWithEntities = tL_textWithEntities5;
                peer2 = peer8;
                z14 = z31;
                z10 = z28;
                z12 = z30;
                peer = peer7;
                starGift = starGift5;
                j10 = j12;
                z13 = z27;
                z11 = z29;
            } else {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                z10 = tL_messageActionStarGiftUnique.saved;
                z11 = tL_messageActionStarGiftUnique.refunded;
                starGift = tL_messageActionStarGiftUnique.gift;
                peer = tL_messageActionStarGiftUnique.from_id;
                peer2 = tL_messageActionStarGiftUnique.peer;
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
            long j13 = this.T;
            String shortName = DialogObject.getShortName(j13);
            z16 = z25;
            boolean z32 = isOutOwner;
            boolean isBot = UserObject.isBot(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j13)));
            boolean z33 = peer2 != null && DialogObject.getPeerDialogId(peer2) < 0;
            boolean P1 = P1(this.currentAccount, K1());
            F1();
            d5Var.f(starGift, false, false, P1);
            if (z16) {
                if (i10 == 0 || starGift.title == null) {
                    peer4 = peer3;
                    peer5 = peer;
                    z17 = z12;
                    string2 = LocaleController.getString(R.string.Gift2TitleSaved);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    peer4 = peer3;
                    sb2.append(starGift.title);
                    sb2.append(" #");
                    peer5 = peer;
                    z17 = z12;
                    string2 = j7.l1.m(i10, ',', sb2);
                }
                this.O0 = string2;
                if (z11) {
                    replaceTags = null;
                } else if (z14) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfoUpgrade));
                } else if (j10 > 0) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z13 ? "Gift2SelfInfoConverted" : "Gift2SelfInfoConvert", (int) j10));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfo));
                }
                d5Var.i(0, string2, replaceTags, f2(starGift));
            } else {
                peer4 = peer3;
                peer5 = peer;
                z17 = z12;
                if (z33 && !this.x0) {
                    d5Var.i(0, LocaleController.getString(R.string.Gift2TitleProfile), null, f2(starGift));
                } else if ((z32 || z14) && j11 > 0) {
                    String string4 = LocaleController.getString(z32 ? R.string.Gift2TitleSent : R.string.Gift2TitleReceived);
                    this.O0 = string4;
                    if (z11) {
                        formatString = null;
                    } else if (z32) {
                        i11 = 0;
                        formatString = LocaleController.formatString(R.string.Gift2InfoFreeUpgrade, shortName);
                        d5Var.i(i11, string4, formatString, f2(starGift));
                    } else {
                        formatString = LocaleController.getString(R.string.Gift2InfoInFreeUpgrade);
                    }
                    i11 = 0;
                    d5Var.i(i11, string4, formatString, f2(starGift));
                } else {
                    if (i10 == 0 || starGift.title == null) {
                        string = LocaleController.getString(z32 ? R.string.Gift2TitleSent : R.string.Gift2TitleReceived);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(starGift.title);
                        sb3.append(" #");
                        string = j7.l1.m(i10, ',', sb3);
                    }
                    this.O0 = string;
                    if (z11) {
                        peer6 = peer5;
                        tL_textWithEntities2 = tL_textWithEntities;
                        concat = null;
                        i12 = 0;
                    } else {
                        if (!isBot && E1() != null) {
                            MessageObject messageObject2 = this.A0;
                            if (messageObject2 != null) {
                                TLRPC.MessageAction messageAction3 = messageObject2.messageOwner.action;
                                if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction3;
                                    boolean z34 = tL_messageActionStarGift2.peer != null;
                                    messageObject2.isOutOwner();
                                    this.A0.getDialogId();
                                    UserConfig.getInstance(this.currentAccount).getClientUserId();
                                    int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.A0.messageOwner.date);
                                    if (z34) {
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
                                    if (z32) {
                                        str2 = LocaleController.formatString((!z14 || j11 <= 0) ? R.string.Gift2Info2OutExpired : R.string.Gift2Info2OutUpgrade, shortName);
                                    } else {
                                        str2 = LocaleController.getString(!z10 ? z33 ? R.string.Gift2Info2ChannelKeep : R.string.Gift2Info2BotKeep : z33 ? R.string.Gift2Info2ChannelRemove : R.string.Gift2Info2BotRemove);
                                    }
                                }
                            } else {
                                peer6 = peer5;
                                tL_textWithEntities2 = tL_textWithEntities;
                                TL_stars.SavedStarGift savedStarGift = this.y0;
                                if (savedStarGift != null) {
                                    int currentTime2 = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
                                    if (O1(this.currentAccount, j13)) {
                                        int i17 = this.y0.flags;
                                        if (((j13 < 0 ? 2048 : 8) & i17) != 0) {
                                            if ((i17 & 16) != 0) {
                                                if ((i17 & 2) != 0) {
                                                }
                                            }
                                        }
                                    }
                                }
                                if (z32) {
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
                        if (z32) {
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
                    d5Var.i(i12, string, concat, f2(starGift));
                    hz0Var = this.d0;
                    hz0Var.removeAllViews();
                    long peerDialogId = peer6 == null ? DialogObject.getPeerDialogId(peer6) : z32 ? clientUserId : j13;
                    if (peer2 == null) {
                        j13 = DialogObject.getPeerDialogId(peer2);
                    } else if (!z32) {
                        j13 = clientUserId;
                    }
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                    if (peer4 == null) {
                        long peerDialogId2 = DialogObject.getPeerDialogId(peer4);
                        starGift2 = starGift;
                        this.d0.j(LocaleController.getString(R.string.Gift2To), this.currentAccount, peerDialogId2, new u1(this, peerDialogId2, 4), null, z33 ? null : new u1(this, peerDialogId2, 5));
                    } else {
                        starGift2 = starGift;
                        if (peerDialogId != clientUserId || z15 || z33) {
                            this.d0.j(LocaleController.getString(R.string.Gift2From), this.currentAccount, peerDialogId, new u1(this, peerDialogId, 6), (peerDialogId == clientUserId || peerDialogId == UserObject.ANONYMOUS || UserObject.isDeleted(user) || isBot || z33) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), z33 ? null : new u1(this, peerDialogId, 7));
                        }
                        if (j13 != clientUserId || z33) {
                            this.d0.j(LocaleController.getString(R.string.Gift2To), this.currentAccount, j13, new u1(this, j13, 8), null, z33 ? null : new u1(this, j13, 9));
                        }
                    }
                    hz0Var.f(i16, LocaleController.getString(R.string.StarsTransactionDate));
                    if (starGift2.stars > 0) {
                        String string5 = LocaleController.getString(R.string.Gift2Value);
                        String m10 = j7.l1.m(starGift2.stars + j11, ',', new StringBuilder("⭐️ "));
                        if (!s1() || z11) {
                            r72 = 0;
                            charSequence2 = "";
                        } else {
                            r72 = 0;
                            charSequence2 = wc.b(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) j10), new t1(this, 4), this.resourcesProvider, null);
                        }
                        hz0Var.c(string5, ia.X0(false, TextUtils.concat(m10, " ", charSequence2), 0.8f, r72), r72, r72);
                    }
                    if (starGift2.limited && !z11) {
                        ia.F0(hz0Var, this.currentAccount, starGift2, this.resourcesProvider);
                    }
                    tL_textWithEntities3 = tL_textWithEntities2;
                    if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities3.text) && !z11) {
                        hz0Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
                    }
                    if (z32 && z14 && !z11) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                        if (this.W0 == null) {
                            i14 = 0;
                            this.W0 = new iq(0, new e5(dVar, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider)));
                        } else {
                            i14 = 0;
                        }
                        spannableStringBuilder.setSpan(this.W0, i14, 1, 33);
                        spannableStringBuilder.append((CharSequence) (j11 > 0 ? LocaleController.getString(R.string.Gift2UpgradeButtonFree) : LocaleController.getString(R.string.Gift2UpgradeButtonGift)));
                        dVar.setFilled(true);
                        dVar.g(spannableStringBuilder, !this.X0, true);
                        dVar.f(null, !this.X0);
                        dVar.setOnClickListener(new l1(this, 11));
                    } else if (this.m0 || this.V == null || this.z0 == null || G1() < 0 || this.z0.b(G1()) < 0) {
                        if ((starGift2 instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(str)) {
                            z18 = true;
                            dVar.setFilled(true);
                            dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
                            dVar.f(null, !this.X0);
                            dVar.setOnClickListener(new l1(this, 9));
                        } else {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("^  ");
                            if (this.W0 == null) {
                                i13 = 0;
                                this.W0 = new iq(0, new e5(dVar, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider)));
                            } else {
                                i13 = 0;
                            }
                            z18 = true;
                            spannableStringBuilder2.setSpan(this.W0, i13, 1, 33);
                            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                            dVar.setFilled(true);
                            dVar.g(spannableStringBuilder2, !this.X0, true);
                            dVar.f(null, !this.X0);
                            dVar.setOnClickListener(new l1(this, 8));
                        }
                        tL_textWithEntities4 = tL_textWithEntities3;
                        starGift4 = starGift2;
                        z20 = z10;
                        z21 = z11;
                        z24 = z13;
                        z22 = z32;
                    } else {
                        dVar.setFilled(false);
                        int b10 = this.z0.b(G1());
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                        Object obj = this.z0.get(b10);
                        if (!(obj instanceof TL_stars.SavedStarGift) || (starGift3 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift3.getDocument()) == null) {
                            z19 = true;
                        } else {
                            spannableStringBuilder3.append((CharSequence) " e");
                            z19 = true;
                            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.y5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                        }
                        dVar.g(spannableStringBuilder3, this.X0 ^ z19, z19);
                        dVar.f(null, this.X0 ^ z19);
                        dVar.setOnClickListener(new x1(this, b10, 2));
                    }
                    z18 = true;
                    tL_textWithEntities4 = tL_textWithEntities3;
                    starGift4 = starGift2;
                    z20 = z10;
                    z21 = z11;
                    z24 = z13;
                    z22 = z32;
                }
            }
            peer6 = peer5;
            tL_textWithEntities2 = tL_textWithEntities;
            hz0Var = this.d0;
            hz0Var.removeAllViews();
            if (peer6 == null) {
            }
            if (peer2 == null) {
            }
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
            if (peer4 == null) {
            }
            hz0Var.f(i16, LocaleController.getString(R.string.StarsTransactionDate));
            if (starGift2.stars > 0) {
            }
            if (starGift2.limited) {
                ia.F0(hz0Var, this.currentAccount, starGift2, this.resourcesProvider);
            }
            tL_textWithEntities3 = tL_textWithEntities2;
            if (tL_textWithEntities2 != null) {
                hz0Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
            }
            if (z32) {
            }
            if (this.m0) {
            }
            if (starGift2 instanceof TL_stars.TL_starGift) {
            }
            z18 = true;
            dVar.setFilled(true);
            dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
            dVar.f(null, !this.X0);
            dVar.setOnClickListener(new l1(this, 9));
            tL_textWithEntities4 = tL_textWithEntities3;
            starGift4 = starGift2;
            z20 = z10;
            z21 = z11;
            z24 = z13;
            z22 = z32;
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
                TLRPC.Peer peer10 = tL_messageActionStarGiftUnique2.from_id;
                userOrChat = messagesController.getUserOrChat(peer10 != null ? DialogObject.getPeerDialogId(peer10) : messageObject.getFromChatId());
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique2.gift;
            z21 = tL_messageActionStarGiftUnique2.refunded;
            k2(tL_starGiftUnique, z21, userOrChat, tL_messageActionStarGiftUnique2.message);
            boolean z35 = tL_messageActionStarGiftUnique2.saved;
            starGift4 = tL_messageActionStarGiftUnique2.gift;
            z22 = (tL_messageActionStarGiftUnique2.upgrade ^ true) == messageObject.isOutOwner();
            if (messageObject.getDialogId() == clientUserId) {
                z22 = false;
            }
            if (!this.G0 && !this.H0 && this.A0 != null && (E1 = E1()) != null) {
                this.G0 = true;
                s7.y(this.currentAccount, false).M(E1, new y2(this, i15));
            }
            if (this.J0 || (s4Var2 = this.I0) == null || !s4Var2.o || (r5 = s4Var2.l) == null) {
                z20 = z35;
            } else {
                if (starGift4 != null) {
                    z20 = z35;
                } else {
                    z20 = z35;
                }
                s4Var2.a();
                this.I0 = null;
                d5Var.b.setAlpha(1.0f);
                d5Var.c.setAlpha(0.0f);
            }
            tL_textWithEntities4 = null;
            peer4 = null;
            z16 = z25;
            z18 = true;
            z17 = false;
        }
        if (this.a1) {
            dVar.setFilled(z18);
            dVar.g(LocaleController.getString(R.string.GiftCraftButtonNext), false, z18);
            dVar.setOnClickListener(new l1(this, 10));
        }
        String str3 = starGift4 == null ? null : starGift4.owner_address;
        String str4 = starGift4 == null ? null : starGift4.gift_address;
        boolean z36 = (starGift4 == null || starGift4.host_id == null) ? false : true;
        y80 y80Var = this.c0;
        if (z21) {
            y80Var.setVisibility(0);
            y80Var.setText(LocaleController.getString(R.string.Gift2Refunded));
            y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, this.resourcesProvider));
        } else if (z36 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            y80Var.setVisibility(0);
            y80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new u2(this, str4, 5)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q5, this.resourcesProvider));
        } else if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && z17 && !z16) {
            y80Var.setVisibility(0);
            if (z22) {
                string3 = LocaleController.formatString((tL_textWithEntities4 == null || TextUtils.isEmpty(tL_textWithEntities4.text)) ? R.string.Gift2OutSenderHidden2 : R.string.Gift2OutSenderMessageHidden2, DialogObject.getShortName(messageObject.getDialogId()));
            } else {
                string3 = LocaleController.getString((tL_textWithEntities4 == null || TextUtils.isEmpty(tL_textWithEntities4.text)) ? R.string.Gift2InSenderHidden2 : R.string.Gift2InSenderMessageHidden2);
            }
            y80Var.setText(string3);
            y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q5, this.resourcesProvider));
        } else {
            y80Var.setVisibility(8);
        }
        y80 y80Var2 = this.e0;
        if (!z36 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            y80Var2.setVisibility(0);
            y80Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new u2(this, str4, 6)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
        } else if (z24 || z21 || starGift4 == null || !N1(this.currentAccount, A1()) || peer4 != null) {
            y80Var2.setVisibility(8);
        } else {
            y80Var2.setVisibility(0);
            if (A1() >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (!z20) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new iq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(z20 ? R.string.Gift2ProfileVisible4 : R.string.Gift2ProfileInvisible4), new t1(this, 3)));
                y80Var2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder4, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                y80Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(z20 ? R.string.Gift2ChannelProfileVisible3 : R.string.Gift2ChannelProfileInvisible3), new t1(this, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
        }
        if (this.X0) {
            q2(0, false, null);
            this.c.n0(1);
            this.X0 = false;
        }
        this.e.setTitle(this.O0);
        t2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32, types: [org.telegram.ui.Components.gz0[], org.telegram.ui.Components.iq[], org.telegram.ui.Components.vc[]] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v48, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v49 */
    public final void j2(TL_stars.SavedStarGift savedStarGift, l7 l7Var) {
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
        boolean z10;
        int i12;
        String string2;
        CharSequence replaceTags;
        TL_stars.StarGift starGift3;
        ?? r13;
        s4 s4Var;
        if (savedStarGift == null) {
            return;
        }
        int i13 = this.currentAccount;
        long j11 = this.T;
        this.x0 = N1(i13, j11);
        this.y0 = savedStarGift;
        this.z0 = l7Var;
        this.A0 = null;
        boolean z11 = this.J0;
        d5 d5Var = this.a0;
        if (!z11 && (s4Var = this.I0) != null && s4Var.o && s4Var.l != null) {
            s4Var.a();
            this.I0 = null;
            d5Var.b.setVisibility(0);
            d5Var.c.setVisibility(4);
        }
        this.Z.b(this.currentAccount, savedStarGift);
        String shortName = DialogObject.getShortName(j11);
        long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
        boolean isBot = UserObject.isBot(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)));
        int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        if ((savedStarGift.flags & 2) == 0) {
            peerDialogId = 2666000;
        }
        boolean z12 = j11 < 0;
        TLRPC.TL_textWithEntities tL_textWithEntities = savedStarGift.message;
        boolean z13 = savedStarGift.refunded;
        TL_stars.StarGift starGift4 = savedStarGift.gift;
        if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
            str = starGift4.owner_address;
            str2 = starGift4.gift_address;
            z10 = starGift4.host_id != null;
            k2((TL_stars.TL_starGiftUnique) starGift4, z13, !savedStarGift.name_hidden ? MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(savedStarGift.from_id)) : null, savedStarGift.message);
        } else {
            boolean z14 = this.x0 && clientUserId == peerDialogId && j11 >= 0;
            boolean P1 = P1(this.currentAccount, K1());
            F1();
            d5Var.f(starGift4, false, false, P1);
            hz0 hz0Var = this.d0;
            hz0Var.removeAllViews();
            CharSequence charSequence2 = "";
            if (z14) {
                if (savedStarGift.gift_num == 0 || (starGift3 = savedStarGift.gift) == null || starGift3.title == null) {
                    j10 = clientUserId;
                    string2 = LocaleController.getString(R.string.Gift2TitleSaved);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(savedStarGift.gift.title);
                    sb2.append(" #");
                    j10 = clientUserId;
                    string2 = j7.l1.m(savedStarGift.gift_num, ',', sb2);
                }
                this.O0 = string2;
                if (z13) {
                    replaceTags = null;
                } else if (savedStarGift.can_upgrade) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfoUpgrade));
                } else {
                    long j12 = savedStarGift.convert_stars;
                    replaceTags = j12 > 0 ? AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SelfInfoConvert", (int) j12)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfo));
                }
                d5Var.i(0, string2, replaceTags, f2(savedStarGift.gift));
            } else {
                j10 = clientUserId;
                if (!z12 || this.x0) {
                    boolean z15 = this.x0;
                    if ((!z15 || savedStarGift.can_upgrade) && savedStarGift.upgrade_stars > 0) {
                        String string3 = LocaleController.getString(z15 ? R.string.Gift2TitleReceived : R.string.Gift2TitleProfile);
                        this.O0 = string3;
                        d5Var.i(0, string3, (!z13 && this.x0) ? LocaleController.getString(R.string.Gift2InfoInFreeUpgrade) : null, f2(savedStarGift.gift));
                    } else {
                        if (savedStarGift.gift_num == 0 || (starGift = savedStarGift.gift) == null || starGift.title == null) {
                            string = LocaleController.getString(z15 ? R.string.Gift2TitleReceived : R.string.Gift2TitleProfile);
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(savedStarGift.gift.title);
                            sb3.append(" #");
                            string = j7.l1.m(savedStarGift.gift_num, ',', sb3);
                        }
                        this.O0 = string;
                        if (z13 || !this.x0) {
                            i10 = 0;
                            charSequence = null;
                        } else {
                            if (isBot || !s1()) {
                                if (this.x0) {
                                    formatString = LocaleController.getString(savedStarGift.unsaved ? z12 ? R.string.Gift2Info2ChannelKeep : R.string.Gift2Info2BotKeep : z12 ? R.string.Gift2Info2ChannelRemove : R.string.Gift2Info2BotRemove);
                                } else {
                                    formatString = LocaleController.formatString((!savedStarGift.can_upgrade || savedStarGift.upgrade_stars <= 0) ? R.string.Gift2Info2OutExpired : R.string.Gift2Info2OutUpgrade, shortName);
                                }
                            } else if (this.x0) {
                                formatString = LocaleController.formatPluralStringComma(currentTime <= 0 ? z12 ? "Gift2Info2ChannelExpired" : "Gift2Info2Expired" : z12 ? "Gift2Info3Channel" : "Gift2Info3", (int) savedStarGift.convert_stars);
                            } else {
                                formatString = LocaleController.formatPluralStringComma("Gift2Info2Out", (int) savedStarGift.convert_stars, shortName);
                            }
                            i10 = 0;
                            charSequence = TextUtils.concat(AndroidUtilities.replaceTags(formatString), " ", (isBot || !s1()) ? charSequence2 : AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new t1(this, 1)), true));
                        }
                        d5Var.i(i10, string, charSequence, f2(savedStarGift.gift));
                    }
                } else {
                    String string4 = LocaleController.getString(R.string.Gift2TitleProfile);
                    this.O0 = string4;
                    d5Var.i(0, string4, null, e2(savedStarGift.gift.released_by));
                }
            }
            if (j10 != peerDialogId || z12) {
                this.d0.j(LocaleController.getString(R.string.Gift2From), this.currentAccount, peerDialogId, new u1(this, peerDialogId, 1), (peerDialogId == j10 || peerDialogId == UserObject.ANONYMOUS || isBot || UserObject.isDeleted(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId))) || z12) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), new u1(this, peerDialogId, 2));
            }
            hz0Var.c(LocaleController.getString(R.string.StarsTransactionDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(savedStarGift.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(savedStarGift.date * 1000))), null, null);
            String string5 = LocaleController.getString(R.string.Gift2Value);
            String m10 = j7.l1.m(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
            if (!s1() || z13) {
                r12 = 0;
            } else {
                r12 = 0;
                charSequence2 = wc.b(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) savedStarGift.convert_stars), new t1(this, 4), this.resourcesProvider, null);
            }
            hz0Var.c(string5, ia.X0(false, TextUtils.concat(m10, " ", charSequence2), 0.8f, r12), r12, r12);
            TL_stars.StarGift starGift5 = savedStarGift.gift;
            if (starGift5.limited && !z13) {
                ia.F0(hz0Var, this.currentAccount, starGift5, this.resourcesProvider);
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
            if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text) && !z13) {
                TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
                hz0Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
            }
            boolean z16 = this.x0;
            nh.d dVar = this.f0;
            if (z16 && savedStarGift.can_upgrade) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                if (this.W0 == null) {
                    i12 = 0;
                    this.W0 = new iq(0, new e5(dVar, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider)));
                } else {
                    i12 = 0;
                }
                spannableStringBuilder.setSpan(this.W0, i12, 1, 33);
                spannableStringBuilder.append((CharSequence) (savedStarGift.upgrade_stars > 0 ? LocaleController.getString(R.string.Gift2UpgradeButtonFree) : LocaleController.getString(R.string.Gift2UpgradeButtonGift)));
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder, !this.X0, true);
                dVar.f(null, !this.X0);
                dVar.setOnClickListener(new l1(this, 3));
            } else if (this.m0 && z16 && this.V != null && this.z0 != null && G1() >= 0 && this.z0.b(G1()) >= 0) {
                dVar.setFilled(false);
                int b10 = this.z0.b(G1());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                Object obj = this.z0.get(b10);
                if (!(obj instanceof TL_stars.SavedStarGift) || (starGift2 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift2.getDocument()) == null) {
                    r122 = 1;
                } else {
                    spannableStringBuilder2.append((CharSequence) " e");
                    r122 = 1;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.y5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                }
                dVar.g(spannableStringBuilder2, (this.X0 ? 1 : 0) ^ r122, r122);
                dVar.f(null, (this.X0 ? 1 : 0) ^ r122);
                dVar.setOnClickListener(new x1(this, b10, r122));
            } else if (!(savedStarGift.gift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
                dVar.f(null, !this.X0);
                dVar.setOnClickListener(new l1(this, 6));
            } else {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                if (this.W0 == null) {
                    i11 = 0;
                    this.W0 = new iq(0, new e5(dVar, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider)));
                } else {
                    i11 = 0;
                }
                spannableStringBuilder3.setSpan(this.W0, i11, 1, 33);
                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder3, !this.X0, true);
                dVar.f(null, !this.X0);
                dVar.setOnClickListener(new l1(this, 5));
            }
            str = null;
            str2 = null;
            z10 = false;
        }
        boolean z17 = savedStarGift.refunded;
        y80 y80Var = this.c0;
        if (z17) {
            y80Var.setVisibility(0);
            y80Var.setText(LocaleController.getString(R.string.Gift2Refunded));
            y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, this.resourcesProvider));
        } else if (z10 && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            y80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new u2(this, str2, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            y80Var.setVisibility(0);
            y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q5, this.resourcesProvider));
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && this.x0 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
            y80Var.setVisibility(0);
            y80Var.setText(LocaleController.getString((tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? R.string.Gift2InSenderHidden2 : R.string.Gift2InSenderMessageHidden2));
            y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q5, this.resourcesProvider));
        } else {
            y80Var.setVisibility(8);
        }
        y80 y80Var2 = this.e0;
        if (!z10 && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            y80Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new u2(this, str2, 2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            r13 = 0;
            y80Var2.setVisibility(0);
        } else if (this.x0 && N1(this.currentAccount, j11)) {
            if (j11 >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new iq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(!savedStarGift.unsaved ? R.string.Gift2ProfileVisible4 : R.string.Gift2ProfileInvisible4), new t1(this, 3)));
                y80Var2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder4, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                y80Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(!savedStarGift.unsaved ? R.string.Gift2ChannelProfileVisible3 : R.string.Gift2ChannelProfileInvisible3), new t1(this, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
            r13 = 0;
            y80Var2.setVisibility(0);
        } else {
            r13 = 0;
            y80Var2.setVisibility(8);
        }
        if (this.X0) {
            q2(r13, r13, null);
            this.c.n0(1);
            this.X0 = r13;
        }
        this.e.setTitle(this.O0);
        t2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x04c9, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique) r4).drop_original_details_stars >= 0) goto L120;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r3v14, types: [org.telegram.ui.Components.gz0[], org.telegram.ui.Components.vc[]] */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v77 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        d5 d5Var;
        long j10;
        CharSequence charSequence;
        CharSequence charSequence2;
        Spannable spannable;
        hz0 hz0Var;
        Class cls;
        ?? r13;
        hz0 hz0Var2;
        int i10;
        TL_stars.starGiftAttributeOriginalDetails stargiftattributeoriginaldetails;
        Class cls2;
        s4 s4Var;
        nh.d dVar;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        s4 s4Var2;
        t1 t1Var;
        boolean z11;
        Object obj;
        Object obj2;
        CharSequence formatSpannable;
        TLRPC.Message message;
        MessageObject messageObject;
        hz0 hz0Var3;
        boolean z12;
        s4 s4Var3;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        long peerDialogId = DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
        long peerDialogId2 = DialogObject.getPeerDialogId(tL_starGiftUnique.host_id);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.O0 = j7.l1.m(tL_starGiftUnique.num, ',', sb2);
        boolean z13 = this.J0;
        d5 d5Var2 = this.a0;
        if (z13 || (s4Var3 = this.I0) == null || !s4Var3.o || (tL_starGiftUnique2 = s4Var3.l) == null) {
            d5Var = d5Var2;
            j10 = peerDialogId;
        } else {
            j10 = peerDialogId;
            if (tL_starGiftUnique2.id != tL_starGiftUnique.id) {
                s4Var3.a();
                this.I0 = null;
                d5Var = d5Var2;
                d5Var.b.setAlpha(1.0f);
                d5Var.c.setAlpha(0.0f);
                long j11 = j10;
                boolean O1 = O1(this.currentAccount, j11);
                boolean O12 = O1(this.currentAccount, peerDialogId2);
                boolean P1 = P1(this.currentAccount, K1());
                F1();
                d5Var.f(tL_starGiftUnique, O1, O12, P1);
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) tL_starGiftUnique.title);
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) ("#" + LocaleController.formatNumber(tL_starGiftUnique.num, ',')));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                spannableStringBuilder.setSpan(new cu(190, 0), length, spannableStringBuilder.length(), 33);
                if (tLObject == null) {
                    charSequence2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UniqueGiftFrom, DialogObject.getShortName(tLObject)));
                } else if (tL_starGiftUnique.released_by != null || stargiftattributemodel == null) {
                    charSequence = null;
                    if (tL_textWithEntities != null) {
                        TextPaint textPaint = d5Var.C;
                        TextPaint textPaint2 = d5Var.C;
                        if (textPaint != null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                            MessageObject.addEntitiesToText(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false);
                            spannable = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder2, textPaint2.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint2.getFontMetricsInt());
                            d5 d5Var3 = d5Var;
                            d5Var3.h(0, spannableStringBuilder, charSequence, e2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                            boolean z14 = false;
                            boolean z15 = false;
                            boolean z16 = false;
                            ?? r32 = 0;
                            this.Y0 = null;
                            hz0 hz0Var4 = this.d0;
                            hz0Var4.removeAllViews();
                            int i11 = 22;
                            int i12 = 19;
                            if (!z10) {
                                hz0Var = hz0Var4;
                                cls = TL_stars.starGiftAttributeModel.class;
                            } else if (tL_starGiftUnique.host_id != null) {
                                if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                                    hz0Var4.m(LocaleController.getString(R.string.Gift2HostAddress), tL_starGiftUnique.owner_address, new t1(this, i12));
                                }
                                if (peerDialogId2 != 0) {
                                    cls = TL_stars.starGiftAttributeModel.class;
                                    z15 = false;
                                    this.Y0 = ((ez0) this.d0.l(LocaleController.getString(R.string.Gift2Host), this.currentAccount, peerDialogId2, new u1(this, peerDialogId2, 10)).getChildAt(1)).getChildAt(0);
                                } else {
                                    cls = TL_stars.starGiftAttributeModel.class;
                                }
                                hz0Var = hz0Var4;
                                z14 = z15;
                            } else {
                                cls = TL_stars.starGiftAttributeModel.class;
                                ?? r11 = 0;
                                z12 = false;
                                if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                                    hz0Var4.m(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_address, new t1(this, i11));
                                } else if (j11 == 0 && tL_starGiftUnique.owner_name != null) {
                                    hz0Var4.c(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_name, null, null);
                                } else if (j11 != 0) {
                                    r13 = 1;
                                    hz0Var2 = hz0Var4;
                                    this.Y0 = ((ez0) this.d0.l(LocaleController.getString(R.string.Gift2Owner), this.currentAccount, j11, new u1(this, j11, 11)).getChildAt(1)).getChildAt(0);
                                    p1(s7.l(tL_starGiftUnique.attributes, cls));
                                    p1(s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                                    p1(s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                    if (z10) {
                                        if (this.A0 == null) {
                                            i10 = 33;
                                            hz0Var2.c(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), r32, r32);
                                        } else if (this.F0) {
                                            i10 = 33;
                                            hz0Var2.c(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), r32, r32);
                                        } else {
                                            TextView textView = (TextView) ((ez0) hz0Var2.c(LocaleController.getString(R.string.Gift2Quantity), "", r32, r32).getChildAt(r13)).getChildAt(r11);
                                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x ");
                                            d90 d90Var = new d90(textView, AndroidUtilities.dp(90.0f), r11, this.resourcesProvider);
                                            int i13 = org.telegram.ui.ActionBar.g6.G6;
                                            d90Var.a(org.telegram.ui.ActionBar.g6.l1(0.21f, org.telegram.ui.ActionBar.g6.v0(i13, this.resourcesProvider)), org.telegram.ui.ActionBar.g6.l1(0.08f, org.telegram.ui.ActionBar.g6.v0(i13, this.resourcesProvider)));
                                            i10 = 33;
                                            spannableStringBuilder3.setSpan(d90Var, r11, r13, 33);
                                            textView.setText(spannableStringBuilder3, TextView.BufferType.SPANNABLE);
                                            if (!this.E0 && !this.F0 && (messageObject = this.A0) != null) {
                                                this.E0 = r13;
                                                int id2 = messageObject.getId();
                                                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                                tL_messages_getMessages.id.add(Integer.valueOf(id2));
                                                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new s1(this, id2, r11));
                                            }
                                        }
                                        if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                                            this.d0.e(LocaleController.getString(R.string.GiftValue2), u3.c.e("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), LocaleController.getString(R.string.GiftValue2LearnMore), new androidx.car.app.utils.b(this, tL_starGiftUnique, BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency), 25), null);
                                        }
                                    } else {
                                        i10 = 33;
                                    }
                                    stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                                    if (stargiftattributeoriginaldetails == null) {
                                        if ((stargiftattributeoriginaldetails.flags & r13) != 0) {
                                            long peerDialogId3 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.sender_id);
                                            SpannableString spannableString = new SpannableString(DialogObject.getName(peerDialogId3));
                                            spannableString.setSpan(new n3(this, peerDialogId3), r11, spannableString.length(), i10);
                                            obj = spannableString;
                                        } else {
                                            obj = null;
                                        }
                                        Object obj3 = obj;
                                        long peerDialogId4 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.recipient_id);
                                        SpannableString spannableString2 = new SpannableString(DialogObject.getName(peerDialogId4));
                                        spannableString2.setSpan(new o3(this, peerDialogId4), r11, spannableString2.length(), i10);
                                        if (stargiftattributeoriginaldetails.message != null) {
                                            TextPaint textPaint3 = new TextPaint((int) r13);
                                            textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
                                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                                            MessageObject.addEntitiesToText(spannableStringBuilder4, stargiftattributeoriginaldetails.message.entities, false, false, false, false);
                                            obj2 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder4, textPaint3.getFontMetricsInt(), r11), stargiftattributeoriginaldetails.message.entities, textPaint3.getFontMetricsInt());
                                        } else {
                                            obj2 = null;
                                        }
                                        cls2 = TL_stars.starGiftAttributePattern.class;
                                        Object replaceAll = LocaleController.getInstance().getFormatterYear().format(stargiftattributeoriginaldetails.date * 1000).replaceAll("\\.", "/");
                                        if (stargiftattributeoriginaldetails.sender_id == stargiftattributeoriginaldetails.recipient_id) {
                                            if (obj2 == null) {
                                                int i14 = R.string.Gift2AttributeOriginalDetailsSelf;
                                                Object[] objArr = new Object[2];
                                                objArr[r11] = obj3;
                                                objArr[r13] = replaceAll;
                                                formatSpannable = LocaleController.formatSpannable(i14, objArr);
                                            } else {
                                                int i15 = R.string.Gift2AttributeOriginalDetailsSelfComment;
                                                Object[] objArr2 = new Object[3];
                                                objArr2[r11] = obj3;
                                                objArr2[r13] = replaceAll;
                                                objArr2[2] = obj2;
                                                formatSpannable = LocaleController.formatSpannable(i15, objArr2);
                                            }
                                        } else if (obj3 != null) {
                                            if (obj2 == null) {
                                                int i16 = R.string.Gift2AttributeOriginalDetails;
                                                Object[] objArr3 = new Object[3];
                                                objArr3[r11] = obj3;
                                                objArr3[r13] = spannableString2;
                                                objArr3[2] = replaceAll;
                                                formatSpannable = LocaleController.formatSpannable(i16, objArr3);
                                            } else {
                                                int i17 = R.string.Gift2AttributeOriginalDetailsComment;
                                                Object[] objArr4 = new Object[4];
                                                objArr4[r11] = obj3;
                                                objArr4[r13] = spannableString2;
                                                objArr4[2] = replaceAll;
                                                objArr4[3] = obj2;
                                                formatSpannable = LocaleController.formatSpannable(i17, objArr4);
                                            }
                                        } else if (obj2 == null) {
                                            int i18 = R.string.Gift2AttributeOriginalDetailsNoSender;
                                            Object[] objArr5 = new Object[2];
                                            objArr5[r11] = spannableString2;
                                            objArr5[r13] = replaceAll;
                                            formatSpannable = LocaleController.formatSpannable(i18, objArr5);
                                        } else {
                                            int i19 = R.string.Gift2AttributeOriginalDetailsNoSenderComment;
                                            Object[] objArr6 = new Object[3];
                                            objArr6[r11] = spannableString2;
                                            objArr6[r13] = replaceAll;
                                            objArr6[2] = obj2;
                                            formatSpannable = LocaleController.formatSpannable(i19, objArr6);
                                        }
                                        if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                                            TL_stars.SavedStarGift savedStarGift = this.y0;
                                            if (savedStarGift == null || savedStarGift.drop_original_details_stars < 0) {
                                                MessageObject messageObject2 = this.A0;
                                                if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
                                                    TLRPC.MessageAction messageAction = message.action;
                                                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                    }
                                                }
                                            }
                                            LinearLayout linearLayout = new LinearLayout(getContext());
                                            linearLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                                            linearLayout.setOrientation(r11);
                                            gh.s sVar = new gh.s(getContext());
                                            sVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, this.resourcesProvider));
                                            sVar.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, this.resourcesProvider));
                                            sVar.setTextSize(r13, 12.0f);
                                            sVar.setGravity(3);
                                            sVar.setText(formatSpannable);
                                            linearLayout.addView(sVar, i7.f6.o(-1, -2, 1.0f, 19));
                                            ImageView imageView = new ImageView(getContext());
                                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                                            int i20 = org.telegram.ui.ActionBar.g6.Oh;
                                            imageView.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(i20, this.resourcesProvider)), 6, 6));
                                            imageView.setImageResource(R.drawable.menu_delete_old);
                                            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i20, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
                                            i7.h6.a(imageView);
                                            imageView.setOnClickListener(new ag.n(22, this, formatSpannable));
                                            linearLayout.addView(imageView, i7.f6.p(32, 32, 0.0f, 21, 8, 0, 0, 0));
                                            TableRow tableRow = new TableRow(getContext());
                                            TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
                                            layoutParams.span = 2;
                                            tableRow.addView(new fz0(hz0Var2, linearLayout, r13), layoutParams);
                                            hz0Var2.addView(tableRow);
                                        }
                                        fz0 a2 = hz0Var2.a(formatSpannable);
                                        a2.setFilled(r13);
                                        gh.s sVar2 = (gh.s) a2.getChildAt(r11);
                                        sVar2.setTextSize(r13, 12.0f);
                                        sVar2.setGravity(17);
                                    } else {
                                        cls2 = TL_stars.starGiftAttributePattern.class;
                                    }
                                    s4Var = this.I0;
                                    dVar = this.f0;
                                    if (s4Var != null || !s4Var.o) {
                                        if (!N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id)) || tL_starGiftUnique.resell_amount == null) {
                                            if (this.m0 || this.V == null || this.z0 == null || G1() < 0 || this.z0.b(G1()) < 0) {
                                                dVar.setFilled(r13);
                                                dVar.g(LocaleController.getString(R.string.OK), (this.X0 ? 1 : 0) ^ r13, r13);
                                                dVar.f(null, (this.X0 ? 1 : 0) ^ r13);
                                                dVar.setOnClickListener(new l1(this, 25));
                                            } else {
                                                dVar.setFilled(r11);
                                                int b10 = this.z0.b(G1());
                                                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                                spannableStringBuilder5.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                                                Object obj4 = this.z0.get(b10);
                                                if ((obj4 instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj4).gift) != null && (document = starGift.getDocument()) != null) {
                                                    spannableStringBuilder5.append((CharSequence) " e");
                                                    spannableStringBuilder5.setSpan(new org.telegram.ui.Components.y5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder5.length() - r13, spannableStringBuilder5.length(), 33);
                                                }
                                                dVar.g(spannableStringBuilder5, (this.X0 ? 1 : 0) ^ r13, r13);
                                                dVar.f(null, (this.X0 ? 1 : 0) ^ r13);
                                                dVar.setOnClickListener(new x1(this, b10, 3));
                                            }
                                            this.e.setTitle(this.O0);
                                            s4Var2 = this.I0;
                                            if (s4Var2 == null) {
                                                return;
                                            }
                                            boolean z17 = this.J0;
                                            t1 t1Var2 = new t1(this, 23);
                                            t1 t1Var3 = new t1(this, 20);
                                            ArrayList arrayList = s4Var2.f;
                                            d5 d5Var4 = s4Var2.a;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique3 = s4Var2.l;
                                            if (tL_starGiftUnique3 != null) {
                                                t1Var = t1Var3;
                                                if (tL_starGiftUnique3.id == tL_starGiftUnique.id) {
                                                    z11 = s4Var2.o;
                                                    if (z11) {
                                                        return;
                                                    }
                                                    d5Var3.b.setAlpha(0.0f);
                                                    d5Var3.c.setAlpha(1.0f);
                                                    dVar.g(LocaleController.getString(R.string.GiftSkipAnimation), true, true);
                                                    dVar.setFilled(true);
                                                    dVar.setOnClickListener(new l1(this, 23));
                                                    int length2 = ((h5) this.M0.d).L0.length - 1;
                                                    jl0 jl0Var = this.d;
                                                    jl0Var.u0(length2);
                                                    jl0Var.post(new t1(this, 21));
                                                    return;
                                                }
                                            } else {
                                                t1Var = t1Var3;
                                            }
                                            if (z17) {
                                                org.telegram.ui.Components.t9 upgradeImageView = d5Var4.getUpgradeImageView();
                                                v4 v4Var = d5Var4.c;
                                                TL_stars.starGiftAttributeModel upgradeImageViewAttribute = d5Var4.getUpgradeImageViewAttribute();
                                                TL_stars.starGiftAttributePattern upgradePatternAttribute = d5Var4.getUpgradePatternAttribute();
                                                TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute = d5Var4.getUpgradeBackdropAttribute();
                                                TL_stars.starGiftAttributeModel stargiftattributemodel2 = (TL_stars.starGiftAttributeModel) s7.l(tL_starGiftUnique.attributes, cls);
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) s7.l(tL_starGiftUnique.attributes, cls2);
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                                                s4Var2.o = true;
                                                s4Var2.l = tL_starGiftUnique;
                                                s4Var2.r = t1Var2;
                                                s4Var2.s = t1Var;
                                                s4Var2.t = (float) Math.random();
                                                s4Var2.m = System.currentTimeMillis();
                                                s4Var2.n = 0.0f;
                                                s4Var2.p = false;
                                                s4Var2.q = false;
                                                s4Var2.o = true;
                                                o4 o4Var = s4Var2.h;
                                                if (o4Var != null) {
                                                    o4Var.a();
                                                }
                                                q4 q4Var = new q4(v4Var, stargiftattributemodel2);
                                                if (v4Var.isAttachedToWindow() && q4Var.c) {
                                                    q4Var.d.onAttachedToWindow();
                                                }
                                                s4Var2.h = new o4(new m4(s4Var2, 0), s4Var2.e, new q4(upgradeImageView, upgradeImageViewAttribute), q4Var, 0.9f, s4Var2.t > 0.5f ? 3 : 2);
                                                o4 o4Var2 = s4Var2.i;
                                                if (o4Var2 != null) {
                                                    o4Var2.a();
                                                }
                                                s4Var2.i = new o4(new m4(s4Var2, 0), s4Var2.g, new r4(upgradePatternAttribute), new r4(stargiftattributepattern), 1.0f, s4Var2.t > 0.5f ? 2 : 1);
                                                o4 o4Var3 = s4Var2.j;
                                                if (o4Var3 != null) {
                                                    o4Var3.a();
                                                }
                                                s4Var2.j = new o4(new m4(s4Var2, 0), arrayList, new p4(upgradeBackdropAttribute), new p4(stargiftattributebackdrop), 0.5f, s4Var2.t > 0.5f ? 2 : 1);
                                                o4 o4Var4 = s4Var2.k;
                                                if (o4Var4 != null) {
                                                    o4Var4.a();
                                                }
                                                s4Var2.k = new o4(new m4(s4Var2, 0), arrayList, new p4(upgradeBackdropAttribute), new p4(stargiftattributebackdrop), 1.25f, s4Var2.t > 0.5f ? 2 : 1);
                                                s4Var2.b();
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            if (z11) {
                                            }
                                        } else {
                                            dVar.setFilled(r13);
                                            l2(tL_starGiftUnique);
                                            dVar.setOnClickListener(new l1(this, 24));
                                        }
                                    }
                                    this.e.setTitle(this.O0);
                                    s4Var2 = this.I0;
                                    if (s4Var2 == null) {
                                    }
                                }
                                hz0Var3 = hz0Var4;
                                r13 = 1;
                                r32 = z16;
                                r11 = z12;
                                hz0Var2 = hz0Var3;
                                p1(s7.l(tL_starGiftUnique.attributes, cls));
                                p1(s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                                p1(s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                if (z10) {
                                }
                                stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                                if (stargiftattributeoriginaldetails == null) {
                                }
                                s4Var = this.I0;
                                dVar = this.f0;
                                if (s4Var != null) {
                                }
                                if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                                }
                                if (this.m0) {
                                }
                                dVar.setFilled(r13);
                                dVar.g(LocaleController.getString(R.string.OK), (this.X0 ? 1 : 0) ^ r13, r13);
                                dVar.f(null, (this.X0 ? 1 : 0) ^ r13);
                                dVar.setOnClickListener(new l1(this, 25));
                                this.e.setTitle(this.O0);
                                s4Var2 = this.I0;
                                if (s4Var2 == null) {
                                }
                            }
                            z12 = false;
                            z16 = z14;
                            hz0Var3 = hz0Var;
                            r13 = 1;
                            r32 = z16;
                            r11 = z12;
                            hz0Var2 = hz0Var3;
                            p1(s7.l(tL_starGiftUnique.attributes, cls));
                            p1(s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                            p1(s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                            if (z10) {
                            }
                            stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                            if (stargiftattributeoriginaldetails == null) {
                            }
                            s4Var = this.I0;
                            dVar = this.f0;
                            if (s4Var != null) {
                            }
                            if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                            }
                            if (this.m0) {
                            }
                            dVar.setFilled(r13);
                            dVar.g(LocaleController.getString(R.string.OK), (this.X0 ? 1 : 0) ^ r13, r13);
                            dVar.f(null, (this.X0 ? 1 : 0) ^ r13);
                            dVar.setOnClickListener(new l1(this, 25));
                            this.e.setTitle(this.O0);
                            s4Var2 = this.I0;
                            if (s4Var2 == null) {
                            }
                        }
                    }
                    spannable = null;
                    d5 d5Var32 = d5Var;
                    d5Var32.h(0, spannableStringBuilder, charSequence, e2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                    boolean z142 = false;
                    boolean z152 = false;
                    boolean z162 = false;
                    ?? r322 = 0;
                    this.Y0 = null;
                    hz0 hz0Var42 = this.d0;
                    hz0Var42.removeAllViews();
                    int i112 = 22;
                    int i122 = 19;
                    if (!z10) {
                    }
                    z12 = false;
                    z162 = z142;
                    hz0Var3 = hz0Var;
                    r13 = 1;
                    r322 = z162;
                    r11 = z12;
                    hz0Var2 = hz0Var3;
                    p1(s7.l(tL_starGiftUnique.attributes, cls));
                    p1(s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                    p1(s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    if (z10) {
                    }
                    stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                    if (stargiftattributeoriginaldetails == null) {
                    }
                    s4Var = this.I0;
                    dVar = this.f0;
                    if (s4Var != null) {
                    }
                    if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                    }
                    if (this.m0) {
                    }
                    dVar.setFilled(r13);
                    dVar.g(LocaleController.getString(R.string.OK), (this.X0 ? 1 : 0) ^ r13, r13);
                    dVar.f(null, (this.X0 ? 1 : 0) ^ r13);
                    dVar.setOnClickListener(new l1(this, 25));
                    this.e.setTitle(this.O0);
                    s4Var2 = this.I0;
                    if (s4Var2 == null) {
                    }
                } else {
                    charSequence2 = stargiftattributemodel.name;
                }
                charSequence = charSequence2;
                if (tL_textWithEntities != null) {
                }
                spannable = null;
                d5 d5Var322 = d5Var;
                d5Var322.h(0, spannableStringBuilder, charSequence, e2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                boolean z1422 = false;
                boolean z1522 = false;
                boolean z1622 = false;
                ?? r3222 = 0;
                this.Y0 = null;
                hz0 hz0Var422 = this.d0;
                hz0Var422.removeAllViews();
                int i1122 = 22;
                int i1222 = 19;
                if (!z10) {
                }
                z12 = false;
                z1622 = z1422;
                hz0Var3 = hz0Var;
                r13 = 1;
                r3222 = z1622;
                r11 = z12;
                hz0Var2 = hz0Var3;
                p1(s7.l(tL_starGiftUnique.attributes, cls));
                p1(s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                p1(s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                if (z10) {
                }
                stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                if (stargiftattributeoriginaldetails == null) {
                }
                s4Var = this.I0;
                dVar = this.f0;
                if (s4Var != null) {
                }
                if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                }
                if (this.m0) {
                }
                dVar.setFilled(r13);
                dVar.g(LocaleController.getString(R.string.OK), (this.X0 ? 1 : 0) ^ r13, r13);
                dVar.f(null, (this.X0 ? 1 : 0) ^ r13);
                dVar.setOnClickListener(new l1(this, 25));
                this.e.setTitle(this.O0);
                s4Var2 = this.I0;
                if (s4Var2 == null) {
                }
            } else {
                d5Var = d5Var2;
            }
        }
        if (z13 && this.I0 == null) {
            this.I0 = new s4(d5Var);
        }
        long j112 = j10;
        boolean O13 = O1(this.currentAccount, j112);
        boolean O122 = O1(this.currentAccount, peerDialogId2);
        boolean P12 = P1(this.currentAccount, K1());
        F1();
        d5Var.f(tL_starGiftUnique, O13, O122, P12);
        TL_stars.starGiftAttributeModel stargiftattributemodel3 = (TL_stars.starGiftAttributeModel) s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
        spannableStringBuilder6.append((CharSequence) tL_starGiftUnique.title);
        spannableStringBuilder6.append((CharSequence) " ");
        int length3 = spannableStringBuilder6.length();
        spannableStringBuilder6.append((CharSequence) ("#" + LocaleController.formatNumber(tL_starGiftUnique.num, ',')));
        spannableStringBuilder6.setSpan(new RelativeSizeSpan(0.85f), length3, spannableStringBuilder6.length(), 33);
        spannableStringBuilder6.setSpan(new cu(190, 0), length3, spannableStringBuilder6.length(), 33);
        if (tLObject == null) {
        }
        charSequence = charSequence2;
        if (tL_textWithEntities != null) {
        }
        spannable = null;
        d5 d5Var3222 = d5Var;
        d5Var3222.h(0, spannableStringBuilder6, charSequence, e2(tL_starGiftUnique.released_by), null, tLObject, spannable);
        boolean z14222 = false;
        boolean z15222 = false;
        boolean z16222 = false;
        ?? r32222 = 0;
        this.Y0 = null;
        hz0 hz0Var4222 = this.d0;
        hz0Var4222.removeAllViews();
        int i11222 = 22;
        int i12222 = 19;
        if (!z10) {
        }
        z12 = false;
        z16222 = z14222;
        hz0Var3 = hz0Var;
        r13 = 1;
        r32222 = z16222;
        r11 = z12;
        hz0Var2 = hz0Var3;
        p1(s7.l(tL_starGiftUnique.attributes, cls));
        p1(s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
        p1(s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
        if (z10) {
        }
        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
        if (stargiftattributeoriginaldetails == null) {
        }
        s4Var = this.I0;
        dVar = this.f0;
        if (s4Var != null) {
        }
        if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
        }
        if (this.m0) {
        }
        dVar.setFilled(r13);
        dVar.g(LocaleController.getString(R.string.OK), (this.X0 ? 1 : 0) ^ r13, r13);
        dVar.f(null, (this.X0 ? 1 : 0) ^ r13);
        dVar.setOnClickListener(new l1(this, 25));
        this.e.setTitle(this.O0);
        s4Var2 = this.I0;
        if (s4Var2 == null) {
        }
    }

    public final void l2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        kf.a resellAmount = tL_starGiftUnique.getResellAmount(kf.b.a);
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        nh.d dVar = this.f0;
        if (!z10) {
            dVar.g(ia.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a())), !this.X0, true);
            dVar.f(null, !this.X0);
        } else {
            dVar.g(ia.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(kf.b.b).d()), true), !this.X0, true);
            dVar.f(ia.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a())), !this.X0);
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
        StringBuilder sb2 = new StringBuilder();
        sb2.append(K1.title);
        sb2.append(" #");
        this.v0.setText(LocaleController.formatString(R.string.Gift2WearTitle, j7.l1.m(K1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.Q0 == null) {
                this.Q0 = new iq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.Q0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        nh.d dVar = this.f0;
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new l1(this, 21));
        this.a0.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        q2(2, false, null);
        this.t0 = true;
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
        JSONObject p10 = ph.p2.p(this.resourcesProvider, false);
        if (p10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = p10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new ih.c1(this, charSequence, K1, tL_inputInvoiceStarGiftDropOriginalDetails, 1));
    }

    public final void o2(View view, CharSequence charSequence, boolean z10) {
        Layout layout;
        float primaryHorizontal;
        nh.t3 t3Var = this.k1;
        if ((t3Var != null && t3Var.R && this.l1 == view) || view == null) {
            return;
        }
        if (!z10) {
            if (view instanceof TextView) {
                layout = ((TextView) view).getLayout();
            } else if (!(view instanceof org.telegram.ui.ActionBar.h5)) {
                return;
            } else {
                layout = ((org.telegram.ui.ActionBar.h5) view).getLayout();
            }
            if (layout == null) {
                return;
            }
            CharSequence text = layout.getText();
            if (!(text instanceof Spanned)) {
                return;
            }
            Spanned spanned = (Spanned) text;
            wc[] wcVarArr = (wc[]) spanned.getSpans(0, spanned.length(), wc.class);
            if (wcVarArr == null || wcVarArr.length <= 0) {
                return;
            }
            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(wcVarArr[wcVarArr.length - 1])) + view.getPaddingLeft() + (r5.a() / 2.0f);
        } else {
            if (!(view instanceof org.telegram.ui.ActionBar.h5)) {
                return;
            }
            org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) view;
            primaryHorizontal = (h5Var.getRightDrawableWidth() / 2.0f) + h5Var.getRightDrawableX();
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        bg.u1 u1Var = this.U;
        u1Var.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        nh.t3 t3Var2 = this.k1;
        if (t3Var2 != null) {
            t3Var2.e(true);
            this.k1 = null;
        }
        nh.t3 t3Var3 = new nh.t3(getContext(), 3);
        t3Var3.q(!z10);
        t3Var3.t(charSequence);
        t3Var3.n(0.0f, (iArr[0] + primaryHorizontal) - (AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft));
        t3Var3.setTranslationY(((iArr[1] - AndroidUtilities.dp(100.0f)) - (view.getHeight() / 2.0f)) + AndroidUtilities.dp((z10 ? 18 : 0) + 4.33f));
        t3Var3.d = 3000L;
        t3Var3.setPadding(AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0);
        t3Var3.h0 = new ih.x(t3Var3, 1);
        t3Var3.v();
        u1Var.addView(t3Var3, i7.f6.c(100.0f, -1));
        this.k1 = t3Var3;
        this.l1 = view;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        d5 d5Var;
        g4 g4Var;
        if (this.U0.c(4) && (d5Var = this.a0) != null && (g4Var = d5Var.H) != null) {
            if (g4Var.d0) {
                return;
            }
            if (g4Var.e0) {
                super.onBackPressed();
                return;
            }
        }
        if (this.t0 || this.U0.b <= 0 || this.f0.J || this.c1) {
            super.onBackPressed();
            return;
        }
        MessageObject messageObject = this.A0;
        if (messageObject != null) {
            i2(messageObject, null);
        } else {
            TL_stars.SavedStarGift savedStarGift = this.y0;
            if (savedStarGift != null) {
                j2(savedStarGift, this.z0);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.C0;
                if (tL_starGiftUnique != null) {
                    h2(this.B0, tL_starGiftUnique, this.z0);
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

    @Override // org.telegram.ui.ActionBar.f3
    public final void onSwipeStarts() {
        nh.t3 t3Var = this.k1;
        if (t3Var != null) {
            t3Var.e(true);
            this.k1 = null;
        }
    }

    public final void p1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        char c3;
        s4 s4Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        h5 h5Var;
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
        if (!this.J0 && ((s4Var = this.I0) == null || !s4Var.o)) {
            boolean[] zArr = new boolean[1];
            vc[] vcVarArr = new vc[1];
            Integer[] numArr = new Integer[1];
            String J1 = J1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                cVar = new androidx.car.app.utils.c(this, zArr, starGiftAttribute2, vcVarArr, 7);
                h5Var = this;
            } else {
                starGiftAttribute2 = starGiftAttribute;
                h5Var = this;
                cVar = null;
            }
            vcVarArr[0] = (vc) ((ez0) h5Var.d0.e(string, starGiftAttribute2.name, J1, cVar, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        x4 x4Var = new x4(getContext(), this.resourcesProvider, new o1(this, 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        hz0 hz0Var = this.d0;
        tableRow.addView(new gz0(hz0Var, string), layoutParams);
        tableRow.addView(new ez0(hz0Var, x4Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        hz0Var.addView(tableRow);
        s4 s4Var2 = this.I0;
        if (s4Var2 != null) {
            if (c3 == 0) {
                s4Var2.d = x4Var;
            }
            if (c3 == 1) {
                s4Var2.c = x4Var;
            }
            if (c3 == 2) {
                s4Var2.b = x4Var;
            }
        }
    }

    public final void p2(int i10, Context context, boolean z10) {
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(64.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider)));
        g10.addView(frameLayout, i7.f6.t(64, 64, 49, 0, 6, 0, 0));
        aj0 aj0Var = new aj0(context);
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        aj0Var.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView(aj0Var, i7.f6.q(64, 64, 17));
        aj0Var.d();
        TextView b10 = i7.j6.b(context, 20.0f, org.telegram.ui.ActionBar.g6.G6, true, null);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(z10 ? R.string.Gift2ResellTimeoutTitle : R.string.Gift2TransferTimeoutTitle));
        g10.addView(b10, i7.f6.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = i7.j6.b(context, 14.0f, org.telegram.ui.ActionBar.g6.F6, false, null);
        b11.setGravity(17);
        b11.setText(LocaleController.formatString(z10 ? R.string.Gift2ResellTimeout : R.string.Gift2TransferTimeout, LocaleController.formatTTLString(Math.max(10, i10))));
        g10.addView(b11, i7.f6.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, this.resourcesProvider);
        alertDialog$Builder.n(g10);
        j7.l1.C(R.string.OK, alertDialog$Builder, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q2(int i10, boolean z10, hh.f fVar) {
        int i11;
        nh.t3 t3Var;
        s4 s4Var;
        ValueAnimator valueAnimator = this.V0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.V0 = null;
        }
        d5 d5Var = this.a0;
        if (i10 != 1) {
            AndroidUtilities.cancelRunOnUIThread(d5Var.e0);
        }
        if (!this.X0) {
            this.T0 = Float.valueOf(this.U.d());
        }
        a5.d dVar = this.U0;
        this.U0 = new a5.d(dVar == null ? 0 : dVar.b, i10);
        cg.g gVar = this.M0;
        int finalHeight = d5Var.getFinalHeight();
        int z12 = z1();
        if (this.U0.d(1)) {
            FrameLayout frameLayout = this.i0;
            if (frameLayout.getVisibility() == 0) {
                i11 = frameLayout.getMeasuredHeight();
                gVar.F(finalHeight, z12 + i11);
                if (this.U0.b == 0 && (s4Var = this.I0) != null) {
                    s4Var.c();
                }
                q3 q3Var = this.w0;
                q3 q3Var2 = this.u0;
                q3 q3Var3 = this.n0;
                q3 q3Var4 = this.b0;
                if (z10) {
                    this.U0.c = 1.0f;
                    T1();
                    q3Var4.setVisibility(i10 == 0 ? 0 : 8);
                    q3Var3.setVisibility(i10 == 1 ? 0 : 8);
                    q3Var2.setVisibility(i10 == 2 ? 0 : 8);
                    q3Var.setVisibility(i10 != 3 ? 8 : 0);
                    s2();
                    if (fVar != null) {
                        fVar.run();
                    }
                } else {
                    q3Var4.setVisibility(this.U0.b(0) ? 0 : 8);
                    q3Var3.setVisibility(this.U0.b(1) ? 0 : 8);
                    q3Var2.setVisibility(this.U0.b(2) ? 0 : 8);
                    q3Var.setVisibility(this.U0.b(3) ? 0 : 8);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.V0 = ofFloat;
                    ofFloat.addUpdateListener(new bg.q1(this, 11));
                    this.V0.addListener(new l3(this, i10, fVar, r5));
                    this.V0.setInterpolator(jr.h);
                    this.V0.setDuration(320L);
                    this.V0.start();
                    a5.d dVar2 = this.U0;
                    org.telegram.ui.Components.t9[] t9VarArr = d5Var.d;
                    int i12 = dVar2.a;
                    int i13 = dVar2.b;
                    if (i12 != i13) {
                        xi0 lottieAnimation = t9VarArr[i12].getImageReceiver().getLottieAnimation();
                        xi0 lottieAnimation2 = t9VarArr[i13].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.Q(lottieAnimation.r(), false);
                        }
                    }
                }
                t3Var = this.k1;
                if (t3Var == null) {
                    t3Var.e(true);
                    this.k1 = null;
                    return;
                }
                return;
            }
        }
        i11 = 0;
        gVar.F(finalHeight, z12 + i11);
        if (this.U0.b == 0) {
            s4Var.c();
        }
        q3 q3Var5 = this.w0;
        q3 q3Var22 = this.u0;
        q3 q3Var32 = this.n0;
        q3 q3Var42 = this.b0;
        if (z10) {
        }
        t3Var = this.k1;
        if (t3Var == null) {
        }
    }

    public final void r1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            s7.y(this.currentAccount, false).Q(A1());
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
            s7.y(this.currentAccount, false).Q(A1());
            dismiss();
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.y0;
        if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                this.J0 = true;
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                TL_stars.SavedStarGift savedStarGift2 = this.y0;
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
                j2(savedStarGift2, this.z0);
                this.d1 = null;
                this.J0 = false;
                l7 l7Var = this.z0;
                if (l7Var != null) {
                    l7Var.d();
                } else {
                    s7.y(this.currentAccount, false).Q(this.T);
                }
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
        }
        if (this.z0 == null) {
            s7.y(this.currentAccount, false).Q(A1());
        }
        this.J0 = true;
        this.y0 = null;
        this.x0 = false;
        MessageObject messageObject = new MessageObject(this.currentAccount, message, false, false);
        messageObject.setType();
        i2(messageObject, this.z0);
        this.d1 = null;
        this.J0 = false;
        AndroidUtilities.runOnUIThread(runnable);
    }

    public final void r2(boolean z10) {
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", 3).apply();
        boolean P1 = P1(this.currentAccount, K1());
        boolean z11 = !P1;
        boolean P12 = P1(this.currentAccount, K1());
        nh.d dVar = this.f0;
        if (P12) {
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(A1(), new TLRPC.TL_emojiStatusEmpty(), null);
        } else {
            final long A1 = A1();
            if (A1 >= 0) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                    mc P = getBulletinFactory().P(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.Gift2ActionWearNeededPremium), new t1(this, 24)));
                    P.t = true;
                    P.j();
                    return;
                }
            } else if (!z10) {
                final MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                dVar.setLoading(true);
                MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(A1, new f5.d() { // from class: jh.j3
                    @Override // f5.d
                    public final void accept(Object obj) {
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                        h5 h5Var = h5.this;
                        if (tL_premium_boostsStatus != null) {
                            int i10 = tL_premium_boostsStatus.level;
                            MessagesController messagesController2 = messagesController;
                            if (i10 < messagesController2.channelEmojiStatusLevelMin) {
                                ChannelBoostsController boostsController = messagesController2.getBoostsController();
                                long j10 = A1;
                                boostsController.userCanBoostChannel(j10, tL_premium_boostsStatus, new w1(h5Var, tL_premium_boostsStatus, j10, messagesController2, 0));
                                return;
                            }
                        }
                        h5Var.f0.setLoading(false);
                        h5Var.r2(true);
                    }
                });
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = K1.id;
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(A1(), tL_inputEmojiStatusCollectible, K1);
        }
        this.a0.E[1].b(!P1 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, LocaleController.getString(!P1 ? R.string.Gift2ActionWearOff : R.string.Gift2ActionWear), true);
        if (this.t0) {
            dismiss();
            return;
        }
        hh.f fVar = new hh.f(2, this, z11);
        if (this.U0.c(0)) {
            fVar.run();
        } else {
            q2(0, true, fVar);
        }
        dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
        dVar.f(null, !this.X0);
        dVar.setOnClickListener(new l1(this, 0));
    }

    public final boolean s1() {
        TLRPC.Peer peer;
        if (E1() == null) {
            return false;
        }
        MessageObject messageObject = this.A0;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                return ((!(tL_messageActionStarGift.peer != null) && (!messageObject.isOutOwner() || ((this.A0.getDialogId() > UserConfig.getInstance(this.currentAccount).getClientUserId() ? 1 : (this.A0.getDialogId() == UserConfig.getInstance(this.currentAccount).getClientUserId() ? 0 : -1)) == 0))) || ((peer = tL_messageActionStarGift.peer) != null && O1(this.currentAccount, DialogObject.getPeerDialogId(peer)))) && !tL_messageActionStarGift.converted && tL_messageActionStarGift.convert_stars > 0 && MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.A0.messageOwner.date) > 0;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.y0;
            if (savedStarGift != null) {
                int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
                int i10 = this.currentAccount;
                long j10 = this.T;
                if (O1(i10, j10)) {
                    int i11 = this.y0.flags;
                    if (((j10 < 0 ? 2048 : 8) & i11) != 0 && (i11 & 16) != 0 && (i11 & 2) != 0 && currentTime > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void s2() {
        FrameLayout frameLayout = this.i0;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.k0;
        FrameLayout frameLayout3 = this.g0;
        if (visibility != 0) {
            frameLayout3.setTranslationY(0.0f);
            frameLayout.setTranslationY(0.0f);
            frameLayout2.setTranslationY(0.0f);
        } else {
            frameLayout3.setTranslationY(this.U0.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.U0.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.U0.a(1) * (-frameLayout.getMeasuredHeight()));
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        MessageObject messageObject;
        TLRPC.Message message;
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            org.telegram.ui.c.b(this.currentAccount);
            return;
        }
        if (this.B0 != null && this.C0 == null) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getContext(), 3, null);
            c2Var.q(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.B0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getuniquestargift, new bg.h3(8, this, c2Var));
        } else if (this.y0 == null && (messageObject = this.A0) != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(getContext(), 3, null);
                        c2Var2.q(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new eg.z(this, tL_messageActionStarGift, c2Var2, 7));
                        return;
                    }
                    if (E1() != null) {
                        org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(getContext(), 3, null);
                        c2Var3.q(500L);
                        s7.y(this.currentAccount, false).M(E1(), new ih.b1(5, this, c2Var3));
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
        MessageObject messageObject = this.A0;
        if (messageObject == null) {
            TL_stars.SavedStarGift savedStarGift = this.y0;
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
        p3 p3Var = this.V;
        p3Var.setPosition(L1 ? 1 : 0);
        p3Var.C(false);
        if (this.z0 == null || L1(true) || this.z0.e() >= this.z0.c()) {
            return;
        }
        this.z0.a();
    }

    public final void u1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.Gift2CantDoTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.Gift2CantDoText);
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 != null && !TextUtils.isEmpty(K1.slug)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OpenFragment), new c3(this, K1, 1));
        }
        j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
    }

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        cg.g gVar = new cg.g(this, 1);
        this.M0 = gVar;
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
        TL_stars.SavedStarGift savedStarGift = this.y0;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            MessageObject messageObject = this.A0;
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
            peerDialogId = this.T;
        }
        if (j11 <= 0) {
            TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
            transferstargift.stargift = E1;
            transferstargift.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(transferstargift, new b2(this, callback, j10, peerDialogId, 0));
            return;
        }
        final long j12 = peerDialogId;
        s7 y8 = s7.y(this.currentAccount, false);
        if (!y8.e) {
            y8.r(new c2(this, y8, j10, callback, 0));
            return;
        }
        final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
        tL_inputInvoiceStarGiftTransfer.stargift = E1;
        tL_inputInvoiceStarGiftTransfer.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
        JSONObject p10 = ph.p2.p(this.resourcesProvider, false);
        if (p10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = p10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: jh.d2
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final h5 h5Var = h5.this;
                final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer2 = tL_inputInvoiceStarGiftTransfer;
                final long j13 = j10;
                final long j14 = j12;
                final Utilities.Callback callback2 = callback;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: jh.e2
                    @Override // java.lang.Runnable
                    public final void run() {
                        h5.G0(h5.this, tLObject, tL_inputInvoiceStarGiftTransfer2, j13, j14, callback2, tL_error);
                    }
                });
            }
        });
    }

    public final void w1() {
        TL_stars.InputSavedStarGift E1;
        long j10;
        nh.d dVar = this.f0;
        if (dVar.J || (E1 = E1()) == null) {
            return;
        }
        MessageObject messageObject = this.A0;
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
            TL_stars.SavedStarGift savedStarGift = this.y0;
            if (savedStarGift == null) {
                return;
            }
            j10 = savedStarGift.upgrade_stars;
            if (j10 <= 0) {
                str = savedStarGift.prepaid_upgrade_hash;
            }
        }
        if (j10 > 0 || this.h1 != null) {
            dVar.setLoading(true);
            hp hpVar = this.r0;
            if (j10 > 0) {
                TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                upgradestargift.keep_original_details = hpVar.a.q;
                upgradestargift.stargift = E1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(upgradestargift, new bg.h3(7, this, E1));
                return;
            }
            int i10 = 0;
            s7 y8 = s7.y(this.currentAccount, false);
            if (!y8.e) {
                y8.r(new ef.c(28, this, y8));
                return;
            }
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = this.h1.form_id;
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = hpVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = E1;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.T);
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = this.h1.invoice.prices;
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j11 += tL_labeledPrice.amount;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new v(this, str, E1, j11, 1));
        }
    }

    @Override // org.telegram.ui.Components.xa
    public final int x() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        return this.O0;
    }

    public final int z1() {
        if (this.U0.d(1)) {
            return this.n0.getMeasuredHeight();
        }
        if (this.U0.d(2)) {
            return this.u0.getMeasuredHeight();
        }
        if (this.U0.d(3)) {
            return this.w0.getMeasuredHeight();
        }
        if (this.U0.d(4)) {
            return 0;
        }
        return this.b0.getMeasuredHeight();
    }
}
