package bi;

import ai.u8;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.z71;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class b extends z71 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ mr0 b;

    public b(mr0 mr0Var, Context context) {
        this.b = mr0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.z71
    public final void b(View view, int i10, int i11) {
        u uVar = (u) view;
        mr0 mr0Var = this.b;
        u8 u8Var = i10 == 0 ? mr0Var.e : (u8) mr0Var.f.get(i10 - 1);
        u8Var.H(null);
        uVar.setList(u8Var);
        uVar.setVisibleHeight(mr0Var.v);
    }

    @Override // org.telegram.ui.Components.z71
    public final View d(int i10) {
        return new u(this.b, this.a);
    }

    @Override // org.telegram.ui.Components.z71
    public final int e() {
        return this.b.f.size() + 1;
    }

    @Override // org.telegram.ui.Components.z71
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((u8) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.z71
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String E = u31.E(((u8) this.b.f.get(i10 - 1)).E, null, null);
        if (E == null) {
            return null;
        }
        return E.substring(0, 1).toUpperCase() + E.substring(1);
    }
}
