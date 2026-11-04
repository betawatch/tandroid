package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class oa extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final org.telegram.ui.Components.k9 b;
    public final ei.e4 c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final ImageView e;
    public final org.telegram.ui.Components.u8 f;
    public CharSequence h;
    public int n;
    public String r;
    public final int s;
    public int w;
    public int x;
    public final boolean y;

    public oa(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.s = h10.t0;
        this.y = true;
        this.a = e6Var;
        this.w = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, e6Var);
        this.x = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.n6, e6Var);
        this.f = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.b = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z10 = bd.a0;
        addView(k9Var, mf.d(48, 48.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11, 11.0f, z10 ? 11 : 0.0f, 0.0f));
        ei.e4 e4Var = new ei.e4(context, 3);
        this.c = e4Var;
        hs.i(e4Var);
        org.telegram.ui.ActionBar.r6.Y(e4Var, org.telegram.ui.ActionBar.k6.G6, e6Var);
        e4Var.setTextSize(17);
        e4Var.setGravity((bd.a0 ? 5 : 3) | 48);
        boolean z11 = bd.a0;
        addView(e4Var, mf.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 28 : 72, 14.5f, z11 ? 72 : 28, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        k5Var.setTextSize(14);
        k5Var.setGravity((bd.a0 ? 5 : 3) | 48);
        boolean z12 = bd.a0;
        addView(k5Var, mf.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 28.0f : 72, 37.5f, z12 ? 72 : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.m6, e6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        boolean z13 = bd.a0;
        addView(imageView, mf.d(-2, -2.0f, (z13 ? 5 : 3) | 16, z13 ? 0.0f : 16.0f, 0.0f, z13 ? 16.0f : 0.0f, 0.0f));
    }

    public final void a(String str, TLObject tLObject) {
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        org.telegram.ui.Components.k9 k9Var = this.b;
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        ei.e4 e4Var = this.c;
        if (tLObject == null && str == null) {
            this.h = null;
            e4Var.k("");
            k5Var.l("", false);
            k9Var.setImageDrawable(null);
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
        org.telegram.ui.Components.u8 u8Var = this.f;
        if (user != null) {
            u8Var.r(user);
        } else if (chat != null) {
            u8Var.q(chat);
        } else {
            u8Var.k(this.n, "#", null, null);
        }
        if (user != null) {
            this.r = l10.p(user);
        } else {
            this.r = chat.title;
        }
        e4Var.k(this.r);
        if (this.h != null) {
            k5Var.setTextColor(this.w);
            k5Var.l(this.h, false);
            if (k9Var != null) {
                k9Var.e(user, u8Var);
            }
        } else if (user != null) {
            if (user.bot) {
                k5Var.setTextColor(this.w);
                if (user.bot_chat_history) {
                    k5Var.l(bd.M0(2131752946, null), false);
                } else {
                    k5Var.l(bd.M0(2131752947, null), false);
                }
            } else {
                long j10 = user.id;
                int i3 = this.s;
                if (j10 == h10.i(i3).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i3).getCurrentTime()) || hp.s1(i3).a0.containsKey(Long.valueOf(user.id)))) {
                    k5Var.setTextColor(this.x);
                    k5Var.l(bd.M0(2131747834, null), false);
                } else {
                    k5Var.setTextColor(this.w);
                    k5Var.l(bd.d0(i3, user, null, null), false);
                }
            }
            k9Var.e(user, u8Var);
        } else if (chat != null) {
            k5Var.setTextColor(this.w);
            if (!org.telegram.messenger.t3.T(chat) || chat.megagroup) {
                int i10 = chat.participants_count;
                if (i10 != 0) {
                    k5Var.l(bd.G(i10, "Members", new Object[0]), false);
                } else if (chat.has_geo) {
                    k5Var.l(bd.M0(2131748650, null), false);
                } else if (org.telegram.messenger.t3.t0(chat)) {
                    k5Var.l(bd.M0(2131748646, null), false);
                } else {
                    k5Var.l(bd.M0(2131748649, null), false);
                }
            } else {
                int i11 = chat.participants_count;
                if (i11 != 0) {
                    k5Var.l(bd.G(i11, "Subscribers", new Object[0]), false);
                } else if (org.telegram.messenger.t3.t0(chat)) {
                    k5Var.l(bd.M0(2131752318, null), false);
                } else {
                    k5Var.l(bd.M0(2131752329, null), false);
                }
            }
            k9Var.e(chat, u8Var);
        } else {
            k9Var.setImageDrawable(u8Var);
        }
        k9Var.setRoundRadius(org.telegram.messenger.g0.L((chat == null || !chat.forum) ? 24.0f : 14.0f));
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
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(70.0f), TLObject.FLAG_30));
    }

    public void setCurrentId(int i3) {
        this.n = i3;
    }

    public void setNameTypeface(Typeface typeface) {
        this.c.setTypeface(typeface);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i3;
        int i10;
        try {
            int i11 = this.w;
            int i12 = this.x;
            org.telegram.ui.ActionBar.e6 e6Var = this.a;
            if (this.y) {
                this.w = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, e6Var);
                this.x = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.n6, e6Var);
            }
            org.telegram.ui.ActionBar.k5 k5Var = this.d;
            if (k5Var != null) {
                int textColor = k5Var.getTextColor();
                if (textColor == i12 && i12 != (i10 = this.x)) {
                    k5Var.setTextColor(i10);
                } else {
                    if (textColor != i11 || i11 == (i3 = this.w)) {
                        return;
                    }
                    k5Var.setTextColor(i3);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setCheckDisabled(boolean z10) {
    }
}
