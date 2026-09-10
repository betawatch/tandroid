package androidx.car.app;

import android.os.RemoteException;
import android.util.Log;
import j$.util.Objects;
import java.security.InvalidParameterException;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class FailureResponse {
    public static final int BUNDLER_EXCEPTION = 1;
    public static final int ILLEGAL_STATE_EXCEPTION = 2;
    public static final int INVALID_PARAMETER_EXCEPTION = 3;
    public static final int REMOTE_EXCEPTION = 6;
    public static final int RUNTIME_EXCEPTION = 5;
    public static final int SECURITY_EXCEPTION = 4;
    public static final int UNKNOWN_ERROR = 0;
    private final int mErrorType;
    private final String mStackTrace;

    public FailureResponse(Throwable th2) {
        Objects.requireNonNull(th2);
        this.mStackTrace = Log.getStackTraceString(th2);
        if (th2 instanceof w.g) {
            this.mErrorType = 1;
            return;
        }
        if (th2 instanceof IllegalStateException) {
            this.mErrorType = 2;
            return;
        }
        if (th2 instanceof InvalidParameterException) {
            this.mErrorType = 3;
            return;
        }
        if (th2 instanceof SecurityException) {
            this.mErrorType = 4;
            return;
        }
        if (th2 instanceof RuntimeException) {
            this.mErrorType = 5;
        } else if (th2 instanceof RemoteException) {
            this.mErrorType = 6;
        } else {
            this.mErrorType = 0;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FailureResponse)) {
            return false;
        }
        FailureResponse failureResponse = (FailureResponse) obj;
        return this.mErrorType == failureResponse.mErrorType && Objects.equals(this.mStackTrace, failureResponse.mStackTrace);
    }

    public int getErrorType() {
        return this.mErrorType;
    }

    public String getStackTrace() {
        String str = this.mStackTrace;
        Objects.requireNonNull(str);
        return str;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mErrorType), this.mStackTrace);
    }

    private FailureResponse() {
        this.mStackTrace = null;
        this.mErrorType = 0;
    }
}
