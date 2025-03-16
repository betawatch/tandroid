package androidx.datastore.core;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import org.telegram.tgnet.ConnectionsManager;

/* loaded from: classes.dex */
public final class SimpleActor {
    private final Function2 consumeMessage;
    private final Channel messageQueue;
    private final AtomicInteger remainingMessages;
    private final CoroutineScope scope;

    public SimpleActor(CoroutineScope scope, final Function1 onComplete, final Function2 onUndeliveredElement, Function2 consumeMessage) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.scope = scope;
        this.consumeMessage = consumeMessage;
        this.messageQueue = ChannelKt.Channel$default(ConnectionsManager.DEFAULT_DATACENTER_ID, null, null, 6, null);
        this.remainingMessages = new AtomicInteger(0);
        Job job = (Job) scope.getCoroutineContext().get(Job.Key);
        if (job == null) {
            return;
        }
        job.invokeOnCompletion(new Function1() { // from class: androidx.datastore.core.SimpleActor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Throwable th) {
                Unit unit;
                Function1.this.invoke(th);
                this.messageQueue.close(th);
                do {
                    Object obj = ChannelResult.getOrNull-impl(this.messageQueue.tryReceive-PtdJZtk());
                    if (obj == null) {
                        unit = null;
                    } else {
                        onUndeliveredElement.invoke(obj, th);
                        unit = Unit.INSTANCE;
                    }
                } while (unit != null);
            }
        });
    }

    public final void offer(Object obj) {
        Object obj2 = this.messageQueue.trySend-JP2dKIU(obj);
        if (obj2 instanceof ChannelResult.Closed) {
            Throwable th = ChannelResult.exceptionOrNull-impl(obj2);
            if (th != null) {
                throw th;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!ChannelResult.isSuccess-impl(obj2)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.remainingMessages.getAndIncrement() == 0) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SimpleActor$offer$2(this, null), 3, null);
        }
    }
}
