package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class s extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new s());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        t tVar = (t) view;
        TranslateController.Language language = (TranslateController.Language) m61Var.G;
        tVar.a.setText(language.displayName);
        tVar.b.setText(language.ownDisplayName);
        if (tVar.c != z10) {
            tVar.invalidate();
        }
        tVar.c = z10;
        tVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, g6 g6Var) {
        return new t(context);
    }
}
