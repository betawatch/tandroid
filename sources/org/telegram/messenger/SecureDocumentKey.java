package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class SecureDocumentKey {
    public byte[] file_iv;
    public byte[] file_key;

    public SecureDocumentKey(byte[] bArr, byte[] bArr2) {
        this.file_key = bArr;
        this.file_iv = bArr2;
    }
}
