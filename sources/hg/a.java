package hg;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.h61;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Utilities.Callback5, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ a(d dVar, int i10) {
        this.a = i10;
        this.b = dVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.W();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        h61 h61Var = (h61) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final d dVar = this.b;
        if (dVar.d.h(h61Var)) {
            return;
        }
        int i10 = h61Var.d;
        if (i10 == 2 || h61Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", dVar.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            dVar.presentFragment(new yn(bundle));
            return;
        }
        if (i10 == 1) {
            dVar.s = !dVar.s;
            dVar.c.f3.N(true);
            dVar.T(true);
            return;
        }
        if (i10 == 6) {
            b0 b0Var = dVar.d;
            dVar.v = true;
            b0Var.h = true;
            dVar.c.f3.N(true);
            dVar.T(true);
            return;
        }
        if (i10 == 7) {
            b0 b0Var2 = dVar.d;
            dVar.v = false;
            b0Var2.h = false;
            dVar.c.f3.N(true);
            dVar.T(true);
            return;
        }
        if (i10 == 3) {
            dVar.x = 0;
            dVar.c.f3.N(true);
            dVar.T(true);
            return;
        }
        if (i10 == 4) {
            dVar.x = 1;
            dVar.c.f3.N(true);
            dVar.T(true);
            return;
        }
        if (i10 == 5) {
            dVar.x = 2;
            dVar.c.f3.N(true);
            dVar.T(true);
            return;
        }
        if (i10 == 8) {
            final int i11 = 0;
            e5.y(dVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), dVar.F, new d5() { // from class: hg.b
                @Override // org.telegram.ui.Components.d5
                public final void K(int i12, int i13, boolean z10) {
                    switch (i11) {
                        case 0:
                            d dVar2 = dVar;
                            dVar2.getClass();
                            r8 r8Var = (r8) view;
                            dVar2.F = i12;
                            r8Var.u(LocaleController.formatShortDateTime(i12), true);
                            dVar2.T(true);
                            break;
                        default:
                            d dVar3 = dVar;
                            dVar3.getClass();
                            r8 r8Var2 = (r8) view;
                            dVar3.G = i12;
                            r8Var2.u(LocaleController.formatShortDateTime(i12), true);
                            dVar3.T(true);
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
                public final void K(int i122, int i13, boolean z10) {
                    switch (i12) {
                        case 0:
                            d dVar2 = dVar;
                            dVar2.getClass();
                            r8 r8Var = (r8) view;
                            dVar2.F = i122;
                            r8Var.u(LocaleController.formatShortDateTime(i122), true);
                            dVar2.T(true);
                            break;
                        default:
                            d dVar3 = dVar;
                            dVar3.getClass();
                            r8 r8Var2 = (r8) view;
                            dVar3.G = i122;
                            r8Var2.u(LocaleController.formatShortDateTime(i122), true);
                            dVar3.T(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i10 == 10) {
            boolean z10 = !dVar.w;
            dVar.w = z10;
            ((w8) view).setChecked(z10);
            dVar.T(true);
        }
    }
}
