// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class n38 extends k96 {
    public final /* synthetic */ oab i0;
    public final /* synthetic */ a58 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n38(a58 a58Var, Context context, oab oabVar, dab dabVar, View view, FrameLayout frameLayout, oab oabVar2) {
        super(context, oabVar, dabVar, view, frameLayout);
        this.j0 = a58Var;
        this.i0 = oabVar2;
    }

    @Override // k96
    public final void g(long j) {
        wt7 wt7Var = this.j0.O1;
        if (wt7Var != null) {
            ArrayList arrayList = wt7Var.h;
            for (int i = 0; i < arrayList.size(); i++) {
                if (((vt7) arrayList.get(i)).a == j) {
                    ((vt7) arrayList.get(i)).h = true;
                }
            }
        }
    }

    @Override // k96
    public final TLRPC.Peer getDefaultSendAs() {
        s96 s96Var = this.i0.B0;
        if (s96Var != null) {
            return s96Var.l();
        }
        return null;
    }

    @Override // k96
    public final void h(int i, int i2, long j) {
        wt7 wt7Var = this.j0.O1;
        if (wt7Var == null) {
            return;
        }
        int i3 = wt7Var.a;
        ArrayList arrayList = wt7Var.h;
        arrayList.add(new vt7(wt7Var, wt7Var, i3, j, i2, arrayList.size() < 5));
        wt7Var.invalidate();
    }

    @Override // k96
    public final void i() {
        a58 a58Var = this.j0;
        a58Var.P1.setCount((int) getStarsCount());
        a58Var.P1.setFilled(this.a0 != null);
    }

    @Override // k96
    public final void p(boolean z, boolean z2) {
        if (!z2 || this.g0 != z) {
            this.g0 = z;
            ValueAnimator valueAnimator = this.f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f0 = null;
            }
            fv fvVar = this.c;
            fvVar.invalidate();
            if (z2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fvVar.getAlpha(), z ? 0.0f : 1.0f);
                this.f0 = ofFloat;
                ofFloat.addUpdateListener(new fh4(this, (byte) 21));
                this.f0.addListener(new jf4((byte) 11, this, z));
                this.f0.setDuration(420L);
                this.f0.setInterpolator(d53.h);
                this.f0.start();
            } else {
                this.a.setAlpha(z ? 0.0f : 0.5f);
                fvVar.setAlpha(z ? 0.0f : 1.0f);
            }
            invalidate();
        }
        vn2 vn2Var = this.j0.N1;
        if (vn2Var != null) {
            vn2Var.a(z, z2);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.j0.C0.setVisibility(i);
    }
}
