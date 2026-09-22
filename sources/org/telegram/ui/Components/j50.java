package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class j50 {
    public final ByteBuffer[] a = new ByteBuffer[10];
    public final long[] b = new long[10];
    public final int[] c = new int[10];
    public int d;
    public int e;
    public boolean f;

    public j50() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.a[i10] = ByteBuffer.allocateDirect(2048);
            this.a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
