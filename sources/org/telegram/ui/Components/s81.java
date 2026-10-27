package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class s81 {
    public final ByteBuffer c;
    public long e;
    public final /* synthetic */ t81 f;
    public final FourierTransform.FFT a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] b = new float[1024];
    public int d = 0;

    public s81(t81 t81Var) {
        this.f = t81Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.c = allocateDirect;
        allocateDirect.position(0);
    }
}
