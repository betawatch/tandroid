package kh;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class b2 extends x1 {
    public final q1 b;
    public final a2 c;
    public final f2.y d;
    public final z1 e;
    public final g2 f;
    public int h;
    public float n;
    public boolean r;
    public final /* synthetic */ n2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(n2 n2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        this.s = n2Var;
        this.h = 8;
        this.n = -1.0f;
        this.r = false;
        q1 q1Var = new q1(context);
        this.b = q1Var;
        a2 a2Var = new a2(this);
        this.c = a2Var;
        q1Var.setAdapter(a2Var);
        f2.y yVar = new f2.y(this.h);
        this.d = yVar;
        q1Var.setLayoutManager(yVar);
        q1Var.setClipToPadding(true);
        q1Var.setVerticalScrollBarEnabled(false);
        yVar.O = new fh.c6(this, 3);
        q1Var.setOnItemClickListener(new eh.j(this, 11));
        q1Var.setOnScrollListener(new bg.o2(this, 13));
        f2.n nVar = new f2.n();
        nVar.c = 220L;
        nVar.e = 220L;
        nVar.f = 160L;
        nVar.g = 160L;
        nVar.i = gr.g;
        q1Var.setItemAnimator(nVar);
        addView(q1Var, g7.e6.c(-1.0f, -1));
        b6Var = ((org.telegram.ui.ActionBar.f3) n2Var).resourcesProvider;
        g2 g2Var = new g2(context, b6Var);
        this.f = g2Var;
        g2Var.v = new bh.c(this, 26);
        addView(g2Var, g7.e6.e(-1, -2, 48));
        b6Var2 = ((org.telegram.ui.ActionBar.f3) n2Var).resourcesProvider;
        z1 z1Var = new z1(this, context, b6Var2);
        this.e = z1Var;
        addView(z1Var, g7.e6.c(36.0f, -1));
    }

    @Override // kh.x1
    public final void a(int i9) {
        int i10;
        this.a = i9;
        this.b.U2 = i9 == 0;
        int i11 = i9 == 0 ? 8 : 5;
        this.h = i11;
        this.d.y1(i11);
        boolean z10 = this.r;
        a2 a2Var = this.c;
        if (!z10) {
            a2Var.D(null);
        }
        n2 n2Var = this.s;
        int i12 = n2Var.c;
        g2 g2Var = this.f;
        if (i12 >= 0) {
            g2Var.r = true;
            g2Var.d.setText("");
            g2Var.r = false;
            f2 f2Var = g2Var.f;
            if (f2Var != null) {
                f2Var.E1(n2Var.c);
                g2Var.f.C1();
                if (g2Var.f.getSelectedCategory() != null) {
                    a2Var.D = g2Var.f.getSelectedCategory().a;
                    f1 f1Var = a2Var.I;
                    AndroidUtilities.cancelRunOnUIThread(f1Var);
                    AndroidUtilities.runOnUIThread(f1Var);
                }
            }
        } else if (TextUtils.isEmpty(n2Var.b)) {
            g2Var.b();
        } else {
            g2Var.d.setText(n2Var.b);
            f2 f2Var2 = g2Var.f;
            if (f2Var2 != null) {
                f2Var2.F1(null);
                g2Var.f.D1();
            }
            AndroidUtilities.cancelRunOnUIThread(a2Var.I);
            AndroidUtilities.runOnUIThread(a2Var.I);
        }
        g2Var.a(i9, n2Var.s);
        i10 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
        MediaDataController.getInstance(i10).checkStickers(i9 == 0 ? 5 : 0);
    }

    @Override // kh.x1
    public final float b() {
        float f10 = this.n;
        if (f10 >= 0.0f) {
            return f10;
        }
        int i9 = 0;
        while (true) {
            q1 q1Var = this.b;
            if (i9 >= q1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = q1Var.getChildAt(i9).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return org.telegram.messenger.l0.b(102.0f, r3.getBottom(), 0);
            }
            i9++;
        }
    }

    @Override // kh.x1
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(AndroidUtilities.dp(16.0f) + max);
        this.f.setTranslationY(AndroidUtilities.dp(52.0f) + max);
        q1 q1Var = this.b;
        float height = q1Var.getHeight() - q1Var.getPaddingBottom();
        q1Var.V2 = max + q1Var.getPaddingTop();
        q1Var.W2 = height;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        n2 n2Var = this.s;
        i11 = ((org.telegram.ui.ActionBar.f3) n2Var).backgroundPaddingLeft;
        i12 = ((org.telegram.ui.ActionBar.f3) n2Var).backgroundPaddingLeft;
        setPadding(i11, 0, i12, 0);
        this.e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f.setTranslationY(AndroidUtilities.dp(52.0f));
        this.b.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(102.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(n2Var.r ? 0.0f : 40.0f) + AndroidUtilities.navigationBarHeight);
        super.onMeasure(i9, i10);
    }
}
