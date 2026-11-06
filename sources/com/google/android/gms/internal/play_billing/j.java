package com.google.android.gms.internal.play_billing;

import a8.wa;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
        wa waVar = new wa(c10, 5);
        waVar.c = new Object[8];
        waVar.b = 0;
        j[] values = values();
        int length = values.length;
        for (int i7 = c10; i7 < length; i7++) {
            j jVar = values[i7];
            Integer valueOf = Integer.valueOf(jVar.a);
            int i10 = waVar.b + 1;
            Object[] objArr = (Object[]) waVar.c;
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
                waVar.c = Arrays.copyOf(objArr, length2);
            }
            Object[] objArr2 = (Object[]) waVar.c;
            int i12 = waVar.b;
            int i13 = i12 + i12;
            objArr2[i13] = valueOf;
            objArr2[i13 + 1] = jVar;
            waVar.b = i12 + 1;
        }
        s sVar = (s) waVar.d;
        if (sVar != null) {
            throw sVar.a();
        }
        a0 c11 = a0.c(waVar.b, (Object[]) waVar.c, waVar);
        s sVar2 = (s) waVar.d;
        if (sVar2 != null) {
            throw sVar2.a();
        }
        c = c11;
    }

    j(int i7) {
        this.a = i7;
    }
}
