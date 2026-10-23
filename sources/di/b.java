package di;

import android.content.Context;
import android.view.View;
import ci.t6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.w81;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class b extends w81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ js0 b;

    public b(js0 js0Var, Context context) {
        this.b = js0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.w81
    public final void b(View view, int i10, int i11) {
        r rVar = (r) view;
        js0 js0Var = this.b;
        t6 t6Var = i10 == 0 ? js0Var.e : (t6) js0Var.f.get(i10 - 1);
        t6Var.H(null);
        rVar.setList(t6Var);
        rVar.setVisibleHeight(js0Var.v);
    }

    @Override // org.telegram.ui.Components.w81
    public final View d(int i10) {
        return new r(this.b, this.a);
    }

    @Override // org.telegram.ui.Components.w81
    public final int e() {
        return this.b.f.size() + 1;
    }

    @Override // org.telegram.ui.Components.w81
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((t6) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.w81
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String E = t41.E(((t6) this.b.f.get(i10 - 1)).E, null, null);
        if (E == null) {
            return null;
        }
        return E.substring(0, 1).toUpperCase() + E.substring(1);
    }
}
