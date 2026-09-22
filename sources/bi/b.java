package bi;

import ai.t8;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.zr0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class b extends q81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ zr0 b;

    public b(zr0 zr0Var, Context context) {
        this.b = zr0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.q81
    public final void b(View view, int i10, int i11) {
        u uVar = (u) view;
        zr0 zr0Var = this.b;
        t8 t8Var = i10 == 0 ? zr0Var.e : (t8) zr0Var.f.get(i10 - 1);
        t8Var.H(null);
        uVar.setList(t8Var);
        uVar.setVisibleHeight(zr0Var.v);
    }

    @Override // org.telegram.ui.Components.q81
    public final View d(int i10) {
        return new u(this.b, this.a);
    }

    @Override // org.telegram.ui.Components.q81
    public final int e() {
        return this.b.f.size() + 1;
    }

    @Override // org.telegram.ui.Components.q81
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((t8) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.q81
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String D = l41.D(((t8) this.b.f.get(i10 - 1)).E, null, null);
        if (D == null) {
            return null;
        }
        return D.substring(0, 1).toUpperCase() + D.substring(1);
    }
}
