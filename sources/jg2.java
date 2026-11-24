// default package

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jg2 extends u46 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jg2(ViewGroup viewGroup, byte b) {
        super(0, false);
        this.I = b;
        this.J = viewGroup;
    }

    @Override // f69
    public final void R(ki2 ki2Var, r69 r69Var, u4 u4Var) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 2:
                super.R(ki2Var, r69Var, u4Var);
                if (!((uh4) obj).isEnabled()) {
                    u4Var.p(false);
                    break;
                }
                break;
            case 9:
                super.R(ki2Var, r69Var, u4Var);
                if (((vgc) obj).W) {
                    u4Var.p(false);
                    break;
                }
                break;
            default:
                super.R(ki2Var, r69Var, u4Var);
                break;
        }
    }

    @Override // u46
    public final int V0(r69 r69Var) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 7:
                if (!((q7c) obj).i3) {
                    break;
                } else {
                    break;
                }
            case 8:
                if (!((azb) obj).i3) {
                    break;
                } else {
                    break;
                }
        }
        return super.V0(r69Var);
    }

    @Override // u46
    public final void j1(boolean z) {
        switch (this.I) {
            case 3:
                super.j1(z);
                ((u17) this.J).b.setTranslationY(gm.L(6.0f) * (z ? -1 : 1));
                break;
            default:
                super.j1(z);
                break;
        }
    }

    @Override // u46, f69
    public final int l0(int i, ki2 ki2Var, r69 r69Var) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 1:
                bu5 bu5Var = ((dk3) ((ig4) obj).K).b.M0;
                if (bu5Var != null && bu5Var.E()) {
                    i = 0;
                }
                return super.l0(i, ki2Var, r69Var);
            case 4:
                v29 v29Var = (v29) obj;
                fv fvVar = v29Var.b;
                if (i < 0 && v29Var.C0 != 0.0f) {
                    float pullingLeftProgress = v29Var.getPullingLeftProgress();
                    v29Var.C0 += i;
                    if ((pullingLeftProgress > 1.0f) != (v29Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            fvVar.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f = v29Var.C0;
                    if (f < 0.0f) {
                        i = (int) f;
                        v29Var.C0 = 0.0f;
                    } else {
                        i = 0;
                    }
                    su suVar = v29Var.T;
                    if (suVar != null) {
                        suVar.invalidate();
                    }
                    fvVar.invalidate();
                }
                int l0 = super.l0(i, ki2Var, r69Var);
                if (i > 0 && l0 == 0 && fvVar.getScrollState() == 1 && v29Var.n()) {
                    ValueAnimator valueAnimator = v29Var.z0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        v29Var.z0.cancel();
                    }
                    float pullingLeftProgress2 = v29Var.getPullingLeftProgress();
                    v29Var.C0 = (i * (pullingLeftProgress2 > 1.0f ? 0.05f : 0.6f)) + v29Var.C0;
                    if ((pullingLeftProgress2 > 1.0f) != (v29Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            fvVar.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    su suVar2 = v29Var.T;
                    if (suVar2 != null) {
                        suVar2.invalidate();
                    }
                    fvVar.invalidate();
                }
                return l0;
            default:
                return super.l0(i, ki2Var, r69Var);
        }
    }

    @Override // u46, f69
    public final int n0(int i, ki2 ki2Var, r69 r69Var) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                wg2 wg2Var = (wg2) obj;
                if (wg2Var.R || wg2Var.O != 0 || wg2Var.F.size() != 0) {
                    break;
                }
                break;
            case 5:
                fja fjaVar = (fja) obj;
                if (i > 0 && fjaVar.O != null) {
                    int i2 = 0;
                    while (i2 < i) {
                        int min = Math.min(i - i2, Math.max(1, Math.round((fjaVar.getHeight() - fjaVar.V) * 0.5f)));
                        float p = fjaVar.p();
                        if (!Float.isInfinite(p)) {
                            min = Math.min(min, Math.max(0, Math.round(p - fjaVar.V)));
                        }
                        if (min == 0) {
                            break;
                        } else {
                            int n0 = super.n0(min, ki2Var, r69Var);
                            i2 += n0;
                            if (n0 < min) {
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
        return super.n0(i, ki2Var, r69Var);
    }

    @Override // f69
    public final void u0(RecyclerView recyclerView, r69 r69Var, int i) {
        switch (this.I) {
            case 1:
                bg4 bg4Var = new bg4(this, recyclerView.getContext());
                bg4Var.a = i;
                v0(bg4Var);
                break;
            case 9:
                qgc qgcVar = new qgc(this, recyclerView.getContext());
                qgcVar.a = i;
                v0(qgcVar);
                break;
            default:
                super.u0(recyclerView, r69Var, i);
                break;
        }
    }

    @Override // u46, f69
    public final boolean x0() {
        switch (this.I) {
            case 1:
                return true;
            case 2:
            case 3:
            case 6:
                return false;
            case 4:
            case 5:
            default:
                return super.x0();
        }
    }

    @Override // u46
    public final void y0(r69 r69Var, int[] iArr) {
        switch (this.I) {
            case 6:
                iArr[1] = ((StickersActivity) this.J).a.getHeight();
                break;
            default:
                super.y0(r69Var, iArr);
                break;
        }
    }

    public /* synthetic */ jg2(byte b, Object obj, boolean z) {
        this.I = b;
        this.J = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jg2(Object obj, byte b) {
        super(1, false);
        this.I = b;
        this.J = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg2(q7c q7cVar, int i) {
        super(i, false);
        this.I = (byte) 7;
        this.J = q7cVar;
    }
}
