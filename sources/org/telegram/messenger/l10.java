package org.telegram.messenger;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class l10 extends TLObject {
    public final boolean a;
    public final long b;
    public final long c;
    public final int d;
    public final String e;
    public final String f;
    public final /* synthetic */ m10 i;

    public l10(m10 m10Var, NativeByteBuffer nativeByteBuffer) {
        this.i = m10Var;
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
        boolean z9 = this.a;
        String str = this.f;
        String str2 = this.e;
        int i7 = this.d;
        if (z9) {
            outputSerializedData.writeInt32(2058772877);
            outputSerializedData.writeInt64(this.c);
            outputSerializedData.writeInt32(i7);
            outputSerializedData.writeString(str2);
            outputSerializedData.writeString(str);
            return;
        }
        outputSerializedData.writeInt32(2058772876);
        outputSerializedData.writeInt64(this.b);
        outputSerializedData.writeInt32(i7);
        outputSerializedData.writeString(str2);
        outputSerializedData.writeString(str);
    }

    public l10(m10 m10Var, TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        this.i = m10Var;
        this.b = tL_updateNewAuthorization.hash;
        this.d = tL_updateNewAuthorization.date;
        this.e = tL_updateNewAuthorization.device;
        this.f = tL_updateNewAuthorization.location;
    }

    public l10(m10 m10Var, TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        this.i = m10Var;
        this.a = true;
        long j3 = tL_updateNewBotConnection.bot_id;
        this.c = j3;
        this.b = j3;
        this.d = tL_updateNewBotConnection.date;
        this.e = tL_updateNewBotConnection.device;
        this.f = tL_updateNewBotConnection.location;
    }
}
