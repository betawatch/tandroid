// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class l18 extends k76 {
    public final /* synthetic */ m8b i0;
    public final /* synthetic */ y28 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l18(y28 y28Var, Context context, m8b m8bVar, b8b b8bVar, View view, FrameLayout frameLayout, m8b m8bVar2) {
        super(context, m8bVar, b8bVar, view, frameLayout);
        this.j0 = y28Var;
        this.i0 = m8bVar2;
    }

    @Override // k76
    public final void g(long j) {
        vr7 vr7Var = this.j0.O1;
        if (vr7Var != null) {
            ArrayList arrayList = vr7Var.h;
            for (int i = 0; i < arrayList.size(); i++) {
                if (((ur7) arrayList.get(i)).a == j) {
                    ((ur7) arrayList.get(i)).h = true;
                }
            }
        }
    }

    @Override // k76
    public final TLRPC.Peer getDefaultSendAs() {
        t76 t76Var = this.i0.B0;
        if (t76Var != null) {
            return t76Var.l();
        }
        return null;
    }

    @Override // k76
    public final void h(int i, int i2, long j) {
        vr7 vr7Var = this.j0.O1;
        if (vr7Var == null) {
            return;
        }
        int i3 = vr7Var.a;
        ArrayList arrayList = vr7Var.h;
        arrayList.add(new ur7(vr7Var, vr7Var, i3, j, i2, arrayList.size() < 5));
        vr7Var.invalidate();
    }

    @Override // k76
    public final void i() {
        y28 y28Var = this.j0;
        y28Var.P1.setCount((int) getStarsCount());
        y28Var.P1.setFilled(this.a0 != null);
    }

    @Override // k76
    public final void p(boolean z, boolean z2) {
        if (!z2 || this.g0 != z) {
            this.g0 = z;
            ValueAnimator valueAnimator = this.f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f0 = null;
            }
            fu fuVar = this.c;
            fuVar.invalidate();
            if (z2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fuVar.getAlpha(), z ? 0.0f : 1.0f);
                this.f0 = ofFloat;
                ofFloat.addUpdateListener(new ni4(this, (byte) 19));
                this.f0.addListener(new id4((byte) 11, this, z));
                this.f0.setDuration(420L);
                this.f0.setInterpolator(s33.h);
                this.f0.start();
            } else {
                this.a.setAlpha(z ? 0.0f : 0.5f);
                fuVar.setAlpha(z ? 0.0f : 1.0f);
            }
            invalidate();
        }
        jm2 jm2Var = this.j0.N1;
        if (jm2Var != null) {
            jm2Var.a(z, z2);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.j0.C0.setVisibility(i);
    }
}
