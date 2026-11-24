// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class iw5 extends LinearLayout {
    public final jf5 a;
    public final bjb b;
    public final bjb c;
    public final njb d;
    public final njb e;
    public boolean f;
    public boolean h;
    public TLRPC.Chat n;
    public ValueAnimator r;
    public float s;
    public final int w;

    public iw5(Context context, TLRPC.Chat chat) {
        super(context);
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.w = -2146483649;
        this.n = chat;
        this.f = chat.join_to_send;
        this.h = chat.join_request;
        final byte b = 1;
        setOrientation(1);
        jf5 jf5Var = new jf5(context, 20);
        this.a = jf5Var;
        jf5Var.setText(jb6.M0(2131752238, null));
        anb.h(cmb.c6, null, jf5Var);
        addView(jf5Var);
        bjb bjbVar = new bjb(context, 20);
        this.b = bjbVar;
        String M0 = jb6.M0(2131752237, null);
        boolean z = this.f;
        bjbVar.f(M0, z, z);
        bjbVar.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        bjbVar.setOnClickListener(new View.OnClickListener(this) { // from class: fw5
            public final /* synthetic */ iw5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = r2;
                iw5 iw5Var = this.b;
                byte b3 = 0;
                switch (b2) {
                    case 0:
                        boolean z2 = iw5Var.f;
                        boolean z3 = !z2;
                        if (iw5Var.b(z3, new hw5(iw5Var, iw5Var.h, z2, b3))) {
                            iw5Var.setJoinRequest(false);
                            iw5Var.setJoinToSend(z3);
                            break;
                        }
                        break;
                    default:
                        boolean z4 = iw5Var.h;
                        boolean z5 = !z4;
                        if (iw5Var.a(z5, new gw5(iw5Var, z4, b3))) {
                            iw5Var.setJoinRequest(z5);
                            break;
                        }
                        break;
                }
            }
        });
        addView(bjbVar);
        bjb bjbVar2 = new bjb(context, 20);
        this.c = bjbVar2;
        bjbVar2.f(jb6.M0(2131752242, null), this.h, false);
        bjbVar2.setPivotY(0.0f);
        bjbVar2.setEnabled(chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users));
        bjbVar2.setOnClickListener(new View.OnClickListener(this) { // from class: fw5
            public final /* synthetic */ iw5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                iw5 iw5Var = this.b;
                byte b3 = 0;
                switch (b2) {
                    case 0:
                        boolean z2 = iw5Var.f;
                        boolean z3 = !z2;
                        if (iw5Var.b(z3, new hw5(iw5Var, iw5Var.h, z2, b3))) {
                            iw5Var.setJoinRequest(false);
                            iw5Var.setJoinToSend(z3);
                            break;
                        }
                        break;
                    default:
                        boolean z4 = iw5Var.h;
                        boolean z5 = !z4;
                        if (iw5Var.a(z5, new gw5(iw5Var, z4, b3))) {
                            iw5Var.setJoinRequest(z5);
                            break;
                        }
                        break;
                }
            }
        });
        addView(bjbVar2);
        njb njbVar = new njb(12, null, context);
        this.d = njbVar;
        njbVar.setText(jb6.M0(2131752236, null));
        addView(njbVar);
        njb njbVar2 = new njb(12, null, context);
        this.e = njbVar2;
        njbVar2.setText(jb6.M0(2131752241, null));
        addView(njbVar2);
        boolean z2 = this.f;
        this.s = z2 ? 1.0f : 0.0f;
        bjbVar2.setVisibility(z2 ? (byte) 0 : (byte) 8);
        d(this.s);
    }

    public abstract boolean a(boolean z, gw5 gw5Var);

    public boolean b(boolean z, hw5 hw5Var) {
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
        bjb bjbVar = this.c;
        bjbVar.setAlpha(f);
        float f2 = 1.0f - f;
        bjbVar.setTranslationY((-gm.L(16.0f)) * f2);
        bjbVar.setScaleY(1.0f - (0.1f * f2));
        int L = bjbVar.getMeasuredHeight() <= 0 ? gm.L(50.0f) : bjbVar.getMeasuredHeight();
        njb njbVar = this.d;
        njbVar.setAlpha(f2);
        float f3 = (-L) * f2;
        njbVar.setTranslationY(((-gm.L(4.0f)) * f) + f3);
        njb njbVar2 = this.e;
        njbVar2.setAlpha(f);
        njbVar2.setTranslationY((gm.L(4.0f) * f2) + f3);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        return (this.e.getAlpha() * r2.getHeight()) + (this.d.getAlpha() * r0.getHeight());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        bjb bjbVar = this.b;
        if (bjbVar.getVisibility() == 0) {
            int i6 = i3 - i;
            jf5 jf5Var = this.a;
            int measuredHeight = jf5Var.getMeasuredHeight();
            jf5Var.layout(0, 0, i6, measuredHeight);
            i5 = bjbVar.getMeasuredHeight() + measuredHeight;
            bjbVar.layout(0, measuredHeight, i6, i5);
        } else {
            i5 = 0;
        }
        int i7 = i3 - i;
        bjb bjbVar2 = this.c;
        int measuredHeight2 = bjbVar2.getMeasuredHeight() + i5;
        bjbVar2.layout(0, i5, i7, measuredHeight2);
        njb njbVar = this.d;
        njbVar.layout(0, measuredHeight2, i7, njbVar.getMeasuredHeight() + measuredHeight2);
        njb njbVar2 = this.e;
        njbVar2.layout(0, measuredHeight2, i7, njbVar2.getMeasuredHeight() + measuredHeight2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float measuredHeight;
        jf5 jf5Var = this.a;
        int i3 = this.w;
        jf5Var.measure(i, i3);
        bjb bjbVar = this.b;
        bjbVar.measure(i, i3);
        bjb bjbVar2 = this.c;
        bjbVar2.measure(i, i3);
        this.d.measure(i, i3);
        this.e.measure(i, i3);
        if (bjbVar.getVisibility() == 0) {
            measuredHeight = (bjbVar2.getMeasuredHeight() * this.s) + bjbVar.getMeasuredHeight() + jf5Var.getMeasuredHeight();
        } else {
            measuredHeight = bjbVar2.getMeasuredHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + gm.U1(this.s, r3.getMeasuredHeight(), r4.getMeasuredHeight())), TLObject.FLAG_30));
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
        bjb bjbVar = this.b;
        bjbVar.setChecked(z);
        bjbVar.setDivider(this.f);
        boolean z2 = this.h;
        bjb bjbVar2 = this.c;
        bjbVar2.setChecked(z2);
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, this.f ? 1.0f : 0.0f);
        this.r = ofFloat;
        ofFloat.setDuration(200L);
        this.r.setInterpolator(d53.f);
        this.r.addUpdateListener(new fh4(this, (byte) 17));
        this.r.addListener(new v85(this, (byte) 10));
        bjbVar2.setVisibility(0);
        this.r.start();
    }
}
