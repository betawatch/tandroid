package nh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class g2 extends v0 {
    public final /* synthetic */ i9 e0;
    public final /* synthetic */ d4 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(d4 d4Var, Context context, i9 i9Var, x8 x8Var, View view, FrameLayout frameLayout, i9 i9Var2) {
        super(context, i9Var, x8Var, view, frameLayout);
        this.f0 = d4Var;
        this.e0 = i9Var2;
    }

    @Override // nh.v0
    public final TLRPC.Peer getDefaultSendAs() {
        e1 e1Var = this.e0.x0;
        if (e1Var != null) {
            return e1Var.i();
        }
        return null;
    }

    @Override // nh.v0
    public final void h(long j10) {
        r1 r1Var = this.f0.V1;
        if (r1Var == null) {
            return;
        }
        ArrayList arrayList = r1Var.h;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((q1) arrayList.get(i10)).a == j10) {
                ((q1) arrayList.get(i10)).h = true;
            }
        }
    }

    @Override // nh.v0
    public final void i(int i10, int i11, long j10) {
        r1 r1Var = this.f0.V1;
        if (r1Var == null) {
            return;
        }
        int i12 = r1Var.a;
        ArrayList arrayList = r1Var.h;
        arrayList.add(new q1(r1Var, r1Var, i12, j10, i11, arrayList.size() < 5));
        r1Var.invalidate();
    }

    @Override // nh.v0
    public final void j() {
        d4 d4Var = this.f0;
        d4Var.W1.setCount((int) getStarsCount());
        d4Var.W1.setFilled(this.T != null);
    }

    @Override // nh.v0
    public final void q(boolean z4, boolean z10) {
        if (!z10 || this.c0 != z4) {
            this.c0 = z4;
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.b0 = null;
            }
            lh.e1 e1Var = this.c;
            e1Var.invalidate();
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(e1Var.getAlpha(), z4 ? 0.0f : 1.0f);
                this.b0 = ofFloat;
                ofFloat.addUpdateListener(new dg.o1(this, 22));
                this.b0.addListener(new dg.w2(5, this, z4));
                this.b0.setDuration(420L);
                this.b0.setInterpolator(nr.h);
                this.b0.start();
            } else {
                this.a.setAlpha(z4 ? 0.0f : 0.5f);
                e1Var.setAlpha(z4 ? 0.0f : 1.0f);
            }
            invalidate();
        }
        a aVar = this.f0.U1;
        if (aVar != null) {
            aVar.a(z4, z10);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f0.J0.setVisibility(i10);
    }
}
