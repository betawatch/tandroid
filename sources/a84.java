// default package

import java.util.Random;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class a84 extends ThreadLocal {
    public final /* synthetic */ byte a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                return new Random();
            case 1:
                dh5 dh5Var = new dh5();
                dh5Var.a = new byte[TLObject.FLAG_12];
                return dh5Var;
            case 2:
                return Long.valueOf(System.currentTimeMillis() - 1000);
            case 3:
                return Boolean.FALSE;
            default:
                return 0L;
        }
    }
}
