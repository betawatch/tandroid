package ig;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.m61;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Utilities.Callback5, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ a(c cVar, int i10) {
        this.a = i10;
        this.b = cVar;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.X();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        m61 m61Var = (m61) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final c cVar = this.b;
        if (cVar.e.h(m61Var)) {
            return;
        }
        int i10 = m61Var.d;
        if (i10 == 2 || m61Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", cVar.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            cVar.presentFragment(new sn(bundle));
            return;
        }
        if (i10 == 1) {
            cVar.v = !cVar.v;
            cVar.d.Z2.N(true);
            cVar.V(true);
            return;
        }
        if (i10 == 6) {
            a0 a0Var = cVar.e;
            cVar.w = true;
            a0Var.h = true;
            cVar.d.Z2.N(true);
            cVar.V(true);
            return;
        }
        if (i10 == 7) {
            a0 a0Var2 = cVar.e;
            cVar.w = false;
            a0Var2.h = false;
            cVar.d.Z2.N(true);
            cVar.V(true);
            return;
        }
        if (i10 == 3) {
            cVar.y = 0;
            cVar.d.Z2.N(true);
            cVar.V(true);
            return;
        }
        if (i10 == 4) {
            cVar.y = 1;
            cVar.d.Z2.N(true);
            cVar.V(true);
            return;
        }
        if (i10 == 5) {
            cVar.y = 2;
            cVar.d.Z2.N(true);
            cVar.V(true);
            return;
        }
        if (i10 == 8) {
            final int i11 = 0;
            f5.y(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.G, new d5() { // from class: ig.b
                @Override // org.telegram.ui.Components.d5
                public final void C(int i12, int i13, boolean z10) {
                    switch (i11) {
                        case 0:
                            c cVar2 = cVar;
                            cVar2.getClass();
                            r8 r8Var = (r8) view;
                            cVar2.G = i12;
                            r8Var.w(LocaleController.formatShortDateTime(i12), true);
                            cVar2.V(true);
                            break;
                        default:
                            c cVar3 = cVar;
                            cVar3.getClass();
                            r8 r8Var2 = (r8) view;
                            cVar3.H = i12;
                            r8Var2.w(LocaleController.formatShortDateTime(i12), true);
                            cVar3.V(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i10 == 9) {
            final int i12 = 1;
            f5.y(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.H, new d5() { // from class: ig.b
                @Override // org.telegram.ui.Components.d5
                public final void C(int i122, int i13, boolean z10) {
                    switch (i12) {
                        case 0:
                            c cVar2 = cVar;
                            cVar2.getClass();
                            r8 r8Var = (r8) view;
                            cVar2.G = i122;
                            r8Var.w(LocaleController.formatShortDateTime(i122), true);
                            cVar2.V(true);
                            break;
                        default:
                            c cVar3 = cVar;
                            cVar3.getClass();
                            r8 r8Var2 = (r8) view;
                            cVar3.H = i122;
                            r8Var2.w(LocaleController.formatShortDateTime(i122), true);
                            cVar3.V(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i10 == 10) {
            boolean z10 = !cVar.x;
            cVar.x = z10;
            ((w8) view).setChecked(z10);
            cVar.V(true);
        }
    }
}
