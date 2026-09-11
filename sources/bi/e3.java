package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class e3 extends g1 {
    public final /* synthetic */ pb h0;
    public final /* synthetic */ o5 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(o5 o5Var, Context context, pb pbVar, eb ebVar, View view, FrameLayout frameLayout, pb pbVar2) {
        super(context, pbVar, ebVar, view, frameLayout);
        this.i0 = o5Var;
        this.h0 = pbVar2;
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
    public final void h(long j3) {
        k2 k2Var = this.i0.Y1;
        if (k2Var == null) {
            return;
        }
        ArrayList arrayList = k2Var.h;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((j2) arrayList.get(i10)).a == j3) {
                ((j2) arrayList.get(i10)).h = true;
            }
        }
    }

    @Override // bi.g1
    public final void i(int i10, int i11, long j3) {
        k2 k2Var = this.i0.Y1;
        if (k2Var == null) {
            return;
        }
        int i12 = k2Var.a;
        ArrayList arrayList = k2Var.h;
        arrayList.add(new j2(k2Var, k2Var, i12, j3, i11, arrayList.size() < 5));
        k2Var.invalidate();
    }

    @Override // bi.g1
    public final void j() {
        o5 o5Var = this.i0;
        o5Var.Z1.setCount((int) getStarsCount());
        o5Var.Z1.setFilled(this.W != null);
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
                ofFloat.addUpdateListener(new ah.d0(this, 4));
                this.e0.addListener(new ah.q0(2, this, z10));
                this.e0.setDuration(420L);
                this.e0.setInterpolator(pr.h);
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
