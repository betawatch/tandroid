package com.google.firebase.sessions;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class SessionDatastoreImpl implements SessionDatastore {
    private static final Companion Companion = new Companion(null);
    private static final ReadOnlyProperty dataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default(SessionDataStoreConfigs.INSTANCE.getSESSIONS_CONFIG_NAME(), null, null, null, 14, null);
    private final CoroutineContext backgroundDispatcher;
    private final Context context;
    private final AtomicReference currentSessionFromDatastore;
    private final Flow firebaseSessionDataFlow;

    public SessionDatastoreImpl(Context context, CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.context = context;
        this.backgroundDispatcher = backgroundDispatcher;
        this.currentSessionFromDatastore = new AtomicReference();
        final Flow flow = FlowKt.catch(Companion.getDataStore(context).getData(), new SessionDatastoreImpl$firebaseSessionDataFlow$1(null));
        this.firebaseSessionDataFlow = new Flow() { // from class: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1

            public static final class 2 implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ SessionDatastoreImpl this$0;

                public static final class 1 extends ContinuationImpl {
                    int label;
                    /* synthetic */ Object result;

                    public 1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= TLObject.FLAG_31;
                        return 2.this.emit(null, this);
                    }
                }

                public 2(FlowCollector flowCollector, SessionDatastoreImpl sessionDatastoreImpl) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = sessionDatastoreImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    1 r0;
                    int i;
                    FirebaseSessionsData mapSessionsData;
                    if (continuation instanceof 1) {
                        r0 = (1) continuation;
                        int i2 = r0.label;
                        if ((i2 & TLObject.FLAG_31) != 0) {
                            r0.label = i2 - TLObject.FLAG_31;
                            Object obj2 = r0.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = r0.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                mapSessionsData = this.this$0.mapSessionsData((Preferences) obj);
                                r0.label = 1;
                                if (flowCollector.emit(mapSessionsData, r0) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    r0 = new 1(continuation);
                    Object obj22 = r0.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = r0.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new 2(flowCollector, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(backgroundDispatcher), null, null, new 1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class FirebaseSessionDataKeys {
        public static final FirebaseSessionDataKeys INSTANCE = new FirebaseSessionDataKeys();
        private static final Preferences.Key SESSION_ID = PreferencesKeys.stringKey("session_id");

        private FirebaseSessionDataKeys() {
        }

        public final Preferences.Key getSESSION_ID() {
            return SESSION_ID;
        }
    }

    static final class 1 extends SuspendLambda implements Function2 {
        int label;

        1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return SessionDatastoreImpl.this.new 1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = SessionDatastoreImpl.this.firebaseSessionDataFlow;
                final SessionDatastoreImpl sessionDatastoreImpl = SessionDatastoreImpl.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.google.firebase.sessions.SessionDatastoreImpl.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(FirebaseSessionsData firebaseSessionsData, Continuation continuation) {
                        SessionDatastoreImpl.this.currentSessionFromDatastore.set(firebaseSessionsData);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.google.firebase.sessions.SessionDatastore
    public void updateSessionId(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.backgroundDispatcher), null, null, new SessionDatastoreImpl$updateSessionId$1(this, sessionId, null), 3, null);
    }

    @Override // com.google.firebase.sessions.SessionDatastore
    public String getCurrentSessionId() {
        FirebaseSessionsData firebaseSessionsData = (FirebaseSessionsData) this.currentSessionFromDatastore.get();
        if (firebaseSessionsData != null) {
            return firebaseSessionsData.getSessionId();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FirebaseSessionsData mapSessionsData(Preferences preferences) {
        return new FirebaseSessionsData((String) preferences.get(FirebaseSessionDataKeys.INSTANCE.getSESSION_ID()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class Companion {
        static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property2(new PropertyReference2Impl(Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DataStore getDataStore(Context context) {
            return (DataStore) SessionDatastoreImpl.dataStore$delegate.getValue(context, $$delegatedProperties[0]);
        }
    }
}
