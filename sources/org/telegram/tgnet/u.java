package org.telegram.tgnet;

import org.telegram.messenger.v10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InputSerializedData b;

    public /* synthetic */ u(InputSerializedData inputSerializedData, int i3) {
        this.a = i3;
        this.b = inputSerializedData;
    }

    @Override // org.telegram.messenger.v10
    public final Object a(Object obj) {
        int i3 = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i3) {
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
