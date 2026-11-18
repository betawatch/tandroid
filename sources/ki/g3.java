package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class g3 extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new g3());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        h3 h3Var = (h3) view;
        CharSequence charSequence = l41Var.m;
        CharSequence charSequence2 = l41Var.n;
        h3Var.setText(charSequence);
        h3Var.r.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        return new h3(context, i6Var);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean f() {
        return false;
    }
}
