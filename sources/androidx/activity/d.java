package androidx.activity;

import db.j1;
import java.util.UUID;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements od.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // od.a
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((l) this.b).reportFullyDrawn();
                return null;
            case 1:
                ((j1) this.b).getClass();
                UUID randomUUID = UUID.randomUUID();
                kotlin.jvm.internal.j.d(randomUUID, "randomUUID(...)");
                String uuid = randomUUID.toString();
                kotlin.jvm.internal.j.d(uuid, "toString(...)");
                return uuid;
            default:
                ((eb.a) this.b).a.await();
                return dd.k.a;
        }
    }
}
