package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class pw extends TLObject {
    public final qw a;
    public final TLRPC.TL_secureFile b;
    public final String c;
    public TLRPC.TL_inputFile d;
    public final byte[] e;
    public final byte[] f;
    public int i;

    public pw(qw qwVar, TLRPC.TL_secureFile tL_secureFile, String str, byte[] bArr, byte[] bArr2) {
        this.a = qwVar;
        this.b = tL_secureFile;
        this.c = str;
        this.f = bArr;
        this.e = bArr2;
    }
}
