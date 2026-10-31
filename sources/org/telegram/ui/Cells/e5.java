package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e5 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public TLRPC.FileLocation D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final int J;
    public int K;
    public d5 L;
    public final int M;
    public final th.t5 N;
    public boolean O;
    public final c5 a;
    public final org.telegram.ui.ActionBar.u5 b;
    public final org.telegram.ui.ActionBar.u5 c;
    public final org.telegram.ui.ActionBar.p6 d;
    public final org.telegram.ui.Components.r8 e;
    public final ImageView f;
    public ImageView h;
    public Object n;
    public TL_stories.StoryItem r;
    public CharSequence s;
    public CharSequence w;
    public String x;
    public int y;

    public e5(int i10, int i11, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        this.K = -1;
        this.M = d20.s0;
        this.N = new th.t5(null, false);
        this.d = p6Var;
        this.H = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, p6Var);
        this.I = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.n6, p6Var);
        this.J = i11;
        this.e = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        c5 c5Var = new c5(this, context, p6Var);
        this.a = c5Var;
        c5Var.setRoundRadius(org.telegram.messenger.i0.L(23.0f));
        boolean z11 = cd.X;
        int i12 = 7;
        addView(c5Var, w7.b6.d(46, 46.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : i10 + 7, 8.0f, z11 ? i10 + 7 : 0.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.b = u5Var;
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        u5Var.setTextSize(17);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setGravity((cd.X ? 5 : 3) | 48);
        boolean z12 = cd.X;
        addView(u5Var, w7.b6.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 46.0f : i11 + 68, 11.5f, z12 ? i11 + 68 : 46.0f, 0.0f));
        zs.i(u5Var);
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
        this.c = u5Var2;
        u5Var2.setTextSize(14);
        u5Var2.setGravity((cd.X ? 5 : 3) | 48);
        boolean z13 = cd.X;
        addView(u5Var2, w7.b6.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 28.0f : i11 + 68, 34.5f, z13 ? i11 + 68 : 28.0f, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.f = imageView;
            imageView.setFocusable(false);
            int i13 = org.telegram.ui.ActionBar.t6.Ji;
            y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i13, p6Var), 1, -1);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, p6Var);
            imageView.setImageResource(R.drawable.ic_ab_other);
            org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.Ii, p6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, w7.b6.e(60, 64, (cd.X ? 3 : 5) | 48));
            imageView.setOnClickListener(new a(this, i12));
            imageView.setContentDescription(cd.L0(2131754740, null));
        }
    }

    public final void a() {
        this.a.getImageReceiver().c();
    }

    public final void b() {
        if (this.O) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.t6.y6;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.n6, p6Var);
        if (w02 == this.H && w03 == this.I) {
            return;
        }
        org.telegram.ui.ActionBar.u5 u5Var = this.c;
        if (u5Var != null) {
            int textColor = u5Var.getTextColor();
            if (textColor == this.H) {
                u5Var.setTextColor(w02);
            } else if (textColor == this.I) {
                u5Var.setTextColor(w03);
            }
        }
        this.H = w02;
        this.I = w03;
    }

    public final void c(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        float f7;
        float f10;
        org.telegram.ui.ActionBar.u5 u5Var = this.c;
        org.telegram.ui.ActionBar.u5 u5Var2 = this.b;
        if (tLObject == null) {
            this.w = null;
            this.s = null;
            this.n = null;
            u5Var2.l("", false);
            u5Var.l("", false);
            this.a.setImageDrawable(null);
            return;
        }
        this.w = charSequence2;
        this.s = charSequence;
        this.n = tLObject;
        ImageView imageView = this.f;
        int i10 = this.J;
        if (imageView != null) {
            boolean c10 = this.L.c(this, false);
            imageView.setVisibility(c10 ? 0 : 4);
            boolean z11 = cd.X;
            u5Var2.setLayoutParams(w7.b6.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? c10 ? 46 : 28 : i10 + 68, (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f, cd.X ? i10 + 68 : c10 ? 46 : 28, 0.0f));
            boolean z12 = cd.X;
            int i11 = (z12 ? 5 : 3) | 48;
            float f11 = z12 ? c10 ? 46 : 28 : i10 + 68;
            if (z12) {
                f10 = i10 + 68;
            } else {
                f10 = c10 ? 46 : 28;
            }
            u5Var.setLayoutParams(w7.b6.d(-1, 20.0f, i11, f11, 34.5f, f10, 0.0f));
        } else {
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                boolean z13 = imageView2.getVisibility() == 0;
                boolean z14 = cd.X;
                u5Var2.setLayoutParams(w7.b6.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? z13 ? 54 : 28 : i10 + 68, (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f, cd.X ? i10 + 68 : z13 ? 54 : 28, 0.0f));
                boolean z15 = cd.X;
                int i12 = (z15 ? 5 : 3) | 48;
                float f12 = z15 ? z13 ? 54 : 28 : i10 + 68;
                if (z15) {
                    f7 = i10 + 68;
                } else {
                    f7 = z13 ? 54 : 28;
                }
                u5Var.setLayoutParams(w7.b6.d(-1, 20.0f, i12, f12, 34.5f, f7, 0.0f));
            }
        }
        this.F = z10;
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
        c5 c5Var = this.a;
        org.telegram.ui.ActionBar.u5 u5Var = this.b;
        org.telegram.ui.Components.r8 r8Var = this.e;
        boolean z11 = true;
        org.telegram.ui.ActionBar.u5 u5Var2 = this.c;
        if (!z10) {
            if (!(obj instanceof TLRPC.Chat)) {
                if (obj instanceof Integer) {
                    u5Var.l(this.s, false);
                    u5Var2.setTextColor(this.H);
                    u5Var2.l(this.w, false);
                    r8Var.g(3);
                    c5Var.h(null, "50_50", r8Var);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            TLRPC.FileLocation fileLocation3 = chatPhoto != null ? chatPhoto.photo_small : null;
            if (i10 != 0) {
                int i11 = vp.D8;
                boolean z12 = (i10 & 2) != 0 && (((fileLocation = this.D) != null && fileLocation3 == null) || ((fileLocation == null && fileLocation3 != null) || !(fileLocation == null || (fileLocation.volume_id == fileLocation3.volume_id && fileLocation.local_id == fileLocation3.local_id))));
                if (z12 || this.s != null || (r10 = this.x) == null || (i10 & 1) == 0) {
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
            r8Var.q(chat);
            CharSequence charSequence = this.s;
            if (charSequence != null) {
                this.x = null;
                u5Var.l(charSequence, false);
            } else {
                if (str == null) {
                    str = chat.title;
                }
                this.x = str;
                u5Var.l(str, false);
            }
            if (this.w != null) {
                u5Var2.setTextColor(this.H);
                u5Var2.l(this.w, false);
            } else {
                u5Var2.setTextColor(this.H);
                if (chat.participants_count != 0) {
                    if (!org.telegram.messenger.w3.T(chat) || chat.megagroup) {
                        u5Var2.l(cd.G(chat.participants_count, "Members", new Object[0]), false);
                    } else {
                        u5Var2.l(cd.G(chat.participants_count, "Subscribers", new Object[0]), false);
                    }
                } else if (chat.has_geo) {
                    u5Var2.l(cd.L0(2131748657, null), false);
                } else if (org.telegram.messenger.w3.t0(chat)) {
                    u5Var2.l(cd.L0(2131748653, null), false);
                } else {
                    u5Var2.l(cd.L0(2131748656, null), false);
                }
            }
            this.D = fileLocation3;
            c5Var.e(chat, r8Var);
            return;
        }
        TLRPC.User user = (TLRPC.User) obj;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        TLRPC.FileLocation fileLocation4 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
        if (i10 != 0) {
            int i12 = vp.D8;
            boolean z13 = (i10 & 2) != 0 && (((fileLocation2 = this.D) != null && fileLocation4 == null) || ((fileLocation2 == null && fileLocation4 != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation4.volume_id && fileLocation2.local_id == fileLocation4.local_id))));
            if (!z13 && (i10 & 4) != 0) {
                TLRPC.UserStatus userStatus2 = user.status;
                if ((userStatus2 != null ? userStatus2.expires : 0) != this.y) {
                    z13 = true;
                }
            }
            if (z13 || this.s != null || this.x == null || (i10 & 1) == 0) {
                str2 = null;
            } else {
                str2 = h20.p(user);
            }
            z11 = z13;
            if (!z11) {
                return;
            }
        } else {
            str2 = null;
        }
        r8Var.r(user);
        TLRPC.UserStatus userStatus3 = user.status;
        if (userStatus3 != null) {
            this.y = userStatus3.expires;
        } else {
            this.y = 0;
        }
        CharSequence charSequence2 = this.s;
        if (charSequence2 != null) {
            this.x = null;
            u5Var.l(charSequence2, false);
        } else {
            if (str2 == null) {
                str2 = h20.p(user);
            }
            this.x = str2;
            u5Var.l(org.telegram.messenger.k6.m(str2, u5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        }
        if (this.w != null) {
            u5Var2.setTextColor(this.H);
            u5Var2.l(this.w, false);
        } else {
            String r10 = org.telegram.messenger.o5.r(user);
            if (user.bot) {
                u5Var2.setTextColor(this.H);
                if (this.G && !TextUtils.isEmpty(r10)) {
                    u5Var2.l(r10, false);
                } else if (user.bot_chat_history || this.E) {
                    u5Var2.l(cd.L0(2131752946, null), false);
                } else {
                    u5Var2.l(cd.L0(2131752947, null), false);
                }
            } else if (!this.G || TextUtils.isEmpty(r10)) {
                long j10 = user.id;
                int i13 = this.M;
                if (j10 == d20.i(i13).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i13).getCurrentTime()) || vp.r1(i13).Z.containsKey(Long.valueOf(user.id)))) {
                    u5Var2.setTextColor(this.I);
                    u5Var2.l(cd.L0(2131747842, null), false);
                } else {
                    u5Var2.setTextColor(this.H);
                    u5Var2.l(cd.d0(i13, user, null, null), false);
                }
            } else {
                u5Var2.l(r10, false);
                u5Var2.setTextColor(this.H);
            }
        }
        this.D = fileLocation4;
        c5Var.e(user, r8Var);
    }

    public org.telegram.ui.Components.g9 getAvatarImageView() {
        return this.a;
    }

    public Object getCurrentObject() {
        return this.n;
    }

    public th.t5 getStoryAvatarParams() {
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
                org.telegram.ui.ActionBar.t6.l0.setColor(org.telegram.ui.ActionBar.t6.w0(i10, this.d));
            }
            canvas.drawLine(cd.X ? 0.0f : org.telegram.messenger.i0.L(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (cd.X ? org.telegram.messenger.i0.L(68.0f) : 0), getMeasuredHeight() - 1, this.K >= 0 ? org.telegram.ui.ActionBar.t6.l0 : org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f) + (this.F ? 1 : 0), TLObject.FLAG_30));
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
        org.telegram.ui.ActionBar.a7.t(this.h, org.telegram.ui.ActionBar.t6.ah, this.d, PorterDuff.Mode.MULTIPLY);
        addView(this.h, w7.b6.e(52, 64, (cd.X ? 3 : 5) | 48));
    }

    public void setDelegate(d5 d5Var) {
        this.L = d5Var;
    }

    public void setDividerColor(int i10) {
        this.K = i10;
    }

    public void setIsAdmin(boolean z10) {
        this.E = z10;
    }

    public void setNameColor(int i10) {
        org.telegram.ui.ActionBar.u5 u5Var = this.b;
        org.telegram.ui.ActionBar.a7.r(u5Var);
        u5Var.setTextColor(i10);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            b();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
