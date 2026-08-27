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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class t70 extends org.telegram.ui.ActionBar.e3 {
    public static final /* synthetic */ int r = 0;
    public final String b;
    public final org.telegram.ui.ActionBar.n2 c;
    public final TLRPC.ChatInvite d;
    public final TLRPC.Chat e;
    public final TextView f;
    public final RadialProgressView h;
    public mc n;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t70(Context context, TLObject tLObject, String str, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false);
        String str2;
        final long j10;
        LinearLayout linearLayout;
        TLRPC.ChatInvite chatInvite;
        boolean z10;
        String str3;
        boolean z11;
        boolean z12;
        String str4;
        int i10;
        org.telegram.ui.ActionBar.h5 h5Var;
        final boolean z13;
        boolean isEmpty;
        TLRPC.ChatInvite chatInvite2;
        float f10;
        boolean z14;
        String format;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        this.c = n2Var;
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
                NestedScrollView nestedScrollView = new NestedScrollView(context, null);
                nestedScrollView.addView(frameLayout);
                setCustomView(nestedScrollView);
                ImageView imageView = new ImageView(context);
                imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.i6), 1, -1));
                imageView.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Ji));
                imageView.setImageResource(R.drawable.ic_layer_close);
                imageView.setOnClickListener(new l70(this, 1));
                int dp = AndroidUtilities.dp(8.0f);
                imageView.setPadding(dp, dp, dp, dp);
                frameLayout.addView(imageView, h7.z5.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                n9 n9Var = new n9(context);
                n9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
                linearLayout.addView(n9Var, h7.z5.t(90, 90, 49, 0, 27, 0, 0));
                chatInvite = this.d;
                if (chatInvite == null) {
                    if (chatInvite.chat != null) {
                        y8 y8Var = new y8(this.d.chat);
                        TLRPC.ChatInvite chatInvite4 = this.d;
                        TLRPC.Chat chat2 = chatInvite4.chat;
                        str4 = chat2.title;
                        i10 = chat2.participants_count;
                        n9Var.a.setForUserOrChat(chat2, y8Var, chatInvite4);
                        n9Var.d();
                    } else {
                        y8 y8Var2 = new y8((org.telegram.ui.ActionBar.c6) null);
                        y8Var2.n(0L, this.d.title, null);
                        TLRPC.ChatInvite chatInvite5 = this.d;
                        String str5 = chatInvite5.title;
                        i10 = chatInvite5.participants_count;
                        n9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(chatInvite5.photo.sizes, 50), this.d.photo), "50_50", y8Var2, this.d);
                        str4 = str5;
                    }
                    TLRPC.ChatInvite chatInvite6 = this.d;
                    str3 = chatInvite6.about;
                    z11 = chatInvite6.verified;
                    z12 = chatInvite6.fake;
                    z10 = chatInvite6.scam;
                } else if (this.e != null) {
                    y8 y8Var3 = new y8(this.e);
                    String str6 = this.e.title;
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.e.id);
                    String str7 = chatFull != null ? chatFull.about : null;
                    i10 = Math.max(this.e.participants_count, chatFull != null ? chatFull.participants_count : 0);
                    TLRPC.Chat chat3 = this.e;
                    n9Var.a.setForUserOrChat(chat3, y8Var3, chat3);
                    n9Var.d();
                    TLRPC.Chat chat4 = this.e;
                    z11 = chat4.verified;
                    z12 = chat4.fake;
                    z10 = chat4.scam;
                    String str8 = str7;
                    str4 = str6;
                    str3 = str8;
                } else {
                    z10 = false;
                    str3 = null;
                    z11 = false;
                    z12 = false;
                    str4 = null;
                    i10 = 0;
                }
                h5Var = new org.telegram.ui.ActionBar.h5(context);
                h5Var.setTypeface(AndroidUtilities.bold());
                h5Var.setTextSize(20);
                int i11 = org.telegram.ui.ActionBar.g6.j5;
                h5Var.setTextColor(getThemedColor(i11));
                h5Var.l(str4, false);
                h5Var.setGravity(17);
                linearLayout.addView(h5Var, h7.z5.t(-2, -2, 49, 10, 10, 10, i10 <= 0 ? 0 : 20));
                if (!z10 || z12) {
                    h5Var.i(!z10 ? org.telegram.ui.ActionBar.g6.g1 : org.telegram.ui.ActionBar.g6.h1);
                } else if (z11) {
                    h5Var.i(new dq(org.telegram.ui.ActionBar.g6.f1, org.telegram.ui.ActionBar.g6.i1));
                }
                TLRPC.ChatInvite chatInvite7 = this.d;
                z13 = (chatInvite7 == null && ((chatInvite7.channel && !chatInvite7.megagroup) || ChatObject.isChannelAndNotMegaGroup(chatInvite7.chat))) || (ChatObject.isChannel(this.e) && !this.e.megagroup);
                isEmpty = TextUtils.isEmpty(str3);
                TextView h = org.telegram.messenger.y1.h(context, 1, 13.0f);
                int i12 = org.telegram.ui.ActionBar.g6.r5;
                h.setTextColor(getThemedColor(i12));
                h.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                h.setEllipsize(truncateAt);
                h.setText(!z13 ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase());
                linearLayout.addView(h, h7.z5.t(-2, -2, 49, 10, 0, 10, isEmpty ? 0 : 20));
                if (!isEmpty) {
                    TextView textView = new TextView(context);
                    textView.setGravity(17);
                    textView.setText(str3);
                    textView.setTextColor(getThemedColor(i11));
                    textView.setTextSize(1, 15.0f);
                    linearLayout.addView(textView, h7.z5.t(-1, -2, 48, 24, 10, 24, 20));
                }
                chatInvite2 = this.d;
                if (chatInvite2 != null || chatInvite2.request_needed) {
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    linearLayout.addView(frameLayout2, h7.z5.n(-1, -2));
                    RadialProgressView radialProgressView = new RadialProgressView(getContext(), c6Var);
                    this.h = radialProgressView;
                    int i13 = org.telegram.ui.ActionBar.g6.Oh;
                    radialProgressView.setProgressColor(getThemedColor(i13));
                    radialProgressView.setSize(AndroidUtilities.dp(32.0f));
                    radialProgressView.setVisibility(4);
                    frameLayout2.addView(radialProgressView, h7.z5.e(48, 48, 17));
                    TextView textView2 = new TextView(getContext());
                    this.f = textView2;
                    int dp2 = AndroidUtilities.dp(24.0f);
                    int themedColor = getThemedColor(i13);
                    int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.Qh);
                    textView2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp2, dp2, dp2, dp2, themedColor, themedColor2, themedColor2));
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity(17);
                    textView2.setSingleLine(true);
                    textView2.setText(LocaleController.getString(!z13 ? R.string.RequestToJoinChannel : R.string.RequestToJoinGroup));
                    textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.q70
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            t70.s(t70.this, z13, j10);
                        }
                    });
                    frameLayout2.addView(textView2, h7.z5.t(-1, 48, 8388611, 14, 0, 14, 0));
                    TextView textView3 = new TextView(getContext());
                    textView3.setGravity(17);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setText(LocaleController.getString(!z13 ? R.string.RequestToJoinChannelDescription : R.string.RequestToJoinGroupDescription));
                    textView3.setTextColor(getThemedColor(i12));
                    linearLayout.addView(textView3, h7.z5.t(-1, -2, 48, 24, 17, 24, 15));
                }
                int i14 = 3;
                if (chatInvite2.participants.isEmpty()) {
                    f10 = 24.0f;
                    z14 = false;
                } else {
                    int min = Math.min(this.d.participants.size(), 3);
                    b9 b9Var = new b9(context, false);
                    b9Var.setAvatarsTextSize(AndroidUtilities.dp(20.0f));
                    float f11 = 38;
                    b9Var.setSize(AndroidUtilities.dp(f11));
                    b9Var.setCount(min);
                    b9Var.setStepFactor(0.65f);
                    for (int i15 = 0; i15 < min; i15++) {
                        b9Var.b(i15, this.d.participants.get(i15), UserConfig.selectedAccount);
                    }
                    f10 = 24.0f;
                    b9Var.a(false);
                    linearLayout.addView(b9Var, h7.z5.t((int) ((((0.65f * f11) + 1.0f) * (min - 1)) + f11), 44, 17, 0, 2, 0, 4));
                    TextView textView4 = new TextView(context);
                    textView4.setTextSize(1, 13.0f);
                    textView4.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.r5));
                    textView4.setGravity(17);
                    if (min == 1) {
                        z14 = false;
                        format = w(textView4, this.d, 0).toString();
                    } else {
                        z14 = false;
                        if (min == 2) {
                            format = LocaleController.formatString("RequestToJoinMembersTwo", R.string.RequestToJoinMembersTwo, w(textView4, this.d, 0), w(textView4, this.d, 1));
                        } else if (i10 == 3) {
                            format = LocaleController.formatString("RequestToJoinMembersThree", R.string.RequestToJoinMembersThree, w(textView4, this.d, 0), w(textView4, this.d, 1), w(textView4, this.d, 2));
                        } else {
                            int max = Math.max(i10 - min, 2);
                            format = String.format(LocaleController.getPluralString("RequestToJoinMembersAll", max), w(textView4, this.d, 0), w(textView4, this.d, 1), Integer.valueOf(max));
                        }
                    }
                    textView4.setText(format);
                    linearLayout.addView(textView4, h7.z5.t(-2, -2, 49, 10, 0, 10, 24));
                }
                TLRPC.ChatInvite chatInvite8 = this.d;
                if ((chatInvite8.channel && !chatInvite8.megagroup) || (ChatObject.isChannel(chatInvite8.chat) && !this.d.chat.megagroup)) {
                    z14 = true;
                }
                TextView textView5 = new TextView(getContext());
                int dp3 = AndroidUtilities.dp(f10);
                int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.g6.Oh);
                int themedColor4 = getThemedColor(org.telegram.ui.ActionBar.g6.Qh);
                textView5.setBackground(org.telegram.ui.ActionBar.g6.i0(dp3, dp3, dp3, dp3, themedColor3, themedColor4, themedColor4));
                h7.b6.b(textView5, 0.02f, 1.2f);
                textView5.setEllipsize(TextUtils.TruncateAt.END);
                textView5.setGravity(17);
                textView5.setSingleLine(true);
                textView5.setText(LocaleController.getString(z14 ? R.string.ProfileJoinChannel : R.string.ProfileJoinGroup));
                textView5.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
                textView5.setTextSize(1, 14.0f);
                textView5.setTypeface(AndroidUtilities.bold());
                linearLayout.addView(textView5, h7.z5.t(-1, 48, 8388611, 14, 0, 14, 14));
                textView5.setOnClickListener(new gh.o(this, j10, i14));
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
        NestedScrollView nestedScrollView2 = new NestedScrollView(context, null);
        nestedScrollView2.addView(frameLayout3);
        setCustomView(nestedScrollView2);
        ImageView imageView2 = new ImageView(context);
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.i6), 1, -1));
        imageView2.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Ji));
        imageView2.setImageResource(R.drawable.ic_layer_close);
        imageView2.setOnClickListener(new l70(this, 1));
        int dp4 = AndroidUtilities.dp(8.0f);
        imageView2.setPadding(dp4, dp4, dp4, dp4);
        frameLayout3.addView(imageView2, h7.z5.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        n9 n9Var2 = new n9(context);
        n9Var2.setRoundRadius(AndroidUtilities.dp(45.0f));
        linearLayout.addView(n9Var2, h7.z5.t(90, 90, 49, 0, 27, 0, 0));
        chatInvite = this.d;
        if (chatInvite == null) {
        }
        h5Var = new org.telegram.ui.ActionBar.h5(context);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(20);
        int i112 = org.telegram.ui.ActionBar.g6.j5;
        h5Var.setTextColor(getThemedColor(i112));
        h5Var.l(str4, false);
        h5Var.setGravity(17);
        linearLayout.addView(h5Var, h7.z5.t(-2, -2, 49, 10, 10, 10, i10 <= 0 ? 0 : 20));
        if (z10) {
        }
        h5Var.i(!z10 ? org.telegram.ui.ActionBar.g6.g1 : org.telegram.ui.ActionBar.g6.h1);
        TLRPC.ChatInvite chatInvite72 = this.d;
        if (chatInvite72 == null) {
        }
        isEmpty = TextUtils.isEmpty(str3);
        TextView h10 = org.telegram.messenger.y1.h(context, 1, 13.0f);
        int i122 = org.telegram.ui.ActionBar.g6.r5;
        h10.setTextColor(getThemedColor(i122));
        h10.setSingleLine(true);
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        h10.setEllipsize(truncateAt2);
        h10.setText(!z13 ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase());
        linearLayout.addView(h10, h7.z5.t(-2, -2, 49, 10, 0, 10, isEmpty ? 0 : 20));
        if (!isEmpty) {
        }
        chatInvite2 = this.d;
        if (chatInvite2 != null) {
        }
        FrameLayout frameLayout22 = new FrameLayout(getContext());
        linearLayout.addView(frameLayout22, h7.z5.n(-1, -2));
        RadialProgressView radialProgressView2 = new RadialProgressView(getContext(), c6Var);
        this.h = radialProgressView2;
        int i132 = org.telegram.ui.ActionBar.g6.Oh;
        radialProgressView2.setProgressColor(getThemedColor(i132));
        radialProgressView2.setSize(AndroidUtilities.dp(32.0f));
        radialProgressView2.setVisibility(4);
        frameLayout22.addView(radialProgressView2, h7.z5.e(48, 48, 17));
        TextView textView22 = new TextView(getContext());
        this.f = textView22;
        int dp22 = AndroidUtilities.dp(24.0f);
        int themedColor5 = getThemedColor(i132);
        int themedColor22 = getThemedColor(org.telegram.ui.ActionBar.g6.Qh);
        textView22.setBackground(org.telegram.ui.ActionBar.g6.i0(dp22, dp22, dp22, dp22, themedColor5, themedColor22, themedColor22));
        textView22.setEllipsize(truncateAt2);
        textView22.setGravity(17);
        textView22.setSingleLine(true);
        textView22.setText(LocaleController.getString(!z13 ? R.string.RequestToJoinChannel : R.string.RequestToJoinGroup));
        textView22.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
        textView22.setTextSize(1, 14.0f);
        textView22.setTypeface(AndroidUtilities.bold());
        textView22.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.q70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t70.s(t70.this, z13, j10);
            }
        });
        frameLayout22.addView(textView22, h7.z5.t(-1, 48, 8388611, 14, 0, 14, 0));
        TextView textView32 = new TextView(getContext());
        textView32.setGravity(17);
        textView32.setTextSize(1, 14.0f);
        textView32.setText(LocaleController.getString(!z13 ? R.string.RequestToJoinChannelDescription : R.string.RequestToJoinGroupDescription));
        textView32.setTextColor(getThemedColor(i122));
        linearLayout.addView(textView32, h7.z5.t(-1, -2, 48, 24, 17, 24, 15));
    }

    public static /* synthetic */ void m(t70 t70Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        t70 t70Var2;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(t70Var.currentAccount).processUpdates(updates2, false);
            updates = updates2;
        } else {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                o70 o70Var = new o70(t70Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j10, 1);
                t70Var2 = t70Var;
                AndroidUtilities.runOnUIThread(o70Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.yf(t70Var2, tL_error, updates, tL_messages_importChatInvite, 20));
            }
        }
        t70Var2 = t70Var;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.yf(t70Var2, tL_error, updates, tL_messages_importChatInvite, 20));
    }

    public static void n(t70 t70Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.n2 n2Var = t70Var.c;
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        if (tL_error != null) {
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            y4.f0(t70Var.currentAccount, tL_error, n2Var, tL_messages_importChatInvite, new Object[0]);
            return;
        }
        if (updates == null || updates.chats.isEmpty()) {
            return;
        }
        TLRPC.Chat chat = updates.chats.get(0);
        chat.left = false;
        chat.kicked = false;
        MessagesController.getInstance(t70Var.currentAccount).putUsers(updates.users, false);
        MessagesController.getInstance(t70Var.currentAccount).putChats(updates.chats, false);
        long j10 = chat.id;
        boolean z10 = !ChatObject.isChannelAndNotMegaGroup(chat);
        t70Var.getClass();
        Bundle h = com.google.android.recaptcha.internal.a.h(j10, "chat_id");
        MessagesController messagesController = MessagesController.getInstance(t70Var.currentAccount);
        org.telegram.ui.ActionBar.n2 n2Var2 = t70Var.c;
        if (messagesController.checkCanOpenChat(h, n2Var2)) {
            n2Var2.presentFragment(new s70(t70Var, h, z10, j10), n2Var2 instanceof org.telegram.ui.rn);
        }
    }

    public static /* synthetic */ void p(t70 t70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(t70Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(t70Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static /* synthetic */ void q(t70 t70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(t70Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(t70Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static /* synthetic */ void r(t70 t70Var, long j10) {
        t70Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = t70Var.b;
        ConnectionsManager.getInstance(t70Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new gh.p5(t70Var, j10, tL_messages_importChatInvite), 2);
    }

    public static /* synthetic */ void s(final t70 t70Var, boolean z10, long j10) {
        TLRPC.Chat chat = t70Var.e;
        final int i10 = 0;
        AndroidUtilities.runOnUIThread(new Runnable(t70Var) { // from class: org.telegram.ui.Components.r70
            public final /* synthetic */ t70 b;

            {
                this.b = t70Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        t70 t70Var2 = this.b;
                        if (!t70Var2.isDismissed()) {
                            t70Var2.f.setVisibility(4);
                            t70Var2.h.setVisibility(0);
                            break;
                        }
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        }, 400L);
        if (t70Var.d != null || chat == null) {
            TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
            tL_messages_importChatInvite.hash = t70Var.b;
            ConnectionsManager.getInstance(t70Var.currentAccount).sendRequest(tL_messages_importChatInvite, new hh.h(t70Var, j10, z10, tL_messages_importChatInvite), 2);
        } else {
            final int i11 = 1;
            MessagesController.getInstance(t70Var.currentAccount).addUserToChat(chat.id, UserConfig.getInstance(t70Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(t70Var) { // from class: org.telegram.ui.Components.r70
                public final /* synthetic */ t70 b;

                {
                    this.b = t70Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            t70 t70Var2 = this.b;
                            if (!t70Var2.isDismissed()) {
                                t70Var2.f.setVisibility(4);
                                t70Var2.h.setVisibility(0);
                                break;
                            }
                            break;
                        default:
                            this.b.dismiss();
                            break;
                    }
                }
            }, new eh.q(6, t70Var, z10));
        }
    }

    public static /* synthetic */ void t(t70 t70Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        t70 t70Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(t70Var.currentAccount).processUpdates(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            o70 o70Var = new o70(t70Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j10, 0);
            t70Var2 = t70Var;
            AndroidUtilities.runOnUIThread(o70Var);
            AndroidUtilities.runOnUIThread(new cg.c(t70Var2, tL_error, z10, tL_messages_importChatInvite, 15));
        }
        t70Var2 = t70Var;
        AndroidUtilities.runOnUIThread(new cg.c(t70Var2, tL_error, z10, tL_messages_importChatInvite, 15));
    }

    public static /* synthetic */ void u(t70 t70Var, TLRPC.TL_error tL_error, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.n2 n2Var = t70Var.c;
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        if (tL_error != null) {
            if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                t70Var.setOnDismissListener(new p70(1, t70Var, z10));
            } else {
                y4.f0(t70Var.currentAccount, tL_error, n2Var, tL_messages_importChatInvite, new Object[0]);
            }
        }
        t70Var.dismiss();
    }

    public static CharSequence w(TextView textView, TLRPC.ChatInvite chatInvite, int i10) {
        String str = chatInvite.participants.get(i10).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
    }

    public static void x(Context context, org.telegram.ui.ActionBar.n2 n2Var, mc mcVar, boolean z10) {
        if (context == null) {
            if (n2Var != null) {
                n2Var.getContext();
                return;
            }
            return;
        }
        if (mcVar == null) {
            mcVar = mc.a0(n2Var);
        }
        bc bcVar = new bc(context, n2Var.getResourceProvider());
        bcVar.a.f(R.raw.timer_3, 28, 28, null);
        bcVar.b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        bcVar.c.setText(z10 ? LocaleController.getString(R.string.RequestToJoinChannelSentDescription) : LocaleController.getString(R.string.RequestToJoinGroupSentDescription));
        mcVar.b(bcVar, 2750).j();
    }
}
