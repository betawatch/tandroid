package bi;

import ai.u8;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.n81;
import org.telegram.ui.Components.xr0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class b extends n81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ xr0 b;

    public b(xr0 xr0Var, Context context) {
        this.b = xr0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
        u uVar = (u) view;
        xr0 xr0Var = this.b;
        u8 u8Var = i10 == 0 ? xr0Var.e : (u8) xr0Var.f.get(i10 - 1);
        u8Var.H(null);
        uVar.setList(u8Var);
        uVar.setVisibleHeight(xr0Var.v);
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        return new u(this.b, this.a);
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
        return ((u8) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.n81
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String E = i41.E(((u8) this.b.f.get(i10 - 1)).E, null, null);
        if (E == null) {
            return null;
        }
        return E.substring(0, 1).toUpperCase() + E.substring(1);
    }
}
