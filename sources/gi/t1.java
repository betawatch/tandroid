package gi;

import android.content.Context;
import android.text.TextUtils;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t1 extends u1 implements cs {
    public final ci.j1 b;
    public final r1 c;
    public final d2 d;
    public final s1 e;
    public final p1 f;
    public final ArrayList h;
    public final ArrayList n;
    public final /* synthetic */ i2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(i2 i2Var, Context context) {
        super(context);
        this.r = i2Var;
        this.f = new p1();
        this.h = new ArrayList();
        this.n = new ArrayList();
        ci.j1 j1Var = new ci.j1(2, context, this);
        this.b = j1Var;
        r1 r1Var = new r1(this);
        this.c = r1Var;
        j1Var.setAdapter(r1Var);
        s1 s1Var = new s1(this);
        this.e = s1Var;
        j1Var.setLayoutManager(s1Var);
        int i3 = 0;
        j1Var.i(new o1(this, i3));
        j1Var.setClipToPadding(true);
        j1Var.setVerticalScrollBarEnabled(false);
        ai.j6 j6Var = new ai.j6(this, 9);
        j1Var.setOnTouchListener(new n1(i3, this, j6Var));
        j1Var.setOnItemClickListener(j6Var);
        j1Var.setOnScrollListener(new ai.j5(this, 13));
        addView(j1Var, mf.d(-1, -1.0f, hs.E1, 0.0f, 58.0f, 0.0f, 40.0f));
        int i10 = i2.z1;
        d2 d2Var = new d2(context, i2Var.J0);
        this.d = d2Var;
        d2Var.x = new ai.c(this, 26);
        d2Var.a(2, false);
        addView(d2Var, mf.e(-1, -2, 48));
    }

    @Override // gi.u1
    public final void a(int i3) {
        r1 r1Var = this.c;
        r1.E(r1Var, false);
        if (this.n.isEmpty() && TextUtils.isEmpty(this.r.j1)) {
            r1Var.G();
        }
        r1Var.H(null);
    }

    @Override // gi.u1
    public final float b() {
        int i3 = 0;
        while (true) {
            ci.j1 j1Var = this.b;
            if (i3 >= j1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = j1Var.getChildAt(i3).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return Math.max(0, r2.getBottom());
            }
            i3++;
        }
    }

    @Override // gi.u1
    public final void c() {
        this.d.setTranslationY(org.telegram.messenger.g0.L(10.0f) + Math.max(0.0f, b()));
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.X0) {
            r1.E(this.c, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i3 = i2.z1;
        hs.f(this.r.a).c(this, hs.X0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = i2.z1;
        hs.f(this.r.a).n(this, hs.X0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11 = i2.z1;
        int i12 = this.r.u0;
        setPadding(i12, 0, i12, org.telegram.messenger.g0.n);
        super.onMeasure(i3, i10);
    }
}
