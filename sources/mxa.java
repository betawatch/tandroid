// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mxa extends LinearLayout implements jm7 {
    public final int a;
    public final wgc b;
    public final lxa c;
    public final FrameLayout d;
    public final fja e;
    public final long f;

    public mxa(Context context, int i, boolean z, long j, int i2, ylb ylbVar, fja fjaVar) {
        super(context);
        this.e = fjaVar;
        this.a = i;
        this.f = j;
        setOrientation(1);
        wgc wgcVar = fjaVar == null ? new wgc(context, null) : new v59(context, ylbVar, fjaVar);
        this.b = wgcVar;
        lxa lxaVar = new lxa(context, i, z, j, i2, ylbVar);
        this.c = lxaVar;
        lxaVar.g = fjaVar == null ? null : (v59) wgcVar;
        wgcVar.setAdapter(lxaVar);
        View l = wgcVar.l(fjaVar == null ? 3 : -2, true);
        View view = new View(context);
        anb.h(cmb.c7, ylbVar, view);
        if (fjaVar == null) {
            this.d = null;
            addView(l, qoe.o(-1, 48));
            addView(view, new LinearLayout.LayoutParams(qoe.z(-1.0f), qoe.z(1.0f / gm.p)));
            setBackgroundColor(cmb.v0(cmb.g5, ylbVar));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
            frameLayout.addView(l, qoe.e(-1, 48, 48));
        }
        addView(wgcVar, qoe.o(-1, -1));
    }

    public final void a(boolean z) {
        wgc wgcVar = this.b;
        fja fjaVar = this.e;
        lxa lxaVar = this.c;
        if (fjaVar == null) {
            lxaVar.i();
            wgcVar.m(z);
            return;
        }
        ArrayList arrayList = lxaVar.i;
        ArrayList arrayList2 = lxaVar.i;
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            i |= 1 << ((c6c) arrayList.get(i2)).A;
        }
        View currentView = wgcVar.getCurrentView();
        int i3 = currentView instanceof kxa ? ((kxa) currentView).d : 0;
        lxaVar.i();
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            i4 |= 1 << ((c6c) arrayList2.get(i5)).A;
        }
        if (i == i4) {
            if (z) {
                return;
            }
            wgcVar.m(false);
            return;
        }
        wgcVar.onTouchEvent(null);
        int i6 = 0;
        while (true) {
            if (i6 >= arrayList2.size()) {
                i6 = 0;
                break;
            } else if (((c6c) arrayList2.get(i6)).A == i3) {
                break;
            } else {
                i6++;
            }
        }
        wgcVar.setPosition(i6);
        wgcVar.J();
        wgcVar.m(false);
        fjaVar.s();
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.B3;
        long j = this.f;
        if ((i == i3 && j == 0) || (i == nm7.F3 && j != 0 && ((Long) objArr[0]).longValue() == j)) {
            a(true);
        }
    }

    public r59 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof kxa) {
            return ((kxa) currentView).a;
        }
        return null;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public wgc getViewPager() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        a(false);
        nm7.f(this.a).b(this, this.f == 0 ? nm7.B3 : nm7.F3);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        nm7.f(this.a).n(this, this.f == 0 ? nm7.B3 : nm7.F3);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(sy4 sy4Var) {
        if (sy4Var != null) {
            lxa lxaVar = this.c;
            if (lxaVar.h != sy4Var) {
                lxaVar.h = sy4Var;
                wgc wgcVar = this.b;
                sy4Var.c(wgcVar);
                for (View view : wgcVar.getViewPages()) {
                    if (view instanceof kxa) {
                        sy4Var.b(((kxa) view).a);
                    }
                }
            }
        }
    }
}
