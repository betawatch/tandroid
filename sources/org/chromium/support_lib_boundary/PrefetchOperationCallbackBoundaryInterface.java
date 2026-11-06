package org.chromium.support_lib_boundary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public interface PrefetchOperationCallbackBoundaryInterface {

    /* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface PrefetchExceptionTypeBoundaryInterface {
        public static final int DUPLICATE = 2;
        public static final int GENERIC = 0;
        public static final int NETWORK = 1;
    }

    void onFailure(int i7, String str, int i10);

    void onSuccess();
}
