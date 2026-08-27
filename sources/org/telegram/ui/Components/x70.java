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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class x70 extends LinearLayout {
    public final org.telegram.ui.Cells.j4 a;
    public final org.telegram.ui.Cells.p8 b;
    public final org.telegram.ui.Cells.p8 c;
    public final org.telegram.ui.Cells.x8 d;
    public final org.telegram.ui.Cells.x8 e;
    public boolean f;
    public boolean h;
    public TLRPC.Chat n;
    public ValueAnimator r;
    public float s;
    public final int v;

    public x70(Context context, TLRPC.Chat chat) {
        super(context);
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.v = View.MeasureSpec.makeMeasureSpec(999999, TLObject.FLAG_31);
        this.n = chat;
        this.f = chat.join_to_send;
        this.h = chat.join_request;
        boolean z10 = true;
        setOrientation(1);
        org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context, 20);
        this.a = j4Var;
        j4Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinTitle));
        j4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        addView(j4Var);
        org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context, 20);
        this.b = p8Var;
        String string = LocaleController.getString(R.string.ChannelSettingsJoinToSend);
        boolean z11 = this.f;
        p8Var.f(string, z11, z11);
        p8Var.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        final int i10 = 0;
        p8Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u70
            public final /* synthetic */ x70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        x70 x70Var = this.b;
                        boolean z12 = x70Var.f;
                        boolean z13 = !z12;
                        if (x70Var.b(z13, new w70(x70Var, x70Var.h, z12, 0))) {
                            x70Var.setJoinRequest(false);
                            x70Var.setJoinToSend(z13);
                            break;
                        }
                        break;
                    default:
                        x70 x70Var2 = this.b;
                        boolean z14 = x70Var2.h;
                        boolean z15 = !z14;
                        if (x70Var2.a(z15, new v70(x70Var2, z14, 0))) {
                            x70Var2.setJoinRequest(z15);
                            break;
                        }
                        break;
                }
            }
        });
        addView(p8Var);
        org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(context, 20);
        this.c = p8Var2;
        p8Var2.f(LocaleController.getString(R.string.ChannelSettingsJoinRequest), this.h, false);
        p8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z10 = false;
        }
        p8Var2.setEnabled(z10);
        final int i11 = 1;
        p8Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u70
            public final /* synthetic */ x70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        x70 x70Var = this.b;
                        boolean z12 = x70Var.f;
                        boolean z13 = !z12;
                        if (x70Var.b(z13, new w70(x70Var, x70Var.h, z12, 0))) {
                            x70Var.setJoinRequest(false);
                            x70Var.setJoinToSend(z13);
                            break;
                        }
                        break;
                    default:
                        x70 x70Var2 = this.b;
                        boolean z14 = x70Var2.h;
                        boolean z15 = !z14;
                        if (x70Var2.a(z15, new v70(x70Var2, z14, 0))) {
                            x70Var2.setJoinRequest(z15);
                            break;
                        }
                        break;
                }
            }
        });
        addView(p8Var2);
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context, 12, null);
        this.d = x8Var;
        x8Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinToSendInfo));
        addView(x8Var);
        org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context, 12, null);
        this.e = x8Var2;
        x8Var2.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
        addView(x8Var2);
        boolean z12 = this.f;
        this.s = z12 ? 1.0f : 0.0f;
        p8Var2.setVisibility(z12 ? 0 : 8);
        d(this.s);
    }

    public abstract boolean a(boolean z10, v70 v70Var);

    public boolean b(boolean z10, w70 w70Var) {
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
        org.telegram.ui.Cells.p8 p8Var = this.c;
        p8Var.setAlpha(f10);
        float f11 = 1.0f - f10;
        p8Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f11);
        p8Var.setScaleY(1.0f - (0.1f * f11));
        int dp = p8Var.getMeasuredHeight() <= 0 ? AndroidUtilities.dp(50.0f) : p8Var.getMeasuredHeight();
        org.telegram.ui.Cells.x8 x8Var = this.d;
        x8Var.setAlpha(f11);
        float f12 = (-dp) * f11;
        x8Var.setTranslationY(((-AndroidUtilities.dp(4.0f)) * f10) + f12);
        org.telegram.ui.Cells.x8 x8Var2 = this.e;
        x8Var2.setAlpha(f10);
        x8Var2.setTranslationY((AndroidUtilities.dp(4.0f) * f11) + f12);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        return (this.e.getAlpha() * r0.getHeight()) + (this.d.getAlpha() * r0.getHeight());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        org.telegram.ui.Cells.p8 p8Var = this.b;
        if (p8Var.getVisibility() == 0) {
            int i15 = i12 - i10;
            org.telegram.ui.Cells.j4 j4Var = this.a;
            int measuredHeight = j4Var.getMeasuredHeight();
            j4Var.layout(0, 0, i15, measuredHeight);
            i14 = p8Var.getMeasuredHeight() + measuredHeight;
            p8Var.layout(0, measuredHeight, i15, i14);
        } else {
            i14 = 0;
        }
        int i16 = i12 - i10;
        org.telegram.ui.Cells.p8 p8Var2 = this.c;
        int measuredHeight2 = p8Var2.getMeasuredHeight() + i14;
        p8Var2.layout(0, i14, i16, measuredHeight2);
        org.telegram.ui.Cells.x8 x8Var = this.d;
        x8Var.layout(0, measuredHeight2, i16, x8Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.x8 x8Var2 = this.e;
        x8Var2.layout(0, measuredHeight2, i16, x8Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float measuredHeight;
        org.telegram.ui.Cells.j4 j4Var = this.a;
        int i12 = this.v;
        j4Var.measure(i10, i12);
        org.telegram.ui.Cells.p8 p8Var = this.b;
        p8Var.measure(i10, i12);
        org.telegram.ui.Cells.p8 p8Var2 = this.c;
        p8Var2.measure(i10, i12);
        this.d.measure(i10, i12);
        this.e.measure(i10, i12);
        if (p8Var.getVisibility() == 0) {
            measuredHeight = (p8Var2.getMeasuredHeight() * this.s) + p8Var.getMeasuredHeight() + j4Var.getMeasuredHeight();
        } else {
            measuredHeight = p8Var2.getMeasuredHeight();
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
        org.telegram.ui.Cells.p8 p8Var = this.b;
        p8Var.setChecked(z10);
        p8Var.setDivider(this.f);
        boolean z11 = this.h;
        org.telegram.ui.Cells.p8 p8Var2 = this.c;
        p8Var2.setChecked(z11);
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, this.f ? 1.0f : 0.0f);
        this.r = ofFloat;
        ofFloat.setDuration(200L);
        this.r.setInterpolator(er.f);
        this.r.addUpdateListener(new v60(this, 1));
        this.r.addListener(new sz(this, 4));
        p8Var2.setVisibility(0);
        this.r.start();
    }
}
