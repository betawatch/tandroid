package org.telegram.tgnet;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class TLMethod<T extends TLObject> extends TLObject {
    @Override // org.telegram.tgnet.TLObject
    public final TLObject deserializeResponse(InputSerializedData inputSerializedData, int i7, boolean z9) {
        return deserializeResponseT(inputSerializedData, i7, z9);
    }

    public abstract T deserializeResponseT(InputSerializedData inputSerializedData, int i7, boolean z9);
}
