package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public class IntegrityServiceException extends com.google.android.gms.common.api.f {
    private final Throwable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegrityServiceException(int i7, Throwable th2) {
        super(new Status(i7, "Integrity API error (" + i7 + "): " + com.google.android.play.core.integrity.model.a.a(i7) + ".", null, null));
        Locale locale = Locale.ROOT;
        if (i7 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.a = th2;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
