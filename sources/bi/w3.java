package bi;

import android.content.Context;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w3 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 d;
    public final /* synthetic */ s3 e;

    public /* synthetic */ w3(Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, s3 s3Var, int i10) {
        this.a = i10;
        this.b = context;
        this.c = i7;
        this.d = h6Var;
        this.e = s3Var;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                lc k10 = this.e.k();
                x4.q(this.b, this.c, this.d, k10, (String) obj, null);
                break;
            default:
                lc k11 = this.e.k();
                x4.q(this.b, this.c, this.d, k11, (String) obj, null);
                break;
        }
    }
}
