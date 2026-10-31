package org.telegram.messenger;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class nw extends TLObject {
    public int a;
    public TLRPC.TL_decryptedMessageLayer b;
    public TLRPC.EncryptedFile c;
    public boolean d;
    public int e;

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        inputSerializedData.readInt64(z10);
        this.a = inputSerializedData.readInt32(z10);
        this.b = TLRPC.TL_decryptedMessageLayer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        if (inputSerializedData.readBool(z10)) {
            this.c = TLRPC.EncryptedFile.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        this.d = inputSerializedData.readBool(z10);
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(TLRPC.TL_message_secret_layer72.constructor);
        outputSerializedData.writeInt64(0L);
        outputSerializedData.writeInt32(this.a);
        this.b.serializeToStream(outputSerializedData);
        outputSerializedData.writeBool(this.c != null);
        TLRPC.EncryptedFile encryptedFile = this.c;
        if (encryptedFile != null) {
            encryptedFile.serializeToStream(outputSerializedData);
        }
        outputSerializedData.writeBool(this.d);
    }
}
