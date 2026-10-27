package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class b8 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ n8 a;

    public b8(n8 n8Var) {
        this.a = n8Var;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        org.telegram.ui.ActionBar.j5 j5Var3;
        org.telegram.ui.ActionBar.j5 j5Var4;
        n8 n8Var = this.a;
        n8Var.finishFragment();
        j5Var = ((org.telegram.ui.ActionBar.r2) n8Var).parentLayout;
        if (j5Var != null) {
            j5Var2 = ((org.telegram.ui.ActionBar.r2) n8Var).parentLayout;
            if (j5Var2.getFragmentStack().size() >= 2) {
                j5Var3 = ((org.telegram.ui.ActionBar.r2) n8Var).parentLayout;
                List fragmentStack = j5Var3.getFragmentStack();
                j5Var4 = ((org.telegram.ui.ActionBar.r2) n8Var).parentLayout;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) fragmentStack.get(j5Var4.getFragmentStack().size() - 2);
                if (r2Var instanceof wn) {
                    ((wn) r2Var).b8(n8Var.P, n8Var.Q + 86400, z10);
                    return;
                }
                return;
            }
        }
        wn wnVar = n8Var.N;
        if (wnVar != null) {
            wnVar.b8(n8Var.P, n8Var.Q + 86400, z10);
        }
    }
}
