package hg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.k21;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.tw;
import org.telegram.ui.vr;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class j0 extends s4.c0 {
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(ViewGroup viewGroup, int i10) {
        super(0, false);
        this.I = i10;
        this.J = viewGroup;
    }

    @Override // s4.o0
    public void S(pf.e eVar, s4.z0 z0Var, s0.c cVar) {
        switch (this.I) {
            case 0:
                super.S(eVar, z0Var, cVar);
                if (!((s0) this.J).isEnabled()) {
                    cVar.p(false);
                    break;
                }
                break;
            case 6:
                super.S(eVar, z0Var, cVar);
                if (((h81) this.J).V) {
                    cVar.p(false);
                    break;
                }
                break;
            default:
                super.S(eVar, z0Var, cVar);
                break;
        }
    }

    @Override // s4.c0
    public int W0(s4.z0 z0Var) {
        switch (this.I) {
            case 5:
                if (!((k21) this.J).a3) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(z0Var);
    }

    @Override // s4.c0
    public void k1(boolean z10) {
        switch (this.I) {
            case 3:
                super.k1(z10);
                ((oa0) this.J).b.setTranslationY(AndroidUtilities.dp(6.0f) * (z10 ? -1 : 1));
                break;
            default:
                super.k1(z10);
                break;
        }
    }

    @Override // s4.c0, s4.o0
    public int m0(int i10, pf.e eVar, s4.z0 z0Var) {
        switch (this.I) {
            case 2:
                n70 n70Var = ((tw) ((k00) this.J).J).b.L0;
                if (n70Var != null && n70Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, eVar, z0Var);
            case 3:
            default:
                return super.m0(i10, eVar, z0Var);
            case 4:
                fk0 fk0Var = (fk0) this.J;
                bi.o0 o0Var = fk0Var.b;
                if (i10 < 0 && fk0Var.B0 != 0.0f) {
                    float pullingLeftProgress = fk0Var.getPullingLeftProgress();
                    fk0Var.B0 += i10;
                    if ((pullingLeftProgress > 1.0f) != (fk0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            o0Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f7 = fk0Var.B0;
                    if (f7 < 0.0f) {
                        i10 = (int) f7;
                        fk0Var.B0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    ah.w wVar = fk0Var.S;
                    if (wVar != null) {
                        wVar.invalidate();
                    }
                    o0Var.invalidate();
                }
                int m0 = super.m0(i10, eVar, z0Var);
                if (i10 > 0 && m0 == 0 && o0Var.getScrollState() == 1 && fk0Var.q()) {
                    ValueAnimator valueAnimator = fk0Var.y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        fk0Var.y0.cancel();
                    }
                    float pullingLeftProgress2 = fk0Var.getPullingLeftProgress();
                    fk0Var.B0 = (i10 * (pullingLeftProgress2 > 1.0f ? 0.05f : 0.6f)) + fk0Var.B0;
                    if ((pullingLeftProgress2 > 1.0f) != (fk0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            o0Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    ah.w wVar2 = fk0Var.S;
                    if (wVar2 != null) {
                        wVar2.invalidate();
                    }
                    o0Var.invalidate();
                }
                return m0;
        }
    }

    @Override // s4.c0, s4.o0
    public int o0(int i10, pf.e eVar, s4.z0 z0Var) {
        switch (this.I) {
            case 1:
                vr vrVar = (vr) this.J;
                if (vrVar.R || vrVar.O != 0 || vrVar.F.size() != 0) {
                    break;
                }
                break;
        }
        return super.o0(i10, eVar, z0Var);
    }

    @Override // s4.c0, s4.o0
    public void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        switch (this.I) {
            case 2:
                d00 d00Var = new d00(this, recyclerView.getContext());
                d00Var.a = i10;
                w0(d00Var);
                break;
            case 6:
                c81 c81Var = new c81(this, recyclerView.getContext());
                c81Var.a = i10;
                w0(c81Var);
                break;
            default:
                super.v0(recyclerView, z0Var, i10);
                break;
        }
    }

    @Override // s4.c0, s4.o0
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

    @Override // s4.c0
    public void z0(s4.z0 z0Var, int[] iArr) {
        switch (this.I) {
            case 7:
                iArr[1] = ((StickersActivity) this.J).a.getHeight();
                break;
            default:
                super.z0(z0Var, iArr);
                break;
        }
    }

    public /* synthetic */ j0(Object obj, int i10) {
        this.I = i10;
        this.J = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(vr vrVar) {
        super(1, false);
        this.I = 1;
        this.J = vrVar;
    }
}
