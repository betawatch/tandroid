package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class c2 extends u0 {
    public final /* synthetic */ i9 i0;
    public final /* synthetic */ b4 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(b4 b4Var, Context context, i9 i9Var, x8 x8Var, View view, FrameLayout frameLayout, i9 i9Var2) {
        super(context, i9Var, x8Var, view, frameLayout);
        this.j0 = b4Var;
        this.i0 = i9Var2;
    }

    @Override // fi.u0
    public final TLRPC.Peer getDefaultSendAs() {
        e1 e1Var = this.i0.B0;
        if (e1Var != null) {
            return e1Var.i();
        }
        return null;
    }

    @Override // fi.u0
    public final void h(long j3) {
        o1 o1Var = this.j0.I1;
        if (o1Var == null) {
            return;
        }
        ArrayList arrayList = o1Var.h;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (((n1) arrayList.get(i7)).a == j3) {
                ((n1) arrayList.get(i7)).h = true;
            }
        }
    }

    @Override // fi.u0
    public final void i(int i7, int i10, long j3) {
        o1 o1Var = this.j0.I1;
        if (o1Var == null) {
            return;
        }
        int i11 = o1Var.a;
        ArrayList arrayList = o1Var.h;
        arrayList.add(new n1(o1Var, o1Var, i11, j3, i10, arrayList.size() < 5));
        o1Var.invalidate();
    }

    @Override // fi.u0
    public final void j() {
        b4 b4Var = this.j0;
        b4Var.J1.setCount((int) getStarsCount());
        b4Var.J1.setFilled(this.a0 != null);
    }

    @Override // fi.u0
    public final void q(boolean z10, boolean z11) {
        if (!z11 || this.g0 != z10) {
            this.g0 = z10;
            ValueAnimator valueAnimator = this.f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f0 = null;
            }
            di.c1 c1Var = this.c;
            c1Var.invalidate();
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(c1Var.getAlpha(), z10 ? 0.0f : 1.0f);
                this.f0 = ofFloat;
                ofFloat.addUpdateListener(new ah.h(this, 15));
                this.f0.addListener(new bi.v4(3, this, z10));
                this.f0.setDuration(420L);
                this.f0.setInterpolator(er.h);
                this.f0.start();
            } else {
                this.a.setAlpha(z10 ? 0.0f : 0.5f);
                c1Var.setAlpha(z10 ? 0.0f : 1.0f);
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
