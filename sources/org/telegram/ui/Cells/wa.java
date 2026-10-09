package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class wa extends FrameLayout {
    public final org.telegram.ui.Components.y9 a;
    public final ai.a6 b;
    public final org.telegram.ui.ActionBar.j5 c;
    public final ImageView d;
    public final org.telegram.ui.Components.j9 e;
    public TLObject f;
    public CharSequence h;
    public int n;
    public String r;
    public final int s;
    public final int v;
    public final int w;

    public wa(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.s = UserConfig.selectedAccount;
        this.v = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.y6, e6Var);
        this.w = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.n6, e6Var);
        this.e = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z10 = LocaleController.isRTL;
        addView(y9Var, w7.x5.a(48.0f, z10 ? 0.0f : 11, 11.0f, z10 ? 11 : 0.0f, 0.0f, 48, (z10 ? 5 : 3) | 48));
        ai.a6 a6Var = new ai.a6(context, 3);
        this.b = a6Var;
        NotificationCenter.listenEmojiLoading(a6Var);
        a6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        a6Var.setTextSize(17);
        a6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z11 = LocaleController.isRTL;
        addView(a6Var, w7.x5.a(20.0f, z11 ? 28 : 72, 14.5f, z11 ? 72 : 28, 0.0f, -1, (z11 ? 5 : 3) | 48));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.c = j5Var;
        j5Var.setTextSize(14);
        j5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z12 = LocaleController.isRTL;
        addView(j5Var, w7.x5.a(20.0f, z12 ? 28.0f : 72, 37.5f, z12 ? 72 : 28.0f, 0.0f, -1, (z12 ? 5 : 3) | 48));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.m6, e6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setVisibility(8);
        boolean z13 = LocaleController.isRTL;
        addView(imageView, w7.x5.a(-2.0f, z13 ? 0.0f : 16.0f, 0.0f, z13 ? 16.0f : 0.0f, 0.0f, -2, (z13 ? 5 : 3) | 16));
    }

    public final void a(TLObject tLObject, String str) {
        if (tLObject != null || str != null) {
            this.h = str;
            this.f = tLObject;
            b();
        } else {
            this.h = null;
            this.f = null;
            this.b.k("");
            this.c.l("", false);
            this.a.setImageDrawable(null);
        }
    }

    public final void b() {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.UserStatus userStatus;
        TLObject tLObject = this.f;
        if (tLObject instanceof TLRPC.User) {
            user = (TLRPC.User) tLObject;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int i10 = this.s;
        org.telegram.ui.Components.j9 j9Var = this.e;
        if (user != null) {
            j9Var.m(i10, user);
        } else if (chat != null) {
            j9Var.k(i10, chat);
        } else {
            j9Var.n(this.n, "#", null);
        }
        if (user != null) {
            this.r = UserObject.getUserName(user);
        } else {
            this.r = chat.title;
        }
        this.b.k(this.r);
        CharSequence charSequence = this.h;
        int i11 = this.v;
        org.telegram.ui.Components.y9 y9Var = this.a;
        org.telegram.ui.ActionBar.j5 j5Var = this.c;
        if (charSequence != null) {
            j5Var.setTextColor(i11);
            j5Var.l(this.h, false);
            if (y9Var != null) {
                y9Var.e(user, j9Var);
            }
        } else if (user != null) {
            if (user.bot) {
                j5Var.setTextColor(i11);
                if (user.bot_chat_history) {
                    j5Var.l(LocaleController.getString(R.string.BotStatusRead), false);
                } else {
                    j5Var.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                }
            } else if (user.id == UserConfig.getInstance(i10).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i10).getCurrentTime()) || MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(user.id)))) {
                j5Var.setTextColor(this.w);
                j5Var.l(LocaleController.getString(R.string.Online), false);
            } else {
                j5Var.setTextColor(i11);
                j5Var.l(LocaleController.formatUserStatus(i10, user), false);
            }
            y9Var.e(user, j9Var);
        } else if (chat != null) {
            j5Var.setTextColor(i11);
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i12 = chat.participants_count;
                if (i12 != 0) {
                    j5Var.l(LocaleController.formatPluralString("Members", i12, new Object[0]), false);
                } else if (chat.has_geo) {
                    j5Var.l(LocaleController.getString(R.string.MegaLocation), false);
                } else if (ChatObject.isPublic(chat)) {
                    j5Var.l(LocaleController.getString(R.string.MegaPublic), false);
                } else {
                    j5Var.l(LocaleController.getString(R.string.MegaPrivate), false);
                }
            } else {
                int i13 = chat.participants_count;
                if (i13 != 0) {
                    j5Var.l(LocaleController.formatPluralString("Subscribers", i13, new Object[0]), false);
                } else if (ChatObject.isPublic(chat)) {
                    j5Var.l(LocaleController.getString(R.string.ChannelPublic), false);
                } else {
                    j5Var.l(LocaleController.getString(R.string.ChannelPrivate), false);
                }
            }
            y9Var.e(chat, j9Var);
        } else {
            y9Var.setImageDrawable(j9Var);
        }
        y9Var.setRoundRadius(AndroidUtilities.dp((chat == null || !chat.forum) ? 24.0f : 14.0f));
        ImageView imageView = this.d;
        if (imageView.getVisibility() != 0) {
            imageView.getVisibility();
        } else {
            imageView.setVisibility(8);
            imageView.setImageResource(0);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(70.0f), TLObject.FLAG_30));
    }

    public void setCurrentId(int i10) {
        this.n = i10;
    }

    public void setNameTypeface(Typeface typeface) {
        this.b.setTypeface(typeface);
    }

    public void setCheckDisabled(boolean z10) {
    }
}
