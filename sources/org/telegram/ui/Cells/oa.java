package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class oa extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 a;
    public final org.telegram.ui.Components.g9 b;
    public final og.c c;
    public final org.telegram.ui.ActionBar.u5 d;
    public final ImageView e;
    public final org.telegram.ui.Components.r8 f;
    public CharSequence h;
    public int n;
    public String r;
    public final int s;
    public int w;
    public int x;
    public final boolean y;

    public oa(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.s = d20.s0;
        this.y = true;
        this.a = p6Var;
        this.w = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, p6Var);
        this.x = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.n6, p6Var);
        this.f = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.b = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(24.0f));
        boolean z10 = cd.X;
        addView(g9Var, w7.b6.d(48, 48.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11, 11.0f, z10 ? 11 : 0.0f, 0.0f));
        og.c cVar = new og.c(context, 3);
        this.c = cVar;
        zs.i(cVar);
        org.telegram.ui.ActionBar.a7.Y(cVar, org.telegram.ui.ActionBar.t6.G6, p6Var);
        cVar.setTextSize(17);
        cVar.setGravity((cd.X ? 5 : 3) | 48);
        boolean z11 = cd.X;
        addView(cVar, w7.b6.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 28 : 72, 14.5f, z11 ? 72 : 28, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.d = u5Var;
        u5Var.setTextSize(14);
        u5Var.setGravity((cd.X ? 5 : 3) | 48);
        boolean z12 = cd.X;
        addView(u5Var, w7.b6.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 28.0f : 72, 37.5f, z12 ? 72 : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.m6, p6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        boolean z13 = cd.X;
        addView(imageView, w7.b6.d(-2, -2.0f, (z13 ? 5 : 3) | 16, z13 ? 0.0f : 16.0f, 0.0f, z13 ? 16.0f : 0.0f, 0.0f));
    }

    public final void a(String str, TLObject tLObject) {
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        org.telegram.ui.Components.g9 g9Var = this.b;
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        og.c cVar = this.c;
        if (tLObject == null && str == null) {
            this.h = null;
            cVar.k("");
            u5Var.l("", false);
            g9Var.setImageDrawable(null);
            return;
        }
        this.h = str;
        if (tLObject instanceof TLRPC.User) {
            user = (TLRPC.User) tLObject;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            user = null;
        } else {
            chat = null;
            user = null;
        }
        org.telegram.ui.Components.r8 r8Var = this.f;
        if (user != null) {
            r8Var.r(user);
        } else if (chat != null) {
            r8Var.q(chat);
        } else {
            r8Var.k(this.n, "#", null, null);
        }
        if (user != null) {
            this.r = h20.p(user);
        } else {
            this.r = chat.title;
        }
        cVar.k(this.r);
        if (this.h != null) {
            u5Var.setTextColor(this.w);
            u5Var.l(this.h, false);
            if (g9Var != null) {
                g9Var.e(user, r8Var);
            }
        } else if (user != null) {
            if (user.bot) {
                u5Var.setTextColor(this.w);
                if (user.bot_chat_history) {
                    u5Var.l(cd.L0(2131752946, null), false);
                } else {
                    u5Var.l(cd.L0(2131752947, null), false);
                }
            } else {
                long j10 = user.id;
                int i10 = this.s;
                if (j10 == d20.i(i10).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i10).getCurrentTime()) || vp.r1(i10).Z.containsKey(Long.valueOf(user.id)))) {
                    u5Var.setTextColor(this.x);
                    u5Var.l(cd.L0(2131747842, null), false);
                } else {
                    u5Var.setTextColor(this.w);
                    u5Var.l(cd.d0(i10, user, null, null), false);
                }
            }
            g9Var.e(user, r8Var);
        } else if (chat != null) {
            u5Var.setTextColor(this.w);
            if (!org.telegram.messenger.w3.T(chat) || chat.megagroup) {
                int i11 = chat.participants_count;
                if (i11 != 0) {
                    u5Var.l(cd.G(i11, "Members", new Object[0]), false);
                } else if (chat.has_geo) {
                    u5Var.l(cd.L0(2131748657, null), false);
                } else if (org.telegram.messenger.w3.t0(chat)) {
                    u5Var.l(cd.L0(2131748653, null), false);
                } else {
                    u5Var.l(cd.L0(2131748656, null), false);
                }
            } else {
                int i12 = chat.participants_count;
                if (i12 != 0) {
                    u5Var.l(cd.G(i12, "Subscribers", new Object[0]), false);
                } else if (org.telegram.messenger.w3.t0(chat)) {
                    u5Var.l(cd.L0(2131752318, null), false);
                } else {
                    u5Var.l(cd.L0(2131752329, null), false);
                }
            }
            g9Var.e(chat, r8Var);
        } else {
            g9Var.setImageDrawable(r8Var);
        }
        g9Var.setRoundRadius(org.telegram.messenger.i0.L((chat == null || !chat.forum) ? 24.0f : 14.0f));
        ImageView imageView = this.e;
        if (imageView.getVisibility() != 0) {
            imageView.getVisibility();
        } else {
            imageView.setVisibility(8);
            imageView.setImageResource(0);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(70.0f), TLObject.FLAG_30));
    }

    public void setCurrentId(int i10) {
        this.n = i10;
    }

    public void setNameTypeface(Typeface typeface) {
        this.c.setTypeface(typeface);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10;
        int i11;
        try {
            int i12 = this.w;
            int i13 = this.x;
            org.telegram.ui.ActionBar.p6 p6Var = this.a;
            if (this.y) {
                this.w = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, p6Var);
                this.x = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.n6, p6Var);
            }
            org.telegram.ui.ActionBar.u5 u5Var = this.d;
            if (u5Var != null) {
                int textColor = u5Var.getTextColor();
                if (textColor == i13 && i13 != (i11 = this.x)) {
                    u5Var.setTextColor(i11);
                } else {
                    if (textColor != i12 || i12 == (i10 = this.w)) {
                        return;
                    }
                    u5Var.setTextColor(i10);
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setCheckDisabled(boolean z10) {
    }
}
