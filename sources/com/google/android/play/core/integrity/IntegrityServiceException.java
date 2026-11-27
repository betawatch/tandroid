package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class IntegrityServiceException extends ao {
    private final Throwable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegrityServiceException(int i, Throwable th) {
        super(new Status(i, "Integrity API error (" + i + "): " + com.google.android.play.core.integrity.model.a.a(i) + ".", null, null));
        Locale locale = Locale.ROOT;
        if (i != 0) {
            this.a = th;
        } else {
            lq5.j("ErrorCode should not be 0.");
            throw null;
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
