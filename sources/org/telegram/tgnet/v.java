package org.telegram.tgnet;

import org.telegram.messenger.c20;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OutputSerializedData b;

    public /* synthetic */ v(OutputSerializedData outputSerializedData, int i7) {
        this.a = i7;
        this.b = outputSerializedData;
    }

    @Override // org.telegram.messenger.c20
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
