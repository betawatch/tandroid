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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p70 extends org.telegram.ui.ActionBar.f3 {
    public static final /* synthetic */ int r = 0;
    public final String b;
    public final org.telegram.ui.ActionBar.o2 c;
    public final TLRPC.ChatInvite d;
    public final TLRPC.Chat e;
    public final TextView f;
    public final RadialProgressView h;
    public oc n;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p70(Context context, TLObject tLObject, String str, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, false, false);
        String str2;
        final long j10;
        LinearLayout linearLayout;
        TLRPC.ChatInvite chatInvite;
        String str3;
        boolean z10;
        boolean z11;
        boolean z12;
        int i9;
        org.telegram.ui.ActionBar.h5 h5Var;
        final boolean z13;
        boolean isEmpty;
        TLRPC.ChatInvite chatInvite2;
        float f10;
        boolean z14;
        String format;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
        this.c = o2Var;
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
                imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(org.telegram.ui.ActionBar.f6.i6), 1, -1));
                imageView.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.Ji));
                imageView.setImageResource(R.drawable.ic_layer_close);
                imageView.setOnClickListener(new h70(this, 1));
                int dp = AndroidUtilities.dp(8.0f);
                imageView.setPadding(dp, dp, dp, dp);
                frameLayout.addView(imageView, g7.e6.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                o9 o9Var = new o9(context);
                o9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
                linearLayout.addView(o9Var, g7.e6.t(90, 90, 49, 0, 27, 0, 0));
                chatInvite = this.d;
                if (chatInvite == null) {
                    if (chatInvite.chat != null) {
                        z8 z8Var = new z8(this.d.chat);
                        TLRPC.ChatInvite chatInvite4 = this.d;
                        TLRPC.Chat chat2 = chatInvite4.chat;
                        r12 = chat2.title;
                        i9 = chat2.participants_count;
                        o9Var.a.setForUserOrChat(chat2, z8Var, chatInvite4);
                        o9Var.d();
                    } else {
                        z8 z8Var2 = new z8((org.telegram.ui.ActionBar.b6) null);
                        z8Var2.n(0L, this.d.title, null);
                        TLRPC.ChatInvite chatInvite5 = this.d;
                        String str4 = chatInvite5.title;
                        i9 = chatInvite5.participants_count;
                        o9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(chatInvite5.photo.sizes, 50), this.d.photo), "50_50", z8Var2, this.d);
                        r12 = str4;
                    }
                    TLRPC.ChatInvite chatInvite6 = this.d;
                    str3 = chatInvite6.about;
                    z11 = chatInvite6.verified;
                    z12 = chatInvite6.fake;
                    z10 = chatInvite6.scam;
                } else if (this.e != null) {
                    z8 z8Var3 = new z8(this.e);
                    String str5 = this.e.title;
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.e.id);
                    r12 = chatFull != null ? chatFull.about : null;
                    i9 = Math.max(this.e.participants_count, chatFull != null ? chatFull.participants_count : 0);
                    TLRPC.Chat chat3 = this.e;
                    o9Var.a.setForUserOrChat(chat3, z8Var3, chat3);
                    o9Var.d();
                    TLRPC.Chat chat4 = this.e;
                    z11 = chat4.verified;
                    z12 = chat4.fake;
                    z10 = chat4.scam;
                    String str6 = r12;
                    r12 = str5;
                    str3 = str6;
                } else {
                    str3 = null;
                    z10 = false;
                    z11 = false;
                    z12 = false;
                    i9 = 0;
                }
                h5Var = new org.telegram.ui.ActionBar.h5(context);
                h5Var.setTypeface(AndroidUtilities.bold());
                h5Var.setTextSize(20);
                int i10 = org.telegram.ui.ActionBar.f6.j5;
                h5Var.setTextColor(getThemedColor(i10));
                h5Var.l(r12, false);
                h5Var.setGravity(17);
                linearLayout.addView(h5Var, g7.e6.t(-2, -2, 49, 10, 10, 10, i9 <= 0 ? 0 : 20));
                if (!z10 || z12) {
                    h5Var.i(!z10 ? org.telegram.ui.ActionBar.f6.g1 : org.telegram.ui.ActionBar.f6.h1);
                } else if (z11) {
                    h5Var.i(new fq(org.telegram.ui.ActionBar.f6.f1, org.telegram.ui.ActionBar.f6.i1));
                }
                TLRPC.ChatInvite chatInvite7 = this.d;
                z13 = (chatInvite7 == null && ((chatInvite7.channel && !chatInvite7.megagroup) || ChatObject.isChannelAndNotMegaGroup(chatInvite7.chat))) || (ChatObject.isChannel(this.e) && !this.e.megagroup);
                isEmpty = TextUtils.isEmpty(str3);
                TextView g10 = org.telegram.messenger.l0.g(context, 1, 13.0f);
                int i11 = org.telegram.ui.ActionBar.f6.r5;
                g10.setTextColor(getThemedColor(i11));
                g10.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                g10.setEllipsize(truncateAt);
                g10.setText(!z13 ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase());
                linearLayout.addView(g10, g7.e6.t(-2, -2, 49, 10, 0, 10, isEmpty ? 0 : 20));
                if (!isEmpty) {
                    TextView textView = new TextView(context);
                    textView.setGravity(17);
                    textView.setText(str3);
                    textView.setTextColor(getThemedColor(i10));
                    textView.setTextSize(1, 15.0f);
                    linearLayout.addView(textView, g7.e6.t(-1, -2, 48, 24, 10, 24, 20));
                }
                chatInvite2 = this.d;
                if (chatInvite2 != null || chatInvite2.request_needed) {
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    linearLayout.addView(frameLayout2, g7.e6.n(-1, -2));
                    RadialProgressView radialProgressView = new RadialProgressView(getContext(), b6Var);
                    this.h = radialProgressView;
                    int i12 = org.telegram.ui.ActionBar.f6.Oh;
                    radialProgressView.setProgressColor(getThemedColor(i12));
                    radialProgressView.setSize(AndroidUtilities.dp(32.0f));
                    radialProgressView.setVisibility(4);
                    frameLayout2.addView(radialProgressView, g7.e6.e(48, 48, 17));
                    TextView textView2 = new TextView(getContext());
                    this.f = textView2;
                    int dp2 = AndroidUtilities.dp(24.0f);
                    int themedColor = getThemedColor(i12);
                    int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.f6.Qh);
                    textView2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp2, dp2, dp2, dp2, themedColor, themedColor2, themedColor2));
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity(17);
                    textView2.setSingleLine(true);
                    textView2.setText(LocaleController.getString(!z13 ? R.string.RequestToJoinChannel : R.string.RequestToJoinGroup));
                    textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Sh));
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.m70
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            p70.r(p70.this, z13, j10);
                        }
                    });
                    frameLayout2.addView(textView2, g7.e6.t(-1, 48, 8388611, 14, 0, 14, 0));
                    TextView textView3 = new TextView(getContext());
                    textView3.setGravity(17);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setText(LocaleController.getString(!z13 ? R.string.RequestToJoinChannelDescription : R.string.RequestToJoinGroupDescription));
                    textView3.setTextColor(getThemedColor(i11));
                    linearLayout.addView(textView3, g7.e6.t(-1, -2, 48, 24, 17, 24, 15));
                }
                int i13 = 3;
                if (chatInvite2.participants.isEmpty()) {
                    f10 = 24.0f;
                    z14 = false;
                } else {
                    int min = Math.min(this.d.participants.size(), 3);
                    c9 c9Var = new c9(context, false);
                    c9Var.setAvatarsTextSize(AndroidUtilities.dp(20.0f));
                    float f11 = 38;
                    c9Var.setSize(AndroidUtilities.dp(f11));
                    c9Var.setCount(min);
                    c9Var.setStepFactor(0.65f);
                    for (int i14 = 0; i14 < min; i14++) {
                        c9Var.b(i14, this.d.participants.get(i14), UserConfig.selectedAccount);
                    }
                    f10 = 24.0f;
                    c9Var.a(false);
                    linearLayout.addView(c9Var, g7.e6.t((int) ((((0.65f * f11) + 1.0f) * (min - 1)) + f11), 44, 17, 0, 2, 0, 4));
                    TextView textView4 = new TextView(context);
                    textView4.setTextSize(1, 13.0f);
                    textView4.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.r5));
                    textView4.setGravity(17);
                    if (min == 1) {
                        z14 = false;
                        format = v(textView4, this.d, 0).toString();
                    } else {
                        z14 = false;
                        if (min == 2) {
                            format = LocaleController.formatString("RequestToJoinMembersTwo", R.string.RequestToJoinMembersTwo, v(textView4, this.d, 0), v(textView4, this.d, 1));
                        } else if (i9 == 3) {
                            format = LocaleController.formatString("RequestToJoinMembersThree", R.string.RequestToJoinMembersThree, v(textView4, this.d, 0), v(textView4, this.d, 1), v(textView4, this.d, 2));
                        } else {
                            int max = Math.max(i9 - min, 2);
                            format = String.format(LocaleController.getPluralString("RequestToJoinMembersAll", max), v(textView4, this.d, 0), v(textView4, this.d, 1), Integer.valueOf(max));
                        }
                    }
                    textView4.setText(format);
                    linearLayout.addView(textView4, g7.e6.t(-2, -2, 49, 10, 0, 10, 24));
                }
                TLRPC.ChatInvite chatInvite8 = this.d;
                if ((chatInvite8.channel && !chatInvite8.megagroup) || (ChatObject.isChannel(chatInvite8.chat) && !this.d.chat.megagroup)) {
                    z14 = true;
                }
                TextView textView5 = new TextView(getContext());
                int dp3 = AndroidUtilities.dp(f10);
                int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.f6.Oh);
                int themedColor4 = getThemedColor(org.telegram.ui.ActionBar.f6.Qh);
                textView5.setBackground(org.telegram.ui.ActionBar.f6.i0(dp3, dp3, dp3, dp3, themedColor3, themedColor4, themedColor4));
                g7.g6.b(textView5, 0.02f, 1.2f);
                textView5.setEllipsize(TextUtils.TruncateAt.END);
                textView5.setGravity(17);
                textView5.setSingleLine(true);
                textView5.setText(LocaleController.getString(z14 ? R.string.ProfileJoinChannel : R.string.ProfileJoinGroup));
                textView5.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Sh));
                textView5.setTextSize(1, 14.0f);
                textView5.setTypeface(AndroidUtilities.bold());
                linearLayout.addView(textView5, g7.e6.t(-1, 48, 8388611, 14, 0, 14, 14));
                textView5.setOnClickListener(new fh.p(this, j10, i13));
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
        imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(org.telegram.ui.ActionBar.f6.i6), 1, -1));
        imageView2.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.Ji));
        imageView2.setImageResource(R.drawable.ic_layer_close);
        imageView2.setOnClickListener(new h70(this, 1));
        int dp4 = AndroidUtilities.dp(8.0f);
        imageView2.setPadding(dp4, dp4, dp4, dp4);
        frameLayout3.addView(imageView2, g7.e6.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        o9 o9Var2 = new o9(context);
        o9Var2.setRoundRadius(AndroidUtilities.dp(45.0f));
        linearLayout.addView(o9Var2, g7.e6.t(90, 90, 49, 0, 27, 0, 0));
        chatInvite = this.d;
        if (chatInvite == null) {
        }
        h5Var = new org.telegram.ui.ActionBar.h5(context);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(20);
        int i102 = org.telegram.ui.ActionBar.f6.j5;
        h5Var.setTextColor(getThemedColor(i102));
        h5Var.l(r12, false);
        h5Var.setGravity(17);
        linearLayout.addView(h5Var, g7.e6.t(-2, -2, 49, 10, 10, 10, i9 <= 0 ? 0 : 20));
        if (z10) {
        }
        h5Var.i(!z10 ? org.telegram.ui.ActionBar.f6.g1 : org.telegram.ui.ActionBar.f6.h1);
        TLRPC.ChatInvite chatInvite72 = this.d;
        if (chatInvite72 == null) {
        }
        isEmpty = TextUtils.isEmpty(str3);
        TextView g102 = org.telegram.messenger.l0.g(context, 1, 13.0f);
        int i112 = org.telegram.ui.ActionBar.f6.r5;
        g102.setTextColor(getThemedColor(i112));
        g102.setSingleLine(true);
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        g102.setEllipsize(truncateAt2);
        g102.setText(!z13 ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase());
        linearLayout.addView(g102, g7.e6.t(-2, -2, 49, 10, 0, 10, isEmpty ? 0 : 20));
        if (!isEmpty) {
        }
        chatInvite2 = this.d;
        if (chatInvite2 != null) {
        }
        FrameLayout frameLayout22 = new FrameLayout(getContext());
        linearLayout.addView(frameLayout22, g7.e6.n(-1, -2));
        RadialProgressView radialProgressView2 = new RadialProgressView(getContext(), b6Var);
        this.h = radialProgressView2;
        int i122 = org.telegram.ui.ActionBar.f6.Oh;
        radialProgressView2.setProgressColor(getThemedColor(i122));
        radialProgressView2.setSize(AndroidUtilities.dp(32.0f));
        radialProgressView2.setVisibility(4);
        frameLayout22.addView(radialProgressView2, g7.e6.e(48, 48, 17));
        TextView textView22 = new TextView(getContext());
        this.f = textView22;
        int dp22 = AndroidUtilities.dp(24.0f);
        int themedColor5 = getThemedColor(i122);
        int themedColor22 = getThemedColor(org.telegram.ui.ActionBar.f6.Qh);
        textView22.setBackground(org.telegram.ui.ActionBar.f6.i0(dp22, dp22, dp22, dp22, themedColor5, themedColor22, themedColor22));
        textView22.setEllipsize(truncateAt2);
        textView22.setGravity(17);
        textView22.setSingleLine(true);
        textView22.setText(LocaleController.getString(!z13 ? R.string.RequestToJoinChannel : R.string.RequestToJoinGroup));
        textView22.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Sh));
        textView22.setTextSize(1, 14.0f);
        textView22.setTypeface(AndroidUtilities.bold());
        textView22.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.m70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p70.r(p70.this, z13, j10);
            }
        });
        frameLayout22.addView(textView22, g7.e6.t(-1, 48, 8388611, 14, 0, 14, 0));
        TextView textView32 = new TextView(getContext());
        textView32.setGravity(17);
        textView32.setTextSize(1, 14.0f);
        textView32.setText(LocaleController.getString(!z13 ? R.string.RequestToJoinChannelDescription : R.string.RequestToJoinGroupDescription));
        textView32.setTextColor(getThemedColor(i112));
        linearLayout.addView(textView32, g7.e6.t(-1, -2, 48, 24, 17, 24, 15));
    }

    public static /* synthetic */ void m(p70 p70Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        p70 p70Var2;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(p70Var.currentAccount).processUpdates(updates2, false);
            updates = updates2;
        } else {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                k70 k70Var = new k70(p70Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j10, 1);
                p70Var2 = p70Var;
                AndroidUtilities.runOnUIThread(k70Var);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.k6(p70Var2, tL_error, updates, tL_messages_importChatInvite, 24));
            }
        }
        p70Var2 = p70Var;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.k6(p70Var2, tL_error, updates, tL_messages_importChatInvite, 24));
    }

    public static void n(p70 p70Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.o2 o2Var = p70Var.c;
        if (o2Var == null || o2Var.getParentActivity() == null) {
            return;
        }
        if (tL_error != null) {
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            y4.f0(p70Var.currentAccount, tL_error, o2Var, tL_messages_importChatInvite, new Object[0]);
            return;
        }
        if (updates == null || updates.chats.isEmpty()) {
            return;
        }
        TLRPC.Chat chat = updates.chats.get(0);
        chat.left = false;
        chat.kicked = false;
        MessagesController.getInstance(p70Var.currentAccount).putUsers(updates.users, false);
        MessagesController.getInstance(p70Var.currentAccount).putChats(updates.chats, false);
        long j10 = chat.id;
        boolean z10 = !ChatObject.isChannelAndNotMegaGroup(chat);
        p70Var.getClass();
        Bundle g10 = e2.c.g(j10, "chat_id");
        MessagesController messagesController = MessagesController.getInstance(p70Var.currentAccount);
        org.telegram.ui.ActionBar.o2 o2Var2 = p70Var.c;
        if (messagesController.checkCanOpenChat(g10, o2Var2)) {
            o2Var2.presentFragment(new o70(p70Var, g10, z10, j10), o2Var2 instanceof org.telegram.ui.qn);
        }
    }

    public static /* synthetic */ void o(p70 p70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(p70Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(p70Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static /* synthetic */ void p(p70 p70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(p70Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(p70Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static /* synthetic */ void q(p70 p70Var, long j10) {
        p70Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = p70Var.b;
        ConnectionsManager.getInstance(p70Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new fh.w5(p70Var, j10, tL_messages_importChatInvite), 2);
    }

    public static /* synthetic */ void r(final p70 p70Var, boolean z10, long j10) {
        TLRPC.Chat chat = p70Var.e;
        final int i9 = 0;
        AndroidUtilities.runOnUIThread(new Runnable(p70Var) { // from class: org.telegram.ui.Components.n70
            public final /* synthetic */ p70 b;

            {
                this.b = p70Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i9) {
                    case 0:
                        p70 p70Var2 = this.b;
                        if (!p70Var2.isDismissed()) {
                            p70Var2.f.setVisibility(4);
                            p70Var2.h.setVisibility(0);
                            break;
                        }
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        }, 400L);
        if (p70Var.d != null || chat == null) {
            TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
            tL_messages_importChatInvite.hash = p70Var.b;
            ConnectionsManager.getInstance(p70Var.currentAccount).sendRequest(tL_messages_importChatInvite, new gh.h(p70Var, j10, z10, tL_messages_importChatInvite), 2);
        } else {
            final int i10 = 1;
            MessagesController.getInstance(p70Var.currentAccount).addUserToChat(chat.id, UserConfig.getInstance(p70Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(p70Var) { // from class: org.telegram.ui.Components.n70
                public final /* synthetic */ p70 b;

                {
                    this.b = p70Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            p70 p70Var2 = this.b;
                            if (!p70Var2.isDismissed()) {
                                p70Var2.f.setVisibility(4);
                                p70Var2.h.setVisibility(0);
                                break;
                            }
                            break;
                        default:
                            this.b.dismiss();
                            break;
                    }
                }
            }, new dh.s(6, p70Var, z10));
        }
    }

    public static /* synthetic */ void s(p70 p70Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        p70 p70Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(p70Var.currentAccount).processUpdates(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            k70 k70Var = new k70(p70Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j10, 0);
            p70Var2 = p70Var;
            AndroidUtilities.runOnUIThread(k70Var);
            AndroidUtilities.runOnUIThread(new bg.d(p70Var2, tL_error, z10, tL_messages_importChatInvite, 16));
        }
        p70Var2 = p70Var;
        AndroidUtilities.runOnUIThread(new bg.d(p70Var2, tL_error, z10, tL_messages_importChatInvite, 16));
    }

    public static /* synthetic */ void t(p70 p70Var, TLRPC.TL_error tL_error, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.o2 o2Var = p70Var.c;
        if (o2Var == null || o2Var.getParentActivity() == null) {
            return;
        }
        if (tL_error != null) {
            if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                p70Var.setOnDismissListener(new l70(1, p70Var, z10));
            } else {
                y4.f0(p70Var.currentAccount, tL_error, o2Var, tL_messages_importChatInvite, new Object[0]);
            }
        }
        p70Var.dismiss();
    }

    public static CharSequence v(TextView textView, TLRPC.ChatInvite chatInvite, int i9) {
        String str = chatInvite.participants.get(i9).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
    }

    public static void w(Context context, org.telegram.ui.ActionBar.o2 o2Var, oc ocVar, boolean z10) {
        if (context == null) {
            if (o2Var != null) {
                o2Var.getContext();
                return;
            }
            return;
        }
        if (ocVar == null) {
            ocVar = oc.a0(o2Var);
        }
        dc dcVar = new dc(context, o2Var.getResourceProvider());
        dcVar.a.f(R.raw.timer_3, 28, 28, null);
        dcVar.b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        dcVar.c.setText(z10 ? LocaleController.getString(R.string.RequestToJoinChannelSentDescription) : LocaleController.getString(R.string.RequestToJoinGroupSentDescription));
        ocVar.b(dcVar, 2750).j();
    }
}
