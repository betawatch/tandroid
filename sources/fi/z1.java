package fi;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class z1 extends v1 {
    public final n1 b;
    public final y1 c;
    public final s4.t d;
    public final x1 e;
    public final f2 f;
    public int h;
    public float n;
    public boolean r;
    public final /* synthetic */ l2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(l2 l2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        this.s = l2Var;
        this.h = 8;
        this.n = -1.0f;
        this.r = false;
        n1 n1Var = new n1(context);
        this.b = n1Var;
        y1 y1Var = new y1(this);
        this.c = y1Var;
        n1Var.setAdapter(y1Var);
        s4.t tVar = new s4.t(this.h);
        this.d = tVar;
        n1Var.setLayoutManager(tVar);
        n1Var.setClipToPadding(true);
        n1Var.setVerticalScrollBarEnabled(false);
        tVar.O = new ai.l(this, 3);
        n1Var.setOnItemClickListener(new ai.k(this, 9));
        n1Var.setOnScrollListener(new ai.b(this, 10));
        s4.l lVar = new s4.l();
        lVar.c = 220L;
        lVar.e = 220L;
        lVar.f = 160L;
        lVar.g = 160L;
        lVar.i = ds.g;
        n1Var.setItemAnimator(lVar);
        addView(n1Var, gb1.g(-1.0f, -1));
        u6Var = ((org.telegram.ui.ActionBar.k3) l2Var).resourcesProvider;
        f2 f2Var = new f2(context, u6Var);
        this.f = f2Var;
        f2Var.w = new ai.e(this, 17);
        addView(f2Var, gb1.i(-1, -2, 48));
        u6Var2 = ((org.telegram.ui.ActionBar.k3) l2Var).resourcesProvider;
        x1 x1Var = new x1(this, context, u6Var2);
        this.e = x1Var;
        addView(x1Var, gb1.g(36.0f, -1));
    }

    @Override // fi.v1
    public final void a(int i10) {
        int i11;
        this.a = i10;
        this.b.g3 = i10 == 0;
        int i12 = i10 == 0 ? 8 : 5;
        this.h = i12;
        this.d.z1(i12);
        boolean z10 = this.r;
        y1 y1Var = this.c;
        if (!z10) {
            y1Var.D(null);
        }
        l2 l2Var = this.s;
        int i13 = l2Var.c;
        f2 f2Var = this.f;
        if (i13 >= 0) {
            f2Var.s = true;
            f2Var.e.setText("");
            f2Var.s = false;
            e2 e2Var = f2Var.h;
            if (e2Var != null) {
                e2Var.K1(l2Var.c);
                f2Var.h.I1();
                if (f2Var.h.getSelectedCategory() != null) {
                    y1Var.H = f2Var.h.getSelectedCategory().a;
                    di.s8 s8Var = y1Var.M;
                    AndroidUtilities.cancelRunOnUIThread(s8Var);
                    AndroidUtilities.runOnUIThread(s8Var);
                }
            }
        } else if (TextUtils.isEmpty(l2Var.b)) {
            f2Var.b();
        } else {
            f2Var.e.setText(l2Var.b);
            e2 e2Var2 = f2Var.h;
            if (e2Var2 != null) {
                e2Var2.L1(null);
                f2Var.h.J1();
            }
            AndroidUtilities.cancelRunOnUIThread(y1Var.M);
            AndroidUtilities.runOnUIThread(y1Var.M);
        }
        f2Var.a(i10, l2Var.s);
        i11 = ((org.telegram.ui.ActionBar.k3) l2Var).currentAccount;
        MediaDataController.getInstance(i11).checkStickers(i10 == 0 ? 5 : 0);
    }

    @Override // fi.v1
    public final float b() {
        float f7 = this.n;
        if (f7 >= 0.0f) {
            return f7;
        }
        int i10 = 0;
        while (true) {
            n1 n1Var = this.b;
            if (i10 >= n1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = n1Var.getChildAt(i10).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return org.telegram.messenger.t.c(102.0f, r3.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override // fi.v1
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(AndroidUtilities.dp(16.0f) + max);
        this.f.setTranslationY(AndroidUtilities.dp(52.0f) + max);
        n1 n1Var = this.b;
        float height = n1Var.getHeight() - n1Var.getPaddingBottom();
        n1Var.h3 = max + n1Var.getPaddingTop();
        n1Var.i3 = height;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        l2 l2Var = this.s;
        i12 = ((org.telegram.ui.ActionBar.k3) l2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.k3) l2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, 0);
        this.e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f.setTranslationY(AndroidUtilities.dp(52.0f));
        this.b.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(102.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(l2Var.r ? 0.0f : 40.0f) + AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
