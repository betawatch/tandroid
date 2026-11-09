package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class oa extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 a;
    public final org.telegram.ui.Components.l9 b;
    public final di.e4 c;
    public final org.telegram.ui.ActionBar.l5 d;
    public final ImageView e;
    public final org.telegram.ui.Components.w8 f;
    public CharSequence h;
    public int n;
    public String r;
    public final int s;
    public int w;
    public int x;
    public final boolean y;

    public oa(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.s = p10.s0;
        this.y = true;
        this.a = g6Var;
        this.w = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.y6, g6Var);
        this.x = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.n6, g6Var);
        this.f = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.b = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z9 = id.a0;
        addView(l9Var, c8.ha.d(48, 48.0f, (z9 ? 5 : 3) | 48, z9 ? 0.0f : 11, 11.0f, z9 ? 11 : 0.0f, 0.0f));
        di.e4 e4Var = new di.e4(context, 3);
        this.c = e4Var;
        qs.i(e4Var);
        org.telegram.ui.ActionBar.s6.X(e4Var, org.telegram.ui.ActionBar.l6.G6, g6Var);
        e4Var.setTextSize(17);
        e4Var.setGravity((id.a0 ? 5 : 3) | 48);
        boolean z10 = id.a0;
        addView(e4Var, c8.ha.d(-1, 20.0f, (z10 ? 5 : 3) | 48, z10 ? 28 : 72, 14.5f, z10 ? 72 : 28, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.d = l5Var;
        l5Var.setTextSize(14);
        l5Var.setGravity((id.a0 ? 5 : 3) | 48);
        boolean z11 = id.a0;
        addView(l5Var, c8.ha.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 28.0f : 72, 37.5f, z11 ? 72 : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.m6, g6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        boolean z12 = id.a0;
        addView(imageView, c8.ha.d(-2, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 0.0f : 16.0f, 0.0f, z12 ? 16.0f : 0.0f, 0.0f));
    }

    public final void a(String str, TLObject tLObject) {
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        org.telegram.ui.Components.l9 l9Var = this.b;
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        di.e4 e4Var = this.c;
        if (tLObject == null && str == null) {
            this.h = null;
            e4Var.k("");
            l5Var.l("", false);
            l9Var.setImageDrawable(null);
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
        org.telegram.ui.Components.w8 w8Var = this.f;
        if (user != null) {
            w8Var.r(user);
        } else if (chat != null) {
            w8Var.q(chat);
        } else {
            w8Var.k(this.n, "#", null, null);
        }
        if (user != null) {
            this.r = t10.p(user);
        } else {
            this.r = chat.title;
        }
        e4Var.k(this.r);
        if (this.h != null) {
            l5Var.setTextColor(this.w);
            l5Var.l(this.h, false);
            if (l9Var != null) {
                l9Var.e(user, w8Var);
            }
        } else if (user != null) {
            if (user.bot) {
                l5Var.setTextColor(this.w);
                if (user.bot_chat_history) {
                    l5Var.l(id.M0(2131752946, null), false);
                } else {
                    l5Var.l(id.M0(2131752947, null), false);
                }
            } else {
                long j3 = user.id;
                int i7 = this.s;
                if (j3 == p10.i(i7).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i7).getCurrentTime()) || qp.s1(i7).Z.containsKey(Long.valueOf(user.id)))) {
                    l5Var.setTextColor(this.x);
                    l5Var.l(id.M0(2131747826, null), false);
                } else {
                    l5Var.setTextColor(this.w);
                    l5Var.l(id.d0(i7, user, null, null), false);
                }
            }
            l9Var.e(user, w8Var);
        } else if (chat != null) {
            l5Var.setTextColor(this.w);
            if (!org.telegram.messenger.t3.T(chat) || chat.megagroup) {
                int i10 = chat.participants_count;
                if (i10 != 0) {
                    l5Var.l(id.G(i10, "Members", new Object[0]), false);
                } else if (chat.has_geo) {
                    l5Var.l(id.M0(2131748642, null), false);
                } else if (org.telegram.messenger.t3.t0(chat)) {
                    l5Var.l(id.M0(2131748638, null), false);
                } else {
                    l5Var.l(id.M0(2131748641, null), false);
                }
            } else {
                int i11 = chat.participants_count;
                if (i11 != 0) {
                    l5Var.l(id.G(i11, "Subscribers", new Object[0]), false);
                } else if (org.telegram.messenger.t3.t0(chat)) {
                    l5Var.l(id.M0(2131752318, null), false);
                } else {
                    l5Var.l(id.M0(2131752329, null), false);
                }
            }
            l9Var.e(chat, w8Var);
        } else {
            l9Var.setImageDrawable(w8Var);
        }
        l9Var.setRoundRadius(org.telegram.messenger.g0.L((chat == null || !chat.forum) ? 24.0f : 14.0f));
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(70.0f), TLObject.FLAG_30));
    }

    public void setCurrentId(int i7) {
        this.n = i7;
    }

    public void setNameTypeface(Typeface typeface) {
        this.c.setTypeface(typeface);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i7;
        int i10;
        try {
            int i11 = this.w;
            int i12 = this.x;
            org.telegram.ui.ActionBar.g6 g6Var = this.a;
            if (this.y) {
                this.w = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.y6, g6Var);
                this.x = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.n6, g6Var);
            }
            org.telegram.ui.ActionBar.l5 l5Var = this.d;
            if (l5Var != null) {
                int textColor = l5Var.getTextColor();
                if (textColor == i12 && i12 != (i10 = this.x)) {
                    l5Var.setTextColor(i10);
                } else {
                    if (textColor != i11 || i11 == (i7 = this.w)) {
                        return;
                    }
                    l5Var.setTextColor(i7);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setCheckDisabled(boolean z9) {
    }
}
