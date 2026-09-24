package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class w extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new w());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        x xVar = (x) view;
        TranslateController.Language language = (TranslateController.Language) v51Var.G;
        xVar.a.setText(language.displayName);
        xVar.b.setText(language.ownDisplayName);
        if (xVar.c != z10) {
            xVar.invalidate();
        }
        xVar.c = z10;
        xVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, d6 d6Var) {
        return new x(context);
    }
}
