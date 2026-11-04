package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class StandardIntegrityException extends com.google.android.gms.common.api.f {
    private final Throwable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardIntegrityException(int i3, Throwable th2) {
        super(new Status(i3, "Standard Integrity API error (" + i3 + "): " + com.google.android.play.core.integrity.model.b.a(i3) + ".", null, null));
        Locale locale = Locale.ROOT;
        if (i3 == 0) {
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
