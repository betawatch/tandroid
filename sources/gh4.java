// default package

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class gh4 implements op4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    public /* synthetic */ gh4(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    @Override // op4
    public final Object invoke() {
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                File a = wbe.a(context, "firebaseSessions/sessionConfigsDataStore.data");
                hh4.b(a);
                return a;
            default:
                File a2 = wbe.a(context, "firebaseSessions/sessionDataStore.data");
                hh4.b(a2);
                return a2;
        }
    }
}
