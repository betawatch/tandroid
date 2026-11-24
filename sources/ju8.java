// default package

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ju8 {
    public final short a;
    public final byte[] b;
    public final Object c;
    public final Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public ju8(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        this.c = str;
        this.a = i2;
        this.d = arrayList == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList);
        this.b = bArr;
    }

    public final int a() {
        short s = this.a;
        if (s != 2) {
            return s != 3 ? 0 : 512;
        }
        return 2048;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ju8(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
        this.c = uuid;
        this.a = i;
        this.b = bArr;
        this.d = uuidArr;
    }
}
