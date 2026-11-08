package jg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bi.x5;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.z01;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.nw;
import org.telegram.ui.oq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class i0 extends v4.b0 {
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i7, Object obj, boolean z9) {
        super(1, false);
        this.I = i7;
        this.J = obj;
    }

    @Override // v4.n0
    public void S(v4.v0 v0Var, v4.a1 a1Var, s0.d dVar) {
        switch (this.I) {
            case 0:
                super.S(v0Var, a1Var, dVar);
                if (!((q0) this.J).isEnabled()) {
                    dVar.p(false);
                    break;
                }
                break;
            case 8:
                super.S(v0Var, a1Var, dVar);
                if (((u61) this.J).V) {
                    dVar.p(false);
                    break;
                }
                break;
            default:
                super.S(v0Var, a1Var, dVar);
                break;
        }
    }

    @Override // v4.b0
    public int W0(v4.a1 a1Var) {
        switch (this.I) {
            case 6:
                if (!((q41) this.J).h3) {
                    break;
                } else {
                    break;
                }
            case 7:
                if (!((z01) this.J).h3) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(a1Var);
    }

    @Override // v4.b0
    public void k1(boolean z9) {
        switch (this.I) {
            case 3:
                super.k1(z9);
                ((g90) this.J).b.setTranslationY(org.telegram.messenger.g0.L(6.0f) * (z9 ? -1 : 1));
                break;
            default:
                super.k1(z9);
                break;
        }
    }

    @Override // v4.b0, v4.n0
    public int m0(int i7, v4.v0 v0Var, v4.a1 a1Var) {
        switch (this.I) {
            case 2:
                k60 k60Var = ((nw) ((fz) this.J).J).b.L0;
                if (k60Var != null && k60Var.D()) {
                    i7 = 0;
                }
                return super.m0(i7, v0Var, a1Var);
            case 3:
            default:
                return super.m0(i7, v0Var, a1Var);
            case 4:
                ii0 ii0Var = (ii0) this.J;
                bi.q1 q1Var = ii0Var.b;
                if (i7 < 0 && ii0Var.B0 != 0.0f) {
                    float pullingLeftProgress = ii0Var.getPullingLeftProgress();
                    ii0Var.B0 += i7;
                    if ((pullingLeftProgress > 1.0f) != (ii0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            q1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f10 = ii0Var.B0;
                    if (f10 < 0.0f) {
                        i7 = (int) f10;
                        ii0Var.B0 = 0.0f;
                    } else {
                        i7 = 0;
                    }
                    x5 x5Var = ii0Var.S;
                    if (x5Var != null) {
                        x5Var.invalidate();
                    }
                    q1Var.invalidate();
                }
                int m0 = super.m0(i7, v0Var, a1Var);
                if (i7 > 0 && m0 == 0 && q1Var.getScrollState() == 1 && ii0Var.q()) {
                    ValueAnimator valueAnimator = ii0Var.y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ii0Var.y0.cancel();
                    }
                    float pullingLeftProgress2 = ii0Var.getPullingLeftProgress();
                    ii0Var.B0 = (i7 * (pullingLeftProgress2 > 1.0f ? 0.05f : 0.6f)) + ii0Var.B0;
                    if ((pullingLeftProgress2 > 1.0f) != (ii0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            q1Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    x5 x5Var2 = ii0Var.S;
                    if (x5Var2 != null) {
                        x5Var2.invalidate();
                    }
                    q1Var.invalidate();
                }
                return m0;
        }
    }

    @Override // v4.b0, v4.n0
    public int o0(int i7, v4.v0 v0Var, v4.a1 a1Var) {
        switch (this.I) {
            case 1:
                oq oqVar = (oq) this.J;
                if (oqVar.Q || oqVar.N != 0 || oqVar.E.size() != 0) {
                    break;
                }
                break;
            case 5:
                ht0 ht0Var = (ht0) this.J;
                if (i7 > 0 && ht0Var.N != null) {
                    int i10 = 0;
                    while (i10 < i7) {
                        int min = Math.min(i7 - i10, Math.max(1, Math.round((ht0Var.getHeight() - ht0Var.U) * 0.5f)));
                        float n10 = ht0Var.n();
                        if (!Float.isInfinite(n10)) {
                            min = Math.min(min, Math.max(0, Math.round(n10 - ht0Var.U)));
                        }
                        if (min == 0) {
                            break;
                        } else {
                            int o02 = super.o0(min, v0Var, a1Var);
                            i10 += o02;
                            if (o02 < min) {
                                break;
                            }
                        }
                    }
                    break;
                } else {
                    break;
                }
                break;
        }
        return super.o0(i7, v0Var, a1Var);
    }

    @Override // v4.b0, v4.n0
    public void v0(RecyclerView recyclerView, v4.a1 a1Var, int i7) {
        switch (this.I) {
            case 2:
                az azVar = new az(this, recyclerView.getContext());
                azVar.a = i7;
                w0(azVar);
                break;
            case 8:
                p61 p61Var = new p61(this, recyclerView.getContext());
                p61Var.a = i7;
                w0(p61Var);
                break;
            default:
                super.v0(recyclerView, a1Var, i7);
                break;
        }
    }

    @Override // v4.b0, v4.n0
    public boolean y0() {
        switch (this.I) {
            case 0:
                return false;
            case 2:
                return true;
            case 3:
                return false;
            case 9:
                return false;
            default:
                return super.y0();
        }
    }

    @Override // v4.b0
    public void z0(v4.a1 a1Var, int[] iArr) {
        switch (this.I) {
            case 9:
                iArr[1] = ((StickersActivity) this.J).a.getHeight();
                break;
            default:
                super.z0(a1Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(ViewGroup viewGroup, int i7) {
        super(0, false);
        this.I = i7;
        this.J = viewGroup;
    }

    public /* synthetic */ i0(Object obj, int i7) {
        this.I = i7;
        this.J = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(q41 q41Var, int i7) {
        super(i7, false);
        this.I = 6;
        this.J = q41Var;
    }
}
