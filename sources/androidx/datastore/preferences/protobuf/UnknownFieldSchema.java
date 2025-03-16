package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class UnknownFieldSchema {
    UnknownFieldSchema() {
    }

    abstract void addFixed32(Object obj, int i, int i2);

    abstract void addFixed64(Object obj, int i, long j);

    abstract void addGroup(Object obj, int i, Object obj2);

    abstract void addLengthDelimited(Object obj, int i, ByteString byteString);

    abstract void addVarint(Object obj, int i, long j);

    abstract Object getBuilderFromMessage(Object obj);

    abstract Object getFromMessage(Object obj);

    abstract int getSerializedSize(Object obj);

    abstract int getSerializedSizeAsMessageSet(Object obj);

    abstract void makeImmutable(Object obj);

    abstract Object merge(Object obj, Object obj2);

    final void mergeFrom(Object obj, Reader reader) {
        while (reader.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(obj, reader)) {
        }
    }

    final boolean mergeOneFieldFrom(Object obj, Reader reader) {
        int tag = reader.getTag();
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            addVarint(obj, tagFieldNumber, reader.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            addFixed64(obj, tagFieldNumber, reader.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            addLengthDelimited(obj, tagFieldNumber, reader.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            addFixed32(obj, tagFieldNumber, reader.readFixed32());
            return true;
        }
        Object newBuilder = newBuilder();
        int makeTag = WireFormat.makeTag(tagFieldNumber, 4);
        mergeFrom(newBuilder, reader);
        if (makeTag != reader.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        addGroup(obj, tagFieldNumber, toImmutable(newBuilder));
        return true;
    }

    abstract Object newBuilder();

    abstract void setBuilderToMessage(Object obj, Object obj2);

    abstract void setToMessage(Object obj, Object obj2);

    abstract boolean shouldDiscardUnknownFields(Reader reader);

    abstract Object toImmutable(Object obj);

    abstract void writeAsMessageSetTo(Object obj, Writer writer);

    abstract void writeTo(Object obj, Writer writer);
}
