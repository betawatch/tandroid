package bi;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class q2 extends l2 {
    public final w1 b;
    public final p2 c;
    public final s4.s d;
    public final n2 e;
    public final x2 f;
    public int h;
    public float n;
    public boolean r;
    public final /* synthetic */ f3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(f3 f3Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        this.s = f3Var;
        this.h = 8;
        this.n = -1.0f;
        this.r = false;
        w1 w1Var = new w1(context);
        this.b = w1Var;
        p2 p2Var = new p2(this);
        this.c = p2Var;
        w1Var.setAdapter(p2Var);
        s4.s sVar = new s4.s(this.h);
        this.d = sVar;
        w1Var.setLayoutManager(sVar);
        w1Var.setClipToPadding(true);
        w1Var.setVerticalScrollBarEnabled(false);
        sVar.O = new i2(this, 1);
        w1Var.setOnItemClickListener(new ai.g(this, 3));
        w1Var.setOnScrollListener(new a2(this, 1));
        s4.j jVar = new s4.j();
        jVar.c = 220L;
        jVar.e = 220L;
        jVar.f = 160L;
        jVar.g = 160L;
        jVar.i = wr.g;
        w1Var.setItemAnimator(jVar);
        addView(w1Var, w7.a6.c(-1.0f, -1));
        f6Var = ((org.telegram.ui.ActionBar.h3) f3Var).resourcesProvider;
        x2 x2Var = new x2(context, f6Var);
        this.f = x2Var;
        x2Var.v = new ai.c0(this, 3);
        addView(x2Var, w7.a6.e(-1, -2, 48));
        f6Var2 = ((org.telegram.ui.ActionBar.h3) f3Var).resourcesProvider;
        n2 n2Var = new n2(this, context, f6Var2);
        this.e = n2Var;
        addView(n2Var, w7.a6.c(36.0f, -1));
    }

    @Override // bi.l2
    public final void a(int i10) {
        int i11;
        this.a = i10;
        this.b.Y2 = i10 == 0;
        int i12 = i10 == 0 ? 8 : 5;
        this.h = i12;
        this.d.y1(i12);
        boolean z10 = this.r;
        p2 p2Var = this.c;
        if (!z10) {
            p2Var.D(null);
        }
        f3 f3Var = this.s;
        int i13 = f3Var.c;
        x2 x2Var = this.f;
        if (i13 >= 0) {
            x2Var.r = true;
            x2Var.d.setText("");
            x2Var.r = false;
            w2 w2Var = x2Var.f;
            if (w2Var != null) {
                w2Var.D1(f3Var.c);
                x2Var.f.B1();
                if (x2Var.f.getSelectedCategory() != null) {
                    p2Var.H = x2Var.f.getSelectedCategory().a;
                    a3.d dVar = p2Var.M;
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    AndroidUtilities.runOnUIThread(dVar);
                }
            }
        } else if (TextUtils.isEmpty(f3Var.b)) {
            x2Var.b();
        } else {
            x2Var.d.setText(f3Var.b);
            w2 w2Var2 = x2Var.f;
            if (w2Var2 != null) {
                w2Var2.E1(null);
                x2Var.f.C1();
            }
            AndroidUtilities.cancelRunOnUIThread(p2Var.M);
            AndroidUtilities.runOnUIThread(p2Var.M);
        }
        x2Var.a(i10, f3Var.s);
        i11 = ((org.telegram.ui.ActionBar.h3) f3Var).currentAccount;
        MediaDataController.getInstance(i11).checkStickers(i10 == 0 ? 5 : 0);
    }

    @Override // bi.l2
    public final float b() {
        float f7 = this.n;
        if (f7 >= 0.0f) {
            return f7;
        }
        int i10 = 0;
        while (true) {
            w1 w1Var = this.b;
            if (i10 >= w1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = w1Var.getChildAt(i10).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return hc.b.g(102.0f, r3.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override // bi.l2
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(AndroidUtilities.dp(16.0f) + max);
        this.f.setTranslationY(AndroidUtilities.dp(52.0f) + max);
        w1 w1Var = this.b;
        float height = w1Var.getHeight() - w1Var.getPaddingBottom();
        w1Var.Z2 = max + w1Var.getPaddingTop();
        w1Var.a3 = height;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        f3 f3Var = this.s;
        i12 = ((org.telegram.ui.ActionBar.h3) f3Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.h3) f3Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, 0);
        this.e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f.setTranslationY(AndroidUtilities.dp(52.0f));
        this.b.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(102.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(f3Var.r ? 0.0f : 40.0f) + AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
