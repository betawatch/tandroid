package di;

import android.content.Context;
import android.view.View;
import ci.t6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.v81;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class b extends v81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ is0 b;

    public b(is0 is0Var, Context context) {
        this.b = is0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.v81
    public final void b(View view, int i10, int i11) {
        r rVar = (r) view;
        is0 is0Var = this.b;
        t6 t6Var = i10 == 0 ? is0Var.e : (t6) is0Var.f.get(i10 - 1);
        t6Var.H(null);
        rVar.setList(t6Var);
        rVar.setVisibleHeight(is0Var.v);
    }

    @Override // org.telegram.ui.Components.v81
    public final View d(int i10) {
        return new r(this.b, this.a);
    }

    @Override // org.telegram.ui.Components.v81
    public final int e() {
        return this.b.f.size() + 1;
    }

    @Override // org.telegram.ui.Components.v81
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((t6) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.v81
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String E = s41.E(((t6) this.b.f.get(i10 - 1)).E, null, null);
        if (E == null) {
            return null;
        }
        return E.substring(0, 1).toUpperCase() + E.substring(1);
    }
}
