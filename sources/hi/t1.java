package hi;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class t1 extends u1 implements gs {
    public final di.b1 b;
    public final r1 c;
    public final d2 d;
    public final s1 e;
    public final q1 f;
    public final ArrayList h;
    public final ArrayList n;
    public final /* synthetic */ i2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(i2 i2Var, Context context) {
        super(context);
        this.r = i2Var;
        this.f = new q1();
        this.h = new ArrayList();
        this.n = new ArrayList();
        di.b1 b1Var = new di.b1(2, context, this);
        this.b = b1Var;
        r1 r1Var = new r1(this);
        this.c = r1Var;
        b1Var.setAdapter(r1Var);
        s1 s1Var = new s1(this);
        this.e = s1Var;
        b1Var.setLayoutManager(s1Var);
        b1Var.i(new ai.j0(this, 1));
        b1Var.setClipToPadding(true);
        b1Var.setVerticalScrollBarEnabled(false);
        bi.k8 k8Var = new bi.k8(this, 9);
        b1Var.setOnTouchListener(new p1(0, this, k8Var));
        b1Var.setOnItemClickListener(k8Var);
        b1Var.setOnScrollListener(new bi.u1(this, 14));
        addView(b1Var, c8.ma.d(-1, -1.0f, ls.E1, 0.0f, 58.0f, 0.0f, 40.0f));
        int i7 = i2.C1;
        d2 d2Var = new d2(context, i2Var.J0);
        this.d = d2Var;
        d2Var.x = new bi.b(this, 25);
        d2Var.a(2, false);
        addView(d2Var, c8.ma.e(-1, -2, 48));
    }

    @Override // hi.u1
    public final void a(int i7) {
        r1 r1Var = this.c;
        r1.E(r1Var, false);
        if (this.n.isEmpty() && TextUtils.isEmpty(this.r.m1)) {
            r1Var.G();
        }
        r1Var.H(null);
    }

    @Override // hi.u1
    public final float b() {
        int i7 = 0;
        while (true) {
            di.b1 b1Var = this.b;
            if (i7 >= b1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = b1Var.getChildAt(i7).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return Math.max(0, r2.getBottom());
            }
            i7++;
        }
    }

    @Override // hi.u1
    public final void c() {
        this.d.setTranslationY(org.telegram.messenger.g0.L(10.0f) + Math.max(0.0f, b()));
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.X0) {
            r1.E(this.c, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = i2.C1;
        ls.f(this.r.a).c(this, ls.X0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = i2.C1;
        ls.f(this.r.a).n(this, ls.X0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = i2.C1;
        int i12 = this.r.u0;
        setPadding(i12, 0, i12, org.telegram.messenger.g0.n);
        super.onMeasure(i7, i10);
    }
}
