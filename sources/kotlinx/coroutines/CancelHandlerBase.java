package kotlinx.coroutines;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class CancelHandlerBase implements Function1 {
    public abstract void invoke(Throwable th);
}
