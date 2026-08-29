package cd;

import java.util.Random;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b extends ThreadLocal {
    public final /* synthetic */ int a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                return new Random();
            case 1:
                return Boolean.FALSE;
            case 2:
                return 0L;
            default:
                we.d dVar = new we.d();
                dVar.a = new byte[4096];
                return dVar;
        }
    }
}
