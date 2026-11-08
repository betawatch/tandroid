package kg;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.messenger.id;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.x31;
import org.telegram.ui.an;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements a20, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ a(c cVar, int i7) {
        this.a = i7;
        this.b = cVar;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                this.b.c0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        x31 x31Var = (x31) obj;
        final View view = (View) obj2;
        final c cVar = this.b;
        if (cVar.c.h(x31Var)) {
            return;
        }
        int i7 = x31Var.d;
        if (i7 == 2 || x31Var.a == 17) {
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
            cVar.b.f3.O(true);
            cVar.a0(true);
            return;
        }
        if (i7 == 6) {
            a0 a0Var = cVar.c;
            cVar.s = true;
            a0Var.h = true;
            cVar.b.f3.O(true);
            cVar.a0(true);
            return;
        }
        final int i11 = 0;
        if (i7 == 7) {
            a0 a0Var2 = cVar.c;
            cVar.s = false;
            a0Var2.h = false;
            cVar.b.f3.O(true);
            cVar.a0(true);
            return;
        }
        if (i7 == 3) {
            cVar.x = 0;
            cVar.b.f3.O(true);
            cVar.a0(true);
            return;
        }
        if (i7 == 4) {
            cVar.x = 1;
            cVar.b.f3.O(true);
            cVar.a0(true);
            return;
        }
        if (i7 == 5) {
            cVar.x = 2;
            cVar.b.f3.O(true);
            cVar.a0(true);
        } else {
            if (i7 == 8) {
                v4.x(cVar.getParentActivity(), id.M0(2131752823, null), id.M0(2131752825, null), cVar.E, new t4() { // from class: kg.b
                    @Override // org.telegram.ui.Components.t4
                    public final void L(int i12, int i13, boolean z9) {
                        switch (i11) {
                            case 0:
                                c cVar2 = cVar;
                                cVar2.getClass();
                                m8 m8Var = (m8) view;
                                cVar2.E = i12;
                                m8Var.w(id.Q(i12), true);
                                cVar2.a0(true);
                                break;
                            default:
                                c cVar3 = cVar;
                                cVar3.getClass();
                                m8 m8Var2 = (m8) view;
                                cVar3.F = i12;
                                m8Var2.w(id.Q(i12), true);
                                cVar3.a0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i7 == 9) {
                v4.x(cVar.getParentActivity(), id.M0(2131752826, null), id.M0(2131752825, null), cVar.F, new t4() { // from class: kg.b
                    @Override // org.telegram.ui.Components.t4
                    public final void L(int i12, int i13, boolean z9) {
                        switch (i10) {
                            case 0:
                                c cVar2 = cVar;
                                cVar2.getClass();
                                m8 m8Var = (m8) view;
                                cVar2.E = i12;
                                m8Var.w(id.Q(i12), true);
                                cVar2.a0(true);
                                break;
                            default:
                                c cVar3 = cVar;
                                cVar3.getClass();
                                m8 m8Var2 = (m8) view;
                                cVar3.F = i12;
                                m8Var2.w(id.Q(i12), true);
                                cVar3.a0(true);
                                break;
                        }
                    }
                });
            } else if (i7 == 10) {
                boolean z9 = !cVar.w;
                cVar.w = z9;
                ((r8) view).setChecked(z9);
                cVar.a0(true);
            }
        }
    }
}
