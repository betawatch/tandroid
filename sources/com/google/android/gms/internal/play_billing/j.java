package com.google.android.gms.internal.play_billing;

import b8.kg;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum j {
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

    public static final a0 c;
    public final int a;

    static {
        char c2 = 0;
        kg kgVar = new kg(c2, 5);
        kgVar.c = new Object[8];
        kgVar.b = 0;
        j[] values = values();
        int length = values.length;
        for (int i3 = c2; i3 < length; i3++) {
            j jVar = values[i3];
            Integer valueOf = Integer.valueOf(jVar.a);
            int i10 = kgVar.b + 1;
            Object[] objArr = (Object[]) kgVar.c;
            int length2 = objArr.length;
            int i11 = i10 + i10;
            if (i11 > length2) {
                if (i11 > length2) {
                    length2 = length2 + (length2 >> 1) + 1;
                    if (length2 < i11) {
                        int highestOneBit = Integer.highestOneBit(i11 - 1);
                        length2 = highestOneBit + highestOneBit;
                    }
                    if (length2 < 0) {
                        length2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
                kgVar.c = Arrays.copyOf(objArr, length2);
            }
            Object[] objArr2 = (Object[]) kgVar.c;
            int i12 = kgVar.b;
            int i13 = i12 + i12;
            objArr2[i13] = valueOf;
            objArr2[i13 + 1] = jVar;
            kgVar.b = i12 + 1;
        }
        s sVar = (s) kgVar.d;
        if (sVar != null) {
            throw sVar.a();
        }
        a0 c10 = a0.c(kgVar.b, (Object[]) kgVar.c, kgVar);
        s sVar2 = (s) kgVar.d;
        if (sVar2 != null) {
            throw sVar2.a();
        }
        c = c10;
    }

    j(int i3) {
        this.a = i3;
    }
}
