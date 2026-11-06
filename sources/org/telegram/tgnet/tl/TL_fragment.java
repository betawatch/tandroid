package org.telegram.tgnet.tl;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class TL_fragment {

    /* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
    public static class InputCollectible extends TLObject {
        public static InputCollectible TLdeserialize(InputSerializedData inputSerializedData, int i7, boolean z9) {
            return (InputCollectible) TLObject.TLdeserialize(InputCollectible.class, i7 != -1562241884 ? i7 != -476815191 ? null : new TL_inputCollectibleUsername() : new TL_inputCollectiblePhone(), inputSerializedData, i7, z9);
        }
    }

    /* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
    public static class TL_collectibleInfo extends TLObject {
        public static final int constructor = 1857945489;
        public long amount;
        public long crypto_amount;
        public String crypto_currency;
        public String currency;
        public int purchase_date;
        public String url;

        public static TL_collectibleInfo TLdeserialize(InputSerializedData inputSerializedData, int i7, boolean z9) {
            return (TL_collectibleInfo) TLObject.TLdeserialize(TL_collectibleInfo.class, 1857945489 != i7 ? null : new TL_collectibleInfo(), inputSerializedData, i7, z9);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z9) {
            this.purchase_date = inputSerializedData.readInt32(z9);
            this.currency = inputSerializedData.readString(z9);
            this.amount = inputSerializedData.readInt64(z9);
            this.crypto_currency = inputSerializedData.readString(z9);
            this.crypto_amount = inputSerializedData.readInt64(z9);
            this.url = inputSerializedData.readString(z9);
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

    /* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
    public static class TL_getCollectibleInfo extends TLObject {
        public static final int constructor = -1105295942;
        public InputCollectible collectible;

        @Override // org.telegram.tgnet.TLObject
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i7, boolean z9) {
            return TL_collectibleInfo.TLdeserialize(inputSerializedData, i7, z9);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.collectible.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
    public static class TL_inputCollectiblePhone extends InputCollectible {
        public static final int constructor = -1562241884;
        public String phone;

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z9) {
            this.phone = inputSerializedData.readString(z9);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.phone);
        }
    }

    /* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
    public static class TL_inputCollectibleUsername extends InputCollectible {
        public static final int constructor = -476815191;
        public String username;

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z9) {
            this.username = inputSerializedData.readString(z9);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.username);
        }
    }
}
