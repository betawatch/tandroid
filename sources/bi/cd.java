package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u91;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class cd extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final u91 b;
    public final bd c;
    public final FrameLayout d;
    public final lw0 e;
    public final long f;

    public cd(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.u6 u6Var, lw0 lw0Var) {
        super(context);
        this.e = lw0Var;
        this.a = i10;
        this.f = j10;
        setOrientation(1);
        u91 u91Var = lw0Var == null ? new u91(context, null) : new om0(context, u6Var, lw0Var);
        this.b = u91Var;
        bd bdVar = new bd(context, i10, z10, j10, i11, u6Var);
        this.c = bdVar;
        bdVar.g = lw0Var == null ? null : (om0) u91Var;
        u91Var.setAdapter(bdVar);
        View n10 = u91Var.n(lw0Var == null ? 3 : -2, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d7, view, u6Var);
        if (lw0Var == null) {
            this.d = null;
            addView(n10, gb1.r(-1, 48));
            addView(view, new LinearLayout.LayoutParams(gb1.I(-1.0f), gb1.I(1.0f / AndroidUtilities.density)));
            setBackgroundColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h5, u6Var));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            frameLayout.addView(n10, gb1.i(-1, 48, 48));
        }
        addView(u91Var, gb1.r(-1, -1));
    }

    public final void a(boolean z10) {
        bd bdVar = this.c;
        u91 u91Var = this.b;
        lw0 lw0Var = this.e;
        if (lw0Var == null) {
            bdVar.i();
            u91Var.o(z10);
            return;
        }
        ArrayList arrayList = bdVar.i;
        ArrayList arrayList2 = bdVar.i;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i10 |= 1 << ((t61) arrayList.get(i11)).z;
        }
        View currentView = u91Var.getCurrentView();
        int i12 = currentView instanceof ad ? ((ad) currentView).d : 0;
        bdVar.i();
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            i13 |= 1 << ((t61) arrayList2.get(i14)).z;
        }
        if (i10 == i13) {
            if (z10) {
                return;
            }
            u91Var.o(false);
            return;
        }
        u91Var.onTouchEvent(null);
        int i15 = 0;
        while (true) {
            if (i15 >= arrayList2.size()) {
                i15 = 0;
                break;
            } else if (((t61) arrayList2.get(i15)).z == i12) {
                break;
            } else {
                i15++;
            }
        }
        u91Var.setPosition(i15);
        u91Var.J();
        u91Var.o(false);
        lw0Var.l();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        long j10 = this.f;
        if ((i10 == i12 && j10 == 0) || (i10 == NotificationCenter.botStarsTransactionsLoaded && j10 != 0 && ((Long) objArr[0]).longValue() == j10)) {
            a(true);
        }
    }

    public mm0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof ad) {
            return ((ad) currentView).a;
        }
        return null;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public u91 getViewPager() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        a(false);
        NotificationCenter.getInstance(this.a).addObserver(this, this.f == 0 ? NotificationCenter.starTransactionsLoaded : NotificationCenter.botStarsTransactionsLoaded);
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
            u91 u91Var = this.b;
            qVar.c(u91Var);
            for (View view : u91Var.getViewPages()) {
                if (view instanceof ad) {
                    qVar.b(((ad) view).a);
                }
            }
        }
    }
}
