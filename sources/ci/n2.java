package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class n2 extends x0 {
    public final /* synthetic */ aa h0;
    public final /* synthetic */ q4 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(q4 q4Var, Context context, aa aaVar, p9 p9Var, View view, FrameLayout frameLayout, aa aaVar2) {
        super(context, aaVar, p9Var, view, frameLayout);
        this.i0 = q4Var;
        this.h0 = aaVar2;
    }

    @Override // ci.x0
    public final TLRPC.Peer getDefaultSendAs() {
        h1 h1Var = this.h0.A0;
        if (h1Var != null) {
            return h1Var.i();
        }
        return null;
    }

    @Override // ci.x0
    public final void h(long j10) {
        x1 x1Var = this.i0.Y1;
        if (x1Var == null) {
            return;
        }
        ArrayList arrayList = x1Var.h;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((w1) arrayList.get(i10)).a == j10) {
                ((w1) arrayList.get(i10)).h = true;
            }
        }
    }

    @Override // ci.x0
    public final void i(int i10, int i11, long j10) {
        x1 x1Var = this.i0.Y1;
        if (x1Var == null) {
            return;
        }
        int i12 = x1Var.a;
        ArrayList arrayList = x1Var.h;
        arrayList.add(new w1(x1Var, x1Var, i12, j10, i11, arrayList.size() < 5));
        x1Var.invalidate();
    }

    @Override // ci.x0
    public final void j() {
        q4 q4Var = this.i0;
        q4Var.Z1.setCount((int) getStarsCount());
        q4Var.Z1.setFilled(this.W != null);
    }

    @Override // ci.x0
    public final void q(boolean z10, boolean z11) {
        if (!z11 || this.f0 != z10) {
            this.f0 = z10;
            ValueAnimator valueAnimator = this.e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.e0 = null;
            }
            ai.u1 u1Var = this.c;
            u1Var.invalidate();
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(u1Var.getAlpha(), z10 ? 0.0f : 1.0f);
                this.e0 = ofFloat;
                ofFloat.addUpdateListener(new ah.c0(this, 11));
                this.e0.addListener(new ah.p0(2, this, z10));
                this.e0.setDuration(420L);
                this.e0.setInterpolator(bs.h);
                this.e0.start();
            } else {
                this.a.setAlpha(z10 ? 0.0f : 0.5f);
                u1Var.setAlpha(z10 ? 0.0f : 1.0f);
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
