package lh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.rl0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class ia extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final l81 b;
    public final ha c;

    public ia(Context context, int i10, boolean z4, long j10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = i10;
        setOrientation(1);
        l81 l81Var = new l81(context, null);
        this.b = l81Var;
        ha haVar = new ha(context, i10, z4, j10, i11, f6Var);
        this.c = haVar;
        l81Var.setAdapter(haVar);
        View n10 = l81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, f6Var));
        addView(n10, k7.b6.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(k7.b6.z(-1.0f), k7.b6.z(1.0f / AndroidUtilities.density)));
        addView(l81Var, k7.b6.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.c.i();
            this.b.o(true);
        }
    }

    public rl0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof ga) {
            return ((ga) currentView).a;
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
