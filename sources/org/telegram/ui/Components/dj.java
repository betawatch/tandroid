package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dj extends FrameLayout {
    public final k9 a;
    public final ei.e4 b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final wo d;
    public final u8 e;
    public TLRPC.User f;
    public int h;
    public CharSequence n;
    public CharSequence r;
    public TLRPC.User s;
    public String w;
    public String x;
    public boolean y;

    public dj(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = new u8(e6Var);
        k9 k9Var = new k9(context);
        this.a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        boolean z10 = org.telegram.messenger.bd.a0;
        addView(k9Var, b8.mf.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 14.0f, 9.0f, z10 ? 14.0f : 0.0f, 0.0f));
        ei.e4 e4Var = new ei.e4(context, 4);
        this.b = e4Var;
        org.telegram.messenger.hs.i(e4Var);
        org.telegram.ui.ActionBar.r6.Y(e4Var, org.telegram.ui.ActionBar.k6.j5, e6Var);
        e4Var.setTypeface(org.telegram.messenger.g0.o());
        e4Var.setTextSize(16);
        e4Var.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
        boolean z11 = org.telegram.messenger.bd.a0;
        addView(e4Var, b8.mf.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 28.0f : 72.0f, 12.0f, z11 ? 72.0f : 28.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.c = k5Var;
        k5Var.setTextSize(13);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.q5, e6Var);
        k5Var.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
        boolean z12 = org.telegram.messenger.bd.a0;
        addView(k5Var, b8.mf.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 28.0f : 72.0f, 36.0f, z12 ? 72.0f : 28.0f, 0.0f));
        wo woVar = new wo(21, context, e6Var);
        this.d = woVar;
        woVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        boolean z13 = org.telegram.messenger.bd.a0;
        addView(woVar, b8.mf.d(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 44.0f, 37.0f, z13 ? 44.0f : 0.0f, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, cj cjVar, boolean z10) {
        k9 k9Var = this.a;
        ei.e4 e4Var = this.b;
        if (user == null && charSequence == null) {
            this.r = null;
            this.n = null;
            e4Var.l("", false);
            this.c.l("", false);
            k9Var.setImageDrawable(null);
        } else {
            this.r = null;
            this.n = charSequence;
            this.f = user;
            this.y = z10;
            setWillNotDraw(!z10);
            u8 u8Var = this.e;
            TLRPC.User user2 = this.f;
            if (user2 != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
            }
            if (user2 != null) {
                u8Var.r(user2);
                TLRPC.UserStatus userStatus = this.f.status;
            } else {
                CharSequence charSequence2 = this.n;
                if (charSequence2 != null) {
                    u8Var.k(this.h, charSequence2.toString(), null, null);
                } else {
                    u8Var.k(this.h, "#", null, null);
                }
            }
            CharSequence charSequence3 = this.n;
            if (charSequence3 != null) {
                this.x = null;
                e4Var.l(charSequence3, false);
            } else {
                TLRPC.User user3 = this.f;
                if (user3 != null) {
                    this.x = org.telegram.messenger.l10.p(user3);
                } else {
                    this.x = "";
                }
                e4Var.l(this.x, false);
            }
            setStatus(this.r);
            TLRPC.User user4 = this.f;
            if (user4 != null) {
                k9Var.e(user4, u8Var);
            } else {
                k9Var.setImageDrawable(u8Var);
            }
        }
        Utilities.e.c(new org.telegram.ui.lo(22, this, cjVar));
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.y) {
            canvas.drawLine(org.telegram.messenger.bd.a0 ? 0.0f : org.telegram.messenger.g0.L(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(70.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.y ? 1 : 0), TLObject.FLAG_30));
    }

    public void setCurrentId(int i3) {
        this.h = i3;
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
                this.c.l(org.telegram.messenger.bd.M0(2131747840, null), false);
            } else if (this.s != this.f && (str = this.w) != null) {
                this.c.l(str, false);
            } else {
                this.c.l("", false);
                Utilities.e.c(new bj(this, 0));
            }
        }
    }
}
