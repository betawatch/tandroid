package jg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.rq;
import org.telegram.ui.sw;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class i0 extends v4.c0 {
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i7, Object obj, boolean z10) {
        super(1, false);
        this.I = i7;
        this.J = obj;
    }

    @Override // v4.p0
    public void S(v4.x0 x0Var, v4.c1 c1Var, s0.c cVar) {
        switch (this.I) {
            case 0:
                super.S(x0Var, c1Var, cVar);
                if (!((q0) this.J).isEnabled()) {
                    cVar.p(false);
                    break;
                }
                break;
            case 8:
                super.S(x0Var, c1Var, cVar);
                if (((j71) this.J).W) {
                    cVar.p(false);
                    break;
                }
                break;
            default:
                super.S(x0Var, c1Var, cVar);
                break;
        }
    }

    @Override // v4.c0
    public int W0(v4.c1 c1Var) {
        switch (this.I) {
            case 6:
                if (!((g51) this.J).i3) {
                    break;
                } else {
                    break;
                }
            case 7:
                if (!((m11) this.J).i3) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(c1Var);
    }

    @Override // v4.c0
    public void k1(boolean z10) {
        switch (this.I) {
            case 3:
                super.k1(z10);
                ((s90) this.J).b.setTranslationY(org.telegram.messenger.g0.L(6.0f) * (z10 ? -1 : 1));
                break;
            default:
                super.k1(z10);
                break;
        }
    }

    @Override // v4.c0, v4.p0
    public int m0(int i7, v4.x0 x0Var, v4.c1 c1Var) {
        switch (this.I) {
            case 2:
                x60 x60Var = ((sw) ((oz) this.J).K).b.M0;
                if (x60Var != null && x60Var.E()) {
                    i7 = 0;
                }
                return super.m0(i7, x0Var, c1Var);
            case 3:
            default:
                return super.m0(i7, x0Var, c1Var);
            case 4:
                xi0 xi0Var = (xi0) this.J;
                di.b1 b1Var = xi0Var.b;
                if (i7 < 0 && xi0Var.C0 != 0.0f) {
                    float pullingLeftProgress = xi0Var.getPullingLeftProgress();
                    xi0Var.C0 += i7;
                    if ((pullingLeftProgress > 1.0f) != (xi0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            b1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f10 = xi0Var.C0;
                    if (f10 < 0.0f) {
                        i7 = (int) f10;
                        xi0Var.C0 = 0.0f;
                    } else {
                        i7 = 0;
                    }
                    ai.h0 h0Var = xi0Var.T;
                    if (h0Var != null) {
                        h0Var.invalidate();
                    }
                    b1Var.invalidate();
                }
                int m0 = super.m0(i7, x0Var, c1Var);
                if (i7 > 0 && m0 == 0 && b1Var.getScrollState() == 1 && xi0Var.q()) {
                    ValueAnimator valueAnimator = xi0Var.z0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        xi0Var.z0.cancel();
                    }
                    float pullingLeftProgress2 = xi0Var.getPullingLeftProgress();
                    xi0Var.C0 = (i7 * (pullingLeftProgress2 > 1.0f ? 0.05f : 0.6f)) + xi0Var.C0;
                    if ((pullingLeftProgress2 > 1.0f) != (xi0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            b1Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    ai.h0 h0Var2 = xi0Var.T;
                    if (h0Var2 != null) {
                        h0Var2.invalidate();
                    }
                    b1Var.invalidate();
                }
                return m0;
        }
    }

    @Override // v4.c0, v4.p0
    public int o0(int i7, v4.x0 x0Var, v4.c1 c1Var) {
        switch (this.I) {
            case 1:
                rq rqVar = (rq) this.J;
                if (rqVar.R || rqVar.O != 0 || rqVar.F.size() != 0) {
                    break;
                }
                break;
            case 5:
                st0 st0Var = (st0) this.J;
                if (i7 > 0 && st0Var.O != null) {
                    int i10 = 0;
                    while (i10 < i7) {
                        int min = Math.min(i7 - i10, Math.max(1, Math.round((st0Var.getHeight() - st0Var.V) * 0.5f)));
                        float n10 = st0Var.n();
                        if (!Float.isInfinite(n10)) {
                            min = Math.min(min, Math.max(0, Math.round(n10 - st0Var.V)));
                        }
                        if (min == 0) {
                            break;
                        } else {
                            int o02 = super.o0(min, x0Var, c1Var);
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
        return super.o0(i7, x0Var, c1Var);
    }

    @Override // v4.c0, v4.p0
    public void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        switch (this.I) {
            case 2:
                iz izVar = new iz(this, recyclerView.getContext());
                izVar.a = i7;
                w0(izVar);
                break;
            case 8:
                e71 e71Var = new e71(this, recyclerView.getContext());
                e71Var.a = i7;
                w0(e71Var);
                break;
            default:
                super.v0(recyclerView, c1Var, i7);
                break;
        }
    }

    @Override // v4.c0, v4.p0
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

    @Override // v4.c0
    public void z0(v4.c1 c1Var, int[] iArr) {
        switch (this.I) {
            case 9:
                iArr[1] = ((StickersActivity) this.J).a.getHeight();
                break;
            default:
                super.z0(c1Var, iArr);
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
    public i0(g51 g51Var, int i7) {
        super(i7, false);
        this.I = 6;
        this.J = g51Var;
    }
}
