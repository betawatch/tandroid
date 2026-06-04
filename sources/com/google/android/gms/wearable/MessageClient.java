package com.google.android.gms.wearable;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.Wearable;

/* loaded from: classes.dex */
public abstract class MessageClient extends GoogleApi {
    public abstract Task sendMessage(String str, String str2, byte[] bArr);

    public MessageClient(Context context, GoogleApi.Settings settings) {
        super(context, Wearable.API, Wearable.WearableOptions.zza, settings);
    }
}
