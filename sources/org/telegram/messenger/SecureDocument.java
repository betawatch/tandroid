package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
