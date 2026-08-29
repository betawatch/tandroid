package ih;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.h6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.y80;
import org.telegram.ui.qv0;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n0 extends xa implements GiftAuctionController.OnAuctionUpdateListener {
    public static final /* synthetic */ int b0 = 0;
    public final long T;
    public final h0 U;
    public final LinearLayout V;
    public final i0 W;
    public final TextView X;
    public final k0 Y;
    public GiftAuctionController.Auction Z;
    public k51 a0;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable, boolean z10) {
        super(context, null, false, false, false, false, false, 1, c6Var);
        e9 e9Var;
        TLRPC.Chat chat;
        Context context2;
        org.telegram.ui.ActionBar.c6 c6Var2;
        View view;
        long j11 = starGift.id;
        this.T = j11;
        this.G = AndroidUtilities.dp(6.0f);
        this.v = 0.2f;
        setBackgroundColor(i0.a.d(0.1f, getThemedColor(g6.i5), getThemedColor(g6.h5)));
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        h0 h0Var = new h0(this, context);
        this.U = h0Var;
        linearLayout.addView(h0Var);
        nh.d dVar = new nh.d(context, c6Var, true);
        dVar.e();
        FrameLayout.LayoutParams d = i7.f6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i10 = d.leftMargin;
        int i11 = this.backgroundPaddingLeft;
        d.leftMargin = i10 + i11;
        d.rightMargin += i11;
        this.containerView.addView(dVar, d);
        jl0 jl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(64.0f));
        this.a0.N(false);
        int i13 = z10 ? 220 : 208;
        this.Z = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j11, this);
        int i14 = 4;
        i0 i0Var = new i0(this, context, c6Var, new cg.m2(this, 19), new bg.n(i14), new bg.n(i14), new bg.n(i14), new bg.n(i14), new bg.n(i14), new bg.n(i14), i13);
        this.W = i0Var;
        i0Var.d(new a5.d(1, 1));
        i0Var.setPreviewingAttributes(arrayList);
        i0Var.removeView(i0Var.K);
        h0Var.addView(i0Var, 0, i7.f6.e(-1, i13, 48));
        t9 t9Var = new t9(context);
        t9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        h0Var.addView(t9Var, i7.f6.d(90, 90.0f, 49, 0.0f, 42.0f, 0.0f, 0.0f));
        if (j10 == 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
            e9Var = new e9(0, user);
            chat = user;
        } else if (j10 > 0) {
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
            e9Var = new e9(0, user2);
            chat = user2;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            e9Var = new e9(chat2);
            chat = chat2;
        }
        t9Var.e(chat, e9Var);
        TextView textView = new TextView(context);
        this.X = textView;
        org.telegram.ui.b.g(21.0f, 1, textView);
        textView.setText(DialogObject.getShortName(j10 != 0 ? j10 : UserConfig.getInstance(this.currentAccount).getClientUserId()));
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setPadding(0, 0, AndroidUtilities.dp(36.0f), 0);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        h0Var.addView(textView, i7.f6.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.0f));
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
            textView2.setOnClickListener(new v(context, c6Var, j10, starGift, arrayList));
            h6.b(textView2, 0.02f, 1.5f);
        }
        h0Var.addView(textView2, i7.f6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setClickable(true);
        j0 j0Var = new j0(context2, this.currentAccount, c6Var2);
        j0Var.T = true;
        org.telegram.ui.ActionBar.c6 c6Var3 = c6Var2;
        j0Var.g(starGift, true, false, false, false, false);
        j0Var.setImageSize(AndroidUtilities.dp(84.0f));
        j0Var.setImageLayer(7);
        j0Var.F.setVisibility(8);
        j0Var.e.g(null);
        j0Var.setRibbonTextOneOf(this.Z.gift.availability_total);
        linearLayout2.addView(j0Var, i7.f6.l(0.0f, 116, 116));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_ab_back);
        imageView.setScaleX(-1.0f);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(g6.m6), PorterDuff.Mode.SRC_IN));
        linearLayout2.addView(imageView, i7.f6.p(24, 24, 0.0f, 16, 12, 0, 12, 0));
        k0 k0Var = new k0(this, context, this.currentAccount, c6Var3);
        this.Y = k0Var;
        k0Var.d.removeView(k0Var.y);
        k0Var.T = true;
        k0Var.g(starGift, true, false, false, false, false);
        k0Var.setImageSize(AndroidUtilities.dp(100.0f));
        k0Var.setImageLayer(7);
        k0Var.F.setVisibility(8);
        k0Var.e.g(null);
        k0Var.setRibbonTextOneOf(this.Z.gift.availability_total);
        k0Var.setRibbonText(LocaleController.getString(R.string.Gift2AuctionUpgradedShort));
        linearLayout2.addView(k0Var, i7.f6.l(0.0f, 116, 116));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearingHint));
        int i15 = g6.y6;
        textView3.setTextColor(getThemedColor(i15));
        float clamp = Utilities.clamp(starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int dp = AndroidUtilities.dp(14.0f);
        int v02 = g6.v0(g6.d6, c6Var3);
        int i16 = g6.G6;
        frameLayout.setBackground(g6.b0(dp, i0.a.d(0.2f, v02, g6.v0(i16, c6Var3))));
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(19);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setTextColor(g6.v0(i16, c6Var3));
        textView4.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        TextView h = th.h(frameLayout, textView4, i7.f6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        h.setTextSize(1, 13.0f);
        h.setGravity(21);
        h.setTypeface(AndroidUtilities.bold());
        h.setTextColor(g6.v0(i16, c6Var3));
        h.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout.addView(h, i7.f6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View l0Var = new l0(context, clamp);
        l0Var.setBackground(g6.b0(AndroidUtilities.dp(14.0f), g6.v0(g6.Oh, c6Var3)));
        frameLayout.addView(l0Var, i7.f6.e(-1, -1, 119));
        m0 m0Var = new m0(context, clamp);
        m0Var.setWillNotDraw(false);
        frameLayout.addView(m0Var, i7.f6.e(-1, -1, 119));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(19);
        textView5.setTypeface(AndroidUtilities.bold());
        textView5.setTextColor(-1);
        textView5.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        m0Var.addView(textView5, i7.f6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView6 = new TextView(context);
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(21);
        textView6.setTypeface(AndroidUtilities.bold());
        textView6.setTextColor(-1);
        textView6.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        m0Var.addView(textView6, i7.f6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        GiftAuctionController.Auction auction = this.Z;
        if (auction == null || auction.auctionStateActive == null) {
            view = null;
        } else {
            y80 y80Var = new y80(context, null);
            y80Var.setTextSize(1, 13.0f);
            y80Var.setGravity(17);
            y80Var.setTextColor(getThemedColor(i15));
            y80Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.Gift2AuctionInfo3, LocaleController.formatNumber(starGift.availability_total, ','), Integer.valueOf(this.Z.auctionStateActive.total_rounds), Integer.valueOf(starGift.gifts_per_round), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new z(context, c6Var3, starGift, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)))));
            y80Var.setLinkTextColor(g6.v0(g6.J6, c6Var3));
            view = y80Var;
        }
        if (!z10) {
            linearLayout.addView(linearLayout2, i7.f6.k(0.0f, 20.0f, 0.0f, 10.0f, -1, -2));
            linearLayout.addView(textView3, i7.f6.k(40.0f, 0.0f, 40.0f, 15.0f, -1, -2));
            linearLayout.addView(frameLayout, i7.f6.k(14.0f, 18.0f, 14.0f, 10.0f, -1, 28));
            if (view != null) {
                linearLayout.addView(view, i7.f6.k(40.0f, 0.0f, 40.0f, 32.0f, -1, -2));
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
            dVar.setOnClickListener(new v(this, j10, context, c6Var3, runnable, 1));
            return;
        }
        TextView textView7 = new TextView(context);
        textView7.setTypeface(AndroidUtilities.bold());
        textView7.setGravity(17);
        textView7.setText(LocaleController.formatString(R.string.GiftAuctionWearInfoHeader, starGift.title));
        textView7.setTextSize(1, 20.0f);
        textView7.setTextColor(g6.v0(i16, c6Var3));
        linearLayout.addView(textView7, i7.f6.t(-1, -2, 17, 20, 14, 20, 6));
        TextView textView8 = new TextView(context);
        textView8.setGravity(17);
        textView8.setText(LocaleController.getString(R.string.GiftAuctionWearInfoText));
        textView8.setTextSize(1, 14.0f);
        textView8.setTextColor(g6.v0(i16, c6Var3));
        linearLayout.addView(textView8, i7.f6.t(-1, -2, 17, 20, 0, 20, 16));
        qv0 qv0Var = new qv0(context, c6Var3);
        qv0Var.a.l(LocaleController.getString(R.string.GiftAuctionWearInfo1Header), false);
        qv0Var.b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo1Text));
        qv0Var.d.setVisibility(8);
        int i17 = R.drawable.msg_emoji_gem;
        ImageView imageView2 = qv0Var.c;
        imageView2.setImageResource(i17);
        imageView2.setColorFilter(g6.v0(i16, c6Var3));
        linearLayout.addView(qv0Var, i7.f6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        qv0 qv0Var2 = new qv0(context, c6Var3);
        qv0Var2.a.l(LocaleController.getString(R.string.GiftAuctionWearInfo2Header), false);
        qv0Var2.b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo2Text));
        qv0Var2.d.setVisibility(8);
        int i18 = R.drawable.menu_feature_cover_24;
        ImageView imageView3 = qv0Var2.c;
        imageView3.setImageResource(i18);
        imageView3.setColorFilter(g6.v0(i16, c6Var3));
        linearLayout.addView(qv0Var2, i7.f6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
        qv0 qv0Var3 = new qv0(context, c6Var3);
        qv0Var3.a.l(LocaleController.getString(R.string.GiftAuctionWearInfo3Header), false);
        qv0Var3.b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo3Text));
        qv0Var3.d.setVisibility(8);
        int i19 = R.drawable.menu_verification;
        ImageView imageView4 = qv0Var3.c;
        imageView4.setImageResource(i19);
        imageView4.setColorFilter(g6.v0(i16, c6Var3));
        linearLayout.addView(qv0Var3, i7.f6.k(6.0f, 0.0f, 6.0f, 14.0f, -1, -2));
        dVar.g(jh.h5.g2(LocaleController.getString(R.string.Understood)), false, true);
        dVar.setOnClickListener(new ag.o(this, 12));
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.T, this);
        super.dismiss();
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnAuctionUpdateListener
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.Z = auction;
    }

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(this.d, getContext(), this.currentAccount, 0, true, new bg.t1(this, 8), this.resourcesProvider);
        this.a0 = k51Var;
        k51Var.r = false;
        return k51Var;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        return "";
    }
}
