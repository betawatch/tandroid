package mh;

import android.content.Context;
import android.view.View;
import lh.c6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.q71;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class b extends q71 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ fr0 b;

    public b(fr0 fr0Var, Context context) {
        this.b = fr0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.q71
    public final void b(View view, int i10, int i11) {
        r rVar = (r) view;
        fr0 fr0Var = this.b;
        c6 c6Var = i10 == 0 ? fr0Var.e : (c6) fr0Var.f.get(i10 - 1);
        c6Var.H(null);
        rVar.setList(c6Var);
        rVar.setVisibleHeight(fr0Var.v);
    }

    @Override // org.telegram.ui.Components.q71
    public final View d(int i10) {
        return new r(this.b, this.a);
    }

    @Override // org.telegram.ui.Components.q71
    public final int e() {
        return this.b.f.size() + 1;
    }

    @Override // org.telegram.ui.Components.q71
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((c6) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.q71
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String D = k31.D(((c6) this.b.f.get(i10 - 1)).E, null, null);
        if (D == null) {
            return null;
        }
        return D.substring(0, 1).toUpperCase() + D.substring(1);
    }
}
