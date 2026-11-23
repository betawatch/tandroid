package kg;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.gd;
import org.telegram.messenger.u10;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.z4;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements u10, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ a(c cVar, int i7) {
        this.a = i7;
        this.b = cVar;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                this.b.c0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.u10
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        n41 n41Var = (n41) obj;
        final View view = (View) obj2;
        final c cVar = this.b;
        if (cVar.c.h(n41Var)) {
            return;
        }
        int i7 = n41Var.d;
        if (i7 == 2 || n41Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", cVar.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            cVar.presentFragment(new bn(bundle));
            return;
        }
        final int i10 = 1;
        if (i7 == 1) {
            cVar.r = !cVar.r;
            cVar.b.g3.O(true);
            cVar.a0(true);
            return;
        }
        if (i7 == 6) {
            b0 b0Var = cVar.c;
            cVar.s = true;
            b0Var.h = true;
            cVar.b.g3.O(true);
            cVar.a0(true);
            return;
        }
        final int i11 = 0;
        if (i7 == 7) {
            b0 b0Var2 = cVar.c;
            cVar.s = false;
            b0Var2.h = false;
            cVar.b.g3.O(true);
            cVar.a0(true);
            return;
        }
        if (i7 == 3) {
            cVar.x = 0;
            cVar.b.g3.O(true);
            cVar.a0(true);
            return;
        }
        if (i7 == 4) {
            cVar.x = 1;
            cVar.b.g3.O(true);
            cVar.a0(true);
            return;
        }
        if (i7 == 5) {
            cVar.x = 2;
            cVar.b.g3.O(true);
            cVar.a0(true);
        } else {
            if (i7 == 8) {
                b5.x(cVar.getParentActivity(), gd.N0(2131752811, null), gd.N0(2131752813, null), cVar.F, new z4() { // from class: kg.b
                    @Override // org.telegram.ui.Components.z4
                    public final void I(int i12, int i13, boolean z10) {
                        switch (i11) {
                            case 0:
                                c cVar2 = cVar;
                                cVar2.getClass();
                                m8 m8Var = (m8) view;
                                cVar2.F = i12;
                                m8Var.w(gd.Q(i12), true);
                                cVar2.a0(true);
                                break;
                            default:
                                c cVar3 = cVar;
                                cVar3.getClass();
                                m8 m8Var2 = (m8) view;
                                cVar3.G = i12;
                                m8Var2.w(gd.Q(i12), true);
                                cVar3.a0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i7 == 9) {
                b5.x(cVar.getParentActivity(), gd.N0(2131752814, null), gd.N0(2131752813, null), cVar.G, new z4() { // from class: kg.b
                    @Override // org.telegram.ui.Components.z4
                    public final void I(int i12, int i13, boolean z10) {
                        switch (i10) {
                            case 0:
                                c cVar2 = cVar;
                                cVar2.getClass();
                                m8 m8Var = (m8) view;
                                cVar2.F = i12;
                                m8Var.w(gd.Q(i12), true);
                                cVar2.a0(true);
                                break;
                            default:
                                c cVar3 = cVar;
                                cVar3.getClass();
                                m8 m8Var2 = (m8) view;
                                cVar3.G = i12;
                                m8Var2.w(gd.Q(i12), true);
                                cVar3.a0(true);
                                break;
                        }
                    }
                });
            } else if (i7 == 10) {
                boolean z10 = !cVar.w;
                cVar.w = z10;
                ((r8) view).setChecked(z10);
                cVar.a0(true);
            }
        }
    }
}
