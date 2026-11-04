package ei;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k2 extends w0 {
    public final /* synthetic */ r9 i0;
    public final /* synthetic */ j4 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(j4 j4Var, Context context, r9 r9Var, f9 f9Var, View view, FrameLayout frameLayout, r9 r9Var2) {
        super(context, r9Var, f9Var, view, frameLayout);
        this.j0 = j4Var;
        this.i0 = r9Var2;
    }

    @Override // ei.w0
    public final TLRPC.Peer getDefaultSendAs() {
        g1 g1Var = this.i0.B0;
        if (g1Var != null) {
            return g1Var.i();
        }
        return null;
    }

    @Override // ei.w0
    public final void h(long j10) {
        v1 v1Var = this.j0.I1;
        if (v1Var == null) {
            return;
        }
        ArrayList arrayList = v1Var.h;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (((u1) arrayList.get(i3)).a == j10) {
                ((u1) arrayList.get(i3)).h = true;
            }
        }
    }

    @Override // ei.w0
    public final void i(int i3, int i10, long j10) {
        v1 v1Var = this.j0.I1;
        if (v1Var == null) {
            return;
        }
        int i11 = v1Var.a;
        ArrayList arrayList = v1Var.h;
        arrayList.add(new u1(v1Var, v1Var, i11, j10, i10, arrayList.size() < 5));
        v1Var.invalidate();
    }

    @Override // ei.w0
    public final void j() {
        j4 j4Var = this.j0;
        j4Var.J1.setCount((int) getStarsCount());
        j4Var.J1.setFilled(this.a0 != null);
    }

    @Override // ei.w0
    public final void q(boolean z10, boolean z11) {
        if (!z11 || this.g0 != z10) {
            this.g0 = z10;
            ValueAnimator valueAnimator = this.f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f0 = null;
            }
            ci.j1 j1Var = this.c;
            j1Var.invalidate();
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(j1Var.getAlpha(), z10 ? 0.0f : 1.0f);
                this.f0 = ofFloat;
                ofFloat.addUpdateListener(new bh.f(this, 14));
                this.f0.addListener(new dh.x(2, this, z10));
                this.f0.setDuration(420L);
                this.f0.setInterpolator(xq.h);
                this.f0.start();
            } else {
                this.a.setAlpha(z10 ? 0.0f : 0.5f);
                j1Var.setAlpha(z10 ? 0.0f : 1.0f);
            }
            invalidate();
        }
        a aVar = this.j0.H1;
        if (aVar != null) {
            aVar.a(z10, z11);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i3) {
        super.setVisibility(i3);
        this.j0.w0.setVisibility(i3);
    }
}
