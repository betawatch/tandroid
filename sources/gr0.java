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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class gr0 extends FrameLayout {
    public final z2b E;
    public final u8 F;
    public final c51 G;
    public final lu5 H;
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
    public o5b a;
    public final /* synthetic */ bga a0;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public final yq0 f;
    public final o9c h;
    public final zb3 n;
    public final yha r;
    public final ar0 s;
    public final br0 w;
    public final fr0 x;
    public final cr0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr0(bga bgaVar, Context context) {
        super(context);
        this.a0 = bgaVar;
        this.d = Utilities.j(xea.q1, 6, 2);
        this.e = Utilities.j(xea.q1, 6, 2);
        byte b = 0;
        this.I = false;
        this.J = false;
        this.W = new Rect();
        o9c o9cVar = new o9c();
        this.h = o9cVar;
        byte b2 = 1;
        o9cVar.O = new xq0(this, b2);
        o9cVar.x1(this.d);
        zb3 zb3Var = new zb3();
        this.n = zb3Var;
        zb3Var.n(280L);
        zb3Var.o(k43.h);
        zb3Var.m = false;
        yq0 yq0Var = new yq0(this, context);
        this.f = yq0Var;
        yq0Var.setScrollingTouchSlop(1);
        yq0Var.setPinnedSectionOffsetY(-hl.L(2.0f));
        yq0Var.setPadding(0, 0, 0, 0);
        yq0Var.setItemAnimator(null);
        yq0Var.setClipToPadding(false);
        yq0Var.setSectionsType(2);
        yq0Var.setLayoutManager(o9cVar);
        addView(yq0Var, tre.c(-1.0f, -1));
        yq0Var.i(new zq0(this, b));
        yq0Var.setOnItemClickListener(new u(this, (byte) 7));
        yq0Var.setOnItemLongClickListener(new tg0(this, (byte) 10));
        yha yhaVar = new yha(context, null);
        this.r = yhaVar;
        ar0 ar0Var = new ar0(this, b);
        this.s = ar0Var;
        yhaVar.setLayoutManager(ar0Var);
        yhaVar.i(new zq0(this, b2));
        ar0Var.x1(this.e);
        yhaVar.setVisibility(8);
        addView(yhaVar, tre.c(-1.0f, -1));
        br0 br0Var = new br0(this, context);
        this.w = br0Var;
        yq0Var.setAdapter(br0Var);
        fr0 fr0Var = new fr0(this, getContext());
        br0Var.f = fr0Var;
        this.x = fr0Var;
        yhaVar.setAdapter(fr0Var);
        cr0 cr0Var = new cr0(this, context);
        this.y = cr0Var;
        cr0Var.x = false;
        z2b z2bVar = new z2b(context, cr0Var, 1, null);
        this.E = z2bVar;
        z2bVar.setVisibility(8);
        z2bVar.setAnimateLayoutChange(true);
        addView(z2bVar, tre.c(-1.0f, -1));
        z2bVar.setOnTouchListener(new q8((byte) 18));
        z2bVar.e(true, false);
        z2bVar.b.setVisibility(8);
        z2bVar.d.setText(ob6.M0(2131746425, null));
        z2bVar.e.setText(ob6.G(uc7.s1(bgaVar.b).k4.A2.f(), "ProfileBotPreviewEmptyText", new Object[0]));
        String M0 = ob6.M0(2131746429, null);
        c51 c51Var = z2bVar.f;
        c51Var.i(M0, false, true);
        c51Var.setVisibility(0);
        c51Var.setOnClickListener(new wq0(this, b));
        u8 u8Var = new u8(this, context);
        this.F = u8Var;
        int i = aob.y6;
        vnb vnbVar = bgaVar.c;
        yob.X(u8Var, i, vnbVar);
        u8Var.setText(ob6.M0(2131746430, null));
        u8Var.setTextSize(1, 14.0f);
        u8Var.setTextAlignment(4);
        u8Var.setGravity(17);
        u8Var.setTypeface(hl.o());
        LinearLayout.LayoutParams t = tre.t(jn7.u2, -2, 17, 0, 17, 0, 12);
        oob oobVar = z2bVar.a;
        oobVar.addView(u8Var, t);
        c51 c51Var2 = new c51(vnbVar, context, false);
        this.G = c51Var2;
        c51Var2.setMinWidth(hl.L(200.0f));
        oobVar.addView(c51Var2, tre.r(-2, 44, 17));
        z2bVar.addView(cr0Var, 0, tre.c(-1.0f, -1));
        yq0Var.setEmptyView(z2bVar);
        yq0Var.X1 = true;
        yq0Var.Y1 = false;
        lu5 lu5Var = new lu5(new s10(this, b2));
        this.H = lu5Var;
        lu5Var.h(yq0Var);
        dr0 dr0Var = new dr0(context, vnbVar);
        this.K = dr0Var;
        addView(dr0Var, tre.e(-1, -2, 48));
    }

    public final void a() {
        if (this.b) {
            float f = this.c;
            yha yhaVar = this.r;
            yq0 yq0Var = this.f;
            if (f != 1.0f) {
                if (f == 0.0f) {
                    this.b = false;
                    yhaVar.setVisibility(8);
                    yq0Var.invalidate();
                    return;
                }
                byte b = 1;
                boolean z = f > 0.2f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
                ofFloat.addUpdateListener(new ce0(this, b));
                ofFloat.addListener(new z7((byte) 7, (Object) this, z));
                ofFloat.setInterpolator(k43.f);
                ofFloat.setDuration(200L);
                ofFloat.start();
                return;
            }
            this.b = false;
            int i = this.e;
            this.d = i;
            this.a0.E = i;
            xea.E(i);
            br0 br0Var = this.w;
            int b2 = br0Var.b();
            yhaVar.setVisibility(8);
            int i2 = this.d;
            o9c o9cVar = this.h;
            o9cVar.x1(i2);
            yq0Var.c0();
            yq0Var.invalidate();
            if (br0Var.b() == b2) {
                hl.V3(yq0Var);
            } else {
                br0Var.f();
            }
            int i3 = this.T;
            if (i3 >= 0) {
                View m = this.s.m(i3);
                if (m != null) {
                    this.U = m.getTop();
                }
                o9cVar.g1(this.T, (-yq0Var.getPaddingTop()) + this.U);
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
        yha yhaVar = this.r;
        yhaVar.setVisibility(0);
        yhaVar.setAdapter(this.x);
        yhaVar.setPadding(yhaVar.getPaddingLeft(), 0, yhaVar.getPaddingRight(), this.K.getMeasuredHeight() + hl.L(42.0f));
        ar0 ar0Var = this.s;
        ar0Var.x1(j);
        yhaVar.c0();
        ar0Var.O = new xq0(this, (byte) 0);
        hl.V3(this.f);
        this.b = true;
        this.c = 0.0f;
        int i2 = this.T;
        if (i2 >= 0) {
            ar0Var.g1(i2, this.U - yhaVar.getPaddingTop());
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
        o5b o5bVar = this.a;
        int size = o5bVar == null ? 0 : o5bVar.i.size();
        o5b o5bVar2 = this.a;
        byte b = 1;
        boolean z = o5bVar2 == null || TextUtils.isEmpty(o5bVar2.E);
        int i3 = size > 0 ? 0 : 8;
        dr0 dr0Var = this.K;
        dr0Var.setVisibility(i3);
        String M02 = z ? ob6.M0(2131746422, null) : ob6.a0(null, null, 2131746421, r3c.K0(this.a.E, null, null));
        String M03 = ob6.M0(2131746444, null);
        pz pzVar = new pz(this, (byte) 23);
        if (z) {
            i = 2131746424;
        } else {
            if (size > 0) {
                M0 = null;
                xac xacVar = (!z || size <= 0) ? new xac((byte) 4, this, z) : null;
                c51 c51Var = (c51) dr0Var.e;
                ((TextView) dr0Var.b).setText(M02);
                ub ubVar = (ub) dr0Var.c;
                ubVar.i(M03, false, true);
                ubVar.setOnClickListener(new k1(pzVar, (byte) 19));
                u8 u8Var = (u8) dr0Var.d;
                if (M0 != null) {
                    u8Var.setVisibility(8);
                    c51Var.setVisibility(8);
                } else {
                    u8Var.setVisibility(0);
                    c51Var.setVisibility(0);
                    c51Var.i(M0, false, true);
                    c51Var.setOnClickListener(new k1(xacVar, (byte) 20));
                }
                u8 u8Var2 = this.F;
                c51 c51Var2 = this.G;
                z2b z2bVar = this.E;
                if (z) {
                    z2bVar.d.setVisibility(8);
                    z2bVar.e.setText(ob6.a0(null, null, 2131746421, r3c.K0(this.a.E, null, null)));
                    z2bVar.f.i(ob6.M0(2131746429, null), false, true);
                    u8Var2.setVisibility(0);
                    c51Var2.setVisibility(0);
                    c51Var2.i(ob6.M0(2131746423, null), false, true);
                    c51Var2.setOnClickListener(new wq0(this, b));
                } else {
                    z2bVar.d.setVisibility(0);
                    z2bVar.d.setText(ob6.M0(2131746425, null));
                    z2bVar.e.setText(ob6.G(uc7.s1(i2).k4.A2.f(), "ProfileBotPreviewEmptyText", new Object[0]));
                    z2bVar.f.i(ob6.M0(2131746429, null), false, true);
                    u8Var2.setVisibility(8);
                    c51Var2.setVisibility(8);
                }
                z2bVar.f.setVisibility(this.w.b() >= uc7.s1(i2).k4.A2.f() ? 8 : 0);
            }
            i = 2131746423;
        }
        M0 = ob6.M0(i, null);
        if (z) {
        }
        c51 c51Var3 = (c51) dr0Var.e;
        ((TextView) dr0Var.b).setText(M02);
        ub ubVar2 = (ub) dr0Var.c;
        ubVar2.i(M03, false, true);
        ubVar2.setOnClickListener(new k1(pzVar, (byte) 19));
        u8 u8Var3 = (u8) dr0Var.d;
        if (M0 != null) {
        }
        u8 u8Var22 = this.F;
        c51 c51Var22 = this.G;
        z2b z2bVar2 = this.E;
        if (z) {
        }
        z2bVar2.f.setVisibility(this.w.b() >= uc7.s1(i2).k4.A2.f() ? 8 : 0);
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
        yq0Var.setPadding(yq0Var.getPaddingLeft(), yq0Var.f3, yq0Var.getPaddingRight(), this.K.getMeasuredHeight() + hl.L(42.0f));
    }

    public void setList(o5b o5bVar) {
        if (this.a != o5bVar) {
            this.I = false;
            this.J = false;
            this.d = this.a0.E;
        }
        this.a = o5bVar;
        br0 br0Var = this.w;
        br0Var.e = o5bVar;
        if (br0Var != br0Var.s.x) {
            br0Var.M();
        }
        br0Var.f();
        fr0 fr0Var = this.x;
        fr0Var.e = o5bVar;
        if (fr0Var != fr0Var.s.x) {
            fr0Var.M();
        }
        fr0Var.f();
        c();
    }

    public void setVisibleHeight(int i) {
        float f = (-(getMeasuredHeight() - Math.max(i, hl.L(280.0f)))) / 2.0f;
        this.E.setTranslationY(f);
        this.y.setTranslationY(-f);
    }
}
