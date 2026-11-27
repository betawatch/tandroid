// default package

import java.util.List;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class in4 implements pcc {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ rx1 b;
    public final /* synthetic */ wk5 c;

    public /* synthetic */ in4(rx1 rx1Var, wk5 wk5Var) {
        this.b = rx1Var;
        this.c = wk5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    @Override // pcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        boolean z;
        byte b = this.a;
        wk5 wk5Var = this.c;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                List fragmentStack = wk5Var.getFragmentStack();
                boolean z2 = true;
                e eVar = null;
                for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                    eVar = (e) fragmentStack.get(size);
                    if (!(eVar instanceof uj3) && !(eVar instanceof fj6)) {
                        if (z2) {
                            eVar.finishFragment();
                            z2 = false;
                        } else {
                            eVar.removeSelfFromStack();
                        }
                    }
                    e eVar2 = eVar;
                    e eVar3 = !(eVar2 instanceof fj6) ? ((fj6) eVar2).M : eVar2;
                    z = eVar3 instanceof uj3;
                    rx1 rx1Var = this.b;
                    if (z) {
                        rx1Var.a(eVar2);
                        break;
                    } else {
                        uj3 uj3Var = (uj3) eVar3;
                        uj3Var.g3();
                        hl.d3(new ao1(uj3Var, num, rx1Var, eVar2, (byte) 21), 80L);
                        break;
                    }
                }
                e eVar22 = eVar;
                if (!(eVar22 instanceof fj6)) {
                }
                z = eVar3 instanceof uj3;
                rx1 rx1Var2 = this.b;
                if (z) {
                }
                break;
            default:
                this.b.a(wk5Var.getLastFragment());
                break;
        }
    }

    public /* synthetic */ in4(wk5 wk5Var, rx1 rx1Var) {
        this.c = wk5Var;
        this.b = rx1Var;
    }
}
