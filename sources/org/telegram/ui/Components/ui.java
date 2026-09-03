package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ui extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new ui());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        vi viVar = (vi) view;
        CharSequence charSequence = i51Var.l;
        CharSequence charSequence2 = i51Var.m;
        viVar.b.setText(charSequence);
        viVar.c.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new vi(context, f6Var);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean isShadow() {
        return true;
    }
}
