package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class s extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new s());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        t tVar = (t) view;
        TranslateController.Language language = (TranslateController.Language) f61Var.G;
        tVar.a.setText(language.displayName);
        tVar.b.setText(language.ownDisplayName);
        if (tVar.c != z10) {
            tVar.invalidate();
        }
        tVar.c = z10;
        tVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new t(context);
    }
}
