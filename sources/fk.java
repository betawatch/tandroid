// default package

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
