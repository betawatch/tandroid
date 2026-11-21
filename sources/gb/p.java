package gb;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements rd.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ p(Context context, int i7) {
        this.a = i7;
        this.b = context;
    }

    @Override // rd.a
    public final Object invoke() {
        switch (this.a) {
            case 0:
                File a10 = c8.g1.a(this.b, "firebaseSessions/sessionConfigsDataStore.data");
                q.b(a10);
                return a10;
            default:
                File a11 = c8.g1.a(this.b, "firebaseSessions/sessionDataStore.data");
                q.b(a11);
                return a11;
        }
    }
}
