package gg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ci.m6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.k21;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.qr;
import org.telegram.ui.qw;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                if (((g81) this.J).V) {
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
    public int m0(int i10, of.e eVar, s4.z0 z0Var) {
        switch (this.I) {
            case 2:
                o70 o70Var = ((qw) ((l00) this.J).J).b.L0;
                if (o70Var != null && o70Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, eVar, z0Var);
            case 3:
            default:
                return super.m0(i10, eVar, z0Var);
            case 4:
                gk0 gk0Var = (gk0) this.J;
                ai.w0 w0Var = gk0Var.b;
                if (i10 < 0 && gk0Var.B0 != 0.0f) {
                    float pullingLeftProgress = gk0Var.getPullingLeftProgress();
                    gk0Var.B0 += i10;
                    if ((pullingLeftProgress > 1.0f) != (gk0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            w0Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f7 = gk0Var.B0;
                    if (f7 < 0.0f) {
                        i10 = (int) f7;
                        gk0Var.B0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    m6 m6Var = gk0Var.S;
                    if (m6Var != null) {
                        m6Var.invalidate();
                    }
                    w0Var.invalidate();
                }
                int m0 = super.m0(i10, eVar, z0Var);
                if (i10 > 0 && m0 == 0 && w0Var.getScrollState() == 1 && gk0Var.q()) {
                    ValueAnimator valueAnimator = gk0Var.y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        gk0Var.y0.cancel();
                    }
                    float pullingLeftProgress2 = gk0Var.getPullingLeftProgress();
                    gk0Var.B0 = (i10 * (pullingLeftProgress2 > 1.0f ? 0.05f : 0.6f)) + gk0Var.B0;
                    if ((pullingLeftProgress2 > 1.0f) != (gk0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            w0Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    m6 m6Var2 = gk0Var.S;
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
                qr qrVar = (qr) this.J;
                if (qrVar.R || qrVar.O != 0 || qrVar.F.size() != 0) {
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
                e00 e00Var = new e00(this, recyclerView.getContext());
                e00Var.a = i10;
                w0(e00Var);
                break;
            case 6:
                b81 b81Var = new b81(this, recyclerView.getContext());
                b81Var.a = i10;
                w0(b81Var);
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
    public j0(qr qrVar) {
        super(1, false);
        this.I = 1;
        this.J = qrVar;
    }
}
