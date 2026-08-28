package jh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class r extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new r());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        s sVar = (s) view;
        TranslateController.Language language = (TranslateController.Language) l41Var.G;
        sVar.a.setText(language.displayName);
        sVar.b.setText(language.ownDisplayName);
        if (sVar.c != z10) {
            sVar.invalidate();
        }
        sVar.c = z10;
        sVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        return new s(context);
    }
}
