package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class br extends s4.a0 {
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;

    public /* synthetic */ br(int i10, Object obj, boolean z10) {
        this.I = i10;
        this.J = obj;
    }

    @Override // s4.n0
    public void S(hf.e eVar, s4.z0 z0Var, s0.c cVar) {
        switch (this.I) {
            case 7:
                super.S(eVar, z0Var, cVar);
                if (((org.telegram.ui.Components.v71) this.J).V) {
                    cVar.p(false);
                    break;
                }
                break;
            case 8:
            default:
                super.S(eVar, z0Var, cVar);
                break;
            case 9:
                super.S(eVar, z0Var, cVar);
                if (!((zf.g0) this.J).isEnabled()) {
                    cVar.p(false);
                    break;
                }
                break;
        }
    }

    @Override // s4.a0
    public int W0(s4.z0 z0Var) {
        switch (this.I) {
            case 5:
                if (!((org.telegram.ui.Components.u51) this.J).h3) {
                    break;
                } else {
                    break;
                }
            case 6:
                if (!((org.telegram.ui.Components.c21) this.J).h3) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(z0Var);
    }

    @Override // s4.a0
    public void k1(boolean z10) {
        switch (this.I) {
            case 2:
                super.k1(z10);
                ((org.telegram.ui.Components.y90) this.J).b.setTranslationY(org.telegram.messenger.i0.L(6.0f) * (z10 ? -1 : 1));
                break;
            default:
                super.k1(z10);
                break;
        }
    }

    @Override // s4.a0, s4.n0
    public int m0(int i10, hf.e eVar, s4.z0 z0Var) {
        switch (this.I) {
            case 1:
                org.telegram.ui.Components.z60 z60Var = ((rx) ((org.telegram.ui.Components.tz) this.J).J).b.L0;
                if (z60Var != null && z60Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, eVar, z0Var);
            case 2:
            default:
                return super.m0(i10, eVar, z0Var);
            case 3:
                org.telegram.ui.Components.mj0 mj0Var = (org.telegram.ui.Components.mj0) this.J;
                ag.b1 b1Var = mj0Var.b;
                if (i10 < 0 && mj0Var.B0 != 0.0f) {
                    float pullingLeftProgress = mj0Var.getPullingLeftProgress();
                    mj0Var.B0 += i10;
                    if ((pullingLeftProgress > 1.0f) != (mj0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            b1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f7 = mj0Var.B0;
                    if (f7 < 0.0f) {
                        i10 = (int) f7;
                        mj0Var.B0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    fg.i iVar = mj0Var.S;
                    if (iVar != null) {
                        iVar.invalidate();
                    }
                    b1Var.invalidate();
                }
                int m0 = super.m0(i10, eVar, z0Var);
                if (i10 > 0 && m0 == 0 && b1Var.getScrollState() == 1 && mj0Var.q()) {
                    ValueAnimator valueAnimator = mj0Var.y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        mj0Var.y0.cancel();
                    }
                    float pullingLeftProgress2 = mj0Var.getPullingLeftProgress();
                    mj0Var.B0 = (i10 * (pullingLeftProgress2 > 1.0f ? 0.05f : 0.6f)) + mj0Var.B0;
                    if ((pullingLeftProgress2 > 1.0f) != (mj0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            b1Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    fg.i iVar2 = mj0Var.S;
                    if (iVar2 != null) {
                        iVar2.invalidate();
                    }
                    b1Var.invalidate();
                }
                return m0;
        }
    }

    @Override // s4.a0, s4.n0
    public int o0(int i10, hf.e eVar, s4.z0 z0Var) {
        switch (this.I) {
            case 0:
                pr prVar = (pr) this.J;
                if (prVar.Q || prVar.N != 0 || prVar.E.size() != 0) {
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.ku0 ku0Var = (org.telegram.ui.Components.ku0) this.J;
                if (i10 > 0 && ku0Var.N != null) {
                    int i11 = 0;
                    while (i11 < i10) {
                        int min = Math.min(i10 - i11, Math.max(1, Math.round((ku0Var.getHeight() - ku0Var.U) * 0.5f)));
                        float o10 = ku0Var.o();
                        if (!Float.isInfinite(o10)) {
                            min = Math.min(min, Math.max(0, Math.round(o10 - ku0Var.U)));
                        }
                        if (min == 0) {
                            break;
                        } else {
                            int o02 = super.o0(min, eVar, z0Var);
                            i11 += o02;
                            if (o02 < min) {
                                break;
                            }
                        }
                    }
                    break;
                } else {
                    break;
                }
                break;
        }
        return super.o0(i10, eVar, z0Var);
    }

    @Override // s4.a0, s4.n0
    public void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        switch (this.I) {
            case 1:
                org.telegram.ui.Components.nz nzVar = new org.telegram.ui.Components.nz(this, recyclerView.getContext());
                nzVar.a = i10;
                w0(nzVar);
                break;
            case 7:
                org.telegram.ui.Components.q71 q71Var = new org.telegram.ui.Components.q71(this, recyclerView.getContext());
                q71Var.a = i10;
                w0(q71Var);
                break;
            default:
                super.v0(recyclerView, z0Var, i10);
                break;
        }
    }

    @Override // s4.a0, s4.n0
    public boolean y0() {
        switch (this.I) {
            case 1:
                return true;
            case 2:
                return false;
            case 8:
                return false;
            case 9:
                return false;
            default:
                return super.y0();
        }
    }

    @Override // s4.a0
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
    public /* synthetic */ br(ViewGroup viewGroup, int i10) {
        super(0, false);
        this.I = i10;
        this.J = viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ br(Object obj, int i10) {
        super(1, false);
        this.I = i10;
        this.J = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br(org.telegram.ui.Components.u51 u51Var, int i10) {
        super(i10, false);
        this.I = 5;
        this.J = u51Var;
    }
}
