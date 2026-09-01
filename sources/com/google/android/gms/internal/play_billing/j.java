package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        b4.e0 e0Var = new b4.e0((char) (0 == true ? 1 : 0), 3);
        e0Var.c = new Object[8];
        e0Var.b = 0;
        for (j jVar : values()) {
            Integer valueOf = Integer.valueOf(jVar.a);
            int i10 = e0Var.b + 1;
            Object[] objArr = (Object[]) e0Var.c;
            int length = objArr.length;
            int i11 = i10 + i10;
            if (i11 > length) {
                if (i11 > length) {
                    length = length + (length >> 1) + 1;
                    if (length < i11) {
                        int highestOneBit = Integer.highestOneBit(i11 - 1);
                        length = highestOneBit + highestOneBit;
                    }
                    if (length < 0) {
                        length = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
                e0Var.c = Arrays.copyOf(objArr, length);
            }
            Object[] objArr2 = (Object[]) e0Var.c;
            int i12 = e0Var.b;
            int i13 = i12 + i12;
            objArr2[i13] = valueOf;
            objArr2[i13 + 1] = jVar;
            e0Var.b = i12 + 1;
        }
        s sVar = (s) e0Var.d;
        if (sVar != null) {
            throw sVar.a();
        }
        a0 b10 = a0.b(e0Var.b, (Object[]) e0Var.c, e0Var);
        s sVar2 = (s) e0Var.d;
        if (sVar2 != null) {
            throw sVar2.a();
        }
        c = b10;
    }

    j(int i10) {
        this.a = i10;
    }
}
