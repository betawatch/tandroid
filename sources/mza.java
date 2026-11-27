// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class mza extends LinearLayout implements fn7 {
    public final int a;
    public final vic b;
    public final lza c;
    public final FrameLayout d;
    public final wka e;
    public final long f;

    public mza(Context context, int i, boolean z, long j, int i2, vnb vnbVar, wka wkaVar) {
        super(context);
        this.e = wkaVar;
        this.a = i;
        this.f = j;
        setOrientation(1);
        vic vicVar = wkaVar == null ? new vic(context, null) : new h79(context, vnbVar, wkaVar);
        this.b = vicVar;
        lza lzaVar = new lza(context, i, z, j, i2, vnbVar);
        this.c = lzaVar;
        lzaVar.g = wkaVar == null ? null : (h79) vicVar;
        vicVar.setAdapter(lzaVar);
        View l = vicVar.l(wkaVar == null ? 3 : -2, true);
        View view = new View(context);
        yob.h(aob.d7, vnbVar, view);
        if (wkaVar == null) {
            this.d = null;
            addView(l, tre.o(-1, 48));
            addView(view, new LinearLayout.LayoutParams(tre.z(-1.0f), tre.z(1.0f / hl.p)));
            setBackgroundColor(aob.v0(aob.h5, vnbVar));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
            frameLayout.addView(l, tre.e(-1, 48, 48));
        }
        addView(vicVar, tre.o(-1, -1));
    }

    public final void a(boolean z) {
        vic vicVar = this.b;
        wka wkaVar = this.e;
        lza lzaVar = this.c;
        if (wkaVar == null) {
            lzaVar.i();
            vicVar.m(z);
            return;
        }
        ArrayList arrayList = lzaVar.i;
        ArrayList arrayList2 = lzaVar.i;
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            i |= 1 << ((b8c) arrayList.get(i2)).A;
        }
        View currentView = vicVar.getCurrentView();
        int i3 = currentView instanceof kza ? ((kza) currentView).d : 0;
        lzaVar.i();
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            i4 |= 1 << ((b8c) arrayList2.get(i5)).A;
        }
        if (i == i4) {
            if (z) {
                return;
            }
            vicVar.m(false);
            return;
        }
        vicVar.onTouchEvent(null);
        int i6 = 0;
        while (true) {
            if (i6 >= arrayList2.size()) {
                i6 = 0;
                break;
            } else if (((b8c) arrayList2.get(i6)).A == i3) {
                break;
            } else {
                i6++;
            }
        }
        vicVar.setPosition(i6);
        vicVar.K();
        vicVar.m(false);
        wkaVar.s();
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.B3;
        long j = this.f;
        if ((i == i3 && j == 0) || (i == jn7.F3 && j != 0 && ((Long) objArr[0]).longValue() == j)) {
            a(true);
        }
    }

    public d79 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof kza) {
            return ((kza) currentView).a;
        }
        return null;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public vic getViewPager() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        a(false);
        jn7.f(this.a).b(this, this.f == 0 ? jn7.B3 : jn7.F3);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        jn7.f(this.a).n(this, this.f == 0 ? jn7.B3 : jn7.F3);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(vy4 vy4Var) {
        if (vy4Var != null) {
            lza lzaVar = this.c;
            if (lzaVar.h != vy4Var) {
                lzaVar.h = vy4Var;
                vic vicVar = this.b;
                vy4Var.c(vicVar);
                for (View view : vicVar.getViewPages()) {
                    if (view instanceof kza) {
                        vy4Var.b(((kza) view).a);
                    }
                }
            }
        }
    }
}
