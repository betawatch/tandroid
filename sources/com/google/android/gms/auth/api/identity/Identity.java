package com.google.android.gms.auth.api.identity;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.auth-api.zbaq;

/* loaded from: classes.dex */
public abstract class Identity {
    public static SignInClient getSignInClient(Context context) {
        return new zbaq((Context) Preconditions.checkNotNull(context), new zbv());
    }
}
