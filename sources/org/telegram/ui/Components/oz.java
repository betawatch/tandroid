package org.telegram.ui.Components;

import java.util.List;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class oz implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.q4 b;
    public final /* synthetic */ fx c;

    public /* synthetic */ oz(org.telegram.ui.ActionBar.q4 q4Var, fx fxVar) {
        this.b = q4Var;
        this.c = fxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    @Override // org.telegram.messenger.c20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        boolean z9;
        switch (this.a) {
            case 0:
                this.c.a(this.b.getLastFragment());
                break;
            default:
                Integer num = (Integer) obj;
                List fragmentStack = this.b.getFragmentStack();
                boolean z10 = true;
                org.telegram.ui.ActionBar.f2 f2Var = null;
                for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                    f2Var = (org.telegram.ui.ActionBar.f2) fragmentStack.get(size);
                    if (!(f2Var instanceof org.telegram.ui.yw) && !(f2Var instanceof org.telegram.ui.le0)) {
                        if (z10) {
                            f2Var.finishFragment();
                            z10 = false;
                        } else {
                            f2Var.removeSelfFromStack();
                        }
                    }
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    org.telegram.ui.ActionBar.f2 f2Var3 = !(f2Var2 instanceof org.telegram.ui.le0) ? ((org.telegram.ui.le0) f2Var2).J : f2Var2;
                    z9 = f2Var3 instanceof org.telegram.ui.yw;
                    fx fxVar = this.c;
                    if (z9) {
                        fxVar.a(f2Var2);
                        break;
                    } else {
                        org.telegram.ui.yw ywVar = (org.telegram.ui.yw) f2Var3;
                        ywVar.W3();
                        org.telegram.messenger.g0.i3(new org.telegram.ui.m6(ywVar, num, fxVar, f2Var2, 22), 80L);
                        break;
                    }
                }
                org.telegram.ui.ActionBar.f2 f2Var22 = f2Var;
                if (!(f2Var22 instanceof org.telegram.ui.le0)) {
                }
                z9 = f2Var3 instanceof org.telegram.ui.yw;
                fx fxVar2 = this.c;
                if (z9) {
                }
                break;
        }
    }

    public /* synthetic */ oz(fx fxVar, org.telegram.ui.ActionBar.q4 q4Var) {
        this.c = fxVar;
        this.b = q4Var;
    }
}
