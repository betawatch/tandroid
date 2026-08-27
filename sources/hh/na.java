package hh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class na extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final p71 b;
    public final ma c;

    public na(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.a = i10;
        setOrientation(1);
        p71 p71Var = new p71(context, null);
        this.b = p71Var;
        ma maVar = new ma(context, i10, z10, j10, i11, c6Var);
        this.c = maVar;
        p71Var.setAdapter(maVar);
        View n10 = p71Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d7, c6Var));
        addView(n10, h7.z5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(h7.z5.z(-1.0f), h7.z5.z(1.0f / AndroidUtilities.density)));
        addView(p71Var, h7.z5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.c.i();
            this.b.o(true);
        }
    }

    public zk0 getCurrentListView() {
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
