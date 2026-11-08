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
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class a5 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public TLRPC.FileLocation D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final int J;
    public int K;
    public z4 L;
    public final int M;
    public final di.n7 N;
    public boolean O;
    public final y4 a;
    public final org.telegram.ui.ActionBar.k5 b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final org.telegram.ui.Components.w8 e;
    public final ImageView f;
    public ImageView h;
    public Object n;
    public TL_stories.StoryItem r;
    public CharSequence s;
    public CharSequence w;
    public String x;
    public int y;

    public a5(Context context, int i7, int i10, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.K = -1;
        this.M = p10.s0;
        this.N = new di.n7(null, false);
        this.d = f6Var;
        this.H = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, f6Var);
        this.I = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.n6, f6Var);
        this.J = i10;
        this.e = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        y4 y4Var = new y4(this, context, f6Var);
        this.a = y4Var;
        y4Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        boolean z10 = id.a0;
        int i11 = 7;
        addView(y4Var, c8.ha.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : i7 + 7, 8.0f, z10 ? i7 + 7 : 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.b = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, f6Var);
        k5Var.setTextSize(17);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setGravity((id.a0 ? 5 : 3) | 48);
        boolean z11 = id.a0;
        addView(k5Var, c8.ha.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 46.0f : i10 + 68, 11.5f, z11 ? i10 + 68 : 46.0f, 0.0f));
        qs.i(k5Var);
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.c = k5Var2;
        k5Var2.setTextSize(14);
        k5Var2.setGravity((id.a0 ? 5 : 3) | 48);
        boolean z12 = id.a0;
        addView(k5Var2, c8.ha.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 28.0f : i10 + 68, 34.5f, z12 ? i10 + 68 : 28.0f, 0.0f));
        if (z9) {
            ImageView imageView = new ImageView(context);
            this.f = imageView;
            imageView.setFocusable(false);
            int i12 = org.telegram.ui.ActionBar.k6.Ji;
            y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, f6Var), 1, -1);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, f6Var);
            imageView.setImageResource(R.drawable.ic_ab_other);
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Ii, f6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, c8.ha.e(60, 64, (id.a0 ? 3 : 5) | 48));
            imageView.setOnClickListener(new a(this, i11));
            imageView.setContentDescription(id.M0(2131754740, null));
        }
    }

    public final void a() {
        this.a.getImageReceiver().c();
    }

    public final void b() {
        if (this.O) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.n6, f6Var);
        if (w02 == this.H && w03 == this.I) {
            return;
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        if (k5Var != null) {
            int textColor = k5Var.getTextColor();
            if (textColor == this.H) {
                k5Var.setTextColor(w02);
            } else if (textColor == this.I) {
                k5Var.setTextColor(w03);
            }
        }
        this.H = w02;
        this.I = w03;
    }

    public final void c(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2, boolean z9) {
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
        int i7 = this.J;
        if (imageView != null) {
            boolean b10 = this.L.b(this, false);
            imageView.setVisibility(b10 ? 0 : 4);
            boolean z10 = id.a0;
            k5Var2.setLayoutParams(c8.ha.d(-1, 20.0f, (z10 ? 5 : 3) | 48, z10 ? b10 ? 46 : 28 : i7 + 68, (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f, id.a0 ? i7 + 68 : b10 ? 46 : 28, 0.0f));
            boolean z11 = id.a0;
            int i10 = (z11 ? 5 : 3) | 48;
            float f12 = z11 ? b10 ? 46 : 28 : i7 + 68;
            if (z11) {
                f11 = i7 + 68;
            } else {
                f11 = b10 ? 46 : 28;
            }
            k5Var.setLayoutParams(c8.ha.d(-1, 20.0f, i10, f12, 34.5f, f11, 0.0f));
        } else {
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                boolean z12 = imageView2.getVisibility() == 0;
                boolean z13 = id.a0;
                k5Var2.setLayoutParams(c8.ha.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? z12 ? 54 : 28 : i7 + 68, (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f, id.a0 ? i7 + 68 : z12 ? 54 : 28, 0.0f));
                boolean z14 = id.a0;
                int i11 = (z14 ? 5 : 3) | 48;
                float f13 = z14 ? z12 ? 54 : 28 : i7 + 68;
                if (z14) {
                    f10 = i7 + 68;
                } else {
                    f10 = z12 ? 54 : 28;
                }
                k5Var.setLayoutParams(c8.ha.d(-1, 20.0f, i11, f13, 34.5f, f10, 0.0f));
            }
        }
        this.F = z9;
        setWillNotDraw(true ^ z9);
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
        boolean z9 = obj instanceof TLRPC.User;
        y4 y4Var = this.a;
        org.telegram.ui.ActionBar.k5 k5Var = this.b;
        org.telegram.ui.Components.w8 w8Var = this.e;
        boolean z10 = true;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.c;
        if (!z9) {
            if (!(obj instanceof TLRPC.Chat)) {
                if (obj instanceof Integer) {
                    k5Var.l(this.s, false);
                    k5Var2.setTextColor(this.H);
                    k5Var2.l(this.w, false);
                    w8Var.g(3);
                    y4Var.h(null, "50_50", w8Var);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            TLRPC.FileLocation fileLocation3 = chatPhoto != null ? chatPhoto.photo_small : null;
            if (i7 != 0) {
                int i10 = qp.C8;
                boolean z11 = (i7 & 2) != 0 && (((fileLocation = this.D) != null && fileLocation3 == null) || ((fileLocation == null && fileLocation3 != null) || !(fileLocation == null || (fileLocation.volume_id == fileLocation3.volume_id && fileLocation.local_id == fileLocation3.local_id))));
                if (z11 || this.s != null || (r10 = this.x) == null || (i7 & 1) == 0) {
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
            w8Var.q(chat);
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
                k5Var2.setTextColor(this.H);
                k5Var2.l(this.w, false);
            } else {
                k5Var2.setTextColor(this.H);
                if (chat.participants_count != 0) {
                    if (!org.telegram.messenger.t3.T(chat) || chat.megagroup) {
                        k5Var2.l(id.G(chat.participants_count, "Members", new Object[0]), false);
                    } else {
                        k5Var2.l(id.G(chat.participants_count, "Subscribers", new Object[0]), false);
                    }
                } else if (chat.has_geo) {
                    k5Var2.l(id.M0(2131748643, null), false);
                } else if (org.telegram.messenger.t3.t0(chat)) {
                    k5Var2.l(id.M0(2131748639, null), false);
                } else {
                    k5Var2.l(id.M0(2131748642, null), false);
                }
            }
            this.D = fileLocation3;
            y4Var.e(chat, w8Var);
            return;
        }
        TLRPC.User user = (TLRPC.User) obj;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        TLRPC.FileLocation fileLocation4 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
        if (i7 != 0) {
            int i11 = qp.C8;
            boolean z12 = (i7 & 2) != 0 && (((fileLocation2 = this.D) != null && fileLocation4 == null) || ((fileLocation2 == null && fileLocation4 != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation4.volume_id && fileLocation2.local_id == fileLocation4.local_id))));
            if (!z12 && (i7 & 4) != 0) {
                TLRPC.UserStatus userStatus2 = user.status;
                if ((userStatus2 != null ? userStatus2.expires : 0) != this.y) {
                    z12 = true;
                }
            }
            if (z12 || this.s != null || this.x == null || (i7 & 1) == 0) {
                str2 = null;
            } else {
                str2 = t10.p(user);
            }
            z10 = z12;
            if (!z10) {
                return;
            }
        } else {
            str2 = null;
        }
        w8Var.r(user);
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
                str2 = t10.p(user);
            }
            this.x = str2;
            k5Var.l(org.telegram.messenger.i6.m(str2, k5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        }
        if (this.w != null) {
            k5Var2.setTextColor(this.H);
            k5Var2.l(this.w, false);
        } else {
            String r10 = org.telegram.messenger.m5.r(user);
            if (user.bot) {
                k5Var2.setTextColor(this.H);
                if (this.G && !TextUtils.isEmpty(r10)) {
                    k5Var2.l(r10, false);
                } else if (user.bot_chat_history || this.E) {
                    k5Var2.l(id.M0(2131752946, null), false);
                } else {
                    k5Var2.l(id.M0(2131752947, null), false);
                }
            } else if (!this.G || TextUtils.isEmpty(r10)) {
                long j3 = user.id;
                int i12 = this.M;
                if (j3 == p10.i(i12).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i12).getCurrentTime()) || qp.s1(i12).Z.containsKey(Long.valueOf(user.id)))) {
                    k5Var2.setTextColor(this.I);
                    k5Var2.l(id.M0(2131747827, null), false);
                } else {
                    k5Var2.setTextColor(this.H);
                    k5Var2.l(id.d0(i12, user, null, null), false);
                }
            } else {
                k5Var2.l(r10, false);
                k5Var2.setTextColor(this.H);
            }
        }
        this.D = fileLocation4;
        y4Var.e(user, w8Var);
    }

    public org.telegram.ui.Components.l9 getAvatarImageView() {
        return this.a;
    }

    public Object getCurrentObject() {
        return this.n;
    }

    public di.n7 getStoryAvatarParams() {
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
            int i7 = this.K;
            if (i7 >= 0) {
                org.telegram.ui.ActionBar.k6.l0.setColor(org.telegram.ui.ActionBar.k6.w0(i7, this.d));
            }
            canvas.drawLine(id.a0 ? 0.0f : org.telegram.messenger.g0.L(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (id.a0 ? org.telegram.messenger.g0.L(68.0f) : 0), getMeasuredHeight() - 1, this.K >= 0 ? org.telegram.ui.ActionBar.k6.l0 : org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.F ? 1 : 0), TLObject.FLAG_30));
    }

    public void setCustomImageVisible(boolean z9) {
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(z9 ? 0 : 8);
    }

    public void setCustomRightImage(int i7) {
        ImageView imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setImageResource(i7);
        this.h.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(this.h, org.telegram.ui.ActionBar.k6.ah, this.d, PorterDuff.Mode.MULTIPLY);
        addView(this.h, c8.ha.e(52, 64, (id.a0 ? 3 : 5) | 48));
    }

    public void setDelegate(z4 z4Var) {
        this.L = z4Var;
    }

    public void setDividerColor(int i7) {
        this.K = i7;
    }

    public void setIsAdmin(boolean z9) {
        this.E = z9;
    }

    public void setNameColor(int i7) {
        org.telegram.ui.ActionBar.k5 k5Var = this.b;
        org.telegram.ui.ActionBar.r6.r(k5Var);
        k5Var.setTextColor(i7);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            b();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
