package oh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class h2 extends v0 {
    public final /* synthetic */ i9 e0;
    public final /* synthetic */ f4 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(f4 f4Var, Context context, i9 i9Var, x8 x8Var, View view, FrameLayout frameLayout, i9 i9Var2) {
        super(context, i9Var, x8Var, view, frameLayout);
        this.f0 = f4Var;
        this.e0 = i9Var2;
    }

    @Override // oh.v0
    public final TLRPC.Peer getDefaultSendAs() {
        e1 e1Var = this.e0.x0;
        if (e1Var != null) {
            return e1Var.i();
        }
        return null;
    }

    @Override // oh.v0
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

    @Override // oh.v0
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

    @Override // oh.v0
    public final void j() {
        f4 f4Var = this.f0;
        f4Var.W1.setCount((int) getStarsCount());
        f4Var.W1.setFilled(this.T != null);
    }

    @Override // oh.v0
    public final void q(boolean z4, boolean z10) {
        if (!z10 || this.c0 != z4) {
            this.c0 = z4;
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.b0 = null;
            }
            mh.d1 d1Var = this.c;
            d1Var.invalidate();
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(d1Var.getAlpha(), z4 ? 0.0f : 1.0f);
                this.b0 = ofFloat;
                ofFloat.addUpdateListener(new eg.m1(this, 22));
                this.b0.addListener(new eg.u2(5, this, z4));
                this.b0.setDuration(420L);
                this.b0.setInterpolator(pr.h);
                this.b0.start();
            } else {
                this.a.setAlpha(z4 ? 0.0f : 0.5f);
                d1Var.setAlpha(z4 ? 0.0f : 1.0f);
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
