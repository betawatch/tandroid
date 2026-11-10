package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g2 extends u0 {
    public final /* synthetic */ q9 h0;
    public final /* synthetic */ j4 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(j4 j4Var, Context context, q9 q9Var, f9 f9Var, View view, FrameLayout frameLayout, q9 q9Var2) {
        super(context, q9Var, f9Var, view, frameLayout);
        this.i0 = j4Var;
        this.h0 = q9Var2;
    }

    @Override // di.u0
    public final TLRPC.Peer getDefaultSendAs() {
        g1 g1Var = this.h0.A0;
        if (g1Var != null) {
            return g1Var.i();
        }
        return null;
    }

    @Override // di.u0
    public final void h(long j3) {
        q1 q1Var = this.i0.H1;
        if (q1Var == null) {
            return;
        }
        ArrayList arrayList = q1Var.h;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (((p1) arrayList.get(i7)).a == j3) {
                ((p1) arrayList.get(i7)).h = true;
            }
        }
    }

    @Override // di.u0
    public final void i(int i7, int i10, long j3) {
        q1 q1Var = this.i0.H1;
        if (q1Var == null) {
            return;
        }
        int i11 = q1Var.a;
        ArrayList arrayList = q1Var.h;
        arrayList.add(new p1(q1Var, q1Var, i11, j3, i10, arrayList.size() < 5));
        q1Var.invalidate();
    }

    @Override // di.u0
    public final void j() {
        j4 j4Var = this.i0;
        j4Var.I1.setCount((int) getStarsCount());
        j4Var.I1.setFilled(this.W != null);
    }

    @Override // di.u0
    public final void q(boolean z9, boolean z10) {
        if (!z10 || this.f0 != z9) {
            this.f0 = z9;
            ValueAnimator valueAnimator = this.e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.e0 = null;
            }
            bi.q1 q1Var = this.c;
            q1Var.invalidate();
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(q1Var.getAlpha(), z9 ? 0.0f : 1.0f);
                this.e0 = ofFloat;
                ofFloat.addUpdateListener(new ah.h(this, 14));
                this.e0.addListener(new ch.y(2, this, z9));
                this.e0.setDuration(420L);
                this.e0.setInterpolator(wq.h);
                this.e0.start();
            } else {
                this.a.setAlpha(z9 ? 0.0f : 0.5f);
                q1Var.setAlpha(z9 ? 0.0f : 1.0f);
            }
            invalidate();
        }
        a aVar = this.i0.G1;
        if (aVar != null) {
            aVar.a(z9, z10);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        this.i0.v0.setVisibility(i7);
    }
}
