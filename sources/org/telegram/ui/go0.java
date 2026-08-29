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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class go0 extends View {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final Drawable e;
    public final org.telegram.ui.Components.zz0 f;
    public final ko0 h;
    public final Paint n;
    public org.telegram.ui.Components.zz0 r;
    public int s;
    public boolean v;
    public uo0 w;
    public uo0 x;

    public go0(int i10, long j10, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i11;
        this.n = new Paint(1);
        this.s = -1;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        this.a = i10;
        boolean z10 = j10 < 0;
        this.b = z10;
        boolean z11 = z10 && !ChatObject.isChannelAndNotMegaGroup(chat);
        this.c = z11;
        this.d = c6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.menu_edit_appearance).mutate();
        this.e = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q6, c6Var), PorterDuff.Mode.SRC_IN));
        String string = LocaleController.getString(z10 ? z11 ? R.string.ChangeGroupAppearance : R.string.ChangeChannelNameColor2 : R.string.ChangeUserNameColor);
        if (z10 && !z11 && MessagesController.getInstance(i10).getMainSettings().getInt("boostingappearance", 0) < 3) {
            MessagesController.PeerColors peerColors = messagesController.peerColors;
            int i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (peerColors != null) {
                int min = Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, peerColors.maxLevel());
                int max = Math.max(0, messagesController.peerColors.maxLevel());
                int min2 = Math.min(min, messagesController.peerColors.minLevel());
                int max2 = Math.max(max, messagesController.peerColors.minLevel());
                i12 = min2;
                i11 = max2;
            } else {
                i11 = 0;
            }
            int min3 = Math.min(i12, messagesController.channelBgIconLevelMin);
            int min4 = Math.min(i11, messagesController.channelBgIconLevelMin);
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
            int i13 = chat != null ? chat.level : 0;
            if (i13 < max7) {
                this.h = new ko0(Math.max(i13, min9), context, c6Var, true);
            }
        }
        setContentDescription(string);
        this.f = new org.telegram.ui.Components.zz0(string, 16.0f, null);
        a();
    }

    public final void a() {
        Paint paint;
        int i10;
        boolean z10 = this.b;
        int i11 = z10 ? org.telegram.ui.ActionBar.g6.m6 : org.telegram.ui.ActionBar.g6.q6;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        this.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.SRC_IN));
        this.f.o(org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.G6 : org.telegram.ui.ActionBar.g6.q6, c6Var));
        if (this.r == null || (paint = this.n) == null || (i10 = this.s) == -1) {
            return;
        }
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        this.r.o(v02);
        paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.1f, v02));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(28.0f);
        if (LocaleController.isRTL) {
            dp = getMeasuredWidth() - dp;
        }
        Drawable drawable = this.e;
        jf.r.d(drawable, dp, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(171.0f);
        ko0 ko0Var = this.h;
        int dp2 = ko0Var != null ? AndroidUtilities.dp(8.0f) + ko0Var.getIntrinsicWidth() : 0;
        org.telegram.ui.Components.zz0 zz0Var = this.f;
        zz0Var.p = measuredWidth - dp2;
        float measuredWidth2 = LocaleController.isRTL ? (getMeasuredWidth() - zz0Var.l()) - AndroidUtilities.dp(58.0f) : AndroidUtilities.dp(58.0f);
        zz0Var.e(canvas, measuredWidth2, getMeasuredHeight() / 2.0f);
        if (ko0Var != null) {
            int l10 = (int) (zz0Var.l() + measuredWidth2 + AndroidUtilities.dp(6.0f));
            ko0Var.setBounds(l10, 0, l10, getHeight());
            ko0Var.draw(canvas);
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        boolean z10 = this.c;
        if (z10 && this.x != null) {
            int dp3 = LocaleController.isRTL ? AndroidUtilities.dp(58.0f) : getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            this.x.setBounds(dp3 - AndroidUtilities.dp(11.0f), b.x(11.0f, getMeasuredHeight(), 2), dp3, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            this.x.f(AndroidUtilities.dpf2(3.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var));
            this.x.draw(canvas);
        } else if (this.w != null && this.x != null) {
            int dp4 = LocaleController.isRTL ? AndroidUtilities.dp(58.0f) : getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            this.x.setBounds(dp4 - AndroidUtilities.dp(11.0f), b.x(11.0f, getMeasuredHeight(), 2), dp4, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            uo0 uo0Var = this.x;
            float dpf2 = AndroidUtilities.dpf2(3.0f);
            int i10 = org.telegram.ui.ActionBar.g6.d6;
            uo0Var.f(dpf2, org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            this.x.draw(canvas);
            int dp5 = dp4 - AndroidUtilities.dp(18.0f);
            this.w.setBounds(dp5 - AndroidUtilities.dp(11.0f), b.x(11.0f, getMeasuredHeight(), 2), dp5, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            this.w.f(AndroidUtilities.dpf2(3.0f), org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            this.w.draw(canvas);
        } else if (this.r != null && !z10) {
            float measuredWidth3 = (int) ((getMeasuredWidth() - AndroidUtilities.dp(116.0f)) - Math.min(zz0Var.l() + (ko0Var == null ? 0 : AndroidUtilities.dp(12.0f) + ko0Var.getIntrinsicWidth()), getMeasuredWidth() - AndroidUtilities.dp(164.0f)));
            int min = (int) Math.min(this.r.l(), measuredWidth3);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(LocaleController.isRTL ? AndroidUtilities.dp(15.0f) : org.telegram.messenger.x3.B(33.0f, getMeasuredWidth(), min), (getMeasuredHeight() - AndroidUtilities.dp(22.0f)) / 2.0f, LocaleController.isRTL ? AndroidUtilities.dp(33.0f) + min : getMeasuredWidth() - AndroidUtilities.dp(15.0f), (AndroidUtilities.dp(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.n);
            org.telegram.ui.Components.zz0 zz0Var2 = this.r;
            zz0Var2.p = measuredWidth3;
            zz0Var2.e(canvas, LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : org.telegram.messenger.x3.B(24.0f, getMeasuredWidth(), min), getMeasuredHeight() / 2.0f);
        }
        if (this.v) {
            Paint G = c6Var != null ? c6Var.G("paintDivider") : null;
            if (G == null) {
                G = org.telegram.ui.ActionBar.g6.k0;
            }
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(58.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(58.0f) : 0), getMeasuredHeight() - 1, G);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.v ? 1 : 0), TLObject.FLAG_30));
    }

    public void set(TLRPC.User user) {
        uo0 uo0Var;
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
        this.r = new org.telegram.ui.Components.zz0(Emoji.replaceEmoji(trim, org.telegram.ui.ActionBar.g6.o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
        uo0 uo0Var2 = this.w;
        if (uo0Var2 != null) {
            uo0Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i10 = this.a;
        if (z10) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i11 = uo0.j;
            int i12 = tL_emojiStatusCollectible.center_color | (-16777216);
            this.w = new uo0(tL_emojiStatusCollectible.document_id, i12, i12, i12);
        } else {
            if (UserObject.getProfileColorId(user) >= 0) {
                uo0Var = uo0.c(i10, UserObject.getProfileColorId(user));
                uo0Var.a = AndroidUtilities.dp(11.0f);
                uo0Var.d();
            } else {
                uo0Var = null;
            }
            this.w = uo0Var;
        }
        uo0 uo0Var3 = this.w;
        if (uo0Var3 != null) {
            uo0Var3.e(this);
        }
        TLRPC.PeerColor peerColor = user.color;
        boolean z11 = peerColor instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.n;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (z11) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
            boolean a2 = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
            int i13 = (!a2 || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
            if (!a2 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                arrayList = tL_peerColorCollectible.colors;
            }
            int intValue = arrayList.get(0).intValue() | (-16777216);
            int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue;
            int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue;
            this.r.o(i13);
            paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.1f, i13));
            uo0 uo0Var4 = new uo0(tL_peerColorCollectible.gift_emoji_id, intValue, intValue2, intValue3);
            uo0Var4.a = AndroidUtilities.dp(11.0f);
            uo0Var4.d();
            this.x = uo0Var4;
            uo0Var4.e(this);
            return;
        }
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            int i14 = org.telegram.ui.ActionBar.g6.r8[colorId];
            this.s = i14;
            v02 = org.telegram.ui.ActionBar.g6.v0(i14, c6Var);
        } else {
            MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
            if (color != null) {
                this.s = -1;
                v02 = color.getColor1();
            } else {
                int i15 = org.telegram.ui.ActionBar.g6.r8[0];
                this.s = i15;
                v02 = org.telegram.ui.ActionBar.g6.v0(i15, c6Var);
            }
        }
        this.r.o(v02);
        paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.1f, v02));
        uo0 a10 = uo0.a(i10, colorId);
        a10.a = AndroidUtilities.dp(11.0f);
        a10.d();
        this.x = a10;
    }
}
