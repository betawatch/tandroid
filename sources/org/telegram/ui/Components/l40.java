package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class l40 {
    public final ByteBuffer[] a = new ByteBuffer[10];
    public final long[] b = new long[10];
    public final int[] c = new int[10];
    public int d;
    public int e;
    public boolean f;

    public l40() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.a[i7] = ByteBuffer.allocateDirect(2048);
            this.a[i7].order(ByteOrder.nativeOrder());
        }
    }
}
