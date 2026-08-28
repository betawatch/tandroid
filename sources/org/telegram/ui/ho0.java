package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ho0 extends View {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final Drawable e;
    public final org.telegram.ui.Components.nz0 f;
    public final lo0 h;
    public final Paint n;
    public org.telegram.ui.Components.nz0 r;
    public int s;
    public boolean v;
    public vo0 w;
    public vo0 x;

    public ho0(int i9, long j10, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i10;
        this.n = new Paint(1);
        this.s = -1;
        MessagesController messagesController = MessagesController.getInstance(i9);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        this.a = i9;
        boolean z10 = j10 < 0;
        this.b = z10;
        boolean z11 = z10 && !ChatObject.isChannelAndNotMegaGroup(chat);
        this.c = z11;
        this.d = b6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.menu_edit_appearance).mutate();
        this.e = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q6, b6Var), PorterDuff.Mode.SRC_IN));
        String string = LocaleController.getString(z10 ? z11 ? R.string.ChangeGroupAppearance : R.string.ChangeChannelNameColor2 : R.string.ChangeUserNameColor);
        if (z10 && !z11 && MessagesController.getInstance(i9).getMainSettings().getInt("boostingappearance", 0) < 3) {
            MessagesController.PeerColors peerColors = messagesController.peerColors;
            int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (peerColors != null) {
                int min = Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, peerColors.maxLevel());
                int max = Math.max(0, messagesController.peerColors.maxLevel());
                int min2 = Math.min(min, messagesController.peerColors.minLevel());
                int max2 = Math.max(max, messagesController.peerColors.minLevel());
                i11 = min2;
                i10 = max2;
            } else {
                i10 = 0;
            }
            int min3 = Math.min(i11, messagesController.channelBgIconLevelMin);
            int min4 = Math.min(i10, messagesController.channelBgIconLevelMin);
            MessagesController.PeerColors peerColors2 = messagesController.profilePeerColors;
            if (peerColors2 != null) {
                int min5 = Math.min(min3, peerColors2.maxLevel());
                int max3 = Math.max(min4, messagesController.profilePeerColors.maxLevel());
                min3 = Math.min(min5, messagesController.profilePeerColors.minLevel());
                min4 = Math.max(max3, messagesController.profilePeerColors.minLevel());
            }
            int min6 = Math.min(min3, messagesController.channelProfileIconLevelMin);
            int max4 = Math.max(min4, messagesController.channelProfileIconLevelMin);
            int min7 = Math.min(min6, messagesController.channelEmojiStatusLevelMin);
            int max5 = Math.max(max4, messagesController.channelEmojiStatusLevelMin);
            int min8 = Math.min(min7, messagesController.channelWallpaperLevelMin);
            int max6 = Math.max(max5, messagesController.channelWallpaperLevelMin);
            int min9 = Math.min(min8, messagesController.channelCustomWallpaperLevelMin);
            int max7 = Math.max(max6, messagesController.channelCustomWallpaperLevelMin);
            int i12 = chat != null ? chat.level : 0;
            if (i12 < max7) {
                this.h = new lo0(Math.max(i12, min9), context, b6Var, true);
            }
        }
        setContentDescription(string);
        this.f = new org.telegram.ui.Components.nz0(string, 16.0f, null);
        a();
    }

    public final void a() {
        Paint paint;
        int i9;
        boolean z10 = this.b;
        int i10 = z10 ? org.telegram.ui.ActionBar.f6.m6 : org.telegram.ui.ActionBar.f6.q6;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        this.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), PorterDuff.Mode.SRC_IN));
        this.f.o(org.telegram.ui.ActionBar.f6.v0(z10 ? org.telegram.ui.ActionBar.f6.G6 : org.telegram.ui.ActionBar.f6.q6, b6Var));
        if (this.r == null || (paint = this.n) == null || (i9 = this.s) == -1) {
            return;
        }
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        this.r.o(v02);
        paint.setColor(org.telegram.ui.ActionBar.f6.l1(0.1f, v02));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(28.0f);
        if (LocaleController.isRTL) {
            dp = getMeasuredWidth() - dp;
        }
        Drawable drawable = this.e;
        ff.s.d(drawable, dp, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(171.0f);
        lo0 lo0Var = this.h;
        int dp2 = lo0Var != null ? AndroidUtilities.dp(8.0f) + lo0Var.getIntrinsicWidth() : 0;
        org.telegram.ui.Components.nz0 nz0Var = this.f;
        nz0Var.p = measuredWidth - dp2;
        float measuredWidth2 = LocaleController.isRTL ? (getMeasuredWidth() - nz0Var.l()) - AndroidUtilities.dp(58.0f) : AndroidUtilities.dp(58.0f);
        nz0Var.e(canvas, measuredWidth2, getMeasuredHeight() / 2.0f);
        if (lo0Var != null) {
            int l10 = (int) (nz0Var.l() + measuredWidth2 + AndroidUtilities.dp(6.0f));
            lo0Var.setBounds(l10, 0, l10, getHeight());
            lo0Var.draw(canvas);
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        boolean z10 = this.c;
        if (z10 && this.x != null) {
            int dp3 = LocaleController.isRTL ? AndroidUtilities.dp(58.0f) : getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            this.x.setBounds(dp3 - AndroidUtilities.dp(11.0f), org.telegram.messenger.ll.y(11.0f, getMeasuredHeight(), 2), dp3, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            this.x.f(AndroidUtilities.dpf2(3.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var));
            this.x.draw(canvas);
        } else if (this.w != null && this.x != null) {
            int dp4 = LocaleController.isRTL ? AndroidUtilities.dp(58.0f) : getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            this.x.setBounds(dp4 - AndroidUtilities.dp(11.0f), org.telegram.messenger.ll.y(11.0f, getMeasuredHeight(), 2), dp4, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            vo0 vo0Var = this.x;
            float dpf2 = AndroidUtilities.dpf2(3.0f);
            int i9 = org.telegram.ui.ActionBar.f6.d6;
            vo0Var.f(dpf2, org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
            this.x.draw(canvas);
            int dp5 = dp4 - AndroidUtilities.dp(18.0f);
            this.w.setBounds(dp5 - AndroidUtilities.dp(11.0f), org.telegram.messenger.ll.y(11.0f, getMeasuredHeight(), 2), dp5, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            this.w.f(AndroidUtilities.dpf2(3.0f), org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
            this.w.draw(canvas);
        } else if (this.r != null && !z10) {
            float measuredWidth3 = (int) ((getMeasuredWidth() - AndroidUtilities.dp(116.0f)) - Math.min(nz0Var.l() + (lo0Var == null ? 0 : AndroidUtilities.dp(12.0f) + lo0Var.getIntrinsicWidth()), getMeasuredWidth() - AndroidUtilities.dp(164.0f)));
            int min = (int) Math.min(this.r.l(), measuredWidth3);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(LocaleController.isRTL ? AndroidUtilities.dp(15.0f) : org.telegram.messenger.l0.B(33.0f, getMeasuredWidth(), min), (getMeasuredHeight() - AndroidUtilities.dp(22.0f)) / 2.0f, LocaleController.isRTL ? AndroidUtilities.dp(33.0f) + min : getMeasuredWidth() - AndroidUtilities.dp(15.0f), (AndroidUtilities.dp(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.n);
            org.telegram.ui.Components.nz0 nz0Var2 = this.r;
            nz0Var2.p = measuredWidth3;
            nz0Var2.e(canvas, LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : org.telegram.messenger.l0.B(24.0f, getMeasuredWidth(), min), getMeasuredHeight() / 2.0f);
        }
        if (this.v) {
            Paint O = b6Var != null ? b6Var.O("paintDivider") : null;
            if (O == null) {
                O = org.telegram.ui.ActionBar.f6.k0;
            }
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(58.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(58.0f) : 0), getMeasuredHeight() - 1, O);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.v ? 1 : 0), TLObject.FLAG_30));
    }

    public void set(TLRPC.User user) {
        vo0 vo0Var;
        int v02;
        ArrayList<Integer> arrayList;
        if (user == null) {
            return;
        }
        String str = user.first_name;
        String trim = str == null ? "" : str.trim();
        int indexOf = trim.indexOf(" ");
        if (indexOf > 0) {
            trim = trim.substring(0, indexOf);
        }
        this.r = new org.telegram.ui.Components.nz0(Emoji.replaceEmoji(trim, org.telegram.ui.ActionBar.f6.o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
        vo0 vo0Var2 = this.w;
        if (vo0Var2 != null) {
            vo0Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i9 = this.a;
        if (z10) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i10 = vo0.j;
            int i11 = tL_emojiStatusCollectible.center_color | (-16777216);
            this.w = new vo0(tL_emojiStatusCollectible.document_id, i11, i11, i11);
        } else {
            if (UserObject.getProfileColorId(user) >= 0) {
                vo0Var = vo0.c(i9, UserObject.getProfileColorId(user));
                vo0Var.a = AndroidUtilities.dp(11.0f);
                vo0Var.d();
            } else {
                vo0Var = null;
            }
            this.w = vo0Var;
        }
        vo0 vo0Var3 = this.w;
        if (vo0Var3 != null) {
            vo0Var3.e(this);
        }
        TLRPC.PeerColor peerColor = user.color;
        boolean z11 = peerColor instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.n;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        if (z11) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
            boolean a2 = b6Var != null ? b6Var.a() : org.telegram.ui.ActionBar.f6.I.q();
            int i12 = (!a2 || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
            if (!a2 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                arrayList = tL_peerColorCollectible.colors;
            }
            int intValue = arrayList.get(0).intValue() | (-16777216);
            int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue;
            int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue;
            this.r.o(i12);
            paint.setColor(org.telegram.ui.ActionBar.f6.l1(0.1f, i12));
            vo0 vo0Var4 = new vo0(tL_peerColorCollectible.gift_emoji_id, intValue, intValue2, intValue3);
            vo0Var4.a = AndroidUtilities.dp(11.0f);
            vo0Var4.d();
            this.x = vo0Var4;
            vo0Var4.e(this);
            return;
        }
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            int i13 = org.telegram.ui.ActionBar.f6.r8[colorId];
            this.s = i13;
            v02 = org.telegram.ui.ActionBar.f6.v0(i13, b6Var);
        } else {
            MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
            if (color != null) {
                this.s = -1;
                v02 = color.getColor1();
            } else {
                int i14 = org.telegram.ui.ActionBar.f6.r8[0];
                this.s = i14;
                v02 = org.telegram.ui.ActionBar.f6.v0(i14, b6Var);
            }
        }
        this.r.o(v02);
        paint.setColor(org.telegram.ui.ActionBar.f6.l1(0.1f, v02));
        vo0 a3 = vo0.a(i9, colorId);
        a3.a = AndroidUtilities.dp(11.0f);
        a3.d();
        this.x = a3;
    }
}
