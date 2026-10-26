package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class an0 extends RichMessageLayout.RichBlock {
    public static final AtomicInteger K = new AtomicInteger();
    public String E;
    public dc1 F;
    public org.telegram.ui.Cells.da[] G;
    public boolean H;
    public long I;
    public boolean J;
    public final TL_iv.pageBlockEmbed a;
    public jb1 b;
    public final boolean c;
    public int d;
    public final Path e;
    public final float[] f;
    public final int h;
    public pb1 n;
    public boolean r;
    public long s;
    public boolean v;
    public final wa0 w;
    public int x;
    public int y;

    public an0(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockEmbed pageblockembed, boolean z10) {
        super(richMessageLayout, rect, i10);
        this.e = new Path();
        this.f = new float[8];
        this.h = K.incrementAndGet();
        this.w = new wa0(this, 22);
        this.a = pageblockembed;
        this.c = z10;
        this.b = fb1.e(pageblockembed.url);
        this.x = h();
        String g7 = fb1.g(pageblockembed.url, this.b, q());
        this.E = g7;
        if (g7.equals("placeholder") || this.E.startsWith("cache of width")) {
            AndroidUtilities.runOnUIThread(new bi.u8(pageblockembed.url, q(), richMessageLayout.isOut(), 5));
        }
        String str = pageblockembed.url;
        ConcurrentHashMap concurrentHashMap = fb1.a;
        db1 db1Var = (db1) concurrentHashMap.get(str);
        an0 an0Var = db1Var == null ? null : db1Var.j;
        if (an0Var != null && an0Var != this && an0Var.x != this.x) {
            k(an0Var.x, "new layout, width " + Math.round(an0Var.q() / AndroidUtilities.density) + " -> " + Math.round(q() / AndroidUtilities.density), an0Var.E, false);
        }
        db1 db1Var2 = (db1) concurrentHashMap.get(pageblockembed.url);
        if (db1Var2 != null) {
            db1Var2.j = this;
        }
    }

    public static int g() {
        int i10 = SharedConfig.bubbleRadius;
        return (AndroidUtilities.dp(9.0f) + (i10 >= 15 ? AndroidUtilities.dp(2.0f) : i10 >= 11 ? AndroidUtilities.dp(1.0f) : 0)) - AndroidUtilities.dp(2.0f);
    }

    public final boolean f() {
        boolean z10;
        String str = this.a.url;
        jb1 jb1Var = this.b;
        if (jb1Var != null) {
            ConcurrentHashMap concurrentHashMap = fb1.a;
            if (jb1Var.i > 0) {
                return jb1Var.l;
            }
        }
        db1 db1Var = fb1.i(str) ? (db1) fb1.a.get(str) : null;
        eb1 eb1Var = db1Var != null ? (eb1) fb1.b.get(db1Var.a()) : null;
        if (eb1Var != null) {
            synchronized (eb1Var) {
                if (!eb1Var.a.isEmpty() && ((int[]) eb1Var.a.get(0)).length > 2) {
                    if (((int[]) eb1Var.a.get(0))[2] != 0) {
                        z10 = true;
                    }
                }
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.RichMessageLayout.RichBlock
    public final int getHeight() {
        Rect rect = this.padding;
        return rect.top + this.x + rect.bottom;
    }

    @Override // org.telegram.messenger.RichMessageLayout.RichBlock
    public final org.telegram.ui.Cells.da[] getText() {
        return this.G;
    }

    public final int h() {
        int i10;
        String str = this.a.url;
        jb1 jb1Var = this.b;
        int q5 = q();
        db1 db1Var = fb1.i(str) ? (db1) fb1.a.get(str) : null;
        int i11 = 0;
        if (db1Var == null) {
            return 0;
        }
        if (db1Var.f > 0) {
            return AndroidUtilities.dp(Math.max(50, Math.min(600, r4)));
        }
        int i12 = (jb1Var == null || Math.abs(jb1Var.k - q5) > 1) ? 0 : jb1Var.i;
        if (i12 > 0) {
            return Math.min(AndroidUtilities.dp(600.0f), Math.max(AndroidUtilities.dp(50.0f), i12));
        }
        eb1 eb1Var = (eb1) fb1.b.get(db1Var.a());
        if (eb1Var != null) {
            int c10 = fb1.c(q5);
            synchronized (eb1Var) {
                ArrayList arrayList = eb1Var.a;
                int size = arrayList.size();
                int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                i10 = 0;
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    int[] iArr = (int[]) obj;
                    int abs = Math.abs(iArr[0] - c10);
                    if (abs < i13) {
                        i10 = iArr[1];
                        i13 = abs;
                    }
                }
            }
            i11 = i10;
        }
        if (i11 <= 0) {
            i11 = 160;
        }
        return AndroidUtilities.dp(Math.max(50, Math.min(600, i11)));
    }

    public final View i() {
        return this.view;
    }

    @Override // org.telegram.messenger.RichMessageLayout.RichBlock
    public final boolean isHorizontallyDragging() {
        pb1 pb1Var = this.n;
        if (pb1Var == null || !this.r || !pb1Var.w || (pb1Var.K & 3) == 2) {
            return false;
        }
        return pb1Var.z || pb1Var.n();
    }

    public final void j() {
        jb1 jb1Var = this.b;
        vb1 i10 = jb1Var == null ? null : jb1Var.i();
        dc1 dc1Var = i10 == null ? null : i10.f;
        if (dc1Var != this.F) {
            this.F = dc1Var;
            if (dc1Var != null) {
                ArrayList arrayList = dc1Var.a;
                this.G = new org.telegram.ui.Cells.da[arrayList.size()];
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.da[] daVarArr = this.G;
                    if (i11 >= daVarArr.length) {
                        break;
                    }
                    daVarArr[i11] = new li.a0(this, (bc1) arrayList.get(i11));
                    i11++;
                }
            } else {
                this.G = null;
            }
            this.root.reposition();
        }
        View view = this.view;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void k(int i10, String str, String str2, boolean z10) {
        String str3;
        if (BuildVars.LOGS_ENABLED) {
            long j10 = -1;
            long uptimeMillis = this.r ? SystemClock.uptimeMillis() - this.s : -1L;
            pb1 pb1Var = this.n;
            if (pb1Var != null && pb1Var.s != 0) {
                j10 = SystemClock.uptimeMillis() - pb1Var.s;
            }
            StringBuilder sb2 = new StringBuilder("widget height ");
            sb2.append(this.a.url.substring(10));
            sb2.append(": ");
            sb2.append(str);
            sb2.append(", ");
            sb2.append(Math.round(i10 / AndroidUtilities.density));
            sb2.append(" (");
            sb2.append(str2);
            sb2.append(") -> ");
            sb2.append(Math.round(this.x / AndroidUtilities.density));
            sb2.append(" (");
            sb2.append(this.E);
            sb2.append("), width ");
            sb2.append(Math.round(q() / AndroidUtilities.density));
            String str4 = "";
            sb2.append(z10 ? ", animated" : "");
            sb2.append(this.view != null ? ", on screen" : ", off screen");
            sb2.append(uptimeMillis >= 0 ? b10.i(uptimeMillis, ", running ", " ms") : ", not running");
            if (this.b != null) {
                StringBuilder sb3 = new StringBuilder(", session ");
                sb3.append(this.b.q);
                sb3.append(this.b.g != null ? " (snapshot)" : "");
                yb1 yb1Var = this.b.f;
                sb3.append((yb1Var == null || !yb1Var.y) ? ", scripts held" : "");
                str3 = sb3.toString();
            } else {
                str3 = ", no widget yet";
            }
            sb2.append(str3);
            if (j10 >= 0 && j10 < 5000) {
                str4 = b10.i(j10, ", touched ", " ms ago");
            }
            ic.a.w(str4, sb2);
        }
    }

    public final void l(String str) {
        if (this.view != null) {
            jb1 jb1Var = this.b;
            if ((jb1Var == null || jb1Var.i <= 0) && h() != this.x) {
                m("on screen: ".concat(str), false);
                return;
            }
            return;
        }
        int h = h();
        int i10 = this.x;
        if (h == i10) {
            return;
        }
        String str2 = this.E;
        this.x = h;
        this.E = fb1.g(this.a.url, this.b, q());
        k(i10, "away: ".concat(str), str2, false);
        this.root.reposition();
        MessageObject messageObject = this.root.messageObject;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
        }
        this.H = true;
    }

    public final void m(String str, boolean z10) {
        int h = h();
        int i10 = this.x;
        boolean z11 = false;
        boolean z12 = h != i10;
        String str2 = this.E;
        this.x = h;
        this.E = fb1.g(this.a.url, this.b, q());
        if (z12) {
            k(i10, str, str2, z10);
        }
        if (z12) {
            this.root.reposition();
        }
        if (z12 && z10) {
            this.I = SystemClock.uptimeMillis();
            this.J = false;
        }
        RichMessageLayout richMessageLayout = this.root;
        MessageObject messageObject = richMessageLayout.messageObject;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
        }
        org.telegram.ui.Cells.s1 cell = richMessageLayout.getCell();
        org.telegram.ui.Cells.j1 delegate = this.root.getDelegate();
        View view = this.view;
        if (view == null || cell == null || delegate == null) {
            if (view != null) {
                view.requestLayout();
                return;
            }
            return;
        }
        if (z12 && !f() && (cell.getParent() instanceof RecyclerView)) {
            View view2 = (View) cell.getParent();
            if (cell.getBottom() > view2.getPaddingTop() && cell.getTop() < view2.getHeight() - view2.getPaddingBottom()) {
                z11 = true;
            }
        }
        if (z10) {
            delegate.l1(cell, z11, z11);
        } else {
            delegate.y0(cell, z11, z11);
        }
    }

    public final void n() {
        MessageObject messageObject;
        vb1 vb1Var;
        this.r = true;
        this.s = SystemClock.uptimeMillis();
        yb1 yb1Var = this.b.f;
        this.v = (yb1Var == null || (vb1Var = yb1Var.D) == null || (!vb1Var.g && !yb1Var.v)) ? false : true;
        this.b.l(q());
        org.telegram.ui.Cells.s1 cell = this.root.getCell();
        org.telegram.ui.ActionBar.u6 resourcesProvider = cell != null ? cell.getResourcesProvider() : null;
        this.d = zb1.e(resourcesProvider, this.root.isOut());
        jb1 jb1Var = this.b;
        String a2 = zb1.a(resourcesProvider, this.root.isOut());
        if (a2 == null) {
            jb1Var.getClass();
        } else if (!a2.equals(jb1Var.s)) {
            jb1Var.s = a2;
            jb1Var.m = a2.contains("\"dark\"");
            yb1 yb1Var2 = jb1Var.f;
            if (yb1Var2 != null) {
                yb1Var2.d(a2);
            }
        }
        pb1 pb1Var = this.n;
        jb1 jb1Var2 = this.b;
        if (pb1Var.p != jb1Var2) {
            pb1Var.p();
            pb1Var.p = jb1Var2;
            if (jb1Var2 != null) {
                jb1Var2.h = pb1Var;
                jb1Var2.k(pb1Var.q);
            }
        }
        pb1 pb1Var2 = this.n;
        if (!pb1Var2.q) {
            pb1Var2.q = true;
            jb1 jb1Var3 = pb1Var2.p;
            if (jb1Var3 != null && !pb1Var2.r) {
                jb1Var3.k(true);
            }
        }
        db1 db1Var = (db1) fb1.a.get(this.a.url);
        if (db1Var != null) {
            db1Var.j = this;
        }
        jb1 jb1Var4 = this.b;
        db1 d = fb1.d(jb1Var4);
        if (d != null) {
            d.m++;
            d.n = System.currentTimeMillis();
            boolean z10 = fb1.j;
            if (jb1Var4.p != z10) {
                jb1Var4.p = z10;
                yb1 yb1Var3 = jb1Var4.f;
                if (yb1Var3 != null) {
                    yb1Var3.e(jb1Var4.n && !z10);
                }
            }
            if (d.o) {
                fb1.p(d);
            } else {
                d.p = true;
            }
            fb1.q();
        }
        boolean z11 = this.H && (messageObject = this.root.messageObject) != null && messageObject.forceUpdate;
        this.H = false;
        if (z11 || h() != this.x) {
            AndroidUtilities.runOnUIThread(new d60(1, this, z11));
        }
    }

    public final void o(String str) {
        View view = this.view;
        if (view == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        zm0.a(view, str);
    }

    @Override // org.telegram.messenger.RichMessageLayout.RichBlock
    public final void onAttachedToWindow() {
        jb1 jb1Var = this.b;
        TL_iv.pageBlockEmbed pageblockembed = this.a;
        if (jb1Var == null) {
            this.b = fb1.e(pageblockembed.url);
        }
        if (this.b == null) {
            return;
        }
        if (this.n == null) {
            this.n = new pb1(this, AndroidUtilities.density);
        }
        db1 db1Var = (db1) fb1.a.get(pageblockembed.url);
        if (db1Var != null) {
            ArrayList arrayList = db1Var.k;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            if (fb1.k(arrayList) != this) {
                pb1 pb1Var = this.n;
                jb1 jb1Var2 = this.b;
                pb1Var.p();
                pb1Var.p = jb1Var2;
                pb1Var.r = jb1Var2 != null;
                return;
            }
            an0 an0Var = db1Var.l;
            db1Var.l = this;
            if (an0Var != null && an0Var != this && an0Var.r && an0Var.n != null) {
                an0Var.p();
                pb1 pb1Var2 = an0Var.n;
                jb1 jb1Var3 = an0Var.b;
                pb1Var2.p();
                pb1Var2.p = jb1Var3;
                pb1Var2.r = jb1Var3 != null;
                View view = an0Var.view;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        n();
    }

    @Override // org.telegram.messenger.RichMessageLayout.RichBlock
    public final void onDetachedFromWindow() {
        pb1 pb1Var;
        if (this.n == null) {
            return;
        }
        p();
        this.n.p();
        db1 db1Var = (db1) fb1.a.get(this.a.url);
        if (db1Var == null) {
            return;
        }
        ArrayList arrayList = db1Var.k;
        arrayList.remove(this);
        if (db1Var.l != this) {
            return;
        }
        an0 k10 = fb1.k(arrayList);
        db1Var.l = k10;
        if (k10 == null || k10.r || k10.view == null || (pb1Var = k10.n) == null || k10.b == null) {
            return;
        }
        pb1Var.p();
        k10.n();
        k10.view.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03b1  */
    @Override // org.telegram.messenger.RichMessageLayout.RichBlock
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        yb1 yb1Var;
        boolean z10;
        View view;
        cb1 cb1Var;
        char c10;
        char c11;
        boolean z11;
        float f11;
        int i10;
        int i11;
        wb1[] wb1VarArr;
        char c12;
        double min;
        int i12;
        if (this.n == null) {
            return;
        }
        int i13 = this.d;
        org.telegram.ui.Cells.s1 cell = this.root.getCell();
        String str = null;
        if (i13 != zb1.e(cell != null ? cell.getResourcesProvider() : null, this.root.isOut())) {
            org.telegram.ui.Cells.s1 cell2 = this.root.getCell();
            org.telegram.ui.ActionBar.u6 resourcesProvider = cell2 != null ? cell2.getResourcesProvider() : null;
            this.d = zb1.e(resourcesProvider, this.root.isOut());
            jb1 jb1Var = this.b;
            String a2 = zb1.a(resourcesProvider, this.root.isOut());
            if (a2 == null) {
                jb1Var.getClass();
            } else if (!a2.equals(jb1Var.s)) {
                jb1Var.s = a2;
                jb1Var.m = a2.contains("\"dark\"");
                yb1 yb1Var2 = jb1Var.f;
                if (yb1Var2 != null) {
                    yb1Var2.d(a2);
                }
            }
        }
        this.y = isInQuote() ? 0 : Math.max(0, Math.min(g(), this.root.padLeft - AndroidUtilities.dp(2.0f)));
        int q5 = q();
        float f12 = this.x;
        org.telegram.ui.Cells.r1 transitionParams = (this.I == 0 || this.root.getCell() == null) ? null : this.root.getCell().getTransitionParams();
        if (transitionParams == null || !transitionParams.w0) {
            if (transitionParams != null && (this.J || SystemClock.uptimeMillis() - this.I > 250)) {
                this.I = 0L;
                this.J = false;
            }
            f7 = 0.0f;
            f10 = 0.0f;
        } else {
            this.J = true;
            f10 = transitionParams.j0 + 0.0f;
            f12 += transitionParams.i0;
            f7 = f() ? transitionParams.i0 : transitionParams.j0;
        }
        if (f()) {
            f7 += this.x - h();
        }
        canvas.save();
        canvas.translate(-this.y, 0.0f);
        Path path = this.e;
        path.rewind();
        int i14 = SharedConfig.bubbleRadius;
        if (i14 > 2) {
            i14 -= 2;
        }
        int dp = AndroidUtilities.dp(i14);
        int min2 = Math.min(AndroidUtilities.dp(3.0f), dp);
        boolean z12 = this.c;
        float f13 = (!z12 || this.root.hasNameOffset() || (!this.root.isOut() && this.root.isPinnedTop())) ? min2 : dp;
        float f14 = (!z12 || (this.root.isOut() && this.root.isPinnedTop())) ? min2 : dp;
        float[] fArr = this.f;
        fArr[1] = f13;
        fArr[0] = f13;
        fArr[3] = f14;
        fArr[2] = f14;
        float f15 = min2;
        fArr[7] = f15;
        fArr[6] = f15;
        fArr[5] = f15;
        fArr[4] = f15;
        RectF rectF = AndroidUtilities.rectTmp;
        float f16 = q5;
        rectF.set(0.0f, f10, f16, f12);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(0.0f, f7);
        pb1 pb1Var = this.n;
        float f17 = pb1Var.b;
        pb1Var.Q = q5;
        jb1 jb1Var2 = pb1Var.p;
        vb1 i15 = jb1Var2 == null ? null : jb1Var2.i();
        if (i15 != null) {
            wb1[] wb1VarArr2 = i15.b;
            cb1 cb1Var2 = i15.a;
            int i16 = i15.d;
            if (i16 > 0 && cb1Var2.b(canvas)) {
                if (!i15.a()) {
                    pb1Var.p.h();
                }
                vb1 vb1Var = pb1Var.o;
                if (i15 != vb1Var) {
                    c10 = 2;
                    ob1 ob1Var = pb1Var.n;
                    c11 = 3;
                    Handler handler = pb1Var.c;
                    boolean z13 = vb1Var == null;
                    pb1Var.o = i15;
                    handler.removeCallbacks(ob1Var);
                    if (SharedConfig.widgetStaticLayers) {
                        if (z13) {
                            cb1Var2.g();
                        } else {
                            cb1Var = cb1Var2;
                            handler.postDelayed(ob1Var, 333L);
                        }
                    }
                    cb1Var = cb1Var2;
                } else {
                    cb1Var = cb1Var2;
                    c10 = 2;
                    c11 = 3;
                }
                boolean z14 = Math.abs(i16 - q5) > 1;
                if (z14) {
                    canvas.save();
                    float f18 = f16 / i16;
                    canvas.scale(f18, f18);
                }
                cb1Var.d(canvas, 1.0f);
                if (wb1VarArr2.length > 0) {
                    Matrix matrix = pb1Var.e;
                    float[] fArr2 = pb1Var.j;
                    Path path2 = pb1Var.h;
                    RectF rectF2 = pb1Var.i;
                    float[] fArr3 = pb1Var.g;
                    double nanoTime = (System.nanoTime() / 1.0E9d) + i15.c;
                    int length = wb1VarArr2.length;
                    int i17 = 0;
                    boolean z15 = false;
                    while (i17 < length) {
                        wb1 wb1Var = wb1VarArr2[i17];
                        float[] fArr4 = wb1Var.g;
                        boolean z16 = z14;
                        float[] fArr5 = wb1Var.c;
                        cb1 cb1Var3 = wb1Var.a;
                        int length2 = fArr4.length / 8;
                        if (length2 == 0 || !cb1Var3.f()) {
                            f11 = f17;
                            i10 = length;
                            i11 = i17;
                            wb1VarArr = wb1VarArr2;
                            c12 = 0;
                        } else {
                            f11 = f17;
                            i10 = length;
                            i11 = i17;
                            wb1VarArr = wb1VarArr2;
                            double max = Math.max(0.0d, nanoTime - wb1Var.d);
                            double d = wb1Var.e;
                            if (d <= 0.0d) {
                                min = 1.0d;
                            } else if (wb1Var.f) {
                                min = (max % d) / d;
                                z15 = true;
                            } else {
                                min = Math.min(1.0d, max / d);
                                z15 |= min < 1.0d;
                            }
                            float[] fArr6 = wb1Var.g;
                            float f19 = (float) min;
                            int i18 = 0;
                            while (true) {
                                i12 = i18 + 1;
                                if (i12 >= length2 || fArr6[i12 * 8] > f19) {
                                    break;
                                } else {
                                    i18 = i12;
                                }
                            }
                            int min3 = Math.min(i12, length2 - 1);
                            int i19 = i18 * 8;
                            float f20 = fArr6[i19];
                            int i20 = min3 * 8;
                            float f21 = fArr6[i20];
                            float max2 = Math.max(0.0f, Math.min(1.0f, (min3 == i18 || f21 <= f20) ? 0.0f : (f19 - f20) / (f21 - f20)));
                            int i21 = 0;
                            while (i21 < 7) {
                                float f22 = fArr6[i19 + 1 + i21];
                                int i22 = i21;
                                fArr3[i22] = c3.h0.z(fArr6[i20 + 1 + i21], f22, max2, f22);
                                i21 = i22 + 1;
                            }
                            canvas.save();
                            float[] fArr7 = wb1Var.b;
                            if (fArr7 != null) {
                                float f23 = fArr7[0];
                                float f24 = fArr7[1];
                                rectF2.set(f23 * f11, f24 * f11, (f23 + fArr7[c10]) * f11, (f24 + fArr7[c11]) * f11);
                                if (fArr5 == null) {
                                    canvas.clipRect(rectF2);
                                } else {
                                    int i23 = 0;
                                    for (int i24 = 8; i23 < i24; i24 = 8) {
                                        fArr2[i23] = fArr5[i23] * f11;
                                        i23++;
                                    }
                                    path2.rewind();
                                    path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
                                    canvas.clipPath(path2);
                                }
                            }
                            float[] fArr8 = pb1Var.f;
                            fArr8[0] = fArr3[0];
                            fArr8[1] = fArr3[c10];
                            fArr8[c10] = fArr3[4] * f11;
                            fArr8[c11] = fArr3[1];
                            fArr8[4] = fArr3[c11];
                            fArr8[5] = fArr3[5] * f11;
                            fArr8[6] = 0.0f;
                            fArr8[7] = 0.0f;
                            c12 = 0;
                            fArr8[8] = 1.0f;
                            matrix.setValues(fArr8);
                            canvas.concat(matrix);
                            cb1Var3.d(canvas, Math.max(0.0f, Math.min(1.0f, fArr3[6])));
                            canvas.restore();
                        }
                        f17 = f11;
                        length = i10;
                        wb1VarArr2 = wb1VarArr;
                        i17 = i11 + 1;
                        z14 = z16;
                    }
                    z11 = z14;
                    if (z15 && pb1Var.q) {
                        z10 = true;
                        if (z11) {
                            canvas.restore();
                        }
                        if (z10 && (view = this.view) != null) {
                            view.postInvalidateOnAnimation();
                        }
                        canvas.restore();
                    }
                } else {
                    z11 = z14;
                }
                z10 = false;
                if (z11) {
                }
                if (z10) {
                    view.postInvalidateOnAnimation();
                }
                canvas.restore();
            }
        }
        if (!pb1Var.r) {
            jb1 jb1Var3 = pb1Var.p;
            if (jb1Var3 != null) {
                jb1Var3.h();
            }
            jb1 jb1Var4 = pb1Var.p;
            if (jb1Var4 != null && (yb1Var = jb1Var4.f) != null) {
                str = yb1Var.L;
            }
            canvas.drawText(LocaleController.getString(str == null ? R.string.WidgetLoading : R.string.WidgetLoadFailed), f17 * 12.0f, 28.0f * f17, pb1Var.d);
        }
        z10 = false;
        if (z10) {
        }
        canvas.restore();
    }

    @Override // org.telegram.messenger.RichMessageLayout.RichBlock
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.n == null || !this.r) {
            return false;
        }
        motionEvent.offsetLocation(this.y, 0.0f);
        try {
            return this.n.m(motionEvent);
        } finally {
            motionEvent.offsetLocation(-this.y, 0.0f);
        }
    }

    public final void p() {
        db1 d;
        if (this.r) {
            this.r = false;
            AndroidUtilities.cancelRunOnUIThread(this.w);
            pb1 pb1Var = this.n;
            if (pb1Var.q) {
                pb1Var.q = false;
                jb1 jb1Var = pb1Var.p;
                if (jb1Var != null && !pb1Var.r) {
                    jb1Var.k(false);
                }
            }
            this.n.p();
            jb1 jb1Var2 = this.b;
            if (jb1Var2 == null || (d = fb1.d(jb1Var2)) == null) {
                return;
            }
            d.m = Math.max(0, d.m - 1);
            d.n = System.currentTimeMillis();
            fb1.q();
            fb1.f();
        }
    }

    public final int q() {
        return (g() * 2) + this.maxWidth;
    }
}
