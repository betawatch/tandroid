package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class cd extends LinearLayout implements ls {
    public final int a;
    public final v61 b;
    public final bd c;
    public final FrameLayout d;
    public final it0 e;
    public final long f;

    public cd(Context context, int i7, boolean z9, long j3, int i10, org.telegram.ui.ActionBar.h6 h6Var, it0 it0Var) {
        super(context);
        this.e = it0Var;
        this.a = i7;
        this.f = j3;
        setOrientation(1);
        v61 v61Var = it0Var == null ? new v61(context, null) : new rj0(context, h6Var, it0Var);
        this.b = v61Var;
        bd bdVar = new bd(context, i7, z9, j3, i10, h6Var);
        this.c = bdVar;
        bdVar.g = it0Var == null ? null : (rj0) v61Var;
        v61Var.setAdapter(bdVar);
        View n10 = v61Var.n(it0Var == null ? 3 : -2, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d7, view, h6Var);
        if (it0Var == null) {
            this.d = null;
            addView(n10, c8.ha.o(-1, 48));
            addView(view, new LinearLayout.LayoutParams(c8.ha.z(-1.0f), c8.ha.z(1.0f / org.telegram.messenger.g0.p)));
            setBackgroundColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, h6Var));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            frameLayout.addView(n10, c8.ha.e(-1, 48, 48));
        }
        addView(v61Var, c8.ha.o(-1, -1));
    }

    public final void a(boolean z9) {
        bd bdVar = this.c;
        v61 v61Var = this.b;
        it0 it0Var = this.e;
        if (it0Var == null) {
            bdVar.i();
            v61Var.o(z9);
            return;
        }
        ArrayList arrayList = bdVar.i;
        ArrayList arrayList2 = bdVar.i;
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i7 |= 1 << ((x31) arrayList.get(i10)).z;
        }
        View currentView = v61Var.getCurrentView();
        int i11 = currentView instanceof ad ? ((ad) currentView).d : 0;
        bdVar.i();
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i12 |= 1 << ((x31) arrayList2.get(i13)).z;
        }
        if (i7 == i12) {
            if (z9) {
                return;
            }
            v61Var.o(false);
            return;
        }
        v61Var.onTouchEvent(null);
        int i14 = 0;
        while (true) {
            if (i14 >= arrayList2.size()) {
                i14 = 0;
                break;
            } else if (((x31) arrayList2.get(i14)).z == i11) {
                break;
            } else {
                i14++;
            }
        }
        v61Var.setPosition(i14);
        v61Var.J();
        v61Var.o(false);
        it0Var.p();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.z3;
        long j3 = this.f;
        if ((i7 == i11 && j3 == 0) || (i7 == qs.D3 && j3 != 0 && ((Long) objArr[0]).longValue() == j3)) {
            a(true);
        }
    }

    public pj0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof ad) {
            return ((ad) currentView).a;
        }
        return null;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public v61 getViewPager() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        a(false);
        qs.f(this.a).c(this, this.f == 0 ? qs.z3 : qs.D3);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        qs.f(this.a).n(this, this.f == 0 ? qs.z3 : qs.D3);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(oi.q qVar) {
        if (qVar != null) {
            bd bdVar = this.c;
            if (bdVar.h == qVar) {
                return;
            }
            bdVar.h = qVar;
            v61 v61Var = this.b;
            qVar.c(v61Var);
            for (View view : v61Var.getViewPages()) {
                if (view instanceof ad) {
                    qVar.b(((ad) view).a);
                }
            }
        }
    }
}
