package org.telegram.ui.Components;

import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class rz implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.o4 b;
    public final /* synthetic */ gh c;

    public /* synthetic */ rz(org.telegram.ui.ActionBar.o4 o4Var, gh ghVar) {
        this.b = o4Var;
        this.c = ghVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    @Override // org.telegram.messenger.z10
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
                org.telegram.ui.ActionBar.e2 e2Var = null;
                for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                    e2Var = (org.telegram.ui.ActionBar.e2) fragmentStack.get(size);
                    if (!(e2Var instanceof org.telegram.ui.yw) && !(e2Var instanceof org.telegram.ui.je0)) {
                        if (z11) {
                            e2Var.finishFragment();
                            z11 = false;
                        } else {
                            e2Var.removeSelfFromStack();
                        }
                    }
                    org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                    org.telegram.ui.ActionBar.e2 e2Var3 = !(e2Var2 instanceof org.telegram.ui.je0) ? ((org.telegram.ui.je0) e2Var2).K : e2Var2;
                    z10 = e2Var3 instanceof org.telegram.ui.yw;
                    gh ghVar = this.c;
                    if (z10) {
                        ghVar.a(e2Var2);
                        break;
                    } else {
                        org.telegram.ui.yw ywVar = (org.telegram.ui.yw) e2Var3;
                        ywVar.W3();
                        org.telegram.messenger.g0.i3(new org.telegram.ui.ActionBar.l5(ywVar, num, ghVar, e2Var2, 26), 80L);
                        break;
                    }
                }
                org.telegram.ui.ActionBar.e2 e2Var22 = e2Var;
                if (!(e2Var22 instanceof org.telegram.ui.je0)) {
                }
                z10 = e2Var3 instanceof org.telegram.ui.yw;
                gh ghVar2 = this.c;
                if (z10) {
                }
                break;
        }
    }

    public /* synthetic */ rz(gh ghVar, org.telegram.ui.ActionBar.o4 o4Var) {
        this.c = ghVar;
        this.b = o4Var;
    }
}
