package org.telegram.tgnet;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class TLMethod<T extends TLObject> extends TLObject {
    @Override // org.telegram.tgnet.TLObject
    public final TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
        return deserializeResponseT(inputSerializedData, i10, z10);
    }

    public abstract T deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10);
}
