package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class s3 extends o1 {
    public final /* synthetic */ kc h0;
    public final /* synthetic */ f6 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(f6 f6Var, Context context, kc kcVar, zb zbVar, View view, FrameLayout frameLayout, kc kcVar2) {
        super(context, kcVar, zbVar, view, frameLayout);
        this.i0 = f6Var;
        this.h0 = kcVar2;
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
        x2 x2Var = this.i0.Y1;
        if (x2Var == null) {
            return;
        }
        ArrayList arrayList = x2Var.h;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((w2) arrayList.get(i10)).a == j3) {
                ((w2) arrayList.get(i10)).h = true;
            }
        }
    }

    @Override // ai.o1
    public final void i(int i10, int i11, long j3) {
        x2 x2Var = this.i0.Y1;
        if (x2Var == null) {
            return;
        }
        int i12 = x2Var.a;
        ArrayList arrayList = x2Var.h;
        arrayList.add(new w2(x2Var, x2Var, i12, j3, i11, arrayList.size() < 5));
        x2Var.invalidate();
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
                this.e0.setInterpolator(hs.h);
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
