package org.chromium.support_lib_boundary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public interface PrefetchOperationCallbackBoundaryInterface {

    /* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface PrefetchExceptionTypeBoundaryInterface {
        public static final int DUPLICATE = 2;
        public static final int GENERIC = 0;
        public static final int NETWORK = 1;
    }

    void onFailure(int i7, String str, int i10);

    void onSuccess();
}
