// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class ju5 extends LinearLayout {
    public final ld5 a;
    public final ahb b;
    public final ahb c;
    public final mhb d;
    public final mhb e;
    public boolean f;
    public boolean h;
    public TLRPC.Chat n;
    public ValueAnimator r;
    public float s;
    public final int w;

    public ju5(Context context, TLRPC.Chat chat) {
        super(context);
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.w = -2146483649;
        this.n = chat;
        this.f = chat.join_to_send;
        this.h = chat.join_request;
        final byte b = 1;
        setOrientation(1);
        ld5 ld5Var = new ld5(context, 20);
        this.a = ld5Var;
        ld5Var.setText(k96.M0(2131752288, null));
        zkb.h(bkb.c6, null, ld5Var);
        addView(ld5Var);
        ahb ahbVar = new ahb(context, 20);
        this.b = ahbVar;
        String M0 = k96.M0(2131752287, null);
        boolean z = this.f;
        ahbVar.f(M0, z, z);
        ahbVar.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        ahbVar.setOnClickListener(new View.OnClickListener(this) { // from class: gu5
            public final /* synthetic */ ju5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = r2;
                ju5 ju5Var = this.b;
                byte b3 = 0;
                switch (b2) {
                    case 0:
                        boolean z2 = ju5Var.f;
                        boolean z3 = !z2;
                        if (ju5Var.b(z3, new iu5(ju5Var, ju5Var.h, z2, b3))) {
                            ju5Var.setJoinRequest(false);
                            ju5Var.setJoinToSend(z3);
                            break;
                        }
                        break;
                    default:
                        boolean z4 = ju5Var.h;
                        boolean z5 = !z4;
                        if (ju5Var.a(z5, new hu5(ju5Var, z4, b3))) {
                            ju5Var.setJoinRequest(z5);
                            break;
                        }
                        break;
                }
            }
        });
        addView(ahbVar);
        ahb ahbVar2 = new ahb(context, 20);
        this.c = ahbVar2;
        ahbVar2.f(k96.M0(2131752292, null), this.h, false);
        ahbVar2.setPivotY(0.0f);
        ahbVar2.setEnabled(chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users));
        ahbVar2.setOnClickListener(new View.OnClickListener(this) { // from class: gu5
            public final /* synthetic */ ju5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                ju5 ju5Var = this.b;
                byte b3 = 0;
                switch (b2) {
                    case 0:
                        boolean z2 = ju5Var.f;
                        boolean z3 = !z2;
                        if (ju5Var.b(z3, new iu5(ju5Var, ju5Var.h, z2, b3))) {
                            ju5Var.setJoinRequest(false);
                            ju5Var.setJoinToSend(z3);
                            break;
                        }
                        break;
                    default:
                        boolean z4 = ju5Var.h;
                        boolean z5 = !z4;
                        if (ju5Var.a(z5, new hu5(ju5Var, z4, b3))) {
                            ju5Var.setJoinRequest(z5);
                            break;
                        }
                        break;
                }
            }
        });
        addView(ahbVar2);
        mhb mhbVar = new mhb(12, null, context);
        this.d = mhbVar;
        mhbVar.setText(k96.M0(2131752286, null));
        addView(mhbVar);
        mhb mhbVar2 = new mhb(12, null, context);
        this.e = mhbVar2;
        mhbVar2.setText(k96.M0(2131752291, null));
        addView(mhbVar2);
        boolean z2 = this.f;
        this.s = z2 ? 1.0f : 0.0f;
        ahbVar2.setVisibility(z2 ? (byte) 0 : (byte) 8);
        d(this.s);
    }

    public abstract boolean a(boolean z, hu5 hu5Var);

    public boolean b(boolean z, iu5 iu5Var) {
        return true;
    }

    public final void c(boolean z) {
        this.a.setVisibility(z ? 0 : 8);
        this.b.setVisibility(z ? 0 : 8);
        if (!z) {
            this.f = true;
            this.c.setVisibility(0);
            d(1.0f);
        }
        requestLayout();
    }

    public final void d(float f) {
        this.s = f;
        ahb ahbVar = this.c;
        ahbVar.setAlpha(f);
        float f2 = 1.0f - f;
        ahbVar.setTranslationY((-gl.L(16.0f)) * f2);
        ahbVar.setScaleY(1.0f - (0.1f * f2));
        int L = ahbVar.getMeasuredHeight() <= 0 ? gl.L(50.0f) : ahbVar.getMeasuredHeight();
        mhb mhbVar = this.d;
        mhbVar.setAlpha(f2);
        float f3 = (-L) * f2;
        mhbVar.setTranslationY(((-gl.L(4.0f)) * f) + f3);
        mhb mhbVar2 = this.e;
        mhbVar2.setAlpha(f);
        mhbVar2.setTranslationY((gl.L(4.0f) * f2) + f3);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        return (this.e.getAlpha() * r2.getHeight()) + (this.d.getAlpha() * r0.getHeight());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        ahb ahbVar = this.b;
        if (ahbVar.getVisibility() == 0) {
            int i6 = i3 - i;
            ld5 ld5Var = this.a;
            int measuredHeight = ld5Var.getMeasuredHeight();
            ld5Var.layout(0, 0, i6, measuredHeight);
            i5 = ahbVar.getMeasuredHeight() + measuredHeight;
            ahbVar.layout(0, measuredHeight, i6, i5);
        } else {
            i5 = 0;
        }
        int i7 = i3 - i;
        ahb ahbVar2 = this.c;
        int measuredHeight2 = ahbVar2.getMeasuredHeight() + i5;
        ahbVar2.layout(0, i5, i7, measuredHeight2);
        mhb mhbVar = this.d;
        mhbVar.layout(0, measuredHeight2, i7, mhbVar.getMeasuredHeight() + measuredHeight2);
        mhb mhbVar2 = this.e;
        mhbVar2.layout(0, measuredHeight2, i7, mhbVar2.getMeasuredHeight() + measuredHeight2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float measuredHeight;
        ld5 ld5Var = this.a;
        int i3 = this.w;
        ld5Var.measure(i, i3);
        ahb ahbVar = this.b;
        ahbVar.measure(i, i3);
        ahb ahbVar2 = this.c;
        ahbVar2.measure(i, i3);
        this.d.measure(i, i3);
        this.e.measure(i, i3);
        if (ahbVar.getVisibility() == 0) {
            measuredHeight = (ahbVar2.getMeasuredHeight() * this.s) + ahbVar.getMeasuredHeight() + ld5Var.getMeasuredHeight();
        } else {
            measuredHeight = ahbVar2.getMeasuredHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + gl.U1(this.s, r3.getMeasuredHeight(), r4.getMeasuredHeight())), TLObject.FLAG_30));
    }

    public void setChat(TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.n = chat;
        boolean z = true;
        this.b.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        TLRPC.Chat chat2 = this.n;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z = false;
        }
        this.c.setEnabled(z);
    }

    public void setJoinRequest(boolean z) {
        this.h = z;
        this.c.setChecked(z);
    }

    public void setJoinToSend(boolean z) {
        this.f = z;
        ahb ahbVar = this.b;
        ahbVar.setChecked(z);
        ahbVar.setDivider(this.f);
        boolean z2 = this.h;
        ahb ahbVar2 = this.c;
        ahbVar2.setChecked(z2);
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, this.f ? 1.0f : 0.0f);
        this.r = ofFloat;
        ofFloat.setDuration(200L);
        this.r.setInterpolator(s33.f);
        this.r.addUpdateListener(new ni4(this, (byte) 15));
        this.r.addListener(new v85(this, (byte) 8));
        ahbVar2.setVisibility(0);
        this.r.start();
    }
}
