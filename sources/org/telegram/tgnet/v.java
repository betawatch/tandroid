package org.telegram.tgnet;

import org.telegram.messenger.c20;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
