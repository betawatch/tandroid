package nh;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class t1 extends u1 implements NotificationCenter.NotificationCenterDelegate {
    public final jh.e1 b;
    public final r1 c;
    public final d2 d;
    public final s1 e;
    public final p1 f;
    public final ArrayList h;
    public final ArrayList n;
    public final /* synthetic */ k2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(k2 k2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        this.r = k2Var;
        this.f = new p1();
        this.h = new ArrayList();
        this.n = new ArrayList();
        jh.e1 e1Var = new jh.e1(this, context, 2);
        this.b = e1Var;
        r1 r1Var = new r1(this);
        this.c = r1Var;
        e1Var.setAdapter(r1Var);
        s1 s1Var = new s1(this);
        this.e = s1Var;
        e1Var.setLayoutManager(s1Var);
        e1Var.i(new eg.f2(this, 1));
        e1Var.setClipToPadding(true);
        e1Var.setVerticalScrollBarEnabled(false);
        bg.o oVar = new bg.o(this, 14);
        e1Var.setOnTouchListener(new o1(0, this, oVar));
        e1Var.setOnItemClickListener(oVar);
        e1Var.setOnScrollListener(new cg.g2(this, 13));
        addView(e1Var, i7.f6.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        c6Var = ((org.telegram.ui.ActionBar.f3) k2Var).resourcesProvider;
        d2 d2Var = new d2(context, c6Var);
        this.d = d2Var;
        d2Var.v = new bg.t1(this, 26);
        d2Var.a(2, false);
        addView(d2Var, i7.f6.e(-1, -2, 48));
    }

    @Override // nh.u1
    public final void a(int i10) {
        r1 r1Var = this.c;
        r1.E(r1Var, false);
        if (this.n.isEmpty() && TextUtils.isEmpty(this.r.b)) {
            r1Var.G();
        }
        r1Var.H(null);
    }

    @Override // nh.u1
    public final float b() {
        int i10 = 0;
        while (true) {
            jh.e1 e1Var = this.b;
            if (i10 >= e1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = e1Var.getChildAt(i10).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return Math.max(0, r2.getBottom());
            }
            i10++;
        }
    }

    @Override // nh.u1
    public final void c() {
        this.d.setTranslationY(AndroidUtilities.dp(10.0f) + Math.max(0.0f, b()));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            r1.E(this.c, true);
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
        k2 k2Var = this.r;
        i12 = ((org.telegram.ui.ActionBar.f3) k2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.f3) k2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
