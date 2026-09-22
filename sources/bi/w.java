package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class w extends x51 {
    public static final /* synthetic */ int a = 0;

    static {
        x51.setup(new w());
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        x xVar = (x) view;
        TranslateController.Language language = (TranslateController.Language) y51Var.G;
        xVar.a.setText(language.displayName);
        xVar.b.setText(language.ownDisplayName);
        if (xVar.c != z10) {
            xVar.invalidate();
        }
        xVar.c = z10;
        xVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, f6 f6Var) {
        return new x(context);
    }
}
