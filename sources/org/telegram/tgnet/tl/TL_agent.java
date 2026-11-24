package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class TL_agent {

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class Providers extends TLObject {
        public static Providers TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (Providers) TLObject.TLdeserialize(Providers.class, fromConstructor(i), inputSerializedData, i, z);
        }

        private static Providers fromConstructor(int i) {
            if (i == -2027776014) {
                return new TL_providers();
            }
            if (i != 1140283053) {
                return null;
            }
            return new TL_providersNotModified();
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class TL_models extends TLObject {
        public static final int constructor = 852822840;
        public int flags;
        public ArrayList<agentModel> models = new ArrayList<>();
        public String next_offset;

        public static TL_models TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_models) TLObject.TLdeserialize(TL_models.class, i == 852822840 ? new TL_models() : null, inputSerializedData, i, z);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.models = Vector.deserialize(inputSerializedData, new rfb((byte) 14), z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_offset = inputSerializedData.readString(z);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.next_offset != null);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            Vector.serialize(outputSerializedData, this.models);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.next_offset);
            }
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class TL_providers extends Providers {
        public static final int constructor = -2027776014;
        public long hash;
        public ArrayList<agentProvider> providers = new ArrayList<>();

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.hash = inputSerializedData.readInt64(z);
            this.providers = Vector.deserialize(inputSerializedData, new rfb((byte) 15), z);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.hash);
            Vector.serialize(outputSerializedData, this.providers);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class agentModel extends TLObject {
        public static final int constructor = -707511254;
        public String description;
        public boolean effort_supported;
        public int flags;
        public long icon_emoji_id;
        public String id;
        public String name;

        public static agentModel TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (agentModel) TLObject.TLdeserialize(agentModel.class, i == -707511254 ? new agentModel() : null, inputSerializedData, i, z);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.effort_supported = TLObject.hasFlag(readInt32, 4);
            this.id = inputSerializedData.readString(z);
            this.name = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.description = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.icon_emoji_id = inputSerializedData.readInt64(z);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.description != null);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 4, this.effort_supported);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeString(this.id);
            outputSerializedData.writeString(this.name);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.description);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt64(this.icon_emoji_id);
            }
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    /* loaded from: classes3.dex */
    public static class agentProvider extends TLObject {
        public static final int constructor = 1194491015;
        public int flags;
        public long icon_emoji_id;
        public String id;
        public String key_url;
        public boolean models_searchable;
        public String title;
        public String vendor;

        public static agentProvider TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (agentProvider) TLObject.TLdeserialize(agentProvider.class, i == 1194491015 ? new agentProvider() : null, inputSerializedData, i, z);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.id = inputSerializedData.readString(z);
            this.title = inputSerializedData.readString(z);
            this.vendor = inputSerializedData.readString(z);
            this.key_url = inputSerializedData.readString(z);
            this.models_searchable = TLObject.hasFlag(this.flags, 1);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.icon_emoji_id = inputSerializedData.readInt64(z);
            }
        }

        public void serializeParams(OutputSerializedData outputSerializedData) {
            int flag = TLObject.setFlag(this.flags, 1, this.models_searchable);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.vendor);
            outputSerializedData.writeString(this.key_url);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt64(this.icon_emoji_id);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            serializeParams(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class providerKey extends TLObject {
        public static final int constructor = 2018344464;
        public int date_connected;
        public String key_last4;
        public String provider;

        public static providerKey TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (providerKey) TLObject.TLdeserialize(providerKey.class, i == 2018344464 ? new providerKey() : null, inputSerializedData, i, z);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.provider = inputSerializedData.readString(z);
            this.key_last4 = inputSerializedData.readString(z);
            this.date_connected = inputSerializedData.readInt32(z);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.provider);
            outputSerializedData.writeString(this.key_last4);
            outputSerializedData.writeInt32(this.date_connected);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class settings extends TLObject {
        public static final int constructor = 1107246551;
        public String active_provider;
        public String effort;
        public boolean effort_supported;
        public int flags;
        public ArrayList<providerKey> keys = new ArrayList<>();
        public String model;
        public String model_name;

        public static settings TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (settings) TLObject.TLdeserialize(settings.class, i == 1107246551 ? new settings() : null, inputSerializedData, i, z);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.effort_supported = TLObject.hasFlag(readInt32, 16);
            this.keys = Vector.deserialize(inputSerializedData, new rfb((byte) 16), z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.active_provider = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.model = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.model_name = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.effort = inputSerializedData.readString(z);
            }
        }

        public void serializeParams(OutputSerializedData outputSerializedData) {
            int flag = TLObject.setFlag(this.flags, 1, this.active_provider != null);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.model != null);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.model_name != null);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8, this.effort != null);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16, this.effort_supported);
            this.flags = flag5;
            outputSerializedData.writeInt32(flag5);
            Vector.serialize(outputSerializedData, this.keys);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.active_provider);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.model);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.model_name);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeString(this.effort);
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            serializeParams(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class updateAgentSettings extends TLRPC.Update {
        public static final int constructor = -1164453001;
        public settings settings;

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.settings = settings.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.settings.serializeToStream(outputSerializedData);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    /* loaded from: classes3.dex */
    public static class connect extends TLMethod<settings> {
        public static final int constructor = -14388756;
        public String key;
        public String provider;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.provider);
            outputSerializedData.writeString(this.key);
        }

        @Override // org.telegram.tgnet.TLMethod
        public settings deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return settings.TLdeserialize(inputSerializedData, i, z);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class disconnect extends TLMethod<settings> {
        public static final int constructor = -1698892007;
        public String provider;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.provider);
        }

        @Override // org.telegram.tgnet.TLMethod
        public settings deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return settings.TLdeserialize(inputSerializedData, i, z);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class getModels extends TLMethod<TL_models> {
        public static final int constructor = -388683502;
        public int limit;
        public String offset;
        public String provider;
        public String query;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(TLObject.setFlag(0, 1, this.query != null), 2, this.offset != null);
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.provider);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeString(this.query);
            }
            if (TLObject.hasFlag(flag, 2)) {
                outputSerializedData.writeString(this.offset);
            }
            outputSerializedData.writeInt32(this.limit);
        }

        @Override // org.telegram.tgnet.TLMethod
        public TL_models deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_models.TLdeserialize(inputSerializedData, i, z);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class getProviders extends TLMethod<Providers> {
        public static final int constructor = -837913581;
        public long hash;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(this.hash);
        }

        @Override // org.telegram.tgnet.TLMethod
        public Providers deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return Providers.TLdeserialize(inputSerializedData, i, z);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class getSettings extends TLMethod<settings> {
        public static final int constructor = -82864297;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }

        @Override // org.telegram.tgnet.TLMethod
        public settings deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return settings.TLdeserialize(inputSerializedData, i, z);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class setActiveProvider extends TLMethod<settings> {
        public static final int constructor = -1129164408;
        public String provider;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.provider);
        }

        @Override // org.telegram.tgnet.TLMethod
        public settings deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return settings.TLdeserialize(inputSerializedData, i, z);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    /* loaded from: classes3.dex */
    public static class setEffort extends TLMethod<settings> {
        public static final int constructor = 2029114055;
        public String effort;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.effort);
        }

        @Override // org.telegram.tgnet.TLMethod
        public settings deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return settings.TLdeserialize(inputSerializedData, i, z);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class setModel extends TLMethod<settings> {
        public static final int constructor = 561927239;
        public String model;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeString(this.model);
        }

        @Override // org.telegram.tgnet.TLMethod
        public settings deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return settings.TLdeserialize(inputSerializedData, i, z);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class TL_providersNotModified extends Providers {
        public static final int constructor = 1140283053;

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }
    }
}
