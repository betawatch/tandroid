package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class o50 {
    public final ByteBuffer[] a = new ByteBuffer[10];
    public final long[] b = new long[10];
    public final int[] c = new int[10];
    public int d;
    public int e;
    public boolean f;

    public o50() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.a[i10] = ByteBuffer.allocateDirect(2048);
            this.a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
