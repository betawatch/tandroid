package fh;

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
import gh.oa;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.qv0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k0 extends sa implements GiftAuctionController.OnAuctionUpdateListener {
    public static final qc[] l0 = new qc[1];
    public static final vy0[] m0 = new vy0[1];
    public final TL_stars.StarGift T;
    public final long U;
    public final LinearLayout V;
    public final FrameLayout W;
    public final TextView X;
    public final qc Y;
    public final qc Z;
    public final qc a0;
    public final qc b0;
    public final vy0 c0;
    public final f0 d0;
    public final TableRow e0;
    public final kh.d f0;
    public final l80 g0;
    public final l80 h0;
    public GiftAuctionController.Auction i0;
    public final CharSequence j0;
    public z41 k0;

    /* JADX WARN: Multi-variable type inference failed */
    public k0(Context context, org.telegram.ui.ActionBar.b6 b6Var, long j10, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, false, false, false, 1, b6Var);
        boolean z10;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i9;
        int i10;
        String formatString;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.T = starGift;
        long j11 = starGift.id;
        this.U = j11;
        this.G = AndroidUtilities.dp(6.0f);
        this.v = 0.2f;
        fixNavigationBar();
        String str = starGift.title;
        String str2 = str == null ? "Gift" : str;
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, b6Var);
        kVar.C(-1, false);
        kVar.setOccupyStatusBar(false);
        R(kVar, context, b6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.addView(kVar, g7.e6.n(-1, -2));
        linearLayout.addView(frameLayout);
        g0 g0Var = new g0(context, this.currentAccount, b6Var);
        g0Var.T = true;
        g0Var.g(starGift, false, false, false, false, false);
        g0Var.setImageSize(AndroidUtilities.dp(100.0f));
        g0Var.setImageLayer(7);
        g0Var.F.setVisibility(8);
        frameLayout.addView(g0Var, g7.e6.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.f6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        linearLayout.addView(textView, g7.e6.t(-1, -2, 17, 20, 0, 20, 6));
        l80 l80Var = new l80(context, null);
        this.g0 = l80Var;
        l80Var.setGravity(17);
        l80Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionInfo2", starGift.gifts_per_round, str2)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new d0(context, b6Var, starGift, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
        l80Var.setTextSize(1, 14.0f);
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        int i12 = org.telegram.ui.ActionBar.f6.J6;
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
        linearLayout.addView(l80Var, g7.e6.t(-1, -2, 17, 20, 0, 20, 4));
        wy0 wy0Var = new wy0(context, b6Var);
        String string = LocaleController.getString(R.string.Gift2AuctionTableStarted);
        qc[] qcVarArr = l0;
        wy0Var.c(string, "", null, qcVarArr);
        this.Y = qcVarArr[0];
        wy0Var.c(LocaleController.getString(R.string.Gift2AuctionTableEnded), "", null, qcVarArr);
        this.Z = qcVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(wy0Var, g7.e6.e(-1, -2, 119));
        this.d0 = new f0(this, new kh.x3[1], frameLayout2, 0);
        TableRow c10 = wy0Var.c(LocaleController.getString(R.string.GiftValueAveragePrice), "", null, qcVarArr);
        this.e0 = c10;
        final int i13 = 1;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: fh.e0
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        new zf.x0(this.b.getContext(), 40, (org.telegram.ui.ActionBar.b6) null).show();
                        break;
                    default:
                        this.b.S();
                        break;
                }
            }
        });
        this.a0 = qcVarArr[0];
        vy0[] vy0VarArr = m0;
        wy0Var.c("", "", vy0VarArr, qcVarArr);
        this.b0 = qcVarArr[0];
        this.c0 = vy0VarArr[0];
        linearLayout.addView(frameLayout2, g7.e6.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        l80 l80Var2 = new l80(context, b6Var);
        this.h0 = l80Var2;
        l80Var2.setGravity(17);
        l80Var2.setTextSize(1, 16.0f);
        l80Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
        l80Var2.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
        l80Var2.setOnClickListener(new fg.f(this, new boolean[1], b6Var, 4));
        g7.g6.b(l80Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.t5(starGift.sticker, l80Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.j0 = spannableStringBuilder;
        } else {
            this.j0 = "";
        }
        kh.d dVar = new kh.d(context, b6Var, true);
        this.f0 = dVar;
        dVar.e();
        dVar.setOnClickListener(new z(this, j10, context, b6Var, runnable, 0));
        FrameLayout.LayoutParams d = g7.e6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i14 = d.leftMargin;
        int i15 = this.backgroundPaddingLeft;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.containerView.addView(dVar, d);
        wk0 wk0Var = this.d;
        int i16 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(64.0f));
        this.k0.N(false);
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j11, this);
        this.i0 = subscribeToGiftAuction;
        if (subscribeToGiftAuction != null && (tL_starGiftAuctionState2 = subscribeToGiftAuction.auctionStateActive) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                wy0Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRounds), LocaleController.formatNumber(this.i0.auctionStateActive.total_rounds, ','), null, null);
            } else {
                wy0Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRound), LocaleController.formatString(R.string.OfS, LocaleController.formatNumber(this.i0.auctionStateActive.current_round, ','), LocaleController.formatNumber(this.i0.auctionStateActive.total_rounds, ',')), null, null);
            }
        }
        GiftAuctionController.Auction auction = this.i0;
        if (auction != null && (tL_starGiftAuctionState = auction.auctionStateActive) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.i0.auctionStateActive.rounds.get(i17);
                if (i17 < size - 1) {
                    i9 = 1;
                    i10 = this.i0.auctionStateActive.rounds.get(i17 + 1).num - 1;
                } else {
                    i9 = 1;
                    i10 = this.i0.auctionStateActive.total_rounds;
                }
                int i18 = starGiftAuctionRound.num;
                if (i18 == i10) {
                    int i19 = R.string.Gift2AuctionTableCurrentRoundsOne;
                    Object[] objArr = new Object[i9];
                    objArr[0] = Integer.valueOf(i18);
                    formatString = LocaleController.formatString(i19, objArr);
                } else {
                    int i20 = R.string.Gift2AuctionTableCurrentRoundsTwo;
                    Integer valueOf = Integer.valueOf(i18);
                    Integer valueOf2 = Integer.valueOf(i10);
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = valueOf;
                    objArr2[i9] = valueOf2;
                    formatString = LocaleController.formatString(i20, objArr2);
                }
                wy0Var.c(formatString, starGiftAuctionRound.num == i10 ? LocaleController.formatString(R.string.Gift2AuctionTableCurrentRoundsOneDuration, LocaleController.formatTTLString(starGiftAuctionRound.duration), LocaleController.formatTTLString(starGiftAuctionRound.current_window), Integer.valueOf(starGiftAuctionRound.extend_top)) : LocaleController.formatPluralString("Gift2AuctionTableCurrentRoundsTwoDuration", starGiftAuctionRound.duration / 60, new Object[0]), null, null);
            }
        }
        GiftAuctionController.Auction auction2 = this.i0;
        if (auction2 == null || auction2.previewAttributes == null) {
            z10 = false;
        } else {
            int i21 = 1;
            z10 = false;
            Object[] objArr3 = 0;
            i0 i0Var = new i0(this, context, b6Var, new a0(this, 0), new n(i21), new n(i21), new n(i21), new n(i21), new n(i21), new n(i21));
            i0Var.d(new gh.l4(1, 1));
            i0Var.setPreviewingAttributes(this.i0.previewAttributes);
            i0Var.removeView(i0Var.K);
            this.W.addView(i0Var, 0, g7.e6.e(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.X = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            GiftAuctionController.Auction auction3 = this.i0;
            if (auction3.auctionStateFinished != null) {
                textView2.setText(LocaleController.getString(R.string.Gift2AuctionEndedNoDot));
            } else if (auction3.isUpcoming()) {
                textView2.setText(LocaleController.getString(R.string.Gift2LinkUpcomingAuction));
            } else {
                textView2.setText(LocaleController.getString(R.string.Gift2LinkGiftAuction));
            }
            textView2.setBackground(org.telegram.ui.ActionBar.f6.Z(0, 285212671, 13, 13));
            textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            TextView g10 = org.telegram.ui.Cells.j2.g(this.W, textView2, g7.e6.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            g10.setTypeface(AndroidUtilities.bold());
            g10.setTextSize(1, 21.0f);
            g10.setText(str2);
            g10.setGravity(17);
            g10.setTextColor(-1);
            TextView g11 = org.telegram.ui.Cells.j2.g(this.W, g10, g7.e6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            g11.setTextSize(1, 13.0f);
            g11.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore2), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            g11.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            g11.setGravity(17);
            g11.setTextColor(-1342177281);
            final Object[] objArr4 = objArr3 == true ? 1 : 0;
            g11.setOnClickListener(new View.OnClickListener(this) { // from class: fh.e0
                public final /* synthetic */ k0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (objArr4) {
                        case 0:
                            new zf.x0(this.b.getContext(), 40, (org.telegram.ui.ActionBar.b6) null).show();
                            break;
                        default:
                            this.b.S();
                            break;
                    }
                }
            });
            g7.g6.b(g11, 0.02f, 1.5f);
            this.W.addView(g11, g7.e6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            g0Var.setVisibility(8);
            textView.setVisibility(8);
            this.g0.setVisibility(8);
            l80 l80Var3 = new l80(context, b6Var);
            l80Var3.setGravity(17);
            l80Var3.setTextSize(1, 16.0f);
            int i22 = org.telegram.ui.ActionBar.f6.J6;
            l80Var3.setTextColor(org.telegram.ui.ActionBar.f6.v0(i22, b6Var));
            l80Var3.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i22, b6Var));
            l80Var3.setOnClickListener(new fg.f(this, context, b6Var, 3));
            g7.g6.b(l80Var3, 0.02f, 1.5f);
            this.V.addView(l80Var3, g7.e6.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(gf.d.c(this.i0.previewAttributes, TL_stars.starGiftAttributeModel.class));
            long j12 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i23 = 0; i23 < 3; i23++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) rVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.t5(stargiftattributemodel.document, l80Var3.getPaint().getFontMetricsInt()), i23, i23 + 1, 33);
                }
            }
            l80Var3.setText(AndroidUtilities.replaceArrows(LocaleController.formatSpannable(R.string.Gift2AuctionVariants, spannableStringBuilder2, LocaleController.formatNumber(j12, ',')), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        }
        this.V.addView(this.h0, g7.e6.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        U(z10);
    }

    public static /* synthetic */ void O(k0 k0Var, boolean[] zArr, org.telegram.ui.ActionBar.b6 b6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(k0Var.currentAccount).getOrRequestAcquiredGifts(k0Var.U, new i(k0Var, zArr, b6Var, 1));
    }

    public static void P(k0 k0Var, long j10, Context context, org.telegram.ui.ActionBar.b6 b6Var, Runnable runnable) {
        GiftAuctionController.Auction auction;
        ArrayList<TL_stars.StarGiftAttribute> arrayList;
        GiftAuctionController.Auction auction2 = k0Var.i0;
        if (auction2 != null && !auction2.isFinished()) {
            if ((j10 == 0 || j10 == UserConfig.getInstance(k0Var.currentAccount).getClientUserId()) && (arrayList = (auction = k0Var.i0).previewAttributes) != null) {
                new r0(context, b6Var, j10, auction.gift, arrayList, runnable, false).show();
            } else {
                new h0(context, k0Var.currentAccount, k0Var.i0.gift, null, j10, runnable, false, false).show();
            }
        }
        k0Var.dismiss();
    }

    public static /* synthetic */ void Q(k0 k0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        int i9 = k0Var.currentAccount;
        GiftAuctionController.Auction auction = k0Var.i0;
        new gh.l1(context, b6Var, i9, auction.gift.title, auction.previewAttributes, false).show();
        k0Var.dismiss();
    }

    public static void R(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.b6 b6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new j0(context, starGift, b6Var));
        org.telegram.ui.ActionBar.w0 a2 = kVar.n().a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        a2.e(4, R.drawable.msg_info, LocaleController.getString(R.string.MoreInfo));
        a2.e(3, R.drawable.menu_feature_links, LocaleController.getString(R.string.CopyLink));
        a2.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareLink));
    }

    public static void T(Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.b6 b6Var) {
        if (context == null || starGift == null) {
            return;
        }
        org.telegram.ui.ActionBar.f3 j10 = ll.j(context, null, false, false);
        Runnable runnable = j10.dismissRunnable;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f));
        imageView.setImageResource(R.drawable.filled_gift_sell_24);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var));
        imageView.setBackground(shapeDrawable);
        linearLayout.addView(imageView, g7.e6.t(80, 80, 17, 0, 21, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.GiftAuctionInfoHeader));
        textView.setTextSize(1, 20.0f);
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        linearLayout.addView(textView, g7.e6.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftAuctionInfoText));
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        linearLayout.addView(textView2, g7.e6.t(-1, -2, 17, 20, 0, 20, 16));
        qv0 qv0Var = new qv0(context, b6Var);
        int i10 = starGift.gifts_per_round;
        qv0Var.a.l(LocaleController.formatPluralString("GiftAuctionInfo1Header", i10, Integer.valueOf(i10)), false);
        int i11 = starGift.gifts_per_round;
        qv0Var.b.setText(LocaleController.formatPluralString("GiftAuctionInfo1Text", i11, Integer.valueOf(i11)));
        qv0Var.d.setVisibility(8);
        int i12 = R.drawable.menu_top_bidders_24;
        ImageView imageView2 = qv0Var.c;
        imageView2.setImageResource(i12);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        linearLayout.addView(qv0Var, g7.e6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        qv0 qv0Var2 = new qv0(context, b6Var);
        qv0Var2.a.l(LocaleController.getString(R.string.GiftAuctionInfo2Header), false);
        qv0Var2.b.setText(LocaleController.formatPluralString("GiftAuctionInfo2Text", starGift.gifts_per_round, new Object[0]));
        qv0Var2.d.setVisibility(8);
        int i13 = R.drawable.menu_carryover_24;
        ImageView imageView3 = qv0Var2.c;
        imageView3.setImageResource(i13);
        imageView3.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        linearLayout.addView(qv0Var2, g7.e6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        qv0 qv0Var3 = new qv0(context, b6Var);
        qv0Var3.a.l(LocaleController.getString(R.string.GiftAuctionInfo3Header), false);
        qv0Var3.b.setText(LocaleController.getString(R.string.GiftAuctionInfo3Text));
        qv0Var3.d.setVisibility(8);
        int i14 = R.drawable.menu_bid_refund_24;
        ImageView imageView4 = qv0Var3.c;
        imageView4.setImageResource(i14);
        imageView4.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        linearLayout.addView(qv0Var3, g7.e6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        kh.d dVar = new kh.d(context, b6Var, true);
        dVar.setOnClickListener(new dg.w(1, runnable));
        dVar.g(gh.k5.g2(LocaleController.getString(R.string.Understood)), false, true);
        linearLayout.addView(dVar, g7.e6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        j10.customView = linearLayout;
        j10.show();
    }

    public final void S() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction = this.i0;
        if (auction == null || (tL_starGiftAuctionStateFinished = auction.auctionStateFinished) == null || auction.gift.title == null) {
            return;
        }
        this.d0.run(this.a0, LocaleController.formatString(R.string.Gift2AveragePriceHint, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.i0.gift.title));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(boolean z10) {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        int i9;
        int i10;
        int i11;
        GiftAuctionController.Auction auction;
        TableRow tableRow;
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction2 = this.i0;
        qc qcVar = this.Z;
        qc qcVar2 = this.Y;
        kh.d dVar = this.f0;
        int i12 = 1;
        if (auction2 != null && (tL_starGiftAuctionStateFinished = auction2.auctionStateFinished) != null) {
            qcVar2.setText(LocaleController.formatDateTime(tL_starGiftAuctionStateFinished.start_date, true));
            qcVar.setText(LocaleController.formatDateTime(this.i0.auctionStateFinished.end_date, true));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oa.X0(false, j3.r0.n(this.i0.auctionStateFinished.average_price, ',', new StringBuilder("⭐️ ")), 0.8f, null));
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) rc.b("?", new a0(this, i12), this.resourcesProvider, null));
            this.a0.setText(spannableStringBuilder);
        } else if (auction2 != null && (tL_starGiftAuctionState = auction2.auctionStateActive) != null) {
            qcVar2.setText(LocaleController.formatDateTime(tL_starGiftAuctionState.start_date, true));
            qcVar.setText(LocaleController.formatDateTime(this.i0.auctionStateActive.end_date, true));
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            if (this.i0.isUpcoming(currentTime)) {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(this.i0.auctionStateActive.start_date - currentTime)), z10);
            } else {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(this.i0.auctionStateActive.end_date - currentTime)), z10);
            }
        }
        GiftAuctionController.Auction auction3 = this.i0;
        TL_stars.StarGift starGift = this.T;
        if (auction3 != null) {
            if (auction3.isFinished()) {
                i9 = 0;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2 = this.i0.auctionStateActive;
                if (tL_starGiftAuctionState2 != null) {
                    i9 = tL_starGiftAuctionState2.gifts_left;
                }
            }
            i10 = starGift.availability_total;
            qc qcVar3 = this.b0;
            vy0 vy0Var = this.c0;
            if (i9 != i10) {
                vy0Var.setText(LocaleController.getString(R.string.Gift2AuctionTableCurrentQuantity));
                qcVar3.setText(LocaleController.formatNumber(i10, ','));
            } else {
                vy0Var.setText(LocaleController.getString(R.string.Gift2AuctionTableCurrentAvailability));
                qcVar3.setText(LocaleController.formatPluralString("Gift2Availability4Value", i9, LocaleController.formatNumber(i10, ',')));
            }
            i11 = this.i0.auctionUserState.acquired_count;
            l80 l80Var = this.h0;
            if (i11 <= 0) {
                l80Var.setVisibility(0);
                l80Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", i11, this.j0), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            } else {
                l80Var.setVisibility(8);
            }
            auction = this.i0;
            tableRow = this.e0;
            if ((auction != null || auction.auctionStateFinished == null) && !starGift.sold_out) {
                tableRow.setVisibility(8);
                dVar.g(LocaleController.getString(R.string.Gift2AuctionJoin), z10, true);
            }
            String string = LocaleController.getString(R.string.Gift2AuctionEnded);
            l80 l80Var2 = this.g0;
            l80Var2.setText(string);
            l80Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q7, this.resourcesProvider));
            tableRow.setVisibility(0);
            dVar.g(LocaleController.getString(R.string.OK), z10, true);
            dVar.f(null, z10);
            return;
        }
        i9 = starGift.availability_remains;
        i10 = starGift.availability_total;
        qc qcVar32 = this.b0;
        vy0 vy0Var2 = this.c0;
        if (i9 != i10) {
        }
        i11 = this.i0.auctionUserState.acquired_count;
        l80 l80Var3 = this.h0;
        if (i11 <= 0) {
        }
        auction = this.i0;
        tableRow = this.e0;
        if (auction != null) {
        }
        tableRow.setVisibility(8);
        dVar.g(LocaleController.getString(R.string.Gift2AuctionJoin), z10, true);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.U, this);
        super.dismiss();
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnAuctionUpdateListener
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.i0 = auction;
        U(true);
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(this.d, getContext(), this.currentAccount, 0, true, new bh.c(this, 6), this.resourcesProvider);
        this.k0 = z41Var;
        z41Var.r = false;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return "";
    }
}
