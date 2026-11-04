package ci;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.vj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vb extends LinearLayout implements cs {
    public final int a;
    public final n61 b;
    public final ub c;
    public final FrameLayout d;
    public final gt0 e;
    public final long f;

    public vb(Context context, int i3, boolean z10, long j10, int i10, org.telegram.ui.ActionBar.e6 e6Var, gt0 gt0Var) {
        super(context);
        this.e = gt0Var;
        this.a = i3;
        this.f = j10;
        setOrientation(1);
        n61 n61Var = gt0Var == null ? new n61(context, null) : new vj0(context, e6Var, gt0Var);
        this.b = n61Var;
        ub ubVar = new ub(context, i3, z10, j10, i10, e6Var);
        this.c = ubVar;
        ubVar.g = gt0Var == null ? null : (vj0) n61Var;
        n61Var.setAdapter(ubVar);
        View j11 = n61Var.j(gt0Var == null ? 3 : -2, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, e6Var);
        if (gt0Var == null) {
            this.d = null;
            addView(j11, mf.o(-1, 48));
            addView(view, new LinearLayout.LayoutParams(mf.z(-1.0f), mf.z(1.0f / org.telegram.messenger.g0.p)));
            setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, e6Var));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            frameLayout.addView(j11, mf.e(-1, 48, 48));
        }
        addView(n61Var, mf.o(-1, -1));
    }

    public final void a(boolean z10) {
        ub ubVar = this.c;
        n61 n61Var = this.b;
        gt0 gt0Var = this.e;
        if (gt0Var == null) {
            ubVar.i();
            n61Var.k(z10);
            return;
        }
        ArrayList arrayList = ubVar.i;
        ArrayList arrayList2 = ubVar.i;
        int i3 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i3 |= 1 << ((r31) arrayList.get(i10)).z;
        }
        View currentView = n61Var.getCurrentView();
        int i11 = currentView instanceof tb ? ((tb) currentView).d : 0;
        ubVar.i();
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i12 |= 1 << ((r31) arrayList2.get(i13)).z;
        }
        if (i3 == i12) {
            if (z10) {
                return;
            }
            n61Var.k(false);
            return;
        }
        n61Var.onTouchEvent(null);
        int i14 = 0;
        while (true) {
            if (i14 >= arrayList2.size()) {
                i14 = 0;
                break;
            } else if (((r31) arrayList2.get(i14)).z == i11) {
                break;
            } else {
                i14++;
            }
        }
        n61Var.setPosition(i14);
        n61Var.J();
        n61Var.k(false);
        gt0Var.l();
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = hs.z3;
        long j10 = this.f;
        if ((i3 == i11 && j10 == 0) || (i3 == hs.D3 && j10 != 0 && ((Long) objArr[0]).longValue() == j10)) {
            a(true);
        }
    }

    public tj0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof tb) {
            return ((tb) currentView).a;
        }
        return null;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public n61 getViewPager() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        a(false);
        hs.f(this.a).c(this, this.f == 0 ? hs.z3 : hs.D3);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        hs.f(this.a).n(this, this.f == 0 ? hs.z3 : hs.D3);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(pi.q qVar) {
        if (qVar != null) {
            ub ubVar = this.c;
            if (ubVar.h == qVar) {
                return;
            }
            ubVar.h = qVar;
            n61 n61Var = this.b;
            qVar.c(n61Var);
            for (View view : n61Var.getViewPages()) {
                if (view instanceof tb) {
                    qVar.b(((tb) view).a);
                }
            }
        }
    }
}
