package ci;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class d2 extends z1 {
    public final o1 b;
    public final c2 c;
    public final s4.s d;
    public final b2 e;
    public final k2 f;
    public int h;
    public float n;
    public boolean r;
    public final /* synthetic */ r2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(r2 r2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        this.s = r2Var;
        this.h = 8;
        this.n = -1.0f;
        this.r = false;
        o1 o1Var = new o1(context);
        this.b = o1Var;
        c2 c2Var = new c2(this);
        this.c = c2Var;
        o1Var.setAdapter(c2Var);
        s4.s sVar = new s4.s(this.h);
        this.d = sVar;
        o1Var.setLayoutManager(sVar);
        o1Var.setClipToPadding(true);
        o1Var.setVerticalScrollBarEnabled(false);
        sVar.O = new w1(this, 1);
        o1Var.setOnItemClickListener(new ai.g(this, 4));
        o1Var.setOnScrollListener(new ai.r(this, 2));
        s4.j jVar = new s4.j();
        jVar.c = 220L;
        jVar.e = 220L;
        jVar.f = 160L;
        jVar.g = 160L;
        jVar.i = hs.g;
        o1Var.setItemAnimator(jVar);
        addView(o1Var, w7.x5.d(-1.0f, -1));
        e6Var = ((org.telegram.ui.ActionBar.f3) r2Var).resourcesProvider;
        k2 k2Var = new k2(context, e6Var);
        this.f = k2Var;
        k2Var.v = new bi.v(this, 3);
        addView(k2Var, w7.x5.e(-1, -2, 48));
        e6Var2 = ((org.telegram.ui.ActionBar.f3) r2Var).resourcesProvider;
        b2 b2Var = new b2(this, context, e6Var2);
        this.e = b2Var;
        addView(b2Var, w7.x5.d(36.0f, -1));
    }

    @Override // ci.z1
    public final void a(int i10) {
        int i11;
        this.a = i10;
        this.b.W2 = i10 == 0;
        int i12 = i10 == 0 ? 8 : 5;
        this.h = i12;
        this.d.y1(i12);
        boolean z10 = this.r;
        c2 c2Var = this.c;
        if (!z10) {
            c2Var.D(null);
        }
        r2 r2Var = this.s;
        int i13 = r2Var.c;
        k2 k2Var = this.f;
        if (i13 >= 0) {
            k2Var.r = true;
            k2Var.d.setText("");
            k2Var.r = false;
            j2 j2Var = k2Var.f;
            if (j2Var != null) {
                j2Var.F1(r2Var.c);
                k2Var.f.D1();
                if (k2Var.f.getSelectedCategory() != null) {
                    c2Var.H = k2Var.f.getSelectedCategory().a;
                    androidx.fragment.app.a0 a0Var = c2Var.M;
                    AndroidUtilities.cancelRunOnUIThread(a0Var);
                    AndroidUtilities.runOnUIThread(a0Var);
                }
            }
        } else if (TextUtils.isEmpty(r2Var.b)) {
            k2Var.b();
        } else {
            k2Var.d.setText(r2Var.b);
            j2 j2Var2 = k2Var.f;
            if (j2Var2 != null) {
                j2Var2.G1(null);
                k2Var.f.E1();
            }
            AndroidUtilities.cancelRunOnUIThread(c2Var.M);
            AndroidUtilities.runOnUIThread(c2Var.M);
        }
        k2Var.a(i10, r2Var.s);
        i11 = ((org.telegram.ui.ActionBar.f3) r2Var).currentAccount;
        MediaDataController.getInstance(i11).checkStickers(i10 == 0 ? 5 : 0);
    }

    @Override // ci.z1
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
                return org.telegram.messenger.q.b(102.0f, r3.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override // ci.z1
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
        r2 r2Var = this.s;
        i12 = ((org.telegram.ui.ActionBar.f3) r2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.f3) r2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, 0);
        this.e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f.setTranslationY(AndroidUtilities.dp(52.0f));
        this.b.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(102.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(r2Var.r ? 0.0f : 40.0f) + AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
