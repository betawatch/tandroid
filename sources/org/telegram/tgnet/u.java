package org.telegram.tgnet;

import org.telegram.messenger.d20;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements d20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InputSerializedData b;

    public /* synthetic */ u(InputSerializedData inputSerializedData, int i7) {
        this.a = i7;
        this.b = inputSerializedData;
    }

    @Override // org.telegram.messenger.d20
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
