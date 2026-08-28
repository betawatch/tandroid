package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j61 {
    public final ByteBuffer c;
    public long e;
    public final /* synthetic */ k61 f;
    public final FourierTransform.FFT a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] b = new float[1024];
    public int d = 0;

    public j61(k61 k61Var) {
        this.f = k61Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.c = allocateDirect;
        allocateDirect.position(0);
    }
}
