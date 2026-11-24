// default package

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ek extends cc6 {
    public final /* synthetic */ byte a;
    public Object b;

    @Override // cc6
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
