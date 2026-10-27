package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v91;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class cd extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final v91 b;
    public final bd c;
    public final FrameLayout d;
    public final mw0 e;
    public final long f;

    public cd(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.u6 u6Var, mw0 mw0Var) {
        super(context);
        this.e = mw0Var;
        this.a = i10;
        this.f = j10;
        setOrientation(1);
        v91 v91Var = mw0Var == null ? new v91(context, null) : new pm0(context, u6Var, mw0Var);
        this.b = v91Var;
        bd bdVar = new bd(context, i10, z10, j10, i11, u6Var);
        this.c = bdVar;
        bdVar.g = mw0Var == null ? null : (pm0) v91Var;
        v91Var.setAdapter(bdVar);
        View n10 = v91Var.n(mw0Var == null ? 3 : -2, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d7, view, u6Var);
        if (mw0Var == null) {
            this.d = null;
            addView(n10, kb1.r(-1, 48));
            addView(view, new LinearLayout.LayoutParams(kb1.I(-1.0f), kb1.I(1.0f / AndroidUtilities.density)));
            setBackgroundColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h5, u6Var));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            frameLayout.addView(n10, kb1.i(-1, 48, 48));
        }
        addView(v91Var, kb1.r(-1, -1));
    }

    public final void a(boolean z10) {
        bd bdVar = this.c;
        v91 v91Var = this.b;
        mw0 mw0Var = this.e;
        if (mw0Var == null) {
            bdVar.i();
            v91Var.o(z10);
            return;
        }
        ArrayList arrayList = bdVar.i;
        ArrayList arrayList2 = bdVar.i;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i10 |= 1 << ((u61) arrayList.get(i11)).z;
        }
        View currentView = v91Var.getCurrentView();
        int i12 = currentView instanceof ad ? ((ad) currentView).d : 0;
        bdVar.i();
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            i13 |= 1 << ((u61) arrayList2.get(i14)).z;
        }
        if (i10 == i13) {
            if (z10) {
                return;
            }
            v91Var.o(false);
            return;
        }
        v91Var.onTouchEvent(null);
        int i15 = 0;
        while (true) {
            if (i15 >= arrayList2.size()) {
                i15 = 0;
                break;
            } else if (((u61) arrayList2.get(i15)).z == i12) {
                break;
            } else {
                i15++;
            }
        }
        v91Var.setPosition(i15);
        v91Var.J();
        v91Var.o(false);
        mw0Var.l();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        long j10 = this.f;
        if ((i10 == i12 && j10 == 0) || (i10 == NotificationCenter.botStarsTransactionsLoaded && j10 != 0 && ((Long) objArr[0]).longValue() == j10)) {
            a(true);
        }
    }

    public nm0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof ad) {
            return ((ad) currentView).a;
        }
        return null;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public v91 getViewPager() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        a(false);
        NotificationCenter.getInstance(this.a).addWeakObserver(this, this.f == 0 ? NotificationCenter.starTransactionsLoaded : NotificationCenter.botStarsTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.a).removeObserver(this, this.f == 0 ? NotificationCenter.starTransactionsLoaded : NotificationCenter.botStarsTransactionsLoaded);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(oi.q qVar) {
        if (qVar != null) {
            bd bdVar = this.c;
            if (bdVar.h == qVar) {
                return;
            }
            bdVar.h = qVar;
            v91 v91Var = this.b;
            qVar.c(v91Var);
            for (View view : v91Var.getViewPages()) {
                if (view instanceof ad) {
                    qVar.b(((ad) view).a);
                }
            }
        }
    }
}
