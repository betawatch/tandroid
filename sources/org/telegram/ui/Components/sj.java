package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class sj extends FrameLayout {
    public final q9 a;
    public final fi.u3 b;
    public final org.telegram.ui.ActionBar.n5 c;
    public final mp d;
    public final b9 e;
    public TLRPC.User f;
    public int h;
    public CharSequence n;
    public CharSequence r;
    public TLRPC.User s;
    public String w;
    public String x;
    public boolean y;

    public sj(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.e = new b9(i6Var);
        q9 q9Var = new q9(context);
        this.a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        boolean z10 = org.telegram.messenger.gd.a0;
        addView(q9Var, c8.ma.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 14.0f, 9.0f, z10 ? 14.0f : 0.0f, 0.0f));
        fi.u3 u3Var = new fi.u3(context, 4);
        this.b = u3Var;
        org.telegram.messenger.ks.i(u3Var);
        org.telegram.ui.ActionBar.u6.X(u3Var, org.telegram.ui.ActionBar.n6.j5, i6Var);
        u3Var.setTypeface(org.telegram.messenger.g0.o());
        u3Var.setTextSize(16);
        u3Var.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 48);
        boolean z11 = org.telegram.messenger.gd.a0;
        addView(u3Var, c8.ma.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 28.0f : 72.0f, 12.0f, z11 ? 72.0f : 28.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.c = n5Var;
        n5Var.setTextSize(13);
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.q5, i6Var);
        n5Var.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 48);
        boolean z12 = org.telegram.messenger.gd.a0;
        addView(n5Var, c8.ma.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 28.0f : 72.0f, 36.0f, z12 ? 72.0f : 28.0f, 0.0f));
        mp mpVar = new mp(21, context, i6Var);
        this.d = mpVar;
        mpVar.b(-1, org.telegram.ui.ActionBar.n6.d6, org.telegram.ui.ActionBar.n6.k7);
        mpVar.setDrawUnchecked(false);
        mpVar.setDrawBackgroundAsArc(3);
        boolean z13 = org.telegram.messenger.gd.a0;
        addView(mpVar, c8.ma.d(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 44.0f, 37.0f, z13 ? 44.0f : 0.0f, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, rj rjVar, boolean z10) {
        q9 q9Var = this.a;
        fi.u3 u3Var = this.b;
        if (user == null && charSequence == null) {
            this.r = null;
            this.n = null;
            u3Var.l("", false);
            this.c.l("", false);
            q9Var.setImageDrawable(null);
        } else {
            this.r = null;
            this.n = charSequence;
            this.f = user;
            this.y = z10;
            setWillNotDraw(!z10);
            b9 b9Var = this.e;
            TLRPC.User user2 = this.f;
            if (user2 != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
            }
            if (user2 != null) {
                b9Var.r(user2);
                TLRPC.UserStatus userStatus = this.f.status;
            } else {
                CharSequence charSequence2 = this.n;
                if (charSequence2 != null) {
                    b9Var.k(this.h, charSequence2.toString(), null, null);
                } else {
                    b9Var.k(this.h, "#", null, null);
                }
            }
            CharSequence charSequence3 = this.n;
            if (charSequence3 != null) {
                this.x = null;
                u3Var.l(charSequence3, false);
            } else {
                TLRPC.User user3 = this.f;
                if (user3 != null) {
                    this.x = org.telegram.messenger.o10.q(user3);
                } else {
                    this.x = "";
                }
                u3Var.l(this.x, false);
            }
            setStatus(this.r);
            TLRPC.User user4 = this.f;
            if (user4 != null) {
                q9Var.f(user4, b9Var);
            } else {
                q9Var.setImageDrawable(b9Var);
            }
        }
        Utilities.e.c(new mg(7, this, rjVar));
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.y) {
            canvas.drawLine(org.telegram.messenger.gd.a0 ? 0.0f : org.telegram.messenger.g0.L(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(70.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.y ? 1 : 0), TLObject.FLAG_30));
    }

    public void setCurrentId(int i7) {
        this.h = i7;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.r = charSequence;
        if (charSequence != null) {
            this.c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.c.l(org.telegram.messenger.gd.M0(2131747639, null), false);
            } else if (this.s != this.f && (str = this.w) != null) {
                this.c.l(str, false);
            } else {
                this.c.l("", false);
                Utilities.e.c(new qj(this, 0));
            }
        }
    }
}
