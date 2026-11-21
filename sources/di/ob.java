package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.tt0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ob extends LinearLayout implements fs {
    public final int a;
    public final j71 b;
    public final nb c;
    public final FrameLayout d;
    public final tt0 e;
    public final long f;

    public ob(Context context, int i7, boolean z10, long j3, int i10, org.telegram.ui.ActionBar.h6 h6Var, tt0 tt0Var) {
        super(context);
        this.e = tt0Var;
        this.a = i7;
        this.f = j3;
        setOrientation(1);
        j71 j71Var = tt0Var == null ? new j71(context, null) : new gk0(context, h6Var, tt0Var);
        this.b = j71Var;
        nb nbVar = new nb(context, i7, z10, j3, i10, h6Var);
        this.c = nbVar;
        nbVar.g = tt0Var == null ? null : (gk0) j71Var;
        j71Var.setAdapter(nbVar);
        View i11 = j71Var.i(tt0Var == null ? 3 : -2, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d7, view, h6Var);
        if (tt0Var == null) {
            this.d = null;
            addView(i11, c8.ma.o(-1, 48));
            addView(view, new LinearLayout.LayoutParams(c8.ma.z(-1.0f), c8.ma.z(1.0f / org.telegram.messenger.g0.p)));
            setBackgroundColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, h6Var));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            frameLayout.addView(i11, c8.ma.e(-1, 48, 48));
        }
        addView(j71Var, c8.ma.o(-1, -1));
    }

    public final void a(boolean z10) {
        nb nbVar = this.c;
        j71 j71Var = this.b;
        tt0 tt0Var = this.e;
        if (tt0Var == null) {
            nbVar.i();
            j71Var.j(z10);
            return;
        }
        ArrayList arrayList = nbVar.i;
        ArrayList arrayList2 = nbVar.i;
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i7 |= 1 << ((o41) arrayList.get(i10)).A;
        }
        View currentView = j71Var.getCurrentView();
        int i11 = currentView instanceof mb ? ((mb) currentView).d : 0;
        nbVar.i();
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i12 |= 1 << ((o41) arrayList2.get(i13)).A;
        }
        if (i7 == i12) {
            if (z10) {
                return;
            }
            j71Var.j(false);
            return;
        }
        j71Var.onTouchEvent(null);
        int i14 = 0;
        while (true) {
            if (i14 >= arrayList2.size()) {
                i14 = 0;
                break;
            } else if (((o41) arrayList2.get(i14)).A == i11) {
                break;
            } else {
                i14++;
            }
        }
        j71Var.setPosition(i14);
        j71Var.F();
        j71Var.j(false);
        tt0Var.p();
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.B3;
        long j3 = this.f;
        if ((i7 == i11 && j3 == 0) || (i7 == ks.F3 && j3 != 0 && ((Long) objArr[0]).longValue() == j3)) {
            a(true);
        }
    }

    public ek0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof mb) {
            return ((mb) currentView).a;
        }
        return null;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public j71 getViewPager() {
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
            j71 j71Var = this.b;
            qVar.c(j71Var);
            for (View view : j71Var.getViewPages()) {
                if (view instanceof mb) {
                    qVar.b(((mb) view).a);
                }
            }
        }
    }
}
