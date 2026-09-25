package org.chromium.support_lib_boundary;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public interface WebViewStartUpConfigBoundaryInterface {
    Executor getBackgroundExecutor();

    boolean shouldRunUiThreadStartUpTasks();
}
