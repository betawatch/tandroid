// default package

import java.util.UUID;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class np2 implements op4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ np2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // op4
    public final Object invoke() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((wp2) obj).reportFullyDrawn();
                return null;
            case 1:
                ((jh4) obj).a.await();
                return g5c.a;
            default:
                ((v8c) obj).getClass();
                UUID randomUUID = UUID.randomUUID();
                randomUUID.getClass();
                String uuid = randomUUID.toString();
                uuid.getClass();
                return uuid;
        }
    }
}
