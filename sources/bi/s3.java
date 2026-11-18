package bi;

import android.content.Context;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                u4.q(this.b, this.c, this.d, k10, (String) obj, null);
                break;
            default:
                lc k11 = this.e.k();
                u4.q(this.b, this.c, this.d, k11, (String) obj, null);
                break;
        }
    }
}
