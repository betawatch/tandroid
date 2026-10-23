package ai;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class md extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final l91 b;
    public final ld c;

    public md(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = i10;
        setOrientation(1);
        l91 l91Var = new l91(context, null);
        this.b = l91Var;
        ld ldVar = new ld(context, i10, z10, j10, i11, g6Var);
        this.c = ldVar;
        l91Var.setAdapter(ldVar);
        View n10 = l91Var.n(3, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, g6Var);
        addView(n10, w7.z5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.z5.z(-1.0f), w7.z5.z(1.0f / AndroidUtilities.density)));
        addView(l91Var, w7.z5.n(-1, -1));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, this, g6Var);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.c.i();
            this.b.o(true);
        }
    }

    public mm0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof kd) {
            return ((kd) currentView).a;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        this.c.i();
        this.b.o(false);
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
