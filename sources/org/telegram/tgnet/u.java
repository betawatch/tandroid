package org.telegram.tgnet;

import org.telegram.messenger.y10;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InputSerializedData b;

    public /* synthetic */ u(InputSerializedData inputSerializedData, int i7) {
        this.a = i7;
        this.b = inputSerializedData;
    }

    @Override // org.telegram.messenger.y10
    public final Object a(Object obj) {
        int i7 = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i7) {
            case 0:
                return Long.valueOf(this.b.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(this.b.readInt32(booleanValue));
            case 2:
                return this.b.readString(booleanValue);
            default:
                return this.b.readByteArray(booleanValue);
        }
    }
}
