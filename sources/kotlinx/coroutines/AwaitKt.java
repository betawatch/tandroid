package kotlinx.coroutines;

import java.util.Collection;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import org.telegram.tgnet.TLObject;

/* loaded from: classes3.dex */
public abstract class AwaitKt {
    public static final Object awaitAll(Deferred[] deferredArr, Continuation continuation) {
        return deferredArr.length == 0 ? CollectionsKt.emptyList() : new AwaitAll(deferredArr).await(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:10:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object joinAll(Job[] jobArr, Continuation continuation) {
        AwaitKt$joinAll$1 awaitKt$joinAll$1;
        int i;
        int i2;
        Job[] jobArr2;
        int length;
        if (continuation instanceof AwaitKt$joinAll$1) {
            awaitKt$joinAll$1 = (AwaitKt$joinAll$1) continuation;
            int i3 = awaitKt$joinAll$1.label;
            if ((i3 & TLObject.FLAG_31) != 0) {
                awaitKt$joinAll$1.label = i3 - TLObject.FLAG_31;
                Object obj = awaitKt$joinAll$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = awaitKt$joinAll$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    i2 = 0;
                    jobArr2 = jobArr;
                    length = jobArr.length;
                    if (i2 < length) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = awaitKt$joinAll$1.I$1;
                    i2 = awaitKt$joinAll$1.I$0;
                    Job[] jobArr3 = (Job[]) awaitKt$joinAll$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    jobArr2 = jobArr3;
                    i2++;
                    if (i2 < length) {
                        Job job = jobArr2[i2];
                        awaitKt$joinAll$1.L$0 = jobArr2;
                        awaitKt$joinAll$1.I$0 = i2;
                        awaitKt$joinAll$1.I$1 = length;
                        awaitKt$joinAll$1.label = 1;
                        if (job.join(awaitKt$joinAll$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i2++;
                        if (i2 < length) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        awaitKt$joinAll$1 = new AwaitKt$joinAll$1(continuation);
        Object obj2 = awaitKt$joinAll$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = awaitKt$joinAll$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object joinAll(Collection collection, Continuation continuation) {
        AwaitKt$joinAll$3 awaitKt$joinAll$3;
        int i;
        Iterator it;
        if (continuation instanceof AwaitKt$joinAll$3) {
            awaitKt$joinAll$3 = (AwaitKt$joinAll$3) continuation;
            int i2 = awaitKt$joinAll$3.label;
            if ((i2 & TLObject.FLAG_31) != 0) {
                awaitKt$joinAll$3.label = i2 - TLObject.FLAG_31;
                Object obj = awaitKt$joinAll$3.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = awaitKt$joinAll$3.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    it = collection.iterator();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) awaitKt$joinAll$3.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    Job job = (Job) it.next();
                    awaitKt$joinAll$3.L$0 = it;
                    awaitKt$joinAll$3.label = 1;
                    if (job.join(awaitKt$joinAll$3) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        awaitKt$joinAll$3 = new AwaitKt$joinAll$3(continuation);
        Object obj2 = awaitKt$joinAll$3.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = awaitKt$joinAll$3.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
