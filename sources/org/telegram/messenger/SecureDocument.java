package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
