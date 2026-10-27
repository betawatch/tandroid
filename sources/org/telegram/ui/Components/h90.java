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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class h90 extends LinearLayout {
    public final org.telegram.ui.Cells.q4 a;
    public final org.telegram.ui.Cells.a9 b;
    public final org.telegram.ui.Cells.a9 c;
    public final org.telegram.ui.Cells.i9 d;
    public final org.telegram.ui.Cells.i9 e;
    public boolean f;
    public boolean h;
    public TLRPC.Chat n;
    public ValueAnimator r;
    public float s;
    public final int v;

    public h90(Context context, TLRPC.Chat chat) {
        super(context);
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.v = View.MeasureSpec.makeMeasureSpec(999999, TLObject.FLAG_31);
        this.n = chat;
        this.f = chat.join_to_send;
        this.h = chat.join_request;
        boolean z10 = true;
        setOrientation(1);
        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context, 20);
        this.a = q4Var;
        q4Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinTitle));
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, q4Var, null);
        addView(q4Var);
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context, 20);
        this.b = a9Var;
        String string = LocaleController.getString(R.string.ChannelSettingsJoinToSend);
        boolean z11 = this.f;
        a9Var.f(string, z11, z11);
        a9Var.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        final int i10 = 0;
        a9Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.e90
            public final /* synthetic */ h90 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        h90 h90Var = this.b;
                        boolean z12 = h90Var.f;
                        boolean z13 = !z12;
                        if (h90Var.b(z13, new g90(h90Var, h90Var.h, z12, 0))) {
                            h90Var.setJoinRequest(false);
                            h90Var.setJoinToSend(z13);
                            break;
                        }
                        break;
                    default:
                        h90 h90Var2 = this.b;
                        boolean z14 = h90Var2.h;
                        boolean z15 = !z14;
                        if (h90Var2.a(z15, new f90(h90Var2, z14, 0))) {
                            h90Var2.setJoinRequest(z15);
                            break;
                        }
                        break;
                }
            }
        });
        addView(a9Var);
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context, 20);
        this.c = a9Var2;
        a9Var2.f(LocaleController.getString(R.string.ChannelSettingsJoinRequest), this.h, false);
        a9Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z10 = false;
        }
        a9Var2.setEnabled(z10);
        final int i11 = 1;
        a9Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.e90
            public final /* synthetic */ h90 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        h90 h90Var = this.b;
                        boolean z12 = h90Var.f;
                        boolean z13 = !z12;
                        if (h90Var.b(z13, new g90(h90Var, h90Var.h, z12, 0))) {
                            h90Var.setJoinRequest(false);
                            h90Var.setJoinToSend(z13);
                            break;
                        }
                        break;
                    default:
                        h90 h90Var2 = this.b;
                        boolean z14 = h90Var2.h;
                        boolean z15 = !z14;
                        if (h90Var2.a(z15, new f90(h90Var2, z14, 0))) {
                            h90Var2.setJoinRequest(z15);
                            break;
                        }
                        break;
                }
            }
        });
        addView(a9Var2);
        org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context, 12, null);
        this.d = i9Var;
        i9Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinToSendInfo));
        addView(i9Var);
        org.telegram.ui.Cells.i9 i9Var2 = new org.telegram.ui.Cells.i9(context, 12, null);
        this.e = i9Var2;
        i9Var2.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
        addView(i9Var2);
        boolean z12 = this.f;
        this.s = z12 ? 1.0f : 0.0f;
        a9Var2.setVisibility(z12 ? 0 : 8);
        d(this.s);
    }

    public abstract boolean a(boolean z10, f90 f90Var);

    public boolean b(boolean z10, g90 g90Var) {
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
        org.telegram.ui.Cells.a9 a9Var = this.c;
        a9Var.setAlpha(f7);
        float f10 = 1.0f - f7;
        a9Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        a9Var.setScaleY(1.0f - (0.1f * f10));
        int dp = a9Var.getMeasuredHeight() <= 0 ? AndroidUtilities.dp(50.0f) : a9Var.getMeasuredHeight();
        org.telegram.ui.Cells.i9 i9Var = this.d;
        i9Var.setAlpha(f10);
        float f11 = (-dp) * f10;
        i9Var.setTranslationY(((-AndroidUtilities.dp(4.0f)) * f7) + f11);
        org.telegram.ui.Cells.i9 i9Var2 = this.e;
        i9Var2.setAlpha(f7);
        i9Var2.setTranslationY((AndroidUtilities.dp(4.0f) * f10) + f11);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        return (this.e.getAlpha() * r0.getHeight()) + (this.d.getAlpha() * r0.getHeight());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        org.telegram.ui.Cells.a9 a9Var = this.b;
        if (a9Var.getVisibility() == 0) {
            int i15 = i12 - i10;
            org.telegram.ui.Cells.q4 q4Var = this.a;
            int measuredHeight = q4Var.getMeasuredHeight();
            q4Var.layout(0, 0, i15, measuredHeight);
            i14 = a9Var.getMeasuredHeight() + measuredHeight;
            a9Var.layout(0, measuredHeight, i15, i14);
        } else {
            i14 = 0;
        }
        int i16 = i12 - i10;
        org.telegram.ui.Cells.a9 a9Var2 = this.c;
        int measuredHeight2 = a9Var2.getMeasuredHeight() + i14;
        a9Var2.layout(0, i14, i16, measuredHeight2);
        org.telegram.ui.Cells.i9 i9Var = this.d;
        i9Var.layout(0, measuredHeight2, i16, i9Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.i9 i9Var2 = this.e;
        i9Var2.layout(0, measuredHeight2, i16, i9Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float measuredHeight;
        org.telegram.ui.Cells.q4 q4Var = this.a;
        int i12 = this.v;
        q4Var.measure(i10, i12);
        org.telegram.ui.Cells.a9 a9Var = this.b;
        a9Var.measure(i10, i12);
        org.telegram.ui.Cells.a9 a9Var2 = this.c;
        a9Var2.measure(i10, i12);
        this.d.measure(i10, i12);
        this.e.measure(i10, i12);
        if (a9Var.getVisibility() == 0) {
            measuredHeight = (a9Var2.getMeasuredHeight() * this.s) + a9Var.getMeasuredHeight() + q4Var.getMeasuredHeight();
        } else {
            measuredHeight = a9Var2.getMeasuredHeight();
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
        org.telegram.ui.Cells.a9 a9Var = this.b;
        a9Var.setChecked(z10);
        a9Var.setDivider(this.f);
        boolean z11 = this.h;
        org.telegram.ui.Cells.a9 a9Var2 = this.c;
        a9Var2.setChecked(z11);
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, this.f ? 1.0f : 0.0f);
        this.r = ofFloat;
        ofFloat.setDuration(200L);
        this.r.setInterpolator(ds.f);
        this.r.addUpdateListener(new f80(this, 2));
        this.r.addListener(new i10(this, 4));
        a9Var2.setVisibility(0);
        this.r.start();
    }
}
