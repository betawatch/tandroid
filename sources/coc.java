// default package

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class coc extends i69 {
    public va a;
    public va c;
    public boolean d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public final /* synthetic */ goc j;
    public final i62 b = new i62(this);
    public final f8c i = new f8c(this, (byte) 28);

    public coc(goc gocVar) {
        this.j = gocVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    @Override // i69
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
            f69 layoutManager = this.a.getLayoutManager();
            if (layoutManager != null && this.a.getAdapter() != null && ((Math.abs(i2) > (minFlingVelocity = this.a.getMinFlingVelocity()) || Math.abs(i) > minFlingVelocity) && (layoutManager instanceof u46))) {
                ama amaVar = new ama(this, this.a.getContext());
                if (this.c != null && this.f && Math.abs(i2) >= gm.L(600.0f)) {
                    goc gocVar = this.j;
                    if (gocVar.t0()) {
                        int i4 = i2 > 0 ? 1 : -1;
                        q7c r0 = gocVar.r0();
                        if (this.c.canScrollVertically(i4) && (i4 >= 0 || r0 == null || !r0.canScrollVertically(-1))) {
                            i3 = i4 > 0 ? layoutManager.A() - 1 : 0;
                            if (i3 != -1) {
                                amaVar.a = i3;
                                layoutManager.v0(amaVar);
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
            i62 i62Var = this.b;
            if (vaVar3 != null) {
                ArrayList arrayList = vaVar3.x0;
                if (arrayList != null) {
                    arrayList.remove(i62Var);
                }
                this.a.setOnFlingListener(null);
            }
            this.a = vaVar;
            if (vaVar != null) {
                if (vaVar.getOnFlingListener() != null) {
                    dq9.m("An instance of OnFlingListener already set.");
                    return;
                }
                this.a.j(i62Var);
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

    public final View d(f69 f69Var) {
        va vaVar;
        if (this.e || (vaVar = this.c) == null || vaVar.getScrollState() != 0) {
            return null;
        }
        goc gocVar = this.j;
        q7c r0 = gocVar.r0();
        if ((r0 != null && r0.getScrollState() != 0) || !this.d) {
            return null;
        }
        this.d = false;
        if (!gocVar.t0()) {
            return null;
        }
        View m = f69Var.m(0);
        View m2 = f69Var.m(f69Var.A() - 1);
        return m == null ? m2 : (m2 == null || Math.abs(new int[]{0, f69.y(m) - f69Var.E()}[1]) < Math.abs(new int[]{0, f69.y(m2) - f69Var.E()}[1])) ? m : m2;
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
        f69 layoutManager;
        View d;
        va vaVar = this.a;
        if (vaVar == null || (layoutManager = vaVar.getLayoutManager()) == null || (d = d(layoutManager)) == null) {
            return;
        }
        int[] iArr = {0, f69.y(d) - layoutManager.E()};
        int i = iArr[0];
        if (i == 0 && iArr[1] == 0) {
            return;
        }
        this.a.x0(i, iArr[1], null);
    }
}
