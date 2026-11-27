// default package

import android.view.View;
import org.telegram.ui.LanguageSelectActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class mz5 extends zb3 {
    public final /* synthetic */ LanguageSelectActivity F;

    public mz5(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override // zb3
    public final void P(f89 f89Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        d79 d79Var = languageSelectActivity.b;
        int i = d79Var.D1;
        if (i == -1 || (view = d79Var.E1) == null) {
            return;
        }
        d79Var.m1(i, view);
        d79Var.invalidate();
    }
}
