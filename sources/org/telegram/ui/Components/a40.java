package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class a40 {
    public final ByteBuffer[] a = new ByteBuffer[10];
    public final long[] b = new long[10];
    public final int[] c = new int[10];
    public int d;
    public int e;
    public boolean f;

    public a40() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.a[i7] = ByteBuffer.allocateDirect(2048);
            this.a[i7].order(ByteOrder.nativeOrder());
        }
    }
}
