package bi;

import android.content.Context;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k4 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 d;
    public final /* synthetic */ s3 e;
    public final /* synthetic */ Boolean f;

    public /* synthetic */ k4(Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, s3 s3Var, Boolean bool, int i10) {
        this.a = i10;
        this.b = context;
        this.c = i7;
        this.d = h6Var;
        this.e = s3Var;
        this.f = bool;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                lc k10 = this.e.k();
                y4.q(this.b, this.c, this.d, k10, (String) obj, this.f);
                break;
            case 1:
                lc k11 = this.e.k();
                y4.q(this.b, this.c, this.d, k11, (String) obj, this.f);
                break;
            case 2:
                lc k12 = this.e.k();
                y4.q(this.b, this.c, this.d, k12, (String) obj, this.f);
                break;
            default:
                lc k13 = this.e.k();
                y4.q(this.b, this.c, this.d, k13, (String) obj, this.f);
                break;
        }
    }
}
