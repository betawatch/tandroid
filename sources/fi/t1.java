package fi;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class t1 extends u1 implements ls {
    public final bi.q1 b;
    public final r1 c;
    public final e2 d;
    public final s1 e;
    public final p1 f;
    public final ArrayList h;
    public final ArrayList n;
    public final /* synthetic */ k2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(k2 k2Var, Context context) {
        super(context);
        this.r = k2Var;
        this.f = new p1();
        this.h = new ArrayList();
        this.n = new ArrayList();
        bi.q1 q1Var = new bi.q1(2, context, this);
        this.b = q1Var;
        r1 r1Var = new r1(this);
        this.c = r1Var;
        q1Var.setAdapter(r1Var);
        s1 s1Var = new s1(this);
        this.e = s1Var;
        q1Var.setLayoutManager(s1Var);
        int i7 = 0;
        q1Var.i(new o1(this, i7));
        q1Var.setClipToPadding(true);
        q1Var.setVerticalScrollBarEnabled(false);
        ai.k kVar = new ai.k(this, 8);
        q1Var.setOnTouchListener(new n1(i7, this, kVar));
        q1Var.setOnItemClickListener(kVar);
        q1Var.setOnScrollListener(new ai.b(this, 10));
        addView(q1Var, c8.ha.d(-1, -1.0f, qs.E1, 0.0f, 58.0f, 0.0f, 40.0f));
        int i10 = k2.y1;
        e2 e2Var = new e2(context, k2Var.I0);
        this.d = e2Var;
        e2Var.x = new ai.e(this, 16);
        e2Var.a(2, false);
        addView(e2Var, c8.ha.e(-1, -2, 48));
    }

    @Override // fi.u1
    public final void a(int i7) {
        r1 r1Var = this.c;
        r1.E(r1Var, false);
        if (this.n.isEmpty() && TextUtils.isEmpty(this.r.i1)) {
            r1Var.G();
        }
        r1Var.H(null);
    }

    @Override // fi.u1
    public final float b() {
        int i7 = 0;
        while (true) {
            bi.q1 q1Var = this.b;
            if (i7 >= q1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = q1Var.getChildAt(i7).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return Math.max(0, r2.getBottom());
            }
            i7++;
        }
    }

    @Override // fi.u1
    public final void c() {
        this.d.setTranslationY(org.telegram.messenger.g0.L(10.0f) + Math.max(0.0f, b()));
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.X0) {
            r1.E(this.c, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = k2.y1;
        qs.f(this.r.a).c(this, qs.X0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = k2.y1;
        qs.f(this.r.a).n(this, qs.X0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = k2.y1;
        int i12 = this.r.t0;
        setPadding(i12, 0, i12, org.telegram.messenger.g0.n);
        super.onMeasure(i7, i10);
    }
}
