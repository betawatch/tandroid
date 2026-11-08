package gb;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements rd.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ q(Context context, int i7) {
        this.a = i7;
        this.b = context;
    }

    @Override // rd.a
    public final Object invoke() {
        switch (this.a) {
            case 0:
                File a10 = c8.c1.a(this.b, "firebaseSessions/sessionConfigsDataStore.data");
                r.b(a10);
                return a10;
            default:
                File a11 = c8.c1.a(this.b, "firebaseSessions/sessionDataStore.data");
                r.b(a11);
                return a11;
        }
    }
}
