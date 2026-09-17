package com.google.android.recaptcha;

import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public interface RecaptchaTasksClient {
    Task<String> executeTask(RecaptchaAction recaptchaAction);

    Task<String> executeTask(RecaptchaAction recaptchaAction, long j3);
}
