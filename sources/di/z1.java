package di;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class z1 extends a2 implements NotificationCenter.NotificationCenterDelegate {
    public final bi.o0 b;
    public final w1 c;
    public final l2 d;
    public final y1 e;
    public final s1 f;
    public final ArrayList h;
    public final ArrayList n;
    public final /* synthetic */ t2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(t2 t2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        this.r = t2Var;
        this.f = new s1();
        this.h = new ArrayList();
        this.n = new ArrayList();
        bi.o0 o0Var = new bi.o0(this, context, 1);
        this.b = o0Var;
        w1 w1Var = new w1(this);
        this.c = w1Var;
        o0Var.setAdapter(w1Var);
        y1 y1Var = new y1(this);
        this.e = y1Var;
        o0Var.setLayoutManager(y1Var);
        o0Var.i(new r1(this, 0));
        o0Var.setClipToPadding(true);
        o0Var.setVerticalScrollBarEnabled(false);
        bi.d dVar = new bi.d(this, 3);
        o0Var.setOnTouchListener(new q1(0, this, dVar));
        o0Var.setOnItemClickListener(dVar);
        o0Var.setOnScrollListener(new ah.e0(this, 3));
        addView(o0Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        f6Var = ((org.telegram.ui.ActionBar.f3) t2Var).resourcesProvider;
        l2 l2Var = new l2(context, f6Var);
        this.d = l2Var;
        l2Var.v = new ci.u(this, 2);
        l2Var.a(2, false);
        addView(l2Var, w7.x5.e(-1, -2, 48));
    }

    @Override // di.a2
    public final void a(int i10) {
        w1 w1Var = this.c;
        w1.E(w1Var, false);
        if (this.n.isEmpty() && TextUtils.isEmpty(this.r.b)) {
            w1Var.G();
        }
        w1Var.H(null);
    }

    @Override // di.a2
    public final float b() {
        int i10 = 0;
        while (true) {
            bi.o0 o0Var = this.b;
            if (i10 >= o0Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = o0Var.getChildAt(i10).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return Math.max(0, r2.getBottom());
            }
            i10++;
        }
    }

    @Override // di.a2
    public final void c() {
        this.d.setTranslationY(AndroidUtilities.dp(10.0f) + Math.max(0.0f, b()));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            w1.E(this.c, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.f3) this.r).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.f3) this.r).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        t2 t2Var = this.r;
        i12 = ((org.telegram.ui.ActionBar.f3) t2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.f3) t2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
