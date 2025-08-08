package com.google.firebase.sessions;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface SessionDatastore {
    public static final Companion Companion = Companion.$$INSTANCE;

    String getCurrentSessionId();

    void updateSessionId(String str);

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final SessionDatastore getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionDatastore.class);
            Intrinsics.checkNotNullExpressionValue(obj, "Firebase.app[SessionDatastore::class.java]");
            return (SessionDatastore) obj;
        }
    }
}
