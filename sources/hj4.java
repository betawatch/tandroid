// default package

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
