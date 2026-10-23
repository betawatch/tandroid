package hg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.j31;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.m00;
import org.telegram.ui.Components.s00;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.dw;
import org.telegram.ui.jr;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
    public void S(qf.e eVar, s4.y0 y0Var, s0.d dVar) {
        switch (this.I) {
            case 0:
                super.S(eVar, y0Var, dVar);
                if (!((q0) this.J).isEnabled()) {
                    dVar.p(false);
                    break;
                }
                break;
            case 6:
                super.S(eVar, y0Var, dVar);
                if (((k91) this.J).V) {
                    dVar.p(false);
                    break;
                }
                break;
            default:
                super.S(eVar, y0Var, dVar);
                break;
        }
    }

    @Override // s4.b0
    public int W0(s4.y0 y0Var) {
        switch (this.I) {
            case 5:
                if (!((j31) this.J).b3) {
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
                ((jb0) this.J).b.setTranslationY(AndroidUtilities.dp(6.0f) * (z10 ? -1 : 1));
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
                j80 j80Var = ((dw) ((s00) this.J).J).b.L0;
                if (j80Var != null && j80Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, eVar, y0Var);
            case 3:
            default:
                return super.m0(i10, eVar, y0Var);
            case 4:
                gl0 gl0Var = (gl0) this.J;
                ai.u1 u1Var = gl0Var.b;
                if (i10 < 0 && gl0Var.B0 != 0.0f) {
                    float pullingLeftProgress = gl0Var.getPullingLeftProgress();
                    gl0Var.B0 += i10;
                    if ((pullingLeftProgress > 1.0f) != (gl0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            u1Var.performHapticFeedback(3);
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
                    u1Var.invalidate();
                }
                int m0 = super.m0(i10, eVar, y0Var);
                if (i10 > 0 && m0 == 0 && u1Var.getScrollState() == 1 && gl0Var.q()) {
                    ValueAnimator valueAnimator = gl0Var.y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        gl0Var.y0.cancel();
                    }
                    float pullingLeftProgress2 = gl0Var.getPullingLeftProgress();
                    gl0Var.B0 = (i10 * (pullingLeftProgress2 > 1.0f ? 0.05f : 0.6f)) + gl0Var.B0;
                    if ((pullingLeftProgress2 > 1.0f) != (gl0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            u1Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    ah.v vVar2 = gl0Var.S;
                    if (vVar2 != null) {
                        vVar2.invalidate();
                    }
                    u1Var.invalidate();
                }
                return m0;
        }
    }

    @Override // s4.b0, s4.n0
    public int o0(int i10, qf.e eVar, s4.y0 y0Var) {
        switch (this.I) {
            case 1:
                jr jrVar = (jr) this.J;
                if (jrVar.R || jrVar.O != 0 || jrVar.F.size() != 0) {
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
                m00 m00Var = new m00(this, recyclerView.getContext());
                m00Var.a = i10;
                w0(m00Var);
                break;
            case 6:
                f91 f91Var = new f91(this, recyclerView.getContext());
                f91Var.a = i10;
                w0(f91Var);
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
    public i0(jr jrVar) {
        super(1, false);
        this.I = 1;
        this.J = jrVar;
    }
}
