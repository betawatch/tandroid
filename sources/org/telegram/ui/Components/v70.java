package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class v70 extends LinearLayout {
    public final org.telegram.ui.Cells.o4 a;
    public final org.telegram.ui.Cells.s8 b;
    public final org.telegram.ui.Cells.s8 c;
    public final org.telegram.ui.Cells.a9 d;
    public final org.telegram.ui.Cells.a9 e;
    public boolean f;
    public boolean h;
    public TLRPC.Chat n;
    public ValueAnimator r;
    public float s;
    public final int w;

    public v70(Context context, TLRPC.Chat chat) {
        super(context);
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.w = View.MeasureSpec.makeMeasureSpec(999999, TLObject.FLAG_31);
        this.n = chat;
        this.f = chat.join_to_send;
        this.h = chat.join_request;
        final int i7 = 1;
        setOrientation(1);
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, 20);
        this.a = o4Var;
        o4Var.setText(org.telegram.messenger.hd.N0(2131752288, null));
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, o4Var, null);
        addView(o4Var);
        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context, 20);
        this.b = s8Var;
        String N0 = org.telegram.messenger.hd.N0(2131752287, null);
        boolean z10 = this.f;
        s8Var.f(N0, z10, z10);
        s8Var.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        s8Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.s70
            public final /* synthetic */ v70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        v70 v70Var = this.b;
                        boolean z11 = v70Var.f;
                        boolean z12 = !z11;
                        if (v70Var.b(z12, new u70(v70Var, v70Var.h, z11, 0))) {
                            v70Var.setJoinRequest(false);
                            v70Var.setJoinToSend(z12);
                            break;
                        }
                        break;
                    default:
                        v70 v70Var2 = this.b;
                        boolean z13 = v70Var2.h;
                        boolean z14 = !z13;
                        if (v70Var2.a(z14, new t70(v70Var2, z13, 0))) {
                            v70Var2.setJoinRequest(z14);
                            break;
                        }
                        break;
                }
            }
        });
        addView(s8Var);
        org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(context, 20);
        this.c = s8Var2;
        s8Var2.f(org.telegram.messenger.hd.N0(2131752292, null), this.h, false);
        s8Var2.setPivotY(0.0f);
        s8Var2.setEnabled(chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users));
        s8Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.s70
            public final /* synthetic */ v70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        v70 v70Var = this.b;
                        boolean z11 = v70Var.f;
                        boolean z12 = !z11;
                        if (v70Var.b(z12, new u70(v70Var, v70Var.h, z11, 0))) {
                            v70Var.setJoinRequest(false);
                            v70Var.setJoinToSend(z12);
                            break;
                        }
                        break;
                    default:
                        v70 v70Var2 = this.b;
                        boolean z13 = v70Var2.h;
                        boolean z14 = !z13;
                        if (v70Var2.a(z14, new t70(v70Var2, z13, 0))) {
                            v70Var2.setJoinRequest(z14);
                            break;
                        }
                        break;
                }
            }
        });
        addView(s8Var2);
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(12, context, null);
        this.d = a9Var;
        a9Var.setText(org.telegram.messenger.hd.N0(2131752286, null));
        addView(a9Var);
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(12, context, null);
        this.e = a9Var2;
        a9Var2.setText(org.telegram.messenger.hd.N0(2131752291, null));
        addView(a9Var2);
        boolean z11 = this.f;
        this.s = z11 ? 1.0f : 0.0f;
        s8Var2.setVisibility(z11 ? 0 : 8);
        d(this.s);
    }

    public abstract boolean a(boolean z10, t70 t70Var);

    public boolean b(boolean z10, u70 u70Var) {
        return true;
    }

    public final void c(boolean z10) {
        this.a.setVisibility(z10 ? 0 : 8);
        this.b.setVisibility(z10 ? 0 : 8);
        if (!z10) {
            this.f = true;
            this.c.setVisibility(0);
            d(1.0f);
        }
        requestLayout();
    }

    public final void d(float f10) {
        this.s = f10;
        org.telegram.ui.Cells.s8 s8Var = this.c;
        s8Var.setAlpha(f10);
        float f11 = 1.0f - f10;
        s8Var.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) * f11);
        s8Var.setScaleY(1.0f - (0.1f * f11));
        int L = s8Var.getMeasuredHeight() <= 0 ? org.telegram.messenger.g0.L(50.0f) : s8Var.getMeasuredHeight();
        org.telegram.ui.Cells.a9 a9Var = this.d;
        a9Var.setAlpha(f11);
        float f12 = (-L) * f11;
        a9Var.setTranslationY(((-org.telegram.messenger.g0.L(4.0f)) * f10) + f12);
        org.telegram.ui.Cells.a9 a9Var2 = this.e;
        a9Var2.setAlpha(f10);
        a9Var2.setTranslationY((org.telegram.messenger.g0.L(4.0f) * f11) + f12);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        return (this.e.getAlpha() * r0.getHeight()) + (this.d.getAlpha() * r0.getHeight());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        org.telegram.ui.Cells.s8 s8Var = this.b;
        if (s8Var.getVisibility() == 0) {
            int i14 = i11 - i7;
            org.telegram.ui.Cells.o4 o4Var = this.a;
            int measuredHeight = o4Var.getMeasuredHeight();
            o4Var.layout(0, 0, i14, measuredHeight);
            i13 = s8Var.getMeasuredHeight() + measuredHeight;
            s8Var.layout(0, measuredHeight, i14, i13);
        } else {
            i13 = 0;
        }
        int i15 = i11 - i7;
        org.telegram.ui.Cells.s8 s8Var2 = this.c;
        int measuredHeight2 = s8Var2.getMeasuredHeight() + i13;
        s8Var2.layout(0, i13, i15, measuredHeight2);
        org.telegram.ui.Cells.a9 a9Var = this.d;
        a9Var.layout(0, measuredHeight2, i15, a9Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.a9 a9Var2 = this.e;
        a9Var2.layout(0, measuredHeight2, i15, a9Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        float measuredHeight;
        org.telegram.ui.Cells.o4 o4Var = this.a;
        int i11 = this.w;
        o4Var.measure(i7, i11);
        org.telegram.ui.Cells.s8 s8Var = this.b;
        s8Var.measure(i7, i11);
        org.telegram.ui.Cells.s8 s8Var2 = this.c;
        s8Var2.measure(i7, i11);
        this.d.measure(i7, i11);
        this.e.measure(i7, i11);
        if (s8Var.getVisibility() == 0) {
            measuredHeight = (s8Var2.getMeasuredHeight() * this.s) + s8Var.getMeasuredHeight() + o4Var.getMeasuredHeight();
        } else {
            measuredHeight = s8Var2.getMeasuredHeight();
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + org.telegram.messenger.g0.W1(this.s, r3.getMeasuredHeight(), r4.getMeasuredHeight())), TLObject.FLAG_30));
    }

    public void setChat(TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.n = chat;
        boolean z10 = true;
        this.b.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        TLRPC.Chat chat2 = this.n;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z10 = false;
        }
        this.c.setEnabled(z10);
    }

    public void setJoinRequest(boolean z10) {
        this.h = z10;
        this.c.setChecked(z10);
    }

    public void setJoinToSend(boolean z10) {
        this.f = z10;
        org.telegram.ui.Cells.s8 s8Var = this.b;
        s8Var.setChecked(z10);
        s8Var.setDivider(this.f);
        boolean z11 = this.h;
        org.telegram.ui.Cells.s8 s8Var2 = this.c;
        s8Var2.setChecked(z11);
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, this.f ? 1.0f : 0.0f);
        this.r = ofFloat;
        ofFloat.setDuration(200L);
        this.r.setInterpolator(nr.f);
        this.r.addUpdateListener(new h60(this, 3));
        this.r.addListener(new s60(this, 2));
        s8Var2.setVisibility(0);
        this.r.start();
    }
}
