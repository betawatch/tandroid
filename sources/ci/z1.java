package ci;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class z1 extends a2 implements NotificationCenter.NotificationCenterDelegate {
    public final ai.w0 b;
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
        ai.w0 w0Var = new ai.w0(this, context, 1);
        this.b = w0Var;
        w1 w1Var = new w1(this);
        this.c = w1Var;
        w0Var.setAdapter(w1Var);
        y1 y1Var = new y1(this);
        this.e = y1Var;
        w0Var.setLayoutManager(y1Var);
        w0Var.i(new r1(this, 0));
        w0Var.setClipToPadding(true);
        w0Var.setVerticalScrollBarEnabled(false);
        ai.g gVar = new ai.g(this, 3);
        w0Var.setOnTouchListener(new q1(0, this, gVar));
        w0Var.setOnItemClickListener(gVar);
        w0Var.setOnScrollListener(new ai.r(this, 2));
        addView(w0Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        f6Var = ((org.telegram.ui.ActionBar.g3) t2Var).resourcesProvider;
        l2 l2Var = new l2(context, f6Var);
        this.d = l2Var;
        l2Var.v = new bi.v(this, 2);
        l2Var.a(2, false);
        addView(l2Var, w7.x5.e(-1, -2, 48));
    }

    @Override // ci.a2
    public final void a(int i10) {
        w1 w1Var = this.c;
        w1.E(w1Var, false);
        if (this.n.isEmpty() && TextUtils.isEmpty(this.r.b)) {
            w1Var.G();
        }
        w1Var.H(null);
    }

    @Override // ci.a2
    public final float b() {
        int i10 = 0;
        while (true) {
            ai.w0 w0Var = this.b;
            if (i10 >= w0Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = w0Var.getChildAt(i10).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return Math.max(0, r2.getBottom());
            }
            i10++;
        }
    }

    @Override // ci.a2
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
        i10 = ((org.telegram.ui.ActionBar.g3) this.r).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.g3) this.r).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        t2 t2Var = this.r;
        i12 = ((org.telegram.ui.ActionBar.g3) t2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.g3) t2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
