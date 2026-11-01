package ag;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.dd;
import org.telegram.messenger.p20;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.s4;
import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements p20, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ b(f fVar, int i10) {
        this.a = i10;
        this.b = fVar;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.c0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.p20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        b51 b51Var = (b51) obj;
        final View view = (View) obj2;
        final f fVar = this.b;
        if (fVar.c.h(b51Var)) {
            return;
        }
        int i10 = b51Var.d;
        if (i10 == 2 || b51Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", fVar.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            fVar.presentFragment(new un(bundle));
            return;
        }
        final int i11 = 1;
        if (i10 == 1) {
            fVar.r = !fVar.r;
            fVar.b.f3.O(true);
            fVar.a0(true);
            return;
        }
        if (i10 == 6) {
            x0 x0Var = fVar.c;
            fVar.s = true;
            x0Var.h = true;
            fVar.b.f3.O(true);
            fVar.a0(true);
            return;
        }
        final int i12 = 0;
        if (i10 == 7) {
            x0 x0Var2 = fVar.c;
            fVar.s = false;
            x0Var2.h = false;
            fVar.b.f3.O(true);
            fVar.a0(true);
            return;
        }
        if (i10 == 3) {
            fVar.x = 0;
            fVar.b.f3.O(true);
            fVar.a0(true);
            return;
        }
        if (i10 == 4) {
            fVar.x = 1;
            fVar.b.f3.O(true);
            fVar.a0(true);
            return;
        }
        if (i10 == 5) {
            fVar.x = 2;
            fVar.b.f3.O(true);
            fVar.a0(true);
        } else {
            if (i10 == 8) {
                s4.x(fVar.getParentActivity(), dd.L0(2131752823, null), dd.L0(2131752825, null), fVar.E, new q4() { // from class: ag.d
                    @Override // org.telegram.ui.Components.q4
                    public final void K(int i13, int i14, boolean z10) {
                        switch (i12) {
                            case 0:
                                f fVar2 = fVar;
                                fVar2.getClass();
                                p8 p8Var = (p8) view;
                                fVar2.E = i13;
                                p8Var.w(dd.Q(i13), true);
                                fVar2.a0(true);
                                break;
                            default:
                                f fVar3 = fVar;
                                fVar3.getClass();
                                p8 p8Var2 = (p8) view;
                                fVar3.F = i13;
                                p8Var2.w(dd.Q(i13), true);
                                fVar3.a0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == 9) {
                s4.x(fVar.getParentActivity(), dd.L0(2131752826, null), dd.L0(2131752825, null), fVar.F, new q4() { // from class: ag.d
                    @Override // org.telegram.ui.Components.q4
                    public final void K(int i13, int i14, boolean z10) {
                        switch (i11) {
                            case 0:
                                f fVar2 = fVar;
                                fVar2.getClass();
                                p8 p8Var = (p8) view;
                                fVar2.E = i13;
                                p8Var.w(dd.Q(i13), true);
                                fVar2.a0(true);
                                break;
                            default:
                                f fVar3 = fVar;
                                fVar3.getClass();
                                p8 p8Var2 = (p8) view;
                                fVar3.F = i13;
                                p8Var2.w(dd.Q(i13), true);
                                fVar3.a0(true);
                                break;
                        }
                    }
                });
            } else if (i10 == 10) {
                boolean z10 = !fVar.w;
                fVar.w = z10;
                ((t8) view).setChecked(z10);
                fVar.a0(true);
            }
        }
    }
}
