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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class g80 extends LinearLayout {
    public final org.telegram.ui.Cells.k4 a;
    public final org.telegram.ui.Cells.q8 b;
    public final org.telegram.ui.Cells.q8 c;
    public final org.telegram.ui.Cells.y8 d;
    public final org.telegram.ui.Cells.y8 e;
    public boolean f;
    public boolean h;
    public TLRPC.Chat n;
    public ValueAnimator r;
    public float s;
    public final int v;

    public g80(Context context, TLRPC.Chat chat) {
        super(context);
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.v = View.MeasureSpec.makeMeasureSpec(999999, TLObject.FLAG_31);
        this.n = chat;
        this.f = chat.join_to_send;
        this.h = chat.join_request;
        boolean z10 = true;
        setOrientation(1);
        org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context, 20);
        this.a = k4Var;
        k4Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinTitle));
        k4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        addView(k4Var);
        org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context, 20);
        this.b = q8Var;
        String string = LocaleController.getString(R.string.ChannelSettingsJoinToSend);
        boolean z11 = this.f;
        q8Var.f(string, z11, z11);
        q8Var.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        final int i10 = 0;
        q8Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.d80
            public final /* synthetic */ g80 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        g80 g80Var = this.b;
                        boolean z12 = g80Var.f;
                        boolean z13 = !z12;
                        if (g80Var.b(z13, new f80(g80Var, g80Var.h, z12, 0))) {
                            g80Var.setJoinRequest(false);
                            g80Var.setJoinToSend(z13);
                            break;
                        }
                        break;
                    default:
                        g80 g80Var2 = this.b;
                        boolean z14 = g80Var2.h;
                        boolean z15 = !z14;
                        if (g80Var2.a(z15, new e80(g80Var2, z14, 0))) {
                            g80Var2.setJoinRequest(z15);
                            break;
                        }
                        break;
                }
            }
        });
        addView(q8Var);
        org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(context, 20);
        this.c = q8Var2;
        q8Var2.f(LocaleController.getString(R.string.ChannelSettingsJoinRequest), this.h, false);
        q8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z10 = false;
        }
        q8Var2.setEnabled(z10);
        final int i11 = 1;
        q8Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.d80
            public final /* synthetic */ g80 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        g80 g80Var = this.b;
                        boolean z12 = g80Var.f;
                        boolean z13 = !z12;
                        if (g80Var.b(z13, new f80(g80Var, g80Var.h, z12, 0))) {
                            g80Var.setJoinRequest(false);
                            g80Var.setJoinToSend(z13);
                            break;
                        }
                        break;
                    default:
                        g80 g80Var2 = this.b;
                        boolean z14 = g80Var2.h;
                        boolean z15 = !z14;
                        if (g80Var2.a(z15, new e80(g80Var2, z14, 0))) {
                            g80Var2.setJoinRequest(z15);
                            break;
                        }
                        break;
                }
            }
        });
        addView(q8Var2);
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context, 12, null);
        this.d = y8Var;
        y8Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinToSendInfo));
        addView(y8Var);
        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context, 12, null);
        this.e = y8Var2;
        y8Var2.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
        addView(y8Var2);
        boolean z12 = this.f;
        this.s = z12 ? 1.0f : 0.0f;
        q8Var2.setVisibility(z12 ? 0 : 8);
        d(this.s);
    }

    public abstract boolean a(boolean z10, e80 e80Var);

    public boolean b(boolean z10, f80 f80Var) {
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

    public final void d(float f9) {
        this.s = f9;
        org.telegram.ui.Cells.q8 q8Var = this.c;
        q8Var.setAlpha(f9);
        float f10 = 1.0f - f9;
        q8Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        q8Var.setScaleY(1.0f - (0.1f * f10));
        int dp = q8Var.getMeasuredHeight() <= 0 ? AndroidUtilities.dp(50.0f) : q8Var.getMeasuredHeight();
        org.telegram.ui.Cells.y8 y8Var = this.d;
        y8Var.setAlpha(f10);
        float f11 = (-dp) * f10;
        y8Var.setTranslationY(((-AndroidUtilities.dp(4.0f)) * f9) + f11);
        org.telegram.ui.Cells.y8 y8Var2 = this.e;
        y8Var2.setAlpha(f9);
        y8Var2.setTranslationY((AndroidUtilities.dp(4.0f) * f10) + f11);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        return (this.e.getAlpha() * r0.getHeight()) + (this.d.getAlpha() * r0.getHeight());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        org.telegram.ui.Cells.q8 q8Var = this.b;
        if (q8Var.getVisibility() == 0) {
            int i15 = i12 - i10;
            org.telegram.ui.Cells.k4 k4Var = this.a;
            int measuredHeight = k4Var.getMeasuredHeight();
            k4Var.layout(0, 0, i15, measuredHeight);
            i14 = q8Var.getMeasuredHeight() + measuredHeight;
            q8Var.layout(0, measuredHeight, i15, i14);
        } else {
            i14 = 0;
        }
        int i16 = i12 - i10;
        org.telegram.ui.Cells.q8 q8Var2 = this.c;
        int measuredHeight2 = q8Var2.getMeasuredHeight() + i14;
        q8Var2.layout(0, i14, i16, measuredHeight2);
        org.telegram.ui.Cells.y8 y8Var = this.d;
        y8Var.layout(0, measuredHeight2, i16, y8Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.y8 y8Var2 = this.e;
        y8Var2.layout(0, measuredHeight2, i16, y8Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float measuredHeight;
        org.telegram.ui.Cells.k4 k4Var = this.a;
        int i12 = this.v;
        k4Var.measure(i10, i12);
        org.telegram.ui.Cells.q8 q8Var = this.b;
        q8Var.measure(i10, i12);
        org.telegram.ui.Cells.q8 q8Var2 = this.c;
        q8Var2.measure(i10, i12);
        this.d.measure(i10, i12);
        this.e.measure(i10, i12);
        if (q8Var.getVisibility() == 0) {
            measuredHeight = (q8Var2.getMeasuredHeight() * this.s) + q8Var.getMeasuredHeight() + k4Var.getMeasuredHeight();
        } else {
            measuredHeight = q8Var2.getMeasuredHeight();
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
        this.r.setInterpolator(jr.f);
        this.r.addUpdateListener(new d70(this, 1));
        this.r.addListener(new zz(this, 4));
        q8Var2.setVisibility(0);
        this.r.start();
    }
}
