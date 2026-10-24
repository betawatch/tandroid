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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class va extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 a;
    public final org.telegram.ui.Components.w9 b;
    public final ci.k4 c;
    public final org.telegram.ui.ActionBar.n5 d;
    public final ImageView e;
    public final org.telegram.ui.Components.h9 f;
    public CharSequence h;
    public int n;
    public String r;
    public final int s;
    public int v;
    public int w;
    public final boolean x;

    public va(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.s = UserConfig.selectedAccount;
        this.x = true;
        this.a = g6Var;
        this.v = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, g6Var);
        this.w = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.n6, g6Var);
        this.f = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z10 = LocaleController.isRTL;
        addView(w9Var, w7.z5.d(48, 48.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11, 11.0f, z10 ? 11 : 0.0f, 0.0f));
        ci.k4 k4Var = new ci.k4(context, 3);
        this.c = k4Var;
        NotificationCenter.listenEmojiLoading(k4Var);
        org.telegram.ui.ActionBar.r6.Z(k4Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        k4Var.setTextSize(17);
        k4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z11 = LocaleController.isRTL;
        addView(k4Var, w7.z5.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 28 : 72, 14.5f, z11 ? 72 : 28, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var;
        n5Var.setTextSize(14);
        n5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z12 = LocaleController.isRTL;
        addView(n5Var, w7.z5.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 28.0f : 72, 37.5f, z12 ? 72 : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.m6, g6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        boolean z13 = LocaleController.isRTL;
        addView(imageView, w7.z5.d(-2, -2.0f, (z13 ? 5 : 3) | 16, z13 ? 0.0f : 16.0f, 0.0f, z13 ? 16.0f : 0.0f, 0.0f));
    }

    public final void a(TLObject tLObject, String str) {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.UserStatus userStatus;
        org.telegram.ui.Components.w9 w9Var = this.b;
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        ci.k4 k4Var = this.c;
        if (tLObject == null && str == null) {
            this.h = null;
            k4Var.k("");
            n5Var.l("", false);
            w9Var.setImageDrawable(null);
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
        org.telegram.ui.Components.h9 h9Var = this.f;
        if (user != null) {
            h9Var.m(i10, user);
        } else if (chat != null) {
            h9Var.k(i10, chat);
        } else {
            h9Var.n(this.n, "#", null);
        }
        if (user != null) {
            this.r = UserObject.getUserName(user);
        } else {
            this.r = chat.title;
        }
        k4Var.k(this.r);
        if (this.h != null) {
            n5Var.setTextColor(this.v);
            n5Var.l(this.h, false);
            if (w9Var != null) {
                w9Var.e(user, h9Var);
            }
        } else if (user != null) {
            if (user.bot) {
                n5Var.setTextColor(this.v);
                if (user.bot_chat_history) {
                    n5Var.l(LocaleController.getString(R.string.BotStatusRead), false);
                } else {
                    n5Var.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                }
            } else if (user.id == UserConfig.getInstance(i10).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i10).getCurrentTime()) || MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(user.id)))) {
                n5Var.setTextColor(this.w);
                n5Var.l(LocaleController.getString(R.string.Online), false);
            } else {
                n5Var.setTextColor(this.v);
                n5Var.l(LocaleController.formatUserStatus(i10, user), false);
            }
            w9Var.e(user, h9Var);
        } else if (chat != null) {
            n5Var.setTextColor(this.v);
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i11 = chat.participants_count;
                if (i11 != 0) {
                    n5Var.l(LocaleController.formatPluralString("Members", i11, new Object[0]), false);
                } else if (chat.has_geo) {
                    n5Var.l(LocaleController.getString(R.string.MegaLocation), false);
                } else if (ChatObject.isPublic(chat)) {
                    n5Var.l(LocaleController.getString(R.string.MegaPublic), false);
                } else {
                    n5Var.l(LocaleController.getString(R.string.MegaPrivate), false);
                }
            } else {
                int i12 = chat.participants_count;
                if (i12 != 0) {
                    n5Var.l(LocaleController.formatPluralString("Subscribers", i12, new Object[0]), false);
                } else if (ChatObject.isPublic(chat)) {
                    n5Var.l(LocaleController.getString(R.string.ChannelPublic), false);
                } else {
                    n5Var.l(LocaleController.getString(R.string.ChannelPrivate), false);
                }
            }
            w9Var.e(chat, h9Var);
        } else {
            w9Var.setImageDrawable(h9Var);
        }
        w9Var.setRoundRadius(AndroidUtilities.dp((chat == null || !chat.forum) ? 24.0f : 14.0f));
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i10;
        int i11;
        try {
            int i12 = this.v;
            int i13 = this.w;
            org.telegram.ui.ActionBar.g6 g6Var = this.a;
            if (this.x) {
                this.v = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, g6Var);
                this.w = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.n6, g6Var);
            }
            org.telegram.ui.ActionBar.n5 n5Var = this.d;
            if (n5Var != null) {
                int textColor = n5Var.getTextColor();
                if (textColor == i13 && i13 != (i11 = this.w)) {
                    n5Var.setTextColor(i11);
                } else {
                    if (textColor != i12 || i12 == (i10 = this.v)) {
                        return;
                    }
                    n5Var.setTextColor(i10);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setCheckDisabled(boolean z10) {
    }
}
