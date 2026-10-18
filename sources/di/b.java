package di;

import android.content.Context;
import android.view.View;
import ci.s6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.u81;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class b extends u81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ hs0 b;

    public b(hs0 hs0Var, Context context) {
        this.b = hs0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.u81
    public final void b(View view, int i10, int i11) {
        r rVar = (r) view;
        hs0 hs0Var = this.b;
        s6 s6Var = i10 == 0 ? hs0Var.e : (s6) hs0Var.f.get(i10 - 1);
        s6Var.H(null);
        rVar.setList(s6Var);
        rVar.setVisibleHeight(hs0Var.v);
    }

    @Override // org.telegram.ui.Components.u81
    public final View d(int i10) {
        return new r(this.b, this.a);
    }

    @Override // org.telegram.ui.Components.u81
    public final int e() {
        return this.b.f.size() + 1;
    }

    @Override // org.telegram.ui.Components.u81
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((s6) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.u81
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String F = r41.F(((s6) this.b.f.get(i10 - 1)).E, null, null);
        if (F == null) {
            return null;
        }
        return F.substring(0, 1).toUpperCase() + F.substring(1);
    }
}
