package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class g71 {
    public final ByteBuffer c;
    public long e;
    public final /* synthetic */ h71 f;
    public final FourierTransform.FFT a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] b = new float[1024];
    public int d = 0;

    public g71(h71 h71Var) {
        this.f = h71Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.c = allocateDirect;
        allocateDirect.position(0);
    }
}
