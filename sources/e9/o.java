package e9;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public abstract class o {
    public transient Set a;
    public transient n b;
    public transient Map c;

    public abstract Map a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return ((v0) this).a().equals(((v0) ((o) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
