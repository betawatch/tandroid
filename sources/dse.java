// default package

import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class dse extends wme {
    public final byte[] c;

    public dse(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.c = bArr;
    }

    @Override // wme
    public final byte[] T() {
        return this.c;
    }
}
