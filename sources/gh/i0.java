package gh;

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
import hh.oa;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.rv0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i0 extends qa implements GiftAuctionController.OnAuctionUpdateListener {
    public static final oc[] l0 = new oc[1];
    public static final xy0[] m0 = new xy0[1];
    public final TL_stars.StarGift T;
    public final long U;
    public final LinearLayout V;
    public final FrameLayout W;
    public final TextView X;
    public final oc Y;
    public final oc Z;
    public final oc a0;
    public final oc b0;
    public final xy0 c0;
    public final d0 d0;
    public final TableRow e0;
    public final lh.d f0;
    public final p80 g0;
    public final p80 h0;
    public GiftAuctionController.Auction i0;
    public final CharSequence j0;
    public b51 k0;

    /* JADX WARN: Multi-variable type inference failed */
    public i0(Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, false, false, false, 1, c6Var);
        boolean z10;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i10;
        int i11;
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
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c6Var);
        kVar.D(-1, false);
        kVar.setOccupyStatusBar(false);
        S(kVar, context, c6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.addView(kVar, h7.z5.n(-1, -2));
        linearLayout.addView(frameLayout);
        e0 e0Var = new e0(context, this.currentAccount, c6Var);
        e0Var.T = true;
        e0Var.g(starGift, false, false, false, false, false);
        e0Var.setImageSize(AndroidUtilities.dp(100.0f));
        e0Var.setImageLayer(7);
        e0Var.F.setVisibility(8);
        frameLayout.addView(e0Var, h7.z5.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        linearLayout.addView(textView, h7.z5.t(-1, -2, 17, 20, 0, 20, 6));
        p80 p80Var = new p80(context, null);
        this.g0 = p80Var;
        p80Var.setGravity(17);
        p80Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionInfo2", starGift.gifts_per_round, str2)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new b0(context, c6Var, starGift, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
        p80Var.setTextSize(1, 14.0f);
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        int i13 = org.telegram.ui.ActionBar.g6.J6;
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        linearLayout.addView(p80Var, h7.z5.t(-1, -2, 17, 20, 0, 20, 4));
        yy0 yy0Var = new yy0(context, c6Var);
        String string = LocaleController.getString(R.string.Gift2AuctionTableStarted);
        oc[] ocVarArr = l0;
        yy0Var.c(string, "", null, ocVarArr);
        this.Y = ocVarArr[0];
        yy0Var.c(LocaleController.getString(R.string.Gift2AuctionTableEnded), "", null, ocVarArr);
        this.Z = ocVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(yy0Var, h7.z5.e(-1, -2, 119));
        this.d0 = new d0(this, new lh.w3[1], frameLayout2, 0);
        TableRow c10 = yy0Var.c(LocaleController.getString(R.string.GiftValueAveragePrice), "", null, ocVarArr);
        this.e0 = c10;
        final int i14 = 1;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: gh.c0
            public final /* synthetic */ i0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        new ag.g2(this.b.getContext(), 40, (org.telegram.ui.ActionBar.c6) null).show();
                        break;
                    default:
                        this.b.T();
                        break;
                }
            }
        });
        this.a0 = ocVarArr[0];
        xy0[] xy0VarArr = m0;
        yy0Var.c("", "", xy0VarArr, ocVarArr);
        this.b0 = ocVarArr[0];
        this.c0 = xy0VarArr[0];
        linearLayout.addView(frameLayout2, h7.z5.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        p80 p80Var2 = new p80(context, c6Var);
        this.h0 = p80Var2;
        p80Var2.setGravity(17);
        p80Var2.setTextSize(1, 16.0f);
        p80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        p80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        p80Var2.setOnClickListener(new gg.f(this, new boolean[1], c6Var, 4));
        h7.b6.b(p80Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.t5(starGift.sticker, p80Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.j0 = spannableStringBuilder;
        } else {
            this.j0 = "";
        }
        lh.d dVar = new lh.d(context, c6Var, true);
        this.f0 = dVar;
        dVar.e();
        int i15 = 2;
        dVar.setOnClickListener(new x(this, j10, context, c6Var, runnable, 0));
        FrameLayout.LayoutParams d = h7.z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i16 = d.leftMargin;
        int i17 = this.backgroundPaddingLeft;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.containerView.addView(dVar, d);
        zk0 zk0Var = this.d;
        int i18 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i18, 0, i18, AndroidUtilities.dp(64.0f));
        this.k0.N(false);
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j11, this);
        this.i0 = subscribeToGiftAuction;
        if (subscribeToGiftAuction != null && (tL_starGiftAuctionState2 = subscribeToGiftAuction.auctionStateActive) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                yy0Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRounds), LocaleController.formatNumber(this.i0.auctionStateActive.total_rounds, ','), null, null);
            } else {
                yy0Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRound), LocaleController.formatString(R.string.OfS, LocaleController.formatNumber(this.i0.auctionStateActive.current_round, ','), LocaleController.formatNumber(this.i0.auctionStateActive.total_rounds, ',')), null, null);
            }
        }
        GiftAuctionController.Auction auction = this.i0;
        if (auction != null && (tL_starGiftAuctionState = auction.auctionStateActive) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.i0.auctionStateActive.rounds.get(i19);
                if (i19 < size - 1) {
                    i10 = 1;
                    i11 = this.i0.auctionStateActive.rounds.get(i19 + 1).num - 1;
                } else {
                    i10 = 1;
                    i11 = this.i0.auctionStateActive.total_rounds;
                }
                int i20 = starGiftAuctionRound.num;
                if (i20 == i11) {
                    int i21 = R.string.Gift2AuctionTableCurrentRoundsOne;
                    Object[] objArr = new Object[i10];
                    objArr[0] = Integer.valueOf(i20);
                    formatString = LocaleController.formatString(i21, objArr);
                } else {
                    int i22 = R.string.Gift2AuctionTableCurrentRoundsTwo;
                    Integer valueOf = Integer.valueOf(i20);
                    Integer valueOf2 = Integer.valueOf(i11);
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = valueOf;
                    objArr2[i10] = valueOf2;
                    formatString = LocaleController.formatString(i22, objArr2);
                }
                yy0Var.c(formatString, starGiftAuctionRound.num == i11 ? LocaleController.formatString(R.string.Gift2AuctionTableCurrentRoundsOneDuration, LocaleController.formatTTLString(starGiftAuctionRound.duration), LocaleController.formatTTLString(starGiftAuctionRound.current_window), Integer.valueOf(starGiftAuctionRound.extend_top)) : LocaleController.formatPluralString("Gift2AuctionTableCurrentRoundsTwoDuration", starGiftAuctionRound.duration / 60, new Object[0]), null, null);
            }
        }
        GiftAuctionController.Auction auction2 = this.i0;
        if (auction2 == null || auction2.previewAttributes == null) {
            z10 = false;
        } else {
            z10 = false;
            Object[] objArr3 = 0;
            g0 g0Var = new g0(this, context, c6Var, new y(this, 0), new ag.l2(i15), new ag.l2(i15), new ag.l2(i15), new ag.l2(i15), new ag.l2(i15), new ag.l2(i15));
            g0Var.d(new hh.j4(1, 1));
            g0Var.setPreviewingAttributes(this.i0.previewAttributes);
            g0Var.removeView(g0Var.K);
            this.W.addView(g0Var, 0, h7.z5.e(-1, 288, 48));
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
            textView2.setBackground(org.telegram.ui.ActionBar.g6.Z(0, 285212671, 13, 13));
            textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            TextView h = pa.h(this.W, textView2, h7.z5.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            h.setTypeface(AndroidUtilities.bold());
            h.setTextSize(1, 21.0f);
            h.setText(str2);
            h.setGravity(17);
            h.setTextColor(-1);
            TextView h10 = pa.h(this.W, h, h7.z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            h10.setTextSize(1, 13.0f);
            h10.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore2), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            h10.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            h10.setGravity(17);
            h10.setTextColor(-1342177281);
            final Object[] objArr4 = objArr3 == true ? 1 : 0;
            h10.setOnClickListener(new View.OnClickListener(this) { // from class: gh.c0
                public final /* synthetic */ i0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (objArr4) {
                        case 0:
                            new ag.g2(this.b.getContext(), 40, (org.telegram.ui.ActionBar.c6) null).show();
                            break;
                        default:
                            this.b.T();
                            break;
                    }
                }
            });
            h7.b6.b(h10, 0.02f, 1.5f);
            this.W.addView(h10, h7.z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            e0Var.setVisibility(8);
            textView.setVisibility(8);
            this.g0.setVisibility(8);
            p80 p80Var3 = new p80(context, c6Var);
            p80Var3.setGravity(17);
            p80Var3.setTextSize(1, 16.0f);
            int i23 = org.telegram.ui.ActionBar.g6.J6;
            p80Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i23, c6Var));
            p80Var3.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i23, c6Var));
            p80Var3.setOnClickListener(new gg.f(this, context, c6Var, 3));
            h7.b6.b(p80Var3, 0.02f, 1.5f);
            this.V.addView(p80Var3, h7.z5.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(hf.d.c(this.i0.previewAttributes, TL_stars.starGiftAttributeModel.class));
            long j12 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i24 = 0; i24 < 3; i24++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) rVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.t5(stargiftattributemodel.document, p80Var3.getPaint().getFontMetricsInt()), i24, i24 + 1, 33);
                }
            }
            p80Var3.setText(AndroidUtilities.replaceArrows(LocaleController.formatSpannable(R.string.Gift2AuctionVariants, spannableStringBuilder2, LocaleController.formatNumber(j12, ',')), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        }
        this.V.addView(this.h0, h7.z5.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        V(z10);
    }

    public static /* synthetic */ void P(i0 i0Var, boolean[] zArr, org.telegram.ui.ActionBar.c6 c6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(i0Var.currentAccount).getOrRequestAcquiredGifts(i0Var.U, new i(i0Var, zArr, c6Var, 1));
    }

    public static void Q(i0 i0Var, long j10, Context context, org.telegram.ui.ActionBar.c6 c6Var, Runnable runnable) {
        GiftAuctionController.Auction auction;
        ArrayList<TL_stars.StarGiftAttribute> arrayList;
        GiftAuctionController.Auction auction2 = i0Var.i0;
        if (auction2 != null && !auction2.isFinished()) {
            if ((j10 == 0 || j10 == UserConfig.getInstance(i0Var.currentAccount).getClientUserId()) && (arrayList = (auction = i0Var.i0).previewAttributes) != null) {
                new p0(context, c6Var, j10, auction.gift, arrayList, runnable, false).show();
            } else {
                new f0(context, i0Var.currentAccount, i0Var.i0.gift, null, j10, runnable, false, false).show();
            }
        }
        i0Var.dismiss();
    }

    public static /* synthetic */ void R(i0 i0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10 = i0Var.currentAccount;
        GiftAuctionController.Auction auction = i0Var.i0;
        new hh.l1(context, c6Var, i10, auction.gift.title, auction.previewAttributes, false).show();
        i0Var.dismiss();
    }

    public static void S(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new h0(context, starGift, c6Var));
        org.telegram.ui.ActionBar.v0 a2 = kVar.n().a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        a2.e(4, R.drawable.msg_info, LocaleController.getString(R.string.MoreInfo));
        a2.e(3, R.drawable.menu_feature_links, LocaleController.getString(R.string.CopyLink));
        a2.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareLink));
    }

    public static void U(Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.c6 c6Var) {
        Runnable runnable;
        if (context == null || starGift == null) {
            return;
        }
        org.telegram.ui.ActionBar.e3 o10 = org.telegram.messenger.y1.o(context, null, false, false);
        runnable = o10.dismissRunnable;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f));
        imageView.setImageResource(R.drawable.filled_gift_sell_24);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
        imageView.setBackground(shapeDrawable);
        linearLayout.addView(imageView, h7.z5.t(80, 80, 17, 0, 21, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.GiftAuctionInfoHeader));
        textView.setTextSize(1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        linearLayout.addView(textView, h7.z5.t(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftAuctionInfoText));
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        linearLayout.addView(textView2, h7.z5.t(-1, -2, 17, 20, 0, 20, 16));
        rv0 rv0Var = new rv0(context, c6Var);
        int i11 = starGift.gifts_per_round;
        rv0Var.a.l(LocaleController.formatPluralString("GiftAuctionInfo1Header", i11, Integer.valueOf(i11)), false);
        int i12 = starGift.gifts_per_round;
        rv0Var.b.setText(LocaleController.formatPluralString("GiftAuctionInfo1Text", i12, Integer.valueOf(i12)));
        rv0Var.d.setVisibility(8);
        int i13 = R.drawable.menu_top_bidders_24;
        ImageView imageView2 = rv0Var.c;
        imageView2.setImageResource(i13);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        linearLayout.addView(rv0Var, h7.z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        rv0 rv0Var2 = new rv0(context, c6Var);
        rv0Var2.a.l(LocaleController.getString(R.string.GiftAuctionInfo2Header), false);
        rv0Var2.b.setText(LocaleController.formatPluralString("GiftAuctionInfo2Text", starGift.gifts_per_round, new Object[0]));
        rv0Var2.d.setVisibility(8);
        int i14 = R.drawable.menu_carryover_24;
        ImageView imageView3 = rv0Var2.c;
        imageView3.setImageResource(i14);
        imageView3.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        linearLayout.addView(rv0Var2, h7.z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        rv0 rv0Var3 = new rv0(context, c6Var);
        rv0Var3.a.l(LocaleController.getString(R.string.GiftAuctionInfo3Header), false);
        rv0Var3.b.setText(LocaleController.getString(R.string.GiftAuctionInfo3Text));
        rv0Var3.d.setVisibility(8);
        int i15 = R.drawable.menu_bid_refund_24;
        ImageView imageView4 = rv0Var3.c;
        imageView4.setImageResource(i15);
        imageView4.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        linearLayout.addView(rv0Var3, h7.z5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
        lh.d dVar = new lh.d(context, c6Var, true);
        dVar.setOnClickListener(new eg.v(1, runnable));
        dVar.g(hh.i5.g2(LocaleController.getString(R.string.Understood)), false, true);
        linearLayout.addView(dVar, h7.z5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
        o10.customView = linearLayout;
        o10.show();
    }

    public final void T() {
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
    public final void V(boolean z10) {
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        int i10;
        int i11;
        int i12;
        GiftAuctionController.Auction auction;
        TableRow tableRow;
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction2 = this.i0;
        oc ocVar = this.Z;
        oc ocVar2 = this.Y;
        lh.d dVar = this.f0;
        int i13 = 1;
        if (auction2 != null && (tL_starGiftAuctionStateFinished = auction2.auctionStateFinished) != null) {
            ocVar2.setText(LocaleController.formatDateTime(tL_starGiftAuctionStateFinished.start_date, true));
            ocVar.setText(LocaleController.formatDateTime(this.i0.auctionStateFinished.end_date, true));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oa.X0(false, i0.a.m(this.i0.auctionStateFinished.average_price, ',', new StringBuilder("⭐️ ")), 0.8f, null));
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) pc.b("?", new y(this, i13), this.resourcesProvider, null));
            this.a0.setText(spannableStringBuilder);
        } else if (auction2 != null && (tL_starGiftAuctionState = auction2.auctionStateActive) != null) {
            ocVar2.setText(LocaleController.formatDateTime(tL_starGiftAuctionState.start_date, true));
            ocVar.setText(LocaleController.formatDateTime(this.i0.auctionStateActive.end_date, true));
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
                i10 = 0;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2 = this.i0.auctionStateActive;
                if (tL_starGiftAuctionState2 != null) {
                    i10 = tL_starGiftAuctionState2.gifts_left;
                }
            }
            i11 = starGift.availability_total;
            oc ocVar3 = this.b0;
            xy0 xy0Var = this.c0;
            if (i10 != i11) {
                xy0Var.setText(LocaleController.getString(R.string.Gift2AuctionTableCurrentQuantity));
                ocVar3.setText(LocaleController.formatNumber(i11, ','));
            } else {
                xy0Var.setText(LocaleController.getString(R.string.Gift2AuctionTableCurrentAvailability));
                ocVar3.setText(LocaleController.formatPluralString("Gift2Availability4Value", i10, LocaleController.formatNumber(i11, ',')));
            }
            i12 = this.i0.auctionUserState.acquired_count;
            p80 p80Var = this.h0;
            if (i12 <= 0) {
                p80Var.setVisibility(0);
                p80Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", i12, this.j0), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            } else {
                p80Var.setVisibility(8);
            }
            auction = this.i0;
            tableRow = this.e0;
            if ((auction != null || auction.auctionStateFinished == null) && !starGift.sold_out) {
                tableRow.setVisibility(8);
                dVar.g(LocaleController.getString(R.string.Gift2AuctionJoin), z10, true);
            }
            String string = LocaleController.getString(R.string.Gift2AuctionEnded);
            p80 p80Var2 = this.g0;
            p80Var2.setText(string);
            p80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, this.resourcesProvider));
            tableRow.setVisibility(0);
            dVar.g(LocaleController.getString(R.string.OK), z10, true);
            dVar.f(null, z10);
            return;
        }
        i10 = starGift.availability_remains;
        i11 = starGift.availability_total;
        oc ocVar32 = this.b0;
        xy0 xy0Var2 = this.c0;
        if (i10 != i11) {
        }
        i12 = this.i0.auctionUserState.acquired_count;
        p80 p80Var3 = this.h0;
        if (i12 <= 0) {
        }
        auction = this.i0;
        tableRow = this.e0;
        if (auction != null) {
        }
        tableRow.setVisibility(8);
        dVar.g(LocaleController.getString(R.string.Gift2AuctionJoin), z10, true);
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.U, this);
        super.dismiss();
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnAuctionUpdateListener
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.i0 = auction;
        V(true);
    }

    @Override // org.telegram.ui.Components.qa
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(this.d, getContext(), this.currentAccount, 0, true, new ch.c(this, 6), this.resourcesProvider);
        this.k0 = b51Var;
        b51Var.r = false;
        return b51Var;
    }

    @Override // org.telegram.ui.Components.qa
    public final CharSequence z() {
        return "";
    }
}
