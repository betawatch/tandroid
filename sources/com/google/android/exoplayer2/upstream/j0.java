package com.google.android.exoplayer2.upstream;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public j0(int i9, int i10, int i11, int i12) {
        this.a = i9;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    public final boolean a(int i9) {
        if (i9 == 1) {
            if (this.a - this.b <= 1) {
                return false;
            }
        } else if (this.c - this.d <= 1) {
            return false;
        }
        return true;
    }
}
