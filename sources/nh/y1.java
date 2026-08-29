package nh;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class y1 extends u1 {
    public final n1 b;
    public final x1 c;
    public final f2.w d;
    public final w1 e;
    public final d2 f;
    public int h;
    public float n;
    public boolean r;
    public final /* synthetic */ k2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(k2 k2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        this.s = k2Var;
        this.h = 8;
        this.n = -1.0f;
        this.r = false;
        n1 n1Var = new n1(context);
        this.b = n1Var;
        x1 x1Var = new x1(this);
        this.c = x1Var;
        n1Var.setAdapter(x1Var);
        f2.w wVar = new f2.w(this.h);
        this.d = wVar;
        n1Var.setLayoutManager(wVar);
        n1Var.setClipToPadding(true);
        n1Var.setVerticalScrollBarEnabled(false);
        wVar.O = new ih.n5(this, 3);
        n1Var.setOnItemClickListener(new bg.o(this, 15));
        n1Var.setOnScrollListener(new cg.g2(this, 14));
        f2.l lVar = new f2.l();
        lVar.c = 220L;
        lVar.e = 220L;
        lVar.f = 160L;
        lVar.g = 160L;
        lVar.i = jr.g;
        n1Var.setItemAnimator(lVar);
        addView(n1Var, i7.f6.c(-1.0f, -1));
        c6Var = ((org.telegram.ui.ActionBar.f3) k2Var).resourcesProvider;
        d2 d2Var = new d2(context, c6Var);
        this.f = d2Var;
        d2Var.v = new bg.t1(this, 27);
        addView(d2Var, i7.f6.e(-1, -2, 48));
        c6Var2 = ((org.telegram.ui.ActionBar.f3) k2Var).resourcesProvider;
        w1 w1Var = new w1(this, context, c6Var2);
        this.e = w1Var;
        addView(w1Var, i7.f6.c(36.0f, -1));
    }

    @Override // nh.u1
    public final void a(int i10) {
        int i11;
        this.a = i10;
        this.b.U2 = i10 == 0;
        int i12 = i10 == 0 ? 8 : 5;
        this.h = i12;
        this.d.y1(i12);
        boolean z10 = this.r;
        x1 x1Var = this.c;
        if (!z10) {
            x1Var.D(null);
        }
        k2 k2Var = this.s;
        int i13 = k2Var.c;
        d2 d2Var = this.f;
        if (i13 >= 0) {
            d2Var.r = true;
            d2Var.d.setText("");
            d2Var.r = false;
            c2 c2Var = d2Var.f;
            if (c2Var != null) {
                c2Var.E1(k2Var.c);
                d2Var.f.C1();
                if (d2Var.f.getSelectedCategory() != null) {
                    x1Var.D = d2Var.f.getSelectedCategory().a;
                    lh.m5 m5Var = x1Var.I;
                    AndroidUtilities.cancelRunOnUIThread(m5Var);
                    AndroidUtilities.runOnUIThread(m5Var);
                }
            }
        } else if (TextUtils.isEmpty(k2Var.b)) {
            d2Var.b();
        } else {
            d2Var.d.setText(k2Var.b);
            c2 c2Var2 = d2Var.f;
            if (c2Var2 != null) {
                c2Var2.F1(null);
                d2Var.f.D1();
            }
            AndroidUtilities.cancelRunOnUIThread(x1Var.I);
            AndroidUtilities.runOnUIThread(x1Var.I);
        }
        d2Var.a(i10, k2Var.s);
        i11 = ((org.telegram.ui.ActionBar.f3) k2Var).currentAccount;
        MediaDataController.getInstance(i11).checkStickers(i10 == 0 ? 5 : 0);
    }

    @Override // nh.u1
    public final float b() {
        float f9 = this.n;
        if (f9 >= 0.0f) {
            return f9;
        }
        int i10 = 0;
        while (true) {
            n1 n1Var = this.b;
            if (i10 >= n1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = n1Var.getChildAt(i10).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return j7.l1.d(102.0f, r3.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override // nh.u1
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(AndroidUtilities.dp(16.0f) + max);
        this.f.setTranslationY(AndroidUtilities.dp(52.0f) + max);
        n1 n1Var = this.b;
        float height = n1Var.getHeight() - n1Var.getPaddingBottom();
        n1Var.V2 = max + n1Var.getPaddingTop();
        n1Var.W2 = height;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        k2 k2Var = this.s;
        i12 = ((org.telegram.ui.ActionBar.f3) k2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.f3) k2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, 0);
        this.e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f.setTranslationY(AndroidUtilities.dp(52.0f));
        this.b.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(102.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(k2Var.r ? 0.0f : 40.0f) + AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
