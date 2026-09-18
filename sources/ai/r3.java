package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class r3 extends o1 {
    public final /* synthetic */ jc h0;
    public final /* synthetic */ f6 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(f6 f6Var, Context context, jc jcVar, yb ybVar, View view, FrameLayout frameLayout, jc jcVar2) {
        super(context, jcVar, ybVar, view, frameLayout);
        this.i0 = f6Var;
        this.h0 = jcVar2;
    }

    @Override // ai.o1
    public final TLRPC.Peer getDefaultSendAs() {
        d2 d2Var = this.h0.A0;
        if (d2Var != null) {
            return d2Var.i();
        }
        return null;
    }

    @Override // ai.o1
    public final void h(long j3) {
        w2 w2Var = this.i0.Y1;
        if (w2Var == null) {
            return;
        }
        ArrayList arrayList = w2Var.h;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((v2) arrayList.get(i10)).a == j3) {
                ((v2) arrayList.get(i10)).h = true;
            }
        }
    }

    @Override // ai.o1
    public final void i(int i10, int i11, long j3) {
        w2 w2Var = this.i0.Y1;
        if (w2Var == null) {
            return;
        }
        int i12 = w2Var.a;
        ArrayList arrayList = w2Var.h;
        arrayList.add(new v2(w2Var, w2Var, i12, j3, i11, arrayList.size() < 5));
        w2Var.invalidate();
    }

    @Override // ai.o1
    public final void j() {
        f6 f6Var = this.i0;
        f6Var.Z1.setCount((int) getStarsCount());
        f6Var.Z1.setFilled(this.W != null);
    }

    @Override // ai.o1
    public final void q(boolean z10, boolean z11) {
        if (!z11 || this.f0 != z10) {
            this.f0 = z10;
            ValueAnimator valueAnimator = this.e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.e0 = null;
            }
            w0 w0Var = this.c;
            w0Var.invalidate();
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(w0Var.getAlpha(), z10 ? 0.0f : 1.0f);
                this.e0 = ofFloat;
                ofFloat.addUpdateListener(new a(this, 3));
                this.e0.addListener(new n(1, this, z10));
                this.e0.setDuration(420L);
                this.e0.setInterpolator(qr.h);
                this.e0.start();
            } else {
                this.a.setAlpha(z10 ? 0.0f : 0.5f);
                w0Var.setAlpha(z10 ? 0.0f : 1.0f);
            }
            invalidate();
        }
        c cVar = this.i0.X1;
        if (cVar != null) {
            cVar.a(z10, z11);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.i0.M0.setVisibility(i10);
    }
}
