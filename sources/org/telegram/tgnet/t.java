package org.telegram.tgnet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ InputSerializedData b;

    public /* synthetic */ t(InputSerializedData inputSerializedData, int i9) {
        this.a = i9;
        this.b = inputSerializedData;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        int i9 = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i9) {
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
