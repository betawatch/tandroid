package ih;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class h2 extends w0 {
    public final /* synthetic */ m9 d0;
    public final /* synthetic */ i4 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(i4 i4Var, Context context, m9 m9Var, b9 b9Var, View view, FrameLayout frameLayout, m9 m9Var2) {
        super(context, m9Var, b9Var, view, frameLayout);
        this.e0 = i4Var;
        this.d0 = m9Var2;
    }

    @Override // ih.w0
    public final TLRPC.Peer getDefaultSendAs() {
        f1 f1Var = this.d0.w0;
        if (f1Var != null) {
            return f1Var.i();
        }
        return null;
    }

    @Override // ih.w0
    public final void h(long j10) {
        s1 s1Var = this.e0.U1;
        if (s1Var == null) {
            return;
        }
        ArrayList arrayList = s1Var.h;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (((r1) arrayList.get(i9)).a == j10) {
                ((r1) arrayList.get(i9)).h = true;
            }
        }
    }

    @Override // ih.w0
    public final void i(int i9, int i10, long j10) {
        s1 s1Var = this.e0.U1;
        if (s1Var == null) {
            return;
        }
        int i11 = s1Var.a;
        ArrayList arrayList = s1Var.h;
        arrayList.add(new r1(s1Var, s1Var, i11, j10, i10, arrayList.size() < 5));
        s1Var.invalidate();
    }

    @Override // ih.w0
    public final void j() {
        i4 i4Var = this.e0;
        i4Var.V1.setCount((int) getStarsCount());
        i4Var.V1.setFilled(this.S != null);
    }

    @Override // ih.w0
    public final void q(boolean z10, boolean z11) {
        if (!z11 || this.b0 != z10) {
            this.b0 = z10;
            ValueAnimator valueAnimator = this.a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.a0 = null;
            }
            gh.f1 f1Var = this.c;
            f1Var.invalidate();
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f1Var.getAlpha(), z10 ? 0.0f : 1.0f);
                this.a0 = ofFloat;
                ofFloat.addUpdateListener(new bg.b(this, 13));
                this.a0.addListener(new hg.b0(2, this, z10));
                this.a0.setDuration(420L);
                this.a0.setInterpolator(gr.h);
                this.a0.start();
            } else {
                this.a.setAlpha(z10 ? 0.0f : 0.5f);
                f1Var.setAlpha(z10 ? 0.0f : 1.0f);
            }
            invalidate();
        }
        a aVar = this.e0.T1;
        if (aVar != null) {
            aVar.a(z10, z11);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i9) {
        super.setVisibility(i9);
        this.e0.I0.setVisibility(i9);
    }
}
