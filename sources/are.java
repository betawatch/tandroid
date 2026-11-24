// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class are {
    public static final void a(int i, int i2, w4a w4aVar) {
        w4aVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = i2 & (~i);
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(w4aVar.g(i4));
            }
            i3 >>>= 1;
        }
        throw new zd7(w4aVar.a(), arrayList);
    }
}
