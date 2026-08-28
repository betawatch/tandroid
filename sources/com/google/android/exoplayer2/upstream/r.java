package com.google.android.exoplayer2.upstream;

import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r {
    public int c;
    public int d;
    public final boolean a = true;
    public final int b = 65536;
    public int e = 0;
    public a[] f = new a[100];

    public final synchronized void a(int i9) {
        boolean z10 = i9 < this.c;
        this.c = i9;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, d5.f0.f(this.c, this.b) - this.d);
        int i9 = this.e;
        if (max >= i9) {
            return;
        }
        Arrays.fill(this.f, max, i9, (Object) null);
        this.e = max;
    }
}
