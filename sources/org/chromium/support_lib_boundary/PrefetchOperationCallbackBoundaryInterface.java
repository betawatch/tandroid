package org.chromium.support_lib_boundary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public interface PrefetchOperationCallbackBoundaryInterface {

    /* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface PrefetchExceptionTypeBoundaryInterface {
        public static final int DUPLICATE = 2;
        public static final int GENERIC = 0;
        public static final int NETWORK = 1;
    }

    void onFailure(int i10, String str, int i11);

    void onSuccess();
}
