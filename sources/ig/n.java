package ig;

import android.view.View;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Wallet.x2;
import org.telegram.ui.Wallet.z2;
import org.telegram.ui.iu;
import org.telegram.ui.lu;
import org.telegram.ui.rn0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class n extends p71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.p71
    public final void b(View view, int i10, int i11) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                iu iuVar = (iu) view;
                iuVar.f3 = i10;
                iuVar.m3.clear();
                iuVar.t3 = iuVar.z1(6) + iuVar.B1(6) <= 0;
                iuVar.C1();
                iuVar.D1(false);
                iuVar.v0(0);
                break;
            case 2:
                break;
            case 3:
                if (view instanceof x2) {
                    ((x2) view).getClass();
                    break;
                }
                break;
            default:
                ((yh.x) view).getClass();
                break;
        }
    }

    @Override // org.telegram.ui.Components.p71
    public final View d(int i10) {
        switch (this.a) {
            case 0:
                ai.b bVar = (ai.b) this.b;
                return i10 != 1 ? i10 != 2 ? (q) bVar.b : (t) bVar.d : (p) bVar.c;
            case 1:
                lu luVar = (lu) this.b;
                iu iuVar = new iu(luVar, luVar.getParentActivity());
                luVar.e.add(iuVar);
                return iuVar;
            case 2:
                rn0 rn0Var = (rn0) this.b;
                if (i10 == 1) {
                    return rn0Var.h;
                }
                if (i10 == 0) {
                    return rn0Var.n;
                }
                return null;
            case 3:
                return (View) ((z2) this.b).j1.get(i10);
            default:
                yh.z zVar = (yh.z) this.b;
                return i10 == 2 ? zVar.t1 : i10 == 0 ? zVar.r1 : zVar.s1;
        }
    }

    @Override // org.telegram.ui.Components.p71
    public final int e() {
        switch (this.a) {
            case 0:
                return 3;
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return ((z2) this.b).j1.size();
            default:
                return ((yh.z) this.b).E1 ? 1 : 3;
        }
    }

    @Override // org.telegram.ui.Components.p71
    public CharSequence g(int i10) {
        switch (this.a) {
            case 0:
                return i10 != 1 ? i10 != 2 ? dd.L0(2131747685, null).toUpperCase() : dd.L0(2131747684, null).toUpperCase() : dd.L0(2131747679, null).toUpperCase();
            case 1:
                return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : dd.L0(2131748309, null) : dd.L0(2131748307, null) : dd.L0(2131748310, null) : dd.L0(2131748311, null);
            default:
                return super.g(i10);
        }
    }

    @Override // org.telegram.ui.Components.p71
    public int h(int i10) {
        switch (this.a) {
            case 0:
            case 2:
            case 3:
                return i10;
            case 1:
            default:
                return super.h(i10);
            case 4:
                if (((yh.z) this.b).E1 || i10 == 2) {
                    return 2;
                }
                return i10 == 0 ? 0 : 1;
        }
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }
}
