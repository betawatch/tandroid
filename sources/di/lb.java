package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.wj0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class lb extends LinearLayout implements is {
    public final int a;
    public final w61 b;
    public final kb c;
    public final FrameLayout d;
    public final it0 e;
    public final long f;

    public lb(Context context, int i7, boolean z10, long j3, int i10, org.telegram.ui.ActionBar.e6 e6Var, it0 it0Var) {
        super(context);
        this.e = it0Var;
        this.a = i7;
        this.f = j3;
        setOrientation(1);
        w61 w61Var = it0Var == null ? new w61(context, null) : new wj0(context, e6Var, it0Var);
        this.b = w61Var;
        kb kbVar = new kb(context, i7, z10, j3, i10, e6Var);
        this.c = kbVar;
        kbVar.g = it0Var == null ? null : (wj0) w61Var;
        w61Var.setAdapter(kbVar);
        View i11 = w61Var.i(it0Var == null ? 3 : -2, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d7, view, e6Var);
        if (it0Var == null) {
            this.d = null;
            addView(i11, c8.ja.o(-1, 48));
            addView(view, new LinearLayout.LayoutParams(c8.ja.z(-1.0f), c8.ja.z(1.0f / org.telegram.messenger.g0.p)));
            setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, e6Var));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            frameLayout.addView(i11, c8.ja.e(-1, 48, 48));
        }
        addView(w61Var, c8.ja.o(-1, -1));
    }

    public final void a(boolean z10) {
        kb kbVar = this.c;
        w61 w61Var = this.b;
        it0 it0Var = this.e;
        if (it0Var == null) {
            kbVar.i();
            w61Var.k(z10);
            return;
        }
        ArrayList arrayList = kbVar.i;
        ArrayList arrayList2 = kbVar.i;
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i7 |= 1 << ((b41) arrayList.get(i10)).z;
        }
        View currentView = w61Var.getCurrentView();
        int i11 = currentView instanceof jb ? ((jb) currentView).d : 0;
        kbVar.i();
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i12 |= 1 << ((b41) arrayList2.get(i13)).z;
        }
        if (i7 == i12) {
            if (z10) {
                return;
            }
            w61Var.k(false);
            return;
        }
        w61Var.onTouchEvent(null);
        int i14 = 0;
        while (true) {
            if (i14 >= arrayList2.size()) {
                i14 = 0;
                break;
            } else if (((b41) arrayList2.get(i14)).z == i11) {
                break;
            } else {
                i14++;
            }
        }
        w61Var.setPosition(i14);
        w61Var.H();
        w61Var.k(false);
        it0Var.p();
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ns.z3;
        long j3 = this.f;
        if ((i7 == i11 && j3 == 0) || (i7 == ns.D3 && j3 != 0 && ((Long) objArr[0]).longValue() == j3)) {
            a(true);
        }
    }

    public uj0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof jb) {
            return ((jb) currentView).a;
        }
        return null;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public w61 getViewPager() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        a(false);
        ns.f(this.a).c(this, this.f == 0 ? ns.z3 : ns.D3);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ns.f(this.a).n(this, this.f == 0 ? ns.z3 : ns.D3);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(ri.q qVar) {
        if (qVar != null) {
            kb kbVar = this.c;
            if (kbVar.h == qVar) {
                return;
            }
            kbVar.h = qVar;
            w61 w61Var = this.b;
            qVar.c(w61Var);
            for (View view : w61Var.getViewPages()) {
                if (view instanceof jb) {
                    qVar.b(((jb) view).a);
                }
            }
        }
    }
}
