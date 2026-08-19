package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class Protobuf {
    private static final Protobuf INSTANCE = new Protobuf();
    private final ConcurrentMap schemaCache = new ConcurrentHashMap();
    private final SchemaFactory schemaFactory = new ManifestSchemaFactory();

    public static Protobuf getInstance() {
        return INSTANCE;
    }

    public Schema schemaFor(Class cls) {
        Schema registerSchema;
        Internal.checkNotNull(cls, "messageType");
        Schema schema = (Schema) this.schemaCache.get(cls);
        return (schema != null || (registerSchema = registerSchema(cls, (schema = this.schemaFactory.createSchema(cls)))) == null) ? schema : registerSchema;
    }

    public Schema schemaFor(Object obj) {
        return schemaFor((Class) obj.getClass());
    }

    public Schema registerSchema(Class cls, Schema schema) {
        Internal.checkNotNull(cls, "messageType");
        Internal.checkNotNull(schema, "schema");
        return (Schema) this.schemaCache.putIfAbsent(cls, schema);
    }

    private Protobuf() {
    }
}
