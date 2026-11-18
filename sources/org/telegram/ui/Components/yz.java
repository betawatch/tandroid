package org.telegram.ui.Components;

import java.util.List;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class yz implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.s4 b;
    public final /* synthetic */ ph c;

    public /* synthetic */ yz(org.telegram.ui.ActionBar.s4 s4Var, ph phVar) {
        this.b = s4Var;
        this.c = phVar;
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
                org.telegram.ui.ActionBar.h2 h2Var = null;
                for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                    h2Var = (org.telegram.ui.ActionBar.h2) fragmentStack.get(size);
                    if (!(h2Var instanceof org.telegram.ui.cx) && !(h2Var instanceof org.telegram.ui.me0)) {
                        if (z11) {
                            h2Var.finishFragment();
                            z11 = false;
                        } else {
                            h2Var.removeSelfFromStack();
                        }
                    }
                    org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
                    org.telegram.ui.ActionBar.h2 h2Var3 = !(h2Var2 instanceof org.telegram.ui.me0) ? ((org.telegram.ui.me0) h2Var2).K : h2Var2;
                    z10 = h2Var3 instanceof org.telegram.ui.cx;
                    ph phVar = this.c;
                    if (z10) {
                        phVar.a(h2Var2);
                        break;
                    } else {
                        org.telegram.ui.cx cxVar = (org.telegram.ui.cx) h2Var3;
                        cxVar.W3();
                        org.telegram.messenger.g0.h3(new org.telegram.messenger.camera.i(cxVar, num, phVar, h2Var2, 29), 80L);
                        break;
                    }
                }
                org.telegram.ui.ActionBar.h2 h2Var22 = h2Var;
                if (!(h2Var22 instanceof org.telegram.ui.me0)) {
                }
                z10 = h2Var3 instanceof org.telegram.ui.cx;
                ph phVar2 = this.c;
                if (z10) {
                }
                break;
        }
    }

    public /* synthetic */ yz(ph phVar, org.telegram.ui.ActionBar.s4 s4Var) {
        this.c = phVar;
        this.b = s4Var;
    }
}
