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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class gr0 extends FrameLayout {
    public final zya E;
    public final t8 F;
    public final u41 G;
    public final is5 H;
    public boolean I;
    public boolean J;
    public final dr0 K;
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
    public s1b a;
    public final /* synthetic */ kca a0;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public final yq0 f;
    public final o5c h;
    public final gb3 n;
    public final hea r;
    public final ar0 s;
    public final br0 w;
    public final fr0 x;
    public final cr0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr0(kca kcaVar, Context context) {
        super(context);
        this.a0 = kcaVar;
        this.d = Utilities.j(gba.r1, 6, 2);
        this.e = Utilities.j(gba.r1, 6, 2);
        byte b = 0;
        this.I = false;
        this.J = false;
        this.W = new Rect();
        o5c o5cVar = new o5c();
        this.h = o5cVar;
        byte b2 = 1;
        o5cVar.O = new xq0(this, b2);
        o5cVar.x1(this.d);
        gb3 gb3Var = new gb3();
        this.n = gb3Var;
        gb3Var.n(280L);
        gb3Var.o(s33.h);
        gb3Var.m = false;
        yq0 yq0Var = new yq0(this, context);
        this.f = yq0Var;
        yq0Var.setScrollingTouchSlop(1);
        yq0Var.setPinnedSectionOffsetY(-gl.L(2.0f));
        yq0Var.setPadding(0, 0, 0, 0);
        yq0Var.setItemAnimator(null);
        yq0Var.setClipToPadding(false);
        yq0Var.setSectionsType(2);
        yq0Var.setLayoutManager(o5cVar);
        addView(yq0Var, nme.c(-1.0f, -1));
        yq0Var.i(new zq0(this, b));
        yq0Var.setOnItemClickListener(new u(this, (byte) 7));
        yq0Var.setOnItemLongClickListener(new sg0(this, (byte) 10));
        hea heaVar = new hea(context, null);
        this.r = heaVar;
        ar0 ar0Var = new ar0(this, b);
        this.s = ar0Var;
        heaVar.setLayoutManager(ar0Var);
        heaVar.i(new zq0(this, b2));
        ar0Var.x1(this.e);
        heaVar.setVisibility(8);
        addView(heaVar, nme.c(-1.0f, -1));
        br0 br0Var = new br0(this, context);
        this.w = br0Var;
        yq0Var.setAdapter(br0Var);
        fr0 fr0Var = new fr0(this, getContext());
        br0Var.f = fr0Var;
        this.x = fr0Var;
        heaVar.setAdapter(fr0Var);
        cr0 cr0Var = new cr0(this, context);
        this.y = cr0Var;
        cr0Var.x = false;
        zya zyaVar = new zya(context, cr0Var, 1, null);
        this.E = zyaVar;
        zyaVar.setVisibility(8);
        zyaVar.setAnimateLayoutChange(true);
        addView(zyaVar, nme.c(-1.0f, -1));
        zyaVar.setOnTouchListener(new p8((byte) 18));
        zyaVar.e(true, false);
        zyaVar.b.setVisibility(8);
        zyaVar.d.setText(k96.M0(2131746505, null));
        zyaVar.e.setText(k96.G(na7.q1(kcaVar.b).k4.s2.f(), "ProfileBotPreviewEmptyText", new Object[0]));
        String M0 = k96.M0(2131746509, null);
        u41 u41Var = zyaVar.f;
        u41Var.i(M0, false, true);
        u41Var.setVisibility(0);
        u41Var.setOnClickListener(new wq0(this, b));
        t8 t8Var = new t8(this, context);
        this.F = t8Var;
        int i = bkb.x6;
        wjb wjbVar = kcaVar.c;
        zkb.X(t8Var, i, wjbVar);
        t8Var.setText(k96.M0(2131746510, null));
        t8Var.setTextSize(1, 14.0f);
        t8Var.setTextAlignment(4);
        t8Var.setGravity(17);
        t8Var.setTypeface(gl.o());
        LinearLayout.LayoutParams t = nme.t(kk7.u2, -2, 17, 0, 17, 0, 12);
        pkb pkbVar = zyaVar.a;
        pkbVar.addView(t8Var, t);
        u41 u41Var2 = new u41(wjbVar, context, false);
        this.G = u41Var2;
        u41Var2.setMinWidth(gl.L(200.0f));
        pkbVar.addView(u41Var2, nme.r(-2, 44, 17));
        zyaVar.addView(cr0Var, 0, nme.c(-1.0f, -1));
        yq0Var.setEmptyView(zyaVar);
        yq0Var.X1 = true;
        yq0Var.Y1 = false;
        is5 is5Var = new is5(new r10(this, b2));
        this.H = is5Var;
        is5Var.h(yq0Var);
        dr0 dr0Var = new dr0(context, wjbVar);
        this.K = dr0Var;
        addView(dr0Var, nme.e(-1, -2, 48));
    }

    public final void a() {
        if (this.b) {
            float f = this.c;
            hea heaVar = this.r;
            yq0 yq0Var = this.f;
            if (f != 1.0f) {
                if (f == 0.0f) {
                    this.b = false;
                    heaVar.setVisibility(8);
                    yq0Var.invalidate();
                    return;
                }
                byte b = 1;
                boolean z = f > 0.2f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
                ofFloat.addUpdateListener(new ae0(this, b));
                ofFloat.addListener(new y7((byte) 7, (Object) this, z));
                ofFloat.setInterpolator(s33.f);
                ofFloat.setDuration(200L);
                ofFloat.start();
                return;
            }
            this.b = false;
            int i = this.e;
            this.d = i;
            this.a0.E = i;
            gba.E(i);
            br0 br0Var = this.w;
            int b2 = br0Var.b();
            heaVar.setVisibility(8);
            int i2 = this.d;
            o5c o5cVar = this.h;
            o5cVar.x1(i2);
            yq0Var.b0();
            yq0Var.invalidate();
            if (br0Var.b() == b2) {
                gl.W3(yq0Var);
            } else {
                br0Var.f();
            }
            int i3 = this.T;
            if (i3 >= 0) {
                View m = this.s.m(i3);
                if (m != null) {
                    this.U = m.getTop();
                }
                o5cVar.g1(this.T, (-yq0Var.getPaddingTop()) + this.U);
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
        hea heaVar = this.r;
        heaVar.setVisibility(0);
        heaVar.setAdapter(this.x);
        heaVar.setPadding(heaVar.getPaddingLeft(), 0, heaVar.getPaddingRight(), this.K.getMeasuredHeight() + gl.L(42.0f));
        ar0 ar0Var = this.s;
        ar0Var.x1(j);
        heaVar.b0();
        ar0Var.O = new xq0(this, (byte) 0);
        gl.W3(this.f);
        this.b = true;
        this.c = 0.0f;
        int i2 = this.T;
        if (i2 >= 0) {
            ar0Var.g1(i2, this.U - heaVar.getPaddingTop());
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
        s1b s1bVar = this.a;
        int size = s1bVar == null ? 0 : s1bVar.i.size();
        s1b s1bVar2 = this.a;
        byte b = 1;
        boolean z = s1bVar2 == null || TextUtils.isEmpty(s1bVar2.E);
        int i3 = size > 0 ? 0 : 8;
        dr0 dr0Var = this.K;
        dr0Var.setVisibility(i3);
        String M02 = z ? k96.M0(2131746502, null) : k96.a0(null, null, 2131746501, rzb.J0(this.a.E, null, null));
        String M03 = k96.M0(2131746524, null);
        oz ozVar = new oz(this, (byte) 22);
        if (z) {
            i = 2131746504;
        } else {
            if (size > 0) {
                M0 = null;
                x6c x6cVar = (!z || size <= 0) ? new x6c((byte) 4, this, z) : null;
                u41 u41Var = (u41) dr0Var.e;
                ((TextView) dr0Var.b).setText(M02);
                tb tbVar = (tb) dr0Var.c;
                tbVar.i(M03, false, true);
                tbVar.setOnClickListener(new j1(ozVar, (byte) 19));
                t8 t8Var = (t8) dr0Var.d;
                if (M0 != null) {
                    t8Var.setVisibility(8);
                    u41Var.setVisibility(8);
                } else {
                    t8Var.setVisibility(0);
                    u41Var.setVisibility(0);
                    u41Var.i(M0, false, true);
                    u41Var.setOnClickListener(new j1(x6cVar, (byte) 20));
                }
                t8 t8Var2 = this.F;
                u41 u41Var2 = this.G;
                zya zyaVar = this.E;
                if (z) {
                    zyaVar.d.setVisibility(8);
                    zyaVar.e.setText(k96.a0(null, null, 2131746501, rzb.J0(this.a.E, null, null)));
                    zyaVar.f.i(k96.M0(2131746509, null), false, true);
                    t8Var2.setVisibility(0);
                    u41Var2.setVisibility(0);
                    u41Var2.i(k96.M0(2131746503, null), false, true);
                    u41Var2.setOnClickListener(new wq0(this, b));
                } else {
                    zyaVar.d.setVisibility(0);
                    zyaVar.d.setText(k96.M0(2131746505, null));
                    zyaVar.e.setText(k96.G(na7.q1(i2).k4.s2.f(), "ProfileBotPreviewEmptyText", new Object[0]));
                    zyaVar.f.i(k96.M0(2131746509, null), false, true);
                    t8Var2.setVisibility(8);
                    u41Var2.setVisibility(8);
                }
                zyaVar.f.setVisibility(this.w.b() >= na7.q1(i2).k4.s2.f() ? 8 : 0);
            }
            i = 2131746503;
        }
        M0 = k96.M0(i, null);
        if (z) {
        }
        u41 u41Var3 = (u41) dr0Var.e;
        ((TextView) dr0Var.b).setText(M02);
        tb tbVar2 = (tb) dr0Var.c;
        tbVar2.i(M03, false, true);
        tbVar2.setOnClickListener(new j1(ozVar, (byte) 19));
        t8 t8Var3 = (t8) dr0Var.d;
        if (M0 != null) {
        }
        t8 t8Var22 = this.F;
        u41 u41Var22 = this.G;
        zya zyaVar2 = this.E;
        if (z) {
        }
        zyaVar2.f.setVisibility(this.w.b() >= na7.q1(i2).k4.s2.f() ? 8 : 0);
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
        yq0 yq0Var = this.f;
        yq0Var.setPadding(yq0Var.getPaddingLeft(), yq0Var.f3, yq0Var.getPaddingRight(), this.K.getMeasuredHeight() + gl.L(42.0f));
    }

    public void setList(s1b s1bVar) {
        if (this.a != s1bVar) {
            this.I = false;
            this.J = false;
            this.d = this.a0.E;
        }
        this.a = s1bVar;
        br0 br0Var = this.w;
        br0Var.e = s1bVar;
        if (br0Var != br0Var.s.x) {
            br0Var.M();
        }
        br0Var.f();
        fr0 fr0Var = this.x;
        fr0Var.e = s1bVar;
        if (fr0Var != fr0Var.s.x) {
            fr0Var.M();
        }
        fr0Var.f();
        c();
    }

    public void setVisibleHeight(int i) {
        float f = (-(getMeasuredHeight() - Math.max(i, gl.L(280.0f)))) / 2.0f;
        this.E.setTranslationY(f);
        this.y.setTranslationY(-f);
    }
}
