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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public abstract class e90 extends LinearLayout {
    public final org.telegram.ui.Cells.l4 a;
    public final org.telegram.ui.Cells.v8 b;
    public final org.telegram.ui.Cells.v8 c;
    public final org.telegram.ui.Cells.d9 d;
    public final org.telegram.ui.Cells.d9 e;
    public boolean f;
    public boolean h;
    public TLRPC.Chat n;
    public ValueAnimator r;
    public float s;
    public final int v;

    public e90(Context context, TLRPC.Chat chat) {
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
        l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
        addView(l4Var);
        org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context, 20);
        this.b = v8Var;
        String string = LocaleController.getString(R.string.ChannelSettingsJoinToSend);
        boolean z11 = this.f;
        v8Var.f(string, z11, z11);
        v8Var.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        final int i10 = 0;
        v8Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.b90
            public final /* synthetic */ e90 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        e90 e90Var = this.b;
                        boolean z12 = e90Var.f;
                        boolean z13 = !z12;
                        if (e90Var.b(z13, new d90(e90Var, e90Var.h, z12, 0))) {
                            e90Var.setJoinRequest(false);
                            e90Var.setJoinToSend(z13);
                            break;
                        }
                        break;
                    default:
                        e90 e90Var2 = this.b;
                        boolean z14 = e90Var2.h;
                        boolean z15 = !z14;
                        if (e90Var2.a(z15, new c90(e90Var2, z14, 0))) {
                            e90Var2.setJoinRequest(z15);
                            break;
                        }
                        break;
                }
            }
        });
        addView(v8Var);
        org.telegram.ui.Cells.v8 v8Var2 = new org.telegram.ui.Cells.v8(context, 20);
        this.c = v8Var2;
        v8Var2.f(LocaleController.getString(R.string.ChannelSettingsJoinRequest), this.h, false);
        v8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z10 = false;
        }
        v8Var2.setEnabled(z10);
        final int i11 = 1;
        v8Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.b90
            public final /* synthetic */ e90 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        e90 e90Var = this.b;
                        boolean z12 = e90Var.f;
                        boolean z13 = !z12;
                        if (e90Var.b(z13, new d90(e90Var, e90Var.h, z12, 0))) {
                            e90Var.setJoinRequest(false);
                            e90Var.setJoinToSend(z13);
                            break;
                        }
                        break;
                    default:
                        e90 e90Var2 = this.b;
                        boolean z14 = e90Var2.h;
                        boolean z15 = !z14;
                        if (e90Var2.a(z15, new c90(e90Var2, z14, 0))) {
                            e90Var2.setJoinRequest(z15);
                            break;
                        }
                        break;
                }
            }
        });
        addView(v8Var2);
        org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context, 12, null);
        this.d = d9Var;
        d9Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinToSendInfo));
        addView(d9Var);
        org.telegram.ui.Cells.d9 d9Var2 = new org.telegram.ui.Cells.d9(context, 12, null);
        this.e = d9Var2;
        d9Var2.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
        addView(d9Var2);
        boolean z12 = this.f;
        this.s = z12 ? 1.0f : 0.0f;
        v8Var2.setVisibility(z12 ? 0 : 8);
        d(this.s);
    }

    public abstract boolean a(boolean z10, c90 c90Var);

    public boolean b(boolean z10, d90 d90Var) {
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
        org.telegram.ui.Cells.v8 v8Var = this.c;
        v8Var.setAlpha(f7);
        float f10 = 1.0f - f7;
        v8Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        v8Var.setScaleY(1.0f - (0.1f * f10));
        int dp = v8Var.getMeasuredHeight() <= 0 ? AndroidUtilities.dp(50.0f) : v8Var.getMeasuredHeight();
        org.telegram.ui.Cells.d9 d9Var = this.d;
        d9Var.setAlpha(f10);
        float f11 = (-dp) * f10;
        d9Var.setTranslationY(((-AndroidUtilities.dp(4.0f)) * f7) + f11);
        org.telegram.ui.Cells.d9 d9Var2 = this.e;
        d9Var2.setAlpha(f7);
        d9Var2.setTranslationY((AndroidUtilities.dp(4.0f) * f10) + f11);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        return (this.e.getAlpha() * r0.getHeight()) + (this.d.getAlpha() * r0.getHeight());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        org.telegram.ui.Cells.v8 v8Var = this.b;
        if (v8Var.getVisibility() == 0) {
            int i15 = i12 - i10;
            org.telegram.ui.Cells.l4 l4Var = this.a;
            int measuredHeight = l4Var.getMeasuredHeight();
            l4Var.layout(0, 0, i15, measuredHeight);
            i14 = v8Var.getMeasuredHeight() + measuredHeight;
            v8Var.layout(0, measuredHeight, i15, i14);
        } else {
            i14 = 0;
        }
        int i16 = i12 - i10;
        org.telegram.ui.Cells.v8 v8Var2 = this.c;
        int measuredHeight2 = v8Var2.getMeasuredHeight() + i14;
        v8Var2.layout(0, i14, i16, measuredHeight2);
        org.telegram.ui.Cells.d9 d9Var = this.d;
        d9Var.layout(0, measuredHeight2, i16, d9Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.d9 d9Var2 = this.e;
        d9Var2.layout(0, measuredHeight2, i16, d9Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float measuredHeight;
        org.telegram.ui.Cells.l4 l4Var = this.a;
        int i12 = this.v;
        l4Var.measure(i10, i12);
        org.telegram.ui.Cells.v8 v8Var = this.b;
        v8Var.measure(i10, i12);
        org.telegram.ui.Cells.v8 v8Var2 = this.c;
        v8Var2.measure(i10, i12);
        this.d.measure(i10, i12);
        this.e.measure(i10, i12);
        if (v8Var.getVisibility() == 0) {
            measuredHeight = (v8Var2.getMeasuredHeight() * this.s) + v8Var.getMeasuredHeight() + l4Var.getMeasuredHeight();
        } else {
            measuredHeight = v8Var2.getMeasuredHeight();
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
        org.telegram.ui.Cells.v8 v8Var = this.b;
        v8Var.setChecked(z10);
        v8Var.setDivider(this.f);
        boolean z11 = this.h;
        org.telegram.ui.Cells.v8 v8Var2 = this.c;
        v8Var2.setChecked(z11);
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, this.f ? 1.0f : 0.0f);
        this.r = ofFloat;
        ofFloat.setDuration(200L);
        this.r.setInterpolator(bs.f);
        this.r.addUpdateListener(new b80(this, 2));
        this.r.addListener(new c80(this, 2));
        v8Var2.setVisibility(0);
        this.r.start();
    }
}
