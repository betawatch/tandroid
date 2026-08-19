package kotlin.collections;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequenceScope;

/* loaded from: classes3.dex */
final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements Function2 {
    final /* synthetic */ Iterator $iterator;
    final /* synthetic */ boolean $partialWindows;
    final /* synthetic */ boolean $reuseBuffer;
    final /* synthetic */ int $size;
    final /* synthetic */ int $step;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlidingWindowKt$windowedIterator$1(int i, int i2, Iterator it, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.$size = i;
        this.$step = i2;
        this.$iterator = it;
        this.$reuseBuffer = z;
        this.$partialWindows = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, continuation);
        slidingWindowKt$windowedIterator$1.L$0 = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope sequenceScope, Continuation continuation) {
        return ((SlidingWindowKt$windowedIterator$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0147, code lost:
    
        if (r4.yield(r11, r10) == r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0162, code lost:
    
        if (r4.yield(r1, r10) == r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0119, code lost:
    
        if (r6.yield(r11, r10) == r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0094, code lost:
    
        r10.L$0 = r4;
        r10.L$1 = r3;
        r10.L$2 = r2;
        r10.I$0 = r1;
        r10.label = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r4.yield(r3, r10) != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00d6, code lost:
    
        if (r4.yield(r3, r10) == r0) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0147 -> B:12:0x014a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0119 -> B:29:0x011c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00a2 -> B:48:0x0055). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RingBuffer ringBuffer;
        Iterator it;
        SequenceScope sequenceScope;
        SequenceScope sequenceScope2;
        ArrayList arrayList;
        int i;
        Iterator it2;
        int i2;
        RingBuffer ringBuffer2;
        SequenceScope sequenceScope3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            SequenceScope sequenceScope4 = (SequenceScope) this.L$0;
            int coerceAtMost = RangesKt.coerceAtMost(this.$size, 1024);
            int i4 = this.$step - this.$size;
            if (i4 >= 0) {
                sequenceScope2 = sequenceScope4;
                arrayList = new ArrayList(coerceAtMost);
                i = 0;
                it2 = this.$iterator;
                i2 = i4;
                while (true) {
                    if (!it2.hasNext()) {
                    }
                }
                return Unit.INSTANCE;
            }
            ringBuffer = new RingBuffer(coerceAtMost);
            it = this.$iterator;
            sequenceScope = sequenceScope4;
            while (it.hasNext()) {
            }
            if (this.$partialWindows) {
            }
            return Unit.INSTANCE;
        }
        if (i3 == 1) {
            i2 = this.I$0;
            it2 = (Iterator) this.L$2;
            arrayList = (ArrayList) this.L$1;
            sequenceScope2 = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            i = i2;
            if (this.$reuseBuffer) {
                arrayList.clear();
            } else {
                arrayList = new ArrayList(this.$size);
            }
            i2 = i;
            while (true) {
                if (!it2.hasNext()) {
                    Object next = it2.next();
                    if (i > 0) {
                        i--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == this.$size) {
                            break;
                        }
                    }
                } else if (!arrayList.isEmpty() && (this.$partialWindows || arrayList.size() == this.$size)) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                }
            }
            return Unit.INSTANCE;
        }
        if (i3 != 2) {
            if (i3 == 3) {
                it = (Iterator) this.L$2;
                ringBuffer = (RingBuffer) this.L$1;
                sequenceScope = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                ringBuffer.removeFirst(this.$step);
                while (it.hasNext()) {
                    ringBuffer.add(it.next());
                    if (ringBuffer.isFull()) {
                        int size = ringBuffer.size();
                        int i5 = this.$size;
                        if (size >= i5) {
                            Object arrayList2 = this.$reuseBuffer ? ringBuffer : new ArrayList(ringBuffer);
                            this.L$0 = sequenceScope;
                            this.L$1 = ringBuffer;
                            this.L$2 = it;
                            this.label = 3;
                        } else {
                            ringBuffer = ringBuffer.expanded(i5);
                        }
                    }
                }
                if (this.$partialWindows) {
                    ringBuffer2 = ringBuffer;
                    sequenceScope3 = sequenceScope;
                    if (ringBuffer2.size() > this.$step) {
                    }
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            if (i3 == 4) {
                ringBuffer2 = (RingBuffer) this.L$1;
                sequenceScope3 = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                ringBuffer2.removeFirst(this.$step);
                if (ringBuffer2.size() > this.$step) {
                    Object arrayList3 = this.$reuseBuffer ? ringBuffer2 : new ArrayList(ringBuffer2);
                    this.L$0 = sequenceScope3;
                    this.L$1 = ringBuffer2;
                    this.L$2 = null;
                    this.label = 4;
                } else {
                    if (!ringBuffer2.isEmpty()) {
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                    }
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            if (i3 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
