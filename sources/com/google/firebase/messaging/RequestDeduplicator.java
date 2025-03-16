package com.google.firebase.messaging;

import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
class RequestDeduplicator {
    private final Executor executor;
    private final Map getTokenRequests = new ArrayMap();

    interface GetTokenRequest {
        Task start();
    }

    RequestDeduplicator(Executor executor) {
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getOrStartGetTokenRequest$0(String str, Task task) {
        synchronized (this) {
            this.getTokenRequests.remove(str);
        }
        return task;
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
                Task lambda$getOrStartGetTokenRequest$0;
                lambda$getOrStartGetTokenRequest$0 = RequestDeduplicator.this.lambda$getOrStartGetTokenRequest$0(str, task2);
                return lambda$getOrStartGetTokenRequest$0;
            }
        });
        this.getTokenRequests.put(str, continueWithTask);
        return continueWithTask;
    }
}
