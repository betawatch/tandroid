package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.y61;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class r extends y61 {
    public final s[] a = new s[3];
    public final /* synthetic */ Context b;
    public final /* synthetic */ ek0 c;
    public final /* synthetic */ t d;

    public r(t tVar, Context context, ek0 ek0Var) {
        this.d = tVar;
        this.b = context;
        this.c = ek0Var;
    }

    @Override // org.telegram.ui.Components.y61
    public final void b(View view, int i7, int i10) {
        this.c.H(view);
    }

    @Override // org.telegram.ui.Components.y61
    public final View d(int i7) {
        s[] sVarArr = this.a;
        if (sVarArr[i7] == null) {
            sVarArr[i7] = new s(this.d, this.b, i7);
        }
        return sVarArr[i7];
    }

    @Override // org.telegram.ui.Components.y61
    public final int e() {
        return this.a.length;
    }

    @Override // org.telegram.ui.Components.y61
    public final CharSequence g(int i7) {
        return gd.M0(i7 == 1 ? 2131744684 : i7 == 2 ? 2131744683 : 2131744685, null);
    }

    @Override // org.telegram.ui.Components.y61
    public final int h(int i7) {
        return i7;
    }
}
