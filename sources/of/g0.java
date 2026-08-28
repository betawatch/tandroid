package of;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.o11;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.x60;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.dw;
import org.telegram.ui.jr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g0 extends f2.m0 {
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(ViewGroup viewGroup, int i9) {
        super(0, false);
        this.I = i9;
        this.J = viewGroup;
    }

    @Override // f2.z0
    public void S(f2.g1 g1Var, f2.n1 n1Var, s0.d dVar) {
        switch (this.I) {
            case 0:
                super.S(g1Var, n1Var, dVar);
                if (!((o0) this.J).isEnabled()) {
                    dVar.p(false);
                    break;
                }
                break;
            case 6:
                super.S(g1Var, n1Var, dVar);
                if (((m71) this.J).R) {
                    dVar.p(false);
                    break;
                }
                break;
            default:
                super.S(g1Var, n1Var, dVar);
                break;
        }
    }

    @Override // f2.m0
    public int W0(f2.n1 n1Var) {
        switch (this.I) {
            case 5:
                if (!((o11) this.J).W2) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(n1Var);
    }

    @Override // f2.m0
    public void k1(boolean z10) {
        switch (this.I) {
            case 3:
                super.k1(z10);
                ((w90) this.J).b.setTranslationY(AndroidUtilities.dp(6.0f) * (z10 ? -1 : 1));
                break;
            default:
                super.k1(z10);
                break;
        }
    }

    @Override // f2.m0, f2.z0
    public int m0(int i9, f2.g1 g1Var, f2.n1 n1Var) {
        switch (this.I) {
            case 2:
                x60 x60Var = ((dw) ((vz) this.J).F).b.H0;
                if (x60Var != null && x60Var.D()) {
                    i9 = 0;
                }
                return super.m0(i9, g1Var, n1Var);
            case 3:
            default:
                return super.m0(i9, g1Var, n1Var);
            case 4:
                uj0 uj0Var = (uj0) this.J;
                gh.f1 f1Var = uj0Var.b;
                if (i9 < 0 && uj0Var.x0 != 0.0f) {
                    float pullingLeftProgress = uj0Var.getPullingLeftProgress();
                    uj0Var.x0 += i9;
                    if ((pullingLeftProgress > 1.0f) != (uj0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            f1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f10 = uj0Var.x0;
                    if (f10 < 0.0f) {
                        i9 = (int) f10;
                        uj0Var.x0 = 0.0f;
                    } else {
                        i9 = 0;
                    }
                    fh.v vVar = uj0Var.O;
                    if (vVar != null) {
                        vVar.invalidate();
                    }
                    f1Var.invalidate();
                }
                int m0 = super.m0(i9, g1Var, n1Var);
                if (i9 > 0 && m0 == 0 && f1Var.getScrollState() == 1 && uj0Var.q()) {
                    ValueAnimator valueAnimator = uj0Var.u0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        uj0Var.u0.cancel();
                    }
                    float pullingLeftProgress2 = uj0Var.getPullingLeftProgress();
                    uj0Var.x0 = (i9 * (pullingLeftProgress2 > 1.0f ? 0.05f : 0.6f)) + uj0Var.x0;
                    if ((pullingLeftProgress2 > 1.0f) != (uj0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            f1Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    fh.v vVar2 = uj0Var.O;
                    if (vVar2 != null) {
                        vVar2.invalidate();
                    }
                    f1Var.invalidate();
                }
                return m0;
        }
    }

    @Override // f2.m0, f2.z0
    public int o0(int i9, f2.g1 g1Var, f2.n1 n1Var) {
        switch (this.I) {
            case 1:
                jr jrVar = (jr) this.J;
                if (jrVar.N || jrVar.K != 0 || jrVar.B.size() != 0) {
                    break;
                }
                break;
        }
        return super.o0(i9, g1Var, n1Var);
    }

    @Override // f2.m0, f2.z0
    public void v0(RecyclerView recyclerView, f2.n1 n1Var, int i9) {
        switch (this.I) {
            case 2:
                pz pzVar = new pz(this, recyclerView.getContext());
                pzVar.a = i9;
                w0(pzVar);
                break;
            case 6:
                g71 g71Var = new g71(this, recyclerView.getContext());
                g71Var.a = i9;
                w0(g71Var);
                break;
            default:
                super.v0(recyclerView, n1Var, i9);
                break;
        }
    }

    @Override // f2.m0, f2.z0
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

    @Override // f2.m0
    public void z0(f2.n1 n1Var, int[] iArr) {
        switch (this.I) {
            case 7:
                iArr[1] = ((StickersActivity) this.J).a.getHeight();
                break;
            default:
                super.z0(n1Var, iArr);
                break;
        }
    }

    public /* synthetic */ g0(Object obj, int i9) {
        this.I = i9;
        this.J = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(jr jrVar) {
        super(1, false);
        this.I = 1;
        this.J = jrVar;
    }
}
