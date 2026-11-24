// default package

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ao2 extends i49 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ao2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // i49
    public final void a(RecyclerView recyclerView, int i) {
        a aVar;
        View m;
        pha phaVar;
        pha phaVar2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                co2 co2Var = (co2) obj;
                if (i == 0) {
                    co2Var.e = !co2Var.d.canScrollVertically(-1);
                    co2Var.d.canScrollVertically(1);
                    break;
                }
                break;
            case 2:
                if (i == 1) {
                    gl.t1(((qx2) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 7:
                tv3 tv3Var = (tv3) obj;
                if (i == 0 && tv3Var.n >= 0.0f && !tv3Var.b.canScrollVertically(-1)) {
                    tv3Var.n = -1.0f;
                    break;
                }
                break;
            case 9:
                sx3 sx3Var = (sx3) obj;
                sx3Var.d0 = i == 1;
                if (i != 0) {
                    sx3Var.b0 = System.currentTimeMillis() - sx3.g0;
                }
                sx3Var.invalidate();
                break;
            case 13:
                if (i == 0) {
                    xu4 xu4Var = (xu4) obj;
                    if (xu4Var.m2) {
                        xu4Var.m2 = false;
                        break;
                    }
                }
                break;
            case 14:
                ((qw4) obj).g++;
                break;
            case 15:
                iz4 iz4Var = (iz4) obj;
                if (i == 0) {
                    int L = gl.L(16.0f) + iz4Var.o0().getBottom();
                    float f = iz4Var.w;
                    o39 o39Var = iz4Var.c;
                    if (f <= 0.5f) {
                        if ((o39Var.getLayoutManager() != null ? iz4Var.c.getLayoutManager().m(0) : null) != null) {
                            if (iz4Var.p0() + r7.getTop() < 0.0f) {
                                iz4Var.c.x0(0, Math.round(iz4Var.p0() + r7.getTop()), null);
                                break;
                            }
                        }
                    } else {
                        o39Var.x0(0, iz4Var.r - L, null);
                        break;
                    }
                }
                break;
            case 16:
                ca5 ca5Var = (ca5) obj;
                if (i == 0) {
                    float f2 = ca5Var.B0;
                    if (f2 >= 0.5f && f2 < 1.0f) {
                        aVar = ((d) ca5Var).actionBar;
                        int bottom = aVar.getBottom();
                        d49 layoutManager = ca5Var.N.getLayoutManager();
                        if (layoutManager != null && (m = layoutManager.m(0)) != null) {
                            ca5Var.N.x0(0, m.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f2 < 0.5f) {
                        View m2 = ca5Var.N.getLayoutManager() != null ? ca5Var.N.getLayoutManager().m(0) : null;
                        if (m2 != null && m2.getTop() < 0) {
                            ca5Var.N.x0(0, m2.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 17:
                qa5 qa5Var = (qa5) obj;
                if (i == 1) {
                    qa5Var.f.r.m();
                    gl.t1(qa5Var.f.r);
                    break;
                }
                break;
            case 18:
                if (i == 1) {
                    gl.t1(((wa5) obj).c);
                    break;
                }
                break;
            case 19:
                if (i == 1) {
                    gl.t1(((mb5) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 21:
                gq5 gq5Var = (gq5) obj;
                if (i == 1) {
                    phaVar = ((d) gq5Var).simpleActionBar;
                    if (phaVar.G) {
                        phaVar2 = ((d) gq5Var).simpleActionBar;
                        gl.t1(phaVar2.getSearchField());
                        break;
                    }
                }
                break;
            case 22:
                if (i == 1) {
                    gl.t1(((LanguageSelectActivity) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 24:
                tz6 tz6Var = (tz6) obj;
                tz6Var.f3 = i != 0;
                tz6Var.g3 = i == 1;
                break;
            case 28:
                if (i == 1) {
                    gl.t1(((gg7) obj).T1.getEditText());
                    break;
                }
                break;
            case 29:
                if (i == 1) {
                    gl.t1(((NotificationsCustomSettingsActivity) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    @Override // i49
    public final void b(RecyclerView recyclerView, int i, int i2) {
        xv3 xv3Var;
        int i3;
        xv3 xv3Var2;
        kd4 kd4Var;
        ts3 ts3Var;
        a aVar;
        cq3 cq3Var;
        String str;
        TLRPC.User user;
        String str2;
        byte b = this.a;
        int i4 = -1;
        boolean z = false;
        int i5 = 0;
        z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                eo2 eo2Var = ((co2) obj).f;
                int i6 = eo2.P1;
                eo2Var.b.invalidate();
                break;
            case 1:
                xn2 xn2Var = (xn2) obj;
                xn2Var.n.G1.b(xn2Var.d);
                break;
            case 3:
                ((xx2) obj).Z0();
                break;
            case 4:
                je3 je3Var = (je3) obj;
                zx0 zx0Var = je3Var.t1;
                if (zx0Var != null) {
                    ui7 ui7Var = zx0Var.o0;
                    if (ui7Var != null && ui7Var.getTop() == zx0Var.q0) {
                        z = true;
                    }
                    je3Var.v1 = !z;
                    zx0Var.invalidate();
                    break;
                }
                break;
            case 5:
                oh3 oh3Var = (oh3) obj;
                oh3Var.invalidate();
                oh3Var.c();
                je5 je5Var = oh3Var.K;
                if (je5Var != null) {
                    je5Var.f(true);
                    break;
                }
                break;
            case 6:
                nv3 nv3Var = (nv3) obj;
                lv3 lv3Var = nv3Var.c;
                ew3 ew3Var = nv3Var.r;
                int i7 = ew3.C1;
                ew3Var.b.invalidate();
                if (ew3Var.d && nv3Var.b.J1 && (xv3Var = nv3Var.d) != null && xv3Var.e != null) {
                    ew3Var.G0();
                }
                if (nv3Var.e.L0() + 7 >= lv3Var.b() - 1) {
                    lv3Var.F();
                    break;
                }
                break;
            case 7:
                tv3 tv3Var = (tv3) obj;
                sv3 sv3Var = tv3Var.c;
                jv3 jv3Var = tv3Var.b;
                ew3 ew3Var2 = tv3Var.s;
                int i8 = ew3.C1;
                ew3Var2.b.invalidate();
                if (tv3Var.n < 0.0f) {
                    i3 = tv3Var.d.H0();
                } else {
                    while (true) {
                        if (i5 < jv3Var.getChildCount()) {
                            View childAt = jv3Var.getChildAt(i5);
                            if (childAt.getY() + childAt.getHeight() > tv3Var.n + jv3Var.getPaddingTop()) {
                                jv3Var.getClass();
                                i3 = RecyclerView.R(childAt);
                            } else {
                                i5++;
                            }
                        } else {
                            i3 = -1;
                        }
                    }
                    if (i3 == -1) {
                    }
                }
                int size = sv3Var.E.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = sv3Var.E.keyAt(size);
                        int valueAt = sv3Var.E.valueAt(size);
                        if (i3 >= keyAt) {
                            i4 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i4 >= 0) {
                    tv3Var.e.j(i4, true);
                }
                if (ew3Var2.d && jv3Var.J1 && (xv3Var2 = tv3Var.f) != null && xv3Var2.e != null) {
                    ew3Var2.G0();
                    break;
                }
                break;
            case 8:
                qx3 qx3Var = (qx3) obj;
                hx3 hx3Var = qx3Var.p1;
                if (hx3Var != null && qx3Var.q1.J1 && hx3Var.x) {
                    hx3Var.x = false;
                    hx3Var.invalidate();
                    break;
                }
                break;
            case 9:
                sx3 sx3Var = (sx3) obj;
                if (i2 != 0) {
                    sx3Var.b0 = System.currentTimeMillis() - sx3.g0;
                    sx3Var.invalidate();
                    break;
                }
                break;
            case 10:
                pd4 pd4Var = (pd4) obj;
                if (pd4Var.a.J1 && (kd4Var = pd4Var.L) != null && (ts3Var = kd4Var.b) != null) {
                    if (ts3Var.e) {
                        ts3Var.k(true);
                        break;
                    } else {
                        ts3Var.d();
                        break;
                    }
                }
                break;
            case 11:
                he4 he4Var = (he4) obj;
                he4Var.G.invalidate();
                he4Var.invalidate();
                break;
            case 12:
                ((cf4) obj).F0();
                break;
            case 13:
                xu4 xu4Var = (xu4) obj;
                xu4Var.j1();
                if (xu4Var.n1.J1 && !xu4Var.m2) {
                    gl.t1(xu4Var.b);
                    break;
                }
                break;
            case 14:
                ((qw4) obj).h(i, i2);
                break;
            case 15:
                ((iz4) obj).s.invalidate();
                break;
            case 16:
                ca5 ca5Var = (ca5) obj;
                gh1 gh1Var = ca5Var.A0;
                if (gh1Var == null) {
                    gh1Var = (gh1) ca5Var.B0(ca5Var.a0);
                    ca5Var.A0 = gh1Var;
                }
                int measuredHeight = gh1Var.getMeasuredHeight();
                aVar = ((d) ca5Var).actionBar;
                int measuredHeight2 = measuredHeight - aVar.getMeasuredHeight();
                float top = ca5Var.A0.getTop() * (-1);
                float f = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f), 0.0f);
                ca5Var.B0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(ca5Var.B0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                ca5Var.A0.b.setAlpha(gl.R1(1.0f, 0.0f, min));
                ca5Var.A0.f.setAlpha(gl.R1(1.0f, 0.0f, min));
                ca5Var.A0.c.setAlpha(gl.R1(0.0f, 1.0f, min2));
                float f2 = ca5Var.B0;
                gh1 gh1Var2 = ca5Var.A0;
                if (f2 >= 1.0f) {
                    gh1Var2.setTranslationY(top - f);
                    break;
                } else {
                    gh1Var2.setTranslationY(0.0f);
                    break;
                }
            case 17:
                qa5 qa5Var = (qa5) obj;
                int K0 = qa5Var.r.K0();
                View childAt2 = qa5Var.n.getChildAt(0);
                ((fm0) qa5Var.e.c).a(K0 != 0 || (childAt2 != null ? childAt2.getTop() : 0) < qa5Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (cq3Var = qa5Var.q0) != null) {
                    cq3Var.f(i, i2);
                    qa5Var.f0();
                    break;
                }
                break;
            case 20:
                me5 me5Var = (me5) obj;
                if (me5Var.a.J1) {
                    gl.t1(me5Var.fragmentView);
                    break;
                }
                break;
            case 23:
                t26 t26Var = (t26) recyclerView.getLayoutManager();
                xy6 xy6Var = (xy6) obj;
                oy6 oy6Var = xy6Var.C;
                if (xy6Var.x && !xy6Var.w && t26Var != null) {
                    if (xy6Var.f.b() - t26Var.M0() < 10) {
                        gl.r(oy6Var);
                        gl.c3(oy6Var);
                        break;
                    }
                }
                break;
            case 24:
                tz6 tz6Var = (tz6) obj;
                d49 layoutManager = tz6Var.getLayoutManager();
                uz6 uz6Var = tz6Var.j3;
                nz6 nz6Var = uz6Var.d;
                int M0 = layoutManager == nz6Var ? nz6Var.M0() : uz6Var.c.M0();
                if ((M0 != -1 ? M0 : 0) > 0) {
                    kz6 kz6Var = uz6Var.f;
                    if (M0 > kz6Var.N0 - 5 && kz6Var.v0 == 0 && (str = kz6Var.t0) != null && str.length() != 0 && (user = kz6Var.x0) != null && (str2 = kz6Var.s0) != null) {
                        kz6Var.T(true, user, str2, kz6Var.t0);
                    }
                }
                boolean z2 = !tz6Var.canScrollVertically(-1);
                tz6Var.canScrollVertically(1);
                uz6Var.n(z2);
                uz6Var.b();
                break;
            case 25:
                f37 f37Var = (f37) obj;
                n81 n81Var = f37Var.b;
                fu fuVar = f37Var.f;
                for (int i9 = 0; i9 < fuVar.getChildCount(); i9++) {
                    View childAt3 = fuVar.getChildAt(i9);
                    if (childAt3 instanceof gb2) {
                        ((gb2) childAt3).B3(n81Var.getMeasuredWidth(), n81Var.getBackgroundSizeY());
                    }
                }
                z27 z27Var = f37Var.e;
                if (z27Var != null) {
                    z27Var.v();
                    break;
                }
                break;
            case 26:
                ((j47) obj).K.invalidate();
                break;
            case 27:
                s47 s47Var = (s47) obj;
                int K02 = s47Var.h.K0();
                int abs = K02 != -1 ? Math.abs(s47Var.h.M0() - K02) + 1 : 0;
                int b2 = recyclerView.getAdapter().b();
                if (abs > 0 && !s47Var.W && !s47Var.F && !s47Var.y.isEmpty() && K02 + abs >= b2 - 5 && s47Var.E) {
                    s47Var.g0();
                    break;
                }
                break;
        }
    }

    private final void c(RecyclerView recyclerView, int i) {
    }

    private final void d(RecyclerView recyclerView, int i, int i2) {
    }
}
