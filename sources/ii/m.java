package ii;

import java.lang.ref.WeakReference;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.g2;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class m {
    public final int a;
    public final long c;
    public final int d;
    public final WeakReference f;
    public String g;
    public boolean h;
    public final long e = System.currentTimeMillis();
    public final String b = Long.toHexString(Utilities.b.nextLong());

    public m(int i7, long j3, g2 g2Var) {
        this.a = i7;
        this.c = j3;
        this.d = ConnectionsManager.getInstance(i7).getCurrentTime();
        this.f = new WeakReference(g2Var);
    }
}
