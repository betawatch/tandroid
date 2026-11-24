// default package

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class b7c {
    public a7c a;
    public final HashMap b = new HashMap();
    public final ArrayList c = new ArrayList();

    public final boolean a() {
        return !this.c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.b.put(uuid, runnable);
        this.c.add(uuid);
        gm.c3(new zcb(this, (byte) 28));
    }

    public final void c() {
        ArrayList arrayList = this.c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.b;
        Runnable runnable = (Runnable) hashMap.get(uuid);
        hashMap.remove(uuid);
        arrayList.remove(size);
        runnable.run();
        gm.c3(new zcb(this, (byte) 28));
    }
}
