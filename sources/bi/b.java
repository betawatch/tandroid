package bi;

import ai.t8;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.v31;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class b extends a81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ mr0 b;

    public b(mr0 mr0Var, Context context) {
        this.b = mr0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.a81
    public final void b(View view, int i10, int i11) {
        u uVar = (u) view;
        mr0 mr0Var = this.b;
        t8 t8Var = i10 == 0 ? mr0Var.e : (t8) mr0Var.f.get(i10 - 1);
        t8Var.H(null);
        uVar.setList(t8Var);
        uVar.setVisibleHeight(mr0Var.v);
    }

    @Override // org.telegram.ui.Components.a81
    public final View d(int i10) {
        return new u(this.b, this.a);
    }

    @Override // org.telegram.ui.Components.a81
    public final int e() {
        return this.b.f.size() + 1;
    }

    @Override // org.telegram.ui.Components.a81
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((t8) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.a81
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String E = v31.E(((t8) this.b.f.get(i10 - 1)).E, null, null);
        if (E == null) {
            return null;
        }
        return E.substring(0, 1).toUpperCase() + E.substring(1);
    }
}
