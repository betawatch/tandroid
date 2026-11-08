package org.telegram.messenger;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class cw extends TLObject {
    public int a;
    public TLRPC.TL_decryptedMessageLayer b;
    public TLRPC.EncryptedFile c;
    public boolean d;
    public int e;

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        inputSerializedData.readInt64(z9);
        this.a = inputSerializedData.readInt32(z9);
        this.b = TLRPC.TL_decryptedMessageLayer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
        if (inputSerializedData.readBool(z9)) {
            this.c = TLRPC.EncryptedFile.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
        }
        this.d = inputSerializedData.readBool(z9);
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
