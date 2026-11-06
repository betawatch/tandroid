package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class f70 extends LinearLayout {
    public final org.telegram.ui.Cells.n4 a;
    public final org.telegram.ui.Cells.r8 b;
    public final org.telegram.ui.Cells.r8 c;
    public final org.telegram.ui.Cells.z8 d;
    public final org.telegram.ui.Cells.z8 e;
    public boolean f;
    public boolean h;
    public TLRPC.Chat n;
    public ValueAnimator r;
    public float s;
    public final int w;

    public f70(Context context, TLRPC.Chat chat) {
        super(context);
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.w = View.MeasureSpec.makeMeasureSpec(999999, TLObject.FLAG_31);
        this.n = chat;
        this.f = chat.join_to_send;
        this.h = chat.join_request;
        final int i7 = 1;
        setOrientation(1);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 20);
        this.a = n4Var;
        n4Var.setText(org.telegram.messenger.hd.M0(2131752300, null));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var, null);
        addView(n4Var);
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context, 20);
        this.b = r8Var;
        String M0 = org.telegram.messenger.hd.M0(2131752299, null);
        boolean z9 = this.f;
        r8Var.f(M0, z9, z9);
        r8Var.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        r8Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c70
            public final /* synthetic */ f70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f70 f70Var = this.b;
                        boolean z10 = f70Var.f;
                        boolean z11 = !z10;
                        if (f70Var.b(z11, new e70(f70Var, f70Var.h, z10, 0))) {
                            f70Var.setJoinRequest(false);
                            f70Var.setJoinToSend(z11);
                            break;
                        }
                        break;
                    default:
                        f70 f70Var2 = this.b;
                        boolean z12 = f70Var2.h;
                        boolean z13 = !z12;
                        if (f70Var2.a(z13, new d70(f70Var2, z12, 0))) {
                            f70Var2.setJoinRequest(z13);
                            break;
                        }
                        break;
                }
            }
        });
        addView(r8Var);
        org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context, 20);
        this.c = r8Var2;
        r8Var2.f(org.telegram.messenger.hd.M0(2131752304, null), this.h, false);
        r8Var2.setPivotY(0.0f);
        r8Var2.setEnabled(chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users));
        r8Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c70
            public final /* synthetic */ f70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        f70 f70Var = this.b;
                        boolean z10 = f70Var.f;
                        boolean z11 = !z10;
                        if (f70Var.b(z11, new e70(f70Var, f70Var.h, z10, 0))) {
                            f70Var.setJoinRequest(false);
                            f70Var.setJoinToSend(z11);
                            break;
                        }
                        break;
                    default:
                        f70 f70Var2 = this.b;
                        boolean z12 = f70Var2.h;
                        boolean z13 = !z12;
                        if (f70Var2.a(z13, new d70(f70Var2, z12, 0))) {
                            f70Var2.setJoinRequest(z13);
                            break;
                        }
                        break;
                }
            }
        });
        addView(r8Var2);
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(12, context, null);
        this.d = z8Var;
        z8Var.setText(org.telegram.messenger.hd.M0(2131752298, null));
        addView(z8Var);
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(12, context, null);
        this.e = z8Var2;
        z8Var2.setText(org.telegram.messenger.hd.M0(2131752303, null));
        addView(z8Var2);
        boolean z10 = this.f;
        this.s = z10 ? 1.0f : 0.0f;
        r8Var2.setVisibility(z10 ? 0 : 8);
        d(this.s);
    }

    public abstract boolean a(boolean z9, d70 d70Var);

    public boolean b(boolean z9, e70 e70Var) {
        return true;
    }

    public final void c(boolean z9) {
        this.a.setVisibility(z9 ? 0 : 8);
        this.b.setVisibility(z9 ? 0 : 8);
        if (!z9) {
            this.f = true;
            this.c.setVisibility(0);
            d(1.0f);
        }
        requestLayout();
    }

    public final void d(float f10) {
        this.s = f10;
        org.telegram.ui.Cells.r8 r8Var = this.c;
        r8Var.setAlpha(f10);
        float f11 = 1.0f - f10;
        r8Var.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) * f11);
        r8Var.setScaleY(1.0f - (0.1f * f11));
        int L = r8Var.getMeasuredHeight() <= 0 ? org.telegram.messenger.g0.L(50.0f) : r8Var.getMeasuredHeight();
        org.telegram.ui.Cells.z8 z8Var = this.d;
        z8Var.setAlpha(f11);
        float f12 = (-L) * f11;
        z8Var.setTranslationY(((-org.telegram.messenger.g0.L(4.0f)) * f10) + f12);
        org.telegram.ui.Cells.z8 z8Var2 = this.e;
        z8Var2.setAlpha(f10);
        z8Var2.setTranslationY((org.telegram.messenger.g0.L(4.0f) * f11) + f12);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        return (this.e.getAlpha() * r0.getHeight()) + (this.d.getAlpha() * r0.getHeight());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        org.telegram.ui.Cells.r8 r8Var = this.b;
        if (r8Var.getVisibility() == 0) {
            int i14 = i11 - i7;
            org.telegram.ui.Cells.n4 n4Var = this.a;
            int measuredHeight = n4Var.getMeasuredHeight();
            n4Var.layout(0, 0, i14, measuredHeight);
            i13 = r8Var.getMeasuredHeight() + measuredHeight;
            r8Var.layout(0, measuredHeight, i14, i13);
        } else {
            i13 = 0;
        }
        int i15 = i11 - i7;
        org.telegram.ui.Cells.r8 r8Var2 = this.c;
        int measuredHeight2 = r8Var2.getMeasuredHeight() + i13;
        r8Var2.layout(0, i13, i15, measuredHeight2);
        org.telegram.ui.Cells.z8 z8Var = this.d;
        z8Var.layout(0, measuredHeight2, i15, z8Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.z8 z8Var2 = this.e;
        z8Var2.layout(0, measuredHeight2, i15, z8Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        float measuredHeight;
        org.telegram.ui.Cells.n4 n4Var = this.a;
        int i11 = this.w;
        n4Var.measure(i7, i11);
        org.telegram.ui.Cells.r8 r8Var = this.b;
        r8Var.measure(i7, i11);
        org.telegram.ui.Cells.r8 r8Var2 = this.c;
        r8Var2.measure(i7, i11);
        this.d.measure(i7, i11);
        this.e.measure(i7, i11);
        if (r8Var.getVisibility() == 0) {
            measuredHeight = (r8Var2.getMeasuredHeight() * this.s) + r8Var.getMeasuredHeight() + n4Var.getMeasuredHeight();
        } else {
            measuredHeight = r8Var2.getMeasuredHeight();
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + org.telegram.messenger.g0.W1(this.s, r3.getMeasuredHeight(), r4.getMeasuredHeight())), TLObject.FLAG_30));
    }

    public void setChat(TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.n = chat;
        boolean z9 = true;
        this.b.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        TLRPC.Chat chat2 = this.n;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z9 = false;
        }
        this.c.setEnabled(z9);
    }

    public void setJoinRequest(boolean z9) {
        this.h = z9;
        this.c.setChecked(z9);
    }

    public void setJoinToSend(boolean z9) {
        this.f = z9;
        org.telegram.ui.Cells.r8 r8Var = this.b;
        r8Var.setChecked(z9);
        r8Var.setDivider(this.f);
        boolean z10 = this.h;
        org.telegram.ui.Cells.r8 r8Var2 = this.c;
        r8Var2.setChecked(z10);
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, this.f ? 1.0f : 0.0f);
        this.r = ofFloat;
        ofFloat.setDuration(200L);
        this.r.setInterpolator(xq.f);
        this.r.addUpdateListener(new c60(this, 1));
        this.r.addListener(new e60(this, 2));
        r8Var2.setVisibility(0);
        this.r.start();
    }
}
