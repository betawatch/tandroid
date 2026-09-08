package ci;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class v extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new v());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        w wVar = (w) view;
        TranslateController.Language language = (TranslateController.Language) h51Var.G;
        wVar.a.setText(language.displayName);
        wVar.b.setText(language.ownDisplayName);
        if (wVar.c != z10) {
            wVar.invalidate();
        }
        wVar.c = z10;
        wVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        return new w(context);
    }
}
