package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* loaded from: classes3.dex */
public class ConflatedBufferedChannel extends BufferedChannel {
    private final int capacity;
    private final BufferOverflow onBufferOverflow;

    public ConflatedBufferedChannel(int i, BufferOverflow bufferOverflow, Function1 function1) {
        super(i, function1);
        this.capacity = i;
        this.onBufferOverflow = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.getOrCreateKotlinClass(BufferedChannel.class).getSimpleName() + " instead").toString());
        }
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected boolean isConflatedDropOldest() {
        return this.onBufferOverflow == BufferOverflow.DROP_OLDEST;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public Object trySend-JP2dKIU(Object obj) {
        return trySendImpl-Mj0NB7M(obj, false);
    }

    private final Object trySendImpl-Mj0NB7M(Object obj, boolean z) {
        return this.onBufferOverflow == BufferOverflow.DROP_LATEST ? trySendDropLatest-Mj0NB7M(obj, z) : trySendDropOldest-JP2dKIU(obj);
    }

    private final Object trySendDropLatest-Mj0NB7M(Object obj, boolean z) {
        Function1 function1;
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        Object obj2 = super.trySend-JP2dKIU(obj);
        if (ChannelResult.isSuccess-impl(obj2) || ChannelResult.isClosed-impl(obj2)) {
            return obj2;
        }
        if (z && (function1 = this.onUndeliveredElement) != null && (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, obj, null, 2, null)) != null) {
            throw callUndeliveredElementCatchingException$default;
        }
        return ChannelResult.Companion.success-JP2dKIU(Unit.INSTANCE);
    }
}
