package gg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ci.m6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.t00;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.sw;
import org.telegram.ui.tr;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class i0 extends s4.d0 {
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(ViewGroup viewGroup, int i10) {
        super(0, false);
        this.I = i10;
        this.J = viewGroup;
    }

    @Override // s4.p0
    public void S(pf.e eVar, s4.a1 a1Var, s0.d dVar) {
        switch (this.I) {
            case 0:
                super.S(eVar, a1Var, dVar);
                if (!((r0) this.J).isEnabled()) {
                    dVar.p(false);
                    break;
                }
                break;
            case 6:
                super.S(eVar, a1Var, dVar);
                if (((n91) this.J).V) {
                    dVar.p(false);
                    break;
                }
                break;
            default:
                super.S(eVar, a1Var, dVar);
                break;
        }
    }

    @Override // s4.d0
    public int W0(s4.a1 a1Var) {
        switch (this.I) {
            case 5:
                if (!((q31) this.J).Y2) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(a1Var);
    }

    @Override // s4.d0
    public void k1(boolean z10) {
        switch (this.I) {
            case 3:
                super.k1(z10);
                ((pb0) this.J).b.setTranslationY(AndroidUtilities.dp(6.0f) * (z10 ? -1 : 1));
                break;
            default:
                super.k1(z10);
                break;
        }
    }

    @Override // s4.d0, s4.p0
    public int m0(int i10, pf.e eVar, s4.a1 a1Var) {
        switch (this.I) {
            case 2:
                p80 p80Var = ((sw) ((a10) this.J).J).b.L0;
                if (p80Var != null && p80Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, eVar, a1Var);
            case 3:
            default:
                return super.m0(i10, eVar, a1Var);
            case 4:
                kl0 kl0Var = (kl0) this.J;
                ai.w0 w0Var = kl0Var.b;
                if (i10 < 0 && kl0Var.B0 != 0.0f) {
                    float pullingLeftProgress = kl0Var.getPullingLeftProgress();
                    kl0Var.B0 += i10;
                    if ((pullingLeftProgress > 1.0f) != (kl0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            w0Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f7 = kl0Var.B0;
                    if (f7 < 0.0f) {
                        i10 = (int) f7;
                        kl0Var.B0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    m6 m6Var = kl0Var.S;
                    if (m6Var != null) {
                        m6Var.invalidate();
                    }
                    w0Var.invalidate();
                }
                int m0 = super.m0(i10, eVar, a1Var);
                if (i10 > 0 && m0 == 0 && w0Var.getScrollState() == 1 && kl0Var.q()) {
                    ValueAnimator valueAnimator = kl0Var.y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        kl0Var.y0.cancel();
                    }
                    float pullingLeftProgress2 = kl0Var.getPullingLeftProgress();
                    kl0Var.B0 = (i10 * (pullingLeftProgress2 > 1.0f ? 0.05f : 0.6f)) + kl0Var.B0;
                    if ((pullingLeftProgress2 > 1.0f) != (kl0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            w0Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    m6 m6Var2 = kl0Var.S;
                    if (m6Var2 != null) {
                        m6Var2.invalidate();
                    }
                    w0Var.invalidate();
                }
                return m0;
        }
    }

    @Override // s4.d0, s4.p0
    public int o0(int i10, pf.e eVar, s4.a1 a1Var) {
        switch (this.I) {
            case 1:
                tr trVar = (tr) this.J;
                if (trVar.R || trVar.O != 0 || trVar.F.size() != 0) {
                    break;
                }
                break;
        }
        return super.o0(i10, eVar, a1Var);
    }

    @Override // s4.d0, s4.p0
    public void v0(RecyclerView recyclerView, s4.a1 a1Var, int i10) {
        switch (this.I) {
            case 2:
                t00 t00Var = new t00(this, recyclerView.getContext());
                t00Var.a = i10;
                w0(t00Var);
                break;
            case 6:
                h91 h91Var = new h91(this, recyclerView.getContext());
                h91Var.a = i10;
                w0(h91Var);
                break;
            default:
                super.v0(recyclerView, a1Var, i10);
                break;
        }
    }

    @Override // s4.d0, s4.p0
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

    @Override // s4.d0
    public void z0(s4.a1 a1Var, int[] iArr) {
        switch (this.I) {
            case 7:
                iArr[1] = ((StickersActivity) this.J).a.getHeight();
                break;
            default:
                super.z0(a1Var, iArr);
                break;
        }
    }

    public /* synthetic */ i0(Object obj, int i10) {
        this.I = i10;
        this.J = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(tr trVar) {
        super(1, false);
        this.I = 1;
        this.J = trVar;
    }
}
