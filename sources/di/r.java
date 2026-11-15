package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.wj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class r extends n61 {
    public final s[] a = new s[3];
    public final /* synthetic */ Context b;
    public final /* synthetic */ wj0 c;
    public final /* synthetic */ t d;

    public r(t tVar, Context context, wj0 wj0Var) {
        this.d = tVar;
        this.b = context;
        this.c = wj0Var;
    }

    @Override // org.telegram.ui.Components.n61
    public final void b(View view, int i7, int i10) {
        this.c.J(view);
    }

    @Override // org.telegram.ui.Components.n61
    public final View d(int i7) {
        s[] sVarArr = this.a;
        if (sVarArr[i7] == null) {
            sVarArr[i7] = new s(this.d, this.b, i7);
        }
        return sVarArr[i7];
    }

    @Override // org.telegram.ui.Components.n61
    public final int e() {
        return this.a.length;
    }

    @Override // org.telegram.ui.Components.n61
    public final CharSequence g(int i7) {
        return hd.M0(i7 == 1 ? 2131744919 : i7 == 2 ? 2131744918 : 2131744920, null);
    }

    @Override // org.telegram.ui.Components.n61
    public final int h(int i7) {
        return i7;
    }
}
