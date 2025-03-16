package com.google.firebase.sessions;

import android.os.Message;
import android.util.Log;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
final class SessionLifecycleClient$sendLifecycleEvents$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ List $messages;
    int label;
    final /* synthetic */ SessionLifecycleClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionLifecycleClient$sendLifecycleEvents$1(SessionLifecycleClient sessionLifecycleClient, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sessionLifecycleClient;
        this.$messages = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SessionLifecycleClient$sendLifecycleEvents$1(this.this$0, this.$messages, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SessionLifecycleClient$sendLifecycleEvents$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Message latestByCode;
        Message latestByCode2;
        List mutableListOf;
        List filterNotNull;
        List sortedWith;
        String str;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
            this.label = 1;
            obj = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Map map = (Map) obj;
        if (map.isEmpty()) {
            str = "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.";
        } else {
            Collection values = map.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    if (((SessionSubscriber) it.next()).isDataCollectionEnabled()) {
                        latestByCode = this.this$0.getLatestByCode(this.$messages, 2);
                        latestByCode2 = this.this$0.getLatestByCode(this.$messages, 1);
                        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(latestByCode, latestByCode2);
                        filterNotNull = CollectionsKt___CollectionsKt.filterNotNull(mutableListOf);
                        sortedWith = CollectionsKt___CollectionsKt.sortedWith(filterNotNull, new Comparator() { // from class: com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1$invokeSuspend$$inlined$sortedBy$1
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                int compareValues;
                                compareValues = ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((Message) obj2).getWhen()), Long.valueOf(((Message) obj3).getWhen()));
                                return compareValues;
                            }
                        });
                        SessionLifecycleClient sessionLifecycleClient = this.this$0;
                        Iterator it2 = sortedWith.iterator();
                        while (it2.hasNext()) {
                            sessionLifecycleClient.sendMessageToServer((Message) it2.next());
                        }
                        return Unit.INSTANCE;
                    }
                }
            }
            str = "Data Collection is disabled for all subscribers. Skipping this Event";
        }
        Log.d("SessionLifecycleClient", str);
        return Unit.INSTANCE;
    }
}
