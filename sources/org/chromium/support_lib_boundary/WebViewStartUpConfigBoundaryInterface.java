package org.chromium.support_lib_boundary;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public interface WebViewStartUpConfigBoundaryInterface {
    Executor getBackgroundExecutor();

    boolean shouldRunUiThreadStartUpTasks();
}
