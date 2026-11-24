// default package

import android.view.View;
import org.telegram.ui.LanguageSelectActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
