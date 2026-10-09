package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class TL_toncenter {

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class apiResponse extends TLObject {
        public static final int constructor = -1399980519;
        public TLRPC.TL_dataJSON response;

        public static apiResponse TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (apiResponse) TLObject.TLdeserialize(apiResponse.class, -1399980519 != i10 ? null : new apiResponse(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.response = TLRPC.TL_dataJSON.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.response.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class createOnrampSession extends TLMethod<onrampSession> {
        public static final int constructor = -1575387914;
        public String address;
        public String base_amount;
        public String base_currency;
        public String crypto_amount;
        public String crypto_currency;
        public String fail_return_url;
        public String memo;
        public String payment_method;
        public String provider;
        public String success_return_url;
        public String theme;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(TLObject.setFlag(TLObject.setFlag(TLObject.setFlag(TLObject.setFlag(TLObject.setFlag(TLObject.setFlag(TLObject.setFlag(TLObject.setFlag(0, 1, this.payment_method != null), 2, this.base_currency != null), 4, this.base_amount != null), 8, this.memo != null), 16, this.theme != null), 32, this.success_return_url != null), 64, this.fail_return_url != null), 128, this.crypto_amount != null));
            outputSerializedData.writeString(this.provider);
            outputSerializedData.writeString(this.crypto_currency);
            outputSerializedData.writeString(this.address);
            String str = this.payment_method;
            if (str != null) {
                outputSerializedData.writeString(str);
            }
            String str2 = this.base_currency;
            if (str2 != null) {
                outputSerializedData.writeString(str2);
            }
            String str3 = this.base_amount;
            if (str3 != null) {
                outputSerializedData.writeString(str3);
            }
            String str4 = this.memo;
            if (str4 != null) {
                outputSerializedData.writeString(str4);
            }
            String str5 = this.theme;
            if (str5 != null) {
                outputSerializedData.writeString(str5);
            }
            String str6 = this.success_return_url;
            if (str6 != null) {
                outputSerializedData.writeString(str6);
            }
            String str7 = this.fail_return_url;
            if (str7 != null) {
                outputSerializedData.writeString(str7);
            }
            String str8 = this.crypto_amount;
            if (str8 != null) {
                outputSerializedData.writeString(str8);
            }
        }

        @Override // org.telegram.tgnet.TLMethod
        public onrampSession deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return onrampSession.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class getOnrampAvailability extends TLMethod<onrampAvailability> {
        public static final int constructor = 784505169;
        public String base_currency;
        public String crypto_currency;
        public String provider;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            int flag = TLObject.setFlag(0, 1, this.base_currency != null);
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.provider);
            outputSerializedData.writeString(this.crypto_currency);
            String str = this.base_currency;
            if (str != null) {
                outputSerializedData.writeString(str);
            }
        }

        @Override // org.telegram.tgnet.TLMethod
        public onrampAvailability deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return onrampAvailability.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class getOnrampBaseCurrencies extends TLMethod<onrampBaseCurrencies> {
        public static final int constructor = 478932467;
        public String crypto_currency;
        public String provider;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.provider);
            outputSerializedData.writeString(this.crypto_currency);
        }

        @Override // org.telegram.tgnet.TLMethod
        public onrampBaseCurrencies deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return onrampBaseCurrencies.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class getOnrampLimits extends TLMethod<onrampLimits> {
        public static final int constructor = -2132258307;
        public String base_currency;
        public String crypto_currency;
        public String payment_method;
        public String provider;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            int flag = TLObject.setFlag(0, 1, this.payment_method != null);
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.provider);
            outputSerializedData.writeString(this.crypto_currency);
            outputSerializedData.writeString(this.base_currency);
            String str = this.payment_method;
            if (str != null) {
                outputSerializedData.writeString(str);
            }
        }

        @Override // org.telegram.tgnet.TLMethod
        public onrampLimits deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return onrampLimits.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class getOnrampProviders extends TLMethod<Vector<onrampProviderInfo>> {
        public static final int constructor = 1061028060;
        public String crypto_currency;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            int flag = TLObject.setFlag(0, 1, this.crypto_currency != null);
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(flag);
            String str = this.crypto_currency;
            if (str != null) {
                outputSerializedData.writeString(str);
            }
        }

        @Override // org.telegram.tgnet.TLMethod
        public Vector<onrampProviderInfo> deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return Vector.TLDeserialize(inputSerializedData, i10, z10, new d(15));
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class getOnrampQuote extends TLMethod<onrampQuote> {
        public static final int constructor = -530168326;
        public String base_amount;
        public String base_currency;
        public String crypto_amount;
        public String crypto_currency;
        public String payment_method;
        public String provider;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            int flag = TLObject.setFlag(TLObject.setFlag(TLObject.setFlag(0, 1, this.base_amount != null), 2, this.crypto_amount != null), 4, this.payment_method != null);
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.provider);
            outputSerializedData.writeString(this.crypto_currency);
            outputSerializedData.writeString(this.base_currency);
            String str = this.base_amount;
            if (str != null) {
                outputSerializedData.writeString(str);
            }
            String str2 = this.crypto_amount;
            if (str2 != null) {
                outputSerializedData.writeString(str2);
            }
            String str3 = this.payment_method;
            if (str3 != null) {
                outputSerializedData.writeString(str3);
            }
        }

        @Override // org.telegram.tgnet.TLMethod
        public onrampQuote deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return onrampQuote.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class getStreamingUrl extends TLMethod<streamingUrl> {
        public static final int constructor = -844143673;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }

        @Override // org.telegram.tgnet.TLMethod
        public streamingUrl deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return streamingUrl.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class onrampAvailability extends TLObject {
        public static final int constructor = -104314509;
        public boolean allowed;
        public boolean buy_allowed;
        public String country_code;
        public int flags;
        public ArrayList<onrampMethodAvailability> methods = new ArrayList<>();
        public String state;

        public static onrampAvailability TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (onrampAvailability) TLObject.TLdeserialize(onrampAvailability.class, -104314509 != i10 ? null : new onrampAvailability(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.allowed = TLObject.hasFlag(readInt32, 1);
            this.buy_allowed = TLObject.hasFlag(this.flags, 2);
            this.country_code = inputSerializedData.readString(z10);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.state = inputSerializedData.readString(z10);
            }
            this.methods = Vector.deserialize(inputSerializedData, new d(16), z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.allowed);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.buy_allowed);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.state != null);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            outputSerializedData.writeString(this.country_code);
            String str = this.state;
            if (str != null) {
                outputSerializedData.writeString(str);
            }
            Vector.serialize(outputSerializedData, this.methods);
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class onrampBaseCurrencies extends TLObject {
        public ArrayList<String> currencies = new ArrayList<>();

        public static onrampBaseCurrencies TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            if (i10 != 481674261) {
                return (onrampBaseCurrencies) TLObject.TLdeserialize(onrampBaseCurrencies.class, null, inputSerializedData, i10, z10);
            }
            onrampBaseCurrencies onrampbasecurrencies = new onrampBaseCurrencies();
            onrampbasecurrencies.readParams(inputSerializedData, z10);
            return onrampbasecurrencies;
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.currencies = Vector.deserializeString(inputSerializedData, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            Vector.serializeString(outputSerializedData, this.currencies);
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class onrampLimits extends TLObject {
        public static final int constructor = 2078435198;
        public String base_currency;
        public String base_max_amount;
        public String base_min_amount;
        public String crypto_max_amount;
        public String crypto_min_amount;
        public String payment_method;

        public static onrampLimits TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (onrampLimits) TLObject.TLdeserialize(onrampLimits.class, 2078435198 != i10 ? null : new onrampLimits(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.base_currency = inputSerializedData.readString(z10);
            this.base_min_amount = inputSerializedData.readString(z10);
            this.base_max_amount = inputSerializedData.readString(z10);
            this.crypto_min_amount = inputSerializedData.readString(z10);
            this.crypto_max_amount = inputSerializedData.readString(z10);
            this.payment_method = inputSerializedData.readString(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.base_currency);
            outputSerializedData.writeString(this.base_min_amount);
            outputSerializedData.writeString(this.base_max_amount);
            outputSerializedData.writeString(this.crypto_min_amount);
            outputSerializedData.writeString(this.crypto_max_amount);
            outputSerializedData.writeString(this.payment_method);
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class onrampMethodAvailability extends TLObject {
        public static final int constructor = -1631009112;
        public boolean available;
        public int flags;
        public String payment_method;

        public static onrampMethodAvailability TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (onrampMethodAvailability) TLObject.TLdeserialize(onrampMethodAvailability.class, -1631009112 != i10 ? null : new onrampMethodAvailability(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.available = TLObject.hasFlag(readInt32, 1);
            this.payment_method = inputSerializedData.readString(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.available);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.payment_method);
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class onrampProviderInfo extends TLObject {
        public static final int constructor = 230847874;
        public ArrayList<String> crypto_currencies = new ArrayList<>();
        public int flags;
        public String id;
        public String name;
        public boolean supports_base_currencies;
        public boolean supports_limits;
        public boolean supports_quote;

        public static onrampProviderInfo TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (onrampProviderInfo) TLObject.TLdeserialize(onrampProviderInfo.class, 230847874 != i10 ? null : new onrampProviderInfo(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.supports_base_currencies = TLObject.hasFlag(readInt32, 1);
            this.supports_limits = TLObject.hasFlag(this.flags, 2);
            this.supports_quote = TLObject.hasFlag(this.flags, 4);
            this.id = inputSerializedData.readString(z10);
            this.name = inputSerializedData.readString(z10);
            this.crypto_currencies = Vector.deserializeString(inputSerializedData, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.supports_base_currencies);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.supports_limits);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.supports_quote);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            outputSerializedData.writeString(this.id);
            outputSerializedData.writeString(this.name);
            Vector.serializeString(outputSerializedData, this.crypto_currencies);
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class onrampQuote extends TLObject {
        public static final int constructor = 2055213545;
        public String base_amount;
        public String base_currency;
        public String crypto_amount;
        public String crypto_currency;
        public String crypto_price;
        public int expires_date;
        public String extra_fee_amount;
        public String fee_amount;
        public String network_fee_amount;
        public String payment_method;
        public String total_amount;

        public static onrampQuote TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (onrampQuote) TLObject.TLdeserialize(onrampQuote.class, 2055213545 != i10 ? null : new onrampQuote(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.base_currency = inputSerializedData.readString(z10);
            this.base_amount = inputSerializedData.readString(z10);
            this.crypto_currency = inputSerializedData.readString(z10);
            this.crypto_amount = inputSerializedData.readString(z10);
            this.crypto_price = inputSerializedData.readString(z10);
            this.fee_amount = inputSerializedData.readString(z10);
            this.extra_fee_amount = inputSerializedData.readString(z10);
            this.network_fee_amount = inputSerializedData.readString(z10);
            this.total_amount = inputSerializedData.readString(z10);
            this.payment_method = inputSerializedData.readString(z10);
            this.expires_date = inputSerializedData.readInt32(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.base_currency);
            outputSerializedData.writeString(this.base_amount);
            outputSerializedData.writeString(this.crypto_currency);
            outputSerializedData.writeString(this.crypto_amount);
            outputSerializedData.writeString(this.crypto_price);
            outputSerializedData.writeString(this.fee_amount);
            outputSerializedData.writeString(this.extra_fee_amount);
            outputSerializedData.writeString(this.network_fee_amount);
            outputSerializedData.writeString(this.total_amount);
            outputSerializedData.writeString(this.payment_method);
            outputSerializedData.writeInt32(this.expires_date);
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class onrampSession extends TLObject {
        public static final int constructor = -773575132;
        public int expires_date;
        public String provider;
        public String session_id;
        public String url;

        public static onrampSession TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (onrampSession) TLObject.TLdeserialize(onrampSession.class, -773575132 != i10 ? null : new onrampSession(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.provider = inputSerializedData.readString(z10);
            this.session_id = inputSerializedData.readString(z10);
            this.url = inputSerializedData.readString(z10);
            this.expires_date = inputSerializedData.readInt32(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.provider);
            outputSerializedData.writeString(this.session_id);
            outputSerializedData.writeString(this.url);
            outputSerializedData.writeInt32(this.expires_date);
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class performApiRequest extends TLMethod<apiResponse> {
        public static final int constructor = -1921262239;
        public String endpoint;
        public String payload;
        public boolean post;
        public String query;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            int flag = TLObject.setFlag(TLObject.setFlag(TLObject.setFlag(0, 1, this.post), 2, this.query != null), 4, this.payload != null);
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.endpoint);
            String str = this.query;
            if (str != null) {
                outputSerializedData.writeString(str);
            }
            String str2 = this.payload;
            if (str2 != null) {
                outputSerializedData.writeString(str2);
            }
        }

        @Override // org.telegram.tgnet.TLMethod
        public apiResponse deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return apiResponse.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class streamingUrl extends TLObject {
        public static final int constructor = 428373505;
        public int expires;
        public String url;

        public static streamingUrl TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (streamingUrl) TLObject.TLdeserialize(streamingUrl.class, 428373505 != i10 ? null : new streamingUrl(), inputSerializedData, i10, z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.url = inputSerializedData.readString(z10);
            this.expires = inputSerializedData.readInt32(z10);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.url);
            outputSerializedData.writeInt32(this.expires);
        }
    }
}
