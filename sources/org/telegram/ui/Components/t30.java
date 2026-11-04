package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t30 {
    public final ByteBuffer[] a = new ByteBuffer[10];
    public final long[] b = new long[10];
    public final int[] c = new int[10];
    public int d;
    public int e;
    public boolean f;

    public t30() {
        for (int i3 = 0; i3 < 10; i3++) {
            this.a[i3] = ByteBuffer.allocateDirect(2048);
            this.a[i3].order(ByteOrder.nativeOrder());
        }
    }
}
