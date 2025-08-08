package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class ExtensionRegistryFactory {
    static final Class EXTENSION_REGISTRY_CLASS = reflectExtensionRegistry();

    static Class reflectExtensionRegistry() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static ExtensionRegistryLite createEmpty() {
        if (EXTENSION_REGISTRY_CLASS != null) {
            try {
                return invokeSubclassFactory("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return ExtensionRegistryLite.EMPTY_REGISTRY_LITE;
    }

    private static final ExtensionRegistryLite invokeSubclassFactory(String str) {
        return (ExtensionRegistryLite) EXTENSION_REGISTRY_CLASS.getDeclaredMethod(str, null).invoke(null, null);
    }
}
