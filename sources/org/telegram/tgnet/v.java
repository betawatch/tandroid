package org.telegram.tgnet;

import org.telegram.messenger.z10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OutputSerializedData b;

    public /* synthetic */ v(OutputSerializedData outputSerializedData, int i7) {
        this.a = i7;
        this.b = outputSerializedData;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
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
