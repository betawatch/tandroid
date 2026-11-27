// default package

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
