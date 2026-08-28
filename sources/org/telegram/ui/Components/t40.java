package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t40 {
    public final ByteBuffer[] a = new ByteBuffer[10];
    public final long[] b = new long[10];
    public final int[] c = new int[10];
    public int d;
    public int e;
    public boolean f;

    public t40() {
        for (int i9 = 0; i9 < 10; i9++) {
            this.a[i9] = ByteBuffer.allocateDirect(2048);
            this.a[i9].order(ByteOrder.nativeOrder());
        }
    }
}
