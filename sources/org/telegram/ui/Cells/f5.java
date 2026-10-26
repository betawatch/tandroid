package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
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
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gb1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class f5 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final int J;
    public int K;
    public e5 L;
    public final int M;
    public final di.w7 N;
    public boolean O;
    public final d5 a;
    public final org.telegram.ui.ActionBar.b6 b;
    public final org.telegram.ui.ActionBar.b6 c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final org.telegram.ui.Components.j9 e;
    public final ImageView f;
    public ImageView h;
    public Object n;
    public TL_stories.StoryItem r;
    public CharSequence s;
    public CharSequence v;
    public String w;
    public int x;
    public TLRPC.FileLocation y;

    public f5(int i10, int i11, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        this.K = -1;
        this.M = UserConfig.selectedAccount;
        this.N = new di.w7(null, false);
        this.d = u6Var;
        this.H = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.y6, u6Var);
        this.I = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.n6, u6Var);
        this.J = i11;
        this.e = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        d5 d5Var = new d5(this, context, u6Var);
        this.a = d5Var;
        d5Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        boolean z11 = LocaleController.isRTL;
        addView(d5Var, gb1.h(46, 46.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : i10 + 7, 8.0f, z11 ? i10 + 7 : 0.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.b = b6Var;
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        b6Var.setTextSize(17);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z12 = LocaleController.isRTL;
        addView(b6Var, gb1.h(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 46.0f : i11 + 68, 11.5f, z12 ? i11 + 68 : 46.0f, 0.0f));
        NotificationCenter.listenEmojiLoading(b6Var);
        org.telegram.ui.ActionBar.b6 b6Var2 = new org.telegram.ui.ActionBar.b6(context);
        this.c = b6Var2;
        b6Var2.setTextSize(14);
        b6Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z13 = LocaleController.isRTL;
        addView(b6Var2, gb1.h(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 28.0f : i11 + 68, 34.5f, z13 ? i11 + 68 : 28.0f, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.f = imageView;
            imageView.setFocusable(false);
            int i12 = org.telegram.ui.ActionBar.y6.Vh;
            y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i12, u6Var), 1, -1);
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
            imageView.setBackground(g02);
            org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N, u6Var);
            imageView.setImageResource(R.drawable.ic_ab_other);
            org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.Uh, u6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, gb1.i(60, 64, (LocaleController.isRTL ? 3 : 5) | 48));
            imageView.setOnClickListener(new a(this, 7));
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrUserOptions));
        }
    }

    public final void a() {
        this.a.getImageReceiver().cancelLoadImage();
    }

    public final void b() {
        if (this.O) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.y6.y6;
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.n6, u6Var);
        if (w02 == this.H && w03 == this.I) {
            return;
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        if (b6Var != null) {
            int textColor = b6Var.getTextColor();
            if (textColor == this.H) {
                b6Var.setTextColor(w02);
            } else if (textColor == this.I) {
                b6Var.setTextColor(w03);
            }
        }
        this.H = w02;
        this.I = w03;
    }

    public final void c(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        float f7;
        float f10;
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        org.telegram.ui.ActionBar.b6 b6Var2 = this.b;
        if (tLObject == null) {
            this.v = null;
            this.s = null;
            this.n = null;
            b6Var2.l("", false);
            b6Var.l("", false);
            this.a.setImageDrawable(null);
            return;
        }
        this.v = charSequence2;
        this.s = charSequence;
        this.n = tLObject;
        ImageView imageView = this.f;
        int i10 = this.J;
        if (imageView != null) {
            boolean b10 = this.L.b(this, false);
            imageView.setVisibility(b10 ? 0 : 4);
            boolean z11 = LocaleController.isRTL;
            b6Var2.setLayoutParams(gb1.h(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? b10 ? 46 : 28 : i10 + 68, (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f, LocaleController.isRTL ? i10 + 68 : b10 ? 46 : 28, 0.0f));
            boolean z12 = LocaleController.isRTL;
            int i11 = (z12 ? 5 : 3) | 48;
            float f11 = z12 ? b10 ? 46 : 28 : i10 + 68;
            if (z12) {
                f10 = i10 + 68;
            } else {
                f10 = b10 ? 46 : 28;
            }
            b6Var.setLayoutParams(gb1.h(-1, 20.0f, i11, f11, 34.5f, f10, 0.0f));
        } else {
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                boolean z13 = imageView2.getVisibility() == 0;
                boolean z14 = LocaleController.isRTL;
                b6Var2.setLayoutParams(gb1.h(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? z13 ? 54 : 28 : i10 + 68, (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f, LocaleController.isRTL ? i10 + 68 : z13 ? 54 : 28, 0.0f));
                boolean z15 = LocaleController.isRTL;
                int i12 = (z15 ? 5 : 3) | 48;
                float f12 = z15 ? z13 ? 54 : 28 : i10 + 68;
                if (z15) {
                    f7 = i10 + 68;
                } else {
                    f7 = z13 ? 54 : 28;
                }
                b6Var.setLayoutParams(gb1.h(-1, 20.0f, i12, f12, 34.5f, f7, 0.0f));
            }
        }
        this.F = z10;
        setWillNotDraw(true ^ z10);
        d(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01a9, code lost:
    
        if (r13.equals(r12) == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        if (r12.equals(r16.w) == false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i10) {
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
        d5 d5Var = this.a;
        org.telegram.ui.ActionBar.b6 b6Var = this.b;
        boolean z11 = true;
        int i11 = this.M;
        org.telegram.ui.Components.j9 j9Var = this.e;
        org.telegram.ui.ActionBar.b6 b6Var2 = this.c;
        if (!z10) {
            if (!(obj instanceof TLRPC.Chat)) {
                if (obj instanceof Integer) {
                    b6Var.l(this.s, false);
                    b6Var2.setTextColor(this.H);
                    b6Var2.l(this.v, false);
                    j9Var.g(3);
                    d5Var.g(null, "50_50", j9Var);
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
            j9Var.k(i11, chat);
            CharSequence charSequence = this.s;
            if (charSequence != null) {
                this.w = null;
                b6Var.l(charSequence, false);
            } else {
                if (str == null) {
                    str = chat.title;
                }
                this.w = str;
                b6Var.l(str, false);
            }
            if (this.v != null) {
                b6Var2.setTextColor(this.H);
                b6Var2.l(this.v, false);
            } else {
                b6Var2.setTextColor(this.H);
                if (chat.participants_count != 0) {
                    if (!ChatObject.isChannel(chat) || chat.megagroup) {
                        b6Var2.l(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), false);
                    } else {
                        b6Var2.l(LocaleController.formatPluralString("Subscribers", chat.participants_count, new Object[0]), false);
                    }
                } else if (chat.has_geo) {
                    b6Var2.l(LocaleController.getString(R.string.MegaLocation), false);
                } else if (ChatObject.isPublic(chat)) {
                    b6Var2.l(LocaleController.getString(R.string.MegaPublic), false);
                } else {
                    b6Var2.l(LocaleController.getString(R.string.MegaPrivate), false);
                }
            }
            this.y = fileLocation3;
            d5Var.f(chat, j9Var);
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
        j9Var.m(i11, user);
        TLRPC.UserStatus userStatus3 = user.status;
        if (userStatus3 != null) {
            this.x = userStatus3.expires;
        } else {
            this.x = 0;
        }
        CharSequence charSequence2 = this.s;
        if (charSequence2 != null) {
            this.w = null;
            b6Var.l(charSequence2, false);
        } else {
            if (str2 == null) {
                str2 = UserObject.getUserName(user);
            }
            this.w = str2;
            b6Var.l(Emoji.replaceEmoji(str2, b6Var.getPaint().getFontMetricsInt(), false), false);
        }
        if (this.v != null) {
            b6Var2.setTextColor(this.H);
            b6Var2.l(this.v, false);
        } else {
            String publicUsername = DialogObject.getPublicUsername(user);
            if (user.bot) {
                b6Var2.setTextColor(this.H);
                if (this.G && !TextUtils.isEmpty(publicUsername)) {
                    b6Var2.l(publicUsername, false);
                } else if (user.bot_chat_history || this.E) {
                    b6Var2.l(LocaleController.getString(R.string.BotStatusRead), false);
                } else {
                    b6Var2.l(LocaleController.getString(R.string.BotStatusCantRead), false);
                }
            } else if (this.G && !TextUtils.isEmpty(publicUsername)) {
                b6Var2.l(publicUsername, false);
                b6Var2.setTextColor(this.H);
            } else if (user.id == UserConfig.getInstance(i11).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i11).getCurrentTime()) || MessagesController.getInstance(i11).onlinePrivacy.containsKey(Long.valueOf(user.id)))) {
                b6Var2.setTextColor(this.I);
                b6Var2.l(LocaleController.getString(R.string.Online), false);
            } else {
                b6Var2.setTextColor(this.H);
                b6Var2.l(LocaleController.formatUserStatus(i11, user), false);
            }
        }
        this.y = fileLocation4;
        d5Var.f(user, j9Var);
    }

    public org.telegram.ui.Components.y9 getAvatarImageView() {
        return this.a;
    }

    public Object getCurrentObject() {
        return this.n;
    }

    public di.w7 getStoryAvatarParams() {
        return this.N;
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
        if (this.F) {
            int i10 = this.K;
            if (i10 >= 0) {
                org.telegram.ui.ActionBar.y6.l0.setColor(org.telegram.ui.ActionBar.y6.w0(i10, this.d));
            }
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(68.0f) : 0), getMeasuredHeight() - 1, this.K >= 0 ? org.telegram.ui.ActionBar.y6.l0 : org.telegram.ui.ActionBar.y6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.F ? 1 : 0), TLObject.FLAG_30));
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
        org.telegram.ui.ActionBar.f7.t(this.h, org.telegram.ui.ActionBar.y6.mg, this.d, PorterDuff.Mode.MULTIPLY);
        addView(this.h, gb1.i(52, 64, (LocaleController.isRTL ? 3 : 5) | 48));
    }

    public void setDelegate(e5 e5Var) {
        this.L = e5Var;
    }

    public void setDividerColor(int i10) {
        this.K = i10;
    }

    public void setIsAdmin(boolean z10) {
        this.E = z10;
    }

    public void setNameColor(int i10) {
        org.telegram.ui.ActionBar.b6 b6Var = this.b;
        org.telegram.ui.ActionBar.f7.r(b6Var);
        b6Var.setTextColor(i10);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            b();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
