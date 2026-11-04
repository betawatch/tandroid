package lg;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.bd;
import org.telegram.messenger.s10;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.t4;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements s10, org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ a(c cVar, int i3) {
        this.a = i3;
        this.b = cVar;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 1:
                this.b.c0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.s10
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        r31 r31Var = (r31) obj;
        final View view = (View) obj2;
        final c cVar = this.b;
        if (cVar.c.h(r31Var)) {
            return;
        }
        int i3 = r31Var.d;
        if (i3 == 2 || r31Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", cVar.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            cVar.presentFragment(new wm(bundle));
            return;
        }
        final int i10 = 1;
        if (i3 == 1) {
            cVar.r = !cVar.r;
            cVar.b.g3.O(true);
            cVar.a0(true);
            return;
        }
        if (i3 == 6) {
            b0 b0Var = cVar.c;
            cVar.s = true;
            b0Var.h = true;
            cVar.b.g3.O(true);
            cVar.a0(true);
            return;
        }
        final int i11 = 0;
        if (i3 == 7) {
            b0 b0Var2 = cVar.c;
            cVar.s = false;
            b0Var2.h = false;
            cVar.b.g3.O(true);
            cVar.a0(true);
            return;
        }
        if (i3 == 3) {
            cVar.x = 0;
            cVar.b.g3.O(true);
            cVar.a0(true);
            return;
        }
        if (i3 == 4) {
            cVar.x = 1;
            cVar.b.g3.O(true);
            cVar.a0(true);
            return;
        }
        if (i3 == 5) {
            cVar.x = 2;
            cVar.b.g3.O(true);
            cVar.a0(true);
        } else {
            if (i3 == 8) {
                t4.x(cVar.getParentActivity(), bd.M0(2131752823, null), bd.M0(2131752825, null), cVar.F, new r4() { // from class: lg.b
                    @Override // org.telegram.ui.Components.r4
                    public final void L(int i12, int i13, boolean z10) {
                        switch (i11) {
                            case 0:
                                c cVar2 = cVar;
                                cVar2.getClass();
                                l8 l8Var = (l8) view;
                                cVar2.F = i12;
                                l8Var.w(bd.Q(i12), true);
                                cVar2.a0(true);
                                break;
                            default:
                                c cVar3 = cVar;
                                cVar3.getClass();
                                l8 l8Var2 = (l8) view;
                                cVar3.G = i12;
                                l8Var2.w(bd.Q(i12), true);
                                cVar3.a0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i3 == 9) {
                t4.x(cVar.getParentActivity(), bd.M0(2131752826, null), bd.M0(2131752825, null), cVar.G, new r4() { // from class: lg.b
                    @Override // org.telegram.ui.Components.r4
                    public final void L(int i12, int i13, boolean z10) {
                        switch (i10) {
                            case 0:
                                c cVar2 = cVar;
                                cVar2.getClass();
                                l8 l8Var = (l8) view;
                                cVar2.F = i12;
                                l8Var.w(bd.Q(i12), true);
                                cVar2.a0(true);
                                break;
                            default:
                                c cVar3 = cVar;
                                cVar3.getClass();
                                l8 l8Var2 = (l8) view;
                                cVar3.G = i12;
                                l8Var2.w(bd.Q(i12), true);
                                cVar3.a0(true);
                                break;
                        }
                    }
                });
            } else if (i3 == 10) {
                boolean z10 = !cVar.w;
                cVar.w = z10;
                ((q8) view).setChecked(z10);
                cVar.a0(true);
            }
        }
    }
}
