package org.chromium.support_lib_boundary;

import java.io.OutputStream;
import java.util.Collection;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public interface TracingControllerBoundaryInterface {
    boolean isTracing();

    void start(int i, Collection<String> collection, int i2);

    boolean stop(OutputStream outputStream, Executor executor);
}
