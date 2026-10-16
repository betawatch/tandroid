package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.es;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class h3 extends g1 {
    public final /* synthetic */ sb h0;
    public final /* synthetic */ q5 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(q5 q5Var, Context context, sb sbVar, hb hbVar, View view, FrameLayout frameLayout, sb sbVar2) {
        super(context, sbVar, hbVar, view, frameLayout);
        this.i0 = q5Var;
        this.h0 = sbVar2;
    }

    @Override // bi.g1
    public final TLRPC.Peer getDefaultSendAs() {
        t1 t1Var = this.h0.A0;
        if (t1Var != null) {
            return t1Var.i();
        }
        return null;
    }

    @Override // bi.g1
    public final void h(long j10) {
        l2 l2Var = this.i0.Y1;
        if (l2Var == null) {
            return;
        }
        ArrayList arrayList = l2Var.h;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((k2) arrayList.get(i10)).a == j10) {
                ((k2) arrayList.get(i10)).h = true;
            }
        }
    }

    @Override // bi.g1
    public final void i(int i10, int i11, long j10) {
        l2 l2Var = this.i0.Y1;
        if (l2Var == null) {
            return;
        }
        int i12 = l2Var.a;
        ArrayList arrayList = l2Var.h;
        arrayList.add(new k2(l2Var, l2Var, i12, j10, i11, arrayList.size() < 5));
        l2Var.invalidate();
    }

    @Override // bi.g1
    public final void j() {
        q5 q5Var = this.i0;
        q5Var.Z1.setCount((int) getStarsCount());
        q5Var.Z1.setFilled(this.W != null);
    }

    @Override // bi.g1
    public final void q(boolean z10, boolean z11) {
        if (!z11 || this.f0 != z10) {
            this.f0 = z10;
            ValueAnimator valueAnimator = this.e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.e0 = null;
            }
            o0 o0Var = this.c;
            o0Var.invalidate();
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(o0Var.getAlpha(), z10 ? 0.0f : 1.0f);
                this.e0 = ofFloat;
                ofFloat.addUpdateListener(new ah.c0(this, 4));
                this.e0.addListener(new ah.p0(2, this, z10));
                this.e0.setDuration(420L);
                this.e0.setInterpolator(es.h);
                this.e0.start();
            } else {
                this.a.setAlpha(z10 ? 0.0f : 0.5f);
                o0Var.setAlpha(z10 ? 0.0f : 1.0f);
            }
            invalidate();
        }
        a aVar = this.i0.X1;
        if (aVar != null) {
            aVar.a(z10, z11);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.i0.M0.setVisibility(i10);
    }
}
