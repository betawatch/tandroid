package ei;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class b2 extends w1 {
    public final o1 b;
    public final a2 c;
    public final s4.s d;
    public final y1 e;
    public final h2 f;
    public int h;
    public float n;
    public boolean r;
    public final /* synthetic */ n2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(n2 n2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        this.s = n2Var;
        this.h = 8;
        this.n = -1.0f;
        this.r = false;
        o1 o1Var = new o1(context);
        this.b = o1Var;
        a2 a2Var = new a2(this);
        this.c = a2Var;
        o1Var.setAdapter(a2Var);
        s4.s sVar = new s4.s(this.h);
        this.d = sVar;
        o1Var.setLayoutManager(sVar);
        o1Var.setClipToPadding(true);
        o1Var.setVerticalScrollBarEnabled(false);
        sVar.O = new ai.q1(this, 2);
        o1Var.setOnItemClickListener(new ai.wa(this, 8));
        o1Var.setOnScrollListener(new ah.d0(this, 7));
        s4.k kVar = new s4.k();
        kVar.c = 220L;
        kVar.e = 220L;
        kVar.f = 160L;
        kVar.g = 160L;
        kVar.i = bs.g;
        o1Var.setItemAnimator(kVar);
        addView(o1Var, w7.z5.d(-1.0f, -1));
        d6Var = ((org.telegram.ui.ActionBar.f3) n2Var).resourcesProvider;
        h2 h2Var = new h2(context, d6Var);
        this.f = h2Var;
        h2Var.v = new ai.q(this, 14);
        addView(h2Var, w7.z5.e(-1, -2, 48));
        d6Var2 = ((org.telegram.ui.ActionBar.f3) n2Var).resourcesProvider;
        y1 y1Var = new y1(this, context, d6Var2);
        this.e = y1Var;
        addView(y1Var, w7.z5.d(36.0f, -1));
    }

    @Override // ei.w1
    public final void a(int i10) {
        int i11;
        this.a = i10;
        this.b.W2 = i10 == 0;
        int i12 = i10 == 0 ? 8 : 5;
        this.h = i12;
        this.d.y1(i12);
        boolean z10 = this.r;
        a2 a2Var = this.c;
        if (!z10) {
            a2Var.D(null);
        }
        n2 n2Var = this.s;
        int i13 = n2Var.c;
        h2 h2Var = this.f;
        if (i13 >= 0) {
            h2Var.r = true;
            h2Var.d.setText("");
            h2Var.r = false;
            g2 g2Var = h2Var.f;
            if (g2Var != null) {
                g2Var.F1(n2Var.c);
                h2Var.f.D1();
                if (h2Var.f.getSelectedCategory() != null) {
                    a2Var.H = h2Var.f.getSelectedCategory().a;
                    com.google.firebase.messaging.s sVar = a2Var.M;
                    AndroidUtilities.cancelRunOnUIThread(sVar);
                    AndroidUtilities.runOnUIThread(sVar);
                }
            }
        } else if (TextUtils.isEmpty(n2Var.b)) {
            h2Var.b();
        } else {
            h2Var.d.setText(n2Var.b);
            g2 g2Var2 = h2Var.f;
            if (g2Var2 != null) {
                g2Var2.G1(null);
                h2Var.f.E1();
            }
            AndroidUtilities.cancelRunOnUIThread(a2Var.M);
            AndroidUtilities.runOnUIThread(a2Var.M);
        }
        h2Var.a(i10, n2Var.s);
        i11 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
        MediaDataController.getInstance(i11).checkStickers(i10 == 0 ? 5 : 0);
    }

    @Override // ei.w1
    public final float b() {
        float f7 = this.n;
        if (f7 >= 0.0f) {
            return f7;
        }
        int i10 = 0;
        while (true) {
            o1 o1Var = this.b;
            if (i10 >= o1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = o1Var.getChildAt(i10).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return org.telegram.messenger.g0.b(102.0f, r3.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override // ei.w1
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(AndroidUtilities.dp(16.0f) + max);
        this.f.setTranslationY(AndroidUtilities.dp(52.0f) + max);
        o1 o1Var = this.b;
        float height = o1Var.getHeight() - o1Var.getPaddingBottom();
        o1Var.X2 = max + o1Var.getPaddingTop();
        o1Var.Y2 = height;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        n2 n2Var = this.s;
        i12 = ((org.telegram.ui.ActionBar.f3) n2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.f3) n2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, 0);
        this.e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f.setTranslationY(AndroidUtilities.dp(52.0f));
        this.b.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(102.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(n2Var.r ? 0.0f : 40.0f) + AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
