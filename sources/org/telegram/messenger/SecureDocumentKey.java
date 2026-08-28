package org.telegram.messenger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class SecureDocumentKey {
    public byte[] file_iv;
    public byte[] file_key;

    public SecureDocumentKey(byte[] bArr, byte[] bArr2) {
        this.file_key = bArr;
        this.file_iv = bArr2;
    }
}
