package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class IntegrityTokenResponse {
    public abstract Task<Integer> showDialog(Activity activity, int i7);

    public abstract String token();
}
