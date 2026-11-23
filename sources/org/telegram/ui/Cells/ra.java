package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ra extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 a;
    public final org.telegram.ui.Components.p9 b;
    public final fi.u3 c;
    public final org.telegram.ui.ActionBar.n5 d;
    public final ImageView e;
    public final org.telegram.ui.Components.a9 f;
    public CharSequence h;
    public int n;
    public String r;
    public final int s;
    public int w;
    public int x;
    public final boolean y;

    public ra(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.s = i10.t0;
        this.y = true;
        this.a = i6Var;
        this.w = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.y6, i6Var);
        this.x = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.n6, i6Var);
        this.f = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.b = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z10 = gd.a0;
        addView(p9Var, c8.na.d(48, 48.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11, 11.0f, z10 ? 11 : 0.0f, 0.0f));
        fi.u3 u3Var = new fi.u3(context, 3);
        this.c = u3Var;
        ks.i(u3Var);
        org.telegram.ui.ActionBar.u6.X(u3Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        u3Var.setTextSize(17);
        u3Var.setGravity((gd.a0 ? 5 : 3) | 48);
        boolean z11 = gd.a0;
        addView(u3Var, c8.na.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 28 : 72, 14.5f, z11 ? 72 : 28, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var;
        n5Var.setTextSize(14);
        n5Var.setGravity((gd.a0 ? 5 : 3) | 48);
        boolean z12 = gd.a0;
        addView(n5Var, c8.na.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 28.0f : 72, 37.5f, z12 ? 72 : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.m6, i6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        boolean z13 = gd.a0;
        addView(imageView, c8.na.d(-2, -2.0f, (z13 ? 5 : 3) | 16, z13 ? 0.0f : 16.0f, 0.0f, z13 ? 16.0f : 0.0f, 0.0f));
    }

    public final void a(String str, TLObject tLObject) {
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        org.telegram.ui.Components.p9 p9Var = this.b;
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        fi.u3 u3Var = this.c;
        if (tLObject == null && str == null) {
            this.h = null;
            u3Var.k("");
            n5Var.l("", false);
            p9Var.setImageDrawable(null);
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
        org.telegram.ui.Components.a9 a9Var = this.f;
        if (user != null) {
            a9Var.r(user);
        } else if (chat != null) {
            a9Var.q(chat);
        } else {
            a9Var.k(this.n, "#", null, null);
        }
        if (user != null) {
            this.r = n10.q(user);
        } else {
            this.r = chat.title;
        }
        u3Var.k(this.r);
        if (this.h != null) {
            n5Var.setTextColor(this.w);
            n5Var.l(this.h, false);
            if (p9Var != null) {
                p9Var.f(user, a9Var);
            }
        } else if (user != null) {
            if (user.bot) {
                n5Var.setTextColor(this.w);
                if (user.bot_chat_history) {
                    n5Var.l(gd.N0(2131752934, null), false);
                } else {
                    n5Var.l(gd.N0(2131752935, null), false);
                }
            } else {
                long j3 = user.id;
                int i7 = this.s;
                if (j3 == i10.i(i7).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i7).getCurrentTime()) || mp.u1(i7).a0.containsKey(Long.valueOf(user.id)))) {
                    n5Var.setTextColor(this.x);
                    n5Var.l(gd.N0(2131747632, null), false);
                } else {
                    n5Var.setTextColor(this.w);
                    n5Var.l(gd.d0(i7, user, null, null), false);
                }
            }
            p9Var.f(user, a9Var);
        } else if (chat != null) {
            n5Var.setTextColor(this.w);
            if (!org.telegram.messenger.v3.T(chat) || chat.megagroup) {
                int i10 = chat.participants_count;
                if (i10 != 0) {
                    n5Var.l(gd.G(i10, "Members", new Object[0]), false);
                } else if (chat.has_geo) {
                    n5Var.l(gd.N0(2131748449, null), false);
                } else if (org.telegram.messenger.v3.t0(chat)) {
                    n5Var.l(gd.N0(2131748445, null), false);
                } else {
                    n5Var.l(gd.N0(2131748448, null), false);
                }
            } else {
                int i11 = chat.participants_count;
                if (i11 != 0) {
                    n5Var.l(gd.G(i11, "Subscribers", new Object[0]), false);
                } else if (org.telegram.messenger.v3.t0(chat)) {
                    n5Var.l(gd.N0(2131752306, null), false);
                } else {
                    n5Var.l(gd.N0(2131752317, null), false);
                }
            }
            p9Var.f(chat, a9Var);
        } else {
            p9Var.setImageDrawable(a9Var);
        }
        p9Var.setRoundRadius(org.telegram.messenger.g0.L((chat == null || !chat.forum) ? 24.0f : 14.0f));
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int i7;
        int i10;
        try {
            int i11 = this.w;
            int i12 = this.x;
            org.telegram.ui.ActionBar.i6 i6Var = this.a;
            if (this.y) {
                this.w = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.y6, i6Var);
                this.x = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.n6, i6Var);
            }
            org.telegram.ui.ActionBar.n5 n5Var = this.d;
            if (n5Var != null) {
                int textColor = n5Var.getTextColor();
                if (textColor == i12 && i12 != (i10 = this.x)) {
                    n5Var.setTextColor(i10);
                } else {
                    if (textColor != i11 || i11 == (i7 = this.w)) {
                        return;
                    }
                    n5Var.setTextColor(i7);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setCheckDisabled(boolean z10) {
    }
}
