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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ua extends FrameLayout {
    public final org.telegram.ui.Components.o9 a;
    public final dg.c b;
    public final org.telegram.ui.ActionBar.h5 c;
    public final ImageView d;
    public final org.telegram.ui.Components.z8 e;
    public TLObject f;
    public CharSequence h;
    public int n;
    public String r;
    public final int s;
    public final int v;
    public final int w;

    public ua(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.s = UserConfig.selectedAccount;
        this.v = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.y6, b6Var);
        this.w = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.n6, b6Var);
        this.e = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z10 = LocaleController.isRTL;
        addView(o9Var, g7.e6.d(48, 48.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11, 11.0f, z10 ? 11 : 0.0f, 0.0f));
        dg.c cVar = new dg.c(context, 4);
        this.b = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        cVar.setTextSize(17);
        cVar.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z11 = LocaleController.isRTL;
        addView(cVar, g7.e6.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 28 : 72, 14.5f, z11 ? 72 : 28, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.c = h5Var;
        h5Var.setTextSize(14);
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z12 = LocaleController.isRTL;
        addView(h5Var, g7.e6.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 28.0f : 72, 37.5f, z12 ? 72 : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.m6, b6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setVisibility(8);
        boolean z13 = LocaleController.isRTL;
        addView(imageView, g7.e6.d(-2, -2.0f, (z13 ? 5 : 3) | 16, z13 ? 0.0f : 16.0f, 0.0f, z13 ? 16.0f : 0.0f, 0.0f));
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
        int i9 = this.s;
        org.telegram.ui.Components.z8 z8Var = this.e;
        if (user != null) {
            z8Var.m(i9, user);
        } else if (chat != null) {
            z8Var.k(i9, chat);
        } else {
            z8Var.n(this.n, "#", null);
        }
        if (user != null) {
            this.r = UserObject.getUserName(user);
        } else {
            this.r = chat.title;
        }
        this.b.k(this.r);
        CharSequence charSequence = this.h;
        int i10 = this.v;
        org.telegram.ui.Components.o9 o9Var = this.a;
        org.telegram.ui.ActionBar.h5 h5Var = this.c;
        if (charSequence != null) {
            h5Var.setTextColor(i10);
            h5Var.l(this.h, false);
            if (o9Var != null) {
                o9Var.e(user, z8Var);
            }
        } else if (user != null) {
            if (user.bot) {
                h5Var.setTextColor(i10);
                if (user.bot_chat_history) {
                    h5Var.l(LocaleController.getString(R.string.BotStatusRead), false);
                } else {
                    h5Var.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                }
            } else if (user.id == UserConfig.getInstance(i9).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i9).getCurrentTime()) || MessagesController.getInstance(i9).onlinePrivacy.containsKey(Long.valueOf(user.id)))) {
                h5Var.setTextColor(this.w);
                h5Var.l(LocaleController.getString(R.string.Online), false);
            } else {
                h5Var.setTextColor(i10);
                h5Var.l(LocaleController.formatUserStatus(i9, user), false);
            }
            o9Var.e(user, z8Var);
        } else if (chat != null) {
            h5Var.setTextColor(i10);
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i11 = chat.participants_count;
                if (i11 != 0) {
                    h5Var.l(LocaleController.formatPluralString("Members", i11, new Object[0]), false);
                } else if (chat.has_geo) {
                    h5Var.l(LocaleController.getString(R.string.MegaLocation), false);
                } else if (ChatObject.isPublic(chat)) {
                    h5Var.l(LocaleController.getString(R.string.MegaPublic), false);
                } else {
                    h5Var.l(LocaleController.getString(R.string.MegaPrivate), false);
                }
            } else {
                int i12 = chat.participants_count;
                if (i12 != 0) {
                    h5Var.l(LocaleController.formatPluralString("Subscribers", i12, new Object[0]), false);
                } else if (ChatObject.isPublic(chat)) {
                    h5Var.l(LocaleController.getString(R.string.ChannelPublic), false);
                } else {
                    h5Var.l(LocaleController.getString(R.string.ChannelPrivate), false);
                }
            }
            o9Var.e(chat, z8Var);
        } else {
            o9Var.setImageDrawable(z8Var);
        }
        o9Var.setRoundRadius(AndroidUtilities.dp((chat == null || !chat.forum) ? 24.0f : 14.0f));
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(70.0f), TLObject.FLAG_30));
    }

    public void setCurrentId(int i9) {
        this.n = i9;
    }

    public void setNameTypeface(Typeface typeface) {
        this.b.setTypeface(typeface);
    }

    public void setCheckDisabled(boolean z10) {
    }
}
