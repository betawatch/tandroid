package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class za extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 a;
    public final org.telegram.ui.Components.y9 b;
    public final di.l4 c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final ImageView e;
    public final org.telegram.ui.Components.j9 f;
    public CharSequence h;
    public int n;
    public String r;
    public final int s;
    public int v;
    public int w;
    public final boolean x;

    public za(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.s = UserConfig.selectedAccount;
        this.x = true;
        this.a = u6Var;
        this.v = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.y6, u6Var);
        this.w = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.n6, u6Var);
        this.f = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.b = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z10 = LocaleController.isRTL;
        addView(y9Var, kb1.h(48, 48.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11, 11.0f, z10 ? 11 : 0.0f, 0.0f));
        di.l4 l4Var = new di.l4(context, 3);
        this.c = l4Var;
        NotificationCenter.listenEmojiLoading(l4Var);
        org.telegram.ui.ActionBar.f7.Y(l4Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        l4Var.setTextSize(17);
        l4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z11 = LocaleController.isRTL;
        addView(l4Var, kb1.h(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 28 : 72, 14.5f, z11 ? 72 : 28, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.d = b6Var;
        b6Var.setTextSize(14);
        b6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z12 = LocaleController.isRTL;
        addView(b6Var, kb1.h(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 28.0f : 72, 37.5f, z12 ? 72 : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.m6, u6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        boolean z13 = LocaleController.isRTL;
        addView(imageView, kb1.h(-2, -2.0f, (z13 ? 5 : 3) | 16, z13 ? 0.0f : 16.0f, 0.0f, z13 ? 16.0f : 0.0f, 0.0f));
    }

    public final void a(TLObject tLObject, String str) {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.UserStatus userStatus;
        org.telegram.ui.Components.y9 y9Var = this.b;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        di.l4 l4Var = this.c;
        if (tLObject == null && str == null) {
            this.h = null;
            l4Var.k("");
            b6Var.l("", false);
            y9Var.setImageDrawable(null);
            return;
        }
        this.h = str;
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
        org.telegram.ui.Components.j9 j9Var = this.f;
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
        l4Var.k(this.r);
        if (this.h != null) {
            b6Var.setTextColor(this.v);
            b6Var.l(this.h, false);
            if (y9Var != null) {
                y9Var.f(user, j9Var);
            }
        } else if (user != null) {
            if (user.bot) {
                b6Var.setTextColor(this.v);
                if (user.bot_chat_history) {
                    b6Var.l(LocaleController.getString(R.string.BotStatusRead), false);
                } else {
                    b6Var.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                }
            } else if (user.id == UserConfig.getInstance(i10).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i10).getCurrentTime()) || MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(user.id)))) {
                b6Var.setTextColor(this.w);
                b6Var.l(LocaleController.getString(R.string.Online), false);
            } else {
                b6Var.setTextColor(this.v);
                b6Var.l(LocaleController.formatUserStatus(i10, user), false);
            }
            y9Var.f(user, j9Var);
        } else if (chat != null) {
            b6Var.setTextColor(this.v);
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i11 = chat.participants_count;
                if (i11 != 0) {
                    b6Var.l(LocaleController.formatPluralString("Members", i11, new Object[0]), false);
                } else if (chat.has_geo) {
                    b6Var.l(LocaleController.getString(R.string.MegaLocation), false);
                } else if (ChatObject.isPublic(chat)) {
                    b6Var.l(LocaleController.getString(R.string.MegaPublic), false);
                } else {
                    b6Var.l(LocaleController.getString(R.string.MegaPrivate), false);
                }
            } else {
                int i12 = chat.participants_count;
                if (i12 != 0) {
                    b6Var.l(LocaleController.formatPluralString("Subscribers", i12, new Object[0]), false);
                } else if (ChatObject.isPublic(chat)) {
                    b6Var.l(LocaleController.getString(R.string.ChannelPublic), false);
                } else {
                    b6Var.l(LocaleController.getString(R.string.ChannelPrivate), false);
                }
            }
            y9Var.f(chat, j9Var);
        } else {
            y9Var.setImageDrawable(j9Var);
        }
        y9Var.setRoundRadius(AndroidUtilities.dp((chat == null || !chat.forum) ? 24.0f : 14.0f));
        ImageView imageView = this.e;
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
        this.c.setTypeface(typeface);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int i10;
        int i11;
        try {
            int i12 = this.v;
            int i13 = this.w;
            org.telegram.ui.ActionBar.u6 u6Var = this.a;
            if (this.x) {
                this.v = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.y6, u6Var);
                this.w = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.n6, u6Var);
            }
            org.telegram.ui.ActionBar.b6 b6Var = this.d;
            if (b6Var != null) {
                int textColor = b6Var.getTextColor();
                if (textColor == i13 && i13 != (i11 = this.w)) {
                    b6Var.setTextColor(i11);
                } else {
                    if (textColor != i12 || i12 == (i10 = this.v)) {
                        return;
                    }
                    b6Var.setTextColor(i10);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setCheckDisabled(boolean z10) {
    }
}
