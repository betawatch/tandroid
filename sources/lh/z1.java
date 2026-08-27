package lh;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class z1 extends v1 {
    public final o1 b;
    public final y1 c;
    public final f2.x d;
    public final x1 e;
    public final e2 f;
    public int h;
    public float n;
    public boolean r;
    public final /* synthetic */ l2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(l2 l2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        this.s = l2Var;
        this.h = 8;
        this.n = -1.0f;
        this.r = false;
        o1 o1Var = new o1(context);
        this.b = o1Var;
        y1 y1Var = new y1(this);
        this.c = y1Var;
        o1Var.setAdapter(y1Var);
        f2.x xVar = new f2.x(this.h);
        this.d = xVar;
        o1Var.setLayoutManager(xVar);
        o1Var.setClipToPadding(true);
        o1Var.setVerticalScrollBarEnabled(false);
        xVar.O = new gh.u5(this, 3);
        o1Var.setOnItemClickListener(new ag.p0(this, 13));
        o1Var.setOnScrollListener(new ag.z2(this, 14));
        f2.l lVar = new f2.l();
        lVar.c = 220L;
        lVar.e = 220L;
        lVar.f = 160L;
        lVar.g = 160L;
        lVar.i = er.g;
        o1Var.setItemAnimator(lVar);
        addView(o1Var, h7.z5.c(-1.0f, -1));
        c6Var = ((org.telegram.ui.ActionBar.e3) l2Var).resourcesProvider;
        e2 e2Var = new e2(context, c6Var);
        this.f = e2Var;
        e2Var.v = new ch.c(this, 26);
        addView(e2Var, h7.z5.e(-1, -2, 48));
        c6Var2 = ((org.telegram.ui.ActionBar.e3) l2Var).resourcesProvider;
        x1 x1Var = new x1(this, context, c6Var2);
        this.e = x1Var;
        addView(x1Var, h7.z5.c(36.0f, -1));
    }

    @Override // lh.v1
    public final void a(int i10) {
        int i11;
        this.a = i10;
        this.b.U2 = i10 == 0;
        int i12 = i10 == 0 ? 8 : 5;
        this.h = i12;
        this.d.y1(i12);
        boolean z10 = this.r;
        y1 y1Var = this.c;
        if (!z10) {
            y1Var.D(null);
        }
        l2 l2Var = this.s;
        int i13 = l2Var.c;
        e2 e2Var = this.f;
        if (i13 >= 0) {
            e2Var.r = true;
            e2Var.d.setText("");
            e2Var.r = false;
            d2 d2Var = e2Var.f;
            if (d2Var != null) {
                d2Var.E1(l2Var.c);
                e2Var.f.C1();
                if (e2Var.f.getSelectedCategory() != null) {
                    y1Var.D = e2Var.f.getSelectedCategory().a;
                    kh.c cVar = y1Var.I;
                    AndroidUtilities.cancelRunOnUIThread(cVar);
                    AndroidUtilities.runOnUIThread(cVar);
                }
            }
        } else if (TextUtils.isEmpty(l2Var.b)) {
            e2Var.b();
        } else {
            e2Var.d.setText(l2Var.b);
            d2 d2Var2 = e2Var.f;
            if (d2Var2 != null) {
                d2Var2.F1(null);
                e2Var.f.D1();
            }
            AndroidUtilities.cancelRunOnUIThread(y1Var.I);
            AndroidUtilities.runOnUIThread(y1Var.I);
        }
        e2Var.a(i10, l2Var.s);
        i11 = ((org.telegram.ui.ActionBar.e3) l2Var).currentAccount;
        MediaDataController.getInstance(i11).checkStickers(i10 == 0 ? 5 : 0);
    }

    @Override // lh.v1
    public final float b() {
        float f10 = this.n;
        if (f10 >= 0.0f) {
            return f10;
        }
        int i10 = 0;
        while (true) {
            o1 o1Var = this.b;
            if (i10 >= o1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = o1Var.getChildAt(i10).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return i0.a.d(102.0f, r3.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override // lh.v1
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(AndroidUtilities.dp(16.0f) + max);
        this.f.setTranslationY(AndroidUtilities.dp(52.0f) + max);
        o1 o1Var = this.b;
        float height = o1Var.getHeight() - o1Var.getPaddingBottom();
        o1Var.V2 = max + o1Var.getPaddingTop();
        o1Var.W2 = height;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        l2 l2Var = this.s;
        i12 = ((org.telegram.ui.ActionBar.e3) l2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.e3) l2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, 0);
        this.e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f.setTranslationY(AndroidUtilities.dp(52.0f));
        this.b.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(102.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(l2Var.r ? 0.0f : 40.0f) + AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
