// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class iva extends LinearLayout implements gk7 {
    public final int a;
    public final wec b;
    public final hva c;
    public final FrameLayout d;
    public final dha e;
    public final long f;

    public iva(Context context, int i, boolean z, long j, int i2, wjb wjbVar, dha dhaVar) {
        super(context);
        this.e = dhaVar;
        this.a = i;
        this.f = j;
        setOrientation(1);
        wec wecVar = dhaVar == null ? new wec(context, null) : new s39(context, wjbVar, dhaVar);
        this.b = wecVar;
        hva hvaVar = new hva(context, i, z, j, i2, wjbVar);
        this.c = hvaVar;
        hvaVar.g = dhaVar == null ? null : (s39) wecVar;
        wecVar.setAdapter(hvaVar);
        View l = wecVar.l(dhaVar == null ? 3 : -2, true);
        View view = new View(context);
        zkb.h(bkb.c7, wjbVar, view);
        if (dhaVar == null) {
            this.d = null;
            addView(l, nme.o(-1, 48));
            addView(view, new LinearLayout.LayoutParams(nme.z(-1.0f), nme.z(1.0f / gl.p)));
            setBackgroundColor(bkb.v0(bkb.g5, wjbVar));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
            frameLayout.addView(l, nme.e(-1, 48, 48));
        }
        addView(wecVar, nme.o(-1, -1));
    }

    public final void a(boolean z) {
        wec wecVar = this.b;
        dha dhaVar = this.e;
        hva hvaVar = this.c;
        if (dhaVar == null) {
            hvaVar.i();
            wecVar.m(z);
            return;
        }
        ArrayList arrayList = hvaVar.i;
        ArrayList arrayList2 = hvaVar.i;
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            i |= 1 << ((c4c) arrayList.get(i2)).A;
        }
        View currentView = wecVar.getCurrentView();
        int i3 = currentView instanceof gva ? ((gva) currentView).d : 0;
        hvaVar.i();
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            i4 |= 1 << ((c4c) arrayList2.get(i5)).A;
        }
        if (i == i4) {
            if (z) {
                return;
            }
            wecVar.m(false);
            return;
        }
        wecVar.onTouchEvent(null);
        int i6 = 0;
        while (true) {
            if (i6 >= arrayList2.size()) {
                i6 = 0;
                break;
            } else if (((c4c) arrayList2.get(i6)).A == i3) {
                break;
            } else {
                i6++;
            }
        }
        wecVar.setPosition(i6);
        wecVar.J();
        wecVar.m(false);
        dhaVar.s();
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.A3;
        long j = this.f;
        if ((i == i3 && j == 0) || (i == kk7.E3 && j != 0 && ((Long) objArr[0]).longValue() == j)) {
            a(true);
        }
    }

    public o39 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof gva) {
            return ((gva) currentView).a;
        }
        return null;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public wec getViewPager() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        a(false);
        kk7.f(this.a).b(this, this.f == 0 ? kk7.A3 : kk7.E3);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        kk7.f(this.a).n(this, this.f == 0 ? kk7.A3 : kk7.E3);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(qw4 qw4Var) {
        if (qw4Var != null) {
            hva hvaVar = this.c;
            if (hvaVar.h != qw4Var) {
                hvaVar.h = qw4Var;
                wec wecVar = this.b;
                qw4Var.c(wecVar);
                for (View view : wecVar.getViewPages()) {
                    if (view instanceof gva) {
                        qw4Var.b(((gva) view).a);
                    }
                }
            }
        }
    }
}
