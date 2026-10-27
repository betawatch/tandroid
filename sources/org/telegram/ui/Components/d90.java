package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d90 extends org.telegram.ui.ActionBar.k3 {
    public static final /* synthetic */ int s = 0;
    public int b;
    public final String c;
    public final org.telegram.ui.ActionBar.r2 d;
    public final TLRPC.ChatInvite e;
    public final TLRPC.Chat f;
    public final TextView h;
    public final RadialProgressView n;
    public wc r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d90(Context context, TLObject tLObject, String str, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, context, u6Var, false);
        String str2;
        final long j10;
        LinearLayout linearLayout;
        TLRPC.ChatInvite chatInvite;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        String str3;
        org.telegram.ui.ActionBar.b6 b6Var;
        final boolean z13;
        boolean isEmpty;
        TLRPC.ChatInvite chatInvite2;
        float f7;
        boolean z14;
        String format;
        int i11 = 0;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBarKey(org.telegram.ui.ActionBar.y6.d6);
        this.b = this.navBarColor;
        this.d = r2Var;
        if (tLObject instanceof TLRPC.ChatInvite) {
            TLRPC.ChatInvite chatInvite3 = (TLRPC.ChatInvite) tLObject;
            this.e = chatInvite3;
            TLRPC.Chat chat = chatInvite3.chat;
            j10 = chat != null ? -chat.id : 0L;
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                str2 = str;
                j10 = 0;
                this.c = str2;
                linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setClickable(true);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(linearLayout);
                NestedScrollView nestedScrollView = new NestedScrollView(context);
                nestedScrollView.addView(frameLayout);
                setCustomView(nestedScrollView);
                ImageView imageView = new ImageView(context);
                imageView.setBackground(org.telegram.ui.ActionBar.y6.g0(getThemedColor(org.telegram.ui.ActionBar.y6.i6), 1, -1));
                org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.Ji, u6Var, PorterDuff.Mode.SRC_ATOP);
                imageView.setImageResource(R.drawable.ic_layer_close);
                imageView.setOnClickListener(new x80(this, i11));
                int dp = AndroidUtilities.dp(8.0f);
                imageView.setPadding(dp, dp, dp, dp);
                frameLayout.addView(imageView, kb1.h(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                y9 y9Var = new y9(context);
                y9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
                linearLayout.addView(y9Var, kb1.x(90, 90, 49, 0, 27, 0, 0));
                chatInvite = this.e;
                if (chatInvite == null) {
                    if (chatInvite.chat != null) {
                        j9 j9Var = new j9(this.e.chat);
                        TLRPC.ChatInvite chatInvite4 = this.e;
                        TLRPC.Chat chat2 = chatInvite4.chat;
                        r12 = chat2.title;
                        i10 = chat2.participants_count;
                        y9Var.a.setForUserOrChat(chat2, j9Var, chatInvite4);
                        y9Var.d();
                    } else {
                        j9 j9Var2 = new j9((org.telegram.ui.ActionBar.u6) null);
                        j9Var2.n(0L, this.e.title, null);
                        TLRPC.ChatInvite chatInvite5 = this.e;
                        String str4 = chatInvite5.title;
                        i10 = chatInvite5.participants_count;
                        y9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(chatInvite5.photo.sizes, 50), this.e.photo), "50_50", j9Var2, this.e);
                        r12 = str4;
                    }
                    TLRPC.ChatInvite chatInvite6 = this.e;
                    str3 = chatInvite6.about;
                    z11 = chatInvite6.verified;
                    z12 = chatInvite6.fake;
                    z10 = chatInvite6.scam;
                } else if (this.f != null) {
                    j9 j9Var3 = new j9(this.f);
                    String str5 = this.f.title;
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.f.id);
                    r12 = chatFull != null ? chatFull.about : null;
                    i10 = Math.max(this.f.participants_count, chatFull != null ? chatFull.participants_count : 0);
                    TLRPC.Chat chat3 = this.f;
                    y9Var.a.setForUserOrChat(chat3, j9Var3, chat3);
                    y9Var.d();
                    TLRPC.Chat chat4 = this.f;
                    boolean z15 = chat4.verified;
                    z12 = chat4.fake;
                    z10 = chat4.scam;
                    z11 = z15;
                    str3 = r12;
                    r12 = str5;
                } else {
                    z10 = false;
                    z11 = false;
                    z12 = false;
                    i10 = 0;
                    str3 = null;
                }
                b6Var = new org.telegram.ui.ActionBar.b6(context);
                b6Var.setTypeface(AndroidUtilities.bold());
                b6Var.setTextSize(20);
                int i12 = org.telegram.ui.ActionBar.y6.j5;
                org.telegram.ui.ActionBar.f7.Y(b6Var, i12, u6Var);
                b6Var.l(r12, false);
                b6Var.setGravity(17);
                linearLayout.addView(b6Var, kb1.x(-2, -2, 49, 10, 10, 10, i10 <= 0 ? 0 : 20));
                if (!z10 || z12) {
                    b6Var.i(!z10 ? org.telegram.ui.ActionBar.y6.g1 : org.telegram.ui.ActionBar.y6.h1);
                } else if (z11) {
                    b6Var.i(new ar(org.telegram.ui.ActionBar.y6.f1, org.telegram.ui.ActionBar.y6.i1));
                }
                TLRPC.ChatInvite chatInvite7 = this.e;
                z13 = (chatInvite7 == null && ((chatInvite7.channel && !chatInvite7.megagroup) || ChatObject.isChannelAndNotMegaGroup(chatInvite7.chat))) || (ChatObject.isChannel(this.f) && !this.f.megagroup);
                isEmpty = TextUtils.isEmpty(str3);
                TextView g7 = org.telegram.messenger.t.g(context, 1, 13.0f);
                int i13 = org.telegram.ui.ActionBar.y6.r5;
                org.telegram.ui.ActionBar.f7.V(g7, i13, u6Var);
                g7.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                g7.setEllipsize(truncateAt);
                g7.setText(!z13 ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase());
                linearLayout.addView(g7, kb1.x(-2, -2, 49, 10, 0, 10, isEmpty ? 0 : 20));
                if (!isEmpty) {
                    TextView textView = new TextView(context);
                    textView.setGravity(17);
                    textView.setText(str3);
                    org.telegram.ui.ActionBar.f7.V(textView, i12, u6Var);
                    textView.setTextSize(1, 15.0f);
                    linearLayout.addView(textView, kb1.x(-1, -2, 48, 24, 10, 24, 20));
                }
                chatInvite2 = this.e;
                if (chatInvite2 != null || chatInvite2.request_needed) {
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    linearLayout.addView(frameLayout2, kb1.r(-1, -2));
                    RadialProgressView radialProgressView = new RadialProgressView(getContext(), u6Var);
                    this.n = radialProgressView;
                    int i14 = org.telegram.ui.ActionBar.y6.Oh;
                    radialProgressView.setProgressColorKey(i14);
                    radialProgressView.setSize(AndroidUtilities.dp(32.0f));
                    radialProgressView.setVisibility(4);
                    frameLayout2.addView(radialProgressView, kb1.i(48, 48, 17));
                    TextView textView2 = new TextView(getContext());
                    this.h = textView2;
                    int dp2 = AndroidUtilities.dp(24.0f);
                    int themedColor = getThemedColor(i14);
                    int i15 = org.telegram.ui.ActionBar.y6.Qh;
                    int themedColor2 = getThemedColor(i15);
                    org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp2, dp2, dp2, dp2, themedColor, themedColor2, themedColor2);
                    org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i14);
                    org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i15);
                    textView2.setBackground(j02);
                    org.telegram.ui.ActionBar.f7.k(textView2, j02, N, N2, u6Var);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity(17);
                    textView2.setSingleLine(true);
                    textView2.setText(LocaleController.getString(!z13 ? R.string.RequestToJoinChannel : R.string.RequestToJoinGroup));
                    org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.Sh, u6Var);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.a90
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            d90.r(d90.this, z13, j10);
                        }
                    });
                    frameLayout2.addView(textView2, kb1.x(-1, 48, 8388611, 14, 0, 14, 0));
                    TextView textView3 = new TextView(getContext());
                    textView3.setGravity(17);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setText(LocaleController.getString(!z13 ? R.string.RequestToJoinChannelDescription : R.string.RequestToJoinGroupDescription));
                    org.telegram.ui.ActionBar.f7.V(textView3, i13, u6Var);
                    linearLayout.addView(textView3, kb1.x(-1, -2, 48, 24, 17, 24, 15));
                }
                if (chatInvite2.participants.isEmpty()) {
                    f7 = 24.0f;
                    z14 = false;
                } else {
                    int min = Math.min(this.e.participants.size(), 3);
                    m9 m9Var = new m9(context, false);
                    m9Var.setAvatarsTextSize(AndroidUtilities.dp(20.0f));
                    float f10 = 38;
                    m9Var.setSize(AndroidUtilities.dp(f10));
                    m9Var.setCount(min);
                    m9Var.setStepFactor(0.65f);
                    for (int i16 = 0; i16 < min; i16++) {
                        m9Var.b(i16, this.e.participants.get(i16), UserConfig.selectedAccount);
                    }
                    f7 = 24.0f;
                    m9Var.a(false);
                    linearLayout.addView(m9Var, kb1.x((int) org.telegram.ui.d3.e(f10, 0.65f, 1.0f, min - 1, f10), 44, 17, 0, 2, 0, 4));
                    TextView textView4 = new TextView(context);
                    textView4.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.f7.V(textView4, org.telegram.ui.ActionBar.y6.r5, u6Var);
                    textView4.setGravity(17);
                    if (min == 1) {
                        z14 = false;
                        format = v(textView4, this.e, 0).toString();
                    } else {
                        z14 = false;
                        if (min == 2) {
                            format = LocaleController.formatString("RequestToJoinMembersTwo", R.string.RequestToJoinMembersTwo, v(textView4, this.e, 0), v(textView4, this.e, 1));
                        } else if (i10 == 3) {
                            format = LocaleController.formatString("RequestToJoinMembersThree", R.string.RequestToJoinMembersThree, v(textView4, this.e, 0), v(textView4, this.e, 1), v(textView4, this.e, 2));
                        } else {
                            int max = Math.max(i10 - min, 2);
                            format = String.format(LocaleController.getPluralString("RequestToJoinMembersAll", max), v(textView4, this.e, 0), v(textView4, this.e, 1), Integer.valueOf(max));
                        }
                    }
                    textView4.setText(format);
                    linearLayout.addView(textView4, kb1.x(-2, -2, 49, 10, 0, 10, 24));
                }
                TLRPC.ChatInvite chatInvite8 = this.e;
                boolean z16 = ((!chatInvite8.channel || chatInvite8.megagroup) && (!ChatObject.isChannel(chatInvite8.chat) || this.e.chat.megagroup)) ? z14 : true;
                TextView textView5 = new TextView(getContext());
                int dp3 = AndroidUtilities.dp(f7);
                int i17 = org.telegram.ui.ActionBar.y6.Oh;
                int themedColor3 = getThemedColor(i17);
                int i18 = org.telegram.ui.ActionBar.y6.Qh;
                int themedColor4 = getThemedColor(i18);
                org.telegram.ui.Cells.y j03 = org.telegram.ui.ActionBar.y6.j0(dp3, dp3, dp3, dp3, themedColor3, themedColor4, themedColor4);
                org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i17);
                org.telegram.ui.ActionBar.b7 N4 = org.telegram.ui.ActionBar.f7.N(i18);
                textView5.setBackground(j03);
                org.telegram.ui.ActionBar.f7.k(textView5, j03, N3, N4, u6Var);
                kb1.c(textView5, 0.02f, 1.2f);
                textView5.setEllipsize(TextUtils.TruncateAt.END);
                textView5.setGravity(17);
                int i19 = 1;
                textView5.setSingleLine(true);
                textView5.setText(LocaleController.getString(z16 ? R.string.ProfileJoinChannel : R.string.ProfileJoinGroup));
                org.telegram.messenger.t.r(textView5, org.telegram.ui.ActionBar.y6.Sh, u6Var, 1, 14.0f);
                linearLayout.addView(textView5, kb1.x(-1, 48, 8388611, 14, 0, 14, 14));
                textView5.setOnClickListener(new di.a2(this, j10, i19));
                return;
            }
            TLRPC.Chat chat5 = (TLRPC.Chat) tLObject;
            this.f = chat5;
            j10 = chat5.id;
        }
        str2 = str;
        this.c = str2;
        linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClickable(true);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.addView(linearLayout);
        NestedScrollView nestedScrollView2 = new NestedScrollView(context);
        nestedScrollView2.addView(frameLayout3);
        setCustomView(nestedScrollView2);
        ImageView imageView2 = new ImageView(context);
        imageView2.setBackground(org.telegram.ui.ActionBar.y6.g0(getThemedColor(org.telegram.ui.ActionBar.y6.i6), 1, -1));
        org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.Ji, u6Var, PorterDuff.Mode.SRC_ATOP);
        imageView2.setImageResource(R.drawable.ic_layer_close);
        imageView2.setOnClickListener(new x80(this, i11));
        int dp4 = AndroidUtilities.dp(8.0f);
        imageView2.setPadding(dp4, dp4, dp4, dp4);
        frameLayout3.addView(imageView2, kb1.h(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        y9 y9Var2 = new y9(context);
        y9Var2.setRoundRadius(AndroidUtilities.dp(45.0f));
        linearLayout.addView(y9Var2, kb1.x(90, 90, 49, 0, 27, 0, 0));
        chatInvite = this.e;
        if (chatInvite == null) {
        }
        b6Var = new org.telegram.ui.ActionBar.b6(context);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setTextSize(20);
        int i122 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.f7.Y(b6Var, i122, u6Var);
        b6Var.l(r12, false);
        b6Var.setGravity(17);
        linearLayout.addView(b6Var, kb1.x(-2, -2, 49, 10, 10, 10, i10 <= 0 ? 0 : 20));
        if (z10) {
        }
        b6Var.i(!z10 ? org.telegram.ui.ActionBar.y6.g1 : org.telegram.ui.ActionBar.y6.h1);
        TLRPC.ChatInvite chatInvite72 = this.e;
        if (chatInvite72 == null) {
        }
        isEmpty = TextUtils.isEmpty(str3);
        TextView g72 = org.telegram.messenger.t.g(context, 1, 13.0f);
        int i132 = org.telegram.ui.ActionBar.y6.r5;
        org.telegram.ui.ActionBar.f7.V(g72, i132, u6Var);
        g72.setSingleLine(true);
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        g72.setEllipsize(truncateAt2);
        g72.setText(!z13 ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase());
        linearLayout.addView(g72, kb1.x(-2, -2, 49, 10, 0, 10, isEmpty ? 0 : 20));
        if (!isEmpty) {
        }
        chatInvite2 = this.e;
        if (chatInvite2 != null) {
        }
        FrameLayout frameLayout22 = new FrameLayout(getContext());
        linearLayout.addView(frameLayout22, kb1.r(-1, -2));
        RadialProgressView radialProgressView2 = new RadialProgressView(getContext(), u6Var);
        this.n = radialProgressView2;
        int i142 = org.telegram.ui.ActionBar.y6.Oh;
        radialProgressView2.setProgressColorKey(i142);
        radialProgressView2.setSize(AndroidUtilities.dp(32.0f));
        radialProgressView2.setVisibility(4);
        frameLayout22.addView(radialProgressView2, kb1.i(48, 48, 17));
        TextView textView22 = new TextView(getContext());
        this.h = textView22;
        int dp22 = AndroidUtilities.dp(24.0f);
        int themedColor5 = getThemedColor(i142);
        int i152 = org.telegram.ui.ActionBar.y6.Qh;
        int themedColor22 = getThemedColor(i152);
        org.telegram.ui.Cells.y j022 = org.telegram.ui.ActionBar.y6.j0(dp22, dp22, dp22, dp22, themedColor5, themedColor22, themedColor22);
        org.telegram.ui.ActionBar.b7 N5 = org.telegram.ui.ActionBar.f7.N(i142);
        org.telegram.ui.ActionBar.b7 N22 = org.telegram.ui.ActionBar.f7.N(i152);
        textView22.setBackground(j022);
        org.telegram.ui.ActionBar.f7.k(textView22, j022, N5, N22, u6Var);
        textView22.setEllipsize(truncateAt2);
        textView22.setGravity(17);
        textView22.setSingleLine(true);
        textView22.setText(LocaleController.getString(!z13 ? R.string.RequestToJoinChannel : R.string.RequestToJoinGroup));
        org.telegram.ui.ActionBar.f7.V(textView22, org.telegram.ui.ActionBar.y6.Sh, u6Var);
        textView22.setTextSize(1, 14.0f);
        textView22.setTypeface(AndroidUtilities.bold());
        textView22.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.a90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d90.r(d90.this, z13, j10);
            }
        });
        frameLayout22.addView(textView22, kb1.x(-1, 48, 8388611, 14, 0, 14, 0));
        TextView textView32 = new TextView(getContext());
        textView32.setGravity(17);
        textView32.setTextSize(1, 14.0f);
        textView32.setText(LocaleController.getString(!z13 ? R.string.RequestToJoinChannelDescription : R.string.RequestToJoinGroupDescription));
        org.telegram.ui.ActionBar.f7.V(textView32, i132, u6Var);
        linearLayout.addView(textView32, kb1.x(-1, -2, 48, 24, 17, 24, 15));
    }

    public static /* synthetic */ void m(d90 d90Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        d90 d90Var2;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(d90Var.currentAccount).lambda$processUpdates$379(updates2, false);
            updates = updates2;
        } else {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                y80 y80Var = new y80(d90Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j10, 1);
                d90Var2 = d90Var;
                AndroidUtilities.runOnUIThread(y80Var);
                AndroidUtilities.runOnUIThread(new e10(d90Var2, tL_error, updates, tL_messages_importChatInvite, 2));
            }
        }
        d90Var2 = d90Var;
        AndroidUtilities.runOnUIThread(new e10(d90Var2, tL_error, updates, tL_messages_importChatInvite, 2));
    }

    public static void n(d90 d90Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.r2 r2Var = d90Var.d;
        if (r2Var == null || r2Var.getParentActivity() == null) {
            return;
        }
        if (tL_error != null) {
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            g5.e0(d90Var.currentAccount, tL_error, r2Var, tL_messages_importChatInvite, new Object[0]);
            return;
        }
        if (updates == null || updates.chats.isEmpty()) {
            return;
        }
        TLRPC.Chat chat = updates.chats.get(0);
        chat.left = false;
        chat.kicked = false;
        MessagesController.getInstance(d90Var.currentAccount).putUsers(updates.users, false);
        MessagesController.getInstance(d90Var.currentAccount).putChats(updates.chats, false);
        long j10 = chat.id;
        boolean z10 = !ChatObject.isChannelAndNotMegaGroup(chat);
        d90Var.getClass();
        Bundle h = a1.g.h(j10, "chat_id");
        MessagesController messagesController = MessagesController.getInstance(d90Var.currentAccount);
        org.telegram.ui.ActionBar.r2 r2Var2 = d90Var.d;
        if (messagesController.checkCanOpenChat(h, r2Var2)) {
            r2Var2.presentFragment(new c90(d90Var, h, z10, j10), r2Var2 instanceof org.telegram.ui.wn);
        }
    }

    public static /* synthetic */ void o(d90 d90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(d90Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(d90Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static /* synthetic */ void p(d90 d90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(d90Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(d90Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static /* synthetic */ void q(d90 d90Var, long j10) {
        d90Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = d90Var.c;
        ConnectionsManager.getInstance(d90Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new bi.lc(d90Var, j10, tL_messages_importChatInvite), 2);
    }

    public static /* synthetic */ void r(final d90 d90Var, boolean z10, long j10) {
        TLRPC.Chat chat = d90Var.f;
        final int i10 = 0;
        AndroidUtilities.runOnUIThread(new Runnable(d90Var) { // from class: org.telegram.ui.Components.b90
            public final /* synthetic */ d90 b;

            {
                this.b = d90Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        d90 d90Var2 = this.b;
                        if (!d90Var2.isDismissed()) {
                            d90Var2.h.setVisibility(4);
                            d90Var2.n.setVisibility(0);
                            break;
                        }
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        }, 400L);
        if (d90Var.e != null || chat == null) {
            TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
            tL_messages_importChatInvite.hash = d90Var.c;
            ConnectionsManager.getInstance(d90Var.currentAccount).sendRequest(tL_messages_importChatInvite, new bi.m(d90Var, j10, z10, tL_messages_importChatInvite), 2);
        } else {
            final int i11 = 1;
            MessagesController.getInstance(d90Var.currentAccount).addUserToChat(chat.id, UserConfig.getInstance(d90Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(d90Var) { // from class: org.telegram.ui.Components.b90
                public final /* synthetic */ d90 b;

                {
                    this.b = d90Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            d90 d90Var2 = this.b;
                            if (!d90Var2.isDismissed()) {
                                d90Var2.h.setVisibility(4);
                                d90Var2.n.setVisibility(0);
                                break;
                            }
                            break;
                        default:
                            this.b.dismiss();
                            break;
                    }
                }
            }, new di.f(9, d90Var, z10));
        }
    }

    public static /* synthetic */ void s(d90 d90Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        d90 d90Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(d90Var.currentAccount).lambda$processUpdates$379(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            y80 y80Var = new y80(d90Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j10, 0);
            d90Var2 = d90Var;
            AndroidUtilities.runOnUIThread(y80Var);
            AndroidUtilities.runOnUIThread(new bi.s9(d90Var2, tL_error, z10, tL_messages_importChatInvite, 19));
        }
        d90Var2 = d90Var;
        AndroidUtilities.runOnUIThread(new bi.s9(d90Var2, tL_error, z10, tL_messages_importChatInvite, 19));
    }

    public static /* synthetic */ void t(d90 d90Var, TLRPC.TL_error tL_error, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.r2 r2Var = d90Var.d;
        if (r2Var == null || r2Var.getParentActivity() == null) {
            return;
        }
        if (tL_error != null) {
            if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                d90Var.setOnDismissListener(new z80(1, d90Var, z10));
            } else {
                g5.e0(d90Var.currentAccount, tL_error, r2Var, tL_messages_importChatInvite, new Object[0]);
            }
        }
        d90Var.dismiss();
    }

    public static CharSequence v(TextView textView, TLRPC.ChatInvite chatInvite, int i10) {
        String str = chatInvite.participants.get(i10).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
    }

    public static void w(Context context, org.telegram.ui.ActionBar.r2 r2Var, wc wcVar, boolean z10) {
        if (context == null) {
            if (r2Var != null) {
                r2Var.getContext();
                return;
            }
            return;
        }
        if (wcVar == null) {
            wcVar = wc.b0(r2Var);
        }
        nc ncVar = new nc(context, r2Var.getResourceProvider());
        ncVar.a.f(R.raw.timer_3, 28, 28, null);
        ncVar.b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        ncVar.c.setText(z10 ? LocaleController.getString(R.string.RequestToJoinChannelSentDescription) : LocaleController.getString(R.string.RequestToJoinGroupSentDescription));
        wcVar.b(ncVar, 2750).j();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            if (this.navBarColor != this.b || (themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.d6)) == this.navBarColor) {
                return;
            }
            fixNavigationBar(themedColor);
            this.b = this.navBarColor;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
