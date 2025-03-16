package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
abstract class ExtensionSchema {
    ExtensionSchema() {
    }

    abstract int extensionNumber(Map.Entry entry);

    abstract Object findExtensionByNumber(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i);

    abstract FieldSet getExtensions(Object obj);

    abstract FieldSet getMutableExtensions(Object obj);

    abstract boolean hasExtensions(MessageLite messageLite);

    abstract void makeImmutable(Object obj);

    abstract Object parseExtension(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet, Object obj2, UnknownFieldSchema unknownFieldSchema);

    abstract void parseLengthPrefixedMessageSetItem(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet);

    abstract void parseMessageSetItem(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet);

    abstract void serializeExtension(Writer writer, Map.Entry entry);
}
