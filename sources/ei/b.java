package ei;

import android.content.Context;
import android.view.View;
import di.s6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.vs0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class b extends n91 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ vs0 b;

    public b(vs0 vs0Var, Context context) {
        this.b = vs0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.n91
    public final void b(View view, int i10, int i11) {
        r rVar = (r) view;
        vs0 vs0Var = this.b;
        s6 s6Var = i10 == 0 ? vs0Var.e : (s6) vs0Var.f.get(i10 - 1);
        s6Var.H(null);
        rVar.setList(s6Var);
        rVar.setVisibleHeight(vs0Var.v);
    }

    @Override // org.telegram.ui.Components.n91
    public final View d(int i10) {
        return new r(this.b, this.a);
    }

    @Override // org.telegram.ui.Components.n91
    public final int e() {
        return this.b.f.size() + 1;
    }

    @Override // org.telegram.ui.Components.n91
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((s6) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.n91
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String N = g51.N(((s6) this.b.f.get(i10 - 1)).E, null, null);
        if (N == null) {
            return null;
        }
        return N.substring(0, 1).toUpperCase() + N.substring(1);
    }
}
