package gg;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ci.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.a31;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.sr;
import org.telegram.ui.tw;
import org.telegram.ui.z6;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class j0 extends s4.c0 {
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i10, n2 n2Var) {
        super(1, false);
        this.I = i10;
        this.J = n2Var;
    }

    @Override // s4.o0
    public void P(View view) {
        switch (this.I) {
            case 1:
                z6 z6Var = (z6) this.J;
                if (view != z6Var.M) {
                    super.P(view);
                    break;
                } else {
                    view.measure(View.MeasureSpec.makeMeasureSpec(z6Var.b.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(z6Var.b.getMeasuredHeight(), TLObject.FLAG_30));
                    break;
                }
            default:
                super.P(view);
                break;
        }
    }

    @Override // s4.o0
    public void S(of.e eVar, s4.z0 z0Var, s0.c cVar) {
        switch (this.I) {
            case 0:
                super.S(eVar, z0Var, cVar);
                if (!((s0) this.J).isEnabled()) {
                    cVar.p(false);
                    break;
                }
                break;
            case 7:
                super.S(eVar, z0Var, cVar);
                if (((w81) this.J).V) {
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
            case 6:
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
            case 4:
                super.k1(z10);
                ((wa0) this.J).b.setTranslationY(AndroidUtilities.dp(6.0f) * (z10 ? -1 : 1));
                break;
            default:
                super.k1(z10);
                break;
        }
    }

    @Override // s4.c0, s4.o0
    public int m0(int i10, of.e eVar, s4.z0 z0Var) {
        switch (this.I) {
            case 3:
                w70 w70Var = ((tw) ((k00) this.J).J).b.L0;
                if (w70Var != null && w70Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, eVar, z0Var);
            case 4:
            default:
                return super.m0(i10, eVar, z0Var);
            case 5:
                qk0 qk0Var = (qk0) this.J;
                ai.w0 w0Var = qk0Var.b;
                if (i10 < 0 && qk0Var.B0 != 0.0f) {
                    float pullingLeftProgress = qk0Var.getPullingLeftProgress();
                    qk0Var.B0 += i10;
                    if ((pullingLeftProgress > 1.0f) != (qk0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            w0Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f7 = qk0Var.B0;
                    if (f7 < 0.0f) {
                        i10 = (int) f7;
                        qk0Var.B0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    n6 n6Var = qk0Var.S;
                    if (n6Var != null) {
                        n6Var.invalidate();
                    }
                    w0Var.invalidate();
                }
                int m0 = super.m0(i10, eVar, z0Var);
                if (i10 > 0 && m0 == 0 && w0Var.getScrollState() == 1 && qk0Var.q()) {
                    ValueAnimator valueAnimator = qk0Var.y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        qk0Var.y0.cancel();
                    }
                    float pullingLeftProgress2 = qk0Var.getPullingLeftProgress();
                    qk0Var.B0 = (i10 * (pullingLeftProgress2 > 1.0f ? 0.05f : 0.6f)) + qk0Var.B0;
                    if ((pullingLeftProgress2 > 1.0f) != (qk0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            w0Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    n6 n6Var2 = qk0Var.S;
                    if (n6Var2 != null) {
                        n6Var2.invalidate();
                    }
                    w0Var.invalidate();
                }
                return m0;
        }
    }

    @Override // s4.c0, s4.o0
    public int o0(int i10, of.e eVar, s4.z0 z0Var) {
        switch (this.I) {
            case 2:
                sr srVar = (sr) this.J;
                if (srVar.R || srVar.O != 0 || srVar.F.size() != 0) {
                    break;
                }
                break;
        }
        return super.o0(i10, eVar, z0Var);
    }

    @Override // s4.c0, s4.o0
    public void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        switch (this.I) {
            case 3:
                d00 d00Var = new d00(this, recyclerView.getContext());
                d00Var.a = i10;
                w0(d00Var);
                break;
            case 7:
                q81 q81Var = new q81(this, recyclerView.getContext());
                q81Var.a = i10;
                w0(q81Var);
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
            case 3:
                return true;
            case 4:
                return false;
            case 8:
                return false;
            default:
                return super.y0();
        }
    }

    @Override // s4.c0
    public void z0(s4.z0 z0Var, int[] iArr) {
        switch (this.I) {
            case 8:
                iArr[1] = ((StickersActivity) this.J).a.getHeight();
                break;
            default:
                super.z0(z0Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(ViewGroup viewGroup, int i10) {
        super(0, false);
        this.I = i10;
        this.J = viewGroup;
    }

    public /* synthetic */ j0(Object obj, int i10) {
        this.I = i10;
        this.J = obj;
    }
}
