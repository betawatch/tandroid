package ih;

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
import i7.h6;
import java.util.ArrayList;
import jh.ia;
import jh.s7;
import jh.y9;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.y80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.th;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class t extends xa implements GiftAuctionController.OnAuctionUpdateListener {
    public static final /* synthetic */ int w0 = 0;
    public final long T;
    public final w41 U;
    public final jh.b V;
    public final p W;
    public final jf.p X;
    public final o Y;
    public final bg.d1 Z;
    public final bg.d1 a0;
    public final bg.d1 b0;
    public final org.telegram.ui.Cells.k4 c0;
    public final o6 d0;
    public final r e0;
    public final r[] f0;
    public final FrameLayout g0;
    public GiftAuctionController.Auction h0;
    public final s i0;
    public Runnable j0;
    public long k0;
    public long l0;
    public boolean m0;
    public final iq[] n0;
    public org.telegram.ui.Components.y5 o0;
    public final vd.a p0;
    public final vd.a q0;
    public final iq[] r0;
    public boolean s0;
    public k51 t0;
    public boolean u0;
    public boolean v0;

    public t(Context context, org.telegram.ui.ActionBar.c6 c6Var, s sVar, GiftAuctionController.Auction auction) {
        super(context, null, false, false, false, false, false, 2, c6Var);
        this.f0 = new r[3];
        this.m0 = true;
        this.n0 = new iq[1];
        g gVar = new g(this);
        jr jrVar = jr.h;
        this.p0 = new vd.a(0, gVar, jrVar, 380L, false);
        this.q0 = new vd.a(0, new g(this), jrVar, 380L, false);
        this.r0 = new iq[1];
        this.h0 = auction;
        this.i0 = sVar;
        long j10 = auction.giftId;
        this.T = j10;
        this.N = true;
        this.v = 0.2f;
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j10, this);
        this.X = new jf.p(new g(this));
        int i10 = 0;
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        g0.S(this.e, context, c6Var, subscribeToGiftAuction.gift);
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.U = w41.j(-1, linearLayout);
        o oVar = new o(this, context, c6Var);
        this.Y = oVar;
        oVar.K = true;
        this.h0.getMinimumBid();
        this.h0.getCurrentMyBid();
        long currentTopBid = this.h0.getCurrentTopBid();
        int i11 = currentTopBid > 100000 ? ((((int) currentTopBid) * 3) / 2000) * MediaDataController.MAX_STYLE_RUNS_COUNT : currentTopBid > 30000 ? 100000 : 50000;
        int i12 = 15;
        int[] iArr = {50, 100, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2000, 5000, 7500, 10000, 25000, 50000, 100000, 500000, MediaController.VIDEO_BITRATE_480, 5000000, 10000000};
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        boolean z10 = false;
        while (true) {
            if (i13 >= i12) {
                break;
            }
            int i14 = iArr[i13];
            if (i14 >= 50) {
                z10 = i14 == 50 ? false : z10;
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
                z10 = true;
            }
            i13++;
            i12 = 15;
        }
        if (z10) {
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
        o oVar2 = this.Y;
        oVar2.a0 = iArr2;
        linearLayout.addView(oVar2, i7.f6.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        bg.d1 d1Var = new bg.d1(context, 2, c6Var);
        this.Z = d1Var;
        int dp = AndroidUtilities.dp(12.0f);
        int i17 = g6.a7;
        int themedColor = getThemedColor(i17);
        int h = i0.a.h(getThemedColor(g6.i6), getThemedColor(i17));
        d1Var.setBackground(g6.i0(dp, dp, dp, dp, themedColor, h, h));
        d1Var.setOnClickListener(new l(this, i15));
        ((TextView) d1Var.c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoMinimumBid));
        bg.d1 d1Var2 = new bg.d1(context, 2, c6Var);
        this.a0 = d1Var2;
        d1Var2.setBackground(g6.b0(AndroidUtilities.dp(12.0f), getThemedColor(i17)));
        ((TextView) d1Var2.c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoUntilNextRound));
        bg.d1 d1Var3 = new bg.d1(context, 2, c6Var);
        this.b0 = d1Var3;
        d1Var3.setBackground(g6.b0(AndroidUtilities.dp(12.0f), getThemedColor(i17)));
        ((TextView) d1Var3.c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoLeft));
        linearLayout2.addView(d1Var, i7.f6.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), i7.f6.l(0.0f, 10, -1));
        linearLayout2.addView(d1Var2, i7.f6.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), i7.f6.l(0.0f, 10, -1));
        linearLayout2.addView(d1Var3, i7.f6.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, i7.f6.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (subscribeToGiftAuction.auctionUserState.acquired_count > 0) {
            y80 y80Var = new y80(context, c6Var);
            y80Var.setGravity(17);
            y80Var.setTextSize(1, 16.0f);
            int i18 = g6.J6;
            y80Var.setTextColor(g6.v0(i18, c6Var));
            y80Var.setLinkTextColor(g6.v0(i18, c6Var));
            y80Var.setOnClickListener(new bg.q(this, new boolean[1], c6Var, 3));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(subscribeToGiftAuction.giftDocumentId, y80Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            y80Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", subscribeToGiftAuction.auctionUserState.acquired_count, spannableStringBuilder), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            h6.b(y80Var, 0.02f, 1.5f);
            linearLayout.addView(y80Var, i7.f6.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i19 = g6.L6;
        int i20 = 2;
        org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context, i19, 21, 0, 0, false, true, c6Var);
        this.c0 = k4Var;
        linearLayout.addView(k4Var, i7.f6.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        o6 o6Var = new o6(context, false, false, false);
        this.d0 = o6Var;
        o6Var.setTextSize(AndroidUtilities.dp(12.5f));
        o6Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        o6Var.setSizeableBackground(g6.Z(0, 0, 9, 9));
        o6Var.setHideBackgroundIfEmpty(true);
        k4Var.setOnWidthUpdateListener(new cg.m2(this, 18));
        k4Var.addView(o6Var, i7.f6.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        r rVar = new r(context, c6Var);
        this.e0 = rVar;
        rVar.b.setTextColor(getThemedColor(i19));
        rVar.c(user);
        linearLayout.addView(rVar, i7.f6.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.k4 k4Var2 = new org.telegram.ui.Cells.k4(context, i19, 21, 15, 0, false, false, c6Var);
        k4Var2.setText(LocaleController.getString(R.string.Gift2AuctionTop3Winners));
        linearLayout.addView(k4Var2, i7.f6.n(-1, -2));
        int i21 = 0;
        while (true) {
            r[] rVarArr = this.f0;
            if (i21 >= rVarArr.length) {
                break;
            }
            rVarArr[i21] = new r(context, c6Var);
            int i22 = i21 + 1;
            this.f0[i21].b(i22, true, false);
            this.f0[i21].setBackground(g6.K0(false));
            r rVar2 = this.f0[i21];
            rVar2.f = i21 < 2;
            rVar2.setOnClickListener(new bg.n(i20));
            linearLayout.addView(this.f0[i21], i7.f6.n(-1, -2));
            i21 = i22;
        }
        p pVar = new p(context, c6Var, true);
        this.W = pVar;
        pVar.e();
        FrameLayout.LayoutParams d = i7.f6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i23 = d.leftMargin;
        int i24 = this.backgroundPaddingLeft;
        d.leftMargin = i23 + i24;
        d.rightMargin += i24;
        this.containerView.addView(pVar, d);
        jl0 jl0Var = this.d;
        int i25 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i25, 0, i25, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new a(1));
        long j11 = subscribeToGiftAuction.auctionUserState.bid_amount;
        if (j11 > 0) {
            this.Y.setValue((int) j11);
        } else {
            this.Y.setValue((int) subscribeToGiftAuction.getMinimumBid());
        }
        e0(false);
        this.d.setOverScrollMode(2);
        jh.b bVar = new jh.b(context, this.currentAccount, c6Var);
        this.V = bVar;
        bVar.setScaleX(0.6f);
        bVar.setScaleY(0.6f);
        bVar.setAlpha(0.0f);
        bVar.setEnabled(false);
        bVar.setClickable(false);
        this.container.addView(bVar, i7.f6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        h6.a(bVar);
        bVar.setOnClickListener(new n(context, i10, c6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.g0 = frameLayout;
        this.container.addView(frameLayout, i7.f6.e(-1, 100, 48));
        a0();
        this.t0.N(false);
    }

    public static void P(t tVar, long j10) {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            if (UserObject.isService(j10)) {
                return;
            }
            Bundle bundle = new Bundle();
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
                if (j10 == UserConfig.getInstance(tVar.currentAccount).getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j10);
            }
            bundle.putBoolean("open_gifts", true);
            U.presentFragment(new ProfileActivity(bundle, null));
        }
        Runnable runnable = tVar.j0;
        if (runnable != null) {
            runnable.run();
        }
        tVar.dismiss();
    }

    public static void Q(t tVar) {
        int value = tVar.Y.getValue();
        int minimumBid = (int) tVar.h0.getMinimumBid();
        if (value >= minimumBid) {
            tVar.X(value);
        } else {
            AndroidUtilities.shakeView(tVar.W);
            new tc(tVar.container, tVar.resourcesProvider).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionMinimumBidIncreased", minimumBid, new Object[0]))).j();
        }
    }

    public static /* synthetic */ void R(t tVar, boolean[] zArr, org.telegram.ui.ActionBar.c6 c6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(tVar.currentAccount).getOrRequestAcquiredGifts(tVar.T, new i(tVar, zArr, c6Var, 0));
    }

    public static void S(t tVar, long j10, Boolean bool, String str) {
        FrameLayout frameLayout = tVar.g0;
        tVar.W.setLoading(false);
        tVar.v0 = false;
        if (bool != null) {
            boolean z10 = j10 > 0;
            ic icVar = new ic(tVar.getContext(), tVar.resourcesProvider);
            icVar.a.setImageResource(R.drawable.filled_gift_sell_24);
            String string = LocaleController.getString(z10 ? R.string.Gift2AuctionsBidHasBeenIncreased : R.string.Gift2AuctionsBidHasBeenPlaced);
            TextView textView = icVar.b;
            textView.setText(string);
            textView.setSingleLine(true);
            textView.setTextSize(1, 15.0f);
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            String formatString = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(tVar.h0.gift.gifts_per_round));
            TextView textView2 = icVar.c;
            textView2.setText(formatString);
            textView2.setSingleLine(false);
            textView2.setMaxLines(5);
            tVar.Y();
            mc.f(frameLayout, icVar, 2750).j();
            s7.y(tVar.currentAccount, false).q(false, true, null);
        }
        if (str != null) {
            tVar.Y();
            th.r(R.string.UnknownErrorCode, new Object[]{str}, new tc(frameLayout, tVar.resourcesProvider), R.raw.error, 36);
        }
    }

    public static void T(t tVar, int i10) {
        tVar.Y.f(lh.s.b(tVar.currentAccount, i10, 3), lh.s.b(tVar.currentAccount, i10, 4), true);
        tVar.c0(tVar.s0);
        tVar.d0(tVar.s0);
        tVar.Z(tVar.s0);
        tVar.W();
    }

    public static void U(t tVar) {
        Context context = tVar.getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (findActivity != null) {
            findActivity.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, tVar.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2AuctionPlaceACustomBid);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        c2Var.P = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(tVar.h0.gift.gifts_per_round));
        bh.b bVar = new bh.b(context, tVar.resourcesProvider, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        bVar.setTextSize(1, 18.0f);
        bVar.setTextColor(g6.v0(g6.j5, tVar.resourcesProvider));
        bVar.setHintColor(g6.v0(g6.Xh, tVar.resourcesProvider));
        bVar.setHintText(LocaleController.getString(R.string.Gift2AuctionPlaceACustomBidHint2));
        bVar.setFocusable(true);
        bVar.setInputType(2);
        bVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        bVar.setLineColors(g6.v0(g6.k6, tVar.resourcesProvider), g6.v0(g6.l6, tVar.resourcesProvider), g6.v0(g6.p7, tVar.resourcesProvider));
        bVar.setImeOptions(268435462);
        bVar.setBackgroundDrawable(null);
        bVar.hintLayoutOffset = AndroidUtilities.dp(24.0f);
        bVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        bVar.addTextChangedListener(new q(tVar, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(bVar, i7.f6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        c2Var.a = AndroidUtilities.dp(300.0f);
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2AuctionPlaceABid), new a9.s(19, tVar, bVar));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new eg.c(22));
        org.telegram.ui.ActionBar.c2[] c2VarArr = {c2Var};
        if (R != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, R.getClassGuid());
        }
        c2VarArr[0].setOnDismissListener(new j(bVar, R, findActivity, i10));
        c2VarArr[0].setOnShowListener(new k(i10, bVar));
        c2VarArr[0].show();
        View d = c2VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        c2VarArr[0].d0 = false;
        bVar.setSelection(bVar.getText().length());
    }

    public final void V() {
        boolean z10 = this.s0 && !isDismissed();
        if (this.u0 != z10) {
            this.u0 = z10;
            jh.b bVar = this.V;
            if (bVar != null) {
                bVar.setEnabled(z10);
                bVar.setClickable(z10);
                bVar.animate().scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).alpha(z10 ? 1.0f : 0.0f).setDuration(180L).start();
            }
        }
    }

    public final void W() {
        o oVar = this.Y;
        int value = oVar.getValue();
        if (oVar.getProgress() > 0.99f) {
            oVar.g(LocaleController.getString(R.string.Gift2AuctionTapToBidMore));
            return;
        }
        long j10 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.h0.auctionUserState;
        long j11 = tL_StarGiftAuctionUserState.bid_amount;
        if (j10 == j11) {
            oVar.g(LocaleController.getString(R.string.Gift2AuctionYourBid));
            return;
        }
        if (j11 <= 0 || tL_StarGiftAuctionUserState.returned) {
            oVar.g(null);
            return;
        }
        long j12 = j10 - j11;
        if (j12 <= 0) {
            oVar.g(null);
            return;
        }
        oVar.g("+" + LocaleController.formatNumber(j12, ','));
    }

    public final void X(int i10) {
        if (this.v0) {
            return;
        }
        long j10 = this.h0.auctionUserState.bid_amount;
        long j11 = i10;
        if (j10 > 0) {
            j11 -= j10;
        }
        long j12 = j11;
        if (s7.y(this.currentAccount, false).e && s7.y(this.currentAccount, false).q(false, false, null).amount < j12) {
            new y9(getContext(), this.resourcesProvider, j12, 14, null, null, 0L).show();
            return;
        }
        this.v0 = true;
        this.W.setLoading(true);
        GiftAuctionController.getInstance(this.currentAccount).sendBid(this.T, this.i0, i10, new m(this, j10, 0));
    }

    public final void Y() {
        FrameLayout frameLayout;
        if (this.shadowDrawable == null || this.containerView == null || (frameLayout = this.g0) == null) {
            return;
        }
        frameLayout.setTranslationY(Math.max(0.0f, ((this.containerView.getY() + r0.getBounds().top) - frameLayout.getMeasuredHeight()) + AndroidUtilities.dp(10.0f)));
    }

    public final void Z(boolean z10) {
        long value = this.Y.getValue();
        long currentMyBid = this.h0.getCurrentMyBid();
        int i10 = 0;
        int i11 = 1;
        p pVar = this.W;
        if (value == currentMyBid) {
            pVar.g(LocaleController.getString(R.string.OK), z10, true);
            pVar.setOnClickListener(new l(this, i10));
            return;
        }
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.h0.auctionUserState;
        long j10 = tL_StarGiftAuctionUserState.bid_amount;
        iq[] iqVarArr = this.r0;
        if (j10 >= value || tL_StarGiftAuctionUserState.returned) {
            pVar.g(ia.V0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBid, LocaleController.formatNumber(value, ',')), iqVarArr), z10, true);
        } else {
            pVar.g(ia.V0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBidAdd, LocaleController.formatNumber(value - j10, ',')), iqVarArr), z10, true);
        }
        pVar.setOnClickListener(new l(this, i11));
    }

    public final void a0() {
        int d = i0.a.d(this.p0.e, i0.a.d(this.q0.e, getThemedColor(g6.L6), getThemedColor(g6.q7)), getThemedColor(g6.uj));
        this.c0.setTextColor(d);
        o6 o6Var = this.d0;
        o6Var.setTextColor(d);
        this.e0.b.setTextColor(d);
        if (g6.B1(o6Var.getSizeableBackground(), g6.l1(0.15f, d), false)) {
            o6Var.invalidate();
        }
    }

    public final void b0(long j10, boolean z10) {
        ((o6) this.a0.b).c(j10 >= 3600 ? AndroidUtilities.formatFullDuration((int) j10) : AndroidUtilities.formatDurationNoHours((int) j10, true), z10, true);
    }

    public final void c0(boolean z10) {
        long value = this.Y.getValue();
        int approximatedMyPlace = this.h0.getApproximatedMyPlace();
        int approximatePlaceFromStars = this.h0.approximatePlaceFromStars(value);
        long max = Math.max(value, this.h0.getCurrentMyBid());
        r rVar = this.e0;
        rVar.a(max, false);
        if (approximatedMyPlace > 0) {
            approximatePlaceFromStars = Math.min(approximatedMyPlace, approximatePlaceFromStars);
        }
        rVar.b(approximatePlaceFromStars, false, z10);
        GiftAuctionController.Auction auction = this.h0;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        o6 o6Var = this.d0;
        if (tL_starGiftAuctionState != null && approximatePlaceFromStars > 0 && auction.gift.title != null && auction.getBidStatus() == GiftAuctionController.Auction.BidStatus.WINNING && !this.h0.isUpcoming()) {
            GiftAuctionController.Auction auction2 = this.h0;
            int i10 = auction2.auctionStateActive.last_gift_num + approximatePlaceFromStars;
            if (i10 <= auction2.gift.availability_total) {
                o6Var.setText(this.h0.gift.title + " #" + LocaleController.formatNumber(i10, ','));
                return;
            }
        }
        o6Var.setText(null);
    }

    public final void d0(boolean z10) {
        boolean z11;
        GiftAuctionController.Auction.BidStatus bidStatus = this.h0.getBidStatus();
        long value = this.Y.getValue();
        long j10 = this.h0.auctionUserState.bid_amount;
        org.telegram.ui.Cells.k4 k4Var = this.c0;
        boolean z12 = false;
        if (value <= j10) {
            z11 = true;
            if (bidStatus == GiftAuctionController.Auction.BidStatus.OUTBID) {
                k4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z10);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.RETURNED) {
                k4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z10);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.WINNING) {
                k4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusWinning), z10);
                z11 = false;
                z12 = true;
            } else {
                k4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z10);
            }
            this.p0.a(z12, z10);
            this.q0.a(z11, z10);
        }
        k4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z10);
        z11 = false;
        this.p0.a(z12, z10);
        this.q0.a(z11, z10);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.T, this);
        this.X.b();
        super.dismiss();
    }

    public final void e0(boolean z10) {
        org.telegram.ui.ActionBar.o2 R;
        int i10;
        ((o6) this.Z.b).c(ia.X0(false, "⭐️" + LocaleController.formatNumberWithMillion((int) this.h0.getMinimumBid(), ','), 0.78f, this.n0), z10, true);
        if (this.h0.auctionStateActive != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            boolean isUpcoming = this.h0.isUpcoming(currentTime);
            jf.p pVar = this.X;
            if (isUpcoming) {
                long max = Math.max(0, this.h0.auctionStateActive.start_date - currentTime);
                pVar.a(max);
                b0(max, z10);
            } else {
                long max2 = Math.max(0, this.h0.auctionStateActive.next_round_at - currentTime);
                pVar.a(max2);
                b0(max2, z10);
            }
            org.telegram.ui.Components.y5 y5Var = this.o0;
            bg.d1 d1Var = this.b0;
            if (y5Var == null && this.h0.gift.sticker != null) {
                this.o0 = new org.telegram.ui.Components.y5(this.h0.gift.sticker.id, ((o6) d1Var.b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.o0 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.o0, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(this.h0.auctionStateActive.gifts_left, ','));
            ((o6) d1Var.b).c(spannableStringBuilder, z10, true);
            TextView textView = (TextView) this.a0.c;
            if (this.h0.isUpcoming()) {
                i10 = R.string.Gift2AuctionBidInfoUntilStart;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.h0.auctionStateActive;
                i10 = tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds ? R.string.Gift2AuctionBidInfoUntilEndRound : R.string.Gift2AuctionBidInfoUntilNextRound;
            }
            textView.setText(LocaleController.getString(i10));
            r[] rVarArr = this.f0;
            int min = Math.min(rVarArr.length, this.h0.auctionStateActive.top_bidders.size());
            if (min > 0) {
                int i11 = 0;
                while (i11 < min) {
                    int i12 = i11 + 1;
                    Long l10 = this.h0.auctionStateActive.top_bidders.get(i11);
                    long longValue = l10.longValue();
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l10);
                    if (user != null) {
                        rVarArr[i11].c(user);
                    }
                    rVarArr[i11].a(this.h0.approximateBidAmountFromPlace(i12), z10);
                    rVarArr[i11].setOnClickListener(new bh.s(this, longValue, 1));
                    i11 = i12;
                }
            }
        }
        GiftAuctionController.Auction auction = this.h0;
        long approximateBidAmountFromPlace = auction.approximateBidAmountFromPlace(auction.gift.gifts_per_round) + 1;
        o oVar = this.Y;
        oVar.setStarsTop(approximateBidAmountFromPlace);
        oVar.setTopText(LocaleController.formatPluralString("StarsReactionTopX", this.h0.gift.gifts_per_round, new Object[0]));
        c0(z10);
        d0(z10);
        Z(z10);
        W();
        long peerDialogId = DialogObject.getPeerDialogId(this.h0.auctionUserState.peer);
        long j10 = this.h0.auctionUserState.acquired_count;
        if (this.l0 < j10 && !this.m0 && (R = LaunchActivity.R()) != null) {
            long j11 = this.k0;
            if (j11 != 0) {
                tn R9 = tn.R9(j11);
                R9.whenFullyVisible(new h(R9, 0));
                R.presentFragment(R9);
                Runnable runnable = this.j0;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (peerDialogId != 0) {
            this.k0 = peerDialogId;
        }
        this.l0 = j10;
        this.m0 = false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onContainerTranslationYChanged(float f9) {
        super.onContainerTranslationYChanged(f9);
        V();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.s0 = false;
        V();
        mc.h(this.container);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.s0 = true;
        V();
        mc.a(this.container, new eg.x(3));
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnAuctionUpdateListener
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.h0 = auction;
        e0(this.s0);
    }

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(this.d, getContext(), this.currentAccount, 0, true, new bg.t1(this, 6), this.resourcesProvider);
        this.t0 = k51Var;
        k51Var.r = false;
        return k51Var;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2AuctionPlaceABidTitle);
    }
}
