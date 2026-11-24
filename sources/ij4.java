// default package

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ij4 implements pr4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    public /* synthetic */ ij4(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    @Override // pr4
    public final Object invoke() {
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                File a = xde.a(context, "firebaseSessions/sessionConfigsDataStore.data");
                jj4.b(a);
                return a;
            default:
                File a2 = xde.a(context, "firebaseSessions/sessionDataStore.data");
                jj4.b(a2);
                return a2;
        }
    }
}
