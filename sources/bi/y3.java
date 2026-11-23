package bi;

import android.content.Context;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.kc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y3 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 d;
    public final /* synthetic */ u3 e;

    public /* synthetic */ y3(Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, u3 u3Var, int i10) {
        this.a = i10;
        this.b = context;
        this.c = i7;
        this.d = i6Var;
        this.e = u3Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                kc k10 = this.e.k();
                a5.q(this.b, this.c, this.d, k10, (String) obj, null);
                break;
            default:
                kc k11 = this.e.k();
                a5.q(this.b, this.c, this.d, k11, (String) obj, null);
                break;
        }
    }
}
