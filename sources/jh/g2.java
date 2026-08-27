package jh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class g2 extends u0 {
    public final /* synthetic */ i9 d0;
    public final /* synthetic */ e4 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(e4 e4Var, Context context, i9 i9Var, x8 x8Var, View view, FrameLayout frameLayout, i9 i9Var2) {
        super(context, i9Var, x8Var, view, frameLayout);
        this.e0 = e4Var;
        this.d0 = i9Var2;
    }

    @Override // jh.u0
    public final TLRPC.Peer getDefaultSendAs() {
        d1 d1Var = this.d0.w0;
        if (d1Var != null) {
            return d1Var.i();
        }
        return null;
    }

    @Override // jh.u0
    public final void h(long j10) {
        q1 q1Var = this.e0.U1;
        if (q1Var == null) {
            return;
        }
        ArrayList arrayList = q1Var.h;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((p1) arrayList.get(i10)).a == j10) {
                ((p1) arrayList.get(i10)).h = true;
            }
        }
    }

    @Override // jh.u0
    public final void i(int i10, int i11, long j10) {
        q1 q1Var = this.e0.U1;
        if (q1Var == null) {
            return;
        }
        int i12 = q1Var.a;
        ArrayList arrayList = q1Var.h;
        arrayList.add(new p1(q1Var, q1Var, i12, j10, i11, arrayList.size() < 5));
        q1Var.invalidate();
    }

    @Override // jh.u0
    public final void j() {
        e4 e4Var = this.e0;
        e4Var.V1.setCount((int) getStarsCount());
        e4Var.V1.setFilled(this.S != null);
    }

    @Override // jh.u0
    public final void q(boolean z10, boolean z11) {
        if (!z11 || this.b0 != z10) {
            this.b0 = z10;
            ValueAnimator valueAnimator = this.a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.a0 = null;
            }
            hh.f1 f1Var = this.c;
            f1Var.invalidate();
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f1Var.getAlpha(), z10 ? 0.0f : 1.0f);
                this.a0 = ofFloat;
                ofFloat.addUpdateListener(new ag.u(this, 16));
                this.a0.addListener(new ag.x(4, this, z10));
                this.a0.setDuration(420L);
                this.a0.setInterpolator(er.h);
                this.a0.start();
            } else {
                this.a.setAlpha(z10 ? 0.0f : 0.5f);
                f1Var.setAlpha(z10 ? 0.0f : 1.0f);
            }
            invalidate();
        }
        a aVar = this.e0.T1;
        if (aVar != null) {
            aVar.a(z10, z11);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.e0.I0.setVisibility(i10);
    }
}
