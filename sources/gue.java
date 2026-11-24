// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gue extends zoe {
    public final byte[] c;

    public gue(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.c = bArr;
    }

    @Override // zoe
    public final byte[] T() {
        return this.c;
    }
}
