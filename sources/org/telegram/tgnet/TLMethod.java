package org.telegram.tgnet;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class TLMethod<T extends TLObject> extends TLObject {
    @Override // org.telegram.tgnet.TLObject
    public final TLObject deserializeResponse(InputSerializedData inputSerializedData, int i7, boolean z10) {
        return deserializeResponseT(inputSerializedData, i7, z10);
    }

    public abstract T deserializeResponseT(InputSerializedData inputSerializedData, int i7, boolean z10);
}
