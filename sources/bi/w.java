package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class w extends w51 {
    public static final /* synthetic */ int a = 0;

    static {
        w51.setup(new w());
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        x xVar = (x) view;
        TranslateController.Language language = (TranslateController.Language) x51Var.G;
        xVar.a.setText(language.displayName);
        xVar.b.setText(language.ownDisplayName);
        if (xVar.c != z10) {
            xVar.invalidate();
        }
        xVar.c = z10;
        xVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, d6 d6Var) {
        return new x(context);
    }
}
