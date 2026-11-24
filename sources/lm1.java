// default package

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class lm1 implements Supplier {
    public final /* synthetic */ byte a;

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new ArrayList();
            default:
                return new HashSet();
        }
    }
}
