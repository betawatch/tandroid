package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class t71 {
    public final ByteBuffer c;
    public long e;
    public final /* synthetic */ u71 f;
    public final FourierTransform.FFT a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] b = new float[1024];
    public int d = 0;

    public t71(u71 u71Var) {
        this.f = u71Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.c = allocateDirect;
        allocateDirect.position(0);
    }
}
