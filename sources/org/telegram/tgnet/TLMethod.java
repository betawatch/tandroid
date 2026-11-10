package org.telegram.tgnet;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class TLMethod<T extends TLObject> extends TLObject {
    @Override // org.telegram.tgnet.TLObject
    public final TLObject deserializeResponse(InputSerializedData inputSerializedData, int i7, boolean z9) {
        return deserializeResponseT(inputSerializedData, i7, z9);
    }

    public abstract T deserializeResponseT(InputSerializedData inputSerializedData, int i7, boolean z9);
}
