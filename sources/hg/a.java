package hg;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.j51;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Utilities.Callback5, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ a(c cVar, int i10) {
        this.a = i10;
        this.b = cVar;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
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
        j51 j51Var = (j51) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final c cVar = this.b;
        if (cVar.d.h(j51Var)) {
            return;
        }
        int i10 = j51Var.d;
        if (i10 == 2 || j51Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", cVar.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            cVar.presentFragment(new bo(bundle));
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
            c5.y(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.F, new b5() { // from class: hg.b
                @Override // org.telegram.ui.Components.b5
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
            c5.y(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.G, new b5() { // from class: hg.b
                @Override // org.telegram.ui.Components.b5
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
