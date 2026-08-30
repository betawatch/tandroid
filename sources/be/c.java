package be;

import java.util.HashMap;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
