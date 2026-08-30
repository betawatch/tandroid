package oh;

import android.content.Context;
import android.view.View;
import nh.d6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.v31;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class b extends c81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ nr0 b;

    public b(nr0 nr0Var, Context context) {
        this.b = nr0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.c81
    public final void b(View view, int i10, int i11) {
        r rVar = (r) view;
        nr0 nr0Var = this.b;
        d6 d6Var = i10 == 0 ? nr0Var.e : (d6) nr0Var.f.get(i10 - 1);
        d6Var.H(null);
        rVar.setList(d6Var);
        rVar.setVisibleHeight(nr0Var.v);
    }

    @Override // org.telegram.ui.Components.c81
    public final View d(int i10) {
        return new r(this.b, this.a);
    }

    @Override // org.telegram.ui.Components.c81
    public final int e() {
        return this.b.f.size() + 1;
    }

    @Override // org.telegram.ui.Components.c81
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((d6) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.c81
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String D = v31.D(((d6) this.b.f.get(i10 - 1)).E, null, null);
        if (D == null) {
            return null;
        }
        return D.substring(0, 1).toUpperCase() + D.substring(1);
    }
}
