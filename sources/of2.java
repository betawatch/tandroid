// default package

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class of2 extends x46 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ of2(ViewGroup viewGroup, byte b) {
        super(0, false);
        this.I = b;
        this.J = viewGroup;
    }

    @Override // q79
    public final void R(oh2 oh2Var, c89 c89Var, v4 v4Var) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 2:
                super.R(oh2Var, c89Var, v4Var);
                if (!((rh4) obj).isEnabled()) {
                    v4Var.p(false);
                    break;
                }
                break;
            case 9:
                super.R(oh2Var, c89Var, v4Var);
                if (((uic) obj).W) {
                    v4Var.p(false);
                    break;
                }
                break;
            default:
                super.R(oh2Var, c89Var, v4Var);
                break;
        }
    }

    @Override // x46
    public final int V0(c89 c89Var) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 7:
                if (!((q9c) obj).i3) {
                    break;
                } else {
                    break;
                }
            case 8:
                if (!((z0c) obj).i3) {
                    break;
                } else {
                    break;
                }
        }
        return super.V0(c89Var);
    }

    @Override // x46
    public final void j1(boolean z) {
        switch (this.I) {
            case 3:
                super.j1(z);
                ((b27) this.J).b.setTranslationY(hl.L(6.0f) * (z ? -1 : 1));
                break;
            default:
                super.j1(z);
                break;
        }
    }

    @Override // x46, q79
    public final int l0(int i, oh2 oh2Var, c89 c89Var) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 1:
                if (((fg4) obj).K.i()) {
                    i = 0;
                }
                return super.l0(i, oh2Var, c89Var);
            case 4:
                i49 i49Var = (i49) obj;
                gu guVar = i49Var.b;
                if (i < 0 && i49Var.C0 != 0.0f) {
                    float pullingLeftProgress = i49Var.getPullingLeftProgress();
                    i49Var.C0 += i;
                    if ((pullingLeftProgress > 1.0f) != (i49Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            guVar.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f = i49Var.C0;
                    if (f < 0.0f) {
                        i = (int) f;
                        i49Var.C0 = 0.0f;
                    } else {
                        i = 0;
                    }
                    tt ttVar = i49Var.T;
                    if (ttVar != null) {
                        ttVar.invalidate();
                    }
                    guVar.invalidate();
                }
                int l0 = super.l0(i, oh2Var, c89Var);
                if (i > 0 && l0 == 0 && guVar.getScrollState() == 1 && i49Var.n()) {
                    ValueAnimator valueAnimator = i49Var.z0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        i49Var.z0.cancel();
                    }
                    float pullingLeftProgress2 = i49Var.getPullingLeftProgress();
                    i49Var.C0 = (i * (pullingLeftProgress2 > 1.0f ? 0.05f : 0.6f)) + i49Var.C0;
                    if ((pullingLeftProgress2 > 1.0f) != (i49Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            guVar.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    tt ttVar2 = i49Var.T;
                    if (ttVar2 != null) {
                        ttVar2.invalidate();
                    }
                    guVar.invalidate();
                }
                return l0;
            default:
                return super.l0(i, oh2Var, c89Var);
        }
    }

    @Override // x46, q79
    public final int n0(int i, oh2 oh2Var, c89 c89Var) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                bg2 bg2Var = (bg2) obj;
                if (bg2Var.R || bg2Var.O != 0 || bg2Var.F.size() != 0) {
                    break;
                }
                break;
            case 5:
                wka wkaVar = (wka) obj;
                if (i > 0 && wkaVar.O != null) {
                    int i2 = 0;
                    while (i2 < i) {
                        int min = Math.min(i - i2, Math.max(1, Math.round((wkaVar.getHeight() - wkaVar.V) * 0.5f)));
                        float p = wkaVar.p();
                        if (!Float.isInfinite(p)) {
                            min = Math.min(min, Math.max(0, Math.round(p - wkaVar.V)));
                        }
                        if (min == 0) {
                            break;
                        } else {
                            int n0 = super.n0(min, oh2Var, c89Var);
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
        return super.n0(i, oh2Var, c89Var);
    }

    @Override // q79
    public final void u0(RecyclerView recyclerView, c89 c89Var, int i) {
        switch (this.I) {
            case 1:
                yf4 yf4Var = new yf4(this, recyclerView.getContext());
                yf4Var.a = i;
                v0(yf4Var);
                break;
            case 9:
                pic picVar = new pic(this, recyclerView.getContext());
                picVar.a = i;
                v0(picVar);
                break;
            default:
                super.u0(recyclerView, c89Var, i);
                break;
        }
    }

    @Override // x46, q79
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

    @Override // x46
    public final void y0(c89 c89Var, int[] iArr) {
        switch (this.I) {
            case 6:
                iArr[1] = ((StickersActivity) this.J).a.getHeight();
                break;
            default:
                super.y0(c89Var, iArr);
                break;
        }
    }

    public /* synthetic */ of2(byte b, Object obj, boolean z) {
        this.I = b;
        this.J = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ of2(Object obj, byte b) {
        super(1, false);
        this.I = b;
        this.J = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of2(q9c q9cVar, int i) {
        super(i, false);
        this.I = (byte) 7;
        this.J = q9cVar;
    }
}
