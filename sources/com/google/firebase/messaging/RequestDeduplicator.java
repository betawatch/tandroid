package com.google.firebase.messaging;

import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class RequestDeduplicator {
    private final Executor executor;
    private final Map getTokenRequests = new ArrayMap();

    interface GetTokenRequest {
        Task start();
    }

    RequestDeduplicator(Executor executor) {
        this.executor = executor;
    }

    synchronized Task getOrStartGetTokenRequest(final String str, GetTokenRequest getTokenRequest) {
        Task task = (Task) this.getTokenRequests.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task continueWithTask = getTokenRequest.start().continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.messaging.RequestDeduplicator$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return RequestDeduplicator.$r8$lambda$7vbEhMqRR2Cih64GBiItUUcAhYE(RequestDeduplicator.this, str, task2);
            }
        });
        this.getTokenRequests.put(str, continueWithTask);
        return continueWithTask;
    }

    public static /* synthetic */ Task $r8$lambda$7vbEhMqRR2Cih64GBiItUUcAhYE(RequestDeduplicator requestDeduplicator, String str, Task task) {
        synchronized (requestDeduplicator) {
            requestDeduplicator.getTokenRequests.remove(str);
        }
        return task;
    }
}
