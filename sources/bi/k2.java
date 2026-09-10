package bi;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class k2 extends l2 implements NotificationCenter.NotificationCenterDelegate {
    public final y1 b;
    public final h2 c;
    public final x2 d;
    public final j2 e;
    public final b2 f;
    public final ArrayList h;
    public final ArrayList n;
    public final /* synthetic */ f3 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(f3 f3Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        this.r = f3Var;
        this.f = new b2();
        this.h = new ArrayList();
        this.n = new ArrayList();
        y1 y1Var = new y1(this, context, 0);
        this.b = y1Var;
        h2 h2Var = new h2(this);
        this.c = h2Var;
        y1Var.setAdapter(h2Var);
        j2 j2Var = new j2(this);
        this.e = j2Var;
        y1Var.setLayoutManager(j2Var);
        y1Var.i(new z1(this, 0));
        y1Var.setClipToPadding(true);
        y1Var.setVerticalScrollBarEnabled(false);
        ai.g gVar = new ai.g(this, 2);
        y1Var.setOnTouchListener(new x1(0, this, gVar));
        y1Var.setOnItemClickListener(gVar);
        y1Var.setOnScrollListener(new a2(this, 0));
        addView(y1Var, w7.a6.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        f6Var = ((org.telegram.ui.ActionBar.h3) f3Var).resourcesProvider;
        x2 x2Var = new x2(context, f6Var);
        this.d = x2Var;
        x2Var.v = new ai.c0(this, 2);
        x2Var.a(2, false);
        addView(x2Var, w7.a6.e(-1, -2, 48));
    }

    @Override // bi.l2
    public final void a(int i10) {
        h2 h2Var = this.c;
        h2.E(h2Var, false);
        if (this.n.isEmpty() && TextUtils.isEmpty(this.r.b)) {
            h2Var.G();
        }
        h2Var.H(null);
    }

    @Override // bi.l2
    public final float b() {
        int i10 = 0;
        while (true) {
            y1 y1Var = this.b;
            if (i10 >= y1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = y1Var.getChildAt(i10).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return Math.max(0, r2.getBottom());
            }
            i10++;
        }
    }

    @Override // bi.l2
    public final void c() {
        this.d.setTranslationY(AndroidUtilities.dp(10.0f) + Math.max(0.0f, b()));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            h2.E(this.c, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.h3) this.r).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.h3) this.r).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        f3 f3Var = this.r;
        i12 = ((org.telegram.ui.ActionBar.h3) f3Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.h3) f3Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
