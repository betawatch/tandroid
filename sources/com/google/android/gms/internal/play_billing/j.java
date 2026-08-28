package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    /* JADX WARN: Multi-variable type inference failed */
    static {
        a6.a aVar = new a6.a((char) (0 == true ? 1 : 0), 4);
        aVar.b = new Object[8];
        aVar.c = 0;
        for (j jVar : values()) {
            Integer valueOf = Integer.valueOf(jVar.a);
            int i9 = aVar.c + 1;
            Object[] objArr = (Object[]) aVar.b;
            int length = objArr.length;
            int i10 = i9 + i9;
            if (i10 > length) {
                if (i10 > length) {
                    length = length + (length >> 1) + 1;
                    if (length < i10) {
                        int highestOneBit = Integer.highestOneBit(i10 - 1);
                        length = highestOneBit + highestOneBit;
                    }
                    if (length < 0) {
                        length = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
                aVar.b = Arrays.copyOf(objArr, length);
            }
            Object[] objArr2 = (Object[]) aVar.b;
            int i11 = aVar.c;
            int i12 = i11 + i11;
            objArr2[i12] = valueOf;
            objArr2[i12 + 1] = jVar;
            aVar.c = i11 + 1;
        }
        s sVar = (s) aVar.d;
        if (sVar != null) {
            throw sVar.a();
        }
        a0 b10 = a0.b(aVar.c, (Object[]) aVar.b, aVar);
        s sVar2 = (s) aVar.d;
        if (sVar2 != null) {
            throw sVar2.a();
        }
        c = b10;
    }

    j(int i9) {
        this.a = i9;
    }
}
