// default package

import java.util.List;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class dl4 implements p8c {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ ui5 b;
    public final /* synthetic */ pz1 c;

    public /* synthetic */ dl4(pz1 pz1Var, ui5 ui5Var) {
        this.c = pz1Var;
        this.b = ui5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    @Override // p8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        boolean z;
        byte b = this.a;
        ui5 ui5Var = this.b;
        switch (b) {
            case 0:
                this.c.a(ui5Var.getLastFragment());
                break;
            default:
                Integer num = (Integer) obj;
                List fragmentStack = ui5Var.getFragmentStack();
                boolean z2 = true;
                d dVar = null;
                for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                    dVar = (d) fragmentStack.get(size);
                    if (!(dVar instanceof cj3) && !(dVar instanceof ah6)) {
                        if (z2) {
                            dVar.finishFragment();
                            z2 = false;
                        } else {
                            dVar.removeSelfFromStack();
                        }
                    }
                    d dVar2 = dVar;
                    d dVar3 = !(dVar2 instanceof ah6) ? ((ah6) dVar2).K : dVar2;
                    z = dVar3 instanceof cj3;
                    pz1 pz1Var = this.c;
                    if (z) {
                        pz1Var.a(dVar2);
                        break;
                    } else {
                        cj3 cj3Var = (cj3) dVar3;
                        cj3Var.e3();
                        gl.e3(new hn1(cj3Var, num, pz1Var, dVar2, (byte) 21), 80L);
                        break;
                    }
                }
                d dVar22 = dVar;
                if (!(dVar22 instanceof ah6)) {
                }
                z = dVar3 instanceof cj3;
                pz1 pz1Var2 = this.c;
                if (z) {
                }
                break;
        }
    }

    public /* synthetic */ dl4(ui5 ui5Var, pz1 pz1Var) {
        this.b = ui5Var;
        this.c = pz1Var;
    }
}
