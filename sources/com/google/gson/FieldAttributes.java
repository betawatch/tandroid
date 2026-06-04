package com.google.gson;

import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public final class FieldAttributes {
    private final Field field;

    public FieldAttributes(Field field) {
        Objects.requireNonNull(field);
        this.field = field;
    }

    public String getName() {
        return this.field.getName();
    }

    public Type getDeclaredType() {
        return this.field.getGenericType();
    }

    public String toString() {
        return this.field.toString();
    }
}
