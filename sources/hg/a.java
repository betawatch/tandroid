package hg;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.w51;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Utilities.Callback5, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ a(c cVar, int i10) {
        this.a = i10;
        this.b = cVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
        w51 w51Var = (w51) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final c cVar = this.b;
        if (cVar.d.h(w51Var)) {
            return;
        }
        int i10 = w51Var.d;
        if (i10 == 2 || w51Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", cVar.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            cVar.presentFragment(new zn(bundle));
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
            d5.y(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.F, new c5() { // from class: hg.b
                @Override // org.telegram.ui.Components.c5
                public final void J(int i12, int i13, boolean z10) {
                    switch (i11) {
                        case 0:
                            c cVar2 = cVar;
                            cVar2.getClass();
                            s8 s8Var = (s8) view;
                            cVar2.F = i12;
                            s8Var.u(LocaleController.formatShortDateTime(i12), true);
                            cVar2.V(true);
                            break;
                        default:
                            c cVar3 = cVar;
                            cVar3.getClass();
                            s8 s8Var2 = (s8) view;
                            cVar3.G = i12;
                            s8Var2.u(LocaleController.formatShortDateTime(i12), true);
                            cVar3.V(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i10 == 9) {
            final int i12 = 1;
            d5.y(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.G, new c5() { // from class: hg.b
                @Override // org.telegram.ui.Components.c5
                public final void J(int i122, int i13, boolean z10) {
                    switch (i12) {
                        case 0:
                            c cVar2 = cVar;
                            cVar2.getClass();
                            s8 s8Var = (s8) view;
                            cVar2.F = i122;
                            s8Var.u(LocaleController.formatShortDateTime(i122), true);
                            cVar2.V(true);
                            break;
                        default:
                            c cVar3 = cVar;
                            cVar3.getClass();
                            s8 s8Var2 = (s8) view;
                            cVar3.G = i122;
                            s8Var2.u(LocaleController.formatShortDateTime(i122), true);
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
            ((x8) view).setChecked(z10);
            cVar.V(true);
        }
    }
}
