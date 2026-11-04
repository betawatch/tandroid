package c4;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import b8.zb;
import java.util.ArrayList;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e {
    public static final boolean[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int v = c(2, 2, 2, 0);
    public static final int w;
    public static final int[] x;
    public static final int[] y;
    public static final int[] z;
    public final ArrayList a = new ArrayList();
    public final SpannableStringBuilder b = new SpannableStringBuilder();
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;

    static {
        int c2 = c(0, 0, 0, 0);
        w = c2;
        int c10 = c(0, 0, 0, 3);
        x = new int[]{0, 0, 0, 0, 0, 2, 0};
        y = new int[]{0, 0, 0, 0, 0, 0, 2};
        z = new int[]{3, 3, 3, 3, 3, 3, 1};
        A = new boolean[]{false, false, false, true, true, true, false};
        B = new int[]{c2, c10, c2, c2, c10, c2, c2};
        C = new int[]{0, 1, 2, 3, 4, 3, 4};
        D = new int[]{0, 0, 0, 0, 0, 3, 3};
        E = new int[]{c2, c2, c2, c2, c2, c10, c10};
    }

    public e() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(int i3, int i10, int i11, int i12) {
        int i13;
        zb.j(i3, 4);
        zb.j(i10, 4);
        zb.j(i11, 4);
        zb.j(i12, 4);
        if (i12 != 0 && i12 != 1) {
            if (i12 == 2) {
                i13 = hs.L1;
            } else if (i12 == 3) {
                i13 = 0;
            }
            return Color.argb(i13, i3 <= 1 ? 255 : 0, i10 <= 1 ? 255 : 0, i11 > 1 ? 255 : 0);
        }
        i13 = 255;
        return Color.argb(i13, i3 <= 1 ? 255 : 0, i10 <= 1 ? 255 : 0, i11 > 1 ? 255 : 0);
    }

    public final void a(char c2) {
        SpannableStringBuilder spannableStringBuilder = this.b;
        if (c2 != '\n') {
            spannableStringBuilder.append(c2);
            return;
        }
        SpannableString b10 = b();
        ArrayList arrayList = this.a;
        arrayList.add(b10);
        spannableStringBuilder.clear();
        if (this.o != -1) {
            this.o = 0;
        }
        if (this.p != -1) {
            this.p = 0;
        }
        if (this.q != -1) {
            this.q = 0;
        }
        if (this.s != -1) {
            this.s = 0;
        }
        while (true) {
            if (arrayList.size() < this.j && arrayList.size() < 15) {
                this.u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.o, length, 33);
            }
            if (this.p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.p, length, 33);
            }
            if (this.q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.r), this.q, length, 33);
            }
            if (this.s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.t), this.s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.a.clear();
        this.b.clear();
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.s = -1;
        this.u = 0;
        this.c = false;
        this.d = false;
        this.e = 4;
        this.f = false;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 15;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        int i3 = w;
        this.n = i3;
        this.r = v;
        this.t = i3;
    }

    public final void e(boolean z10, boolean z11) {
        int i3 = this.o;
        SpannableStringBuilder spannableStringBuilder = this.b;
        if (i3 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.o, spannableStringBuilder.length(), 33);
                this.o = -1;
            }
        } else if (z10) {
            this.o = spannableStringBuilder.length();
        }
        if (this.p == -1) {
            if (z11) {
                this.p = spannableStringBuilder.length();
            }
        } else {
            if (z11) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.p, spannableStringBuilder.length(), 33);
            this.p = -1;
        }
    }

    public final void f(int i3, int i10) {
        int i11 = this.q;
        SpannableStringBuilder spannableStringBuilder = this.b;
        if (i11 != -1 && this.r != i3) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.r), this.q, spannableStringBuilder.length(), 33);
        }
        if (i3 != v) {
            this.q = spannableStringBuilder.length();
            this.r = i3;
        }
        if (this.s != -1 && this.t != i10) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.t), this.s, spannableStringBuilder.length(), 33);
        }
        if (i10 != w) {
            this.s = spannableStringBuilder.length();
            this.t = i10;
        }
    }
}
