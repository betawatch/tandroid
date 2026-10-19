package org.telegram.tgnet;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public abstract class TLMethod<T extends TLObject> extends TLObject {
    @Override // org.telegram.tgnet.TLObject
    public final TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
        return deserializeResponseT(inputSerializedData, i10, z10);
    }

    public abstract T deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10);
}
