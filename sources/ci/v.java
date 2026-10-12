package ci;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class v extends k61 {
    public static final /* synthetic */ int a = 0;

    static {
        k61.setup(new v());
    }

    @Override // org.telegram.ui.Components.k61
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        w wVar = (w) view;
        TranslateController.Language language = (TranslateController.Language) l61Var.G;
        wVar.a.setText(language.displayName);
        wVar.b.setText(language.ownDisplayName);
        if (wVar.c != z10) {
            wVar.invalidate();
        }
        wVar.c = z10;
        wVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.k61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new w(context);
    }
}
