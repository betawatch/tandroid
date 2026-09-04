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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class g80 extends org.telegram.ui.ActionBar.f3 {
    public static final /* synthetic */ int r = 0;
    public final String b;
    public final org.telegram.ui.ActionBar.n2 c;
    public final TLRPC.ChatInvite d;
    public final TLRPC.Chat e;
    public final TextView f;
    public final RadialProgressView h;
    public yc n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g80(Context context, TLObject tLObject, String str, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        String str2;
        final long j3;
        LinearLayout linearLayout;
        TLRPC.ChatInvite chatInvite;
        String str3;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        org.telegram.ui.ActionBar.j5 j5Var;
        final boolean z13;
        boolean isEmpty;
        TLRPC.ChatInvite chatInvite2;
        float f7;
        String format;
        int i11 = 1;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        this.c = n2Var;
        if (tLObject instanceof TLRPC.ChatInvite) {
            TLRPC.ChatInvite chatInvite3 = (TLRPC.ChatInvite) tLObject;
            this.d = chatInvite3;
            TLRPC.Chat chat = chatInvite3.chat;
            j3 = chat != null ? -chat.id : 0L;
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                str2 = str;
                j3 = 0;
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
                imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.i6), 1, -1));
                imageView.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.Ji));
                imageView.setImageResource(R.drawable.ic_layer_close);
                imageView.setOnClickListener(new x70(this, i11));
                int dp = AndroidUtilities.dp(8.0f);
                imageView.setPadding(dp, dp, dp, dp);
                frameLayout.addView(imageView, w7.x5.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                x9 x9Var = new x9(context);
                x9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
                linearLayout.addView(x9Var, w7.x5.t(90, 90, 49, 0, 27, 0, 0));
                chatInvite = this.d;
                if (chatInvite == null) {
                    if (chatInvite.chat != null) {
                        i9 i9Var = new i9(this.d.chat);
                        TLRPC.ChatInvite chatInvite4 = this.d;
                        TLRPC.Chat chat2 = chatInvite4.chat;
                        r12 = chat2.title;
                        i10 = chat2.participants_count;
                        x9Var.a.setForUserOrChat(chat2, i9Var, chatInvite4);
                        x9Var.d();
                    } else {
                        i9 i9Var2 = new i9((org.telegram.ui.ActionBar.f6) null);
                        i9Var2.n(0L, this.d.title, null);
                        TLRPC.ChatInvite chatInvite5 = this.d;
                        String str4 = chatInvite5.title;
                        i10 = chatInvite5.participants_count;
                        x9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(chatInvite5.photo.sizes, 50), this.d.photo), "50_50", i9Var2, this.d);
                        r12 = str4;
                    }
                    TLRPC.ChatInvite chatInvite6 = this.d;
                    str3 = chatInvite6.about;
                    z11 = chatInvite6.verified;
                    z12 = chatInvite6.fake;
                    z10 = chatInvite6.scam;
                } else if (this.e != null) {
                    i9 i9Var3 = new i9(this.e);
                    String str5 = this.e.title;
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.e.id);
                    r12 = chatFull != null ? chatFull.about : null;
                    i10 = Math.max(this.e.participants_count, chatFull != null ? chatFull.participants_count : 0);
                    TLRPC.Chat chat3 = this.e;
                    x9Var.a.setForUserOrChat(chat3, i9Var3, chat3);
                    x9Var.d();
                    TLRPC.Chat chat4 = this.e;
                    boolean z14 = chat4.verified;
                    z12 = chat4.fake;
                    z10 = chat4.scam;
                    z11 = z14;
                    str3 = r12;
                    r12 = str5;
                } else {
                    str3 = null;
                    z10 = false;
                    z11 = false;
                    z12 = false;
                    i10 = 0;
                }
                j5Var = new org.telegram.ui.ActionBar.j5(context);
                j5Var.setTypeface(AndroidUtilities.bold());
                j5Var.setTextSize(20);
                int i12 = org.telegram.ui.ActionBar.j6.j5;
                j5Var.setTextColor(getThemedColor(i12));
                j5Var.l(r12, false);
                j5Var.setGravity(17);
                linearLayout.addView(j5Var, w7.x5.t(-2, -2, 49, 10, 10, 10, i10 <= 0 ? 0 : 20));
                if (!z10 || z12) {
                    j5Var.i(!z10 ? org.telegram.ui.ActionBar.j6.g1 : org.telegram.ui.ActionBar.j6.h1);
                } else if (z11) {
                    j5Var.i(new oq(org.telegram.ui.ActionBar.j6.f1, org.telegram.ui.ActionBar.j6.i1));
                }
                TLRPC.ChatInvite chatInvite7 = this.d;
                z13 = (chatInvite7 == null && ((chatInvite7.channel && !chatInvite7.megagroup) || ChatObject.isChannelAndNotMegaGroup(chatInvite7.chat))) || (ChatObject.isChannel(this.e) && !this.e.megagroup);
                isEmpty = TextUtils.isEmpty(str3);
                TextView g10 = org.telegram.messenger.w1.g(context, 1, 13.0f);
                int i13 = org.telegram.ui.ActionBar.j6.r5;
                g10.setTextColor(getThemedColor(i13));
                g10.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                g10.setEllipsize(truncateAt);
                g10.setText(!z13 ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase());
                linearLayout.addView(g10, w7.x5.t(-2, -2, 49, 10, 0, 10, isEmpty ? 0 : 20));
                if (!isEmpty) {
                    TextView textView = new TextView(context);
                    textView.setGravity(17);
                    textView.setText(str3);
                    textView.setTextColor(getThemedColor(i12));
                    textView.setTextSize(1, 15.0f);
                    linearLayout.addView(textView, w7.x5.t(-1, -2, 48, 24, 10, 24, 20));
                }
                chatInvite2 = this.d;
                if (chatInvite2 != null || chatInvite2.request_needed) {
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    linearLayout.addView(frameLayout2, w7.x5.n(-1, -2));
                    RadialProgressView radialProgressView = new RadialProgressView(getContext(), f6Var);
                    this.h = radialProgressView;
                    int i14 = org.telegram.ui.ActionBar.j6.Oh;
                    radialProgressView.setProgressColor(getThemedColor(i14));
                    radialProgressView.setSize(AndroidUtilities.dp(32.0f));
                    radialProgressView.setVisibility(4);
                    frameLayout2.addView(radialProgressView, w7.x5.e(48, 48, 17));
                    TextView textView2 = new TextView(getContext());
                    this.f = textView2;
                    int dp2 = AndroidUtilities.dp(24.0f);
                    int themedColor = getThemedColor(i14);
                    int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.Qh);
                    textView2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, themedColor, themedColor2, themedColor2));
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity(17);
                    textView2.setSingleLine(true);
                    textView2.setText(LocaleController.getString(!z13 ? R.string.RequestToJoinChannel : R.string.RequestToJoinGroup));
                    textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.c80
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            g80.r(g80.this, z13, j3);
                        }
                    });
                    frameLayout2.addView(textView2, w7.x5.t(-1, 48, 8388611, 14, 0, 14, 0));
                    TextView textView3 = new TextView(getContext());
                    textView3.setGravity(17);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setText(LocaleController.getString(!z13 ? R.string.RequestToJoinChannelDescription : R.string.RequestToJoinGroupDescription));
                    textView3.setTextColor(getThemedColor(i13));
                    linearLayout.addView(textView3, w7.x5.t(-1, -2, 48, 24, 17, 24, 15));
                }
                if (chatInvite2.participants.isEmpty()) {
                    f7 = 24.0f;
                } else {
                    int min = Math.min(this.d.participants.size(), 3);
                    l9 l9Var = new l9(context, false);
                    l9Var.setAvatarsTextSize(AndroidUtilities.dp(20.0f));
                    float f10 = 38;
                    l9Var.setSize(AndroidUtilities.dp(f10));
                    l9Var.setCount(min);
                    l9Var.setStepFactor(0.65f);
                    for (int i15 = 0; i15 < min; i15++) {
                        l9Var.b(i15, this.d.participants.get(i15), UserConfig.selectedAccount);
                    }
                    f7 = 24.0f;
                    l9Var.a(false);
                    linearLayout.addView(l9Var, w7.x5.t((int) ((((0.65f * f10) + 1.0f) * (min - 1)) + f10), 44, 17, 0, 2, 0, 4));
                    TextView textView4 = new TextView(context);
                    textView4.setTextSize(1, 13.0f);
                    textView4.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.r5));
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
                    linearLayout.addView(textView4, w7.x5.t(-2, -2, 49, 10, 0, 10, 24));
                }
                TLRPC.ChatInvite chatInvite8 = this.d;
                boolean z15 = (chatInvite8.channel && !chatInvite8.megagroup) || (ChatObject.isChannel(chatInvite8.chat) && !this.d.chat.megagroup);
                TextView textView5 = new TextView(getContext());
                int dp3 = AndroidUtilities.dp(f7);
                int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.j6.Oh);
                int themedColor4 = getThemedColor(org.telegram.ui.ActionBar.j6.Qh);
                textView5.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, themedColor3, themedColor4, themedColor4));
                w7.z5.b(textView5, 0.02f, 1.2f);
                textView5.setEllipsize(TextUtils.TruncateAt.END);
                textView5.setGravity(17);
                textView5.setSingleLine(true);
                textView5.setText(LocaleController.getString(z15 ? R.string.ProfileJoinChannel : R.string.ProfileJoinGroup));
                textView5.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
                textView5.setTextSize(1, 14.0f);
                textView5.setTypeface(AndroidUtilities.bold());
                linearLayout.addView(textView5, w7.x5.t(-1, 48, 8388611, 14, 0, 14, 14));
                textView5.setOnClickListener(new bi.o2(this, j3, 1));
                return;
            }
            TLRPC.Chat chat5 = (TLRPC.Chat) tLObject;
            this.e = chat5;
            j3 = chat5.id;
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
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.i6), 1, -1));
        imageView2.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.Ji));
        imageView2.setImageResource(R.drawable.ic_layer_close);
        imageView2.setOnClickListener(new x70(this, i11));
        int dp4 = AndroidUtilities.dp(8.0f);
        imageView2.setPadding(dp4, dp4, dp4, dp4);
        frameLayout3.addView(imageView2, w7.x5.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        x9 x9Var2 = new x9(context);
        x9Var2.setRoundRadius(AndroidUtilities.dp(45.0f));
        linearLayout.addView(x9Var2, w7.x5.t(90, 90, 49, 0, 27, 0, 0));
        chatInvite = this.d;
        if (chatInvite == null) {
        }
        j5Var = new org.telegram.ui.ActionBar.j5(context);
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setTextSize(20);
        int i122 = org.telegram.ui.ActionBar.j6.j5;
        j5Var.setTextColor(getThemedColor(i122));
        j5Var.l(r12, false);
        j5Var.setGravity(17);
        linearLayout.addView(j5Var, w7.x5.t(-2, -2, 49, 10, 10, 10, i10 <= 0 ? 0 : 20));
        if (z10) {
        }
        j5Var.i(!z10 ? org.telegram.ui.ActionBar.j6.g1 : org.telegram.ui.ActionBar.j6.h1);
        TLRPC.ChatInvite chatInvite72 = this.d;
        if (chatInvite72 == null) {
        }
        isEmpty = TextUtils.isEmpty(str3);
        TextView g102 = org.telegram.messenger.w1.g(context, 1, 13.0f);
        int i132 = org.telegram.ui.ActionBar.j6.r5;
        g102.setTextColor(getThemedColor(i132));
        g102.setSingleLine(true);
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        g102.setEllipsize(truncateAt2);
        g102.setText(!z13 ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase());
        linearLayout.addView(g102, w7.x5.t(-2, -2, 49, 10, 0, 10, isEmpty ? 0 : 20));
        if (!isEmpty) {
        }
        chatInvite2 = this.d;
        if (chatInvite2 != null) {
        }
        FrameLayout frameLayout22 = new FrameLayout(getContext());
        linearLayout.addView(frameLayout22, w7.x5.n(-1, -2));
        RadialProgressView radialProgressView2 = new RadialProgressView(getContext(), f6Var);
        this.h = radialProgressView2;
        int i142 = org.telegram.ui.ActionBar.j6.Oh;
        radialProgressView2.setProgressColor(getThemedColor(i142));
        radialProgressView2.setSize(AndroidUtilities.dp(32.0f));
        radialProgressView2.setVisibility(4);
        frameLayout22.addView(radialProgressView2, w7.x5.e(48, 48, 17));
        TextView textView22 = new TextView(getContext());
        this.f = textView22;
        int dp22 = AndroidUtilities.dp(24.0f);
        int themedColor5 = getThemedColor(i142);
        int themedColor22 = getThemedColor(org.telegram.ui.ActionBar.j6.Qh);
        textView22.setBackground(org.telegram.ui.ActionBar.j6.i0(dp22, dp22, dp22, dp22, themedColor5, themedColor22, themedColor22));
        textView22.setEllipsize(truncateAt2);
        textView22.setGravity(17);
        textView22.setSingleLine(true);
        textView22.setText(LocaleController.getString(!z13 ? R.string.RequestToJoinChannel : R.string.RequestToJoinGroup));
        textView22.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        textView22.setTextSize(1, 14.0f);
        textView22.setTypeface(AndroidUtilities.bold());
        textView22.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.c80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g80.r(g80.this, z13, j3);
            }
        });
        frameLayout22.addView(textView22, w7.x5.t(-1, 48, 8388611, 14, 0, 14, 0));
        TextView textView32 = new TextView(getContext());
        textView32.setGravity(17);
        textView32.setTextSize(1, 14.0f);
        textView32.setText(LocaleController.getString(!z13 ? R.string.RequestToJoinChannelDescription : R.string.RequestToJoinGroupDescription));
        textView32.setTextColor(getThemedColor(i132));
        linearLayout.addView(textView32, w7.x5.t(-1, -2, 48, 24, 17, 24, 15));
    }

    public static /* synthetic */ void m(g80 g80Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        g80 g80Var2;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(g80Var.currentAccount).processUpdates(updates2, false);
            updates = updates2;
        } else {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                a80 a80Var = new a80(g80Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j3, 1);
                g80Var2 = g80Var;
                AndroidUtilities.runOnUIThread(a80Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) g80Var2, (Object) tL_error, (Object) updates, (Object) tL_messages_importChatInvite, 25));
            }
        }
        g80Var2 = g80Var;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) g80Var2, (Object) tL_error, (Object) updates, (Object) tL_messages_importChatInvite, 25));
    }

    public static void n(g80 g80Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.n2 n2Var = g80Var.c;
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        if (tL_error != null) {
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            e5.f0(g80Var.currentAccount, tL_error, n2Var, tL_messages_importChatInvite, new Object[0]);
            return;
        }
        if (updates == null || updates.chats.isEmpty()) {
            return;
        }
        TLRPC.Chat chat = updates.chats.get(0);
        chat.left = false;
        chat.kicked = false;
        MessagesController.getInstance(g80Var.currentAccount).putUsers(updates.users, false);
        MessagesController.getInstance(g80Var.currentAccount).putChats(updates.chats, false);
        long j3 = chat.id;
        boolean z10 = !ChatObject.isChannelAndNotMegaGroup(chat);
        g80Var.getClass();
        Bundle e7 = w.f.e(j3, "chat_id");
        MessagesController messagesController = MessagesController.getInstance(g80Var.currentAccount);
        org.telegram.ui.ActionBar.n2 n2Var2 = g80Var.c;
        if (messagesController.checkCanOpenChat(e7, n2Var2)) {
            n2Var2.presentFragment(new f80(g80Var, e7, z10, j3), n2Var2 instanceof org.telegram.ui.co);
        }
    }

    public static /* synthetic */ void o(g80 g80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3) {
        MessagesController.getInstance(g80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(g80Var.currentAccount).openGuardBotWebApp(j3, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static /* synthetic */ void p(g80 g80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3) {
        MessagesController.getInstance(g80Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(g80Var.currentAccount).openGuardBotWebApp(j3, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static /* synthetic */ void q(g80 g80Var, long j3) {
        g80Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = g80Var.b;
        ConnectionsManager.getInstance(g80Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new d80(g80Var, j3, tL_messages_importChatInvite), 2);
    }

    public static /* synthetic */ void r(final g80 g80Var, boolean z10, long j3) {
        TLRPC.Chat chat = g80Var.e;
        final int i10 = 0;
        AndroidUtilities.runOnUIThread(new Runnable(g80Var) { // from class: org.telegram.ui.Components.e80
            public final /* synthetic */ g80 b;

            {
                this.b = g80Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        g80 g80Var2 = this.b;
                        if (!g80Var2.isDismissed()) {
                            g80Var2.f.setVisibility(4);
                            g80Var2.h.setVisibility(0);
                            break;
                        }
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        }, 400L);
        if (g80Var.d != null || chat == null) {
            TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
            tL_messages_importChatInvite.hash = g80Var.b;
            ConnectionsManager.getInstance(g80Var.currentAccount).sendRequest(tL_messages_importChatInvite, new org.telegram.messenger.v9(g80Var, j3, z10, tL_messages_importChatInvite), 2);
        } else {
            final int i11 = 1;
            MessagesController.getInstance(g80Var.currentAccount).addUserToChat(chat.id, UserConfig.getInstance(g80Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(g80Var) { // from class: org.telegram.ui.Components.e80
                public final /* synthetic */ g80 b;

                {
                    this.b = g80Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            g80 g80Var2 = this.b;
                            if (!g80Var2.isDismissed()) {
                                g80Var2.f.setVisibility(4);
                                g80Var2.h.setVisibility(0);
                                break;
                            }
                            break;
                        default:
                            this.b.dismiss();
                            break;
                    }
                }
            }, new bi.h(8, g80Var, z10));
        }
    }

    public static /* synthetic */ void s(g80 g80Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        g80 g80Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(g80Var.currentAccount).processUpdates(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            a80 a80Var = new a80(g80Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j3, 0);
            g80Var2 = g80Var;
            AndroidUtilities.runOnUIThread(a80Var);
            AndroidUtilities.runOnUIThread(new bi.e4(g80Var2, tL_error, z10, tL_messages_importChatInvite, 18));
        }
        g80Var2 = g80Var;
        AndroidUtilities.runOnUIThread(new bi.e4(g80Var2, tL_error, z10, tL_messages_importChatInvite, 18));
    }

    public static /* synthetic */ void t(g80 g80Var, TLRPC.TL_error tL_error, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.n2 n2Var = g80Var.c;
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        if (tL_error != null) {
            if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                g80Var.setOnDismissListener(new b80(1, g80Var, z10));
            } else {
                e5.f0(g80Var.currentAccount, tL_error, n2Var, tL_messages_importChatInvite, new Object[0]);
            }
        }
        g80Var.dismiss();
    }

    public static CharSequence v(TextView textView, TLRPC.ChatInvite chatInvite, int i10) {
        String str = chatInvite.participants.get(i10).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
    }

    public static void w(Context context, org.telegram.ui.ActionBar.n2 n2Var, yc ycVar, boolean z10) {
        if (context == null) {
            if (n2Var != null) {
                n2Var.getContext();
                return;
            }
            return;
        }
        if (ycVar == null) {
            ycVar = yc.a0(n2Var);
        }
        nc ncVar = new nc(context, n2Var.getResourceProvider());
        ncVar.a.f(R.raw.timer_3, 28, 28, null);
        ncVar.b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        ncVar.c.setText(z10 ? LocaleController.getString(R.string.RequestToJoinChannelSentDescription) : LocaleController.getString(R.string.RequestToJoinGroupSentDescription));
        ycVar.b(ncVar, 2750).j();
    }
}
