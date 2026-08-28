package kh;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class w1 extends x1 implements NotificationCenter.NotificationCenterDelegate {
    public final gh.f1 b;
    public final u1 c;
    public final g2 d;
    public final v1 e;
    public final s1 f;
    public final ArrayList h;
    public final ArrayList n;
    public final /* synthetic */ n2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(n2 n2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.b6 b6Var;
        this.r = n2Var;
        this.f = new s1();
        this.h = new ArrayList();
        this.n = new ArrayList();
        gh.f1 f1Var = new gh.f1(this, context, 2);
        this.b = f1Var;
        u1 u1Var = new u1(this);
        this.c = u1Var;
        f1Var.setAdapter(u1Var);
        v1 v1Var = new v1(this);
        this.e = v1Var;
        f1Var.setLayoutManager(v1Var);
        f1Var.i(new bg.p2(this, 1));
        f1Var.setClipToPadding(true);
        f1Var.setVerticalScrollBarEnabled(false);
        eh.j jVar = new eh.j(this, 10);
        f1Var.setOnTouchListener(new r1(0, this, jVar));
        f1Var.setOnItemClickListener(jVar);
        f1Var.setOnScrollListener(new bg.o2(this, 12));
        addView(f1Var, g7.e6.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        b6Var = ((org.telegram.ui.ActionBar.f3) n2Var).resourcesProvider;
        g2 g2Var = new g2(context, b6Var);
        this.d = g2Var;
        g2Var.v = new bh.c(this, 25);
        g2Var.a(2, false);
        addView(g2Var, g7.e6.e(-1, -2, 48));
    }

    @Override // kh.x1
    public final void a(int i9) {
        u1 u1Var = this.c;
        u1.E(u1Var, false);
        if (this.n.isEmpty() && TextUtils.isEmpty(this.r.b)) {
            u1Var.G();
        }
        u1Var.H(null);
    }

    @Override // kh.x1
    public final float b() {
        int i9 = 0;
        while (true) {
            gh.f1 f1Var = this.b;
            if (i9 >= f1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = f1Var.getChildAt(i9).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return Math.max(0, r2.getBottom());
            }
            i9++;
        }
    }

    @Override // kh.x1
    public final void c() {
        this.d.setTranslationY(AndroidUtilities.dp(10.0f) + Math.max(0.0f, b()));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.recentDocumentsDidLoad) {
            u1.E(this.c, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i9;
        super.onAttachedToWindow();
        i9 = ((org.telegram.ui.ActionBar.f3) this.r).currentAccount;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int i9;
        super.onDetachedFromWindow();
        i9 = ((org.telegram.ui.ActionBar.f3) this.r).currentAccount;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        n2 n2Var = this.r;
        i11 = ((org.telegram.ui.ActionBar.f3) n2Var).backgroundPaddingLeft;
        i12 = ((org.telegram.ui.ActionBar.f3) n2Var).backgroundPaddingLeft;
        setPadding(i11, 0, i12, AndroidUtilities.navigationBarHeight);
        super.onMeasure(i9, i10);
    }
}
