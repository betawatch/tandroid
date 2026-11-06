package b7;

import java.util.Random;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class j extends ThreadLocal {
    public final /* synthetic */ int a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                return 0L;
            case 1:
                return Boolean.FALSE;
            case 2:
                return Long.valueOf(System.currentTimeMillis() - 1000);
            case 3:
                return new Random();
            default:
                tf.d dVar = new tf.d();
                dVar.a = new byte[TLObject.FLAG_12];
                return dVar;
        }
    }
}
