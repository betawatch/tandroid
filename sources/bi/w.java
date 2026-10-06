package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class w extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new w());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        x xVar = (x) view;
        TranslateController.Language language = (TranslateController.Language) h61Var.G;
        xVar.a.setText(language.displayName);
        xVar.b.setText(language.ownDisplayName);
        if (xVar.c != z10) {
            xVar.invalidate();
        }
        xVar.c = z10;
        xVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new x(context);
    }
}
