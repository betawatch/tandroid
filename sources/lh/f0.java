package lh;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import mh.ja;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.tz0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.bw0;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class f0 extends sa implements GiftAuctionController.OnAuctionUpdateListener {
    public static final sc[] m0 = new sc[1];
    public static final sz0[] n0 = new sz0[1];
    public final TL_stars.StarGift U;
    public final long V;
    public final LinearLayout W;
    public final FrameLayout X;
    public final TextView Y;
    public final sc Z;
    public final sc a0;
    public final sc b0;
    public final sc c0;
    public final sz0 d0;
    public final a0 e0;
    public final TableRow f0;
    public final qh.d g0;
    public final g90 h0;
    public final g90 i0;
    public GiftAuctionController.Auction j0;
    public final CharSequence k0;
    public x51 l0;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(Context context, g6 g6Var, long j10, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, false, false, false, 1, g6Var);
        boolean z4;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i10;
        int i11;
        String formatString;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.U = starGift;
        long j11 = starGift.id;
        this.V = j11;
        this.H = AndroidUtilities.dp(6.0f);
        this.v = 0.2f;
        fixNavigationBar();
        String str = starGift.title;
        String str2 = str == null ? "Gift" : str;
        LinearLayout linearLayout = new LinearLayout(context);
        this.W = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, g6Var);
        kVar.C(-1, false);
        kVar.setOccupyStatusBar(false);
        S(kVar, context, g6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        frameLayout.addView(kVar, k7.c6.n(-1, -2));
        linearLayout.addView(frameLayout);
        b0 b0Var = new b0(context, this.currentAccount, g6Var);
        b0Var.U = true;
        b0Var.g(starGift, false, false, false, false, false);
        b0Var.setImageSize(AndroidUtilities.dp(100.0f));
        b0Var.setImageLayer(7);
        b0Var.G.setVisibility(8);
        frameLayout.addView(b0Var, k7.c6.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i12 = k6.G6;
        textView.setTextColor(k6.v0(i12, g6Var));
        linearLayout.addView(textView, k7.c6.t(-1, -2, 17, 20, 0, 20, 6));
        g90 g90Var = new g90(context, null);
        this.h0 = g90Var;
        g90Var.setGravity(17);
        g90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionInfo2", starGift.gifts_per_round, str2)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new y(context, g6Var, starGift, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
        g90Var.setTextSize(1, 14.0f);
        g90Var.setTextColor(k6.v0(i12, g6Var));
        int i13 = k6.J6;
        g90Var.setLinkTextColor(k6.v0(i13, g6Var));
        linearLayout.addView(g90Var, k7.c6.t(-1, -2, 17, 20, 0, 20, 4));
        tz0 tz0Var = new tz0(context, g6Var);
        String string = LocaleController.getString(R.string.Gift2AuctionTableStarted);
        sc[] scVarArr = m0;
        tz0Var.c(string, "", null, scVarArr);
        this.Z = scVarArr[0];
        tz0Var.c(LocaleController.getString(R.string.Gift2AuctionTableEnded), "", null, scVarArr);
        this.a0 = scVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(tz0Var, k7.c6.e(-1, -2, 119));
        this.e0 = new a0(this, new qh.f3[1], frameLayout2, 0);
        TableRow c3 = tz0Var.c(LocaleController.getString(R.string.GiftValueAveragePrice), "", null, scVarArr);
        this.f0 = c3;
        final int i14 = 1;
        c3.setOnClickListener(new View.OnClickListener(this) { // from class: lh.z
            public final /* synthetic */ f0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        new fg.n1(this.b.getContext(), 40, (g6) null).show();
                        break;
                    default:
                        this.b.T();
                        break;
                }
            }
        });
        this.b0 = scVarArr[0];
        sz0[] sz0VarArr = n0;
        tz0Var.c("", "", sz0VarArr, scVarArr);
        this.c0 = scVarArr[0];
        this.d0 = sz0VarArr[0];
        linearLayout.addView(frameLayout2, k7.c6.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        g90 g90Var2 = new g90(context, g6Var);
        this.i0 = g90Var2;
        g90Var2.setGravity(17);
        g90Var2.setTextSize(1, 16.0f);
        g90Var2.setTextColor(k6.v0(i13, g6Var));
        g90Var2.setLinkTextColor(k6.v0(i13, g6Var));
        g90Var2.setOnClickListener(new eg.o(this, new boolean[1], g6Var, 5));
        k7.e6.b(g90Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.u5(starGift.sticker, g90Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.k0 = spannableStringBuilder;
        } else {
            this.k0 = "";
        }
        qh.d dVar = new qh.d(context, g6Var, true);
        this.g0 = dVar;
        dVar.e();
        dVar.setOnClickListener(new u(this, j10, context, g6Var, runnable, 0));
        FrameLayout.LayoutParams d = k7.c6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(dVar, d);
        tl0 tl0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        tl0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(64.0f));
        this.l0.N(false);
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j11, this);
        this.j0 = subscribeToGiftAuction;
        if (subscribeToGiftAuction != null && (tL_starGiftAuctionState2 = subscribeToGiftAuction.auctionStateActive) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                tz0Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRounds), LocaleController.formatNumber(this.j0.auctionStateActive.total_rounds, ','), null, null);
            } else {
                tz0Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRound), LocaleController.formatString(R.string.OfS, LocaleController.formatNumber(this.j0.auctionStateActive.current_round, ','), LocaleController.formatNumber(this.j0.auctionStateActive.total_rounds, ',')), null, null);
            }
        }
        GiftAuctionController.Auction auction = this.j0;
        if (auction != null && (tL_starGiftAuctionState = auction.auctionStateActive) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i18 = 0; i18 < size; i18++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.j0.auctionStateActive.rounds.get(i18);
                if (i18 < size - 1) {
                    i10 = 1;
                    i11 = this.j0.auctionStateActive.rounds.get(i18 + 1).num - 1;
                } else {
                    i10 = 1;
                    i11 = this.j0.auctionStateActive.total_rounds;
                }
                int i19 = starGiftAuctionRound.num;
                if (i19 == i11) {
                    int i20 = R.string.Gift2AuctionTableCurrentRoundsOne;
                    Object[] objArr = new Object[i10];
                    objArr[0] = Integer.valueOf(i19);
                    formatString = LocaleController.formatString(i20, objArr);
                } else {
                    int i21 = R.string.Gift2AuctionTableCurrentRoundsTwo;
                    Integer valueOf = Integer.valueOf(i19);
                    Integer valueOf2 = Integer.valueOf(i11);
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = valueOf;
                    objArr2[i10] = valueOf2;
                    formatString = LocaleController.formatString(i21, objArr2);
                }
                tz0Var.c(formatString, starGiftAuctionRound.num == i11 ? LocaleController.formatString(R.string.Gift2AuctionTableCurrentRoundsOneDuration, LocaleController.formatTTLString(starGiftAuctionRound.duration), LocaleController.formatTTLString(starGiftAuctionRound.current_window), Integer.valueOf(starGiftAuctionRound.extend_top)) : LocaleController.formatPluralString("Gift2AuctionTableCurrentRoundsTwoDuration", starGiftAuctionRound.duration / 60, new Object[0]), null, null);
            }
        }
        GiftAuctionController.Auction auction2 = this.j0;
        if (auction2 == null || auction2.previewAttributes == null) {
            z4 = false;
        } else {
            int i22 = 3;
            z4 = false;
            Object[] objArr3 = 0;
            d0 d0Var = new d0(this, context, g6Var, new v(this, 0), new eg.m(i22), new eg.m(i22), new eg.m(i22), new eg.m(i22), new eg.m(i22), new eg.m(i22));
            d0Var.d(new c5.d(1, 1));
            d0Var.setPreviewingAttributes(this.j0.previewAttributes);
            d0Var.removeView(d0Var.L);
            this.X.addView(d0Var, 0, k7.c6.e(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.Y = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            GiftAuctionController.Auction auction3 = this.j0;
            if (auction3.auctionStateFinished != null) {
                textView2.setText(LocaleController.getString(R.string.Gift2AuctionEndedNoDot));
            } else if (auction3.isUpcoming()) {
                textView2.setText(LocaleController.getString(R.string.Gift2LinkUpcomingAuction));
            } else {
                textView2.setText(LocaleController.getString(R.string.Gift2LinkGiftAuction));
            }
            textView2.setBackground(k6.Z(0, 285212671, 13, 13));
            textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            TextView h = yh.h(this.X, textView2, k7.c6.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            h.setTypeface(AndroidUtilities.bold());
            h.setTextSize(1, 21.0f);
            h.setText(str2);
            h.setGravity(17);
            h.setTextColor(-1);
            TextView h9 = yh.h(this.X, h, k7.c6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            h9.setTextSize(1, 13.0f);
            h9.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore2), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            h9.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            h9.setGravity(17);
            h9.setTextColor(-1342177281);
            final Object[] objArr4 = objArr3 == true ? 1 : 0;
            h9.setOnClickListener(new View.OnClickListener(this) { // from class: lh.z
                public final /* synthetic */ f0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (objArr4) {
                        case 0:
                            new fg.n1(this.b.getContext(), 40, (g6) null).show();
                            break;
                        default:
                            this.b.T();
                            break;
                    }
                }
            });
            k7.e6.b(h9, 0.02f, 1.5f);
            this.X.addView(h9, k7.c6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            b0Var.setVisibility(8);
            textView.setVisibility(8);
            this.h0.setVisibility(8);
            g90 g90Var3 = new g90(context, g6Var);
            g90Var3.setGravity(17);
            g90Var3.setTextSize(1, 16.0f);
            int i23 = k6.J6;
            g90Var3.setTextColor(k6.v0(i23, g6Var));
            g90Var3.setLinkTextColor(k6.v0(i23, g6Var));
            g90Var3.setOnClickListener(new eg.o(this, context, g6Var, 4));
            k7.e6.b(g90Var3, 0.02f, 1.5f);
            this.W.addView(g90Var3, k7.c6.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(mf.d.c(this.j0.previewAttributes, TL_stars.starGiftAttributeModel.class));
            long j12 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i24 = 0; i24 < 3; i24++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) rVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.u5(stargiftattributemodel.document, g90Var3.getPaint().getFontMetricsInt()), i24, i24 + 1, 33);
                }
            }
            g90Var3.setText(AndroidUtilities.replaceArrows(LocaleController.formatSpannable(R.string.Gift2AuctionVariants, spannableStringBuilder2, LocaleController.formatNumber(j12, ',')), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        }
        this.W.addView(this.i0, k7.c6.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        V(z4);
    }

    public static /* synthetic */ void P(f0 f0Var, boolean[] zArr, g6 g6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(f0Var.currentAccount).getOrRequestAcquiredGifts(f0Var.V, new h(f0Var, zArr, g6Var, 1));
    }

    public static void Q(f0 f0Var, long j10, Context context, g6 g6Var, Runnable runnable) {
        GiftAuctionController.Auction auction;
        ArrayList<TL_stars.StarGiftAttribute> arrayList;
        GiftAuctionController.Auction auction2 = f0Var.j0;
        if (auction2 != null && !auction2.isFinished()) {
            if ((j10 == 0 || j10 == UserConfig.getInstance(f0Var.currentAccount).getClientUserId()) && (arrayList = (auction = f0Var.j0).previewAttributes) != null) {
                new m0(context, g6Var, j10, auction.gift, arrayList, runnable, false).show();
            } else {
                new c0(context, f0Var.currentAccount, f0Var.j0.gift, null, j10, runnable, false, false).show();
            }
        }
        f0Var.dismiss();
    }

    public static /* synthetic */ void R(f0 f0Var, Context context, g6 g6Var) {
        int i10 = f0Var.currentAccount;
        GiftAuctionController.Auction auction = f0Var.j0;
        new mh.i1(context, g6Var, i10, auction.gift.title, auction.previewAttributes, false).show();
        f0Var.dismiss();
    }

    public static void S(org.telegram.ui.ActionBar.k kVar, Context context, g6 g6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new e0(context, starGift, g6Var));
        org.telegram.ui.ActionBar.w0 a2 = kVar.n().a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        a2.e(4, R.drawable.msg_info, LocaleController.getString(R.string.MoreInfo));
        a2.e(3, R.drawable.menu_feature_links, LocaleController.getString(R.string.CopyLink));
        a2.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareLink));
    }

    public static void U(Context context, TL_stars.StarGift starGift, g6 g6Var) {
        if (context == null || starGift == null) {
            return;
        }
        org.telegram.ui.ActionBar.h3 o10 = org.telegram.messenger.y3.o(context, null, false, false);
        Runnable runnable = o10.dismissRunnable;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f));
        imageView.setImageResource(R.drawable.filled_gift_sell_24);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(k6.v0(k6.Oh, g6Var));
        imageView.setBackground(shapeDrawable);
        linearLayout.addView(imageView, k7.c6.t(80, 80, 17, 0, 21, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.GiftAuctionInfoHeader));
        textView.setTextSize(1, 20.0f);
        int i10 = k6.G6;
        textView.setTextColor(k6.v0(i10, g6Var));
        linearLayout.addView(textView, k7.c6.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftAuctionInfoText));
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(k6.v0(i10, g6Var));
        linearLayout.addView(textView2, k7.c6.t(-1, -2, 17, 20, 0, 20, 16));
        bw0 bw0Var = new bw0(context, g6Var);
        int i11 = starGift.gifts_per_round;
        bw0Var.a.l(LocaleController.formatPluralString("GiftAuctionInfo1Header", i11, Integer.valueOf(i11)), false);
        int i12 = starGift.gifts_per_round;
        bw0Var.b.setText(LocaleController.formatPluralString("GiftAuctionInfo1Text", i12, Integer.valueOf(i12)));
        bw0Var.d.setVisibility(8);
        int i13 = R.drawable.menu_top_bidders_24;
        ImageView imageView2 = bw0Var.c;
        imageView2.setImageResource(i13);
        imageView2.setColorFilter(k6.v0(i10, g6Var));
        linearLayout.addView(bw0Var, k7.c6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        bw0 bw0Var2 = new bw0(context, g6Var);
        bw0Var2.a.l(LocaleController.getString(R.string.GiftAuctionInfo2Header), false);
        bw0Var2.b.setText(LocaleController.formatPluralString("GiftAuctionInfo2Text", starGift.gifts_per_round, new Object[0]));
        bw0Var2.d.setVisibility(8);
        int i14 = R.drawable.menu_carryover_24;
        ImageView imageView3 = bw0Var2.c;
        imageView3.setImageResource(i14);
        imageView3.setColorFilter(k6.v0(i10, g6Var));
        linearLayout.addView(bw0Var2, k7.c6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        bw0 bw0Var3 = new bw0(context, g6Var);
        bw0Var3.a.l(LocaleController.getString(R.string.GiftAuctionInfo3Header), false);
        bw0Var3.b.setText(LocaleController.getString(R.string.GiftAuctionInfo3Text));
        bw0Var3.d.setVisibility(8);
        int i15 = R.drawable.menu_bid_refund_24;
        ImageView imageView4 = bw0Var3.c;
        imageView4.setImageResource(i15);
        imageView4.setColorFilter(k6.v0(i10, g6Var));
        linearLayout.addView(bw0Var3, k7.c6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        qh.d dVar = new qh.d(context, g6Var, true);
        dVar.setOnClickListener(new jg.u(1, runnable));
        dVar.g(mh.g5.g2(LocaleController.getString(R.string.Understood)), false, true);
        linearLayout.addView(dVar, k7.c6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        o10.customView = linearLayout;
        o10.show();
    }

    public final void T() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction = this.j0;
        if (auction == null || (tL_starGiftAuctionStateFinished = auction.auctionStateFinished) == null || auction.gift.title == null) {
            return;
        }
        this.e0.run(this.b0, LocaleController.formatString(R.string.Gift2AveragePriceHint, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.j0.gift.title));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(boolean z4) {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        int i10;
        int i11;
        int i12;
        GiftAuctionController.Auction auction;
        TableRow tableRow;
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction2 = this.j0;
        sc scVar = this.a0;
        sc scVar2 = this.Z;
        qh.d dVar = this.g0;
        int i13 = 1;
        if (auction2 != null && (tL_starGiftAuctionStateFinished = auction2.auctionStateFinished) != null) {
            scVar2.setText(LocaleController.formatDateTime(tL_starGiftAuctionStateFinished.start_date, true));
            scVar.setText(LocaleController.formatDateTime(this.j0.auctionStateFinished.end_date, true));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ja.X0(false, l.d.l(this.j0.auctionStateFinished.average_price, ',', new StringBuilder("⭐️ ")), 0.8f, null));
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) tc.b("?", new v(this, i13), this.resourcesProvider, null));
            this.b0.setText(spannableStringBuilder);
        } else if (auction2 != null && (tL_starGiftAuctionState = auction2.auctionStateActive) != null) {
            scVar2.setText(LocaleController.formatDateTime(tL_starGiftAuctionState.start_date, true));
            scVar.setText(LocaleController.formatDateTime(this.j0.auctionStateActive.end_date, true));
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            if (this.j0.isUpcoming(currentTime)) {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(this.j0.auctionStateActive.start_date - currentTime)), z4);
            } else {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(this.j0.auctionStateActive.end_date - currentTime)), z4);
            }
        }
        GiftAuctionController.Auction auction3 = this.j0;
        TL_stars.StarGift starGift = this.U;
        if (auction3 != null) {
            if (auction3.isFinished()) {
                i10 = 0;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2 = this.j0.auctionStateActive;
                if (tL_starGiftAuctionState2 != null) {
                    i10 = tL_starGiftAuctionState2.gifts_left;
                }
            }
            i11 = starGift.availability_total;
            sc scVar3 = this.c0;
            sz0 sz0Var = this.d0;
            if (i10 != i11) {
                sz0Var.setText(LocaleController.getString(R.string.Gift2AuctionTableCurrentQuantity));
                scVar3.setText(LocaleController.formatNumber(i11, ','));
            } else {
                sz0Var.setText(LocaleController.getString(R.string.Gift2AuctionTableCurrentAvailability));
                scVar3.setText(LocaleController.formatPluralString("Gift2Availability4Value", i10, LocaleController.formatNumber(i11, ',')));
            }
            i12 = this.j0.auctionUserState.acquired_count;
            g90 g90Var = this.i0;
            if (i12 <= 0) {
                g90Var.setVisibility(0);
                g90Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", i12, this.k0), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            } else {
                g90Var.setVisibility(8);
            }
            auction = this.j0;
            tableRow = this.f0;
            if ((auction != null || auction.auctionStateFinished == null) && !starGift.sold_out) {
                tableRow.setVisibility(8);
                dVar.g(LocaleController.getString(R.string.Gift2AuctionJoin), z4, true);
            }
            String string = LocaleController.getString(R.string.Gift2AuctionEnded);
            g90 g90Var2 = this.h0;
            g90Var2.setText(string);
            g90Var2.setTextColor(k6.v0(k6.q7, this.resourcesProvider));
            tableRow.setVisibility(0);
            dVar.g(LocaleController.getString(R.string.OK), z4, true);
            dVar.f(null, z4);
            return;
        }
        i10 = starGift.availability_remains;
        i11 = starGift.availability_total;
        sc scVar32 = this.c0;
        sz0 sz0Var2 = this.d0;
        if (i10 != i11) {
        }
        i12 = this.j0.auctionUserState.acquired_count;
        g90 g90Var3 = this.i0;
        if (i12 <= 0) {
        }
        auction = this.j0;
        tableRow = this.f0;
        if (auction != null) {
        }
        tableRow.setVisibility(8);
        dVar.g(LocaleController.getString(R.string.Gift2AuctionJoin), z4, true);
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.V, this);
        super.dismiss();
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnAuctionUpdateListener
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.j0 = auction;
        V(true);
    }

    @Override // org.telegram.ui.Components.sa
    public final sl0 v(tl0 tl0Var) {
        x51 x51Var = new x51(this.d, getContext(), this.currentAccount, 0, true, new eg.p1(this, 7), this.resourcesProvider);
        this.l0 = x51Var;
        x51Var.r = false;
        return x51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return "";
    }
}
