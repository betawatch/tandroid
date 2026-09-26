package ai;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public class d implements org.telegram.ui.ActionBar.d6 {
    public final HashSet a = new HashSet();
    public final SparseIntArray b;
    public final Paint c;
    public Paint d;
    public PorterDuffColorFilter e;
    public org.telegram.ui.ActionBar.d5 f;

    public d() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.b = sparseIntArray;
        Paint paint = new Paint();
        this.c = paint;
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.xf, -1308622848);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.yf, -1056964608);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Yi, -1214008894);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Zi, -1946157057);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.aj, 452984831);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.bj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.cj, -667862461);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.dj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Oi, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.J5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.q7, -2406842);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.H5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.qf, i0.a.d(0.2f, -16777216, -1));
        int i10 = org.telegram.ui.ActionBar.h6.P5;
        sparseIntArray.put(i10, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Q5, i0.a.d(0.5f, -16777216, -1));
        int i11 = org.telegram.ui.ActionBar.h6.O5;
        sparseIntArray.put(i11, i0.a.k(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.E8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.F8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.p7, -1152913);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.i6, 385875967);
        int i12 = org.telegram.ui.ActionBar.h6.I5;
        sparseIntArray.put(i12, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Se, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.ai, -1711276033);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.H6, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.t5, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Ii, i0.a.d(0.2f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.j5, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.r5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.v6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Te, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Ve, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.vf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Mh, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.s8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.pf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Ie, i0.a.k(-1, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.He, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.y8, -1);
        sparseIntArray.put(i10, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(i11, i0.a.k(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.y6, i0.a.k(-1, 127));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.ae, -14606046);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Zd, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.jf, -1221292);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.df, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.kf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.ef, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.nf, 2030043135);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.mf, -10638868);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Wd, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Vd, org.telegram.ui.ActionBar.h6.l1(0.6f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.uf, -1515107571);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.hc, -5316609);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Ud, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Xd, org.telegram.ui.ActionBar.h6.l1(0.9f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Wk, org.telegram.ui.ActionBar.h6.l1(0.8f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Sd, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.h5, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.i5, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.M5, -15393241);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.d6, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.G6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Le, -8553090);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.h6, -10177027);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Pe, 181267199);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Je, i0.a.k(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Me, -2130706433);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Ne, i0.a.k(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Oe, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Qe, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Ke, i0.a.k(-16777216, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Re, i0.a.k(-1, 125));
        int i13 = org.telegram.ui.ActionBar.h6.d7;
        sparseIntArray.put(i13, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.zf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.U5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.e7, -14079703);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f7, -8158332);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.a7, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.L6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.l6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.k6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.A6, i0.a.d(0.3f, -1, -16777216));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Fi, -14605274);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Gi, -7616267);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Hi, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.H8, -233499371);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Ue, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.B6, -8355712);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.ng, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.fg, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.A5, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Z8, -9316522);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.X8, -1446156);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.lc, -2110438831);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.M6, -10263709);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.N6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.B5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.E5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.n5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.wj, -832444);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.i7, -12692893);
        int i14 = org.telegram.ui.ActionBar.h6.j7;
        sparseIntArray.put(i14, -10329502);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.C5, -1);
        sparseIntArray.put(i12, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.ci, -13816531);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.di, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.bi, -657931);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.J7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Xh, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Yh, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.G8, -232841441);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.t8, 385875967);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.m7, -12500671);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.l7, -13133079);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.n7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Oh, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.k5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.R5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.gc, -12147733);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.q5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.ui, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.wi, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.xi, -12632257);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.vi, -8796932);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Ji, 1140850687);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Aa, i0.a.d(0.4f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Da, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Ea, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Fa, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Md, i0.a.k(-1, 75));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.h7, -10177041);
        sparseIntArray.put(i14, -12237499);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.k7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.K7, -10703370);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.L7, -12547121);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Vk, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Tk, -1207959553);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Uk, 352321535);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Si, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Vi, -11292689);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Ti, -12829636);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Ui, -11184811);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Zk, -15198183);
        b();
        paint.setColor(G0(i13));
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final Paint G(String str) {
        if (str.equals("paintDivider")) {
            return this.c;
        }
        if (!str.equals("paintChatActionBackground")) {
            return org.telegram.ui.ActionBar.h6.S0(str);
        }
        if (this.d == null) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(i0.a.d(0.1f, -16777216, -1));
        }
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final int G0(int i10) {
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
        return org.telegram.ui.ActionBar.h6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final boolean a() {
        return org.telegram.ui.ActionBar.h6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final int g0(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final int g1(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final Drawable getDrawable(String str) {
        if (!Objects.equals(str, "drawableMsgOutMedia")) {
            return null;
        }
        if (this.f == null) {
            this.f = new org.telegram.ui.ActionBar.d5(1, true, false, this);
        }
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final /* synthetic */ boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final ColorFilter x() {
        if (this.e == null) {
            this.e = new PorterDuffColorFilter(G0(org.telegram.ui.ActionBar.h6.G6), PorterDuff.Mode.SRC_IN);
        }
        return this.e;
    }

    public void b() {
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final /* synthetic */ void L0(int i10, int i11) {
    }
}
