package org.telegram.tgnet;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class Vector<T extends TLObject> extends TLObject {
    public static final int constructor = 481674261;
    private final TLDeserializer<T> itemDeserializer;
    public final ArrayList<T> objects = new ArrayList<>();

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class Int extends TLObject {
        public int value;

        public Int(int i) {
            this.value = i;
        }

        public static Int TLDeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return new Int(i);
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.value = inputSerializedData.readInt32(z);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(this.value);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class Long extends TLObject {
        public long value;

        public Long(int i, int i2) {
            this.value = (i << 32) | (i2 & 4294967295L);
        }

        public static Long TLDeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return new Long(i, inputSerializedData.readInt32(z));
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.value = inputSerializedData.readInt64(z);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt64(this.value);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class Strings extends TLObject {
        public final ArrayList<String> values = new ArrayList<>();

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            for (int i = 0; i < readInt32; i++) {
                this.values.add(inputSerializedData.readString(z));
            }
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            Vector.serializeString(outputSerializedData, this.values);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    @FunctionalInterface
    public interface TLDeserializer<T extends TLObject> {
        T deserialize(InputSerializedData inputSerializedData, int i, boolean z);
    }

    public Vector(TLDeserializer<T> tLDeserializer) {
        this.itemDeserializer = tLDeserializer;
    }

    public static <T extends TLObject> Vector<T> TLDeserialize(InputSerializedData inputSerializedData, int i, boolean z, TLDeserializer<T> tLDeserializer) {
        if (i != 481674261) {
            TLParseException.doThrowOrLog(inputSerializedData, "Vector", i, z);
            return null;
        }
        Vector<T> vector = new Vector<>(tLDeserializer);
        vector.readParams(inputSerializedData, z);
        return vector;
    }

    public static Vector<Int> TLDeserializeInt(InputSerializedData inputSerializedData, int i, boolean z) {
        if (i != 481674261) {
            TLParseException.doThrowOrLog(inputSerializedData, "StarGift", i, z);
            return null;
        }
        Vector<Int> vector = new Vector<>(new rjb((byte) 17));
        vector.readParams(inputSerializedData, z);
        return vector;
    }

    public static Vector<Int> TLDeserializeLong(InputSerializedData inputSerializedData, int i, boolean z) {
        if (i != 481674261) {
            TLParseException.doThrowOrLog(inputSerializedData, "Vector", i, z);
            return null;
        }
        Vector<Int> vector = new Vector<>(new rjb((byte) 17));
        vector.readParams(inputSerializedData, z);
        return vector;
    }

    public static Strings TLDeserializeString(InputSerializedData inputSerializedData, int i, boolean z) {
        if (i != 481674261) {
            TLParseException.doThrowOrLog(inputSerializedData, "Vector", i, z);
            return null;
        }
        Strings strings = new Strings();
        strings.readParams(inputSerializedData, z);
        return strings;
    }

    public static <T extends TLObject> ArrayList<T> deserialize(InputSerializedData inputSerializedData, TLDeserializer<T> tLDeserializer, boolean z) {
        int readInt32 = inputSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            TLParseException.doThrowOrLog(inputSerializedData, "Vector", readInt32, z);
            return new ArrayList<>();
        }
        int readInt322 = inputSerializedData.readInt32(z);
        if (!validateSize(readInt322, 4, inputSerializedData.remaining())) {
            TLParseException.doThrowOrLog(inputSerializedData, "VectorWrongSize", readInt32, z);
            return new ArrayList<>();
        }
        ArrayList<T> arrayList = new ArrayList<>(readInt322);
        for (int i = 0; i < readInt322; i++) {
            T deserialize = tLDeserializer.deserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (deserialize != null) {
                arrayList.add(deserialize);
            }
        }
        return arrayList;
    }

    public static ArrayList<byte[]> deserializeByteArray(InputSerializedData inputSerializedData, boolean z) {
        Objects.requireNonNull(inputSerializedData);
        return deserialize(inputSerializedData, new gbc(inputSerializedData, (byte) 3), z);
    }

    public static ArrayList<Integer> deserializeInt(InputSerializedData inputSerializedData, boolean z) {
        Objects.requireNonNull(inputSerializedData);
        return deserialize(inputSerializedData, new gbc(inputSerializedData, (byte) 1), z);
    }

    public static ArrayList<java.lang.Long> deserializeLong(InputSerializedData inputSerializedData, boolean z) {
        Objects.requireNonNull(inputSerializedData);
        return deserialize(inputSerializedData, new gbc(inputSerializedData, (byte) 0), z);
    }

    public static ArrayList<String> deserializeString(InputSerializedData inputSerializedData, boolean z) {
        Objects.requireNonNull(inputSerializedData);
        return deserialize(inputSerializedData, new gbc(inputSerializedData, (byte) 2), z);
    }

    public static <T extends TLObject> void serialize(OutputSerializedData outputSerializedData, ArrayList<T> arrayList) {
        outputSerializedData.writeInt32(constructor);
        outputSerializedData.writeInt32(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).serializeToStream(outputSerializedData);
        }
    }

    public static void serializeByteArray(OutputSerializedData outputSerializedData, ArrayList<byte[]> arrayList) {
        Objects.requireNonNull(outputSerializedData);
        serialize(outputSerializedData, new hbc(outputSerializedData, (byte) 2), arrayList);
    }

    public static void serializeInt(OutputSerializedData outputSerializedData, ArrayList<Integer> arrayList) {
        Objects.requireNonNull(outputSerializedData);
        serialize(outputSerializedData, new hbc(outputSerializedData, (byte) 1), arrayList);
    }

    public static void serializeLong(OutputSerializedData outputSerializedData, ArrayList<java.lang.Long> arrayList) {
        Objects.requireNonNull(outputSerializedData);
        serialize(outputSerializedData, new hbc(outputSerializedData, (byte) 0), arrayList);
    }

    public static void serializeString(OutputSerializedData outputSerializedData, ArrayList<String> arrayList) {
        Objects.requireNonNull(outputSerializedData);
        serialize(outputSerializedData, new hbc(outputSerializedData, (byte) 3), arrayList);
    }

    private static boolean validateSize(int i, int i2, int i3) {
        return i >= 0 && i2 > 0 && ((long) i) * ((long) i2) <= ((long) i3);
    }

    @Override // org.telegram.tgnet.TLObject
    public void readParams(InputSerializedData inputSerializedData, boolean z) {
        int readInt32 = inputSerializedData.readInt32(z);
        for (int i = 0; i < readInt32; i++) {
            this.objects.add(this.itemDeserializer.deserialize(inputSerializedData, inputSerializedData.readInt32(z), z));
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public void serializeToStream(OutputSerializedData outputSerializedData) {
        serialize(outputSerializedData, this.objects);
    }

    public ArrayList<Integer> toIntArray() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<T> arrayList2 = this.objects;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            T t = arrayList2.get(i);
            i++;
            T t2 = t;
            if (t2 instanceof Int) {
                arrayList.add(Integer.valueOf(((Int) t2).value));
            }
        }
        return arrayList;
    }

    public static <T> void serialize(OutputSerializedData outputSerializedData, qac qacVar, ArrayList<T> arrayList) {
        outputSerializedData.writeInt32(constructor);
        outputSerializedData.writeInt32(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            qacVar.a(arrayList.get(i));
        }
    }

    private static <T> ArrayList<T> deserialize(InputSerializedData inputSerializedData, rac racVar, boolean z) {
        int readInt32 = inputSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            TLParseException.doThrowOrLog(inputSerializedData, "Vector", readInt32, z);
            return new ArrayList<>();
        }
        int readInt322 = inputSerializedData.readInt32(z);
        if (!validateSize(readInt322, 1, inputSerializedData.remaining())) {
            TLParseException.doThrowOrLog(inputSerializedData, "VectorWrongSize", readInt32, z);
            return new ArrayList<>();
        }
        zw7 zw7Var = (ArrayList<T>) new ArrayList(readInt322);
        for (int i = 0; i < readInt322; i++) {
            zw7Var.add(racVar.a(Boolean.valueOf(z)));
        }
        return zw7Var;
    }
}
