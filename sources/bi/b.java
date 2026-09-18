package bi;

import ai.t8;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.w31;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class b extends b81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ nr0 b;

    public b(nr0 nr0Var, Context context) {
        this.b = nr0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.b81
    public final void b(View view, int i10, int i11) {
        u uVar = (u) view;
        nr0 nr0Var = this.b;
        t8 t8Var = i10 == 0 ? nr0Var.e : (t8) nr0Var.f.get(i10 - 1);
        t8Var.H(null);
        uVar.setList(t8Var);
        uVar.setVisibleHeight(nr0Var.v);
    }

    @Override // org.telegram.ui.Components.b81
    public final View d(int i10) {
        return new u(this.b, this.a);
    }

    @Override // org.telegram.ui.Components.b81
    public final int e() {
        return this.b.f.size() + 1;
    }

    @Override // org.telegram.ui.Components.b81
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((t8) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.b81
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String E = w31.E(((t8) this.b.f.get(i10 - 1)).E, null, null);
        if (E == null) {
            return null;
        }
        return E.substring(0, 1).toUpperCase() + E.substring(1);
    }
}
