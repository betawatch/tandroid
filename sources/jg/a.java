package jg;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.u61;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Utilities.Callback5, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ a(c cVar, int i10) {
        this.a = i10;
        this.b = cVar;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.Y();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        u61 u61Var = (u61) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final c cVar = this.b;
        if (cVar.c.h(u61Var)) {
            return;
        }
        int i10 = u61Var.d;
        if (i10 == 2 || u61Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", cVar.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            cVar.presentFragment(new wn(bundle));
            return;
        }
        if (i10 == 1) {
            cVar.r = !cVar.r;
            cVar.b.g3.O(true);
            cVar.W(true);
            return;
        }
        if (i10 == 6) {
            b0 b0Var = cVar.c;
            cVar.s = true;
            b0Var.h = true;
            cVar.b.g3.O(true);
            cVar.W(true);
            return;
        }
        if (i10 == 7) {
            b0 b0Var2 = cVar.c;
            cVar.s = false;
            b0Var2.h = false;
            cVar.b.g3.O(true);
            cVar.W(true);
            return;
        }
        if (i10 == 3) {
            cVar.w = 0;
            cVar.b.g3.O(true);
            cVar.W(true);
            return;
        }
        if (i10 == 4) {
            cVar.w = 1;
            cVar.b.g3.O(true);
            cVar.W(true);
            return;
        }
        if (i10 == 5) {
            cVar.w = 2;
            cVar.b.g3.O(true);
            cVar.W(true);
            return;
        }
        if (i10 == 8) {
            final int i11 = 0;
            g5.x(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.E, new e5() { // from class: jg.b
                @Override // org.telegram.ui.Components.e5
                public final void G(int i12, int i13, boolean z10) {
                    switch (i11) {
                        case 0:
                            c cVar2 = cVar;
                            cVar2.getClass();
                            v8 v8Var = (v8) view;
                            cVar2.E = i12;
                            v8Var.w(LocaleController.formatShortDateTime(i12), true);
                            cVar2.W(true);
                            break;
                        default:
                            c cVar3 = cVar;
                            cVar3.getClass();
                            v8 v8Var2 = (v8) view;
                            cVar3.F = i12;
                            v8Var2.w(LocaleController.formatShortDateTime(i12), true);
                            cVar3.W(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i10 == 9) {
            final int i12 = 1;
            g5.x(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.F, new e5() { // from class: jg.b
                @Override // org.telegram.ui.Components.e5
                public final void G(int i122, int i13, boolean z10) {
                    switch (i12) {
                        case 0:
                            c cVar2 = cVar;
                            cVar2.getClass();
                            v8 v8Var = (v8) view;
                            cVar2.E = i122;
                            v8Var.w(LocaleController.formatShortDateTime(i122), true);
                            cVar2.W(true);
                            break;
                        default:
                            c cVar3 = cVar;
                            cVar3.getClass();
                            v8 v8Var2 = (v8) view;
                            cVar3.F = i122;
                            v8Var2.w(LocaleController.formatShortDateTime(i122), true);
                            cVar3.W(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i10 == 10) {
            boolean z10 = !cVar.v;
            cVar.v = z10;
            ((a9) view).setChecked(z10);
            cVar.W(true);
        }
    }
}
