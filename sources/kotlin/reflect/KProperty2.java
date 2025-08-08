package kotlin.reflect;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public interface KProperty2 extends KProperty, Function2 {

    public interface Getter extends KFunction, Function2 {
    }

    Object get(Object obj, Object obj2);

    Getter getGetter();
}
