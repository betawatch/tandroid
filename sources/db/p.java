package db;

import android.content.Context;
import b8.md;
import java.io.File;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements od.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ p(Context context, int i3) {
        this.a = i3;
        this.b = context;
    }

    @Override // od.a
    public final Object invoke() {
        switch (this.a) {
            case 0:
                File a10 = md.a(this.b, "firebaseSessions/sessionConfigsDataStore.data");
                q.b(a10);
                return a10;
            default:
                File a11 = md.a(this.b, "firebaseSessions/sessionDataStore.data");
                q.b(a11);
                return a11;
        }
    }
}
