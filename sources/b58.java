// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class b58 extends o96 {
    public final /* synthetic */ lcb i0;
    public final /* synthetic */ o68 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b58(o68 o68Var, Context context, lcb lcbVar, zbb zbbVar, View view, FrameLayout frameLayout, lcb lcbVar2) {
        super(context, lcbVar, zbbVar, view, frameLayout);
        this.j0 = o68Var;
        this.i0 = lcbVar2;
    }

    @Override // o96
    public final void g(long j) {
        bv7 bv7Var = this.j0.I1;
        if (bv7Var != null) {
            ArrayList arrayList = bv7Var.h;
            for (int i = 0; i < arrayList.size(); i++) {
                if (((av7) arrayList.get(i)).a == j) {
                    ((av7) arrayList.get(i)).h = true;
                }
            }
        }
    }

    @Override // o96
    public final TLRPC.Peer getDefaultSendAs() {
        w96 w96Var = this.i0.B0;
        if (w96Var != null) {
            return w96Var.l();
        }
        return null;
    }

    @Override // o96
    public final void h(int i, int i2, long j) {
        bv7 bv7Var = this.j0.I1;
        if (bv7Var == null) {
            return;
        }
        int i3 = bv7Var.a;
        ArrayList arrayList = bv7Var.h;
        arrayList.add(new av7(bv7Var, bv7Var, i3, j, i2, arrayList.size() < 5));
        bv7Var.invalidate();
    }

    @Override // o96
    public final void i() {
        o68 o68Var = this.j0;
        o68Var.J1.setCount((int) getStarsCount());
        o68Var.J1.setFilled(this.a0 != null);
    }

    @Override // o96
    public final void p(boolean z, boolean z2) {
        if (!z2 || this.g0 != z) {
            this.g0 = z;
            ValueAnimator valueAnimator = this.f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f0 = null;
            }
            gu guVar = this.c;
            guVar.invalidate();
            if (z2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(guVar.getAlpha(), z ? 0.0f : 1.0f);
                this.f0 = ofFloat;
                ofFloat.addUpdateListener(new ch4(this, (byte) 20));
                this.f0.addListener(new gf4((byte) 11, this, z));
                this.f0.setDuration(420L);
                this.f0.setInterpolator(k43.h);
                this.f0.start();
            } else {
                this.a.setAlpha(z ? 0.0f : 0.5f);
                guVar.setAlpha(z ? 0.0f : 1.0f);
            }
            invalidate();
        }
        dn2 dn2Var = this.j0.H1;
        if (dn2Var != null) {
            dn2Var.a(z, z2);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.j0.w0.setVisibility(i);
    }
}
