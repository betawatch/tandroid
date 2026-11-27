// default package

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class oj0 extends TLObject {
    public static final /* synthetic */ int b = 0;
    public ArrayList a = new ArrayList();

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        int readInt32 = inputSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
        } else {
            int readInt322 = inputSerializedData.readInt32(z);
            for (int i = 0; i < readInt322; i++) {
                this.a.add(TL_account.TL_contactBirthday.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z));
            }
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(TL_account.contactBirthdays.constructor);
        outputSerializedData.writeInt32(Vector.constructor);
        int size = this.a.size();
        outputSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            ((TL_account.TL_contactBirthday) this.a.get(i)).serializeToStream(outputSerializedData);
        }
    }
}
