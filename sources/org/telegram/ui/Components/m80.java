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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class m80 extends LinearLayout {
    public final org.telegram.ui.Cells.l4 a;
    public final org.telegram.ui.Cells.r8 b;
    public final org.telegram.ui.Cells.r8 c;
    public final org.telegram.ui.Cells.z8 d;
    public final org.telegram.ui.Cells.z8 e;
    public boolean f;
    public boolean h;
    public TLRPC.Chat n;
    public ValueAnimator r;
    public float s;
    public final int v;

    public m80(Context context, TLRPC.Chat chat) {
        super(context);
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.v = View.MeasureSpec.makeMeasureSpec(999999, TLObject.FLAG_31);
        this.n = chat;
        this.f = chat.join_to_send;
        this.h = chat.join_request;
        boolean z4 = true;
        setOrientation(1);
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 20);
        this.a = l4Var;
        l4Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinTitle));
        l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        addView(l4Var);
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context, 20);
        this.b = r8Var;
        String string = LocaleController.getString(R.string.ChannelSettingsJoinToSend);
        boolean z10 = this.f;
        r8Var.f(string, z10, z10);
        r8Var.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        final int i10 = 0;
        r8Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.j80
            public final /* synthetic */ m80 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        m80 m80Var = this.b;
                        boolean z11 = m80Var.f;
                        boolean z12 = !z11;
                        if (m80Var.b(z12, new l80(m80Var, m80Var.h, z11, 0))) {
                            m80Var.setJoinRequest(false);
                            m80Var.setJoinToSend(z12);
                            break;
                        }
                        break;
                    default:
                        m80 m80Var2 = this.b;
                        boolean z13 = m80Var2.h;
                        boolean z14 = !z13;
                        if (m80Var2.a(z14, new k80(m80Var2, z13, 0))) {
                            m80Var2.setJoinRequest(z14);
                            break;
                        }
                        break;
                }
            }
        });
        addView(r8Var);
        org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context, 20);
        this.c = r8Var2;
        r8Var2.f(LocaleController.getString(R.string.ChannelSettingsJoinRequest), this.h, false);
        r8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z4 = false;
        }
        r8Var2.setEnabled(z4);
        final int i11 = 1;
        r8Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.j80
            public final /* synthetic */ m80 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        m80 m80Var = this.b;
                        boolean z11 = m80Var.f;
                        boolean z12 = !z11;
                        if (m80Var.b(z12, new l80(m80Var, m80Var.h, z11, 0))) {
                            m80Var.setJoinRequest(false);
                            m80Var.setJoinToSend(z12);
                            break;
                        }
                        break;
                    default:
                        m80 m80Var2 = this.b;
                        boolean z13 = m80Var2.h;
                        boolean z14 = !z13;
                        if (m80Var2.a(z14, new k80(m80Var2, z13, 0))) {
                            m80Var2.setJoinRequest(z14);
                            break;
                        }
                        break;
                }
            }
        });
        addView(r8Var2);
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context, 12, null);
        this.d = z8Var;
        z8Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinToSendInfo));
        addView(z8Var);
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context, 12, null);
        this.e = z8Var2;
        z8Var2.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
        addView(z8Var2);
        boolean z11 = this.f;
        this.s = z11 ? 1.0f : 0.0f;
        r8Var2.setVisibility(z11 ? 0 : 8);
        d(this.s);
    }

    public abstract boolean a(boolean z4, k80 k80Var);

    public boolean b(boolean z4, l80 l80Var) {
        return true;
    }

    public final void c(boolean z4) {
        this.a.setVisibility(z4 ? 0 : 8);
        this.b.setVisibility(z4 ? 0 : 8);
        if (!z4) {
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
        r8Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f11);
        r8Var.setScaleY(1.0f - (0.1f * f11));
        int dp = r8Var.getMeasuredHeight() <= 0 ? AndroidUtilities.dp(50.0f) : r8Var.getMeasuredHeight();
        org.telegram.ui.Cells.z8 z8Var = this.d;
        z8Var.setAlpha(f11);
        float f12 = (-dp) * f11;
        z8Var.setTranslationY(((-AndroidUtilities.dp(4.0f)) * f10) + f12);
        org.telegram.ui.Cells.z8 z8Var2 = this.e;
        z8Var2.setAlpha(f10);
        z8Var2.setTranslationY((AndroidUtilities.dp(4.0f) * f11) + f12);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        return (this.e.getAlpha() * r0.getHeight()) + (this.d.getAlpha() * r0.getHeight());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        org.telegram.ui.Cells.r8 r8Var = this.b;
        if (r8Var.getVisibility() == 0) {
            int i15 = i12 - i10;
            org.telegram.ui.Cells.l4 l4Var = this.a;
            int measuredHeight = l4Var.getMeasuredHeight();
            l4Var.layout(0, 0, i15, measuredHeight);
            i14 = r8Var.getMeasuredHeight() + measuredHeight;
            r8Var.layout(0, measuredHeight, i15, i14);
        } else {
            i14 = 0;
        }
        int i16 = i12 - i10;
        org.telegram.ui.Cells.r8 r8Var2 = this.c;
        int measuredHeight2 = r8Var2.getMeasuredHeight() + i14;
        r8Var2.layout(0, i14, i16, measuredHeight2);
        org.telegram.ui.Cells.z8 z8Var = this.d;
        z8Var.layout(0, measuredHeight2, i16, z8Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.z8 z8Var2 = this.e;
        z8Var2.layout(0, measuredHeight2, i16, z8Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float measuredHeight;
        org.telegram.ui.Cells.l4 l4Var = this.a;
        int i12 = this.v;
        l4Var.measure(i10, i12);
        org.telegram.ui.Cells.r8 r8Var = this.b;
        r8Var.measure(i10, i12);
        org.telegram.ui.Cells.r8 r8Var2 = this.c;
        r8Var2.measure(i10, i12);
        this.d.measure(i10, i12);
        this.e.measure(i10, i12);
        if (r8Var.getVisibility() == 0) {
            measuredHeight = (r8Var2.getMeasuredHeight() * this.s) + r8Var.getMeasuredHeight() + l4Var.getMeasuredHeight();
        } else {
            measuredHeight = r8Var2.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + AndroidUtilities.lerp(r3.getMeasuredHeight(), r4.getMeasuredHeight(), this.s)), TLObject.FLAG_30));
    }

    public void setChat(TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.n = chat;
        boolean z4 = true;
        this.b.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        TLRPC.Chat chat2 = this.n;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z4 = false;
        }
        this.c.setEnabled(z4);
    }

    public void setJoinRequest(boolean z4) {
        this.h = z4;
        this.c.setChecked(z4);
    }

    public void setJoinToSend(boolean z4) {
        this.f = z4;
        org.telegram.ui.Cells.r8 r8Var = this.b;
        r8Var.setChecked(z4);
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
        this.r.setInterpolator(mr.f);
        this.r.addUpdateListener(new j70(this, 1));
        this.r.addListener(new a9(this, 25));
        r8Var2.setVisibility(0);
        this.r.start();
    }
}
