package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public class IntegrityServiceException extends com.google.android.gms.common.api.f {
    private final Throwable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegrityServiceException(int i10, Throwable th2) {
        super(new Status(i10, "Integrity API error (" + i10 + "): " + com.google.android.play.core.integrity.model.a.a(i10) + ".", null, null));
        Locale locale = Locale.ROOT;
        if (i10 == 0) {
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
