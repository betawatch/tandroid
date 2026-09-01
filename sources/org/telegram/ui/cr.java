package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class cr extends f2.j0 {
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cr(ViewGroup viewGroup, int i10) {
        super(0, false);
        this.I = i10;
        this.J = viewGroup;
    }

    @Override // f2.w0
    public void S(bf.f fVar, f2.j1 j1Var, s0.d dVar) {
        switch (this.I) {
            case 5:
                super.S(fVar, j1Var, dVar);
                if (((org.telegram.ui.Components.l81) this.J).S) {
                    dVar.p(false);
                    break;
                }
                break;
            case 6:
            default:
                super.S(fVar, j1Var, dVar);
                break;
            case 7:
                super.S(fVar, j1Var, dVar);
                if (!((uf.g0) this.J).isEnabled()) {
                    dVar.p(false);
                    break;
                }
                break;
        }
    }

    @Override // f2.j0
    public int W0(f2.j1 j1Var) {
        switch (this.I) {
            case 4:
                if (!((org.telegram.ui.Components.l21) this.J).X2) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(j1Var);
    }

    @Override // f2.j0
    public void k1(boolean z4) {
        switch (this.I) {
            case 2:
                super.k1(z4);
                ((org.telegram.ui.Components.ra0) this.J).b.setTranslationY(AndroidUtilities.dp(6.0f) * (z4 ? -1 : 1));
                break;
            default:
                super.k1(z4);
                break;
        }
    }

    @Override // f2.j0, f2.w0
    public int m0(int i10, bf.f fVar, f2.j1 j1Var) {
        switch (this.I) {
            case 1:
                org.telegram.ui.Components.q70 q70Var = ((pw) ((org.telegram.ui.Components.l00) this.J).G).b.I0;
                if (q70Var != null && q70Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, fVar, j1Var);
            case 2:
            default:
                return super.m0(i10, fVar, j1Var);
            case 3:
                org.telegram.ui.Components.rk0 rk0Var = (org.telegram.ui.Components.rk0) this.J;
                mh.d1 d1Var = rk0Var.b;
                if (i10 < 0 && rk0Var.y0 != 0.0f) {
                    float pullingLeftProgress = rk0Var.getPullingLeftProgress();
                    rk0Var.y0 += i10;
                    if ((pullingLeftProgress > 1.0f) != (rk0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            d1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f10 = rk0Var.y0;
                    if (f10 < 0.0f) {
                        i10 = (int) f10;
                        rk0Var.y0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    ag.l lVar = rk0Var.P;
                    if (lVar != null) {
                        lVar.invalidate();
                    }
                    d1Var.invalidate();
                }
                int m0 = super.m0(i10, fVar, j1Var);
                if (i10 > 0 && m0 == 0 && d1Var.getScrollState() == 1 && rk0Var.q()) {
                    ValueAnimator valueAnimator = rk0Var.v0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        rk0Var.v0.cancel();
                    }
                    float pullingLeftProgress2 = rk0Var.getPullingLeftProgress();
                    rk0Var.y0 = (i10 * (pullingLeftProgress2 > 1.0f ? 0.05f : 0.6f)) + rk0Var.y0;
                    if ((pullingLeftProgress2 > 1.0f) != (rk0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            d1Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    ag.l lVar2 = rk0Var.P;
                    if (lVar2 != null) {
                        lVar2.invalidate();
                    }
                    d1Var.invalidate();
                }
                return m0;
        }
    }

    @Override // f2.j0, f2.w0
    public int o0(int i10, bf.f fVar, f2.j1 j1Var) {
        switch (this.I) {
            case 0:
                qr qrVar = (qr) this.J;
                if (qrVar.O || qrVar.L != 0 || qrVar.C.size() != 0) {
                    break;
                }
                break;
        }
        return super.o0(i10, fVar, j1Var);
    }

    @Override // f2.j0, f2.w0
    public void v0(RecyclerView recyclerView, f2.j1 j1Var, int i10) {
        switch (this.I) {
            case 1:
                org.telegram.ui.Components.f00 f00Var = new org.telegram.ui.Components.f00(this, recyclerView.getContext());
                f00Var.a = i10;
                w0(f00Var);
                break;
            case 5:
                org.telegram.ui.Components.g81 g81Var = new org.telegram.ui.Components.g81(this, recyclerView.getContext());
                g81Var.a = i10;
                w0(g81Var);
                break;
            default:
                super.v0(recyclerView, j1Var, i10);
                break;
        }
    }

    @Override // f2.j0, f2.w0
    public boolean y0() {
        switch (this.I) {
            case 1:
                return true;
            case 2:
                return false;
            case 3:
            case 4:
            case 5:
            default:
                return super.y0();
            case 6:
                return false;
            case 7:
                return false;
        }
    }

    @Override // f2.j0
    public void z0(f2.j1 j1Var, int[] iArr) {
        switch (this.I) {
            case 6:
                iArr[1] = ((StickersActivity) this.J).a.getHeight();
                break;
            default:
                super.z0(j1Var, iArr);
                break;
        }
    }

    public /* synthetic */ cr(Object obj, int i10) {
        this.I = i10;
        this.J = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr(qr qrVar) {
        super(1, false);
        this.I = 0;
        this.J = qrVar;
    }
}
