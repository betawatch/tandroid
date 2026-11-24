// default package

import android.view.View;
import org.telegram.ui.LanguageSelectActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hz5 extends sc3 {
    public final /* synthetic */ LanguageSelectActivity F;

    public hz5(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // sc3
    public final void P(u69 u69Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        r59 r59Var = languageSelectActivity.b;
        int i = r59Var.D1;
        if (i == -1 || (view = r59Var.E1) == null) {
            return;
        }
        r59Var.l1(i, view);
        r59Var.invalidate();
    }
}
