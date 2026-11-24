// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gs0 extends FrameLayout {
    public final a1b E;
    public final t8 F;
    public final b61 G;
    public final hu5 H;
    public boolean I;
    public boolean J;
    public final ds0 K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public float Q;
    public float R;
    public boolean S;
    public int T;
    public int U;
    public int V;
    public final Rect W;
    public t3b a;
    public final /* synthetic */ kea a0;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public final yr0 f;
    public final o7c h;
    public final sc3 n;
    public final hga r;
    public final as0 s;
    public final bs0 w;
    public final fs0 x;
    public final cs0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs0(kea keaVar, Context context) {
        super(context);
        this.a0 = keaVar;
        this.d = Utilities.j(gda.q1, 6, 2);
        this.e = Utilities.j(gda.q1, 6, 2);
        byte b = 0;
        this.I = false;
        this.J = false;
        this.W = new Rect();
        o7c o7cVar = new o7c();
        this.h = o7cVar;
        byte b2 = 1;
        o7cVar.O = new xr0(this, b2);
        o7cVar.x1(this.d);
        sc3 sc3Var = new sc3();
        this.n = sc3Var;
        sc3Var.n(280L);
        sc3Var.o(d53.h);
        sc3Var.m = false;
        yr0 yr0Var = new yr0(this, context);
        this.f = yr0Var;
        yr0Var.setScrollingTouchSlop(1);
        yr0Var.setPinnedSectionOffsetY(-gm.L(2.0f));
        yr0Var.setPadding(0, 0, 0, 0);
        yr0Var.setItemAnimator(null);
        yr0Var.setClipToPadding(false);
        yr0Var.setSectionsType(2);
        yr0Var.setLayoutManager(o7cVar);
        addView(yr0Var, qoe.c(-1.0f, -1));
        yr0Var.i(new zr0(this, b));
        yr0Var.setOnItemClickListener(new u(this, (byte) 8));
        yr0Var.setOnItemLongClickListener(new xg0(this, (byte) 12));
        hga hgaVar = new hga(context, null);
        this.r = hgaVar;
        as0 as0Var = new as0(this, b);
        this.s = as0Var;
        hgaVar.setLayoutManager(as0Var);
        hgaVar.i(new zr0(this, b2));
        as0Var.x1(this.e);
        hgaVar.setVisibility(8);
        addView(hgaVar, qoe.c(-1.0f, -1));
        bs0 bs0Var = new bs0(this, context);
        this.w = bs0Var;
        yr0Var.setAdapter(bs0Var);
        fs0 fs0Var = new fs0(this, getContext());
        bs0Var.f = fs0Var;
        this.x = fs0Var;
        hgaVar.setAdapter(fs0Var);
        cs0 cs0Var = new cs0(this, context);
        this.y = cs0Var;
        cs0Var.x = false;
        a1b a1bVar = new a1b(context, cs0Var, 1, null);
        this.E = a1bVar;
        a1bVar.setVisibility(8);
        a1bVar.setAnimateLayoutChange(true);
        addView(a1bVar, qoe.c(-1.0f, -1));
        a1bVar.setOnTouchListener(new p8((byte) 18));
        a1bVar.e(true, false);
        a1bVar.b.setVisibility(8);
        a1bVar.d.setText(jb6.M0(2131746431, null));
        a1bVar.e.setText(jb6.G(oc7.r1(keaVar.b).l4.s2.f(), "ProfileBotPreviewEmptyText", new Object[0]));
        String M0 = jb6.M0(2131746435, null);
        b61 b61Var = a1bVar.f;
        b61Var.i(M0, false, true);
        b61Var.setVisibility(0);
        b61Var.setOnClickListener(new wr0(this, b));
        t8 t8Var = new t8(this, context);
        this.F = t8Var;
        int i = cmb.x6;
        ylb ylbVar = keaVar.c;
        anb.X(t8Var, i, ylbVar);
        t8Var.setText(jb6.M0(2131746436, null));
        t8Var.setTextSize(1, 14.0f);
        t8Var.setTextAlignment(4);
        t8Var.setGravity(17);
        t8Var.setTypeface(gm.o());
        LinearLayout.LayoutParams t = qoe.t(nm7.u2, -2, 17, 0, 17, 0, 12);
        qmb qmbVar = a1bVar.a;
        qmbVar.addView(t8Var, t);
        b61 b61Var2 = new b61(ylbVar, context, false);
        this.G = b61Var2;
        b61Var2.setMinWidth(gm.L(200.0f));
        qmbVar.addView(b61Var2, qoe.r(-2, 44, 17));
        a1bVar.addView(cs0Var, 0, qoe.c(-1.0f, -1));
        yr0Var.setEmptyView(a1bVar);
        yr0Var.X1 = true;
        yr0Var.Y1 = false;
        hu5 hu5Var = new hu5(new r20(this, b2));
        this.H = hu5Var;
        hu5Var.h(yr0Var);
        ds0 ds0Var = new ds0(context, ylbVar);
        this.K = ds0Var;
        addView(ds0Var, qoe.e(-1, -2, 48));
    }

    public final void a() {
        if (this.b) {
            float f = this.c;
            hga hgaVar = this.r;
            yr0 yr0Var = this.f;
            if (f != 1.0f) {
                if (f == 0.0f) {
                    this.b = false;
                    hgaVar.setVisibility(8);
                    yr0Var.invalidate();
                    return;
                }
                byte b = 1;
                boolean z = f > 0.2f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
                ofFloat.addUpdateListener(new af0(this, b));
                ofFloat.addListener(new y7((byte) 7, (Object) this, z));
                ofFloat.setInterpolator(d53.f);
                ofFloat.setDuration(200L);
                ofFloat.start();
                return;
            }
            this.b = false;
            int i = this.e;
            this.d = i;
            this.a0.E = i;
            gda.E(i);
            bs0 bs0Var = this.w;
            int b2 = bs0Var.b();
            hgaVar.setVisibility(8);
            int i2 = this.d;
            o7c o7cVar = this.h;
            o7cVar.x1(i2);
            yr0Var.b0();
            yr0Var.invalidate();
            if (bs0Var.b() == b2) {
                gm.V3(yr0Var);
            } else {
                bs0Var.f();
            }
            int i3 = this.T;
            if (i3 >= 0) {
                View m = this.s.m(i3);
                if (m != null) {
                    this.U = m.getTop();
                }
                o7cVar.g1(this.T, (-yr0Var.getPaddingTop()) + this.U);
            }
        }
    }

    public final void b(boolean z) {
        if (this.b || this.a0.H.F1) {
            return;
        }
        int i = this.d + (!z ? 1 : -1);
        if (i > 6) {
            i = !z ? 9 : 6;
        }
        int j = Utilities.j(i, 6, this.I ? 1 : 2);
        this.e = j;
        if (j == this.d || this.I) {
            return;
        }
        hga hgaVar = this.r;
        hgaVar.setVisibility(0);
        hgaVar.setAdapter(this.x);
        hgaVar.setPadding(hgaVar.getPaddingLeft(), 0, hgaVar.getPaddingRight(), this.K.getMeasuredHeight() + gm.L(42.0f));
        as0 as0Var = this.s;
        as0Var.x1(j);
        hgaVar.b0();
        as0Var.O = new xr0(this, (byte) 0);
        gm.V3(this.f);
        this.b = true;
        this.c = 0.0f;
        int i2 = this.T;
        if (i2 >= 0) {
            as0Var.g1(i2, this.U - hgaVar.getPaddingTop());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        int i;
        String M0;
        int i2 = this.a0.b;
        t3b t3bVar = this.a;
        int size = t3bVar == null ? 0 : t3bVar.i.size();
        t3b t3bVar2 = this.a;
        byte b = 1;
        boolean z = t3bVar2 == null || TextUtils.isEmpty(t3bVar2.E);
        int i3 = size > 0 ? 0 : 8;
        ds0 ds0Var = this.K;
        ds0Var.setVisibility(i3);
        String M02 = z ? jb6.M0(2131746428, null) : jb6.a0(null, null, 2131746427, s1c.J0(this.a.E, null, null));
        String M03 = jb6.M0(2131746450, null);
        f00 f00Var = new f00(this, (byte) 24);
        if (z) {
            i = 2131746430;
        } else {
            if (size > 0) {
                M0 = null;
                y8c y8cVar = (!z || size <= 0) ? new y8c((byte) 4, this, z) : null;
                b61 b61Var = (b61) ds0Var.e;
                ((TextView) ds0Var.b).setText(M02);
                tb tbVar = (tb) ds0Var.c;
                tbVar.i(M03, false, true);
                tbVar.setOnClickListener(new j1(f00Var, (byte) 20));
                t8 t8Var = (t8) ds0Var.d;
                if (M0 != null) {
                    t8Var.setVisibility(8);
                    b61Var.setVisibility(8);
                } else {
                    t8Var.setVisibility(0);
                    b61Var.setVisibility(0);
                    b61Var.i(M0, false, true);
                    b61Var.setOnClickListener(new j1(y8cVar, (byte) 21));
                }
                t8 t8Var2 = this.F;
                b61 b61Var2 = this.G;
                a1b a1bVar = this.E;
                if (z) {
                    a1bVar.d.setVisibility(8);
                    a1bVar.e.setText(jb6.a0(null, null, 2131746427, s1c.J0(this.a.E, null, null)));
                    a1bVar.f.i(jb6.M0(2131746435, null), false, true);
                    t8Var2.setVisibility(0);
                    b61Var2.setVisibility(0);
                    b61Var2.i(jb6.M0(2131746429, null), false, true);
                    b61Var2.setOnClickListener(new wr0(this, b));
                } else {
                    a1bVar.d.setVisibility(0);
                    a1bVar.d.setText(jb6.M0(2131746431, null));
                    a1bVar.e.setText(jb6.G(oc7.r1(i2).l4.s2.f(), "ProfileBotPreviewEmptyText", new Object[0]));
                    a1bVar.f.i(jb6.M0(2131746435, null), false, true);
                    t8Var2.setVisibility(8);
                    b61Var2.setVisibility(8);
                }
                a1bVar.f.setVisibility(this.w.b() >= oc7.r1(i2).l4.s2.f() ? 8 : 0);
            }
            i = 2131746429;
        }
        M0 = jb6.M0(i, null);
        if (z) {
        }
        b61 b61Var3 = (b61) ds0Var.e;
        ((TextView) ds0Var.b).setText(M02);
        tb tbVar2 = (tb) ds0Var.c;
        tbVar2.i(M03, false, true);
        tbVar2.setOnClickListener(new j1(f00Var, (byte) 20));
        t8 t8Var3 = (t8) ds0Var.d;
        if (M0 != null) {
        }
        t8 t8Var22 = this.F;
        b61 b61Var22 = this.G;
        a1b a1bVar2 = this.E;
        if (z) {
        }
        a1bVar2.f.setVisibility(this.w.b() >= oc7.r1(i2).l4.s2.f() ? 8 : 0);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.r) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        yr0 yr0Var = this.f;
        yr0Var.setPadding(yr0Var.getPaddingLeft(), yr0Var.f3, yr0Var.getPaddingRight(), this.K.getMeasuredHeight() + gm.L(42.0f));
    }

    public void setList(t3b t3bVar) {
        if (this.a != t3bVar) {
            this.I = false;
            this.J = false;
            this.d = this.a0.E;
        }
        this.a = t3bVar;
        bs0 bs0Var = this.w;
        bs0Var.e = t3bVar;
        if (bs0Var != bs0Var.s.x) {
            bs0Var.M();
        }
        bs0Var.f();
        fs0 fs0Var = this.x;
        fs0Var.e = t3bVar;
        if (fs0Var != fs0Var.s.x) {
            fs0Var.M();
        }
        fs0Var.f();
        c();
    }

    public void setVisibleHeight(int i) {
        float f = (-(getMeasuredHeight() - Math.max(i, gm.L(280.0f)))) / 2.0f;
        this.E.setTranslationY(f);
        this.y.setTranslationY(-f);
    }
}
