package cc;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a extends c {
    public final /* synthetic */ int a;
    public Object b;

    @Override // cc.c
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
