package com.google.gson.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface Expose {
    boolean deserialize() default true;

    boolean serialize() default true;
}
