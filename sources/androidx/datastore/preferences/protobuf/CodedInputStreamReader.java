package androidx.datastore.preferences.protobuf;

import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.util.List;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* loaded from: classes.dex */
final class CodedInputStreamReader implements Reader {
    private int endGroupTag;
    private final CodedInputStream input;
    private int nextTag = 0;
    private int tag;

    public static CodedInputStreamReader forCodedInput(CodedInputStream codedInputStream) {
        CodedInputStreamReader codedInputStreamReader = codedInputStream.wrapper;
        return codedInputStreamReader != null ? codedInputStreamReader : new CodedInputStreamReader(codedInputStream);
    }

    private CodedInputStreamReader(CodedInputStream codedInputStream) {
        CodedInputStream codedInputStream2 = (CodedInputStream) Internal.checkNotNull(codedInputStream, "input");
        this.input = codedInputStream2;
        codedInputStream2.wrapper = this;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int getFieldNumber() {
        int i = this.nextTag;
        if (i != 0) {
            this.tag = i;
            this.nextTag = 0;
        } else {
            this.tag = this.input.readTag();
        }
        int i2 = this.tag;
        return (i2 == 0 || i2 == this.endGroupTag) ? ConnectionsManager.DEFAULT_DATACENTER_ID : WireFormat.getTagFieldNumber(i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int getTag() {
        return this.tag;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public boolean skipField() {
        int i;
        if (this.input.isAtEnd() || (i = this.tag) == this.endGroupTag) {
            return false;
        }
        return this.input.skipField(i);
    }

    private void requireWireType(int i) {
        if (WireFormat.getTagWireType(this.tag) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public double readDouble() {
        requireWireType(1);
        return this.input.readDouble();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public float readFloat() {
        requireWireType(5);
        return this.input.readFloat();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readUInt64() {
        requireWireType(0);
        return this.input.readUInt64();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readInt64() {
        requireWireType(0);
        return this.input.readInt64();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readInt32() {
        requireWireType(0);
        return this.input.readInt32();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readFixed64() {
        requireWireType(1);
        return this.input.readFixed64();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readFixed32() {
        requireWireType(5);
        return this.input.readFixed32();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public boolean readBool() {
        requireWireType(0);
        return this.input.readBool();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public String readString() {
        requireWireType(2);
        return this.input.readString();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public String readStringRequireUtf8() {
        requireWireType(2);
        return this.input.readStringRequireUtf8();
    }

    public Object readMessage(Class cls, ExtensionRegistryLite extensionRegistryLite) {
        requireWireType(2);
        return readMessage(Protobuf.getInstance().schemaFor(cls), extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public Object readMessageBySchemaWithCheck(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        requireWireType(2);
        return readMessage(schema, extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public Object readGroupBySchemaWithCheck(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        requireWireType(3);
        return readGroup(schema, extensionRegistryLite);
    }

    private Object readMessage(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int readUInt32 = this.input.readUInt32();
        CodedInputStream codedInputStream = this.input;
        if (codedInputStream.recursionDepth >= codedInputStream.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int pushLimit = codedInputStream.pushLimit(readUInt32);
        Object newInstance = schema.newInstance();
        this.input.recursionDepth++;
        schema.mergeFrom(newInstance, this, extensionRegistryLite);
        schema.makeImmutable(newInstance);
        this.input.checkLastTagWas(0);
        r5.recursionDepth--;
        this.input.popLimit(pushLimit);
        return newInstance;
    }

    private Object readGroup(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int i = this.endGroupTag;
        this.endGroupTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(this.tag), 4);
        try {
            Object newInstance = schema.newInstance();
            schema.mergeFrom(newInstance, this, extensionRegistryLite);
            schema.makeImmutable(newInstance);
            if (this.tag == this.endGroupTag) {
                return newInstance;
            }
            throw InvalidProtocolBufferException.parseFailure();
        } finally {
            this.endGroupTag = i;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public ByteString readBytes() {
        requireWireType(2);
        return this.input.readBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readUInt32() {
        requireWireType(0);
        return this.input.readUInt32();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readEnum() {
        requireWireType(0);
        return this.input.readEnum();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readSFixed32() {
        requireWireType(5);
        return this.input.readSFixed32();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readSFixed64() {
        requireWireType(1);
        return this.input.readSFixed64();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readSInt32() {
        requireWireType(0);
        return this.input.readSInt32();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readSInt64() {
        requireWireType(0);
        return this.input.readSInt64();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readDoubleList(List list) {
        int readTag;
        if (list instanceof DoubleArrayList) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 1) {
                this.input.readDouble();
                throw null;
            }
            if (tagWireType == 2) {
                verifyPackedFixed64Length(this.input.readUInt32());
                this.input.getTotalBytesRead();
                this.input.readDouble();
                throw null;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 1) {
            do {
                list.add(Double.valueOf(this.input.readDouble()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int readUInt32 = this.input.readUInt32();
            verifyPackedFixed64Length(readUInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
            do {
                list.add(Double.valueOf(this.input.readDouble()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readFloatList(List list) {
        int readTag;
        if (list instanceof FloatArrayList) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType != 2) {
                if (tagWireType == 5) {
                    this.input.readFloat();
                    throw null;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            verifyPackedFixed32Length(this.input.readUInt32());
            this.input.getTotalBytesRead();
            this.input.readFloat();
            throw null;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 2) {
            int readUInt32 = this.input.readUInt32();
            verifyPackedFixed32Length(readUInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
            do {
                list.add(Float.valueOf(this.input.readFloat()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        if (tagWireType2 == 5) {
            do {
                list.add(Float.valueOf(this.input.readFloat()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readUInt64List(List list) {
        int readTag;
        if (list instanceof LongArrayList) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                this.input.readUInt64();
                throw null;
            }
            if (tagWireType == 2) {
                this.input.readUInt32();
                this.input.getTotalBytesRead();
                this.input.readUInt64();
                throw null;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                list.add(Long.valueOf(this.input.readUInt64()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Long.valueOf(this.input.readUInt64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readInt64List(List list) {
        int readTag;
        if (list instanceof LongArrayList) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                this.input.readInt64();
                throw null;
            }
            if (tagWireType == 2) {
                this.input.readUInt32();
                this.input.getTotalBytesRead();
                this.input.readInt64();
                throw null;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                list.add(Long.valueOf(this.input.readInt64()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Long.valueOf(this.input.readInt64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readInt32List(List list) {
        int readTag;
        if (list instanceof IntArrayList) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                this.input.readInt32();
                throw null;
            }
            if (tagWireType == 2) {
                this.input.readUInt32();
                this.input.getTotalBytesRead();
                this.input.readInt32();
                throw null;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                list.add(Integer.valueOf(this.input.readInt32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Integer.valueOf(this.input.readInt32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readFixed64List(List list) {
        int readTag;
        if (list instanceof LongArrayList) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 1) {
                this.input.readFixed64();
                throw null;
            }
            if (tagWireType == 2) {
                verifyPackedFixed64Length(this.input.readUInt32());
                this.input.getTotalBytesRead();
                this.input.readFixed64();
                throw null;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 1) {
            do {
                list.add(Long.valueOf(this.input.readFixed64()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int readUInt32 = this.input.readUInt32();
            verifyPackedFixed64Length(readUInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
            do {
                list.add(Long.valueOf(this.input.readFixed64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readFixed32List(List list) {
        int readTag;
        if (list instanceof IntArrayList) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType != 2) {
                if (tagWireType == 5) {
                    this.input.readFixed32();
                    throw null;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            verifyPackedFixed32Length(this.input.readUInt32());
            this.input.getTotalBytesRead();
            this.input.readFixed32();
            throw null;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 2) {
            int readUInt32 = this.input.readUInt32();
            verifyPackedFixed32Length(readUInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
            do {
                list.add(Integer.valueOf(this.input.readFixed32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        if (tagWireType2 == 5) {
            do {
                list.add(Integer.valueOf(this.input.readFixed32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readBoolList(List list) {
        int readTag;
        if (list instanceof BooleanArrayList) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                this.input.readBool();
                throw null;
            }
            if (tagWireType == 2) {
                this.input.readUInt32();
                this.input.getTotalBytesRead();
                this.input.readBool();
                throw null;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                list.add(Boolean.valueOf(this.input.readBool()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Boolean.valueOf(this.input.readBool()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readStringList(List list) {
        readStringListInternal(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readStringListRequireUtf8(List list) {
        readStringListInternal(list, true);
    }

    public void readStringListInternal(List list, boolean z) {
        int readTag;
        int readTag2;
        if (WireFormat.getTagWireType(this.tag) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        if ((list instanceof LazyStringList) && !z) {
            LazyStringList lazyStringList = (LazyStringList) list;
            do {
                lazyStringList.add(readBytes());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        do {
            list.add(z ? readStringRequireUtf8() : readString());
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readMessageList(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int readTag;
        if (WireFormat.getTagWireType(this.tag) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.tag;
        do {
            list.add(readMessage(schema, extensionRegistryLite));
            if (this.input.isAtEnd() || this.nextTag != 0) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == i);
        this.nextTag = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readGroupList(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int readTag;
        if (WireFormat.getTagWireType(this.tag) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.tag;
        do {
            list.add(readGroup(schema, extensionRegistryLite));
            if (this.input.isAtEnd() || this.nextTag != 0) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == i);
        this.nextTag = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readBytesList(List list) {
        int readTag;
        if (WireFormat.getTagWireType(this.tag) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(readBytes());
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readUInt32List(List list) {
        int readTag;
        if (list instanceof IntArrayList) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                this.input.readUInt32();
                throw null;
            }
            if (tagWireType == 2) {
                this.input.readUInt32();
                this.input.getTotalBytesRead();
                this.input.readUInt32();
                throw null;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                list.add(Integer.valueOf(this.input.readUInt32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Integer.valueOf(this.input.readUInt32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readEnumList(List list) {
        int readTag;
        if (list instanceof IntArrayList) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                this.input.readEnum();
                throw null;
            }
            if (tagWireType == 2) {
                this.input.readUInt32();
                this.input.getTotalBytesRead();
                this.input.readEnum();
                throw null;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                list.add(Integer.valueOf(this.input.readEnum()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Integer.valueOf(this.input.readEnum()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readSFixed32List(List list) {
        int readTag;
        if (list instanceof IntArrayList) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType != 2) {
                if (tagWireType == 5) {
                    this.input.readSFixed32();
                    throw null;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            verifyPackedFixed32Length(this.input.readUInt32());
            this.input.getTotalBytesRead();
            this.input.readSFixed32();
            throw null;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 2) {
            int readUInt32 = this.input.readUInt32();
            verifyPackedFixed32Length(readUInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
            do {
                list.add(Integer.valueOf(this.input.readSFixed32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        if (tagWireType2 == 5) {
            do {
                list.add(Integer.valueOf(this.input.readSFixed32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readSFixed64List(List list) {
        int readTag;
        if (list instanceof LongArrayList) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 1) {
                this.input.readSFixed64();
                throw null;
            }
            if (tagWireType == 2) {
                verifyPackedFixed64Length(this.input.readUInt32());
                this.input.getTotalBytesRead();
                this.input.readSFixed64();
                throw null;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 1) {
            do {
                list.add(Long.valueOf(this.input.readSFixed64()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int readUInt32 = this.input.readUInt32();
            verifyPackedFixed64Length(readUInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
            do {
                list.add(Long.valueOf(this.input.readSFixed64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readSInt32List(List list) {
        int readTag;
        if (list instanceof IntArrayList) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                this.input.readSInt32();
                throw null;
            }
            if (tagWireType == 2) {
                this.input.readUInt32();
                this.input.getTotalBytesRead();
                this.input.readSInt32();
                throw null;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                list.add(Integer.valueOf(this.input.readSInt32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Integer.valueOf(this.input.readSInt32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readSInt64List(List list) {
        int readTag;
        if (list instanceof LongArrayList) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(list);
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                this.input.readSInt64();
                throw null;
            }
            if (tagWireType == 2) {
                this.input.readUInt32();
                this.input.getTotalBytesRead();
                this.input.readSInt64();
                throw null;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                list.add(Long.valueOf(this.input.readSInt64()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Long.valueOf(this.input.readSInt64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    private void verifyPackedFixed64Length(int i) {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        r7.input.popLimit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void readMap(Map map, MapEntryLite.Metadata metadata, ExtensionRegistryLite extensionRegistryLite) {
        requireWireType(2);
        int pushLimit = this.input.pushLimit(this.input.readUInt32());
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (true) {
            try {
                int fieldNumber = getFieldNumber();
                if (fieldNumber == Integer.MAX_VALUE || this.input.isAtEnd()) {
                    break;
                }
                if (fieldNumber == 1) {
                    obj = readField(metadata.keyType, null, null);
                } else if (fieldNumber == 2) {
                    obj2 = readField(metadata.valueType, metadata.defaultValue.getClass(), extensionRegistryLite);
                } else {
                    try {
                        if (!skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                }
            } catch (Throwable th) {
                this.input.popLimit(pushLimit);
                throw th;
            }
        }
    }

    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private Object readField(WireFormat.FieldType fieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) {
        switch (1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(readBool());
            case 2:
                return readBytes();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(readEnum());
            case 5:
                return Integer.valueOf(readFixed32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(readInt32());
            case 9:
                return Long.valueOf(readInt64());
            case 10:
                return readMessage(cls, extensionRegistryLite);
            case 11:
                return Integer.valueOf(readSFixed32());
            case 12:
                return Long.valueOf(readSFixed64());
            case 13:
                return Integer.valueOf(readSInt32());
            case 14:
                return Long.valueOf(readSInt64());
            case 15:
                return readStringRequireUtf8();
            case 16:
                return Integer.valueOf(readUInt32());
            case 17:
                return Long.valueOf(readUInt64());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private void verifyPackedFixed32Length(int i) {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    private void requirePosition(int i) {
        if (this.input.getTotalBytesRead() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }
}
