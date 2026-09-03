package oh;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public class b implements org.telegram.ui.ActionBar.g6 {
    public final HashSet a = new HashSet();
    public final SparseIntArray b;
    public final Paint c;
    public Paint d;
    public PorterDuffColorFilter e;
    public org.telegram.ui.ActionBar.h5 f;

    public b() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.b = sparseIntArray;
        Paint paint = new Paint();
        this.c = paint;
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.xf, -1308622848);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.yf, -1056964608);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Yi, -1214008894);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Zi, -1946157057);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.aj, 452984831);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.bj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.cj, -667862461);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.dj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Oi, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.J5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.q7, -2406842);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.H5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.qf, i0.a.d(0.2f, -16777216, -1));
        int i10 = org.telegram.ui.ActionBar.k6.P5;
        sparseIntArray.put(i10, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Q5, i0.a.d(0.5f, -16777216, -1));
        int i11 = org.telegram.ui.ActionBar.k6.O5;
        sparseIntArray.put(i11, i0.a.k(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.E8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.F8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.p7, -1152913);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.i6, 385875967);
        int i12 = org.telegram.ui.ActionBar.k6.I5;
        sparseIntArray.put(i12, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Se, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.ai, -1711276033);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.H6, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.t5, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Ii, i0.a.d(0.2f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.j5, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.r5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.v6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Te, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Ve, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.vf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Mh, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.s8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.pf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Ie, i0.a.k(-1, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.He, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.y8, -1);
        sparseIntArray.put(i10, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(i11, i0.a.k(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.y6, i0.a.k(-1, 127));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.ae, -14606046);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Zd, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.jf, -1221292);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.df, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.kf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.ef, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.nf, 2030043135);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.mf, -10638868);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Wd, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Vd, org.telegram.ui.ActionBar.k6.l1(0.6f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.uf, -1515107571);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.hc, -5316609);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Ud, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Xd, org.telegram.ui.ActionBar.k6.l1(0.9f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Wk, org.telegram.ui.ActionBar.k6.l1(0.8f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Sd, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.h5, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.i5, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.M5, -15393241);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.d6, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.G6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Le, -8553090);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.h6, -10177027);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Pe, 181267199);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Je, i0.a.k(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Me, -2130706433);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Ne, i0.a.k(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Oe, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Qe, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Ke, i0.a.k(-16777216, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Re, i0.a.k(-1, 125));
        int i13 = org.telegram.ui.ActionBar.k6.d7;
        sparseIntArray.put(i13, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.zf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.U5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.e7, -14079703);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f7, -8158332);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.a7, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.L6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.l6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.k6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.A6, i0.a.d(0.3f, -1, -16777216));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Fi, -14605274);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Gi, -7616267);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Hi, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.H8, -233499371);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Ue, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.B6, -8355712);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.ng, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.fg, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.A5, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Z8, -9316522);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.X8, -1446156);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.lc, -2110438831);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.M6, -10263709);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.N6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.B5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.E5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.n5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.wj, -832444);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.i7, -12692893);
        int i14 = org.telegram.ui.ActionBar.k6.j7;
        sparseIntArray.put(i14, -10329502);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.C5, -1);
        sparseIntArray.put(i12, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.ci, -13816531);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.di, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.bi, -657931);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.J7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Xh, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Yh, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.G8, -232841441);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.t8, 385875967);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.m7, -12500671);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.l7, -13133079);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.n7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Oh, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.k5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.R5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.gc, -12147733);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.q5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.ui, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.wi, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.xi, -12632257);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.vi, -8796932);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Ji, 1140850687);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Aa, i0.a.d(0.4f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Da, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Ea, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Fa, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Md, i0.a.k(-1, 75));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.h7, -10177041);
        sparseIntArray.put(i14, -12237499);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.k7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.K7, -10703370);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.L7, -12547121);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Vk, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Tk, -1207959553);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Uk, 352321535);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Si, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Vi, -11292689);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Ti, -12829636);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Ui, -11184811);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Zk, -15198183);
        b();
        paint.setColor(B0(i13));
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int B0(int i10) {
        SparseIntArray sparseIntArray = this.b;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.a;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Integer.valueOf(i10));
        }
        return org.telegram.ui.ActionBar.k6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final Paint F(String str) {
        if (str.equals("paintDivider")) {
            return this.c;
        }
        if (!str.equals("paintChatActionBackground")) {
            return org.telegram.ui.ActionBar.k6.S0(str);
        }
        if (this.d == null) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(i0.a.d(0.1f, -16777216, -1));
        }
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int Z0(int i10) {
        return B0(i10);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final boolean a() {
        return org.telegram.ui.ActionBar.k6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int e0(int i10) {
        return B0(i10);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final Drawable getDrawable(String str) {
        if (!Objects.equals(str, "drawableMsgOutMedia")) {
            return null;
        }
        if (this.f == null) {
            this.f = new org.telegram.ui.ActionBar.h5(1, true, false, this);
        }
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final void l(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.k6.q(f10, f11, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final /* synthetic */ boolean o0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final ColorFilter w() {
        if (this.e == null) {
            this.e = new PorterDuffColorFilter(B0(org.telegram.ui.ActionBar.k6.G6), PorterDuff.Mode.SRC_IN);
        }
        return this.e;
    }

    public void b() {
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final /* synthetic */ void J0(int i10, int i11) {
    }
}
