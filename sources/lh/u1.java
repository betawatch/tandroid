package lh;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class u1 extends v1 implements NotificationCenter.NotificationCenterDelegate {
    public final hh.f1 b;
    public final s1 c;
    public final e2 d;
    public final t1 e;
    public final q1 f;
    public final ArrayList h;
    public final ArrayList n;
    public final /* synthetic */ l2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(l2 l2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        this.r = l2Var;
        this.f = new q1();
        this.h = new ArrayList();
        this.n = new ArrayList();
        hh.f1 f1Var = new hh.f1(this, context, 2);
        this.b = f1Var;
        s1 s1Var = new s1(this);
        this.c = s1Var;
        f1Var.setAdapter(s1Var);
        t1 t1Var = new t1(this);
        this.e = t1Var;
        f1Var.setLayoutManager(t1Var);
        f1Var.i(new cg.h2(this, 1));
        f1Var.setClipToPadding(true);
        f1Var.setVerticalScrollBarEnabled(false);
        ag.p0 p0Var = new ag.p0(this, 12);
        f1Var.setOnTouchListener(new p1(0, this, p0Var));
        f1Var.setOnItemClickListener(p0Var);
        f1Var.setOnScrollListener(new ag.z2(this, 13));
        addView(f1Var, h7.z5.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        c6Var = ((org.telegram.ui.ActionBar.e3) l2Var).resourcesProvider;
        e2 e2Var = new e2(context, c6Var);
        this.d = e2Var;
        e2Var.v = new ch.c(this, 25);
        e2Var.a(2, false);
        addView(e2Var, h7.z5.e(-1, -2, 48));
    }

    @Override // lh.v1
    public final void a(int i10) {
        s1 s1Var = this.c;
        s1.E(s1Var, false);
        if (this.n.isEmpty() && TextUtils.isEmpty(this.r.b)) {
            s1Var.G();
        }
        s1Var.H(null);
    }

    @Override // lh.v1
    public final float b() {
        int i10 = 0;
        while (true) {
            hh.f1 f1Var = this.b;
            if (i10 >= f1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = f1Var.getChildAt(i10).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return Math.max(0, r2.getBottom());
            }
            i10++;
        }
    }

    @Override // lh.v1
    public final void c() {
        this.d.setTranslationY(AndroidUtilities.dp(10.0f) + Math.max(0.0f, b()));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            s1.E(this.c, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.e3) this.r).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.e3) this.r).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        l2 l2Var = this.r;
        i12 = ((org.telegram.ui.ActionBar.e3) l2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.e3) l2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
