package ci;

import android.content.Context;
import android.view.View;
import bi.b8;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.lr0;
import org.telegram.ui.Components.u31;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class b extends a81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ lr0 b;

    public b(lr0 lr0Var, Context context) {
        this.b = lr0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.a81
    public final void b(View view, int i10, int i11) {
        t tVar = (t) view;
        lr0 lr0Var = this.b;
        b8 b8Var = i10 == 0 ? lr0Var.e : (b8) lr0Var.f.get(i10 - 1);
        b8Var.H(null);
        tVar.setList(b8Var);
        tVar.setVisibleHeight(lr0Var.v);
    }

    @Override // org.telegram.ui.Components.a81
    public final View d(int i10) {
        return new t(this.b, this.a);
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
        return ((b8) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.a81
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String D = u31.D(((b8) this.b.f.get(i10 - 1)).E, null, null);
        if (D == null) {
            return null;
        }
        return D.substring(0, 1).toUpperCase() + D.substring(1);
    }
}
