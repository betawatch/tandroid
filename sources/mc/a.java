package mc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends c {
    public final /* synthetic */ int a;
    public Object b;

    @Override // mc.c
    public final void b(String str) {
        switch (this.a) {
            case 0:
                Log.d("isoparser", String.valueOf((String) this.b) + ":" + str);
                break;
            default:
                ((Logger) this.b).log(Level.FINE, str);
                break;
        }
    }
}
