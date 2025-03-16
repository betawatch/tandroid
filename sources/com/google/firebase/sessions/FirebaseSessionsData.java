package com.google.firebase.sessions;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class FirebaseSessionsData {
    private final String sessionId;

    public FirebaseSessionsData(String str) {
        this.sessionId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FirebaseSessionsData) && Intrinsics.areEqual(this.sessionId, ((FirebaseSessionsData) obj).sessionId);
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        String str = this.sessionId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "FirebaseSessionsData(sessionId=" + this.sessionId + ')';
    }
}
