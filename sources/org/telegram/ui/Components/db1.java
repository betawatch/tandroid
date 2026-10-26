package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class db1 {
    public final String a;
    public final int b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public String h;
    public jb1 i;
    public an0 j;
    public an0 l;
    public int m;
    public long n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public boolean s;
    public int t;
    public boolean u;
    public final ArrayList k = new ArrayList();
    public final s51 v = new s51(this, 11);

    public db1(String str, int i10, long j10, int i11, int i12, int i13, byte[] bArr) {
        this.a = str;
        this.b = i10;
        this.c = j10;
        this.d = i11;
        this.e = Math.max(0, i12);
        this.f = Math.max(0, i13);
        this.g = bArr;
    }

    public final String a() {
        return this.b + "/" + this.c + "/" + this.d;
    }
}
