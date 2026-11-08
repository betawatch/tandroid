package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ej extends FrameLayout {
    public final l9 a;
    public final di.d4 b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final wo d;
    public final w8 e;
    public TLRPC.User f;
    public int h;
    public CharSequence n;
    public CharSequence r;
    public TLRPC.User s;
    public String w;
    public String x;
    public boolean y;

    public ej(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = new w8(f6Var);
        l9 l9Var = new l9(context);
        this.a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        boolean z9 = org.telegram.messenger.id.a0;
        addView(l9Var, c8.ha.d(46, 46.0f, (z9 ? 5 : 3) | 48, z9 ? 0.0f : 14.0f, 9.0f, z9 ? 14.0f : 0.0f, 0.0f));
        di.d4 d4Var = new di.d4(context, 4);
        this.b = d4Var;
        org.telegram.messenger.qs.i(d4Var);
        org.telegram.ui.ActionBar.r6.Y(d4Var, org.telegram.ui.ActionBar.k6.j5, f6Var);
        d4Var.setTypeface(org.telegram.messenger.g0.o());
        d4Var.setTextSize(16);
        d4Var.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 48);
        boolean z10 = org.telegram.messenger.id.a0;
        addView(d4Var, c8.ha.d(-1, 20.0f, (z10 ? 5 : 3) | 48, z10 ? 28.0f : 72.0f, 12.0f, z10 ? 72.0f : 28.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.c = k5Var;
        k5Var.setTextSize(13);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.q5, f6Var);
        k5Var.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 48);
        boolean z11 = org.telegram.messenger.id.a0;
        addView(k5Var, c8.ha.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 28.0f : 72.0f, 36.0f, z11 ? 72.0f : 28.0f, 0.0f));
        wo woVar = new wo(21, context, f6Var);
        this.d = woVar;
        woVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        boolean z12 = org.telegram.messenger.id.a0;
        addView(woVar, c8.ha.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 44.0f, 37.0f, z12 ? 44.0f : 0.0f, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, dj djVar, boolean z9) {
        l9 l9Var = this.a;
        di.d4 d4Var = this.b;
        if (user == null && charSequence == null) {
            this.r = null;
            this.n = null;
            d4Var.l("", false);
            this.c.l("", false);
            l9Var.setImageDrawable(null);
        } else {
            this.r = null;
            this.n = charSequence;
            this.f = user;
            this.y = z9;
            setWillNotDraw(!z9);
            w8 w8Var = this.e;
            TLRPC.User user2 = this.f;
            if (user2 != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
            }
            if (user2 != null) {
                w8Var.r(user2);
                TLRPC.UserStatus userStatus = this.f.status;
            } else {
                CharSequence charSequence2 = this.n;
                if (charSequence2 != null) {
                    w8Var.k(this.h, charSequence2.toString(), null, null);
                } else {
                    w8Var.k(this.h, "#", null, null);
                }
            }
            CharSequence charSequence3 = this.n;
            if (charSequence3 != null) {
                this.x = null;
                d4Var.l(charSequence3, false);
            } else {
                TLRPC.User user3 = this.f;
                if (user3 != null) {
                    this.x = org.telegram.messenger.t10.p(user3);
                } else {
                    this.x = "";
                }
                d4Var.l(this.x, false);
            }
            setStatus(this.r);
            TLRPC.User user4 = this.f;
            if (user4 != null) {
                l9Var.e(user4, w8Var);
            } else {
                l9Var.setImageDrawable(w8Var);
            }
        }
        Utilities.e.c(new f(17, this, djVar));
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.y) {
            canvas.drawLine(org.telegram.messenger.id.a0 ? 0.0f : org.telegram.messenger.g0.L(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(70.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
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
                this.c.l(org.telegram.messenger.id.M0(2131747833, null), false);
            } else if (this.s != this.f && (str = this.w) != null) {
                this.c.l(str, false);
            } else {
                this.c.l("", false);
                Utilities.e.c(new cj(this, 0));
            }
        }
    }
}
