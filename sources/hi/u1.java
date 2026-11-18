package hi;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class u1 extends v1 implements fs {
    public final di.b1 b;
    public final s1 c;
    public final e2 d;
    public final t1 e;
    public final q1 f;
    public final ArrayList h;
    public final ArrayList n;
    public final /* synthetic */ j2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(j2 j2Var, Context context) {
        super(context);
        this.r = j2Var;
        this.f = new q1();
        this.h = new ArrayList();
        this.n = new ArrayList();
        di.b1 b1Var = new di.b1(2, context, this);
        this.b = b1Var;
        s1 s1Var = new s1(this);
        this.c = s1Var;
        b1Var.setAdapter(s1Var);
        t1 t1Var = new t1(this);
        this.e = t1Var;
        b1Var.setLayoutManager(t1Var);
        b1Var.i(new ai.i0(this, 1));
        b1Var.setClipToPadding(true);
        b1Var.setVerticalScrollBarEnabled(false);
        bi.i8 i8Var = new bi.i8(this, 9);
        b1Var.setOnTouchListener(new p1(0, this, i8Var));
        b1Var.setOnItemClickListener(i8Var);
        b1Var.setOnScrollListener(new bi.q1(this, 14));
        addView(b1Var, c8.ma.d(-1, -1.0f, ks.E1, 0.0f, 58.0f, 0.0f, 40.0f));
        int i7 = j2.C1;
        e2 e2Var = new e2(context, j2Var.J0);
        this.d = e2Var;
        e2Var.x = new bi.b(this, 25);
        e2Var.a(2, false);
        addView(e2Var, c8.ma.e(-1, -2, 48));
    }

    @Override // hi.v1
    public final void a(int i7) {
        s1 s1Var = this.c;
        s1.E(s1Var, false);
        if (this.n.isEmpty() && TextUtils.isEmpty(this.r.m1)) {
            s1Var.G();
        }
        s1Var.H(null);
    }

    @Override // hi.v1
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

    @Override // hi.v1
    public final void c() {
        this.d.setTranslationY(org.telegram.messenger.g0.L(10.0f) + Math.max(0.0f, b()));
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.X0) {
            s1.E(this.c, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = j2.C1;
        ks.f(this.r.a).c(this, ks.X0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = j2.C1;
        ks.f(this.r.a).n(this, ks.X0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = j2.C1;
        int i12 = this.r.u0;
        setPadding(i12, 0, i12, org.telegram.messenger.g0.n);
        super.onMeasure(i7, i10);
    }
}
