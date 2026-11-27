// default package

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class hj4 implements sr4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    public /* synthetic */ hj4(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    @Override // sr4
    public final Object invoke() {
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                File a = mge.a(context, "firebaseSessions/sessionConfigsDataStore.data");
                ij4.b(a);
                return a;
            default:
                File a2 = mge.a(context, "firebaseSessions/sessionDataStore.data");
                ij4.b(a2);
                return a2;
        }
    }
}
