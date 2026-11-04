package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a5 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public TLRPC.FileLocation E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final int K;
    public int L;
    public z4 M;
    public final int N;
    public final ei.o7 O;
    public boolean P;
    public final y4 a;
    public final org.telegram.ui.ActionBar.k5 b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final org.telegram.ui.Components.u8 e;
    public final ImageView f;
    public ImageView h;
    public Object n;
    public TL_stories.StoryItem r;
    public CharSequence s;
    public CharSequence w;
    public String x;
    public int y;

    public a5(Context context, int i3, int i10, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.L = -1;
        this.N = h10.t0;
        this.O = new ei.o7(null, false);
        this.d = e6Var;
        this.I = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, e6Var);
        this.J = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.n6, e6Var);
        this.K = i10;
        this.e = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        y4 y4Var = new y4(this, context, e6Var);
        this.a = y4Var;
        y4Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        boolean z11 = bd.a0;
        int i11 = 7;
        addView(y4Var, mf.d(46, 46.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : i3 + 7, 8.0f, z11 ? i3 + 7 : 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.b = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, e6Var);
        k5Var.setTextSize(17);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setGravity((bd.a0 ? 5 : 3) | 48);
        boolean z12 = bd.a0;
        addView(k5Var, mf.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 46.0f : i10 + 68, 11.5f, z12 ? i10 + 68 : 46.0f, 0.0f));
        hs.i(k5Var);
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.c = k5Var2;
        k5Var2.setTextSize(14);
        k5Var2.setGravity((bd.a0 ? 5 : 3) | 48);
        boolean z13 = bd.a0;
        addView(k5Var2, mf.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 28.0f : i10 + 68, 34.5f, z13 ? i10 + 68 : 28.0f, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.f = imageView;
            imageView.setFocusable(false);
            int i12 = org.telegram.ui.ActionBar.k6.Ji;
            y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, e6Var), 1, -1);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, e6Var);
            imageView.setImageResource(R.drawable.ic_ab_other);
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Ii, e6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, mf.e(60, 64, (bd.a0 ? 3 : 5) | 48));
            imageView.setOnClickListener(new a(this, i11));
            imageView.setContentDescription(bd.M0(2131754740, null));
        }
    }

    public final void a() {
        this.a.getImageReceiver().c();
    }

    public final void b() {
        if (this.P) {
            return;
        }
        int i3 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.n6, e6Var);
        if (w02 == this.I && w03 == this.J) {
            return;
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        if (k5Var != null) {
            int textColor = k5Var.getTextColor();
            if (textColor == this.I) {
                k5Var.setTextColor(w02);
            } else if (textColor == this.J) {
                k5Var.setTextColor(w03);
            }
        }
        this.I = w02;
        this.J = w03;
    }

    public final void c(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.b;
        if (tLObject == null) {
            this.w = null;
            this.s = null;
            this.n = null;
            k5Var2.l("", false);
            k5Var.l("", false);
            this.a.setImageDrawable(null);
            return;
        }
        this.w = charSequence2;
        this.s = charSequence;
        this.n = tLObject;
        ImageView imageView = this.f;
        int i3 = this.K;
        if (imageView != null) {
            boolean b10 = this.M.b(this, false);
            imageView.setVisibility(b10 ? 0 : 4);
            boolean z11 = bd.a0;
            k5Var2.setLayoutParams(mf.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? b10 ? 46 : 28 : i3 + 68, (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f, bd.a0 ? i3 + 68 : b10 ? 46 : 28, 0.0f));
            boolean z12 = bd.a0;
            int i10 = (z12 ? 5 : 3) | 48;
            float f12 = z12 ? b10 ? 46 : 28 : i3 + 68;
            if (z12) {
                f11 = i3 + 68;
            } else {
                f11 = b10 ? 46 : 28;
            }
            k5Var.setLayoutParams(mf.d(-1, 20.0f, i10, f12, 34.5f, f11, 0.0f));
        } else {
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                boolean z13 = imageView2.getVisibility() == 0;
                boolean z14 = bd.a0;
                k5Var2.setLayoutParams(mf.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? z13 ? 54 : 28 : i3 + 68, (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f, bd.a0 ? i3 + 68 : z13 ? 54 : 28, 0.0f));
                boolean z15 = bd.a0;
                int i11 = (z15 ? 5 : 3) | 48;
                float f13 = z15 ? z13 ? 54 : 28 : i3 + 68;
                if (z15) {
                    f10 = i3 + 68;
                } else {
                    f10 = z13 ? 54 : 28;
                }
                k5Var.setLayoutParams(mf.d(-1, 20.0f, i11, f13, 34.5f, f10, 0.0f));
            }
        }
        this.G = z10;
        setWillNotDraw(true ^ z10);
        d(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01a2, code lost:
    
        if (r15.equals(r10) == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
    
        if (r15.equals(r14.x) == false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i3) {
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
        y4 y4Var = this.a;
        org.telegram.ui.ActionBar.k5 k5Var = this.b;
        org.telegram.ui.Components.u8 u8Var = this.e;
        boolean z11 = true;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.c;
        if (!z10) {
            if (!(obj instanceof TLRPC.Chat)) {
                if (obj instanceof Integer) {
                    k5Var.l(this.s, false);
                    k5Var2.setTextColor(this.I);
                    k5Var2.l(this.w, false);
                    u8Var.g(3);
                    y4Var.h(null, "50_50", u8Var);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            TLRPC.FileLocation fileLocation3 = chatPhoto != null ? chatPhoto.photo_small : null;
            if (i3 != 0) {
                int i10 = hp.C8;
                boolean z12 = (i3 & 2) != 0 && (((fileLocation = this.E) != null && fileLocation3 == null) || ((fileLocation == null && fileLocation3 != null) || !(fileLocation == null || (fileLocation.volume_id == fileLocation3.volume_id && fileLocation.local_id == fileLocation3.local_id))));
                if (z12 || this.s != null || (r10 = this.x) == null || (i3 & 1) == 0) {
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
            u8Var.q(chat);
            CharSequence charSequence = this.s;
            if (charSequence != null) {
                this.x = null;
                k5Var.l(charSequence, false);
            } else {
                if (str == null) {
                    str = chat.title;
                }
                this.x = str;
                k5Var.l(str, false);
            }
            if (this.w != null) {
                k5Var2.setTextColor(this.I);
                k5Var2.l(this.w, false);
            } else {
                k5Var2.setTextColor(this.I);
                if (chat.participants_count != 0) {
                    if (!org.telegram.messenger.t3.T(chat) || chat.megagroup) {
                        k5Var2.l(bd.G(chat.participants_count, "Members", new Object[0]), false);
                    } else {
                        k5Var2.l(bd.G(chat.participants_count, "Subscribers", new Object[0]), false);
                    }
                } else if (chat.has_geo) {
                    k5Var2.l(bd.M0(2131748650, null), false);
                } else if (org.telegram.messenger.t3.t0(chat)) {
                    k5Var2.l(bd.M0(2131748646, null), false);
                } else {
                    k5Var2.l(bd.M0(2131748649, null), false);
                }
            }
            this.E = fileLocation3;
            y4Var.e(chat, u8Var);
            return;
        }
        TLRPC.User user = (TLRPC.User) obj;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        TLRPC.FileLocation fileLocation4 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
        if (i3 != 0) {
            int i11 = hp.C8;
            boolean z13 = (i3 & 2) != 0 && (((fileLocation2 = this.E) != null && fileLocation4 == null) || ((fileLocation2 == null && fileLocation4 != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation4.volume_id && fileLocation2.local_id == fileLocation4.local_id))));
            if (!z13 && (i3 & 4) != 0) {
                TLRPC.UserStatus userStatus2 = user.status;
                if ((userStatus2 != null ? userStatus2.expires : 0) != this.y) {
                    z13 = true;
                }
            }
            if (z13 || this.s != null || this.x == null || (i3 & 1) == 0) {
                str2 = null;
            } else {
                str2 = l10.p(user);
            }
            z11 = z13;
            if (!z11) {
                return;
            }
        } else {
            str2 = null;
        }
        u8Var.r(user);
        TLRPC.UserStatus userStatus3 = user.status;
        if (userStatus3 != null) {
            this.y = userStatus3.expires;
        } else {
            this.y = 0;
        }
        CharSequence charSequence2 = this.s;
        if (charSequence2 != null) {
            this.x = null;
            k5Var.l(charSequence2, false);
        } else {
            if (str2 == null) {
                str2 = l10.p(user);
            }
            this.x = str2;
            k5Var.l(org.telegram.messenger.i6.m(str2, k5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        }
        if (this.w != null) {
            k5Var2.setTextColor(this.I);
            k5Var2.l(this.w, false);
        } else {
            String r5 = org.telegram.messenger.m5.r(user);
            if (user.bot) {
                k5Var2.setTextColor(this.I);
                if (this.H && !TextUtils.isEmpty(r5)) {
                    k5Var2.l(r5, false);
                } else if (user.bot_chat_history || this.F) {
                    k5Var2.l(bd.M0(2131752946, null), false);
                } else {
                    k5Var2.l(bd.M0(2131752947, null), false);
                }
            } else if (!this.H || TextUtils.isEmpty(r5)) {
                long j10 = user.id;
                int i12 = this.N;
                if (j10 == h10.i(i12).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i12).getCurrentTime()) || hp.s1(i12).a0.containsKey(Long.valueOf(user.id)))) {
                    k5Var2.setTextColor(this.J);
                    k5Var2.l(bd.M0(2131747834, null), false);
                } else {
                    k5Var2.setTextColor(this.I);
                    k5Var2.l(bd.d0(i12, user, null, null), false);
                }
            } else {
                k5Var2.l(r5, false);
                k5Var2.setTextColor(this.I);
            }
        }
        this.E = fileLocation4;
        y4Var.e(user, u8Var);
    }

    public org.telegram.ui.Components.k9 getAvatarImageView() {
        return this.a;
    }

    public Object getCurrentObject() {
        return this.n;
    }

    public ei.o7 getStoryAvatarParams() {
        return this.O;
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
        if (this.G) {
            int i3 = this.L;
            if (i3 >= 0) {
                org.telegram.ui.ActionBar.k6.l0.setColor(org.telegram.ui.ActionBar.k6.w0(i3, this.d));
            }
            canvas.drawLine(bd.a0 ? 0.0f : org.telegram.messenger.g0.L(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (bd.a0 ? org.telegram.messenger.g0.L(68.0f) : 0), getMeasuredHeight() - 1, this.L >= 0 ? org.telegram.ui.ActionBar.k6.l0 : org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.G ? 1 : 0), TLObject.FLAG_30));
    }

    public void setCustomImageVisible(boolean z10) {
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(z10 ? 0 : 8);
    }

    public void setCustomRightImage(int i3) {
        ImageView imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setImageResource(i3);
        this.h.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(this.h, org.telegram.ui.ActionBar.k6.ah, this.d, PorterDuff.Mode.MULTIPLY);
        addView(this.h, mf.e(52, 64, (bd.a0 ? 3 : 5) | 48));
    }

    public void setDelegate(z4 z4Var) {
        this.M = z4Var;
    }

    public void setDividerColor(int i3) {
        this.L = i3;
    }

    public void setIsAdmin(boolean z10) {
        this.F = z10;
    }

    public void setNameColor(int i3) {
        org.telegram.ui.ActionBar.k5 k5Var = this.b;
        org.telegram.ui.ActionBar.r6.r(k5Var);
        k5Var.setTextColor(i3);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            b();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
