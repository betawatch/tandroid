package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class cw extends TLObject {
    public final dw a;
    public final TLRPC.TL_secureFile b;
    public final String c;
    public TLRPC.TL_inputFile d;
    public final byte[] e;
    public final byte[] f;
    public int i;

    public cw(dw dwVar, TLRPC.TL_secureFile tL_secureFile, String str, byte[] bArr, byte[] bArr2) {
        this.a = dwVar;
        this.b = tL_secureFile;
        this.c = str;
        this.f = bArr;
        this.e = bArr2;
    }
}
