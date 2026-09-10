package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.n81;
import org.telegram.ui.Components.vr0;
import zh.s4;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class d extends n81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ vr0 b;

    public d(vr0 vr0Var, Context context) {
        this.b = vr0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
        a0 a0Var = (a0) view;
        vr0 vr0Var = this.b;
        s4 s4Var = i10 == 0 ? vr0Var.e : (s4) vr0Var.f.get(i10 - 1);
        s4Var.H(null);
        a0Var.setList(s4Var);
        a0Var.setVisibleHeight(vr0Var.v);
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        return new a0(this.b, this.a);
    }

    @Override // org.telegram.ui.Components.n81
    public final int e() {
        return this.b.f.size() + 1;
    }

    @Override // org.telegram.ui.Components.n81
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((s4) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.n81
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String D = i41.D(((s4) this.b.f.get(i10 - 1)).E, null, null);
        if (D == null) {
            return null;
        }
        return D.substring(0, 1).toUpperCase() + D.substring(1);
    }
}
