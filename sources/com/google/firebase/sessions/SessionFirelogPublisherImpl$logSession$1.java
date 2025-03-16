package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
final class SessionFirelogPublisherImpl$logSession$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ SessionDetails $sessionDetails;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ SessionFirelogPublisherImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionFirelogPublisherImpl$logSession$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, SessionDetails sessionDetails, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sessionFirelogPublisherImpl;
        this.$sessionDetails = sessionDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SessionFirelogPublisherImpl$logSession$1(this.this$0, this.$sessionDetails, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SessionFirelogPublisherImpl$logSession$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        FirebaseApp firebaseApp;
        SessionDetails sessionDetails;
        SessionsSettings sessionsSettings;
        FirebaseApp firebaseApp2;
        FirebaseApp firebaseApp3;
        SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
        ProcessDetails processDetails;
        SessionEvents sessionEvents;
        List list;
        FirebaseApp firebaseApp4;
        SessionsSettings sessionsSettings2;
        Object firebaseInstallationId;
        SessionEvents sessionEvents2;
        Map map;
        SessionDetails sessionDetails2;
        List list2;
        FirebaseApp firebaseApp5;
        ProcessDetails processDetails2;
        SessionsSettings sessionsSettings3;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SessionFirelogPublisherImpl sessionFirelogPublisherImpl2 = this.this$0;
            this.label = 1;
            obj = sessionFirelogPublisherImpl2.shouldLogSession(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Map map2 = (Map) this.L$7;
                    List list3 = (List) this.L$6;
                    ProcessDetails processDetails3 = (ProcessDetails) this.L$5;
                    sessionsSettings3 = (SessionsSettings) this.L$4;
                    SessionDetails sessionDetails3 = (SessionDetails) this.L$3;
                    FirebaseApp firebaseApp6 = (FirebaseApp) this.L$2;
                    SessionEvents sessionEvents3 = (SessionEvents) this.L$1;
                    SessionFirelogPublisherImpl sessionFirelogPublisherImpl3 = (SessionFirelogPublisherImpl) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    sessionFirelogPublisherImpl = sessionFirelogPublisherImpl3;
                    map = map2;
                    sessionEvents2 = sessionEvents3;
                    list2 = list3;
                    firebaseApp5 = firebaseApp6;
                    processDetails2 = processDetails3;
                    sessionDetails2 = sessionDetails3;
                    Intrinsics.checkNotNullExpressionValue(obj, "getFirebaseInstallationId()");
                    sessionFirelogPublisherImpl.attemptLoggingSessionEvent(sessionEvents2.buildSession(firebaseApp5, sessionDetails2, sessionsSettings3, processDetails2, list2, map, (String) obj));
                    return Unit.INSTANCE;
                }
                list = (List) this.L$6;
                processDetails = (ProcessDetails) this.L$5;
                sessionsSettings2 = (SessionsSettings) this.L$4;
                sessionDetails = (SessionDetails) this.L$3;
                firebaseApp4 = (FirebaseApp) this.L$2;
                sessionEvents = (SessionEvents) this.L$1;
                sessionFirelogPublisherImpl = (SessionFirelogPublisherImpl) this.L$0;
                ResultKt.throwOnFailure(obj);
                Map map3 = (Map) obj;
                SessionFirelogPublisherImpl sessionFirelogPublisherImpl4 = this.this$0;
                this.L$0 = sessionFirelogPublisherImpl;
                this.L$1 = sessionEvents;
                this.L$2 = firebaseApp4;
                this.L$3 = sessionDetails;
                this.L$4 = sessionsSettings2;
                this.L$5 = processDetails;
                this.L$6 = list;
                this.L$7 = map3;
                this.label = 3;
                firebaseInstallationId = sessionFirelogPublisherImpl4.getFirebaseInstallationId(this);
                if (firebaseInstallationId != coroutine_suspended) {
                    return coroutine_suspended;
                }
                sessionEvents2 = sessionEvents;
                FirebaseApp firebaseApp7 = firebaseApp4;
                map = map3;
                obj = firebaseInstallationId;
                sessionDetails2 = sessionDetails;
                list2 = list;
                firebaseApp5 = firebaseApp7;
                SessionsSettings sessionsSettings4 = sessionsSettings2;
                processDetails2 = processDetails;
                sessionsSettings3 = sessionsSettings4;
                Intrinsics.checkNotNullExpressionValue(obj, "getFirebaseInstallationId()");
                sessionFirelogPublisherImpl.attemptLoggingSessionEvent(sessionEvents2.buildSession(firebaseApp5, sessionDetails2, sessionsSettings3, processDetails2, list2, map, (String) obj));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            SessionFirelogPublisherImpl sessionFirelogPublisherImpl5 = this.this$0;
            SessionEvents sessionEvents4 = SessionEvents.INSTANCE;
            firebaseApp = sessionFirelogPublisherImpl5.firebaseApp;
            sessionDetails = this.$sessionDetails;
            sessionsSettings = this.this$0.sessionSettings;
            ProcessDetailsProvider processDetailsProvider = ProcessDetailsProvider.INSTANCE;
            firebaseApp2 = this.this$0.firebaseApp;
            Context applicationContext = firebaseApp2.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "firebaseApp.applicationContext");
            ProcessDetails currentProcessDetails = processDetailsProvider.getCurrentProcessDetails(applicationContext);
            firebaseApp3 = this.this$0.firebaseApp;
            Context applicationContext2 = firebaseApp3.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "firebaseApp.applicationContext");
            List appProcessDetails = processDetailsProvider.getAppProcessDetails(applicationContext2);
            FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
            this.L$0 = sessionFirelogPublisherImpl5;
            this.L$1 = sessionEvents4;
            this.L$2 = firebaseApp;
            this.L$3 = sessionDetails;
            this.L$4 = sessionsSettings;
            this.L$5 = currentProcessDetails;
            this.L$6 = appProcessDetails;
            this.label = 2;
            Object registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
            if (registeredSubscribers$com_google_firebase_firebase_sessions == coroutine_suspended) {
                return coroutine_suspended;
            }
            sessionFirelogPublisherImpl = sessionFirelogPublisherImpl5;
            obj = registeredSubscribers$com_google_firebase_firebase_sessions;
            processDetails = currentProcessDetails;
            sessionEvents = sessionEvents4;
            list = appProcessDetails;
            firebaseApp4 = firebaseApp;
            sessionsSettings2 = sessionsSettings;
            Map map32 = (Map) obj;
            SessionFirelogPublisherImpl sessionFirelogPublisherImpl42 = this.this$0;
            this.L$0 = sessionFirelogPublisherImpl;
            this.L$1 = sessionEvents;
            this.L$2 = firebaseApp4;
            this.L$3 = sessionDetails;
            this.L$4 = sessionsSettings2;
            this.L$5 = processDetails;
            this.L$6 = list;
            this.L$7 = map32;
            this.label = 3;
            firebaseInstallationId = sessionFirelogPublisherImpl42.getFirebaseInstallationId(this);
            if (firebaseInstallationId != coroutine_suspended) {
            }
        }
        return Unit.INSTANCE;
    }
}
