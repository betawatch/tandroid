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
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class a5 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
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
    public final fi.e7 O;
    public boolean P;
    public final y4 a;
    public final org.telegram.ui.ActionBar.n5 b;
    public final org.telegram.ui.ActionBar.n5 c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final org.telegram.ui.Components.b9 e;
    public final ImageView f;
    public ImageView h;
    public Object n;
    public TL_stories.StoryItem r;
    public CharSequence s;
    public CharSequence w;
    public String x;
    public int y;

    public a5(Context context, int i7, int i10, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.L = -1;
        this.N = j10.t0;
        this.O = new fi.e7(null, false);
        this.d = i6Var;
        this.I = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.y6, i6Var);
        this.J = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.n6, i6Var);
        this.K = i10;
        this.e = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        y4 y4Var = new y4(this, context, i6Var);
        this.a = y4Var;
        y4Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        boolean z11 = gd.a0;
        int i11 = 7;
        addView(y4Var, c8.ma.d(46, 46.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : i7 + 7, 8.0f, z11 ? i7 + 7 : 0.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.b = n5Var;
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        n5Var.setTextSize(17);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setGravity((gd.a0 ? 5 : 3) | 48);
        boolean z12 = gd.a0;
        addView(n5Var, c8.ma.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 46.0f : i10 + 68, 11.5f, z12 ? i10 + 68 : 46.0f, 0.0f));
        ks.i(n5Var);
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.c = n5Var2;
        n5Var2.setTextSize(14);
        n5Var2.setGravity((gd.a0 ? 5 : 3) | 48);
        boolean z13 = gd.a0;
        addView(n5Var2, c8.ma.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 28.0f : i10 + 68, 34.5f, z13 ? i10 + 68 : 28.0f, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.f = imageView;
            imageView.setFocusable(false);
            int i12 = org.telegram.ui.ActionBar.n6.Mi;
            y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i12, i6Var), 1, -1);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M, i6Var);
            imageView.setImageResource(R.drawable.ic_ab_other);
            org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.Li, i6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, c8.ma.e(60, 64, (gd.a0 ? 3 : 5) | 48));
            imageView.setOnClickListener(new a(this, i11));
            imageView.setContentDescription(gd.M0(2131754740, null));
        }
    }

    public final void a() {
        this.a.getImageReceiver().c();
    }

    public final void b() {
        if (this.P) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.n6.y6;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.n6, i6Var);
        if (w02 == this.I && w03 == this.J) {
            return;
        }
        org.telegram.ui.ActionBar.n5 n5Var = this.c;
        if (n5Var != null) {
            int textColor = n5Var.getTextColor();
            if (textColor == this.I) {
                n5Var.setTextColor(w02);
            } else if (textColor == this.J) {
                n5Var.setTextColor(w03);
            }
        }
        this.I = w02;
        this.J = w03;
    }

    public final void c(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        float f10;
        float f11;
        org.telegram.ui.ActionBar.n5 n5Var = this.c;
        org.telegram.ui.ActionBar.n5 n5Var2 = this.b;
        if (tLObject == null) {
            this.w = null;
            this.s = null;
            this.n = null;
            n5Var2.l("", false);
            n5Var.l("", false);
            this.a.setImageDrawable(null);
            return;
        }
        this.w = charSequence2;
        this.s = charSequence;
        this.n = tLObject;
        ImageView imageView = this.f;
        int i7 = this.K;
        if (imageView != null) {
            boolean b10 = this.M.b(this, false);
            imageView.setVisibility(b10 ? 0 : 4);
            boolean z11 = gd.a0;
            n5Var2.setLayoutParams(c8.ma.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? b10 ? 46 : 28 : i7 + 68, (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f, gd.a0 ? i7 + 68 : b10 ? 46 : 28, 0.0f));
            boolean z12 = gd.a0;
            int i10 = (z12 ? 5 : 3) | 48;
            float f12 = z12 ? b10 ? 46 : 28 : i7 + 68;
            if (z12) {
                f11 = i7 + 68;
            } else {
                f11 = b10 ? 46 : 28;
            }
            n5Var.setLayoutParams(c8.ma.d(-1, 20.0f, i10, f12, 34.5f, f11, 0.0f));
        } else {
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                boolean z13 = imageView2.getVisibility() == 0;
                boolean z14 = gd.a0;
                n5Var2.setLayoutParams(c8.ma.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? z13 ? 54 : 28 : i7 + 68, (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f, gd.a0 ? i7 + 68 : z13 ? 54 : 28, 0.0f));
                boolean z15 = gd.a0;
                int i11 = (z15 ? 5 : 3) | 48;
                float f13 = z15 ? z13 ? 54 : 28 : i7 + 68;
                if (z15) {
                    f10 = i7 + 68;
                } else {
                    f10 = z13 ? 54 : 28;
                }
                n5Var.setLayoutParams(c8.ma.d(-1, 20.0f, i11, f13, 34.5f, f10, 0.0f));
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
    public final void d(int i7) {
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
        org.telegram.ui.ActionBar.n5 n5Var = this.b;
        org.telegram.ui.Components.b9 b9Var = this.e;
        boolean z11 = true;
        org.telegram.ui.ActionBar.n5 n5Var2 = this.c;
        if (!z10) {
            if (!(obj instanceof TLRPC.Chat)) {
                if (obj instanceof Integer) {
                    n5Var.l(this.s, false);
                    n5Var2.setTextColor(this.I);
                    n5Var2.l(this.w, false);
                    b9Var.g(3);
                    y4Var.h(null, "50_50", b9Var);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            TLRPC.FileLocation fileLocation3 = chatPhoto != null ? chatPhoto.photo_small : null;
            if (i7 != 0) {
                int i10 = mp.I8;
                boolean z12 = (i7 & 2) != 0 && (((fileLocation = this.E) != null && fileLocation3 == null) || ((fileLocation == null && fileLocation3 != null) || !(fileLocation == null || (fileLocation.volume_id == fileLocation3.volume_id && fileLocation.local_id == fileLocation3.local_id))));
                if (z12 || this.s != null || (r10 = this.x) == null || (i7 & 1) == 0) {
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
            b9Var.q(chat);
            CharSequence charSequence = this.s;
            if (charSequence != null) {
                this.x = null;
                n5Var.l(charSequence, false);
            } else {
                if (str == null) {
                    str = chat.title;
                }
                this.x = str;
                n5Var.l(str, false);
            }
            if (this.w != null) {
                n5Var2.setTextColor(this.I);
                n5Var2.l(this.w, false);
            } else {
                n5Var2.setTextColor(this.I);
                if (chat.participants_count != 0) {
                    if (!org.telegram.messenger.v3.T(chat) || chat.megagroup) {
                        n5Var2.l(gd.G(chat.participants_count, "Members", new Object[0]), false);
                    } else {
                        n5Var2.l(gd.G(chat.participants_count, "Subscribers", new Object[0]), false);
                    }
                } else if (chat.has_geo) {
                    n5Var2.l(gd.M0(2131748450, null), false);
                } else if (org.telegram.messenger.v3.t0(chat)) {
                    n5Var2.l(gd.M0(2131748446, null), false);
                } else {
                    n5Var2.l(gd.M0(2131748449, null), false);
                }
            }
            this.E = fileLocation3;
            y4Var.f(chat, b9Var);
            return;
        }
        TLRPC.User user = (TLRPC.User) obj;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        TLRPC.FileLocation fileLocation4 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
        if (i7 != 0) {
            int i11 = mp.I8;
            boolean z13 = (i7 & 2) != 0 && (((fileLocation2 = this.E) != null && fileLocation4 == null) || ((fileLocation2 == null && fileLocation4 != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation4.volume_id && fileLocation2.local_id == fileLocation4.local_id))));
            if (!z13 && (i7 & 4) != 0) {
                TLRPC.UserStatus userStatus2 = user.status;
                if ((userStatus2 != null ? userStatus2.expires : 0) != this.y) {
                    z13 = true;
                }
            }
            if (z13 || this.s != null || this.x == null || (i7 & 1) == 0) {
                str2 = null;
            } else {
                str2 = o10.q(user);
            }
            z11 = z13;
            if (!z11) {
                return;
            }
        } else {
            str2 = null;
        }
        b9Var.r(user);
        TLRPC.UserStatus userStatus3 = user.status;
        if (userStatus3 != null) {
            this.y = userStatus3.expires;
        } else {
            this.y = 0;
        }
        CharSequence charSequence2 = this.s;
        if (charSequence2 != null) {
            this.x = null;
            n5Var.l(charSequence2, false);
        } else {
            if (str2 == null) {
                str2 = o10.q(user);
            }
            this.x = str2;
            n5Var.l(org.telegram.messenger.j6.m(str2, n5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        }
        if (this.w != null) {
            n5Var2.setTextColor(this.I);
            n5Var2.l(this.w, false);
        } else {
            String r10 = org.telegram.messenger.n5.r(user);
            if (user.bot) {
                n5Var2.setTextColor(this.I);
                if (this.H && !TextUtils.isEmpty(r10)) {
                    n5Var2.l(r10, false);
                } else if (user.bot_chat_history || this.F) {
                    n5Var2.l(gd.M0(2131752935, null), false);
                } else {
                    n5Var2.l(gd.M0(2131752936, null), false);
                }
            } else if (!this.H || TextUtils.isEmpty(r10)) {
                long j3 = user.id;
                int i12 = this.N;
                if (j3 == j10.i(i12).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i12).getCurrentTime()) || mp.u1(i12).a0.containsKey(Long.valueOf(user.id)))) {
                    n5Var2.setTextColor(this.J);
                    n5Var2.l(gd.M0(2131747633, null), false);
                } else {
                    n5Var2.setTextColor(this.I);
                    n5Var2.l(gd.d0(i12, user, null, null), false);
                }
            } else {
                n5Var2.l(r10, false);
                n5Var2.setTextColor(this.I);
            }
        }
        this.E = fileLocation4;
        y4Var.f(user, b9Var);
    }

    public org.telegram.ui.Components.q9 getAvatarImageView() {
        return this.a;
    }

    public Object getCurrentObject() {
        return this.n;
    }

    public fi.e7 getStoryAvatarParams() {
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
            int i7 = this.L;
            if (i7 >= 0) {
                org.telegram.ui.ActionBar.n6.l0.setColor(org.telegram.ui.ActionBar.n6.w0(i7, this.d));
            }
            canvas.drawLine(gd.a0 ? 0.0f : org.telegram.messenger.g0.L(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (gd.a0 ? org.telegram.messenger.g0.L(68.0f) : 0), getMeasuredHeight() - 1, this.L >= 0 ? org.telegram.ui.ActionBar.n6.l0 : org.telegram.ui.ActionBar.n6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.G ? 1 : 0), TLObject.FLAG_30));
    }

    public void setCustomImageVisible(boolean z10) {
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(z10 ? 0 : 8);
    }

    public void setCustomRightImage(int i7) {
        ImageView imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setImageResource(i7);
        this.h.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.u6.s(this.h, org.telegram.ui.ActionBar.n6.dh, this.d, PorterDuff.Mode.MULTIPLY);
        addView(this.h, c8.ma.e(52, 64, (gd.a0 ? 3 : 5) | 48));
    }

    public void setDelegate(z4 z4Var) {
        this.M = z4Var;
    }

    public void setDividerColor(int i7) {
        this.L = i7;
    }

    public void setIsAdmin(boolean z10) {
        this.F = z10;
    }

    public void setNameColor(int i7) {
        org.telegram.ui.ActionBar.n5 n5Var = this.b;
        org.telegram.ui.ActionBar.u6.q(n5Var);
        n5Var.setTextColor(i7);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            b();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
