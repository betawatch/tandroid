// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class lg1 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new lg1());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        mg1 mg1Var = (mg1) view;
        CharSequence charSequence = b8cVar.m;
        CharSequence charSequence2 = b8cVar.n;
        mg1Var.setText(charSequence);
        mg1Var.r.setText(charSequence2);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new mg1(context, vnbVar);
    }

    @Override // a8c
    public final boolean f() {
        return false;
    }
}
