package bi;

import ai.u8;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.x81;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class b extends x81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ds0 b;

    public b(ds0 ds0Var, Context context) {
        this.b = ds0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.x81
    public final void b(View view, int i10, int i11) {
        u uVar = (u) view;
        ds0 ds0Var = this.b;
        u8 u8Var = i10 == 0 ? ds0Var.e : (u8) ds0Var.f.get(i10 - 1);
        u8Var.H(null);
        uVar.setList(u8Var);
        uVar.setVisibleHeight(ds0Var.v);
    }

    @Override // org.telegram.ui.Components.x81
    public final View d(int i10) {
        return new u(this.b, this.a);
    }

    @Override // org.telegram.ui.Components.x81
    public final int e() {
        return this.b.f.size() + 1;
    }

    @Override // org.telegram.ui.Components.x81
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((u8) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.x81
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String C = t41.C(((u8) this.b.f.get(i10 - 1)).E, null, null);
        if (C == null) {
            return null;
        }
        return C.substring(0, 1).toUpperCase() + C.substring(1);
    }
}
