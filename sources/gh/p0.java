package gh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.rv0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class p0 extends qa implements GiftAuctionController.OnAuctionUpdateListener {
    public static final /* synthetic */ int b0 = 0;
    public final long T;
    public final j0 U;
    public final LinearLayout V;
    public final k0 W;
    public final TextView X;
    public final m0 Y;
    public GiftAuctionController.Auction Z;
    public b51 a0;

    /* JADX WARN: Multi-variable type inference failed */
    public p0(Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable, boolean z10) {
        super(context, null, false, false, false, false, false, 1, c6Var);
        y8 y8Var;
        TLRPC.Chat chat;
        Context context2;
        org.telegram.ui.ActionBar.c6 c6Var2;
        View view;
        long j11 = starGift.id;
        this.T = j11;
        this.G = AndroidUtilities.dp(6.0f);
        this.v = 0.2f;
        setBackgroundColor(i0.b.d(0.1f, getThemedColor(org.telegram.ui.ActionBar.g6.i5), getThemedColor(org.telegram.ui.ActionBar.g6.h5)));
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        j0 j0Var = new j0(this, context);
        this.U = j0Var;
        linearLayout.addView(j0Var);
        lh.d dVar = new lh.d(context, c6Var, true);
        dVar.e();
        FrameLayout.LayoutParams d = h7.z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i10 = d.leftMargin;
        int i11 = this.backgroundPaddingLeft;
        d.leftMargin = i10 + i11;
        d.rightMargin += i11;
        this.containerView.addView(dVar, d);
        zk0 zk0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(64.0f));
        this.a0.N(false);
        int i13 = z10 ? 220 : 208;
        this.Z = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j11, this);
        int i14 = 3;
        k0 k0Var = new k0(this, context, c6Var, new f2.r(this, 6), new ag.l2(i14), new ag.l2(i14), new ag.l2(i14), new ag.l2(i14), new ag.l2(i14), new ag.l2(i14), i13);
        this.W = k0Var;
        k0Var.d(new hh.j4(1, 1));
        k0Var.setPreviewingAttributes(arrayList);
        k0Var.removeView(k0Var.K);
        j0Var.addView(k0Var, 0, h7.z5.e(-1, i13, 48));
        n9 n9Var = new n9(context);
        n9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        j0Var.addView(n9Var, h7.z5.d(90, 90.0f, 49, 0.0f, 42.0f, 0.0f, 0.0f));
        if (j10 == 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
            y8Var = new y8(0, user);
            chat = user;
        } else if (j10 > 0) {
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
            y8Var = new y8(0, user2);
            chat = user2;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            y8Var = new y8(chat2);
            chat = chat2;
        }
        n9Var.e(chat, y8Var);
        TextView textView = new TextView(context);
        this.X = textView;
        rl.h(21.0f, 1, textView);
        textView.setText(DialogObject.getShortName(j10 != 0 ? j10 : UserConfig.getInstance(this.currentAccount).getClientUserId()));
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setPadding(0, 0, AndroidUtilities.dp(36.0f), 0);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        j0Var.addView(textView, h7.z5.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        textView2.setGravity(17);
        textView2.setTextColor(-1342177281);
        if (z10) {
            textView2.setText(LocaleController.getString(R.string.GiftAuctionWearInfoOnline));
            context2 = context;
            c6Var2 = c6Var;
        } else {
            textView2.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore3), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            context2 = context;
            c6Var2 = c6Var;
            textView2.setOnClickListener(new x(context, c6Var, j10, starGift, arrayList));
            h7.b6.b(textView2, 0.02f, 1.5f);
        }
        j0Var.addView(textView2, h7.z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setClickable(true);
        l0 l0Var = new l0(context2, this.currentAccount, c6Var2);
        l0Var.T = true;
        org.telegram.ui.ActionBar.c6 c6Var3 = c6Var2;
        l0Var.g(starGift, true, false, false, false, false);
        l0Var.setImageSize(AndroidUtilities.dp(84.0f));
        l0Var.setImageLayer(7);
        l0Var.F.setVisibility(8);
        l0Var.e.g(null);
        l0Var.setRibbonTextOneOf(this.Z.gift.availability_total);
        linearLayout2.addView(l0Var, h7.z5.l(0.0f, 116, 116));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_ab_back);
        imageView.setScaleX(-1.0f);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.m6), PorterDuff.Mode.SRC_IN));
        linearLayout2.addView(imageView, h7.z5.p(24, 24, 0.0f, 16, 12, 0, 12, 0));
        m0 m0Var = new m0(this, context, this.currentAccount, c6Var3);
        this.Y = m0Var;
        m0Var.d.removeView(m0Var.y);
        m0Var.T = true;
        m0Var.g(starGift, true, false, false, false, false);
        m0Var.setImageSize(AndroidUtilities.dp(100.0f));
        m0Var.setImageLayer(7);
        m0Var.F.setVisibility(8);
        m0Var.e.g(null);
        m0Var.setRibbonTextOneOf(this.Z.gift.availability_total);
        m0Var.setRibbonText(LocaleController.getString(R.string.Gift2AuctionUpgradedShort));
        linearLayout2.addView(m0Var, h7.z5.l(0.0f, 116, 116));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearingHint));
        int i15 = org.telegram.ui.ActionBar.g6.y6;
        textView3.setTextColor(getThemedColor(i15));
        float clamp = Utilities.clamp(starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int dp = AndroidUtilities.dp(14.0f);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var3);
        int i16 = org.telegram.ui.ActionBar.g6.G6;
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.b0(dp, i0.b.d(0.2f, v02, org.telegram.ui.ActionBar.g6.v0(i16, c6Var3))));
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(19);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, c6Var3));
        textView4.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        TextView h = pa.h(frameLayout, textView4, h7.z5.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        h.setTextSize(1, 13.0f);
        h.setGravity(21);
        h.setTypeface(AndroidUtilities.bold());
        h.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, c6Var3));
        h.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout.addView(h, h7.z5.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View n0Var = new n0(context, clamp);
        n0Var.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var3)));
        frameLayout.addView(n0Var, h7.z5.e(-1, -1, 119));
        o0 o0Var = new o0(context, clamp);
        o0Var.setWillNotDraw(false);
        frameLayout.addView(o0Var, h7.z5.e(-1, -1, 119));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(19);
        textView5.setTypeface(AndroidUtilities.bold());
        textView5.setTextColor(-1);
        textView5.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        o0Var.addView(textView5, h7.z5.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView6 = new TextView(context);
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(21);
        textView6.setTypeface(AndroidUtilities.bold());
        textView6.setTextColor(-1);
        textView6.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        o0Var.addView(textView6, h7.z5.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        GiftAuctionController.Auction auction = this.Z;
        if (auction == null || auction.auctionStateActive == null) {
            view = null;
        } else {
            p80 p80Var = new p80(context, null);
            p80Var.setTextSize(1, 13.0f);
            p80Var.setGravity(17);
            p80Var.setTextColor(getThemedColor(i15));
            p80Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.Gift2AuctionInfo3, LocaleController.formatNumber(starGift.availability_total, ','), Integer.valueOf(this.Z.auctionStateActive.total_rounds), Integer.valueOf(starGift.gifts_per_round), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new b0(context, c6Var3, starGift, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)))));
            p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.J6, c6Var3));
            view = p80Var;
        }
        if (!z10) {
            linearLayout.addView(linearLayout2, h7.z5.k(0.0f, 20.0f, 0.0f, 10.0f, -1, -2));
            linearLayout.addView(textView3, h7.z5.k(40.0f, 0.0f, 40.0f, 15.0f, -1, -2));
            linearLayout.addView(frameLayout, h7.z5.k(14.0f, 18.0f, 14.0f, 10.0f, -1, 28));
            if (view != null) {
                linearLayout.addView(view, h7.z5.k(40.0f, 0.0f, 40.0f, 32.0f, -1, -2));
            }
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            GiftAuctionController.Auction auction2 = this.Z;
            if (auction2 == null || !auction2.isUpcoming(currentTime)) {
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), false, true);
            } else {
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), false, true);
            }
            GiftAuctionController.Auction auction3 = this.Z;
            if (auction3 != null && auction3.auctionStateActive != null) {
                if (auction3.isUpcoming(currentTime)) {
                    dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(this.Z.auctionStateActive.start_date - currentTime)), false);
                } else {
                    dVar.f(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(this.Z.auctionStateActive.end_date - currentTime)), false);
                }
            }
            dVar.setOnClickListener(new x(this, j10, context, c6Var3, runnable, 1));
            return;
        }
        TextView textView7 = new TextView(context);
        textView7.setTypeface(AndroidUtilities.bold());
        textView7.setGravity(17);
        textView7.setText(LocaleController.formatString(R.string.GiftAuctionWearInfoHeader, starGift.title));
        textView7.setTextSize(1, 20.0f);
        textView7.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, c6Var3));
        linearLayout.addView(textView7, h7.z5.t(-1, -2, 17, 20, 14, 20, 6));
        TextView textView8 = new TextView(context);
        textView8.setGravity(17);
        textView8.setText(LocaleController.getString(R.string.GiftAuctionWearInfoText));
        textView8.setTextSize(1, 14.0f);
        textView8.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, c6Var3));
        linearLayout.addView(textView8, h7.z5.t(-1, -2, 17, 20, 0, 20, 16));
        rv0 rv0Var = new rv0(context, c6Var3);
        rv0Var.a.l(LocaleController.getString(R.string.GiftAuctionWearInfo1Header), false);
        rv0Var.b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo1Text));
        rv0Var.d.setVisibility(8);
        int i17 = R.drawable.msg_emoji_gem;
        ImageView imageView2 = rv0Var.c;
        imageView2.setImageResource(i17);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i16, c6Var3));
        linearLayout.addView(rv0Var, h7.z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        rv0 rv0Var2 = new rv0(context, c6Var3);
        rv0Var2.a.l(LocaleController.getString(R.string.GiftAuctionWearInfo2Header), false);
        rv0Var2.b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo2Text));
        rv0Var2.d.setVisibility(8);
        int i18 = R.drawable.menu_feature_cover_24;
        ImageView imageView3 = rv0Var2.c;
        imageView3.setImageResource(i18);
        imageView3.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i16, c6Var3));
        linearLayout.addView(rv0Var2, h7.z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        rv0 rv0Var3 = new rv0(context, c6Var3);
        rv0Var3.a.l(LocaleController.getString(R.string.GiftAuctionWearInfo3Header), false);
        rv0Var3.b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo3Text));
        rv0Var3.d.setVisibility(8);
        int i19 = R.drawable.menu_verification;
        ImageView imageView4 = rv0Var3.c;
        imageView4.setImageResource(i19);
        imageView4.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i16, c6Var3));
        linearLayout.addView(rv0Var3, h7.z5.k(6.0f, 0.0f, 6.0f, 14.0f, -1, -2));
        dVar.g(hh.i5.g2(LocaleController.getString(R.string.Understood)), false, true);
        dVar.setOnClickListener(new ag.w0(this, 8));
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.T, this);
        super.dismiss();
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnAuctionUpdateListener
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.Z = auction;
    }

    @Override // org.telegram.ui.Components.qa
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(this.d, getContext(), this.currentAccount, 0, true, new ch.c(this, 7), this.resourcesProvider);
        this.a0 = b51Var;
        b51Var.r = false;
        return b51Var;
    }

    @Override // org.telegram.ui.Components.qa
    public final CharSequence z() {
        return "";
    }
}
