// default package

import java.util.List;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class dn4 implements qac {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ tk5 b;
    public final /* synthetic */ qy1 c;

    public /* synthetic */ dn4(qy1 qy1Var, tk5 tk5Var) {
        this.c = qy1Var;
        this.b = tk5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    @Override // qac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        boolean z;
        byte b = this.a;
        tk5 tk5Var = this.b;
        switch (b) {
            case 0:
                this.c.a(tk5Var.getLastFragment());
                break;
            default:
                Integer num = (Integer) obj;
                List fragmentStack = tk5Var.getFragmentStack();
                boolean z2 = true;
                d dVar = null;
                for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                    dVar = (d) fragmentStack.get(size);
                    if (!(dVar instanceof nk3) && !(dVar instanceof bj6)) {
                        if (z2) {
                            dVar.finishFragment();
                            z2 = false;
                        } else {
                            dVar.removeSelfFromStack();
                        }
                    }
                    d dVar2 = dVar;
                    d dVar3 = !(dVar2 instanceof bj6) ? ((bj6) dVar2).J : dVar2;
                    z = dVar3 instanceof nk3;
                    qy1 qy1Var = this.c;
                    if (z) {
                        qy1Var.a(dVar2);
                        break;
                    } else {
                        nk3 nk3Var = (nk3) dVar3;
                        nk3Var.g3();
                        gm.d3(new xo1(nk3Var, num, qy1Var, dVar2, (byte) 21), 80L);
                        break;
                    }
                }
                d dVar22 = dVar;
                if (!(dVar22 instanceof bj6)) {
                }
                z = dVar3 instanceof nk3;
                qy1 qy1Var2 = this.c;
                if (z) {
                }
                break;
        }
    }

    public /* synthetic */ dn4(tk5 tk5Var, qy1 qy1Var) {
        this.b = tk5Var;
        this.c = qy1Var;
    }
}
