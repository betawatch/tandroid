// default package

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class e32 extends p02 {
    public final t14 n;
    public final o39 r;
    public final t26 s;
    public final HorizontalScrollView w;
    public final boolean x;

    public e32(x02 x02Var, Context context, wjb wjbVar, boolean z) {
        super(x02Var, wjbVar, context);
        this.x = z;
        this.f = true;
        d dVar = x02Var.Z1;
        boolean z2 = !z;
        t14 t14Var = new t14(dVar, z2, z, false, getContext(), true, null, null, false, wjbVar, false, true);
        this.n = t14Var;
        t14Var.x0 = false;
        t14Var.I(z2, z, false, false);
        t14Var.o2 = true;
        jz3 jz3Var = t14Var.y;
        if (jz3Var != null) {
            jz3Var.setVisibility(8);
        }
        t14Var.p2 = true;
        ImageView imageView = t14Var.E;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        t14Var.S2 = true;
        addView(t14Var, nme.c(-1.0f, -1));
        HorizontalScrollView x = t14Var.x(z2 ? 1 : 0);
        this.w = x;
        o39 w = t14Var.w(z2 ? 1 : 0);
        this.r = w;
        w.j(new y(this, (byte) 20));
        this.s = (t26) w.getLayoutManager();
        x.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // p02
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(int i, int i2) {
        int i3;
        int L;
        int L2;
        o39 o39Var;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        if (!gl.O1()) {
            Point point = gl.q;
            if (point.x > point.y) {
                i3 = (int) (i2 / 3.5f);
                L = i3 - gl.L(52.0f);
                if (L < 0) {
                    L = 0;
                }
                L2 = gl.L(36.0f) + L;
                o39Var = this.r;
                if (o39Var.getPaddingTop() == L2) {
                    o39Var.setPadding(gl.L(6.0f), L2, gl.L(6.0f), gl.L(48.0f));
                    return;
                }
                return;
            }
        }
        i3 = (i2 / 5) << 1;
        L = i3 - gl.L(52.0f);
        if (L < 0) {
        }
        L2 = gl.L(36.0f) + L;
        o39Var = this.r;
        if (o39Var.getPaddingTop() == L2) {
        }
    }

    @Override // p02
    public final void I(p02 p02Var) {
        x02 x02Var = this.b;
        try {
            x02Var.U2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        x02Var.U2.setTitle(k96.M0(this.x ? 2131745460 : 2131745466, null));
        this.s.g1(0, 0);
    }

    @Override // p02
    public final void K() {
        this.r.z0(0);
    }

    @Override // p02
    public int getCurrentItemTop() {
        o39 o39Var = this.r;
        if (o39Var.getChildCount() <= 0) {
            o39Var.setTopGlowOffset(o39Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = o39Var.getChildAt(0);
        y29 y29Var = (y29) o39Var.G(childAt);
        int top = childAt.getTop() - gl.L(36.0f);
        int L = gl.L(7.0f);
        if (top < gl.L(7.0f) || y29Var == null || y29Var.b() != 0) {
            top = L;
        }
        o39Var.setTopGlowOffset(top);
        return top;
    }

    @Override // p02
    public int getFirstOffset() {
        return gl.L(56.0f) + getListTopPadding();
    }

    @Override // p02
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // p02
    public final int j() {
        return 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.w.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(u04 u04Var) {
        this.n.setDelegate(u04Var);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
        invalidate();
    }
}
