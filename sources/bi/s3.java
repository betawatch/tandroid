package bi;

import android.content.Context;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s3 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 d;
    public final /* synthetic */ o3 e;

    public /* synthetic */ s3(Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, o3 o3Var, int i10) {
        this.a = i10;
        this.b = context;
        this.c = i7;
        this.d = i6Var;
        this.e = o3Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                lc k10 = this.e.k();
                v4.q(this.b, this.c, this.d, k10, (String) obj, null);
                break;
            default:
                lc k11 = this.e.k();
                v4.q(this.b, this.c, this.d, k11, (String) obj, null);
                break;
        }
    }
}
