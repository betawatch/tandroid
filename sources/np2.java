// default package

import java.util.UUID;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
