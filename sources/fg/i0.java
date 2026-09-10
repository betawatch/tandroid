package fg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bi.n7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.p81;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.Components.y21;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.vw;
import org.telegram.ui.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class i0 extends s4.c0 {
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(ViewGroup viewGroup, int i10) {
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
                if (((u81) this.J).V) {
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
                if (!((y21) this.J).a3) {
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
                ((xa0) this.J).b.setTranslationY(AndroidUtilities.dp(6.0f) * (z10 ? -1 : 1));
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
                w70 w70Var = ((vw) ((r00) this.J).J).b.L0;
                if (w70Var != null && w70Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, eVar, z0Var);
            case 3:
            default:
                return super.m0(i10, eVar, z0Var);
            case 4:
                pk0 pk0Var = (pk0) this.J;
                bi.y1 y1Var = pk0Var.b;
                if (i10 < 0 && pk0Var.B0 != 0.0f) {
                    float pullingLeftProgress = pk0Var.getPullingLeftProgress();
                    pk0Var.B0 += i10;
                    if ((pullingLeftProgress > 1.0f) != (pk0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            y1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f7 = pk0Var.B0;
                    if (f7 < 0.0f) {
                        i10 = (int) f7;
                        pk0Var.B0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    n7 n7Var = pk0Var.S;
                    if (n7Var != null) {
                        n7Var.invalidate();
                    }
                    y1Var.invalidate();
                }
                int m0 = super.m0(i10, eVar, z0Var);
                if (i10 > 0 && m0 == 0 && y1Var.getScrollState() == 1 && pk0Var.q()) {
                    ValueAnimator valueAnimator = pk0Var.y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        pk0Var.y0.cancel();
                    }
                    float pullingLeftProgress2 = pk0Var.getPullingLeftProgress();
                    pk0Var.B0 = (i10 * (pullingLeftProgress2 > 1.0f ? 0.05f : 0.6f)) + pk0Var.B0;
                    if ((pullingLeftProgress2 > 1.0f) != (pk0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            y1Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    n7 n7Var2 = pk0Var.S;
                    if (n7Var2 != null) {
                        n7Var2.invalidate();
                    }
                    y1Var.invalidate();
                }
                return m0;
        }
    }

    @Override // s4.c0, s4.o0
    public int o0(int i10, of.e eVar, s4.z0 z0Var) {
        switch (this.I) {
            case 1:
                wr wrVar = (wr) this.J;
                if (wrVar.R || wrVar.O != 0 || wrVar.F.size() != 0) {
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
                k00 k00Var = new k00(this, recyclerView.getContext());
                k00Var.a = i10;
                w0(k00Var);
                break;
            case 6:
                p81 p81Var = new p81(this, recyclerView.getContext());
                p81Var.a = i10;
                w0(p81Var);
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

    public /* synthetic */ i0(Object obj, int i10) {
        this.I = i10;
        this.J = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(wr wrVar) {
        super(1, false);
        this.I = 1;
        this.J = wrVar;
    }
}
