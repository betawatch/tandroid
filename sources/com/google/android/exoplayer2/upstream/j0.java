package com.google.android.exoplayer2.upstream;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public j0(int i10, int i11, int i12, int i13) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.a - this.b <= 1) {
                return false;
            }
        } else if (this.c - this.d <= 1) {
            return false;
        }
        return true;
    }
}
