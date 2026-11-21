package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.gk0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class r extends b71 {
    public final s[] a = new s[3];
    public final /* synthetic */ Context b;
    public final /* synthetic */ gk0 c;
    public final /* synthetic */ t d;

    public r(t tVar, Context context, gk0 gk0Var) {
        this.d = tVar;
        this.b = context;
        this.c = gk0Var;
    }

    @Override // org.telegram.ui.Components.b71
    public final void b(View view, int i7, int i10) {
        this.c.H(view);
    }

    @Override // org.telegram.ui.Components.b71
    public final View d(int i7) {
        s[] sVarArr = this.a;
        if (sVarArr[i7] == null) {
            sVarArr[i7] = new s(this.d, this.b, i7);
        }
        return sVarArr[i7];
    }

    @Override // org.telegram.ui.Components.b71
    public final int e() {
        return this.a.length;
    }

    @Override // org.telegram.ui.Components.b71
    public final CharSequence g(int i7) {
        return gd.N0(i7 == 1 ? 2131744678 : i7 == 2 ? 2131744677 : 2131744679, null);
    }

    @Override // org.telegram.ui.Components.b71
    public final int h(int i7) {
        return i7;
    }
}
