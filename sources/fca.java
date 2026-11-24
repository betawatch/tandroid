// default package

import android.graphics.Typeface;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fca extends gb {
    public final /* synthetic */ gca x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fca(gca gcaVar, gca gcaVar2) {
        super(gcaVar2);
        this.x = gcaVar;
    }

    @Override // gb
    public final boolean b() {
        tca tcaVar = this.x.w0;
        if (tcaVar.J || !tcaVar.T1) {
            return false;
        }
        return !tcaVar.n1.m();
    }

    @Override // gb
    public final void e(float f, float f2, boolean z) {
        gca gcaVar = this.x;
        tca tcaVar = gcaVar.w0;
        int i = tca.T2;
        for (int i2 = 0; i2 < tcaVar.b.getChildCount(); i2++) {
            View childAt = tcaVar.b.getChildAt(i2);
            if (childAt != tcaVar.q1 && childAt != tcaVar.v1 && childAt != tcaVar.N1[1] && childAt != tcaVar.x1 && childAt != tcaVar.m1 && childAt != tcaVar.X1 && childAt != tcaVar.p1) {
                childAt.setTranslationY(f);
            }
        }
        vba vbaVar = tcaVar.A1;
        tcaVar.o2 = f;
        int i3 = gcaVar.r0;
        if (i3 != -1) {
            if (!z) {
                f2 = 1.0f - f2;
            }
            float f3 = 1.0f - f2;
            tcaVar.k2 = (int) ((gcaVar.s0 * f2) + (i3 * f3));
            float f4 = ((i3 - r5) * f3) + f;
            vbaVar.setTranslationY(f4);
            if (z) {
                tcaVar.B1.setTranslationY(f4);
            } else {
                tcaVar.B1.setTranslationY(f4 + tcaVar.A1.getPaddingTop());
            }
        } else {
            int i4 = gcaVar.t0;
            if (i4 != -1) {
                float f5 = 1.0f - f2;
                tcaVar.k2 = (int) ((gcaVar.u0 * f2) + (i4 * f5));
                if (!z) {
                    f5 = f2;
                }
                if (z) {
                    vbaVar.setTranslationY(f - ((i4 - r5) * f2));
                } else {
                    vbaVar.setTranslationY(((r5 - i4) * f5) + f);
                }
            }
        }
        tcaVar.A1.setTopGlowOffset((int) (tcaVar.k2 + tcaVar.o2));
        tcaVar.l1.setTranslationY(tcaVar.k2 + tcaVar.o2);
        tcaVar.L1.setTranslationY(tcaVar.k2 + tcaVar.o2);
        tcaVar.m1.invalidate();
        tcaVar.F0 = tcaVar.o2;
        tcaVar.c.invalidate();
        tcaVar.T0();
        gcaVar.invalidate();
    }

    @Override // gb
    public final void f() {
        tca tcaVar = this.x.w0;
        zba zbaVar = tcaVar.n1;
        if (zbaVar == null || !zbaVar.m()) {
            Typeface typeface = gm.a;
        }
        tcaVar.m2 = false;
        int i = tcaVar.k2;
        tcaVar.l2 = i;
        tcaVar.A1.setTopGlowOffset(i);
        tcaVar.l1.setTranslationY(tcaVar.k2);
        tcaVar.L1.setTranslationY(tcaVar.k2);
        tcaVar.A1.setTranslationY(0.0f);
        tcaVar.B1.setTranslationY(0.0f);
        tcaVar.T0();
    }

    @Override // gb
    public final void g(int i, boolean z) {
        gca gcaVar = this.x;
        tca tcaVar = gcaVar.w0;
        int i2 = tcaVar.l2;
        int i3 = tcaVar.k2;
        if (i2 != i3) {
            gcaVar.r0 = i2;
            gcaVar.s0 = i3;
            tcaVar.m2 = true;
            tcaVar.k2 = i2;
            i3 = i2;
        } else {
            gcaVar.r0 = -1;
            i2 = -1;
        }
        int i4 = gcaVar.p0;
        int i5 = gcaVar.q0;
        if (i4 != i5) {
            gcaVar.t0 = 0;
            gcaVar.u0 = 0;
            tcaVar.m2 = true;
            int i6 = i4 - i5;
            if (z) {
                gcaVar.u0 = i6;
            } else {
                gcaVar.u0 = 0 - i6;
                i2 = gcaVar.s0;
            }
            tcaVar.k2 = i2;
            i3 = i2;
        } else {
            gcaVar.t0 = -1;
        }
        tcaVar.A1.setTopGlowOffset((int) (tcaVar.o2 + i3));
        tcaVar.l1.setTranslationY(tcaVar.o2 + tcaVar.k2);
        tcaVar.L1.setTranslationY(tcaVar.o2 + tcaVar.k2);
        gcaVar.invalidate();
    }
}
