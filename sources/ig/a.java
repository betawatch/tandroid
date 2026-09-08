package ig;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.h51;
import org.telegram.ui.co;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Utilities.Callback5, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ a(c cVar, int i10) {
        this.a = i10;
        this.b = cVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
        h51 h51Var = (h51) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final c cVar = this.b;
        if (cVar.d.h(h51Var)) {
            return;
        }
        int i10 = h51Var.d;
        if (i10 == 2 || h51Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", cVar.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            cVar.presentFragment(new co(bundle));
            return;
        }
        if (i10 == 1) {
            cVar.s = !cVar.s;
            cVar.c.Y2.N(true);
            cVar.V(true);
            return;
        }
        if (i10 == 6) {
            a0 a0Var = cVar.d;
            cVar.v = true;
            a0Var.h = true;
            cVar.c.Y2.N(true);
            cVar.V(true);
            return;
        }
        if (i10 == 7) {
            a0 a0Var2 = cVar.d;
            cVar.v = false;
            a0Var2.h = false;
            cVar.c.Y2.N(true);
            cVar.V(true);
            return;
        }
        if (i10 == 3) {
            cVar.x = 0;
            cVar.c.Y2.N(true);
            cVar.V(true);
            return;
        }
        if (i10 == 4) {
            cVar.x = 1;
            cVar.c.Y2.N(true);
            cVar.V(true);
            return;
        }
        if (i10 == 5) {
            cVar.x = 2;
            cVar.c.Y2.N(true);
            cVar.V(true);
            return;
        }
        if (i10 == 8) {
            final int i11 = 0;
            e5.y(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.F, new d5() { // from class: ig.b
                @Override // org.telegram.ui.Components.d5
                public final void J(int i12, int i13, boolean z10) {
                    switch (i11) {
                        case 0:
                            c cVar2 = cVar;
                            cVar2.getClass();
                            r8 r8Var = (r8) view;
                            cVar2.F = i12;
                            r8Var.u(LocaleController.formatShortDateTime(i12), true);
                            cVar2.V(true);
                            break;
                        default:
                            c cVar3 = cVar;
                            cVar3.getClass();
                            r8 r8Var2 = (r8) view;
                            cVar3.G = i12;
                            r8Var2.u(LocaleController.formatShortDateTime(i12), true);
                            cVar3.V(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i10 == 9) {
            final int i12 = 1;
            e5.y(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.G, new d5() { // from class: ig.b
                @Override // org.telegram.ui.Components.d5
                public final void J(int i122, int i13, boolean z10) {
                    switch (i12) {
                        case 0:
                            c cVar2 = cVar;
                            cVar2.getClass();
                            r8 r8Var = (r8) view;
                            cVar2.F = i122;
                            r8Var.u(LocaleController.formatShortDateTime(i122), true);
                            cVar2.V(true);
                            break;
                        default:
                            c cVar3 = cVar;
                            cVar3.getClass();
                            r8 r8Var2 = (r8) view;
                            cVar3.G = i122;
                            r8Var2.u(LocaleController.formatShortDateTime(i122), true);
                            cVar3.V(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i10 == 10) {
            boolean z10 = !cVar.w;
            cVar.w = z10;
            ((w8) view).setChecked(z10);
            cVar.V(true);
        }
    }
}
