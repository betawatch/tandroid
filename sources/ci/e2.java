package ci;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class e2 extends a2 {
    public final p1 b;
    public final d2 c;
    public final s4.s d;
    public final c2 e;
    public final l2 f;
    public int h;
    public float n;
    public boolean r;
    public final /* synthetic */ s2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(s2 s2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        this.s = s2Var;
        this.h = 8;
        this.n = -1.0f;
        this.r = false;
        p1 p1Var = new p1(context);
        this.b = p1Var;
        d2 d2Var = new d2(this);
        this.c = d2Var;
        p1Var.setAdapter(d2Var);
        s4.s sVar = new s4.s(this.h);
        this.d = sVar;
        p1Var.setLayoutManager(sVar);
        p1Var.setClipToPadding(true);
        p1Var.setVerticalScrollBarEnabled(false);
        sVar.O = new x1(this, 1);
        p1Var.setOnItemClickListener(new ai.g(this, 4));
        p1Var.setOnScrollListener(new ai.r(this, 2));
        s4.j jVar = new s4.j();
        jVar.c = 220L;
        jVar.e = 220L;
        jVar.f = 160L;
        jVar.g = 160L;
        jVar.i = rr.g;
        p1Var.setItemAnimator(jVar);
        addView(p1Var, w7.y5.c(-1.0f, -1));
        d6Var = ((org.telegram.ui.ActionBar.e3) s2Var).resourcesProvider;
        l2 l2Var = new l2(context, d6Var);
        this.f = l2Var;
        l2Var.v = new bi.v(this, 3);
        addView(l2Var, w7.y5.e(-1, -2, 48));
        d6Var2 = ((org.telegram.ui.ActionBar.e3) s2Var).resourcesProvider;
        c2 c2Var = new c2(this, context, d6Var2);
        this.e = c2Var;
        addView(c2Var, w7.y5.c(36.0f, -1));
    }

    @Override // ci.a2
    public final void a(int i10) {
        int i11;
        this.a = i10;
        this.b.Y2 = i10 == 0;
        int i12 = i10 == 0 ? 8 : 5;
        this.h = i12;
        this.d.y1(i12);
        boolean z10 = this.r;
        d2 d2Var = this.c;
        if (!z10) {
            d2Var.D(null);
        }
        s2 s2Var = this.s;
        int i13 = s2Var.c;
        l2 l2Var = this.f;
        if (i13 >= 0) {
            l2Var.r = true;
            l2Var.d.setText("");
            l2Var.r = false;
            k2 k2Var = l2Var.f;
            if (k2Var != null) {
                k2Var.E1(s2Var.c);
                l2Var.f.C1();
                if (l2Var.f.getSelectedCategory() != null) {
                    d2Var.H = l2Var.f.getSelectedCategory().a;
                    androidx.fragment.app.a0 a0Var = d2Var.M;
                    AndroidUtilities.cancelRunOnUIThread(a0Var);
                    AndroidUtilities.runOnUIThread(a0Var);
                }
            }
        } else if (TextUtils.isEmpty(s2Var.b)) {
            l2Var.b();
        } else {
            l2Var.d.setText(s2Var.b);
            k2 k2Var2 = l2Var.f;
            if (k2Var2 != null) {
                k2Var2.F1(null);
                l2Var.f.D1();
            }
            AndroidUtilities.cancelRunOnUIThread(d2Var.M);
            AndroidUtilities.runOnUIThread(d2Var.M);
        }
        l2Var.a(i10, s2Var.s);
        i11 = ((org.telegram.ui.ActionBar.e3) s2Var).currentAccount;
        MediaDataController.getInstance(i11).checkStickers(i10 == 0 ? 5 : 0);
    }

    @Override // ci.a2
    public final float b() {
        float f7 = this.n;
        if (f7 >= 0.0f) {
            return f7;
        }
        int i10 = 0;
        while (true) {
            p1 p1Var = this.b;
            if (i10 >= p1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = p1Var.getChildAt(i10).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return org.telegram.messenger.f0.b(102.0f, r3.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override // ci.a2
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(AndroidUtilities.dp(16.0f) + max);
        this.f.setTranslationY(AndroidUtilities.dp(52.0f) + max);
        p1 p1Var = this.b;
        float height = p1Var.getHeight() - p1Var.getPaddingBottom();
        p1Var.Z2 = max + p1Var.getPaddingTop();
        p1Var.a3 = height;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        s2 s2Var = this.s;
        i12 = ((org.telegram.ui.ActionBar.e3) s2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.e3) s2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, 0);
        this.e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f.setTranslationY(AndroidUtilities.dp(52.0f));
        this.b.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(102.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(s2Var.r ? 0.0f : 40.0f) + AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
