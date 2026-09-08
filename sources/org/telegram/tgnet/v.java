package org.telegram.tgnet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ OutputSerializedData b;

    public /* synthetic */ v(OutputSerializedData outputSerializedData, int i10) {
        this.a = i10;
        this.b = outputSerializedData;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.writeInt64(((Long) obj).longValue());
                break;
            case 1:
                this.b.writeInt32(((Integer) obj).intValue());
                break;
            case 2:
                this.b.writeByteArray((byte[]) obj);
                break;
            default:
                this.b.writeString((String) obj);
                break;
        }
    }
}
