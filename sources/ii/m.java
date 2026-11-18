package ii;

import java.lang.ref.WeakReference;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.h2;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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

    public m(int i7, long j3, h2 h2Var) {
        this.a = i7;
        this.c = j3;
        this.d = ConnectionsManager.getInstance(i7).getCurrentTime();
        this.f = new WeakReference(h2Var);
    }
}
