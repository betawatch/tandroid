package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class zzuu extends RuntimeException {
    public zzuu(zzts zztsVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzsx zza() {
        return new zzsx(getMessage());
    }
}
