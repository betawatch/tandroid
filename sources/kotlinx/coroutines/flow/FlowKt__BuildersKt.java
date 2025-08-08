package kotlinx.coroutines.flow;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
abstract /* synthetic */ class FlowKt__BuildersKt {
    public static final Flow flow(Function2 function2) {
        return new SafeFlow(function2);
    }
}
