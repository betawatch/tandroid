package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class a2 extends t0 {
    public final /* synthetic */ f9 i0;
    public final /* synthetic */ z3 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(z3 z3Var, Context context, f9 f9Var, u8 u8Var, View view, FrameLayout frameLayout, f9 f9Var2) {
        super(context, f9Var, u8Var, view, frameLayout);
        this.j0 = z3Var;
        this.i0 = f9Var2;
    }

    @Override // fi.t0
    public final TLRPC.Peer getDefaultSendAs() {
        c1 c1Var = this.i0.B0;
        if (c1Var != null) {
            return c1Var.i();
        }
        return null;
    }

    @Override // fi.t0
    public final void h(long j3) {
        m1 m1Var = this.j0.I1;
        if (m1Var == null) {
            return;
        }
        ArrayList arrayList = m1Var.h;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (((l1) arrayList.get(i7)).a == j3) {
                ((l1) arrayList.get(i7)).h = true;
            }
        }
    }

    @Override // fi.t0
    public final void i(int i7, int i10, long j3) {
        m1 m1Var = this.j0.I1;
        if (m1Var == null) {
            return;
        }
        int i11 = m1Var.a;
        ArrayList arrayList = m1Var.h;
        arrayList.add(new l1(m1Var, m1Var, i11, j3, i10, arrayList.size() < 5));
        m1Var.invalidate();
    }

    @Override // fi.t0
    public final void j() {
        z3 z3Var = this.j0;
        z3Var.J1.setCount((int) getStarsCount());
        z3Var.J1.setFilled(this.a0 != null);
    }

    @Override // fi.t0
    public final void q(boolean z10, boolean z11) {
        if (!z11 || this.g0 != z10) {
            this.g0 = z10;
            ValueAnimator valueAnimator = this.f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f0 = null;
            }
            di.b1 b1Var = this.c;
            b1Var.invalidate();
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(b1Var.getAlpha(), z10 ? 0.0f : 1.0f);
                this.f0 = ofFloat;
                ofFloat.addUpdateListener(new ah.g(this, 15));
                this.f0.addListener(new bi.g7(3, this, z10));
                this.f0.setDuration(420L);
                this.f0.setInterpolator(nr.h);
                this.f0.start();
            } else {
                this.a.setAlpha(z10 ? 0.0f : 0.5f);
                b1Var.setAlpha(z10 ? 0.0f : 1.0f);
            }
            invalidate();
        }
        a aVar = this.j0.H1;
        if (aVar != null) {
            aVar.a(z10, z11);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        this.j0.w0.setVisibility(i7);
    }
}
