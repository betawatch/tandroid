// default package

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class fk extends ge6 {
    public final /* synthetic */ byte a;
    public Object b;

    @Override // ge6
    public final void b(String str) {
        switch (this.a) {
            case 0:
                Log.d("isoparser", ((String) this.b) + ":" + str);
                break;
            default:
                ((Logger) this.b).log(Level.FINE, str);
                break;
        }
    }
}
