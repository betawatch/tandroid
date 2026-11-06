package org.telegram.tgnet;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class TLMethod<T extends TLObject> extends TLObject {
    @Override // org.telegram.tgnet.TLObject
    public final TLObject deserializeResponse(InputSerializedData inputSerializedData, int i7, boolean z9) {
        return deserializeResponseT(inputSerializedData, i7, z9);
    }

    public abstract T deserializeResponseT(InputSerializedData inputSerializedData, int i7, boolean z9);
}
