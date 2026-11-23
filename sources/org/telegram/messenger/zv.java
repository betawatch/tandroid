package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class zv extends TLObject {
    public final aw a;
    public final TLRPC.TL_secureFile b;
    public final String c;
    public TLRPC.TL_inputFile d;
    public final byte[] e;
    public final byte[] f;
    public int i;

    public zv(aw awVar, TLRPC.TL_secureFile tL_secureFile, String str, byte[] bArr, byte[] bArr2) {
        this.a = awVar;
        this.b = tL_secureFile;
        this.c = str;
        this.f = bArr;
        this.e = bArr2;
    }
}
