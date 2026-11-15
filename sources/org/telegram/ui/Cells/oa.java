package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class oa extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final org.telegram.ui.Components.i9 b;
    public final fi.w3 c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final ImageView e;
    public final org.telegram.ui.Components.t8 f;
    public CharSequence h;
    public int n;
    public String r;
    public final int s;
    public int w;
    public int x;
    public final boolean y;

    public oa(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.s = m10.t0;
        this.y = true;
        this.a = e6Var;
        this.w = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.y6, e6Var);
        this.x = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.n6, e6Var);
        this.f = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.b = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z10 = hd.a0;
        addView(i9Var, c8.ja.d(48, 48.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11, 11.0f, z10 ? 11 : 0.0f, 0.0f));
        fi.w3 w3Var = new fi.w3(context, 3);
        this.c = w3Var;
        ns.i(w3Var);
        org.telegram.ui.ActionBar.q6.X(w3Var, org.telegram.ui.ActionBar.j6.G6, e6Var);
        w3Var.setTextSize(17);
        w3Var.setGravity((hd.a0 ? 5 : 3) | 48);
        boolean z11 = hd.a0;
        addView(w3Var, c8.ja.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 28 : 72, 14.5f, z11 ? 72 : 28, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var;
        j5Var.setTextSize(14);
        j5Var.setGravity((hd.a0 ? 5 : 3) | 48);
        boolean z12 = hd.a0;
        addView(j5Var, c8.ja.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 28.0f : 72, 37.5f, z12 ? 72 : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.m6, e6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        boolean z13 = hd.a0;
        addView(imageView, c8.ja.d(-2, -2.0f, (z13 ? 5 : 3) | 16, z13 ? 0.0f : 16.0f, 0.0f, z13 ? 16.0f : 0.0f, 0.0f));
    }

    public final void a(String str, TLObject tLObject) {
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        org.telegram.ui.Components.i9 i9Var = this.b;
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        fi.w3 w3Var = this.c;
        if (tLObject == null && str == null) {
            this.h = null;
            w3Var.k("");
            j5Var.l("", false);
            i9Var.setImageDrawable(null);
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
        org.telegram.ui.Components.t8 t8Var = this.f;
        if (user != null) {
            t8Var.r(user);
        } else if (chat != null) {
            t8Var.q(chat);
        } else {
            t8Var.k(this.n, "#", null, null);
        }
        if (user != null) {
            this.r = q10.p(user);
        } else {
            this.r = chat.title;
        }
        w3Var.k(this.r);
        if (this.h != null) {
            j5Var.setTextColor(this.w);
            j5Var.l(this.h, false);
            if (i9Var != null) {
                i9Var.f(user, t8Var);
            }
        } else if (user != null) {
            if (user.bot) {
                j5Var.setTextColor(this.w);
                if (user.bot_chat_history) {
                    j5Var.l(hd.M0(2131752946, null), false);
                } else {
                    j5Var.l(hd.M0(2131752947, null), false);
                }
            } else {
                long j3 = user.id;
                int i7 = this.s;
                if (j3 == m10.i(i7).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i7).getCurrentTime()) || np.s1(i7).a0.containsKey(Long.valueOf(user.id)))) {
                    j5Var.setTextColor(this.x);
                    j5Var.l(hd.M0(2131747826, null), false);
                } else {
                    j5Var.setTextColor(this.w);
                    j5Var.l(hd.d0(i7, user, null, null), false);
                }
            }
            i9Var.f(user, t8Var);
        } else if (chat != null) {
            j5Var.setTextColor(this.w);
            if (!org.telegram.messenger.t3.T(chat) || chat.megagroup) {
                int i10 = chat.participants_count;
                if (i10 != 0) {
                    j5Var.l(hd.G(i10, "Members", new Object[0]), false);
                } else if (chat.has_geo) {
                    j5Var.l(hd.M0(2131748642, null), false);
                } else if (org.telegram.messenger.t3.t0(chat)) {
                    j5Var.l(hd.M0(2131748638, null), false);
                } else {
                    j5Var.l(hd.M0(2131748641, null), false);
                }
            } else {
                int i11 = chat.participants_count;
                if (i11 != 0) {
                    j5Var.l(hd.G(i11, "Subscribers", new Object[0]), false);
                } else if (org.telegram.messenger.t3.t0(chat)) {
                    j5Var.l(hd.M0(2131752318, null), false);
                } else {
                    j5Var.l(hd.M0(2131752329, null), false);
                }
            }
            i9Var.f(chat, t8Var);
        } else {
            i9Var.setImageDrawable(t8Var);
        }
        i9Var.setRoundRadius(org.telegram.messenger.g0.L((chat == null || !chat.forum) ? 24.0f : 14.0f));
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i7;
        int i10;
        try {
            int i11 = this.w;
            int i12 = this.x;
            org.telegram.ui.ActionBar.e6 e6Var = this.a;
            if (this.y) {
                this.w = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.y6, e6Var);
                this.x = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.n6, e6Var);
            }
            org.telegram.ui.ActionBar.j5 j5Var = this.d;
            if (j5Var != null) {
                int textColor = j5Var.getTextColor();
                if (textColor == i12 && i12 != (i10 = this.x)) {
                    j5Var.setTextColor(i10);
                } else {
                    if (textColor != i11 || i11 == (i7 = this.w)) {
                        return;
                    }
                    j5Var.setTextColor(i7);
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
