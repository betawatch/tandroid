package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.n01;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class u6 extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new u6());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        Object obj = f61Var.G;
        if (obj instanceof n01) {
            n01 n01Var = (n01) obj;
            ((w6) view).b(f61Var.l, n01Var.d, n01Var.e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((w6) view).a(f61Var.l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new w6(context);
    }
}
