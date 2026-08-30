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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ua extends FrameLayout {
    public final org.telegram.ui.Components.p9 a;
    public final ig.c b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final ImageView d;
    public final org.telegram.ui.Components.z8 e;
    public TLObject f;
    public CharSequence h;
    public int n;
    public String r;
    public final int s;
    public final int v;
    public final int w;

    public ua(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.s = UserConfig.selectedAccount;
        this.v = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, f6Var);
        this.w = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.n6, f6Var);
        this.e = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z4 = LocaleController.isRTL;
        addView(p9Var, k7.b6.d(48, 48.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 11, 11.0f, z4 ? 11 : 0.0f, 0.0f));
        ig.c cVar = new ig.c(context, 4);
        this.b = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        cVar.setTextSize(17);
        cVar.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z10 = LocaleController.isRTL;
        addView(cVar, k7.b6.d(-1, 20.0f, (z10 ? 5 : 3) | 48, z10 ? 28 : 72, 14.5f, z10 ? 72 : 28, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.c = k5Var;
        k5Var.setTextSize(14);
        k5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z11 = LocaleController.isRTL;
        addView(k5Var, k7.b6.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 28.0f : 72, 37.5f, z11 ? 72 : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.m6, f6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setVisibility(8);
        boolean z12 = LocaleController.isRTL;
        addView(imageView, k7.b6.d(-2, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 0.0f : 16.0f, 0.0f, z12 ? 16.0f : 0.0f, 0.0f));
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
        org.telegram.ui.Components.z8 z8Var = this.e;
        if (user != null) {
            z8Var.m(i10, user);
        } else if (chat != null) {
            z8Var.k(i10, chat);
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
        int i11 = this.v;
        org.telegram.ui.Components.p9 p9Var = this.a;
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        if (charSequence != null) {
            k5Var.setTextColor(i11);
            k5Var.l(this.h, false);
            if (p9Var != null) {
                p9Var.e(user, z8Var);
            }
        } else if (user != null) {
            if (user.bot) {
                k5Var.setTextColor(i11);
                if (user.bot_chat_history) {
                    k5Var.l(LocaleController.getString(R.string.BotStatusRead), false);
                } else {
                    k5Var.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                }
            } else if (user.id == UserConfig.getInstance(i10).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i10).getCurrentTime()) || MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(user.id)))) {
                k5Var.setTextColor(this.w);
                k5Var.l(LocaleController.getString(R.string.Online), false);
            } else {
                k5Var.setTextColor(i11);
                k5Var.l(LocaleController.formatUserStatus(i10, user), false);
            }
            p9Var.e(user, z8Var);
        } else if (chat != null) {
            k5Var.setTextColor(i11);
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i12 = chat.participants_count;
                if (i12 != 0) {
                    k5Var.l(LocaleController.formatPluralString("Members", i12, new Object[0]), false);
                } else if (chat.has_geo) {
                    k5Var.l(LocaleController.getString(R.string.MegaLocation), false);
                } else if (ChatObject.isPublic(chat)) {
                    k5Var.l(LocaleController.getString(R.string.MegaPublic), false);
                } else {
                    k5Var.l(LocaleController.getString(R.string.MegaPrivate), false);
                }
            } else {
                int i13 = chat.participants_count;
                if (i13 != 0) {
                    k5Var.l(LocaleController.formatPluralString("Subscribers", i13, new Object[0]), false);
                } else if (ChatObject.isPublic(chat)) {
                    k5Var.l(LocaleController.getString(R.string.ChannelPublic), false);
                } else {
                    k5Var.l(LocaleController.getString(R.string.ChannelPrivate), false);
                }
            }
            p9Var.e(chat, z8Var);
        } else {
            p9Var.setImageDrawable(z8Var);
        }
        p9Var.setRoundRadius(AndroidUtilities.dp((chat == null || !chat.forum) ? 24.0f : 14.0f));
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

    public void setCheckDisabled(boolean z4) {
    }
}
