// default package

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class dmc extends g49 {
    public va a;
    public va c;
    public boolean d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public final /* synthetic */ hmc j;
    public final x42 b = new x42(this);
    public final kbc i = new kbc(this, (byte) 20);

    public dmc(hmc hmcVar) {
        this.j = hmcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    @Override // g49
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i, int i2) {
        int minFlingVelocity;
        int i3;
        boolean z = this.f;
        if (z) {
            if (z) {
                this.d = true;
            }
            d49 layoutManager = this.a.getLayoutManager();
            if (layoutManager != null && this.a.getAdapter() != null && ((Math.abs(i2) > (minFlingVelocity = this.a.getMinFlingVelocity()) || Math.abs(i) > minFlingVelocity) && (layoutManager instanceof t26))) {
                zja zjaVar = new zja(this, this.a.getContext());
                if (this.c != null && this.f && Math.abs(i2) >= gl.L(600.0f)) {
                    hmc hmcVar = this.j;
                    if (hmcVar.s0()) {
                        int i4 = i2 > 0 ? 1 : -1;
                        q5c q0 = hmcVar.q0();
                        if (this.c.canScrollVertically(i4) && (i4 >= 0 || q0 == null || !q0.canScrollVertically(-1))) {
                            i3 = i4 > 0 ? layoutManager.A() - 1 : 0;
                            if (i3 != -1) {
                                zjaVar.a = i3;
                                layoutManager.v0(zjaVar);
                                return true;
                            }
                        }
                    }
                }
                i3 = -1;
                if (i3 != -1) {
                }
            }
        }
        return false;
    }

    public final void b(va vaVar) {
        va vaVar2 = this.c;
        if (vaVar2 != null) {
            vaVar2.removeCallbacks(this.i);
        }
        this.c = vaVar;
        va vaVar3 = this.a;
        if (vaVar3 != vaVar) {
            x42 x42Var = this.b;
            if (vaVar3 != null) {
                ArrayList arrayList = vaVar3.x0;
                if (arrayList != null) {
                    arrayList.remove(x42Var);
                }
                this.a.setOnFlingListener(null);
            }
            this.a = vaVar;
            if (vaVar != null) {
                if (vaVar.getOnFlingListener() != null) {
                    sc8.j("An instance of OnFlingListener already set.");
                    return;
                }
                this.a.j(x42Var);
                this.a.setOnFlingListener(this);
                new Scroller(this.a.getContext(), new DecelerateInterpolator());
                f();
            }
        }
    }

    public final void c() {
        this.e = false;
        this.f = false;
        this.d = false;
        va vaVar = this.c;
        if (vaVar != null) {
            vaVar.removeCallbacks(this.i);
        }
    }

    public final View d(d49 d49Var) {
        va vaVar;
        if (this.e || (vaVar = this.c) == null || vaVar.getScrollState() != 0) {
            return null;
        }
        hmc hmcVar = this.j;
        q5c q0 = hmcVar.q0();
        if ((q0 != null && q0.getScrollState() != 0) || !this.d) {
            return null;
        }
        this.d = false;
        if (!hmcVar.s0()) {
            return null;
        }
        View m = d49Var.m(0);
        View m2 = d49Var.m(d49Var.A() - 1);
        return m == null ? m2 : (m2 == null || Math.abs(new int[]{0, d49.y(m) - d49Var.E()}[1]) < Math.abs(new int[]{0, d49.y(m2) - d49Var.E()}[1])) ? m : m2;
    }

    public final void e(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            c();
            this.e = true;
            this.g = motionEvent.getX();
            this.h = motionEvent.getY();
            return;
        }
        if (actionMasked == 3) {
            c();
            return;
        }
        if (actionMasked == 2 || actionMasked == 1) {
            float abs = Math.abs(motionEvent.getX() - this.g);
            float abs2 = Math.abs(motionEvent.getY() - this.h);
            boolean z = abs2 > ((float) ViewConfiguration.get(this.c.getContext()).getScaledTouchSlop()) && abs2 > abs * 1.5f;
            this.f = z;
            if (!z) {
                this.d = false;
            }
            if (actionMasked == 1) {
                this.e = false;
            }
        }
    }

    public final void f() {
        d49 layoutManager;
        View d;
        va vaVar = this.a;
        if (vaVar == null || (layoutManager = vaVar.getLayoutManager()) == null || (d = d(layoutManager)) == null) {
            return;
        }
        int[] iArr = {0, d49.y(d) - layoutManager.E()};
        int i = iArr[0];
        if (i == 0 && iArr[1] == 0) {
            return;
        }
        this.a.x0(i, iArr[1], null);
    }
}
