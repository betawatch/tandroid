package org.telegram.tgnet;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class TLMethod<T extends TLObject> extends TLObject {
    @Override // org.telegram.tgnet.TLObject
    public final TLObject deserializeResponse(InputSerializedData inputSerializedData, int i9, boolean z10) {
        return deserializeResponseT(inputSerializedData, i9, z10);
    }

    public abstract T deserializeResponseT(InputSerializedData inputSerializedData, int i9, boolean z10);
}
