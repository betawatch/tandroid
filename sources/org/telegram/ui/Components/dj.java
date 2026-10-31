package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dj extends FrameLayout {
    public final g9 a;
    public final og.c b;
    public final org.telegram.ui.ActionBar.u5 c;
    public final ep d;
    public final r8 e;
    public TLRPC.User f;
    public int h;
    public CharSequence n;
    public CharSequence r;
    public TLRPC.User s;
    public String w;
    public String x;
    public boolean y;

    public dj(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.e = new r8(p6Var);
        g9 g9Var = new g9(context);
        this.a = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(23.0f));
        boolean z10 = org.telegram.messenger.cd.X;
        addView(g9Var, w7.b6.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 14.0f, 9.0f, z10 ? 14.0f : 0.0f, 0.0f));
        og.c cVar = new og.c(context, 4);
        this.b = cVar;
        org.telegram.messenger.zs.i(cVar);
        org.telegram.ui.ActionBar.a7.Y(cVar, org.telegram.ui.ActionBar.t6.j5, p6Var);
        cVar.setTypeface(org.telegram.messenger.i0.o());
        cVar.setTextSize(16);
        cVar.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
        boolean z11 = org.telegram.messenger.cd.X;
        addView(cVar, w7.b6.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 28.0f : 72.0f, 12.0f, z11 ? 72.0f : 28.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.c = u5Var;
        u5Var.setTextSize(13);
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.q5, p6Var);
        u5Var.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
        boolean z12 = org.telegram.messenger.cd.X;
        addView(u5Var, w7.b6.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 28.0f : 72.0f, 36.0f, z12 ? 72.0f : 28.0f, 0.0f));
        ep epVar = new ep(21, context, p6Var);
        this.d = epVar;
        epVar.b(-1, org.telegram.ui.ActionBar.t6.d6, org.telegram.ui.ActionBar.t6.k7);
        epVar.setDrawUnchecked(false);
        epVar.setDrawBackgroundAsArc(3);
        boolean z13 = org.telegram.messenger.cd.X;
        addView(epVar, w7.b6.d(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 44.0f, 37.0f, z13 ? 44.0f : 0.0f, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, cj cjVar, boolean z10) {
        g9 g9Var = this.a;
        og.c cVar = this.b;
        if (user == null && charSequence == null) {
            this.r = null;
            this.n = null;
            cVar.l("", false);
            this.c.l("", false);
            g9Var.setImageDrawable(null);
        } else {
            this.r = null;
            this.n = charSequence;
            this.f = user;
            this.y = z10;
            setWillNotDraw(!z10);
            r8 r8Var = this.e;
            TLRPC.User user2 = this.f;
            if (user2 != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
            }
            if (user2 != null) {
                r8Var.r(user2);
                TLRPC.UserStatus userStatus = this.f.status;
            } else {
                CharSequence charSequence2 = this.n;
                if (charSequence2 != null) {
                    r8Var.k(this.h, charSequence2.toString(), null, null);
                } else {
                    r8Var.k(this.h, "#", null, null);
                }
            }
            CharSequence charSequence3 = this.n;
            if (charSequence3 != null) {
                this.x = null;
                cVar.l(charSequence3, false);
            } else {
                TLRPC.User user3 = this.f;
                if (user3 != null) {
                    this.x = org.telegram.messenger.h20.p(user3);
                } else {
                    this.x = "";
                }
                cVar.l(this.x, false);
            }
            setStatus(this.r);
            TLRPC.User user4 = this.f;
            if (user4 != null) {
                g9Var.e(user4, r8Var);
            } else {
                g9Var.setImageDrawable(r8Var);
            }
        }
        Utilities.e.c(new cd(11, this, cjVar));
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.y) {
            canvas.drawLine(org.telegram.messenger.cd.X ? 0.0f : org.telegram.messenger.i0.L(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(70.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f) + (this.y ? 1 : 0), TLObject.FLAG_30));
    }

    public void setCurrentId(int i10) {
        this.h = i10;
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
                this.c.l(org.telegram.messenger.cd.L0(2131747848, null), false);
            } else if (this.s != this.f && (str = this.w) != null) {
                this.c.l(str, false);
            } else {
                this.c.l("", false);
                Utilities.e.c(new bj(this, 0));
            }
        }
    }
}
