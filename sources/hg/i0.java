package hg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.f31;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.m00;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.y81;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.bw;
import org.telegram.ui.hr;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                if (!((q0) this.J).isEnabled()) {
                    cVar.p(false);
                    break;
                }
                break;
            case 6:
                super.S(eVar, y0Var, cVar);
                if (((d91) this.J).V) {
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
                if (!((f31) this.J).Y2) {
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
                ((ib0) this.J).b.setTranslationY(AndroidUtilities.dp(6.0f) * (z10 ? -1 : 1));
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
                i80 i80Var = ((bw) ((s00) this.J).J).b.L0;
                if (i80Var != null && i80Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, eVar, y0Var);
            case 3:
            default:
                return super.m0(i10, eVar, y0Var);
            case 4:
                dl0 dl0Var = (dl0) this.J;
                ai.u1 u1Var = dl0Var.b;
                if (i10 < 0 && dl0Var.B0 != 0.0f) {
                    float pullingLeftProgress = dl0Var.getPullingLeftProgress();
                    dl0Var.B0 += i10;
                    if ((pullingLeftProgress > 1.0f) != (dl0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            u1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f7 = dl0Var.B0;
                    if (f7 < 0.0f) {
                        i10 = (int) f7;
                        dl0Var.B0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    ah.v vVar = dl0Var.S;
                    if (vVar != null) {
                        vVar.invalidate();
                    }
                    u1Var.invalidate();
                }
                int m0 = super.m0(i10, eVar, y0Var);
                if (i10 > 0 && m0 == 0 && u1Var.getScrollState() == 1 && dl0Var.q()) {
                    ValueAnimator valueAnimator = dl0Var.y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        dl0Var.y0.cancel();
                    }
                    float pullingLeftProgress2 = dl0Var.getPullingLeftProgress();
                    dl0Var.B0 = (i10 * (pullingLeftProgress2 > 1.0f ? 0.05f : 0.6f)) + dl0Var.B0;
                    if ((pullingLeftProgress2 > 1.0f) != (dl0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            u1Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    ah.v vVar2 = dl0Var.S;
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
                hr hrVar = (hr) this.J;
                if (hrVar.R || hrVar.O != 0 || hrVar.F.size() != 0) {
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
                y81 y81Var = new y81(this, recyclerView.getContext());
                y81Var.a = i10;
                w0(y81Var);
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
    public i0(hr hrVar) {
        super(1, false);
        this.I = 1;
        this.J = hrVar;
    }
}
