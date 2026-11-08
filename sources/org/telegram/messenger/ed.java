package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class ed {
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
