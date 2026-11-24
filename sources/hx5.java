// default package

import android.view.View;
import org.telegram.ui.LanguageSelectActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class hx5 extends gb3 {
    public final /* synthetic */ LanguageSelectActivity F;

    public hx5(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // gb3
    public final void P(s49 s49Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        o39 o39Var = languageSelectActivity.b;
        int i = o39Var.D1;
        if (i == -1 || (view = o39Var.E1) == null) {
            return;
        }
        o39Var.l1(i, view);
        o39Var.invalidate();
    }
}
