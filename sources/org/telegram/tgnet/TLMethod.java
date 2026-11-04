package org.telegram.tgnet;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class TLMethod<T extends TLObject> extends TLObject {
    @Override // org.telegram.tgnet.TLObject
    public final TLObject deserializeResponse(InputSerializedData inputSerializedData, int i3, boolean z10) {
        return deserializeResponseT(inputSerializedData, i3, z10);
    }

    public abstract T deserializeResponseT(InputSerializedData inputSerializedData, int i3, boolean z10);
}
