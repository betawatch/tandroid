package com.google.firebase.sessions.api;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface SessionSubscriber {

    public enum Name {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    Name getSessionSubscriberName();

    boolean isDataCollectionEnabled();

    void onSessionChanged(SessionDetails sessionDetails);

    public static final class SessionDetails {
        private final String sessionId;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SessionDetails) && Intrinsics.areEqual(this.sessionId, ((SessionDetails) obj).sessionId);
        }

        public int hashCode() {
            return this.sessionId.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.sessionId + ')';
        }

        public SessionDetails(String sessionId) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            this.sessionId = sessionId;
        }

        public final String getSessionId() {
            return this.sessionId;
        }
    }
}
