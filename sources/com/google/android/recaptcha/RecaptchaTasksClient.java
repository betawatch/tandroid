package com.google.android.recaptcha;

import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public interface RecaptchaTasksClient {
    Task<String> executeTask(RecaptchaAction recaptchaAction);

    Task<String> executeTask(RecaptchaAction recaptchaAction, long j3);
}
