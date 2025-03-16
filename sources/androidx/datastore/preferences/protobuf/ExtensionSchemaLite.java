package androidx.datastore.preferences.protobuf;

import androidx.activity.result.ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.Map;

/* loaded from: classes.dex */
final class ExtensionSchemaLite extends ExtensionSchema {
    ExtensionSchemaLite() {
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    int extensionNumber(Map.Entry entry) {
        ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0.m(entry.getKey());
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    Object findExtensionByNumber(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i) {
        extensionRegistryLite.findLiteExtensionByNumber(messageLite, i);
        return null;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    FieldSet getExtensions(Object obj) {
        ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    FieldSet getMutableExtensions(Object obj) {
        ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    boolean hasExtensions(MessageLite messageLite) {
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    void makeImmutable(Object obj) {
        getExtensions(obj).makeImmutable();
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    Object parseExtension(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    void parseLengthPrefixedMessageSetItem(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    void parseMessageSetItem(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    void serializeExtension(Writer writer, Map.Entry entry) {
        ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0.m(entry.getKey());
        throw null;
    }
}
