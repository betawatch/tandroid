package org.telegram.tgnet.tl;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class TL_fragment {

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class InputCollectible extends TLObject {
        public static InputCollectible TLdeserialize(InputSerializedData inputSerializedData, int i9, boolean z10) {
            return (InputCollectible) TLObject.TLdeserialize(InputCollectible.class, i9 != -1562241884 ? i9 != -476815191 ? null : new TL_inputCollectibleUsername() : new TL_inputCollectiblePhone(), inputSerializedData, i9, z10);
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class TL_collectibleInfo extends TLObject {
        public static final int constructor = 1857945489;
        public long amount;
        public long crypto_amount;
        public String crypto_currency;
        public String currency;
        public int purchase_date;
        public String url;

        public static TL_collectibleInfo TLdeserialize(InputSerializedData inputSerializedData, int i9, boolean z10) {
            return (TL_collectibleInfo) TLObject.TLdeserialize(TL_collectibleInfo.class, 1857945489 != i9 ? null : new TL_collectibleInfo(), inputSerializedData, i9, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.purchase_date = inputSerializedData.readInt32(z10);
            this.currency = inputSerializedData.readString(z10);
            this.amount = inputSerializedData.readInt64(z10);
            this.crypto_currency = inputSerializedData.readString(z10);
            this.crypto_amount = inputSerializedData.readInt64(z10);
            this.url = inputSerializedData.readString(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.purchase_date);
            outputSerializedData.writeString(this.currency);
            outputSerializedData.writeInt64(this.amount);
            outputSerializedData.writeString(this.crypto_currency);
            outputSerializedData.writeInt64(this.crypto_amount);
            outputSerializedData.writeString(this.url);
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class TL_getCollectibleInfo extends TLObject {
        public static final int constructor = -1105295942;
        public InputCollectible collectible;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i9, boolean z10) {
            return TL_collectibleInfo.TLdeserialize(inputSerializedData, i9, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.collectible.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class TL_inputCollectiblePhone extends InputCollectible {
        public static final int constructor = -1562241884;
        public String phone;

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.phone = inputSerializedData.readString(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.phone);
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class TL_inputCollectibleUsername extends InputCollectible {
        public static final int constructor = -476815191;
        public String username;

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.username = inputSerializedData.readString(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.username);
        }
    }
}
