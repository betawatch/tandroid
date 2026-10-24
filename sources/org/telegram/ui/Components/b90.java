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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class b90 extends org.telegram.ui.ActionBar.h3 {
    public static final /* synthetic */ int s = 0;
    public int b;
    public final String c;
    public final org.telegram.ui.ActionBar.o2 d;
    public final TLRPC.ChatInvite e;
    public final TLRPC.Chat f;
    public final TextView h;
    public final RadialProgressView n;
    public xc r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b90(Context context, TLObject tLObject, String str, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        String str2;
        final long j10;
        LinearLayout linearLayout;
        TLRPC.ChatInvite chatInvite;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        String str3;
        org.telegram.ui.ActionBar.n5 n5Var;
        final boolean z13;
        boolean isEmpty;
        TLRPC.ChatInvite chatInvite2;
        float f7;
        boolean z14;
        String format;
        int i11 = 0;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBarKey(org.telegram.ui.ActionBar.k6.d6);
        this.b = this.navBarColor;
        this.d = o2Var;
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
                imageView.setBackground(org.telegram.ui.ActionBar.k6.g0(getThemedColor(org.telegram.ui.ActionBar.k6.i6), 1, -1));
                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Ji, g6Var, PorterDuff.Mode.SRC_ATOP);
                imageView.setImageResource(R.drawable.ic_layer_close);
                imageView.setOnClickListener(new v80(this, i11));
                int dp = AndroidUtilities.dp(8.0f);
                imageView.setPadding(dp, dp, dp, dp);
                frameLayout.addView(imageView, w7.z5.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                w9 w9Var = new w9(context);
                w9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
                linearLayout.addView(w9Var, w7.z5.t(90, 90, 49, 0, 27, 0, 0));
                chatInvite = this.e;
                if (chatInvite == null) {
                    if (chatInvite.chat != null) {
                        h9 h9Var = new h9(this.e.chat);
                        TLRPC.ChatInvite chatInvite4 = this.e;
                        TLRPC.Chat chat2 = chatInvite4.chat;
                        r12 = chat2.title;
                        i10 = chat2.participants_count;
                        w9Var.a.setForUserOrChat(chat2, h9Var, chatInvite4);
                        w9Var.d();
                    } else {
                        h9 h9Var2 = new h9((org.telegram.ui.ActionBar.g6) null);
                        h9Var2.n(0L, this.e.title, null);
                        TLRPC.ChatInvite chatInvite5 = this.e;
                        String str4 = chatInvite5.title;
                        i10 = chatInvite5.participants_count;
                        w9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(chatInvite5.photo.sizes, 50), this.e.photo), "50_50", h9Var2, this.e);
                        r12 = str4;
                    }
                    TLRPC.ChatInvite chatInvite6 = this.e;
                    str3 = chatInvite6.about;
                    z11 = chatInvite6.verified;
                    z12 = chatInvite6.fake;
                    z10 = chatInvite6.scam;
                } else if (this.f != null) {
                    h9 h9Var3 = new h9(this.f);
                    String str5 = this.f.title;
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.f.id);
                    r12 = chatFull != null ? chatFull.about : null;
                    i10 = Math.max(this.f.participants_count, chatFull != null ? chatFull.participants_count : 0);
                    TLRPC.Chat chat3 = this.f;
                    w9Var.a.setForUserOrChat(chat3, h9Var3, chat3);
                    w9Var.d();
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
                n5Var = new org.telegram.ui.ActionBar.n5(context);
                n5Var.setTypeface(AndroidUtilities.bold());
                n5Var.setTextSize(20);
                int i12 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.ui.ActionBar.r6.Z(n5Var, i12, g6Var);
                n5Var.l(r12, false);
                n5Var.setGravity(17);
                linearLayout.addView(n5Var, w7.z5.t(-2, -2, 49, 10, 10, 10, i10 <= 0 ? 0 : 20));
                if (!z10 || z12) {
                    n5Var.i(!z10 ? org.telegram.ui.ActionBar.k6.g1 : org.telegram.ui.ActionBar.k6.h1);
                } else if (z11) {
                    n5Var.i(new yq(org.telegram.ui.ActionBar.k6.f1, org.telegram.ui.ActionBar.k6.i1));
                }
                TLRPC.ChatInvite chatInvite7 = this.e;
                z13 = (chatInvite7 == null && ((chatInvite7.channel && !chatInvite7.megagroup) || ChatObject.isChannelAndNotMegaGroup(chatInvite7.chat))) || (ChatObject.isChannel(this.f) && !this.f.megagroup);
                isEmpty = TextUtils.isEmpty(str3);
                TextView g10 = org.telegram.messenger.v0.g(context, 1, 13.0f);
                int i13 = org.telegram.ui.ActionBar.k6.r5;
                org.telegram.ui.ActionBar.r6.W(g10, i13, g6Var);
                g10.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                g10.setEllipsize(truncateAt);
                g10.setText(!z13 ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase());
                linearLayout.addView(g10, w7.z5.t(-2, -2, 49, 10, 0, 10, isEmpty ? 0 : 20));
                if (!isEmpty) {
                    TextView textView = new TextView(context);
                    textView.setGravity(17);
                    textView.setText(str3);
                    org.telegram.ui.ActionBar.r6.W(textView, i12, g6Var);
                    textView.setTextSize(1, 15.0f);
                    linearLayout.addView(textView, w7.z5.t(-1, -2, 48, 24, 10, 24, 20));
                }
                chatInvite2 = this.e;
                if (chatInvite2 != null || chatInvite2.request_needed) {
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    linearLayout.addView(frameLayout2, w7.z5.n(-1, -2));
                    RadialProgressView radialProgressView = new RadialProgressView(getContext(), g6Var);
                    this.n = radialProgressView;
                    int i14 = org.telegram.ui.ActionBar.k6.Oh;
                    radialProgressView.setProgressColorKey(i14);
                    radialProgressView.setSize(AndroidUtilities.dp(32.0f));
                    radialProgressView.setVisibility(4);
                    frameLayout2.addView(radialProgressView, w7.z5.e(48, 48, 17));
                    TextView textView2 = new TextView(getContext());
                    this.h = textView2;
                    int dp2 = AndroidUtilities.dp(24.0f);
                    int themedColor = getThemedColor(i14);
                    int i15 = org.telegram.ui.ActionBar.k6.Qh;
                    int themedColor2 = getThemedColor(i15);
                    org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp2, dp2, dp2, dp2, themedColor, themedColor2, themedColor2);
                    org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i14);
                    org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i15);
                    textView2.setBackground(j02);
                    org.telegram.ui.ActionBar.r6.k(textView2, j02, O, O2, g6Var);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity(17);
                    textView2.setSingleLine(true);
                    textView2.setText(LocaleController.getString(!z13 ? R.string.RequestToJoinChannel : R.string.RequestToJoinGroup));
                    org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.Sh, g6Var);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.y80
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            b90.s(b90.this, z13, j10);
                        }
                    });
                    frameLayout2.addView(textView2, w7.z5.t(-1, 48, 8388611, 14, 0, 14, 0));
                    TextView textView3 = new TextView(getContext());
                    textView3.setGravity(17);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setText(LocaleController.getString(!z13 ? R.string.RequestToJoinChannelDescription : R.string.RequestToJoinGroupDescription));
                    org.telegram.ui.ActionBar.r6.W(textView3, i13, g6Var);
                    linearLayout.addView(textView3, w7.z5.t(-1, -2, 48, 24, 17, 24, 15));
                }
                if (chatInvite2.participants.isEmpty()) {
                    f7 = 24.0f;
                    z14 = false;
                } else {
                    int min = Math.min(this.e.participants.size(), 3);
                    k9 k9Var = new k9(context, false);
                    k9Var.setAvatarsTextSize(AndroidUtilities.dp(20.0f));
                    float f10 = 38;
                    k9Var.setSize(AndroidUtilities.dp(f10));
                    k9Var.setCount(min);
                    float f11 = 0.65f;
                    k9Var.setStepFactor(0.65f);
                    int i16 = 0;
                    while (i16 < min) {
                        k9Var.b(i16, this.e.participants.get(i16), UserConfig.selectedAccount);
                        i16++;
                        f11 = f11;
                    }
                    f7 = 24.0f;
                    k9Var.a(false);
                    linearLayout.addView(k9Var, w7.z5.t((int) ((((f10 * f11) + 1.0f) * (min - 1)) + f10), 44, 17, 0, 2, 0, 4));
                    TextView textView4 = new TextView(context);
                    textView4.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.r6.W(textView4, org.telegram.ui.ActionBar.k6.r5, g6Var);
                    textView4.setGravity(17);
                    if (min == 1) {
                        z14 = false;
                        format = w(textView4, this.e, 0).toString();
                    } else {
                        z14 = false;
                        if (min == 2) {
                            format = LocaleController.formatString("RequestToJoinMembersTwo", R.string.RequestToJoinMembersTwo, w(textView4, this.e, 0), w(textView4, this.e, 1));
                        } else if (i10 == 3) {
                            format = LocaleController.formatString("RequestToJoinMembersThree", R.string.RequestToJoinMembersThree, w(textView4, this.e, 0), w(textView4, this.e, 1), w(textView4, this.e, 2));
                        } else {
                            int max = Math.max(i10 - min, 2);
                            format = String.format(LocaleController.getPluralString("RequestToJoinMembersAll", max), w(textView4, this.e, 0), w(textView4, this.e, 1), Integer.valueOf(max));
                        }
                    }
                    textView4.setText(format);
                    linearLayout.addView(textView4, w7.z5.t(-2, -2, 49, 10, 0, 10, 24));
                }
                TLRPC.ChatInvite chatInvite8 = this.e;
                boolean z16 = ((!chatInvite8.channel || chatInvite8.megagroup) && (!ChatObject.isChannel(chatInvite8.chat) || this.e.chat.megagroup)) ? z14 : true;
                TextView textView5 = new TextView(getContext());
                int dp3 = AndroidUtilities.dp(f7);
                int i17 = org.telegram.ui.ActionBar.k6.Oh;
                int themedColor3 = getThemedColor(i17);
                int i18 = org.telegram.ui.ActionBar.k6.Qh;
                int themedColor4 = getThemedColor(i18);
                org.telegram.ui.Cells.y j03 = org.telegram.ui.ActionBar.k6.j0(dp3, dp3, dp3, dp3, themedColor3, themedColor4, themedColor4);
                org.telegram.ui.ActionBar.n6 O3 = org.telegram.ui.ActionBar.r6.O(i17);
                org.telegram.ui.ActionBar.n6 O4 = org.telegram.ui.ActionBar.r6.O(i18);
                textView5.setBackground(j03);
                org.telegram.ui.ActionBar.r6.k(textView5, j03, O3, O4, g6Var);
                w7.b6.b(textView5, 0.02f, 1.2f);
                textView5.setEllipsize(TextUtils.TruncateAt.END);
                textView5.setGravity(17);
                int i19 = 1;
                textView5.setSingleLine(true);
                textView5.setText(LocaleController.getString(z16 ? R.string.ProfileJoinChannel : R.string.ProfileJoinGroup));
                org.telegram.messenger.v0.q(textView5, org.telegram.ui.ActionBar.k6.Sh, g6Var, 1, 14.0f);
                linearLayout.addView(textView5, w7.z5.t(-1, 48, 8388611, 14, 0, 14, 14));
                textView5.setOnClickListener(new ci.a2(this, j10, i19));
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
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.g0(getThemedColor(org.telegram.ui.ActionBar.k6.i6), 1, -1));
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.Ji, g6Var, PorterDuff.Mode.SRC_ATOP);
        imageView2.setImageResource(R.drawable.ic_layer_close);
        imageView2.setOnClickListener(new v80(this, i11));
        int dp4 = AndroidUtilities.dp(8.0f);
        imageView2.setPadding(dp4, dp4, dp4, dp4);
        frameLayout3.addView(imageView2, w7.z5.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        w9 w9Var2 = new w9(context);
        w9Var2.setRoundRadius(AndroidUtilities.dp(45.0f));
        linearLayout.addView(w9Var2, w7.z5.t(90, 90, 49, 0, 27, 0, 0));
        chatInvite = this.e;
        if (chatInvite == null) {
        }
        n5Var = new org.telegram.ui.ActionBar.n5(context);
        n5Var.setTypeface(AndroidUtilities.bold());
        n5Var.setTextSize(20);
        int i122 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.Z(n5Var, i122, g6Var);
        n5Var.l(r12, false);
        n5Var.setGravity(17);
        linearLayout.addView(n5Var, w7.z5.t(-2, -2, 49, 10, 10, 10, i10 <= 0 ? 0 : 20));
        if (z10) {
        }
        n5Var.i(!z10 ? org.telegram.ui.ActionBar.k6.g1 : org.telegram.ui.ActionBar.k6.h1);
        TLRPC.ChatInvite chatInvite72 = this.e;
        if (chatInvite72 == null) {
        }
        isEmpty = TextUtils.isEmpty(str3);
        TextView g102 = org.telegram.messenger.v0.g(context, 1, 13.0f);
        int i132 = org.telegram.ui.ActionBar.k6.r5;
        org.telegram.ui.ActionBar.r6.W(g102, i132, g6Var);
        g102.setSingleLine(true);
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        g102.setEllipsize(truncateAt2);
        g102.setText(!z13 ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase());
        linearLayout.addView(g102, w7.z5.t(-2, -2, 49, 10, 0, 10, isEmpty ? 0 : 20));
        if (!isEmpty) {
        }
        chatInvite2 = this.e;
        if (chatInvite2 != null) {
        }
        FrameLayout frameLayout22 = new FrameLayout(getContext());
        linearLayout.addView(frameLayout22, w7.z5.n(-1, -2));
        RadialProgressView radialProgressView2 = new RadialProgressView(getContext(), g6Var);
        this.n = radialProgressView2;
        int i142 = org.telegram.ui.ActionBar.k6.Oh;
        radialProgressView2.setProgressColorKey(i142);
        radialProgressView2.setSize(AndroidUtilities.dp(32.0f));
        radialProgressView2.setVisibility(4);
        frameLayout22.addView(radialProgressView2, w7.z5.e(48, 48, 17));
        TextView textView22 = new TextView(getContext());
        this.h = textView22;
        int dp22 = AndroidUtilities.dp(24.0f);
        int themedColor5 = getThemedColor(i142);
        int i152 = org.telegram.ui.ActionBar.k6.Qh;
        int themedColor22 = getThemedColor(i152);
        org.telegram.ui.Cells.y j022 = org.telegram.ui.ActionBar.k6.j0(dp22, dp22, dp22, dp22, themedColor5, themedColor22, themedColor22);
        org.telegram.ui.ActionBar.n6 O5 = org.telegram.ui.ActionBar.r6.O(i142);
        org.telegram.ui.ActionBar.n6 O22 = org.telegram.ui.ActionBar.r6.O(i152);
        textView22.setBackground(j022);
        org.telegram.ui.ActionBar.r6.k(textView22, j022, O5, O22, g6Var);
        textView22.setEllipsize(truncateAt2);
        textView22.setGravity(17);
        textView22.setSingleLine(true);
        textView22.setText(LocaleController.getString(!z13 ? R.string.RequestToJoinChannel : R.string.RequestToJoinGroup));
        org.telegram.ui.ActionBar.r6.W(textView22, org.telegram.ui.ActionBar.k6.Sh, g6Var);
        textView22.setTextSize(1, 14.0f);
        textView22.setTypeface(AndroidUtilities.bold());
        textView22.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.y80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b90.s(b90.this, z13, j10);
            }
        });
        frameLayout22.addView(textView22, w7.z5.t(-1, 48, 8388611, 14, 0, 14, 0));
        TextView textView32 = new TextView(getContext());
        textView32.setGravity(17);
        textView32.setTextSize(1, 14.0f);
        textView32.setText(LocaleController.getString(!z13 ? R.string.RequestToJoinChannelDescription : R.string.RequestToJoinGroupDescription));
        org.telegram.ui.ActionBar.r6.W(textView32, i132, g6Var);
        linearLayout.addView(textView32, w7.z5.t(-1, -2, 48, 24, 17, 24, 15));
    }

    public static /* synthetic */ void m(b90 b90Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        b90 b90Var2;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(b90Var.currentAccount).lambda$processUpdates$377(updates2, false);
            updates = updates2;
        } else {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                w80 w80Var = new w80(b90Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j10, 1);
                b90Var2 = b90Var;
                AndroidUtilities.runOnUIThread(w80Var);
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i(b90Var2, tL_error, updates, tL_messages_importChatInvite, 29));
            }
        }
        b90Var2 = b90Var;
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i(b90Var2, tL_error, updates, tL_messages_importChatInvite, 29));
    }

    public static void n(b90 b90Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.o2 o2Var = b90Var.d;
        if (o2Var == null || o2Var.getParentActivity() == null) {
            return;
        }
        if (tL_error != null) {
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            f5.f0(b90Var.currentAccount, tL_error, o2Var, tL_messages_importChatInvite, new Object[0]);
            return;
        }
        if (updates == null || updates.chats.isEmpty()) {
            return;
        }
        TLRPC.Chat chat = updates.chats.get(0);
        chat.left = false;
        chat.kicked = false;
        MessagesController.getInstance(b90Var.currentAccount).putUsers(updates.users, false);
        MessagesController.getInstance(b90Var.currentAccount).putChats(updates.chats, false);
        long j10 = chat.id;
        boolean z10 = !ChatObject.isChannelAndNotMegaGroup(chat);
        b90Var.getClass();
        Bundle e = si.o0.e(j10, "chat_id");
        MessagesController messagesController = MessagesController.getInstance(b90Var.currentAccount);
        org.telegram.ui.ActionBar.o2 o2Var2 = b90Var.d;
        if (messagesController.checkCanOpenChat(e, o2Var2)) {
            o2Var2.presentFragment(new a90(b90Var, e, z10, j10), o2Var2 instanceof org.telegram.ui.sn);
        }
    }

    public static /* synthetic */ void p(b90 b90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(b90Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(b90Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static /* synthetic */ void q(b90 b90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(b90Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(b90Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static /* synthetic */ void r(b90 b90Var, long j10) {
        b90Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = b90Var.c;
        ConnectionsManager.getInstance(b90Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new ai.uc(b90Var, j10, tL_messages_importChatInvite), 2);
    }

    public static /* synthetic */ void s(final b90 b90Var, boolean z10, long j10) {
        TLRPC.Chat chat = b90Var.f;
        final int i10 = 0;
        AndroidUtilities.runOnUIThread(new Runnable(b90Var) { // from class: org.telegram.ui.Components.z80
            public final /* synthetic */ b90 b;

            {
                this.b = b90Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        b90 b90Var2 = this.b;
                        if (!b90Var2.isDismissed()) {
                            b90Var2.h.setVisibility(4);
                            b90Var2.n.setVisibility(0);
                            break;
                        }
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        }, 400L);
        if (b90Var.e != null || chat == null) {
            TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
            tL_messages_importChatInvite.hash = b90Var.c;
            ConnectionsManager.getInstance(b90Var.currentAccount).sendRequest(tL_messages_importChatInvite, new ai.l(b90Var, j10, z10, tL_messages_importChatInvite), 2);
        } else {
            final int i11 = 1;
            MessagesController.getInstance(b90Var.currentAccount).addUserToChat(chat.id, UserConfig.getInstance(b90Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(b90Var) { // from class: org.telegram.ui.Components.z80
                public final /* synthetic */ b90 b;

                {
                    this.b = b90Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            b90 b90Var2 = this.b;
                            if (!b90Var2.isDismissed()) {
                                b90Var2.h.setVisibility(4);
                                b90Var2.n.setVisibility(0);
                                break;
                            }
                            break;
                        default:
                            this.b.dismiss();
                            break;
                    }
                }
            }, new ci.f(9, b90Var, z10));
        }
    }

    public static /* synthetic */ void t(b90 b90Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        b90 b90Var2;
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(b90Var.currentAccount).lambda$processUpdates$377(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            w80 w80Var = new w80(b90Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j10, 0);
            b90Var2 = b90Var;
            AndroidUtilities.runOnUIThread(w80Var);
            AndroidUtilities.runOnUIThread(new ai.x9(b90Var2, tL_error, z10, tL_messages_importChatInvite, 19));
        }
        b90Var2 = b90Var;
        AndroidUtilities.runOnUIThread(new ai.x9(b90Var2, tL_error, z10, tL_messages_importChatInvite, 19));
    }

    public static /* synthetic */ void u(b90 b90Var, TLRPC.TL_error tL_error, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.o2 o2Var = b90Var.d;
        if (o2Var == null || o2Var.getParentActivity() == null) {
            return;
        }
        if (tL_error != null) {
            if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                b90Var.setOnDismissListener(new x80(1, b90Var, z10));
            } else {
                f5.f0(b90Var.currentAccount, tL_error, o2Var, tL_messages_importChatInvite, new Object[0]);
            }
        }
        b90Var.dismiss();
    }

    public static CharSequence w(TextView textView, TLRPC.ChatInvite chatInvite, int i10) {
        String str = chatInvite.participants.get(i10).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
    }

    public static void x(Context context, org.telegram.ui.ActionBar.o2 o2Var, xc xcVar, boolean z10) {
        if (context == null) {
            if (o2Var != null) {
                o2Var.getContext();
                return;
            }
            return;
        }
        if (xcVar == null) {
            xcVar = xc.a0(o2Var);
        }
        nc ncVar = new nc(context, o2Var.getResourceProvider());
        ncVar.a.f(R.raw.timer_3, 28, 28, null);
        ncVar.b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        ncVar.c.setText(z10 ? LocaleController.getString(R.string.RequestToJoinChannelSentDescription) : LocaleController.getString(R.string.RequestToJoinGroupSentDescription));
        xcVar.b(ncVar, 2750).j();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            if (this.navBarColor != this.b || (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.d6)) == this.navBarColor) {
                return;
            }
            fixNavigationBar(themedColor);
            this.b = this.navBarColor;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
