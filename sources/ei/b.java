package ei;

import android.content.Context;
import android.view.View;
import di.s6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.m91;
import org.telegram.ui.Components.us0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class b extends m91 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ us0 b;

    public b(us0 us0Var, Context context) {
        this.b = us0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.m91
    public final void b(View view, int i10, int i11) {
        r rVar = (r) view;
        us0 us0Var = this.b;
        s6 s6Var = i10 == 0 ? us0Var.e : (s6) us0Var.f.get(i10 - 1);
        s6Var.H(null);
        rVar.setList(s6Var);
        rVar.setVisibleHeight(us0Var.v);
    }

    @Override // org.telegram.ui.Components.m91
    public final View d(int i10) {
        return new r(this.b, this.a);
    }

    @Override // org.telegram.ui.Components.m91
    public final int e() {
        return this.b.f.size() + 1;
    }

    @Override // org.telegram.ui.Components.m91
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((s6) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.m91
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String N = f51.N(((s6) this.b.f.get(i10 - 1)).E, null, null);
        if (N == null) {
            return null;
        }
        return N.substring(0, 1).toUpperCase() + N.substring(1);
    }
}
