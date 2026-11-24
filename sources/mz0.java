// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class mz0 extends my0 {
    public static final /* synthetic */ int R1 = 0;
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public boolean F1;
    public boolean G1;
    public ln H1;
    public boolean I1;
    public boolean J1;
    public du3 K1;
    public boolean L1;
    public boolean M1;
    public float N1;
    public int O1;
    public int P1;
    public int Q1;
    public final Drawable l1;
    public final zs m1;
    public final r59 n1;
    public final iz0 o1;
    public boolean p1;
    public int q1;
    public final d r1;
    public final boolean s1;
    public final gz0 t1;
    public float u1;
    public boolean v1;
    public float w1;
    public boolean x1;
    public boolean y1;
    public final RectF z1;

    public mz0(Context context, d dVar, lz0 lz0Var) {
        super(lz0Var.b, lz0Var.g, context, lz0Var.a);
        ela elaVar;
        this.u1 = 0.4f;
        byte b = 1;
        this.v1 = true;
        this.w1 = 1.0f;
        this.x1 = false;
        this.z1 = new RectF();
        this.Q1 = 1;
        this.A1 = 0;
        this.B1 = 0;
        this.C1 = 0;
        this.D1 = 0;
        this.E1 = 0;
        this.F1 = true;
        this.G1 = false;
        this.I1 = false;
        this.O1 = -1;
        boolean z = lz0Var.c;
        boolean z2 = lz0Var.d;
        boolean z3 = lz0Var.e;
        int i = lz0Var.f;
        this.r1 = dVar;
        this.s1 = z;
        this.l1 = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z2) {
            gz0 gz0Var = new gz0(this, context, z3, z);
            this.t1 = gz0Var;
            elaVar = gz0Var;
        } else {
            elaVar = new hz0(this, context, z3, z);
        }
        r59 H0 = H0(context);
        this.n1 = H0;
        zs zsVar = new zs(b);
        this.m1 = zsVar;
        if (z3) {
            zsVar.k1(true);
        }
        H0.setLayoutManager(zsVar);
        gz0 gz0Var2 = this.t1;
        if (gz0Var2 != null) {
            gz0Var2.setBottomSheetContainerView(this.c);
            this.t1.setTargetListView(H0);
        }
        if (z) {
            H0.setHasFixedSize(true);
            H0.setAdapter(G0(H0));
            this.O = elaVar;
            elaVar.addView(H0, qoe.c(-2.0f, -1));
        } else {
            H0.setAdapter(new kz0(this, G0(H0), context));
            this.b = elaVar;
            iz0 iz0Var = new iz0(this, context, elaVar);
            this.o1 = iz0Var;
            anb.h(cmb.g5, this.J0, iz0Var);
            anb.l(iz0Var, 5, cmb.F6, this.J0);
            anb.l(iz0Var, 3, cmb.y8, this.J0);
            iz0Var.setBackButtonImage(R.drawable.ic_ab_back);
            anb.l(iz0Var, 1, cmb.x8, this.J0);
            iz0Var.setCastShadows(true);
            iz0Var.setTitle(J0());
            iz0Var.setActionBarMenuOnItemClick(new r8(this, (byte) 11));
            elaVar.addView(H0);
            elaVar.addView(iz0Var, qoe.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            H0.j(new y(elaVar, (byte) 10));
        }
        if (i == 2) {
            T0();
        }
        P0(elaVar);
        V0();
    }

    @Override // my0
    public boolean C() {
        return false;
    }

    public final void D0() {
        r59 r59Var = this.n1;
        if (r59Var == null || r59Var.getLayoutManager() == null || this.O1 < 0) {
            return;
        }
        int top = (this.P1 - this.b.getTop()) - r59Var.getPaddingTop();
        if (r59Var.getLayoutManager() instanceof u46) {
            ((u46) r59Var.getLayoutManager()).g1(this.O1, top);
        }
        this.O1 = -1;
    }

    public boolean E0(View view, float f, float f2) {
        return true;
    }

    public final void F0() {
        hd hdVar = this.Z;
        if (hdVar == null || this.b == null || this.s0 == null || !U0() || this.s1) {
            return;
        }
        Rect bounds = this.s0.getBounds();
        if (this.b.getMeasuredWidth() >= this.c.getMeasuredWidth()) {
            hdVar.c(((this.b.getMeasuredHeight() - bounds.top) - gm.L(30.0f)) - ((int) this.b.getTranslationY()));
        } else {
            hdVar.c(0);
        }
    }

    public q59 G0(r59 r59Var) {
        return new ny0(this, (byte) 6);
    }

    public r59 H0(Context context) {
        return new fv(this, context, this.J0, (byte) 2);
    }

    public int I0() {
        return gm.L(56.0f);
    }

    public CharSequence J0() {
        return jb6.M0(2131743916, null);
    }

    public final boolean K0() {
        return on2.h(cmb.v0(cmb.g5, this.J0)) > 0.699999988079071d;
    }

    public final void Q0(Canvas canvas, FrameLayout frameLayout) {
        int i = this.Q1;
        Drawable drawable = this.l1;
        iz0 iz0Var = this.o1;
        if (i == 1) {
            boolean z = this.v1;
            float f = this.w1;
            if (z) {
                if (f != 1.0f) {
                    this.w1 = f + 0.10666667f;
                    frameLayout.invalidate();
                }
            } else if (f != 0.0f) {
                this.w1 = f - 0.10666667f;
                frameLayout.invalidate();
            }
            this.w1 = Utilities.i(this.w1, 1.0f, 0.0f);
            if (iz0Var != null && iz0Var.getVisibility() == 0 && iz0Var.getAlpha() != 0.0f && this.w1 != 0.0f) {
                drawable.setBounds(this.u0, iz0Var.getBottom(), frameLayout.getMeasuredWidth() - this.u0, drawable.getIntrinsicHeight() + iz0Var.getBottom());
                drawable.setAlpha((int) (iz0Var.getAlpha() * 255.0f * this.w1));
                drawable.draw(canvas);
                if (drawable.getAlpha() < 255) {
                    frameLayout.invalidate();
                }
            }
            this.p1 = true;
        } else if (i == 2 && ((int) (this.w1 * 255.0f)) != 0 && this.v1) {
            drawable.setBounds(this.u0, iz0Var.getBottom() + ((int) iz0Var.getTranslationY()), frameLayout.getMeasuredWidth() - this.u0, drawable.getIntrinsicHeight() + iz0Var.getBottom() + ((int) iz0Var.getTranslationY()));
            drawable.setAlpha((int) (this.w1 * 255.0f));
            drawable.draw(canvas);
        }
        if (this.M1) {
            canvas.restore();
            this.M1 = false;
        }
    }

    public void R0(Canvas canvas, View view) {
        int i;
        this.M1 = false;
        if (this.s1) {
            return;
        }
        boolean z = this.J1;
        r59 r59Var = this.n1;
        if (z) {
            int height = r59Var.getHeight();
            for (int i2 = 0; i2 < r59Var.getChildCount(); i2++) {
                View childAt = r59Var.getChildAt(i2);
                int R = RecyclerView.R(childAt);
                if (R != -1 && R != r59Var.getAdapter().b() - 1) {
                    height = Math.min(height, childAt.getTop() + (this.I1 ? (int) childAt.getTranslationY() : 0));
                }
            }
            i = height - gm.L(16.0f);
        } else {
            u69 K = r59Var.K(0);
            int i3 = -gm.L(16.0f);
            if (K != null) {
                View view2 = K.a;
                i3 = view2.getBottom() - gm.L(16.0f);
                if (this.I1) {
                    i = ((int) view2.getTranslationY()) + i3;
                }
            }
            i = i3;
        }
        int i4 = (i - ((this.B1 + this.C1) + this.D1)) + this.E1;
        if (this.x1 && this.y1) {
            i4 -= gm.L(this.Q1 == 2 ? 8.0f : 16.0f);
        }
        float f = i4;
        this.N1 = f;
        O0(f);
        int i5 = this.Q1;
        float f2 = 1.0f;
        iz0 iz0Var = this.o1;
        if (i5 == 1) {
            float L = 1.0f - ((gm.L(16.0f) + i4) / I0());
            if (L < 0.0f) {
                L = 0.0f;
            }
            gm.T3(iz0Var, L != 0.0f, 1.0f, true, this.p1);
        } else if (i5 == 2) {
            float max = Math.max(((gm.L(8.0f) + (i4 - this.E1)) + this.C1) - gm.m, 0.0f);
            float e = this.H1.e(false, max == 0.0f ? 1.0f : 0.0f);
            if (e != 0.0f && e != 1.0f) {
                canvas.save();
                canvas.clipRect(0.0f, max, this.b.getMeasuredWidth(), this.b.getMeasuredHeight());
                this.M1 = true;
            }
            this.w1 = e;
            f2 = gm.R1(1.0f, 0.5f, e);
            iz0Var.e.setAlpha(e);
            L0(e);
            iz0Var.e.setScaleX(e);
            iz0Var.e.setPivotY(r6.getMeasuredHeight() / 2.0f);
            iz0Var.e.setScaleY(e);
            lka titleTextView = iz0Var.getTitleTextView();
            titleTextView.setTranslationX(gm.R1(gm.L(21.0f) - titleTextView.getLeft(), 0.0f, e) + 0.0f);
            if (this.L1) {
                titleTextView.setTranslationX(((iz0Var.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
            }
            iz0Var.setTranslationY(max);
            i4 -= gm.U1(e, 0, gm.L(13.0f) + (((this.A1 - this.B1) - this.C1) - this.D1));
            iz0Var.getBackground().setBounds(0, gm.U1(e, iz0Var.getHeight(), 0), iz0Var.getWidth(), iz0Var.getHeight());
            boolean z2 = this.G1;
            if (e > 0.5f) {
                if (z2) {
                    this.G1 = false;
                    iz0Var.setTag(1);
                }
            } else if (!z2) {
                this.G1 = true;
                iz0Var.setTag(null);
            }
        }
        if (U0()) {
            boolean z3 = this instanceof ap0;
            Drawable drawable = this.s0;
            if (z3) {
                drawable.setBounds(-gm.L(6.0f), i4, gm.L(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                drawable.setBounds(0, i4, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
            F0();
            this.s0.draw(canvas);
            if (this.x1 && f2 > 0.0f) {
                int L2 = gm.L(36.0f);
                int L3 = gm.L(20.0f) + i4;
                float measuredWidth = (view.getMeasuredWidth() - L2) / 2.0f;
                float f3 = L3;
                float measuredWidth2 = (view.getMeasuredWidth() + L2) / 2.0f;
                float L4 = gm.L(4.0f) + L3;
                RectF rectF = this.z1;
                rectF.set(measuredWidth, f3, measuredWidth2, L4);
                cmb.s0.setColor(cmb.v0(cmb.yj, this.J0));
                cmb.s0.setAlpha((int) (r15.getAlpha() * f2));
                canvas.drawRoundRect(rectF, gm.L(2.0f), gm.L(2.0f), cmb.s0);
            }
        }
        M0(canvas, i4);
    }

    public final void S0() {
        r59 r59Var = this.n1;
        if (r59Var == null || this.m1 == null || r59Var.getChildCount() <= 0) {
            return;
        }
        View view = null;
        int i = -1;
        int i2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i3 = 0; i3 < r59Var.getChildCount(); i3++) {
            View childAt = r59Var.getChildAt(i3);
            int R = RecyclerView.R(childAt);
            if (R >= 0 && childAt.getTop() < i2) {
                i2 = childAt.getTop();
                view = childAt;
                i = R;
            }
        }
        if (view != null) {
            this.O1 = i;
            this.P1 = this.b.getTop() + view.getTop();
            this.h1 = System.currentTimeMillis() + 80;
        }
    }

    public final void T0() {
        if (this.s1) {
            return;
        }
        this.Q1 = 2;
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        this.B1 = currentActionBarHeight;
        this.A1 = currentActionBarHeight + gm.m;
        this.C1 = gm.L(16.0f);
        this.D1 = gm.L(-20.0f);
        this.H1 = new ln(this.b, 0L, 350L, d53.h);
        this.o1.e.setPivotX(0.0f);
        this.n1.setClipToPadding(true);
    }

    public boolean U0() {
        return true;
    }

    public final void V0() {
        if (this.i1 != null) {
            LaunchActivity.H1.H(true, true, true);
            return;
        }
        iz0 iz0Var = this.o1;
        if (iz0Var != null && iz0Var.getTag() != null) {
            gm.l3(this, K0());
            return;
        }
        d dVar = this.r1;
        if (dVar != null) {
            gm.l3(this, dVar.isLightStatusBar());
        }
    }

    public void W0() {
        iz0 iz0Var = this.o1;
        if (iz0Var != null) {
            iz0Var.setTitle(J0());
        }
    }

    public final void X0() {
        iz0 iz0Var = this.o1;
        if (iz0Var == null || TextUtils.equals(J0(), iz0Var.getTitle())) {
            return;
        }
        iz0Var.N(J0(), false, 350L, d53.h);
    }

    @Override // my0
    public void e0() {
        O0(this.N1);
        F0();
    }

    @Override // my0, ah0
    public final boolean f() {
        iz0 iz0Var = this.o1;
        if (iz0Var != null && iz0Var.getTag() != null) {
            return K0();
        }
        d dVar = this.r1;
        return dVar != null ? dVar.isLightStatusBar() : K0();
    }

    public void L0(float f) {
    }

    public void O0(float f) {
    }

    public void P0(ela elaVar) {
    }

    public void M0(Canvas canvas, int i) {
    }

    public void N0(int i, int i2) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mz0(d dVar, boolean z, boolean z2, ylb ylbVar) {
        this(r0, dVar, new lz0(r1));
        Activity parentActivity = dVar.getParentActivity();
        lz0 lz0Var = new lz0();
        lz0Var.a = z;
        lz0Var.c = false;
        lz0Var.d = z2;
        lz0Var.g = ylbVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mz0(Context context, d dVar, boolean z, boolean z2, ylb ylbVar) {
        this(context, dVar, new lz0(r0));
        lz0 lz0Var = new lz0();
        lz0Var.a = z;
        lz0Var.c = z2;
        lz0Var.d = false;
        lz0Var.g = ylbVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mz0(int i, ylb ylbVar, Context context, boolean z) {
        this(context, (d) null, new lz0(r0));
        lz0 lz0Var = new lz0();
        lz0Var.a = z;
        lz0Var.c = false;
        lz0Var.d = false;
        lz0Var.f = i;
        lz0Var.g = ylbVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mz0(Context context, d dVar, boolean z, boolean z2, int i, ylb ylbVar) {
        this(context, dVar, new lz0(r0));
        lz0 lz0Var = new lz0();
        lz0Var.a = z;
        lz0Var.c = false;
        lz0Var.d = false;
        lz0Var.e = z2;
        lz0Var.f = i;
        lz0Var.g = ylbVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mz0(ylb ylbVar, Context context, boolean z) {
        this(context, (d) null, new lz0(r0));
        lz0 lz0Var = new lz0();
        lz0Var.a = z;
        lz0Var.b = 2;
        lz0Var.c = false;
        lz0Var.d = false;
        lz0Var.e = false;
        lz0Var.f = 2;
        lz0Var.g = ylbVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mz0(d dVar, boolean z) {
        this(r0, dVar, new lz0(r1));
        Activity parentActivity = dVar.getParentActivity();
        lz0 lz0Var = new lz0();
        lz0Var.a = false;
        lz0Var.c = z;
        lz0Var.g = dVar.getResourceProvider();
    }
}
