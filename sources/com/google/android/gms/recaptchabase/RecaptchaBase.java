package com.google.android.gms.recaptchabase;

import android.content.Context;
import com.google.android.gms.internal.recaptchabase.zzl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class RecaptchaBase {
    public static final RecaptchaBase INSTANCE = new RecaptchaBase();

    private RecaptchaBase() {
    }

    public static final RecaptchaBaseClient getClient(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new zzl(context);
    }
}
