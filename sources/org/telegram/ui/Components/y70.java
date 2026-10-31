package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class y70 extends LinearLayout {
    public final org.telegram.ui.Cells.p4 a;
    public final org.telegram.ui.Cells.t8 b;
    public final org.telegram.ui.Cells.t8 c;
    public final org.telegram.ui.Cells.b9 d;
    public final org.telegram.ui.Cells.b9 e;
    public boolean f;
    public boolean h;
    public TLRPC.Chat n;
    public ValueAnimator r;
    public float s;
    public final int w;

    public y70(Context context, TLRPC.Chat chat) {
        super(context);
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.w = View.MeasureSpec.makeMeasureSpec(999999, TLObject.FLAG_31);
        this.n = chat;
        this.f = chat.join_to_send;
        this.h = chat.join_request;
        final int i10 = 1;
        setOrientation(1);
        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context, 20);
        this.a = p4Var;
        p4Var.setText(org.telegram.messenger.cd.L0(2131752300, null));
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p4Var, null);
        addView(p4Var);
        org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context, 20);
        this.b = t8Var;
        String L0 = org.telegram.messenger.cd.L0(2131752299, null);
        boolean z10 = this.f;
        t8Var.f(L0, z10, z10);
        t8Var.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        t8Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.v70
            public final /* synthetic */ y70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        y70 y70Var = this.b;
                        boolean z11 = y70Var.f;
                        boolean z12 = !z11;
                        if (y70Var.b(z12, new x70(y70Var, y70Var.h, z11, 0))) {
                            y70Var.setJoinRequest(false);
                            y70Var.setJoinToSend(z12);
                            break;
                        }
                        break;
                    default:
                        y70 y70Var2 = this.b;
                        boolean z13 = y70Var2.h;
                        boolean z14 = !z13;
                        if (y70Var2.a(z14, new w70(y70Var2, z13, 0))) {
                            y70Var2.setJoinRequest(z14);
                            break;
                        }
                        break;
                }
            }
        });
        addView(t8Var);
        org.telegram.ui.Cells.t8 t8Var2 = new org.telegram.ui.Cells.t8(context, 20);
        this.c = t8Var2;
        t8Var2.f(org.telegram.messenger.cd.L0(2131752304, null), this.h, false);
        t8Var2.setPivotY(0.0f);
        t8Var2.setEnabled(chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users));
        t8Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.v70
            public final /* synthetic */ y70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        y70 y70Var = this.b;
                        boolean z11 = y70Var.f;
                        boolean z12 = !z11;
                        if (y70Var.b(z12, new x70(y70Var, y70Var.h, z11, 0))) {
                            y70Var.setJoinRequest(false);
                            y70Var.setJoinToSend(z12);
                            break;
                        }
                        break;
                    default:
                        y70 y70Var2 = this.b;
                        boolean z13 = y70Var2.h;
                        boolean z14 = !z13;
                        if (y70Var2.a(z14, new w70(y70Var2, z13, 0))) {
                            y70Var2.setJoinRequest(z14);
                            break;
                        }
                        break;
                }
            }
        });
        addView(t8Var2);
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(12, context, null);
        this.d = b9Var;
        b9Var.setText(org.telegram.messenger.cd.L0(2131752298, null));
        addView(b9Var);
        org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(12, context, null);
        this.e = b9Var2;
        b9Var2.setText(org.telegram.messenger.cd.L0(2131752303, null));
        addView(b9Var2);
        boolean z11 = this.f;
        this.s = z11 ? 1.0f : 0.0f;
        t8Var2.setVisibility(z11 ? 0 : 8);
        d(this.s);
    }

    public abstract boolean a(boolean z10, w70 w70Var);

    public boolean b(boolean z10, x70 x70Var) {
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

    public final void d(float f7) {
        this.s = f7;
        org.telegram.ui.Cells.t8 t8Var = this.c;
        t8Var.setAlpha(f7);
        float f10 = 1.0f - f7;
        t8Var.setTranslationY((-org.telegram.messenger.i0.L(16.0f)) * f10);
        t8Var.setScaleY(1.0f - (0.1f * f10));
        int L = t8Var.getMeasuredHeight() <= 0 ? org.telegram.messenger.i0.L(50.0f) : t8Var.getMeasuredHeight();
        org.telegram.ui.Cells.b9 b9Var = this.d;
        b9Var.setAlpha(f10);
        float f11 = (-L) * f10;
        b9Var.setTranslationY(((-org.telegram.messenger.i0.L(4.0f)) * f7) + f11);
        org.telegram.ui.Cells.b9 b9Var2 = this.e;
        b9Var2.setAlpha(f7);
        b9Var2.setTranslationY((org.telegram.messenger.i0.L(4.0f) * f10) + f11);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        return (this.e.getAlpha() * r0.getHeight()) + (this.d.getAlpha() * r0.getHeight());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        org.telegram.ui.Cells.t8 t8Var = this.b;
        if (t8Var.getVisibility() == 0) {
            int i15 = i12 - i10;
            org.telegram.ui.Cells.p4 p4Var = this.a;
            int measuredHeight = p4Var.getMeasuredHeight();
            p4Var.layout(0, 0, i15, measuredHeight);
            i14 = t8Var.getMeasuredHeight() + measuredHeight;
            t8Var.layout(0, measuredHeight, i15, i14);
        } else {
            i14 = 0;
        }
        int i16 = i12 - i10;
        org.telegram.ui.Cells.t8 t8Var2 = this.c;
        int measuredHeight2 = t8Var2.getMeasuredHeight() + i14;
        t8Var2.layout(0, i14, i16, measuredHeight2);
        org.telegram.ui.Cells.b9 b9Var = this.d;
        b9Var.layout(0, measuredHeight2, i16, b9Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.b9 b9Var2 = this.e;
        b9Var2.layout(0, measuredHeight2, i16, b9Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float measuredHeight;
        org.telegram.ui.Cells.p4 p4Var = this.a;
        int i12 = this.w;
        p4Var.measure(i10, i12);
        org.telegram.ui.Cells.t8 t8Var = this.b;
        t8Var.measure(i10, i12);
        org.telegram.ui.Cells.t8 t8Var2 = this.c;
        t8Var2.measure(i10, i12);
        this.d.measure(i10, i12);
        this.e.measure(i10, i12);
        if (t8Var.getVisibility() == 0) {
            measuredHeight = (t8Var2.getMeasuredHeight() * this.s) + t8Var.getMeasuredHeight() + p4Var.getMeasuredHeight();
        } else {
            measuredHeight = t8Var2.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + org.telegram.messenger.i0.W1(this.s, r3.getMeasuredHeight(), r4.getMeasuredHeight())), TLObject.FLAG_30));
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
        org.telegram.ui.Cells.t8 t8Var = this.b;
        t8Var.setChecked(z10);
        t8Var.setDivider(this.f);
        boolean z11 = this.h;
        org.telegram.ui.Cells.t8 t8Var2 = this.c;
        t8Var2.setChecked(z11);
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, this.f ? 1.0f : 0.0f);
        this.r = ofFloat;
        ofFloat.setDuration(200L);
        this.r.setInterpolator(gr.f);
        this.r.addUpdateListener(new r60(this, 1));
        this.r.addListener(new t60(this, 2));
        t8Var2.setVisibility(0);
        this.r.start();
    }
}
