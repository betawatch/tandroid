package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class m50 {
    public final ByteBuffer[] a = new ByteBuffer[10];
    public final long[] b = new long[10];
    public final int[] c = new int[10];
    public int d;
    public int e;
    public boolean f;

    public m50() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.a[i10] = ByteBuffer.allocateDirect(2048);
            this.a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
