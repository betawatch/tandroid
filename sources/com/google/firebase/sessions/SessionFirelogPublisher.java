package com.google.firebase.sessions;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface SessionFirelogPublisher {
    public static final Companion Companion = Companion.$$INSTANCE;

    void logSession(SessionDetails sessionDetails);

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final SessionFirelogPublisher getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionFirelogPublisher.class);
            Intrinsics.checkNotNullExpressionValue(obj, "Firebase.app[SessionFirelogPublisher::class.java]");
            return (SessionFirelogPublisher) obj;
        }
    }
}
