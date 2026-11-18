package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.qt0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ob extends LinearLayout implements fs {
    public final int a;
    public final g71 b;
    public final nb c;
    public final FrameLayout d;
    public final qt0 e;
    public final long f;

    public ob(Context context, int i7, boolean z10, long j3, int i10, org.telegram.ui.ActionBar.i6 i6Var, qt0 qt0Var) {
        super(context);
        this.e = qt0Var;
        this.a = i7;
        this.f = j3;
        setOrientation(1);
        g71 g71Var = qt0Var == null ? new g71(context, null) : new ek0(context, i6Var, qt0Var);
        this.b = g71Var;
        nb nbVar = new nb(context, i7, z10, j3, i10, i6Var);
        this.c = nbVar;
        nbVar.g = qt0Var == null ? null : (ek0) g71Var;
        g71Var.setAdapter(nbVar);
        View i11 = g71Var.i(qt0Var == null ? 3 : -2, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d7, view, i6Var);
        if (qt0Var == null) {
            this.d = null;
            addView(i11, c8.ma.o(-1, 48));
            addView(view, new LinearLayout.LayoutParams(c8.ma.z(-1.0f), c8.ma.z(1.0f / org.telegram.messenger.g0.p)));
            setBackgroundColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, i6Var));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            frameLayout.addView(i11, c8.ma.e(-1, 48, 48));
        }
        addView(g71Var, c8.ma.o(-1, -1));
    }

    public final void a(boolean z10) {
        nb nbVar = this.c;
        g71 g71Var = this.b;
        qt0 qt0Var = this.e;
        if (qt0Var == null) {
            nbVar.i();
            g71Var.j(z10);
            return;
        }
        ArrayList arrayList = nbVar.i;
        ArrayList arrayList2 = nbVar.i;
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i7 |= 1 << ((l41) arrayList.get(i10)).A;
        }
        View currentView = g71Var.getCurrentView();
        int i11 = currentView instanceof mb ? ((mb) currentView).d : 0;
        nbVar.i();
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i12 |= 1 << ((l41) arrayList2.get(i13)).A;
        }
        if (i7 == i12) {
            if (z10) {
                return;
            }
            g71Var.j(false);
            return;
        }
        g71Var.onTouchEvent(null);
        int i14 = 0;
        while (true) {
            if (i14 >= arrayList2.size()) {
                i14 = 0;
                break;
            } else if (((l41) arrayList2.get(i14)).A == i11) {
                break;
            } else {
                i14++;
            }
        }
        g71Var.setPosition(i14);
        g71Var.F();
        g71Var.j(false);
        qt0Var.p();
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.B3;
        long j3 = this.f;
        if ((i7 == i11 && j3 == 0) || (i7 == ks.F3 && j3 != 0 && ((Long) objArr[0]).longValue() == j3)) {
            a(true);
        }
    }

    public ck0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof mb) {
            return ((mb) currentView).a;
        }
        return null;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public g71 getViewPager() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        a(false);
        ks.f(this.a).c(this, this.f == 0 ? ks.B3 : ks.F3);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ks.f(this.a).n(this, this.f == 0 ? ks.B3 : ks.F3);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(ri.q qVar) {
        if (qVar != null) {
            nb nbVar = this.c;
            if (nbVar.h == qVar) {
                return;
            }
            nbVar.h = qVar;
            g71 g71Var = this.b;
            qVar.c(g71Var);
            for (View view : g71Var.getViewPages()) {
                if (view instanceof mb) {
                    qVar.b(((mb) view).a);
                }
            }
        }
    }
}
