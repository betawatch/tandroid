package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class SecureDocument extends TLObject {
    public byte[] fileHash;
    public byte[] fileSecret;
    public TLRPC.TL_inputFile inputFile;
    public String path;
    public SecureDocumentKey secureDocumentKey;
    public TLRPC.TL_secureFile secureFile;
    public int type;

    public SecureDocument(SecureDocumentKey secureDocumentKey, TLRPC.TL_secureFile tL_secureFile, String str, byte[] bArr, byte[] bArr2) {
        this.secureDocumentKey = secureDocumentKey;
        this.secureFile = tL_secureFile;
        this.path = str;
        this.fileHash = bArr;
        this.fileSecret = bArr2;
    }
}
