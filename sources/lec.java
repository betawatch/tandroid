// default package

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class lec extends TLRPC.TL_messageEntityCustomEmoji {
    public String a;
    public mec b;
    public byte c;

    @Override // org.telegram.tgnet.TLRPC.TL_messageEntityCustomEmoji, org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        super.readParams(inputSerializedData, z);
        this.c = inputSerializedData.readByte(z);
        if (inputSerializedData.readBool(z)) {
            this.a = inputSerializedData.readString(z);
        }
        if (TextUtils.isEmpty(this.a)) {
            this.a = null;
        }
    }

    @Override // org.telegram.tgnet.TLRPC.TL_messageEntityCustomEmoji, org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        super.serializeToStream(outputSerializedData);
        outputSerializedData.writeByte(this.c);
        outputSerializedData.writeBool(!TextUtils.isEmpty(this.a));
        if (TextUtils.isEmpty(this.a)) {
            return;
        }
        outputSerializedData.writeString(this.a);
    }
}
