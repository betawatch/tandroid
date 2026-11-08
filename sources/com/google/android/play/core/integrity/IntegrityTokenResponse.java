package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class IntegrityTokenResponse {
    public abstract Task<Integer> showDialog(Activity activity, int i7);

    public abstract String token();
}
