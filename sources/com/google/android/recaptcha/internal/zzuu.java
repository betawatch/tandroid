package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class zzuu extends RuntimeException {
    public zzuu(zzts zztsVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzsx zza() {
        return new zzsx(getMessage());
    }
}
