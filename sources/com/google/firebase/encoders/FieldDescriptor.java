package com.google.firebase.encoders;

import j$.util.DesugarCollections;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class FieldDescriptor {
    private final String name;
    private final Map properties;

    private FieldDescriptor(String str, Map map) {
        this.name = str;
        this.properties = map;
    }

    public String getName() {
        return this.name;
    }

    public Annotation getProperty(Class cls) {
        return (Annotation) this.properties.get(cls);
    }

    public static FieldDescriptor of(String str) {
        return new FieldDescriptor(str, Collections.EMPTY_MAP);
    }

    public static Builder builder(String str) {
        return new Builder(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldDescriptor)) {
            return false;
        }
        FieldDescriptor fieldDescriptor = (FieldDescriptor) obj;
        return this.name.equals(fieldDescriptor.name) && this.properties.equals(fieldDescriptor.properties);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.properties.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.name + ", properties=" + this.properties.values() + "}";
    }

    public static final class Builder {
        private final String name;
        private Map properties = null;

        Builder(String str) {
            this.name = str;
        }

        public Builder withProperty(Annotation annotation) {
            if (this.properties == null) {
                this.properties = new HashMap();
            }
            this.properties.put(annotation.annotationType(), annotation);
            return this;
        }

        public FieldDescriptor build() {
            Map unmodifiableMap;
            String str = this.name;
            if (this.properties == null) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = DesugarCollections.unmodifiableMap(new HashMap(this.properties));
            }
            return new FieldDescriptor(str, unmodifiableMap);
        }
    }
}
