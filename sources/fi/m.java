package fi;

import ai.j0;
import ai.j6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import ci.e1;
import dh.x;
import ei.k6;
import ei.n4;
import ei.y8;
import ei.z5;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.j41;
import org.telegram.ui.Components.qr0;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.s51;
import u4.y;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m extends FrameLayout {
    public static final /* synthetic */ int b0 = 0;
    public final zu0 E;
    public final j F;
    public final gi.d G;
    public final y H;
    public boolean I;
    public boolean J;
    public final bh.a K;
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
    public k6 a;
    public final /* synthetic */ tp0 a0;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public final e f;
    public final j41 h;
    public final u4.k n;
    public final qr0 r;
    public final g s;
    public final h w;
    public final l x;
    public final i y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(tp0 tp0Var, Context context) {
        super(context);
        this.a0 = tp0Var;
        this.d = Utilities.j(az.u1, 6, 2);
        this.e = Utilities.j(az.u1, 6, 2);
        int i3 = 0;
        this.I = false;
        this.J = false;
        this.W = new Rect();
        j41 j41Var = new j41();
        this.h = j41Var;
        int i10 = 1;
        j41Var.O = new d(this, i10);
        j41Var.y1(this.d);
        u4.k kVar = new u4.k();
        this.n = kVar;
        kVar.n(280L);
        kVar.o(xq.h);
        kVar.m = false;
        e eVar = new e(this, context);
        this.f = eVar;
        eVar.setScrollingTouchSlop(1);
        eVar.setPinnedSectionOffsetY(-g0.L(2.0f));
        eVar.setPadding(0, 0, 0, 0);
        eVar.setItemAnimator(null);
        eVar.setClipToPadding(false);
        eVar.setSectionsType(2);
        eVar.setLayoutManager(j41Var);
        addView(eVar, mf.c(-1.0f, -1));
        eVar.i(new f(this, i3));
        eVar.setOnItemClickListener(new j6(this, 7));
        eVar.setOnItemLongClickListener(new y8(this, 3));
        qr0 qr0Var = new qr0(context, null);
        this.r = qr0Var;
        g gVar = new g(i3, this);
        this.s = gVar;
        qr0Var.setLayoutManager(gVar);
        qr0Var.i(new f(this, i10));
        gVar.y1(this.e);
        qr0Var.setVisibility(8);
        addView(qr0Var, mf.c(-1.0f, -1));
        h hVar = new h(this, context);
        this.w = hVar;
        eVar.setAdapter(hVar);
        l lVar = new l(this, getContext());
        hVar.f = lVar;
        this.x = lVar;
        qr0Var.setAdapter(lVar);
        i iVar = new i(this, context);
        this.y = iVar;
        iVar.x = false;
        zu0 zu0Var = new zu0(context, iVar, 1, null);
        this.E = zu0Var;
        zu0Var.setVisibility(8);
        zu0Var.setAnimateLayoutChange(true);
        addView(zu0Var, mf.c(-1.0f, -1));
        zu0Var.setOnTouchListener(new a(i3));
        zu0Var.e(true, false);
        zu0Var.b.setVisibility(8);
        zu0Var.d.setText(bd.M0(2131746706, null));
        zu0Var.e.setText(bd.G(hp.s1(tp0Var.b).T5, "ProfileBotPreviewEmptyText", new Object[0]));
        String M0 = bd.M0(2131746710, null);
        gi.d dVar = zu0Var.f;
        dVar.i(M0, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new b(this, i3));
        j jVar = new j(this, context);
        this.F = jVar;
        int i11 = org.telegram.ui.ActionBar.k6.y6;
        e6 e6Var = tp0Var.c;
        r6.V(jVar, i11, e6Var);
        jVar.setText(bd.M0(2131746711, null));
        jVar.setTextSize(1, 14.0f);
        jVar.setTextAlignment(4);
        jVar.setGravity(17);
        jVar.setTypeface(g0.o());
        LinearLayout.LayoutParams t10 = mf.t(hs.v2, -2, 17, 0, 17, 0, 12);
        s51 s51Var = zu0Var.a;
        s51Var.addView(jVar, t10);
        gi.d dVar2 = new gi.d(context, e6Var, false);
        this.G = dVar2;
        dVar2.setMinWidth(g0.L(200.0f));
        s51Var.addView(dVar2, mf.r(-2, 44, 17));
        zu0Var.addView(iVar, 0, mf.c(-1.0f, -1));
        eVar.setEmptyView(zu0Var);
        eVar.X1 = true;
        eVar.Y1 = 0;
        new SparseArray();
        new HashMap();
        y yVar = new y(new c(this, i3));
        this.H = yVar;
        yVar.h(eVar);
        bh.a aVar = new bh.a(context, e6Var);
        this.K = aVar;
        addView(aVar, mf.e(-1, -2, 48));
    }

    public final void a() {
        if (this.b) {
            float f10 = this.c;
            qr0 qr0Var = this.r;
            e eVar = this.f;
            if (f10 != 1.0f) {
                if (f10 == 0.0f) {
                    this.b = false;
                    qr0Var.setVisibility(8);
                    eVar.invalidate();
                    return;
                }
                int i3 = 1;
                boolean z10 = f10 > 0.2f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
                ofFloat.addUpdateListener(new n4(this, i3));
                ofFloat.addListener(new x(6, this, z10));
                ofFloat.setInterpolator(xq.f);
                ofFloat.setDuration(200L);
                ofFloat.start();
                return;
            }
            this.b = false;
            int i10 = this.e;
            this.d = i10;
            this.a0.E = i10;
            az.F(i10);
            h hVar = this.w;
            int b10 = hVar.b();
            qr0Var.setVisibility(8);
            int i11 = this.d;
            j41 j41Var = this.h;
            j41Var.y1(i11);
            eVar.a0();
            eVar.invalidate();
            if (hVar.b() == b10) {
                g0.b4(eVar);
            } else {
                hVar.f();
            }
            int i12 = this.T;
            if (i12 >= 0) {
                View m10 = this.s.m(i12);
                if (m10 != null) {
                    this.U = m10.getTop();
                }
                j41Var.h1(this.T, (-eVar.getPaddingTop()) + this.U);
            }
        }
    }

    public final void b(boolean z10) {
        if (this.b || this.a0.H.F1) {
            return;
        }
        int i3 = this.d + (!z10 ? 1 : -1);
        if (i3 > 6) {
            i3 = !z10 ? 9 : 6;
        }
        int j10 = Utilities.j(i3, 6, this.I ? 1 : 2);
        this.e = j10;
        if (j10 == this.d || this.I) {
            return;
        }
        qr0 qr0Var = this.r;
        qr0Var.setVisibility(0);
        qr0Var.setAdapter(this.x);
        qr0Var.setPadding(qr0Var.getPaddingLeft(), 0, qr0Var.getPaddingRight(), this.K.getMeasuredHeight() + g0.L(42.0f));
        g gVar = this.s;
        gVar.y1(j10);
        qr0Var.a0();
        gVar.O = new d(this, 0);
        g0.b4(this.f);
        this.b = true;
        this.c = 0.0f;
        int i10 = this.T;
        if (i10 >= 0) {
            gVar.h1(i10, this.U - qr0Var.getPaddingTop());
        }
    }

    public final void c() {
        String M0;
        int i3 = this.a0.b;
        k6 k6Var = this.a;
        int size = k6Var == null ? 0 : k6Var.i.size();
        k6 k6Var2 = this.a;
        int i10 = 1;
        boolean z10 = k6Var2 == null || TextUtils.isEmpty(k6Var2.E);
        int i11 = size > 0 ? 0 : 8;
        bh.a aVar = this.K;
        aVar.setVisibility(i11);
        String M02 = z10 ? bd.M0(2131746703, null) : bd.a0(null, null, 2131746702, f21.O0(this.a.E, null, null));
        String M03 = bd.M0(2131746723, null);
        z5 z5Var = new z5(this, 14);
        if (z10 || size <= 0) {
            M0 = bd.M0(z10 ? 2131746705 : 2131746704, null);
        } else {
            M0 = null;
        }
        e1 e1Var = (z10 || size <= 0) ? new e1(4, this, z10) : null;
        j jVar = (j) aVar.d;
        gi.d dVar = (gi.d) aVar.e;
        ((TextView) aVar.b).setText(M02);
        ai.x xVar = (ai.x) aVar.c;
        xVar.i(M03, false, true);
        xVar.setOnClickListener(new ai.b(z5Var, 22));
        if (M0 == null) {
            jVar.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            jVar.setVisibility(0);
            dVar.setVisibility(0);
            dVar.i(M0, false, true);
            dVar.setOnClickListener(new j0(2, e1Var));
        }
        j jVar2 = this.F;
        gi.d dVar2 = this.G;
        zu0 zu0Var = this.E;
        if (z10) {
            zu0Var.d.setVisibility(0);
            zu0Var.d.setText(bd.M0(2131746706, null));
            zu0Var.e.setText(bd.G(hp.s1(i3).T5, "ProfileBotPreviewEmptyText", new Object[0]));
            zu0Var.f.i(bd.M0(2131746710, null), false, true);
            jVar2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            zu0Var.d.setVisibility(8);
            zu0Var.e.setText(bd.a0(null, null, 2131746702, f21.O0(this.a.E, null, null)));
            zu0Var.f.i(bd.M0(2131746710, null), false, true);
            jVar2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.i(bd.M0(2131746704, null), false, true);
            dVar2.setOnClickListener(new b(this, i10));
        }
        zu0Var.f.setVisibility(this.w.b() >= hp.s1(i3).T5 ? 8 : 0);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        e eVar = this.f;
        eVar.setPadding(eVar.getPaddingLeft(), eVar.f3, eVar.getPaddingRight(), this.K.getMeasuredHeight() + g0.L(42.0f));
    }

    public void setList(k6 k6Var) {
        if (this.a != k6Var) {
            this.I = false;
            this.J = false;
            this.d = this.a0.E;
        }
        this.a = k6Var;
        h hVar = this.w;
        hVar.e = k6Var;
        if (hVar != hVar.s.x) {
            hVar.M();
        }
        hVar.f();
        l lVar = this.x;
        lVar.e = k6Var;
        if (lVar != lVar.s.x) {
            lVar.M();
        }
        lVar.f();
        c();
    }

    public void setVisibleHeight(int i3) {
        float f10 = (-(getMeasuredHeight() - Math.max(i3, g0.L(280.0f)))) / 2.0f;
        this.E.setTranslationY(f10);
        this.y.setTranslationY(-f10);
    }
}
