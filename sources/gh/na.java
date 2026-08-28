package gh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class na extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final n71 b;
    public final ma c;

    public na(Context context, int i9, boolean z10, long j10, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.a = i9;
        setOrientation(1);
        n71 n71Var = new n71(context, null);
        this.b = n71Var;
        ma maVar = new ma(context, i9, z10, j10, i10, b6Var);
        this.c = maVar;
        n71Var.setAdapter(maVar);
        View n10 = n71Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d7, b6Var));
        addView(n10, g7.e6.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(g7.e6.z(-1.0f), g7.e6.z(1.0f / AndroidUtilities.density)));
        addView(n71Var, g7.e6.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, b6Var));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.starTransactionsLoaded) {
            this.c.i();
            this.b.o(true);
        }
    }

    public wk0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof la) {
            return ((la) currentView).a;
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
