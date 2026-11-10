package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x30 {
    public final ByteBuffer[] a = new ByteBuffer[10];
    public final long[] b = new long[10];
    public final int[] c = new int[10];
    public int d;
    public int e;
    public boolean f;

    public x30() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.a[i7] = ByteBuffer.allocateDirect(2048);
            this.a[i7].order(ByteOrder.nativeOrder());
        }
    }
}
