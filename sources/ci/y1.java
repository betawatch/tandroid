package ci;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class y1 extends z1 implements NotificationCenter.NotificationCenterDelegate {
    public final ai.w0 b;
    public final v1 c;
    public final k2 d;
    public final x1 e;
    public final r1 f;
    public final ArrayList h;
    public final ArrayList n;
    public final /* synthetic */ r2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(r2 r2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        this.r = r2Var;
        this.f = new r1();
        this.h = new ArrayList();
        this.n = new ArrayList();
        ai.w0 w0Var = new ai.w0(this, context, 1);
        this.b = w0Var;
        v1 v1Var = new v1(this);
        this.c = v1Var;
        w0Var.setAdapter(v1Var);
        x1 x1Var = new x1(this);
        this.e = x1Var;
        w0Var.setLayoutManager(x1Var);
        w0Var.i(new q1(this, 0));
        w0Var.setClipToPadding(true);
        w0Var.setVerticalScrollBarEnabled(false);
        ai.g gVar = new ai.g(this, 3);
        w0Var.setOnTouchListener(new p1(0, this, gVar));
        w0Var.setOnItemClickListener(gVar);
        w0Var.setOnScrollListener(new ai.r(this, 1));
        addView(w0Var, w7.x5.a(-1.0f, 0.0f, 58.0f, 0.0f, 40.0f, -1, 119));
        e6Var = ((org.telegram.ui.ActionBar.f3) r2Var).resourcesProvider;
        k2 k2Var = new k2(context, e6Var);
        this.d = k2Var;
        k2Var.v = new bi.v(this, 2);
        k2Var.a(2, false);
        addView(k2Var, w7.x5.e(-1, -2, 48));
    }

    @Override // ci.z1
    public final void a(int i10) {
        v1 v1Var = this.c;
        v1.E(v1Var, false);
        if (this.n.isEmpty() && TextUtils.isEmpty(this.r.b)) {
            v1Var.G();
        }
        v1Var.H(null);
    }

    @Override // ci.z1
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

    @Override // ci.z1
    public final void c() {
        this.d.setTranslationY(AndroidUtilities.dp(10.0f) + Math.max(0.0f, b()));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            v1.E(this.c, true);
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
        r2 r2Var = this.r;
        i12 = ((org.telegram.ui.ActionBar.f3) r2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.f3) r2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
