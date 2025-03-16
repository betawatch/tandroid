package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public interface Flow {
    Object collect(FlowCollector flowCollector, Continuation continuation);
}
