package ig;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.m00;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.s31;
import org.telegram.ui.Components.t91;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.kr;
import org.telegram.ui.rx;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    @Override // s4.p0
    public void S(rf.e eVar, s4.b1 b1Var, s0.d dVar) {
        switch (this.I) {
            case 0:
                super.S(eVar, b1Var, dVar);
                if (!((r0) this.J).isEnabled()) {
                    dVar.p(false);
                    break;
                }
                break;
            case 7:
                super.S(eVar, b1Var, dVar);
                if (((t91) this.J).V) {
                    dVar.p(false);
                    break;
                }
                break;
            default:
                super.S(eVar, b1Var, dVar);
                break;
        }
    }

    @Override // s4.c0
    public int W0(s4.b1 b1Var) {
        switch (this.I) {
            case 6:
                if (!((s31) this.J).i3) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(b1Var);
    }

    @Override // s4.c0
    public void l1(boolean z10) {
        switch (this.I) {
            case 3:
                super.l1(z10);
                ((gb0) this.J).b.setTranslationY(AndroidUtilities.dp(6.0f) * (z10 ? -1 : 1));
                break;
            default:
                super.l1(z10);
                break;
        }
    }

    @Override // s4.c0, s4.p0
    public int m0(int i10, rf.e eVar, s4.b1 b1Var) {
        switch (this.I) {
            case 2:
                k80 k80Var = ((rx) ((s00) this.J).J).b.L0;
                if (k80Var != null && k80Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, eVar, b1Var);
            case 3:
            default:
                return super.m0(i10, eVar, b1Var);
            case 4:
                fl0 fl0Var = (fl0) this.J;
                bi.r1 r1Var = fl0Var.b;
                if (i10 < 0 && fl0Var.B0 != 0.0f) {
                    float pullingLeftProgress = fl0Var.getPullingLeftProgress();
                    fl0Var.B0 += i10;
                    if ((pullingLeftProgress > 1.0f) != (fl0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            r1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f7 = fl0Var.B0;
                    if (f7 < 0.0f) {
                        i10 = (int) f7;
                        fl0Var.B0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    bh.p pVar = fl0Var.S;
                    if (pVar != null) {
                        pVar.invalidate();
                    }
                    r1Var.invalidate();
                }
                int m0 = super.m0(i10, eVar, b1Var);
                if (i10 > 0 && m0 == 0 && r1Var.getScrollState() == 1 && fl0Var.q()) {
                    ValueAnimator valueAnimator = fl0Var.y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        fl0Var.y0.cancel();
                    }
                    float pullingLeftProgress2 = fl0Var.getPullingLeftProgress();
                    fl0Var.B0 = (i10 * (pullingLeftProgress2 > 1.0f ? 0.05f : 0.6f)) + fl0Var.B0;
                    if ((pullingLeftProgress2 > 1.0f) != (fl0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            r1Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    bh.p pVar2 = fl0Var.S;
                    if (pVar2 != null) {
                        pVar2.invalidate();
                    }
                    r1Var.invalidate();
                }
                return m0;
        }
    }

    @Override // s4.c0, s4.p0
    public int o0(int i10, rf.e eVar, s4.b1 b1Var) {
        switch (this.I) {
            case 1:
                kr krVar = (kr) this.J;
                if (krVar.Q || krVar.N != 0 || krVar.E.size() != 0) {
                    break;
                }
                break;
            case 5:
                lw0 lw0Var = (lw0) this.J;
                if (i10 > 0 && lw0Var.N != null) {
                    int i11 = 0;
                    while (i11 < i10) {
                        int min = Math.min(i10 - i11, Math.max(1, Math.round((lw0Var.getHeight() - lw0Var.U) * 0.5f)));
                        float k10 = lw0Var.k();
                        if (!Float.isInfinite(k10)) {
                            min = Math.min(min, Math.max(0, Math.round(k10 - lw0Var.U)));
                        }
                        if (min == 0) {
                            break;
                        } else {
                            int o02 = super.o0(min, eVar, b1Var);
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
        return super.o0(i10, eVar, b1Var);
    }

    @Override // s4.c0, s4.p0
    public void v0(RecyclerView recyclerView, s4.b1 b1Var, int i10) {
        switch (this.I) {
            case 2:
                m00 m00Var = new m00(this, recyclerView.getContext());
                m00Var.a = i10;
                w0(m00Var);
                break;
            case 7:
                o91 o91Var = new o91(this, recyclerView.getContext());
                o91Var.a = i10;
                w0(o91Var);
                break;
            default:
                super.v0(recyclerView, b1Var, i10);
                break;
        }
    }

    @Override // s4.c0, s4.p0
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
    public void z0(s4.b1 b1Var, int[] iArr) {
        switch (this.I) {
            case 8:
                iArr[1] = ((StickersActivity) this.J).a.getHeight();
                break;
            default:
                super.z0(b1Var, iArr);
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
