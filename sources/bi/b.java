package bi;

import ai.t8;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.j41;
import org.telegram.ui.Components.o81;
import org.telegram.ui.Components.xr0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class b extends o81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ xr0 b;

    public b(xr0 xr0Var, Context context) {
        this.b = xr0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.o81
    public final void b(View view, int i10, int i11) {
        u uVar = (u) view;
        xr0 xr0Var = this.b;
        t8 t8Var = i10 == 0 ? xr0Var.e : (t8) xr0Var.f.get(i10 - 1);
        t8Var.H(null);
        uVar.setList(t8Var);
        uVar.setVisibleHeight(xr0Var.v);
    }

    @Override // org.telegram.ui.Components.o81
    public final View d(int i10) {
        return new u(this.b, this.a);
    }

    @Override // org.telegram.ui.Components.o81
    public final int e() {
        return this.b.f.size() + 1;
    }

    @Override // org.telegram.ui.Components.o81
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((t8) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.o81
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String E = j41.E(((t8) this.b.f.get(i10 - 1)).E, null, null);
        if (E == null) {
            return null;
        }
        return E.substring(0, 1).toUpperCase() + E.substring(1);
    }
}
