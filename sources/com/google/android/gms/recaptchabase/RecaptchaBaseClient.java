package com.google.android.gms.recaptchabase;

import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public interface RecaptchaBaseClient {
    Task execute(ExecuteRequest executeRequest);

    Task init(InitRequest initRequest);
}
