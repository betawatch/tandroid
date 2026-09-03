package c5;

import android.text.Layout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public b r;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(i iVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (iVar != null) {
            if (!this.c && iVar.c) {
                this.b = iVar.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = iVar.h;
            }
            if (this.i == -1) {
                this.i = iVar.i;
            }
            if (this.a == null && (str = iVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = iVar.f;
            }
            if (this.g == -1) {
                this.g = iVar.g;
            }
            if (this.n == -1) {
                this.n = iVar.n;
            }
            if (this.o == null && (alignment2 = iVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = iVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = iVar.q;
            }
            if (this.j == -1) {
                this.j = iVar.j;
                this.k = iVar.k;
            }
            if (this.r == null) {
                this.r = iVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = iVar.s;
            }
            if (!this.e && iVar.e) {
                this.d = iVar.d;
                this.e = true;
            }
            if (this.m != -1 || (i10 = iVar.m) == -1) {
                return;
            }
            this.m = i10;
        }
    }
}
