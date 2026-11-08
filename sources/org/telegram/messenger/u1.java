package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class u1 extends TLObject {
    public static final /* synthetic */ int b = 0;
    public ArrayList a = new ArrayList();

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        int readInt32 = inputSerializedData.readInt32(z9);
        if (readInt32 != 481674261) {
            if (z9) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
        } else {
            int readInt322 = inputSerializedData.readInt32(z9);
            for (int i7 = 0; i7 < readInt322; i7++) {
                this.a.add(TL_account.TL_contactBirthday.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9));
            }
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(TL_account.contactBirthdays.constructor);
        outputSerializedData.writeInt32(Vector.constructor);
        int size = this.a.size();
        outputSerializedData.writeInt32(size);
        for (int i7 = 0; i7 < size; i7++) {
            ((TL_account.TL_contactBirthday) this.a.get(i7)).serializeToStream(outputSerializedData);
        }
    }
}
