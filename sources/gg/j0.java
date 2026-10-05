package gg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ci.m6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a91;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ly;
import org.telegram.ui.rr;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class j0 extends s4.c0 {
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i10, Object obj, boolean z10) {
        super(1, false);
        this.I = i10;
        this.J = obj;
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
            case 7:
                super.S(eVar, z0Var, dVar);
                if (((g91) this.J).V) {
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
            case 6:
                if (!((k31) this.J).h3) {
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
                b80 b80Var = ((ly) ((n00) this.J).J).b.L0;
                if (b80Var != null && b80Var.D()) {
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
                rr rrVar = (rr) this.J;
                if (rrVar.R || rrVar.O != 0 || rrVar.F.size() != 0) {
                    break;
                }
                break;
            case 5:
                bw0 bw0Var = (bw0) this.J;
                if (i10 > 0 && bw0Var.N != null) {
                    int i11 = 0;
                    while (i11 < i10) {
                        int min = Math.min(i10 - i11, Math.max(1, Math.round((bw0Var.getHeight() - bw0Var.U) * 0.5f)));
                        float k10 = bw0Var.k();
                        if (!Float.isInfinite(k10)) {
                            min = Math.min(min, Math.max(0, Math.round(k10 - bw0Var.U)));
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

    @Override // s4.c0, s4.o0
    public void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        switch (this.I) {
            case 2:
                g00 g00Var = new g00(this, recyclerView.getContext());
                g00Var.a = i10;
                w0(g00Var);
                break;
            case 7:
                a91 a91Var = new a91(this, recyclerView.getContext());
                a91Var.a = i10;
                w0(a91Var);
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
