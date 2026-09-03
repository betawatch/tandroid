package kh;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import lh.ja;
import lh.t7;
import lh.z9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ai;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class s extends sa implements GiftAuctionController.OnAuctionUpdateListener {
    public static final /* synthetic */ int x0 = 0;
    public final long U;
    public final i51 V;
    public final lh.c W;
    public final o X;
    public final kf.p Y;
    public final n Z;
    public final ah.e a0;
    public final ah.e b0;
    public final ah.e c0;
    public final org.telegram.ui.Cells.l4 d0;
    public final k6 e0;
    public final q f0;
    public final q[] g0;
    public final FrameLayout h0;
    public GiftAuctionController.Auction i0;
    public final r j0;
    public Runnable k0;
    public long l0;
    public long m0;
    public boolean n0;
    public final lq[] o0;
    public org.telegram.ui.Components.u5 p0;
    public final xd.a q0;
    public final xd.a r0;
    public final lq[] s0;
    public boolean t0;
    public w51 u0;
    public boolean v0;
    public boolean w0;

    public s(Context context, f6 f6Var, r rVar, GiftAuctionController.Auction auction) {
        super(context, null, false, false, false, false, false, 2, f6Var);
        this.g0 = new q[3];
        this.n0 = true;
        this.o0 = new lq[1];
        g gVar = new g(this);
        mr mrVar = mr.h;
        this.q0 = new xd.a(0, gVar, mrVar, 380L, false);
        this.r0 = new xd.a(0, new g(this), mrVar, 380L, false);
        this.s0 = new lq[1];
        this.i0 = auction;
        this.j0 = rVar;
        long j10 = auction.giftId;
        this.U = j10;
        this.O = true;
        this.v = 0.2f;
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j10, this);
        this.Y = new kf.p(new g(this));
        int i10 = 0;
        this.I = false;
        this.H = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        f0.S(this.e, context, f6Var, subscribeToGiftAuction.gift);
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.V = i51.j(-1, linearLayout);
        n nVar = new n(this, context, f6Var);
        this.Z = nVar;
        nVar.L = true;
        this.i0.getMinimumBid();
        this.i0.getCurrentMyBid();
        long currentTopBid = this.i0.getCurrentTopBid();
        int i11 = currentTopBid > 100000 ? ((((int) currentTopBid) * 3) / 2000) * MediaDataController.MAX_STYLE_RUNS_COUNT : currentTopBid > 30000 ? 100000 : 50000;
        int i12 = 15;
        int[] iArr = {50, 100, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2000, 5000, 7500, 10000, 25000, 50000, 100000, 500000, MediaController.VIDEO_BITRATE_480, 5000000, 10000000};
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        boolean z4 = false;
        while (true) {
            if (i13 >= i12) {
                break;
            }
            int i14 = iArr[i13];
            if (i14 >= 50) {
                z4 = i14 == 50 ? false : z4;
                if (i14 <= i11) {
                    arrayList.add(Integer.valueOf(i14));
                    if (iArr[i13] == i11) {
                        break;
                    }
                } else {
                    arrayList.add(Integer.valueOf(i11));
                    break;
                }
            } else {
                z4 = true;
            }
            i13++;
            i12 = 15;
        }
        if (z4) {
            arrayList.add(0, 50);
        }
        int i15 = 2;
        if (arrayList.size() < 2) {
            arrayList.clear();
            arrayList.add(1);
            arrayList.add(10000);
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            iArr2[i16] = ((Integer) arrayList.get(i16)).intValue();
        }
        n nVar2 = this.Z;
        nVar2.b0 = iArr2;
        linearLayout.addView(nVar2, k7.b6.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ah.e eVar = new ah.e(context, 3, f6Var);
        this.a0 = eVar;
        int dp = AndroidUtilities.dp(12.0f);
        int i17 = j6.a7;
        int themedColor = getThemedColor(i17);
        int h = i0.a.h(getThemedColor(j6.i6), getThemedColor(i17));
        eVar.setBackground(j6.i0(dp, dp, dp, dp, themedColor, h, h));
        eVar.setOnClickListener(new k(this, i15));
        ((TextView) eVar.c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoMinimumBid));
        ah.e eVar2 = new ah.e(context, 3, f6Var);
        this.b0 = eVar2;
        eVar2.setBackground(j6.b0(AndroidUtilities.dp(12.0f), getThemedColor(i17)));
        ((TextView) eVar2.c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoUntilNextRound));
        ah.e eVar3 = new ah.e(context, 3, f6Var);
        this.c0 = eVar3;
        eVar3.setBackground(j6.b0(AndroidUtilities.dp(12.0f), getThemedColor(i17)));
        ((TextView) eVar3.c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoLeft));
        linearLayout2.addView(eVar, k7.b6.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), k7.b6.l(0.0f, 10, -1));
        linearLayout2.addView(eVar2, k7.b6.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), k7.b6.l(0.0f, 10, -1));
        linearLayout2.addView(eVar3, k7.b6.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, k7.b6.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (subscribeToGiftAuction.auctionUserState.acquired_count > 0) {
            f90 f90Var = new f90(context, f6Var);
            f90Var.setGravity(17);
            f90Var.setTextSize(1, 16.0f);
            int i18 = j6.J6;
            f90Var.setTextColor(j6.v0(i18, f6Var));
            f90Var.setLinkTextColor(j6.v0(i18, f6Var));
            f90Var.setOnClickListener(new dg.p(this, new boolean[1], f6Var, 3));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.u5(subscribeToGiftAuction.giftDocumentId, f90Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            f90Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", subscribeToGiftAuction.auctionUserState.acquired_count, spannableStringBuilder), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            k7.d6.b(f90Var, 0.02f, 1.5f);
            linearLayout.addView(f90Var, k7.b6.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i19 = j6.L6;
        int i20 = 2;
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, i19, 21, 0, 0, false, true, f6Var);
        this.d0 = l4Var;
        linearLayout.addView(l4Var, k7.b6.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        k6 k6Var = new k6(context, false, false, false);
        this.e0 = k6Var;
        k6Var.setTextSize(AndroidUtilities.dp(12.5f));
        k6Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        k6Var.setSizeableBackground(j6.Z(0, 0, 9, 9));
        k6Var.setHideBackgroundIfEmpty(true);
        l4Var.setOnWidthUpdateListener(new e3.h(this, 24));
        l4Var.addView(k6Var, k7.b6.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        q qVar = new q(context, f6Var);
        this.f0 = qVar;
        qVar.b.setTextColor(getThemedColor(i19));
        qVar.c(user);
        linearLayout.addView(qVar, k7.b6.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context, i19, 21, 15, 0, false, false, f6Var);
        l4Var2.setText(LocaleController.getString(R.string.Gift2AuctionTop3Winners));
        linearLayout.addView(l4Var2, k7.b6.n(-1, -2));
        int i21 = 0;
        while (true) {
            q[] qVarArr = this.g0;
            if (i21 >= qVarArr.length) {
                break;
            }
            qVarArr[i21] = new q(context, f6Var);
            int i22 = i21 + 1;
            this.g0[i21].b(i22, true, false);
            this.g0[i21].setBackground(j6.K0(false));
            q qVar2 = this.g0[i21];
            qVar2.f = i21 < 2;
            qVar2.setOnClickListener(new dg.m(i20));
            linearLayout.addView(this.g0[i21], k7.b6.n(-1, -2));
            i21 = i22;
        }
        o oVar = new o(context, f6Var, true);
        this.X = oVar;
        oVar.e();
        FrameLayout.LayoutParams d = k7.b6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i23 = d.leftMargin;
        int i24 = this.backgroundPaddingLeft;
        d.leftMargin = i23 + i24;
        d.rightMargin += i24;
        this.containerView.addView(oVar, d);
        rl0 rl0Var = this.d;
        int i25 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i25, 0, i25, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new a(1));
        long j11 = subscribeToGiftAuction.auctionUserState.bid_amount;
        if (j11 > 0) {
            this.Z.setValue((int) j11);
        } else {
            this.Z.setValue((int) subscribeToGiftAuction.getMinimumBid());
        }
        e0(false);
        this.d.setOverScrollMode(2);
        lh.c cVar = new lh.c(context, this.currentAccount, f6Var);
        this.W = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        cVar.setEnabled(false);
        cVar.setClickable(false);
        this.container.addView(cVar, k7.b6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        k7.d6.a(cVar);
        cVar.setOnClickListener(new m(context, i10, f6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h0 = frameLayout;
        this.container.addView(frameLayout, k7.b6.e(-1, 100, 48));
        a0();
        this.u0.N(false);
    }

    public static void P(s sVar, long j10) {
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            if (UserObject.isService(j10)) {
                return;
            }
            Bundle bundle = new Bundle();
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
                if (j10 == UserConfig.getInstance(sVar.currentAccount).getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j10);
            }
            bundle.putBoolean("open_gifts", true);
            U.presentFragment(new ProfileActivity(bundle, null));
        }
        Runnable runnable = sVar.k0;
        if (runnable != null) {
            runnable.run();
        }
        sVar.dismiss();
    }

    public static void Q(s sVar) {
        int value = sVar.Z.getValue();
        int minimumBid = (int) sVar.i0.getMinimumBid();
        if (value >= minimumBid) {
            sVar.X(value);
        } else {
            AndroidUtilities.shakeView(sVar.X);
            new qc(sVar.container, sVar.resourcesProvider).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionMinimumBidIncreased", minimumBid, new Object[0]))).j();
        }
    }

    public static /* synthetic */ void R(s sVar, boolean[] zArr, f6 f6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(sVar.currentAccount).getOrRequestAcquiredGifts(sVar.U, new h(sVar, zArr, f6Var, 0));
    }

    public static void S(s sVar, long j10, Boolean bool, String str) {
        FrameLayout frameLayout = sVar.h0;
        sVar.X.setLoading(false);
        sVar.w0 = false;
        if (bool != null) {
            boolean z4 = j10 > 0;
            ec ecVar = new ec(sVar.getContext(), sVar.resourcesProvider);
            ecVar.a.setImageResource(R.drawable.filled_gift_sell_24);
            String string = LocaleController.getString(z4 ? R.string.Gift2AuctionsBidHasBeenIncreased : R.string.Gift2AuctionsBidHasBeenPlaced);
            TextView textView = ecVar.b;
            textView.setText(string);
            textView.setSingleLine(true);
            textView.setTextSize(1, 15.0f);
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            String formatString = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(sVar.i0.gift.gifts_per_round));
            TextView textView2 = ecVar.c;
            textView2.setText(formatString);
            textView2.setSingleLine(false);
            textView2.setMaxLines(5);
            sVar.Y();
            ic.f(frameLayout, ecVar, 2750).j();
            t7.y(sVar.currentAccount, false).q(false, true, null);
        }
        if (str != null) {
            sVar.Y();
            ai.r(R.string.UnknownErrorCode, new Object[]{str}, new qc(frameLayout, sVar.resourcesProvider), R.raw.error, 36);
        }
    }

    public static void T(s sVar, int i10) {
        sVar.Z.f(nh.t.b(sVar.currentAccount, i10, 3), nh.t.b(sVar.currentAccount, i10, 4), true);
        sVar.c0(sVar.t0);
        sVar.d0(sVar.t0);
        sVar.Z(sVar.t0);
        sVar.W();
    }

    public static void U(s sVar) {
        Context context = sVar.getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (findActivity != null) {
            findActivity.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, sVar.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2AuctionPlaceACustomBid);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        d2Var.Q = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(sVar.i0.gift.gifts_per_round));
        dh.b bVar = new dh.b(context, sVar.resourcesProvider, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        bVar.setTextSize(1, 18.0f);
        bVar.setTextColor(j6.v0(j6.j5, sVar.resourcesProvider));
        bVar.setHintColor(j6.v0(j6.Xh, sVar.resourcesProvider));
        bVar.setHintText(LocaleController.getString(R.string.Gift2AuctionPlaceACustomBidHint2));
        bVar.setFocusable(true);
        bVar.setInputType(2);
        bVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        bVar.setLineColors(j6.v0(j6.k6, sVar.resourcesProvider), j6.v0(j6.l6, sVar.resourcesProvider), j6.v0(j6.p7, sVar.resourcesProvider));
        bVar.setImeOptions(268435462);
        bVar.setBackgroundDrawable(null);
        bVar.hintLayoutOffset = AndroidUtilities.dp(24.0f);
        bVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        bVar.addTextChangedListener(new p(sVar, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(bVar, k7.b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        d2Var.a = AndroidUtilities.dp(300.0f);
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2AuctionPlaceABid), new c1.b(22, sVar, bVar));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new k3.e(10));
        org.telegram.ui.ActionBar.d2[] d2VarArr = {d2Var};
        if (R != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, R.getClassGuid());
        }
        d2VarArr[0].setOnDismissListener(new i(bVar, R, findActivity, i10));
        d2VarArr[0].setOnShowListener(new j(i10, bVar));
        d2VarArr[0].show();
        View d = d2VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        d2VarArr[0].e0 = false;
        bVar.setSelection(bVar.getText().length());
    }

    public final void V() {
        boolean z4 = this.t0 && !isDismissed();
        if (this.v0 != z4) {
            this.v0 = z4;
            lh.c cVar = this.W;
            if (cVar != null) {
                cVar.setEnabled(z4);
                cVar.setClickable(z4);
                cVar.animate().scaleX(z4 ? 1.0f : 0.6f).scaleY(z4 ? 1.0f : 0.6f).alpha(z4 ? 1.0f : 0.0f).setDuration(180L).start();
            }
        }
    }

    public final void W() {
        n nVar = this.Z;
        int value = nVar.getValue();
        if (nVar.getProgress() > 0.99f) {
            nVar.g(LocaleController.getString(R.string.Gift2AuctionTapToBidMore));
            return;
        }
        long j10 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.i0.auctionUserState;
        long j11 = tL_StarGiftAuctionUserState.bid_amount;
        if (j10 == j11) {
            nVar.g(LocaleController.getString(R.string.Gift2AuctionYourBid));
            return;
        }
        if (j11 <= 0 || tL_StarGiftAuctionUserState.returned) {
            nVar.g(null);
            return;
        }
        long j12 = j10 - j11;
        if (j12 <= 0) {
            nVar.g(null);
            return;
        }
        nVar.g("+" + LocaleController.formatNumber(j12, ','));
    }

    public final void X(int i10) {
        if (this.w0) {
            return;
        }
        long j10 = this.i0.auctionUserState.bid_amount;
        long j11 = i10;
        if (j10 > 0) {
            j11 -= j10;
        }
        long j12 = j11;
        if (t7.y(this.currentAccount, false).e && t7.y(this.currentAccount, false).q(false, false, null).amount < j12) {
            new z9(getContext(), this.resourcesProvider, j12, 14, null, null, 0L).show();
            return;
        }
        this.w0 = true;
        this.X.setLoading(true);
        GiftAuctionController.getInstance(this.currentAccount).sendBid(this.U, this.j0, i10, new l(this, j10, 0));
    }

    public final void Y() {
        FrameLayout frameLayout;
        if (this.shadowDrawable == null || this.containerView == null || (frameLayout = this.h0) == null) {
            return;
        }
        frameLayout.setTranslationY(Math.max(0.0f, ((this.containerView.getY() + r0.getBounds().top) - frameLayout.getMeasuredHeight()) + AndroidUtilities.dp(10.0f)));
    }

    public final void Z(boolean z4) {
        long value = this.Z.getValue();
        long currentMyBid = this.i0.getCurrentMyBid();
        int i10 = 0;
        int i11 = 1;
        o oVar = this.X;
        if (value == currentMyBid) {
            oVar.g(LocaleController.getString(R.string.OK), z4, true);
            oVar.setOnClickListener(new k(this, i10));
            return;
        }
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.i0.auctionUserState;
        long j10 = tL_StarGiftAuctionUserState.bid_amount;
        lq[] lqVarArr = this.s0;
        if (j10 >= value || tL_StarGiftAuctionUserState.returned) {
            oVar.g(ja.V0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBid, LocaleController.formatNumber(value, ',')), lqVarArr), z4, true);
        } else {
            oVar.g(ja.V0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBidAdd, LocaleController.formatNumber(value - j10, ',')), lqVarArr), z4, true);
        }
        oVar.setOnClickListener(new k(this, i11));
    }

    public final void a0() {
        int d = i0.a.d(this.q0.e, i0.a.d(this.r0.e, getThemedColor(j6.L6), getThemedColor(j6.q7)), getThemedColor(j6.uj));
        this.d0.setTextColor(d);
        k6 k6Var = this.e0;
        k6Var.setTextColor(d);
        this.f0.b.setTextColor(d);
        if (j6.B1(k6Var.getSizeableBackground(), j6.l1(0.15f, d), false)) {
            k6Var.invalidate();
        }
    }

    public final void b0(long j10, boolean z4) {
        ((k6) this.b0.b).c(j10 >= 3600 ? AndroidUtilities.formatFullDuration((int) j10) : AndroidUtilities.formatDurationNoHours((int) j10, true), z4, true);
    }

    public final void c0(boolean z4) {
        long value = this.Z.getValue();
        int approximatedMyPlace = this.i0.getApproximatedMyPlace();
        int approximatePlaceFromStars = this.i0.approximatePlaceFromStars(value);
        long max = Math.max(value, this.i0.getCurrentMyBid());
        q qVar = this.f0;
        qVar.a(max, false);
        if (approximatedMyPlace > 0) {
            approximatePlaceFromStars = Math.min(approximatedMyPlace, approximatePlaceFromStars);
        }
        qVar.b(approximatePlaceFromStars, false, z4);
        GiftAuctionController.Auction auction = this.i0;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        k6 k6Var = this.e0;
        if (tL_starGiftAuctionState != null && approximatePlaceFromStars > 0 && auction.gift.title != null && auction.getBidStatus() == GiftAuctionController.Auction.BidStatus.WINNING && !this.i0.isUpcoming()) {
            GiftAuctionController.Auction auction2 = this.i0;
            int i10 = auction2.auctionStateActive.last_gift_num + approximatePlaceFromStars;
            if (i10 <= auction2.gift.availability_total) {
                k6Var.setText(this.i0.gift.title + " #" + LocaleController.formatNumber(i10, ','));
                return;
            }
        }
        k6Var.setText(null);
    }

    public final void d0(boolean z4) {
        boolean z10;
        GiftAuctionController.Auction.BidStatus bidStatus = this.i0.getBidStatus();
        long value = this.Z.getValue();
        long j10 = this.i0.auctionUserState.bid_amount;
        org.telegram.ui.Cells.l4 l4Var = this.d0;
        boolean z11 = false;
        if (value <= j10) {
            z10 = true;
            if (bidStatus == GiftAuctionController.Auction.BidStatus.OUTBID) {
                l4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z4);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.RETURNED) {
                l4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z4);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.WINNING) {
                l4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusWinning), z4);
                z10 = false;
                z11 = true;
            } else {
                l4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z4);
            }
            this.q0.a(z11, z4);
            this.r0.a(z10, z4);
        }
        l4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z4);
        z10 = false;
        this.q0.a(z11, z4);
        this.r0.a(z10, z4);
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.U, this);
        this.Y.b();
        super.dismiss();
    }

    public final void e0(boolean z4) {
        org.telegram.ui.ActionBar.p2 R;
        int i10;
        ((k6) this.a0.b).c(ja.X0(false, "⭐️" + LocaleController.formatNumberWithMillion((int) this.i0.getMinimumBid(), ','), 0.78f, this.o0), z4, true);
        if (this.i0.auctionStateActive != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            boolean isUpcoming = this.i0.isUpcoming(currentTime);
            kf.p pVar = this.Y;
            if (isUpcoming) {
                long max = Math.max(0, this.i0.auctionStateActive.start_date - currentTime);
                pVar.a(max);
                b0(max, z4);
            } else {
                long max2 = Math.max(0, this.i0.auctionStateActive.next_round_at - currentTime);
                pVar.a(max2);
                b0(max2, z4);
            }
            org.telegram.ui.Components.u5 u5Var = this.p0;
            ah.e eVar = this.c0;
            if (u5Var == null && this.i0.gift.sticker != null) {
                this.p0 = new org.telegram.ui.Components.u5(this.i0.gift.sticker.id, ((k6) eVar.b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.p0 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.p0, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(this.i0.auctionStateActive.gifts_left, ','));
            ((k6) eVar.b).c(spannableStringBuilder, z4, true);
            TextView textView = (TextView) this.b0.c;
            if (this.i0.isUpcoming()) {
                i10 = R.string.Gift2AuctionBidInfoUntilStart;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.i0.auctionStateActive;
                i10 = tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds ? R.string.Gift2AuctionBidInfoUntilEndRound : R.string.Gift2AuctionBidInfoUntilNextRound;
            }
            textView.setText(LocaleController.getString(i10));
            q[] qVarArr = this.g0;
            int min = Math.min(qVarArr.length, this.i0.auctionStateActive.top_bidders.size());
            if (min > 0) {
                int i11 = 0;
                while (i11 < min) {
                    int i12 = i11 + 1;
                    Long l10 = this.i0.auctionStateActive.top_bidders.get(i11);
                    long longValue = l10.longValue();
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l10);
                    if (user != null) {
                        qVarArr[i11].c(user);
                    }
                    qVarArr[i11].a(this.i0.approximateBidAmountFromPlace(i12), z4);
                    qVarArr[i11].setOnClickListener(new dh.s(this, longValue, 1));
                    i11 = i12;
                }
            }
        }
        GiftAuctionController.Auction auction = this.i0;
        long approximateBidAmountFromPlace = auction.approximateBidAmountFromPlace(auction.gift.gifts_per_round) + 1;
        n nVar = this.Z;
        nVar.setStarsTop(approximateBidAmountFromPlace);
        nVar.setTopText(LocaleController.formatPluralString("StarsReactionTopX", this.i0.gift.gifts_per_round, new Object[0]));
        c0(z4);
        d0(z4);
        Z(z4);
        W();
        long peerDialogId = DialogObject.getPeerDialogId(this.i0.auctionUserState.peer);
        long j10 = this.i0.auctionUserState.acquired_count;
        if (this.m0 < j10 && !this.n0 && (R = LaunchActivity.R()) != null) {
            long j11 = this.l0;
            if (j11 != 0) {
                zn R9 = zn.R9(j11);
                R9.whenFullyVisible(new ag.c(R9, 1));
                R.presentFragment(R9);
                Runnable runnable = this.k0;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (peerDialogId != 0) {
            this.l0 = peerDialogId;
        }
        this.m0 = j10;
        this.n0 = false;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onContainerTranslationYChanged(float f10) {
        super.onContainerTranslationYChanged(f10);
        V();
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.t0 = false;
        V();
        ic.h(this.container);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.t0 = true;
        V();
        ic.a(this.container, new gg.w(3));
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnAuctionUpdateListener
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.i0 = auction;
        e0(this.t0);
    }

    @Override // org.telegram.ui.Components.sa
    public final ql0 v(rl0 rl0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.currentAccount, 0, true, new dg.r1(this, 6), this.resourcesProvider);
        this.u0 = w51Var;
        w51Var.r = false;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2AuctionPlaceABidTitle);
    }
}
