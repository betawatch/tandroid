package bi;

import ai.u8;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p81;
import org.telegram.ui.Components.zr0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class b extends p81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ zr0 b;

    public b(zr0 zr0Var, Context context) {
        this.b = zr0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.p81
    public final void b(View view, int i10, int i11) {
        u uVar = (u) view;
        zr0 zr0Var = this.b;
        u8 u8Var = i10 == 0 ? zr0Var.e : (u8) zr0Var.f.get(i10 - 1);
        u8Var.H(null);
        uVar.setList(u8Var);
        uVar.setVisibleHeight(zr0Var.v);
    }

    @Override // org.telegram.ui.Components.p81
    public final View d(int i10) {
        return new u(this.b, this.a);
    }

    @Override // org.telegram.ui.Components.p81
    public final int e() {
        return this.b.f.size() + 1;
    }

    @Override // org.telegram.ui.Components.p81
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((u8) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.p81
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String E = k41.E(((u8) this.b.f.get(i10 - 1)).E, null, null);
        if (E == null) {
            return null;
        }
        return E.substring(0, 1).toUpperCase() + E.substring(1);
    }
}
