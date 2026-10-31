package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.ic;
import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.wd0;
import org.telegram.ui.h00;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k6 extends z implements us, org.telegram.ui.ActionBar.k6 {
    public final ep A0;
    public boolean B0;
    public q20 C0;
    public TLRPC.User D;
    public j20 D0;
    public TLRPC.Chat E;
    public boolean E0;
    public TLRPC.EncryptedChat F;
    public TextPaint F0;
    public org.telegram.messenger.f5 G;
    public TextPaint G0;
    public long H;
    public boolean H0;
    public String I;
    public final dc I0;
    public int J;
    public final Paint J0;
    public TLRPC.FileLocation K;
    public final RectF K0;
    public boolean L;
    public qz0 L0;
    public boolean M;
    public boolean M0;
    public final int N;
    public boolean N0;
    public int O;
    public kg.k1 O0;
    public int P;
    public Drawable P0;
    public StaticLayout Q;
    public int Q0;
    public boolean R;
    public int S;
    public int T;
    public int U;
    public jc V;
    public StaticLayout W;
    public int a0;
    public int b0;
    public int c0;
    public boolean d0;
    public int e0;
    public boolean f;
    public final int f0;
    public int g0;
    public wd0 h;
    public int h0;
    public StaticLayout i0;
    public boolean[] j0;
    public boolean k0;
    public boolean l0;
    public final org.telegram.ui.Components.t5 m0;
    public CharSequence n;
    public boolean n0;
    public long o0;
    public boolean p0;
    public int q0;
    public final ImageReceiver r;
    public StaticLayout r0;
    public final org.telegram.ui.Components.r8 s;
    public final org.telegram.ui.Components.d5 s0;
    public final org.telegram.ui.Components.d5 t0;
    public final th.t5 u0;
    public final RectF v0;
    public CharSequence w;
    public qz0 w0;
    public final org.telegram.ui.ActionBar.p6 x;
    public Paint x0;
    public TLRPC.TL_sponsoredPeer y;
    public final dc y0;
    public final RectF z0;

    public k6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.N = d20.s0;
        this.f0 = org.telegram.messenger.i0.L(19.0f);
        this.m0 = new org.telegram.ui.Components.t5(this, 0L, 350L, gr.h);
        gr grVar = gr.f;
        this.u0 = new th.t5(null, false);
        this.v0 = new RectF();
        this.y0 = new dc(this);
        this.z0 = new RectF();
        this.H0 = true;
        this.I0 = new dc(this);
        this.J0 = new Paint(1);
        this.K0 = new RectF();
        this.Q0 = org.telegram.ui.ActionBar.a7.b;
        this.x = p6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.i0.L(23.0f));
        this.s = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        ep epVar = new ep(21, context, p6Var);
        this.A0 = epVar;
        epVar.b(-1, org.telegram.ui.ActionBar.t6.d6, org.telegram.ui.ActionBar.t6.k7);
        epVar.setDrawUnchecked(false);
        epVar.setDrawBackgroundAsArc(3);
        addView(epVar);
        org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(20.0f), this);
        this.s0 = d5Var;
        d5Var.setCallback(this);
        org.telegram.ui.Components.d5 d5Var2 = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(20.0f), this);
        this.t0 = d5Var2;
        d5Var2.setCallback(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(int i10) {
        Drawable drawable;
        TLRPC.FileLocation fileLocation;
        int L;
        TLRPC.Dialog dialog;
        String i11;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.FileLocation fileLocation2;
        Drawable drawable2;
        TLRPC.User user3 = this.D;
        ImageReceiver imageReceiver = this.r;
        int i12 = this.N;
        org.telegram.ui.Components.r8 r8Var = this.s;
        TLRPC.FileLocation fileLocation3 = null;
        if (user3 != null) {
            r8Var.r(user3);
            if (h20.z(this.D)) {
                r8Var.g(12);
                imageReceiver.q0(null, null, r8Var, null, null, 0);
            } else if (this.L) {
                r8Var.g(1);
                imageReceiver.q0(null, null, r8Var, null, null, 0);
            } else {
                TLRPC.User user4 = this.D;
                TLRPC.UserProfilePhoto userProfilePhoto = user4.photo;
                if (userProfilePhoto != null) {
                    fileLocation3 = userProfilePhoto.photo_small;
                    Drawable drawable3 = userProfilePhoto.strippedBitmap;
                    if (drawable3 != null) {
                        drawable2 = drawable3;
                        fileLocation = fileLocation3;
                        imageReceiver.s0(ic.m(i12, 1, user4), "50_50", ic.m(d20.s0, 2, this.D), "50_50", drawable2, this.D, 0);
                        fileLocation3 = fileLocation;
                    }
                }
                drawable2 = r8Var;
                fileLocation = fileLocation3;
                imageReceiver.s0(ic.m(i12, 1, user4), "50_50", ic.m(d20.s0, 2, this.D), "50_50", drawable2, this.D, 0);
                fileLocation3 = fileLocation;
            }
        } else {
            TLRPC.Chat chat = this.E;
            if (chat != null) {
                TLRPC.ChatPhoto chatPhoto = chat.photo;
                if (chatPhoto != null) {
                    fileLocation3 = chatPhoto.photo_small;
                    Drawable drawable4 = chatPhoto.strippedBitmap;
                    if (drawable4 != null) {
                        drawable = drawable4;
                        fileLocation = fileLocation3;
                        if (chat.monoforum) {
                            r8Var.q(chat);
                            imageReceiver.s0(ic.m(i12, 1, this.E), "50_50", ic.m(d20.s0, 2, this.E), "50_50", drawable, this.E, 0);
                        } else {
                            gg.e.n(i12, chat, r8Var, imageReceiver);
                        }
                        fileLocation3 = fileLocation;
                    }
                }
                drawable = r8Var;
                fileLocation = fileLocation3;
                if (chat.monoforum) {
                }
                fileLocation3 = fileLocation;
            } else {
                org.telegram.messenger.f5 f5Var = this.G;
                if (f5Var != null) {
                    r8Var.k(0L, f5Var.i, f5Var.j, null);
                    imageReceiver.q0(null, null, r8Var, null, null, 0);
                } else {
                    r8Var.k(0L, null, null, null);
                    imageReceiver.q0(null, null, r8Var, null, null, 0);
                }
            }
        }
        if (org.telegram.messenger.w3.Y(this.E)) {
            int L2 = org.telegram.messenger.i0.L(46.0f);
            Rect rect = rf.o.a;
            L = (L2 * 20) / 72;
        } else {
            TLRPC.Chat chat2 = this.E;
            if (chat2 == null || !chat2.monoforum) {
                L = org.telegram.messenger.i0.L(this.N0 ? 10.0f : (chat2 == null || !chat2.forum) ? 23.0f : 16.0f);
            } else {
                L = 0;
            }
        }
        imageReceiver.J0(L);
        if (i10 != 0) {
            int i13 = vp.D8;
            boolean z10 = !(((i10 & 2) == 0 || this.D == null) && ((i10 & 8) == 0 || this.E == null)) && (((fileLocation2 = this.K) != null && fileLocation3 == null) || ((fileLocation2 == null && fileLocation3 != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation3.volume_id && fileLocation2.local_id == fileLocation3.local_id))));
            if (!z10 && (i10 & 4) != 0 && (user2 = this.D) != null) {
                TLRPC.UserStatus userStatus = user2.status;
                if ((userStatus != null ? userStatus.expires : 0) != this.J) {
                    z10 = true;
                }
            }
            if (!z10 && (524288 & i10) != 0 && ((user = this.D) != null || this.E != null)) {
                B(user != null ? user.verified : this.E.verified, user, this.E, true);
            }
            if ((!z10 && (i10 & 1) != 0 && this.D != null) || ((i10 & 16) != 0 && this.E != null)) {
                if (this.D != null) {
                    i11 = this.D.first_name + this.D.last_name;
                } else {
                    TLRPC.Chat chat3 = this.E;
                    i11 = chat3.monoforum ? gg.e.i(i12, chat3, false) : chat3.title;
                }
                if (!i11.equals(this.I)) {
                    z10 = true;
                }
            }
            if (!((z10 || !this.d0 || (i10 & 256) == 0 || (dialog = (TLRPC.Dialog) vp.r1(i12).Q.f(this.H)) == null || vp.r1(i12).U0(dialog) == this.e0) ? z10 : true)) {
                return;
            }
        }
        TLRPC.User user5 = this.D;
        if (user5 != null) {
            TLRPC.UserStatus userStatus2 = user5.status;
            if (userStatus2 != null) {
                this.J = userStatus2.expires;
            } else {
                this.J = 0;
            }
            this.I = this.D.first_name + this.D.last_name;
        } else {
            TLRPC.Chat chat4 = this.E;
            if (chat4 != null) {
                this.I = chat4.monoforum ? gg.e.i(i12, chat4, false) : chat4.title;
            }
        }
        this.K = fileLocation3;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            requestLayout();
        } else {
            x();
        }
        postInvalidate();
    }

    public final void B(boolean z10, TLRPC.User user, TLRPC.Chat chat, boolean z11) {
        boolean z12 = cd.X;
        org.telegram.ui.Components.d5 d5Var = this.t0;
        d5Var.a = z12;
        boolean z13 = this.H0;
        org.telegram.ui.ActionBar.p6 p6Var = this.x;
        if (z13 && z10) {
            d5Var.g(new eq(org.telegram.ui.ActionBar.t6.f1, org.telegram.ui.ActionBar.t6.i1, 0, 0), z11);
            d5Var.k(null);
        } else if (z13 && user != null && !this.L && org.telegram.messenger.o5.f(user.emoji_status) != 0) {
            d5Var.j(org.telegram.messenger.o5.f(user.emoji_status), z11);
            d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z9, p6Var)));
        } else if (!this.H0 || chat == null || this.L || org.telegram.messenger.o5.f(chat.emoji_status) == 0) {
            if (this.H0 && user != null && !this.L) {
                vp.r1(this.N);
                if (vp.A2(user)) {
                    d5Var.g((Drawable) ea.f.d().f, z11);
                    d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z9, p6Var)));
                }
            }
            d5Var.g(null, z11);
            d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z9, p6Var)));
        } else {
            d5Var.j(org.telegram.messenger.o5.f(chat.emoji_status), z11);
            d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z9, p6Var)));
        }
        long c10 = user != null ? org.telegram.messenger.o5.c(user) : chat != null ? org.telegram.messenger.o5.c(chat) : 0L;
        org.telegram.ui.Components.d5 d5Var2 = this.s0;
        if (c10 == 0 || this.L) {
            d5Var2.g(null, z11);
        } else {
            d5Var2.j(c10, z11);
        }
        d5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z9, p6Var)));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.p6));
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.i4) {
            invalidate();
            return;
        }
        if (i10 == zs.i3) {
            TLRPC.User user = this.D;
            TL_account.RequirementToContact requirementToContact = null;
            requirementToContact = null;
            requirementToContact = null;
            requirementToContact = null;
            int i12 = this.N;
            if (user == null) {
                TLRPC.Chat chat = this.E;
                if (chat == null) {
                    org.telegram.messenger.f5 f5Var = this.G;
                    if (f5Var == null) {
                        return;
                    }
                    if (this.l0 && f5Var.m != null) {
                        requirementToContact = vp.r1(i12).H2(this.G.m.id);
                    }
                } else if (chat.send_paid_messages_stars != 0) {
                    TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = new TL_account.requirementToContactPaidMessages();
                    requirementtocontactpaidmessages.stars_amount = chat.send_paid_messages_stars;
                    requirementToContact = requirementtocontactpaidmessages;
                }
            } else if (this.l0) {
                requirementToContact = vp.r1(i12).H2(this.D.id);
            }
            boolean z10 = requirementToContact instanceof TL_account.requirementToContactPremium;
            if (this.n0 == z10 && this.o0 == org.telegram.messenger.o5.k(requirementToContact)) {
                return;
            }
            this.n0 = z10;
            this.o0 = org.telegram.messenger.o5.k(requirementToContact);
            invalidate();
        }
    }

    public TLRPC.Chat getChat() {
        return this.E;
    }

    public long getDialogId() {
        return this.H;
    }

    public TLRPC.User getUser() {
        return this.D;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.P();
        zs.e().c(this, zs.i4);
        if (this.l0) {
            zs.e().c(this, zs.i3);
        }
        this.t0.a();
        this.s0.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.R();
        zs.e().n(this, zs.i4);
        if (this.l0) {
            zs.e().n(this, zs.i3);
        }
        this.t0.b();
        this.s0.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        int ceil;
        if (this.D == null && this.E == null && this.F == null && this.G == null) {
            return;
        }
        boolean z10 = this.M;
        org.telegram.ui.ActionBar.p6 p6Var = this.x;
        if (z10) {
            Paint d = (!this.E0 || p6Var == null) ? null : p6Var.d("paintDivider");
            if (d == null) {
                d = org.telegram.ui.ActionBar.t6.k0;
            }
            Paint paint = d;
            if (cd.X) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.i0.L(org.telegram.messenger.i0.C), getMeasuredHeight() - 1, paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(org.telegram.messenger.i0.L(org.telegram.messenger.i0.C), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
            }
        } else {
            canvas2 = canvas;
        }
        if (this.R) {
            z.t(this.S, this.T, org.telegram.ui.ActionBar.t6.a1);
            org.telegram.ui.ActionBar.t6.a1.draw(canvas2);
        }
        StaticLayout staticLayout = this.Q;
        if (staticLayout != null) {
            boolean z11 = cd.X;
            org.telegram.ui.Components.d5 d5Var = this.s0;
            if (z11) {
                ceil = (int) (staticLayout.getLineRight(0) + this.O + org.telegram.messenger.i0.L(6.0f));
            } else if (staticLayout.getLineLeft(0) == 0.0f) {
                ceil = (this.O - org.telegram.messenger.i0.L(3.0f)) - d5Var.s;
            } else {
                f7 = 6.0f;
                ceil = (int) ((((this.O + this.U) - Math.ceil(this.Q.getLineWidth(0))) - org.telegram.messenger.i0.L(3.0f)) - d5Var.s);
                z.u(d5Var, ceil, ((this.Q.getHeight() - d5Var.s) / 2.0f) + this.P);
                d5Var.draw(canvas2);
                canvas2.save();
                canvas2.translate(this.O, this.P);
                this.Q.draw(canvas2);
                canvas2.restore();
                boolean z12 = cd.X;
                org.telegram.ui.Components.d5 d5Var2 = this.t0;
                z.u(d5Var2, !z12 ? this.Q.getLineLeft(0) == 0.0f ? (this.O - org.telegram.messenger.i0.L(3.0f)) - d5Var2.s : (int) ((((this.O + this.U) - Math.ceil(this.Q.getLineWidth(0))) - org.telegram.messenger.i0.L(3.0f)) - d5Var2.s) : (int) (this.Q.getLineRight(0) + this.O + org.telegram.messenger.i0.L(f7)), ((this.Q.getHeight() - d5Var2.s) / 2.0f) + this.P);
                d5Var2.draw(canvas2);
            }
            f7 = 6.0f;
            z.u(d5Var, ceil, ((this.Q.getHeight() - d5Var.s) / 2.0f) + this.P);
            d5Var.draw(canvas2);
            canvas2.save();
            canvas2.translate(this.O, this.P);
            this.Q.draw(canvas2);
            canvas2.restore();
            boolean z122 = cd.X;
            org.telegram.ui.Components.d5 d5Var22 = this.t0;
            z.u(d5Var22, !z122 ? this.Q.getLineLeft(0) == 0.0f ? (this.O - org.telegram.messenger.i0.L(3.0f)) - d5Var22.s : (int) ((((this.O + this.U) - Math.ceil(this.Q.getLineWidth(0))) - org.telegram.messenger.i0.L(3.0f)) - d5Var22.s) : (int) (this.Q.getLineRight(0) + this.O + org.telegram.messenger.i0.L(f7)), ((this.Q.getHeight() - d5Var22.s) / 2.0f) + this.P);
            d5Var22.draw(canvas2);
        } else {
            f7 = 6.0f;
        }
        if (this.y == null || this.w0 == null || this.x0 == null) {
            f10 = 2.0f;
        } else {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var);
            this.x0.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, w02));
            int L = org.telegram.messenger.i0.L(12.66f) + ((int) this.w0.k());
            int L2 = org.telegram.messenger.i0.L(17.33f);
            float L3 = cd.X ? org.telegram.messenger.i0.L(12.0f) : org.telegram.messenger.m5.z(12.0f, getWidth(), L);
            int i10 = this.P;
            f10 = 2.0f;
            float f11 = f7;
            RectF rectF = this.v0;
            rectF.set(L3, i10, r6 + L, i10 + L2);
            rectF.inset(-org.telegram.messenger.i0.L(f11), -org.telegram.messenger.i0.L(f11));
            canvas2.save();
            float a2 = this.y0.a(0.1f);
            canvas2.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas2.translate(L3, this.P);
            RectF rectF2 = org.telegram.messenger.i0.P;
            float f12 = L2;
            rectF2.set(0.0f, 0.0f, L, f12);
            float f13 = f12 / 2.0f;
            canvas2.drawRoundRect(rectF2, f13, f13, this.x0);
            this.w0.c(org.telegram.messenger.i0.L(6.33f), f13, 1.0f, w02, canvas);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.r0 != null) {
            canvas2.save();
            canvas2.translate(this.q0 + this.b0, org.telegram.messenger.i0.L(this.M0 ? 35.0f : 33.0f) + this.c0);
            this.r0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout2 = this.i0;
        int i11 = this.f0;
        if (staticLayout2 != null) {
            int L4 = this.g0 - org.telegram.messenger.i0.L(5.5f);
            float L5 = org.telegram.messenger.i0.L(11.0f) + L4 + this.h0;
            float L6 = org.telegram.messenger.i0.L(23.0f) + i11;
            RectF rectF3 = this.z0;
            rectF3.set(L4, i11, L5, L6);
            float f14 = org.telegram.messenger.i0.p * 11.5f;
            canvas2.drawRoundRect(rectF3, f14, f14, vp.r1(this.N).q2(this.H, 0L, null) ? org.telegram.ui.ActionBar.t6.y0 : org.telegram.ui.ActionBar.t6.w0);
            canvas2.save();
            canvas2.translate(this.g0, org.telegram.messenger.i0.L(4.0f) + i11);
            this.i0.draw(canvas2);
            canvas2.restore();
        }
        if (this.W != null) {
            jc jcVar = this.V;
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.U8, false);
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.W8, false);
            jcVar.g.setColor(x02);
            y yVar = jcVar.e;
            if (yVar != null) {
                org.telegram.ui.ActionBar.t6.H1(yVar, x03, true);
            }
            RectF rectF4 = org.telegram.messenger.i0.P;
            rectF4.set(this.a0, i11, this.W.getWidth() + r12, org.telegram.messenger.i0.L(23.0f) + i11);
            rectF4.inset(-org.telegram.messenger.i0.L(16.0f), -org.telegram.messenger.i0.L(4.0f));
            jc jcVar2 = this.V;
            jcVar2.i = false;
            jcVar2.c = 0;
            jcVar2.a(rectF4);
            jc jcVar3 = this.V;
            jcVar3.n = true;
            jcVar3.c(canvas2, jcVar3.g);
            y yVar2 = jcVar3.e;
            if (yVar2 != null) {
                yVar2.draw(canvas2);
            }
            canvas2.save();
            canvas2.translate(this.a0, org.telegram.messenger.i0.L(4.0f) + i11);
            this.W.draw(canvas2);
            canvas2.restore();
        }
        boolean z13 = this.f;
        ImageReceiver imageReceiver = this.r;
        if (!z13) {
            TLRPC.Chat chat = this.E;
            th.t5 t5Var = this.u0;
            if (chat == null || !chat.monoforum) {
                TLRPC.User user = this.D;
                if (user != null) {
                    th.w5.h(user.id, canvas2, imageReceiver, t5Var);
                } else if (chat != null) {
                    if (org.telegram.messenger.w3.Y(chat)) {
                        Drawable drawable = org.telegram.ui.ActionBar.t6.S0;
                        RectF rectF5 = t5Var.F;
                        RectF rectF6 = t5Var.F;
                        rf.o.a(canvas2, drawable, rectF5.centerX(), rectF6.centerY(), rectF6.width());
                    }
                    th.w5.h(-this.E.id, canvas2, imageReceiver, t5Var);
                } else {
                    imageReceiver.A0(t5Var.F);
                    imageReceiver.h(canvas2, null);
                }
            } else {
                if (this.h == null) {
                    this.h = new wd0();
                }
                wd0 wd0Var = this.h;
                RectF rectF7 = t5Var.F;
                RectF rectF8 = t5Var.F;
                wd0Var.a((int) rectF7.centerX(), (int) rectF8.centerY(), (int) (rectF8.width() / f10));
                canvas2.save();
                canvas2.clipPath(this.h);
                imageReceiver.A0(rectF8);
                imageReceiver.h(canvas2, null);
                canvas2.restore();
            }
        }
        float d10 = this.m0.d(this.n0);
        if (d10 > 0.0f) {
            float s10 = imageReceiver.s() + org.telegram.messenger.i0.L(14.0f);
            float r10 = imageReceiver.r() + org.telegram.messenger.i0.L(16.0f);
            canvas2.save();
            org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var));
            canvas2.drawCircle(r10, s10, org.telegram.messenger.i0.L(11.33f) * d10, org.telegram.ui.ActionBar.t6.t0);
            if (this.O0 == null) {
                this.O0 = new kg.k1(org.telegram.ui.ActionBar.t6.zk, org.telegram.ui.ActionBar.t6.Ak, -1, -1, this.x);
            }
            this.O0.d((int) (r10 - org.telegram.messenger.i0.L(10.0f)), 0.0f, (int) (s10 - org.telegram.messenger.i0.L(10.0f)), (int) (org.telegram.messenger.i0.L(10.0f) + r10), 0.0f, (int) (org.telegram.messenger.i0.L(10.0f) + s10));
            canvas2.drawCircle(r10, s10, org.telegram.messenger.i0.L(10.0f) * d10, this.O0.f);
            if (this.P0 == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.P0 = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.P0.setBounds((int) (r10 - (((r6.getIntrinsicWidth() / f10) * 0.875f) * d10)), (int) (s10 - (((this.P0.getIntrinsicHeight() / f10) * 0.875f) * d10)), (int) (((this.P0.getIntrinsicWidth() / f10) * 0.875f * d10) + r10), (int) (((this.P0.getIntrinsicHeight() / f10) * 0.875f * d10) + s10));
            this.P0.setAlpha((int) (d10 * 255.0f));
            this.P0.draw(canvas2);
            canvas2.restore();
        }
        if (!this.p0 || this.L0 == null) {
            return;
        }
        float L7 = org.telegram.messenger.i0.L(28.0f) + this.L0.c;
        float L8 = cd.X ? org.telegram.messenger.i0.L(15.0f) : (getWidth() - L7) - org.telegram.messenger.i0.L(15.0f);
        float L9 = org.telegram.messenger.i0.L(28.0f);
        int x04 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false);
        Paint paint2 = this.J0;
        paint2.setColor(x04);
        float height = (getHeight() + L9) / f10;
        RectF rectF9 = this.K0;
        rectF9.set(L8, (getHeight() - L9) / f10, L7 + L8, height);
        canvas2.save();
        float a10 = this.I0.a(0.06f);
        canvas2.scale(a10, a10, rectF9.centerX(), rectF9.centerY());
        canvas2.drawRoundRect(rectF9, rectF9.height() / f10, rectF9.height() / f10, paint2);
        this.L0.c(org.telegram.messenger.i0.L(14.0f) + L8, getHeight() / f10, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        StaticLayout staticLayout = this.Q;
        if (staticLayout != null) {
            sb2.append(staticLayout.getText());
        }
        if (this.k0) {
            sb2.append(", ");
            sb2.append(cd.L0(2131754739, null));
            sb2.append("\n");
        }
        if (this.r0 != null) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(this.r0.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
        ep epVar = this.A0;
        if (epVar.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(epVar.a.q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.D == null && this.E == null && this.F == null && this.G == null) {
            return;
        }
        ep epVar = this.A0;
        if (epVar != null) {
            int L = cd.X ? (i12 - i10) - org.telegram.messenger.i0.L(42.0f) : org.telegram.messenger.i0.L(42.0f);
            int L2 = org.telegram.messenger.i0.L(36.0f);
            epVar.layout(L, L2, epVar.getMeasuredWidth() + L, epVar.getMeasuredHeight() + L2);
        }
        if (z10) {
            x();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        ep epVar = this.A0;
        if (epVar != null) {
            epVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.M0 ? org.telegram.messenger.i0.L(56.0f) : org.telegram.messenger.i0.L(60.0f) + (this.M ? 1 : 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r6.i == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a2, code lost:
    
        if (r6.i == false) goto L54;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        jc jcVar;
        if (this.p0 && this.C0 != null && this.D != null) {
            boolean contains = this.K0.contains(motionEvent.getX(), motionEvent.getY());
            int action = motionEvent.getAction();
            dc dcVar = this.I0;
            if (action == 0 || motionEvent.getAction() == 2) {
                dcVar.c(contains);
            } else {
                if (motionEvent.getAction() == 1) {
                    if (dcVar.i) {
                        this.C0.a(this.D);
                    }
                    dcVar.c(false);
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    dcVar.c(false);
                    return true;
                }
            }
            if (!contains) {
            }
            return true;
        }
        if (this.y != null && this.D0 != null) {
            boolean contains2 = this.v0.contains(motionEvent.getX(), motionEvent.getY());
            int action2 = motionEvent.getAction();
            dc dcVar2 = this.y0;
            if (action2 == 0 || motionEvent.getAction() == 2) {
                dcVar2.c(contains2);
            } else {
                if (motionEvent.getAction() == 1) {
                    if (dcVar2.i) {
                        this.D0.a(this, this.y);
                    }
                    dcVar2.c(false);
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    dcVar2.c(false);
                    return true;
                }
            }
            if (!contains2) {
            }
            return true;
        }
        if (((this.D == null && this.E == null) || !this.u0.a(this, motionEvent)) && ((jcVar = this.V) == null || !jcVar.b(motionEvent))) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.y = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z10) {
        this.H0 = z10;
    }

    public void setOnSponsoredOptionsClick(j20 j20Var) {
        this.D0 = j20Var;
    }

    public void setOpenBotButton(boolean z10) {
        if (this.p0 == z10) {
            return;
        }
        if (this.L0 == null) {
            this.L0 = new qz0(cd.L0(2131753020, null), 14.0f, org.telegram.messenger.i0.o());
        }
        int L = z10 ? org.telegram.messenger.i0.L(30.0f) + ((int) this.L0.c) : 0;
        boolean z11 = cd.X;
        int i10 = z11 ? L : 0;
        if (z11) {
            L = 0;
        }
        setPadding(i10, 0, L, 0);
        this.p0 = z10;
        this.I0.c(false);
    }

    public void setRectangularAvatar(boolean z10) {
        this.N0 = z10;
    }

    public void setSubLabel(CharSequence charSequence) {
        this.w = charSequence;
        A(0);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10 = this.Q0;
        int i11 = org.telegram.ui.ActionBar.a7.b;
        if (i10 == i11) {
            if (this.Q == null || getMeasuredWidth() <= 0) {
                return;
            }
            x();
            return;
        }
        this.Q0 = i11;
        try {
            A(0);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.t0 == drawable || this.s0 == drawable || super.verifyDrawable(drawable);
    }

    public final void x() {
        TLRPC.Chat L0;
        TextPaint textPaint;
        int measuredWidth;
        CharSequence charSequence;
        TLRPC.UserStatus userStatus;
        int i10;
        int i11;
        int L;
        this.R = false;
        this.k0 = false;
        TLRPC.EncryptedChat encryptedChat = this.F;
        int i12 = this.N;
        if (encryptedChat != null) {
            this.R = true;
            this.H = org.telegram.messenger.o5.F(encryptedChat.id);
            if (cd.X) {
                this.S = (getMeasuredWidth() - org.telegram.messenger.i0.L(org.telegram.messenger.i0.C + 2)) - org.telegram.ui.ActionBar.t6.a1.getIntrinsicWidth();
                this.O = org.telegram.messenger.i0.L(11.0f);
            } else {
                this.S = org.telegram.messenger.i0.L(org.telegram.messenger.i0.C);
                this.O = org.telegram.ui.ActionBar.t6.a1.getIntrinsicWidth() + org.telegram.messenger.i0.L(r2 + 4);
            }
            this.T = org.telegram.messenger.i0.L(22.0f);
            B(false, null, null, false);
        } else {
            TLRPC.Chat chat = this.E;
            if (chat != null) {
                this.H = -chat.id;
                this.k0 = chat.verified;
                if (chat.monoforum && (L0 = vp.r1(i12).L0(Long.valueOf(this.E.linked_monoforum_id))) != null) {
                    this.k0 = L0.verified;
                }
                if (cd.X) {
                    this.O = org.telegram.messenger.i0.L(11.0f);
                } else {
                    this.O = org.telegram.messenger.i0.L(org.telegram.messenger.i0.C);
                }
                B(this.k0, null, this.E, false);
            } else {
                TLRPC.User user = this.D;
                if (user != null) {
                    this.H = user.id;
                    if (cd.X) {
                        this.O = org.telegram.messenger.i0.L(11.0f);
                    } else {
                        this.O = org.telegram.messenger.i0.L(org.telegram.messenger.i0.C);
                    }
                    this.T = org.telegram.messenger.i0.L(21.0f);
                    this.k0 = this.D.verified;
                    if (!this.L) {
                        vp.r1(i12);
                    }
                    B(this.k0, this.D, null, false);
                } else if (this.G != null) {
                    this.H = 0L;
                    if (cd.X) {
                        this.O = org.telegram.messenger.i0.L(11.0f);
                    } else {
                        this.O = org.telegram.messenger.i0.L(org.telegram.messenger.i0.C);
                    }
                    if (this.V == null) {
                        jc jcVar = new jc(this);
                        this.V = jcVar;
                        jcVar.h = new f(this, 5);
                    }
                }
            }
        }
        if (cd.X) {
            this.q0 = org.telegram.messenger.i0.L(11.0f);
        } else {
            this.q0 = org.telegram.messenger.i0.L(org.telegram.messenger.i0.C);
        }
        if (this.y != null) {
            if (this.w0 == null) {
                SpannableStringBuilder append = new SpannableStringBuilder(cd.L0(2131745852, null)).append((CharSequence) " i");
                dq dqVar = new dq(R.drawable.ic_ab_other, 0);
                dqVar.H = 0.55f;
                dqVar.I = 0.55f;
                dqVar.G = 0.7f;
                dqVar.r = -org.telegram.messenger.i0.L(2.0f);
                dqVar.s = 0.0f;
                append.setSpan(dqVar, append.length() - 1, append.length(), 33);
                this.w0 = new qz0(append, 12.0f, null);
            }
            if (this.x0 == null) {
                this.x0 = new Paint(1);
            }
        }
        CharSequence charSequence2 = this.n;
        CharSequence charSequence3 = charSequence2;
        if (charSequence2 == null) {
            charSequence3 = null;
        }
        TLRPC.Chat chat2 = this.E;
        org.telegram.ui.ActionBar.p6 p6Var = this.x;
        CharSequence charSequence4 = charSequence3;
        if (chat2 != null) {
            charSequence4 = charSequence3;
            if (chat2.monoforum) {
                TLRPC.Chat L02 = vp.r1(i12).L0(Long.valueOf(this.E.linked_monoforum_id));
                charSequence4 = charSequence3;
                if (L02 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i0.U(L02.title));
                    spannableStringBuilder.append((CharSequence) " ");
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) cd.L0(2131748362, null));
                    spannableStringBuilder.setSpan(new h00(cd.L0(2131748362, null), org.telegram.ui.ActionBar.t6.y6, p6Var), length, spannableStringBuilder.length(), 33);
                    charSequence4 = spannableStringBuilder;
                } else if (charSequence3 == null) {
                    charSequence4 = org.telegram.messenger.i0.F2(org.telegram.messenger.i0.D2(this.E.title));
                }
            } else if (charSequence3 == null) {
                charSequence4 = org.telegram.messenger.i0.F2(org.telegram.messenger.i0.D2(chat2.title));
            }
        } else if (charSequence3 == null) {
            TLRPC.User user2 = this.D;
            charSequence4 = charSequence3;
            if (user2 != null) {
                charSequence4 = org.telegram.messenger.i0.F2(org.telegram.messenger.i0.D2(h20.p(user2)));
            }
        }
        CharSequence M2 = org.telegram.messenger.i0.M2(charSequence4);
        if (TextUtils.isEmpty(M2)) {
            TLRPC.User user3 = this.D;
            M2 = (user3 == null || TextUtils.isEmpty(user3.phone)) ? cd.L0(2131749337, null) : org.telegram.messenger.m5.h(new StringBuilder("+"), this.D.phone, af.b.c());
        }
        if (this.E0) {
            if (this.F0 == null) {
                TextPaint textPaint2 = new TextPaint(1);
                this.F0 = textPaint2;
                textPaint2.setTypeface(org.telegram.messenger.i0.o());
            }
            this.F0.setTextSize(org.telegram.messenger.i0.L(this.M0 ? 15.0f : 16.0f));
            if (this.F != null) {
                this.F0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Z8, p6Var));
            } else {
                this.F0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.X8, p6Var));
            }
            textPaint = this.F0;
        } else {
            textPaint = this.F != null ? org.telegram.ui.ActionBar.t6.E0 : org.telegram.ui.ActionBar.t6.D0;
        }
        TextPaint textPaint3 = textPaint;
        if (cd.X) {
            measuredWidth = (getMeasuredWidth() - this.O) - org.telegram.messenger.i0.L(org.telegram.messenger.i0.C);
            this.U = measuredWidth;
        } else {
            measuredWidth = (getMeasuredWidth() - this.O) - org.telegram.messenger.i0.L(14.0f);
            this.U = measuredWidth;
        }
        if (this.R) {
            this.U -= org.telegram.ui.ActionBar.t6.a1.getIntrinsicWidth() + org.telegram.messenger.i0.L(6.0f);
        }
        if (this.y != null) {
            int L2 = org.telegram.messenger.i0.L(20.66f) + ((int) this.w0.c);
            this.U -= L2;
            if (cd.X) {
                this.O += L2;
            }
        }
        if (this.G != null) {
            int measureText = (int) (org.telegram.ui.ActionBar.t6.L0.measureText(cd.L0(2131749184, null)) + 1.0f);
            this.W = new StaticLayout(cd.L0(2131749184, null), org.telegram.ui.ActionBar.t6.L0, measureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (cd.X) {
                this.a0 = org.telegram.messenger.i0.L(16.0f) + org.telegram.messenger.i0.L(19.0f);
                this.O += measureText;
                this.q0 += measureText;
            } else {
                this.a0 = ((getMeasuredWidth() - measureText) - org.telegram.messenger.i0.L(19.0f)) - org.telegram.messenger.i0.L(16.0f);
            }
            this.U = z20.w(32.0f, measureText, this.U);
        }
        this.U -= getPaddingRight() + getPaddingLeft();
        int paddingRight = measuredWidth - (getPaddingRight() + getPaddingLeft());
        if (this.d0) {
            int U0 = vp.r1(i12).U0((TLRPC.Dialog) vp.r1(i12).Q.f(this.H));
            if (U0 != 0) {
                this.e0 = U0;
                Locale locale = Locale.US;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(U0);
                String sb3 = sb2.toString();
                this.h0 = Math.max(org.telegram.messenger.i0.L(12.0f), (int) Math.ceil(org.telegram.ui.ActionBar.t6.L0.measureText(sb3)));
                this.i0 = new StaticLayout(sb3, org.telegram.ui.ActionBar.t6.L0, this.h0, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int L3 = org.telegram.messenger.i0.L(18.0f) + this.h0;
                this.U -= L3;
                paddingRight -= L3;
                if (cd.X) {
                    this.g0 = org.telegram.messenger.i0.L(19.0f);
                    this.O += L3;
                    this.q0 += L3;
                } else {
                    this.g0 = (getMeasuredWidth() - this.h0) - org.telegram.messenger.i0.L(19.0f);
                }
            } else {
                this.e0 = 0;
                this.i0 = null;
            }
        } else {
            this.e0 = 0;
            this.i0 = null;
        }
        int i13 = paddingRight;
        org.telegram.ui.Components.d5 d5Var = this.s0;
        boolean d = d5Var.d();
        int i14 = d5Var.s;
        if (!d) {
            if (cd.X) {
                this.U -= i14;
            } else {
                this.O += i14;
            }
        }
        org.telegram.ui.Components.d5 d5Var2 = this.t0;
        if (!d5Var2.d() && !cd.X) {
            this.U -= d5Var2.s;
        }
        if (this.U < 0) {
            this.U = 0;
        }
        float L4 = this.U - org.telegram.messenger.i0.L(12.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        CharSequence ellipsize = TextUtils.ellipsize(M2, textPaint3, L4, truncateAt);
        if (ellipsize != null) {
            ellipsize = org.telegram.messenger.k6.m(ellipsize, textPaint3.getFontMetricsInt(), false, null, 0);
        }
        CharSequence charSequence5 = ellipsize;
        int i15 = this.U;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.Q = new StaticLayout(charSequence5, textPaint3, i15, alignment, 1.0f, 0.0f, false);
        TextPaint textPaint4 = org.telegram.ui.ActionBar.t6.Q0;
        TLRPC.Chat chat3 = this.E;
        if (chat3 == null || this.w != null) {
            charSequence = this.w;
            if (charSequence == null) {
                TLRPC.User user4 = this.D;
                if (user4 == null) {
                    charSequence = null;
                } else if (vp.E2(user4)) {
                    charSequence = cd.L0(2131744351, null);
                } else {
                    TLRPC.User user5 = this.D;
                    boolean z10 = user5.bot;
                    if (z10 && (i10 = user5.bot_active_users) != 0) {
                        charSequence = cd.H(' ', "BotUsersShort", i10);
                    } else if (z10) {
                        charSequence = cd.L0(2131753156, null);
                    } else {
                        long j10 = user5.id;
                        if (j10 == 489000) {
                            charSequence = cd.L0(2131743642, null);
                        } else if (h20.A(j10)) {
                            charSequence = cd.L0(2131745578, null);
                        } else {
                            if (this.j0 == null) {
                                this.j0 = new boolean[1];
                            }
                            boolean[] zArr = this.j0;
                            zArr[0] = false;
                            charSequence = cd.d0(i12, this.D, zArr, null);
                            if (this.j0[0]) {
                                textPaint4 = org.telegram.ui.ActionBar.t6.P0;
                            }
                            TLRPC.User user6 = this.D;
                            if (user6 != null && (user6.id == d20.i(i12).e() || ((userStatus = this.D.status) != null && userStatus.expires > ConnectionsManager.getInstance(i12).getCurrentTime()))) {
                                textPaint4 = org.telegram.ui.ActionBar.t6.P0;
                                charSequence = cd.L0(2131747842, null);
                            }
                        }
                    }
                }
            }
            if (this.L || h20.z(this.D)) {
                this.P = org.telegram.messenger.i0.L(20.0f);
                charSequence = null;
            }
        } else {
            if (org.telegram.messenger.w3.Y(chat3)) {
                charSequence = cd.L0(2131751990, null).toLowerCase();
            } else if (org.telegram.messenger.w3.V(this.E)) {
                TLRPC.Chat chat4 = this.E;
                int i16 = chat4.participants_count;
                charSequence = i16 != 0 ? cd.H(',', "Subscribers", i16) : !org.telegram.messenger.w3.t0(chat4) ? cd.L0(2131752329, null).toLowerCase() : cd.L0(2131752318, null).toLowerCase();
            } else {
                TLRPC.Chat chat5 = this.E;
                int i17 = chat5.participants_count;
                charSequence = i17 != 0 ? cd.H(',', "Members", i17) : chat5.has_geo ? cd.L0(2131748657, null) : org.telegram.messenger.w3.p0(chat5) ? cd.L0(2131748363, null) : !org.telegram.messenger.w3.t0(this.E) ? cd.L0(2131748656, null).toLowerCase() : cd.L0(2131748653, null).toLowerCase();
            }
            this.P = org.telegram.messenger.i0.L(19.0f);
        }
        if (this.E0) {
            if (this.G0 == null) {
                this.G0 = new TextPaint(1);
            }
            this.G0.setTextSize(org.telegram.messenger.i0.L(this.M0 ? 13.0f : 15.0f));
            if (textPaint4 == org.telegram.ui.ActionBar.t6.Q0) {
                this.G0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A6, p6Var));
            } else if (textPaint4 == org.telegram.ui.ActionBar.t6.P0) {
                this.G0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.p6, p6Var));
            }
            textPaint4 = this.G0;
        }
        if (TextUtils.isEmpty(charSequence)) {
            i11 = i13;
            this.P = org.telegram.messenger.i0.L(20.0f);
            this.r0 = null;
        } else {
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint4, i13 - org.telegram.messenger.i0.L(12.0f), truncateAt), textPaint4, i13, alignment, 1.0f, 0.0f, false);
            i11 = i13;
            this.r0 = staticLayout;
            this.P = org.telegram.messenger.i0.L(9.0f);
            this.T -= org.telegram.messenger.i0.L(10.0f);
        }
        if (cd.X) {
            L = (getMeasuredWidth() - org.telegram.messenger.i0.L(57.0f)) - getPaddingRight();
        } else {
            L = org.telegram.messenger.i0.L(this.M0 ? 14.0f : this.N0 ? 15.0f : 11.0f) + getPaddingLeft();
        }
        this.u0.F.set(L, org.telegram.messenger.i0.L(this.M0 ? 6.0f : 7.0f), org.telegram.messenger.i0.L(this.M0 ? 44.0f : this.N0 ? 42.0f : 46.0f) + L, org.telegram.messenger.i0.L(this.M0 ? 44.0f : 46.0f) + org.telegram.messenger.i0.L(this.M0 ? 6.0f : 7.0f));
        if (cd.X) {
            if (this.Q.getLineCount() > 0 && this.Q.getLineLeft(0) == 0.0f) {
                double ceil = Math.ceil(this.Q.getLineWidth(0));
                double d10 = this.U;
                if (ceil < d10) {
                    this.O = (int) ((d10 - ceil) + this.O);
                }
            }
            StaticLayout staticLayout2 = this.r0;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0 && this.r0.getLineLeft(0) == 0.0f) {
                double ceil2 = Math.ceil(this.r0.getLineWidth(0));
                double d11 = i11;
                if (ceil2 < d11) {
                    this.q0 = (int) ((d11 - ceil2) + this.q0);
                }
            }
        } else {
            if (this.Q.getLineCount() > 0 && this.Q.getLineRight(0) == this.U) {
                double ceil3 = Math.ceil(this.Q.getLineWidth(0));
                double d12 = this.U;
                if (ceil3 < d12) {
                    this.O = (int) (this.O - (d12 - ceil3));
                }
            }
            StaticLayout staticLayout3 = this.r0;
            if (staticLayout3 != null && staticLayout3.getLineCount() > 0 && this.r0.getLineRight(0) == i11) {
                double ceil4 = Math.ceil(this.r0.getLineWidth(0));
                double d13 = i11;
                if (ceil4 < d13) {
                    this.q0 = (int) (this.q0 - (d13 - ceil4));
                }
            }
        }
        this.O = getPaddingLeft() + this.O;
        this.q0 = getPaddingLeft() + this.q0;
        this.S = getPaddingLeft() + this.S;
        if (this.M0) {
            this.O = org.telegram.messenger.i0.L(1.0f) + this.O;
            this.P = org.telegram.messenger.i0.L(1.0f) + this.P;
        }
    }

    public final void y(boolean z10, boolean z11) {
        ep epVar = this.A0;
        if (epVar == null) {
            return;
        }
        epVar.a(z10, z11);
    }

    public final void z(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.n = charSequence;
        boolean z12 = obj instanceof TLRPC.User;
        int i10 = this.N;
        TL_account.RequirementToContact requirementToContact = null;
        TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = null;
        requirementToContact = null;
        if (z12) {
            this.D = (TLRPC.User) obj;
            this.E = null;
            this.G = null;
            TL_account.RequirementToContact H2 = this.l0 ? vp.r1(i10).H2(this.D.id) : null;
            this.n0 = H2 instanceof TL_account.requirementToContactPremium;
            this.o0 = org.telegram.messenger.o5.k(H2);
            setOpenBotButton(this.B0 && this.D.bot_has_main_app);
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            this.E = chat;
            this.D = null;
            this.G = null;
            if (chat.send_paid_messages_stars != 0) {
                requirementtocontactpaidmessages = new TL_account.requirementToContactPaidMessages();
                requirementtocontactpaidmessages.stars_amount = chat.send_paid_messages_stars;
            }
            this.n0 = false;
            this.o0 = org.telegram.messenger.o5.k(requirementtocontactpaidmessages);
            setOpenBotButton(false);
        } else if (obj instanceof org.telegram.messenger.f5) {
            org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) obj;
            this.G = f5Var;
            this.E = null;
            this.D = null;
            if (this.l0 && f5Var.m != null) {
                requirementToContact = vp.r1(i10).H2(this.G.m.id);
            }
            this.n0 = requirementToContact instanceof TL_account.requirementToContactPremium;
            this.o0 = org.telegram.messenger.o5.k(requirementToContact);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.F = encryptedChat;
        this.w = charSequence2;
        this.d0 = z10;
        this.L = z11;
        A(0);
    }
}
