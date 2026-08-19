package androidx.datastore.preferences.protobuf;

import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.CharacterCompat;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class MessageSchema implements Schema {
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final UnknownFieldSchema unknownFieldSchema;
    private final boolean useCachedSizeField;

    private static boolean isEnforceUtf8(int i) {
        return (i & TLObject.FLAG_29) != 0;
    }

    private static boolean isRequired(int i) {
        return (i & TLObject.FLAG_28) != 0;
    }

    private static long offset(int i) {
        return i & 1048575;
    }

    private static int type(int i) {
        return (i & 267386880) >>> 20;
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, boolean z, boolean z2, int[] iArr2, int i3, int i4, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i;
        this.maxFieldNumber = i2;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.proto3 = z;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(messageLite);
        this.useCachedSizeField = z2;
        this.intArray = iArr2;
        this.checkInitializedCount = i3;
        this.repeatedFieldOffsetStart = i4;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    static MessageSchema newSchema(Class cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        if (messageInfo instanceof RawMessageInfo) {
            return newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        }
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(messageInfo);
        return newSchemaForMessageInfo(null, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static MessageSchema newSchemaForRawMessageInfo(RawMessageInfo rawMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        char charAt4;
        int i6;
        char charAt5;
        int i7;
        char charAt6;
        int i8;
        char charAt7;
        int i9;
        char charAt8;
        int i10;
        char charAt9;
        int i11;
        char charAt10;
        int i12;
        char charAt11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int objectFieldOffset;
        String str;
        int i19;
        int i20;
        int i21;
        Field reflectField;
        char charAt12;
        int i22;
        int i23;
        Object obj;
        Field reflectField2;
        Object obj2;
        Field reflectField3;
        int i24;
        char charAt13;
        int i25;
        char charAt14;
        int i26;
        int i27;
        char charAt15;
        int i28;
        char charAt16;
        char charAt17;
        int i29 = 0;
        boolean z = rawMessageInfo.getSyntax() == ProtoSyntax.PROTO3;
        String stringInfo = rawMessageInfo.getStringInfo();
        int length = stringInfo.length();
        int charAt18 = stringInfo.charAt(0);
        if (charAt18 >= 55296) {
            int i30 = charAt18 & 8191;
            int i31 = 1;
            int i32 = 13;
            while (true) {
                i = i31 + 1;
                charAt17 = stringInfo.charAt(i31);
                if (charAt17 < 55296) {
                    break;
                }
                i30 |= (charAt17 & 8191) << i32;
                i32 += 13;
                i31 = i;
            }
            charAt18 = i30 | (charAt17 << i32);
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int charAt19 = stringInfo.charAt(i);
        if (charAt19 >= 55296) {
            int i34 = charAt19 & 8191;
            int i35 = 13;
            while (true) {
                i28 = i33 + 1;
                charAt16 = stringInfo.charAt(i33);
                if (charAt16 < 55296) {
                    break;
                }
                i34 |= (charAt16 & 8191) << i35;
                i35 += 13;
                i33 = i28;
            }
            charAt19 = i34 | (charAt16 << i35);
            i33 = i28;
        }
        if (charAt19 == 0) {
            iArr = EMPTY_INT_ARRAY;
            i3 = 0;
            charAt = 0;
            i4 = 0;
            charAt2 = 0;
            i2 = 0;
            charAt3 = 0;
        } else {
            int i36 = i33 + 1;
            int charAt20 = stringInfo.charAt(i33);
            if (charAt20 >= 55296) {
                int i37 = charAt20 & 8191;
                int i38 = 13;
                while (true) {
                    i12 = i36 + 1;
                    charAt11 = stringInfo.charAt(i36);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i37 |= (charAt11 & 8191) << i38;
                    i38 += 13;
                    i36 = i12;
                }
                charAt20 = i37 | (charAt11 << i38);
                i36 = i12;
            }
            int i39 = i36 + 1;
            int charAt21 = stringInfo.charAt(i36);
            if (charAt21 >= 55296) {
                int i40 = charAt21 & 8191;
                int i41 = 13;
                while (true) {
                    i11 = i39 + 1;
                    charAt10 = stringInfo.charAt(i39);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i40 |= (charAt10 & 8191) << i41;
                    i41 += 13;
                    i39 = i11;
                }
                charAt21 = i40 | (charAt10 << i41);
                i39 = i11;
            }
            int i42 = i39 + 1;
            charAt = stringInfo.charAt(i39);
            if (charAt >= 55296) {
                int i43 = charAt & 8191;
                int i44 = 13;
                while (true) {
                    i10 = i42 + 1;
                    charAt9 = stringInfo.charAt(i42);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i43 |= (charAt9 & 8191) << i44;
                    i44 += 13;
                    i42 = i10;
                }
                charAt = i43 | (charAt9 << i44);
                i42 = i10;
            }
            int i45 = i42 + 1;
            int charAt22 = stringInfo.charAt(i42);
            if (charAt22 >= 55296) {
                int i46 = charAt22 & 8191;
                int i47 = 13;
                while (true) {
                    i9 = i45 + 1;
                    charAt8 = stringInfo.charAt(i45);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i46 |= (charAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i9;
                }
                charAt22 = i46 | (charAt8 << i47);
                i45 = i9;
            }
            int i48 = i45 + 1;
            int charAt23 = stringInfo.charAt(i45);
            if (charAt23 >= 55296) {
                int i49 = charAt23 & 8191;
                int i50 = 13;
                while (true) {
                    i8 = i48 + 1;
                    charAt7 = stringInfo.charAt(i48);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i49 |= (charAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i8;
                }
                charAt23 = i49 | (charAt7 << i50);
                i48 = i8;
            }
            int i51 = i48 + 1;
            charAt2 = stringInfo.charAt(i48);
            if (charAt2 >= 55296) {
                int i52 = charAt2 & 8191;
                int i53 = 13;
                while (true) {
                    i7 = i51 + 1;
                    charAt6 = stringInfo.charAt(i51);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i52 |= (charAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i7;
                }
                charAt2 = i52 | (charAt6 << i53);
                i51 = i7;
            }
            int i54 = i51 + 1;
            int charAt24 = stringInfo.charAt(i51);
            if (charAt24 >= 55296) {
                int i55 = charAt24 & 8191;
                int i56 = 13;
                while (true) {
                    i6 = i54 + 1;
                    charAt5 = stringInfo.charAt(i54);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i55 |= (charAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i6;
                }
                charAt24 = i55 | (charAt5 << i56);
                i54 = i6;
            }
            int i57 = i54 + 1;
            charAt3 = stringInfo.charAt(i54);
            if (charAt3 >= 55296) {
                int i58 = charAt3 & 8191;
                int i59 = i57;
                int i60 = 13;
                while (true) {
                    i5 = i59 + 1;
                    charAt4 = stringInfo.charAt(i59);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i58 |= (charAt4 & 8191) << i60;
                    i60 += 13;
                    i59 = i5;
                }
                charAt3 = i58 | (charAt4 << i60);
                i57 = i5;
            }
            int[] iArr2 = new int[charAt3 + charAt2 + charAt24];
            i2 = (charAt20 * 2) + charAt21;
            i3 = charAt22;
            i4 = charAt23;
            iArr = iArr2;
            i29 = charAt20;
            i33 = i57;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objects = rawMessageInfo.getObjects();
        Class<?> cls = rawMessageInfo.getDefaultInstance().getClass();
        int[] iArr3 = new int[i4 * 3];
        Object[] objArr = new Object[i4 * 2];
        int i61 = charAt2 + charAt3;
        int i62 = i61;
        int i63 = charAt3;
        int i64 = 0;
        int i65 = 0;
        while (i33 < length) {
            int i66 = i33 + 1;
            int charAt25 = stringInfo.charAt(i33);
            int i67 = length;
            if (charAt25 >= 55296) {
                int i68 = charAt25 & 8191;
                int i69 = i66;
                int i70 = 13;
                while (true) {
                    i27 = i69 + 1;
                    charAt15 = stringInfo.charAt(i69);
                    i13 = i29;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i68 |= (charAt15 & 8191) << i70;
                    i70 += 13;
                    i69 = i27;
                    i29 = i13;
                }
                charAt25 = i68 | (charAt15 << i70);
                i14 = i27;
            } else {
                i13 = i29;
                i14 = i66;
            }
            int i71 = i14 + 1;
            int charAt26 = stringInfo.charAt(i14);
            if (charAt26 >= 55296) {
                int i72 = charAt26 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i25 = i73 + 1;
                    charAt14 = stringInfo.charAt(i73);
                    i26 = i72;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i72 = i26 | ((charAt14 & 8191) << i74);
                    i74 += 13;
                    i73 = i25;
                }
                charAt26 = i26 | (charAt14 << i74);
                i15 = i25;
            } else {
                i15 = i71;
            }
            int i75 = charAt18;
            int i76 = charAt26 & NotificationCenter.didReceiveSmsCode;
            int[] iArr4 = iArr3;
            if ((charAt26 & 1024) != 0) {
                iArr[i64] = i65;
                i64++;
            }
            int i77 = charAt25;
            if (i76 >= 51) {
                int i78 = i15 + 1;
                int charAt27 = stringInfo.charAt(i15);
                char c = CharacterCompat.MIN_HIGH_SURROGATE;
                if (charAt27 >= 55296) {
                    int i79 = charAt27 & 8191;
                    int i80 = 13;
                    while (true) {
                        i24 = i78 + 1;
                        charAt13 = stringInfo.charAt(i78);
                        if (charAt13 < c) {
                            break;
                        }
                        i79 |= (charAt13 & 8191) << i80;
                        i80 += 13;
                        i78 = i24;
                        c = CharacterCompat.MIN_HIGH_SURROGATE;
                    }
                    charAt27 = i79 | (charAt13 << i80);
                    i78 = i24;
                }
                int i81 = i76 - 51;
                int i82 = charAt27;
                if (i81 == 9 || i81 == 17) {
                    i23 = i2 + 1;
                    objArr[((i65 / 3) * 2) + 1] = objects[i2];
                } else {
                    if (i81 == 12 && (i75 & 1) == 1) {
                        i23 = i2 + 1;
                        objArr[((i65 / 3) * 2) + 1] = objects[i2];
                    }
                    int i83 = i82 * 2;
                    obj = objects[i83];
                    if (!(obj instanceof Field)) {
                        reflectField2 = (Field) obj;
                    } else {
                        reflectField2 = reflectField(cls, (String) obj);
                        objects[i83] = reflectField2;
                    }
                    int i84 = i78;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(reflectField2);
                    int i85 = i83 + 1;
                    obj2 = objects[i85];
                    if (!(obj2 instanceof Field)) {
                        reflectField3 = (Field) obj2;
                    } else {
                        reflectField3 = reflectField(cls, (String) obj2);
                        objects[i85] = reflectField3;
                    }
                    str = stringInfo;
                    i20 = (int) unsafe.objectFieldOffset(reflectField3);
                    i18 = i2;
                    objectFieldOffset = objectFieldOffset2;
                    i21 = 0;
                    i17 = charAt;
                    i19 = i84;
                    i16 = i3;
                }
                i2 = i23;
                int i832 = i82 * 2;
                obj = objects[i832];
                if (!(obj instanceof Field)) {
                }
                int i842 = i78;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(reflectField2);
                int i852 = i832 + 1;
                obj2 = objects[i852];
                if (!(obj2 instanceof Field)) {
                }
                str = stringInfo;
                i20 = (int) unsafe.objectFieldOffset(reflectField3);
                i18 = i2;
                objectFieldOffset = objectFieldOffset22;
                i21 = 0;
                i17 = charAt;
                i19 = i842;
                i16 = i3;
            } else {
                int i86 = i2 + 1;
                Field reflectField4 = reflectField(cls, (String) objects[i2]);
                if (i76 == 9 || i76 == 17) {
                    i16 = i3;
                    objArr[((i65 / 3) * 2) + 1] = reflectField4.getType();
                } else {
                    if (i76 == 27 || i76 == 49) {
                        i16 = i3;
                        i22 = i2 + 2;
                        objArr[((i65 / 3) * 2) + 1] = objects[i86];
                    } else if (i76 == 12 || i76 == 30 || i76 == 44) {
                        i16 = i3;
                        if ((i75 & 1) == 1) {
                            i22 = i2 + 2;
                            objArr[((i65 / 3) * 2) + 1] = objects[i86];
                        }
                    } else if (i76 == 50) {
                        int i87 = i63 + 1;
                        iArr[i63] = i65;
                        int i88 = (i65 / 3) * 2;
                        int i89 = i2 + 2;
                        objArr[i88] = objects[i86];
                        if ((charAt26 & 2048) != 0) {
                            i18 = i2 + 3;
                            objArr[i88 + 1] = objects[i89];
                            i16 = i3;
                            i17 = charAt;
                            i63 = i87;
                        } else {
                            i17 = charAt;
                            i18 = i89;
                            i63 = i87;
                            i16 = i3;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(reflectField4);
                        if ((i75 & 1) == 1 || i76 > 17) {
                            str = stringInfo;
                            i19 = i15;
                            i20 = 0;
                            i21 = 0;
                        } else {
                            int i90 = i15 + 1;
                            int charAt28 = stringInfo.charAt(i15);
                            if (charAt28 >= 55296) {
                                int i91 = charAt28 & 8191;
                                int i92 = 13;
                                while (true) {
                                    i19 = i90 + 1;
                                    charAt12 = stringInfo.charAt(i90);
                                    if (charAt12 < 55296) {
                                        break;
                                    }
                                    i91 |= (charAt12 & 8191) << i92;
                                    i92 += 13;
                                    i90 = i19;
                                }
                                charAt28 = i91 | (charAt12 << i92);
                            } else {
                                i19 = i90;
                            }
                            int i93 = (i13 * 2) + (charAt28 / 32);
                            Object obj3 = objects[i93];
                            str = stringInfo;
                            if (obj3 instanceof Field) {
                                reflectField = (Field) obj3;
                            } else {
                                reflectField = reflectField(cls, (String) obj3);
                                objects[i93] = reflectField;
                            }
                            i20 = (int) unsafe.objectFieldOffset(reflectField);
                            i21 = charAt28 % 32;
                        }
                        if (i76 >= 18 && i76 <= 49) {
                            iArr[i62] = objectFieldOffset;
                            i62++;
                        }
                    } else {
                        i16 = i3;
                    }
                    i18 = i22;
                    i17 = charAt;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(reflectField4);
                    if ((i75 & 1) == 1) {
                    }
                    str = stringInfo;
                    i19 = i15;
                    i20 = 0;
                    i21 = 0;
                    if (i76 >= 18) {
                        iArr[i62] = objectFieldOffset;
                        i62++;
                    }
                }
                i17 = charAt;
                i18 = i86;
                objectFieldOffset = (int) unsafe.objectFieldOffset(reflectField4);
                if ((i75 & 1) == 1) {
                }
                str = stringInfo;
                i19 = i15;
                i20 = 0;
                i21 = 0;
                if (i76 >= 18) {
                }
            }
            int i94 = i65 + 1;
            iArr4[i65] = i77;
            int i95 = i65 + 2;
            int i96 = i20;
            iArr4[i94] = ((charAt26 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt26 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i76 << 20) | objectFieldOffset;
            i65 += 3;
            iArr4[i95] = (i21 << 20) | i96;
            charAt = i17;
            charAt18 = i75;
            length = i67;
            i29 = i13;
            i3 = i16;
            i33 = i19;
            stringInfo = str;
            i2 = i18;
            iArr3 = iArr4;
        }
        return new MessageSchema(iArr3, objArr, charAt, i3, rawMessageInfo.getDefaultInstance(), z, false, iArr, charAt3, i61, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private static Field reflectField(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    static MessageSchema newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public Object newInstance() {
        return this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public boolean equals(Object obj, Object obj2) {
        int length = this.buffer.length;
        for (int i = 0; i < length; i += 3) {
            if (!equals(obj, obj2, i)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(obj).equals(this.unknownFieldSchema.getFromMessage(obj2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(obj).equals(this.extensionSchema.getExtensions(obj2));
        }
        return true;
    }

    private boolean equals(Object obj, Object obj2, int i) {
        int typeAndOffsetAt = typeAndOffsetAt(i);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (!arePresentForEquals(obj, obj2, i) || Double.doubleToLongBits(UnsafeUtil.getDouble(obj, offset)) != Double.doubleToLongBits(UnsafeUtil.getDouble(obj2, offset))) {
                }
                break;
            case 1:
                if (!arePresentForEquals(obj, obj2, i) || Float.floatToIntBits(UnsafeUtil.getFloat(obj, offset)) != Float.floatToIntBits(UnsafeUtil.getFloat(obj2, offset))) {
                }
                break;
            case 2:
                if (!arePresentForEquals(obj, obj2, i) || UnsafeUtil.getLong(obj, offset) != UnsafeUtil.getLong(obj2, offset)) {
                }
                break;
            case 3:
                if (!arePresentForEquals(obj, obj2, i) || UnsafeUtil.getLong(obj, offset) != UnsafeUtil.getLong(obj2, offset)) {
                }
                break;
            case 4:
                if (!arePresentForEquals(obj, obj2, i) || UnsafeUtil.getInt(obj, offset) != UnsafeUtil.getInt(obj2, offset)) {
                }
                break;
            case 5:
                if (!arePresentForEquals(obj, obj2, i) || UnsafeUtil.getLong(obj, offset) != UnsafeUtil.getLong(obj2, offset)) {
                }
                break;
            case 6:
                if (!arePresentForEquals(obj, obj2, i) || UnsafeUtil.getInt(obj, offset) != UnsafeUtil.getInt(obj2, offset)) {
                }
                break;
            case 7:
                if (!arePresentForEquals(obj, obj2, i) || UnsafeUtil.getBoolean(obj, offset) != UnsafeUtil.getBoolean(obj2, offset)) {
                }
                break;
            case 8:
                if (!arePresentForEquals(obj, obj2, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(obj, offset), UnsafeUtil.getObject(obj2, offset))) {
                }
                break;
            case 9:
                if (!arePresentForEquals(obj, obj2, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(obj, offset), UnsafeUtil.getObject(obj2, offset))) {
                }
                break;
            case 10:
                if (!arePresentForEquals(obj, obj2, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(obj, offset), UnsafeUtil.getObject(obj2, offset))) {
                }
                break;
            case 11:
                if (!arePresentForEquals(obj, obj2, i) || UnsafeUtil.getInt(obj, offset) != UnsafeUtil.getInt(obj2, offset)) {
                }
                break;
            case 12:
                if (!arePresentForEquals(obj, obj2, i) || UnsafeUtil.getInt(obj, offset) != UnsafeUtil.getInt(obj2, offset)) {
                }
                break;
            case 13:
                if (!arePresentForEquals(obj, obj2, i) || UnsafeUtil.getInt(obj, offset) != UnsafeUtil.getInt(obj2, offset)) {
                }
                break;
            case 14:
                if (!arePresentForEquals(obj, obj2, i) || UnsafeUtil.getLong(obj, offset) != UnsafeUtil.getLong(obj2, offset)) {
                }
                break;
            case 15:
                if (!arePresentForEquals(obj, obj2, i) || UnsafeUtil.getInt(obj, offset) != UnsafeUtil.getInt(obj2, offset)) {
                }
                break;
            case 16:
                if (!arePresentForEquals(obj, obj2, i) || UnsafeUtil.getLong(obj, offset) != UnsafeUtil.getLong(obj2, offset)) {
                }
                break;
            case 17:
                if (!arePresentForEquals(obj, obj2, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(obj, offset), UnsafeUtil.getObject(obj2, offset))) {
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!isOneofCaseEqual(obj, obj2, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(obj, offset), UnsafeUtil.getObject(obj2, offset))) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int hashCode(Object obj) {
        int i;
        int hashLong;
        int length = this.buffer.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i3);
            int numberAt = numberAt(i3);
            long offset = offset(typeAndOffsetAt);
            int i4 = 37;
            switch (type(typeAndOffsetAt)) {
                case 0:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(obj, offset)));
                    i2 = i + hashLong;
                    break;
                case 1:
                    i = i2 * 53;
                    hashLong = Float.floatToIntBits(UnsafeUtil.getFloat(obj, offset));
                    i2 = i + hashLong;
                    break;
                case 2:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(obj, offset));
                    i2 = i + hashLong;
                    break;
                case 3:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(obj, offset));
                    i2 = i + hashLong;
                    break;
                case 4:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getInt(obj, offset);
                    i2 = i + hashLong;
                    break;
                case 5:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(obj, offset));
                    i2 = i + hashLong;
                    break;
                case 6:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getInt(obj, offset);
                    i2 = i + hashLong;
                    break;
                case 7:
                    i = i2 * 53;
                    hashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(obj, offset));
                    i2 = i + hashLong;
                    break;
                case 8:
                    i = i2 * 53;
                    hashLong = ((String) UnsafeUtil.getObject(obj, offset)).hashCode();
                    i2 = i + hashLong;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(obj, offset);
                    if (object != null) {
                        i4 = object.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 10:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getObject(obj, offset).hashCode();
                    i2 = i + hashLong;
                    break;
                case 11:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getInt(obj, offset);
                    i2 = i + hashLong;
                    break;
                case 12:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getInt(obj, offset);
                    i2 = i + hashLong;
                    break;
                case 13:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getInt(obj, offset);
                    i2 = i + hashLong;
                    break;
                case 14:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(obj, offset));
                    i2 = i + hashLong;
                    break;
                case 15:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getInt(obj, offset);
                    i2 = i + hashLong;
                    break;
                case 16:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(obj, offset));
                    i2 = i + hashLong;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(obj, offset);
                    if (object2 != null) {
                        i4 = object2.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getObject(obj, offset).hashCode();
                    i2 = i + hashLong;
                    break;
                case 50:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getObject(obj, offset).hashCode();
                    i2 = i + hashLong;
                    break;
                case 51:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(obj, offset)));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Float.floatToIntBits(oneofFloatAt(obj, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(obj, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(obj, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(obj, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(obj, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(obj, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashBoolean(oneofBooleanAt(obj, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = ((String) UnsafeUtil.getObject(obj, offset)).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = UnsafeUtil.getObject(obj, offset).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = UnsafeUtil.getObject(obj, offset).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(obj, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(obj, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(obj, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(obj, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(obj, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(obj, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = UnsafeUtil.getObject(obj, offset).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.unknownFieldSchema.getFromMessage(obj).hashCode();
        return this.hasExtensions ? (hashCode * 53) + this.extensionSchema.getExtensions(obj).hashCode() : hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.buffer.length; i += 3) {
            mergeSingleField(obj, obj2, i);
        }
        if (this.proto3) {
            return;
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, obj, obj2);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, obj, obj2);
        }
    }

    private void mergeSingleField(Object obj, Object obj2, int i) {
        int typeAndOffsetAt = typeAndOffsetAt(i);
        long offset = offset(typeAndOffsetAt);
        int numberAt = numberAt(i);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putDouble(obj, offset, UnsafeUtil.getDouble(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 1:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putFloat(obj, offset, UnsafeUtil.getFloat(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 2:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putLong(obj, offset, UnsafeUtil.getLong(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 3:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putLong(obj, offset, UnsafeUtil.getLong(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 4:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putInt(obj, offset, UnsafeUtil.getInt(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 5:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putLong(obj, offset, UnsafeUtil.getLong(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 6:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putInt(obj, offset, UnsafeUtil.getInt(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 7:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putBoolean(obj, offset, UnsafeUtil.getBoolean(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 8:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putObject(obj, offset, UnsafeUtil.getObject(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 9:
                mergeMessage(obj, obj2, i);
                break;
            case 10:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putObject(obj, offset, UnsafeUtil.getObject(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 11:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putInt(obj, offset, UnsafeUtil.getInt(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 12:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putInt(obj, offset, UnsafeUtil.getInt(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 13:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putInt(obj, offset, UnsafeUtil.getInt(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 14:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putLong(obj, offset, UnsafeUtil.getLong(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 15:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putInt(obj, offset, UnsafeUtil.getInt(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 16:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putLong(obj, offset, UnsafeUtil.getLong(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 17:
                mergeMessage(obj, obj2, i);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(obj, obj2, offset);
                break;
            case 50:
                SchemaUtil.mergeMap(this.mapFieldSchema, obj, obj2, offset);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(obj2, numberAt, i)) {
                    UnsafeUtil.putObject(obj, offset, UnsafeUtil.getObject(obj2, offset));
                    setOneofPresent(obj, numberAt, i);
                    break;
                }
                break;
            case 60:
                mergeOneofMessage(obj, obj2, i);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(obj2, numberAt, i)) {
                    UnsafeUtil.putObject(obj, offset, UnsafeUtil.getObject(obj2, offset));
                    setOneofPresent(obj, numberAt, i);
                    break;
                }
                break;
            case 68:
                mergeOneofMessage(obj, obj2, i);
                break;
        }
    }

    private void mergeMessage(Object obj, Object obj2, int i) {
        long offset = offset(typeAndOffsetAt(i));
        if (isFieldPresent(obj2, i)) {
            Object object = UnsafeUtil.getObject(obj, offset);
            Object object2 = UnsafeUtil.getObject(obj2, offset);
            if (object != null && object2 != null) {
                UnsafeUtil.putObject(obj, offset, Internal.mergeMessage(object, object2));
                setFieldPresent(obj, i);
            } else if (object2 != null) {
                UnsafeUtil.putObject(obj, offset, object2);
                setFieldPresent(obj, i);
            }
        }
    }

    private void mergeOneofMessage(Object obj, Object obj2, int i) {
        int typeAndOffsetAt = typeAndOffsetAt(i);
        int numberAt = numberAt(i);
        long offset = offset(typeAndOffsetAt);
        if (isOneofPresent(obj2, numberAt, i)) {
            Object object = UnsafeUtil.getObject(obj, offset);
            Object object2 = UnsafeUtil.getObject(obj2, offset);
            if (object != null && object2 != null) {
                UnsafeUtil.putObject(obj, offset, Internal.mergeMessage(object, object2));
                setOneofPresent(obj, numberAt, i);
            } else if (object2 != null) {
                UnsafeUtil.putObject(obj, offset, object2);
                setOneofPresent(obj, numberAt, i);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int getSerializedSize(Object obj) {
        return this.proto3 ? getSerializedSizeProto3(obj) : getSerializedSizeProto2(obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int getSerializedSizeProto2(Object obj) {
        int i;
        int i2;
        int computeDoubleSize;
        int computeBoolSize;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < this.buffer.length) {
            int typeAndOffsetAt = typeAndOffsetAt(i4);
            int numberAt = numberAt(i4);
            int type = type(typeAndOffsetAt);
            if (type <= 17) {
                i = this.buffer[i4 + 2];
                int i7 = 1048575 & i;
                int i8 = 1 << (i >>> 20);
                if (i7 != i3) {
                    i6 = unsafe.getInt(obj, i7);
                    i3 = i7;
                }
                i2 = i8;
            } else {
                i = (!this.useCachedSizeField || type < FieldType.DOUBLE_LIST_PACKED.id() || type > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i4 + 2] & 1048575;
                i2 = 0;
            }
            long offset = offset(typeAndOffsetAt);
            int i9 = i3;
            switch (type) {
                case 0:
                    if ((i6 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i5 += computeDoubleSize;
                        break;
                    }
                case 1:
                    if ((i6 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i5 += computeDoubleSize;
                        break;
                    }
                case 2:
                    if ((i6 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, unsafe.getLong(obj, offset));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 3:
                    if ((i6 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, unsafe.getLong(obj, offset));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 4:
                    if ((i6 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, unsafe.getInt(obj, offset));
                        i5 += computeDoubleSize;
                        break;
                    }
                case 5:
                    if ((i6 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i5 += computeDoubleSize;
                        break;
                    }
                case 6:
                    if ((i6 & i2) != 0) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i5 += computeDoubleSize;
                        break;
                    }
                    break;
                case 7:
                    if ((i6 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i5 += computeBoolSize;
                    }
                    break;
                case 8:
                    if ((i6 & i2) != 0) {
                        Object object = unsafe.getObject(obj, offset);
                        if (object instanceof ByteString) {
                            computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object);
                        } else {
                            computeBoolSize = CodedOutputStream.computeStringSize(numberAt, (String) object);
                        }
                        i5 += computeBoolSize;
                    }
                    break;
                case 9:
                    if ((i6 & i2) != 0) {
                        computeBoolSize = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(obj, offset), getMessageFieldSchema(i4));
                        i5 += computeBoolSize;
                    }
                    break;
                case 10:
                    if ((i6 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(obj, offset));
                        i5 += computeBoolSize;
                    }
                    break;
                case 11:
                    if ((i6 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeUInt32Size(numberAt, unsafe.getInt(obj, offset));
                        i5 += computeBoolSize;
                    }
                    break;
                case 12:
                    if ((i6 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeEnumSize(numberAt, unsafe.getInt(obj, offset));
                        i5 += computeBoolSize;
                    }
                    break;
                case 13:
                    if ((i6 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i5 += computeBoolSize;
                    }
                    break;
                case 14:
                    if ((i6 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i5 += computeBoolSize;
                    }
                    break;
                case 15:
                    if ((i6 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeSInt32Size(numberAt, unsafe.getInt(obj, offset));
                        i5 += computeBoolSize;
                    }
                    break;
                case 16:
                    if ((i6 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeSInt64Size(numberAt, unsafe.getLong(obj, offset));
                        i5 += computeBoolSize;
                    }
                    break;
                case 17:
                    if ((i6 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(obj, offset), getMessageFieldSchema(i4));
                        i5 += computeBoolSize;
                    }
                    break;
                case 18:
                    computeBoolSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeBoolSize;
                    break;
                case 19:
                    computeBoolSize = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeBoolSize;
                    break;
                case 20:
                    computeBoolSize = SchemaUtil.computeSizeInt64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeBoolSize;
                    break;
                case 21:
                    computeBoolSize = SchemaUtil.computeSizeUInt64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeBoolSize;
                    break;
                case 22:
                    computeBoolSize = SchemaUtil.computeSizeInt32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeBoolSize;
                    break;
                case 23:
                    computeBoolSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeBoolSize;
                    break;
                case 24:
                    computeBoolSize = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeBoolSize;
                    break;
                case 25:
                    computeBoolSize = SchemaUtil.computeSizeBoolList(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeBoolSize;
                    break;
                case 26:
                    computeBoolSize = SchemaUtil.computeSizeStringList(numberAt, (List) unsafe.getObject(obj, offset));
                    i5 += computeBoolSize;
                    break;
                case 27:
                    computeBoolSize = SchemaUtil.computeSizeMessageList(numberAt, (List) unsafe.getObject(obj, offset), getMessageFieldSchema(i4));
                    i5 += computeBoolSize;
                    break;
                case 28:
                    computeBoolSize = SchemaUtil.computeSizeByteStringList(numberAt, (List) unsafe.getObject(obj, offset));
                    i5 += computeBoolSize;
                    break;
                case 29:
                    computeBoolSize = SchemaUtil.computeSizeUInt32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeBoolSize;
                    break;
                case 30:
                    computeBoolSize = SchemaUtil.computeSizeEnumList(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeBoolSize;
                    break;
                case 31:
                    computeBoolSize = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeBoolSize;
                    break;
                case 32:
                    computeBoolSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeBoolSize;
                    break;
                case 33:
                    computeBoolSize = SchemaUtil.computeSizeSInt32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeBoolSize;
                    break;
                case 34:
                    computeBoolSize = SchemaUtil.computeSizeSInt64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i5 += computeBoolSize;
                    break;
                case 35:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    break;
                case 36:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    break;
                case 37:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    break;
                case 38:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    break;
                case 39:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    break;
                case 40:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    break;
                case 41:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    break;
                case 42:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    break;
                case 43:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    break;
                case 44:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    break;
                case 45:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    break;
                case 46:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    break;
                case 47:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    break;
                case 48:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    break;
                case 49:
                    computeBoolSize = SchemaUtil.computeSizeGroupList(numberAt, (List) unsafe.getObject(obj, offset), getMessageFieldSchema(i4));
                    i5 += computeBoolSize;
                    break;
                case 50:
                    computeBoolSize = this.mapFieldSchema.getSerializedSize(numberAt, unsafe.getObject(obj, offset), getMapFieldDefaultEntry(i4));
                    i5 += computeBoolSize;
                    break;
                case 51:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        computeBoolSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i5 += computeBoolSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        computeBoolSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i5 += computeBoolSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        computeBoolSize = CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(obj, offset));
                        i5 += computeBoolSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        computeBoolSize = CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(obj, offset));
                        i5 += computeBoolSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        computeBoolSize = CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(obj, offset));
                        i5 += computeBoolSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        computeBoolSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i5 += computeBoolSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        computeBoolSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i5 += computeBoolSize;
                    }
                    break;
                case 58:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        computeBoolSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i5 += computeBoolSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        Object object2 = unsafe.getObject(obj, offset);
                        if (object2 instanceof ByteString) {
                            computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object2);
                        } else {
                            computeBoolSize = CodedOutputStream.computeStringSize(numberAt, (String) object2);
                        }
                        i5 += computeBoolSize;
                    }
                    break;
                case 60:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        computeBoolSize = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(obj, offset), getMessageFieldSchema(i4));
                        i5 += computeBoolSize;
                    }
                    break;
                case 61:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(obj, offset));
                        i5 += computeBoolSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        computeBoolSize = CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(obj, offset));
                        i5 += computeBoolSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        computeBoolSize = CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(obj, offset));
                        i5 += computeBoolSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        computeBoolSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i5 += computeBoolSize;
                    }
                    break;
                case 65:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        computeBoolSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i5 += computeBoolSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        computeBoolSize = CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(obj, offset));
                        i5 += computeBoolSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        computeBoolSize = CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(obj, offset));
                        i5 += computeBoolSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(obj, numberAt, i4)) {
                        computeBoolSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(obj, offset), getMessageFieldSchema(i4));
                        i5 += computeBoolSize;
                    }
                    break;
            }
            i4 += 3;
            i3 = i9;
        }
        int unknownFieldsSerializedSize = i5 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, obj);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(obj).getSerializedSize() : unknownFieldsSerializedSize;
    }

    private int getSerializedSizeProto3(Object obj) {
        int computeDoubleSize;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i = 0;
        for (int i2 = 0; i2 < this.buffer.length; i2 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i2);
            int type = type(typeAndOffsetAt);
            int numberAt = numberAt(i2);
            long offset = offset(typeAndOffsetAt);
            int i3 = (type < FieldType.DOUBLE_LIST_PACKED.id() || type > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i2 + 2] & 1048575;
            switch (type) {
                case 0:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, UnsafeUtil.getLong(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, UnsafeUtil.getLong(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, UnsafeUtil.getInt(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (isFieldPresent(obj, i2)) {
                        Object object = UnsafeUtil.getObject(obj, offset);
                        if (object instanceof ByteString) {
                            computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object);
                        } else {
                            computeDoubleSize = CodedOutputStream.computeStringSize(numberAt, (String) object);
                        }
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = SchemaUtil.computeSizeMessage(numberAt, UnsafeUtil.getObject(obj, offset), getMessageFieldSchema(i2));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) UnsafeUtil.getObject(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, UnsafeUtil.getInt(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, UnsafeUtil.getInt(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, UnsafeUtil.getInt(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, UnsafeUtil.getLong(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (isFieldPresent(obj, i2)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) UnsafeUtil.getObject(obj, offset), getMessageFieldSchema(i2));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 19:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 20:
                    computeDoubleSize = SchemaUtil.computeSizeInt64List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 21:
                    computeDoubleSize = SchemaUtil.computeSizeUInt64List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 22:
                    computeDoubleSize = SchemaUtil.computeSizeInt32List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 23:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 24:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 25:
                    computeDoubleSize = SchemaUtil.computeSizeBoolList(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 26:
                    computeDoubleSize = SchemaUtil.computeSizeStringList(numberAt, listAt(obj, offset));
                    i += computeDoubleSize;
                    break;
                case 27:
                    computeDoubleSize = SchemaUtil.computeSizeMessageList(numberAt, listAt(obj, offset), getMessageFieldSchema(i2));
                    i += computeDoubleSize;
                    break;
                case 28:
                    computeDoubleSize = SchemaUtil.computeSizeByteStringList(numberAt, listAt(obj, offset));
                    i += computeDoubleSize;
                    break;
                case 29:
                    computeDoubleSize = SchemaUtil.computeSizeUInt32List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 30:
                    computeDoubleSize = SchemaUtil.computeSizeEnumList(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 31:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 32:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 33:
                    computeDoubleSize = SchemaUtil.computeSizeSInt32List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 34:
                    computeDoubleSize = SchemaUtil.computeSizeSInt64List(numberAt, listAt(obj, offset), false);
                    i += computeDoubleSize;
                    break;
                case 35:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 36:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 37:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 38:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 39:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 40:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 41:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 42:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 43:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 44:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 45:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 46:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 47:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 48:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i3, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i += computeDoubleSize;
                        break;
                    }
                case 49:
                    computeDoubleSize = SchemaUtil.computeSizeGroupList(numberAt, listAt(obj, offset), getMessageFieldSchema(i2));
                    i += computeDoubleSize;
                    break;
                case 50:
                    computeDoubleSize = this.mapFieldSchema.getSerializedSize(numberAt, UnsafeUtil.getObject(obj, offset), getMapFieldDefaultEntry(i2));
                    i += computeDoubleSize;
                    break;
                case 51:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        Object object2 = UnsafeUtil.getObject(obj, offset);
                        if (object2 instanceof ByteString) {
                            computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object2);
                        } else {
                            computeDoubleSize = CodedOutputStream.computeStringSize(numberAt, (String) object2);
                        }
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = SchemaUtil.computeSizeMessage(numberAt, UnsafeUtil.getObject(obj, offset), getMessageFieldSchema(i2));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) UnsafeUtil.getObject(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(obj, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(obj, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) UnsafeUtil.getObject(obj, offset), getMessageFieldSchema(i2));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i + getUnknownFieldsSerializedSize(this.unknownFieldSchema, obj);
    }

    private int getUnknownFieldsSerializedSize(UnknownFieldSchema unknownFieldSchema, Object obj) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(obj));
    }

    private static List listAt(Object obj, long j) {
        return (List) UnsafeUtil.getObject(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void writeTo(Object obj, Writer writer) {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(obj, writer);
        } else if (this.proto3) {
            writeFieldsInAscendingOrderProto3(obj, writer);
        } else {
            writeFieldsInAscendingOrderProto2(obj, writer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:225:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void writeFieldsInAscendingOrderProto2(Object obj, Writer writer) {
        Iterator it;
        Map.Entry entry;
        int length;
        int i;
        int i2;
        if (this.hasExtensions) {
            FieldSet extensions = this.extensionSchema.getExtensions(obj);
            if (!extensions.isEmpty()) {
                it = extensions.iterator();
                entry = (Map.Entry) it.next();
                length = this.buffer.length;
                Unsafe unsafe = UNSAFE;
                int i3 = -1;
                i = 0;
                int i4 = 0;
                while (i < length) {
                    int typeAndOffsetAt = typeAndOffsetAt(i);
                    int numberAt = numberAt(i);
                    int type = type(typeAndOffsetAt);
                    if (this.proto3 || type > 17) {
                        entry = entry;
                        i2 = 0;
                    } else {
                        int i5 = this.buffer[i + 2];
                        int i6 = i5 & 1048575;
                        Map.Entry entry2 = entry;
                        if (i6 != i3) {
                            i4 = unsafe.getInt(obj, i6);
                            i3 = i6;
                        }
                        i2 = 1 << (i5 >>> 20);
                        entry = entry2;
                    }
                    while (entry != null && this.extensionSchema.extensionNumber(entry) <= numberAt) {
                        this.extensionSchema.serializeExtension(writer, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    Iterator it2 = it;
                    int i7 = i2;
                    long offset = offset(typeAndOffsetAt);
                    switch (type) {
                        case 0:
                            if ((i4 & i7) == 0) {
                                break;
                            } else {
                                writer.writeDouble(numberAt, doubleAt(obj, offset));
                                continue;
                            }
                        case 1:
                            if ((i4 & i7) != 0) {
                                writer.writeFloat(numberAt, floatAt(obj, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if ((i4 & i7) != 0) {
                                writer.writeInt64(numberAt, unsafe.getLong(obj, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if ((i4 & i7) != 0) {
                                writer.writeUInt64(numberAt, unsafe.getLong(obj, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if ((i4 & i7) != 0) {
                                writer.writeInt32(numberAt, unsafe.getInt(obj, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if ((i4 & i7) != 0) {
                                writer.writeFixed64(numberAt, unsafe.getLong(obj, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if ((i4 & i7) != 0) {
                                writer.writeFixed32(numberAt, unsafe.getInt(obj, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if ((i4 & i7) != 0) {
                                writer.writeBool(numberAt, booleanAt(obj, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            if ((i4 & i7) != 0) {
                                writeString(numberAt, unsafe.getObject(obj, offset), writer);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            if ((i4 & i7) != 0) {
                                writer.writeMessage(numberAt, unsafe.getObject(obj, offset), getMessageFieldSchema(i));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            if ((i4 & i7) != 0) {
                                writer.writeBytes(numberAt, (ByteString) unsafe.getObject(obj, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if ((i4 & i7) != 0) {
                                writer.writeUInt32(numberAt, unsafe.getInt(obj, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            if ((i4 & i7) != 0) {
                                writer.writeEnum(numberAt, unsafe.getInt(obj, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            if ((i4 & i7) != 0) {
                                writer.writeSFixed32(numberAt, unsafe.getInt(obj, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            if ((i4 & i7) != 0) {
                                writer.writeSFixed64(numberAt, unsafe.getLong(obj, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            if ((i4 & i7) != 0) {
                                writer.writeSInt32(numberAt, unsafe.getInt(obj, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            if ((i4 & i7) != 0) {
                                writer.writeSInt64(numberAt, unsafe.getLong(obj, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            if ((i4 & i7) != 0) {
                                writer.writeGroup(numberAt, unsafe.getObject(obj, offset), getMessageFieldSchema(i));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            SchemaUtil.writeDoubleList(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            continue;
                        case 19:
                            SchemaUtil.writeFloatList(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            continue;
                        case 20:
                            SchemaUtil.writeInt64List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            continue;
                        case 21:
                            SchemaUtil.writeUInt64List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            continue;
                        case 22:
                            SchemaUtil.writeInt32List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            continue;
                        case 23:
                            SchemaUtil.writeFixed64List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            continue;
                        case 24:
                            SchemaUtil.writeFixed32List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            continue;
                        case 25:
                            SchemaUtil.writeBoolList(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            continue;
                        case 26:
                            SchemaUtil.writeStringList(numberAt(i), (List) unsafe.getObject(obj, offset), writer);
                            break;
                        case 27:
                            SchemaUtil.writeMessageList(numberAt(i), (List) unsafe.getObject(obj, offset), writer, getMessageFieldSchema(i));
                            break;
                        case 28:
                            SchemaUtil.writeBytesList(numberAt(i), (List) unsafe.getObject(obj, offset), writer);
                            break;
                        case 29:
                            SchemaUtil.writeUInt32List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            break;
                        case 30:
                            SchemaUtil.writeEnumList(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            break;
                        case 31:
                            SchemaUtil.writeSFixed32List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            break;
                        case 32:
                            SchemaUtil.writeSFixed64List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            break;
                        case 33:
                            SchemaUtil.writeSInt32List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            break;
                        case 34:
                            SchemaUtil.writeSInt64List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            break;
                        case 35:
                            SchemaUtil.writeDoubleList(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            break;
                        case 36:
                            SchemaUtil.writeFloatList(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            break;
                        case 37:
                            SchemaUtil.writeInt64List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            break;
                        case 38:
                            SchemaUtil.writeUInt64List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            break;
                        case 39:
                            SchemaUtil.writeInt32List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            break;
                        case 40:
                            SchemaUtil.writeFixed64List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            break;
                        case 41:
                            SchemaUtil.writeFixed32List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            break;
                        case 42:
                            SchemaUtil.writeBoolList(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            break;
                        case 43:
                            SchemaUtil.writeUInt32List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            break;
                        case 44:
                            SchemaUtil.writeEnumList(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            break;
                        case 45:
                            SchemaUtil.writeSFixed32List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            break;
                        case 46:
                            SchemaUtil.writeSFixed64List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            break;
                        case 47:
                            SchemaUtil.writeSInt32List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            break;
                        case 48:
                            SchemaUtil.writeSInt64List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            break;
                        case 49:
                            SchemaUtil.writeGroupList(numberAt(i), (List) unsafe.getObject(obj, offset), writer, getMessageFieldSchema(i));
                            break;
                        case 50:
                            writeMapHelper(writer, numberAt, unsafe.getObject(obj, offset), i);
                            break;
                        case 51:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeDouble(numberAt, oneofDoubleAt(obj, offset));
                                break;
                            }
                            break;
                        case 52:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeFloat(numberAt, oneofFloatAt(obj, offset));
                                break;
                            }
                            break;
                        case 53:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeInt64(numberAt, oneofLongAt(obj, offset));
                                break;
                            }
                            break;
                        case 54:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeUInt64(numberAt, oneofLongAt(obj, offset));
                                break;
                            }
                            break;
                        case 55:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeInt32(numberAt, oneofIntAt(obj, offset));
                                break;
                            }
                            break;
                        case 56:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeFixed64(numberAt, oneofLongAt(obj, offset));
                                break;
                            }
                            break;
                        case 57:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeFixed32(numberAt, oneofIntAt(obj, offset));
                                break;
                            }
                            break;
                        case 58:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeBool(numberAt, oneofBooleanAt(obj, offset));
                                break;
                            }
                            break;
                        case 59:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writeString(numberAt, unsafe.getObject(obj, offset), writer);
                                break;
                            }
                            break;
                        case 60:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeMessage(numberAt, unsafe.getObject(obj, offset), getMessageFieldSchema(i));
                                break;
                            }
                            break;
                        case 61:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeBytes(numberAt, (ByteString) unsafe.getObject(obj, offset));
                                break;
                            }
                            break;
                        case 62:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeUInt32(numberAt, oneofIntAt(obj, offset));
                                break;
                            }
                            break;
                        case 63:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeEnum(numberAt, oneofIntAt(obj, offset));
                                break;
                            }
                            break;
                        case 64:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeSFixed32(numberAt, oneofIntAt(obj, offset));
                                break;
                            }
                            break;
                        case 65:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeSFixed64(numberAt, oneofLongAt(obj, offset));
                                break;
                            }
                            break;
                        case 66:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeSInt32(numberAt, oneofIntAt(obj, offset));
                                break;
                            }
                            break;
                        case 67:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeSInt64(numberAt, oneofLongAt(obj, offset));
                                break;
                            }
                            break;
                        case 68:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeGroup(numberAt, unsafe.getObject(obj, offset), getMessageFieldSchema(i));
                                break;
                            }
                            break;
                    }
                    i += 3;
                    it = it2;
                }
                Iterator it3 = it;
                while (entry != null) {
                    this.extensionSchema.serializeExtension(writer, entry);
                    entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
                }
                writeUnknownInMessageTo(this.unknownFieldSchema, obj, writer);
            }
        }
        it = null;
        entry = null;
        length = this.buffer.length;
        Unsafe unsafe2 = UNSAFE;
        int i32 = -1;
        i = 0;
        int i42 = 0;
        while (i < length) {
        }
        Iterator it32 = it;
        while (entry != null) {
        }
        writeUnknownInMessageTo(this.unknownFieldSchema, obj, writer);
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void writeFieldsInAscendingOrderProto3(Object obj, Writer writer) {
        Iterator it;
        Map.Entry entry;
        int length;
        int i;
        if (this.hasExtensions) {
            FieldSet extensions = this.extensionSchema.getExtensions(obj);
            if (!extensions.isEmpty()) {
                it = extensions.iterator();
                entry = (Map.Entry) it.next();
                length = this.buffer.length;
                for (i = 0; i < length; i += 3) {
                    int typeAndOffsetAt = typeAndOffsetAt(i);
                    int numberAt = numberAt(i);
                    while (entry != null && this.extensionSchema.extensionNumber(entry) <= numberAt) {
                        this.extensionSchema.serializeExtension(writer, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    switch (type(typeAndOffsetAt)) {
                        case 0:
                            if (isFieldPresent(obj, i)) {
                                writer.writeDouble(numberAt, doubleAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (isFieldPresent(obj, i)) {
                                writer.writeFloat(numberAt, floatAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (isFieldPresent(obj, i)) {
                                writer.writeInt64(numberAt, longAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (isFieldPresent(obj, i)) {
                                writer.writeUInt64(numberAt, longAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (isFieldPresent(obj, i)) {
                                writer.writeInt32(numberAt, intAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (isFieldPresent(obj, i)) {
                                writer.writeFixed64(numberAt, longAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (isFieldPresent(obj, i)) {
                                writer.writeFixed32(numberAt, intAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (isFieldPresent(obj, i)) {
                                writer.writeBool(numberAt, booleanAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (isFieldPresent(obj, i)) {
                                writeString(numberAt, UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (isFieldPresent(obj, i)) {
                                writer.writeMessage(numberAt, UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), getMessageFieldSchema(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (isFieldPresent(obj, i)) {
                                writer.writeBytes(numberAt, (ByteString) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (isFieldPresent(obj, i)) {
                                writer.writeUInt32(numberAt, intAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (isFieldPresent(obj, i)) {
                                writer.writeEnum(numberAt, intAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (isFieldPresent(obj, i)) {
                                writer.writeSFixed32(numberAt, intAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (isFieldPresent(obj, i)) {
                                writer.writeSFixed64(numberAt, longAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (isFieldPresent(obj, i)) {
                                writer.writeSInt32(numberAt, intAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (isFieldPresent(obj, i)) {
                                writer.writeSInt64(numberAt, longAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (isFieldPresent(obj, i)) {
                                writer.writeGroup(numberAt, UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), getMessageFieldSchema(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            SchemaUtil.writeDoubleList(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 19:
                            SchemaUtil.writeFloatList(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 20:
                            SchemaUtil.writeInt64List(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 21:
                            SchemaUtil.writeUInt64List(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 22:
                            SchemaUtil.writeInt32List(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 23:
                            SchemaUtil.writeFixed64List(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 24:
                            SchemaUtil.writeFixed32List(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 25:
                            SchemaUtil.writeBoolList(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 26:
                            SchemaUtil.writeStringList(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer);
                            break;
                        case 27:
                            SchemaUtil.writeMessageList(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, getMessageFieldSchema(i));
                            break;
                        case 28:
                            SchemaUtil.writeBytesList(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer);
                            break;
                        case 29:
                            SchemaUtil.writeUInt32List(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 30:
                            SchemaUtil.writeEnumList(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 31:
                            SchemaUtil.writeSFixed32List(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 32:
                            SchemaUtil.writeSFixed64List(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 33:
                            SchemaUtil.writeSInt32List(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 34:
                            SchemaUtil.writeSInt64List(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 35:
                            SchemaUtil.writeDoubleList(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 36:
                            SchemaUtil.writeFloatList(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 37:
                            SchemaUtil.writeInt64List(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 38:
                            SchemaUtil.writeUInt64List(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 39:
                            SchemaUtil.writeInt32List(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 40:
                            SchemaUtil.writeFixed64List(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 41:
                            SchemaUtil.writeFixed32List(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 42:
                            SchemaUtil.writeBoolList(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 43:
                            SchemaUtil.writeUInt32List(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 44:
                            SchemaUtil.writeEnumList(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 45:
                            SchemaUtil.writeSFixed32List(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 46:
                            SchemaUtil.writeSFixed64List(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 47:
                            SchemaUtil.writeSInt32List(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 48:
                            SchemaUtil.writeSInt64List(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 49:
                            SchemaUtil.writeGroupList(numberAt(i), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, getMessageFieldSchema(i));
                            break;
                        case 50:
                            writeMapHelper(writer, numberAt, UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), i);
                            break;
                        case 51:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeDouble(numberAt, oneofDoubleAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeFloat(numberAt, oneofFloatAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeInt64(numberAt, oneofLongAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeUInt64(numberAt, oneofLongAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeInt32(numberAt, oneofIntAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeFixed64(numberAt, oneofLongAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeFixed32(numberAt, oneofIntAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeBool(numberAt, oneofBooleanAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writeString(numberAt, UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeMessage(numberAt, UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), getMessageFieldSchema(i));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeBytes(numberAt, (ByteString) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeUInt32(numberAt, oneofIntAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeEnum(numberAt, oneofIntAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeSFixed32(numberAt, oneofIntAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeSFixed64(numberAt, oneofLongAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeSInt32(numberAt, oneofIntAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeSInt64(numberAt, oneofLongAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeGroup(numberAt, UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), getMessageFieldSchema(i));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.extensionSchema.serializeExtension(writer, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                writeUnknownInMessageTo(this.unknownFieldSchema, obj, writer);
            }
        }
        it = null;
        entry = null;
        length = this.buffer.length;
        while (i < length) {
        }
        while (entry != null) {
        }
        writeUnknownInMessageTo(this.unknownFieldSchema, obj, writer);
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void writeFieldsInDescendingOrder(Object obj, Writer writer) {
        Iterator it;
        Map.Entry entry;
        int length;
        writeUnknownInMessageTo(this.unknownFieldSchema, obj, writer);
        if (this.hasExtensions) {
            FieldSet extensions = this.extensionSchema.getExtensions(obj);
            if (!extensions.isEmpty()) {
                it = extensions.descendingIterator();
                entry = (Map.Entry) it.next();
                for (length = this.buffer.length - 3; length >= 0; length -= 3) {
                    int typeAndOffsetAt = typeAndOffsetAt(length);
                    int numberAt = numberAt(length);
                    while (entry != null && this.extensionSchema.extensionNumber(entry) > numberAt) {
                        this.extensionSchema.serializeExtension(writer, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    switch (type(typeAndOffsetAt)) {
                        case 0:
                            if (isFieldPresent(obj, length)) {
                                writer.writeDouble(numberAt, doubleAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (isFieldPresent(obj, length)) {
                                writer.writeFloat(numberAt, floatAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (isFieldPresent(obj, length)) {
                                writer.writeInt64(numberAt, longAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (isFieldPresent(obj, length)) {
                                writer.writeUInt64(numberAt, longAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (isFieldPresent(obj, length)) {
                                writer.writeInt32(numberAt, intAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (isFieldPresent(obj, length)) {
                                writer.writeFixed64(numberAt, longAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (isFieldPresent(obj, length)) {
                                writer.writeFixed32(numberAt, intAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (isFieldPresent(obj, length)) {
                                writer.writeBool(numberAt, booleanAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (isFieldPresent(obj, length)) {
                                writeString(numberAt, UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (isFieldPresent(obj, length)) {
                                writer.writeMessage(numberAt, UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (isFieldPresent(obj, length)) {
                                writer.writeBytes(numberAt, (ByteString) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (isFieldPresent(obj, length)) {
                                writer.writeUInt32(numberAt, intAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (isFieldPresent(obj, length)) {
                                writer.writeEnum(numberAt, intAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (isFieldPresent(obj, length)) {
                                writer.writeSFixed32(numberAt, intAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (isFieldPresent(obj, length)) {
                                writer.writeSFixed64(numberAt, longAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (isFieldPresent(obj, length)) {
                                writer.writeSInt32(numberAt, intAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (isFieldPresent(obj, length)) {
                                writer.writeSInt64(numberAt, longAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (isFieldPresent(obj, length)) {
                                writer.writeGroup(numberAt, UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 19:
                            SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 20:
                            SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 21:
                            SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 22:
                            SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 23:
                            SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 24:
                            SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 25:
                            SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 26:
                            SchemaUtil.writeStringList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer);
                            break;
                        case 27:
                            SchemaUtil.writeMessageList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, getMessageFieldSchema(length));
                            break;
                        case 28:
                            SchemaUtil.writeBytesList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer);
                            break;
                        case 29:
                            SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 30:
                            SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 31:
                            SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 32:
                            SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 33:
                            SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 34:
                            SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 35:
                            SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 36:
                            SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 37:
                            SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 38:
                            SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 39:
                            SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 40:
                            SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 41:
                            SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 42:
                            SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 43:
                            SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 44:
                            SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 45:
                            SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 46:
                            SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 47:
                            SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 48:
                            SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 49:
                            SchemaUtil.writeGroupList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, getMessageFieldSchema(length));
                            break;
                        case 50:
                            writeMapHelper(writer, numberAt, UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), length);
                            break;
                        case 51:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeDouble(numberAt, oneofDoubleAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeFloat(numberAt, oneofFloatAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeInt64(numberAt, oneofLongAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeUInt64(numberAt, oneofLongAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeInt32(numberAt, oneofIntAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeFixed64(numberAt, oneofLongAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeFixed32(numberAt, oneofIntAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeBool(numberAt, oneofBooleanAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writeString(numberAt, UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeMessage(numberAt, UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeBytes(numberAt, (ByteString) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeUInt32(numberAt, oneofIntAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeEnum(numberAt, oneofIntAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeSFixed32(numberAt, oneofIntAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeSFixed64(numberAt, oneofLongAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeSInt32(numberAt, oneofIntAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeSInt64(numberAt, oneofLongAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeGroup(numberAt, UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.extensionSchema.serializeExtension(writer, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
            }
        }
        it = null;
        entry = null;
        while (length >= 0) {
        }
        while (entry != null) {
        }
    }

    private void writeMapHelper(Writer writer, int i, Object obj, int i2) {
        if (obj != null) {
            writer.writeMap(i, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeUnknownInMessageTo(UnknownFieldSchema unknownFieldSchema, Object obj, Writer writer) {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(obj), writer);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, obj, reader, extensionRegistryLite);
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x0082, code lost:
    
        r0 = r14.checkInitializedCount;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0086, code lost:
    
        if (r0 >= r14.repeatedFieldOffsetStart) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0088, code lost:
    
        r7 = filterMapUnknownEnumValues(r9, r14.intArray[r0], r7, r15);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0093, code lost:
    
        if (r7 == null) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0029, code lost:
    
        r15.setBuilderToMessage(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x05f4 A[Catch: all -> 0x0611, TRY_LEAVE, TryCatch #9 {all -> 0x0611, blocks: (B:34:0x05ee, B:36:0x05f4, B:49:0x0615, B:50:0x061a), top: B:33:0x05ee }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x063e A[LOOP:4: B:63:0x063a->B:65:0x063e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x064b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void mergeFromHelper(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        Object obj2;
        int i;
        ExtensionSchema extensionSchema2;
        Object findExtensionByNumber;
        Object obj3;
        Object obj4 = obj;
        ExtensionRegistryLite extensionRegistryLite2 = extensionRegistryLite;
        Object obj5 = null;
        FieldSet fieldSet = null;
        while (true) {
            try {
                int fieldNumber = reader.getFieldNumber();
                int positionForFieldNumber = positionForFieldNumber(fieldNumber);
                if (positionForFieldNumber >= 0) {
                    Reader reader2 = reader;
                    obj3 = obj5;
                    int typeAndOffsetAt = typeAndOffsetAt(positionForFieldNumber);
                    switch (type(typeAndOffsetAt)) {
                        case 0:
                            obj2 = obj4;
                            UnsafeUtil.putDouble(obj2, offset(typeAndOffsetAt), reader2.readDouble());
                            setFieldPresent(obj2, positionForFieldNumber);
                            obj5 = obj3;
                            obj4 = obj2;
                        case 1:
                            obj2 = obj4;
                            UnsafeUtil.putFloat(obj2, offset(typeAndOffsetAt), reader2.readFloat());
                            setFieldPresent(obj2, positionForFieldNumber);
                            obj5 = obj3;
                            obj4 = obj2;
                        case 2:
                            obj2 = obj4;
                            UnsafeUtil.putLong(obj2, offset(typeAndOffsetAt), reader2.readInt64());
                            setFieldPresent(obj2, positionForFieldNumber);
                            obj5 = obj3;
                            obj4 = obj2;
                        case 3:
                            obj2 = obj4;
                            UnsafeUtil.putLong(obj2, offset(typeAndOffsetAt), reader2.readUInt64());
                            setFieldPresent(obj2, positionForFieldNumber);
                            obj5 = obj3;
                            obj4 = obj2;
                        case 4:
                            obj2 = obj4;
                            UnsafeUtil.putInt(obj2, offset(typeAndOffsetAt), reader2.readInt32());
                            setFieldPresent(obj2, positionForFieldNumber);
                            obj5 = obj3;
                            obj4 = obj2;
                        case 5:
                            obj2 = obj4;
                            UnsafeUtil.putLong(obj2, offset(typeAndOffsetAt), reader2.readFixed64());
                            setFieldPresent(obj2, positionForFieldNumber);
                            obj5 = obj3;
                            obj4 = obj2;
                        case 6:
                            obj2 = obj4;
                            UnsafeUtil.putInt(obj2, offset(typeAndOffsetAt), reader2.readFixed32());
                            setFieldPresent(obj2, positionForFieldNumber);
                            obj5 = obj3;
                            obj4 = obj2;
                        case 7:
                            obj2 = obj4;
                            UnsafeUtil.putBoolean(obj2, offset(typeAndOffsetAt), reader2.readBool());
                            setFieldPresent(obj2, positionForFieldNumber);
                            obj5 = obj3;
                            obj4 = obj2;
                        case 8:
                            obj2 = obj4;
                            readString(obj2, typeAndOffsetAt, reader2);
                            setFieldPresent(obj2, positionForFieldNumber);
                            obj5 = obj3;
                            obj4 = obj2;
                        case 9:
                            obj2 = obj4;
                            if (isFieldPresent(obj2, positionForFieldNumber)) {
                                UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), Internal.mergeMessage(UnsafeUtil.getObject(obj2, offset(typeAndOffsetAt)), reader2.readMessageBySchemaWithCheck(getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite2)));
                            } else {
                                UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), reader2.readMessageBySchemaWithCheck(getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite2));
                                setFieldPresent(obj2, positionForFieldNumber);
                            }
                            obj5 = obj3;
                            obj4 = obj2;
                        case 10:
                            obj2 = obj4;
                            UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), reader2.readBytes());
                            setFieldPresent(obj2, positionForFieldNumber);
                            obj5 = obj3;
                            obj4 = obj2;
                        case 11:
                            obj2 = obj4;
                            UnsafeUtil.putInt(obj2, offset(typeAndOffsetAt), reader2.readUInt32());
                            setFieldPresent(obj2, positionForFieldNumber);
                            obj5 = obj3;
                            obj4 = obj2;
                        case 12:
                            obj2 = obj4;
                            int readEnum = reader2.readEnum();
                            getEnumFieldVerifier(positionForFieldNumber);
                            UnsafeUtil.putInt(obj2, offset(typeAndOffsetAt), readEnum);
                            setFieldPresent(obj2, positionForFieldNumber);
                            obj5 = obj3;
                            obj4 = obj2;
                        case 13:
                            obj2 = obj4;
                            UnsafeUtil.putInt(obj2, offset(typeAndOffsetAt), reader2.readSFixed32());
                            setFieldPresent(obj2, positionForFieldNumber);
                            obj5 = obj3;
                            obj4 = obj2;
                        case 14:
                            obj2 = obj4;
                            UnsafeUtil.putLong(obj2, offset(typeAndOffsetAt), reader2.readSFixed64());
                            setFieldPresent(obj2, positionForFieldNumber);
                            obj5 = obj3;
                            obj4 = obj2;
                        case 15:
                            obj2 = obj4;
                            UnsafeUtil.putInt(obj2, offset(typeAndOffsetAt), reader2.readSInt32());
                            setFieldPresent(obj2, positionForFieldNumber);
                            obj5 = obj3;
                            obj4 = obj2;
                        case 16:
                            obj2 = obj4;
                            UnsafeUtil.putLong(obj2, offset(typeAndOffsetAt), reader2.readSInt64());
                            setFieldPresent(obj2, positionForFieldNumber);
                            obj5 = obj3;
                            obj4 = obj2;
                        case 17:
                            obj2 = obj4;
                            if (isFieldPresent(obj2, positionForFieldNumber)) {
                                UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), Internal.mergeMessage(UnsafeUtil.getObject(obj2, offset(typeAndOffsetAt)), reader2.readGroupBySchemaWithCheck(getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite2)));
                            } else {
                                UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), reader2.readGroupBySchemaWithCheck(getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite2));
                                setFieldPresent(obj2, positionForFieldNumber);
                            }
                            obj5 = obj3;
                            obj4 = obj2;
                        case 18:
                            obj2 = obj4;
                            reader2.readDoubleList(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                            obj5 = obj3;
                            obj4 = obj2;
                        case 19:
                            obj2 = obj4;
                            reader2.readFloatList(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                            obj5 = obj3;
                            obj4 = obj2;
                        case 20:
                            obj2 = obj4;
                            reader2.readInt64List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                            obj5 = obj3;
                            obj4 = obj2;
                        case 21:
                            obj2 = obj4;
                            reader2.readUInt64List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                            obj5 = obj3;
                            obj4 = obj2;
                        case 22:
                            obj2 = obj4;
                            reader2.readInt32List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                            obj5 = obj3;
                            obj4 = obj2;
                        case 23:
                            obj2 = obj4;
                            reader2.readFixed64List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                            obj5 = obj3;
                            obj4 = obj2;
                        case 24:
                            obj2 = obj4;
                            reader2.readFixed32List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                            obj5 = obj3;
                            obj4 = obj2;
                        case 25:
                            obj2 = obj4;
                            reader2.readBoolList(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                            obj5 = obj3;
                            obj4 = obj2;
                        case 26:
                            obj2 = obj4;
                            try {
                                readStringList(obj2, typeAndOffsetAt, reader2);
                                obj5 = obj3;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                obj5 = obj3;
                                try {
                                    if (unknownFieldSchema.shouldDiscardUnknownFields(reader2)) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    while (i < this.repeatedFieldOffsetStart) {
                                    }
                                    if (obj5 != null) {
                                    }
                                    throw th;
                                }
                            }
                            obj4 = obj2;
                            break;
                        case 27:
                            obj2 = obj4;
                            try {
                                try {
                                    readMessageList(obj2, typeAndOffsetAt, reader2, getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite);
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    obj5 = obj3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj5 = obj3;
                                    for (i = this.checkInitializedCount; i < this.repeatedFieldOffsetStart; i++) {
                                        obj5 = filterMapUnknownEnumValues(obj2, this.intArray[i], obj5, unknownFieldSchema);
                                    }
                                    if (obj5 != null) {
                                        unknownFieldSchema.setBuilderToMessage(obj2, obj5);
                                    }
                                    throw th;
                                }
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                extensionRegistryLite2 = extensionRegistryLite;
                                obj5 = obj3;
                                if (unknownFieldSchema.shouldDiscardUnknownFields(reader2)) {
                                }
                            }
                            obj4 = obj2;
                            break;
                        case 28:
                            reader2.readBytesList(this.listFieldSchema.mutableListAt(obj4, offset(typeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 29:
                            reader2.readUInt32List(this.listFieldSchema.mutableListAt(obj4, offset(typeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 30:
                            List mutableListAt = this.listFieldSchema.mutableListAt(obj4, offset(typeAndOffsetAt));
                            reader2.readEnumList(mutableListAt);
                            getEnumFieldVerifier(positionForFieldNumber);
                            obj5 = SchemaUtil.filterUnknownEnumList(fieldNumber, mutableListAt, null, obj3, unknownFieldSchema);
                            extensionRegistryLite2 = extensionRegistryLite;
                            obj2 = obj4;
                            obj4 = obj2;
                        case 31:
                            reader2.readSFixed32List(this.listFieldSchema.mutableListAt(obj4, offset(typeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 32:
                            reader2.readSFixed64List(this.listFieldSchema.mutableListAt(obj4, offset(typeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 33:
                            reader2.readSInt32List(this.listFieldSchema.mutableListAt(obj4, offset(typeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 34:
                            reader2.readSInt64List(this.listFieldSchema.mutableListAt(obj4, offset(typeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 35:
                            reader2.readDoubleList(this.listFieldSchema.mutableListAt(obj4, offset(typeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 36:
                            reader2.readFloatList(this.listFieldSchema.mutableListAt(obj4, offset(typeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 37:
                            reader2.readInt64List(this.listFieldSchema.mutableListAt(obj4, offset(typeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 38:
                            reader2.readUInt64List(this.listFieldSchema.mutableListAt(obj4, offset(typeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 39:
                            reader2.readInt32List(this.listFieldSchema.mutableListAt(obj4, offset(typeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 40:
                            reader2.readFixed64List(this.listFieldSchema.mutableListAt(obj4, offset(typeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 41:
                            reader2.readFixed32List(this.listFieldSchema.mutableListAt(obj4, offset(typeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 42:
                            reader2.readBoolList(this.listFieldSchema.mutableListAt(obj4, offset(typeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 43:
                            reader2.readUInt32List(this.listFieldSchema.mutableListAt(obj4, offset(typeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 44:
                            List mutableListAt2 = this.listFieldSchema.mutableListAt(obj4, offset(typeAndOffsetAt));
                            reader2.readEnumList(mutableListAt2);
                            getEnumFieldVerifier(positionForFieldNumber);
                            obj5 = SchemaUtil.filterUnknownEnumList(fieldNumber, mutableListAt2, null, obj3, unknownFieldSchema);
                            extensionRegistryLite2 = extensionRegistryLite;
                            obj2 = obj4;
                            obj4 = obj2;
                        case 45:
                            reader2.readSFixed32List(this.listFieldSchema.mutableListAt(obj4, offset(typeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 46:
                            reader2.readSFixed64List(this.listFieldSchema.mutableListAt(obj4, offset(typeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 47:
                            reader2.readSInt32List(this.listFieldSchema.mutableListAt(obj4, offset(typeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 48:
                            try {
                                reader2.readSInt64List(this.listFieldSchema.mutableListAt(obj4, offset(typeAndOffsetAt)));
                                extensionRegistryLite2 = extensionRegistryLite;
                                obj2 = obj4;
                                obj5 = obj3;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                extensionRegistryLite2 = extensionRegistryLite;
                                obj2 = obj4;
                                obj5 = obj3;
                                if (unknownFieldSchema.shouldDiscardUnknownFields(reader2)) {
                                }
                            }
                            obj4 = obj2;
                            break;
                        case 49:
                            try {
                                obj2 = obj;
                            } catch (Throwable th3) {
                                th = th3;
                                obj4 = obj;
                                obj2 = obj4;
                                obj5 = obj3;
                                while (i < this.repeatedFieldOffsetStart) {
                                }
                                if (obj5 != null) {
                                }
                                throw th;
                            }
                            try {
                                readGroupList(obj2, offset(typeAndOffsetAt), reader, getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite);
                                obj4 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                obj2 = obj4;
                                obj5 = obj3;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                reader2 = reader;
                                obj5 = obj3;
                                extensionRegistryLite2 = extensionRegistryLite;
                                if (unknownFieldSchema.shouldDiscardUnknownFields(reader2)) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                obj5 = obj3;
                                while (i < this.repeatedFieldOffsetStart) {
                                }
                                if (obj5 != null) {
                                }
                                throw th;
                            }
                            obj4 = obj2;
                            break;
                        case 50:
                            try {
                                try {
                                    mergeMap(obj4, positionForFieldNumber, getMapFieldDefaultEntry(positionForFieldNumber), extensionRegistryLite2, reader);
                                    obj2 = obj;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    obj5 = obj3;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                    obj2 = obj;
                                    reader2 = reader;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    obj5 = obj3;
                                    if (unknownFieldSchema.shouldDiscardUnknownFields(reader2)) {
                                        if (obj5 == null) {
                                            obj5 = unknownFieldSchema.getBuilderFromMessage(obj2);
                                        }
                                        if (!unknownFieldSchema.mergeOneFieldFrom(obj5, reader2)) {
                                            for (int i2 = this.checkInitializedCount; i2 < this.repeatedFieldOffsetStart; i2++) {
                                                obj5 = filterMapUnknownEnumValues(obj2, this.intArray[i2], obj5, unknownFieldSchema);
                                            }
                                            if (obj5 == null) {
                                                return;
                                            }
                                            unknownFieldSchema.setBuilderToMessage(obj2, obj5);
                                        }
                                        obj4 = obj2;
                                    } else {
                                        if (!reader2.skipField()) {
                                            for (int i3 = this.checkInitializedCount; i3 < this.repeatedFieldOffsetStart; i3++) {
                                                obj5 = filterMapUnknownEnumValues(obj2, this.intArray[i3], obj5, unknownFieldSchema);
                                            }
                                            if (obj5 == null) {
                                                return;
                                            }
                                            unknownFieldSchema.setBuilderToMessage(obj2, obj5);
                                        }
                                        obj4 = obj2;
                                    }
                                }
                                obj4 = obj2;
                            } catch (Throwable th5) {
                                th = th5;
                                obj2 = obj;
                                obj5 = obj3;
                                while (i < this.repeatedFieldOffsetStart) {
                                }
                                if (obj5 != null) {
                                }
                                throw th;
                            }
                            break;
                        case 51:
                            UnsafeUtil.putObject(obj4, offset(typeAndOffsetAt), Double.valueOf(reader2.readDouble()));
                            setOneofPresent(obj4, fieldNumber, positionForFieldNumber);
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 52:
                            UnsafeUtil.putObject(obj4, offset(typeAndOffsetAt), Float.valueOf(reader2.readFloat()));
                            setOneofPresent(obj4, fieldNumber, positionForFieldNumber);
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 53:
                            UnsafeUtil.putObject(obj4, offset(typeAndOffsetAt), Long.valueOf(reader2.readInt64()));
                            setOneofPresent(obj4, fieldNumber, positionForFieldNumber);
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 54:
                            UnsafeUtil.putObject(obj4, offset(typeAndOffsetAt), Long.valueOf(reader2.readUInt64()));
                            setOneofPresent(obj4, fieldNumber, positionForFieldNumber);
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 55:
                            UnsafeUtil.putObject(obj4, offset(typeAndOffsetAt), Integer.valueOf(reader2.readInt32()));
                            setOneofPresent(obj4, fieldNumber, positionForFieldNumber);
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 56:
                            UnsafeUtil.putObject(obj4, offset(typeAndOffsetAt), Long.valueOf(reader2.readFixed64()));
                            setOneofPresent(obj4, fieldNumber, positionForFieldNumber);
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 57:
                            UnsafeUtil.putObject(obj4, offset(typeAndOffsetAt), Integer.valueOf(reader2.readFixed32()));
                            setOneofPresent(obj4, fieldNumber, positionForFieldNumber);
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 58:
                            UnsafeUtil.putObject(obj4, offset(typeAndOffsetAt), Boolean.valueOf(reader2.readBool()));
                            setOneofPresent(obj4, fieldNumber, positionForFieldNumber);
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 59:
                            readString(obj4, typeAndOffsetAt, reader2);
                            setOneofPresent(obj4, fieldNumber, positionForFieldNumber);
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 60:
                            if (isOneofPresent(obj4, fieldNumber, positionForFieldNumber)) {
                                UnsafeUtil.putObject(obj4, offset(typeAndOffsetAt), Internal.mergeMessage(UnsafeUtil.getObject(obj4, offset(typeAndOffsetAt)), reader2.readMessageBySchemaWithCheck(getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite2)));
                            } else {
                                UnsafeUtil.putObject(obj4, offset(typeAndOffsetAt), reader2.readMessageBySchemaWithCheck(getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite2));
                                setFieldPresent(obj4, positionForFieldNumber);
                            }
                            setOneofPresent(obj4, fieldNumber, positionForFieldNumber);
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 61:
                            UnsafeUtil.putObject(obj4, offset(typeAndOffsetAt), reader2.readBytes());
                            setOneofPresent(obj4, fieldNumber, positionForFieldNumber);
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 62:
                            UnsafeUtil.putObject(obj4, offset(typeAndOffsetAt), Integer.valueOf(reader2.readUInt32()));
                            setOneofPresent(obj4, fieldNumber, positionForFieldNumber);
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 63:
                            int readEnum2 = reader2.readEnum();
                            getEnumFieldVerifier(positionForFieldNumber);
                            UnsafeUtil.putObject(obj4, offset(typeAndOffsetAt), Integer.valueOf(readEnum2));
                            setOneofPresent(obj4, fieldNumber, positionForFieldNumber);
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 64:
                            UnsafeUtil.putObject(obj4, offset(typeAndOffsetAt), Integer.valueOf(reader2.readSFixed32()));
                            setOneofPresent(obj4, fieldNumber, positionForFieldNumber);
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 65:
                            UnsafeUtil.putObject(obj4, offset(typeAndOffsetAt), Long.valueOf(reader2.readSFixed64()));
                            setOneofPresent(obj4, fieldNumber, positionForFieldNumber);
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 66:
                            UnsafeUtil.putObject(obj4, offset(typeAndOffsetAt), Integer.valueOf(reader2.readSInt32()));
                            setOneofPresent(obj4, fieldNumber, positionForFieldNumber);
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 67:
                            UnsafeUtil.putObject(obj4, offset(typeAndOffsetAt), Long.valueOf(reader2.readSInt64()));
                            setOneofPresent(obj4, fieldNumber, positionForFieldNumber);
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        case 68:
                            UnsafeUtil.putObject(obj4, offset(typeAndOffsetAt), reader2.readGroupBySchemaWithCheck(getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite2));
                            setOneofPresent(obj4, fieldNumber, positionForFieldNumber);
                            obj2 = obj4;
                            obj5 = obj3;
                            obj4 = obj2;
                        default:
                            obj5 = obj3 == null ? unknownFieldSchema.newBuilder() : obj3;
                            try {
                                if (!unknownFieldSchema.mergeOneFieldFrom(obj5, reader2)) {
                                    for (int i4 = this.checkInitializedCount; i4 < this.repeatedFieldOffsetStart; i4++) {
                                        obj5 = filterMapUnknownEnumValues(obj4, this.intArray[i4], obj5, unknownFieldSchema);
                                    }
                                    if (obj5 == null) {
                                        return;
                                    }
                                }
                                obj2 = obj4;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                                obj2 = obj4;
                                if (unknownFieldSchema.shouldDiscardUnknownFields(reader2)) {
                                }
                            }
                            obj4 = obj2;
                            break;
                    }
                } else if (fieldNumber == Integer.MAX_VALUE) {
                    for (int i5 = this.checkInitializedCount; i5 < this.repeatedFieldOffsetStart; i5++) {
                        obj5 = filterMapUnknownEnumValues(obj4, this.intArray[i5], obj5, unknownFieldSchema);
                    }
                    if (obj5 == null) {
                        return;
                    }
                } else {
                    if (this.hasExtensions) {
                        extensionSchema2 = extensionSchema;
                        findExtensionByNumber = extensionSchema2.findExtensionByNumber(extensionRegistryLite2, this.defaultInstance, fieldNumber);
                    } else {
                        extensionSchema2 = extensionSchema;
                        findExtensionByNumber = null;
                    }
                    if (findExtensionByNumber != null) {
                        if (fieldSet == null) {
                            try {
                                fieldSet = extensionSchema.getMutableExtensions(obj);
                            } catch (Throwable th6) {
                                th = th6;
                                obj2 = obj4;
                                while (i < this.repeatedFieldOffsetStart) {
                                }
                                if (obj5 != null) {
                                }
                                throw th;
                            }
                        }
                        FieldSet fieldSet2 = fieldSet;
                        obj5 = extensionSchema2.parseExtension(reader, findExtensionByNumber, extensionRegistryLite2, fieldSet2, obj5, unknownFieldSchema);
                        fieldSet = fieldSet2;
                    } else {
                        obj3 = obj5;
                        try {
                            if (unknownFieldSchema.shouldDiscardUnknownFields(reader)) {
                                obj5 = obj3;
                                if (reader.skipField()) {
                                }
                            } else {
                                obj5 = obj3 == null ? unknownFieldSchema.getBuilderFromMessage(obj4) : obj3;
                                if (unknownFieldSchema.mergeOneFieldFrom(obj5, reader)) {
                                }
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            obj2 = obj4;
                            obj5 = obj3;
                            while (i < this.repeatedFieldOffsetStart) {
                            }
                            if (obj5 != null) {
                            }
                            throw th;
                        }
                    }
                }
            } catch (Throwable th8) {
                th = th8;
            }
        }
        unknownFieldSchema.setBuilderToMessage(obj2, obj5);
    }

    private Schema getMessageFieldSchema(int i) {
        int i2 = (i / 3) * 2;
        Schema schema = (Schema) this.objects[i2];
        if (schema != null) {
            return schema;
        }
        Schema schemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i2 + 1]);
        this.objects[i2] = schemaFor;
        return schemaFor;
    }

    private Object getMapFieldDefaultEntry(int i) {
        return this.objects[(i / 3) * 2];
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i) {
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(this.objects[((i / 3) * 2) + 1]);
        return null;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void makeImmutable(Object obj) {
        int i;
        int i2 = this.checkInitializedCount;
        while (true) {
            i = this.repeatedFieldOffsetStart;
            if (i2 >= i) {
                break;
            }
            long offset = offset(typeAndOffsetAt(this.intArray[i2]));
            Object object = UnsafeUtil.getObject(obj, offset);
            if (object != null) {
                UnsafeUtil.putObject(obj, offset, this.mapFieldSchema.toImmutable(object));
            }
            i2++;
        }
        int length = this.intArray.length;
        while (i < length) {
            this.listFieldSchema.makeImmutableListAt(obj, this.intArray[i]);
            i++;
        }
        this.unknownFieldSchema.makeImmutable(obj);
        if (this.hasExtensions) {
            this.extensionSchema.makeImmutable(obj);
        }
    }

    private final void mergeMap(Object obj, int i, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) {
        long offset = offset(typeAndOffsetAt(i));
        Object object = UnsafeUtil.getObject(obj, offset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            UnsafeUtil.putObject(obj, offset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object newMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            UnsafeUtil.putObject(obj, offset, newMapField);
            object = newMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    private final Object filterMapUnknownEnumValues(Object obj, int i, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        numberAt(i);
        if (UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i))) == null) {
            return obj2;
        }
        getEnumFieldVerifier(i);
        return obj2;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean isInitialized(Object obj) {
        int i;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < this.checkInitializedCount; i4++) {
            int i5 = this.intArray[i4];
            int numberAt = numberAt(i5);
            int typeAndOffsetAt = typeAndOffsetAt(i5);
            if (this.proto3) {
                i = 0;
            } else {
                int i6 = this.buffer[i5 + 2];
                int i7 = 1048575 & i6;
                i = 1 << (i6 >>> 20);
                if (i7 != i2) {
                    i3 = UNSAFE.getInt(obj, i7);
                    i2 = i7;
                }
            }
            if (isRequired(typeAndOffsetAt) && !isFieldPresent(obj, i5, i3, i)) {
                return false;
            }
            int type = type(typeAndOffsetAt);
            if (type == 9 || type == 17) {
                if (isFieldPresent(obj, i5, i3, i) && !isInitialized(obj, typeAndOffsetAt, getMessageFieldSchema(i5))) {
                    return false;
                }
            } else {
                if (type != 27) {
                    if (type == 60 || type == 68) {
                        if (isOneofPresent(obj, numberAt, i5) && !isInitialized(obj, typeAndOffsetAt, getMessageFieldSchema(i5))) {
                            return false;
                        }
                    } else if (type != 49) {
                        if (type == 50 && !isMapInitialized(obj, typeAndOffsetAt, i5)) {
                            return false;
                        }
                    }
                }
                if (!isListInitialized(obj, typeAndOffsetAt, i5)) {
                    return false;
                }
            }
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(obj).isInitialized();
    }

    private static boolean isInitialized(Object obj, int i, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i)));
    }

    private boolean isListInitialized(Object obj, int i, int i2) {
        List list = (List) UnsafeUtil.getObject(obj, offset(i));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!messageFieldSchema.isInitialized(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    private boolean isMapInitialized(Object obj, int i, int i2) {
        Map forMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(obj, offset(i)));
        if (forMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        Schema schema = null;
        for (Object obj2 : forMapData.values()) {
            if (schema == null) {
                schema = Protobuf.getInstance().schemaFor((Class) obj2.getClass());
            }
            if (!schema.isInitialized(obj2)) {
                return false;
            }
        }
        return true;
    }

    private void writeString(int i, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.writeString(i, (String) obj);
        } else {
            writer.writeBytes(i, (ByteString) obj);
        }
    }

    private void readString(Object obj, int i, Reader reader) {
        if (isEnforceUtf8(i)) {
            UnsafeUtil.putObject(obj, offset(i), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, offset(i), reader.readString());
        } else {
            UnsafeUtil.putObject(obj, offset(i), reader.readBytes());
        }
    }

    private void readStringList(Object obj, int i, Reader reader) {
        if (isEnforceUtf8(i)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i)));
        }
    }

    private void readMessageList(Object obj, int i, Reader reader, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i)), schema, extensionRegistryLite);
    }

    private void readGroupList(Object obj, long j, Reader reader, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j), schema, extensionRegistryLite);
    }

    private int numberAt(int i) {
        return this.buffer[i];
    }

    private int typeAndOffsetAt(int i) {
        return this.buffer[i + 1];
    }

    private int presenceMaskAndOffsetAt(int i) {
        return this.buffer[i + 2];
    }

    private static double doubleAt(Object obj, long j) {
        return UnsafeUtil.getDouble(obj, j);
    }

    private static float floatAt(Object obj, long j) {
        return UnsafeUtil.getFloat(obj, j);
    }

    private static int intAt(Object obj, long j) {
        return UnsafeUtil.getInt(obj, j);
    }

    private static long longAt(Object obj, long j) {
        return UnsafeUtil.getLong(obj, j);
    }

    private static boolean booleanAt(Object obj, long j) {
        return UnsafeUtil.getBoolean(obj, j);
    }

    private static double oneofDoubleAt(Object obj, long j) {
        return ((Double) UnsafeUtil.getObject(obj, j)).doubleValue();
    }

    private static float oneofFloatAt(Object obj, long j) {
        return ((Float) UnsafeUtil.getObject(obj, j)).floatValue();
    }

    private static int oneofIntAt(Object obj, long j) {
        return ((Integer) UnsafeUtil.getObject(obj, j)).intValue();
    }

    private static long oneofLongAt(Object obj, long j) {
        return ((Long) UnsafeUtil.getObject(obj, j)).longValue();
    }

    private static boolean oneofBooleanAt(Object obj, long j) {
        return ((Boolean) UnsafeUtil.getObject(obj, j)).booleanValue();
    }

    private boolean arePresentForEquals(Object obj, Object obj2, int i) {
        return isFieldPresent(obj, i) == isFieldPresent(obj2, i);
    }

    private boolean isFieldPresent(Object obj, int i, int i2, int i3) {
        if (this.proto3) {
            return isFieldPresent(obj, i);
        }
        return (i2 & i3) != 0;
    }

    private boolean isFieldPresent(Object obj, int i) {
        if (this.proto3) {
            int typeAndOffsetAt = typeAndOffsetAt(i);
            long offset = offset(typeAndOffsetAt);
            switch (type(typeAndOffsetAt)) {
                case 0:
                    return UnsafeUtil.getDouble(obj, offset) != 0.0d;
                case 1:
                    return UnsafeUtil.getFloat(obj, offset) != 0.0f;
                case 2:
                    return UnsafeUtil.getLong(obj, offset) != 0;
                case 3:
                    return UnsafeUtil.getLong(obj, offset) != 0;
                case 4:
                    return UnsafeUtil.getInt(obj, offset) != 0;
                case 5:
                    return UnsafeUtil.getLong(obj, offset) != 0;
                case 6:
                    return UnsafeUtil.getInt(obj, offset) != 0;
                case 7:
                    return UnsafeUtil.getBoolean(obj, offset);
                case 8:
                    Object object = UnsafeUtil.getObject(obj, offset);
                    if (object instanceof String) {
                        return !((String) object).isEmpty();
                    }
                    if (object instanceof ByteString) {
                        return !ByteString.EMPTY.equals(object);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return UnsafeUtil.getObject(obj, offset) != null;
                case 10:
                    return !ByteString.EMPTY.equals(UnsafeUtil.getObject(obj, offset));
                case 11:
                    return UnsafeUtil.getInt(obj, offset) != 0;
                case 12:
                    return UnsafeUtil.getInt(obj, offset) != 0;
                case 13:
                    return UnsafeUtil.getInt(obj, offset) != 0;
                case 14:
                    return UnsafeUtil.getLong(obj, offset) != 0;
                case 15:
                    return UnsafeUtil.getInt(obj, offset) != 0;
                case 16:
                    return UnsafeUtil.getLong(obj, offset) != 0;
                case 17:
                    return UnsafeUtil.getObject(obj, offset) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        return (UnsafeUtil.getInt(obj, (long) (presenceMaskAndOffsetAt & 1048575)) & (1 << (presenceMaskAndOffsetAt >>> 20))) != 0;
    }

    private void setFieldPresent(Object obj, int i) {
        if (this.proto3) {
            return;
        }
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = presenceMaskAndOffsetAt & 1048575;
        UnsafeUtil.putInt(obj, j, UnsafeUtil.getInt(obj, j) | (1 << (presenceMaskAndOffsetAt >>> 20)));
    }

    private boolean isOneofPresent(Object obj, int i, int i2) {
        return UnsafeUtil.getInt(obj, (long) (presenceMaskAndOffsetAt(i2) & 1048575)) == i;
    }

    private boolean isOneofCaseEqual(Object obj, Object obj2, int i) {
        long presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i) & 1048575;
        return UnsafeUtil.getInt(obj, presenceMaskAndOffsetAt) == UnsafeUtil.getInt(obj2, presenceMaskAndOffsetAt);
    }

    private void setOneofPresent(Object obj, int i, int i2) {
        UnsafeUtil.putInt(obj, presenceMaskAndOffsetAt(i2) & 1048575, i);
    }

    private int positionForFieldNumber(int i) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, 0);
    }

    private int slowPositionForFieldNumber(int i, int i2) {
        int length = (this.buffer.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int numberAt = numberAt(i4);
            if (i == numberAt) {
                return i4;
            }
            if (i < numberAt) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
