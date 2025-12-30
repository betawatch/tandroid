package kotlinx.coroutines;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
/* synthetic */ class JobSupport$onAwaitInternal$2 extends FunctionReferenceImpl implements Function3 {
    public static final JobSupport$onAwaitInternal$2 INSTANCE = new JobSupport$onAwaitInternal$2();

    JobSupport$onAwaitInternal$2() {
        super(3, JobSupport.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(JobSupport jobSupport, Object obj, Object obj2) {
        Object onAwaitInternalProcessResFunc;
        onAwaitInternalProcessResFunc = jobSupport.onAwaitInternalProcessResFunc(obj, obj2);
        return onAwaitInternalProcessResFunc;
    }
}
