package org.telegram.tgnet;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class TLMethod<T extends TLObject> extends TLObject {
    @Override // org.telegram.tgnet.TLObject
    public final TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
        return deserializeResponseT(inputSerializedData, i10, z4);
    }

    public abstract T deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4);
}
