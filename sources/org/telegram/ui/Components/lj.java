package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class lj extends FrameLayout {
    public final i9 a;
    public final fi.w3 b;
    public final org.telegram.ui.ActionBar.j5 c;
    public final fp d;
    public final t8 e;
    public TLRPC.User f;
    public int h;
    public CharSequence n;
    public CharSequence r;
    public TLRPC.User s;
    public String w;
    public String x;
    public boolean y;

    public lj(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = new t8(e6Var);
        i9 i9Var = new i9(context);
        this.a = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        boolean z10 = org.telegram.messenger.hd.a0;
        addView(i9Var, c8.ja.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 14.0f, 9.0f, z10 ? 14.0f : 0.0f, 0.0f));
        fi.w3 w3Var = new fi.w3(context, 4);
        this.b = w3Var;
        org.telegram.messenger.ns.i(w3Var);
        org.telegram.ui.ActionBar.q6.X(w3Var, org.telegram.ui.ActionBar.j6.j5, e6Var);
        w3Var.setTypeface(org.telegram.messenger.g0.o());
        w3Var.setTextSize(16);
        w3Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
        boolean z11 = org.telegram.messenger.hd.a0;
        addView(w3Var, c8.ja.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 28.0f : 72.0f, 12.0f, z11 ? 72.0f : 28.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.c = j5Var;
        j5Var.setTextSize(13);
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.q5, e6Var);
        j5Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
        boolean z12 = org.telegram.messenger.hd.a0;
        addView(j5Var, c8.ja.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 28.0f : 72.0f, 36.0f, z12 ? 72.0f : 28.0f, 0.0f));
        fp fpVar = new fp(21, context, e6Var);
        this.d = fpVar;
        fpVar.b(-1, org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.k7);
        fpVar.setDrawUnchecked(false);
        fpVar.setDrawBackgroundAsArc(3);
        boolean z13 = org.telegram.messenger.hd.a0;
        addView(fpVar, c8.ja.d(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 44.0f, 37.0f, z13 ? 44.0f : 0.0f, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, kj kjVar, boolean z10) {
        i9 i9Var = this.a;
        fi.w3 w3Var = this.b;
        if (user == null && charSequence == null) {
            this.r = null;
            this.n = null;
            w3Var.l("", false);
            this.c.l("", false);
            i9Var.setImageDrawable(null);
        } else {
            this.r = null;
            this.n = charSequence;
            this.f = user;
            this.y = z10;
            setWillNotDraw(!z10);
            t8 t8Var = this.e;
            TLRPC.User user2 = this.f;
            if (user2 != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
            }
            if (user2 != null) {
                t8Var.r(user2);
                TLRPC.UserStatus userStatus = this.f.status;
            } else {
                CharSequence charSequence2 = this.n;
                if (charSequence2 != null) {
                    t8Var.k(this.h, charSequence2.toString(), null, null);
                } else {
                    t8Var.k(this.h, "#", null, null);
                }
            }
            CharSequence charSequence3 = this.n;
            if (charSequence3 != null) {
                this.x = null;
                w3Var.l(charSequence3, false);
            } else {
                TLRPC.User user3 = this.f;
                if (user3 != null) {
                    this.x = org.telegram.messenger.q10.p(user3);
                } else {
                    this.x = "";
                }
                w3Var.l(this.x, false);
            }
            setStatus(this.r);
            TLRPC.User user4 = this.f;
            if (user4 != null) {
                i9Var.f(user4, t8Var);
            } else {
                i9Var.setImageDrawable(t8Var);
            }
        }
        Utilities.e.c(new od(11, this, kjVar));
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.y) {
            canvas.drawLine(org.telegram.messenger.hd.a0 ? 0.0f : org.telegram.messenger.g0.L(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(70.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
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
                this.c.l(org.telegram.messenger.hd.M0(2131747832, null), false);
            } else if (this.s != this.f && (str = this.w) != null) {
                this.c.l(str, false);
            } else {
                this.c.l("", false);
                Utilities.e.c(new jj(this, 0));
            }
        }
    }
}
