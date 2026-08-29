package jh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.z71;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class ha extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final z71 b;
    public final ga c;

    public ha(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.a = i10;
        setOrientation(1);
        z71 z71Var = new z71(context, null);
        this.b = z71Var;
        ga gaVar = new ga(context, i10, z10, j10, i11, c6Var);
        this.c = gaVar;
        z71Var.setAdapter(gaVar);
        View n10 = z71Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d7, c6Var));
        addView(n10, i7.f6.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(i7.f6.z(-1.0f), i7.f6.z(1.0f / AndroidUtilities.density)));
        addView(z71Var, i7.f6.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.c.i();
            this.b.o(true);
        }
    }

    public jl0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof fa) {
            return ((fa) currentView).a;
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
