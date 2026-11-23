package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class zzuu extends RuntimeException {
    public zzuu(zzts zztsVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzsx zza() {
        return new zzsx(getMessage());
    }
}
