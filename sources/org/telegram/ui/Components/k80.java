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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public abstract class k80 extends LinearLayout {
    public final org.telegram.ui.Cells.l4 a;
    public final org.telegram.ui.Cells.w8 b;
    public final org.telegram.ui.Cells.w8 c;
    public final org.telegram.ui.Cells.e9 d;
    public final org.telegram.ui.Cells.e9 e;
    public boolean f;
    public boolean h;
    public TLRPC.Chat n;
    public ValueAnimator r;
    public float s;
    public final int v;

    public k80(Context context, TLRPC.Chat chat) {
        super(context);
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.v = View.MeasureSpec.makeMeasureSpec(999999, TLObject.FLAG_31);
        this.n = chat;
        this.f = chat.join_to_send;
        this.h = chat.join_request;
        boolean z10 = true;
        setOrientation(1);
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 20);
        this.a = l4Var;
        l4Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinTitle));
        l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        addView(l4Var);
        org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context, 20);
        this.b = w8Var;
        String string = LocaleController.getString(R.string.ChannelSettingsJoinToSend);
        boolean z11 = this.f;
        w8Var.f(string, z11, z11);
        w8Var.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        final int i10 = 0;
        w8Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.h80
            public final /* synthetic */ k80 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        k80 k80Var = this.b;
                        boolean z12 = k80Var.f;
                        boolean z13 = !z12;
                        if (k80Var.b(z13, new j80(k80Var, k80Var.h, z12, 0))) {
                            k80Var.setJoinRequest(false);
                            k80Var.setJoinToSend(z13);
                            break;
                        }
                        break;
                    default:
                        k80 k80Var2 = this.b;
                        boolean z14 = k80Var2.h;
                        boolean z15 = !z14;
                        if (k80Var2.a(z15, new i80(k80Var2, z14, 0))) {
                            k80Var2.setJoinRequest(z15);
                            break;
                        }
                        break;
                }
            }
        });
        addView(w8Var);
        org.telegram.ui.Cells.w8 w8Var2 = new org.telegram.ui.Cells.w8(context, 20);
        this.c = w8Var2;
        w8Var2.f(LocaleController.getString(R.string.ChannelSettingsJoinRequest), this.h, false);
        w8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z10 = false;
        }
        w8Var2.setEnabled(z10);
        final int i11 = 1;
        w8Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.h80
            public final /* synthetic */ k80 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        k80 k80Var = this.b;
                        boolean z12 = k80Var.f;
                        boolean z13 = !z12;
                        if (k80Var.b(z13, new j80(k80Var, k80Var.h, z12, 0))) {
                            k80Var.setJoinRequest(false);
                            k80Var.setJoinToSend(z13);
                            break;
                        }
                        break;
                    default:
                        k80 k80Var2 = this.b;
                        boolean z14 = k80Var2.h;
                        boolean z15 = !z14;
                        if (k80Var2.a(z15, new i80(k80Var2, z14, 0))) {
                            k80Var2.setJoinRequest(z15);
                            break;
                        }
                        break;
                }
            }
        });
        addView(w8Var2);
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 12, null);
        this.d = e9Var;
        e9Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinToSendInfo));
        addView(e9Var);
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context, 12, null);
        this.e = e9Var2;
        e9Var2.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
        addView(e9Var2);
        boolean z12 = this.f;
        this.s = z12 ? 1.0f : 0.0f;
        w8Var2.setVisibility(z12 ? 0 : 8);
        d(this.s);
    }

    public abstract boolean a(boolean z10, i80 i80Var);

    public boolean b(boolean z10, j80 j80Var) {
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
        org.telegram.ui.Cells.w8 w8Var = this.c;
        w8Var.setAlpha(f7);
        float f10 = 1.0f - f7;
        w8Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        w8Var.setScaleY(1.0f - (0.1f * f10));
        int dp = w8Var.getMeasuredHeight() <= 0 ? AndroidUtilities.dp(50.0f) : w8Var.getMeasuredHeight();
        org.telegram.ui.Cells.e9 e9Var = this.d;
        e9Var.setAlpha(f10);
        float f11 = (-dp) * f10;
        e9Var.setTranslationY(((-AndroidUtilities.dp(4.0f)) * f7) + f11);
        org.telegram.ui.Cells.e9 e9Var2 = this.e;
        e9Var2.setAlpha(f7);
        e9Var2.setTranslationY((AndroidUtilities.dp(4.0f) * f10) + f11);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        return (this.e.getAlpha() * r0.getHeight()) + (this.d.getAlpha() * r0.getHeight());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        org.telegram.ui.Cells.w8 w8Var = this.b;
        if (w8Var.getVisibility() == 0) {
            int i15 = i12 - i10;
            org.telegram.ui.Cells.l4 l4Var = this.a;
            int measuredHeight = l4Var.getMeasuredHeight();
            l4Var.layout(0, 0, i15, measuredHeight);
            i14 = w8Var.getMeasuredHeight() + measuredHeight;
            w8Var.layout(0, measuredHeight, i15, i14);
        } else {
            i14 = 0;
        }
        int i16 = i12 - i10;
        org.telegram.ui.Cells.w8 w8Var2 = this.c;
        int measuredHeight2 = w8Var2.getMeasuredHeight() + i14;
        w8Var2.layout(0, i14, i16, measuredHeight2);
        org.telegram.ui.Cells.e9 e9Var = this.d;
        e9Var.layout(0, measuredHeight2, i16, e9Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.e9 e9Var2 = this.e;
        e9Var2.layout(0, measuredHeight2, i16, e9Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float measuredHeight;
        org.telegram.ui.Cells.l4 l4Var = this.a;
        int i12 = this.v;
        l4Var.measure(i10, i12);
        org.telegram.ui.Cells.w8 w8Var = this.b;
        w8Var.measure(i10, i12);
        org.telegram.ui.Cells.w8 w8Var2 = this.c;
        w8Var2.measure(i10, i12);
        this.d.measure(i10, i12);
        this.e.measure(i10, i12);
        if (w8Var.getVisibility() == 0) {
            measuredHeight = (w8Var2.getMeasuredHeight() * this.s) + w8Var.getMeasuredHeight() + l4Var.getMeasuredHeight();
        } else {
            measuredHeight = w8Var2.getMeasuredHeight();
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
        org.telegram.ui.Cells.w8 w8Var = this.b;
        w8Var.setChecked(z10);
        w8Var.setDivider(this.f);
        boolean z11 = this.h;
        org.telegram.ui.Cells.w8 w8Var2 = this.c;
        w8Var2.setChecked(z11);
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, this.f ? 1.0f : 0.0f);
        this.r = ofFloat;
        ofFloat.setDuration(200L);
        this.r.setInterpolator(pr.f);
        this.r.addUpdateListener(new h70(this, 1));
        this.r.addListener(new j6(this, 29));
        w8Var2.setVisibility(0);
        this.r.start();
    }
}
