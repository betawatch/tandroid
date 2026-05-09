package androidx.car.app;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class SessionInfoIntentEncoder {
    public static SessionInfo decode(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            throw new IllegalArgumentException("Expected the SessionInfo to be encoded in the bind intent extras, but the extras were null.");
        }
        Bundle bundle = extras.getBundle("androidx.car.app.extra.SESSION_INFO_BUNDLE");
        return new SessionInfo(bundle.getInt("display-type"), bundle.getString("session-id"));
    }

    public static boolean containsSessionInfo(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        return extras.containsKey("androidx.car.app.extra.SESSION_INFO_BUNDLE");
    }
}
