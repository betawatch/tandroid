package org.telegram.messenger;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class z10 extends TLObject {
    public final boolean a;
    public final long b;
    public final long c;
    public final int d;
    public final String e;
    public final String f;
    public final /* synthetic */ a20 i;

    public z10(a20 a20Var, NativeByteBuffer nativeByteBuffer) {
        this.i = a20Var;
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 == 2058772876) {
            this.b = nativeByteBuffer.readInt64(true);
            this.d = nativeByteBuffer.readInt32(true);
            this.e = nativeByteBuffer.readString(true);
            this.f = nativeByteBuffer.readString(true);
            return;
        }
        if (readInt32 != 2058772877) {
            TLParseException.doThrowOrLog(nativeByteBuffer, "UnconfirmedAuth", readInt32, true);
            return;
        }
        this.c = nativeByteBuffer.readInt64(true);
        this.d = nativeByteBuffer.readInt32(true);
        this.e = nativeByteBuffer.readString(true);
        this.f = nativeByteBuffer.readString(true);
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        boolean z10 = this.a;
        String str = this.f;
        String str2 = this.e;
        int i10 = this.d;
        if (z10) {
            outputSerializedData.writeInt32(2058772877);
            outputSerializedData.writeInt64(this.c);
            outputSerializedData.writeInt32(i10);
            outputSerializedData.writeString(str2);
            outputSerializedData.writeString(str);
            return;
        }
        outputSerializedData.writeInt32(2058772876);
        outputSerializedData.writeInt64(this.b);
        outputSerializedData.writeInt32(i10);
        outputSerializedData.writeString(str2);
        outputSerializedData.writeString(str);
    }

    public z10(a20 a20Var, TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        this.i = a20Var;
        this.b = tL_updateNewAuthorization.hash;
        this.d = tL_updateNewAuthorization.date;
        this.e = tL_updateNewAuthorization.device;
        this.f = tL_updateNewAuthorization.location;
    }

    public z10(a20 a20Var, TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        this.i = a20Var;
        this.a = true;
        long j10 = tL_updateNewBotConnection.bot_id;
        this.c = j10;
        this.b = j10;
        this.d = tL_updateNewBotConnection.date;
        this.e = tL_updateNewBotConnection.device;
        this.f = tL_updateNewBotConnection.location;
    }
}
