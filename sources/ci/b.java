package ci;

import android.content.Context;
import android.view.View;
import bi.f8;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.x41;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        t tVar = (t) view;
        ms0 ms0Var = this.b;
        f8 f8Var = i10 == 0 ? ms0Var.e : (f8) ms0Var.f.get(i10 - 1);
        f8Var.H(null);
        tVar.setList(f8Var);
        tVar.setVisibleHeight(ms0Var.v);
    }

    @Override // org.telegram.ui.Components.d91
    public final View d(int i10) {
        return new t(this.b, this.a);
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
        return ((f8) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.d91
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String F = x41.F(((f8) this.b.f.get(i10 - 1)).E, null, null);
        if (F == null) {
            return null;
        }
        return F.substring(0, 1).toUpperCase() + F.substring(1);
    }
}
