package kh;

import android.content.Context;
import android.view.View;
import jh.b6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.vq0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class b extends g71 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ vq0 b;

    public b(vq0 vq0Var, Context context) {
        this.b = vq0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.g71
    public final void b(View view, int i10, int i11) {
        r rVar = (r) view;
        vq0 vq0Var = this.b;
        b6 b6Var = i10 == 0 ? vq0Var.e : (b6) vq0Var.f.get(i10 - 1);
        b6Var.H(null);
        rVar.setList(b6Var);
        rVar.setVisibleHeight(vq0Var.v);
    }

    @Override // org.telegram.ui.Components.g71
    public final View d(int i10) {
        return new r(this.b, this.a);
    }

    @Override // org.telegram.ui.Components.g71
    public final int e() {
        return this.b.f.size() + 1;
    }

    @Override // org.telegram.ui.Components.g71
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((b6) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.g71
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String E = b31.E(((b6) this.b.f.get(i10 - 1)).E, null, null);
        if (E == null) {
            return null;
        }
        return E.substring(0, 1).toUpperCase() + E.substring(1);
    }
}
