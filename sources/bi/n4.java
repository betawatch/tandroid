package bi;

import android.content.Context;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.kc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n4 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 d;
    public final /* synthetic */ u3 e;
    public final /* synthetic */ Boolean f;

    public /* synthetic */ n4(Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, u3 u3Var, Boolean bool, int i10) {
        this.a = i10;
        this.b = context;
        this.c = i7;
        this.d = i6Var;
        this.e = u3Var;
        this.f = bool;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                kc k10 = this.e.k();
                a5.q(this.b, this.c, this.d, k10, (String) obj, this.f);
                break;
            case 1:
                kc k11 = this.e.k();
                a5.q(this.b, this.c, this.d, k11, (String) obj, this.f);
                break;
            case 2:
                kc k12 = this.e.k();
                a5.q(this.b, this.c, this.d, k12, (String) obj, this.f);
                break;
            default:
                kc k13 = this.e.k();
                a5.q(this.b, this.c, this.d, k13, (String) obj, this.f);
                break;
        }
    }
}
