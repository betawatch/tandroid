package hi;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class t1 extends u1 implements is {
    public final di.c1 b;
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
        di.c1 c1Var = new di.c1(2, context, this);
        this.b = c1Var;
        r1 r1Var = new r1(this);
        this.c = r1Var;
        c1Var.setAdapter(r1Var);
        s1 s1Var = new s1(this);
        this.e = s1Var;
        c1Var.setLayoutManager(s1Var);
        c1Var.i(new ai.h0(this, 1));
        c1Var.setClipToPadding(true);
        c1Var.setVerticalScrollBarEnabled(false);
        bi.b6 b6Var = new bi.b6(this, 9);
        c1Var.setOnTouchListener(new p1(0, this, b6Var));
        c1Var.setOnItemClickListener(b6Var);
        c1Var.setOnScrollListener(new bi.z4(this, 13));
        addView(c1Var, c8.ja.d(-1, -1.0f, ns.E1, 0.0f, 58.0f, 0.0f, 40.0f));
        int i7 = i2.C1;
        d2 d2Var = new d2(context, i2Var.J0);
        this.d = d2Var;
        d2Var.x = new bi.b(this, 26);
        d2Var.a(2, false);
        addView(d2Var, c8.ja.e(-1, -2, 48));
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
            di.c1 c1Var = this.b;
            if (i7 >= c1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = c1Var.getChildAt(i7).getTag();
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

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.X0) {
            r1.E(this.c, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = i2.C1;
        ns.f(this.r.a).c(this, ns.X0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = i2.C1;
        ns.f(this.r.a).n(this, ns.X0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = i2.C1;
        int i12 = this.r.u0;
        setPadding(i12, 0, i12, org.telegram.messenger.g0.n);
        super.onMeasure(i7, i10);
    }
}
