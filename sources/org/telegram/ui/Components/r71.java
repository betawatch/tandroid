package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class r71 {
    public final ByteBuffer c;
    public long e;
    public final /* synthetic */ s71 f;
    public final FourierTransform.FFT a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] b = new float[1024];
    public int d = 0;

    public r71(s71 s71Var) {
        this.f = s71Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.c = allocateDirect;
        allocateDirect.position(0);
    }
}
