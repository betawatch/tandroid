package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class d0 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new d0());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        e0 e0Var = (e0) view;
        TranslateController.Language language = (TranslateController.Language) v51Var.G;
        e0Var.a.setText(language.displayName);
        e0Var.b.setText(language.ownDisplayName);
        if (e0Var.c != z10) {
            e0Var.invalidate();
        }
        e0Var.c = z10;
        e0Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new e0(context);
    }
}
