package hg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.j91;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.w00;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.xw;
import org.telegram.ui.yr;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class i0 extends s4.b0 {
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(ViewGroup viewGroup, int i10) {
        super(0, false);
        this.I = i10;
        this.J = viewGroup;
    }

    @Override // s4.n0
    public void S(qf.e eVar, s4.y0 y0Var, s0.c cVar) {
        switch (this.I) {
            case 0:
                super.S(eVar, y0Var, cVar);
                if (!((r0) this.J).isEnabled()) {
                    cVar.p(false);
                    break;
                }
                break;
            case 6:
                super.S(eVar, y0Var, cVar);
                if (((j91) this.J).V) {
                    cVar.p(false);
                    break;
                }
                break;
            default:
                super.S(eVar, y0Var, cVar);
                break;
        }
    }

    @Override // s4.b0
    public int W0(s4.y0 y0Var) {
        switch (this.I) {
            case 5:
                if (!((m31) this.J).Y2) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(y0Var);
    }

    @Override // s4.b0
    public void k1(boolean z10) {
        switch (this.I) {
            case 3:
                super.k1(z10);
                ((ob0) this.J).b.setTranslationY(AndroidUtilities.dp(6.0f) * (z10 ? -1 : 1));
                break;
            default:
                super.k1(z10);
                break;
        }
    }

    @Override // s4.b0, s4.n0
    public int m0(int i10, qf.e eVar, s4.y0 y0Var) {
        switch (this.I) {
            case 2:
                m80 m80Var = ((xw) ((w00) this.J).J).b.L0;
                if (m80Var != null && m80Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, eVar, y0Var);
            case 3:
            default:
                return super.m0(i10, eVar, y0Var);
            case 4:
                gl0 gl0Var = (gl0) this.J;
                bi.o0 o0Var = gl0Var.b;
                if (i10 < 0 && gl0Var.B0 != 0.0f) {
                    float pullingLeftProgress = gl0Var.getPullingLeftProgress();
                    gl0Var.B0 += i10;
                    if ((pullingLeftProgress > 1.0f) != (gl0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            o0Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f7 = gl0Var.B0;
                    if (f7 < 0.0f) {
                        i10 = (int) f7;
                        gl0Var.B0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    ah.v vVar = gl0Var.S;
                    if (vVar != null) {
                        vVar.invalidate();
                    }
                    o0Var.invalidate();
                }
                int m0 = super.m0(i10, eVar, y0Var);
                if (i10 > 0 && m0 == 0 && o0Var.getScrollState() == 1 && gl0Var.q()) {
                    ValueAnimator valueAnimator = gl0Var.y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        gl0Var.y0.cancel();
                    }
                    float pullingLeftProgress2 = gl0Var.getPullingLeftProgress();
                    gl0Var.B0 = (i10 * (pullingLeftProgress2 > 1.0f ? 0.05f : 0.6f)) + gl0Var.B0;
                    if ((pullingLeftProgress2 > 1.0f) != (gl0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            o0Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    ah.v vVar2 = gl0Var.S;
                    if (vVar2 != null) {
                        vVar2.invalidate();
                    }
                    o0Var.invalidate();
                }
                return m0;
        }
    }

    @Override // s4.b0, s4.n0
    public int o0(int i10, qf.e eVar, s4.y0 y0Var) {
        switch (this.I) {
            case 1:
                yr yrVar = (yr) this.J;
                if (yrVar.R || yrVar.O != 0 || yrVar.F.size() != 0) {
                    break;
                }
                break;
        }
        return super.o0(i10, eVar, y0Var);
    }

    @Override // s4.b0, s4.n0
    public void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        switch (this.I) {
            case 2:
                p00 p00Var = new p00(this, recyclerView.getContext());
                p00Var.a = i10;
                w0(p00Var);
                break;
            case 6:
                e91 e91Var = new e91(this, recyclerView.getContext());
                e91Var.a = i10;
                w0(e91Var);
                break;
            default:
                super.v0(recyclerView, y0Var, i10);
                break;
        }
    }

    @Override // s4.b0, s4.n0
    public boolean y0() {
        switch (this.I) {
            case 0:
                return false;
            case 2:
                return true;
            case 3:
                return false;
            case 7:
                return false;
            default:
                return super.y0();
        }
    }

    @Override // s4.b0
    public void z0(s4.y0 y0Var, int[] iArr) {
        switch (this.I) {
            case 7:
                iArr[1] = ((StickersActivity) this.J).a.getHeight();
                break;
            default:
                super.z0(y0Var, iArr);
                break;
        }
    }

    public /* synthetic */ i0(Object obj, int i10) {
        this.I = i10;
        this.J = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(yr yrVar) {
        super(1, false);
        this.I = 1;
        this.J = yrVar;
    }
}
