package org.chromium.support_lib_boundary;

import java.io.OutputStream;
import java.util.Collection;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public interface TracingControllerBoundaryInterface {
    boolean isTracing();

    void start(int i7, Collection<String> collection, int i10);

    boolean stop(OutputStream outputStream, Executor executor);
}
