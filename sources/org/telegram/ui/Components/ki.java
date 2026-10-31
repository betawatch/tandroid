package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ki extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new ki());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        li liVar = (li) view;
        CharSequence charSequence = a51Var.l;
        CharSequence charSequence2 = a51Var.m;
        liVar.b.setText(charSequence);
        liVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new li(context, p6Var);
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean f() {
        return false;
    }
}
