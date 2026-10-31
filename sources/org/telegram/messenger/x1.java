package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class x1 extends TLObject {
    public static final /* synthetic */ int b = 0;
    public ArrayList a = new ArrayList();

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        int readInt32 = inputSerializedData.readInt32(z10);
        if (readInt32 != 481674261) {
            if (z10) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
        } else {
            int readInt322 = inputSerializedData.readInt32(z10);
            for (int i10 = 0; i10 < readInt322; i10++) {
                this.a.add(TL_account.TL_contactBirthday.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10));
            }
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(TL_account.contactBirthdays.constructor);
        outputSerializedData.writeInt32(Vector.constructor);
        int size = this.a.size();
        outputSerializedData.writeInt32(size);
        for (int i10 = 0; i10 < size; i10++) {
            ((TL_account.TL_contactBirthday) this.a.get(i10)).serializeToStream(outputSerializedData);
        }
    }
}
