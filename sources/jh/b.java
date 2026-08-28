package jh;

import android.content.Context;
import android.view.View;
import ih.f6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.z21;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class b extends e71 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ uq0 b;

    public b(uq0 uq0Var, Context context) {
        this.b = uq0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.e71
    public final void b(View view, int i9, int i10) {
        q qVar = (q) view;
        uq0 uq0Var = this.b;
        f6 f6Var = i9 == 0 ? uq0Var.e : (f6) uq0Var.f.get(i9 - 1);
        f6Var.H(null);
        qVar.setList(f6Var);
        qVar.setVisibleHeight(uq0Var.v);
    }

    @Override // org.telegram.ui.Components.e71
    public final View d(int i9) {
        return new q(this.b, this.a);
    }

    @Override // org.telegram.ui.Components.e71
    public final int e() {
        return this.b.f.size() + 1;
    }

    @Override // org.telegram.ui.Components.e71
    public final int f(int i9) {
        if (i9 == 0) {
            return 0;
        }
        return ((f6) this.b.f.get(i9 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.e71
    public final CharSequence g(int i9) {
        if (i9 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String D = z21.D(((f6) this.b.f.get(i9 - 1)).E, null, null);
        if (D == null) {
            return null;
        }
        return D.substring(0, 1).toUpperCase() + D.substring(1);
    }
}
