package bi;

import ai.u8;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.y81;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class b extends y81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ es0 b;

    public b(es0 es0Var, Context context) {
        this.b = es0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.y81
    public final void b(View view, int i10, int i11) {
        u uVar = (u) view;
        es0 es0Var = this.b;
        u8 u8Var = i10 == 0 ? es0Var.e : (u8) es0Var.f.get(i10 - 1);
        u8Var.H(null);
        uVar.setList(u8Var);
        uVar.setVisibleHeight(es0Var.v);
    }

    @Override // org.telegram.ui.Components.y81
    public final View d(int i10) {
        return new u(this.b, this.a);
    }

    @Override // org.telegram.ui.Components.y81
    public final int e() {
        return this.b.f.size() + 1;
    }

    @Override // org.telegram.ui.Components.y81
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((u8) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.y81
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String C = u41.C(((u8) this.b.f.get(i10 - 1)).E, null, null);
        if (C == null) {
            return null;
        }
        return C.substring(0, 1).toUpperCase() + C.substring(1);
    }
}
