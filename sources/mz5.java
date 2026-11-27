// default package

import android.view.View;
import org.telegram.ui.LanguageSelectActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
