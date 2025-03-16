package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
abstract class SchemaUtil {
    private static final Class GENERATED_MESSAGE_CLASS = getGeneratedMessageClass();
    private static final UnknownFieldSchema PROTO2_UNKNOWN_FIELD_SET_SCHEMA = getUnknownFieldSetSchema(false);
    private static final UnknownFieldSchema PROTO3_UNKNOWN_FIELD_SET_SCHEMA = getUnknownFieldSetSchema(true);
    private static final UnknownFieldSchema UNKNOWN_FIELD_SET_LITE_SCHEMA = new UnknownFieldSetLiteSchema();

    static int computeSizeBoolList(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.computeTagSize(i) + CodedOutputStream.computeLengthDelimitedFieldSize(size) : size * CodedOutputStream.computeBoolSize(i, true);
    }

    static int computeSizeBoolListNoTag(List list) {
        return list.size();
    }

    static int computeSizeByteStringList(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = size * CodedOutputStream.computeTagSize(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            computeTagSize += CodedOutputStream.computeBytesSizeNoTag((ByteString) list.get(i2));
        }
        return computeTagSize;
    }

    static int computeSizeEnumList(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeEnumListNoTag = computeSizeEnumListNoTag(list);
        int computeTagSize = CodedOutputStream.computeTagSize(i);
        return z ? computeTagSize + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeEnumListNoTag) : computeSizeEnumListNoTag + (size * computeTagSize);
    }

    static int computeSizeEnumListNoTag(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CodedOutputStream.computeEnumSizeNoTag(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    static int computeSizeFixed32List(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.computeTagSize(i) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 4) : size * CodedOutputStream.computeFixed32Size(i, 0);
    }

    static int computeSizeFixed32ListNoTag(List list) {
        return list.size() * 4;
    }

    static int computeSizeFixed64List(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.computeTagSize(i) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 8) : size * CodedOutputStream.computeFixed64Size(i, 0L);
    }

    static int computeSizeFixed64ListNoTag(List list) {
        return list.size() * 8;
    }

    static int computeSizeGroupList(int i, List list, Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.computeGroupSize(i, (MessageLite) list.get(i3), schema);
        }
        return i2;
    }

    static int computeSizeInt32List(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeInt32ListNoTag = computeSizeInt32ListNoTag(list);
        int computeTagSize = CodedOutputStream.computeTagSize(i);
        return z ? computeTagSize + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeInt32ListNoTag) : computeSizeInt32ListNoTag + (size * computeTagSize);
    }

    static int computeSizeInt32ListNoTag(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CodedOutputStream.computeInt32SizeNoTag(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    static int computeSizeInt64List(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int computeSizeInt64ListNoTag = computeSizeInt64ListNoTag(list);
        return z ? CodedOutputStream.computeTagSize(i) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeInt64ListNoTag) : computeSizeInt64ListNoTag + (list.size() * CodedOutputStream.computeTagSize(i));
    }

    static int computeSizeInt64ListNoTag(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CodedOutputStream.computeInt64SizeNoTag(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    static int computeSizeMessage(int i, Object obj, Schema schema) {
        return CodedOutputStream.computeMessageSize(i, (MessageLite) obj, schema);
    }

    static int computeSizeMessageList(int i, List list, Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = CodedOutputStream.computeTagSize(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            computeTagSize += CodedOutputStream.computeMessageSizeNoTag((MessageLite) list.get(i2), schema);
        }
        return computeTagSize;
    }

    static int computeSizeSInt32List(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeSInt32ListNoTag = computeSizeSInt32ListNoTag(list);
        int computeTagSize = CodedOutputStream.computeTagSize(i);
        return z ? computeTagSize + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeSInt32ListNoTag) : computeSizeSInt32ListNoTag + (size * computeTagSize);
    }

    static int computeSizeSInt32ListNoTag(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CodedOutputStream.computeSInt32SizeNoTag(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    static int computeSizeSInt64List(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeSInt64ListNoTag = computeSizeSInt64ListNoTag(list);
        int computeTagSize = CodedOutputStream.computeTagSize(i);
        return z ? computeTagSize + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeSInt64ListNoTag) : computeSizeSInt64ListNoTag + (size * computeTagSize);
    }

    static int computeSizeSInt64ListNoTag(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CodedOutputStream.computeSInt64SizeNoTag(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    static int computeSizeStringList(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int computeTagSize = CodedOutputStream.computeTagSize(i) * size;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i2 < size) {
                Object raw = lazyStringList.getRaw(i2);
                computeTagSize += raw instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) raw) : CodedOutputStream.computeStringSizeNoTag((String) raw);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                computeTagSize += obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj);
                i2++;
            }
        }
        return computeTagSize;
    }

    static int computeSizeUInt32List(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeUInt32ListNoTag = computeSizeUInt32ListNoTag(list);
        int computeTagSize = CodedOutputStream.computeTagSize(i);
        return z ? computeTagSize + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeUInt32ListNoTag) : computeSizeUInt32ListNoTag + (size * computeTagSize);
    }

    static int computeSizeUInt32ListNoTag(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CodedOutputStream.computeUInt32SizeNoTag(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    static int computeSizeUInt64List(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeUInt64ListNoTag = computeSizeUInt64ListNoTag(list);
        int computeTagSize = CodedOutputStream.computeTagSize(i);
        return z ? computeTagSize + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeUInt64ListNoTag) : computeSizeUInt64ListNoTag + (size * computeTagSize);
    }

    static int computeSizeUInt64ListNoTag(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CodedOutputStream.computeUInt64SizeNoTag(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    static Object filterUnknownEnumList(int i, List list, Internal.EnumVerifier enumVerifier, Object obj, UnknownFieldSchema unknownFieldSchema) {
        if (enumVerifier == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (enumVerifier.isInRange(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj = storeUnknownEnum(i, intValue, obj, unknownFieldSchema);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!enumVerifier.isInRange(intValue2)) {
                    obj = storeUnknownEnum(i, intValue2, obj, unknownFieldSchema);
                    it.remove();
                }
            }
        }
        return obj;
    }

    private static Class getGeneratedMessageClass() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static UnknownFieldSchema getUnknownFieldSetSchema(boolean z) {
        try {
            Class unknownFieldSetSchemaClass = getUnknownFieldSetSchemaClass();
            if (unknownFieldSetSchemaClass == null) {
                return null;
            }
            return (UnknownFieldSchema) unknownFieldSetSchemaClass.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class getUnknownFieldSetSchemaClass() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static void mergeExtensions(ExtensionSchema extensionSchema, Object obj, Object obj2) {
        FieldSet extensions = extensionSchema.getExtensions(obj2);
        if (extensions.isEmpty()) {
            return;
        }
        extensionSchema.getMutableExtensions(obj).mergeFrom(extensions);
    }

    static void mergeMap(MapFieldSchema mapFieldSchema, Object obj, Object obj2, long j) {
        UnsafeUtil.putObject(obj, j, mapFieldSchema.mergeFrom(UnsafeUtil.getObject(obj, j), UnsafeUtil.getObject(obj2, j)));
    }

    static void mergeUnknownFields(UnknownFieldSchema unknownFieldSchema, Object obj, Object obj2) {
        unknownFieldSchema.setToMessage(obj, unknownFieldSchema.merge(unknownFieldSchema.getFromMessage(obj), unknownFieldSchema.getFromMessage(obj2)));
    }

    public static UnknownFieldSchema proto2UnknownFieldSetSchema() {
        return PROTO2_UNKNOWN_FIELD_SET_SCHEMA;
    }

    public static UnknownFieldSchema proto3UnknownFieldSetSchema() {
        return PROTO3_UNKNOWN_FIELD_SET_SCHEMA;
    }

    public static void requireGeneratedMessage(Class cls) {
        Class cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = GENERATED_MESSAGE_CLASS) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean safeEquals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static Object storeUnknownEnum(int i, int i2, Object obj, UnknownFieldSchema unknownFieldSchema) {
        if (obj == null) {
            obj = unknownFieldSchema.newBuilder();
        }
        unknownFieldSchema.addVarint(obj, i, i2);
        return obj;
    }

    public static UnknownFieldSchema unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    public static void writeBoolList(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBoolList(i, list, z);
    }

    public static void writeBytesList(int i, List list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBytesList(i, list);
    }

    public static void writeDoubleList(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeDoubleList(i, list, z);
    }

    public static void writeEnumList(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeEnumList(i, list, z);
    }

    public static void writeFixed32List(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed32List(i, list, z);
    }

    public static void writeFixed64List(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed64List(i, list, z);
    }

    public static void writeFloatList(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFloatList(i, list, z);
    }

    public static void writeGroupList(int i, List list, Writer writer, Schema schema) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeGroupList(i, list, schema);
    }

    public static void writeInt32List(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt32List(i, list, z);
    }

    public static void writeInt64List(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt64List(i, list, z);
    }

    public static void writeMessageList(int i, List list, Writer writer, Schema schema) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeMessageList(i, list, schema);
    }

    public static void writeSFixed32List(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed32List(i, list, z);
    }

    public static void writeSFixed64List(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed64List(i, list, z);
    }

    public static void writeSInt32List(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt32List(i, list, z);
    }

    public static void writeSInt64List(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt64List(i, list, z);
    }

    public static void writeStringList(int i, List list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeStringList(i, list);
    }

    public static void writeUInt32List(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt32List(i, list, z);
    }

    public static void writeUInt64List(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt64List(i, list, z);
    }
}
