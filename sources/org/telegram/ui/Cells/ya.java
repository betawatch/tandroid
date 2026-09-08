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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ya extends FrameLayout {
    public final org.telegram.ui.Components.x9 a;
    public final bi.j5 b;
    public final org.telegram.ui.ActionBar.j5 c;
    public final ImageView d;
    public final org.telegram.ui.Components.i9 e;
    public TLObject f;
    public CharSequence h;
    public int n;
    public String r;
    public final int s;
    public final int v;
    public final int w;

    public ya(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.s = UserConfig.selectedAccount;
        this.v = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, f6Var);
        this.w = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.n6, f6Var);
        this.e = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.a = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z10 = LocaleController.isRTL;
        addView(x9Var, w7.x5.d(48, 48.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11, 11.0f, z10 ? 11 : 0.0f, 0.0f));
        bi.j5 j5Var = new bi.j5(context, 3);
        this.b = j5Var;
        NotificationCenter.listenEmojiLoading(j5Var);
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        j5Var.setTextSize(17);
        j5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z11 = LocaleController.isRTL;
        addView(j5Var, w7.x5.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 28 : 72, 14.5f, z11 ? 72 : 28, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.c = j5Var2;
        j5Var2.setTextSize(14);
        j5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z12 = LocaleController.isRTL;
        addView(j5Var2, w7.x5.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 28.0f : 72, 37.5f, z12 ? 72 : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.m6, f6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setVisibility(8);
        boolean z13 = LocaleController.isRTL;
        addView(imageView, w7.x5.d(-2, -2.0f, (z13 ? 5 : 3) | 16, z13 ? 0.0f : 16.0f, 0.0f, z13 ? 16.0f : 0.0f, 0.0f));
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
        org.telegram.ui.Components.i9 i9Var = this.e;
        if (user != null) {
            i9Var.m(i10, user);
        } else if (chat != null) {
            i9Var.k(i10, chat);
        } else {
            i9Var.n(this.n, "#", null);
        }
        if (user != null) {
            this.r = UserObject.getUserName(user);
        } else {
            this.r = chat.title;
        }
        this.b.k(this.r);
        CharSequence charSequence = this.h;
        int i11 = this.v;
        org.telegram.ui.Components.x9 x9Var = this.a;
        org.telegram.ui.ActionBar.j5 j5Var = this.c;
        if (charSequence != null) {
            j5Var.setTextColor(i11);
            j5Var.l(this.h, false);
            if (x9Var != null) {
                x9Var.e(user, i9Var);
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
            x9Var.e(user, i9Var);
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
            x9Var.e(chat, i9Var);
        } else {
            x9Var.setImageDrawable(i9Var);
        }
        x9Var.setRoundRadius(AndroidUtilities.dp((chat == null || !chat.forum) ? 24.0f : 14.0f));
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
