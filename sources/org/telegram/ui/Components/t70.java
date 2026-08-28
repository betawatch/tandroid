package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class t70 extends LinearLayout {
    public final org.telegram.ui.Cells.m4 a;
    public final org.telegram.ui.Cells.t8 b;
    public final org.telegram.ui.Cells.t8 c;
    public final org.telegram.ui.Cells.b9 d;
    public final org.telegram.ui.Cells.b9 e;
    public boolean f;
    public boolean h;
    public TLRPC.Chat n;
    public ValueAnimator r;
    public float s;
    public final int v;

    public t70(Context context, TLRPC.Chat chat) {
        super(context);
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.v = View.MeasureSpec.makeMeasureSpec(999999, TLObject.FLAG_31);
        this.n = chat;
        this.f = chat.join_to_send;
        this.h = chat.join_request;
        boolean z10 = true;
        setOrientation(1);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 20);
        this.a = m4Var;
        m4Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinTitle));
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        addView(m4Var);
        org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context, 20);
        this.b = t8Var;
        String string = LocaleController.getString(R.string.ChannelSettingsJoinToSend);
        boolean z11 = this.f;
        t8Var.f(string, z11, z11);
        t8Var.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        final int i9 = 0;
        t8Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q70
            public final /* synthetic */ t70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        t70 t70Var = this.b;
                        boolean z12 = t70Var.f;
                        boolean z13 = !z12;
                        if (t70Var.b(z13, new s70(t70Var, t70Var.h, z12, 0))) {
                            t70Var.setJoinRequest(false);
                            t70Var.setJoinToSend(z13);
                            break;
                        }
                        break;
                    default:
                        t70 t70Var2 = this.b;
                        boolean z14 = t70Var2.h;
                        boolean z15 = !z14;
                        if (t70Var2.a(z15, new r70(t70Var2, z14, 0))) {
                            t70Var2.setJoinRequest(z15);
                            break;
                        }
                        break;
                }
            }
        });
        addView(t8Var);
        org.telegram.ui.Cells.t8 t8Var2 = new org.telegram.ui.Cells.t8(context, 20);
        this.c = t8Var2;
        t8Var2.f(LocaleController.getString(R.string.ChannelSettingsJoinRequest), this.h, false);
        t8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z10 = false;
        }
        t8Var2.setEnabled(z10);
        final int i10 = 1;
        t8Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.q70
            public final /* synthetic */ t70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        t70 t70Var = this.b;
                        boolean z12 = t70Var.f;
                        boolean z13 = !z12;
                        if (t70Var.b(z13, new s70(t70Var, t70Var.h, z12, 0))) {
                            t70Var.setJoinRequest(false);
                            t70Var.setJoinToSend(z13);
                            break;
                        }
                        break;
                    default:
                        t70 t70Var2 = this.b;
                        boolean z14 = t70Var2.h;
                        boolean z15 = !z14;
                        if (t70Var2.a(z15, new r70(t70Var2, z14, 0))) {
                            t70Var2.setJoinRequest(z15);
                            break;
                        }
                        break;
                }
            }
        });
        addView(t8Var2);
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context, 12, null);
        this.d = b9Var;
        b9Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinToSendInfo));
        addView(b9Var);
        org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context, 12, null);
        this.e = b9Var2;
        b9Var2.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
        addView(b9Var2);
        boolean z12 = this.f;
        this.s = z12 ? 1.0f : 0.0f;
        t8Var2.setVisibility(z12 ? 0 : 8);
        d(this.s);
    }

    public abstract boolean a(boolean z10, r70 r70Var);

    public boolean b(boolean z10, s70 s70Var) {
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
        org.telegram.ui.Cells.t8 t8Var = this.c;
        t8Var.setAlpha(f10);
        float f11 = 1.0f - f10;
        t8Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f11);
        t8Var.setScaleY(1.0f - (0.1f * f11));
        int dp = t8Var.getMeasuredHeight() <= 0 ? AndroidUtilities.dp(50.0f) : t8Var.getMeasuredHeight();
        org.telegram.ui.Cells.b9 b9Var = this.d;
        b9Var.setAlpha(f11);
        float f12 = (-dp) * f11;
        b9Var.setTranslationY(((-AndroidUtilities.dp(4.0f)) * f10) + f12);
        org.telegram.ui.Cells.b9 b9Var2 = this.e;
        b9Var2.setAlpha(f10);
        b9Var2.setTranslationY((AndroidUtilities.dp(4.0f) * f11) + f12);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        return (this.e.getAlpha() * r0.getHeight()) + (this.d.getAlpha() * r0.getHeight());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        org.telegram.ui.Cells.t8 t8Var = this.b;
        if (t8Var.getVisibility() == 0) {
            int i14 = i11 - i9;
            org.telegram.ui.Cells.m4 m4Var = this.a;
            int measuredHeight = m4Var.getMeasuredHeight();
            m4Var.layout(0, 0, i14, measuredHeight);
            i13 = t8Var.getMeasuredHeight() + measuredHeight;
            t8Var.layout(0, measuredHeight, i14, i13);
        } else {
            i13 = 0;
        }
        int i15 = i11 - i9;
        org.telegram.ui.Cells.t8 t8Var2 = this.c;
        int measuredHeight2 = t8Var2.getMeasuredHeight() + i13;
        t8Var2.layout(0, i13, i15, measuredHeight2);
        org.telegram.ui.Cells.b9 b9Var = this.d;
        b9Var.layout(0, measuredHeight2, i15, b9Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.b9 b9Var2 = this.e;
        b9Var2.layout(0, measuredHeight2, i15, b9Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        float measuredHeight;
        org.telegram.ui.Cells.m4 m4Var = this.a;
        int i11 = this.v;
        m4Var.measure(i9, i11);
        org.telegram.ui.Cells.t8 t8Var = this.b;
        t8Var.measure(i9, i11);
        org.telegram.ui.Cells.t8 t8Var2 = this.c;
        t8Var2.measure(i9, i11);
        this.d.measure(i9, i11);
        this.e.measure(i9, i11);
        if (t8Var.getVisibility() == 0) {
            measuredHeight = (t8Var2.getMeasuredHeight() * this.s) + t8Var.getMeasuredHeight() + m4Var.getMeasuredHeight();
        } else {
            measuredHeight = t8Var2.getMeasuredHeight();
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + AndroidUtilities.lerp(r3.getMeasuredHeight(), r4.getMeasuredHeight(), this.s)), TLObject.FLAG_30));
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
        this.r.addUpdateListener(new q60(this, 1));
        this.r.addListener(new r60(this, 2));
        t8Var2.setVisibility(0);
        this.r.start();
    }
}
