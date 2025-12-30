package kotlin.reflect;

import kotlin.Function;

/* loaded from: classes3.dex */
public interface KFunction extends KCallable, Function {
    boolean isExternal();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();
}
