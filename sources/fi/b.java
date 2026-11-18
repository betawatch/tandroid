package fi;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.util.HashSet;
import org.telegram.messenger.bz;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public class b implements org.telegram.ui.ActionBar.i6 {
    public final HashSet a = new HashSet();
    public final SparseIntArray b;
    public final Paint c;
    public Paint d;
    public PorterDuffColorFilter e;
    public org.telegram.ui.ActionBar.v4 f;

    public b() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.b = sparseIntArray;
        Paint paint = new Paint();
        this.c = paint;
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.og, -1308622848);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.pg, -1056964608);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Pj, -1214008894);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Qj, -1946157057);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Rj, 452984831);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Sj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Tj, -667862461);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Uj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Fj, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.J5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.q7, -2406842);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.H5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.hg, i0.a.f(0.2f, -16777216, -1));
        int i7 = org.telegram.ui.ActionBar.n6.P5;
        sparseIntArray.put(i7, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Q5, i0.a.f(0.5f, -16777216, -1));
        int i10 = org.telegram.ui.ActionBar.n6.O5;
        sparseIntArray.put(i10, i0.a.o(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.E8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.F8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.p7, -1152913);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.i6, 385875967);
        int i11 = org.telegram.ui.ActionBar.n6.I5;
        sparseIntArray.put(i11, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Kf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Ri, -1711276033);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.H6, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.t5, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.zj, i0.a.f(0.2f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.j5, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.r5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.v6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Lf, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Nf, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.mg, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Di, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.s8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.gg, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Af, i0.a.o(-1, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.zf, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.y8, -1);
        sparseIntArray.put(i7, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(i10, i0.a.o(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.y6, i0.a.o(-1, ks.L1));
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Re, -14606046);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Qe, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.ag, -1221292);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Vf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.bg, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Wf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.eg, 2030043135);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.dg, -10638868);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Ne, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Me, org.telegram.ui.ActionBar.n6.r1(0.6f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.lg, -1515107571);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Yc, -5316609);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Le, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Oe, org.telegram.ui.ActionBar.n6.r1(0.9f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Nl, org.telegram.ui.ActionBar.n6.r1(0.8f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Je, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.h5, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.i5, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.M5, -15393241);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.d6, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Pl, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Tl, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.G6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Df, -8553090);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.h6, -10177027);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Hf, 181267199);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Bf, i0.a.o(-1, ks.J1));
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Ef, -2130706433);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Ff, i0.a.o(-1, ks.J1));
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Gf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.If, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Cf, i0.a.o(-16777216, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Jf, i0.a.o(-1, ks.J1));
        int i12 = org.telegram.ui.ActionBar.n6.d7;
        sparseIntArray.put(i12, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.qg, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.U5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.e7, -14079703);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.f7, -8158332);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.a7, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.L6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.l6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.k6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.A6, i0.a.f(0.3f, -1, -16777216));
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.wj, -14605274);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.xj, -7616267);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.yj, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.H8, -233499371);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Mf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.B6, -8355712);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.eh, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Wg, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.A5, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Z8, -9316522);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.X8, -1446156);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.cd, -2110438831);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.M6, -10263709);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.N6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.B5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.E5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.n5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.nk, -832444);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.i7, -12692893);
        int i13 = org.telegram.ui.ActionBar.n6.j7;
        sparseIntArray.put(i13, -10329502);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.C5, -1);
        sparseIntArray.put(i11, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Ti, -13816531);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Ui, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Si, -657931);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.J7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Oi, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Pi, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.G8, -232841441);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.t8, 385875967);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.m7, -12500671);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.l7, -13133079);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.n7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Fi, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.k5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.R5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Xc, -12147733);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.q5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.lj, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.nj, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.oj, -12632257);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.mj, -8796932);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Aj, 1140850687);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.rb, i0.a.f(0.4f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.ub, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.vb, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.wb, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.De, i0.a.o(-1, 75));
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.h7, -10177041);
        sparseIntArray.put(i13, -12237499);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.k7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.K7, -10703370);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.L7, -12547121);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Ml, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Kl, -1207959553);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Ll, 352321535);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Jj, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Mj, -11292689);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Kj, -12829636);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Lj, -11184811);
        sparseIntArray.put(org.telegram.ui.ActionBar.n6.Ql, -15198183);
        a();
        paint.setColor(k(i12));
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final boolean d() {
        return org.telegram.ui.ActionBar.n6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final void e(float f10, float f11, int i7, int i10) {
        org.telegram.ui.ActionBar.n6.r(f10, f11, i7, i10);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final ColorFilter f() {
        if (this.e == null) {
            this.e = new PorterDuffColorFilter(k(org.telegram.ui.ActionBar.n6.G6), PorterDuff.Mode.SRC_IN);
        }
        return this.e;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final Paint g(String str) {
        if (str.equals("paintDivider")) {
            return this.c;
        }
        if (!str.equals("paintChatActionBackground")) {
            return org.telegram.ui.ActionBar.n6.V0(str);
        }
        if (this.d == null) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(i0.a.f(0.1f, -16777216, -1));
        }
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final Drawable getDrawable(String str) {
        if (!Objects.equals(str, "drawableMsgOutMedia")) {
            return null;
        }
        if (this.f == null) {
            this.f = new org.telegram.ui.ActionBar.v4(1, true, false, this);
        }
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final boolean h() {
        return bz.H0;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int i(int i7) {
        return k(i7);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int k(int i7) {
        SparseIntArray sparseIntArray = this.b;
        int indexOfKey = sparseIntArray.indexOfKey(i7);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        Integer valueOf = Integer.valueOf(i7);
        HashSet hashSet = this.a;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Integer.valueOf(i7));
        }
        return org.telegram.ui.ActionBar.n6.v0(i7);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int m(int i7) {
        return k(i7);
    }

    public void a() {
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final /* synthetic */ void l(int i7, int i10) {
    }
}
