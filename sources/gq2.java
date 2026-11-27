// default package

import java.util.UUID;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class gq2 implements sr4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gq2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // sr4
    public final Object invoke() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((pq2) obj).reportFullyDrawn();
                return null;
            case 1:
                ((lj4) obj).a.await();
                return f9c.a;
            default:
                ((vcc) obj).getClass();
                UUID randomUUID = UUID.randomUUID();
                randomUUID.getClass();
                String uuid = randomUUID.toString();
                uuid.getClass();
                return uuid;
        }
    }
}
