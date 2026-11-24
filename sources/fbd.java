// default package

import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum fbd {
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

    public static final qid c;
    public final int a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    static {
        boolean z = false;
        kp kpVar = new kp((byte) 19, z);
        kpVar.c = new Object[8];
        kpVar.b = 0;
        fbd[] values = values();
        int length = values.length;
        for (?? r2 = z; r2 < length; r2++) {
            fbd fbdVar = values[r2];
            Integer valueOf = Integer.valueOf(fbdVar.a);
            int i = kpVar.b + 1;
            Object[] objArr = (Object[]) kpVar.c;
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
                kpVar.c = objArr;
            }
            int i3 = kpVar.b;
            int i4 = i3 << 1;
            objArr[i4] = valueOf;
            objArr[i4 + 1] = fbdVar;
            kpVar.b = i3 + 1;
        }
        ifd ifdVar = (ifd) kpVar.d;
        if (ifdVar != null) {
            throw ifdVar.a();
        }
        qid c2 = qid.c(kpVar.b, (Object[]) kpVar.c, kpVar);
        ifd ifdVar2 = (ifd) kpVar.d;
        if (ifdVar2 != null) {
            throw ifdVar2.a();
        }
        c = c2;
    }

    fbd(int i) {
        this.a = i;
    }
}
