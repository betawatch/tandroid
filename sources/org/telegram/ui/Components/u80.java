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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class u80 extends LinearLayout {
    public final org.telegram.ui.Cells.m4 a;
    public final org.telegram.ui.Cells.x8 b;
    public final org.telegram.ui.Cells.x8 c;
    public final org.telegram.ui.Cells.f9 d;
    public final org.telegram.ui.Cells.f9 e;
    public boolean f;
    public boolean h;
    public TLRPC.Chat n;
    public ValueAnimator r;
    public float s;
    public final int v;

    public u80(Context context, TLRPC.Chat chat) {
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
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        addView(m4Var);
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context, 20);
        this.b = x8Var;
        String string = LocaleController.getString(R.string.ChannelSettingsJoinToSend);
        boolean z11 = this.f;
        x8Var.f(string, z11, z11);
        x8Var.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        final int i10 = 0;
        x8Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.r80
            public final /* synthetic */ u80 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        u80 u80Var = this.b;
                        boolean z12 = u80Var.f;
                        boolean z13 = !z12;
                        if (u80Var.b(z13, new t80(u80Var, u80Var.h, z12, 0))) {
                            u80Var.setJoinRequest(false);
                            u80Var.setJoinToSend(z13);
                            break;
                        }
                        break;
                    default:
                        u80 u80Var2 = this.b;
                        boolean z14 = u80Var2.h;
                        boolean z15 = !z14;
                        if (u80Var2.a(z15, new s80(u80Var2, z14, 0))) {
                            u80Var2.setJoinRequest(z15);
                            break;
                        }
                        break;
                }
            }
        });
        addView(x8Var);
        org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context, 20);
        this.c = x8Var2;
        x8Var2.f(LocaleController.getString(R.string.ChannelSettingsJoinRequest), this.h, false);
        x8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z10 = false;
        }
        x8Var2.setEnabled(z10);
        final int i11 = 1;
        x8Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.r80
            public final /* synthetic */ u80 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        u80 u80Var = this.b;
                        boolean z12 = u80Var.f;
                        boolean z13 = !z12;
                        if (u80Var.b(z13, new t80(u80Var, u80Var.h, z12, 0))) {
                            u80Var.setJoinRequest(false);
                            u80Var.setJoinToSend(z13);
                            break;
                        }
                        break;
                    default:
                        u80 u80Var2 = this.b;
                        boolean z14 = u80Var2.h;
                        boolean z15 = !z14;
                        if (u80Var2.a(z15, new s80(u80Var2, z14, 0))) {
                            u80Var2.setJoinRequest(z15);
                            break;
                        }
                        break;
                }
            }
        });
        addView(x8Var2);
        org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context, 12, null);
        this.d = f9Var;
        f9Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinToSendInfo));
        addView(f9Var);
        org.telegram.ui.Cells.f9 f9Var2 = new org.telegram.ui.Cells.f9(context, 12, null);
        this.e = f9Var2;
        f9Var2.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
        addView(f9Var2);
        boolean z12 = this.f;
        this.s = z12 ? 1.0f : 0.0f;
        x8Var2.setVisibility(z12 ? 0 : 8);
        d(this.s);
    }

    public abstract boolean a(boolean z10, s80 s80Var);

    public boolean b(boolean z10, t80 t80Var) {
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
        org.telegram.ui.Cells.x8 x8Var = this.c;
        x8Var.setAlpha(f7);
        float f10 = 1.0f - f7;
        x8Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        x8Var.setScaleY(1.0f - (0.1f * f10));
        int dp = x8Var.getMeasuredHeight() <= 0 ? AndroidUtilities.dp(50.0f) : x8Var.getMeasuredHeight();
        org.telegram.ui.Cells.f9 f9Var = this.d;
        f9Var.setAlpha(f10);
        float f11 = (-dp) * f10;
        f9Var.setTranslationY(((-AndroidUtilities.dp(4.0f)) * f7) + f11);
        org.telegram.ui.Cells.f9 f9Var2 = this.e;
        f9Var2.setAlpha(f7);
        f9Var2.setTranslationY((AndroidUtilities.dp(4.0f) * f10) + f11);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        return (this.e.getAlpha() * r0.getHeight()) + (this.d.getAlpha() * r0.getHeight());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        org.telegram.ui.Cells.x8 x8Var = this.b;
        if (x8Var.getVisibility() == 0) {
            int i15 = i12 - i10;
            org.telegram.ui.Cells.m4 m4Var = this.a;
            int measuredHeight = m4Var.getMeasuredHeight();
            m4Var.layout(0, 0, i15, measuredHeight);
            i14 = x8Var.getMeasuredHeight() + measuredHeight;
            x8Var.layout(0, measuredHeight, i15, i14);
        } else {
            i14 = 0;
        }
        int i16 = i12 - i10;
        org.telegram.ui.Cells.x8 x8Var2 = this.c;
        int measuredHeight2 = x8Var2.getMeasuredHeight() + i14;
        x8Var2.layout(0, i14, i16, measuredHeight2);
        org.telegram.ui.Cells.f9 f9Var = this.d;
        f9Var.layout(0, measuredHeight2, i16, f9Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.f9 f9Var2 = this.e;
        f9Var2.layout(0, measuredHeight2, i16, f9Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float measuredHeight;
        org.telegram.ui.Cells.m4 m4Var = this.a;
        int i12 = this.v;
        m4Var.measure(i10, i12);
        org.telegram.ui.Cells.x8 x8Var = this.b;
        x8Var.measure(i10, i12);
        org.telegram.ui.Cells.x8 x8Var2 = this.c;
        x8Var2.measure(i10, i12);
        this.d.measure(i10, i12);
        this.e.measure(i10, i12);
        if (x8Var.getVisibility() == 0) {
            measuredHeight = (x8Var2.getMeasuredHeight() * this.s) + x8Var.getMeasuredHeight() + m4Var.getMeasuredHeight();
        } else {
            measuredHeight = x8Var2.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + AndroidUtilities.lerp(r3.getMeasuredHeight(), r4.getMeasuredHeight(), this.s)), TLObject.FLAG_30));
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
        org.telegram.ui.Cells.x8 x8Var = this.b;
        x8Var.setChecked(z10);
        x8Var.setDivider(this.f);
        boolean z11 = this.h;
        org.telegram.ui.Cells.x8 x8Var2 = this.c;
        x8Var2.setChecked(z11);
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, this.f ? 1.0f : 0.0f);
        this.r = ofFloat;
        ofFloat.setDuration(200L);
        this.r.setInterpolator(wr.f);
        this.r.addUpdateListener(new q70(this, 1));
        this.r.addListener(new rm(this, 16));
        x8Var2.setVisibility(0);
        this.r.start();
    }
}
