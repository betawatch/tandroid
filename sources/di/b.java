package di;

import android.content.Context;
import android.view.View;
import ci.t6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.u81;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        t6 t6Var = i10 == 0 ? hs0Var.e : (t6) hs0Var.f.get(i10 - 1);
        t6Var.H(null);
        rVar.setList(t6Var);
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
        return ((t6) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.u81
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String F = r41.F(((t6) this.b.f.get(i10 - 1)).E, null, null);
        if (F == null) {
            return null;
        }
        return F.substring(0, 1).toUpperCase() + F.substring(1);
    }
}
