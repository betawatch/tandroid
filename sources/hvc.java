// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class hvc extends TLObject {
    public final ArrayList a = new ArrayList();

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        int readInt32 = inputSerializedData.readInt32(z);
        for (int i = 0; i < readInt32; i++) {
            ivc ivcVar = new ivc();
            ivcVar.readParams(inputSerializedData, z);
            if (TextUtils.isEmpty(ivcVar.b)) {
                return;
            }
            this.a.add(ivcVar);
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        ArrayList arrayList = this.a;
        outputSerializedData.writeInt32(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            ((ivc) arrayList.get(i)).serializeToStream(outputSerializedData);
        }
    }
}
