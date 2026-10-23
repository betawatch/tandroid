package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class zzuu extends RuntimeException {
    public zzuu(zzts zztsVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzsx zza() {
        return new zzsx(getMessage());
    }
}
