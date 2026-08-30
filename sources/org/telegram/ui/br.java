package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class br extends f2.i0 {
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ br(ViewGroup viewGroup, int i10) {
        super(0, false);
        this.I = i10;
        this.J = viewGroup;
    }

    @Override // f2.v0
    public void S(bf.f fVar, f2.i1 i1Var, s0.e eVar) {
        switch (this.I) {
            case 5:
                super.S(fVar, i1Var, eVar);
                if (((org.telegram.ui.Components.k81) this.J).S) {
                    eVar.p(false);
                    break;
                }
                break;
            case 6:
            default:
                super.S(fVar, i1Var, eVar);
                break;
            case 7:
                super.S(fVar, i1Var, eVar);
                if (!((tf.g0) this.J).isEnabled()) {
                    eVar.p(false);
                    break;
                }
                break;
        }
    }

    @Override // f2.i0
    public int W0(f2.i1 i1Var) {
        switch (this.I) {
            case 4:
                if (!((org.telegram.ui.Components.k21) this.J).X2) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(i1Var);
    }

    @Override // f2.i0
    public void k1(boolean z4) {
        switch (this.I) {
            case 2:
                super.k1(z4);
                ((org.telegram.ui.Components.pa0) this.J).b.setTranslationY(AndroidUtilities.dp(6.0f) * (z4 ? -1 : 1));
                break;
            default:
                super.k1(z4);
                break;
        }
    }

    @Override // f2.i0, f2.v0
    public int m0(int i10, bf.f fVar, f2.i1 i1Var) {
        switch (this.I) {
            case 1:
                org.telegram.ui.Components.o70 o70Var = ((ow) ((org.telegram.ui.Components.j00) this.J).G).b.I0;
                if (o70Var != null && o70Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, fVar, i1Var);
            case 2:
            default:
                return super.m0(i10, fVar, i1Var);
            case 3:
                org.telegram.ui.Components.pk0 pk0Var = (org.telegram.ui.Components.pk0) this.J;
                lh.e1 e1Var = pk0Var.b;
                if (i10 < 0 && pk0Var.y0 != 0.0f) {
                    float pullingLeftProgress = pk0Var.getPullingLeftProgress();
                    pk0Var.y0 += i10;
                    if ((pullingLeftProgress > 1.0f) != (pk0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            e1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f10 = pk0Var.y0;
                    if (f10 < 0.0f) {
                        i10 = (int) f10;
                        pk0Var.y0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    ah.d dVar = pk0Var.P;
                    if (dVar != null) {
                        dVar.invalidate();
                    }
                    e1Var.invalidate();
                }
                int m0 = super.m0(i10, fVar, i1Var);
                if (i10 > 0 && m0 == 0 && e1Var.getScrollState() == 1 && pk0Var.q()) {
                    ValueAnimator valueAnimator = pk0Var.v0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        pk0Var.v0.cancel();
                    }
                    float pullingLeftProgress2 = pk0Var.getPullingLeftProgress();
                    pk0Var.y0 = (i10 * (pullingLeftProgress2 > 1.0f ? 0.05f : 0.6f)) + pk0Var.y0;
                    if ((pullingLeftProgress2 > 1.0f) != (pk0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            e1Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    ah.d dVar2 = pk0Var.P;
                    if (dVar2 != null) {
                        dVar2.invalidate();
                    }
                    e1Var.invalidate();
                }
                return m0;
        }
    }

    @Override // f2.i0, f2.v0
    public int o0(int i10, bf.f fVar, f2.i1 i1Var) {
        switch (this.I) {
            case 0:
                pr prVar = (pr) this.J;
                if (prVar.O || prVar.L != 0 || prVar.C.size() != 0) {
                    break;
                }
                break;
        }
        return super.o0(i10, fVar, i1Var);
    }

    @Override // f2.i0, f2.v0
    public void v0(RecyclerView recyclerView, f2.i1 i1Var, int i10) {
        switch (this.I) {
            case 1:
                org.telegram.ui.Components.d00 d00Var = new org.telegram.ui.Components.d00(this, recyclerView.getContext());
                d00Var.a = i10;
                w0(d00Var);
                break;
            case 5:
                org.telegram.ui.Components.e81 e81Var = new org.telegram.ui.Components.e81(this, recyclerView.getContext());
                e81Var.a = i10;
                w0(e81Var);
                break;
            default:
                super.v0(recyclerView, i1Var, i10);
                break;
        }
    }

    @Override // f2.i0, f2.v0
    public boolean y0() {
        switch (this.I) {
            case 1:
                return true;
            case 2:
                return false;
            case 3:
            case 4:
            case 5:
            default:
                return super.y0();
            case 6:
                return false;
            case 7:
                return false;
        }
    }

    @Override // f2.i0
    public void z0(f2.i1 i1Var, int[] iArr) {
        switch (this.I) {
            case 6:
                iArr[1] = ((StickersActivity) this.J).a.getHeight();
                break;
            default:
                super.z0(i1Var, iArr);
                break;
        }
    }

    public /* synthetic */ br(Object obj, int i10) {
        this.I = i10;
        this.J = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br(pr prVar) {
        super(1, false);
        this.I = 0;
        this.J = prVar;
    }
}
