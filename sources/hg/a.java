package hg;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.h51;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Utilities.Callback5, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ a(d dVar, int i10) {
        this.a = i10;
        this.b = dVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
        final d dVar = this.b;
        if (dVar.d.h(h51Var)) {
            return;
        }
        int i10 = h51Var.d;
        if (i10 == 2 || h51Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", dVar.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            dVar.presentFragment(new xn(bundle));
            return;
        }
        if (i10 == 1) {
            dVar.s = !dVar.s;
            dVar.c.Y2.N(true);
            dVar.V(true);
            return;
        }
        if (i10 == 6) {
            c0 c0Var = dVar.d;
            dVar.v = true;
            c0Var.h = true;
            dVar.c.Y2.N(true);
            dVar.V(true);
            return;
        }
        if (i10 == 7) {
            c0 c0Var2 = dVar.d;
            dVar.v = false;
            c0Var2.h = false;
            dVar.c.Y2.N(true);
            dVar.V(true);
            return;
        }
        if (i10 == 3) {
            dVar.x = 0;
            dVar.c.Y2.N(true);
            dVar.V(true);
            return;
        }
        if (i10 == 4) {
            dVar.x = 1;
            dVar.c.Y2.N(true);
            dVar.V(true);
            return;
        }
        if (i10 == 5) {
            dVar.x = 2;
            dVar.c.Y2.N(true);
            dVar.V(true);
            return;
        }
        if (i10 == 8) {
            final int i11 = 0;
            e5.y(dVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), dVar.F, new d5() { // from class: hg.b
                @Override // org.telegram.ui.Components.d5
                public final void J(int i12, int i13, boolean z10) {
                    switch (i11) {
                        case 0:
                            d dVar2 = dVar;
                            dVar2.getClass();
                            s8 s8Var = (s8) view;
                            dVar2.F = i12;
                            s8Var.u(LocaleController.formatShortDateTime(i12), true);
                            dVar2.V(true);
                            break;
                        default:
                            d dVar3 = dVar;
                            dVar3.getClass();
                            s8 s8Var2 = (s8) view;
                            dVar3.G = i12;
                            s8Var2.u(LocaleController.formatShortDateTime(i12), true);
                            dVar3.V(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i10 == 9) {
            final int i12 = 1;
            e5.y(dVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), dVar.G, new d5() { // from class: hg.b
                @Override // org.telegram.ui.Components.d5
                public final void J(int i122, int i13, boolean z10) {
                    switch (i12) {
                        case 0:
                            d dVar2 = dVar;
                            dVar2.getClass();
                            s8 s8Var = (s8) view;
                            dVar2.F = i122;
                            s8Var.u(LocaleController.formatShortDateTime(i122), true);
                            dVar2.V(true);
                            break;
                        default:
                            d dVar3 = dVar;
                            dVar3.getClass();
                            s8 s8Var2 = (s8) view;
                            dVar3.G = i122;
                            s8Var2.u(LocaleController.formatShortDateTime(i122), true);
                            dVar3.V(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i10 == 10) {
            boolean z10 = !dVar.w;
            dVar.w = z10;
            ((x8) view).setChecked(z10);
            dVar.V(true);
        }
    }
}
