package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class dd {
    public boolean a;
    public long b;
    public int c;
    public int d;
    public ArrayList e;

    public final void a() {
        ArrayList arrayList = this.e;
        this.e = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((Runnable) arrayList.get(i7)).run();
        }
    }
}
