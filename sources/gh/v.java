package gh;

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
import hh.ea;
import hh.oa;
import hh.u7;
import java.util.ArrayList;
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
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class v extends qa implements GiftAuctionController.OnAuctionUpdateListener {
    public static final /* synthetic */ int w0 = 0;
    public final long T;
    public final n41 U;
    public final hh.b V;
    public final q W;
    public final gf.q X;
    public final p Y;
    public final ag.y1 Z;
    public final ag.y1 a0;
    public final ag.y1 b0;
    public final org.telegram.ui.Cells.j4 c0;
    public final org.telegram.ui.Components.j6 d0;
    public final t e0;
    public final t[] f0;
    public final FrameLayout g0;
    public GiftAuctionController.Auction h0;
    public final u i0;
    public Runnable j0;
    public long k0;
    public long l0;
    public boolean m0;
    public final cq[] n0;
    public org.telegram.ui.Components.t5 o0;
    public final ud.a p0;
    public final ud.a q0;
    public final cq[] r0;
    public boolean s0;
    public b51 t0;
    public boolean u0;
    public boolean v0;

    public v(Context context, org.telegram.ui.ActionBar.c6 c6Var, u uVar, GiftAuctionController.Auction auction) {
        super(context, null, false, false, false, false, false, 2, c6Var);
        this.f0 = new t[3];
        this.m0 = true;
        this.n0 = new cq[1];
        g gVar = new g(this);
        er erVar = er.h;
        this.p0 = new ud.a(0, gVar, erVar, 380L, false);
        this.q0 = new ud.a(0, new g(this), erVar, 380L, false);
        this.r0 = new cq[1];
        this.h0 = auction;
        this.i0 = uVar;
        long j10 = auction.giftId;
        this.T = j10;
        this.N = true;
        this.v = 0.2f;
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j10, this);
        this.X = new gf.q(new g(this));
        int i10 = 0;
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        i0.S(this.e, context, c6Var, subscribeToGiftAuction.gift);
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.U = n41.j(-1, linearLayout);
        p pVar = new p(this, context, c6Var);
        this.Y = pVar;
        pVar.K = true;
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
        p pVar2 = this.Y;
        pVar2.a0 = iArr2;
        linearLayout.addView(pVar2, h7.z5.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ag.y1 y1Var = new ag.y1(context, 1, c6Var);
        this.Z = y1Var;
        int dp = AndroidUtilities.dp(12.0f);
        int i17 = org.telegram.ui.ActionBar.g6.a7;
        int themedColor = getThemedColor(i17);
        int h = i0.b.h(getThemedColor(org.telegram.ui.ActionBar.g6.i6), getThemedColor(i17));
        y1Var.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, themedColor, h, h));
        y1Var.setOnClickListener(new l(this, i15));
        ((TextView) y1Var.c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoMinimumBid));
        ag.y1 y1Var2 = new ag.y1(context, 1, c6Var);
        this.a0 = y1Var2;
        y1Var2.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(12.0f), getThemedColor(i17)));
        ((TextView) y1Var2.c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoUntilNextRound));
        ag.y1 y1Var3 = new ag.y1(context, 1, c6Var);
        this.b0 = y1Var3;
        y1Var3.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(12.0f), getThemedColor(i17)));
        ((TextView) y1Var3.c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoLeft));
        linearLayout2.addView(y1Var, h7.z5.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), h7.z5.l(0.0f, 10, -1));
        linearLayout2.addView(y1Var2, h7.z5.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), h7.z5.l(0.0f, 10, -1));
        linearLayout2.addView(y1Var3, h7.z5.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, h7.z5.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (subscribeToGiftAuction.auctionUserState.acquired_count > 0) {
            p80 p80Var = new p80(context, c6Var);
            p80Var.setGravity(17);
            p80Var.setTextSize(1, 16.0f);
            int i18 = org.telegram.ui.ActionBar.g6.J6;
            p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i18, c6Var));
            p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i18, c6Var));
            p80Var.setOnClickListener(new gg.f(this, new boolean[1], c6Var, 2));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.t5(subscribeToGiftAuction.giftDocumentId, p80Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            p80Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", subscribeToGiftAuction.auctionUserState.acquired_count, spannableStringBuilder), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            h7.b6.b(p80Var, 0.02f, 1.5f);
            linearLayout.addView(p80Var, h7.z5.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i19 = org.telegram.ui.ActionBar.g6.L6;
        org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context, i19, 21, 0, 0, false, true, c6Var);
        this.c0 = j4Var;
        linearLayout.addView(j4Var, h7.z5.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.d0 = j6Var;
        j6Var.setTextSize(AndroidUtilities.dp(12.5f));
        j6Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        j6Var.setSizeableBackground(org.telegram.ui.ActionBar.g6.Z(0, 0, 9, 9));
        j6Var.setHideBackgroundIfEmpty(true);
        j4Var.setOnWidthUpdateListener(new f2.r(this, 5));
        j4Var.addView(j6Var, h7.z5.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        t tVar = new t(context, c6Var);
        this.e0 = tVar;
        tVar.b.setTextColor(getThemedColor(i19));
        tVar.c(user);
        linearLayout.addView(tVar, h7.z5.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.j4 j4Var2 = new org.telegram.ui.Cells.j4(context, i19, 21, 15, 0, false, false, c6Var);
        j4Var2.setText(LocaleController.getString(R.string.Gift2AuctionTop3Winners));
        linearLayout.addView(j4Var2, h7.z5.n(-1, -2));
        int i20 = 0;
        while (true) {
            t[] tVarArr = this.f0;
            if (i20 >= tVarArr.length) {
                break;
            }
            tVarArr[i20] = new t(context, c6Var);
            int i21 = i20 + 1;
            this.f0[i20].b(i21, true, false);
            this.f0[i20].setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            t tVar2 = this.f0[i20];
            tVar2.f = i20 < 2;
            tVar2.setOnClickListener(new ag.l2(1));
            linearLayout.addView(this.f0[i20], h7.z5.n(-1, -2));
            i20 = i21;
        }
        q qVar = new q(context, c6Var, true);
        this.W = qVar;
        qVar.e();
        FrameLayout.LayoutParams d = h7.z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i22 = d.leftMargin;
        int i23 = this.backgroundPaddingLeft;
        d.leftMargin = i22 + i23;
        d.rightMargin += i23;
        this.containerView.addView(qVar, d);
        zk0 zk0Var = this.d;
        int i24 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i24, 0, i24, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new a(1));
        long j11 = subscribeToGiftAuction.auctionUserState.bid_amount;
        if (j11 > 0) {
            this.Y.setValue((int) j11);
        } else {
            this.Y.setValue((int) subscribeToGiftAuction.getMinimumBid());
        }
        e0(false);
        this.d.setOverScrollMode(2);
        hh.b bVar = new hh.b(context, this.currentAccount, c6Var);
        this.V = bVar;
        bVar.setScaleX(0.6f);
        bVar.setScaleY(0.6f);
        bVar.setAlpha(0.0f);
        bVar.setEnabled(false);
        bVar.setClickable(false);
        this.container.addView(bVar, h7.z5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        h7.b6.a(bVar);
        bVar.setOnClickListener(new n(context, i10, c6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.g0 = frameLayout;
        this.container.addView(frameLayout, h7.z5.e(-1, 100, 48));
        a0();
        this.t0.N(false);
    }

    public static void P(v vVar, long j10) {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            if (UserObject.isService(j10)) {
                return;
            }
            Bundle bundle = new Bundle();
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
                if (j10 == UserConfig.getInstance(vVar.currentAccount).getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j10);
            }
            bundle.putBoolean("open_gifts", true);
            U.presentFragment(new ProfileActivity(bundle, null));
        }
        Runnable runnable = vVar.j0;
        if (runnable != null) {
            runnable.run();
        }
        vVar.dismiss();
    }

    public static void Q(v vVar) {
        int value = vVar.Y.getValue();
        int minimumBid = (int) vVar.h0.getMinimumBid();
        if (value >= minimumBid) {
            vVar.X(value);
        } else {
            AndroidUtilities.shakeView(vVar.W);
            new mc(vVar.container, vVar.resourcesProvider).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionMinimumBidIncreased", minimumBid, new Object[0]))).j();
        }
    }

    public static /* synthetic */ void R(v vVar, boolean[] zArr, org.telegram.ui.ActionBar.c6 c6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(vVar.currentAccount).getOrRequestAcquiredGifts(vVar.T, new i(vVar, zArr, c6Var, 0));
    }

    public static void S(v vVar, long j10, Boolean bool, String str) {
        FrameLayout frameLayout = vVar.g0;
        vVar.W.setLoading(false);
        vVar.v0 = false;
        if (bool != null) {
            boolean z10 = j10 > 0;
            ac acVar = new ac(vVar.getContext(), vVar.resourcesProvider);
            acVar.a.setImageResource(R.drawable.filled_gift_sell_24);
            String string = LocaleController.getString(z10 ? R.string.Gift2AuctionsBidHasBeenIncreased : R.string.Gift2AuctionsBidHasBeenPlaced);
            TextView textView = acVar.b;
            textView.setText(string);
            textView.setSingleLine(true);
            textView.setTextSize(1, 15.0f);
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            String formatString = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(vVar.h0.gift.gifts_per_round));
            TextView textView2 = acVar.c;
            textView2.setText(formatString);
            textView2.setSingleLine(false);
            textView2.setMaxLines(5);
            vVar.Y();
            ec.f(frameLayout, acVar, 2750).j();
            u7.y(vVar.currentAccount, false).q(false, true, null);
        }
        if (str != null) {
            vVar.Y();
            pa.r(R.string.UnknownErrorCode, new Object[]{str}, new mc(frameLayout, vVar.resourcesProvider), R.raw.error, 36);
        }
    }

    public static void T(v vVar, int i10) {
        vVar.Y.f(jh.s.b(vVar.currentAccount, i10, 3), jh.s.b(vVar.currentAccount, i10, 4), true);
        vVar.c0(vVar.s0);
        vVar.d0(vVar.s0);
        vVar.Z(vVar.s0);
        vVar.W();
    }

    public static void U(v vVar) {
        Context context = vVar.getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (findActivity != null) {
            findActivity.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, vVar.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2AuctionPlaceACustomBid);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.N = string;
        b2Var.P = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(vVar.h0.gift.gifts_per_round));
        r rVar = new r(context, vVar.resourcesProvider, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        rVar.setTextSize(1, 18.0f);
        rVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, vVar.resourcesProvider));
        rVar.setHintColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xh, vVar.resourcesProvider));
        rVar.setHintText(LocaleController.getString(R.string.Gift2AuctionPlaceACustomBidHint2));
        rVar.setFocusable(true);
        rVar.setInputType(2);
        rVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        rVar.setLineColors(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.k6, vVar.resourcesProvider), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.l6, vVar.resourcesProvider), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.p7, vVar.resourcesProvider));
        rVar.setImeOptions(268435462);
        rVar.setBackgroundDrawable(null);
        rVar.hintLayoutOffset = AndroidUtilities.dp(24.0f);
        rVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        rVar.addTextChangedListener(new s(vVar, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(rVar, h7.z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        b2Var.a = AndroidUtilities.dp(300.0f);
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2AuctionPlaceABid), new ag.h0(17, vVar, rVar));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new f9.z(9));
        org.telegram.ui.ActionBar.b2[] b2VarArr = {b2Var};
        if (R != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, R.getClassGuid());
        }
        b2VarArr[0].setOnDismissListener(new j(rVar, R, findActivity, i10));
        b2VarArr[0].setOnShowListener(new k(i10, rVar));
        b2VarArr[0].show();
        View d = b2VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        b2VarArr[0].d0 = false;
        rVar.setSelection(rVar.getText().length());
    }

    public final void V() {
        boolean z10 = this.s0 && !isDismissed();
        if (this.u0 != z10) {
            this.u0 = z10;
            hh.b bVar = this.V;
            if (bVar != null) {
                bVar.setEnabled(z10);
                bVar.setClickable(z10);
                bVar.animate().scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).alpha(z10 ? 1.0f : 0.0f).setDuration(180L).start();
            }
        }
    }

    public final void W() {
        p pVar = this.Y;
        int value = pVar.getValue();
        if (pVar.getProgress() > 0.99f) {
            pVar.g(LocaleController.getString(R.string.Gift2AuctionTapToBidMore));
            return;
        }
        long j10 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.h0.auctionUserState;
        long j11 = tL_StarGiftAuctionUserState.bid_amount;
        if (j10 == j11) {
            pVar.g(LocaleController.getString(R.string.Gift2AuctionYourBid));
            return;
        }
        if (j11 <= 0 || tL_StarGiftAuctionUserState.returned) {
            pVar.g(null);
            return;
        }
        long j12 = j10 - j11;
        if (j12 <= 0) {
            pVar.g(null);
            return;
        }
        pVar.g("+" + LocaleController.formatNumber(j12, ','));
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
        if (u7.y(this.currentAccount, false).e && u7.y(this.currentAccount, false).q(false, false, null).amount < j12) {
            new ea(getContext(), this.resourcesProvider, j12, 14, null, null, 0L).show();
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
        q qVar = this.W;
        if (value == currentMyBid) {
            qVar.g(LocaleController.getString(R.string.OK), z10, true);
            qVar.setOnClickListener(new l(this, i10));
            return;
        }
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.h0.auctionUserState;
        long j10 = tL_StarGiftAuctionUserState.bid_amount;
        cq[] cqVarArr = this.r0;
        if (j10 >= value || tL_StarGiftAuctionUserState.returned) {
            qVar.g(oa.V0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBid, LocaleController.formatNumber(value, ',')), cqVarArr), z10, true);
        } else {
            qVar.g(oa.V0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBidAdd, LocaleController.formatNumber(value - j10, ',')), cqVarArr), z10, true);
        }
        qVar.setOnClickListener(new l(this, i11));
    }

    public final void a0() {
        int d = i0.b.d(this.p0.e, i0.b.d(this.q0.e, getThemedColor(org.telegram.ui.ActionBar.g6.L6), getThemedColor(org.telegram.ui.ActionBar.g6.q7)), getThemedColor(org.telegram.ui.ActionBar.g6.uj));
        this.c0.setTextColor(d);
        org.telegram.ui.Components.j6 j6Var = this.d0;
        j6Var.setTextColor(d);
        this.e0.b.setTextColor(d);
        if (org.telegram.ui.ActionBar.g6.B1(j6Var.getSizeableBackground(), org.telegram.ui.ActionBar.g6.l1(0.15f, d), false)) {
            j6Var.invalidate();
        }
    }

    public final void b0(long j10, boolean z10) {
        ((org.telegram.ui.Components.j6) this.a0.b).c(j10 >= 3600 ? AndroidUtilities.formatFullDuration((int) j10) : AndroidUtilities.formatDurationNoHours((int) j10, true), z10, true);
    }

    public final void c0(boolean z10) {
        long value = this.Y.getValue();
        int approximatedMyPlace = this.h0.getApproximatedMyPlace();
        int approximatePlaceFromStars = this.h0.approximatePlaceFromStars(value);
        long max = Math.max(value, this.h0.getCurrentMyBid());
        t tVar = this.e0;
        tVar.a(max, false);
        if (approximatedMyPlace > 0) {
            approximatePlaceFromStars = Math.min(approximatedMyPlace, approximatePlaceFromStars);
        }
        tVar.b(approximatePlaceFromStars, false, z10);
        GiftAuctionController.Auction auction = this.h0;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        org.telegram.ui.Components.j6 j6Var = this.d0;
        if (tL_starGiftAuctionState != null && approximatePlaceFromStars > 0 && auction.gift.title != null && auction.getBidStatus() == GiftAuctionController.Auction.BidStatus.WINNING && !this.h0.isUpcoming()) {
            GiftAuctionController.Auction auction2 = this.h0;
            int i10 = auction2.auctionStateActive.last_gift_num + approximatePlaceFromStars;
            if (i10 <= auction2.gift.availability_total) {
                j6Var.setText(this.h0.gift.title + " #" + LocaleController.formatNumber(i10, ','));
                return;
            }
        }
        j6Var.setText(null);
    }

    public final void d0(boolean z10) {
        boolean z11;
        GiftAuctionController.Auction.BidStatus bidStatus = this.h0.getBidStatus();
        long value = this.Y.getValue();
        long j10 = this.h0.auctionUserState.bid_amount;
        org.telegram.ui.Cells.j4 j4Var = this.c0;
        boolean z12 = false;
        if (value <= j10) {
            z11 = true;
            if (bidStatus == GiftAuctionController.Auction.BidStatus.OUTBID) {
                j4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z10);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.RETURNED) {
                j4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z10);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.WINNING) {
                j4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusWinning), z10);
                z11 = false;
                z12 = true;
            } else {
                j4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z10);
            }
            this.p0.a(z12, z10);
            this.q0.a(z11, z10);
        }
        j4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z10);
        z11 = false;
        this.p0.a(z12, z10);
        this.q0.a(z11, z10);
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.T, this);
        this.X.b();
        super.dismiss();
    }

    public final void e0(boolean z10) {
        org.telegram.ui.ActionBar.n2 R;
        int i10;
        ((org.telegram.ui.Components.j6) this.Z.b).c(oa.X0(false, "⭐️" + LocaleController.formatNumberWithMillion((int) this.h0.getMinimumBid(), ','), 0.78f, this.n0), z10, true);
        if (this.h0.auctionStateActive != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            boolean isUpcoming = this.h0.isUpcoming(currentTime);
            gf.q qVar = this.X;
            if (isUpcoming) {
                long max = Math.max(0, this.h0.auctionStateActive.start_date - currentTime);
                qVar.a(max);
                b0(max, z10);
            } else {
                long max2 = Math.max(0, this.h0.auctionStateActive.next_round_at - currentTime);
                qVar.a(max2);
                b0(max2, z10);
            }
            org.telegram.ui.Components.t5 t5Var = this.o0;
            ag.y1 y1Var = this.b0;
            if (t5Var == null && this.h0.gift.sticker != null) {
                this.o0 = new org.telegram.ui.Components.t5(this.h0.gift.sticker.id, ((org.telegram.ui.Components.j6) y1Var.b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.o0 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.o0, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(this.h0.auctionStateActive.gifts_left, ','));
            ((org.telegram.ui.Components.j6) y1Var.b).c(spannableStringBuilder, z10, true);
            TextView textView = (TextView) this.a0.c;
            if (this.h0.isUpcoming()) {
                i10 = R.string.Gift2AuctionBidInfoUntilStart;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.h0.auctionStateActive;
                i10 = tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds ? R.string.Gift2AuctionBidInfoUntilEndRound : R.string.Gift2AuctionBidInfoUntilNextRound;
            }
            textView.setText(LocaleController.getString(i10));
            t[] tVarArr = this.f0;
            int min = Math.min(tVarArr.length, this.h0.auctionStateActive.top_bidders.size());
            if (min > 0) {
                int i11 = 0;
                while (i11 < min) {
                    int i12 = i11 + 1;
                    Long l10 = this.h0.auctionStateActive.top_bidders.get(i11);
                    long longValue = l10.longValue();
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l10);
                    if (user != null) {
                        tVarArr[i11].c(user);
                    }
                    tVarArr[i11].a(this.h0.approximateBidAmountFromPlace(i12), z10);
                    tVarArr[i11].setOnClickListener(new o(this, longValue, 0));
                    i11 = i12;
                }
            }
        }
        GiftAuctionController.Auction auction = this.h0;
        long approximateBidAmountFromPlace = auction.approximateBidAmountFromPlace(auction.gift.gifts_per_round) + 1;
        p pVar = this.Y;
        pVar.setStarsTop(approximateBidAmountFromPlace);
        pVar.setTopText(LocaleController.formatPluralString("StarsReactionTopX", this.h0.gift.gifts_per_round, new Object[0]));
        c0(z10);
        d0(z10);
        Z(z10);
        W();
        long peerDialogId = DialogObject.getPeerDialogId(this.h0.auctionUserState.peer);
        long j10 = this.h0.auctionUserState.acquired_count;
        if (this.l0 < j10 && !this.m0 && (R = LaunchActivity.R()) != null) {
            long j11 = this.k0;
            if (j11 != 0) {
                rn R9 = rn.R9(j11);
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

    @Override // org.telegram.ui.ActionBar.e3
    public final void onContainerTranslationYChanged(float f10) {
        super.onContainerTranslationYChanged(f10);
        V();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.s0 = false;
        V();
        ec.h(this.container);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.s0 = true;
        V();
        ec.a(this.container, new cg.w(3));
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnAuctionUpdateListener
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.h0 = auction;
        e0(this.s0);
    }

    @Override // org.telegram.ui.Components.qa
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(this.d, getContext(), this.currentAccount, 0, true, new ch.c(this, 5), this.resourcesProvider);
        this.t0 = b51Var;
        b51Var.r = false;
        return b51Var;
    }

    @Override // org.telegram.ui.Components.qa
    public final CharSequence z() {
        return LocaleController.getString(R.string.Gift2AuctionPlaceABidTitle);
    }
}
