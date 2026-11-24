// default package

import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum hdd {
    b(-999),
    /* JADX INFO: Fake field, exist only in values array */
    EF18(-3),
    /* JADX INFO: Fake field, exist only in values array */
    EF27(-2),
    /* JADX INFO: Fake field, exist only in values array */
    EF36(-1),
    /* JADX INFO: Fake field, exist only in values array */
    EF44(0),
    /* JADX INFO: Fake field, exist only in values array */
    EF52(1),
    /* JADX INFO: Fake field, exist only in values array */
    EF60(2),
    /* JADX INFO: Fake field, exist only in values array */
    EF70(3),
    /* JADX INFO: Fake field, exist only in values array */
    EF83(4),
    /* JADX INFO: Fake field, exist only in values array */
    EF96(5),
    /* JADX INFO: Fake field, exist only in values array */
    EF109(6),
    /* JADX INFO: Fake field, exist only in values array */
    EF122(7),
    /* JADX INFO: Fake field, exist only in values array */
    EF133(8),
    /* JADX INFO: Fake field, exist only in values array */
    EF148(11),
    /* JADX INFO: Fake field, exist only in values array */
    EF163(12);

    public static final skd c;
    public final int a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    static {
        boolean z = false;
        kq kqVar = new kq((byte) 19, z);
        kqVar.c = new Object[8];
        kqVar.b = 0;
        hdd[] values = values();
        int length = values.length;
        for (?? r2 = z; r2 < length; r2++) {
            hdd hddVar = values[r2];
            Integer valueOf = Integer.valueOf(hddVar.a);
            int i = kqVar.b + 1;
            Object[] objArr = (Object[]) kqVar.c;
            int length2 = objArr.length;
            int i2 = i << 1;
            if (i2 > length2) {
                if (i2 > length2) {
                    length2 = length2 + (length2 >> 1) + 1;
                    length2 = length2 < i2 ? Integer.highestOneBit(i2 - 1) << 1 : length2;
                    if (length2 < 0) {
                        length2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
                objArr = Arrays.copyOf(objArr, length2);
                kqVar.c = objArr;
            }
            int i3 = kqVar.b;
            int i4 = i3 << 1;
            objArr[i4] = valueOf;
            objArr[i4 + 1] = hddVar;
            kqVar.b = i3 + 1;
        }
        jhd jhdVar = (jhd) kqVar.d;
        if (jhdVar != null) {
            throw jhdVar.a();
        }
        skd c2 = skd.c(kqVar.b, (Object[]) kqVar.c, kqVar);
        jhd jhdVar2 = (jhd) kqVar.d;
        if (jhdVar2 != null) {
            throw jhdVar2.a();
        }
        c = c2;
    }

    hdd(int i) {
        this.a = i;
    }
}
