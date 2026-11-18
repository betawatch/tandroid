package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class i40 {
    public final ByteBuffer[] a = new ByteBuffer[10];
    public final long[] b = new long[10];
    public final int[] c = new int[10];
    public int d;
    public int e;
    public boolean f;

    public i40() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.a[i7] = ByteBuffer.allocateDirect(2048);
            this.a[i7].order(ByteOrder.nativeOrder());
        }
    }
}
