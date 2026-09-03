package be;

import java.util.HashMap;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c {
    public b b;
    public final HashMap c = new HashMap();
    public final boolean a = true;

    public final boolean a(Long l10) {
        boolean z4;
        synchronized (this.c) {
            try {
                b bVar = (b) this.c.get(l10);
                z4 = (bVar == null || bVar.isEmpty()) ? false : true;
            } finally {
            }
        }
        return z4;
    }
}
