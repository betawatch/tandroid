package org.telegram.tgnet;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class TLMethod<T extends TLObject> extends TLObject {
    @Override // org.telegram.tgnet.TLObject
    public final TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
        return deserializeResponseT(inputSerializedData, i10, z4);
    }

    public abstract T deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4);
}
