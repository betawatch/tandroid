package be;

import java.util.HashMap;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
