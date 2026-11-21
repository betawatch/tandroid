package org.telegram.ui.Components;

import java.util.List;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a00 implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.r4 b;
    public final /* synthetic */ rh c;

    public /* synthetic */ a00(org.telegram.ui.ActionBar.r4 r4Var, rh rhVar) {
        this.b = r4Var;
        this.c = rhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    @Override // org.telegram.messenger.x10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        boolean z10;
        switch (this.a) {
            case 0:
                this.c.a(this.b.getLastFragment());
                break;
            default:
                Integer num = (Integer) obj;
                List fragmentStack = this.b.getFragmentStack();
                boolean z11 = true;
                org.telegram.ui.ActionBar.g2 g2Var = null;
                for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                    g2Var = (org.telegram.ui.ActionBar.g2) fragmentStack.get(size);
                    if (!(g2Var instanceof org.telegram.ui.cx) && !(g2Var instanceof org.telegram.ui.me0)) {
                        if (z11) {
                            g2Var.finishFragment();
                            z11 = false;
                        } else {
                            g2Var.removeSelfFromStack();
                        }
                    }
                    org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                    org.telegram.ui.ActionBar.g2 g2Var3 = !(g2Var2 instanceof org.telegram.ui.me0) ? ((org.telegram.ui.me0) g2Var2).K : g2Var2;
                    z10 = g2Var3 instanceof org.telegram.ui.cx;
                    rh rhVar = this.c;
                    if (z10) {
                        rhVar.a(g2Var2);
                        break;
                    } else {
                        org.telegram.ui.cx cxVar = (org.telegram.ui.cx) g2Var3;
                        cxVar.W3();
                        org.telegram.messenger.g0.h3(new org.telegram.messenger.camera.i(cxVar, num, rhVar, g2Var2, 29), 80L);
                        break;
                    }
                }
                org.telegram.ui.ActionBar.g2 g2Var22 = g2Var;
                if (!(g2Var22 instanceof org.telegram.ui.me0)) {
                }
                z10 = g2Var3 instanceof org.telegram.ui.cx;
                rh rhVar2 = this.c;
                if (z10) {
                }
                break;
        }
    }

    public /* synthetic */ a00(rh rhVar, org.telegram.ui.ActionBar.r4 r4Var) {
        this.c = rhVar;
        this.b = r4Var;
    }
}
