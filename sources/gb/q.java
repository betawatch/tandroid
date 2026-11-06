package gb;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
