package gb;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                File a10 = c8.e1.a(this.b, "firebaseSessions/sessionConfigsDataStore.data");
                q.b(a10);
                return a10;
            default:
                File a11 = c8.e1.a(this.b, "firebaseSessions/sessionDataStore.data");
                q.b(a11);
                return a11;
        }
    }
}
