package ei;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class v1 extends w1 implements NotificationCenter.NotificationCenterDelegate {
    public final ai.u1 b;
    public final t1 c;
    public final h2 d;
    public final u1 e;
    public final r1 f;
    public final ArrayList h;
    public final ArrayList n;
    public final /* synthetic */ n2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(n2 n2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        this.r = n2Var;
        this.f = new r1();
        this.h = new ArrayList();
        this.n = new ArrayList();
        ai.u1 u1Var = new ai.u1(this, context, 2);
        this.b = u1Var;
        t1 t1Var = new t1(this);
        this.c = t1Var;
        u1Var.setAdapter(t1Var);
        u1 u1Var2 = new u1(this);
        this.e = u1Var2;
        u1Var.setLayoutManager(u1Var2);
        u1Var.i(new q1(this, 0));
        u1Var.setClipToPadding(true);
        u1Var.setVerticalScrollBarEnabled(false);
        ai.wa waVar = new ai.wa(this, 7);
        u1Var.setOnTouchListener(new p1(0, this, waVar));
        u1Var.setOnItemClickListener(waVar);
        u1Var.setOnScrollListener(new ah.d0(this, 6));
        addView(u1Var, w7.z5.a(-1.0f, 0.0f, 58.0f, 0.0f, 40.0f, -1, 119));
        d6Var = ((org.telegram.ui.ActionBar.f3) n2Var).resourcesProvider;
        h2 h2Var = new h2(context, d6Var);
        this.d = h2Var;
        h2Var.v = new ai.q(this, 13);
        h2Var.a(2, false);
        addView(h2Var, w7.z5.e(-1, -2, 48));
    }

    @Override // ei.w1
    public final void a(int i10) {
        t1 t1Var = this.c;
        t1.E(t1Var, false);
        if (this.n.isEmpty() && TextUtils.isEmpty(this.r.b)) {
            t1Var.G();
        }
        t1Var.H(null);
    }

    @Override // ei.w1
    public final float b() {
        int i10 = 0;
        while (true) {
            ai.u1 u1Var = this.b;
            if (i10 >= u1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = u1Var.getChildAt(i10).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return Math.max(0, r2.getBottom());
            }
            i10++;
        }
    }

    @Override // ei.w1
    public final void c() {
        this.d.setTranslationY(AndroidUtilities.dp(10.0f) + Math.max(0.0f, b()));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            t1.E(this.c, true);
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
        n2 n2Var = this.r;
        i12 = ((org.telegram.ui.ActionBar.f3) n2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.f3) n2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
