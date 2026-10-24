package di;

import android.content.Context;
import android.view.View;
import ci.s6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.y41;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class b extends d91 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ms0 b;

    public b(ms0 ms0Var, Context context) {
        this.b = ms0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.d91
    public final void b(View view, int i10, int i11) {
        r rVar = (r) view;
        ms0 ms0Var = this.b;
        s6 s6Var = i10 == 0 ? ms0Var.e : (s6) ms0Var.f.get(i10 - 1);
        s6Var.H(null);
        rVar.setList(s6Var);
        rVar.setVisibleHeight(ms0Var.v);
    }

    @Override // org.telegram.ui.Components.d91
    public final View d(int i10) {
        return new r(this.b, this.a);
    }

    @Override // org.telegram.ui.Components.d91
    public final int e() {
        return this.b.f.size() + 1;
    }

    @Override // org.telegram.ui.Components.d91
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((s6) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.d91
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String N = y41.N(((s6) this.b.f.get(i10 - 1)).E, null, null);
        if (N == null) {
            return null;
        }
        return N.substring(0, 1).toUpperCase() + N.substring(1);
    }
}
