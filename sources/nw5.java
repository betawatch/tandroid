// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class nw5 extends LinearLayout {
    public final mf5 a;
    public final wkb b;
    public final wkb c;
    public final ilb d;
    public final ilb e;
    public boolean f;
    public boolean h;
    public TLRPC.Chat n;
    public ValueAnimator r;
    public float s;
    public final int w;

    public nw5(Context context, TLRPC.Chat chat) {
        super(context);
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.w = -2146483649;
        this.n = chat;
        this.f = chat.join_to_send;
        this.h = chat.join_request;
        final byte b = 1;
        setOrientation(1);
        mf5 mf5Var = new mf5(context, 20);
        this.a = mf5Var;
        mf5Var.setText(ob6.M0(2131752266, null));
        yob.h(aob.d6, null, mf5Var);
        addView(mf5Var);
        wkb wkbVar = new wkb(context, 20);
        this.b = wkbVar;
        String M0 = ob6.M0(2131752265, null);
        boolean z = this.f;
        wkbVar.f(M0, z, z);
        wkbVar.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        wkbVar.setOnClickListener(new View.OnClickListener(this) { // from class: kw5
            public final /* synthetic */ nw5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = r2;
                nw5 nw5Var = this.b;
                byte b3 = 0;
                switch (b2) {
                    case 0:
                        boolean z2 = nw5Var.f;
                        boolean z3 = !z2;
                        if (nw5Var.b(z3, new mw5(nw5Var, nw5Var.h, z2, b3))) {
                            nw5Var.setJoinRequest(false);
                            nw5Var.setJoinToSend(z3);
                            break;
                        }
                        break;
                    default:
                        boolean z4 = nw5Var.h;
                        boolean z5 = !z4;
                        if (nw5Var.a(z5, new lw5(nw5Var, z4, b3))) {
                            nw5Var.setJoinRequest(z5);
                            break;
                        }
                        break;
                }
            }
        });
        addView(wkbVar);
        wkb wkbVar2 = new wkb(context, 20);
        this.c = wkbVar2;
        wkbVar2.f(ob6.M0(2131752270, null), this.h, false);
        wkbVar2.setPivotY(0.0f);
        wkbVar2.setEnabled(chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users));
        wkbVar2.setOnClickListener(new View.OnClickListener(this) { // from class: kw5
            public final /* synthetic */ nw5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                nw5 nw5Var = this.b;
                byte b3 = 0;
                switch (b2) {
                    case 0:
                        boolean z2 = nw5Var.f;
                        boolean z3 = !z2;
                        if (nw5Var.b(z3, new mw5(nw5Var, nw5Var.h, z2, b3))) {
                            nw5Var.setJoinRequest(false);
                            nw5Var.setJoinToSend(z3);
                            break;
                        }
                        break;
                    default:
                        boolean z4 = nw5Var.h;
                        boolean z5 = !z4;
                        if (nw5Var.a(z5, new lw5(nw5Var, z4, b3))) {
                            nw5Var.setJoinRequest(z5);
                            break;
                        }
                        break;
                }
            }
        });
        addView(wkbVar2);
        ilb ilbVar = new ilb(12, null, context);
        this.d = ilbVar;
        ilbVar.setText(ob6.M0(2131752264, null));
        addView(ilbVar);
        ilb ilbVar2 = new ilb(12, null, context);
        this.e = ilbVar2;
        ilbVar2.setText(ob6.M0(2131752269, null));
        addView(ilbVar2);
        boolean z2 = this.f;
        this.s = z2 ? 1.0f : 0.0f;
        wkbVar2.setVisibility(z2 ? (byte) 0 : (byte) 8);
        d(this.s);
    }

    public abstract boolean a(boolean z, lw5 lw5Var);

    public boolean b(boolean z, mw5 mw5Var) {
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
        wkb wkbVar = this.c;
        wkbVar.setAlpha(f);
        float f2 = 1.0f - f;
        wkbVar.setTranslationY((-hl.L(16.0f)) * f2);
        wkbVar.setScaleY(1.0f - (0.1f * f2));
        int L = wkbVar.getMeasuredHeight() <= 0 ? hl.L(50.0f) : wkbVar.getMeasuredHeight();
        ilb ilbVar = this.d;
        ilbVar.setAlpha(f2);
        float f3 = (-L) * f2;
        ilbVar.setTranslationY(((-hl.L(4.0f)) * f) + f3);
        ilb ilbVar2 = this.e;
        ilbVar2.setAlpha(f);
        ilbVar2.setTranslationY((hl.L(4.0f) * f2) + f3);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        return (this.e.getAlpha() * r2.getHeight()) + (this.d.getAlpha() * r0.getHeight());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        wkb wkbVar = this.b;
        if (wkbVar.getVisibility() == 0) {
            int i6 = i3 - i;
            mf5 mf5Var = this.a;
            int measuredHeight = mf5Var.getMeasuredHeight();
            mf5Var.layout(0, 0, i6, measuredHeight);
            i5 = wkbVar.getMeasuredHeight() + measuredHeight;
            wkbVar.layout(0, measuredHeight, i6, i5);
        } else {
            i5 = 0;
        }
        int i7 = i3 - i;
        wkb wkbVar2 = this.c;
        int measuredHeight2 = wkbVar2.getMeasuredHeight() + i5;
        wkbVar2.layout(0, i5, i7, measuredHeight2);
        ilb ilbVar = this.d;
        ilbVar.layout(0, measuredHeight2, i7, ilbVar.getMeasuredHeight() + measuredHeight2);
        ilb ilbVar2 = this.e;
        ilbVar2.layout(0, measuredHeight2, i7, ilbVar2.getMeasuredHeight() + measuredHeight2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float measuredHeight;
        mf5 mf5Var = this.a;
        int i3 = this.w;
        mf5Var.measure(i, i3);
        wkb wkbVar = this.b;
        wkbVar.measure(i, i3);
        wkb wkbVar2 = this.c;
        wkbVar2.measure(i, i3);
        this.d.measure(i, i3);
        this.e.measure(i, i3);
        if (wkbVar.getVisibility() == 0) {
            measuredHeight = (wkbVar2.getMeasuredHeight() * this.s) + wkbVar.getMeasuredHeight() + mf5Var.getMeasuredHeight();
        } else {
            measuredHeight = wkbVar2.getMeasuredHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + hl.U1(this.s, r3.getMeasuredHeight(), r4.getMeasuredHeight())), TLObject.FLAG_30));
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
        wkb wkbVar = this.b;
        wkbVar.setChecked(z);
        wkbVar.setDivider(this.f);
        boolean z2 = this.h;
        wkb wkbVar2 = this.c;
        wkbVar2.setChecked(z2);
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, this.f ? 1.0f : 0.0f);
        this.r = ofFloat;
        ofFloat.setDuration(200L);
        this.r.setInterpolator(k43.f);
        this.r.addUpdateListener(new ch4(this, (byte) 17));
        this.r.addListener(new ad5(this, (byte) 7));
        wkbVar2.setVisibility(0);
        this.r.start();
    }
}
