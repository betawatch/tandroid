package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class e5 extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new e5());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        ((f5) view).a(f61Var.l, f61Var.m, f61Var.k);
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new f5(context, d6Var);
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean isClickable() {
        return false;
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean isShadow() {
        return true;
    }
}
