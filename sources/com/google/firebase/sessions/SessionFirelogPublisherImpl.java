package com.google.firebase.sessions;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.tasks.TasksKt;
import org.telegram.tgnet.TLObject;

/* loaded from: classes3.dex */
public final class SessionFirelogPublisherImpl implements SessionFirelogPublisher {
    public static final Companion Companion = new Companion(null);
    private static final double randomValueForSampling = Math.random();
    private final CoroutineContext backgroundDispatcher;
    private final EventGDTLoggerInterface eventGDTLogger;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final SessionsSettings sessionSettings;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SessionFirelogPublisherImpl(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallations, SessionsSettings sessionSettings, EventGDTLoggerInterface eventGDTLogger, CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(firebaseInstallations, "firebaseInstallations");
        Intrinsics.checkNotNullParameter(sessionSettings, "sessionSettings");
        Intrinsics.checkNotNullParameter(eventGDTLogger, "eventGDTLogger");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallations;
        this.sessionSettings = sessionSettings;
        this.eventGDTLogger = eventGDTLogger;
        this.backgroundDispatcher = backgroundDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attemptLoggingSessionEvent(SessionEvent sessionEvent) {
        try {
            this.eventGDTLogger.log(sessionEvent);
            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: " + sessionEvent.getSessionData().getSessionId());
        } catch (RuntimeException e) {
            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getFirebaseInstallationId(Continuation continuation) {
        SessionFirelogPublisherImpl$getFirebaseInstallationId$1 sessionFirelogPublisherImpl$getFirebaseInstallationId$1;
        Object coroutine_suspended;
        int i;
        try {
            if (continuation instanceof SessionFirelogPublisherImpl$getFirebaseInstallationId$1) {
                sessionFirelogPublisherImpl$getFirebaseInstallationId$1 = (SessionFirelogPublisherImpl$getFirebaseInstallationId$1) continuation;
                int i2 = sessionFirelogPublisherImpl$getFirebaseInstallationId$1.label;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    sessionFirelogPublisherImpl$getFirebaseInstallationId$1.label = i2 - TLObject.FLAG_31;
                    Object obj = sessionFirelogPublisherImpl$getFirebaseInstallationId$1.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = sessionFirelogPublisherImpl$getFirebaseInstallationId$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Task id = this.firebaseInstallations.getId();
                        Intrinsics.checkNotNullExpressionValue(id, "firebaseInstallations.id");
                        sessionFirelogPublisherImpl$getFirebaseInstallationId$1.label = 1;
                        obj = TasksKt.await(id, sessionFirelogPublisherImpl$getFirebaseInstallationId$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return (String) obj;
                }
            }
            if (i != 0) {
            }
            return (String) obj;
        } catch (Exception e) {
            Log.e("SessionFirelogPublisher", "Error getting Firebase Installation ID. Using an empty ID", e);
            return "";
        }
        sessionFirelogPublisherImpl$getFirebaseInstallationId$1 = new SessionFirelogPublisherImpl$getFirebaseInstallationId$1(this, continuation);
        Object obj2 = sessionFirelogPublisherImpl$getFirebaseInstallationId$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionFirelogPublisherImpl$getFirebaseInstallationId$1.label;
    }

    private final boolean shouldCollectEvents() {
        return randomValueForSampling <= this.sessionSettings.getSamplingRate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object shouldLogSession(Continuation continuation) {
        SessionFirelogPublisherImpl$shouldLogSession$1 sessionFirelogPublisherImpl$shouldLogSession$1;
        Object coroutine_suspended;
        int i;
        SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
        String str;
        if (continuation instanceof SessionFirelogPublisherImpl$shouldLogSession$1) {
            sessionFirelogPublisherImpl$shouldLogSession$1 = (SessionFirelogPublisherImpl$shouldLogSession$1) continuation;
            int i2 = sessionFirelogPublisherImpl$shouldLogSession$1.label;
            if ((i2 & TLObject.FLAG_31) != 0) {
                sessionFirelogPublisherImpl$shouldLogSession$1.label = i2 - TLObject.FLAG_31;
                Object obj = sessionFirelogPublisherImpl$shouldLogSession$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sessionFirelogPublisherImpl$shouldLogSession$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Log.d("SessionFirelogPublisher", "Data Collection is enabled for at least one Subscriber");
                    SessionsSettings sessionsSettings = this.sessionSettings;
                    sessionFirelogPublisherImpl$shouldLogSession$1.L$0 = this;
                    sessionFirelogPublisherImpl$shouldLogSession$1.label = 1;
                    if (sessionsSettings.updateSettings(sessionFirelogPublisherImpl$shouldLogSession$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sessionFirelogPublisherImpl = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sessionFirelogPublisherImpl = (SessionFirelogPublisherImpl) sessionFirelogPublisherImpl$shouldLogSession$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (sessionFirelogPublisherImpl.sessionSettings.getSessionsEnabled()) {
                    str = "Sessions SDK disabled. Events will not be sent.";
                } else {
                    if (sessionFirelogPublisherImpl.shouldCollectEvents()) {
                        return Boxing.boxBoolean(true);
                    }
                    str = "Sessions SDK has dropped this session due to sampling.";
                }
                Log.d("SessionFirelogPublisher", str);
                return Boxing.boxBoolean(false);
            }
        }
        sessionFirelogPublisherImpl$shouldLogSession$1 = new SessionFirelogPublisherImpl$shouldLogSession$1(this, continuation);
        Object obj2 = sessionFirelogPublisherImpl$shouldLogSession$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionFirelogPublisherImpl$shouldLogSession$1.label;
        if (i != 0) {
        }
        if (sessionFirelogPublisherImpl.sessionSettings.getSessionsEnabled()) {
        }
        Log.d("SessionFirelogPublisher", str);
        return Boxing.boxBoolean(false);
    }

    @Override // com.google.firebase.sessions.SessionFirelogPublisher
    public void logSession(SessionDetails sessionDetails) {
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.backgroundDispatcher), null, null, new SessionFirelogPublisherImpl$logSession$1(this, sessionDetails, null), 3, null);
    }
}
