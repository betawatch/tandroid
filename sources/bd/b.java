package bd;

import java.util.Random;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                ue.d dVar = new ue.d();
                dVar.a = new byte[4096];
                return dVar;
        }
    }
}
