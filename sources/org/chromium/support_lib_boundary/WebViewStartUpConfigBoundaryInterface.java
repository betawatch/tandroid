package org.chromium.support_lib_boundary;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public interface WebViewStartUpConfigBoundaryInterface {
    Executor getBackgroundExecutor();

    boolean shouldRunUiThreadStartUpTasks();
}
