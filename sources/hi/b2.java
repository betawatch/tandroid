package hi;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class b2 extends c2 implements fs {
    public final di.b1 b;
    public final z1 c;
    public final l2 d;
    public final a2 e;
    public final y1 f;
    public final ArrayList h;
    public final ArrayList n;
    public final /* synthetic */ r2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(r2 r2Var, Context context) {
        super(context);
        this.r = r2Var;
        this.f = new y1();
        this.h = new ArrayList();
        this.n = new ArrayList();
        di.b1 b1Var = new di.b1(2, context, this);
        this.b = b1Var;
        z1 z1Var = new z1(this);
        this.c = z1Var;
        b1Var.setAdapter(z1Var);
        a2 a2Var = new a2(this);
        this.e = a2Var;
        b1Var.setLayoutManager(a2Var);
        b1Var.i(new ai.f0(this, 1));
        b1Var.setClipToPadding(true);
        b1Var.setVerticalScrollBarEnabled(false);
        bi.n8 n8Var = new bi.n8(this, 9);
        b1Var.setOnTouchListener(new x1(0, this, n8Var));
        b1Var.setOnItemClickListener(n8Var);
        b1Var.setOnScrollListener(new bi.v1(this, 14));
        addView(b1Var, c8.na.d(-1, -1.0f, ks.E1, 0.0f, 58.0f, 0.0f, 40.0f));
        int i7 = r2.D1;
        l2 l2Var = new l2(context, r2Var.J0);
        this.d = l2Var;
        l2Var.x = new bi.b(this, 25);
        l2Var.a(2, false);
        addView(l2Var, c8.na.e(-1, -2, 48));
    }

    @Override // hi.c2
    public final void a(int i7) {
        z1 z1Var = this.c;
        z1.E(z1Var, false);
        if (this.n.isEmpty() && TextUtils.isEmpty(this.r.m1)) {
            z1Var.G();
        }
        z1Var.H(null);
    }

    @Override // hi.c2
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

    @Override // hi.c2
    public final void c() {
        this.d.setTranslationY(org.telegram.messenger.g0.L(10.0f) + Math.max(0.0f, b()));
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.X0) {
            z1.E(this.c, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = r2.D1;
        ks.f(this.r.a).c(this, ks.X0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = r2.D1;
        ks.f(this.r.a).n(this, ks.X0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = r2.D1;
        int i12 = this.r.u0;
        setPadding(i12, 0, i12, org.telegram.messenger.g0.n);
        super.onMeasure(i7, i10);
    }
}
