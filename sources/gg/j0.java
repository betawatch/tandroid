package gg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ci.m6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a31;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.m00;
import org.telegram.ui.Components.r81;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.x81;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.pr;
import org.telegram.ui.pw;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
    public void S(of.e eVar, s4.z0 z0Var, s0.d dVar) {
        switch (this.I) {
            case 0:
                super.S(eVar, z0Var, dVar);
                if (!((s0) this.J).isEnabled()) {
                    dVar.p(false);
                    break;
                }
                break;
            case 6:
                super.S(eVar, z0Var, dVar);
                if (((x81) this.J).V) {
                    dVar.p(false);
                    break;
                }
                break;
            default:
                super.S(eVar, z0Var, dVar);
                break;
        }
    }

    @Override // s4.c0
    public int W0(s4.z0 z0Var) {
        switch (this.I) {
            case 5:
                if (!((a31) this.J).a3) {
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
                ((bb0) this.J).b.setTranslationY(AndroidUtilities.dp(6.0f) * (z10 ? -1 : 1));
                break;
            default:
                super.k1(z10);
                break;
        }
    }

    @Override // s4.c0, s4.o0
    public int m0(int i10, of.e eVar, s4.z0 z0Var) {
        switch (this.I) {
            case 2:
                a80 a80Var = ((pw) ((m00) this.J).J).b.L0;
                if (a80Var != null && a80Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, eVar, z0Var);
            case 3:
            default:
                return super.m0(i10, eVar, z0Var);
            case 4:
                sk0 sk0Var = (sk0) this.J;
                ai.w0 w0Var = sk0Var.b;
                if (i10 < 0 && sk0Var.B0 != 0.0f) {
                    float pullingLeftProgress = sk0Var.getPullingLeftProgress();
                    sk0Var.B0 += i10;
                    if ((pullingLeftProgress > 1.0f) != (sk0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            w0Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f7 = sk0Var.B0;
                    if (f7 < 0.0f) {
                        i10 = (int) f7;
                        sk0Var.B0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    m6 m6Var = sk0Var.S;
                    if (m6Var != null) {
                        m6Var.invalidate();
                    }
                    w0Var.invalidate();
                }
                int m0 = super.m0(i10, eVar, z0Var);
                if (i10 > 0 && m0 == 0 && w0Var.getScrollState() == 1 && sk0Var.q()) {
                    ValueAnimator valueAnimator = sk0Var.y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        sk0Var.y0.cancel();
                    }
                    float pullingLeftProgress2 = sk0Var.getPullingLeftProgress();
                    sk0Var.B0 = (i10 * (pullingLeftProgress2 > 1.0f ? 0.05f : 0.6f)) + sk0Var.B0;
                    if ((pullingLeftProgress2 > 1.0f) != (sk0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            w0Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    m6 m6Var2 = sk0Var.S;
                    if (m6Var2 != null) {
                        m6Var2.invalidate();
                    }
                    w0Var.invalidate();
                }
                return m0;
        }
    }

    @Override // s4.c0, s4.o0
    public int o0(int i10, of.e eVar, s4.z0 z0Var) {
        switch (this.I) {
            case 1:
                pr prVar = (pr) this.J;
                if (prVar.R || prVar.O != 0 || prVar.F.size() != 0) {
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
                f00 f00Var = new f00(this, recyclerView.getContext());
                f00Var.a = i10;
                w0(f00Var);
                break;
            case 6:
                r81 r81Var = new r81(this, recyclerView.getContext());
                r81Var.a = i10;
                w0(r81Var);
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
    public j0(pr prVar) {
        super(1, false);
        this.I = 1;
        this.J = prVar;
    }
}
