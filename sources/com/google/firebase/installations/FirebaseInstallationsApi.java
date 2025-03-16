package com.google.firebase.installations;

import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
public interface FirebaseInstallationsApi {
    Task getId();

    Task getToken(boolean z);
}
