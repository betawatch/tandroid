package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bn0 extends RichMessageLayout.RichBlock implements tb1 {
    public static final AtomicInteger M = new AtomicInteger();
    public static Paint N;
    public static Drawable O;
    public String E;
    public ic1 F;
    public org.telegram.ui.Cells.da[] G;
    public boolean H;
    public long I;
    public boolean J;
    public final RectF K;
    public boolean L;
    public final TL_iv.pageBlockEmbed a;
    public nb1 b;
    public final boolean c;
    public int d;
    public final Path e;
    public final float[] f;
    public final int h;
    public ub1 n;
    public boolean r;
    public long s;
    public boolean v;
    public final xa0 w;
    public int x;
    public int y;

    public bn0(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockEmbed pageblockembed, boolean z10) {
        super(richMessageLayout, rect, i10);
        this.e = new Path();
        this.f = new float[8];
        this.h = M.incrementAndGet();
        this.w = new xa0(this, 22);
        this.K = new RectF();
        this.a = pageblockembed;
        this.c = z10;
        this.b = jb1.i(pageblockembed.url);
        this.x = m();
        String k10 = jb1.k(pageblockembed.url, this.b, u());
        this.E = k10;
        if (k10.equals("placeholder") || this.E.startsWith("cache of width")) {
            AndroidUtilities.runOnUIThread(new bi.u8(pageblockembed.url, u(), richMessageLayout.isOut(), 5));
        }
        String str = pageblockembed.url;
        ConcurrentHashMap concurrentHashMap = jb1.a;
        gb1 gb1Var = (gb1) concurrentHashMap.get(str);
        bn0 bn0Var = gb1Var == null ? null : gb1Var.t;
        if (bn0Var != null && bn0Var != this && bn0Var.x != this.x) {
            o(bn0Var.x, "new layout, width " + Math.round(bn0Var.u() / AndroidUtilities.density) + " -> " + Math.round(u() / AndroidUtilities.density), bn0Var.E, false);
        }
        gb1 gb1Var2 = (gb1) concurrentHashMap.get(pageblockembed.url);
        if (gb1Var2 != null) {
            gb1Var2.t = this;
        }
    }

    public static int l() {
        int i10 = SharedConfig.bubbleRadius;
        return (AndroidUtilities.dp(9.0f) + (i10 >= 15 ? AndroidUtilities.dp(2.0f) : i10 >= 11 ? AndroidUtilities.dp(1.0f) : 0)) - AndroidUtilities.dp(2.0f);
    }

    @Override // org.telegram.ui.Components.tb1
    public final void b() {
        org.telegram.ui.Cells.s1 cell = this.root.getCell();
        if (cell == null || cell.Jc == null) {
            return;
        }
        try {
            cell.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        cell.Jc.j0(cell, cell.g1, cell.h1);
    }

    @Override // org.telegram.ui.Components.tb1
    public final void c(String str) {
        View view = this.view;
        if (view == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        an0.a(view, str);
    }

    @Override // org.telegram.ui.Components.tb1
    public final void d() {
        nb1 nb1Var = this.b;
        ac1 l4 = nb1Var == null ? null : nb1Var.l();
        ic1 ic1Var = l4 == null ? null : l4.f;
        if (ic1Var != this.F) {
            this.F = ic1Var;
            if (ic1Var != null) {
                ArrayList arrayList = ic1Var.a;
                this.G = new org.telegram.ui.Cells.da[arrayList.size()];
                int i10 = 0;
                while (true) {
                    org.telegram.ui.Cells.da[] daVarArr = this.G;
                    if (i10 >= daVarArr.length) {
                        break;
                    }
                    daVarArr[i10] = new li.a0(this, (gc1) arrayList.get(i10));
                    i10++;
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

    @Override // org.telegram.ui.Components.tb1
    public final void e() {
        ac1 ac1Var;
        xa0 xa0Var = this.w;
        AndroidUtilities.cancelRunOnUIThread(xa0Var);
        if (this.v) {
            if (SystemClock.uptimeMillis() - this.s < 1500) {
                AndroidUtilities.runOnUIThread(xa0Var, 200L);
                return;
            } else {
                if (m() != this.x) {
                    r("on screen", true);
                    return;
                }
                return;
            }
        }
        dc1 dc1Var = this.b.f;
        if (dc1Var == null || (ac1Var = dc1Var.E) == null || !(ac1Var.g || dc1Var.w)) {
            AndroidUtilities.runOnUIThread(xa0Var, 1500L);
            return;
        }
        this.v = true;
        this.s = SystemClock.uptimeMillis();
        if (m() != this.x) {
            r("on screen, loaded", true);
        }
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

    @Override // org.telegram.messenger.RichMessageLayout.RichBlock
    public final boolean isHorizontallyDragging() {
        ub1 ub1Var = this.n;
        if (ub1Var == null || !this.r || !ub1Var.w || (ub1Var.K & 3) == 2) {
            return false;
        }
        return ub1Var.z || ub1Var.n();
    }

    public final boolean k() {
        boolean z10;
        String str = this.a.url;
        nb1 nb1Var = this.b;
        if (nb1Var != null) {
            ConcurrentHashMap concurrentHashMap = jb1.a;
            if (nb1Var.i > 0) {
                return nb1Var.l;
            }
        }
        gb1 gb1Var = jb1.m(str) ? (gb1) jb1.a.get(str) : null;
        hb1 hb1Var = gb1Var != null ? (hb1) jb1.b.get(gb1Var.a()) : null;
        if (hb1Var != null) {
            synchronized (hb1Var) {
                if (!hb1Var.a.isEmpty() && ((int[]) hb1Var.a.get(0)).length > 2) {
                    if (((int[]) hb1Var.a.get(0))[2] != 0) {
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

    public final int m() {
        return jb1.d(this.a.url, this.b, u());
    }

    public final View n() {
        return this.view;
    }

    public final void o(int i10, String str, String str2, boolean z10) {
        String str3;
        if (BuildVars.LOGS_ENABLED) {
            long j10 = -1;
            long uptimeMillis = this.r ? SystemClock.uptimeMillis() - this.s : -1L;
            ub1 ub1Var = this.n;
            if (ub1Var != null && ub1Var.s != 0) {
                j10 = SystemClock.uptimeMillis() - ub1Var.s;
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
            sb2.append(Math.round(u() / AndroidUtilities.density));
            String str4 = "";
            sb2.append(z10 ? ", animated" : "");
            sb2.append(this.view != null ? ", on screen" : ", off screen");
            sb2.append(uptimeMillis >= 0 ? b10.i(uptimeMillis, ", running ", " ms") : ", not running");
            if (this.b != null) {
                StringBuilder sb3 = new StringBuilder(", session ");
                sb3.append(this.b.q);
                sb3.append(this.b.g != null ? " (snapshot)" : "");
                dc1 dc1Var = this.b.f;
                sb3.append((dc1Var == null || !dc1Var.z) ? ", scripts held" : "");
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

    @Override // org.telegram.messenger.RichMessageLayout.RichBlock
    public final void onAttachedToWindow() {
        nb1 nb1Var = this.b;
        TL_iv.pageBlockEmbed pageblockembed = this.a;
        if (nb1Var == null) {
            this.b = jb1.i(pageblockembed.url);
        }
        if (this.b == null) {
            return;
        }
        if (this.n == null) {
            this.n = new ub1(this, AndroidUtilities.density);
        }
        gb1 gb1Var = (gb1) jb1.a.get(pageblockembed.url);
        if (gb1Var != null) {
            ArrayList arrayList = gb1Var.u;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            if (jb1.o(arrayList) != this) {
                ub1 ub1Var = this.n;
                nb1 nb1Var2 = this.b;
                ub1Var.q();
                ub1Var.p = nb1Var2;
                ub1Var.r = nb1Var2 != null;
                return;
            }
            bn0 bn0Var = gb1Var.v;
            gb1Var.v = this;
            if (bn0Var != null && bn0Var != this && bn0Var.r && bn0Var.n != null) {
                bn0Var.t();
                ub1 ub1Var2 = bn0Var.n;
                nb1 nb1Var3 = bn0Var.b;
                ub1Var2.q();
                ub1Var2.p = nb1Var3;
                ub1Var2.r = nb1Var3 != null;
                View view = bn0Var.view;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        s();
    }

    @Override // org.telegram.messenger.RichMessageLayout.RichBlock
    public final void onDetachedFromWindow() {
        ub1 ub1Var;
        if (this.n == null) {
            return;
        }
        t();
        this.n.q();
        gb1 gb1Var = (gb1) jb1.a.get(this.a.url);
        if (gb1Var == null) {
            return;
        }
        ArrayList arrayList = gb1Var.u;
        arrayList.remove(this);
        if (gb1Var.v != this) {
            return;
        }
        bn0 o10 = jb1.o(arrayList);
        gb1Var.v = o10;
        if (o10 == null || o10.r || o10.view == null || (ub1Var = o10.n) == null || o10.b == null) {
            return;
        }
        ub1Var.q();
        o10.s();
        o10.view.invalidate();
    }

    @Override // org.telegram.messenger.RichMessageLayout.RichBlock
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        View view;
        if (this.n == null) {
            return;
        }
        int i10 = this.d;
        org.telegram.ui.Cells.s1 cell = this.root.getCell();
        if (i10 != ec1.e(cell != null ? cell.getResourcesProvider() : null, this.root.isOut())) {
            org.telegram.ui.Cells.s1 cell2 = this.root.getCell();
            org.telegram.ui.ActionBar.u6 resourcesProvider = cell2 != null ? cell2.getResourcesProvider() : null;
            this.d = ec1.e(resourcesProvider, this.root.isOut());
            this.b.o(ec1.a(resourcesProvider, this.root.isOut()));
        }
        this.y = isInQuote() ? 0 : Math.max(0, Math.min(l(), this.root.padLeft - AndroidUtilities.dp(2.0f)));
        int u10 = u();
        float f11 = this.x;
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
            f11 += transitionParams.i0;
            f7 = k() ? transitionParams.i0 : transitionParams.j0;
        }
        if (k()) {
            f7 += this.x - m();
        }
        canvas.save();
        canvas.translate(-this.y, 0.0f);
        this.e.rewind();
        boolean z10 = this.c;
        int i11 = SharedConfig.bubbleRadius;
        if (i11 > 2) {
            i11 -= 2;
        }
        int dp = AndroidUtilities.dp(i11);
        int min = Math.min(AndroidUtilities.dp(3.0f), dp);
        float f12 = (!z10 || this.root.hasNameOffset() || (!this.root.isOut() && this.root.isPinnedTop())) ? min : dp;
        float f13 = (!z10 || (this.root.isOut() && this.root.isPinnedTop())) ? min : dp;
        float[] fArr = this.f;
        fArr[1] = f12;
        fArr[0] = f12;
        fArr[3] = f13;
        fArr[2] = f13;
        float f14 = min;
        fArr[7] = f14;
        fArr[6] = f14;
        fArr[5] = f14;
        fArr[4] = f14;
        RectF rectF = AndroidUtilities.rectTmp;
        float f15 = u10;
        rectF.set(0.0f, f10, f15, f11);
        this.e.addRoundRect(rectF, this.f, Path.Direction.CW);
        canvas.clipPath(this.e);
        canvas.translate(0.0f, f7);
        if (this.n.b(canvas, u10) && (view = this.view) != null) {
            view.postInvalidateOnAnimation();
        }
        canvas.restore();
        String str = this.a.url;
        gb1 gb1Var = jb1.m(str) ? (gb1) jb1.a.get(str) : null;
        if (gb1Var == null || !gb1Var.i) {
            this.K.setEmpty();
            return;
        }
        if (N == null) {
            N = new Paint(1);
            Drawable mutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_language).mutate();
            O = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        float dp2 = AndroidUtilities.dp(10.0f);
        float dp3 = AndroidUtilities.dp(7.0f);
        float f16 = LocaleController.isRTL ? dp3 + dp2 : (f15 - dp3) - dp2;
        float max = Math.max(0.0f, f10) + dp3 + dp2;
        this.K.set(f16 - dp2, max - dp2, f16 + dp2, max + dp2);
        canvas.save();
        canvas.translate(-this.y, 0.0f);
        N.setColor(this.L ? 1929379840 : 1291845632);
        canvas.drawCircle(f16, max, dp2, N);
        float dp4 = AndroidUtilities.dp(14.0f) / 2.0f;
        O.setBounds((int) (f16 - dp4), (int) (max - dp4), (int) (f16 + dp4), (int) (max + dp4));
        O.draw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.messenger.RichMessageLayout.RichBlock
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.n == null || !this.r) {
            return false;
        }
        String str = this.a.url;
        gb1 gb1Var = jb1.m(str) ? (gb1) jb1.a.get(str) : null;
        if (gb1Var != null && gb1Var.k) {
            return false;
        }
        motionEvent.offsetLocation(this.y, 0.0f);
        try {
            if (!p(motionEvent)) {
                return this.n.m(motionEvent);
            }
            motionEvent.offsetLocation(-this.y, 0.0f);
            return true;
        } finally {
            motionEvent.offsetLocation(-this.y, 0.0f);
        }
    }

    public final boolean p(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        boolean z10 = false;
        if (actionMasked == 0) {
            float dp = AndroidUtilities.dp(6.0f);
            RectF rectF = this.K;
            if (!rectF.isEmpty() && motionEvent.getX() >= rectF.left - dp && motionEvent.getX() <= rectF.right + dp && motionEvent.getY() >= rectF.top - dp && motionEvent.getY() <= rectF.bottom + dp) {
                z10 = true;
            }
            this.L = z10;
            if (z10 && (view = this.view) != null) {
                view.invalidate();
            }
            return this.L;
        }
        if (!this.L) {
            return false;
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.L = false;
            View view2 = this.view;
            if (view2 != null) {
                view2.invalidate();
            }
            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
            if (actionMasked == 1 && U != null) {
                org.telegram.messenger.t.q(R.string.WidgetNetworkMarker, wc.b0(U), R.raw.info, 36);
            }
        }
        return true;
    }

    public final void q(String str) {
        if (this.view != null) {
            nb1 nb1Var = this.b;
            if ((nb1Var == null || nb1Var.i <= 0) && m() != this.x) {
                r("on screen: ".concat(str), false);
                return;
            }
            return;
        }
        int m10 = m();
        int i10 = this.x;
        if (m10 == i10) {
            return;
        }
        String str2 = this.E;
        this.x = m10;
        this.E = jb1.k(this.a.url, this.b, u());
        o(i10, "away: ".concat(str), str2, false);
        this.root.reposition();
        MessageObject messageObject = this.root.messageObject;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
        }
        this.H = true;
    }

    public final void r(String str, boolean z10) {
        int m10 = m();
        int i10 = this.x;
        boolean z11 = false;
        boolean z12 = m10 != i10;
        String str2 = this.E;
        this.x = m10;
        this.E = jb1.k(this.a.url, this.b, u());
        if (z12) {
            o(i10, str, str2, z10);
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
        if (z12 && !k() && (cell.getParent() instanceof RecyclerView)) {
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

    public final void s() {
        MessageObject messageObject;
        ac1 ac1Var;
        this.r = true;
        this.s = SystemClock.uptimeMillis();
        dc1 dc1Var = this.b.f;
        this.v = (dc1Var == null || (ac1Var = dc1Var.E) == null || (!ac1Var.g && !dc1Var.w)) ? false : true;
        this.b.q(u());
        org.telegram.ui.Cells.s1 cell = this.root.getCell();
        org.telegram.ui.ActionBar.u6 resourcesProvider = cell != null ? cell.getResourcesProvider() : null;
        this.d = ec1.e(resourcesProvider, this.root.isOut());
        this.b.o(ec1.a(resourcesProvider, this.root.isOut()));
        ub1 ub1Var = this.n;
        nb1 nb1Var = this.b;
        if (ub1Var.p != nb1Var) {
            ub1Var.q();
            ub1Var.p = nb1Var;
            if (nb1Var != null) {
                nb1Var.h = ub1Var;
                nb1Var.p(ub1Var.q);
            }
        }
        this.n.p(true);
        gb1 gb1Var = (gb1) jb1.a.get(this.a.url);
        if (gb1Var != null) {
            gb1Var.t = this;
        }
        jb1.r(this.b);
        boolean z10 = this.H && (messageObject = this.root.messageObject) != null && messageObject.forceUpdate;
        this.H = false;
        if (z10 || m() != this.x) {
            AndroidUtilities.runOnUIThread(new d60(1, this, z10));
        }
    }

    public final void t() {
        if (this.r) {
            this.r = false;
            AndroidUtilities.cancelRunOnUIThread(this.w);
            this.n.p(false);
            this.n.q();
            nb1 nb1Var = this.b;
            if (nb1Var != null) {
                jb1.q(nb1Var);
            }
        }
    }

    public final int u() {
        return (l() * 2) + this.maxWidth;
    }
}
