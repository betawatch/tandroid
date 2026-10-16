package ci;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class v extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new v());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        w wVar = (w) view;
        TranslateController.Language language = (TranslateController.Language) m61Var.G;
        wVar.a.setText(language.displayName);
        wVar.b.setText(language.ownDisplayName);
        if (wVar.c != z10) {
            wVar.invalidate();
        }
        wVar.c = z10;
        wVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new w(context);
    }
}
