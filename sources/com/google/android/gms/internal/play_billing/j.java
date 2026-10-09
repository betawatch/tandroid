package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        char c10 = 0;
        a5.a aVar = new a5.a(c10, 3);
        aVar.c = new Object[8];
        aVar.b = 0;
        j[] values = values();
        int length = values.length;
        for (int i10 = c10; i10 < length; i10++) {
            j jVar = values[i10];
            Integer valueOf = Integer.valueOf(jVar.a);
            int i11 = aVar.b + 1;
            Object[] objArr = (Object[]) aVar.c;
            int length2 = objArr.length;
            int i12 = i11 + i11;
            if (i12 > length2) {
                if (i12 > length2) {
                    length2 = length2 + (length2 >> 1) + 1;
                    if (length2 < i12) {
                        int highestOneBit = Integer.highestOneBit(i12 - 1);
                        length2 = highestOneBit + highestOneBit;
                    }
                    if (length2 < 0) {
                        length2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
                aVar.c = Arrays.copyOf(objArr, length2);
            }
            Object[] objArr2 = (Object[]) aVar.c;
            int i13 = aVar.b;
            int i14 = i13 + i13;
            objArr2[i14] = valueOf;
            objArr2[i14 + 1] = jVar;
            aVar.b = i13 + 1;
        }
        s sVar = (s) aVar.d;
        if (sVar != null) {
            throw sVar.a();
        }
        a0 b10 = a0.b(aVar.b, (Object[]) aVar.c, aVar);
        s sVar2 = (s) aVar.d;
        if (sVar2 != null) {
            throw sVar2.a();
        }
        c = b10;
    }

    j(int i10) {
        this.a = i10;
    }
}
