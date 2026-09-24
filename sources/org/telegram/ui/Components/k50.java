package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class k50 {
    public final ByteBuffer[] a = new ByteBuffer[10];
    public final long[] b = new long[10];
    public final int[] c = new int[10];
    public int d;
    public int e;
    public boolean f;

    public k50() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.a[i10] = ByteBuffer.allocateDirect(2048);
            this.a[i10].order(ByteOrder.nativeOrder());
        }
    }
}
