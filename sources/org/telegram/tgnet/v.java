package org.telegram.tgnet;

import org.telegram.messenger.r20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InputSerializedData b;

    public /* synthetic */ v(InputSerializedData inputSerializedData, int i10) {
        this.a = i10;
        this.b = inputSerializedData;
    }

    @Override // org.telegram.messenger.r20
    public final Object a(Object obj) {
        int i10 = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
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
