package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class m2 extends x0 {
    public final /* synthetic */ y9 h0;
    public final /* synthetic */ q4 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(q4 q4Var, Context context, y9 y9Var, n9 n9Var, View view, FrameLayout frameLayout, y9 y9Var2) {
        super(context, y9Var, n9Var, view, frameLayout);
        this.i0 = q4Var;
        this.h0 = y9Var2;
    }

    @Override // di.x0
    public final TLRPC.Peer getDefaultSendAs() {
        h1 h1Var = this.h0.A0;
        if (h1Var != null) {
            return h1Var.i();
        }
        return null;
    }

    @Override // di.x0
    public final void h(long j10) {
        w1 w1Var = this.i0.N1;
        if (w1Var == null) {
            return;
        }
        ArrayList arrayList = w1Var.h;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((v1) arrayList.get(i10)).a == j10) {
                ((v1) arrayList.get(i10)).h = true;
            }
        }
    }

    @Override // di.x0
    public final void i(int i10, int i11, long j10) {
        w1 w1Var = this.i0.N1;
        if (w1Var == null) {
            return;
        }
        int i12 = w1Var.a;
        ArrayList arrayList = w1Var.h;
        arrayList.add(new v1(w1Var, w1Var, i12, j10, i11, arrayList.size() < 5));
        w1Var.invalidate();
    }

    @Override // di.x0
    public final void j() {
        q4 q4Var = this.i0;
        q4Var.O1.setCount((int) getStarsCount());
        q4Var.O1.setFilled(this.W != null);
    }

    @Override // di.x0
    public final void q(boolean z10, boolean z11) {
        if (!z11 || this.f0 != z10) {
            this.f0 = z10;
            ValueAnimator valueAnimator = this.e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.e0 = null;
            }
            bi.r1 r1Var = this.c;
            r1Var.invalidate();
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(r1Var.getAlpha(), z10 ? 0.0f : 1.0f);
                this.e0 = ofFloat;
                ofFloat.addUpdateListener(new ai.g0(this, 13));
                this.e0.addListener(new bh.f0(2, this, z10));
                this.e0.setDuration(420L);
                this.e0.setInterpolator(ds.h);
                this.e0.start();
            } else {
                this.a.setAlpha(z10 ? 0.0f : 0.5f);
                r1Var.setAlpha(z10 ? 0.0f : 1.0f);
            }
            invalidate();
        }
        a aVar = this.i0.M1;
        if (aVar != null) {
            aVar.a(z10, z11);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.i0.B0.setVisibility(i10);
    }
}
