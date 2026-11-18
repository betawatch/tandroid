package kg;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.gd;
import org.telegram.messenger.v10;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z4;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements v10, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ a(c cVar, int i7) {
        this.a = i7;
        this.b = cVar;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                this.b.c0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        l41 l41Var = (l41) obj;
        final View view = (View) obj2;
        final c cVar = this.b;
        if (cVar.c.h(l41Var)) {
            return;
        }
        int i7 = l41Var.d;
        if (i7 == 2 || l41Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", cVar.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            cVar.presentFragment(new bn(bundle));
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
                b5.x(cVar.getParentActivity(), gd.M0(2131752812, null), gd.M0(2131752814, null), cVar.F, new z4() { // from class: kg.b
                    @Override // org.telegram.ui.Components.z4
                    public final void O(int i12, int i13, boolean z10) {
                        switch (i11) {
                            case 0:
                                c cVar2 = cVar;
                                cVar2.getClass();
                                n8 n8Var = (n8) view;
                                cVar2.F = i12;
                                n8Var.w(gd.Q(i12), true);
                                cVar2.a0(true);
                                break;
                            default:
                                c cVar3 = cVar;
                                cVar3.getClass();
                                n8 n8Var2 = (n8) view;
                                cVar3.G = i12;
                                n8Var2.w(gd.Q(i12), true);
                                cVar3.a0(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i7 == 9) {
                b5.x(cVar.getParentActivity(), gd.M0(2131752815, null), gd.M0(2131752814, null), cVar.G, new z4() { // from class: kg.b
                    @Override // org.telegram.ui.Components.z4
                    public final void O(int i12, int i13, boolean z10) {
                        switch (i10) {
                            case 0:
                                c cVar2 = cVar;
                                cVar2.getClass();
                                n8 n8Var = (n8) view;
                                cVar2.F = i12;
                                n8Var.w(gd.Q(i12), true);
                                cVar2.a0(true);
                                break;
                            default:
                                c cVar3 = cVar;
                                cVar3.getClass();
                                n8 n8Var2 = (n8) view;
                                cVar3.G = i12;
                                n8Var2.w(gd.Q(i12), true);
                                cVar3.a0(true);
                                break;
                        }
                    }
                });
            } else if (i7 == 10) {
                boolean z10 = !cVar.w;
                cVar.w = z10;
                ((s8) view).setChecked(z10);
                cVar.a0(true);
            }
        }
    }
}
