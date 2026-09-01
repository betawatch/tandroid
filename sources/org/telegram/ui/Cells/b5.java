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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class b5 extends FrameLayout {
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public final int G;
    public int H;
    public a5 I;
    public final int J;
    public final oh.i7 K;
    public final z4 a;
    public final org.telegram.ui.ActionBar.l5 b;
    public final org.telegram.ui.ActionBar.l5 c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.ui.Components.z8 e;
    public final ImageView f;
    public ImageView h;
    public Object n;
    public TL_stories.StoryItem r;
    public CharSequence s;
    public CharSequence v;
    public String w;
    public int x;
    public TLRPC.FileLocation y;

    public b5(int i10, int i11, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context);
        this.H = -1;
        this.J = UserConfig.selectedAccount;
        this.K = new oh.i7(null, false);
        this.d = g6Var;
        this.E = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.y6, g6Var);
        this.F = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.n6, g6Var);
        this.G = i11;
        this.e = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        z4 z4Var = new z4(this, context, g6Var);
        this.a = z4Var;
        z4Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        boolean z10 = LocaleController.isRTL;
        addView(z4Var, k7.c6.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : i10 + 7, 8.0f, z10 ? i10 + 7 : 0.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.b = l5Var;
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        l5Var.setTextSize(17);
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z11 = LocaleController.isRTL;
        addView(l5Var, k7.c6.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 46.0f : i11 + 68, 11.5f, z11 ? i11 + 68 : 46.0f, 0.0f));
        NotificationCenter.listenEmojiLoading(l5Var);
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
        this.c = l5Var2;
        l5Var2.setTextSize(14);
        l5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z12 = LocaleController.isRTL;
        addView(l5Var2, k7.c6.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 28.0f : i11 + 68, 34.5f, z12 ? i11 + 68 : 28.0f, 0.0f));
        if (z4) {
            ImageView imageView = new ImageView(context);
            this.f = imageView;
            imageView.setFocusable(false);
            imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Vh, g6Var), 1, -1));
            imageView.setImageResource(R.drawable.ic_ab_other);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Uh, g6Var), PorterDuff.Mode.MULTIPLY));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, k7.c6.e(60, 64, (LocaleController.isRTL ? 3 : 5) | 48));
            imageView.setOnClickListener(new a(this, 7));
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrUserOptions));
        }
    }

    public final void a() {
        this.a.getImageReceiver().cancelLoadImage();
    }

    public final void b(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2, boolean z4) {
        float f10;
        float f11;
        org.telegram.ui.ActionBar.l5 l5Var = this.c;
        org.telegram.ui.ActionBar.l5 l5Var2 = this.b;
        if (tLObject == null) {
            this.v = null;
            this.s = null;
            this.n = null;
            l5Var2.l("", false);
            l5Var.l("", false);
            this.a.setImageDrawable(null);
            return;
        }
        this.v = charSequence2;
        this.s = charSequence;
        this.n = tLObject;
        ImageView imageView = this.f;
        int i10 = this.G;
        if (imageView != null) {
            boolean c3 = this.I.c(this, false);
            imageView.setVisibility(c3 ? 0 : 4);
            boolean z10 = LocaleController.isRTL;
            l5Var2.setLayoutParams(k7.c6.d(-1, 20.0f, (z10 ? 5 : 3) | 48, z10 ? c3 ? 46 : 28 : i10 + 68, (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f, LocaleController.isRTL ? i10 + 68 : c3 ? 46 : 28, 0.0f));
            boolean z11 = LocaleController.isRTL;
            int i11 = (z11 ? 5 : 3) | 48;
            float f12 = z11 ? c3 ? 46 : 28 : i10 + 68;
            if (z11) {
                f11 = i10 + 68;
            } else {
                f11 = c3 ? 46 : 28;
            }
            l5Var.setLayoutParams(k7.c6.d(-1, 20.0f, i11, f12, 34.5f, f11, 0.0f));
        } else {
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                boolean z12 = imageView2.getVisibility() == 0;
                boolean z13 = LocaleController.isRTL;
                l5Var2.setLayoutParams(k7.c6.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? z12 ? 54 : 28 : i10 + 68, (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f, LocaleController.isRTL ? i10 + 68 : z12 ? 54 : 28, 0.0f));
                boolean z14 = LocaleController.isRTL;
                int i12 = (z14 ? 5 : 3) | 48;
                float f13 = z14 ? z12 ? 54 : 28 : i10 + 68;
                if (z14) {
                    f10 = i10 + 68;
                } else {
                    f10 = z12 ? 54 : 28;
                }
                l5Var.setLayoutParams(k7.c6.d(-1, 20.0f, i12, f13, 34.5f, f10, 0.0f));
            }
        }
        this.C = z4;
        setWillNotDraw(true ^ z4);
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
        boolean z4 = obj instanceof TLRPC.User;
        z4 z4Var = this.a;
        org.telegram.ui.ActionBar.l5 l5Var = this.b;
        boolean z10 = true;
        int i11 = this.J;
        org.telegram.ui.Components.z8 z8Var = this.e;
        org.telegram.ui.ActionBar.l5 l5Var2 = this.c;
        if (!z4) {
            if (!(obj instanceof TLRPC.Chat)) {
                if (obj instanceof Integer) {
                    l5Var.l(this.s, false);
                    l5Var2.setTextColor(this.E);
                    l5Var2.l(this.v, false);
                    z8Var.g(3);
                    z4Var.f(null, "50_50", z8Var);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            TLRPC.FileLocation fileLocation3 = chatPhoto != null ? chatPhoto.photo_small : null;
            if (i10 != 0) {
                boolean z11 = (i10 & MessagesController.UPDATE_MASK_AVATAR) != 0 && (((fileLocation = this.y) != null && fileLocation3 == null) || ((fileLocation == null && fileLocation3 != null) || !(fileLocation == null || (fileLocation.volume_id == fileLocation3.volume_id && fileLocation.local_id == fileLocation3.local_id))));
                if (z11 || this.s != null || (r12 = this.w) == null || (i10 & MessagesController.UPDATE_MASK_NAME) == 0) {
                    str = null;
                } else {
                    str = chat.title;
                }
                z10 = z11;
                if (!z10) {
                    return;
                }
            } else {
                str = null;
            }
            z8Var.k(i11, chat);
            CharSequence charSequence = this.s;
            if (charSequence != null) {
                this.w = null;
                l5Var.l(charSequence, false);
            } else {
                if (str == null) {
                    str = chat.title;
                }
                this.w = str;
                l5Var.l(str, false);
            }
            if (this.v != null) {
                l5Var2.setTextColor(this.E);
                l5Var2.l(this.v, false);
            } else {
                l5Var2.setTextColor(this.E);
                if (chat.participants_count != 0) {
                    if (!ChatObject.isChannel(chat) || chat.megagroup) {
                        l5Var2.l(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), false);
                    } else {
                        l5Var2.l(LocaleController.formatPluralString("Subscribers", chat.participants_count, new Object[0]), false);
                    }
                } else if (chat.has_geo) {
                    l5Var2.l(LocaleController.getString(R.string.MegaLocation), false);
                } else if (ChatObject.isPublic(chat)) {
                    l5Var2.l(LocaleController.getString(R.string.MegaPublic), false);
                } else {
                    l5Var2.l(LocaleController.getString(R.string.MegaPrivate), false);
                }
            }
            this.y = fileLocation3;
            z4Var.e(chat, z8Var);
            return;
        }
        TLRPC.User user = (TLRPC.User) obj;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        TLRPC.FileLocation fileLocation4 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
        if (i10 != 0) {
            boolean z12 = (i10 & MessagesController.UPDATE_MASK_AVATAR) != 0 && (((fileLocation2 = this.y) != null && fileLocation4 == null) || ((fileLocation2 == null && fileLocation4 != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation4.volume_id && fileLocation2.local_id == fileLocation4.local_id))));
            if (!z12 && (i10 & MessagesController.UPDATE_MASK_STATUS) != 0) {
                TLRPC.UserStatus userStatus2 = user.status;
                if ((userStatus2 != null ? userStatus2.expires : 0) != this.x) {
                    z12 = true;
                }
            }
            if (z12 || this.s != null || this.w == null || (i10 & MessagesController.UPDATE_MASK_NAME) == 0) {
                str2 = null;
            } else {
                str2 = UserObject.getUserName(user);
            }
            z10 = z12;
            if (!z10) {
                return;
            }
        } else {
            str2 = null;
        }
        z8Var.m(i11, user);
        TLRPC.UserStatus userStatus3 = user.status;
        if (userStatus3 != null) {
            this.x = userStatus3.expires;
        } else {
            this.x = 0;
        }
        CharSequence charSequence2 = this.s;
        if (charSequence2 != null) {
            this.w = null;
            l5Var.l(charSequence2, false);
        } else {
            if (str2 == null) {
                str2 = UserObject.getUserName(user);
            }
            this.w = str2;
            l5Var.l(Emoji.replaceEmoji(str2, l5Var.getPaint().getFontMetricsInt(), false), false);
        }
        if (this.v != null) {
            l5Var2.setTextColor(this.E);
            l5Var2.l(this.v, false);
        } else {
            String publicUsername = DialogObject.getPublicUsername(user);
            if (user.bot) {
                l5Var2.setTextColor(this.E);
                if (this.D && !TextUtils.isEmpty(publicUsername)) {
                    l5Var2.l(publicUsername, false);
                } else if (user.bot_chat_history || this.B) {
                    l5Var2.l(LocaleController.getString(R.string.BotStatusRead), false);
                } else {
                    l5Var2.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                }
            } else if (this.D && !TextUtils.isEmpty(publicUsername)) {
                l5Var2.l(publicUsername, false);
                l5Var2.setTextColor(this.E);
            } else if (user.id == UserConfig.getInstance(i11).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i11).getCurrentTime()) || MessagesController.getInstance(i11).onlinePrivacy.containsKey(Long.valueOf(user.id)))) {
                l5Var2.setTextColor(this.F);
                l5Var2.l(LocaleController.getString(R.string.Online), false);
            } else {
                l5Var2.setTextColor(this.E);
                l5Var2.l(LocaleController.formatUserStatus(i11, user), false);
            }
        }
        this.y = fileLocation4;
        z4Var.e(user, z8Var);
    }

    public org.telegram.ui.Components.p9 getAvatarImageView() {
        return this.a;
    }

    public Object getCurrentObject() {
        return this.n;
    }

    public oh.i7 getStoryAvatarParams() {
        return this.K;
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
        if (this.C) {
            int i10 = this.H;
            if (i10 >= 0) {
                org.telegram.ui.ActionBar.k6.l0.setColor(org.telegram.ui.ActionBar.k6.v0(i10, this.d));
            }
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(68.0f) : 0), getMeasuredHeight() - 1, this.H >= 0 ? org.telegram.ui.ActionBar.k6.l0 : org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.C ? 1 : 0), TLObject.FLAG_30));
    }

    public void setCustomImageVisible(boolean z4) {
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(z4 ? 0 : 8);
    }

    public void setCustomRightImage(int i10) {
        ImageView imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setImageResource(i10);
        this.h.setScaleType(ImageView.ScaleType.CENTER);
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.mg, this.d), PorterDuff.Mode.MULTIPLY));
        addView(this.h, k7.c6.e(52, 64, (LocaleController.isRTL ? 3 : 5) | 48));
    }

    public void setDelegate(a5 a5Var) {
        this.I = a5Var;
    }

    public void setDividerColor(int i10) {
        this.H = i10;
    }

    public void setIsAdmin(boolean z4) {
        this.B = z4;
    }

    public void setNameColor(int i10) {
        this.b.setTextColor(i10);
    }
}
