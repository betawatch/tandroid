package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class b70 extends LinearLayout {
    public final org.telegram.ui.Cells.n4 a;
    public final org.telegram.ui.Cells.q8 b;
    public final org.telegram.ui.Cells.q8 c;
    public final org.telegram.ui.Cells.y8 d;
    public final org.telegram.ui.Cells.y8 e;
    public boolean f;
    public boolean h;
    public TLRPC.Chat n;
    public ValueAnimator r;
    public float s;
    public final int w;

    public b70(Context context, TLRPC.Chat chat) {
        super(context);
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.w = View.MeasureSpec.makeMeasureSpec(999999, TLObject.FLAG_31);
        this.n = chat;
        this.f = chat.join_to_send;
        this.h = chat.join_request;
        final int i3 = 1;
        setOrientation(1);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 20);
        this.a = n4Var;
        n4Var.setText(org.telegram.messenger.bd.M0(2131752300, null));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var, null);
        addView(n4Var);
        org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context, 20);
        this.b = q8Var;
        String M0 = org.telegram.messenger.bd.M0(2131752299, null);
        boolean z10 = this.f;
        q8Var.f(M0, z10, z10);
        q8Var.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        q8Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.y60
            public final /* synthetic */ b70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b70 b70Var = this.b;
                        boolean z11 = b70Var.f;
                        boolean z12 = !z11;
                        if (b70Var.b(z12, new a70(b70Var, b70Var.h, z11, 0))) {
                            b70Var.setJoinRequest(false);
                            b70Var.setJoinToSend(z12);
                            break;
                        }
                        break;
                    default:
                        b70 b70Var2 = this.b;
                        boolean z13 = b70Var2.h;
                        boolean z14 = !z13;
                        if (b70Var2.a(z14, new z60(b70Var2, z13, 0))) {
                            b70Var2.setJoinRequest(z14);
                            break;
                        }
                        break;
                }
            }
        });
        addView(q8Var);
        org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(context, 20);
        this.c = q8Var2;
        q8Var2.f(org.telegram.messenger.bd.M0(2131752304, null), this.h, false);
        q8Var2.setPivotY(0.0f);
        q8Var2.setEnabled(chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users));
        q8Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.y60
            public final /* synthetic */ b70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        b70 b70Var = this.b;
                        boolean z11 = b70Var.f;
                        boolean z12 = !z11;
                        if (b70Var.b(z12, new a70(b70Var, b70Var.h, z11, 0))) {
                            b70Var.setJoinRequest(false);
                            b70Var.setJoinToSend(z12);
                            break;
                        }
                        break;
                    default:
                        b70 b70Var2 = this.b;
                        boolean z13 = b70Var2.h;
                        boolean z14 = !z13;
                        if (b70Var2.a(z14, new z60(b70Var2, z13, 0))) {
                            b70Var2.setJoinRequest(z14);
                            break;
                        }
                        break;
                }
            }
        });
        addView(q8Var2);
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(12, context, null);
        this.d = y8Var;
        y8Var.setText(org.telegram.messenger.bd.M0(2131752298, null));
        addView(y8Var);
        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(12, context, null);
        this.e = y8Var2;
        y8Var2.setText(org.telegram.messenger.bd.M0(2131752303, null));
        addView(y8Var2);
        boolean z11 = this.f;
        this.s = z11 ? 1.0f : 0.0f;
        q8Var2.setVisibility(z11 ? 0 : 8);
        d(this.s);
    }

    public abstract boolean a(boolean z10, z60 z60Var);

    public boolean b(boolean z10, a70 a70Var) {
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
        org.telegram.ui.Cells.q8 q8Var = this.c;
        q8Var.setAlpha(f10);
        float f11 = 1.0f - f10;
        q8Var.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) * f11);
        q8Var.setScaleY(1.0f - (0.1f * f11));
        int L = q8Var.getMeasuredHeight() <= 0 ? org.telegram.messenger.g0.L(50.0f) : q8Var.getMeasuredHeight();
        org.telegram.ui.Cells.y8 y8Var = this.d;
        y8Var.setAlpha(f11);
        float f12 = (-L) * f11;
        y8Var.setTranslationY(((-org.telegram.messenger.g0.L(4.0f)) * f10) + f12);
        org.telegram.ui.Cells.y8 y8Var2 = this.e;
        y8Var2.setAlpha(f10);
        y8Var2.setTranslationY((org.telegram.messenger.g0.L(4.0f) * f11) + f12);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        return (this.e.getAlpha() * r0.getHeight()) + (this.d.getAlpha() * r0.getHeight());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        org.telegram.ui.Cells.q8 q8Var = this.b;
        if (q8Var.getVisibility() == 0) {
            int i14 = i11 - i3;
            org.telegram.ui.Cells.n4 n4Var = this.a;
            int measuredHeight = n4Var.getMeasuredHeight();
            n4Var.layout(0, 0, i14, measuredHeight);
            i13 = q8Var.getMeasuredHeight() + measuredHeight;
            q8Var.layout(0, measuredHeight, i14, i13);
        } else {
            i13 = 0;
        }
        int i15 = i11 - i3;
        org.telegram.ui.Cells.q8 q8Var2 = this.c;
        int measuredHeight2 = q8Var2.getMeasuredHeight() + i13;
        q8Var2.layout(0, i13, i15, measuredHeight2);
        org.telegram.ui.Cells.y8 y8Var = this.d;
        y8Var.layout(0, measuredHeight2, i15, y8Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.y8 y8Var2 = this.e;
        y8Var2.layout(0, measuredHeight2, i15, y8Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        float measuredHeight;
        org.telegram.ui.Cells.n4 n4Var = this.a;
        int i11 = this.w;
        n4Var.measure(i3, i11);
        org.telegram.ui.Cells.q8 q8Var = this.b;
        q8Var.measure(i3, i11);
        org.telegram.ui.Cells.q8 q8Var2 = this.c;
        q8Var2.measure(i3, i11);
        this.d.measure(i3, i11);
        this.e.measure(i3, i11);
        if (q8Var.getVisibility() == 0) {
            measuredHeight = (q8Var2.getMeasuredHeight() * this.s) + q8Var.getMeasuredHeight() + n4Var.getMeasuredHeight();
        } else {
            measuredHeight = q8Var2.getMeasuredHeight();
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + org.telegram.messenger.g0.W1(this.s, r3.getMeasuredHeight(), r4.getMeasuredHeight())), TLObject.FLAG_30));
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
        org.telegram.ui.Cells.q8 q8Var = this.b;
        q8Var.setChecked(z10);
        q8Var.setDivider(this.f);
        boolean z11 = this.h;
        org.telegram.ui.Cells.q8 q8Var2 = this.c;
        q8Var2.setChecked(z11);
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, this.f ? 1.0f : 0.0f);
        this.r = ofFloat;
        ofFloat.setDuration(200L);
        this.r.setInterpolator(xq.f);
        this.r.addUpdateListener(new y50(this, 1));
        this.r.addListener(new a60(this, 2));
        q8Var2.setVisibility(0);
        this.r.start();
    }
}
