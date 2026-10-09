package bi;

import ai.v8;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.qs0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class b extends f91 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ qs0 b;

    public b(qs0 qs0Var, Context context) {
        this.b = qs0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.f91
    public final void b(View view, int i10, int i11) {
        u uVar = (u) view;
        qs0 qs0Var = this.b;
        v8 v8Var = i10 == 0 ? qs0Var.e : (v8) qs0Var.f.get(i10 - 1);
        v8Var.H(null);
        uVar.setList(v8Var);
        uVar.setVisibleHeight(qs0Var.v);
    }

    @Override // org.telegram.ui.Components.f91
    public final View d(int i10) {
        return new u(this.b, this.a);
    }

    @Override // org.telegram.ui.Components.f91
    public final int e() {
        return this.b.f.size() + 1;
    }

    @Override // org.telegram.ui.Components.f91
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((v8) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.f91
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String F = b51.F(((v8) this.b.f.get(i10 - 1)).E, null, null);
        if (F == null) {
            return null;
        }
        return F.substring(0, 1).toUpperCase() + F.substring(1);
    }
}
