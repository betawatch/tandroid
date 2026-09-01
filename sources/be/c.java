package be;

import java.util.HashMap;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
