package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class qa extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 a;
    public final org.telegram.ui.Components.q9 b;
    public final fi.u3 c;
    public final org.telegram.ui.ActionBar.m5 d;
    public final ImageView e;
    public final org.telegram.ui.Components.b9 f;
    public CharSequence h;
    public int n;
    public String r;
    public final int s;
    public int w;
    public int x;
    public final boolean y;

    public qa(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.s = j10.t0;
        this.y = true;
        this.a = h6Var;
        this.w = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.y6, h6Var);
        this.x = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.n6, h6Var);
        this.f = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.b = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z10 = gd.a0;
        addView(q9Var, c8.ma.d(48, 48.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11, 11.0f, z10 ? 11 : 0.0f, 0.0f));
        fi.u3 u3Var = new fi.u3(context, 3);
        this.c = u3Var;
        ks.i(u3Var);
        org.telegram.ui.ActionBar.t6.X(u3Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        u3Var.setTextSize(17);
        u3Var.setGravity((gd.a0 ? 5 : 3) | 48);
        boolean z11 = gd.a0;
        addView(u3Var, c8.ma.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 28 : 72, 14.5f, z11 ? 72 : 28, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.d = m5Var;
        m5Var.setTextSize(14);
        m5Var.setGravity((gd.a0 ? 5 : 3) | 48);
        boolean z12 = gd.a0;
        addView(m5Var, c8.ma.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 28.0f : 72, 37.5f, z12 ? 72 : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.m6, h6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        boolean z13 = gd.a0;
        addView(imageView, c8.ma.d(-2, -2.0f, (z13 ? 5 : 3) | 16, z13 ? 0.0f : 16.0f, 0.0f, z13 ? 16.0f : 0.0f, 0.0f));
    }

    public final void a(String str, TLObject tLObject) {
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        org.telegram.ui.Components.q9 q9Var = this.b;
        org.telegram.ui.ActionBar.m5 m5Var = this.d;
        fi.u3 u3Var = this.c;
        if (tLObject == null && str == null) {
            this.h = null;
            u3Var.k("");
            m5Var.l("", false);
            q9Var.setImageDrawable(null);
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
        org.telegram.ui.Components.b9 b9Var = this.f;
        if (user != null) {
            b9Var.r(user);
        } else if (chat != null) {
            b9Var.q(chat);
        } else {
            b9Var.k(this.n, "#", null, null);
        }
        if (user != null) {
            this.r = o10.q(user);
        } else {
            this.r = chat.title;
        }
        u3Var.k(this.r);
        if (this.h != null) {
            m5Var.setTextColor(this.w);
            m5Var.l(this.h, false);
            if (q9Var != null) {
                q9Var.f(user, b9Var);
            }
        } else if (user != null) {
            if (user.bot) {
                m5Var.setTextColor(this.w);
                if (user.bot_chat_history) {
                    m5Var.l(gd.N0(2131752934, null), false);
                } else {
                    m5Var.l(gd.N0(2131752935, null), false);
                }
            } else {
                long j3 = user.id;
                int i7 = this.s;
                if (j3 == j10.i(i7).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i7).getCurrentTime()) || mp.u1(i7).a0.containsKey(Long.valueOf(user.id)))) {
                    m5Var.setTextColor(this.x);
                    m5Var.l(gd.N0(2131747632, null), false);
                } else {
                    m5Var.setTextColor(this.w);
                    m5Var.l(gd.d0(i7, user, null, null), false);
                }
            }
            q9Var.f(user, b9Var);
        } else if (chat != null) {
            m5Var.setTextColor(this.w);
            if (!org.telegram.messenger.v3.T(chat) || chat.megagroup) {
                int i10 = chat.participants_count;
                if (i10 != 0) {
                    m5Var.l(gd.G(i10, "Members", new Object[0]), false);
                } else if (chat.has_geo) {
                    m5Var.l(gd.N0(2131748449, null), false);
                } else if (org.telegram.messenger.v3.t0(chat)) {
                    m5Var.l(gd.N0(2131748445, null), false);
                } else {
                    m5Var.l(gd.N0(2131748448, null), false);
                }
            } else {
                int i11 = chat.participants_count;
                if (i11 != 0) {
                    m5Var.l(gd.G(i11, "Subscribers", new Object[0]), false);
                } else if (org.telegram.messenger.v3.t0(chat)) {
                    m5Var.l(gd.N0(2131752306, null), false);
                } else {
                    m5Var.l(gd.N0(2131752317, null), false);
                }
            }
            q9Var.f(chat, b9Var);
        } else {
            q9Var.setImageDrawable(b9Var);
        }
        q9Var.setRoundRadius(org.telegram.messenger.g0.L((chat == null || !chat.forum) ? 24.0f : 14.0f));
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
            org.telegram.ui.ActionBar.h6 h6Var = this.a;
            if (this.y) {
                this.w = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.y6, h6Var);
                this.x = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.n6, h6Var);
            }
            org.telegram.ui.ActionBar.m5 m5Var = this.d;
            if (m5Var != null) {
                int textColor = m5Var.getTextColor();
                if (textColor == i12 && i12 != (i10 = this.x)) {
                    m5Var.setTextColor(i10);
                } else {
                    if (textColor != i11 || i11 == (i7 = this.w)) {
                        return;
                    }
                    m5Var.setTextColor(i7);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setCheckDisabled(boolean z10) {
    }
}
