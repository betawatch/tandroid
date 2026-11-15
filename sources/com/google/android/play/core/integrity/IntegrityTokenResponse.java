package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class IntegrityTokenResponse {
    public abstract Task<Integer> showDialog(Activity activity, int i7);

    public abstract String token();
}
