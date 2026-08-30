package org.telegram.tgnet;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class TLMethod<T extends TLObject> extends TLObject {
    @Override // org.telegram.tgnet.TLObject
    public final TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
        return deserializeResponseT(inputSerializedData, i10, z4);
    }

    public abstract T deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4);
}
