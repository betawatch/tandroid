package kg;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.hd;
import org.telegram.messenger.x10;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.t4;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements x10, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ a(c cVar, int i7) {
        this.a = i7;
        this.b = cVar;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                this.b.c0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.x10
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        b41 b41Var = (b41) obj;
        final View view = (View) obj2;
        final c cVar = this.b;
        if (cVar.c.h(b41Var)) {
            return;
        }
        int i7 = b41Var.d;
        if (i7 == 2 || b41Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", cVar.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            cVar.presentFragment(new an(bundle));
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
            a0 a0Var = cVar.c;
            cVar.s = true;
            a0Var.h = true;
            cVar.b.g3.O(true);
            cVar.a0(true);
            return;
        }
        final int i11 = 0;
        if (i7 == 7) {
            a0 a0Var2 = cVar.c;
            cVar.s = false;
            a0Var2.h = false;
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
                t4.x(cVar.getParentActivity(), hd.M0(2131752823, null), hd.M0(2131752825, null), cVar.F, new r4() { // from class: kg.b
                    @Override // org.telegram.ui.Components.r4
                    public final void L(int i12, int i13, boolean z10) {
                        switch (i11) {
                            case 0:
                                c cVar2 = cVar;
                                cVar2.getClass();
                                l8 l8Var = (l8) view;
                                cVar2.F = i12;
                                l8Var.w(hd.Q(i12), true);
                                cVar2.a0(true);
                                break;
                            default:
                                c cVar3 = cVar;
                                cVar3.getClass();
                                l8 l8Var2 = (l8) view;
                                cVar3.G = i12;
                                l8Var2.w(hd.Q(i12), true);
                                cVar3.a0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i7 == 9) {
                t4.x(cVar.getParentActivity(), hd.M0(2131752826, null), hd.M0(2131752825, null), cVar.G, new r4() { // from class: kg.b
                    @Override // org.telegram.ui.Components.r4
                    public final void L(int i12, int i13, boolean z10) {
                        switch (i10) {
                            case 0:
                                c cVar2 = cVar;
                                cVar2.getClass();
                                l8 l8Var = (l8) view;
                                cVar2.F = i12;
                                l8Var.w(hd.Q(i12), true);
                                cVar2.a0(true);
                                break;
                            default:
                                c cVar3 = cVar;
                                cVar3.getClass();
                                l8 l8Var2 = (l8) view;
                                cVar3.G = i12;
                                l8Var2.w(hd.Q(i12), true);
                                cVar3.a0(true);
                                break;
                        }
                    }
                });
            } else if (i7 == 10) {
                boolean z10 = !cVar.w;
                cVar.w = z10;
                ((q8) view).setChecked(z10);
                cVar.a0(true);
            }
        }
    }
}
