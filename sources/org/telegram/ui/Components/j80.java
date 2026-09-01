package org.telegram.ui.Components;

import android.content.Context;
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
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class j80 extends org.telegram.ui.ActionBar.h3 {
    public static final /* synthetic */ int r = 0;
    public final String b;
    public final org.telegram.ui.ActionBar.p2 c;
    public final TLRPC.ChatInvite d;
    public final TLRPC.Chat e;
    public final TextView f;
    public final RadialProgressView h;
    public qc n;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j80(Context context, TLObject tLObject, String str, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false, false);
        String str2;
        final long j10;
        LinearLayout linearLayout;
        TLRPC.ChatInvite chatInvite;
        String str3;
        boolean z4;
        boolean z10;
        boolean z11;
        int i10;
        org.telegram.ui.ActionBar.l5 l5Var;
        final boolean z12;
        boolean isEmpty;
        TLRPC.ChatInvite chatInvite2;
        float f10;
        String format;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        this.c = p2Var;
        if (tLObject instanceof TLRPC.ChatInvite) {
            TLRPC.ChatInvite chatInvite3 = (TLRPC.ChatInvite) tLObject;
            this.d = chatInvite3;
            TLRPC.Chat chat = chatInvite3.chat;
            j10 = chat != null ? -chat.id : 0L;
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                str2 = str;
                j10 = 0;
                this.b = str2;
                linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setClickable(true);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(linearLayout);
                NestedScrollView nestedScrollView = new NestedScrollView(context);
                nestedScrollView.addView(frameLayout);
                setCustomView(nestedScrollView);
                ImageView imageView = new ImageView(context);
                imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(org.telegram.ui.ActionBar.k6.i6), 1, -1));
                imageView.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.Ji));
                imageView.setImageResource(R.drawable.ic_layer_close);
                imageView.setOnClickListener(new b80(this, 1));
                int dp = AndroidUtilities.dp(8.0f);
                imageView.setPadding(dp, dp, dp, dp);
                frameLayout.addView(imageView, k7.c6.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                p9 p9Var = new p9(context);
                p9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
                linearLayout.addView(p9Var, k7.c6.t(90, 90, 49, 0, 27, 0, 0));
                chatInvite = this.d;
                if (chatInvite == null) {
                    if (chatInvite.chat != null) {
                        z8 z8Var = new z8(this.d.chat);
                        TLRPC.ChatInvite chatInvite4 = this.d;
                        TLRPC.Chat chat2 = chatInvite4.chat;
                        r12 = chat2.title;
                        i10 = chat2.participants_count;
                        p9Var.a.setForUserOrChat(chat2, z8Var, chatInvite4);
                        p9Var.d();
                    } else {
                        z8 z8Var2 = new z8((org.telegram.ui.ActionBar.g6) null);
                        z8Var2.n(0L, this.d.title, null);
                        TLRPC.ChatInvite chatInvite5 = this.d;
                        String str4 = chatInvite5.title;
                        i10 = chatInvite5.participants_count;
                        p9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(chatInvite5.photo.sizes, 50), this.d.photo), "50_50", z8Var2, this.d);
                        r12 = str4;
                    }
                    TLRPC.ChatInvite chatInvite6 = this.d;
                    str3 = chatInvite6.about;
                    z10 = chatInvite6.verified;
                    z11 = chatInvite6.fake;
                    z4 = chatInvite6.scam;
                } else if (this.e != null) {
                    z8 z8Var3 = new z8(this.e);
                    String str5 = this.e.title;
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.e.id);
                    r12 = chatFull != null ? chatFull.about : null;
                    i10 = Math.max(this.e.participants_count, chatFull != null ? chatFull.participants_count : 0);
                    TLRPC.Chat chat3 = this.e;
                    p9Var.a.setForUserOrChat(chat3, z8Var3, chat3);
                    p9Var.d();
                    TLRPC.Chat chat4 = this.e;
                    z10 = chat4.verified;
                    z11 = chat4.fake;
                    z4 = chat4.scam;
                    String str6 = r12;
                    r12 = str5;
                    str3 = str6;
                } else {
                    str3 = null;
                    z4 = false;
                    z10 = false;
                    z11 = false;
                    i10 = 0;
                }
                l5Var = new org.telegram.ui.ActionBar.l5(context);
                l5Var.setTypeface(AndroidUtilities.bold());
                l5Var.setTextSize(20);
                int i11 = org.telegram.ui.ActionBar.k6.j5;
                l5Var.setTextColor(getThemedColor(i11));
                l5Var.l(r12, false);
                l5Var.setGravity(17);
                linearLayout.addView(l5Var, k7.c6.t(-2, -2, 49, 10, 10, 10, i10 <= 0 ? 0 : 20));
                if (!z4 || z11) {
                    l5Var.i(!z4 ? org.telegram.ui.ActionBar.k6.g1 : org.telegram.ui.ActionBar.k6.h1);
                } else if (z10) {
                    l5Var.i(new pq(org.telegram.ui.ActionBar.k6.f1, org.telegram.ui.ActionBar.k6.i1));
                }
                TLRPC.ChatInvite chatInvite7 = this.d;
                z12 = (chatInvite7 == null && ((chatInvite7.channel && !chatInvite7.megagroup) || ChatObject.isChannelAndNotMegaGroup(chatInvite7.chat))) || (ChatObject.isChannel(this.e) && !this.e.megagroup);
                isEmpty = TextUtils.isEmpty(str3);
                TextView g10 = org.telegram.messenger.y3.g(context, 1, 13.0f);
                int i12 = org.telegram.ui.ActionBar.k6.r5;
                g10.setTextColor(getThemedColor(i12));
                g10.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                g10.setEllipsize(truncateAt);
                g10.setText(!z12 ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase());
                linearLayout.addView(g10, k7.c6.t(-2, -2, 49, 10, 0, 10, isEmpty ? 0 : 20));
                if (!isEmpty) {
                    TextView textView = new TextView(context);
                    textView.setGravity(17);
                    textView.setText(str3);
                    textView.setTextColor(getThemedColor(i11));
                    textView.setTextSize(1, 15.0f);
                    linearLayout.addView(textView, k7.c6.t(-1, -2, 48, 24, 10, 24, 20));
                }
                chatInvite2 = this.d;
                int i13 = 4;
                if (chatInvite2 != null || chatInvite2.request_needed) {
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    linearLayout.addView(frameLayout2, k7.c6.n(-1, -2));
                    RadialProgressView radialProgressView = new RadialProgressView(getContext(), g6Var);
                    this.h = radialProgressView;
                    int i14 = org.telegram.ui.ActionBar.k6.Oh;
                    radialProgressView.setProgressColor(getThemedColor(i14));
                    radialProgressView.setSize(AndroidUtilities.dp(32.0f));
                    radialProgressView.setVisibility(4);
                    frameLayout2.addView(radialProgressView, k7.c6.e(48, 48, 17));
                    TextView textView2 = new TextView(getContext());
                    this.f = textView2;
                    int dp2 = AndroidUtilities.dp(24.0f);
                    int themedColor = getThemedColor(i14);
                    int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.Qh);
                    textView2.setBackground(org.telegram.ui.ActionBar.k6.i0(dp2, dp2, dp2, dp2, themedColor, themedColor2, themedColor2));
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity(17);
                    textView2.setSingleLine(true);
                    textView2.setText(LocaleController.getString(!z12 ? R.string.RequestToJoinChannel : R.string.RequestToJoinGroup));
                    textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Sh));
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.g80
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            j80.r(j80.this, z12, j10);
                        }
                    });
                    frameLayout2.addView(textView2, k7.c6.t(-1, 48, 8388611, 14, 0, 14, 0));
                    TextView textView3 = new TextView(getContext());
                    textView3.setGravity(17);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setText(LocaleController.getString(!z12 ? R.string.RequestToJoinChannelDescription : R.string.RequestToJoinGroupDescription));
                    textView3.setTextColor(getThemedColor(i12));
                    linearLayout.addView(textView3, k7.c6.t(-1, -2, 48, 24, 17, 24, 15));
                }
                if (chatInvite2.participants.isEmpty()) {
                    f10 = 24.0f;
                } else {
                    int min = Math.min(this.d.participants.size(), 3);
                    d9 d9Var = new d9(context, false);
                    d9Var.setAvatarsTextSize(AndroidUtilities.dp(20.0f));
                    float f11 = 38;
                    d9Var.setSize(AndroidUtilities.dp(f11));
                    d9Var.setCount(min);
                    d9Var.setStepFactor(0.65f);
                    for (int i15 = 0; i15 < min; i15++) {
                        d9Var.b(i15, this.d.participants.get(i15), UserConfig.selectedAccount);
                    }
                    f10 = 24.0f;
                    d9Var.a(false);
                    linearLayout.addView(d9Var, k7.c6.t((int) ((((f11 * 0.65f) + 1.0f) * (min - 1)) + f11), 44, 17, 0, 2, 0, 4));
                    TextView textView4 = new TextView(context);
                    textView4.setTextSize(1, 13.0f);
                    textView4.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.r5));
                    textView4.setGravity(17);
                    if (min == 1) {
                        format = v(textView4, this.d, 0).toString();
                    } else if (min == 2) {
                        format = LocaleController.formatString("RequestToJoinMembersTwo", R.string.RequestToJoinMembersTwo, v(textView4, this.d, 0), v(textView4, this.d, 1));
                    } else if (i10 == 3) {
                        format = LocaleController.formatString("RequestToJoinMembersThree", R.string.RequestToJoinMembersThree, v(textView4, this.d, 0), v(textView4, this.d, 1), v(textView4, this.d, 2));
                    } else {
                        int max = Math.max(i10 - min, 2);
                        format = String.format(LocaleController.getPluralString("RequestToJoinMembersAll", max), v(textView4, this.d, 0), v(textView4, this.d, 1), Integer.valueOf(max));
                    }
                    textView4.setText(format);
                    linearLayout.addView(textView4, k7.c6.t(-2, -2, 49, 10, 0, 10, 24));
                }
                TLRPC.ChatInvite chatInvite8 = this.d;
                boolean z13 = (chatInvite8.channel && !chatInvite8.megagroup) || (ChatObject.isChannel(chatInvite8.chat) && !this.d.chat.megagroup);
                TextView textView5 = new TextView(getContext());
                int dp3 = AndroidUtilities.dp(f10);
                int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.k6.Oh);
                int themedColor4 = getThemedColor(org.telegram.ui.ActionBar.k6.Qh);
                textView5.setBackground(org.telegram.ui.ActionBar.k6.i0(dp3, dp3, dp3, dp3, themedColor3, themedColor4, themedColor4));
                k7.e6.b(textView5, 0.02f, 1.2f);
                textView5.setEllipsize(TextUtils.TruncateAt.END);
                textView5.setGravity(17);
                textView5.setSingleLine(true);
                textView5.setText(LocaleController.getString(z13 ? R.string.ProfileJoinChannel : R.string.ProfileJoinGroup));
                textView5.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Sh));
                textView5.setTextSize(1, 14.0f);
                textView5.setTypeface(AndroidUtilities.bold());
                linearLayout.addView(textView5, k7.c6.t(-1, 48, 8388611, 14, 0, 14, 14));
                textView5.setOnClickListener(new eh.t(this, j10, i13));
                return;
            }
            TLRPC.Chat chat5 = (TLRPC.Chat) tLObject;
            this.e = chat5;
            j10 = chat5.id;
        }
        str2 = str;
        this.b = str2;
        linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClickable(true);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.addView(linearLayout);
        NestedScrollView nestedScrollView2 = new NestedScrollView(context);
        nestedScrollView2.addView(frameLayout3);
        setCustomView(nestedScrollView2);
        ImageView imageView2 = new ImageView(context);
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(org.telegram.ui.ActionBar.k6.i6), 1, -1));
        imageView2.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.Ji));
        imageView2.setImageResource(R.drawable.ic_layer_close);
        imageView2.setOnClickListener(new b80(this, 1));
        int dp4 = AndroidUtilities.dp(8.0f);
        imageView2.setPadding(dp4, dp4, dp4, dp4);
        frameLayout3.addView(imageView2, k7.c6.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        p9 p9Var2 = new p9(context);
        p9Var2.setRoundRadius(AndroidUtilities.dp(45.0f));
        linearLayout.addView(p9Var2, k7.c6.t(90, 90, 49, 0, 27, 0, 0));
        chatInvite = this.d;
        if (chatInvite == null) {
        }
        l5Var = new org.telegram.ui.ActionBar.l5(context);
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setTextSize(20);
        int i112 = org.telegram.ui.ActionBar.k6.j5;
        l5Var.setTextColor(getThemedColor(i112));
        l5Var.l(r12, false);
        l5Var.setGravity(17);
        linearLayout.addView(l5Var, k7.c6.t(-2, -2, 49, 10, 10, 10, i10 <= 0 ? 0 : 20));
        if (z4) {
        }
        l5Var.i(!z4 ? org.telegram.ui.ActionBar.k6.g1 : org.telegram.ui.ActionBar.k6.h1);
        TLRPC.ChatInvite chatInvite72 = this.d;
        if (chatInvite72 == null) {
        }
        isEmpty = TextUtils.isEmpty(str3);
        TextView g102 = org.telegram.messenger.y3.g(context, 1, 13.0f);
        int i122 = org.telegram.ui.ActionBar.k6.r5;
        g102.setTextColor(getThemedColor(i122));
        g102.setSingleLine(true);
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        g102.setEllipsize(truncateAt2);
        g102.setText(!z12 ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase());
        linearLayout.addView(g102, k7.c6.t(-2, -2, 49, 10, 0, 10, isEmpty ? 0 : 20));
        if (!isEmpty) {
        }
        chatInvite2 = this.d;
        int i132 = 4;
        if (chatInvite2 != null) {
        }
        FrameLayout frameLayout22 = new FrameLayout(getContext());
        linearLayout.addView(frameLayout22, k7.c6.n(-1, -2));
        RadialProgressView radialProgressView2 = new RadialProgressView(getContext(), g6Var);
        this.h = radialProgressView2;
        int i142 = org.telegram.ui.ActionBar.k6.Oh;
        radialProgressView2.setProgressColor(getThemedColor(i142));
        radialProgressView2.setSize(AndroidUtilities.dp(32.0f));
        radialProgressView2.setVisibility(4);
        frameLayout22.addView(radialProgressView2, k7.c6.e(48, 48, 17));
        TextView textView22 = new TextView(getContext());
        this.f = textView22;
        int dp22 = AndroidUtilities.dp(24.0f);
        int themedColor5 = getThemedColor(i142);
        int themedColor22 = getThemedColor(org.telegram.ui.ActionBar.k6.Qh);
        textView22.setBackground(org.telegram.ui.ActionBar.k6.i0(dp22, dp22, dp22, dp22, themedColor5, themedColor22, themedColor22));
        textView22.setEllipsize(truncateAt2);
        textView22.setGravity(17);
        textView22.setSingleLine(true);
        textView22.setText(LocaleController.getString(!z12 ? R.string.RequestToJoinChannel : R.string.RequestToJoinGroup));
        textView22.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Sh));
        textView22.setTextSize(1, 14.0f);
        textView22.setTypeface(AndroidUtilities.bold());
        textView22.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.g80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j80.r(j80.this, z12, j10);
            }
        });
        frameLayout22.addView(textView22, k7.c6.t(-1, 48, 8388611, 14, 0, 14, 0));
        TextView textView32 = new TextView(getContext());
        textView32.setGravity(17);
        textView32.setTextSize(1, 14.0f);
        textView32.setText(LocaleController.getString(!z12 ? R.string.RequestToJoinChannelDescription : R.string.RequestToJoinGroupDescription));
        textView32.setTextColor(getThemedColor(i122));
        linearLayout.addView(textView32, k7.c6.t(-1, -2, 48, 24, 17, 24, 15));
    }

    public static /* synthetic */ void m(j80 j80Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        j80 j80Var2;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(j80Var.currentAccount).processUpdates(updates2, false);
            updates = updates2;
        } else {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                e80 e80Var = new e80(j80Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j10, 1);
                j80Var2 = j80Var;
                AndroidUtilities.runOnUIThread(e80Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ih((Object) j80Var2, (Object) tL_error, (TLObject) updates, (Object) tL_messages_importChatInvite, 16));
            }
        }
        j80Var2 = j80Var;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.ih((Object) j80Var2, (Object) tL_error, (TLObject) updates, (Object) tL_messages_importChatInvite, 16));
    }

    public static void n(j80 j80Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.p2 p2Var = j80Var.c;
        if (p2Var == null || p2Var.getParentActivity() == null) {
            return;
        }
        if (tL_error != null) {
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            z4.f0(j80Var.currentAccount, tL_error, p2Var, tL_messages_importChatInvite, new Object[0]);
            return;
        }
        if (updates == null || updates.chats.isEmpty()) {
            return;
        }
        TLRPC.Chat chat = updates.chats.get(0);
        chat.left = false;
        chat.kicked = false;
        MessagesController.getInstance(j80Var.currentAccount).putUsers(updates.users, false);
        MessagesController.getInstance(j80Var.currentAccount).putChats(updates.chats, false);
        long j10 = chat.id;
        boolean z4 = !ChatObject.isChannelAndNotMegaGroup(chat);
        j80Var.getClass();
        Bundle g10 = l.d.g(j10, "chat_id");
        MessagesController messagesController = MessagesController.getInstance(j80Var.currentAccount);
        org.telegram.ui.ActionBar.p2 p2Var2 = j80Var.c;
        if (messagesController.checkCanOpenChat(g10, p2Var2)) {
            p2Var2.presentFragment(new i80(j80Var, g10, z4, j10), p2Var2 instanceof org.telegram.ui.xn);
        }
    }

    public static /* synthetic */ void o(j80 j80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(j80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(j80Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static /* synthetic */ void p(j80 j80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(j80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(j80Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static /* synthetic */ void q(j80 j80Var, long j10) {
        j80Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = j80Var.b;
        ConnectionsManager.getInstance(j80Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new lh.i5(j80Var, j10, tL_messages_importChatInvite), 2);
    }

    public static /* synthetic */ void r(final j80 j80Var, boolean z4, long j10) {
        TLRPC.Chat chat = j80Var.e;
        final int i10 = 0;
        AndroidUtilities.runOnUIThread(new Runnable(j80Var) { // from class: org.telegram.ui.Components.h80
            public final /* synthetic */ j80 b;

            {
                this.b = j80Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        j80 j80Var2 = this.b;
                        if (!j80Var2.isDismissed()) {
                            j80Var2.f.setVisibility(4);
                            j80Var2.h.setVisibility(0);
                            break;
                        }
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        }, 400L);
        if (j80Var.d != null || chat == null) {
            TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
            tL_messages_importChatInvite.hash = j80Var.b;
            ConnectionsManager.getInstance(j80Var.currentAccount).sendRequest(tL_messages_importChatInvite, new mh.h(j80Var, j10, z4, tL_messages_importChatInvite), 2);
        } else {
            final int i11 = 1;
            MessagesController.getInstance(j80Var.currentAccount).addUserToChat(chat.id, UserConfig.getInstance(j80Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(j80Var) { // from class: org.telegram.ui.Components.h80
                public final /* synthetic */ j80 b;

                {
                    this.b = j80Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            j80 j80Var2 = this.b;
                            if (!j80Var2.isDismissed()) {
                                j80Var2.f.setVisibility(4);
                                j80Var2.h.setVisibility(0);
                                break;
                            }
                            break;
                        default:
                            this.b.dismiss();
                            break;
                    }
                }
            }, new jh.q(6, j80Var, z4));
        }
    }

    public static /* synthetic */ void s(j80 j80Var, long j10, boolean z4, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        j80 j80Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(j80Var.currentAccount).processUpdates(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            e80 e80Var = new e80(j80Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j10, 0);
            j80Var2 = j80Var;
            AndroidUtilities.runOnUIThread(e80Var);
            AndroidUtilities.runOnUIThread(new dg.t0(j80Var2, tL_error, z4, tL_messages_importChatInvite, 14));
        }
        j80Var2 = j80Var;
        AndroidUtilities.runOnUIThread(new dg.t0(j80Var2, tL_error, z4, tL_messages_importChatInvite, 14));
    }

    public static /* synthetic */ void t(j80 j80Var, TLRPC.TL_error tL_error, boolean z4, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.p2 p2Var = j80Var.c;
        if (p2Var == null || p2Var.getParentActivity() == null) {
            return;
        }
        if (tL_error != null) {
            if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                j80Var.setOnDismissListener(new f80(1, j80Var, z4));
            } else {
                z4.f0(j80Var.currentAccount, tL_error, p2Var, tL_messages_importChatInvite, new Object[0]);
            }
        }
        j80Var.dismiss();
    }

    public static CharSequence v(TextView textView, TLRPC.ChatInvite chatInvite, int i10) {
        String str = chatInvite.participants.get(i10).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
    }

    public static void w(Context context, org.telegram.ui.ActionBar.p2 p2Var, qc qcVar, boolean z4) {
        if (context == null) {
            if (p2Var != null) {
                p2Var.getContext();
                return;
            }
            return;
        }
        if (qcVar == null) {
            qcVar = qc.a0(p2Var);
        }
        fc fcVar = new fc(context, p2Var.getResourceProvider());
        fcVar.a.f(R.raw.timer_3, 28, 28, null);
        fcVar.b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        fcVar.c.setText(z4 ? LocaleController.getString(R.string.RequestToJoinChannelSentDescription) : LocaleController.getString(R.string.RequestToJoinGroupSentDescription));
        qcVar.b(fcVar, 2750).j();
    }
}
