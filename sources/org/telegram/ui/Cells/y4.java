package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class y4 extends FrameLayout {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public final int F;
    public int G;
    public x4 H;
    public final int I;
    public final jh.h7 J;
    public final w4 a;
    public final org.telegram.ui.ActionBar.h5 b;
    public final org.telegram.ui.ActionBar.h5 c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final org.telegram.ui.Components.y8 e;
    public final ImageView f;
    public ImageView h;
    public Object n;
    public TL_stories.StoryItem r;
    public CharSequence s;
    public CharSequence v;
    public String w;
    public int x;
    public TLRPC.FileLocation y;

    public y4(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.G = -1;
        this.I = UserConfig.selectedAccount;
        this.J = new jh.h7(null, false);
        this.d = c6Var;
        this.D = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y6, c6Var);
        this.E = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.n6, c6Var);
        this.F = i11;
        this.e = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        w4 w4Var = new w4(this, context, c6Var);
        this.a = w4Var;
        w4Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        boolean z11 = LocaleController.isRTL;
        addView(w4Var, h7.z5.d(46, 46.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : i10 + 7, 8.0f, z11 ? i10 + 7 : 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        h5Var.setTextSize(17);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z12 = LocaleController.isRTL;
        addView(h5Var, h7.z5.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 46.0f : i11 + 68, 11.5f, z12 ? i11 + 68 : 46.0f, 0.0f));
        NotificationCenter.listenEmojiLoading(h5Var);
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.c = h5Var2;
        h5Var2.setTextSize(14);
        h5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z13 = LocaleController.isRTL;
        addView(h5Var2, h7.z5.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 28.0f : i11 + 68, 34.5f, z13 ? i11 + 68 : 28.0f, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.f = imageView;
            imageView.setFocusable(false);
            imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Vh, c6Var), 1, -1));
            imageView.setImageResource(R.drawable.ic_ab_other);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Uh, c6Var), PorterDuff.Mode.MULTIPLY));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, h7.z5.e(60, 64, (LocaleController.isRTL ? 3 : 5) | 48));
            imageView.setOnClickListener(new a(this, 7));
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrUserOptions));
        }
    }

    public final void a() {
        this.a.getImageReceiver().cancelLoadImage();
    }

    public final void b(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        float f10;
        float f11;
        org.telegram.ui.ActionBar.h5 h5Var = this.c;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.b;
        if (tLObject == null) {
            this.v = null;
            this.s = null;
            this.n = null;
            h5Var2.l("", false);
            h5Var.l("", false);
            this.a.setImageDrawable(null);
            return;
        }
        this.v = charSequence2;
        this.s = charSequence;
        this.n = tLObject;
        ImageView imageView = this.f;
        int i10 = this.F;
        if (imageView != null) {
            boolean d = this.H.d(this, false);
            imageView.setVisibility(d ? 0 : 4);
            boolean z11 = LocaleController.isRTL;
            h5Var2.setLayoutParams(h7.z5.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? d ? 46 : 28 : i10 + 68, (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f, LocaleController.isRTL ? i10 + 68 : d ? 46 : 28, 0.0f));
            boolean z12 = LocaleController.isRTL;
            int i11 = (z12 ? 5 : 3) | 48;
            float f12 = z12 ? d ? 46 : 28 : i10 + 68;
            if (z12) {
                f11 = i10 + 68;
            } else {
                f11 = d ? 46 : 28;
            }
            h5Var.setLayoutParams(h7.z5.d(-1, 20.0f, i11, f12, 34.5f, f11, 0.0f));
        } else {
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                boolean z13 = imageView2.getVisibility() == 0;
                boolean z14 = LocaleController.isRTL;
                h5Var2.setLayoutParams(h7.z5.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? z13 ? 54 : 28 : i10 + 68, (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f, LocaleController.isRTL ? i10 + 68 : z13 ? 54 : 28, 0.0f));
                boolean z15 = LocaleController.isRTL;
                int i12 = (z15 ? 5 : 3) | 48;
                float f13 = z15 ? z13 ? 54 : 28 : i10 + 68;
                if (z15) {
                    f10 = i10 + 68;
                } else {
                    f10 = z13 ? 54 : 28;
                }
                h5Var.setLayoutParams(h7.z5.d(-1, 20.0f, i12, f13, 34.5f, f10, 0.0f));
            }
        }
        this.B = z10;
        setWillNotDraw(true ^ z10);
        c(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01a9, code lost:
    
        if (r13.equals(r12) == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        if (r12.equals(r17.w) == false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i10) {
        String str;
        TLRPC.FileLocation fileLocation;
        String str2;
        TLRPC.UserStatus userStatus;
        TLRPC.FileLocation fileLocation2;
        Object obj = this.n;
        if (obj == null) {
            return;
        }
        boolean z10 = obj instanceof TLRPC.User;
        w4 w4Var = this.a;
        org.telegram.ui.ActionBar.h5 h5Var = this.b;
        boolean z11 = true;
        int i11 = this.I;
        org.telegram.ui.Components.y8 y8Var = this.e;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.c;
        if (!z10) {
            if (!(obj instanceof TLRPC.Chat)) {
                if (obj instanceof Integer) {
                    h5Var.l(this.s, false);
                    h5Var2.setTextColor(this.D);
                    h5Var2.l(this.v, false);
                    y8Var.g(3);
                    w4Var.f(null, "50_50", y8Var);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            TLRPC.FileLocation fileLocation3 = chatPhoto != null ? chatPhoto.photo_small : null;
            if (i10 != 0) {
                boolean z12 = (i10 & MessagesController.UPDATE_MASK_AVATAR) != 0 && (((fileLocation = this.y) != null && fileLocation3 == null) || ((fileLocation == null && fileLocation3 != null) || !(fileLocation == null || (fileLocation.volume_id == fileLocation3.volume_id && fileLocation.local_id == fileLocation3.local_id))));
                if (z12 || this.s != null || (r12 = this.w) == null || (i10 & MessagesController.UPDATE_MASK_NAME) == 0) {
                    str = null;
                } else {
                    str = chat.title;
                }
                z11 = z12;
                if (!z11) {
                    return;
                }
            } else {
                str = null;
            }
            y8Var.k(i11, chat);
            CharSequence charSequence = this.s;
            if (charSequence != null) {
                this.w = null;
                h5Var.l(charSequence, false);
            } else {
                if (str == null) {
                    str = chat.title;
                }
                this.w = str;
                h5Var.l(str, false);
            }
            if (this.v != null) {
                h5Var2.setTextColor(this.D);
                h5Var2.l(this.v, false);
            } else {
                h5Var2.setTextColor(this.D);
                if (chat.participants_count != 0) {
                    if (!ChatObject.isChannel(chat) || chat.megagroup) {
                        h5Var2.l(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), false);
                    } else {
                        h5Var2.l(LocaleController.formatPluralString("Subscribers", chat.participants_count, new Object[0]), false);
                    }
                } else if (chat.has_geo) {
                    h5Var2.l(LocaleController.getString(R.string.MegaLocation), false);
                } else if (ChatObject.isPublic(chat)) {
                    h5Var2.l(LocaleController.getString(R.string.MegaPublic), false);
                } else {
                    h5Var2.l(LocaleController.getString(R.string.MegaPrivate), false);
                }
            }
            this.y = fileLocation3;
            w4Var.e(chat, y8Var);
            return;
        }
        TLRPC.User user = (TLRPC.User) obj;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        TLRPC.FileLocation fileLocation4 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
        if (i10 != 0) {
            boolean z13 = (i10 & MessagesController.UPDATE_MASK_AVATAR) != 0 && (((fileLocation2 = this.y) != null && fileLocation4 == null) || ((fileLocation2 == null && fileLocation4 != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation4.volume_id && fileLocation2.local_id == fileLocation4.local_id))));
            if (!z13 && (i10 & MessagesController.UPDATE_MASK_STATUS) != 0) {
                TLRPC.UserStatus userStatus2 = user.status;
                if ((userStatus2 != null ? userStatus2.expires : 0) != this.x) {
                    z13 = true;
                }
            }
            if (z13 || this.s != null || this.w == null || (i10 & MessagesController.UPDATE_MASK_NAME) == 0) {
                str2 = null;
            } else {
                str2 = UserObject.getUserName(user);
            }
            z11 = z13;
            if (!z11) {
                return;
            }
        } else {
            str2 = null;
        }
        y8Var.m(i11, user);
        TLRPC.UserStatus userStatus3 = user.status;
        if (userStatus3 != null) {
            this.x = userStatus3.expires;
        } else {
            this.x = 0;
        }
        CharSequence charSequence2 = this.s;
        if (charSequence2 != null) {
            this.w = null;
            h5Var.l(charSequence2, false);
        } else {
            if (str2 == null) {
                str2 = UserObject.getUserName(user);
            }
            this.w = str2;
            h5Var.l(Emoji.replaceEmoji(str2, h5Var.getPaint().getFontMetricsInt(), false), false);
        }
        if (this.v != null) {
            h5Var2.setTextColor(this.D);
            h5Var2.l(this.v, false);
        } else {
            String publicUsername = DialogObject.getPublicUsername(user);
            if (user.bot) {
                h5Var2.setTextColor(this.D);
                if (this.C && !TextUtils.isEmpty(publicUsername)) {
                    h5Var2.l(publicUsername, false);
                } else if (user.bot_chat_history || this.A) {
                    h5Var2.l(LocaleController.getString(R.string.BotStatusRead), false);
                } else {
                    h5Var2.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                }
            } else if (this.C && !TextUtils.isEmpty(publicUsername)) {
                h5Var2.l(publicUsername, false);
                h5Var2.setTextColor(this.D);
            } else if (user.id == UserConfig.getInstance(i11).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i11).getCurrentTime()) || MessagesController.getInstance(i11).onlinePrivacy.containsKey(Long.valueOf(user.id)))) {
                h5Var2.setTextColor(this.E);
                h5Var2.l(LocaleController.getString(R.string.Online), false);
            } else {
                h5Var2.setTextColor(this.D);
                h5Var2.l(LocaleController.formatUserStatus(i11, user), false);
            }
        }
        this.y = fileLocation4;
        w4Var.e(user, y8Var);
    }

    public org.telegram.ui.Components.n9 getAvatarImageView() {
        return this.a;
    }

    public Object getCurrentObject() {
        return this.n;
    }

    public jh.h7 getStoryAvatarParams() {
        return this.J;
    }

    public TL_stories.StoryItem getStoryItem() {
        return this.r;
    }

    public long getUserId() {
        Object obj = this.n;
        if (obj instanceof TLRPC.User) {
            return ((TLRPC.User) obj).id;
        }
        return 0L;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.B) {
            int i10 = this.G;
            if (i10 >= 0) {
                org.telegram.ui.ActionBar.g6.l0.setColor(org.telegram.ui.ActionBar.g6.v0(i10, this.d));
            }
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(68.0f) : 0), getMeasuredHeight() - 1, this.G >= 0 ? org.telegram.ui.ActionBar.g6.l0 : org.telegram.ui.ActionBar.g6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.B ? 1 : 0), TLObject.FLAG_30));
    }

    public void setCustomImageVisible(boolean z10) {
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(z10 ? 0 : 8);
    }

    public void setCustomRightImage(int i10) {
        ImageView imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setImageResource(i10);
        this.h.setScaleType(ImageView.ScaleType.CENTER);
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.mg, this.d), PorterDuff.Mode.MULTIPLY));
        addView(this.h, h7.z5.e(52, 64, (LocaleController.isRTL ? 3 : 5) | 48));
    }

    public void setDelegate(x4 x4Var) {
        this.H = x4Var;
    }

    public void setDividerColor(int i10) {
        this.G = i10;
    }

    public void setIsAdmin(boolean z10) {
        this.A = z10;
    }

    public void setNameColor(int i10) {
        this.b.setTextColor(i10);
    }
}
